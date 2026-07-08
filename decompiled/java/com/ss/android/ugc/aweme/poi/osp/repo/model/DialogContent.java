package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogContent implements Serializable {

    @C09CT("button_list")
    public final List<ButtonAction> actionList;

    @C09CT("breakdown_heading")
    public final String breakdownHeading;

    @C09CT("breakdown_items")
    public final List<PriceItem> breakdownItems;

    @C09CT("breakdown_total")
    public final PriceItem breakdownTotal;

    @C09CT("custom_data")
    public final DialogCustomData customData;

    @C09CT("message")
    public final String message;

    @C09CT("rich_text_message")
    public final LsRichText richTextMsg;

    @C09CT("rich_text_title")
    public final LsRichText richTextTitle;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public DialogContent() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogContent)) {
            return false;
        }
        DialogContent dialogContent = (DialogContent) obj;
        return Intrinsics.LJFF(this.title, dialogContent.title) && Intrinsics.LJFF(this.richTextTitle, dialogContent.richTextTitle) && Intrinsics.LJFF(this.message, dialogContent.message) && Intrinsics.LJFF(this.richTextMsg, dialogContent.richTextMsg) && Intrinsics.LJFF(this.actionList, dialogContent.actionList) && Intrinsics.LJFF(this.customData, dialogContent.customData) && Intrinsics.LJFF(this.type, dialogContent.type) && Intrinsics.LJFF(this.breakdownHeading, dialogContent.breakdownHeading) && Intrinsics.LJFF(this.breakdownItems, dialogContent.breakdownItems) && Intrinsics.LJFF(this.breakdownTotal, dialogContent.breakdownTotal);
    }

    public DialogContent(String str, LsRichText lsRichText, String str2, LsRichText lsRichText2, List<ButtonAction> list, DialogCustomData dialogCustomData, String str3, String str4, List<PriceItem> list2, PriceItem priceItem) {
        this.title = str;
        this.richTextTitle = lsRichText;
        this.message = str2;
        this.richTextMsg = lsRichText2;
        this.actionList = list;
        this.customData = dialogCustomData;
        this.type = str3;
        this.breakdownHeading = str4;
        this.breakdownItems = list2;
        this.breakdownTotal = priceItem;
    }
}
