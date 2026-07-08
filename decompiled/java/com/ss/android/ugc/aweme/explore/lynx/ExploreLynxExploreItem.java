package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxExploreItem {

    @C09CT("author")
    public final ExploreLynxAuthor author;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_type")
    public final String awemeType;

    @C09CT("desc")
    public final String desc;

    @C09CT("statistics")
    public final ExploreLynxStatistics statistics;

    @C09CT("top_comment")
    public final ExploreLynxTopComment topComment;

    @C09CT("video")
    public final ExploreLynxVideoBrief video;

    public ExploreLynxExploreItem() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxExploreItem)) {
            return false;
        }
        ExploreLynxExploreItem exploreLynxExploreItem = (ExploreLynxExploreItem) obj;
        return Intrinsics.LJFF(this.awemeId, exploreLynxExploreItem.awemeId) && Intrinsics.LJFF(this.awemeType, exploreLynxExploreItem.awemeType) && Intrinsics.LJFF(this.desc, exploreLynxExploreItem.desc) && Intrinsics.LJFF(this.author, exploreLynxExploreItem.author) && Intrinsics.LJFF(this.video, exploreLynxExploreItem.video) && Intrinsics.LJFF(this.statistics, exploreLynxExploreItem.statistics) && Intrinsics.LJFF(this.topComment, exploreLynxExploreItem.topComment);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.awemeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExploreLynxAuthor exploreLynxAuthor = this.author;
        int iHashCode4 = (iHashCode3 + (exploreLynxAuthor == null ? 0 : exploreLynxAuthor.hashCode())) * 31;
        ExploreLynxVideoBrief exploreLynxVideoBrief = this.video;
        int iHashCode5 = (iHashCode4 + (exploreLynxVideoBrief == null ? 0 : exploreLynxVideoBrief.hashCode())) * 31;
        ExploreLynxStatistics exploreLynxStatistics = this.statistics;
        int iHashCode6 = (iHashCode5 + (exploreLynxStatistics == null ? 0 : exploreLynxStatistics.hashCode())) * 31;
        ExploreLynxTopComment exploreLynxTopComment = this.topComment;
        return iHashCode6 + (exploreLynxTopComment != null ? exploreLynxTopComment.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxExploreItem(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", statistics=");
        sbLIZ.append(this.statistics);
        sbLIZ.append(", topComment=");
        sbLIZ.append(this.topComment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxExploreItem(String str, String str2, String str3, ExploreLynxAuthor exploreLynxAuthor, ExploreLynxVideoBrief exploreLynxVideoBrief, ExploreLynxStatistics exploreLynxStatistics, ExploreLynxTopComment exploreLynxTopComment) {
        this.awemeId = str;
        this.awemeType = str2;
        this.desc = str3;
        this.author = exploreLynxAuthor;
        this.video = exploreLynxVideoBrief;
        this.statistics = exploreLynxStatistics;
        this.topComment = exploreLynxTopComment;
    }
}
