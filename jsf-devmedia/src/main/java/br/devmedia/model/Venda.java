package br.devmedia.model;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Venda {

    @NotNull
    @Size(min = 1)
    @Valid
    private Date data;
    
    @NotNull
    private List<Iten> itens;
    
    @DecimalMin("0")
    private float total;
    
    @NotNull
    private TipoVenda tipo;
}
