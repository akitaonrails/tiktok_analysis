package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CategoryEffects;
import webcast.data.EffectAPIExtra;

/* JADX INFO: loaded from: classes.dex */
public final class CategoryEffectsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("category_effects")
        public CategoryEffects categoryEffects;

        @C09CT("extra")
        public EffectAPIExtra extra;

        @C09CT("url_prefix")
        public List<String> urlPrefix = new ArrayList();
    }
}
