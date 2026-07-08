package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W0b
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PendingIntent pendingIntent = null;
            int iLJIJJLI = 0;
            String strLJII = null;
            String strLJII2 = null;
            ArrayList arrayListLJIIIZ = null;
            String strLJII3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        break;
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SaveAccountLinkingTokenRequest(pendingIntent, strLJII, strLJII2, arrayListLJIIIZ, strLJII3, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SaveAccountLinkingTokenRequest[i];
        }
    };
    public final PendingIntent zba;
    public final String zbb;
    public final String zbc;
    public final List zbd;
    public final String zbe;
    public final int zbf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.zbd.size() != saveAccountLinkingTokenRequest.zbd.size() || !this.zbd.containsAll(saveAccountLinkingTokenRequest.zbd) || !C0W0T.LIZIZ(this.zba, saveAccountLinkingTokenRequest.zba) || !C0W0T.LIZIZ(this.zbb, saveAccountLinkingTokenRequest.zbb) || !C0W0T.LIZIZ(this.zbc, saveAccountLinkingTokenRequest.zbc) || !C0W0T.LIZIZ(this.zbe, saveAccountLinkingTokenRequest.zbe) || this.zbf != saveAccountLinkingTokenRequest.zbf) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zba, i, false);
        C817940W6u.LJIJ(parcel, 2, this.zbb, false);
        C817940W6u.LJIJ(parcel, 3, this.zbc, false);
        C817940W6u.LJIJJ(parcel, 4, this.zbd);
        C817940W6u.LJIJ(parcel, 5, this.zbe, false);
        C817940W6u.LJIIJ(parcel, 6, this.zbf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.zba = pendingIntent;
        this.zbb = str;
        this.zbc = str2;
        this.zbd = list;
        this.zbe = str3;
        this.zbf = i;
    }
}
