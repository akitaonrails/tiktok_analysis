package com.ss.android.ugc.aweme.favorites.business.video.invalid;

import X.C01GW;
import X.C11JF;
import X.C1260390iu5;
import X.C1260400iu6;
import X.C1260410iu7;
import X.C1260420iu8;
import X.C1260440iuA;
import X.C1260450iuB;
import X.C1906580ziK;
import X.C19EG;
import X.C2188811AlT;
import X.C356901a3;
import X.C430420GuG;
import X.C452501pT;
import X.C785410UrT;
import X.DialogC1389620mGW;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS88S0200000_19;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteInvalidVideosSharedVM;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteInvalidVideosService;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteInvalidVideosServiceImpl implements IFavoriteInvalidVideosService, DefaultLifecycleObserver, GenericLifecycleObserver {
    public FavoriteInvalidVideosSharedVM LLILLJJLI;
    public C19EG LLILLL;
    public LifecycleOwner LLILZ;
    public DialogC1389620mGW LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(321));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1432));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1433));
    public final C1260440iuA LLIZ = new C1260440iuA();
    public C1260400iu6 LLJ = new C1260400iu6(false, false);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteInvalidVideosService
    public final C430420GuG LIZ() {
        C430420GuG c430420GuG = new C430420GuG(new AwS563S0100000_19(this, 2916), new AwS563S0100000_19(this, 2917));
        LIZJ().LIZ = c430420GuG;
        return c430420GuG;
    }

    public final C1260390iu5 LIZJ() {
        return (C1260390iu5) this.LLILZIL.getValue();
    }

    public final C1260450iuB LIZLLL() {
        return (C1260450iuB) this.LLILZLL.getValue();
    }

    public final String LJ() {
        return (String) this.LL.getValue();
    }

    public final void LJFF() {
        DialogC1389620mGW dialogC1389620mGW = this.LLIZLLLIL;
        if (dialogC1389620mGW == null) {
            return;
        }
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
        this.LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteInvalidVideosService
    public final void LJI() {
        Lifecycle lifecycle;
        C1260440iuA c1260440iuA = this.LLIZ;
        C11JF c11jf = c1260440iuA.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c1260440iuA.LIZ = null;
        ARunnableS88S0200000_19 aRunnableS88S0200000_19 = c1260440iuA.LIZIZ;
        if (aRunnableS88S0200000_19 != null) {
            c1260440iuA.LIZJ.removeCallbacks(aRunnableS88S0200000_19);
        }
        c1260440iuA.LIZIZ = null;
        c1260440iuA.LIZLLL = false;
        LJFF();
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILZ = null;
        this.LLILLL = null;
        this.LLILLJJLI = null;
        this.LLJ = new C1260400iu6(false, false);
    }

    public final void LJII() {
        MutableLiveData mutableLiveData;
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = this.LLILLJJLI;
        if (favoriteInvalidVideosSharedVM == null || (mutableLiveData = favoriteInvalidVideosSharedVM.LLIZLLLIL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            return;
        }
        LJIIIIZZ();
    }

    public FavoriteInvalidVideosServiceImpl() {
        String strLJ = LJ();
        Keva kevaLIZIZ = C1260410iu7.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJ);
        sbLIZ.append("_invalid_pending_count");
        Integer numValueOf = Integer.valueOf(kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0));
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            Keva kevaLIZIZ2 = C1260410iu7.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJ);
            sbLIZ2.append("_invalid_detected_count");
            kevaLIZIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), iIntValue);
            Keva kevaLIZIZ3 = C1260410iu7.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLJ);
            sbLIZ3.append("_invalid_pending_count");
            kevaLIZIZ3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
        }
        Keva kevaLIZIZ4 = C1260410iu7.LIZIZ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLJ);
        sbLIZ4.append("_invalid_pending_cursor");
        Integer numValueOf2 = Integer.valueOf(kevaLIZIZ4.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0));
        if (numValueOf2.intValue() > 0) {
            int iIntValue2 = numValueOf2.intValue();
            Keva kevaLIZIZ5 = C1260410iu7.LIZIZ();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLJ);
            sbLIZ5.append("_invalid_detected_cursor");
            kevaLIZIZ5.storeInt(C2188811AlT.LIZIZ(sbLIZ5), iIntValue2);
            Keva kevaLIZIZ6 = C1260410iu7.LIZIZ();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLJ);
            sbLIZ6.append("_invalid_pending_cursor");
            kevaLIZIZ6.storeInt(C2188811AlT.LIZIZ(sbLIZ6), 0);
        }
    }

    public final void LJIIIIZZ() {
        C430420GuG c430420GuG = LIZJ().LIZ;
        boolean z = true;
        boolean z2 = c430420GuG != null && c430420GuG.LIZJ;
        boolean z3 = LIZLLL().LIZ;
        C1260400iu6 c1260400iu6 = this.LLJ;
        boolean z4 = c1260400iu6.LIZ;
        boolean z5 = c1260400iu6.LIZIZ;
        if (!z4 && z2) {
            C1260420iu8 c1260420iu8 = C1260420iu8.LIZ;
            int iLIZ = C1260410iu7.LIZ(LJ());
            c1260420iu8.getClass();
            C1260420iu8.LIZ(iLIZ, true);
            z4 = true;
        }
        if (z5 || !z3) {
            z = z5;
        } else {
            C1260420iu8 c1260420iu82 = C1260420iu8.LIZ;
            int i = LIZLLL().LIZIZ;
            c1260420iu82.getClass();
            C1260420iu8.LIZ(i, false);
        }
        this.LLJ = new C1260400iu6(z4, z);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        if (!C1906580ziK.LJI() && this.LLIZ.LIZLLL) {
            LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteInvalidVideosService
    public final void LIZIZ(FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM, C19EG c19eg, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = favoriteInvalidVideosSharedVM;
        this.LLILLL = c19eg;
        this.LLILZ = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        favoriteInvalidVideosSharedVM.LLILLJJLI.observe(lifecycleOwner, new AObserverS223S0100000_19(this, 22));
        favoriteInvalidVideosSharedVM.LLJJI.observe(lifecycleOwner, new AObserverS223S0100000_19(this, 23));
        favoriteInvalidVideosSharedVM.LLILZ.observe(lifecycleOwner, new AObserverS223S0100000_19(this, 24));
        favoriteInvalidVideosSharedVM.LLIZLLLIL.observe(lifecycleOwner, new AObserverS223S0100000_19(this, 25));
    }
}
