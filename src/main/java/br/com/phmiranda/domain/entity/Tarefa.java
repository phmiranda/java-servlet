/**
 * User: Pedro.Miranda
 * Project: gerenciador
 * Description: this class execute...!
 * Date: 07/01/2021
 */

package br.com.phmiranda.domain.entity;

import br.com.phmiranda.domain.enums.Situacao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private Situacao situacao = Situacao.SEM_STATUS;
}
