package com.sgi.extranet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("usuario")
public class Usuario {

    @Id
    private Integer id;

    @NotNull
    private String nome;

    @NotNull
    private String apelido;

    private Integer idade;
}
