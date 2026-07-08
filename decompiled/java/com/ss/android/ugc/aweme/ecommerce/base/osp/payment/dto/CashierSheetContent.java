package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CashierSheetContent {

    @C09CT("content")
    public List<ContentBlock> content;

    @C09CT("dialog_button")
    public List<DialogButton> dialogButtons;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;

    public CashierSheetContent() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierSheetContent)) {
            return false;
        }
        CashierSheetContent cashierSheetContent = (CashierSheetContent) obj;
        return Intrinsics.LJFF(this.title, cashierSheetContent.title) && Intrinsics.LJFF(this.subTitle, cashierSheetContent.subTitle) && Intrinsics.LJFF(this.content, cashierSheetContent.content) && Intrinsics.LJFF(this.dialogButtons, cashierSheetContent.dialogButtons);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ContentBlock> list = this.content;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DialogButton> list2 = this.dialogButtons;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierSheetContent(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", dialogButtons=");
        sbLIZ.append(this.dialogButtons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CashierSheetContent(String str, String str2, List<ContentBlock> list, List<DialogButton> list2) {
        this.title = str;
        this.subTitle = str2;
        this.content = list;
        this.dialogButtons = list2;
    }
}
