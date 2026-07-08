package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class PhotoModeFullCommentModel {

    @C09CT("score")
    public final float score;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f66switch;

    public PhotoModeFullCommentModel() {
        this(0, -1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeFullCommentModel)) {
            return false;
        }
        PhotoModeFullCommentModel photoModeFullCommentModel = (PhotoModeFullCommentModel) obj;
        return this.f66switch == photoModeFullCommentModel.f66switch && Float.compare(this.score, photoModeFullCommentModel.score) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeFullCommentModel(switch=");
        sbLIZ.append(this.f66switch);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.f66switch * 31) + Float.floatToIntBits(this.score);
    }

    public PhotoModeFullCommentModel(int i, float f) {
        this.f66switch = i;
        this.score = f;
    }
}
