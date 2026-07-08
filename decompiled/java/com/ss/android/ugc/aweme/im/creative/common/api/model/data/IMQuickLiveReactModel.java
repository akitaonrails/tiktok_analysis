package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMQuickLiveReactModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMQuickLiveReactModel implements Parcelable {
    public static final Parcelable.Creator<IMQuickLiveReactModel> CREATOR = new Parcelable.Creator<IMQuickLiveReactModel>() { // from class: X.0mgA
        @Override // android.os.Parcelable.Creator
        public final IMQuickLiveReactModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ReferenceInfo referenceInfo = (ReferenceInfo) parcel.readParcelable(IMQuickLiveReactModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new IMQuickLiveReactModel(referenceInfo, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final IMQuickLiveReactModel[] newArray(int i) {
            return new IMQuickLiveReactModel[i];
        }
    };
    public final Boolean isQuickChat;
    public final ReferenceInfo quickLiveReactReferenceInfo;

    public IMQuickLiveReactModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMQuickLiveReactModel)) {
            return false;
        }
        IMQuickLiveReactModel iMQuickLiveReactModel = (IMQuickLiveReactModel) obj;
        return Intrinsics.LJFF(this.quickLiveReactReferenceInfo, iMQuickLiveReactModel.quickLiveReactReferenceInfo) && Intrinsics.LJFF(this.isQuickChat, iMQuickLiveReactModel.isQuickChat);
    }

    public final int hashCode() {
        ReferenceInfo referenceInfo = this.quickLiveReactReferenceInfo;
        int iHashCode = (referenceInfo == null ? 0 : referenceInfo.hashCode()) * 31;
        Boolean bool = this.isQuickChat;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMQuickLiveReactModel(quickLiveReactReferenceInfo=");
        sbLIZ.append(this.quickLiveReactReferenceInfo);
        sbLIZ.append(", isQuickChat=");
        sbLIZ.append(this.isQuickChat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeParcelable(this.quickLiveReactReferenceInfo, i);
        Boolean bool = this.isQuickChat;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public IMQuickLiveReactModel(ReferenceInfo referenceInfo, Boolean bool) {
        this.quickLiveReactReferenceInfo = referenceInfo;
        this.isQuickChat = bool;
    }
}
