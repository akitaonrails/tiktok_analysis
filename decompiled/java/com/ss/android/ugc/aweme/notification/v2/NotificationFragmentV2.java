package com.ss.android.ugc.aweme.notification.v2;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C07P9;
import X.C098200Yq;
import X.C0QSJ;
import X.C0Z3L;
import X.C1238750iLB;
import X.C1246860iYG;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1387300mCm;
import X.C13LE;
import X.C14EU;
import X.C1508630pMT;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1868400yik;
import X.C1889530zGp;
import X.C189200o6;
import X.C1900870zZ7;
import X.C1900960zZG;
import X.C1901130zZX;
import X.C1901380zZw;
import X.C1901580zaG;
import X.C1902490zbj;
import X.C1902850zcJ;
import X.C1902900zcO;
import X.C1904270zeb;
import X.C1904510zez;
import X.C1905460zgW;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20673215v0;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2393509Zl;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C913080Zru;
import X.C987103tV;
import X.EnumC1901370zZv;
import X.InterfaceC1146704e9;
import X.InterfaceC1900470zYT;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationFragmentV2 extends BaseFragment implements InterfaceC21503819Do, C0QSJ, InterfaceC1146704e9 {
    public static final C1889530zGp LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISHELIOSYtPSY8Jms6e2EdJzElLyYwKTElJiEVOiQrJCo9PBN+";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 360));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 802));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(292));
    public final AssemVMLazy LLJI;
    public InterfaceC1900470zYT LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationFragmentV2.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new C1889530zGp();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1900470zYT.class) {
            this.LLJIJIL = (InterfaceC1900470zYT) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CreatorNoticeTabScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1900470zYT.class) {
            return this.LLJIJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreatorNoticeTabScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreatorNoticeTabScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1900470zYT.class) {
            this.LLJIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public NotificationFragmentV2() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 803);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(173);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 357), aFwS271S0000000_28, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS572S0100000_28((Fragment) this, 358), aFwS271S0000000_28, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 359), aFwS271S0000000_28, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
        LLJILJIL.getClass();
        C1889530zGp.LIZ("NotificationFragmentV2", "init");
        C1901380zZw.LIZ.getClass();
        if (C1901380zZw.LIZ()) {
            EnumC1901370zZv.LLILZLL.LJFF();
        }
        if (LLIL()) {
            if (C1901380zZw.LIZ()) {
                EnumC1901370zZv.LLJILLL.LJII(1);
            }
        } else if (C1901380zZw.LIZ()) {
            EnumC1901370zZv.LLJILLL.LJII(0);
        }
    }

    public final boolean LLIL() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!LLIL()) {
            NoticeVideoManager.LJ();
            Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(R.layout.a9c), Integer.valueOf(R.layout.a9d), Integer.valueOf(R.layout.aaj)).iterator();
            while (it2.hasNext()) {
                C20673215v0.LJIIIIZZ(((Number) it2.next()).intValue());
            }
        }
        C1902490zbj.LIZJ("new_activities");
        EventBus.LIZLLL().LJJI(this);
        C1901380zZw.LIZ.getClass();
        C1901380zZw.LIZIZ();
        C1901130zZX c1901130zZX = C1901130zZX.LIZJ;
        synchronized (c1901130zZX) {
            C1900960zZG c1900960zZGLJ = c1901130zZX.LJ();
            if (c1900960zZGLJ != null) {
                c1900960zZGLJ.LIZLLL();
            }
        }
        C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJII().LIZ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!LLIL()) {
            C1901580zaG.LIZ.getClass();
            C1901580zaG.LJI().storeLong("last_visit_activity_subpage", Calendar.getInstance().getTimeInMillis() / 1000);
            C1902850zcJ.LIZ.getClass();
            if (C1902850zcJ.LIZJ != -1) {
                long jCurrentTimeMillis = System.currentTimeMillis() - C1902850zcJ.LIZJ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                c2344009Gk.LJIIIIZZ("position", "new_activities");
                C20684815ws.LJIILLIIL("page_stay_time", c2344009Gk.LIZ);
            }
            C1902850zcJ.LIZJ = -1L;
        }
        C1902900zcO.LIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Bundle arguments = getArguments();
        if ((arguments == null || !arguments.getBoolean("embedded_mode", false)) && !C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            C1900870zZ7.LIZ = null;
            C1900870zZ7.LIZIZ = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Bundle arguments = getArguments();
        if ((arguments == null || !arguments.getBoolean("embedded_mode", false)) && !C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            C1900870zZ7.LIZ = "new_activities";
            C1900870zZ7.LIZIZ = "new_activities";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIL(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1904510zez.LJFF.LJFF();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Integer numValueOf = Integer.valueOf(R.layout.aaj);
        Iterator it2 = C1697810uHb.LJ(Integer.valueOf(R.layout.a9c), Integer.valueOf(R.layout.a9d), numValueOf, numValueOf, numValueOf).iterator();
        while (it2.hasNext()) {
            C20673215v0.LJI(((Number) it2.next()).intValue(), activity);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 172(0xac, float:2.41E-43)
            kotlin.jvm.internal.AFwS271S0000000_28 r0 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r4.NR(r0)
            super.onCreate(r5)
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZLLL()
            r0.LJIJJ(r4)
            android.os.Bundle r1 = r4.getArguments()
            r3 = 0
            if (r1 == 0) goto L32
            java.lang.String r0 = "embedded_mode"
            boolean r0 = r1.getBoolean(r0, r3)
        L20:
            r2 = 0
            if (r0 != 0) goto L5d
            X.0iYG r1 = X.C1246860iYG.LIZ
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L3d
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L3d
            goto L34
        L32:
            r0 = 0
            goto L20
        L34:
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L39
            goto L3e
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3d:
            r0 = r2
        L3e:
            r1.getClass()
            X.C1246860iYG.LIZ(r0)
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L59
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L59
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L55
            goto L5a
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L59:
            r0 = r2
        L5a:
            X.C1246860iYG.LIZIZ(r4, r0, r3)
        L5d:
            com.bytedance.android.btm.api.BtmSDK r1 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            java.lang.String r0 = "a2270.b7107"
            r1.registerBtmPageOnCreate(r4, r0, r2)
            java.lang.String r0 = "new_activities"
            X.C1902490zbj.LIZIZ(r0)
            boolean r0 = r4.LLIL()
            if (r0 != 0) goto L7f
            com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager$InnerManager r2 = com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.LIZ()
            if (r2 == 0) goto L7f
            kotlin.jvm.internal.AwS572S0100000_28 r1 = new kotlin.jvm.internal.AwS572S0100000_28
            r0 = 328(0x148, float:4.6E-43)
            r1.<init>(r2, r0)
            X.C2252408s6.LJIIIZ(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2.onCreate(android.os.Bundle):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoRepostToastEvent(C2393509Zl c2393509Zl) {
        C1387300mCm.LIZIZ.LJFF(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
        C913080Zru.LIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        Bundle extras;
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("embedded_mode", false)) {
            C1246860iYG c1246860iYG = C1246860iYG.LIZ;
            Bundle extras2 = null;
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
            } else {
                extras = null;
            }
            c1246860iYG.getClass();
            C1246860iYG.LIZ(extras);
            if (intent != null) {
                try {
                    extras2 = intent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            C1246860iYG.LIZIZ(this, extras2, 0);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        View viewFindViewById;
        Integer numLIZJ;
        String string;
        Integer numLJIIJJI;
        int i;
        super.onViewCreated(view, bundle);
        C1508630pMT.LIZ.getClass();
        C1508630pMT.LIZIZ = SystemClock.uptimeMillis();
        Bundle arguments = getArguments();
        int iIntValue = Integer.MIN_VALUE;
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("filter_type", Integer.MIN_VALUE));
        } else {
            numValueOf = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            numValueOf2 = Integer.valueOf(arguments2.getInt("list_type", Integer.MIN_VALUE));
        } else {
            numValueOf2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (i = arguments3.getInt("group", -1)) != -1) {
            C1904270zeb.LIZJ = i;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("landing_tab_id")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            iIntValue = numLJIIJJI.intValue();
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z = arguments5.getBoolean("embedded_mode", false);
        } else {
            z = false;
        }
        Context context = view.getContext();
        if (context != null) {
            C1905460zgW.LIZ = C1905460zgW.LIZJ(context);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            TuxIconView tuxIconView = (TuxIconView) this.LLIZLLLIL.getValue();
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context2)) != null) {
                view.setBackgroundColor(numLIZJ.intValue());
            }
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) this.LLIZLLLIL.getValue();
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxIconView tuxIconView3 = (TuxIconView) this.LLIZLLLIL.getValue();
            if (tuxIconView3 != null) {
                C786410Ut5.a9(tuxIconView3, new ACListenerS162S0100000_28(this, 110));
            }
        }
        if (z && (viewFindViewById = view.findViewById(R.id.pep)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (!LLIL()) {
            C07P9.LIZ(getActivity());
            C1902850zcJ.LIZ.getClass();
            C1902850zcJ.LIZ();
            C1902850zcJ.LIZJ = System.currentTimeMillis();
        }
        C1868400yik c1868400yik = new C1868400yik(LLIL(), z, numValueOf2, numValueOf, iIntValue);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        ((NotificationFragmentV2ViewModel) assemVMLazy.getValue()).LL = c1868400yik;
        C723850SaN.LIZ(this, false, null, new AwS390S0200000_24(this, c1868400yik, 19), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C0Z3L.LIZ(C786410Ut5.ne(getContext()), R.layout.a9c, viewGroup);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
