package com.ss.android.ugc.ur.longpress;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.ur.longpress.ActionFailureResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ActionFailureResult implements Parcelable {
    public static final Parcelable.Creator<ActionFailureResult> CREATOR = new Parcelable.Creator<ActionFailureResult>() { // from class: X.0Svw
        @Override // android.os.Parcelable.Creator
        public final ActionFailureResult createFromParcel(Parcel parcel) {
            return new ActionFailureResult((Exception) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionFailureResult[] newArray(int i) {
            return new ActionFailureResult[i];
        }
    };
    public final Exception failureException;
    public final int msgStringId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionFailureResult)) {
            return false;
        }
        ActionFailureResult actionFailureResult = (ActionFailureResult) obj;
        return Intrinsics.LJFF(this.failureException, actionFailureResult.failureException) && this.msgStringId == actionFailureResult.msgStringId;
    }

    public final int hashCode() {
        Exception exc = this.failureException;
        return ((exc == null ? 0 : exc.hashCode()) * 31) + this.msgStringId;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionFailureResult(failureException=");
        sbLIZ.append(this.failureException);
        sbLIZ.append(", msgStringId=");
        sbLIZ.append(this.msgStringId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.failureException);
        parcel.writeInt(this.msgStringId);
    }

    public ActionFailureResult(Exception exc, int i) {
        this.failureException = exc;
        this.msgStringId = i;
    }
}
