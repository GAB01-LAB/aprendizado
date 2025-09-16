#include <stdio.h>
#include <string.h>

#define NUM_CARTAS 3

typedef struct {
    char nome[30];
    int forca;
    int velocidade;
    int inteligencia;
} Carta;

int main() {
    Carta baralho[NUM_CARTAS] = {
        {"Dragão", 90, 60, 70},
        {"Fada", 40, 90, 80},
        {"Gigante", 80, 40, 50}
    };

    int escolha, atributo;
    printf("Escolha sua carta (0-Dragão, 1-Fada, 2-Gigante): ");
    scanf("%d", &escolha);

    printf("Escolha o atributo para comparar (1-Força, 2-Velocidade, 3-Inteligência): ");
    scanf("%d", &atributo);

    printf("Você escolheu: %s\n", baralho[escolha].nome);
    switch(atributo) {
        case 1:
            printf("Força: %d\n", baralho[escolha].forca);
            break;
        case 2:
            printf("Velocidade: %d\n", baralho[escolha].velocidade);
            break;
        case 3:
            printf("Inteligência: %d\n", baralho[escolha].inteligencia);
            break;
        default:
            printf("Atributo inválido!\n");
    }
    
    return 0;
}