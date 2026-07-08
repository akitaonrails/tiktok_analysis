package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class M2GuidanceData {

    @C09CT("scenario_content")
    public Map<String, GuidanceContent> scenarioContent = new LinkedHashMap();

    public static final class GuidanceContent {

        @C09CT("title")
        public String title = "";

        @C09CT("description")
        public String description = "";
    }
}
