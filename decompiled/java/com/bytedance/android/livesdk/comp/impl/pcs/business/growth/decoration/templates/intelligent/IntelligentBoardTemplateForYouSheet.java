package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C0KPJ;
import X.C0QSJ;
import X.C0TND;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1217360hmg;
import X.C1217370hmh;
import X.C1220010hqx;
import X.C1220020hqy;
import X.C1220030hqz;
import X.C127G;
import X.C13LE;
import X.C1622206Wu;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C1815580xLY;
import X.C1815590xLZ;
import X.C1815600xLa;
import X.C1815910xM5;
import X.C19322110iZ;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C443120HZe;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C748880TZe;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.InterfaceC971680bOQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.IntelligentDecorationBoardUpsertEvent;
import com.bytedance.android.live.broadcast.api.UpsertIntelligentBoardSuccessEvent;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardTemplateForYouSheet extends LiveSheetFragment implements InterfaceC724530SbT, IntelligentBoardTemplateForYouPageAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C1815580xLY LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0Oio7PSd9LCAvJjHELIOS0yPCwjJ2EnLSg8JS4nLTZiICEnLSkgICg2JjFiACEnLSkgICg2JjEOJi4hLBEpJD8/KTEpDyAhESo5Gic2LTE=";
    public final IntelligentBoardTemplateForYouSheet LLJLLL = this;
    public final AssemVMLazy LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public DataChannel LLLF;
    public long LLLFF;
    public boolean LLLFFI;
    public C127G LLLFZ;
    public IntelligentBoardTemplateForYouPageAbility LLLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xLY] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentBoardTemplateForYouSheet.class, "intelligentBoardTemplateForYouListViewModel", "getIntelligentBoardTemplateForYouListViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/templates/intelligent/assems/vm/IntelligentBoardTemplateForYouListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLII = new Object() { // from class: X.0xLY
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == IntelligentBoardTemplateForYouPageAbility.class) {
            this.LLLI = (IntelligentBoardTemplateForYouPageAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IntelligentBoardTemplateForYouScope.class});
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility
    public final void gD() {
        this.LLLFFI = false;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == IntelligentBoardTemplateForYouPageAbility.class) {
            return this.LLLI;
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
        arrayList.add(IntelligentBoardTemplateForYouScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IntelligentBoardTemplateForYouScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility
    public final void mY() {
        close(1);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == IntelligentBoardTemplateForYouPageAbility.class) {
            this.LLLI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public IntelligentBoardTemplateForYouSheet() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IntelligentBoardTemplateForYouListViewModel.class);
        C1217370hmh c1217370hmh = new C1217370hmh(c19719912DlLIZ);
        C1815910xM5 c1815910xM5 = new C1815910xM5();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217370hmh, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1220010hqx(this), c1815910xM5, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217370hmh, new C1220020hqy(this), c1815910xM5, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217370hmh, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1220030hqz(this), c1815910xM5, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJZ = assemVMLazy;
        this.LLJZIJLIL = "";
        this.LLL = "";
        this.LLLFFI = true;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility
    public final void jg0() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LLLF;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        String str = IntelligentBoardClaimSheet._pnsPageId;
        long j = uS().LLILZ;
        IntelligentBoardClaimSheet intelligentBoardClaimSheet = new IntelligentBoardClaimSheet();
        intelligentBoardClaimSheet.LLJLLL = j;
        C19322110iZ.LJFF(fragmentManager, intelligentBoardClaimSheet, "IntelligentBoardClaimSheet", null, 0);
    }

    public final IntelligentBoardTemplateForYouListViewModel uS() {
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        return (IntelligentBoardTemplateForYouListViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IntelligentBoardTemplateForYouListViewModel.class, new Function0() { // from class: X.0xLx
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new IntelligentBoardTemplateForYouListViewModel(this.LL.LLJLLL);
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLLFZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{IntelligentBoardTemplateForYouScope.class}).unbindAbility(this.LLJLLL, IntelligentBoardTemplateForYouPageAbility.class);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
        IntelligentBoardTemplateForYouListViewModel intelligentBoardTemplateForYouListViewModelUS = uS();
        long j = this.LLLFF;
        InterfaceC971680bOQ interfaceC971680bOQ = intelligentBoardTemplateForYouListViewModelUS.LLJILJILJ;
        if (interfaceC971680bOQ != null) {
            interfaceC971680bOQ.LJFF();
        }
        intelligentBoardTemplateForYouListViewModelUS.LLILZLL = j;
        intelligentBoardTemplateForYouListViewModelUS.LLILZIL = j;
        intelligentBoardTemplateForYouListViewModelUS.LLJILLL = j;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{IntelligentBoardTemplateForYouScope.class}).bindAbility(this.LLJLLL, IntelligentBoardTemplateForYouPageAbility.class);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        IntelligentBoardTemplateForYouListViewModel intelligentBoardTemplateForYouListViewModelUS = uS();
        C0KPJ.nf.LJFF(Long.valueOf(Math.max(((Number) intelligentBoardTemplateForYouListViewModelUS.LLJJ.getValue()).longValue(), intelligentBoardTemplateForYouListViewModelUS.LLJILLL + 1)));
        if (this.LLLFFI) {
            uS().xQ2("close");
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LJFF(-16777216);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        if (this.LLLFFI && (dataChannel = this.LLLF) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C0TND.LIZ(LiveBoardsPageDialogFragment.LLJILJILJ, this.LLJZIJLIL, this.LLL, this.LLLF, null, null, 8).show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility
    public final void QL1(Board board, Bitmap bitmap) {
        DataChannel dataChannel = this.LLLF;
        if (dataChannel != null) {
            dataChannel.LC0(IntelligentDecorationBoardUpsertEvent.class, new C443120HZe(board, bitmap, 0));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.c5n);
        tuxImmersionBarLIZLLL.LJ(R.attr.ezk);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        C723850SaN.LIZ(this, false, null, new C1217360hmg(this), 3);
        DataChannel dataChannel = this.LLLF;
        if (dataChannel != null) {
            dataChannel.BQ2(this, UpsertIntelligentBoardSuccessEvent.class, new C1815590xLZ(this));
        }
        DataChannel dataChannel2 = this.LLLF;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, UpsertIntelligentBoardSuccessEvent.class, new C1815600xLa(this));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g7s, viewGroup, false);
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
