package com.google.android.gms.auth.api.credentials;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new Parcelable.Creator() { // from class: X.0VzN
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new IdToken(strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new IdToken[i];
        }
    };
    public final String zba;
    public final String zbb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (C0W0T.LIZIZ(this.zba, idToken.zba) && C0W0T.LIZIZ(this.zbb, idToken.zbb)) {
            return true;
        }
        return false;
    }

    public IdToken(String str, String str2) {
        C0W3J.LIZ("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        C0W3J.LIZ("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.zba = str;
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zba, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
