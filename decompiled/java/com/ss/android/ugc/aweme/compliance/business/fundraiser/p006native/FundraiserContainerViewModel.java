package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native;

import X.AbstractC1675210th9;
import X.C01GW;
import X.C1911040zpW;
import X.C1911060zpY;
import X.C452501pT;
import X.EnumC1911020zpU;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FundraiserContainerViewModel extends ViewModel {
    public final MutableLiveData<C1911040zpW> LL = new MutableLiveData<>();
    public final MutableLiveData<AbstractC1675210th9> LLILLJJLI = new MutableLiveData<>();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(119));

    public final C1911060zpY vQ2() {
        return (C1911060zpY) this.LLILLL.getValue();
    }

    public final void AQ2(boolean z) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, null, null, null, null, false, z, null, 0, false, 0, 0L, null, null, 0, false, 0, 16775167);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    public final void BQ2(boolean z) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, null, null, null, null, false, false, null, 0, z, 0, 0L, null, null, 0, false, 0, 16760831);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    public final void CQ2(int i) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, null, null, null, null, false, false, null, 0, false, i, 0L, null, null, 0, false, 0, 16744447);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    public final void setLoading(boolean z) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, null, null, null, null, z, false, null, 0, false, 0, 0L, null, null, 0, false, 0, 16776191);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    public final void wQ2(EnumC1911020zpU enumC1911020zpU) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, enumC1911020zpU, null, null, null, false, false, null, 0, false, 0, 0L, null, null, 0, false, 0, 16777151);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    public final void zQ2(int i) {
        C1911040zpW c1911040zpWLIZ;
        MutableLiveData<C1911040zpW> mutableLiveData = this.LL;
        C1911040zpW value = mutableLiveData.getValue();
        if (value != null) {
            c1911040zpWLIZ = C1911040zpW.LIZ(value, null, null, null, null, null, null, false, false, null, i, false, 0, 0L, null, null, 0, false, 0, 16769023);
        } else {
            c1911040zpWLIZ = null;
        }
        mutableLiveData.setValue(c1911040zpWLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[PHI: r9
      0x0087: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:34:0x0077, B:36:0x007d, B:38:0x0085, B:32:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3 A[PHI: r14
      0x00a3: PHI (r14v4 java.lang.String) = (r14v1 java.lang.String), (r14v5 java.lang.String) binds: [B:48:0x00a1, B:46:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1 A[PHI: r14
      0x00b1: PHI (r14v3 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String), (r14v4 java.lang.String) binds: [B:48:0x00a1, B:52:0x00a9, B:54:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel.xQ2(java.lang.String, java.lang.String, boolean):void");
    }
}
