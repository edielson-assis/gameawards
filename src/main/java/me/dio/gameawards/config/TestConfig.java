package me.dio.gameawards.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.repositories.GameRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Game g1 = new Game(null, "The Division", "Tom Clancy’s The Division é uma experiência revolucionária que combina a personalização robusta dos RPGs com um combate tático cheio de ação. Nunca houve um melhor momento para se juntar à luta e salvar a cidade de Nova York.", "https://wallpapertag.com/wallpaper/full/f/2/b/113874-the-division-wallpaper-1920x1080-1920x1080-hd.jpg", 0);
        Game g2 = new Game(null, "A Plague Tale: Requiem", "A Plague Tale: Requiem é uma excelente continuação de uma das histórias mais marcantes da atualidade nos games. Com uma direção primorosa, narrativa e gameplay fazem um casamento praticamente perfeito de uma das melhores experiências single player de 2022.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co5pwb.png", 0);
        Game g3 = new Game(null, "Elden Ring", "ELDEN RING, desenvolvido pela FromSoftware, Inc. e pela BANDAI NAMCO Entertainment Inc., é uma aventura de RPG de ação e fantasia ambientada em um mundo criado por Hidetaka Miyazak e George R. R. Martin. O perigo e a descoberta estão à espreita em cada canto do maior jogo da FromSoftware até hoje.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co4jni.png", 0);
        Game g4 = new Game(null, "God of War: Ragnarok", "God of War Ragnarök é um jogo eletrônico de ação-aventura desenvolvido pela Santa Monica Studio e publicado pela Sony Interactive Entertainment. Foi lançado em 9 de novembro de 2022 para PlayStation 4 e PlayStation 5. É o nono título da série God of War, o nono em ordem cronológica, e a sequência de God of War (2018).", "https://images.igdb.com/igdb/image/upload/t_cover_big/co5s5v.png", 0);
        Game g5 = new Game(null, "Horizon: Forbidden West", "Horizon Forbidden West é um jogo eletrônico de RPG de ação com uma perspectiva em terceira pessoa. Os jogadores controlam Aloy, uma caçadora em um mundo governado por máquinas. O jogo apresenta um mundo aberto ambientado numa Califórnia pós-apocalíptica.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co2gvu.png", 0);
        Game g6 = new Game(null, "Stray", "Stray é um jogo de aventura de terceira pessoa protagonizado por um gato, que se passa nos becos detalhados de neon de uma cidade cibernética decadente e seus ambientes sombrios e marginalizados.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co4tt2.png", 0);
        Game g7 = new Game(null, "Xenoblade Chronicles 3", "Um grupo de seis personagens destas nações se une para despertar as colônias de Aionios e expor a verdadeira ameaça que ambas as nações enfrentam. Atravesse paisagens enormes e fantásticas enquanto aprende como este jogo se conecta à história principal de Xenoblade Chronicles™.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co4ocq.png", 0);
        Game g8 = new Game(null, "Immortality", "Descrito como uma trilogia interativa, Immortality é o novo jogo de Sam Barlow, criador dos aclamados Her Story e Telling Lies, que coloca o jogador para investigar um mistério. Marissa Marcel é uma atriz francesa que estrelou três filmes na carreira.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co55cl.png", 0);
        Game g9 = new Game(null, "Call of Duty: Modern Warfare 2", "O Modern Warfare® II é lançado com uma campanha global para um jogador, combate Multijogador imersivo e um modo melhorado de jogo de Operações Especiais trazendo jogabilidade tática cooperativa. Você também consegue acesso ao Call of Duty®: Warzone™ 2.0, a mais nova experiência Battle Royale.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co4sbw.png", 0);
        Game g10 = new Game(null, "Pokémon Legends: Arceus", "A trama da jornada apresenta um personagem que é transportado ao passado de Sinnoh por Arceus, quando a terra ainda era conhecida por Hisui e povoada por humanos que não tinham desenvolvido laços com Pokémon. A missão do herói é ajudar os povoados a estudarem Pokémon e desenvolver a primeira Pokédex do mundo.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co3d03.png", 0);
        Game g11 = new Game(null, "Gran Turismo 7", "Gran Turismo 7 reúne os melhores recursos do simulador de corridas online. Seja você um piloto competitivo ou casual, colecionador, tuner, designer de visuais ou fotógrafo. Encontre seu caminho com um número impressionante de modos de jogo, incluindo favoritos dos fãs como Campanha GT, Arcade e Escola de Pilotagem.", "https://images.igdb.com/igdb/image/upload/t_cover_big/co2g84.png", 0);

        gameRepository.saveAll(Arrays.asList(g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11));        
    }    
}