package com.ss.android.ugc.aweme.tako.network;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TakoNetworkScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TakoNetworkScene[] $VALUES;
    public static final TakoNetworkScene MIDDLE_PAGE = new TakoNetworkScene("MIDDLE_PAGE", 0);
    public static final TakoNetworkScene DRAWER = new TakoNetworkScene("DRAWER", 1);
    public static final TakoNetworkScene SWITCH_CONVERSATION = new TakoNetworkScene("SWITCH_CONVERSATION", 2);

    public static final /* synthetic */ TakoNetworkScene[] $values() {
        return new TakoNetworkScene[]{MIDDLE_PAGE, DRAWER, SWITCH_CONVERSATION};
    }

    public static InterfaceC2044707zh<TakoNetworkScene> getEntries() {
        return $ENTRIES;
    }

    static {
        TakoNetworkScene[] takoNetworkSceneArr$values = $values();
        $VALUES = takoNetworkSceneArr$values;
        $ENTRIES = new C2254308sP(takoNetworkSceneArr$values);
    }

    public static TakoNetworkScene[] values() {
        return (TakoNetworkScene[]) $VALUES.clone();
    }

    public static TakoNetworkScene valueOf(String str) {
        return (TakoNetworkScene) C08FF.LIZ(TakoNetworkScene.class, str);
    }

    public TakoNetworkScene(String str, int i) {
    }
}
