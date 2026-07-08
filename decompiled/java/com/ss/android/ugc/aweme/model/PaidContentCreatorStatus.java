package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class PaidContentCreatorStatus {

    @C09CT("3")
    public static final PaidContentCreatorStatus ELIGIBLE_WITH_NO_PUBLISHED_SERIES;

    @C09CT("2")
    public static final PaidContentCreatorStatus ELIGIBLE_WITH_PUBLISHED_SERIES;
    public static final /* synthetic */ PaidContentCreatorStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final PaidContentCreatorStatus NOT_ELIGIBLE;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final PaidContentCreatorStatus UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<PaidContentCreatorStatus> getEntries() {
        return LLILLL;
    }

    static {
        PaidContentCreatorStatus paidContentCreatorStatus = new PaidContentCreatorStatus("UNKNOWN", 0, 0);
        UNKNOWN = paidContentCreatorStatus;
        PaidContentCreatorStatus paidContentCreatorStatus2 = new PaidContentCreatorStatus("NOT_ELIGIBLE", 1, 1);
        NOT_ELIGIBLE = paidContentCreatorStatus2;
        PaidContentCreatorStatus paidContentCreatorStatus3 = new PaidContentCreatorStatus("ELIGIBLE_WITH_PUBLISHED_SERIES", 2, 2);
        ELIGIBLE_WITH_PUBLISHED_SERIES = paidContentCreatorStatus3;
        PaidContentCreatorStatus paidContentCreatorStatus4 = new PaidContentCreatorStatus("ELIGIBLE_WITH_NO_PUBLISHED_SERIES", 3, 3);
        ELIGIBLE_WITH_NO_PUBLISHED_SERIES = paidContentCreatorStatus4;
        PaidContentCreatorStatus[] paidContentCreatorStatusArr = {paidContentCreatorStatus, paidContentCreatorStatus2, paidContentCreatorStatus3, paidContentCreatorStatus4};
        LLILLJJLI = paidContentCreatorStatusArr;
        LLILLL = new C2254308sP(paidContentCreatorStatusArr);
    }

    public static PaidContentCreatorStatus[] values() {
        return (PaidContentCreatorStatus[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static PaidContentCreatorStatus valueOf(String str) {
        return (PaidContentCreatorStatus) C08FF.LIZ(PaidContentCreatorStatus.class, str);
    }

    public PaidContentCreatorStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
