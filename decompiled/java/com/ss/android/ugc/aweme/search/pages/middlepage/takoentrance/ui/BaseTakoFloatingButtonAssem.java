package com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui;

import X.C019F;
import X.C01GW;
import X.C04WK;
import X.C09R3;
import X.C09U0;
import X.C0BCU;
import X.C0H98;
import X.C0P0T;
import X.C0PM7;
import X.C0PRC;
import X.C0Q13;
import X.C0Q7O;
import X.C0QGV;
import X.C0QJB;
import X.C0QJD;
import X.C0QLA;
import X.C0QLB;
import X.C0QOB;
import X.C0QS2;
import X.C0QS3;
import X.C0QS4;
import X.C0QSF;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1397760mTe;
import X.C13LE;
import X.C14TF;
import X.C1608210rx5;
import X.C1637806bA;
import X.C1807670x8n;
import X.C19719912Dl;
import X.C19EG;
import X.C20094413jq;
import X.C20094813ju;
import X.C2082308Dt;
import X.C2166908eJ;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2379309Tz;
import X.C301350BrZ;
import X.C301360Bra;
import X.C337180DJs;
import X.C426750GoL;
import X.C452501pT;
import X.C467860IWi;
import X.C660220Pv2;
import X.C663990Q2r;
import X.C679340Qkm;
import X.C680090Qlz;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1397840mTm;
import X.InterfaceC1146704e9;
import X.InterfaceC1210900hcG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel.TakoButtonViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseTakoFloatingButtonAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1608210rx5 LLIZLLLIL = new C1608210rx5(this, C13LE.LJII(C0QJD.class));
    public final AssemVMLazy LLJ;
    public SearchStartViewModel LLJI;
    public View LLJIJIL;
    public TuxIconView LLJILJIL;
    public C0P0T LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C2379309Tz LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C0QS3 LLJJIJIIJIL;
    public volatile C0QJB LLJJIJIL;
    public volatile C09U0 LLJJJ;
    public volatile C0QOB LLJJJIL;
    public InterfaceC665370Q7z LLJJJJ;
    public C0QSJ LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseTakoFloatingButtonAssem.class, "resultFragmentAbility", "getResultFragmentAbility()Lcom/ss/android/ugc/aweme/search/middle/communicate/ResultPageAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseTakoFloatingButtonAssem.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BaseTakoFloatingButtonAssem.class, "searchKeyboardMonitorAbility", "getSearchKeyboardMonitorAbility()Lcom/ss/android/ugc/aweme/search/common/keyboard/listener/ability/SearchKeyboardMonitorAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BaseTakoFloatingButtonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/middlepage/takoentrance/viewmodel/TakoButtonViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public BaseTakoFloatingButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoButtonViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 561), AFwS241S0000000_10.get$arr$(196), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new C680090Qlz(this));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 560));
        this.LLJJIJIIJIL = new C0QS3(this);
    }

    public abstract int Ho();

    public abstract int Jo();

    public abstract int Lo();

    public final C09U0 So() {
        C09U0 c09u0 = this.LLJJJ;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLJJJ;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LLJJJ = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    public abstract View Zo(ViewStub viewStub);

    public abstract void bp();

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    public void dp() {
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void kp() {
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0QS6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0QS8) obj).LL);
            }
        }, null, new AwS620S0100000_6(this, 58), 6);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0QS7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0QS8) obj).LLILLJJLI);
            }
        }, null, new AwS620S0100000_6(this, 59), 6);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0QS9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QS8) obj).LLILZ);
            }
        }, null, new AwS620S0100000_6(this, 60), 6);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0QSD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0QS8) obj).LLILZLL;
            }
        }, null, new AwS624S0100000_10(this, 41), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0QOB Oo() {
        /*
            r4 = this;
            X.0QOB r0 = r4.LLJJJIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0QOB r0 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJJJJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope> r1 = com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJJJJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0QOB> r0 = X.C0QOB.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0QOB r0 = (X.C0QOB) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJJIL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem.Oo():X.0QOB");
    }

    public final TakoButtonViewModel Vo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (TakoButtonViewModel) assemVMLazy.getValue();
    }

    public void ap() {
        NextLiveData<Integer> nextLiveDataXQ2;
        SearchStartViewModel searchStartViewModel = this.LLJI;
        if (searchStartViewModel != null && (nextLiveDataXQ2 = searchStartViewModel.xQ2()) != null) {
            nextLiveDataXQ2.observe(this, new AObserverS214S0100000_10(this, 36), true);
        }
        Vo().vQ2(Ho(), ((Number) this.LLJJIJI.getValue()).intValue(), 0, 0);
        if (C301350BrZ.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), So().LIZJ, null, new C0H98(this, null), 2);
        } else {
            kp();
        }
        View view = this.LLJIJIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS145S0100000_10(this, 15), view);
        }
    }

    public final int Go() {
        return C0QSF.LIZ() ? C14TF.LIZIZ.LJJLIIIJ().LJ() : C467860IWi.LIZ(getContext()) ? R.raw.icon_bitmap_tako_new_dark : R.raw.icon_bitmap_tako_new_light;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility No() {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r3 = X.C724240Sb0.LJI(r4)
            r2 = 0
            if (r3 == 0) goto L1b
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L4b
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L11:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L30
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L3f
        L1b:
            r3 = r2
        L1c:
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r4)
            if (r0 == 0) goto L28
            X.19EG r2 = r0.getActivity()
        L28:
            r1.getClass()
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIZ(r2, r3)
            return r0
        L30:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1b
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L3f
            goto L1b
        L3d:
            if (r3 == 0) goto L1b
        L3f:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L46
            X.198i r3 = (X.InterfaceC214902198i) r3
            goto L1c
        L46:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L3d
        L4b:
            r1 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem.No():com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility");
    }

    public void ip() {
        Integer numLIZJ;
        Integer numLIZJ2;
        int iIntValue = 0;
        if (C467860IWi.LIZ(getContext())) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zo, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            }
            View view = this.LLJIJIL;
            if (view != null) {
                view.setBackgroundColor(iIntValue);
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context2)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setBackgroundColor(iIntValue);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0QOB c0qobOo = Oo();
        if (c0qobOo != null) {
            c0qobOo.S0(this.LLJJIJIIJIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0QOB c0qobOo = Oo();
        if (c0qobOo != null) {
            c0qobOo.cb(this.LLJJIJIIJIL);
        }
        C0P0T c0p0t = this.LLJILJILJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        this.LLJILJILJ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Vo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Vo();
        if (this.LLJJ) {
            this.LLJJ = false;
            if (C301360Bra.LIZ()) {
                return;
            }
            Vo().xQ2(false);
        }
    }

    public void cp(View view) {
        String string;
        ip();
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            Context context = getContext();
            if (context == null || (string = context.getString(2131824368)) == null) {
                string = "";
            }
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            c1397760mTe.LIZ = string;
            C20094813ju.LIZ(view2, c1397760mTe.LIZ());
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            C337180DJs.LIZ(view3);
        }
        View view4 = this.LLJIJIL;
        if (view4 != null) {
            C426750GoL.LJIIIZ(view4, null, null, Integer.valueOf(Lo()), null, false, 27);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.x7o);
        this.LLJILJIL = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS145S0100000_10(this, 16));
        }
    }

    public void ep(boolean z) {
        String str;
        String str2;
        ISearchContextAbility iSearchContextAbilityNo = No();
        int i = Vo().LLIZLLLIL;
        if (iSearchContextAbilityNo != null) {
            String str3 = ((C0PM7) iSearchContextAbilityNo.uF().LIZJ()).LLILZ;
            String str4 = ((C0PRC) iSearchContextAbilityNo.Ph1().LIZJ()).LLILLJJLI;
            if (str4.length() <= 0) {
                str4 = ((C663990Q2r) iSearchContextAbilityNo.Ww1().LIZJ()).LL;
            }
            if (i != 2) {
                if (i == 1) {
                    str = "search_blankpage_tikbot";
                } else {
                    return;
                }
            } else {
                str = "search_sug_tikbot";
            }
            if (z) {
                str2 = "intro_text";
            } else {
                str2 = "keyboard_above_icon";
            }
            C0Q7O c0q7o = new C0Q7O();
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c0q7o.LJFF("enter_from", str, c2082308Dt);
            c0q7o.LJFF("entrance_type", str2, c2082308Dt);
            c0q7o.LJFF("group_id", str3, c2082308Dt);
            c0q7o.LJFF("enter_from_last_page", str4, c2082308Dt);
            c0q7o.LJIILJJIL();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewStub viewStub;
        super.onViewCreated(view);
        if (((Boolean) C0BCU.LIZ.getValue()).booleanValue()) {
            this.LLJJI = new C2379309Tz();
        }
        C2379309Tz c2379309Tz = this.LLJJI;
        if (c2379309Tz != null) {
            c2379309Tz.LIZ = System.currentTimeMillis();
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewStub) {
            viewStub = (ViewStub) viewLJJIJL;
        } else {
            viewStub = null;
        }
        this.LLJIJIL = Zo(viewStub);
        C2379309Tz c2379309Tz2 = this.LLJJI;
        if (c2379309Tz2 != null) {
            c2379309Tz2.LIZIZ = System.currentTimeMillis() - c2379309Tz2.LIZ;
        }
        C2379309Tz c2379309Tz3 = this.LLJJI;
        if (c2379309Tz3 != null) {
            c2379309Tz3.LIZJ = System.currentTimeMillis();
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            cp(view2);
        }
        C2379309Tz c2379309Tz4 = this.LLJJI;
        if (c2379309Tz4 != null) {
            c2379309Tz4.LIZLLL = System.currentTimeMillis() - c2379309Tz4.LIZJ;
        }
        C2379309Tz c2379309Tz5 = this.LLJJI;
        if (c2379309Tz5 != null) {
            c2379309Tz5.LJ = System.currentTimeMillis();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LLJI = (SearchStartViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZ).get(SearchStartViewModel.class);
        }
        if (!C301350BrZ.LIZ() || C0QGV.LIZIZ() || C04WK.LIZ()) {
            bp();
        }
        ap();
        C2379309Tz c2379309Tz6 = this.LLJJI;
        if (c2379309Tz6 != null) {
            c2379309Tz6.LJFF = System.currentTimeMillis() - c2379309Tz6.LJ;
            C09U0 c09u0 = c2379309Tz6.LJI;
            if (c09u0 == null) {
                synchronized (c2379309Tz6) {
                    c09u0 = c2379309Tz6.LJI;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        c2379309Tz6.LJI = c09u0;
                    }
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(c09u0.LIZ), null, null, new C2166908eJ(c2379309Tz6, null), 3);
        }
    }

    public final void hp(boolean z, C0QS4 c0qs4) {
        String str;
        ISearchContextAbility iSearchContextAbilityNo = No();
        int i = Vo().LLIZLLLIL;
        if (iSearchContextAbilityNo != null) {
            String str2 = ((C0PM7) iSearchContextAbilityNo.uF().LIZJ()).LLILZ;
            String str3 = ((C0PRC) iSearchContextAbilityNo.Ph1().LIZJ()).LLILLJJLI;
            if (str3.length() <= 0) {
                str3 = ((C663990Q2r) iSearchContextAbilityNo.Ww1().LIZJ()).LL;
            }
            if (i != 2) {
                if (i == 1) {
                    str = "search_blankpage_tikbot";
                } else {
                    return;
                }
            } else {
                str = "search_sug_tikbot";
            }
            C0Q13 c0q13 = new C0Q13();
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c0q13.LJFF("enter_from", str, c2082308Dt);
            c0q13.LJFF("entrance_type", c0qs4.getValue(), c2082308Dt);
            c0q13.LJFF("group_id", str2, c2082308Dt);
            c0q13.LJFF("last_feed_group_id", str2, c2082308Dt);
            c0q13.LJFF("enter_from_last_page", str3, c2082308Dt);
            c0q13.LIZLLL(z ? 1 : 0, "is_voice_bubble");
            c0q13.LJIILJJIL();
        }
    }

    public final void lp(View view, boolean z, boolean z2) {
        long j;
        if (view == null || C660220Pv2.LIZ(view)) {
            return;
        }
        SearchStartViewModel searchStartViewModel = this.LLJI;
        boolean z3 = false;
        if (searchStartViewModel != null && searchStartViewModel.LL) {
            j = 200;
        } else {
            j = 0;
        }
        KeyboardUtils.LIZIZ(view);
        ISearchContextAbility iSearchContextAbilityNo = No();
        if (iSearchContextAbilityNo == null) {
            return;
        }
        String str = ((C0PRC) iSearchContextAbilityNo.Ph1().LIZJ()).LLILLJJLI;
        if (str.length() > 0) {
            z3 = true;
        }
        if (!z3) {
            str = ((C663990Q2r) iSearchContextAbilityNo.Ww1().LIZJ()).LL;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0QS2(j, this, z, str, z2, null), 3);
        if (Vo().LLIZLLLIL == 1) {
            iSearchContextAbilityNo.Xf0().LIZ(new C0QLA(true));
        } else if (Vo().LLIZLLLIL == 2) {
            iSearchContextAbilityNo.Xf0().LIZ(new C0QLB(true));
        }
        this.LLJJ = true;
    }
}
