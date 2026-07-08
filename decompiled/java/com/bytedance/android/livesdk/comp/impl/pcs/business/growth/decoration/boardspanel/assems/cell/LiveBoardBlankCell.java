package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0HTI;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C16F5;
import X.C1770850wBP;
import X.C1819500xRs;
import X.C1826830xdh;
import X.C1826840xdi;
import X.C1826850xdj;
import X.C1826860xdk;
import X.C1826870xdl;
import X.C1826880xdm;
import X.C1826890xdn;
import X.C1826900xdo;
import X.C1826910xdp;
import X.C1826920xdq;
import X.C1826930xdr;
import X.C1826940xds;
import X.C1826950xdt;
import X.C1826960xdu;
import X.C1826970xdv;
import X.C1826980xdw;
import X.C1826990xdx;
import X.C1827000xdy;
import X.C1827010xdz;
import X.C1827020xe0;
import X.C1827030xe1;
import X.C1827040xe2;
import X.C1827050xe3;
import X.C1827060xe4;
import X.C1827070xe5;
import X.C1827080xe6;
import X.C1827090xe7;
import X.C1827100xe8;
import X.C1827110xe9;
import X.C1827120xeA;
import X.C1827130xeB;
import X.C1827140xeC;
import X.C1827150xeD;
import X.C1827160xeE;
import X.C1827170xeF;
import X.C1827180xeG;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C994120byc;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.BoardDslMinMigratableVersionSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardBlankCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardBlankCell extends PowerCell<C994120byc> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveBoardBlankCell.class, "liveBoardPageViewModel", "getLiveBoardPageViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/assems/viewmodel/LiveBoardsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
        LiveIconView liveIconView = (LiveIconView) this.LLILLL.getValue();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.ym;
        liveIconView.setIcon(c0hti.LIZ(((View) this.LLILLL.getValue()).getContext()));
        I5().setButtonSize(2);
        I5().setButtonVariant(1);
        C786410Ut5.U8(I5(), new View.OnClickListener() { // from class: X.0xRc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (C1152620g6G.LIZJ() < BoardDslMinMigratableVersionSetting.INSTANCE.getValue()) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851348));
                    return;
                }
                AssemVMLazy assemVMLazy = this.LL.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveBoardBlankCell.LLIZ;
                ((LiveBoardsPageViewModel) assemVMLazy.getValue()).xQ2(view.getContext());
            }
        });
        C786410Ut5.l8((C16F5) this.LLILZIL.getValue(), new View.OnClickListener() { // from class: X.0JSA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AssemVMLazy assemVMLazy = this.LL.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveBoardBlankCell.LLIZ;
                assemVMLazy.getValue();
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((View) this.LL.LLILZIL.getValue()).getContext(), UriProtector.parse(LiveSubscriptionFAQSetting.INSTANCE.getValue().getLiveBoardFAQPage("")).buildUpon().appendQueryParameter("show_entrance", "live").build().toString());
            }
        });
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xRh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1815950xM9) obj).LLILLJJLI);
            }
        }, null, new C1819500xRs(this), 6);
    }

    public final C197039127h I5() {
        return (C197039127h) this.LLILZLL.getValue();
    }

    public LiveBoardBlankCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardsPageViewModel.class);
        C1826860xdk c1826860xdk = new C1826860xdk(c19719912DlLIZ);
        C1827180xeG c1827180xeG = new C1827180xeG();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1827150xeD(c19719912DlLIZ), c1826860xdk, new C1827040xe2(), new C1826950xdt(this), new C1826870xdl(this), new C1827070xe5(this), c1827180xeG, new C1826840xdi(this), null, new C1826880xdm(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1826940xds c1826940xds = new C1826940xds(this);
            C1827060xe4 c1827060xe4 = new C1827060xe4(this);
            C1827160xeE c1827160xeE = new C1827160xeE(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1827020xe0((InterfaceC451590HnJ) obj, c1826940xds));
            C1826970xdv c1826970xdv = new C1826970xdv(c01gwLIZIZ);
            C1826980xdw c1826980xdw = new C1826980xdw(c01gwLIZIZ);
            C1826990xdx c1826990xdx = new C1826990xdx(c01gwLIZIZ);
            C1827000xdy c1827000xdy = new C1827000xdy(c01gwLIZIZ);
            C1827010xdz c1827010xdz = new C1827010xdz(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1827160xeE, c1826860xdk, new C452080Ho6(), c1826970xdv, c1826980xdw, c1827060xe4, c1827180xeG, c1826990xdx, c1827000xdy, c1827010xdz);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1827170xeF(c19719912DlLIZ), c1826860xdk, new C1827050xe3(), new C1826960xdu(this), new C1826920xdq(this), new C1827080xe6(this), c1827180xeG, new C1826830xdh(this), null, new C1826890xdn(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1827140xeC(c19719912DlLIZ), c1826860xdk, new C1827030xe1(), new C1826930xdr(this), new C1826900xdo(this), new C1826910xdp(this), c1827180xeG, null, null, new C1826850xdj(this));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new C1827090xe7(this));
        this.LLILLL = C452501pT.LIZIZ(new C1827110xe9(this));
        this.LLILZ = C452501pT.LIZIZ(new C1827120xeA(this));
        this.LLILZIL = C452501pT.LIZIZ(new C1827130xeB(this));
        this.LLILZLL = C452501pT.LIZIZ(new C1827100xe8(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C994120byc c994120byc = (C994120byc) interfaceC1891350zJl;
        super.onBindItemView(c994120byc);
        C500260Jjc.LJLJLJ(I5(), c994120byc.LL);
        C500260Jjc.LLFFF((View) this.LLILZIL.getValue());
        ((TextView) this.LLILZ.getValue()).setText(C497740JfY.LJIJJ(2131851179, ""));
        ((TextView) this.LLILZIL.getValue()).setText(C497740JfY.LJIJI(2131851180));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gxt, viewGroup, false);
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
