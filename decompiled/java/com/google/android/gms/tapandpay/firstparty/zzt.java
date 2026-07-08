package com.google.android.gms.tapandpay.firstparty;

import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.zzt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes14.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new Parcelable.Creator() { // from class: X.0W6v
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ContactlessSetupItem[] contactlessSetupItemArr = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    contactlessSetupItemArr = (ContactlessSetupItem[]) C0W6J.LJIIJ(parcel, i, ContactlessSetupItem.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzt(contactlessSetupItemArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzt[i];
        }
    };
    public final ContactlessSetupItem[] LL;

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        for (ContactlessSetupItem contactlessSetupItem : this.LL) {
            c0w3l.LIZ(Integer.valueOf(contactlessSetupItem.LL), "type");
            c0w3l.LIZ(Integer.valueOf(contactlessSetupItem.LLILLJJLI), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        }
        return c0w3l.toString();
    }

    public zzt(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.LL = contactlessSetupItemArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJLI(parcel, 1, this.LL, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
