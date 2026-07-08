package com.ss.android.ugc.aweme.invitation.newdesign.fragment;

import X.AbstractC1230540i7w;
import X.AbstractC1250290idn;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0I0B;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1229320i5y;
import X.C1230330i7b;
import X.C1230370i7f;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1529305yl;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C338490DOt;
import X.C419910GdJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C830490Whz;
import X.C987103tV;
import X.EnumC1227850i3b;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.invitation.newdesign.fragment.GroupInvitationFragment;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC344240DeY {
    public static final C1230330i7b LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final Map<String, AbstractC1230540i7w> LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiPyYnKTElJiF9JiA7HELIOSLSogISIiZykhKSIhLCEnZgI+JjojASs6IDsyPCwjJwkhKSIhLCEn";
    public AbstractC1230540i7w LLIZ;
    public String LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = new C1230330i7b();
        LLJJIII = new LinkedHashMap();
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public GroupInvitationFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1600);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(222);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1601), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1602), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1603), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1598));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1594));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1595));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1599));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1597));
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        Context context = getContext();
        c419910GdJ.LIZLLL = context != null ? C1308910kAL.LIZJ(R.attr.a1j, context) : null;
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 1596));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LIZIZ(abstractC1250290idnArr);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String str = this.LLIZLLLIL;
        if (str != null) {
            LLJJIII.remove(str);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("param_uuid")) == null) {
            if (bundle != null) {
                string = bundle.getString("param_uuid");
            } else {
                string = null;
            }
        }
        this.LLIZLLLIL = string;
        if (string != null) {
            this.LLIZ = (AbstractC1230540i7w) ((LinkedHashMap) LLJJIII).get(string);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.LLIZLLLIL;
        if (str != null) {
            C786410Ut5.LJJJI("param_uuid", str, bundle);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1229320i5y.LIZIZ(EnumC1227850i3b.FINISH_CREATE_PANEL);
        AbstractC1230540i7w abstractC1230540i7w = this.LLIZ;
        if (abstractC1230540i7w != null) {
            boolean z = false;
            z = false;
            C723850SaN.LIZ(this, false, null, new AwS385S0200000_19(this, abstractC1230540i7w, 85), 3);
            C1229320i5y.LIZIZ(EnumC1227850i3b.READY_TO_RENDER_DATA);
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0i6C
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GroupInvitationFragment@9ef8.onViewCreated$1$1");
                    try {
                        C1229320i5y.LIZIZ(EnumC1227850i3b.FINISH_RENDER_DATA);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GroupInvitationFragment@9ef8.onViewCreated$1$1");
                }
            });
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0i8J
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1230460i7o) obj).LLIZLLLIL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 239), 4);
            C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0i8D
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1230460i7o) obj).LLJ;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 240), 4);
            View view2 = (View) this.LLJIJIL.getValue();
            if (view2 != null) {
                final int i = z ? 1 : 0;
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0i85
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == i) {
                            AssemVMLazy assemVMLazy2 = this.LLJ;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GroupInvitationFragment.LLJJI;
                            assemVMLazy2.getValue().setState(AFwS257S0000000_19.get$arr$(658));
                        }
                        return false;
                    }
                });
            }
            View view3 = (View) this.LLJI.getValue();
            if (view3 != null) {
                final int i2 = z ? 1 : 0;
                view3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0i85
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view32, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == i2) {
                            AssemVMLazy assemVMLazy2 = this.LLJ;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GroupInvitationFragment.LLJJI;
                            assemVMLazy2.getValue().setState(AFwS257S0000000_19.get$arr$(658));
                        }
                        return false;
                    }
                });
            }
            View view4 = (View) this.LLJILJILJ.getValue();
            if (view4 != null) {
                final int i3 = z ? 1 : 0;
                view4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0i85
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view32, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == i3) {
                            AssemVMLazy assemVMLazy2 = this.LLJ;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GroupInvitationFragment.LLJJI;
                            assemVMLazy2.getValue().setState(AFwS257S0000000_19.get$arr$(658));
                        }
                        return false;
                    }
                });
            }
            View view5 = (View) this.LLJILJIL.getValue();
            if (view5 != null) {
                final int i4 = 2;
                view5.setOnTouchListener(new View.OnTouchListener() { // from class: X.0i85
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view32, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == i4) {
                            AssemVMLazy assemVMLazy2 = this.LLJ;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = GroupInvitationFragment.LLJJI;
                            assemVMLazy2.getValue().setState(AFwS257S0000000_19.get$arr$(658));
                        }
                        return false;
                    }
                });
            }
            String strValueOf = String.valueOf(abstractC1230540i7w.getGroupMetaData().LIZ.LIZ);
            Pair[] pairArr = new Pair[1];
            String str = abstractC1230540i7w.getGroupMetaData().LJ.get("comment_id");
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("comment_id", str);
            C830490Whz c830490WhzLIZ = C1230370i7f.LIZ(abstractC1230540i7w, strValueOf);
            Pair pair = pairArr[0];
            Object second = pair.getSecond();
            if (second != null) {
                c830490WhzLIZ.put(pair.getFirst(), second);
            }
            PopupDisplayMeta popupDisplayMeta = abstractC1230540i7w.getGroupMetaData().LJFF;
            if (popupDisplayMeta != null && popupDisplayMeta.previewEntry != null) {
                z = true;
            }
            c830490WhzLIZ.put("is_preview_entrance", C1529305yl.LIZ(Boolean.valueOf(z)));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("show_share_pop", c830490WhzLIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cio, viewGroup, false);
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
