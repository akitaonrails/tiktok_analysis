package com.ss.android.ugc.aweme.tools.sticker.core.info;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.info.ImageStickerModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageStickerModel implements Parcelable {

    @C09CT("cutout")
    public final boolean cutout;

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("height")
    public final float height;

    @C09CT("width")
    public final float width;
    public static final Parcelable.Creator<ImageStickerModel> CREATOR = new Parcelable.Creator<ImageStickerModel>() { // from class: X.0EKR
        @Override // android.os.Parcelable.Creator
        public final ImageStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            LinkedHashMap linkedHashMap;
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new ImageStickerModel(f, f2, z, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerModel[] newArray(int i) {
            return new ImageStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public ImageStickerModel() {
        this(0.0f, 0.0f, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStickerModel)) {
            return false;
        }
        ImageStickerModel imageStickerModel = (ImageStickerModel) obj;
        return Float.compare(this.width, imageStickerModel.width) == 0 && Float.compare(this.height, imageStickerModel.height) == 0 && this.cutout == imageStickerModel.cutout && Intrinsics.LJFF(this.extra, imageStickerModel.extra);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageStickerModel(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", cutout=");
        sbLIZ.append(this.cutout);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
        parcel.writeInt(this.cutout ? 1 : 0);
        Map<String, String> map = this.extra;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height)) * 31) + C786410Ut5.Z2(this.cutout)) * 31;
        Map<String, String> map = this.extra;
        return iFloatToIntBits + (map == null ? 0 : map.hashCode());
    }

    public ImageStickerModel(float f, float f2, boolean z, Map<String, String> map) {
        this.width = f;
        this.height = f2;
        this.cutout = z;
        this.extra = map;
    }
}
