<h1>Tech4music</h1>

<h2>Sobre</h2>
<p>Prova para o modulo back-end</p>

<h2>Questão 1: Descreva o comando para criação do banco(utilizado no mongosh ou compass), que deverá ser chamado de tech4music</h2>
<p>Resposta: <code>use tech4music</code></p>

<h2>Questão 2: Descreva o comando para criar a coleção musicas e já inserir três musicas nela</h2>
<p>Resposta: </p>
<ol> 
<li><code>use tech4music</code></li>
<li><code>db.musicas.insert([{<br>
    "titulo": "Forever",<br>
    "artista": "Kiss",<br>
    "album": "Hot in the Shade",<br>
    "genero": "Rock",<br>
    "anoLancamento": "1989",<br>
    "compositor": "Paul Stanley",{ <br>
    "titulo": "Algo parecido",<br>
    "artista": "Skank",<br>
    "album": "Os três primeiros",<br>
    "genero": "Pop",<br>
    "anoLancamento": "2018",<br>
    "compositor": "Samuel Rosa",{ <br>
    "id": "622a053a9227540189c1bc9b",
    "titulo": "O que me importa",<br>
    "artista": "Marisa Monte",<br>
    "album": "Memórias, crônicas e declarações de amor",<br>
    "genero": "MPB",<br>
    "anoLancamento": 2000,<br>
    "compositor": "Jose de Ribamar Cury"<br>
    }}]})
</code></li></ol>

<h2>Tecnologias utilizadas</h2>
<ul>
<li>Java</li>
<li>Springboot</li>
<li>MongoDB</li>
</ul>
