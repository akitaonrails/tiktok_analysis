package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui;

import X.C03H5;
import X.C098200Yq;
import X.C0I0B;
import X.C0QSJ;
import X.C0YAE;
import X.C0YG2;
import X.C0Z4E;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C13LE;
import X.C13LP;
import X.C1400340mXo;
import X.C1440005kM;
import X.C14EU;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1719206oI;
import X.C1770850wBP;
import X.C189200o6;
import X.C19212010Ec;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C339190DRl;
import X.C427101lN;
import X.C452070Ho5;
import X.C497270Jen;
import X.C5182020e;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C876470YZx;
import X.C876590Ya9;
import X.C876610YaB;
import X.C878790Ydh;
import X.C879050Ye7;
import X.C879560Yew;
import X.C880830Ygz;
import X.C880950YhB;
import X.C880960YhC;
import X.C889160YuQ;
import X.C889240YuY;
import X.EnumC871430YGn;
import X.EnumC880520YgU;
import X.EnumC880850Yh1;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1581830rGX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC885250Yo7;
import X.InterfaceC885440YoQ;
import X.InterfaceC885460YoS;
import X.InterfaceC885550Yob;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS28S0001000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS628S0100000_14;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestRootFragment extends SAFTikTokFragment implements C0YG2, InterfaceC724530SbT, InterfaceC1581830rGX, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhOSN9LiAtPTohHELIOSLWshLDwgKSIpOyoiPSA/PWEmIWsBLDwgKSIpGyoiPSA/PR08JzEKOy40JSAiPQ==";
    public final AssemVMLazy LLJILLL;
    public final PrivacySettingsFeature LLJJ;
    public MessageRequestPageNavParams LLJJI;
    public InterfaceC885460YoS LLJJIII;
    public InterfaceC885440YoQ LLJJIJI;
    public InterfaceC885250Yo7 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestRootFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestRootPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0YG2
    public final void I02(List<String> list) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC885460YoS.class) {
            this.LLJJIII = (InterfaceC885460YoS) obj;
        } else if (cls == InterfaceC885440YoQ.class) {
            this.LLJJIJI = (InterfaceC885440YoQ) obj;
        } else if (cls == InterfaceC885250Yo7.class) {
            this.LLJJIJIIJIL = (InterfaceC885250Yo7) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MessageRequestPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC885460YoS.class) {
            return this.LLJJIII;
        }
        if (cls == InterfaceC885440YoQ.class) {
            return this.LLJJIJI;
        }
        if (cls == InterfaceC885250Yo7.class) {
            return this.LLJJIJIIJIL;
        }
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

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "message_box";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessageRequestPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessageRequestPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC885460YoS.class) {
            this.LLJJIII = null;
        } else if (cls == InterfaceC885440YoQ.class) {
            this.LLJJIJI = null;
        } else if (cls == InterfaceC885250Yo7.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final MessageRequestRootPageVM hS() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MessageRequestRootPageVM) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C880960YhC.LIZ.getClass();
        C880960YhC.LJIIIIZZ();
        C878790Ydh.LJ(false);
        if (C19212010Ec.LIZJ.LJJJJZI()) {
            C878790Ydh.LIZLLL(System.currentTimeMillis());
        }
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
        C876470YZx.LIZ().LJIIL(this);
        C879050Ye7.LIZJ = false;
        C879050Ye7.LJ = "";
        C879050Ye7.LJI = null;
        ((LinkedHashMap) C879050Ye7.LJFF).clear();
        ((LinkedHashMap) C879050Ye7.LIZIZ).clear();
        ((LinkedHashMap) C880830Ygz.LIZ).clear();
        super.onDestroy();
        C876590Ya9.LIZ.getClass();
        C876590Ya9.LIZ(false);
    }

    public MessageRequestRootFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestRootPageVM.class);
        this.LLJILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS558S0100000_14(c19719912DlLIZ, 281), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 282), AFwS248S0000000_14.get$arr$(84));
        this.LLJJ = C1336205Ku.LIZ(false).getImPrivacySettings();
        aS(AFwS264S0000000_24.get$arr$(172));
    }

    public final boolean iS() {
        EnumC880520YgU enumC880520YgU = hS().getState().LLIZ;
        if (hS().getState().LLILZ == EnumC880850Yh1.MULTI_SELECT) {
            hS().setState(new AwS593S0100000_14(EnumC880850Yh1.NORMAL, 197));
        } else {
            Integer num = hS().getState().LL;
            if (num != null && num.intValue() == 1) {
                hS().setState(new AwS28S0001000_14(0, 1));
                Fragment fragment = (Fragment) C13LP.LJJJLZIJ(1, getChildFragmentManager().LJJLIIIJL());
                if (fragment != null) {
                    C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIIZILJ(fragment);
                    c19ehLJIIJ.LJIIJ();
                    return true;
                }
            } else {
                if (enumC880520YgU == null) {
                    return false;
                }
                hS().setState(new AwS593S0100000_14((EnumC880520YgU) null, 195));
                if (enumC880520YgU == EnumC880520YgU.MESSAGE_REQUEST_SPAM) {
                    Keva keva = C879560Yew.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Keva keva2 = C879560Yew.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("im_message_request_story_cell_unread_time_");
                    sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
                    keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
                    C1440005kM.LIZ(new C880950YhB());
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        return iS();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aS(AFwS264S0000000_24.get$arr$(173));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPrivacySettingUpdate(C889160YuQ c889160YuQ) {
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
    }

    @Override // X.C0YG2
    public final void xf0(C876610YaB c876610YaB) {
        List listSingletonList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessageRequestDataUpdate, data = ");
        sbLIZ.append(c876610YaB);
        C2188811AlT.LIZIZ(sbLIZ);
        hS().setState(new AwS593S0100000_14(c876610YaB, 191));
        MessageRequestRootPageVM messageRequestRootPageVMHS = hS();
        if (this.LLJJ.LJIJJLI(true)) {
            listSingletonList = C1697810uHb.LJIIJJI(EnumC871430YGn.STRANGER_NOT_RISKY, EnumC871430YGn.ALL_RISKY);
        } else {
            listSingletonList = Collections.singletonList(EnumC871430YGn.ALL_STRANGER);
        }
        messageRequestRootPageVMHS.setState(new AwS593S0100000_14(listSingletonList, (List<C0YAE>) 192));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MessageRequestPageNavParams messageRequestPageNavParams;
        long j;
        List listSingletonList;
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 99), 3);
        Bundle arguments = getArguments();
        if (arguments != null) {
            messageRequestPageNavParams = (MessageRequestPageNavParams) arguments.getParcelable("message_request_nav_params");
        } else {
            messageRequestPageNavParams = null;
        }
        this.LLJJI = messageRequestPageNavParams;
        if (messageRequestPageNavParams != null) {
            j = messageRequestPageNavParams.clickStartTime;
        } else {
            j = 0;
        }
        C879050Ye7.LIZIZ.put("click_start_page", Long.valueOf(j));
        C19EG activity = getActivity();
        if (activity != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activity);
            if (numLIZJ != null) {
                activity.getWindow().setStatusBarColor(numLIZJ.intValue());
            }
            C497270Jen.LIZJ(activity);
        }
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpi$default(IAwemeImManager.class, false, false, false, 14, null);
        if (iAwemeImManager != null) {
            iAwemeImManager.LJ();
        }
        C736680Sv4.LJIIIIZZ(this, hS(), new C2217381BqS() { // from class: X.0YuM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 225), 4);
        C736680Sv4.LJIIIIZZ(this, hS(), new C2217381BqS() { // from class: X.0YsK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 226), 4);
        C736680Sv4.LJIIIIZZ(this, hS(), new C2217381BqS() { // from class: X.0YuO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 96), 4);
        C736680Sv4.LJIIIIZZ(this, hS(), new C2217381BqS() { // from class: X.0YsH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 97), 4);
        if (this.LLJJ.LJIJJLI(true)) {
            listSingletonList = C1697810uHb.LJIIJJI(EnumC871430YGn.STRANGER_NOT_RISKY, EnumC871430YGn.ALL_RISKY);
        } else {
            listSingletonList = Collections.singletonList(EnumC871430YGn.ALL_STRANGER);
        }
        hS().setState(new AwS593S0100000_14(listSingletonList, (List<C0YAE>) 192));
        hS().setState(new AwS28S0001000_14(0, 1));
        C876470YZx.LIZ().LJIIIZ(this);
        if (C19212010Ec.LIZJ.LJJJJZI()) {
            C878790Ydh.LIZLLL(System.currentTimeMillis());
        }
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C427101lN((MessageRequestRootPageVM) C889240YuY.LIZ(this).getValue(), new C5182020e(this, 123), null), 3);
        C0Z4E.LIZ.getClass();
        Iterator it2 = ((ArrayList) C0Z4E.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC885550Yob) it2.next()).S6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ced, viewGroup, false);
        C339190DRl.LIZIZ(viewTd.findViewById(R.id.k6d));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
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
