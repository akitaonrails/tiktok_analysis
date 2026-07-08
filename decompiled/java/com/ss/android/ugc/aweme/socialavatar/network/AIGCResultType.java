package com.ss.android.ugc.aweme.socialavatar.network;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AIGCResultType {

    @C09CT("1")
    public static final AIGCResultType IMAGE;
    public static final /* synthetic */ AIGCResultType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("2")
    public static final AIGCResultType VIEW;

    public static InterfaceC2044707zh<AIGCResultType> getEntries() {
        return LLILLJJLI;
    }

    static {
        AIGCResultType aIGCResultType = new AIGCResultType("IMAGE", 0);
        IMAGE = aIGCResultType;
        AIGCResultType aIGCResultType2 = new AIGCResultType("VIEW", 1);
        VIEW = aIGCResultType2;
        AIGCResultType[] aIGCResultTypeArr = {aIGCResultType, aIGCResultType2};
        LL = aIGCResultTypeArr;
        LLILLJJLI = new C2254308sP(aIGCResultTypeArr);
    }

    public static AIGCResultType[] values() {
        return (AIGCResultType[]) LL.clone();
    }

    public static AIGCResultType valueOf(String str) {
        return (AIGCResultType) C08FF.LIZ(AIGCResultType.class, str);
    }

    public AIGCResultType(String str, int i) {
    }
}
