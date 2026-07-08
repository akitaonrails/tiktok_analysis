package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ReplySourcePayloadData implements Parcelable {
    public static final Parcelable.Creator<ReplySourcePayloadData> CREATOR = new Parcelable.Creator<ReplySourcePayloadData>() { // from class: X.0Zfs
        @Override // android.os.Parcelable.Creator
        public final ReplySourcePayloadData createFromParcel(Parcel parcel) {
            return new ReplySourcePayloadData(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReplySourcePayloadData[] newArray(int i) {
            return new ReplySourcePayloadData[i];
        }
    };
    public final String clientMessageIdForReply;
    public final long replySourceMsgId;
    public final String replySourceUniqueId;

    public ReplySourcePayloadData() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplySourcePayloadData)) {
            return false;
        }
        ReplySourcePayloadData replySourcePayloadData = (ReplySourcePayloadData) obj;
        return this.replySourceMsgId == replySourcePayloadData.replySourceMsgId && Intrinsics.LJFF(this.replySourceUniqueId, replySourcePayloadData.replySourceUniqueId) && Intrinsics.LJFF(this.clientMessageIdForReply, replySourcePayloadData.clientMessageIdForReply);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.replySourceMsgId) * 31) + this.replySourceUniqueId.hashCode()) * 31) + this.clientMessageIdForReply.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplySourcePayloadData(replySourceMsgId=");
        sbLIZ.append(this.replySourceMsgId);
        sbLIZ.append(", replySourceUniqueId=");
        sbLIZ.append(this.replySourceUniqueId);
        sbLIZ.append(", clientMessageIdForReply=");
        sbLIZ.append(this.clientMessageIdForReply);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.replySourceMsgId);
        parcel.writeString(this.replySourceUniqueId);
        parcel.writeString(this.clientMessageIdForReply);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReplySourcePayloadData(String str, int i) {
        String str2;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(0L, str2, (i & 4) != 0 ? "" : str);
    }

    public ReplySourcePayloadData(long j, String str, String str2) {
        this.replySourceMsgId = j;
        this.replySourceUniqueId = str;
        this.clientMessageIdForReply = str2;
    }
}
