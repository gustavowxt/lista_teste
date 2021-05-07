package com.example.listadetarefas.db;

import android.provider.BaseColumns;



public class TaskContract {
   public static final String DB_NAME = "com.example.listadetarefas.db.tarefas";
   public static final int DB_VERSION = 1;
   public static final String TABLE = "tarefas";

   public class Columns<String_ID> {
       public static final String TAREFA = "tarefa";
       public static final String_ID = BaseColumns._ID;

   }
}
