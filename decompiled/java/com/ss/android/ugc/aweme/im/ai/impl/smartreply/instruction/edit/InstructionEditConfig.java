package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit;

import X.C060Z;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionEditConfig implements Parcelable {
    public static final Parcelable.Creator<InstructionEditConfig> CREATOR = new Parcelable.Creator<InstructionEditConfig>() { // from class: X.060Y
        @Override // android.os.Parcelable.Creator
        public final InstructionEditConfig createFromParcel(Parcel parcel) {
            boolean z;
            C060Z c060zValueOf = C060Z.valueOf(parcel.readString());
            String string = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InstructionEditConfig(c060zValueOf, string, j, z);
        }

        @Override // android.os.Parcelable.Creator
        public final InstructionEditConfig[] newArray(int i) {
            return new InstructionEditConfig[i];
        }
    };
    public final long botId;
    public final String currentText;
    public final boolean expandOnShow;
    public final C060Z sectionType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionEditConfig)) {
            return false;
        }
        InstructionEditConfig instructionEditConfig = (InstructionEditConfig) obj;
        return this.sectionType == instructionEditConfig.sectionType && Intrinsics.LJFF(this.currentText, instructionEditConfig.currentText) && this.botId == instructionEditConfig.botId && this.expandOnShow == instructionEditConfig.expandOnShow;
    }

    public final int hashCode() {
        return (((((this.sectionType.hashCode() * 31) + this.currentText.hashCode()) * 31) + C786410Ut5.Y2(this.botId)) * 31) + C786410Ut5.Z2(this.expandOnShow);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstructionEditConfig(sectionType=");
        sbLIZ.append(this.sectionType);
        sbLIZ.append(", currentText=");
        sbLIZ.append(this.currentText);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.botId);
        sbLIZ.append(", expandOnShow=");
        sbLIZ.append(this.expandOnShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sectionType.name());
        parcel.writeString(this.currentText);
        parcel.writeLong(this.botId);
        parcel.writeInt(this.expandOnShow ? 1 : 0);
    }

    public InstructionEditConfig(C060Z c060z, String str, long j, boolean z) {
        this.sectionType = c060z;
        this.currentText = str;
        this.botId = j;
        this.expandOnShow = z;
    }
}
