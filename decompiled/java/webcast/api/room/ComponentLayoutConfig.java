package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ComponentLayoutConfig {

    @C09CT("vertical_rows")
    public List<VerticalRow> verticalRows = new ArrayList();

    public static final class VerticalRow {

        @C09CT("component_list")
        public List<Integer> componentList = new ArrayList();
    }
}
