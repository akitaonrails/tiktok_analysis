package com.ss.android.ugc.aweme.refactor.integration;

import X.C0NJH;
import X.C10NW;
import X.C10PO;
import X.C10RT;
import X.C10S5;
import X.C10VW;
import X.C13LE;
import X.C178700mP;
import X.C1848530yCh;
import X.C1869040yjm;
import X.C1911410zq7;
import X.C1912470zrp;
import X.C19240810Pe;
import X.C19286110cl;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C584470Mw9;
import X.C616540OGe;
import X.C806950Vl7;
import X.EnumC2211681BhG;
import X.InterfaceC1740760vOs;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserSignalService;
import com.ss.android.ugc.aweme.journey.NewUserSignalService;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import com.ss.android.ugc.aweme.services.IMainService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class NUJComponentFragment extends AmeBaseFragment {
    public static final /* synthetic */ int LLJ = 0;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public final C19286110cl LL = new C19286110cl(C13LE.LIZ(NUJComponentViewModel.class), new AwS572S0100000_28((Fragment) this, 508), new AwS572S0100000_28((Fragment) this, 507));
    public final CopyOnWriteArrayList<Runnable> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final INewUserSignalService LLIZLLLIL = NewUserSignalService.LIZJ();

    public String RR() {
        return null;
    }

    public static C1912470zrp OR() {
        C10PO.LIZ.getClass();
        return C10PO.LIZ();
    }

    private final void SR() {
        if (this.LLILZLL == 0 || this.LLILZIL == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(MR());
        sbLIZ.append(", onTimerPause");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLILLL = jElapsedRealtime - this.LLILZLL;
        this.LLILZ += jElapsedRealtime - this.LLILZIL;
        this.LLILZIL = jElapsedRealtime;
    }

    public final C10NW MR() {
        NUJComponentViewModel nUJComponentViewModelUR;
        if (getActivity() == null || (nUJComponentViewModelUR = UR()) == null) {
            return null;
        }
        return nUJComponentViewModelUR.LLILLJJLI;
    }

    public final C1869040yjm PR() {
        C10NW c10nwMR = MR();
        if (c10nwMR == null) {
            C1911410zq7.LIZLLL("BaseNUJFragment", "currentData but attachedComponent is null");
            return null;
        }
        C10PO.LIZ.getClass();
        C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
        if (c1912470zrpLIZ != null) {
            return c1912470zrpLIZ.LIZ(c10nwMR);
        }
        return null;
    }

    public final NUJComponentViewModel UR() {
        if (getActivity() != null) {
            return (NUJComponentViewModel) this.LL.getValue();
        }
        C1911410zq7.LIZ("BaseNUJFragment", "safeGetNujComponentViewModel but not attached to an activity, so return null");
        return null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetach ");
        sbLIZ.append(this);
        sbLIZ.append("...");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SR();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartTrackingPerformance ");
        sbLIZ.append(this);
        sbLIZ.append("...");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ));
        C10NW c10nwMR = MR();
        if (c10nwMR != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("nuj_");
            sbLIZ2.append(c10nwMR.getDesc());
            C584470Mw9.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LLILZLL != 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(MR());
            sbLIZ3.append(", onTimerResume");
            C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILZIL = SystemClock.elapsedRealtime();
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(MR());
        sbLIZ4.append(", onTimerStart");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ4));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLILZLL = jElapsedRealtime;
        this.LLILZIL = jElapsedRealtime;
        C10NW c10nwMR2 = MR();
        if (c10nwMR2 != null) {
            NujPerformanceTrackerV2 nujPerformanceTrackerV2 = NujPerformanceTrackerV2.LIZ;
            C0NJH c0njh = C0NJH.RENDER_DURATION;
            String desc = c10nwMR2.getDesc();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.LLIZ;
            nujPerformanceTrackerV2.getClass();
            NujPerformanceTrackerV2.LJFF(c0njh, desc, jElapsedRealtime2, false);
        }
    }

    public final void NR(Boolean bool) {
        String desc;
        String desc2;
        MutableLiveData<C19240810Pe> mutableLiveData;
        boolean zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("complete isSkip:");
        sbLIZ.append(bool);
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ));
        View view = getView();
        if (view != null) {
            C1848530yCh.LJ(AFwS248S0000000_14.get$arr$(313), view);
        }
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(bool, Boolean.FALSE));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("realComplete isAffectFeedContent:");
        sbLIZ2.append(boolValueOf);
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ2));
        SR();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("foreground duration: ");
        C10NW c10nwMR = MR();
        if (c10nwMR != null) {
            desc = c10nwMR.getDesc();
        } else {
            desc = null;
        }
        sbLIZ3.append(desc);
        sbLIZ3.append(", ");
        sbLIZ3.append(this.LLILZ);
        sbLIZ3.append(" millis");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("overall duration: ");
        C10NW c10nwMR2 = MR();
        if (c10nwMR2 != null) {
            desc2 = c10nwMR2.getDesc();
        } else {
            desc2 = null;
        }
        sbLIZ4.append(desc2);
        sbLIZ4.append(", ");
        sbLIZ4.append(this.LLILLL);
        sbLIZ4.append(" millis");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ4));
        NUJComponentViewModel nUJComponentViewModelUR = UR();
        boolean z = false;
        if (nUJComponentViewModelUR != null && (mutableLiveData = nUJComponentViewModelUR.LL) != null) {
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            mutableLiveData.postValue(new C19240810Pe(zBooleanValue));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onStopTrackingPerformance ");
        sbLIZ5.append(this);
        sbLIZ5.append("...");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ5));
        C10NW c10nwMR3 = MR();
        if (c10nwMR3 != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("nuj_");
            sbLIZ6.append(c10nwMR3.getDesc());
            C584470Mw9.LJII(C2188811AlT.LIZIZ(sbLIZ6), null);
        }
        C10NW c10nwMR4 = MR();
        if (c10nwMR4 != null) {
            this.LLIZLLLIL.LIZ(this.LLILZ, c10nwMR4.toString());
            if (c10nwMR4 == C10NW.JOURNEY_INTERESTS_ID || c10nwMR4 == C10NW.JOURNEY_SWIPE_UP_ID) {
                z = true;
            }
            NujPerformanceTrackerV2 nujPerformanceTrackerV2 = NujPerformanceTrackerV2.LIZ;
            C0NJH c0njh = C0NJH.UX_DURATION;
            String desc3 = c10nwMR4.getDesc();
            long j = this.LLILZ;
            nujPerformanceTrackerV2.getClass();
            NujPerformanceTrackerV2.LJFF(c0njh, desc3, j, z);
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(MR());
        sbLIZ7.append(", onTimerReset");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ7));
        this.LLILZ = 0L;
        this.LLILLL = 0L;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttach ");
        sbLIZ.append(this);
        sbLIZ.append("...");
        C1911410zq7.LIZ("BaseNUJFragment", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<Runnable> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLILLJJLI.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C806950Vl7.LIZIZ.LIZ() && (this instanceof InterfaceC1740760vOs)) {
            InterfaceC1740760vOs interfaceC1740760vOs = (InterfaceC1740760vOs) this;
            C10RT c10rt = new C10RT();
            c10rt.LIZ = interfaceC1740760vOs.w3();
            c10rt.LIZJ = interfaceC1740760vOs.getBtmPageCode();
            c10rt.LJIIJJI = C178700mP.LIZ(interfaceC1740760vOs.r9(), c10rt.LJIIJJI);
            if (interfaceC1740760vOs instanceof Activity) {
                c10rt.LIZLLL = EnumC2211681BhG.ACTIVITY;
                c10rt.LJI = new WeakReference<>(interfaceC1740760vOs);
            } else if (interfaceC1740760vOs instanceof Fragment) {
                c10rt.LIZLLL = EnumC2211681BhG.FRAGMENT;
                c10rt.LJFF = new WeakReference<>(interfaceC1740760vOs);
                C19EG activity = ((Fragment) interfaceC1740760vOs).getActivity();
                if (activity != null) {
                    c10rt.LJI = new WeakReference<>(activity);
                }
                if (interfaceC1740760vOs instanceof C10S5) {
                    c10rt.LJIIIZ = true;
                    c10rt.LJIIJ = ((C10S5) interfaceC1740760vOs).pO();
                }
            }
            c10rt.LJ = true;
            C2211631BhB.LJIIJJI(new C10VW(c10rt));
        }
        this.LLIZ = SystemClock.elapsedRealtime();
    }
}
