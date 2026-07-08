package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MatchPunishEffectInfo {

    @C09CT("user_to_effect_map")
    public Map<Long, Long> userToEffectMap = new LinkedHashMap();

    @C09CT("effect_to_effect_struct_map")
    public Map<Long, EffectStruct> effectToEffectStructMap = new LinkedHashMap();

    public static final class EffectStruct {

        @C09CT("effect_resource_id")
        public long effectResourceId;
    }
}
