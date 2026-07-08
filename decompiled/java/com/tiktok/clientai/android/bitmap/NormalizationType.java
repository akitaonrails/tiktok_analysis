package com.tiktok.clientai.android.bitmap;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C892920Z1e;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class NormalizationType {
    public static final C892920Z1e Companion;
    public static final NormalizationType IMAGENET;
    public static final /* synthetic */ NormalizationType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final NormalizationType NONE;
    public static final NormalizationType SIMPLE;

    @C09CT("value")
    public final String value;

    public static InterfaceC2044707zh<NormalizationType> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Z1e] */
    static {
        NormalizationType normalizationType = new NormalizationType("SIMPLE", 0, "simple");
        SIMPLE = normalizationType;
        NormalizationType normalizationType2 = new NormalizationType("IMAGENET", 1, "imagenet");
        IMAGENET = normalizationType2;
        NormalizationType normalizationType3 = new NormalizationType("NONE", 2, "none");
        NONE = normalizationType3;
        NormalizationType[] normalizationTypeArr = {normalizationType, normalizationType2, normalizationType3};
        LL = normalizationTypeArr;
        LLILLJJLI = new C2254308sP(normalizationTypeArr);
        Companion = new Object() { // from class: X.0Z1e
        };
    }

    public static NormalizationType[] values() {
        return (NormalizationType[]) LL.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static NormalizationType valueOf(String str) {
        return (NormalizationType) C08FF.LIZ(NormalizationType.class, str);
    }

    public NormalizationType(String str, int i, String str2) {
        this.value = str2;
    }
}
