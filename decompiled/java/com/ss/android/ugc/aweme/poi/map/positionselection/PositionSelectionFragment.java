package com.ss.android.ugc.aweme.poi.map.positionselection;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0P0T;
import X.C0ZP4;
import X.C1177960gl8;
import X.C1178560gm6;
import X.C1189060h32;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1178550gm5;
import X.EnumC1235690iGF;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PositionSelectionFragment extends BaseFragment implements InterfaceC724530SbT, PositionSelectionPageAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE+KTViOSAgITElHELIOSJiEgLSkpKjs6JytiGSAgITElJiEALSkpKjs6JysKOy40JSAiPQ==";
    public final AssemVMLazy LLIZ;
    public C197039127h LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public SmartImageView LLJIJIL;
    public C0P0T LLJILJIL;
    public View LLJILJILJ;
    public C1177960gl8 LLJILLL;
    public EnumC1178550gm5 LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PositionSelectionFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/map/positionselection/PositionSelectionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public PositionSelectionFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PositionSelectionViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1371);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(457);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1372), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1373), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1374), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJILLL = new C1177960gl8(0.0d, 0.0d);
        this.LLJJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(367), "enter_from", String.class);
        this.LLJJIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(451), "lat", String.class);
        this.LLJJIJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(452), "lng", String.class);
        this.LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(450), "ignore_zone_limit", Boolean.class);
        this.LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(449), "source", String.class);
        this.LLJJJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(368), "need_locate", String.class);
    }

    public final PositionSelectionViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PositionSelectionViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionPageAbility
    public final void GB(EnumC1178550gm5 enumC1178550gm5) {
        Context context;
        Resources.Theme theme;
        if (this.LLJJ == enumC1178550gm5) {
            return;
        }
        C0P0T c0p0t = this.LLJILJIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        String string = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        View viewSd = C786410Ut5.Sd(R.layout.e1c, C786410Ut5.ne(requireContext()), null);
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.r2g);
        TypedValue typedValue = new TypedValue();
        View view = getView();
        if (view != null && (context = view.getContext()) != null && (theme = context.getTheme()) != null) {
            theme.resolveAttribute(R.attr.a0o, typedValue, true);
        }
        int i = typedValue.data;
        SmartImageView smartImageView = this.LLJIJIL;
        if (smartImageView != null) {
            C1391550mJd c1391550mJd = new C1391550mJd(smartImageView.getContext());
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LJII = -1001L;
            c1391600mJi.LIZIZ = smartImageView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJIJJ = false;
            c1391550mJd.LJI(i);
            c1391550mJd.LLILLJJLI.LJIIZILJ = viewSd;
            this.LLJILJIL = c1391550mJd.LIZIZ();
        }
        int i2 = C1178560gm6.LIZ[enumC1178550gm5.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, requireContext());
                    if (numLIZJ != null) {
                        int iIntValue = numLIZJ.intValue();
                        if (tuxTextView != null) {
                            tuxTextView.setTextColor(iIntValue);
                            tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)));
                            tuxTextView.setTuxFont(51);
                            Context context2 = getContext();
                            if (context2 != null) {
                                string = context2.getString(2131844764);
                            }
                            tuxTextView.setText(string);
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, requireContext());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    if (tuxTextView != null) {
                        tuxTextView.setTextColor(iIntValue2);
                        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)));
                        tuxTextView.setTuxFont(51);
                        Context context3 = getContext();
                        if (context3 != null) {
                            string = context3.getString(2131844766);
                        }
                        tuxTextView.setText(string);
                    }
                } else {
                    return;
                }
            }
        } else {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1r, requireContext());
            if (numLIZJ3 == null) {
                return;
            }
            int iIntValue3 = numLIZJ3.intValue();
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue3);
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)));
                tuxTextView.setTuxFont(52);
                Context context4 = getContext();
                if (context4 != null) {
                    string = context4.getString(2131844765);
                }
                tuxTextView.setText(string);
            }
        }
        this.LLJJ = enumC1178550gm5;
        C0P0T c0p0t2 = this.LLJILJIL;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionPageAbility
    public final void J20(boolean z) {
        if (C1189060h32.LJIILJJIL((Boolean) this.LLJJIJIIJIL.getValue())) {
            return;
        }
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(z);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(453));
        activityConfiguration(AFwS256S0000000_18.get$arr$(454));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionFragment for r14v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f900e1b, viewGroup, false);
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
