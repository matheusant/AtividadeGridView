package br.com.local.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Jogos> lstJogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstJogos = new ArrayList<>();
        lstJogos.add(new Jogos("God of War", "Muitos anos se passaram desde que Kratos teve sua vingança contra os deuses do Olimpo, e agora ele vive com seu filho Atreus em Midgard.",
                "Ranking: 1º", R.drawable.gow));
        lstJogos.add(new Jogos("The Last of Us Part II", "Ambientado cinco anos após os eventos de The Last of Us (2013), o jogador assume o papel de duas protagonistas em um Estados Unidos pós-apocalíptico.",
                "Ranking: 2º", R.drawable.tlouii));
        lstJogos.add(new Jogos("GTA San Andreas", "A trama de San Andreas gira em torno de um membro de gangue, Carl 'CJ' Johnson, que retorna para seu lar em Los Santos, depois de uma longa temporada em Liberty City",
                "Ranking: 3º", R.drawable.gtasan));
        lstJogos.add(new Jogos("GTA V", " O ex-assaltante de bancos Michael Townley vive em Los Santos, sob o programa proteção a testemunhas com o nome de Michael De Santa por causa de um roubo malsucedido em Ludendorff.",
                "Ranking: 4º", R.drawable.gtav));
        lstJogos.add(new Jogos("Destiny", "Centra-se ao redor da história dos Guardiões, os últimos defensores da humanidade, destinados a proteger a última cidade na Terra.",
                "Ranking: 5º", R.drawable.destiny));
        lstJogos.add(new Jogos("Dragon Ball Z Budokai Tenkaichi 3", "Acrescenta a possibilidade de o jogador salvar as lutas que gostou para poder assistir depois, assim como também introduz novos movimentos.",
                "Ranking: 6º", R.drawable.dbz));
        lstJogos.add(new Jogos("Crash Bandicoot", "Tem como missão parar seus dois criadores em sua busca pela dominação do mundo, reverter toda a poluição que eles causaram, e salvar sua amiga Tawna.",
                "Ranking: 7º", R.drawable.crash));
        lstJogos.add(new Jogos("Midnight Club 3", "Um dos maiores e mais clássicos games de corrida, produzido pela Rockstar (a mesma de GTA e Bully).",
                "Ranking: 8º", R.drawable.midn));
        lstJogos.add(new Jogos("Spider-Man", "Jogo eletrônico de ação-aventura em mundo aberto que se passa em Manhattan, dentro de uma versão ficcional da cidade de Nova Iorque.",
                "Ranking: 9º", R.drawable.spider));
        lstJogos.add(new Jogos("Assassins Creed Brotherhood", "Apresenta uma nova saga na franquia. Dando continuidade à história do jovem Ezio Auditore e todo o seu passado sombrio em meio à Ordem dos Assassinos.",
                "Ranking: 10º", R.drawable.acreed));
        lstJogos.add(new Jogos("Forza Horizon 4", "Forza Horizon 4 te leva para uma competição em uma região que é apaixonada por velocidade, o Reino Unido, mesmo que representado de uma forma fictícia em um mapa reduzido",
                "Ranking: 11º", R.drawable.forza));
        lstJogos.add(new Jogos("Rainbow Six Siege", "É um jogo de tiro na primeira pessoa táctico, em que os jogadores assumem o papel de um dos membros da equipe Rainbow, uma unidade contra-terrorista.",
                "Ranking: 12º", R.drawable.rsix));
        lstJogos.add(new Jogos("Uncharted 4", "Na história, os jogadores controlam Nathan Drake, um ex-caçador de tesouros que é persuadido a sair da aposentadoria pelo aparecimento de seu irmão mais velho Samuel.",
                "Ranking: 13º", R.drawable.uncharted));
        lstJogos.add(new Jogos("Watch Dogs 2", "Se desenrola sob a pele de Marcus Holloway, um hacker que foi vítima dos algoritmos de previsão de crime do ctOS 2.0 e acusado injustamente de um delito que não cometeu.",
                "Ranking: 14º", R.drawable.wdogs));
        lstJogos.add(new Jogos("Tony Hawk's Pro Skater 1+2", "Ande de skate como o lendário Tony Hawk e outros vários profissionais da lista do jogo. Ouça músicas da trilha sonora que definiu gerações.",
                "Ranking: 15º", R.drawable.tonyh));
        lstJogos.add(new Jogos("Gears 5", "Com uma guerra descendo, a Kait Diaz se liberta para descobrir sua conexão com o inimigo e descobre o verdadeiro perigo para a Sera – ela mesma.",
                "Ranking: 16º", R.drawable.gears));
        lstJogos.add(new Jogos("Naruto Ultimate Ninja Storm 4", "As Forças Aliadas Shinobi têm a vantagem sobre a Akatsuki, mas Tobi e Madara Uchiha continuam sendo obstáculos constantes para os heróis.",
                "Ranking: 17º", R.drawable.naruto));
        lstJogos.add(new Jogos("Nba 2K16", "A franquia NBA 2K está de volta com a experiência NBA mais realista já vista, agora em NBA 2K16.",
                "Ranking: 18º", R.drawable.nba));
        lstJogos.add(new Jogos("FIFA 19", "Com a tecnologia Frostbite™, o EA SPORTS™ FIFA 19 proporciona uma experiência de alto nível - dentro e fora dos gramados.",
                "Ranking: 19º", R.drawable.fifa));
        lstJogos.add(new Jogos("PES 2013", "Prepare-se para controlar os melhores jogadores do mundo em partidas de futebol realistas.",
                "Ranking: 20º", R.drawable.pes));

        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        RecyclerAdapter mAdapter = new RecyclerAdapter(getApplicationContext(), lstJogos);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);
    }
}