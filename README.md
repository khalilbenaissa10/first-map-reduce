# first-map-reduce

Le fichier log à traiter est purchases.txt qui contient des lignes contenant elles mêmes des champs séparés par des tabulations.

# Activité 1 :
Dans cette activité, nous avons determiné le total des ventes dans chaque magasin donc nous avons finalement introduit :

  - un mapper qui extrait le couple (Magasin,cost)
  - un reducer qui calcule le total des ventes pour chaque clé(magasin).

# Activité 2 :
Dans cette activité, nous avons determiné le total des ventes dans chaque categorie donc nous avons devo :

  - un mapper qui extrait le couple (Categorie,cost)
  - un reducer qui calcule le total des ventes pour chaque clé(categorie).

# Activité 3 :

Dans cette activité nous avons effectué le même traitement que l'activité precedente sauf qu'on a ajouté un filtrage vertical (pour extraire sauf la catégorie "Costumer Electronics" aprés "Toys" ) au filtrage horizontal.

# Activité 4 :

Dans cette activité nous avons calculé le max des ventes dans chaque magasin .Pour cela nous avons introduit :
   - Un mapper qui extrait le couple (Magasin,Cost).
   - Un reducer qui stocke le maximum de ventes de chaque magasin.

# Activité 5 :
Dans cette activité nous avons calculé le total des ventes et son nombre dans tous les magasins confendus pour cela, nous avons programmé:
  - Un mapper qui extrait le couple ("general",cost), general est une clé commune pour tous les magasins.
  - Un reducer qui calcule la somme de tous  les costs et compte le nombre de vente en même temps.


# Test : 
Le test peut se faire de deux maniéres :
  - Soit en executant le main introduit dans chaque driver.
  - Soit en exportant le .jar de notre porjet puis en utilisant la commande hadoop jar tp1.jar <insat.gl4.nomdriver> <input> <output>