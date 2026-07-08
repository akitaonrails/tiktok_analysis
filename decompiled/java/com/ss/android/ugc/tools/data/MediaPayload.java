package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tools.data.ImageItem;
import com.ss.android.ugc.tools.data.MediaPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class MediaPayload implements Parcelable {

    public static final class ImageCollection extends MediaPayload {
        public static final Parcelable.Creator<ImageCollection> CREATOR = new Parcelable.Creator<ImageCollection>() { // from class: X.0lQS
            @Override // android.os.Parcelable.Creator
            public final MediaPayload.ImageCollection createFromParcel(Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ImageItem.CREATOR.createFromParcel(parcel));
                }
                return new MediaPayload.ImageCollection(arrayList, (Aweme) parcel.readSerializable(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MediaPayload.ImageCollection[] newArray(int i) {
                return new MediaPayload.ImageCollection[i];
            }
        };
        public final int coverIndex;
        public final String id;
        public final Aweme imageAweme;
        public final List<ImageItem> images;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageCollection)) {
                return false;
            }
            ImageCollection imageCollection = (ImageCollection) obj;
            return Intrinsics.LJFF(this.images, imageCollection.images) && Intrinsics.LJFF(this.imageAweme, imageCollection.imageAweme) && this.coverIndex == imageCollection.coverIndex && Intrinsics.LJFF(this.id, imageCollection.id);
        }

        public final int hashCode() {
            int iHashCode = this.images.hashCode() * 31;
            Aweme aweme = this.imageAweme;
            return ((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + this.coverIndex) * 31) + this.id.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<ImageItem> list = this.images;
            parcel.writeInt(list.size());
            Iterator<ImageItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            parcel.writeSerializable(this.imageAweme);
            parcel.writeInt(this.coverIndex);
            parcel.writeString(this.id);
        }

        public final String toString() {
            String strLIZIZ = "ImageCollection: ";
            for (ImageItem imageItem : this.images) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(imageItem);
                sbLIZ.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            return strLIZIZ;
        }

        public ImageCollection(List<ImageItem> list, Aweme aweme, int i, String str) {
            this.images = list;
            this.imageAweme = aweme;
            this.coverIndex = i;
            this.id = str;
        }
    }

    public static final class Image extends MediaPayload {
        public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: X.0lXl
            @Override // android.os.Parcelable.Creator
            public final MediaPayload.Image createFromParcel(Parcel parcel) {
                return new MediaPayload.Image(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MediaPayload.Image[] newArray(int i) {
                return new MediaPayload.Image[i];
            }
        };
        public final int height;
        public final String id;
        public final String path;
        public final int width;

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
            return Intrinsics.LJFF(this.path, image.path) && this.width == image.width && this.height == image.height && Intrinsics.LJFF(this.id, image.id);
        }

        public final int hashCode() {
            return (((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.id.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.path);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeString(this.id);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Image: path = ");
            sbLIZ.append(this.path);
            sbLIZ.append("; width = ");
            sbLIZ.append(this.width);
            sbLIZ.append("; height = ");
            sbLIZ.append(this.height);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Image(String str, int i, int i2, String str2) {
            this.path = str;
            this.width = i;
            this.height = i2;
            this.id = str2;
        }
    }

    public static final class VideoCover extends MediaPayload {
        public static final Parcelable.Creator<VideoCover> CREATOR = new Parcelable.Creator<VideoCover>() { // from class: X.0lQW
            @Override // android.os.Parcelable.Creator
            public final MediaPayload.VideoCover createFromParcel(Parcel parcel) {
                return new MediaPayload.VideoCover((Aweme) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MediaPayload.VideoCover[] newArray(int i) {
                return new MediaPayload.VideoCover[i];
            }
        };
        public final int coverHeight;
        public final String coverUrl;
        public final int coverWidth;
        public final String id;
        public final Aweme videoAweme;
        public final long videoDuration;
        public final int videoHeight;
        public final String videoLocalPath;
        public final String videoUrl;
        public final int videoWidth;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoCover)) {
                return false;
            }
            VideoCover videoCover = (VideoCover) obj;
            return Intrinsics.LJFF(this.videoAweme, videoCover.videoAweme) && Intrinsics.LJFF(this.coverUrl, videoCover.coverUrl) && this.coverWidth == videoCover.coverWidth && this.coverHeight == videoCover.coverHeight && Intrinsics.LJFF(this.videoUrl, videoCover.videoUrl) && Intrinsics.LJFF(this.videoLocalPath, videoCover.videoLocalPath) && this.videoDuration == videoCover.videoDuration && this.videoWidth == videoCover.videoWidth && this.videoHeight == videoCover.videoHeight && Intrinsics.LJFF(this.id, videoCover.id);
        }

        public final int hashCode() {
            Aweme aweme = this.videoAweme;
            int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
            String str = this.coverUrl;
            return ((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.coverWidth) * 31) + this.coverHeight) * 31) + this.videoUrl.hashCode()) * 31) + this.videoLocalPath.hashCode()) * 31) + C786410Ut5.Y2(this.videoDuration)) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31) + this.id.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.videoAweme);
            parcel.writeString(this.coverUrl);
            parcel.writeInt(this.coverWidth);
            parcel.writeInt(this.coverHeight);
            parcel.writeString(this.videoUrl);
            parcel.writeString(this.videoLocalPath);
            parcel.writeLong(this.videoDuration);
            parcel.writeInt(this.videoWidth);
            parcel.writeInt(this.videoHeight);
            parcel.writeString(this.id);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoCover: videoAweme is null: ");
            sbLIZ.append(this.videoAweme == null);
            sbLIZ.append("; coverUrl = ");
            sbLIZ.append(this.coverUrl);
            sbLIZ.append("; coverWidth = ");
            sbLIZ.append(this.coverWidth);
            sbLIZ.append("; coverHeight = ");
            sbLIZ.append(this.coverHeight);
            sbLIZ.append("videoUrl = ");
            sbLIZ.append(this.videoUrl);
            sbLIZ.append("; videoLocalPath = ");
            sbLIZ.append(this.videoLocalPath);
            sbLIZ.append("; videoDuration = ");
            sbLIZ.append(this.videoDuration);
            sbLIZ.append("; videoWidth = ");
            sbLIZ.append(this.videoWidth);
            sbLIZ.append("; videoHeight = ");
            sbLIZ.append(this.videoHeight);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public VideoCover(Aweme aweme, String str, int i, int i2, String str2, String str3, long j, int i3, int i4, String str4) {
            this.videoAweme = aweme;
            this.coverUrl = str;
            this.coverWidth = i;
            this.coverHeight = i2;
            this.videoUrl = str2;
            this.videoLocalPath = str3;
            this.videoDuration = j;
            this.videoWidth = i3;
            this.videoHeight = i4;
            this.id = str4;
        }
    }
}
