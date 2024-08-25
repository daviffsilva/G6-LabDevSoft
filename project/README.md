# Descrição das Histórias de Usuário

# Secretário 1: Gestão de Cursos

**Como secretário da universidade, eu quero cadastrar novos cursos que possam ser oferecidos aos alunos, editar as informações dos cursos para mantê-los atualizados, e desativar cursos que não são mais oferecidos.**

### Critérios de aceitação:

#### Para cadastro de novos cursos:
- O sistema deve permitir o cadastro de novos cursos com informações como nome do curso e número de créditos.
- O curso deve ser vinculado ao currículo semestral e estar disponível para seleção pelos alunos.

#### Para edição de cursos existentes:
- O sistema deve permitir a edição de cursos já cadastrados, incluindo nome e número de créditos.
- As alterações devem ser refletidas imediatamente em todos os registros e opções de matrícula.

#### Para desativação de cursos:
- O sistema deve permitir desativar um curso, removendo-o da lista de opções de matrícula.
- O sistema deve garantir que cursos desativados não afetem matrículas já realizadas.

# Secretário 2: Gestão de Disciplinas

**Como secretário da universidade, eu quero cadastrar novas disciplinas para associá-las aos cursos e disponibilizá-las para matrícula, editar as informações de uma disciplina para manter seus dados atualizados e corretos, associar disciplinas a cursos específicos para que os alunos saibam as disciplinas que fazem parte do seu curso, e desativar disciplinas que não serão mais oferecidas.**

### Critérios de aceitação:

#### Para cadastro de novas disciplinas:
- O sistema deve permitir o cadastro de novas disciplinas com informações como nome da disciplina, número de créditos, e professor responsável.
- A disciplina deve ser vinculada ao curso correspondente e ao currículo semestral.

#### Para edição de disciplinas existentes:
- O sistema deve permitir a edição das disciplinas já cadastradas, incluindo nome, número de créditos e professor responsável.
- As mudanças devem ser refletidas imediatamente no sistema de matrículas.

#### Para associação de disciplinas aos cursos:
- O sistema deve permitir associar disciplinas a um ou mais cursos.
- Apenas disciplinas associadas ao curso devem aparecer como opções de matrícula para os alunos desse curso.

#### Para desativação de disciplinas:
- O sistema deve permitir desativar disciplinas, removendo-as da lista de opções de matrícula.
- O sistema deve garantir que disciplinas desativadas não afetem matrículas já realizadas ou cursos associados.

# Secretário 3: Geração do Currículo do Semestre

**Como secretário da universidade, quero gerar o currículo para cada semestre, para que as disciplinas e cursos estejam organizados e disponíveis para matrícula dos alunos.**

### Critérios de Aceitação:
- O sistema deve permitir que o secretário crie e atualize o currículo do semestre.
- O currículo deve incluir informações sobre todas as disciplinas oferecidas e seus respectivos detalhes. 

---

# Aluno 1: Matrícula em Disciplinas

**Como aluno da universidade, quero me matricular nas disciplinas obrigatórias e opitativas, para que** eu possa escolher as disciplinas que mais me interessam e avançar no meu curso.**

### Critérios de Aceitação:
- O sistema deve permitir que o aluno se matricule em no máximo 4 disciplinas obrigatórias e 2 optativas.
- O aluno deve receber uma confirmação da matrícula após a submissão.
- O aluno deve poder visualizar uma lista das disciplinas em que está matriculado.
- O sistema deverá aceitar matriculas apenas durante o período de matrícula.

# Aluno 2: Cancelamento de Matrícula

**Como aluno da universidade, quero cancelar matrículas feitas durante o período de matrículas, para que eu possa modificar minha escolha de disciplinas caso necessário.**

### Critérios de Aceitação:
- O sistema deve permitir que o aluno cancele matrículas em disciplinas até o final do período de matrículas.
- O aluno deve receber uma confirmação do cancelamento após a submissão.
- O sistema deve atualizar a lista de disciplinas em que o aluno está matriculado após o cancelamento.

# Aluno 3: Consulta de Disciplinas Disponíveis

**Como aluno da universidade, quero consultar quais disciplinas estão disponíveis para matrícula, para que eu possa tomar uma decisão informada sobre quais disciplinas me matricular.**

### Critérios de Aceitação:
- O sistema deve fornecer uma lista de disciplinas disponíveis para o semestre corrente.
- A lista deve incluir informações sobre o nome da disciplina, número de créditos e se a disciplina é obrigatória ou optativa.

# Aluno 4: Notificação de Cobrança

**Como aluno da universidade, quero receber uma notificação sobre as cobranças das disciplinas em que estou matriculado, para que eu possa saber o quanto estou sendo cobrado e realizar o pagamento de forma rápida.**

### Critérios de Aceitação:
- O sistema de matrículas deve enviar uma notificação ao sistema de cobranças após o período de matrículas se encerrar.
- A notificação deve incluir detalhes sobre as disciplinas em que cada aluno está matriculado.

---

# Professor 1: Consulta de Alunos Matriculados

**Como professor da universidade, quero consultar a lista de alunos matriculados em minhas disciplinas, para que eu possa conhecer os alunos que estarão participando das minhas aulas.**

### Critérios de Aceitação:
- O sistema deve permitir que o professor acesse a lista de alunos matriculados em suas disciplinas.
- A lista deve incluir informações básicas dos alunos, como nome e número de matrícula.
