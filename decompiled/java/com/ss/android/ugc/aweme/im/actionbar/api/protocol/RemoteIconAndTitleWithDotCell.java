package com.ss.android.ugc.aweme.im.actionbar.api.protocol;

import X.C03H5;
import X.C0Z3V;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C127G;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C2217381BqS;
import X.C426750GoL;
import X.C426770GoN;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C908800Zl0;
import X.C908840Zl4;
import X.C908850Zl5;
import X.EnumC1338240kve;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1664506fT;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObjectS67S0000000_14;
import android.widget.Space;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class RemoteIconAndTitleWithDotCell extends ActionBarCell<C908800Zl0> implements InterfaceC724530SbT {
    public static final /* synthetic */ int LLJI = 0;
    public final C736950SvV LLILZ;
    public C426770GoN LLILZIL;
    public Space LLILZLL;
    public TuxTextView LLIZ;
    public SmartImageView LLIZLLLIL;
    public C127G LLJ;

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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ce9;
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

    public RemoteIconAndTitleWithDotCell() {
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(83);
        this.LLILZ = new C736950SvV(C13LE.LIZ(IVibeFeedEntranceViewModel.class), aFwS201S0000000_14, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(50), null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell
    public final void LIZIZ() {
        super.LIZIZ();
        C426770GoN c426770GoN = this.LLILZIL;
        if (c426770GoN != null) {
            C786410Ut5.LJLLLLLL(8, c426770GoN);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IVibeFeedEntranceViewModel.class, new AObjectS67S0000000_14(this, 24)}, defaultViewModelProviderFactory);
                    this.LLJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZIL = (C426770GoN) this.itemView.findViewById(R.id.a18);
        this.LLILZLL = (Space) this.itemView.findViewById(R.id.vrc);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.a1z);
        this.LLIZLLLIL = (SmartImageView) this.itemView.findViewById(R.id.a1d);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C908800Zl0 c908800Zl0) {
        boolean z;
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        super.onBindItemView(c908800Zl0);
        C908850Zl5 c908850Zl5 = c908800Zl0.LLILZ;
        String str = c908850Zl5.LIZ;
        int i = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Space space = this.LLILZLL;
            if (space != null) {
                C786410Ut5.LJLLLLLL(8, space);
            }
            TuxTextView tuxTextView = this.LLIZ;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView);
            }
            SmartImageView smartImageView = this.LLIZLLLIL;
            if (smartImageView != null) {
                C426750GoL.LJIIIZ(smartImageView, 0, null, 0, null, false, 26);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c908850Zl5.LIZ);
                c908850Zl5.LIZIZ.invoke(tuxTextView2);
            }
            Space space2 = this.LLILZLL;
            if (space2 != null) {
                C786410Ut5.LJLLLLLL(0, space2);
            }
            TuxTextView tuxTextView3 = this.LLIZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView3);
            }
            SmartImageView smartImageView2 = this.LLIZLLLIL;
            if (smartImageView2 != null) {
                C426750GoL.LJIIIZ(smartImageView2, 0, null, 0, null, false, 26);
            }
        }
        C908840Zl4 c908840Zl4 = c908800Zl0.LLILLL;
        boolean z2 = c908800Zl0.LLILZIL;
        String str2 = c908840Zl4.LIZ;
        if (str2 != null && str2.length() != 0) {
            IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
            if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
                interfaceC1664506fTLIZJ.LIZ("action_bar_image_preload", c908840Zl4.LIZ);
            }
            SmartImageView smartImageView3 = this.LLIZLLLIL;
            if (smartImageView3 != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c908840Zl4.LIZ);
                Function1<C1331670kl3, C1331670kl3> function1 = c908840Zl4.LIZJ;
                if (function1 != null) {
                    function1.invoke(c1331670kl3LJIIIZ);
                }
                c1331670kl3LJIIIZ.LIZLLL("RemoteIconAndTitleCellAssem");
                c1331670kl3LJIIIZ.LJJ(smartImageView3);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                smartImageView3.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
                Function1<SmartImageView, Unit> function12 = c908840Zl4.LIZIZ;
                if (function12 != null) {
                    function12.invoke(smartImageView3);
                }
                C786410Ut5.LJLLLLLL(0, smartImageView3);
            }
        } else {
            Space space3 = this.LLILZLL;
            if (space3 != null) {
                C786410Ut5.LJLLLLLL(8, space3);
            }
            SmartImageView smartImageView4 = this.LLIZLLLIL;
            if (smartImageView4 != null) {
                C786410Ut5.LJLLLLLL(8, smartImageView4);
            }
        }
        C426770GoN c426770GoN = (C426770GoN) this.itemView.findViewById(R.id.a18);
        this.LLILZIL = c426770GoN;
        if (c426770GoN != null) {
            if (!z2) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c426770GoN);
        }
        C736680Sv4.LJIIIIZZ(this, this.LLILZ.getValue(), new C2217381BqS() { // from class: X.0Zkp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C908580Zke) obj).LLILLJJLI;
            }
        }, null, new AwS450S0200000_14(c908800Zl0, this, 2), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
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
