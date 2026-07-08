package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.EffectCategory;
import webcast.data.EffectStruct;
import webcast.data.Panel;

/* JADX INFO: loaded from: classes.dex */
public final class EffectListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("panel")
        public Panel panel;

        @C09CT("upgrade")
        public boolean upgrade;
        public String LIZ = "";

        @C09CT("version")
        public String version = "";

        @C09CT("effects")
        public List<EffectStruct> effects = new ArrayList();

        @C09CT("collection")
        public List<EffectStruct> collection = new ArrayList();

        @C09CT("category")
        public List<EffectCategory> category = new ArrayList();

        @C09CT("front_effect_id")
        public String frontEffectId = "";

        @C09CT("rear_effect_id")
        public String rearEffectId = "";

        @C09CT("url_prefix")
        public List<String> urlPrefix = new ArrayList();

        @C09CT("extra")
        public Map<String, String> extra = new LinkedHashMap();
    }
}
