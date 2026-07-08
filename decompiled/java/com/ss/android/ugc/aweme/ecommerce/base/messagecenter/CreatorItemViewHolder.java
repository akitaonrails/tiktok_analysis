package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1751220vfk;
import X.C1751370vfz;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C426770GoN;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.CreatorItemViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CreatorItemViewHolder extends PowerCell<C1751370vfz> implements InterfaceC724530SbT, C03H8 {
    public static final C1751220vfk LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public C426770GoN LLILZ;
    public final Keva LLILZIL;
    public final String LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatorItemViewHolder.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new C1751220vfk();
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

    public CreatorItemViewHolder() {
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageCenterViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 201);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(171);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 212), awS570S0100000_26, AFwS215S0000000_26.get$arr$(78), new AwS570S0100000_26((C03K6) this, 187), new AwS570S0100000_26((C03K6) this, 189), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 191), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 193), null, new AwS570S0100000_26((C03K6) this, 194));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 188);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 190);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 192);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 15));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 195);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 196);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 197);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 198);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 199);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 200), awS570S0100000_26, AFwS215S0000000_26.get$arr$(79), new AwS570S0100000_26((C03K6) this, 202), new AwS570S0100000_26((C03K6) this, 203), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 204), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 205), null, new AwS570S0100000_26((C03K6) this, 206));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 207), awS570S0100000_26, AFwS215S0000000_26.get$arr$(80), new AwS570S0100000_26((C03K6) this, 208), new AwS570S0100000_26((C03K6) this, 209), new AwS570S0100000_26((C03K6) this, 210), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 211));
        }
        this.LLILZIL = Keva.getRepo("tts_inbox_page");
        this.LLILZLL = "unread_timestamp";
    }

    public final TuxTextView I5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.eu1) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C426770GoN L5() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.unread_count_badge) : null;
            this.LLILZ = (C426770GoN) viewFindViewById;
        }
        return (C426770GoN) viewFindViewById;
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        final C1751370vfz c1751370vfz = (C1751370vfz) interfaceC1891350zJl;
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.zym);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(c1751370vfz.LL);
        if (!TextUtils.isEmpty(c1751370vfz.LLILZIL)) {
            C786410Ut5.LJLLLLLL(0, I5());
            I5().setText(c1751370vfz.LLILZIL);
        } else {
            C03DZ.LIZ(I5());
        }
        String str = c1751370vfz.LLILLJJLI;
        if (str != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C0H9H.LIZ(28);
            c1331750klB.LIZ = false;
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            View view2 = this.LLILLL;
            if (view2 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.bh2);
                }
                this.LLILLL = (SmartImageView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            c1331670kl3LIZLLL.LJJ((SmartImageView) view2);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        final long jLongValue = 0;
        long j = this.LLILZIL.getLong(this.LLILZLL, 0L);
        Long l = c1751370vfz.LLILZLL;
        if (l != null) {
            jLongValue = l.longValue();
        }
        if (jLongValue > j) {
            C786410Ut5.LLLLLLIL(L5(), 0);
        } else {
            C786410Ut5.LLLLLLIL(L5(), 4);
        }
        TuxTextView tuxTextViewI5 = I5();
        if (Intrinsics.LJFF(c1751370vfz.LLILZ, Boolean.TRUE)) {
            i = 52;
        } else {
            i = 51;
        }
        tuxTextViewI5.setTuxFont(i);
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0vg0
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view4) {
                if (view4 != null) {
                    CreatorItemViewHolder creatorItemViewHolder = this.LLILZ;
                    creatorItemViewHolder.LLILZIL.storeLong(creatorItemViewHolder.LLILZLL, jLongValue);
                    CreatorItemViewHolder.LLIZ.getClass();
                    C1751220vfk.LIZ("click");
                    C786410Ut5.LLLLLLIL(this.LLILZ.L5(), 4);
                    String str2 = c1751370vfz.LLILLL;
                    if (str2 != null) {
                        SmartRouter.buildRoute(this.LLILZ.itemView.getContext(), str2).open();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ao2, viewGroup, false);
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
