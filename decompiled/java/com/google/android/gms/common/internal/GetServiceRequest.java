package com.google.android.gms.common.internal;

import X.C828740WfA;
import X.C832410Wl5;
import X.InterfaceC828880WfO;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C832410Wl5();
    public static final Scope[] LLJILJILJ = new Scope[0];
    public static final Feature[] LLJILLL = new Feature[0];
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public String LLILZ;
    public IBinder LLILZIL;
    public Scope[] LLILZLL;
    public Account LLIZ;
    public Feature[] LLIZLLLIL;
    public Feature[] LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public boolean LLJILJIL;
    public Bundle zzi;
    public String zzp;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C832410Wl5.LIZ(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        InterfaceC828880WfO c828740WfA;
        scopeArr = scopeArr == null ? LLJILJILJ : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = LLJILLL;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        if ("com.google.android.gms".equals(str)) {
            this.LLILZ = "com.google.android.gms";
        } else {
            this.LLILZ = str;
        }
        if (i < 2) {
            Account accountLIZ = null;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC828880WfO) {
                    c828740WfA = (InterfaceC828880WfO) iInterfaceQueryLocalInterface;
                } else {
                    c828740WfA = new C828740WfA(iBinder);
                }
                if (c828740WfA != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        accountLIZ = c828740WfA.LIZ();
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.LLIZ = accountLIZ;
        } else {
            this.LLILZIL = iBinder;
            this.LLIZ = account;
        }
        this.LLILZLL = scopeArr;
        this.zzi = bundle;
        this.LLIZLLLIL = featureArr;
        this.LLJ = featureArr2;
        this.LLJI = z;
        this.LLJIJIL = i4;
        this.LLJILJIL = z2;
        this.zzp = str2;
    }
}
