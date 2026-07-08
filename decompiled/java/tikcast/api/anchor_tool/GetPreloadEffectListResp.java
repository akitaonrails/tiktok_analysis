package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetPreloadEffectListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("preload_effect_id_list")
        public List<Long> preloadEffectIdList = new ArrayList();
    }
}
