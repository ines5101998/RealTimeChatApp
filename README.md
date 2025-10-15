# 💬 Real-Time Chat Application (Spring Boot + WebSocket + STOMP)

Application simple de **chat en temps réel** développée avec **Spring Boot**, **WebSocket**, **STOMP** et **SockJS**.  
Elle permet aux utilisateurs d’envoyer et de recevoir des messages instantanément via une interface web légère.

---

## 🚀 Fonctionnalités
- Communication en temps réel via WebSocket  
- Envoi et réception instantanée des messages  
- Interface simple avec **Bootstrap 5**  
- Compatibilité assurée grâce à **SockJS**

---

## ⚙️ Technologies
- **Spring Boot** – Backend principal  
- **Spring WebSocket** – Communication temps réel  
- **STOMP** – Protocole de messagerie  
- **SockJS** – Fallback WebSocket  
- **HTML / JavaScript / Bootstrap 5** – Interface utilisateur

---

## 📂 Structure du projet


```text
realtime-chat/
├── src/
│ ├── main/
│ │ ├── java/com/realtime/chat/
│ │ │ ├── config/WebSocketConfig.java
│ │ │ ├── controller/ChatController.java
│ │ │ └── model/ChatMessage.java
│ │ └── resources/templates/chat.html
│ └── test/
├── pom.xml
└── README.md

````

## ▶️ Exécution

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/<ton-utilisateur>/realtime-chat-app.git
Lancer le projet :

bash
Copy code
mvn spring-boot:run
Ouvrir dans le navigateur :
👉 http://localhost:8080/chat

👩‍💻 Auteur
Ines
Développeuse backend passionnée par Spring Boot.

🪪 Licence
Ce projet est distribué sous la licence MIT.
Tu peux l’utiliser, le modifier et le partager librement.
