package com.ss.android.ugc.aweme.models;

import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1166070gRx;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.models.RssArticle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RssArticle implements Parcelable {
    public static final Parcelable.Creator<RssArticle> CREATOR = new Parcelable.Creator<RssArticle>() { // from class: X.0gS0
        @Override // android.os.Parcelable.Creator
        public final RssArticle createFromParcel(Parcel parcel) {
            return new RssArticle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), 1008);
        }

        @Override // android.os.Parcelable.Creator
        public final RssArticle[] newArray(int i) {
            return new RssArticle[i];
        }
    };
    public final List<Long> awemeIds;
    public final String date;
    public final String description;
    public final int guid;
    public final boolean hasMaxImages;
    public final List<String> imageUrls;
    public final boolean isPublished;
    public final String linkUrl;
    public final String rssGuid;
    public final String rssUrl;
    public final EnumC1166070gRx status;
    public final String title;

    public RssArticle() {
        this(null, null, null, null, 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssArticle)) {
            return false;
        }
        RssArticle rssArticle = (RssArticle) obj;
        return Intrinsics.LJFF(this.title, rssArticle.title) && Intrinsics.LJFF(this.description, rssArticle.description) && Intrinsics.LJFF(this.rssUrl, rssArticle.rssUrl) && Intrinsics.LJFF(this.rssGuid, rssArticle.rssGuid) && Intrinsics.LJFF(this.imageUrls, rssArticle.imageUrls) && Intrinsics.LJFF(this.date, rssArticle.date) && this.status == rssArticle.status && Intrinsics.LJFF(this.linkUrl, rssArticle.linkUrl) && Intrinsics.LJFF(this.awemeIds, rssArticle.awemeIds) && this.hasMaxImages == rssArticle.hasMaxImages;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.rssUrl.hashCode()) * 31) + this.rssGuid.hashCode()) * 31) + this.imageUrls.hashCode()) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC1166070gRx enumC1166070gRx = this.status;
        return ((((((iHashCode2 + (enumC1166070gRx != null ? enumC1166070gRx.hashCode() : 0)) * 31) + this.linkUrl.hashCode()) * 31) + this.awemeIds.hashCode()) * 31) + C786410Ut5.Z2(this.hasMaxImages);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RssArticle(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", rssUrl=");
        sbLIZ.append(this.rssUrl);
        sbLIZ.append(", rssGuid=");
        sbLIZ.append(this.rssGuid);
        sbLIZ.append(", imageUrls=");
        sbLIZ.append(this.imageUrls);
        sbLIZ.append(", date=");
        sbLIZ.append(this.date);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", linkUrl=");
        sbLIZ.append(this.linkUrl);
        sbLIZ.append(", awemeIds=");
        sbLIZ.append(this.awemeIds);
        sbLIZ.append(", hasMaxImages=");
        sbLIZ.append(this.hasMaxImages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.rssUrl);
        parcel.writeString(this.rssGuid);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RssArticle(String str, String str2, String str3, String str4, int i) {
        C13BV c13bv;
        String str5;
        EnumC1166070gRx enumC1166070gRx;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = (i & 1) != 0 ? "" : str;
        str8 = (i & 2) != 0 ? "" : str8;
        str7 = (i & 4) != 0 ? "" : str7;
        str6 = (i & 8) != 0 ? "" : str6;
        if ((i & 16) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 32) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            enumC1166070gRx = EnumC1166070gRx.UNPUBLISHED;
        } else {
            enumC1166070gRx = null;
        }
        this(str9, str8, str7, str6, c13bv, str5, enumC1166070gRx, (i & 128) == 0 ? null : "", (i & 256) != 0 ? C13BV.INSTANCE : null, false);
    }

    public RssArticle(String str, String str2, String str3, String str4, List<String> list, String str5, EnumC1166070gRx enumC1166070gRx, String str6, List<Long> list2, boolean z) {
        boolean z2;
        this.title = str;
        this.description = str2;
        this.rssUrl = str3;
        this.rssGuid = str4;
        this.imageUrls = list;
        this.date = str5;
        this.status = enumC1166070gRx;
        this.linkUrl = str6;
        this.awemeIds = list2;
        this.hasMaxImages = z;
        this.guid = hashCode();
        if (enumC1166070gRx == EnumC1166070gRx.PUBLISHED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isPublished = z2;
    }
}
