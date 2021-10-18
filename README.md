# CentralDaTransparenciaAPI

Exemplo de API RESTful utilizada em um projeto acadêmico para obtenção de uma lista dos municípios de São Paulo e as despesas de um município específico (informando seu ID).
Os dados são obtidos pelo meu banco de dados da faculdade e então são retornados em formato JSON.</br>
</br>
</br>
"/city/cities": retorna a lista de municípios existentes no banco de dados, informando seu ID, nome extenso e nome (sem caracteres especiais e espaços).</br>
"/city/{nome}": retorna um município específico pelo seu nome (sem caracteres especiais e espaços).</br>
"/expenses/{cityId}": retorna a lista de despesas de uma cidade especificada por seu ID.</br>
</br>
</br>
Os dados de conexão com o banco foram removidos (por motivos óbvios), e o código serve apenas como exemplo (já que não há fonte de dados).
