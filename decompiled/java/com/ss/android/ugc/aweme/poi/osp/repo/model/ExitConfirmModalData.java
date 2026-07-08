package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExitConfirmModalData extends BaseComponentData implements Serializable {

    @C09CT("button_list")
    public final List<ButtonAction> actionList;

    @C09CT("custom_data")
    public final DialogCustomData customData;

    @C09CT("rich_text_message")
    public final LsRichText richTextMsg;

    @C09CT("rich_text_title")
    public final LsRichText richTextTitle;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public ExitConfirmModalData() {
        this(null, null, null, null, null, null);
    }

    public final ExitConfirmModalData copy(String str, LsRichText lsRichText, LsRichText lsRichText2, List<ButtonAction> list, DialogCustomData dialogCustomData, String str2) {
        return new ExitConfirmModalData(str, lsRichText, lsRichText2, list, dialogCustomData, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitConfirmModalData)) {
            return false;
        }
        ExitConfirmModalData exitConfirmModalData = (ExitConfirmModalData) obj;
        return Intrinsics.LJFF(this.title, exitConfirmModalData.title) && Intrinsics.LJFF(this.richTextMsg, exitConfirmModalData.richTextMsg) && Intrinsics.LJFF(this.richTextTitle, exitConfirmModalData.richTextTitle) && Intrinsics.LJFF(this.actionList, exitConfirmModalData.actionList) && Intrinsics.LJFF(this.customData, exitConfirmModalData.customData) && Intrinsics.LJFF(this.type, exitConfirmModalData.type);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LsRichText lsRichText = this.richTextMsg;
        int iHashCode2 = (iHashCode + (lsRichText == null ? 0 : lsRichText.hashCode())) * 31;
        LsRichText lsRichText2 = this.richTextTitle;
        int iHashCode3 = (iHashCode2 + (lsRichText2 == null ? 0 : lsRichText2.hashCode())) * 31;
        List<ButtonAction> list = this.actionList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DialogCustomData dialogCustomData = this.customData;
        int iHashCode5 = (iHashCode4 + (dialogCustomData == null ? 0 : dialogCustomData.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitConfirmModalData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", richTextMsg=");
        sbLIZ.append(this.richTextMsg);
        sbLIZ.append(", richTextTitle=");
        sbLIZ.append(this.richTextTitle);
        sbLIZ.append(", actionList=");
        sbLIZ.append(this.actionList);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ButtonAction> getActionList() {
        return this.actionList;
    }

    public final DialogCustomData getCustomData() {
        return this.customData;
    }

    public final LsRichText getRichTextMsg() {
        return this.richTextMsg;
    }

    public final LsRichText getRichTextTitle() {
        return this.richTextTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public ExitConfirmModalData(String str, LsRichText lsRichText, LsRichText lsRichText2, List<ButtonAction> list, DialogCustomData dialogCustomData, String str2) {
        this.title = str;
        this.richTextMsg = lsRichText;
        this.richTextTitle = lsRichText2;
        this.actionList = list;
        this.customData = dialogCustomData;
        this.type = str2;
    }
}
