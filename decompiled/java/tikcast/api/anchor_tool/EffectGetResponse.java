package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EffectAPIExtra;
import webcast.data.EffectStruct;

/* JADX INFO: loaded from: classes.dex */
public final class EffectGetResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("effect")
        public EffectStruct effect;

        @C09CT("extra")
        public EffectAPIExtra extra;

        @C09CT("collection")
        public List<EffectStruct> collection = new ArrayList();

        @C09CT("url_prefix")
        public String urlPrefix = "";
    }
}
