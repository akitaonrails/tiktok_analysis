package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EntranceConditionsPopup {

    @C09CT("conditions")
    public List<Condition> conditions = new ArrayList();

    @C09CT("title")
    public String title = "";

    public static final class Condition {

        @C09CT("match")
        public boolean match;

        @C09CT("name")
        public String name = "";

        @C09CT("text")
        public String text = "";
    }
}
