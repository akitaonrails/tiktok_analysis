package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinGeckoResourceModel {

    @C09CT("image_path")
    public final String imagePath;

    @C09CT("init_image_path")
    public final String initImagePath;

    @C09CT("lottie_path")
    public final String lottiePath;

    @C09CT("package_channel_id")
    public final String packageChannelId;

    public BulletinGeckoResourceModel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinGeckoResourceModel)) {
            return false;
        }
        BulletinGeckoResourceModel bulletinGeckoResourceModel = (BulletinGeckoResourceModel) obj;
        return Intrinsics.LJFF(this.packageChannelId, bulletinGeckoResourceModel.packageChannelId) && Intrinsics.LJFF(this.initImagePath, bulletinGeckoResourceModel.initImagePath) && Intrinsics.LJFF(this.imagePath, bulletinGeckoResourceModel.imagePath) && Intrinsics.LJFF(this.lottiePath, bulletinGeckoResourceModel.lottiePath);
    }

    public final int hashCode() {
        String str = this.packageChannelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initImagePath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imagePath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lottiePath;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinGeckoResourceModel(packageChannelId=");
        sbLIZ.append(this.packageChannelId);
        sbLIZ.append(", initImagePath=");
        sbLIZ.append(this.initImagePath);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", lottiePath=");
        sbLIZ.append(this.lottiePath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinGeckoResourceModel(String str, String str2, String str3, String str4) {
        this.packageChannelId = str;
        this.initImagePath = str2;
        this.imagePath = str3;
        this.lottiePath = str4;
    }
}
