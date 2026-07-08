package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C0HAU;
import X.EnumC311500CIy;
import X.InterfaceC1338570kwB;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselSparkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.VideoConfig;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselElement implements Parcelable, InterfaceC1338570kwB, InterfaceC746802vq {

    @C09CT("carousel_widget_keys")
    public final CarouselWidgetKeys carouselWidgetKeys;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("carousel_element_display_type")
    public final Integer elementDisplayType;

    @C09CT("element_id")
    public final String elementId;

    @C09CT("carousel_element_type")
    public final Integer elementType;

    @C09CT("image")
    public final Image image;

    @C09CT("sale_prop_value_id")
    public final String salePropValueId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("spark_info")
    public final CarouselSparkInfo sparkInfo;

    @C09CT("video")
    public final Video video;

    @C09CT("carousel_video_config")
    public final VideoConfig videoConfig;
    public Image videoCover;
    public static final Parcelable.Creator<CarouselElement> CREATOR = new Parcelable.Creator<CarouselElement>() { // from class: X.0vwy
        @Override // android.os.Parcelable.Creator
        public final CarouselElement createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            CarouselSparkInfo carouselSparkInfoCreateFromParcel;
            Video videoCreateFromParcel;
            VideoConfig videoConfigCreateFromParcel;
            String string = parcel.readString();
            CarouselWidgetKeys carouselWidgetKeysCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                carouselSparkInfoCreateFromParcel = null;
            } else {
                carouselSparkInfoCreateFromParcel = CarouselSparkInfo.CREATOR.createFromParcel(parcel);
            }
            CarouselSparkInfo carouselSparkInfo = carouselSparkInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                videoCreateFromParcel = null;
            } else {
                videoCreateFromParcel = Video.CREATOR.createFromParcel(parcel);
            }
            Video video = videoCreateFromParcel;
            if (parcel.readInt() == 0) {
                videoConfigCreateFromParcel = null;
            } else {
                videoConfigCreateFromParcel = VideoConfig.CREATOR.createFromParcel(parcel);
            }
            VideoConfig videoConfig = videoConfigCreateFromParcel;
            Image image = (Image) parcel.readParcelable(CarouselElement.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                carouselWidgetKeysCreateFromParcel = CarouselWidgetKeys.CREATOR.createFromParcel(parcel);
            }
            return new CarouselElement(string, numValueOf, numValueOf2, carouselSparkInfo, video, videoConfig, image, string2, string3, carouselWidgetKeysCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselElement[] newArray(int i) {
            return new CarouselElement[i];
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
        if (!(obj instanceof CarouselElement)) {
            return false;
        }
        CarouselElement carouselElement = (CarouselElement) obj;
        return Intrinsics.LJFF(this.elementId, carouselElement.elementId) && Intrinsics.LJFF(this.elementType, carouselElement.elementType) && Intrinsics.LJFF(this.elementDisplayType, carouselElement.elementDisplayType) && Intrinsics.LJFF(this.sparkInfo, carouselElement.sparkInfo) && Intrinsics.LJFF(this.video, carouselElement.video) && Intrinsics.LJFF(this.videoConfig, carouselElement.videoConfig) && Intrinsics.LJFF(this.image, carouselElement.image) && Intrinsics.LJFF(this.salePropValueId, carouselElement.salePropValueId) && Intrinsics.LJFF(this.skuId, carouselElement.skuId) && Intrinsics.LJFF(this.carouselWidgetKeys, carouselElement.carouselWidgetKeys) && Intrinsics.LJFF(this.daInfo, carouselElement.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        String str = this.elementId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.elementType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.elementDisplayType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CarouselSparkInfo carouselSparkInfo = this.sparkInfo;
        int iHashCode4 = (iHashCode3 + (carouselSparkInfo == null ? 0 : carouselSparkInfo.hashCode())) * 31;
        Video video = this.video;
        int iHashCode5 = (iHashCode4 + (video == null ? 0 : video.hashCode())) * 31;
        VideoConfig videoConfig = this.videoConfig;
        int iHashCode6 = (iHashCode5 + (videoConfig == null ? 0 : videoConfig.hashCode())) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.salePropValueId;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuId;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CarouselWidgetKeys carouselWidgetKeys = this.carouselWidgetKeys;
        int iHashCode10 = (iHashCode9 + (carouselWidgetKeys == null ? 0 : carouselWidgetKeys.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselElement(elementId=" + this.elementId + ", elementType=" + this.elementType + ", elementDisplayType=" + this.elementDisplayType + ", sparkInfo=" + this.sparkInfo + ", video=" + this.video + ", videoConfig=" + this.videoConfig + ", image=" + this.image + ", salePropValueId=" + this.salePropValueId + ", skuId=" + this.skuId + ", carouselWidgetKeys=" + this.carouselWidgetKeys + ", daInfo=" + this.daInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.elementId);
        Integer num = this.elementType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.elementDisplayType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        CarouselSparkInfo carouselSparkInfo = this.sparkInfo;
        if (carouselSparkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carouselSparkInfo.writeToParcel(parcel, i);
        }
        Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i);
        }
        VideoConfig videoConfig = this.videoConfig;
        if (videoConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoConfig.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.salePropValueId);
        parcel.writeString(this.skuId);
        CarouselWidgetKeys carouselWidgetKeys = this.carouselWidgetKeys;
        if (carouselWidgetKeys == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carouselWidgetKeys.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public final boolean LIZ() {
        if (this.elementDisplayType == null) {
            return false;
        }
        int value = EnumC311500CIy.PDP_AND_GALLERY.getValue();
        Integer num = this.elementDisplayType;
        if (num == null || value != num.intValue()) {
            return false;
        }
        Integer num2 = this.elementType;
        int value2 = C0HAU.IMAGE.getValue();
        if (num2 == null || num2.intValue() != value2) {
            Integer num3 = this.elementType;
            int value3 = C0HAU.VIDEO.getValue();
            if (num3 == null || num3.intValue() != value3) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1338570kwB
    public final Image getVideoCover() {
        Image image;
        com.ss.android.ugc.aweme.feed.model.Video video;
        UrlModel cover;
        Image image2 = this.videoCover;
        if (image2 != null) {
            return image2;
        }
        VideoConfig videoConfig = this.videoConfig;
        if (videoConfig == null || (image = videoConfig.coverImage) == null) {
            Video video2 = this.video;
            if (video2 == null || (video = video2.LIZ().getVideo()) == null || (cover = video.getCover()) == null) {
                image = null;
            } else {
                image = new Image(Integer.valueOf(cover.getWidth()), Integer.valueOf(cover.getHeight()), "", cover.getUri(), cover.getUrlList(), cover.getUri(), cover.getUrlList(), null, null, null, null, null, null);
            }
        }
        this.videoCover = image;
        return image;
    }

    @Override // X.InterfaceC1338570kwB
    public final String getElementId() {
        return this.elementId;
    }

    @Override // X.InterfaceC1338570kwB
    public final Image getImage() {
        return this.image;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof CarouselElement) && Intrinsics.LJFF(this.elementId, ((CarouselElement) interfaceC1891350zJl).elementId)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof CarouselElement;
    }

    public CarouselElement(String str, Integer num, Integer num2, CarouselSparkInfo carouselSparkInfo, Video video, VideoConfig videoConfig, Image image, String str2, String str3, CarouselWidgetKeys carouselWidgetKeys, String str4) {
        this.elementId = str;
        this.elementType = num;
        this.elementDisplayType = num2;
        this.sparkInfo = carouselSparkInfo;
        this.video = video;
        this.videoConfig = videoConfig;
        this.image = image;
        this.salePropValueId = str2;
        this.skuId = str3;
        this.carouselWidgetKeys = carouselWidgetKeys;
        this.daInfo = str4;
    }
}
