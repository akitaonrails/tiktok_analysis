package com.bytedance.android.livesdk.chatroom.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class ReplyInfo implements Parcelable {
    public static final Parcelable.Creator<ReplyInfo> CREATOR = new Parcelable.Creator<ReplyInfo>() { // from class: X.0f6t
        @Override // android.os.Parcelable.Creator
        public final ReplyInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ReplyInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final ReplyInfo[] newArray(int i) {
            return new ReplyInfo[i];
        }
    };
    public long msgId;
    public long releaseId;
    public boolean replyIsAnchorMarked;
    public long replyToId;
    public String replyUserName = "";
    public String replyUserSecId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
