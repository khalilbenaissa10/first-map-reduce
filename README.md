# first-map-reduce

Le fichier log � traiter est purchases.txt qui contient des lignes contenant elles m�mes des champs s�par�s par des tabulations.

# Activit� 1 :
Dans cette activit�, nous avons determin� le total des ventes dans chaque magasin donc nous avons finalement introduit :

  - un mapper qui extrait le couple (Magasin,cost)
  - un reducer qui calcule le total des ventes pour chaque cl�(magasin).

# Activit� 2 :
Dans cette activit�, nous avons determin� le total des ventes dans chaque categorie donc nous avons devo :

  - un mapper qui extrait le couple (Categorie,cost)
  - un reducer qui calcule le total des ventes pour chaque cl�(categorie).

# Activit� 3 :

Dans cette activit� nous avons effectu� le m�me traitement que l'activit� precedente sauf qu'on a ajout� un filtrage vertical (pour extraire sauf la cat�gorie "Costumer Electronics" apr�s "Toys" ) au filtrage horizontal.

# Activit� 4 :

Dans cette activit� nous avons calcul� le max des ventes dans chaque magasin .Pour cela nous avons introduit :
   - Un mapper qui extrait le couple (Magasin,Cost).
   - Un reducer qui stocke le maximum de ventes de chaque magasin.

# Activit� 5 :
Dans cette activit� nous avons calcul� le total des ventes et son nombre dans tous les magasins confendus pour cela, nous avons programm�:
  - Un mapper qui extrait le couple ("general",cost), general est une cl� commune pour tous les magasins.
  - Un reducer qui calcule la somme de tous  les costs et compte le nombre de vente en m�me temps.


# Test : 
Le test peut se faire de deux mani�res :
  - Soit en executant le main introduit dans chaque driver.
  - Soit en exportant le .jar de notre porjet puis en utilisant la commande hadoop jar tp1.jar <insat.gl4.nomdriver> <input> <output>