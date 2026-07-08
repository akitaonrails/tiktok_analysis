package com.ss.android.ugc.aweme.portrait.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitImageUploadState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AIPortraitImageUploadState[] $VALUES;
    public static final AIPortraitImageUploadState UPLOADING = new AIPortraitImageUploadState("UPLOADING", 0);
    public static final AIPortraitImageUploadState SUCCESS = new AIPortraitImageUploadState("SUCCESS", 1);
    public static final AIPortraitImageUploadState FAILED = new AIPortraitImageUploadState("FAILED", 2);

    public static final /* synthetic */ AIPortraitImageUploadState[] $values() {
        return new AIPortraitImageUploadState[]{UPLOADING, SUCCESS, FAILED};
    }

    public static InterfaceC2044707zh<AIPortraitImageUploadState> getEntries() {
        return $ENTRIES;
    }

    static {
        AIPortraitImageUploadState[] aIPortraitImageUploadStateArr$values = $values();
        $VALUES = aIPortraitImageUploadStateArr$values;
        $ENTRIES = new C2254308sP(aIPortraitImageUploadStateArr$values);
    }

    public static AIPortraitImageUploadState[] values() {
        return (AIPortraitImageUploadState[]) $VALUES.clone();
    }

    public static AIPortraitImageUploadState valueOf(String str) {
        return (AIPortraitImageUploadState) C08FF.LIZ(AIPortraitImageUploadState.class, str);
    }

    public AIPortraitImageUploadState(String str, int i) {
    }
}
