package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C497270Jen;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C879050Ye7;
import X.C885310YoD;
import X.C885430YoP;
import X.C887750Ys9;
import X.C987103tV;
import X.EnumC871430YGn;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1581830rGX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC885250Yo7;
import X.InterfaceC885440YoQ;
import X.InterfaceC885460YoS;
import Y.ARunnableS114S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestFragmentV2 extends SAFTikTokFragment implements InterfaceC1581830rGX, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhOSN9LiAtPTHELIOSohLWshLDwgKSIpOyoiPSA/PWEmIWsBLDwgKSIpGyoiPSA/PQkhKSIhLCEnHnc=";
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final PrivacySettingsFeature LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public InterfaceC885460YoS LLJJJJJIL;
    public InterfaceC885440YoQ LLJJJJLIIL;
    public InterfaceC885250Yo7 LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestFragmentV2.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestFragmentV2.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC885460YoS.class) {
            this.LLJJJJJIL = (InterfaceC885460YoS) obj;
        } else if (cls == InterfaceC885440YoQ.class) {
            this.LLJJJJLIIL = (InterfaceC885440YoQ) obj;
        } else if (cls == InterfaceC885250Yo7.class) {
            this.LLJJL = (InterfaceC885250Yo7) obj;
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
            return this.LLJJJJJIL;
        }
        if (cls == InterfaceC885440YoQ.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == InterfaceC885250Yo7.class) {
            return this.LLJJL;
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
            this.LLJJJJJIL = null;
        } else if (cls == InterfaceC885440YoQ.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == InterfaceC885250Yo7.class) {
            this.LLJJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public MessageRequestFragmentV2() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestPageVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 274);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(82);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 275), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14((Fragment) this, 276), aFwS248S0000000_14, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 277), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVMV2.class);
        AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(c19719912DlLIZ2, 278);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(83);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 279), aFwS248S0000000_142, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new AwS558S0100000_14((Fragment) this, 280), aFwS248S0000000_142, null, null, null);
            z2 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 273), aFwS248S0000000_142, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy2;
        this.LLJJI = C1336205Ku.LIZ(z2).getImPrivacySettings();
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 271));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 272));
        aS(AFwS264S0000000_24.get$arr$(170));
    }

    public final void hS() {
        View view;
        if (!this.LLJJIJIL || (view = getView()) == null || this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        HandlerHook.viewPost(view, new ARunnableS114S0100000_14(this, 11));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        assemVMLazy.getValue().setState(AFwS248S0000000_14.get$arr$(358));
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIJIL = false;
        this.LLJJIJIIJIL = false;
        this.LLJJJ = false;
        this.LLJJJIL = false;
        this.LLJJJJ = false;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJJ) {
            this.LLJJJ = false;
        } else if (this.LLJJJIL) {
            hS();
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLJJIJIL) {
            if (C1906580ziK.LJI()) {
                this.LLJJJ = true;
            } else {
                C885310YoD.LJIILJJIL(C885310YoD.LIZ);
                this.LLJJJIL = true;
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aS(AFwS264S0000000_24.get$arr$(171));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        long j;
        super.onViewCreated(view, bundle);
        MessageRequestPageNavParams messageRequestPageNavParams = (MessageRequestPageNavParams) this.LLJJIII.getValue();
        if (messageRequestPageNavParams == null || (str = messageRequestPageNavParams.enterFrom) == null) {
            str = "notification_page";
        }
        C887750Ys9 c887750Ys9 = new C887750Ys9(str, (EnumC871430YGn) this.LLJJIJI.getValue());
        Object value = this.LLJJIJI.getValue();
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_RISKY;
        if (value != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("assemble_start");
        }
        MessageRequestPageNavParams messageRequestPageNavParams2 = (MessageRequestPageNavParams) this.LLJJIII.getValue();
        if (messageRequestPageNavParams2 != null) {
            j = messageRequestPageNavParams2.clickStartTime;
        } else {
            j = 0;
        }
        AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(this, c887750Ys9, 23);
        boolean z = false;
        C723850SaN.LIZ(this, false, null, awS380S0200000_14, 3);
        if (this.LLJJIJI.getValue() != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("assemble_end");
            C879050Ye7.LIZIZ.put("click_start_page", Long.valueOf(j));
        }
        this.LLJJIJIL = true;
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        if (((C885430YoP) assemVMLazy.getValue().getState()).LLILLL != null) {
            z = true;
        }
        this.LLJJIJIIJIL = z;
        C736680Sv4.LJIIIIZZ(this, this.LLJJ.getValue(), new C2217381BqS() { // from class: X.0Ysy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 95), 4);
        C19EG activity = getActivity();
        if (activity != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activity);
            if (numLIZJ != null) {
                activity.getWindow().setStatusBarColor(numLIZJ.intValue());
            }
            C497270Jen.LIZJ(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Object value = this.LLJJIJI.getValue();
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_RISKY;
        if (value != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("oncreate_view_start");
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chh, viewGroup, false);
        if (this.LLJJIJI.getValue() != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("oncreate_view_end");
        }
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
