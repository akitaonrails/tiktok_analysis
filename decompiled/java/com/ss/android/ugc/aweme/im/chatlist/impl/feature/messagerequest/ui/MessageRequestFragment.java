package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0CYO;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C14EU;
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
import X.C484220Iyq;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C878880Ydq;
import X.C879050Ye7;
import X.C885310YoD;
import X.C887750Ys9;
import X.C887820YsG;
import X.C887850YsJ;
import X.C890330YwJ;
import X.C987103tV;
import X.EnumC871430YGn;
import X.EnumC894560Z7m;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2195108ir;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC878620YdQ;
import Y.AObjectS389S0100000_14;
import Y.ARunnableS114S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhOSN9LiAtHELIOSPTohLWshLDwgKSIpOyoiPSA/PWEmIWsBLDwgKSIpGyoiPSA/PQkhKSIhLCEn";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C887850YsJ LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C127G LLJJIII;
    public InterfaceC665370Q7z LLJJIJI;
    public C0QSJ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestFragment.class, "vmRefactoredVersion", "getVmRefactoredVersion()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MessageRequestPageScope.class});
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
        arrayList.add(MessageRequestPageScope.class);
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

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0YsJ] */
    public MessageRequestFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 267);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(81);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 268), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14((Fragment) this, 269), aFwS248S0000000_14, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 270), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 265));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 266));
        this.LLJI = new InterfaceC2195108ir() { // from class: X.0YsJ
            @Override // X.InterfaceC2195108ir
            public final void LIZIZ(List<C0Y8T> list) {
            }

            @Override // X.InterfaceC2195108ir
            public final Object LIZ(long j, C2195008iq c2195008iq) throws Throwable {
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(c2195008iq, C2107308Nj.LIZ, new C887840YsI(this.LIZ, j, null));
                if (objLJI == C099R.LJFF()) {
                    return objLJI;
                }
                return Unit.LIZ;
            }
        };
    }

    public final EnumC871430YGn SR() {
        return (EnumC871430YGn) this.LLJ.getValue();
    }

    public final MessageRequestListVM UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MessageRequestListVM) assemVMLazy.getValue();
    }

    public final void ZR() {
        View view;
        if (!this.LLJILJIL || (view = getView()) == null || this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        HandlerHook.viewPost(view, new ARunnableS114S0100000_14(this, 10));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageRequestListVM.class, new AObjectS389S0100000_14(this, 43)}, defaultViewModelProviderFactory);
                    this.LLJJIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MessageRequestListVM messageRequestListVMUR = UR();
        C887850YsJ c887850YsJ = this.LLJI;
        Iterator<InterfaceC878620YdQ> it2 = messageRequestListVMUR.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(c887850YsJ);
        }
        this.LLJILJIL = false;
        this.LLJIJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
        } else if (this.LLJILLL && WR(this)) {
            ZR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LLJILJIL && WR(this)) {
            if (C1906580ziK.LJI()) {
                this.LLJILJILJ = true;
            } else {
                C885310YoD.LJIILJJIL(C885310YoD.LIZ);
                this.LLJILLL = true;
            }
        }
    }

    public static boolean WR(MessageRequestFragment messageRequestFragment) {
        return messageRequestFragment.VR(((C887820YsG) ((AssemViewModel) messageRequestFragment.LLIZLLLIL.getValue()).getState()).LL);
    }

    public final boolean VR(Integer num) {
        if (num != null && C13LP.LJJJLZIJ(num.intValue(), ((C887820YsG) ((AssemViewModel) this.LLIZLLLIL.getValue()).getState()).LLILZIL) == SR()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS248S0000000_14.get$arr$(80));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        FragmentManager fragmentManager;
        try {
            IMChatListApi.LJJIII.getClass();
            IMChatListApi iMChatListApiLIZ = C890330YwJ.LIZ();
            if (iMChatListApiLIZ.LJIL(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"), getLifecycle().getCurrentState()) && (fragmentManager = getFragmentManager()) != null) {
                iMChatListApiLIZ.LIZJ(fragmentManager, EnumC894560Z7m.REPORT, null);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "notification_page";
        }
        C887750Ys9 c887750Ys9 = new C887750Ys9(string, SR());
        EnumC871430YGn enumC871430YGnSR = SR();
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_RISKY;
        if (enumC871430YGnSR != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("assemble_start");
            MessageRequestListVM messageRequestListVMUR = UR();
            ArrayList arrayList = new ArrayList();
            if (C0CYO.LIZJ.LJIIIIZZ()) {
                C878880Ydq c878880Ydq = new C878880Ydq();
                c878880Ydq.LJIIJ(this.LLJI);
                arrayList.add(c878880Ydq);
            }
            messageRequestListVMUR.LLILZIL.clear();
            messageRequestListVMUR.LLILZIL.addAll(arrayList);
        }
        boolean z = false;
        C723850SaN.LIZ(this, false, null, new AwS380S0200000_14(this, c887750Ys9, 22), 3);
        this.LLJILJIL = true;
        if (UR().getState().LLILLL != null) {
            z = true;
        }
        this.LLJIJIL = z;
        this.LLJJ = WR(this);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0YuP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 93), 4);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0Ysx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 94), 4);
        if (SR() != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("assemble_end");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        EnumC871430YGn enumC871430YGnSR = SR();
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_RISKY;
        if (enumC871430YGnSR != enumC871430YGn) {
            C879050Ye7.LIZ.LIZ("oncreate_view_start");
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chv, viewGroup, false);
        if (SR() != enumC871430YGn) {
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
