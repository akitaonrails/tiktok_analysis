package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PromptRequestState implements Parcelable {
    public static final Parcelable.Creator<PromptRequestState> CREATOR = new Parcelable.Creator<PromptRequestState>() { // from class: X.0MC3
        @Override // android.os.Parcelable.Creator
        public final PromptRequestState createFromParcel(Parcel parcel) {
            PromptRequestStateType promptRequestStateTypeCreateFromParcel = PromptRequestStateType.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PromptModel.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new PromptRequestState(promptRequestStateTypeCreateFromParcel, arrayList, z, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final PromptRequestState[] newArray(int i) {
            return new PromptRequestState[i];
        }
    };

    @C09CT("error")
    public final Throwable error;

    @C09CT("isFromCache")
    public final boolean isFromCache;

    @C09CT("prompts")
    public final List<PromptModel> prompts;

    @C09CT("state")
    public final PromptRequestStateType state;

    public PromptRequestState() {
        this(null, null, false, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptRequestState)) {
            return false;
        }
        PromptRequestState promptRequestState = (PromptRequestState) obj;
        return this.state == promptRequestState.state && Intrinsics.LJFF(this.prompts, promptRequestState.prompts) && this.isFromCache == promptRequestState.isFromCache && Intrinsics.LJFF(this.error, promptRequestState.error);
    }

    public final int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.prompts.hashCode()) * 31) + C786410Ut5.Z2(this.isFromCache)) * 31;
        Throwable th = this.error;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptRequestState(state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", prompts=");
        sbLIZ.append(this.prompts);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.isFromCache);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.state.writeToParcel(parcel, i);
        List<PromptModel> list = this.prompts;
        parcel.writeInt(list.size());
        Iterator<PromptModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFromCache ? 1 : 0);
        parcel.writeSerializable(this.error);
    }

    public PromptRequestState(PromptRequestStateType promptRequestStateType, List<PromptModel> list, boolean z, Throwable th) {
        this.state = promptRequestStateType;
        this.prompts = list;
        this.isFromCache = z;
        this.error = th;
    }

    public PromptRequestState(PromptRequestStateType promptRequestStateType, List list, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PromptRequestStateType.NONE : promptRequestStateType, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th);
    }
}
