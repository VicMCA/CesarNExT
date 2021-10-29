Planejamento e verificações:  

1ª verificação: escolha do dia  
1. Uso do LocalDate para exibir os dias do mês em até 30 dias no futuro  
2. Garantir que finais de semana não serão selecionáveis  

2ª verificação: escolha do horário  
1. Na assistência, horários serão armazenados em um hashmap(dicionário)  
> - As chaves serão strings descrevendo o horário, os valores serão booleanos  
2. Cliente envia uma string com o horário solicitado dentre os disponíveis  
3. Assistência compara a string enviada pelo cliente com as chaves do hashmap  
4. Se o valor para a chave for falso, o agendamento é possível naquele horário, valor é modificado para verdadeiro  
5. Cliente recebe confirmação do agendamento  