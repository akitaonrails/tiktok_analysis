package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SectionInfo {

    @C09CT("section_code")
    public final String code;

    @C09CT("section_payment_amount_display_text")
    public final String displayAmount;

    @C09CT("group_list")
    public final List<GroupInfo> groupList;

    @C09CT("section_title")
    public final String title;

    public SectionInfo() {
        this(null, null, null, null);
    }

    public SectionInfo(String str, String str2, String str3, List<GroupInfo> list) {
        this.code = str;
        this.title = str2;
        this.displayAmount = str3;
        this.groupList = list;
    }
}
