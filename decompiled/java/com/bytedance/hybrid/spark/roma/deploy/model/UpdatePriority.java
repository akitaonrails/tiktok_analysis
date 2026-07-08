package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class UpdatePriority {

    @C09CT(alternate = {"HIGH"}, value = "high")
    public static final UpdatePriority HIGH;
    public static final /* synthetic */ UpdatePriority[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(alternate = {"ON_DEMAND"}, value = "on-demand")
    public static final UpdatePriority ON_DEMAND;

    public static InterfaceC2044707zh<UpdatePriority> getEntries() {
        return LLILLJJLI;
    }

    static {
        UpdatePriority updatePriority = new UpdatePriority("HIGH", 0);
        HIGH = updatePriority;
        UpdatePriority updatePriority2 = new UpdatePriority("ON_DEMAND", 1);
        ON_DEMAND = updatePriority2;
        UpdatePriority[] updatePriorityArr = {updatePriority, updatePriority2};
        LL = updatePriorityArr;
        LLILLJJLI = new C2254308sP(updatePriorityArr);
    }

    public static UpdatePriority[] values() {
        return (UpdatePriority[]) LL.clone();
    }

    public static UpdatePriority valueOf(String str) {
        return (UpdatePriority) C08FF.LIZ(UpdatePriority.class, str);
    }

    public UpdatePriority(String str, int i) {
    }
}
