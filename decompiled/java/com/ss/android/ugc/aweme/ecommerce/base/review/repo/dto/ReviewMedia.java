package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C1405610mgJ;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewMedia implements Parcelable {

    @C09CT("image")
    public final Image image;

    @C09CT("media_type")
    public final Integer mediaType;

    @C09CT("video")
    public final Video video;
    public static final C1405610mgJ Companion = new Object() { // from class: X.0mgJ
    };
    public static final Parcelable.Creator<ReviewMedia> CREATOR = new Parcelable.Creator<ReviewMedia>() { // from class: X.0mgI
        @Override // android.os.Parcelable.Creator
        public final ReviewMedia createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Video videoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Image image = (Image) parcel.readParcelable(ReviewMedia.class.getClassLoader());
            if (parcel.readInt() != 0) {
                videoCreateFromParcel = Video.CREATOR.createFromParcel(parcel);
            }
            return new ReviewMedia(numValueOf, image, videoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewMedia[] newArray(int i) {
            return new ReviewMedia[i];
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
        if (!(obj instanceof ReviewMedia)) {
            return false;
        }
        ReviewMedia reviewMedia = (ReviewMedia) obj;
        return Intrinsics.LJFF(this.mediaType, reviewMedia.mediaType) && Intrinsics.LJFF(this.image, reviewMedia.image) && Intrinsics.LJFF(this.video, reviewMedia.video);
    }

    public final int hashCode() {
        Integer num = this.mediaType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Video video = this.video;
        return iHashCode2 + (video != null ? video.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewMedia(mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.mediaType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.image, i);
        Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i);
        }
    }

    public ReviewMedia(Integer num, Image image, Video video) {
        this.mediaType = num;
        this.image = image;
        this.video = video;
    }
}
