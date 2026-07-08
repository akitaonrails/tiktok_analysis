package com.ss.android.ugc.aweme.creative.model.declaration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DeclarationInfoStruct implements Parcelable {
    public static final Parcelable.Creator<DeclarationInfoStruct> CREATOR = new Parcelable.Creator<DeclarationInfoStruct>() { // from class: X.0n4j
        @Override // android.os.Parcelable.Creator
        public final DeclarationInfoStruct createFromParcel(Parcel parcel) {
            DeclarationPayload declarationPayloadCreateFromParcel;
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                declarationPayloadCreateFromParcel = null;
            } else {
                declarationPayloadCreateFromParcel = DeclarationPayload.CREATOR.createFromParcel(parcel);
            }
            return new DeclarationInfoStruct(i, declarationPayloadCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeclarationInfoStruct[] newArray(int i) {
            return new DeclarationInfoStruct[i];
        }
    };

    @C09CT("declaration_option")
    public int option;

    @C09CT("declaration_payload")
    public DeclarationPayload payload;

    public DeclarationInfoStruct() {
        this(0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeclarationInfoStruct)) {
            return false;
        }
        DeclarationInfoStruct declarationInfoStruct = (DeclarationInfoStruct) obj;
        return this.option == declarationInfoStruct.option && Intrinsics.LJFF(this.payload, declarationInfoStruct.payload);
    }

    public final int hashCode() {
        int i = this.option * 31;
        DeclarationPayload declarationPayload = this.payload;
        return i + (declarationPayload == null ? 0 : declarationPayload.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeclarationInfoStruct(option=");
        sbLIZ.append(this.option);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.option);
        DeclarationPayload declarationPayload = this.payload;
        if (declarationPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            declarationPayload.writeToParcel(parcel, i);
        }
    }

    public DeclarationInfoStruct(int i, DeclarationPayload declarationPayload) {
        this.option = i;
        this.payload = declarationPayload;
    }
}
