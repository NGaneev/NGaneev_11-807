import java.util.ArrayList;
import java.util.List;

public class JacSearchEngine implements SearchEngine {
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<TextProvider> list = new ArrayList<>();
        List<Double> coefList = new ArrayList<>();
        TextAnalyzer jac = new JaccardAnalyzer();
        double max;
        int index;
        for (TextProvider item : sources){
            coefList.add(jac.analyze(item, target));
        }
        int cont = coefList.size();
        for (int i = 0; i < cont; i++) {
            max = -1;
            index = -1;
            for (Double item : coefList) {
                if (item > max) {
                    max = item;
                    index = coefList.indexOf(item);
                }
            }
            list.add(sources.get(index));
            coefList.remove(index);
            sources.remove(index);
        }
        return list;
    }
}