package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1738910vLt;
import X.C1767110w5N;
import X.C1767130w5P;
import X.C1770850wBP;
import X.C1775620wJ6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C770702zh;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1767180w5U;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import g1c.AjS70S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MoveReminderViewHolder extends PowerCell<C1767110w5N> implements InterfaceC724530SbT, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxIconView LLILZ;
    public SmartImageView LLILZIL;
    public final AssemVMLazy LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MoveReminderViewHolder.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterViewModel;", 0);
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

    public MoveReminderViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageCenterViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 237);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(189);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 248), awS570S0100000_26, AFwS215S0000000_26.get$arr$(84), new AwS570S0100000_26((C03K6) this, 223), new AwS570S0100000_26((C03K6) this, 225), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 227), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 229), null, new AwS570S0100000_26((C03K6) this, 230));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 224);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 226);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 228);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 17));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 231);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 232);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 233);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 234);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 235);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 236), awS570S0100000_26, AFwS215S0000000_26.get$arr$(85), new AwS570S0100000_26((C03K6) this, 238), new AwS570S0100000_26((C03K6) this, 239), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 240), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 241), null, new AwS570S0100000_26((C03K6) this, 242));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 243), awS570S0100000_26, AFwS215S0000000_26.get$arr$(86), new AwS570S0100000_26((C03K6) this, 244), new AwS570S0100000_26((C03K6) this, 245), new AwS570S0100000_26((C03K6) this, 246), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 247));
        }
        this.LLILZLL = assemVMLazy;
    }

    public final C197039127h I5() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dqg) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final MessageCenterViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (MessageCenterViewModel) assemVMLazy.getValue();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1767110w5N c1767110w5N = (C1767110w5N) interfaceC1891350zJl;
        String str2 = c1767110w5N.LLILZIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        View viewFindViewById = this.LL;
        String str4 = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.q37);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        String str5 = c1767110w5N.LL;
        if (str5 == null) {
            str5 = "";
        }
        textView.setText(str5);
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.q36);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById2;
        }
        TextView textView2 = (TextView) viewFindViewById2;
        String str6 = c1767110w5N.LLILLJJLI;
        if (str6 != null) {
            str3 = str6;
        }
        textView2.setText(str3);
        I5().setText(str2);
        C786410Ut5.I7(new AjS44S0200000_26(c1767110w5N, this, 31), I5());
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.q35);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (TuxIconView) viewFindViewById3;
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 65), viewFindViewById3);
        if (C960203pA.LIZIZ(I5().getContext())) {
            str = c1767110w5N.LLILZ;
        } else {
            str = c1767110w5N.LLILLL;
        }
        if (C770702zh.LIZIZ(str)) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            View viewFindViewById4 = this.LLILZIL;
            if (viewFindViewById4 == null) {
                View view4 = this.itemView;
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.v76);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZIL = (SmartImageView) viewFindViewById4;
            }
            c1331670kl3LIZLLL.LJJ((SmartImageView) viewFindViewById4);
            c1331670kl3LIZLLL.LJIIJ(new C1775620wJ6(this, 0));
        }
        C1767130w5P c1767130w5P = C1767130w5P.LIZ;
        EnumC1767180w5U enumC1767180w5U = EnumC1767180w5U.SHOW_MIGRATION_VIEW;
        C1738910vLt c1738910vLt = L5().LLIZLLLIL;
        if (c1738910vLt != null) {
            str4 = c1738910vLt.LLIZ;
        }
        c1767130w5P.getClass();
        C1767130w5P.LIZIZ(enumC1767180w5U, false, str4);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ao4, viewGroup, false);
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
