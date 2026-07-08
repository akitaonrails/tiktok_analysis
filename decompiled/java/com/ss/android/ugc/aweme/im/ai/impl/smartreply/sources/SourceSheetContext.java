package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SourceSheetContext implements Parcelable {
    public static final Parcelable.Creator<SourceSheetContext> CREATOR = new Parcelable.Creator<SourceSheetContext>() { // from class: X.0wSs
        @Override // android.os.Parcelable.Creator
        public final SourceSheetContext createFromParcel(Parcel parcel) {
            return new SourceSheetContext(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SourceSheetContext[] newArray(int i) {
            return new SourceSheetContext[i];
        }
    };
    public final String chatType;
    public final String conversationId;
    public final String enterFrom;
    public final String isSelf;
    public final String msgId;
    public final String replyMessageId;
    public final String toUserId;

    public SourceSheetContext() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceSheetContext)) {
            return false;
        }
        SourceSheetContext sourceSheetContext = (SourceSheetContext) obj;
        return Intrinsics.LJFF(this.conversationId, sourceSheetContext.conversationId) && Intrinsics.LJFF(this.msgId, sourceSheetContext.msgId) && Intrinsics.LJFF(this.enterFrom, sourceSheetContext.enterFrom) && Intrinsics.LJFF(this.chatType, sourceSheetContext.chatType) && Intrinsics.LJFF(this.isSelf, sourceSheetContext.isSelf) && Intrinsics.LJFF(this.replyMessageId, sourceSheetContext.replyMessageId) && Intrinsics.LJFF(this.toUserId, sourceSheetContext.toUserId);
    }

    public final int hashCode() {
        String str = this.conversationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msgId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterFrom;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chatType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isSelf;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.replyMessageId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.toUserId;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceSheetContext(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.chatType);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.isSelf);
        sbLIZ.append(", replyMessageId=");
        sbLIZ.append(this.replyMessageId);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.toUserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conversationId);
        parcel.writeString(this.msgId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.chatType);
        parcel.writeString(this.isSelf);
        parcel.writeString(this.replyMessageId);
        parcel.writeString(this.toUserId);
    }

    public SourceSheetContext(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.conversationId = str;
        this.msgId = str2;
        this.enterFrom = str3;
        this.chatType = str4;
        this.isSelf = str5;
        this.replyMessageId = str6;
        this.toUserId = str7;
    }
}
