package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0OPX;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C338490DOt;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C604750Nnl;
import X.C617180OIq;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC617160OIo;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.InterfaceC836760Ws6;
import Y.AObjectS384S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinSettingsChildFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC21503819Do, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSHELIOSM2PCwiZw0mJCkpPSY9GyA4PSY9LzYPISY/LAM+KCg+LSs4";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 260));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 252));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 253));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 251));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 250));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 243));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 247));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 245));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 246));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 248));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 249));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 244));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 254));
    public final C736950SvV LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public C127G LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinSettingsChildFragment.class, "childViewModel", "getChildViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinSettingsChildViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public BulletinSettingsChildFragment() {
        AssemVMLazy assemVMLazy;
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 255);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(165);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJIL = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, c451460Hn6, c451620HnM, c338520DOw);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinSettingsChildViewModel.class);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c19719912DlLIZ2, 256);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(164);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 257), aFwS240S0000000_92, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new AwS553S0100000_9((Fragment) this, 258), aFwS240S0000000_92, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 259), aFwS240S0000000_92, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 261));
    }

    public final BulletinSettingsChildViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (BulletinSettingsChildViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC21503819Do
    public final void onActivityFinish() throws Throwable {
        Intent intent = new Intent();
        Boolean bool = SR().LLILZIL;
        if (bool != null) {
            intent.putExtra("live_room_auto_share_enable", bool.booleanValue());
        }
        Boolean bool2 = SR().LLILZLL;
        if (bool2 != null) {
            intent.putExtra("live_event_auto_share_enable", bool2.booleanValue());
        }
        intent.putExtra("comment_enable", String.valueOf(SR().LLIZ));
        intent.putExtra("download_enable", SR().LLIZLLLIL);
        C19EG activity = getActivity();
        if (activity != null) {
            C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1njMfqUAiY8ib0XAKfy341u09Izp1aK9KliTGerI", null));
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinSettingsChildViewModel.class, new AObjectS384S0100000_9(this, 38)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(this.LLJJIJIL.getValue(), InterfaceC617160OIo.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS240S0000000_9.get$arr$(163));
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(this.LLJJIJIL.getValue(), InterfaceC617160OIo.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        boolean z;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        BulletinSettingsChildViewModel bulletinSettingsChildViewModelSR = SR();
        Integer num = (Integer) this.LLJJI.getValue();
        String str = (String) this.LLJJIII.getValue();
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.LLJJIJI.getValue();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) this.LLJJIJIIJIL.getValue();
        if (str3 == null) {
            str3 = "";
        }
        Boolean bool = (Boolean) this.LLIZLLLIL.getValue();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = (Boolean) this.LLJ.getValue();
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Boolean bool3 = (Boolean) this.LLJI.getValue();
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        Boolean bool4 = (Boolean) this.LLJIJIL.getValue();
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        Boolean bool5 = (Boolean) this.LLJILJIL.getValue();
        if (bool5 != null) {
            zBooleanValue5 = bool5.booleanValue();
        } else {
            zBooleanValue5 = false;
        }
        Boolean bool6 = (Boolean) this.LLJILJILJ.getValue();
        Boolean bool7 = (Boolean) this.LLJJ.getValue();
        if (bool7 != null) {
            zBooleanValue6 = bool7.booleanValue();
        } else {
            zBooleanValue6 = true;
        }
        Boolean bool8 = (Boolean) this.LLJILLL.getValue();
        if (bool8 != null) {
            zBooleanValue7 = bool8.booleanValue();
        } else {
            zBooleanValue7 = false;
        }
        bulletinSettingsChildViewModelSR.LLILZ = new C617180OIq(num, str, str2, str3, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6, zBooleanValue6, zBooleanValue7);
        bulletinSettingsChildViewModelSR.LLILZIL = Boolean.valueOf(zBooleanValue2);
        bulletinSettingsChildViewModelSR.LLILZLL = Boolean.valueOf(zBooleanValue3);
        bulletinSettingsChildViewModelSR.LLJI = Boolean.valueOf(zBooleanValue5);
        bulletinSettingsChildViewModelSR.LLIZ = bool6;
        bulletinSettingsChildViewModelSR.LLIZLLLIL = Boolean.valueOf(zBooleanValue6);
        bulletinSettingsChildViewModelSR.LLJIJIL = Boolean.valueOf(zBooleanValue7);
        C604750Nnl.LIZ.getClass();
        bulletinSettingsChildViewModelSR.LLJ = Boolean.valueOf(C604750Nnl.LIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSettingsChildViewModel init autoSharePostEnable = ");
        sbLIZ.append(bulletinSettingsChildViewModelSR.LLJ);
        sbLIZ.append(", autoSharePostNeedHighlight = ");
        sbLIZ.append(bulletinSettingsChildViewModelSR.LLJI);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJJIL.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(true);
            Context context = tuxNavBar.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context)) != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            String str4 = (String) this.LLIZ.getValue();
            if (str4 == null) {
                str4 = "";
            }
            c1250250idj.LIZJ = str4;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1227));
            z = false;
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        } else {
            z = false;
        }
        C723850SaN.LIZ(this, z, null, new AwS581S0100000_2(this, 241), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a8c, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
