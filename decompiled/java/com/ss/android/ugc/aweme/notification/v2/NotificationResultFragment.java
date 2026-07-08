package com.ss.android.ugc.aweme.notification.v2;

import X.AbstractC1585810rMx;
import X.AbstractC21674019s2;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C09R7;
import X.C0QSJ;
import X.C0Z3L;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1246590iXp;
import X.C1273904yf;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1889530zGp;
import X.C1890620zIa;
import X.C1890720zIk;
import X.C1890750zIn;
import X.C189200o6;
import X.C1900580zYe;
import X.C1900970zZH;
import X.C1901260zZk;
import X.C1901380zZw;
import X.C1901440za2;
import X.C1901500za8;
import X.C1902470zbh;
import X.C1902510zbl;
import X.C1905460zgW;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1BNE;
import X.C20600815jK;
import X.C20600915jL;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2252408s6;
import X.C2450909j1;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C481090Itn;
import X.C665740Q9k;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C866950Xzh;
import X.C987103tV;
import X.EnumC1599580rjA;
import X.EnumC1901370zZv;
import X.EnumC1906270zhp;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1349380lDc;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC1901490za7;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC19333810kS;
import Y.AObserverS188S0200000_28;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationResultFragmentScope;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.notification.v2.assem.ResultFragmentData;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class NotificationResultFragment extends Fragment implements InterfaceC1206390hUz, NotificationAbilityCenter.INotificationFragmentAbility, InterfaceC1901490za7, InterfaceC1349380lDc, InterfaceC724530SbT, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSHELIOSY8Jms6e2EdJzElLyYwKTElJiEBLTY5JTsVOiQrJCo9PA==";
    public FrameLayout LL;
    public C481090Itn LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public InboxWidgetContainer LLILZ;
    public ResultFragmentData LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C2252321DDq LLJIJIL;
    public C1901500za8 LLJILJIL;
    public String LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationResultFragment.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NotificationResultFragment.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/BaseNotificationResultViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{NotificationResultFragmentScope.class});
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
        arrayList.add(NotificationResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NotificationResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1558906226) {
            return null;
        }
        return this;
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

    public NotificationResultFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 804);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(174);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 365), aFwS271S0000000_28, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS572S0100000_28((Fragment) this, 366), aFwS271S0000000_28, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 367), aFwS271S0000000_28, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 364);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BaseNotificationResultViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 805);
        AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(175);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), awS572S0100000_28, aFwS271S0000000_282, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            z3 = true;
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, awS572S0100000_28, aFwS271S0000000_282, null, null, null);
        } else {
            z3 = true;
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS572S0100000_28, aFwS271S0000000_282, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZ = assemVMLazy2;
        this.LLJ = z3;
        this.LLJI = z3;
        this.LLJIJIL = C1BNE.LIZ(Boolean.FALSE);
        this.LLJILJILJ = "";
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 361));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 362));
        NotificationFragmentV2.LLJILJIL.getClass();
        C1889530zGp.LIZ("NotificationResultFragment", "init");
    }

    public final void LJFF() {
        EnumC1599580rjA enumC1599580rjA = EnumC1599580rjA.PULL_TO_REFRESH;
        String str = this.LLJILJILJ;
        if (str.length() == 0) {
            ResultFragmentData resultFragmentData = this.LLILZIL;
            str = (resultFragmentData == null || !resultFragmentData.isAllTab) ? "refresh" : "refresh_all";
        }
        enumC1599580rjA.setDetail(str);
        this.LLJILJILJ = "";
        if (C1901260zZk.LIZ()) {
            OR(enumC1599580rjA.getDetail());
        }
        InboxWidgetContainer inboxWidgetContainer = this.LLILZ;
        if (inboxWidgetContainer != null) {
            inboxWidgetContainer.vo(enumC1599580rjA);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR = NR();
        if (viewOnAttachStateChangeListenerC20604515jvNR != null) {
            C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jvNR);
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        }
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        this.LLJIJIL.setValue(Boolean.FALSE);
    }

    public final C481090Itn MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pes) : null;
            this.LLILLJJLI = (C481090Itn) viewFindViewById;
        }
        return (C481090Itn) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pex) : null;
            this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final boolean Nm1() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final void lL0() {
        C481090Itn c481090ItnMR = MR();
        if (c481090ItnMR != null) {
            HandlerHook.viewPost(c481090ItnMR, new ARunnableS128S0100000_28(this, 50));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C1890720zIk.LIZ().enable) {
            C1890620zIa c1890620zIa = (C1890620zIa) this.LLJILLL.getValue();
            c1890620zIa.LJIIIIZZ = 0L;
            c1890620zIa.LJ = C13BV.INSTANCE;
        }
        if (C1901260zZk.LIZ()) {
            C1901440za2.LIZ.getClass();
            C1901440za2.LIZLLL = 0;
            C1901440za2.LJ = null;
            C1901440za2.LJFF = 0;
            C1901440za2.LIZIZ.clear();
            C1901440za2.LIZJ.clear();
            C1901440za2.LJIIIIZZ = false;
            C1901440za2.LJIIIZ = -1;
            Boolean bool = Boolean.FALSE;
            C2450909j1.LIZIZ(new AwS156S0400000_28((Integer) (-1), C1901440za2.LJI.getValue(), bool, bool, 8));
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final ViewOnAttachStateChangeListenerC20604515jv qp() {
        return NR();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final C2252321DDq X71() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1901490za7
    public final EnumC1906270zhp wj() {
        return EnumC1906270zhp.NEW_ACTIVITY;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final void MF2(boolean z) {
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNeedRefresh, needRefresh = ");
        sbLIZ.append(z);
        sbLIZ.append(", resultFragmentData = ");
        sbLIZ.append(this.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationResultFragment", strLIZIZ);
        this.LLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final void Mv(InboxWidgetContainer inboxWidgetContainer) {
        this.LLILZ = inboxWidgetContainer;
    }

    public final void OR(String str) {
        Boolean boolValueOf;
        NotificationCreatorResultViewModel notificationCreatorResultViewModel;
        List<Integer> list;
        C1901440za2 c1901440za2 = C1901440za2.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initOrFloatingBubbleManagerIfNeed, isAllTab: ");
        ResultFragmentData resultFragmentData = this.LLILZIL;
        if (resultFragmentData != null) {
            boolValueOf = Boolean.valueOf(resultFragmentData.isAllTab);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", reason: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1901440za2.getClass();
        C1901440za2.LJIIJ(strLIZIZ);
        ResultFragmentData resultFragmentData2 = this.LLILZIL;
        if (resultFragmentData2 != null && resultFragmentData2.isAllTab) {
            NotificationAbilityCenter.LIZ.getClass();
            if (!C1900580zYe.LIZIZ.contains(str) || (Intrinsics.LJFF(str, "change_tab") && this.LLJI)) {
                AssemVMLazy assemVMLazy = this.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
                BaseNotificationResultViewModel baseNotificationResultViewModel = (BaseNotificationResultViewModel) assemVMLazy.getValue();
                if (!(baseNotificationResultViewModel instanceof NotificationCreatorResultViewModel) || (notificationCreatorResultViewModel = (NotificationCreatorResultViewModel) baseNotificationResultViewModel) == null || (list = notificationCreatorResultViewModel.LLJ) == null || !C866950Xzh.LIZIZ(list)) {
                    C1901500za8 c1901500za8 = this.LLJILJIL;
                    if (c1901500za8 == null) {
                        return;
                    }
                    c1901500za8.LJIIIIZZ = true;
                    c1901500za8.LIZ();
                    C1901440za2.LJIIIIZZ = false;
                    C1901440za2.LJIIIZ = -1;
                    Boolean bool = Boolean.FALSE;
                    C1901440za2.LJI(c1901440za2, null, bool, bool, 1);
                    return;
                }
            }
        }
        C1901500za8 c1901500za82 = this.LLJILJIL;
        if (c1901500za82 != null) {
            c1901500za82.LJIIIIZZ = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Other RefreshType in :");
        sbLIZ2.append(str);
        c1901440za2.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void PR(boolean z) {
        LinearLayoutManager linearLayoutManager;
        List<T> list;
        List<T> list2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR = NR();
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jvNR.getLayoutManager();
        Object obj = null;
        if ((layoutManager instanceof FixedLinearlayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (z) {
                C20600915jL value = viewOnAttachStateChangeListenerC20604515jvNR.getState().LIZIZ.getValue();
                if (value != null && (list2 = value.LIZ) != 0) {
                    obj = ListProtector.get(list2, iFindLastVisibleItemPosition);
                }
                if (obj instanceof C1273904yf) {
                    C1901440za2.LIZ.getClass();
                    C1901440za2.LJIIIIZZ = true;
                    C1901440za2.LJIIIZ = iFindLastVisibleItemPosition;
                    C1901500za8 c1901500za8 = this.LLJILJIL;
                    if (c1901500za8 != null) {
                        C786410Ut5.LLZILL((TuxSpinner) c1901500za8.LJI.getValue(), 0);
                        C786410Ut5.LLD(8, c1901500za8.LJ());
                        c1901500za8.LJ().pauseAnimation();
                        return;
                    }
                    return;
                }
            }
            C20600915jL value2 = viewOnAttachStateChangeListenerC20604515jvNR.getState().LIZIZ.getValue();
            if (value2 == null || (list = value2.LIZ) == 0) {
                return;
            }
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) listIterator.previous();
                if (interfaceC1891350zJl instanceof C1900970zZH) {
                    C1901440za2.LIZ.getClass();
                    if (C1901440za2.LIZIZ.contains(((C1900970zZH) interfaceC1891350zJl).LL.nid)) {
                        int iNextIndex = listIterator.nextIndex();
                        if (iNextIndex <= 0) {
                            return;
                        }
                        ((AbstractC21674019s2) this.LLJJ.getValue()).LIZ = iNextIndex;
                        RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jvNR.getLayoutManager();
                        if (layoutManager2 == null) {
                            return;
                        }
                        layoutManager2.startSmoothScroll((AbstractC21674019s2) this.LLJJ.getValue());
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final void Pd0(List<? extends InterfaceC1891350zJl> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshList, dataList.size = ");
        sbLIZ.append(list.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationResultFragment", strLIZIZ);
        C1901380zZw.LIZ.getClass();
        if (C1901380zZw.LIZ()) {
            EnumC1901370zZv.LLJ.LJI();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR = NR();
        if (viewOnAttachStateChangeListenerC20604515jvNR != null && (state = viewOnAttachStateChangeListenerC20604515jvNR.getState()) != null) {
            state.LJIILL(list, null);
        }
        C2252408s6.LJII(new AwS429S0200000_28(this, (NotificationResultFragment) list, (List<? extends InterfaceC1891350zJl>) 40));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ResultFragmentData resultFragmentData;
        super.onCreate(bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, NotificationAbilityCenter.INotificationFragmentAbility.class, null, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            resultFragmentData = (ResultFragmentData) arguments.getParcelable("power_viewpager_default_key");
        } else {
            resultFragmentData = null;
        }
        this.LLILZIL = resultFragmentData;
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 163), 3);
        C1890750zIn c1890750zIn = C1890750zIn.LIZIZ;
        if (C1890720zIk.LIZ().enable) {
            ((C1890620zIa) this.LLJILLL.getValue()).LJFF(c1890750zIn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    @Override // X.InterfaceC1206390hUz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r6) {
        /*
            r5 = this;
            X.1DDq r1 = r5.LLJIJIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            com.ss.android.ugc.aweme.notification.v2.assem.ResultFragmentData r0 = r5.LLILZIL
            r4 = 0
            if (r0 == 0) goto L45
            boolean r1 = r0.isCreator
            r0 = 1
            if (r1 != r0) goto L45
        L11:
            java.lang.String r3 = "NotificationResultFragment"
            if (r0 == 0) goto L47
            X.0zGp r2 = com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2.LLJILJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "selectedPageForCreator, isFirstSelect = "
            r1.append(r0)
            boolean r0 = r5.LLJI
            r1.append(r0)
            java.lang.String r0 = ", needRefresh = "
            r1.append(r0)
            boolean r0 = r5.LLJ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C1889530zGp.LIZ(r3, r0)
            boolean r0 = r5.LLJ
            if (r0 == 0) goto L44
            r5.LLJ = r4
            java.lang.String r0 = "change_tab"
            r5.qf2(r0)
        L44:
            return
        L45:
            r0 = 0
            goto L11
        L47:
            X.0zGp r2 = com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2.LLJILJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "selectedPageForNormal, isFirstSelect = "
            r1.append(r0)
            boolean r0 = r5.LLJI
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C1889530zGp.LIZ(r3, r0)
            boolean r0 = r5.LLJI
            if (r0 == 0) goto L6b
            java.lang.String r0 = "first_refresh"
        L67:
            r5.qf2(r0)
            return
        L6b:
            java.lang.String r0 = "refresh"
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.v2.NotificationResultFragment.onPageSelected(int):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter.INotificationFragmentAbility
    public final void qf2(String str) {
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manuallyRefresh, isFirstSelect = ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", detailReason = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationResultFragment", strLIZIZ);
        if (C1901260zZk.LIZ()) {
            OR(str);
        }
        this.LLJILJILJ = str;
        if (!this.LLJI && !Intrinsics.LJFF(str, "change_tab")) {
            C481090Itn c481090ItnMR = MR();
            if (c481090ItnMR != null) {
                HandlerHook.viewPost(c481090ItnMR, new ARunnableS124S0100000_24(c481090ItnMR, 65));
                return;
            }
            return;
        }
        this.LLJI = false;
        LJFF();
    }

    @Override // X.InterfaceC1349380lDc
    public final void Qf(RecyclerView.ViewHolder viewHolder, boolean z) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR;
        int i;
        if (viewHolder == null || (viewOnAttachStateChangeListenerC20604515jvNR = NR()) == null) {
            return;
        }
        if (z) {
            Rect rectLIZIZ = C665740Q9k.LIZIZ(viewHolder);
            if (rectLIZIZ != null) {
                int[] iArr = new int[2];
                viewOnAttachStateChangeListenerC20604515jvNR.getLocationOnScreen(iArr);
                i = rectLIZIZ.top - iArr[1];
                int iComputeVerticalScrollRange = (viewOnAttachStateChangeListenerC20604515jvNR.computeVerticalScrollRange() - viewOnAttachStateChangeListenerC20604515jvNR.computeVerticalScrollOffset()) - viewOnAttachStateChangeListenerC20604515jvNR.getHeight();
                if (iComputeVerticalScrollRange <= 0) {
                    iComputeVerticalScrollRange = 0;
                }
                if (i > iComputeVerticalScrollRange) {
                    viewOnAttachStateChangeListenerC20604515jvNR.animate().translationY(iComputeVerticalScrollRange - i).setDuration(300L).start();
                    i = iComputeVerticalScrollRange;
                }
            } else {
                i = 0;
            }
            this.LLIZLLLIL = i;
        } else {
            viewOnAttachStateChangeListenerC20604515jvNR.animate().translationY(0.0f).setDuration(300L).start();
            i = -this.LLIZLLLIL;
            this.LLIZLLLIL = 0;
        }
        viewOnAttachStateChangeListenerC20604515jvNR.smoothScrollBy(0, i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ResultFragmentData resultFragmentData;
        List<C13IQ<? extends PowerCell<?>>> listFo;
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        if (context != null) {
            C1905460zgW.LIZ = C1905460zgW.LIZJ(context);
        }
        C481090Itn c481090ItnMR = MR();
        if (c481090ItnMR != null) {
            c481090ItnMR.setNestedScrollEnabledWhenNonTouch(false);
            c481090ItnMR.setOnRefreshListener(new AwS572S0100000_28(this, 787));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR = NR();
        if (viewOnAttachStateChangeListenerC20604515jvNR != null) {
            viewOnAttachStateChangeListenerC20604515jvNR.setLayoutManager(new FixedLinearlayoutManager(viewOnAttachStateChangeListenerC20604515jvNR.getContext()));
            C1246590iXp.LIZ(viewOnAttachStateChangeListenerC20604515jvNR, MR());
            viewOnAttachStateChangeListenerC20604515jvNR.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0zka
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    NoticeVideoManager.InnerManager innerManagerLIZ = NoticeVideoManager.LIZ();
                    if (innerManagerLIZ != null) {
                        innerManagerLIZ.LLJ = z;
                        if (!z) {
                            NoticeVideoManager.LL.getClass();
                            innerManagerLIZ.sendEmptyMessageDelayed(0, NoticeVideoManager.LIZIZ().alignmentDelay / ((long) 2));
                            innerManagerLIZ.LJIJ();
                        }
                    }
                }
            });
            viewOnAttachStateChangeListenerC20604515jvNR.addOnScrollListener(new C1902510zbl(viewOnAttachStateChangeListenerC20604515jvNR.getContext()));
            viewOnAttachStateChangeListenerC20604515jvNR.setClipToPadding(false);
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).LIZIZ(NR(), "mus_new_notification");
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvNR2 = NR();
            if (viewOnAttachStateChangeListenerC20604515jvNR2 != null) {
                viewOnAttachStateChangeListenerC20604515jvNR2.addOnScrollListener(new C1902470zbh("mus_new_notification"));
            }
            InboxWidgetContainer inboxWidgetContainer = this.LLILZ;
            if (inboxWidgetContainer != null && (listFo = inboxWidgetContainer.fo()) != null) {
                Iterator<C13IQ<? extends PowerCell<?>>> it2 = listFo.iterator();
                while (it2.hasNext()) {
                    viewOnAttachStateChangeListenerC20604515jvNR.LJIILJJIL(C09R7.LIZ(it2.next()));
                }
            }
            if (C1901260zZk.LIZ()) {
                C786410Ut5.x3(viewOnAttachStateChangeListenerC20604515jvNR.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC19333810kS(this, viewOnAttachStateChangeListenerC20604515jvNR, 2));
                viewOnAttachStateChangeListenerC20604515jvNR.getState().LIZIZ.observe(getViewLifecycleOwner(), new AObserverS188S0200000_28((Object) viewOnAttachStateChangeListenerC20604515jvNR, (View) this, (ViewPagerBottomSheetBehavior<View>) 16));
                viewOnAttachStateChangeListenerC20604515jvNR.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0za5
                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                        if (i2 < 0) {
                            C1901440za2.LIZ.getClass();
                            C1901440za2.LJIIIIZZ = false;
                        }
                    }
                });
            }
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LJI = true;
            viewOnAttachStateChangeListenerC20604515jvNR.setListConfig(c20603715jn);
        }
        if (C1901260zZk.LIZ() && (resultFragmentData = this.LLILZIL) != null && resultFragmentData.isAllTab) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.id0);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (FrameLayout) viewFindViewById;
            }
            this.LLJILJIL = new C1901500za8(viewFindViewById, new AwS572S0100000_28(this, 363));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ = C0Z3L.LIZ(C786410Ut5.ne(getContext()), R.layout.a9d, viewGroup);
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
