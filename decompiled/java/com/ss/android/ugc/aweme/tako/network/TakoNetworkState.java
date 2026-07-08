package com.ss.android.ugc.aweme.tako.network;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TakoNetworkState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TakoNetworkState[] $VALUES;
    public static final TakoNetworkState OFFLINE = new TakoNetworkState("OFFLINE", 0);
    public static final TakoNetworkState WEAK = new TakoNetworkState("WEAK", 1);
    public static final TakoNetworkState STRONG = new TakoNetworkState("STRONG", 2);
    public static final TakoNetworkState FAKE = new TakoNetworkState("FAKE", 3);

    public static final /* synthetic */ TakoNetworkState[] $values() {
        return new TakoNetworkState[]{OFFLINE, WEAK, STRONG, FAKE};
    }

    public static InterfaceC2044707zh<TakoNetworkState> getEntries() {
        return $ENTRIES;
    }

    static {
        TakoNetworkState[] takoNetworkStateArr$values = $values();
        $VALUES = takoNetworkStateArr$values;
        $ENTRIES = new C2254308sP(takoNetworkStateArr$values);
    }

    public static TakoNetworkState[] values() {
        return (TakoNetworkState[]) $VALUES.clone();
    }

    public final boolean isConnected() {
        return this == STRONG || this == WEAK;
    }

    public final boolean isDegraded() {
        return this == OFFLINE || this == WEAK;
    }

    public static TakoNetworkState valueOf(String str) {
        return (TakoNetworkState) C08FF.LIZ(TakoNetworkState.class, str);
    }

    public TakoNetworkState(String str, int i) {
    }
}
