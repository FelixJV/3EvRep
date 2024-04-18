
    package java.domain;

import java.util.Objects;

    public class Cancion {
        private String nombre;
        private String artistaS;
        private double duracion;
        private String genero;
        private int numGuardados;
        private int id;

        public Cancion(String nombre, String artistaS, int duracion, int numGuardados, int id, String genero) {
            this.nombre = nombre;
            this.artistaS = artistaS;
            this.duracion = duracion;
            this.numGuardados = numGuardados;
            this.id = id;
            this.genero = genero;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getArtistaS() {
            return artistaS;
        }

        public void setArtistaS(String artistaS) {
            this.artistaS = artistaS;
        }

        public double getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getNumGuardados() {
            return numGuardados;
        }

        public void setNumGuardados(int numGuardados) {
            this.numGuardados = numGuardados;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Canción{" +
                    "nombre='" + nombre + '\'' +
                    ", artistaS='" + artistaS + '\'' +
                    ", duracion=" + duracion +
                    ", numGuardados=" + numGuardados +
                    ", id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            java.domain.Cancion cancion = (java.domain.Cancion) o;
            return duracion == cancion.duracion && numGuardados == cancion.numGuardados && id == cancion.id && Objects.equals(nombre, cancion.nombre) && Objects.equals(artistaS, cancion.artistaS);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, artistaS, duracion, numGuardados, id);
        }
    }


