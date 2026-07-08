package com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem;

import X.C13BV;
import X.C1845270y7R;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface TakoContentPreviewItem extends Parcelable {
    String Ic();

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Video implements TakoContentPreviewItem {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() { // from class: X.0yPn
            @Override // android.os.Parcelable.Creator
            public final TakoContentPreviewItem.Video createFromParcel(Parcel parcel) {
                return new TakoContentPreviewItem.Video((C1845270y7R) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TakoContentPreviewItem.Video[] newArray(int i) {
                return new TakoContentPreviewItem.Video[i];
            }
        };
        public final String itemUUID;
        public final C1845270y7R video;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return Intrinsics.LJFF(this.video, video.video) && Intrinsics.LJFF(this.itemUUID, video.itemUUID);
        }

        public final int hashCode() {
            return (this.video.hashCode() * 31) + this.itemUUID.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Video(video=");
            sbLIZ.append(this.video);
            sbLIZ.append(", itemUUID=");
            sbLIZ.append(this.itemUUID);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.video);
            parcel.writeString(this.itemUUID);
        }

        @Override // com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem
        public final String Ic() {
            return this.itemUUID;
        }

        public Video(C1845270y7R c1845270y7R, String str) {
            this.video = c1845270y7R;
            this.itemUUID = str;
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public static final class Image implements TakoContentPreviewItem {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: X.0tpv
            @Override // android.os.Parcelable.Creator
            public final TakoContentPreviewItem.Image createFromParcel(Parcel parcel) {
                return new TakoContentPreviewItem.Image(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final TakoContentPreviewItem.Image[] newArray(int i) {
                return new TakoContentPreviewItem.Image[i];
            }
        };
        public final int imageHeight;
        public final List<String> imageUrls;
        public final int imageWidth;
        public final String itemUUID;

        public Image() {
            this(0, 0, (List) null, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.LJFF(this.imageUrls, image.imageUrls) && this.imageWidth == image.imageWidth && this.imageHeight == image.imageHeight && Intrinsics.LJFF(this.itemUUID, image.itemUUID);
        }

        public final int hashCode() {
            return (((((this.imageUrls.hashCode() * 31) + this.imageWidth) * 31) + this.imageHeight) * 31) + this.itemUUID.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Image(imageUrls=");
            sbLIZ.append(this.imageUrls);
            sbLIZ.append(", imageWidth=");
            sbLIZ.append(this.imageWidth);
            sbLIZ.append(", imageHeight=");
            sbLIZ.append(this.imageHeight);
            sbLIZ.append(", itemUUID=");
            sbLIZ.append(this.itemUUID);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.imageUrls);
            parcel.writeInt(this.imageWidth);
            parcel.writeInt(this.imageHeight);
            parcel.writeString(this.itemUUID);
        }

        @Override // com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem
        public final String Ic() {
            return this.itemUUID;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Image(int i, int i2, List list, int i3) {
            String str;
            list = (i3 & 1) != 0 ? C13BV.INSTANCE : list;
            i = (i3 & 2) != 0 ? 0 : i;
            i2 = (i3 & 4) != 0 ? 0 : i2;
            if ((i3 & 8) != 0) {
                str = "";
            } else {
                str = null;
            }
            this(i, i2, str, list);
        }

        public Image(int i, int i2, String str, List list) {
            this.imageUrls = list;
            this.imageWidth = i;
            this.imageHeight = i2;
            this.itemUUID = str;
        }
    }
}
