package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class ExploreDetailComponentOptConfig {

    @C09CT("add_comment_entrance")
    public final boolean addCommentEntrance;

    @C09CT("anchor_style_opt")
    public final boolean anchorStyleOpt;

    @C09CT("music_anchor_change")
    public final boolean musicAnchorChange;

    public ExploreDetailComponentOptConfig() {
        this(false, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreDetailComponentOptConfig)) {
            return false;
        }
        ExploreDetailComponentOptConfig exploreDetailComponentOptConfig = (ExploreDetailComponentOptConfig) obj;
        return this.addCommentEntrance == exploreDetailComponentOptConfig.addCommentEntrance && this.anchorStyleOpt == exploreDetailComponentOptConfig.anchorStyleOpt && this.musicAnchorChange == exploreDetailComponentOptConfig.musicAnchorChange;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.addCommentEntrance) * 31) + C786410Ut5.Z2(this.anchorStyleOpt)) * 31) + C786410Ut5.Z2(this.musicAnchorChange);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreDetailComponentOptConfig(addCommentEntrance=");
        sbLIZ.append(this.addCommentEntrance);
        sbLIZ.append(", anchorStyleOpt=");
        sbLIZ.append(this.anchorStyleOpt);
        sbLIZ.append(", musicAnchorChange=");
        sbLIZ.append(this.musicAnchorChange);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreDetailComponentOptConfig(boolean z, boolean z2, boolean z3) {
        this.addCommentEntrance = z;
        this.anchorStyleOpt = z2;
        this.musicAnchorChange = z3;
    }
}
