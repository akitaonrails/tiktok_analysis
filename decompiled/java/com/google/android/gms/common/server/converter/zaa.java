package com.google.android.gms.common.server.converter;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

/* JADX INFO: loaded from: classes14.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new Parcelable.Creator<zaa>() { // from class: X.0W6B
        @Override // android.os.Parcelable.Creator
        public final zaa createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            StringToIntConverter stringToIntConverter = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        stringToIntConverter = (StringToIntConverter) C0W6J.LJI(parcel, i, StringToIntConverter.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zaa(iLJIJJLI, stringToIntConverter);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zaa[] newArray(int i) {
            return new zaa[i];
        }
    };
    public final int LL;
    public final StringToIntConverter zab;

    public final StringToIntConverter LJLZ() {
        StringToIntConverter stringToIntConverter = this.zab;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.LL = 1;
        this.zab = stringToIntConverter;
    }

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.LL = i;
        this.zab = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.zab, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
