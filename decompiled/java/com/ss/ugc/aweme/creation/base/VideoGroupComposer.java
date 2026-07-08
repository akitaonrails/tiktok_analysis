package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.VideoGroupComposer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class VideoGroupComposer implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoGroupComposer> CREATOR = new Parcelable.Creator<VideoGroupComposer>() { // from class: X.0MT1
        @Override // android.os.Parcelable.Creator
        public final VideoGroupComposer createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(VideoGroupComposer.class.getClassLoader()));
                i--;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new VideoGroupComposer(arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGroupComposer[] newArray(int i) {
            return new VideoGroupComposer[i];
        }
    };

    @C09CT("add_canvas_info")
    public Boolean addCanvasInfo;

    @C09CT("videos")
    public List<ImportItemModel> videos;

    public VideoGroupComposer() {
        this(new ArrayList(), null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        List<ImportItemModel> list = this.videos;
        parcel.writeInt(list.size());
        Iterator<ImportItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        Boolean bool = this.addCanvasInfo;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
    }

    public final Boolean getAddCanvasInfo() {
        return this.addCanvasInfo;
    }

    public final List<ImportItemModel> getVideos() {
        return this.videos;
    }

    public final void setAddCanvasInfo(Boolean bool) {
        this.addCanvasInfo = bool;
    }

    public final void setVideos(List<ImportItemModel> list) {
        this.videos = list;
    }

    public VideoGroupComposer(List<ImportItemModel> list, Boolean bool) {
        this.videos = list;
        this.addCanvasInfo = bool;
    }
}
