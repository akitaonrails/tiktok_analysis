package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxVideoBrief {

    @C09CT("cover")
    public final ExploreLynxUrlModel cover;

    @C09CT("height")
    public final Integer height;

    @C09CT("origin_cover")
    public final ExploreLynxUrlModel originCover;

    @C09CT("width")
    public final Integer width;

    public ExploreLynxVideoBrief() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxVideoBrief)) {
            return false;
        }
        ExploreLynxVideoBrief exploreLynxVideoBrief = (ExploreLynxVideoBrief) obj;
        return Intrinsics.LJFF(this.cover, exploreLynxVideoBrief.cover) && Intrinsics.LJFF(this.height, exploreLynxVideoBrief.height) && Intrinsics.LJFF(this.width, exploreLynxVideoBrief.width) && Intrinsics.LJFF(this.originCover, exploreLynxVideoBrief.originCover);
    }

    public final int hashCode() {
        ExploreLynxUrlModel exploreLynxUrlModel = this.cover;
        int iHashCode = (exploreLynxUrlModel == null ? 0 : exploreLynxUrlModel.hashCode()) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ExploreLynxUrlModel exploreLynxUrlModel2 = this.originCover;
        return iHashCode3 + (exploreLynxUrlModel2 != null ? exploreLynxUrlModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxVideoBrief(cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", originCover=");
        sbLIZ.append(this.originCover);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxVideoBrief(ExploreLynxUrlModel exploreLynxUrlModel, Integer num, Integer num2, ExploreLynxUrlModel exploreLynxUrlModel2) {
        this.cover = exploreLynxUrlModel;
        this.height = num;
        this.width = num2;
        this.originCover = exploreLynxUrlModel2;
    }
}
