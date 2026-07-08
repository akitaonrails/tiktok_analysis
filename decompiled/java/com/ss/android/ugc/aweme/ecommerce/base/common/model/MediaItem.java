package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C1763210vz5;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaFeature;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ReviewPageControlColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MediaItem implements Parcelable {

    @C09CT("category")
    public final String category;

    @C09CT("data_type")
    public final Integer dataType;

    @C09CT("extra")
    public final String extra;

    @C09CT("image")
    public final Image image;

    @C09CT("media_feature")
    public MediaFeature mediaFeature;

    @C09CT("review_lynx_data")
    public final String reviewLynxData;

    @C09CT("review_page_control_color")
    public final ReviewPageControlColor reviewPageControlColor;

    @C09CT("review_schema")
    public String reviewSchema;

    @C09CT("type")
    public final int type;

    @C09CT("video")
    public final Video video;
    public static final C1763210vz5 Companion = new Object() { // from class: X.0vz5
    };
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: X.0vy5
        @Override // android.os.Parcelable.Creator
        public final MediaItem createFromParcel(Parcel parcel) {
            Video videoCreateFromParcel;
            Integer numValueOf;
            MediaFeature mediaFeatureCreateFromParcel;
            Image image = (Image) parcel.readParcelable(MediaItem.class.getClassLoader());
            ReviewPageControlColor reviewPageControlColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                videoCreateFromParcel = null;
            } else {
                videoCreateFromParcel = Video.CREATOR.createFromParcel(parcel);
            }
            Video video = videoCreateFromParcel;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                mediaFeatureCreateFromParcel = null;
            } else {
                mediaFeatureCreateFromParcel = MediaFeature.CREATOR.createFromParcel(parcel);
            }
            MediaFeature mediaFeature = mediaFeatureCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                reviewPageControlColorCreateFromParcel = ReviewPageControlColor.CREATOR.createFromParcel(parcel);
            }
            return new MediaItem(image, video, i, string, string2, numValueOf, mediaFeature, string3, string4, reviewPageControlColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaItem[] newArray(int i) {
            return new MediaItem[i];
        }
    };
    public static final int $stable = 8;
    public static final MediaFeature DEF_FEATURE = new MediaFeature(true, true, true, true, 0, null);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Intrinsics.LJFF(this.image, mediaItem.image) && Intrinsics.LJFF(this.video, mediaItem.video) && this.type == mediaItem.type && Intrinsics.LJFF(this.extra, mediaItem.extra) && Intrinsics.LJFF(this.category, mediaItem.category) && Intrinsics.LJFF(this.dataType, mediaItem.dataType) && Intrinsics.LJFF(this.mediaFeature, mediaItem.mediaFeature) && Intrinsics.LJFF(this.reviewLynxData, mediaItem.reviewLynxData) && Intrinsics.LJFF(this.reviewSchema, mediaItem.reviewSchema) && Intrinsics.LJFF(this.reviewPageControlColor, mediaItem.reviewPageControlColor);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Video video = this.video;
        int iHashCode2 = (((iHashCode + (video == null ? 0 : video.hashCode())) * 31) + this.type) * 31;
        String str = this.extra;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.dataType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        MediaFeature mediaFeature = this.mediaFeature;
        int iHashCode6 = (iHashCode5 + (mediaFeature == null ? 0 : mediaFeature.hashCode())) * 31;
        String str3 = this.reviewLynxData;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reviewSchema;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReviewPageControlColor reviewPageControlColor = this.reviewPageControlColor;
        return iHashCode8 + (reviewPageControlColor != null ? reviewPageControlColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaItem(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", category=");
        sbLIZ.append(this.category);
        sbLIZ.append(", dataType=");
        sbLIZ.append(this.dataType);
        sbLIZ.append(", mediaFeature=");
        sbLIZ.append(this.mediaFeature);
        sbLIZ.append(", reviewLynxData=");
        sbLIZ.append(this.reviewLynxData);
        sbLIZ.append(", reviewSchema=");
        sbLIZ.append(this.reviewSchema);
        sbLIZ.append(", reviewPageControlColor=");
        sbLIZ.append(this.reviewPageControlColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.image, i);
        Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.type);
        parcel.writeString(this.extra);
        parcel.writeString(this.category);
        Integer num = this.dataType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        MediaFeature mediaFeature = this.mediaFeature;
        if (mediaFeature == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaFeature.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reviewLynxData);
        parcel.writeString(this.reviewSchema);
        ReviewPageControlColor reviewPageControlColor = this.reviewPageControlColor;
        if (reviewPageControlColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewPageControlColor.writeToParcel(parcel, i);
        }
    }

    public final MediaFeature LIZ() {
        MediaFeature mediaFeature = this.mediaFeature;
        return mediaFeature == null ? DEF_FEATURE : mediaFeature;
    }

    public MediaItem(boolean z) {
        this(null, null, 3, null, null, null, null, null, null, null);
    }

    public MediaItem(Video video, String str) {
        this(null, video, 2, null, str, null, null, null, null, null);
    }

    public MediaItem(Image image, String str, String str2) {
        this(image, null, 1, str, str2, null, null, null, null, null);
    }

    public MediaItem(Image image, String str, String str2, Integer num) {
        this(image, null, 1, str, str2, num, null, null, null, null);
    }

    public MediaItem(Image image, Video video, int i, String str, String str2, Integer num, MediaFeature mediaFeature, String str3, String str4, ReviewPageControlColor reviewPageControlColor) {
        this.image = image;
        this.video = video;
        this.type = i;
        this.extra = str;
        this.category = str2;
        this.dataType = num;
        this.mediaFeature = mediaFeature;
        this.reviewLynxData = str3;
        this.reviewSchema = str4;
        this.reviewPageControlColor = reviewPageControlColor;
    }
}
