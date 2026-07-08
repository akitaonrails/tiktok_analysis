package com.ss.android.ugc.aweme.payment;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class VoucherUseStatus {
    public static final /* synthetic */ VoucherUseStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VoucherUseStatus NO_VOUCHER_USED;

    @C09CT("2")
    public static final VoucherUseStatus VOUCHER_SUCCESS;

    @C09CT("1")
    public static final VoucherUseStatus VOUCHER_UNAVAILABLE;

    public static InterfaceC2044707zh<VoucherUseStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        VoucherUseStatus voucherUseStatus = new VoucherUseStatus("NO_VOUCHER_USED", 0);
        NO_VOUCHER_USED = voucherUseStatus;
        VoucherUseStatus voucherUseStatus2 = new VoucherUseStatus("VOUCHER_UNAVAILABLE", 1);
        VOUCHER_UNAVAILABLE = voucherUseStatus2;
        VoucherUseStatus voucherUseStatus3 = new VoucherUseStatus("VOUCHER_SUCCESS", 2);
        VOUCHER_SUCCESS = voucherUseStatus3;
        VoucherUseStatus[] voucherUseStatusArr = {voucherUseStatus, voucherUseStatus2, voucherUseStatus3};
        LL = voucherUseStatusArr;
        LLILLJJLI = new C2254308sP(voucherUseStatusArr);
    }

    public static VoucherUseStatus[] values() {
        return (VoucherUseStatus[]) LL.clone();
    }

    public static VoucherUseStatus valueOf(String str) {
        return (VoucherUseStatus) C08FF.LIZ(VoucherUseStatus.class, str);
    }

    public VoucherUseStatus(String str, int i) {
    }
}
