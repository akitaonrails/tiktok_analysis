package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ClearCredScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ClearCredScene[] $VALUES;
    public static final ClearCredScene BLOCK_HL;
    public static final ClearCredScene BLOCK_OCL;
    public static final ClearCredScene CLEAR_HL;
    public static final ClearCredScene CLEAR_OCL;
    public final CLearCredAction action;
    public final ClearCredLoginType loginType;

    public static final /* synthetic */ ClearCredScene[] $values() {
        return new ClearCredScene[]{CLEAR_OCL, CLEAR_HL, BLOCK_OCL, BLOCK_HL};
    }

    public static InterfaceC2044707zh<ClearCredScene> getEntries() {
        return $ENTRIES;
    }

    static {
        CLearCredAction cLearCredAction = CLearCredAction.CLEAR;
        ClearCredLoginType clearCredLoginType = ClearCredLoginType.OCL;
        CLEAR_OCL = new ClearCredScene("CLEAR_OCL", 0, cLearCredAction, clearCredLoginType);
        ClearCredLoginType clearCredLoginType2 = ClearCredLoginType.HL;
        CLEAR_HL = new ClearCredScene("CLEAR_HL", 1, cLearCredAction, clearCredLoginType2);
        CLearCredAction cLearCredAction2 = CLearCredAction.BLOCK;
        BLOCK_OCL = new ClearCredScene("BLOCK_OCL", 2, cLearCredAction2, clearCredLoginType);
        BLOCK_HL = new ClearCredScene("BLOCK_HL", 3, cLearCredAction2, clearCredLoginType2);
        ClearCredScene[] clearCredSceneArr$values = $values();
        $VALUES = clearCredSceneArr$values;
        $ENTRIES = new C2254308sP(clearCredSceneArr$values);
    }

    public static ClearCredScene[] values() {
        return (ClearCredScene[]) $VALUES.clone();
    }

    public final CLearCredAction getAction() {
        return this.action;
    }

    public final ClearCredLoginType getLoginType() {
        return this.loginType;
    }

    public static ClearCredScene valueOf(String str) {
        return (ClearCredScene) C08FF.LIZ(ClearCredScene.class, str);
    }

    public ClearCredScene(String str, int i, CLearCredAction cLearCredAction, ClearCredLoginType clearCredLoginType) {
        this.action = cLearCredAction;
        this.loginType = clearCredLoginType;
    }
}
