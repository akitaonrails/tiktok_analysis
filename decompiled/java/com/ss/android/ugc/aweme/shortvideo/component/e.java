package com.ss.android.ugc.aweme.shortvideo.component;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes26.dex */
public final class e {
    public static final /* synthetic */ e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final e PHOTO;
    public static final e STORY;
    public static final e VIDEO;

    public static InterfaceC2044707zh<e> getEntries() {
        return LLILLJJLI;
    }

    static {
        e eVar = new e("VIDEO", 0);
        VIDEO = eVar;
        e eVar2 = new e("PHOTO", 1);
        PHOTO = eVar2;
        e eVar3 = new e("STORY", 2);
        STORY = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        LL = eVarArr;
        LLILLJJLI = new C2254308sP(eVarArr);
    }

    public static e[] values() {
        return (e[]) LL.clone();
    }

    public static e valueOf(String str) {
        return (e) C08FF.LIZ(e.class, str);
    }

    public e(String str, int i) {
    }
}
