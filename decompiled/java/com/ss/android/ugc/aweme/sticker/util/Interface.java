package com.ss.android.ugc.aweme.sticker.util;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Interface {
    public static final /* synthetic */ Interface[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("RemoveResources")
    public static final Interface REMOVE_RESOURCES;

    public static InterfaceC2044707zh<Interface> getEntries() {
        return LLILLJJLI;
    }

    static {
        Interface r3 = new Interface("REMOVE_RESOURCES", 0);
        REMOVE_RESOURCES = r3;
        Interface[] interfaceArr = {r3};
        LL = interfaceArr;
        LLILLJJLI = new C2254308sP(interfaceArr);
    }

    public static Interface[] values() {
        return (Interface[]) LL.clone();
    }

    public static Interface valueOf(String str) {
        return (Interface) C08FF.LIZ(Interface.class, str);
    }

    public Interface(String str, int i) {
    }
}
