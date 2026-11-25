# Utilisation de l'IA - TP1

## Utilisation 1 : Création du record LlmInteraction

### Problème rencontré
Je ne savais pas exactement comment déclarer un record en Java.

### Raison de l'utilisation de l'IA
Pour comprendre la syntaxe d'un record.

### Prompt utilisé 
Comment créer un record en Java avec trois attributs de type String ?

### Réponse de l'IA 
En Java, tu peux utiliser le mot-clé record pour déclarer
une classe contenant des données. Il suffit de préciser
le type et le nom de chaque attribut entre parenthèses.
Java génère automatiquement le constructeur et les accesseurs.

### Ce que j'ai appris
J'ai compris comment créer un record et que Java
génère automatiquement son constructeur et ses accesseurs.

## Utilisation 2 : Historique de conversation

### Problème rencontré
Lors de mon premier test, Gemini ne se souvenait pas
de ma première question.

### Raison de l'utilisation de l'IA
Pour comprendre pourquoi l'historique ne fonctionnait pas.

### Prompt utilisé 
Pourquoi Gemini ne garde pas le contexte de ma première question ?

### Réponse de l'IA 
Vérifie dans le mode debug si la requête JSON contient
les messages précédents. Refais un test avec deux questions
successives sans recharger la page ni effacer la conversation.

### Ce que j'ai appris
J'ai compris qu'il faut envoyer les anciens messages
avec chaque nouvelle question pour garder le contexte.

## Utilisation 3 : Instructions du rôle système

### Problème rencontré
La formulation des instructions du rôle en anglais.

### Raison de l'utilisation de l'IA
Pour avoir des instructions claires en anglais.

### Prompt utilisé
Comment formuler en anglais les instructions d'un rôle
qui aide à préparer un entretien technique en intelligence
artificielle ?

### Réponse de l'IA
You are an AI technical interview coach.
Ask the user one technical question about artificial
intelligence at a time.
Evaluate their answer, explain their mistakes and suggest
improvements.
Adapt the difficulty according to their answers.

### Ce que j'ai appris
J'ai compris qu'on peut changer le comportement du LLM
en lui donnant des instructions dans le rôle système.
