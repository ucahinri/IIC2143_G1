import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ahinri on 11-10-2015.
 */
public class Alumno extends Usuario {

    //para la pr�xima entrega, esta asignacion
    public List<HistorialAcademico> historialesAcademicos= new List<HistorialAcademico>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<HistorialAcademico> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(HistorialAcademico historialAcademico) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends HistorialAcademico> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends HistorialAcademico> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public HistorialAcademico get(int index) {
            return null;
        }

        @Override
        public HistorialAcademico set(int index, HistorialAcademico element) {
            return null;
        }

        @Override
        public void add(int index, HistorialAcademico element) {

        }

        @Override
        public HistorialAcademico remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<HistorialAcademico> listIterator() {
            return null;
        }

        @Override
        public ListIterator<HistorialAcademico> listIterator(int index) {
            return null;
        }

        @Override
        public List<HistorialAcademico> subList(int fromIndex, int toIndex) {
            return null;
        }
    } ;

    public void crearHistorial(Malla malla){
        historialesAcademicos.add(new HistorialAcademico(malla));
    }

    public boolean registrarse(String user,String pass){
        //**insertar metodo de validacion**
        return true;
    }
}