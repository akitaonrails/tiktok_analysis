package com.ss.android.ugc.aweme.explore;

import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreFeedParams implements Parcelable, InterfaceC111300bX {
    public static final Parcelable.Creator<ExploreFeedParams> CREATOR = new Parcelable.Creator<ExploreFeedParams>() { // from class: X.0wRh
        @Override // android.os.Parcelable.Creator
        public final ExploreFeedParams createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ExploreFeedParams(parcel.readInt(), lValueOf, string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreFeedParams[] newArray(int i) {
            return new ExploreFeedParams[i];
        }
    };
    public final String awemeId;
    public int enterFromQueryParam;
    public boolean isFromStandaloneFragment;
    public final String previousPage;
    public final Long startTime;

    public ExploreFeedParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreFeedParams)) {
            return false;
        }
        ExploreFeedParams exploreFeedParams = (ExploreFeedParams) obj;
        return Intrinsics.LJFF(this.awemeId, exploreFeedParams.awemeId) && Intrinsics.LJFF(this.startTime, exploreFeedParams.startTime) && Intrinsics.LJFF(this.previousPage, exploreFeedParams.previousPage) && this.isFromStandaloneFragment == exploreFeedParams.isFromStandaloneFragment && this.enterFromQueryParam == exploreFeedParams.enterFromQueryParam;
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.previousPage;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromStandaloneFragment)) * 31) + this.enterFromQueryParam;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedParams(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(", isFromStandaloneFragment=");
        sbLIZ.append(this.isFromStandaloneFragment);
        sbLIZ.append(", enterFromQueryParam=");
        sbLIZ.append(this.enterFromQueryParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.awemeId);
        Long l = this.startTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.previousPage);
        parcel.writeInt(this.isFromStandaloneFragment ? 1 : 0);
        parcel.writeInt(this.enterFromQueryParam);
    }

    public /* synthetic */ ExploreFeedParams(int i) {
        this(0, null, null, null, false);
    }

    public ExploreFeedParams(int i, Long l, String str, String str2, boolean z) {
        this.awemeId = str;
        this.startTime = l;
        this.previousPage = str2;
        this.isFromStandaloneFragment = z;
        this.enterFromQueryParam = i;
    }
}
