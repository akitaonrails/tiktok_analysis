package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EffectStruct;

/* JADX INFO: loaded from: classes.dex */
public final class EffectRewardResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_cursor")
        public int nextCursor;

        @C09CT("reward_effects")
        public List<EffectStruct> rewardEffects = new ArrayList();

        @C09CT("url_prefix")
        public List<String> urlPrefix = new ArrayList();
    }
}
