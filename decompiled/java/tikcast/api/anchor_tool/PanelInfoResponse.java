package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.Category;
import webcast.data.CategoryEffects;
import webcast.data.EffectAPIExtra;
import webcast.data.EffectStruct;
import webcast.data.Panel;

/* JADX INFO: loaded from: classes.dex */
public final class PanelInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("category_effects")
        public CategoryEffects categoryEffects;

        @C09CT("extra")
        public EffectAPIExtra extra;

        @C09CT("front_effect")
        public EffectStruct frontEffect;

        @C09CT("panel")
        public Panel panel;

        @C09CT("rear_effect")
        public EffectStruct rearEffect;

        @C09CT("updated")
        public boolean updated;

        @C09CT("version")
        public String version = "";

        @C09CT("category_list")
        public List<Category> categoryList = new ArrayList();

        @C09CT("url_prefix")
        public List<String> urlPrefix = new ArrayList();
    }
}
