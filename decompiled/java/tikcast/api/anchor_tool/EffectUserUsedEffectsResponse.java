package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.DefaultEffectListItemStruct;

/* JADX INFO: loaded from: classes.dex */
public final class EffectUserUsedEffectsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("list_item")
        public List<DefaultEffectListItemStruct> listItem = new ArrayList();
    }
}
