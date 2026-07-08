package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class ResetEntryTextData implements Serializable {
    public static final int $stable = 8;

    @C09CT("button_cancel")
    public final String cancel;

    @C09CT("desc")
    public final String description;

    @C09CT("item_link_list")
    public final List<String> itemLinkList;

    @C09CT("item_list")
    public final List<String> itemList;

    @C09CT("button_ok")
    public final String ok;

    @C09CT("reset_done_popup_desc")
    public final String resetDonePopupDesc;

    @C09CT("reset_not_done_popup_desc")
    public final String resetNotDonePopupDesc;

    @C09CT("reset_status")
    public Integer resetStatus;

    @C09CT("title")
    public final String title;

    @C09CT("button_withdraw")
    public final String withdraw;

    public ResetEntryTextData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final void setResetStatus(Integer num) {
        this.resetStatus = num;
    }

    public ResetEntryTextData(String str, String str2, Integer num, String str3, String str4, List<String> list, List<String> list2, String str5, String str6, String str7) {
        this.title = str;
        this.description = str2;
        this.resetStatus = num;
        this.resetNotDonePopupDesc = str3;
        this.resetDonePopupDesc = str4;
        this.itemList = list;
        this.itemLinkList = list2;
        this.withdraw = str5;
        this.cancel = str6;
        this.ok = str7;
    }

    public ResetEntryTextData(String str, String str2, Integer num, String str3, String str4, List list, List list2, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? -1 : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? C13BV.INSTANCE : list2, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? str7 : "");
    }
}
