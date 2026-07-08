package com.ss.android.ugc.aweme.sticker.repository.params;

import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class HorizontalEffectsFetcherRequest {
    public static final int $stable = 8;
    public final boolean favorite;
    public final String favoriteType;
    public final FetchMode fetchMode;
    public final List<String> insertEffectIds;
    public final Map<String, String> params;
    public final boolean recent;
    public final Integer recentEffectsLimit;
    public final String recentType;
    public final boolean trending;
    public final int whitelistScene;

    public HorizontalEffectsFetcherRequest() {
        this(null, false, false, null, false, null, null, 0, null, null, 1023, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list) {
        this(list, false, false, null, false, null, null, 0, null, null, 1022, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z) {
        this(list, z, false, null, false, null, null, 0, null, null, 1020, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2) {
        this(list, z, z2, null, false, null, null, 0, null, null, 1016, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str) {
        this(list, z, z2, str, false, null, null, 0, null, null, 1008, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3) {
        this(list, z, z2, str, z3, null, null, 0, null, null, 992, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2) {
        this(list, z, z2, str, z3, str2, null, 0, null, null, 960, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num) {
        this(list, z, z2, str, z3, str2, num, 0, null, null, 896, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num, int i) {
        this(list, z, z2, str, z3, str2, num, i, null, null, 768, null);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num, int i, FetchMode fetchMode) {
        this(list, z, z2, str, z3, str2, num, i, fetchMode, null, 512, null);
    }

    public final HorizontalEffectsFetcherRequest copy(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num, int i, FetchMode fetchMode, Map<String, String> map) {
        return new HorizontalEffectsFetcherRequest(list, z, z2, str, z3, str2, num, i, fetchMode, map);
    }

    public HorizontalEffectsFetcherRequest(List<String> list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num, int i, FetchMode fetchMode, Map<String, String> map) {
        this.insertEffectIds = list;
        this.trending = z;
        this.favorite = z2;
        this.favoriteType = str;
        this.recent = z3;
        this.recentType = str2;
        this.recentEffectsLimit = num;
        this.whitelistScene = i;
        this.fetchMode = fetchMode;
        this.params = map;
    }

    public HorizontalEffectsFetcherRequest(List list, boolean z, boolean z2, String str, boolean z3, String str2, Integer num, int i, FetchMode fetchMode, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? null : str, (i2 & 16) == 0 ? z3 : true, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? 4 : num, (i2 & 128) != 0 ? -1 : i, (i2 & 256) != 0 ? FetchMode.DEFAULT : fetchMode, (i2 & 512) == 0 ? map : null);
    }
}
