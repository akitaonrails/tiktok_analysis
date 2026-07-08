package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DspLinkState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DspLinkState[] $VALUES;
    public static final DspLinkState LINKED = new DspLinkState("LINKED", 0);
    public static final DspLinkState UNLINKED = new DspLinkState("UNLINKED", 1);

    public static final /* synthetic */ DspLinkState[] $values() {
        return new DspLinkState[]{LINKED, UNLINKED};
    }

    public static InterfaceC2044707zh<DspLinkState> getEntries() {
        return $ENTRIES;
    }

    static {
        DspLinkState[] dspLinkStateArr$values = $values();
        $VALUES = dspLinkStateArr$values;
        $ENTRIES = new C2254308sP(dspLinkStateArr$values);
    }

    public static DspLinkState[] values() {
        return (DspLinkState[]) $VALUES.clone();
    }

    public static DspLinkState valueOf(String str) {
        return (DspLinkState) C08FF.LIZ(DspLinkState.class, str);
    }

    public DspLinkState(String str, int i) {
    }
}
