package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C03H5;
import X.C04J2;
import X.C0H9H;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C426160GnO;
import X.C704302oz;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1338240kve;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveSecurityBlock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveSecuritySection;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveSecuritySectionViewHolder extends PowerCell<C704302oz> implements InterfaceC724530SbT {
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
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C426160GnO c426160GnO;
        Image icon;
        SmartImageView smartImageView;
        SaveSecuritySection saveSecuritySection = ((C704302oz) interfaceC1891350zJl).LL;
        View view = this.itemView;
        if ((view instanceof C426160GnO) && (c426160GnO = (C426160GnO) view) != null) {
            C786410Ut5.LJJJJZ(c426160GnO);
            int i = 0;
            c426160GnO.setGravity(0);
            List<SaveSecurityBlock> list = saveSecuritySection.blocks;
            if (list != null) {
                for (SaveSecurityBlock saveSecurityBlock : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Icon icon2 = saveSecurityBlock.icon;
                        if (C960203pA.LIZIZ(this.itemView.getContext())) {
                            if (icon2 != null) {
                                icon = icon2.getIconDark();
                                if (icon == null) {
                                    icon = icon2.getIcon();
                                    if (icon != null) {
                                    }
                                }
                                smartImageView = new SmartImageView(this.itemView.getContext());
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C0H9H.LIZIZ(64), C0H9H.LIZIZ(40));
                                marginLayoutParams.setMarginStart(C0H9H.LIZIZ(4));
                                marginLayoutParams.setMarginEnd(C0H9H.LIZIZ(4));
                                marginLayoutParams.bottomMargin = C0H9H.LIZIZ(8);
                                C786410Ut5.G6(smartImageView, marginLayoutParams);
                                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                                String uri = icon.getUri();
                                c1326790kdB.getClass();
                                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(uri);
                                c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
                                c1331670kl3LIZLLL.LJJI(smartImageView);
                                c1331670kl3LIZLLL.LJIIJ(new C04J2(smartImageView, 3));
                            }
                            smartImageView = null;
                        } else {
                            if (icon2 != null) {
                                icon = icon2.getIcon();
                                if (icon == null) {
                                    icon = icon2.getIconDark();
                                    if (icon != null) {
                                    }
                                }
                                smartImageView = new SmartImageView(this.itemView.getContext());
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(C0H9H.LIZIZ(64), C0H9H.LIZIZ(40));
                                marginLayoutParams2.setMarginStart(C0H9H.LIZIZ(4));
                                marginLayoutParams2.setMarginEnd(C0H9H.LIZIZ(4));
                                marginLayoutParams2.bottomMargin = C0H9H.LIZIZ(8);
                                C786410Ut5.G6(smartImageView, marginLayoutParams2);
                                C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                                String uri2 = icon.getUri();
                                c1326790kdB2.getClass();
                                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(uri2);
                                c1331670kl3LIZLLL2.LJJ = EnumC1338240kve.FIT_XY;
                                c1331670kl3LIZLLL2.LJJI(smartImageView);
                                c1331670kl3LIZLLL2.LJIIJ(new C04J2(smartImageView, 3));
                            }
                            smartImageView = null;
                        }
                        c426160GnO.addView(smartImageView);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C426160GnO c426160GnO = new C426160GnO(viewGroup.getContext(), null, 6);
        c426160GnO.setPadding(C0H9H.LIZIZ(16), C0H9H.LIZIZ(12), C0H9H.LIZIZ(16), C0H9H.LIZIZ(4));
        C786410Ut5.a7(c426160GnO, new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iIntValue = 0;
        gradientDrawable.setShape(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zr, viewGroup.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        gradientDrawable.setColor(iIntValue);
        c426160GnO.setBackground(gradientDrawable);
        return c426160GnO;
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
