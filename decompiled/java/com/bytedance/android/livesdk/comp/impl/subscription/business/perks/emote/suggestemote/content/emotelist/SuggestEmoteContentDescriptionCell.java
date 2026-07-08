package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.content.emotelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1A03;
import X.C1A0A;
import X.C1A0H;
import X.C1A0O;
import X.C20736316Cj;
import X.C21669219rG;
import X.C21669319rH;
import X.C21669419rI;
import X.C21681819tI;
import X.C21701019wO;
import X.C21701819wW;
import X.C21701919wX;
import X.C21703119wj;
import X.C21703919wr;
import X.C21704019ws;
import X.C21704119wt;
import X.C21704219wu;
import X.C21704319wv;
import X.C21704419ww;
import X.C21704519wx;
import X.C21704619wy;
import X.C21704719wz;
import X.C21704819x0;
import X.C21704919x1;
import X.C21705019x2;
import X.C21705119x3;
import X.C21705219x4;
import X.C21705319x5;
import X.C21719119zJ;
import X.C21719219zK;
import X.C21719319zL;
import X.C21720919zb;
import X.C21721619zi;
import X.C21722319zp;
import X.C21723019zw;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C292401Bi;
import X.C452080Ho6;
import X.C452501pT;
import X.C492950JUv;
import X.C493210JVv;
import X.C493250JVz;
import X.C497740JfY;
import X.C736680Sv4;
import X.C736820SvI;
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SuggestEmoteContentDescriptionCell extends PowerCell<C492950JUv> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SuggestEmoteContentDescriptionCell.class, "suggestEmotePageViewModel", "getSuggestEmotePageViewModel()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/emote/suggestemote/SuggestEmotePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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
        ((TextView) this.LLILLL.getValue()).setText(C497740JfY.LJIJI(2131852091));
        ((TextView) this.LLILLJJLI.getValue()).setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, this.itemView.getContext()));
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JW0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C492830JUj) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C493250JVz(this), 4);
    }

    public SuggestEmoteContentDescriptionCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SuggestEmotePageViewModel.class);
        C21669219rG c21669219rG = new C21669219rG(c19719912DlLIZ);
        C21705319x5 c21705319x5 = new C21705319x5();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C21704919x1(c19719912DlLIZ), c21669219rG, new C21719119zJ(), new C21704419ww(this), new C21703119wj(this), new C21704719wz(this), c21705319x5, new C1A0O(this), null, new C21701819wW(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C21704219wu c21704219wu = new C21704219wu(this);
            C21704619wy c21704619wy = new C21704619wy(this);
            C21705019x2 c21705019x2 = new C21705019x2(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C21720919zb((InterfaceC451590HnJ) obj, c21704219wu));
            C21721619zi c21721619zi = new C21721619zi(c01gwLIZIZ);
            C21722319zp c21722319zp = new C21722319zp(c01gwLIZIZ);
            C1A03 c1a03 = new C1A03(c01gwLIZIZ);
            C1A0A c1a0a = new C1A0A(c01gwLIZIZ);
            C21723019zw c21723019zw = new C21723019zw(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c21705019x2, c21669219rG, new C452080Ho6(), c21721619zi, c21722319zp, c21704619wy, c21705319x5, c1a03, c1a0a, c21723019zw);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C21705119x3(c19719912DlLIZ), c21669219rG, new C21719219zK(), new C21704519wx(this), new C21704119wt(this), new C21704819x0(this), c21705319x5, new C1A0H(this), null, new C21701919wX(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C21705219x4(c19719912DlLIZ), c21669219rG, new C21719319zL(), new C21704319wv(this), new C21703919wr(this), new C21704019ws(this), c21705319x5, null, null, new C21701019wO(this));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C292401Bi.LIZ(new C21669319rH(this));
        this.LLILLL = C292401Bi.LIZ(new C21669419rI(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        C736680Sv4.LJIJJ(assemVMLazy.getValue(), new C493210JVv(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gz1, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
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
