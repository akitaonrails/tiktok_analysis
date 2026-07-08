package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExitRetentionData {

    @C09CT("cancel_button")
    public final ExitRetentionButton cancelButton;

    @C09CT("confirm_button")
    public final ExitRetentionButton confirmButton;

    @C09CT("content")
    public final String content;

    @C09CT("frequency")
    public final ExitRetentionFrequency frequency;

    @C09CT("header")
    public final String header;

    @C09CT("selection")
    public final ExitRetentionSelection selection;

    @C09CT("title")
    public final String title;

    public ExitRetentionData() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitRetentionData)) {
            return false;
        }
        ExitRetentionData exitRetentionData = (ExitRetentionData) obj;
        return Intrinsics.LJFF(this.header, exitRetentionData.header) && Intrinsics.LJFF(this.title, exitRetentionData.title) && Intrinsics.LJFF(this.content, exitRetentionData.content) && Intrinsics.LJFF(this.confirmButton, exitRetentionData.confirmButton) && Intrinsics.LJFF(this.cancelButton, exitRetentionData.cancelButton) && Intrinsics.LJFF(this.selection, exitRetentionData.selection) && Intrinsics.LJFF(this.frequency, exitRetentionData.frequency);
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExitRetentionButton exitRetentionButton = this.confirmButton;
        int iHashCode4 = (iHashCode3 + (exitRetentionButton == null ? 0 : exitRetentionButton.hashCode())) * 31;
        ExitRetentionButton exitRetentionButton2 = this.cancelButton;
        int iHashCode5 = (iHashCode4 + (exitRetentionButton2 == null ? 0 : exitRetentionButton2.hashCode())) * 31;
        ExitRetentionSelection exitRetentionSelection = this.selection;
        int iHashCode6 = (iHashCode5 + (exitRetentionSelection == null ? 0 : exitRetentionSelection.hashCode())) * 31;
        ExitRetentionFrequency exitRetentionFrequency = this.frequency;
        return iHashCode6 + (exitRetentionFrequency != null ? exitRetentionFrequency.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitRetentionData(header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", confirmButton=");
        sbLIZ.append(this.confirmButton);
        sbLIZ.append(", cancelButton=");
        sbLIZ.append(this.cancelButton);
        sbLIZ.append(", selection=");
        sbLIZ.append(this.selection);
        sbLIZ.append(", frequency=");
        sbLIZ.append(this.frequency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExitRetentionData(String str, String str2, String str3, ExitRetentionButton exitRetentionButton, ExitRetentionButton exitRetentionButton2, ExitRetentionSelection exitRetentionSelection, ExitRetentionFrequency exitRetentionFrequency) {
        this.header = str;
        this.title = str2;
        this.content = str3;
        this.confirmButton = exitRetentionButton;
        this.cancelButton = exitRetentionButton2;
        this.selection = exitRetentionSelection;
        this.frequency = exitRetentionFrequency;
    }
}
