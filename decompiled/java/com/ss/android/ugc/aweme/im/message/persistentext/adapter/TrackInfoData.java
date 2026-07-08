package com.ss.android.ugc.aweme.im.message.persistentext.adapter;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.MentionMessageExtra;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TrackInfoData implements Parcelable {
    public static final Parcelable.Creator<TrackInfoData> CREATOR = new Parcelable.Creator<TrackInfoData>() { // from class: X.0Z4D
        @Override // android.os.Parcelable.Creator
        public final TrackInfoData createFromParcel(Parcel parcel) {
            return new TrackInfoData(MentionMessageExtra.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackInfoData[] newArray(int i) {
            return new TrackInfoData[i];
        }
    };
    public final String aggregationMessageType;
    public final MentionMessageExtra mentionMsgExtra;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackInfoData)) {
            return false;
        }
        TrackInfoData trackInfoData = (TrackInfoData) obj;
        return Intrinsics.LJFF(this.mentionMsgExtra, trackInfoData.mentionMsgExtra) && Intrinsics.LJFF(this.aggregationMessageType, trackInfoData.aggregationMessageType);
    }

    public final int hashCode() {
        int iHashCode = this.mentionMsgExtra.hashCode() * 31;
        String str = this.aggregationMessageType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackInfoData(mentionMsgExtra=");
        sbLIZ.append(this.mentionMsgExtra);
        sbLIZ.append(", aggregationMessageType=");
        sbLIZ.append(this.aggregationMessageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.mentionMsgExtra.writeToParcel(parcel, i);
        parcel.writeString(this.aggregationMessageType);
    }

    public TrackInfoData(MentionMessageExtra mentionMessageExtra, String str) {
        this.mentionMsgExtra = mentionMessageExtra;
        this.aggregationMessageType = str;
    }
}
