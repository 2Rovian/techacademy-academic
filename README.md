# 🏫 Academic Service — Gestão de Notas e Boletins

Este repositório contém o **Academic Service**, serviço auxiliar do sistema de gestão escolar proposto no  
[Desafio Técnico Júnior da StralooHealth](https://github.com/straloohealth/Teste-T-cnico---N-vel-Junior-2026.1).

Este serviço é responsável pelo **gerenciamento de notas**, **cálculo de médias** e **geração de boletins escolares**.

[Repositório do microserviço de gestão alunos e turmas](https://github.com/2Rovian/techacademy-core/)

---

## 🏗 Stack 

- **Linguagem e framework:** Java 21 (Spring Boot)
- **Banco de dados:** PostgreSQL
- **Estilo arquitetural:** Microserviços com bancos de dados independentes  
- **Padrão adotado:** Arquitetura Hexagonal (Ports and Adapters)  

---

## 📦 Modelos de Dados (Objetos)

### 🎓 Grade
```
{
  "id": 5,
  "studentId": 2,
  "subject": "Matemática",
  "value": 6.00
}
```

### 📚 ReportCard 
```
{
    "studentId": 2,
    "grades": [
        {
            "id": 5,
            "studentId": 2,
            "subject": "Matemática",
            "value": 6.00
        },
        {
            "id": 6,
            "studentId": 2,
            "subject": "Matemática",
            "value": 5.50
        },
        {
            "id": 7,
            "studentId": 2,
            "subject": "História",
            "value": 6.50
        },
        {
            "id": 8,
            "studentId": 2,
            "subject": "Geografia",
            "value": 7.00
        }
    ],
    "average": 6.25,
    "status": "APPROVED"
}
```

## Requisitos funcionais
- Gerar Boletim: O serviço principal deve receber a requisição e consultar o serviço auxiliar para consolidar as notas e retornar o boletim de um ou mais alunos. ( GET /api/report-cards/{studentId} )
```
{
  "studentId": 6,
  "grades": [
    {
      "id": 19,
      "studentId": 6,
      "subject": "Matemática",
      "value": 9.00
    },
    {
      "id": 20,
      "studentId": 6,
      "subject": "História",
      "value": 8.00
    },
    {
      "id": 21,
      "studentId": 6,
      "subject": "Geografia",
      "value": 8.50
    }
  ],
  "average": 8.50,
  "status": "APPROVED"
}
```

## 🎓 Grade Controller
| Método | Endpoint                                       | Descrição                                      |
| ------ | ---------------------------------------------- | ---------------------------------------------- |
| GET    | `/api/grades/{studentId}`                      | Retorna todas as notas de um aluno             |
| GET    | `/api/grades?studentId={id}&subject={subject}` | Retorna notas filtradas por aluno e disciplina |
| POST   | `/api/grades`                                  | Registra uma nova nota                         |

## 📚 ReportCard Controller
| Método | Endpoint                        | Descrição                         |
| ------ | ------------------------------- | --------------------------------- |
| GET    | `/api/report-cards/{studentId}` | Gera e retorna o boletim do aluno |

## 🚀 Instalação

### 1️⃣ Crie uma pasta para o projeto e acesse-a
```
mkdir techacademy && cd techacademy
```

### 2️⃣ Clone o repositório do core-service

```
git clone https://github.com/2Rovian/techacademy-core
```

### 3️⃣ Clone o repositório do academic-service

```
git clone https://github.com/2Rovian/techacademy-academic
```

### 4️⃣ Renomeie os diretórios

```
mv techacademy-core core-service
```
```
mv techacademy-academic academic-service
```

### 5️⃣ Acesse o diretório do core-service
```
cd techacademy-core
```
### 6️⃣ Rode os containers
```
docker-compose up --build
```

## 🔌 Ports
- core-service: `http://localhost:8081`  
- academic-service: `http://localhost:8082`
