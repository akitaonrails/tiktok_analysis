package com.ss.android.ugc.aweme.search.detail.relatedsearch.ui;

import X.AbstractViewOnClickListenerC372950Ejl;
import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C03H5;
import X.C0HNP;
import X.C0PVX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C418040GaI;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452501pT;
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
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.detail.relatedsearch.ui.RelatedSearchWordCellOPT2;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RelatedSearchWordCellOPT2 extends PowerCell<C0PVX> implements InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 559));

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
        UrlModel urlModel;
        final int iLIZ;
        final C0PVX c0pvx = (C0PVX) interfaceC1891350zJl;
        final Context context = this.itemView.getContext();
        if (context != null) {
            final TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_rs_word);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(32);
                RelatedWord relatedWord = c0pvx.LL;
                final String str = relatedWord.text;
                if (Intrinsics.LJFF(relatedWord.wordType, "2")) {
                    iLIZ = (int) C418040GaI.LIZ(16);
                } else {
                    iLIZ = 0;
                }
                final TextPaint paint = tuxTextView.getPaint();
                tuxTextView.setMaxLines(2);
                HandlerHook.viewPost(tuxTextView, new Runnable() { // from class: X.0GuC
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void LIZ() {
                        int width = ((tuxTextView.getWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight()) - iLIZ;
                        String str2 = str;
                        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), paint, width).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
                        String strSubstring = str;
                        boolean z = true;
                        if (staticLayoutBuild.getLineCount() > 2 || (staticLayoutBuild.getLineCount() == 2 && staticLayoutBuild.getEllipsisCount(1) > 0)) {
                            strSubstring = str.substring(0, (staticLayoutBuild.getLineEnd(1) - staticLayoutBuild.getEllipsisCount(1)) - 1);
                        } else {
                            z = false;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strSubstring);
                        if (z) {
                            spannableStringBuilder.append((CharSequence) "...");
                        }
                        if (Intrinsics.LJFF(c0pvx.LL.wordType, "2")) {
                            RelatedSearchWordCellOPT2 relatedSearchWordCellOPT2 = this;
                            Context context2 = context;
                            relatedSearchWordCellOPT2.getClass();
                            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context2, R.raw.icon_arrow_broken_line_up);
                            tuxIconDrawable.setBounds(0, 0, (int) C418040GaI.LIZ(16), (int) C418040GaI.LIZ(16));
                            tuxIconDrawable.LJI(R.attr.a04, context2);
                            SpannableString spannableString = new SpannableString(" ");
                            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
                            c419890GdH.LIZIZ((int) C418040GaI.LIZ(4), 0, C426750GoL.LIZLLL(context2));
                            C786410Ut5.p2(spannableString, c419890GdH, 0, spannableString.length(), 33);
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.append((CharSequence) spannableString);
                        }
                        tuxTextView.setText(spannableStringBuilder);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("RelatedSearchWordCellOPT2@a4dc.onBindItemView$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RelatedSearchWordCellOPT2@a4dc.onBindItemView$1$1");
                    }
                });
            }
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.ttb);
            smartImageView.setBackground((Drawable) this.LL.getValue());
            List<UrlModel> list = c0pvx.LL.itemCoverImageUrl;
            UrlModel urlModel2 = null;
            if (list != null) {
                urlModel = (UrlModel) C13LP.LJJJLL(list);
            } else {
                urlModel = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(400));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJJI();
            List<UrlModel> list2 = c0pvx.LL.itemCoverImageUrl;
            if (list2 != null) {
                urlModel2 = (UrlModel) C13LP.LJJJLL(list2);
            }
            C438710HIf.LIZ(urlModel2);
            smartImageView.setOnTouchListener(I5(c0pvx, "image"));
            this.itemView.setOnTouchListener(I5(c0pvx, "text"));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bm0, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0HNP, X.0Hez] */
    public final C0HNP I5(final C0PVX c0pvx, final String str) {
        final Context context = this.itemView.getContext();
        ?? r3 = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0HNP
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                Drawable drawableLIZ;
                View view = this.LLJIJIL.itemView;
                if (z) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    drawableLIZ = c384050F3z.LIZ(this.LLJIJIL.itemView.getContext());
                } else {
                    drawableLIZ = null;
                }
                view.setForeground(drawableLIZ);
            }
        };
        r3.LLIZ = new InterfaceC446420Hey() { // from class: X.0PVW
            @Override // X.InterfaceC446420Hey
            public final void LIZ() {
                String str2;
                String wordSource;
                ISearchContextAbility iSearchContextAbilityLIZJ;
                C0PCY<C0PYD> c0pcyY30;
                C0PYD c0pyd;
                RelatedSearchWordCellOPT2 relatedSearchWordCellOPT2 = this.LIZ;
                C0PVX c0pvx2 = c0pvx;
                relatedSearchWordCellOPT2.getClass();
                Aweme aweme = c0pvx2.LLILLJJLI.getAweme();
                RelatedWord relatedWord = c0pvx2.LL;
                C0PXE c0pxe = (aweme == null || (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) == null || (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) == null || (c0pyd = (C0PYD) c0pcyY30.LIZJ()) == null) ? null : c0pyd.LLILZ;
                C653660PkS c653660PkS = new C653660PkS();
                c653660PkS.LJFF = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL;
                if (c0pxe == null || (str2 = c0pxe.LIZJ) == null) {
                    str2 = "";
                }
                c653660PkS.LJIIJJI = str2;
                c653660PkS.LIZ().put("is_inner", (c0pxe == null || !Intrinsics.LJFF(c0pxe.LIZ, Boolean.TRUE)) ? CardStruct.IStatusCode.DEFAULT : "1");
                c653660PkS.LJI = "general_search";
                View view = relatedSearchWordCellOPT2.itemView;
                Context context2 = view.getContext();
                Word word = relatedWord.wordRecord;
                if (word == null || (wordSource = word.getWordSource()) == null) {
                    wordSource = "related_search";
                }
                C670730QSp.LIZIZ(view, context2, c653660PkS, word, wordSource, null, C0QN9.RS, null, null, null);
            }
        };
        r3.LLIZLLLIL = new ATListenerS440S0100000_6(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0PXC
            /* JADX WARN: Removed duplicated region for block: B:100:0x029f A[PHI: r11
              0x029f: PHI (r11v7 com.ss.android.ugc.aweme.feed.model.Aweme) = (r11v6 com.ss.android.ugc.aweme.feed.model.Aweme), (r11v11 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:92:0x0276, B:99:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:108:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0364 A[PHI: r5
              0x0364: PHI (r5v59 com.ss.android.ugc.aweme.feed.model.Aweme) = (r5v58 com.ss.android.ugc.aweme.feed.model.Aweme), (r5v69 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:122:0x033b, B:129:0x0362] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:180:0x044b  */
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r20) {
                /*
                    Method dump skipped, instruction units count: 1104
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0PXC.LIZ(android.view.View):void");
            }
        }, 5);
        return r3;
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
