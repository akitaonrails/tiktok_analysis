package com.ss.android.ugc.aweme.ecommerce.service.vo;

import X.C03IT;
import X.C09CT;
import X.C13LP;
import X.C1763220vz6;
import X.C418440Gaw;
import X.C814420VxA;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class Image implements Parcelable, Serializable {

    @C09CT("height")
    public Integer height;

    @C09CT("_image_scene")
    public String localImageScene;

    @C09CT("_thumb_image_scene")
    public String localThumbImageScene;

    @C09CT("mimetype")
    public String mimetype;

    @C09CT("remove_gap")
    public String removeGap;

    @C09CT("source_type")
    public Integer sourceType;

    @C09CT("thumb_uri")
    public String thumbUri;

    @C09CT("thumb_url_list")
    public List<String> thumbUrls;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urls;

    @C09CT("view_height")
    public Integer viewHeight;

    @C09CT("view_width")
    public Integer viewWidth;

    @C09CT("width")
    public Integer width;
    public static final C1763220vz6 Companion = new Object() { // from class: X.0vz6
    };
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: X.0HXQ
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5 = null;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new Image(numValueOf, numValueOf2, string, string2, arrayListCreateStringArrayList, string3, arrayListCreateStringArrayList2, string4, string5, string6, numValueOf3, numValueOf4, numValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i) {
            return new Image[i];
        }
    };

    public Image() {
    }

    public final Image copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2, String str4, String str5, String str6, Integer num3, Integer num4, Integer num5) {
        return new Image(num, num2, str, str2, list, str3, list2, str4, str5, str6, num3, num4, num5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return Intrinsics.LJFF(this.width, image.width) && Intrinsics.LJFF(this.height, image.height) && Intrinsics.LJFF(this.mimetype, image.mimetype) && Intrinsics.LJFF(this.uri, image.uri) && Intrinsics.LJFF(this.urls, image.urls) && Intrinsics.LJFF(this.thumbUri, image.thumbUri) && Intrinsics.LJFF(this.thumbUrls, image.thumbUrls) && Intrinsics.LJFF(this.removeGap, image.removeGap) && Intrinsics.LJFF(this.localImageScene, image.localImageScene) && Intrinsics.LJFF(this.localThumbImageScene, image.localThumbImageScene) && Intrinsics.LJFF(this.sourceType, image.sourceType) && Intrinsics.LJFF(this.viewHeight, image.viewHeight) && Intrinsics.LJFF(this.viewWidth, image.viewWidth);
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.mimetype;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.urls;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.thumbUri;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.thumbUrls;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.removeGap;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.localImageScene;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.localThumbImageScene;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.sourceType;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewHeight;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.viewWidth;
        return iHashCode12 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "Image(width=" + this.width + ", height=" + this.height + ", mimetype=" + this.mimetype + ", uri=" + this.uri + ", urls=" + this.urls + ", thumbUri=" + this.thumbUri + ", thumbUrls=" + this.thumbUrls + ", removeGap=" + this.removeGap + ", localImageScene=" + this.localImageScene + ", localThumbImageScene=" + this.localThumbImageScene + ", sourceType=" + this.sourceType + ", viewHeight=" + this.viewHeight + ", viewWidth=" + this.viewWidth + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.mimetype);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.thumbUri);
        parcel.writeStringList(this.thumbUrls);
        parcel.writeString(this.removeGap);
        parcel.writeString(this.localImageScene);
        parcel.writeString(this.localThumbImageScene);
        Integer num3 = this.sourceType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.viewHeight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.viewWidth;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public final String getHost() {
        String str;
        List<String> list = this.urls;
        if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return URI.create(str).getHost();
    }

    public final float getRadio() {
        Integer num = this.width;
        Integer num2 = this.height;
        int iIntValue = 1;
        int iIntValue2 = (num == null || num.intValue() == 0) ? 1 : num.intValue();
        if (num2 != null && num2.intValue() != 0) {
            iIntValue = num2.intValue();
        }
        return iIntValue2 / iIntValue;
    }

    public final String getSuffix() {
        String str;
        String str2;
        List<String> list = this.urls;
        if (list == null || (str = (String) C13LP.LJJJLL(list)) == null || (str2 = this.uri) == null || str2.length() <= 0) {
            return null;
        }
        return (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL(str, new String[]{str2}, 0, 6));
    }

    public final C03IT toImageUrlModel() {
        return new C03IT(this.urls);
    }

    public final C03IT toThumbFirstImageUrlModel() {
        List<String> list = this.thumbUrls;
        return (list == null || list.isEmpty()) ? toImageUrlModel() : new C03IT(this.thumbUrls);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getLocalImageScene() {
        return this.localImageScene;
    }

    public final String getLocalThumbImageScene() {
        return this.localThumbImageScene;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final String getRemoveGap() {
        return this.removeGap;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    public final List<String> getThumbUrls() {
        return this.thumbUrls;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final Integer getViewHeight() {
        return this.viewHeight;
    }

    public final Integer getViewWidth() {
        return this.viewWidth;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final Integer getWidth(float f) {
        Integer num = this.width;
        if (num != null && num.intValue() > 0) {
            int iIntValue = num.intValue();
            Integer num2 = this.height;
            if (num2 != null && num2.intValue() > 0) {
                return Integer.valueOf(C814420VxA.LIZIZ((C418440Gaw.LIZIZ(Float.valueOf(f)) * iIntValue) / num2.intValue()));
            }
        }
        return null;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setLocalImageScene(String str) {
        this.localImageScene = str;
    }

    public final void setLocalThumbImageScene(String str) {
        this.localThumbImageScene = str;
    }

    public final void setRemoveGap(String str) {
        this.removeGap = str;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }

    public final void setThumbUrls(List<String> list) {
        this.thumbUrls = list;
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }

    public final void setViewHeight(Integer num) {
        this.viewHeight = num;
    }

    public final void setViewWidth(Integer num) {
        this.viewWidth = num;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public Image(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2, String str4, String str5, String str6, Integer num3, Integer num4, Integer num5) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
        this.removeGap = str4;
        this.localImageScene = str5;
        this.localThumbImageScene = str6;
        this.sourceType = num3;
        this.viewHeight = num4;
        this.viewWidth = num5;
    }
}
