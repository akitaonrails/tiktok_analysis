package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoDetailCommentEntryConfig {

    @C09CT("add_comment_entry")
    public final boolean addCommentEntry;

    @C09CT("rounded_input_box")
    public final boolean roundedInputBox;

    public PhotoDetailCommentEntryConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoDetailCommentEntryConfig)) {
            return false;
        }
        PhotoDetailCommentEntryConfig photoDetailCommentEntryConfig = (PhotoDetailCommentEntryConfig) obj;
        return this.roundedInputBox == photoDetailCommentEntryConfig.roundedInputBox && this.addCommentEntry == photoDetailCommentEntryConfig.addCommentEntry;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.roundedInputBox) * 31) + C786410Ut5.Z2(this.addCommentEntry);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoDetailCommentEntryConfig(roundedInputBox=");
        sbLIZ.append(this.roundedInputBox);
        sbLIZ.append(", addCommentEntry=");
        sbLIZ.append(this.addCommentEntry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoDetailCommentEntryConfig(boolean z, boolean z2) {
        this.roundedInputBox = z;
        this.addCommentEntry = z2;
    }
}
