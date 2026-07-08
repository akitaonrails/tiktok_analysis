package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class ImagePublishModel implements Parcelable {
    public static final Parcelable.Creator<ImagePublishModel> CREATOR = new Parcelable.Creator<ImagePublishModel>() { // from class: X.0XkD
        @Override // android.os.Parcelable.Creator
        public final ImagePublishModel createFromParcel(Parcel parcel) {
            boolean z;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            boolean z2 = true;
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
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new ImagePublishModel(string, linkedHashMap, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ImagePublishModel[] newArray(int i) {
            return new ImagePublishModel[i];
        }
    };

    @C040H
    public String heading;

    @C040H
    public boolean isCanvasVideoRemoved;

    @C040H
    public Map<String, String> reasonToPostAsVideo;

    @C040H
    public boolean singlePhotoDirectPublish;

    public ImagePublishModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.heading);
        parcel.writeInt(this.singlePhotoDirectPublish ? 1 : 0);
        Map<String, String> map = this.reasonToPostAsVideo;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeInt(this.isCanvasVideoRemoved ? 1 : 0);
    }

    public /* synthetic */ ImagePublishModel(int i) {
        this(null, null, false, false);
    }

    public ImagePublishModel(String str, Map map, boolean z, boolean z2) {
        this.heading = str;
        this.singlePhotoDirectPublish = z;
        this.reasonToPostAsVideo = map;
        this.isCanvasVideoRemoved = z2;
    }
}
