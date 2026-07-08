package com.ss.android.ugc.aweme.notification.sysnotice;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1218080hnq;
import X.C1238750iLB;
import X.C1246320iXO;
import X.C1246360iXS;
import X.C1246380iXU;
import X.C1246430iXZ;
import X.C1246590iXp;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1618770sE7;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C1902890zcN;
import X.C1903780zdo;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C279950Ay9;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C481090Itn;
import X.C635440OwA;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C913080Zru;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notification.sysnotice.ability.SystemNotificationFragmentScope;
import com.ss.android.ugc.aweme.notification.sysnotice.ability.SystemNotificationPageAbility;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemNotificationFragment extends BaseFragment implements InterfaceC724530SbT, SystemNotificationPageAbility, InterfaceC1740760vOs, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmHELIOSs/MDw9JzElKip9Gzw/PSo+Bio4ICk6KyQ4ICA9DjctLiI2JjE=";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1636));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1647));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1635));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1633));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1634));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1632));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1640));
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SystemNotificationFragment.class, "systemNotificationViewModel", "getSystemNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/sysnotice/vm/SystemNotificationListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SystemNotificationFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b61872";
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
        arrayList.add(SystemNotificationFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SystemNotificationFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -845673579) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public SystemNotificationFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SystemNotificationListViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1641);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(236);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1642), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1643), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1644), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1638));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1639));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1637));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1646));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1645));
    }

    public final C481090Itn UR() {
        return (C481090Itn) this.LLJJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv VR() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIIJIL.getValue();
    }

    public final C1749280vcc WR() {
        return (C1749280vcc) this.LLJJIJI.getValue();
    }

    public final SystemNotificationListViewModel ZR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (SystemNotificationListViewModel) assemVMLazy.getValue();
    }

    public final void LJFF() {
        ZR().manualListRefresh();
        if (((Number) C279950Ay9.LIZ.getValue()).intValue() != 1) {
            C1903780zdo.LIZLLL(((Number) this.LLJ.getValue()).intValue());
            C1246360iXS c1246360iXS = C1902890zcN.LIZ;
            if (c1246360iXS != null) {
                C1903780zdo.LIZIZ(new EntranceKey(c1246360iXS.LIZ, c1246360iXS.LIZIZ));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SNUnsubscribeDataHelper", "clear all");
        C635440OwA.LIZ = null;
        C635440OwA.LIZIZ = null;
        ((ArrayList) C635440OwA.LIZJ).clear();
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        C1902890zcN.LIZ = null;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.sysnotice.ability.SystemNotificationPageAbility
    public final void Pf2(int i) {
        boolean z;
        boolean z2;
        SystemNotificationListViewModel systemNotificationListViewModelZR = ZR();
        systemNotificationListViewModelZR.LLILLJJLI = i;
        ((CopyOnWriteArraySet) systemNotificationListViewModelZR.LLILZ.getValue()).clear();
        List<C1246430iXZ> list = ((C1218080hnq) systemNotificationListViewModelZR.getState()).LLILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1246430iXZ> it2 = list.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            C1246430iXZ next = it2.next();
            int i2 = next.LL;
            if (i2 == systemNotificationListViewModelZR.LLILLJJLI) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new C1246430iXZ(i2, next.LLILLJJLI, next.LLILLL, z2, next.LLILZIL));
        }
        systemNotificationListViewModelZR.setState(new AwS598S0100000_19(arrayList, (List<? extends ProfileComponents>) 622));
        List<InterfaceC1891350zJl> list2 = ((C1218080hnq) ZR().getState()).LL.LLILZ;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabChanged, group: ");
        sbLIZ.append(i);
        sbLIZ.append(", needLoading: ");
        sbLIZ.append(z);
        C1246320iXO.LIZIZ("SystemNotificationFragment", C2188811AlT.LIZIZ(sbLIZ));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvVR = VR();
        if (viewOnAttachStateChangeListenerC20604515jvVR != null) {
            viewOnAttachStateChangeListenerC20604515jvVR.stopScroll();
        }
        if (!z) {
            C481090Itn c481090ItnUR = UR();
            if (c481090ItnUR != null) {
                c481090ItnUR.LJ();
                return;
            }
            return;
        }
        LJFF();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        C1902890zcN.LIZ = new C1246360iXS(((Number) this.LLJI.getValue()).intValue(), (String) this.LLJIJIL.getValue(), (String) this.LLJILJIL.getValue());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C1238750iLB c1238750iLB) {
        C913080Zru.LIZ(this);
    }

    public final int SR(int i, String str) {
        int i2;
        String string;
        Integer numLJIIJJI;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt(str, i);
        } else {
            i2 = i;
        }
        if (i2 == i) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString(str)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                return numLJIIJJI.intValue();
            }
            return i;
        }
        return i2;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1246380iXU c1246380iXU;
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        if (!((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS553S0100000_9(this, 26));
            c0om1.LJ(c1251150ifB);
        }
        C1250250idj c1250250idj = new C1250250idj();
        String strLIZ = (String) this.LLIZLLLIL.getValue();
        if (strLIZ == null) {
            C1246360iXS c1246360iXS = C1902890zcN.LIZ;
            Integer numValueOf = Integer.valueOf(((Number) this.LLJI.getValue()).intValue());
            if (numValueOf == null || (c1246380iXU = (C1246380iXU) ((LinkedHashMap) C1902890zcN.LIZIZ).get(numValueOf)) == null) {
                c1246380iXU = new C1246380iXU();
            }
            strLIZ = c1246380iXU.LIZ();
        }
        c1250250idj.LIZJ = strLIZ;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_gear;
        c1251150ifB2.LIZIZ = "system_notification_settings";
        c1251150ifB2.LIZJ(new AwS553S0100000_9(this, 27));
        c0om1.LIZIZ(c1251150ifB2);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJIII.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLJJIII.getValue();
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(C1618770sE7.LIZ(R.attr.zp));
        }
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.0hnr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218080hnq) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 9), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217371BqR() { // from class: X.0iXX
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218080hnq) obj).LLILZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1218080hnq) obj).LLILZ = (List) obj2;
            }
        }, null, new AwS618S0100000_4(this, 4), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.0hns
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218080hnq) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 7), 6);
        SystemNotificationListViewModel systemNotificationListViewModelZR = ZR();
        int iIntValue = ((Number) this.LLIZ.getValue()).intValue();
        int iIntValue2 = ((Number) this.LLJ.getValue()).intValue();
        systemNotificationListViewModelZR.LLILLJJLI = iIntValue;
        systemNotificationListViewModelZR.LLILLL = iIntValue2;
        C481090Itn c481090ItnUR = UR();
        if (c481090ItnUR != null) {
            c481090ItnUR.setOnRefreshListener(new AwS563S0100000_19(this, 23));
        }
        C1246590iXp.LIZ(VR(), UR());
        C481090Itn c481090ItnUR2 = UR();
        if (c481090ItnUR2 != null) {
            c481090ItnUR2.setNestedScrollEnabledWhenNonTouch(false);
        }
        C1558520qew.LJI(this, SystemNotificationFragmentScope.class, this, SystemNotificationPageAbility.class, null, null);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 275), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a9g, viewGroup, false);
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
