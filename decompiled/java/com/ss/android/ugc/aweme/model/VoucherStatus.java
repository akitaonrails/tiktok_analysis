package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class VoucherStatus {

    @C09CT("2")
    public static final VoucherStatus CLAIMED;

    @C09CT("4")
    public static final VoucherStatus EXPIRED;
    public static final /* synthetic */ VoucherStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final VoucherStatus UNCLAIMED;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VoucherStatus UNKNOWN;

    @C09CT("3")
    public static final VoucherStatus USED;

    public static InterfaceC2044707zh<VoucherStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        VoucherStatus voucherStatus = new VoucherStatus("UNKNOWN", 0);
        UNKNOWN = voucherStatus;
        VoucherStatus voucherStatus2 = new VoucherStatus("UNCLAIMED", 1);
        UNCLAIMED = voucherStatus2;
        VoucherStatus voucherStatus3 = new VoucherStatus("CLAIMED", 2);
        CLAIMED = voucherStatus3;
        VoucherStatus voucherStatus4 = new VoucherStatus("USED", 3);
        USED = voucherStatus4;
        VoucherStatus voucherStatus5 = new VoucherStatus("EXPIRED", 4);
        EXPIRED = voucherStatus5;
        VoucherStatus[] voucherStatusArr = {voucherStatus, voucherStatus2, voucherStatus3, voucherStatus4, voucherStatus5};
        LL = voucherStatusArr;
        LLILLJJLI = new C2254308sP(voucherStatusArr);
    }

    public static VoucherStatus[] values() {
        return (VoucherStatus[]) LL.clone();
    }

    public static VoucherStatus valueOf(String str) {
        return (VoucherStatus) C08FF.LIZ(VoucherStatus.class, str);
    }

    public VoucherStatus(String str, int i) {
    }
}
