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
public final class PhotoEditContent implements Parcelable {
    public static final Parcelable.Creator<PhotoEditContent> CREATOR = new Creator();

    @C09CT("edit_image_index")
    public final List<Integer> editImageIndex;

    @C09CT("images")
    public final List<ImagePostData> images;

    @C09CT("image_sticker_text")
    public final String stickerText;

    public static final class Creator implements Parcelable.Creator<PhotoEditContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoEditContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ImagePostData.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new PhotoEditContent(arrayList, string, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoEditContent[] newArray(int i) {
            return new PhotoEditContent[i];
        }
    }

    public final PhotoEditContent copy(List<ImagePostData> list, String str, List<Integer> list2) {
        return new PhotoEditContent(list, str, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoEditContent)) {
            return false;
        }
        PhotoEditContent photoEditContent = (PhotoEditContent) obj;
        return Intrinsics.LJFF(this.images, photoEditContent.images) && Intrinsics.LJFF(this.stickerText, photoEditContent.stickerText) && Intrinsics.LJFF(this.editImageIndex, photoEditContent.editImageIndex);
    }

    public int hashCode() {
        List<ImagePostData> list = this.images;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.stickerText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list2 = this.editImageIndex;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoEditContent(images=");
        sbLIZ.append(this.images);
        sbLIZ.append(", stickerText=");
        sbLIZ.append(this.stickerText);
        sbLIZ.append(", editImageIndex=");
        sbLIZ.append(this.editImageIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ImagePostData> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ImagePostData> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.stickerText);
        List<Integer> list2 = this.editImageIndex;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Integer> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(it3.next().intValue());
        }
    }

    public final List<Integer> getEditImageIndex() {
        return this.editImageIndex;
    }

    public final List<ImagePostData> getImages() {
        return this.images;
    }

    public final String getStickerText() {
        return this.stickerText;
    }

    public PhotoEditContent(List<ImagePostData> list, String str, List<Integer> list2) {
        this.images = list;
        this.stickerText = str;
        this.editImageIndex = list2;
    }
}
