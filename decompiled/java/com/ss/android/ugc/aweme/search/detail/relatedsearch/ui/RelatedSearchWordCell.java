package com.ss.android.ugc.aweme.search.detail.relatedsearch.ui;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C03H5;
import X.C0PVX;
import X.C0PYH;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C294620Bgi;
import X.C384050F3z;
import X.C418040GaI;
import X.C418440Gaw;
import X.C419890GdH;
import X.C426750GoL;
import X.C430110Gtl;
import X.C661350Pwr;
import X.C689780R3w;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC446420Hey;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ATListenerS440S0100000_6;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.RelatedSearchWordCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS90S0210000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RelatedSearchWordCell extends PowerCell<C0PVX> implements InterfaceC724530SbT {
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
        boolean z;
        int i;
        int i2;
        TuxIconDrawable tuxIconDrawable;
        final C0PVX c0pvx = (C0PVX) interfaceC1891350zJl;
        final Context context = this.itemView.getContext();
        if (context != null) {
            View view = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418040GaI.LIZ(8));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.dy, context);
            view.setBackground(c384050F3z.LIZ(context));
            C661350Pwr.LJIIJJI((int) C418040GaI.LIZ(8), this.itemView);
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_rs_word);
            C01GW<C0PYH> c01gw = C0PYH.LIZ;
            if (C418440Gaw.LJFF(C418440Gaw.LIZJ(context), context) <= 640) {
                z = true;
            } else {
                z = false;
            }
            if (tuxTextView != null) {
                if (z) {
                    i2 = 42;
                } else {
                    i2 = 32;
                }
                tuxTextView.setTuxFont(i2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c0pvx.LL.text);
                if (Intrinsics.LJFF(c0pvx.LL.wordType, "2")) {
                    if (C294620Bgi.LIZIZ) {
                        tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_arrow_broken_line_up);
                    } else {
                        tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_fire_3_fill);
                    }
                    tuxIconDrawable.setBounds(0, 0, (int) C418040GaI.LIZ(16), (int) C418040GaI.LIZ(16));
                    tuxIconDrawable.LJI(R.attr.a04, context);
                    SpannableString spannableString = new SpannableString(" ");
                    C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
                    c419890GdH.LIZIZ((int) C418040GaI.LIZ(4), 0, C426750GoL.LIZLLL(context));
                    C786410Ut5.p2(spannableString, c419890GdH, 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                tuxTextView.setText(spannableStringBuilder);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.tv_search_icon);
            if (tuxTextView2 != null) {
                if (z) {
                    i = 42;
                } else {
                    i = 32;
                }
                tuxTextView2.setTuxFont(i);
                TuxIconDrawable tuxIconDrawable2 = new TuxIconDrawable(context, R.raw.icon_magnifying_glass);
                tuxIconDrawable2.setBounds(0, 0, (int) C418040GaI.LIZ(16), (int) C418040GaI.LIZ(16));
                tuxIconDrawable2.LJI(R.attr.eh, context);
                SpannableString spannableString2 = new SpannableString(" ");
                C786410Ut5.p2(spannableString2, new C419890GdH(tuxIconDrawable2, 2), 0, spannableString2.length(), 33);
                tuxTextView2.setText(spannableString2);
            }
            C430110Gtl.LIZ(this.itemView, new AwS90S0210000_6(tuxTextView, z, this, 2));
            View view2 = this.itemView;
            final Context context2 = view2.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context2) { // from class: X.0HNW
                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z2) {
                    ColorDrawable colorDrawable;
                    int iIntValue;
                    View view3 = this.LLJIJIL.itemView;
                    if (z2) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        colorDrawable = new ColorDrawable(iIntValue);
                    } else {
                        colorDrawable = null;
                    }
                    view3.setForeground(colorDrawable);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0PVU
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    String str;
                    String wordSource;
                    ISearchContextAbility iSearchContextAbilityLIZJ;
                    C0PCY<C0PYD> c0pcyY30;
                    C0PYD c0pyd;
                    RelatedSearchWordCell relatedSearchWordCell = this.LIZ;
                    C0PVX c0pvx2 = c0pvx;
                    relatedSearchWordCell.getClass();
                    Aweme aweme = c0pvx2.LLILLJJLI.getAweme();
                    RelatedWord relatedWord = c0pvx2.LL;
                    C0PXE c0pxe = (aweme == null || (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) == null || (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) == null || (c0pyd = (C0PYD) c0pcyY30.LIZJ()) == null) ? null : c0pyd.LLILZ;
                    C653660PkS c653660PkS = new C653660PkS();
                    c653660PkS.LJFF = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL;
                    if (c0pxe == null || (str = c0pxe.LIZJ) == null) {
                        str = "";
                    }
                    c653660PkS.LJIIJJI = str;
                    c653660PkS.LIZ().put("is_inner", (c0pxe == null || !Intrinsics.LJFF(c0pxe.LIZ, Boolean.TRUE)) ? CardStruct.IStatusCode.DEFAULT : "1");
                    c653660PkS.LJI = "general_search";
                    View view3 = relatedSearchWordCell.itemView;
                    Context context3 = view3.getContext();
                    Word word = relatedWord.wordRecord;
                    if (word == null || (wordSource = word.getWordSource()) == null) {
                        wordSource = "related_search";
                    }
                    C670730QSp.LIZIZ(view3, context3, c653660PkS, word, wordSource, null, C0QN9.RS, null, null, null);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS440S0100000_6(new C689780R3w(this, c0pvx, 0), 13);
            view2.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bly, viewGroup, false);
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
