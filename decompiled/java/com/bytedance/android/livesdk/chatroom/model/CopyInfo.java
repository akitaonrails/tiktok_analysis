package com.bytedance.android.livesdk.chatroom.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.chatroom.model.CopyInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyInfo implements Parcelable {
    public static final Parcelable.Creator<CopyInfo> CREATOR = new Parcelable.Creator<CopyInfo>() { // from class: X.0f6s
        @Override // android.os.Parcelable.Creator
        public final CopyInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CopyInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final CopyInfo[] newArray(int i) {
            return new CopyInfo[i];
        }
    };
    public String content = "";
    public List<? extends EmoteWithIndex> emoteModelList = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
