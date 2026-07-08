package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.CallbackAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatCallbacks implements Parcelable {
    public static final Parcelable.Creator<AIChatCallbacks> CREATOR = new Parcelable.Creator<AIChatCallbacks>() { // from class: X.18Wi
        @Override // android.os.Parcelable.Creator
        public final AIChatCallbacks createFromParcel(Parcel parcel) {
            CallbackAction callbackActionCreateFromParcel;
            if (parcel.readInt() == 0) {
                callbackActionCreateFromParcel = null;
            } else {
                callbackActionCreateFromParcel = CallbackAction.CREATOR.createFromParcel(parcel);
            }
            return new AIChatCallbacks(callbackActionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatCallbacks[] newArray(int i) {
            return new AIChatCallbacks[i];
        }
    };
    public final CallbackAction onPostAction;

    public AIChatCallbacks() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIChatCallbacks) && Intrinsics.LJFF(this.onPostAction, ((AIChatCallbacks) obj).onPostAction);
    }

    public final int hashCode() {
        CallbackAction callbackAction = this.onPostAction;
        if (callbackAction == null) {
            return 0;
        }
        return callbackAction.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatCallbacks(onPostAction=");
        sbLIZ.append(this.onPostAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallbackAction callbackAction = this.onPostAction;
        if (callbackAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callbackAction.writeToParcel(parcel, i);
        }
    }

    public AIChatCallbacks(CallbackAction callbackAction) {
        this.onPostAction = callbackAction;
    }
}
