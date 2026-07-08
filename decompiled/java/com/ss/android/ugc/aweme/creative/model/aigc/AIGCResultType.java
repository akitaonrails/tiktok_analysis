package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AIGCResultType {

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final AIGCResultType IMAGE;
    public static final /* synthetic */ AIGCResultType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final AIGCResultType VIDEO;

    public static InterfaceC2044707zh<AIGCResultType> getEntries() {
        return LLILLJJLI;
    }

    static {
        AIGCResultType aIGCResultType = new AIGCResultType("IMAGE", 0);
        IMAGE = aIGCResultType;
        AIGCResultType aIGCResultType2 = new AIGCResultType("VIDEO", 1);
        VIDEO = aIGCResultType2;
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
