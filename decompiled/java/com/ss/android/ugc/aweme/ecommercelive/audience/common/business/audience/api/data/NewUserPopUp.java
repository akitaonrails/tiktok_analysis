package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class NewUserPopUp {

    @C09CT("bottom_info_style")
    public final int bottomInfoStyle;

    @C09CT("next_available_time")
    public final long nextAvailableTime;

    @C09CT("pin_voucher_style")
    public final int pinVoucherStyle;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_seconds_with_card")
    public final long showSecondsWithCard;

    @C09CT("show_seconds_with_pin")
    public final long showSecondsWithPin;

    @C09CT("show_seconds_without_card")
    public final long showSecondsWithoutCard;

    @C09CT("voucher_infos")
    public final VoucherInfo[] voucher;

    public NewUserPopUp(String str, long j, long j2, long j3, VoucherInfo[] voucherInfoArr, long j4, int i, int i2) {
        this.schema = str;
        this.showSecondsWithCard = j;
        this.showSecondsWithoutCard = j2;
        this.showSecondsWithPin = j3;
        this.voucher = voucherInfoArr;
        this.nextAvailableTime = j4;
        this.pinVoucherStyle = i;
        this.bottomInfoStyle = i2;
    }
}
