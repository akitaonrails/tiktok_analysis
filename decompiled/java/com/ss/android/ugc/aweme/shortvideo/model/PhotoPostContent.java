package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class PhotoPostContent implements Parcelable {
    public static final Parcelable.Creator<PhotoPostContent> CREATOR = new Creator();

    @C09CT("dynamic_images")
    public final List<ImagePostData> dynamicImages;

    @C09CT("cover")
    public final ImagePostData imageCover;

    @C09CT("images")
    public final List<ImagePostData> images;

    @C09CT("music_volume")
    public final float musicVolume;

    @C09CT("title")
    public final String title;

    public static final class Creator implements Parcelable.Creator<PhotoPostContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoPostContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(ImagePostData.CREATOR.createFromParcel(parcel));
            }
            ImagePostData imagePostDataCreateFromParcel = ImagePostData.CREATOR.createFromParcel(parcel);
            float f = parcel.readFloat();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ImagePostData.CREATOR.createFromParcel(parcel));
                }
            }
            return new PhotoPostContent(arrayList2, imagePostDataCreateFromParcel, f, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoPostContent[] newArray(int i) {
            return new PhotoPostContent[i];
        }
    }

    public final PhotoPostContent copy(List<ImagePostData> list, ImagePostData imagePostData, float f, String str, List<ImagePostData> list2) {
        return new PhotoPostContent(list, imagePostData, f, str, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoPostContent)) {
            return false;
        }
        PhotoPostContent photoPostContent = (PhotoPostContent) obj;
        return Intrinsics.LJFF(this.images, photoPostContent.images) && Intrinsics.LJFF(this.imageCover, photoPostContent.imageCover) && Float.compare(this.musicVolume, photoPostContent.musicVolume) == 0 && Intrinsics.LJFF(this.title, photoPostContent.title) && Intrinsics.LJFF(this.dynamicImages, photoPostContent.dynamicImages);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoPostContent(images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", imageCover=");
        sbLIZ.append(this.imageCover);
        sbLIZ.append(", musicVolume=");
        sbLIZ.append(this.musicVolume);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", dynamicImages=");
        sbLIZ.append(this.dynamicImages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ImagePostData> list = this.images;
        parcel.writeInt(list.size());
        Iterator<ImagePostData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.imageCover.writeToParcel(parcel, i);
        parcel.writeFloat(this.musicVolume);
        parcel.writeString(this.title);
        List<ImagePostData> list2 = this.dynamicImages;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<ImagePostData> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.images.hashCode() * 31) + this.imageCover.hashCode()) * 31) + Float.floatToIntBits(this.musicVolume)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ImagePostData> list = this.dynamicImages;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final List<ImagePostData> getDynamicImages() {
        return this.dynamicImages;
    }

    public final ImagePostData getImageCover() {
        return this.imageCover;
    }

    public final List<ImagePostData> getImages() {
        return this.images;
    }

    public final float getMusicVolume() {
        return this.musicVolume;
    }

    public final String getTitle() {
        return this.title;
    }

    public PhotoPostContent(List<ImagePostData> list, ImagePostData imagePostData, float f, String str, List<ImagePostData> list2) {
        this.images = list;
        this.imageCover = imagePostData;
        this.musicVolume = f;
        this.title = str;
        this.dynamicImages = list2;
    }
}
