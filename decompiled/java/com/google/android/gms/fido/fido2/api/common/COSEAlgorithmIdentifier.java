package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.EnumC19843712kV;
import X.EnumC19843812kW;
import X.InterfaceC19843912kX;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new Parcelable.Creator() { // from class: X.12kS
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return COSEAlgorithmIdentifier.LIZ(parcel.readInt());
            } catch (C1633830scP e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new COSEAlgorithmIdentifier[i];
        }
    };
    public final InterfaceC19843912kX zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final int LIZIZ() {
        return this.zza.getAlgoValue();
    }

    public COSEAlgorithmIdentifier(InterfaceC19843912kX interfaceC19843912kX) {
        C0W3J.LJIIIIZZ(interfaceC19843912kX);
        this.zza = interfaceC19843912kX;
    }

    public static COSEAlgorithmIdentifier LIZ(final int i) throws Exception {
        InterfaceC19843912kX interfaceC19843912kX;
        if (i == EnumC19843712kV.LEGACY_RS1.getAlgoValue()) {
            interfaceC19843912kX = EnumC19843712kV.RS1;
        } else {
            InterfaceC19843912kX[] interfaceC19843912kXArrValues = EnumC19843712kV.values();
            int length = interfaceC19843912kXArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    interfaceC19843912kX = interfaceC19843912kXArrValues[i2];
                    if (interfaceC19843912kX.getAlgoValue() == i) {
                        break;
                    }
                    i2++;
                } else {
                    InterfaceC19843912kX[] interfaceC19843912kXArrValues2 = EnumC19843812kW.values();
                    int length2 = interfaceC19843912kXArrValues2.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        interfaceC19843912kX = interfaceC19843912kXArrValues2[i3];
                        if (interfaceC19843912kX.getAlgoValue() != i) {
                        }
                    }
                    throw new Exception(i) { // from class: X.0scP
                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Algorithm with COSE value ");
                            sbLIZ.append(i);
                            sbLIZ.append(" not supported");
                            super(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    };
                }
            }
        }
        return new COSEAlgorithmIdentifier(interfaceC19843912kX);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.zza.getAlgoValue() != ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue()) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
