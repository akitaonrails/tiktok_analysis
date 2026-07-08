package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisLinkMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkParseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisLinkParseResponse implements Parcelable {

    @C09CT("minis_link_meta")
    public final MinisLinkMeta minisLinkMeta;

    @C09CT("minis_meta")
    public final MinisMeta minisMeta;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<TiktokMinisLinkParseResponse> CREATOR = new Parcelable.Creator<TiktokMinisLinkParseResponse>() { // from class: X.0iHr
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisLinkParseResponse createFromParcel(Parcel parcel) {
            MinisMeta minisMetaCreateFromParcel;
            MinisLinkMeta minisLinkMetaCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                minisMetaCreateFromParcel = null;
            } else {
                minisMetaCreateFromParcel = MinisMeta.CREATOR.createFromParcel(parcel);
            }
            MinisMeta minisMeta = minisMetaCreateFromParcel;
            if (parcel.readInt() == 0) {
                minisLinkMetaCreateFromParcel = null;
            } else {
                minisLinkMetaCreateFromParcel = MinisLinkMeta.CREATOR.createFromParcel(parcel);
            }
            MinisLinkMeta minisLinkMeta = minisLinkMetaCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisLinkParseResponse(minisMeta, minisLinkMeta, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisLinkParseResponse[] newArray(int i) {
            return new TiktokMinisLinkParseResponse[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisLinkParseResponse)) {
            return false;
        }
        TiktokMinisLinkParseResponse tiktokMinisLinkParseResponse = (TiktokMinisLinkParseResponse) obj;
        return Intrinsics.LJFF(this.minisMeta, tiktokMinisLinkParseResponse.minisMeta) && Intrinsics.LJFF(this.minisLinkMeta, tiktokMinisLinkParseResponse.minisLinkMeta) && Intrinsics.LJFF(this.statusCode, tiktokMinisLinkParseResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisLinkParseResponse.statusMsg);
    }

    public final int hashCode() {
        MinisMeta minisMeta = this.minisMeta;
        int iHashCode = (minisMeta == null ? 0 : minisMeta.hashCode()) * 31;
        MinisLinkMeta minisLinkMeta = this.minisLinkMeta;
        int iHashCode2 = (iHashCode + (minisLinkMeta == null ? 0 : minisLinkMeta.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisLinkParseResponse(minisMeta=");
        sbLIZ.append(this.minisMeta);
        sbLIZ.append(", minisLinkMeta=");
        sbLIZ.append(this.minisLinkMeta);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MinisMeta minisMeta = this.minisMeta;
        if (minisMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minisMeta.writeToParcel(parcel, i);
        }
        MinisLinkMeta minisLinkMeta = this.minisLinkMeta;
        if (minisLinkMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minisLinkMeta.writeToParcel(parcel, i);
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public TiktokMinisLinkParseResponse(MinisMeta minisMeta, MinisLinkMeta minisLinkMeta, Integer num, String str) {
        this.minisMeta = minisMeta;
        this.minisLinkMeta = minisLinkMeta;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
