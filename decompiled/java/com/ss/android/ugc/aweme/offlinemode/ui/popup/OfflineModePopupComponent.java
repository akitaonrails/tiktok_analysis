package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C0ON5;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19319410i8;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C612570O0x;
import X.C624670Oen;
import X.C625130OfX;
import X.C673150Qan;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC624770Oex;
import X.EnumC624780Oey;
import X.EnumC624830Of3;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
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
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OfflineModePopupComponent extends BasePanelComponent implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final C612570O0x LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final C19319410i8 LLJI;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public SleepHourComponentAbility LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0O0x] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModePopupComponent.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0O0x
        };
        LLJI = new C19319410i8("OfflineModePopupComponent");
    }

    public OfflineModePopupComponent() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1392), AFwS240S0000000_9.get$arr$(583), null, true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1389));
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1391));
        this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1393));
        this.LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1390));
        this.LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1388));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLIZ = (SleepHourComponentAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootPanelScope.class});
    }

    /* JADX INFO: renamed from: do */
    public abstract void mo300do(EnumC624830Of3 enumC624830Of3);

    public abstract void fo(EnumC624780Oey enumC624780Oey);

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            return this.LLIZ;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        LLJI.LIZ("onCreate", null);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OER
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLJI;
            }
        }, null, new AwS623S0100000_9(this, 130), 6);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OES
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLJILJIL;
            }
        }, null, new AwS623S0100000_9(this, 131), 6);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OEV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLJIJIL;
            }
        }, null, new AwS623S0100000_9(this, 132), 6);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLIZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final OfflineModeManagerVM bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    public final void lo() {
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        c0on5.getClass();
        C0ON5.LIZJ(c19egLIZ, 2131838506, null);
        C625130OfX.LJ(C625130OfX.LIZ, "show_offline_mode_toast", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, "change_download_limit", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32772, 131071);
    }

    public final void ho() {
        Object objValueOf;
        if (C624670Oen.LIZIZ()) {
            objValueOf = String.valueOf(C624670Oen.LJI(EnumC624770Oex.PAUSE_NO_NETWORK, bo().getState().LLILLJJLI == 0, C724240Sb0.LIZ(this)));
        } else {
            objValueOf = 2131838544;
        }
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        c0on5.getClass();
        C0ON5.LIZJ(c19egLIZ, objValueOf, null);
    }

    public final void ko() {
        Object objValueOf;
        if (C624670Oen.LIZIZ()) {
            String strLJI = C624670Oen.LJI(EnumC624770Oex.PAUSE_STORAGE, bo().getState().LLILLJJLI == 0, C724240Sb0.LIZ(this));
            objValueOf = String.valueOf(strLJI != null ? u.LJJIFFI(strLJI, "%1$s", "2", false) : null);
        } else {
            objValueOf = 2131838561;
        }
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        c0on5.getClass();
        C0ON5.LIZJ(c19egLIZ, objValueOf, null);
    }

    public final void mo() {
        Object objValueOf;
        if (C624670Oen.LIZIZ()) {
            objValueOf = String.valueOf(C624670Oen.LJI(EnumC624770Oex.PAUSE_NOT_WIFI, bo().getState().LLILLJJLI == 0, C724240Sb0.LIZ(this)));
        } else {
            objValueOf = 2131838545;
        }
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        c0on5.getClass();
        C0ON5.LIZJ(c19egLIZ, objValueOf, null);
    }

    @Override // X.AbstractC738140SxQ
    public void onParentViewCreated() {
        super.onParentViewCreated();
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
