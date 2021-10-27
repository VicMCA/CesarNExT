# Dicas

Função para gerar os horários: JavaDateTime, JavaDate, JoDa (um dos 3)  
  
Como usar o @Autowired de forma mais adequada:  
```  
@Autowired  
public AgendamentoController(AgendamentoService agendamentoService) {  
  this.agendamentoService = agendamentoService;  
}
```  
  
Utilizando enums:  
``` java  
// criando enum  
public enum NomeDoEnum {  
    ITEM1,  
    ITEM2,  
    ITEM3,  
    ITEMFINAL;  
}  
  
// usando enum  
NomeDoEnum.ITEM1; // Referencia o item de nome ITEM1  
NomeDoEnum.values(); // Varre o enum  
minhaVar = NomedoEnum.ITEM2; // Atribui o valor de ITEM2 do enum para a "minhaVar"  
```  