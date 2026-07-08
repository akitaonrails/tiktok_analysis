package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C1729920v7O;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateListData implements Parcelable {

    @C09CT("banner_info")
    public final TopBannerInfo bannerInfo;

    @C09CT("server_time")
    public final Long serverTime;

    @C09CT("templates_list")
    public final List<RespTemplateItem> templateList;

    @C09CT("toast_content")
    public final String toastContent;
    public static final C1729920v7O Companion = new Object() { // from class: X.0v7O
    };
    public static final Parcelable.Creator<TemplateListData> CREATOR = new Parcelable.Creator<TemplateListData>() { // from class: X.0v7N
        @Override // android.os.Parcelable.Creator
        public final TemplateListData createFromParcel(Parcel parcel) {
            Long lValueOf;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RespTemplateItem.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            TopBannerInfo topBannerInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                topBannerInfoCreateFromParcel = TopBannerInfo.CREATOR.createFromParcel(parcel);
            }
            return new TemplateListData(arrayList, string, lValueOf, topBannerInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateListData[] newArray(int i) {
            return new TemplateListData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateListData)) {
            return false;
        }
        TemplateListData templateListData = (TemplateListData) obj;
        return Intrinsics.LJFF(this.templateList, templateListData.templateList) && Intrinsics.LJFF(this.toastContent, templateListData.toastContent) && Intrinsics.LJFF(this.serverTime, templateListData.serverTime) && Intrinsics.LJFF(this.bannerInfo, templateListData.bannerInfo);
    }

    public final int hashCode() {
        int iHashCode = this.templateList.hashCode() * 31;
        String str = this.toastContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.serverTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        TopBannerInfo topBannerInfo = this.bannerInfo;
        return iHashCode3 + (topBannerInfo != null ? topBannerInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListData(templateList=");
        sbLIZ.append(this.templateList);
        sbLIZ.append(", toastContent=");
        sbLIZ.append(this.toastContent);
        sbLIZ.append(", serverTime=");
        sbLIZ.append(this.serverTime);
        sbLIZ.append(", bannerInfo=");
        sbLIZ.append(this.bannerInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<RespTemplateItem> list = this.templateList;
        parcel.writeInt(list.size());
        Iterator<RespTemplateItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.toastContent);
        Long l = this.serverTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        TopBannerInfo topBannerInfo = this.bannerInfo;
        if (topBannerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topBannerInfo.writeToParcel(parcel, i);
        }
    }

    public TemplateListData(List<RespTemplateItem> list, String str, Long l, TopBannerInfo topBannerInfo) {
        this.templateList = list;
        this.toastContent = str;
        this.serverTime = l;
        this.bannerInfo = topBannerInfo;
    }
}
