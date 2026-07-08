package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class UpdateMode {

    @C09CT(alternate = {"LATEST"}, value = "latest")
    public static final UpdateMode LATEST;
    public static final /* synthetic */ UpdateMode[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(alternate = {"SMOOTH"}, value = "smooth")
    public static final UpdateMode SMOOTH;

    public static InterfaceC2044707zh<UpdateMode> getEntries() {
        return LLILLJJLI;
    }

    static {
        UpdateMode updateMode = new UpdateMode("SMOOTH", 0);
        SMOOTH = updateMode;
        UpdateMode updateMode2 = new UpdateMode("LATEST", 1);
        LATEST = updateMode2;
        UpdateMode[] updateModeArr = {updateMode, updateMode2};
        LL = updateModeArr;
        LLILLJJLI = new C2254308sP(updateModeArr);
    }

    public static UpdateMode[] values() {
        return (UpdateMode[]) LL.clone();
    }

    public static UpdateMode valueOf(String str) {
        return (UpdateMode) C08FF.LIZ(UpdateMode.class, str);
    }

    public UpdateMode(String str, int i) {
    }
}
