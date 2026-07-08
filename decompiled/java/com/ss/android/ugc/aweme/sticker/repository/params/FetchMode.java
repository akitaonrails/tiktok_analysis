package com.ss.android.ugc.aweme.sticker.repository.params;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class FetchMode {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ FetchMode[] $VALUES;
    public static final FetchMode DEFAULT = new FetchMode(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
    public static final FetchMode CACHE_ONLY = new FetchMode("CACHE_ONLY", 1);
    public static final FetchMode NETWORK_ONLY = new FetchMode("NETWORK_ONLY", 2);

    public static final /* synthetic */ FetchMode[] $values() {
        return new FetchMode[]{DEFAULT, CACHE_ONLY, NETWORK_ONLY};
    }

    public static InterfaceC2044707zh<FetchMode> getEntries() {
        return $ENTRIES;
    }

    static {
        FetchMode[] fetchModeArr$values = $values();
        $VALUES = fetchModeArr$values;
        $ENTRIES = new C2254308sP(fetchModeArr$values);
    }

    public static FetchMode[] values() {
        return (FetchMode[]) $VALUES.clone();
    }

    public static FetchMode valueOf(String str) {
        return (FetchMode) C08FF.LIZ(FetchMode.class, str);
    }

    public FetchMode(String str, int i) {
    }
}
