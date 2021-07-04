package br.com.robson;

import br.com.robson.colunas.escrita.*;
import br.com.robson.colunas.leitura.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeraScriptEnderecoUnidade {

    private static final String nomeDoArquivo = "src/InformacoesEnderecoUnidades.xls";

    public static void main(String[] args) throws IOException {

        List<Endereco> listaEnderecos = new ArrayList<>();

        try {
            FileInputStream arquivo = new FileInputStream(GeraScriptEnderecoUnidade.nomeDoArquivo);

            HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

            HSSFSheet sheetEnderecos = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheetEnderecos.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                Endereco endereco = new Endereco();
                listaEnderecos.add(endereco);

                preencheListaEnderecos(cellIterator, endereco);
            }

            arquivo.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter arq = new FileWriter("script_endereco_unidade.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (Endereco endereco :
                listaEnderecos) {

            Campos campos = new CampoTipoLogradouro(
                    gravarArq, endereco, new CampoLogradouro(
                    gravarArq, endereco, new CampoBairro(
                    gravarArq, endereco, new CampoNumero(
                    gravarArq, endereco, new CampoCep(
                    gravarArq, endereco, new CampoCidade(
                    gravarArq, endereco, new CampoComplemento(
                    gravarArq, endereco, new CampoRegiaoAdministrativa(
                    gravarArq, endereco, new CampoAreaRural(
                    gravarArq, endereco, new CampoRestricao(
                    gravarArq, endereco, new CampoIdentificador(
                    gravarArq, endereco, new CampoNome(
                    gravarArq, endereco, new CampoIdUnidade(
                    gravarArq, endereco, new SemCampo()
            )))))))))))));

            campos.escrever();
        }
        arq.close();
    }

    private static void preencheListaEnderecos(Iterator<Cell> cellIterator, Endereco endereco) {
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();

            int columnIndex = cell.getColumnIndex();
            CalculadorDeColuna calculadorDeColuna = new CalculadorDeColuna();

            switch (columnIndex) {
                case 0:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new PrimeiraColunaTipoLogradouro());
                    break;
                case 1:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new SegundaColunaLogradouro());
                    break;
                case 2:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new TerceiraColunaBairro());
                    break;
                case 3:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new QuartaColunaNumero());
                    break;
                case 4:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new QuintaColunaCep());
                    break;
                case 5:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new SextaColunaCidade());
                    break;
                case 6:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new SetimaColunaComplemento());
                    break;
                case 7:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new OitavaColunaRegiaoAdministrativa());
                    break;
                case 8:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new NonaColunaAreaRural());
                    break;
                case 9:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new DecimaColunaRestricao());
                    break;
                case 10:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new DecimaPrimeiraColunaIdentificador());
                    break;
                case 11:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new DecimaSegundaColunaNome());
                    break;
                case 12:
                    calculadorDeColuna.calcular(endereco, cell.getStringCellValue(), new DecimaTerceiraColunaIdUnidade());
                    break;
            }
        }
    }
}
