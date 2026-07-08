package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import X.EnumC1778710wO5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.CallbackAction;
import com.ss.android.ugc.tools.data.ConfirmModal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class CallbackAction implements Parcelable {
    public static final Parcelable.Creator<CallbackAction> CREATOR = new Parcelable.Creator<CallbackAction>() { // from class: X.18Wb
        @Override // android.os.Parcelable.Creator
        public final CallbackAction createFromParcel(Parcel parcel) {
            ConfirmModal confirmModalCreateFromParcel;
            EnumC1778710wO5 enumC1778710wO5ValueOf = EnumC1778710wO5.valueOf(parcel.readString());
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                confirmModalCreateFromParcel = null;
            } else {
                confirmModalCreateFromParcel = ConfirmModal.CREATOR.createFromParcel(parcel);
            }
            return new CallbackAction(enumC1778710wO5ValueOf, i, confirmModalCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CallbackAction[] newArray(int i) {
            return new CallbackAction[i];
        }
    };
    public final EnumC1778710wO5 actionType;
    public final ConfirmModal callbackConfirmModal;
    public final int callbackID;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallbackAction)) {
            return false;
        }
        CallbackAction callbackAction = (CallbackAction) obj;
        return this.actionType == callbackAction.actionType && this.callbackID == callbackAction.callbackID && Intrinsics.LJFF(this.callbackConfirmModal, callbackAction.callbackConfirmModal);
    }

    public final int hashCode() {
        int iHashCode = ((this.actionType.hashCode() * 31) + this.callbackID) * 31;
        ConfirmModal confirmModal = this.callbackConfirmModal;
        return iHashCode + (confirmModal == null ? 0 : confirmModal.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallbackAction(actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", callbackID=");
        sbLIZ.append(this.callbackID);
        sbLIZ.append(", callbackConfirmModal=");
        sbLIZ.append(this.callbackConfirmModal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionType.name());
        parcel.writeInt(this.callbackID);
        ConfirmModal confirmModal = this.callbackConfirmModal;
        if (confirmModal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            confirmModal.writeToParcel(parcel, i);
        }
    }

    public CallbackAction() {
        this(EnumC1778710wO5.ACTIVITY_CALLBACK, 0, null);
    }

    public CallbackAction(EnumC1778710wO5 enumC1778710wO5, int i, ConfirmModal confirmModal) {
        this.actionType = enumC1778710wO5;
        this.callbackID = i;
        this.callbackConfirmModal = confirmModal;
    }
}
