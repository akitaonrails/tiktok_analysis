package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* JADX INFO: loaded from: classes14.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new Parcelable.Creator() { // from class: X.0WsR
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            StrokeStyle strokeStyle = null;
            double dLJIILLIIL = 0.0d;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        dLJIILLIIL = C0W6J.LJIILLIIL(i, parcel);
                    }
                } else {
                    strokeStyle = (StrokeStyle) C0W6J.LJI(parcel, i, StrokeStyle.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StyleSpan(strokeStyle, dLJIILLIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StyleSpan[i];
        }
    };
    public final StrokeStyle zza;
    public final double zzb;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d > 0.0d) {
            this.zza = strokeStyle;
            this.zzb = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJFF(parcel, 3, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
