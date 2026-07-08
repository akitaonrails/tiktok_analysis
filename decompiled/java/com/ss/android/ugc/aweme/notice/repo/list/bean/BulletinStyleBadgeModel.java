package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinStyleBadgeModel {

    @C09CT("bottom_left_source")
    public final BulletinGeckoResourceModel bottomLeftSources;

    @C09CT("bottom_right_source")
    public final BulletinGeckoResourceModel bottomRightSources;

    @C09CT("top_left_source")
    public final BulletinGeckoResourceModel topLeftSources;

    @C09CT("top_right_source")
    public final BulletinGeckoResourceModel topRightSources;

    public BulletinStyleBadgeModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinStyleBadgeModel)) {
            return false;
        }
        BulletinStyleBadgeModel bulletinStyleBadgeModel = (BulletinStyleBadgeModel) obj;
        return Intrinsics.LJFF(this.topLeftSources, bulletinStyleBadgeModel.topLeftSources) && Intrinsics.LJFF(this.topRightSources, bulletinStyleBadgeModel.topRightSources) && Intrinsics.LJFF(this.bottomLeftSources, bulletinStyleBadgeModel.bottomLeftSources) && Intrinsics.LJFF(this.bottomRightSources, bulletinStyleBadgeModel.bottomRightSources);
    }

    public final int hashCode() {
        BulletinGeckoResourceModel bulletinGeckoResourceModel = this.topLeftSources;
        int iHashCode = (bulletinGeckoResourceModel == null ? 0 : bulletinGeckoResourceModel.hashCode()) * 31;
        BulletinGeckoResourceModel bulletinGeckoResourceModel2 = this.topRightSources;
        int iHashCode2 = (iHashCode + (bulletinGeckoResourceModel2 == null ? 0 : bulletinGeckoResourceModel2.hashCode())) * 31;
        BulletinGeckoResourceModel bulletinGeckoResourceModel3 = this.bottomLeftSources;
        int iHashCode3 = (iHashCode2 + (bulletinGeckoResourceModel3 == null ? 0 : bulletinGeckoResourceModel3.hashCode())) * 31;
        BulletinGeckoResourceModel bulletinGeckoResourceModel4 = this.bottomRightSources;
        return iHashCode3 + (bulletinGeckoResourceModel4 != null ? bulletinGeckoResourceModel4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinStyleBadgeModel(topLeftSources=");
        sbLIZ.append(this.topLeftSources);
        sbLIZ.append(", topRightSources=");
        sbLIZ.append(this.topRightSources);
        sbLIZ.append(", bottomLeftSources=");
        sbLIZ.append(this.bottomLeftSources);
        sbLIZ.append(", bottomRightSources=");
        sbLIZ.append(this.bottomRightSources);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinStyleBadgeModel(BulletinGeckoResourceModel bulletinGeckoResourceModel, BulletinGeckoResourceModel bulletinGeckoResourceModel2, BulletinGeckoResourceModel bulletinGeckoResourceModel3, BulletinGeckoResourceModel bulletinGeckoResourceModel4) {
        this.topLeftSources = bulletinGeckoResourceModel;
        this.topRightSources = bulletinGeckoResourceModel2;
        this.bottomLeftSources = bulletinGeckoResourceModel3;
        this.bottomRightSources = bulletinGeckoResourceModel4;
    }
}
