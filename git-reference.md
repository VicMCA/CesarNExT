#### Lista de referência do Git

Instruções gerais

|>> `git config --global user.name "nome"`  
*   Configura o seu nome para os commits  
  
|>> `git config --global user.email "endereço@de.email"`  
*   Configura seu email para os commits  
  
|>>  `git init`  
*   Inicializa git na pasta atualmente selecionada*  
  
|>>  `git add "arquivo.extensão"` *(executar sem aspas)*  
*   Adiciona o arquivo para a monitoração de mudanças  
  
|>>  `git add .`  
*   Adiciona todos os arquivos para a monitoração de mudanças  
  
|>> `git rm "arquivo.extensão"` *(executar sem aspas)*  
*   Remove o arquivo da monitoração de mudanças  
  
|>> `git rm .`  
*   Remove todos os arquivos da monitoração de mudanças  
*   Útil para caso você queira dar um "refresh all" no repositório  
  
|>>  `git status`  
*   Verifica o status atual git, mudanças que ocorreram, commits, etc  
  
|>>  `git commit -m "mensagem"`  
*   Realiza o commit dos arquivos, com uma mensagem descrevendo o commit  
  
|>>  `git branch -M "main"`  
*   Muda o nome da branch para o nome entre aspas  
  
|>>  `git remote add origin https://github.com/usuário/pasta.git`  
*   Apelida a pasta atual como "origin" e a conecta com a pasta selecionada no GitHub  
  
|>> `git remote set-url origin https://github.com/usuário/pasta.git` 
*   Muda o endereço de "origin", útil para caso o projeto já tenha um origin anteriormente  
*   e você queira redirecionar (caso você tenha clonado de alguém, por exemplo)  
  
|>> `git remote -v`  
*   Confere os endereços online conectados à pasta atual do projeto no computador  
  
|>> `git remote remove apelido-da-pasta`  
*   Remove o apelido selecionado para a conexão com o repositório no github. Pode ser origin ou outro
  
|>>  `git push -u origin main`  
*   Envia os arquivos de 'origin' para 'main' da primeira vez. Depois dela, use como abaixo  
|>>  `git push origin main`  
  
|>> `git push origin nova-branch`  
*   Envia os arquivos para a branch selecionada, neste caso é a 'nova-branch'  
  
|>> `git checkout -b "nome-da-nova-branch"`  
*   Cria e entra em uma nova branch do projeto  
  
|>> `git checkout main`  
*   Volta para a branch "main" (ou outra branch que deseje)  
  
|>> `git merge nova-feature`  
*   Traz o conteúdo da branch "nova-feature" para a branch "main"  
  
|>> `git merge nova-feature -ff`  
*   Traz o conteúdo da branch "nova-feature" para a branch "main", anexando ao final  
  
|>> `git clone https://github.com/perfil-do-usuario/repositorio-a-ser-puxado.git`  
*   Clona o repositório do endereço e o coloca na pasta onde você estiver (ex: usuario/docs/ a pasta conada fica aqui)  
  
|>> `git pull`  
*   Baixa do github as atualizações para a pasta no computador  
  
|>> `git log`  
*   Exibe últimos commits realizados  
  
|>> `git log --oneline`  
*   Exibe versão resumida dos últimos commits realizados. Pode combinar com -all  
  
|>> `git log --all`  
*   Exibe todos os detalhes dos últimos commits realizados. Pode combinar com --online  
  
|>> `git log --oneline --graph`  
*   Exibe gráfico das mudanças
  
|>> `git diff codigoDoCommit`  
*   Exibe as diferenças do arquivo atual para a versão do código  
  
|>> `git checkout codigoDoCommit`  
*   Retorna para o commit referenciado no código  
  
|>> `git switch nomeDaBranch`  
*   Navega para a branch no nome referido  
  
|>> `git archive`  
*   Gera um arquivo .zip ou .tar da pasta atual  
  
|>> `git gc`  
*   Realiza limpeza e otimização do repositório git  
  
|>> `git fsck`  
*   Confere o sistema de arquivos do git em busca de erros  
  
|>> `git prune`  
*   Remove objetos que não possuem mais conexão com a branch  
  
|>> `git gc`  
*   Coletor de lixo do Git  
  
|>> `git reset codigoDoCommit  --SOFT`  
*   Reseta os commits até o referido, mas mantém os arquivos no stage   
  
|>> `git reset codigoDoCommit  --HARD`  
*   Reseta os commits até o referido, e reseta TUDO até lá  
  
* Para limpar e fazer re-upload do repositório remoto (github por exemplo):  

|>> `git checkout --orphan newBranch` *cria branch reserva*  
|>> `git add -A` *adiciona arquivos e dá commit neles*  
|>> `git commit -am "limpando repositório` *dá commit na limpeza*  
|>> `git branch -D main` *deleta o conteúdo da main branch no repositório*  
|>> `git branch -m main` *renomeia a branch reserva para main*  
|>> `git push -f origin main` *envia os arquivos para o repositório*  