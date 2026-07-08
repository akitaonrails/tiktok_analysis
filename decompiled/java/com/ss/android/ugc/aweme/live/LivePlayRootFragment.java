package com.ss.android.ugc.aweme.live;

import X.C06W2;
import X.C098200Yq;
import X.C0IEG;
import X.C0IKH;
import X.C0IL2;
import X.C1324720kZq;
import X.C14EU;
import X.C157W;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20338414i6;
import X.C472280Ifa;
import X.C475360IkY;
import X.C475450Ikh;
import X.C475460Iki;
import X.C479740Irc;
import X.C479790Irh;
import X.C479930Irv;
import X.C479990Is1;
import X.C484240Iys;
import X.C521860KdM;
import X.C786410Ut5;
import X.InterfaceC20573715ex;
import X.InterfaceC20596815ig;
import X.InterfaceC342470Dbh;
import X.InterfaceC362610EJn;
import X.InterfaceC479770Irf;
import X.InterfaceC479780Irg;
import X.InterfaceC479830Irl;
import X.InterfaceC484050IyZ;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.other.AppLogFlushOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveLoadingAnimTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveNewLoadingStyleBackgroundSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePlayRootFragment extends SAFTikTokFragment implements InterfaceC479780Irg<Bundle>, InterfaceC20596815ig, InterfaceC20573715ex {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSklPyp9BCw6LB8/KTweJiAnDjctLiI2JjE=";
    public final C479740Irc LLJILLL;

    @Override // X.InterfaceC20573715ex
    public final void E4() {
    }

    @Override // X.InterfaceC20596815ig
    public final boolean JL() {
        return false;
    }

    @Override // X.InterfaceC20573715ex
    public final boolean K6() {
        return true;
    }

    @Override // X.InterfaceC479780Irg
    public final void activityConfiguration(Function1<? super C06W2, Unit> function1) {
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C479990Is1.LIZ = false;
        this.LLJILLL.LJJIJIIJIL(new ARunnableS107S0100000_7(this, 126));
    }

    @Override // X.InterfaceC20573715ex
    public final boolean wy() {
        return false;
    }

    @Override // X.InterfaceC479780Irg
    public final LifecycleOwner xL() {
        return this;
    }

    static {
        C20338414i6.LIZIZ("BaseLiveSdkActivity");
    }

    @Override // X.C0IFS
    public final void KR() {
        this.LLJILLL.LJJIII();
    }

    @Override // X.C0IFX
    public final void LJLL() {
        C475460Iki c475460Iki = this.LLJILLL.LJJIFFI;
        if (c475460Iki != null) {
            c475460Iki.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LJLLLL() {
        C479740Irc c479740Irc = this.LLJILLL;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 130);
        c479740Irc.getClass();
        aRunnableS107S0100000_7.run();
        C0IEG c0ieg = c479740Irc.LJFF;
        if (c0ieg != null) {
            c0ieg.LJLLLL();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        this.LLJILLL.LJIJJ(new ARunnableS107S0100000_7(this, 124));
    }

    @Override // X.InterfaceC479780Irg, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        this.LLJILLL.getClass();
        return "b4180";
    }

    @Override // X.C0IFS
    public final C0IKH k6() {
        return this.LLJILLL.LJI;
    }

    @Override // X.C0IFX
    public final boolean lB() {
        C475460Iki c475460Iki = this.LLJILLL.LJJIFFI;
        return c475460Iki != null && TopLiveLoadingAnimTypeSetting.INSTANCE.getAnimType() > 0 && c475460Iki.LIZIZ;
    }

    @Override // X.InterfaceC479780Irg
    public final InterfaceC479830Irl<Bundle> mK() {
        return new C475450Ikh(true, this, null);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        this.LLJILLL.LJJIIZI(new ARunnableS107S0100000_7(this, 125));
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.LLJILLL.LJJIJL(new ARunnableS107S0100000_7(this, 127));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        this.LLJILLL.LJJIJLIJ(new ARunnableS107S0100000_7(this, 128), true);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C479740Irc c479740Irc = this.LLJILLL;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 129);
        c479740Irc.getClass();
        aRunnableS107S0100000_7.run();
        AppLogFlushOptSetting.INSTANCE.backgroundFlush();
    }

    @Override // X.C0IFX
    public final boolean pa() {
        C1324720kZq c1324720kZq;
        C479740Irc c479740Irc = this.LLJILLL;
        C475460Iki c475460Iki = c479740Irc.LJJIFFI;
        return c475460Iki != null && (c1324720kZq = c475460Iki.LJ) != null && c1324720kZq.getVisibility() == 0 && TopLiveNewLoadingStyleBackgroundSetting.INSTANCE.getBackgroundShowType() == 1 && c479740Irc.LJJIFFI.LIZIZ;
    }

    @Override // X.C0IFS
    public final C472280Ifa q6() {
        return this.LLJILLL.LJII;
    }

    @Override // X.C0IFX
    public final void qd() {
        this.LLJILLL.LJJIFFI();
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return this.LLJILLL.LJIJJLI();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(this.LLJILLL.hashCode());
    }

    public LivePlayRootFragment() {
        C475360IkY.LIZ.getClass();
        this.LLJILLL = new C479740Irc(this);
        aS(AFwS278S0000000_32.get$arr$(62));
    }

    @Override // X.InterfaceC479780Irg
    public final FragmentManager GJ() {
        return getChildFragmentManager();
    }

    @Override // X.InterfaceC479780Irg
    public final Context Jh() {
        return getContext();
    }

    @Override // X.InterfaceC479780Irg
    public final C19GS U6() {
        return (C19GS) getActivity();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJILLL.LJJIZ();
    }

    @Override // X.InterfaceC479780Irg
    public final void vQ() {
        List<Fragment> listLJJLIIIJL = getChildFragmentManager().LJJLIIIJL();
        if (!listLJJLIIIJL.isEmpty()) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ(it2.next());
            }
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJILLL.LJJIL, 0, interfaceC362610EJn);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        this.LLJILLL.LJJIJIL(new C475450Ikh(false, this, bundle), bundle, new C521860KdM(this, 8));
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJILLL.LJJIJLIJ).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJILLL.LJJIJLIJ).remove(interfaceC484050IyZ);
    }

    @Override // X.C0IFX
    public final void T8(boolean z) {
        this.LLJILLL.LJJII();
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJILLL.LJJIL.remove(interfaceC362610EJn);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C157W.LIZIZ().LIZ(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJILLL.LJJIL.add(interfaceC362610EJn);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILLL.LJJIJIIJI(false);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLJILLL.LJJIJ(bundle, new ARunnableS76S0200000_7(this, bundle, 27));
    }

    @C14EU
    public final void onEvent(C484240Iys c484240Iys) {
        this.LLJILLL.onEvent(c484240Iys);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onRestoreInstanceState(Bundle bundle) {
        C479740Irc c479740Irc = this.LLJILLL;
        C521860KdM c521860KdM = new C521860KdM(this, 9);
        c479740Irc.getClass();
        c521860KdM.accept(bundle);
        C0IL2.LIZ.LIZJ(bundle);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.LLJILLL.LJJIL(bundle, new C521860KdM(this, 10));
    }

    @C14EU
    public final void receivePauseEvent(C479930Irv c479930Irv) {
        C0IEG c0ieg = this.LLJILLL.LJFF;
        if (c0ieg != null) {
            c0ieg.e0();
        }
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        this.LLJILLL.LJJIIZI = interfaceC342470Dbh;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Iya] */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        C479740Irc c479740Irc = this.LLJILLL;
        ?? r2 = new Object() { // from class: X.0Iya
            public final Object LIZ(Object obj, Object obj2) {
                return super/*androidx.fragment.app.SAFTikTokFragment*/.onKeyDown(((Number) obj).intValue(), (KeyEvent) obj2);
            }
        };
        ArrayList<InterfaceC362610EJn> arrayList = c479740Irc.LJJIL;
        if (arrayList != null) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    return Boolean.TRUE;
                }
            }
        }
        return (Boolean) r2.LIZ(Integer.valueOf(i), keyEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C479740Irc c479740Irc = this.LLJILLL;
        InterfaceC479770Irf interfaceC479770Irf = c479740Irc.LIZIZ;
        if (interfaceC479770Irf instanceof C479790Irh) {
            c479740Irc.LJJIZ = true;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, interfaceC479770Irf.getLayoutId(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Iyb] */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        C479740Irc c479740Irc = this.LLJILLL;
        ?? r2 = new Object() { // from class: X.0Iyb
            public final void LIZ(Object obj, Object obj2, Object obj3) {
                super/*androidx.fragment.app.SAFTikTokFragment*/.onResult(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
            }
        };
        c479740Irc.getClass();
        r2.LIZ(Integer.valueOf(i), Integer.valueOf(i2), intent);
        Iterator it2 = ((ArrayList) c479740Irc.LJJIJLIJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        InterfaceC342470Dbh interfaceC342470Dbh = c479740Irc.LJJIIZI;
        if (interfaceC342470Dbh == null) {
            return true;
        }
        interfaceC342470Dbh.onActivityResult(i, i2, intent);
        return true;
    }
}
