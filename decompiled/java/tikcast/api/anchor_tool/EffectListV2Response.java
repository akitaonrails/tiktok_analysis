package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.EffectListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class EffectListV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("details")
        public List<EffectListResponse.Data> details = new ArrayList();
    }
}
