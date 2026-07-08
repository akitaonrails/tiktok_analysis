package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidCollectionOverView implements Serializable {

    @C09CT("badge_type")
    public final BadgeType badgeType;

    @C09CT("collection_id")
    public final long collectionId;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("creator_name")
    public final String creatorName;

    @C09CT("heat_score")
    public final long heatScore;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("name")
    public final String name;

    @C09CT("num_videos")
    public final int videoCount;

    @C09CT("num_watched")
    public final int watchedCount;

    public PaidCollectionOverView() {
        this(0L, null, null, null, 0, 0, false, 0L, BadgeType.NUM_WATCHED);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.collectionId) * 31;
        String str = this.name;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creatorName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode3 = (((((((((iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.videoCount) * 31) + this.watchedCount) * 31) + C786410Ut5.Z2(this.isLimitedFree)) * 31) + C786410Ut5.Y2(this.heatScore)) * 31;
        BadgeType badgeType = this.badgeType;
        return iHashCode3 + (badgeType != null ? badgeType.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionOverView(collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", creatorName=");
        sbLIZ.append(this.creatorName);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.videoCount);
        sbLIZ.append(", watchedCount=");
        sbLIZ.append(this.watchedCount);
        sbLIZ.append(", isLimitedFree=");
        sbLIZ.append(this.isLimitedFree);
        sbLIZ.append(", heatScore=");
        sbLIZ.append(this.heatScore);
        sbLIZ.append(", badgeType=");
        sbLIZ.append(this.badgeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public PaidCollectionOverView(long j, String str, String str2, UrlModel urlModel, int i, int i2, boolean z, long j2, BadgeType badgeType) {
        this.collectionId = j;
        this.name = str;
        this.creatorName = str2;
        this.cover = urlModel;
        this.videoCount = i;
        this.watchedCount = i2;
        this.isLimitedFree = z;
        this.heatScore = j2;
        this.badgeType = badgeType;
    }
}
