public class ChatBot {
    public String name;
         ChatBot(){
            System.out.println("チャットボットの原型を作成します。");
            }
         ChatBot(String name){
            System.out.println("チャットボット名nameを作成します。");
            this.name = name;
        }
        public String greeting(){
            System.out.println("はじめまして"+this.name+"です、よろしくおねがいします");
            return this.name;
        }
    }