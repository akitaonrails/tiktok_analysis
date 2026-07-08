package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0HTI;
import X.C0JOP;
import X.C0JOQ;
import X.C0JOR;
import X.C0JOS;
import X.C0JOT;
import X.C0JOV;
import X.C0JOW;
import X.C0ZP4;
import X.C1137004ca;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1826730xdX;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C489600JHy;
import X.C489960JJi;
import X.C491200JOc;
import X.C491240JOg;
import X.C517510KRh;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C0JOW LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISHELIOSoiZzw2OjMlKiojJDA/ZywyJCAiLSMqJSApPSY9L2s6ICokZhUvOgwyJCAiLSMqCiojIiY9LwM+KCg+LSs4";
    public ViewGroup LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public PcsCalendlyBookingData LLILZ;
    public final AssemVMLazy LLILZIL;
    public IPcsLoadingAbility LLILZLL;
    public boolean LLIZ;
    public Float LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JOW] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCalendlyBookingFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeeting/viewmodel/PcsCalendlyMeetingVm;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new Object() { // from class: X.0JOW
        };
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

    public PcsCalendlyBookingFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCalendlyMeetingVm.class);
        C0JOP c0jop = new C0JOP(c19719912DlLIZ);
        C0JOV c0jov = new C0JOV();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jop, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JOR(this), c0jov, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jop, new C0JOS(this), c0jov, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jop, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JOT(this), c0jov, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZIL = assemVMLazy;
    }

    public final PcsCalendlyMeetingVm OR() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (PcsCalendlyMeetingVm) assemVMLazy.getValue();
    }

    public final void PR() {
        IPcsLoadingAbility iPcsLoadingAbility = this.LLILZLL;
        if (iPcsLoadingAbility != null) {
            final C0JOQ c0joq = new C0JOQ(this);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hfq, null, false);
            C786410Ut5.U8((C197039127h) viewTd.findViewById(R.id.teg), new View.OnClickListener() { // from class: X.0JOU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function0<Unit> function0 = c0joq;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
            LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.hbb);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            liveIconView.setImageDrawable(c0hti.LIZ(liveIconView.getContext()));
            iPcsLoadingAbility.Ro0(viewTd);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.onHide(hashCode());
        }
    }

    public final void NR(float f) {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.bd(-f, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 != null) {
            C786410Ut5.bd((-f) / 2, viewGroup2);
        }
        ViewGroup viewGroup3 = this.LLILLJJLI;
        if (viewGroup3 != null && (viewFindViewById2 = viewGroup3.findViewById(R.id.d9d)) != null) {
            viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), (int) f);
        }
        ViewGroup viewGroup4 = this.LLILLJJLI;
        if (viewGroup4 != null && (viewFindViewById = viewGroup4.findViewById(R.id.u1g)) != null) {
            C786410Ut5.ed(viewFindViewById, (-f) / 2);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        PcsCalendlyBookingData pcsCalendlyBookingData;
        super.onCreate(bundle);
        if (this.LLILZ == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                pcsCalendlyBookingData = (PcsCalendlyBookingData) arguments.getParcelable("calendly_page_params");
            } else {
                pcsCalendlyBookingData = null;
            }
            this.LLILZ = pcsCalendlyBookingData;
        }
        C20441214yg.LIZIZ("PcsCalendlyBookingFragment", String.valueOf(this.LLILZ));
        PcsCalendlyMeetingVm pcsCalendlyMeetingVmOR = OR();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        int iHashCode = hashCode();
        pcsCalendlyMeetingVmOR.LLILLJJLI = interfaceC665370Q7zLJFF;
        pcsCalendlyMeetingVmOR.LL = iHashCode;
        PcsCalendlyBookingData pcsCalendlyBookingData2 = this.LLILZ;
        if (pcsCalendlyBookingData2 == null || (str = pcsCalendlyBookingData2.showEntrance) == null) {
            str = "";
        }
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            interfaceC517590KRpLIZ.LJIIIIZZ("CalendlyBooking", new C517510KRh(OR().LL, str, 1016));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.nnq);
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.c8w);
        this.LL = (ViewGroup) view.findViewById(R.id.c8x);
        PcsGenericLoadingVM pcsGenericLoadingVMDj1 = null;
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C489960JJi(this.LLILZ), C489960JJi.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new C1137004ca(this), 3);
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, null);
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        }
        this.LLILZLL = pcsGenericLoadingVMDj1;
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0JOe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLILZLL;
            }
        }, null, new C491200JOc(this), 6);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0JOk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JPA) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new C491240JOg(this), 4);
        OR().vQ2();
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0JOO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsCalendlyBookingFragment@b831.onViewCreated$1");
                try {
                    PcsCalendlyBookingFragment pcsCalendlyBookingFragment = this.LL;
                    pcsCalendlyBookingFragment.LLIZ = true;
                    Float f = pcsCalendlyBookingFragment.LLIZLLLIL;
                    if (f != null) {
                        pcsCalendlyBookingFragment.NR(f.floatValue());
                    }
                    this.LL.LLIZLLLIL = null;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsCalendlyBookingFragment@b831.onViewCreated$1");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggp, viewGroup, false);
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
