package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new Parcelable.Creator() { // from class: X.0W6w
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ContactlessSetupItem(iLJIJJLI, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ContactlessSetupItem[i];
        }
    };
    public final int LL;
    public final int LLILLJJLI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Integer.valueOf(this.LL), "type");
        c0w3l.LIZ(Integer.valueOf(this.LLILLJJLI), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.LL == contactlessSetupItem.LL && this.LLILLJJLI == contactlessSetupItem.LLILLJJLI) {
                return true;
            }
        }
        return false;
    }

    public ContactlessSetupItem(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
