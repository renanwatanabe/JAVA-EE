# Sites :
https://pt.wikipedia.org/wiki/Internet
https://pt.wikipedia.org/wiki/Navegador_(inform%C3%A1tica)
https://pt.wikipedia.org/wiki/HTML
https://pt.wikipedia.org/wiki/Linguagem_de_marca%C3%A7%C3%A3o
http://marceloweb.info/principais-diferencas-entre-os-metodos-http-get-e-post/
http://www.tutorialspoint.com/http/http_methods.htm
http://www.sightspecific.com/~mosh/www_faq/ext.html
https
https://pt.wikipedia.org/wiki/URL

Pendencias
fazer arquivo GET, Post
Ciclo de vida da requisição HTTP
1- Capitulo

Por que usar Servlets & JSPs? ( Página 1 até 35)

1-Todos querem um website
O mundo é gigante, é melhor você criar um sistema que todos possam utilizar, em vez de criar um sistema desktop limitando as pessoas.

2-O que um servidor web faz?
Um servidor web recebe uma solicitação e devolve algo, simples assim.
Você solicita algo pelo browser, e o servidor retorna um html, um pdf, qualquer coisa.
O servidor pode ser a máquina física, ou também o software(Apache).

3-O que um cliente web faz?
O browser(navegador), ele é o responsável por saber se comunicar com o servidor, ele é o responsável por
interpretar o Html gerado do servidor e mostrar algo entendível para o usuário.

Os clientes e os servidores conhecem HTML e HTTP

HTML(HyperText Markup Language)
O HTML diz ao browser como deve apresentar o conteúdo, o browser traduz para uma tela onde o usuário possa entender.

HTTP (Hypertext Transfer Protocol)
Maioria das conversas na web é mantida através do protocolo HTTP,que possibilita conversas de requisição e resposta simples.
O cliente(browser) envia uma solicitação HTTP e o servidor retorna uma resposta HTTP.
Ou seja, o servidor usa o HTTP para enviar o HTML para o cliente.


**Renan.html**

Estudar melhor sobre HTTP,TCP,IP TCP/IP,

Principais elementos do fluxo de Solicitação HTTP(REQUEST)
- Método HTTP( POST,GET)
- URL
- Os parâmetros do formulário

Principais elementos do fluxo de resposta:
- Código de status( 404 seria página não encontrada);
-Tipo de conteúdo( texto,imagem, HTML,etc.)
- O conteúdo(O html real mesmo, a imagem,etc).


Método HTTP (MELHORAR ESSA parte)
A grande diferença é a visibilidade, enquanto GET faz aparecer os parâmetros na URL, o POST encapsula junto ao corpo da requisição HTTP e não pode ser vista.
GET-Todos os parâmetros irão aparecer na url , o máximo é em torno de 1024 caracteres, só pode passar texto, é o padrão
As requisições GET são limitadas ao padrão ASCII,

POST- fica escondido,pode passar valores binários também.
Requisições POST também podem usar ASCII e o atributo “enctype” com o valor
 “multipart/form-data”, que faz uso do padrão UCS(Universal Multiple-Octet Coded Character Set).
 
 GET - Quando utilizar
 Um usuário dica no botão "next" para ver a próxima página.(depende)
 Forum (depende)
 
 Post Quando utilizar
 Usuário digitando login e senha
 Um usuário em uma sala de bate-papo enviando uma resposta.
 Um usuário dica no botão de "logout" num site seguro de um banco

outros (HEAD,TRACE,PUT,DELETE,OPTIONS E CONNECT)
HEAD- 

http://web-sniffer.net/
Anatomia de uma solicitação GET	a


Anatomia de uma solicitação POST


MIME TYPE
Quando é enviado de volta a resposta para o usuário,
no Header do HTTP,	existe um atributo chamado  Content-type,ele é conhecido como MIME-TYPE.
Isso informa o tipo de dado que o browser irá receber, para ele saber como processar.
Quando você envia uma solicitação, existe o atributo accept, lá é declarado todos os tipos que eu posso receber
e no retorno ele retorna isso:

text/html; charset=UTF-8





URL(Uniform Resource Locator)
Localizador Uniforme de Recurso

http://www.meusite.com:80/beeradvice/select/beer.html?idade=39

Estrutura da URL

http:// -> Protocolo/Esquema
www.meusite.com -> Domínio/Servidor
:80 ->  Porta

/beeradvice/select/ -> caminho

beer.html -> recurso
idade=39 -> Query String /parâmetro-argumento/ pergunta-resposta


pagina 21 tcp

pagina 22 estrutura

Paginas estáticas vs Páginas dinâmicas

Estáticas - > conteúdo fixo para todos os usuários
Dinâmica -> a página não existe antes de ser feita a solicitação,ela será gerada quando for solicitada,assim o conteúdo será diferente.

Servlet para gerar a página dinâmica



public class ServletImplementation extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
 
          String nameParamenter = request.getParamenter("parameterName");
          BigDecimal valueParameter = request.getParamenter("valueMoney");
            
         RequestDispatcher rd = request.sendRedirect("/index.html");
       
        rd.forward(request,response);

}

Destacar diferenças entre o include,forward 

Implementação a fundo do requestDispatcher.

Container ->


Vantagens do container 
Gerenciamento de vida dos servlets - > Criação do servlet, execução do método init(), execução do service(doGet, doPost), execução do destroy();

Gerencimento da vida dos servlets -> em vez de ser criado uma instancia, é gerado uma thread nova para cada servlet inicialmente, no final do ciclo de vida , a servlet é destruida(thread)

-JSP - O container é o responsável por compilar todas as paginas JSPs em classe java ( servlet) , todas as classes compiladas podem ser vistas no diretorio do Tomcat ( Destacar diferenças entre o scriptlet,jstl, e a expression language)


O container também é responsável pela segurança das servlet de acordo com  o deploymenter descriptor, lá são definidas as partes dos filtros( filter) , onde dcada solicitação deverá passar por servlet pré-estabelecidas.


**CRIAR um plano de estudo onde todo esse ciclo de vida acontece ao nivel baixo de código*



