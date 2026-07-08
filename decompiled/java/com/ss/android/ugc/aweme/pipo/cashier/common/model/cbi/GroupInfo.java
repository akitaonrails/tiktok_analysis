package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GroupInfo {

    @C09CT("is_available")
    public final boolean available;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("display_raw_text")
    public final String displayRawText;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("payment_method_group_code")
    public final String paymentMethodGroupCode;

    @C09CT("payment_method_group_type")
    public final String paymentMethodGroupType;

    @C09CT("payment_method_tips")
    public final List<PaymentMethodTips> paymentMethodTips;

    @C09CT("sort_list")
    public final List<SortItem> sortList;

    @C09CT("unavailable_raw_msg")
    public final String unavailableRawText;

    public GroupInfo(String str, String str2, List<SortItem> list, String str3, String str4, String str5, boolean z, String str6, List<PaymentMethodTips> list2) {
        this.paymentMethodGroupCode = str;
        this.paymentMethodGroupType = str2;
        this.sortList = list;
        this.iconUrl = str3;
        this.darkModeIconUrl = str4;
        this.displayRawText = str5;
        this.available = z;
        this.unavailableRawText = str6;
        this.paymentMethodTips = list2;
    }
}
