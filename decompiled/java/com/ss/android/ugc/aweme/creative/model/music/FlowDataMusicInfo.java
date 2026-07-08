package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class FlowDataMusicInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FlowDataMusicInfo> CREATOR = new Parcelable.Creator<FlowDataMusicInfo>() { // from class: X.0nWE
        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FlowDataMusicInfo(z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo[] newArray(int i) {
            return new FlowDataMusicInfo[i];
        }
    };

    @C09CT("is_selected_by_auto")
    public boolean isSelectedByAuto;

    @C09CT("position")
    public int position;

    public FlowDataMusicInfo() {
        this(false, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSelectedByAuto ? 1 : 0);
        parcel.writeInt(this.position);
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean isSelectedByAuto() {
        return this.isSelectedByAuto;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setSelectedByAuto(boolean z) {
        this.isSelectedByAuto = z;
    }

    public FlowDataMusicInfo(boolean z, int i) {
        this.isSelectedByAuto = z;
        this.position = i;
    }
}
