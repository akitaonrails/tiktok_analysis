package com.ss.android.ugc.aweme.im.chatlist.api;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC871430YGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPageNavParams implements Parcelable {
    public static final Parcelable.Creator<MessageRequestPageNavParams> CREATOR = new Parcelable.Creator<MessageRequestPageNavParams>() { // from class: X.0Ys8
        @Override // android.os.Parcelable.Creator
        public final MessageRequestPageNavParams createFromParcel(Parcel parcel) {
            EnumC871430YGn enumC871430YGnValueOf;
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                enumC871430YGnValueOf = null;
            } else {
                enumC871430YGnValueOf = EnumC871430YGn.valueOf(parcel.readString());
            }
            return new MessageRequestPageNavParams(j, string, enumC871430YGnValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessageRequestPageNavParams[] newArray(int i) {
            return new MessageRequestPageNavParams[i];
        }
    };
    public final long clickStartTime;
    public final String enterFrom;
    public final EnumC871430YGn requestType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageRequestPageNavParams)) {
            return false;
        }
        MessageRequestPageNavParams messageRequestPageNavParams = (MessageRequestPageNavParams) obj;
        return this.clickStartTime == messageRequestPageNavParams.clickStartTime && Intrinsics.LJFF(this.enterFrom, messageRequestPageNavParams.enterFrom) && this.requestType == messageRequestPageNavParams.requestType;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.clickStartTime) * 31) + this.enterFrom.hashCode()) * 31;
        EnumC871430YGn enumC871430YGn = this.requestType;
        return iY2 + (enumC871430YGn == null ? 0 : enumC871430YGn.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestPageNavParams(clickStartTime=");
        sbLIZ.append(this.clickStartTime);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.requestType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.clickStartTime);
        parcel.writeString(this.enterFrom);
        EnumC871430YGn enumC871430YGn = this.requestType;
        if (enumC871430YGn == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC871430YGn.name());
        }
    }

    public MessageRequestPageNavParams(long j, String str, EnumC871430YGn enumC871430YGn) {
        this.clickStartTime = j;
        this.enterFrom = str;
        this.requestType = enumC871430YGn;
    }
}
