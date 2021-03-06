package br.com.spring.coderblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_POST")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@NotBlank
    private String titulo;

    //@NotBlank
    private String autor;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")

    private LocalDate data;

    //@NotBlank
    @Lob
    private String texto;
}
