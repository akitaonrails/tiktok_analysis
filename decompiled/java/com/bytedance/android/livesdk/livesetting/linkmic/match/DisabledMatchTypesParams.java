package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class DisabledMatchTypesParams {
    public static final TypeAdapter ADAPTER = new DisabledMatchTypesParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disabled_match_types_for_linker_mode")
    public HashMap<Integer, ArrayList<Integer>> disabledMatchTypesForLinkerMode;

    public DisabledMatchTypesParams() {
        this(null, 1, null);
    }

    public DisabledMatchTypesParams(HashMap<Integer, ArrayList<Integer>> map) {
        this.disabledMatchTypesForLinkerMode = map;
    }

    public DisabledMatchTypesParams(HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJI(new Pair(3, C1697810uHb.LJ(2, 3, 51, 53))) : map);
    }
}
