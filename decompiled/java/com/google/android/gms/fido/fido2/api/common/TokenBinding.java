package com.google.android.gms.fido.fido2.api.common;

import X.C08FF;
import X.C0W3J;
import X.C19845312kl;
import X.C19845412km;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public final TokenBindingStatus zza;
    public final String zzb;
    public static final Parcelable.Creator<TokenBinding> CREATOR = new Parcelable.Creator() { // from class: X.12kj
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TokenBinding(strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenBinding[i];
        }
    };
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new Parcelable.Creator() { // from class: X.12kk
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                try {
                    return TokenBinding.TokenBindingStatus.fromString(parcel.readString());
                } catch (C19845312kl e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new TokenBinding.TokenBindingStatus[i];
            }
        };
        public final String zzb;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        public static TokenBindingStatus fromString(final String str) throws Exception {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new Exception(str) { // from class: X.12kl
                {
                    super(C786410Ut5.j4("TokenBindingStatus %s not supported", new Object[]{str}));
                }
            };
        }

        public static TokenBindingStatus valueOf(String str) {
            return (TokenBindingStatus) C08FF.LIZ(TokenBindingStatus.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }

        TokenBindingStatus(String str) {
            this.zzb = str;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        if (!C19845412km.LIZ(this.zza, tokenBinding.zza) || !C19845412km.LIZ(this.zzb, tokenBinding.zzb)) {
            return false;
        }
        return true;
    }

    public TokenBinding(String str, String str2) {
        C0W3J.LJIIIIZZ(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (C19845312kl e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza.toString(), false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
