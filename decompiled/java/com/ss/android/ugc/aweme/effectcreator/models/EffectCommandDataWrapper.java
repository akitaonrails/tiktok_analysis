package com.ss.android.ugc.aweme.effectcreator.models;

import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectCommandDataWrapper implements Parcelable {
    public static final Parcelable.Creator<EffectCommandDataWrapper> CREATOR = new Parcelable.Creator<EffectCommandDataWrapper>() { // from class: X.0vKh
        @Override // android.os.Parcelable.Creator
        public final EffectCommandDataWrapper createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EffectCommandDataWrapper(z, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectCommandDataWrapper[] newArray(int i) {
            return new EffectCommandDataWrapper[i];
        }
    };
    public final int actionCount;
    public final List<String> actionNameList;
    public final String commandAddFrom;
    public final int index;
    public final boolean isValid;
    public final String presetCommandId;
    public final int triggerCount;
    public final List<String> triggerNameList;
    public final int validActionCount;
    public final int validObjectCount;

    public EffectCommandDataWrapper() {
        this(false, 0, (String) null, 0, 0, 0, 0, (List) null, (List) null, 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCommandDataWrapper)) {
            return false;
        }
        EffectCommandDataWrapper effectCommandDataWrapper = (EffectCommandDataWrapper) obj;
        return this.isValid == effectCommandDataWrapper.isValid && this.index == effectCommandDataWrapper.index && Intrinsics.LJFF(this.commandAddFrom, effectCommandDataWrapper.commandAddFrom) && this.triggerCount == effectCommandDataWrapper.triggerCount && this.actionCount == effectCommandDataWrapper.actionCount && this.validActionCount == effectCommandDataWrapper.validActionCount && this.validObjectCount == effectCommandDataWrapper.validObjectCount && Intrinsics.LJFF(this.triggerNameList, effectCommandDataWrapper.triggerNameList) && Intrinsics.LJFF(this.actionNameList, effectCommandDataWrapper.actionNameList) && Intrinsics.LJFF(this.presetCommandId, effectCommandDataWrapper.presetCommandId);
    }

    public final int hashCode() {
        return (((((((((((((((((C786410Ut5.Z2(this.isValid) * 31) + this.index) * 31) + this.commandAddFrom.hashCode()) * 31) + this.triggerCount) * 31) + this.actionCount) * 31) + this.validActionCount) * 31) + this.validObjectCount) * 31) + this.triggerNameList.hashCode()) * 31) + this.actionNameList.hashCode()) * 31) + this.presetCommandId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectCommandDataWrapper(isValid=");
        sbLIZ.append(this.isValid);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", commandAddFrom=");
        sbLIZ.append(this.commandAddFrom);
        sbLIZ.append(", triggerCount=");
        sbLIZ.append(this.triggerCount);
        sbLIZ.append(", actionCount=");
        sbLIZ.append(this.actionCount);
        sbLIZ.append(", validActionCount=");
        sbLIZ.append(this.validActionCount);
        sbLIZ.append(", validObjectCount=");
        sbLIZ.append(this.validObjectCount);
        sbLIZ.append(", triggerNameList=");
        sbLIZ.append(this.triggerNameList);
        sbLIZ.append(", actionNameList=");
        sbLIZ.append(this.actionNameList);
        sbLIZ.append(", presetCommandId=");
        sbLIZ.append(this.presetCommandId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isValid ? 1 : 0);
        parcel.writeInt(this.index);
        parcel.writeString(this.commandAddFrom);
        parcel.writeInt(this.triggerCount);
        parcel.writeInt(this.actionCount);
        parcel.writeInt(this.validActionCount);
        parcel.writeInt(this.validObjectCount);
        parcel.writeStringList(this.triggerNameList);
        parcel.writeStringList(this.actionNameList);
        parcel.writeString(this.presetCommandId);
    }

    public EffectCommandDataWrapper(boolean z, int i, String str, int i2, int i3, int i4, int i5, List list, List list2, int i6) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5, (List<String>) ((i6 & 128) != 0 ? C13BV.INSTANCE : list), (List<String>) ((i6 & 256) != 0 ? C13BV.INSTANCE : list2), (i6 & 512) == 0 ? null : "");
    }

    public EffectCommandDataWrapper(boolean z, int i, String str, int i2, int i3, int i4, int i5, List<String> list, List<String> list2, String str2) {
        this.isValid = z;
        this.index = i;
        this.commandAddFrom = str;
        this.triggerCount = i2;
        this.actionCount = i3;
        this.validActionCount = i4;
        this.validObjectCount = i5;
        this.triggerNameList = list;
        this.actionNameList = list2;
        this.presetCommandId = str2;
    }
}
