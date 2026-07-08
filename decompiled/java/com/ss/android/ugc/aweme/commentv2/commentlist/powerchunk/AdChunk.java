package com.ss.android.ugc.aweme.commentv2.commentlist.powerchunk;

import X.AbstractC1906720ziY;
import X.C03H5;
import X.C0ZP4;
import X.C1022820ciu;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1340610kzT;
import X.C1341810l1P;
import X.C13BV;
import X.C13LE;
import X.C1554960qZC;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C736680Sv4;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.AdCommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommonCommentAdItemCell;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AdChunk extends AbstractC1906720ziY implements InterfaceC724530SbT, ICommentPageVisibilityProtocol, IAdChunkAbility {
    public static final C1341810l1P LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public long LLIZLLLIL;
    public long LLJ;
    public InterfaceC665370Q7z LLJI;
    public final C1340610kzT LLJIJIL = new C1340610kzT(new AwS565S0100000_21(this, 495));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdChunk.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new C1341810l1P();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
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

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(AdCommentItemCell.class, CommonCommentAdItemCell.class);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    public final void LJJ() {
        if (this.LLILZLL.LJIIIIZZ() > 0) {
            this.LLILZLL.LJIIJJI(C13BV.INSTANCE, null);
        }
    }

    public final CommentContextSource LJJI() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1340610kzT c1340610kzT = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        if (c1340610kzT.LIZ == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = c1340610kzT.LIZ();
            CommentContextSource commentContextSource = null;
            if (interfaceC665370Q7zLIZ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLIZ, "source_default_key", CommentContextSource.class, null)) != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            c1340610kzT.LIZ = commentContextSource;
        }
        return c1340610kzT.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        Aweme aweme;
        C1341810l1P c1341810l1P = LLJILJIL;
        CommentContextSource commentContextSourceLJJI = LJJI();
        AwemeRawAd awemeRawAd = null;
        Aweme aweme2 = commentContextSourceLJJI != null ? CommentContextSourceKt.aweme(commentContextSourceLJJI) : null;
        c1341810l1P.getClass();
        if (C1341810l1P.LIZJ(aweme2)) {
            if (this.LLJ > 0) {
                this.LLIZLLLIL += System.currentTimeMillis() - this.LLJ;
            }
            this.LLJ = 0L;
            CommentContextSource commentContextSourceLJJI2 = LJJI();
            if (commentContextSourceLJJI2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLJJI2)) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_ad", "close", awemeRawAd);
            c1022820ciuLIZLLL.LIZJ(Long.valueOf(this.LLIZLLLIL), "duration");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageShow  ");
        C1341810l1P c1341810l1P = LLJILJIL;
        CommentContextSource commentContextSourceLJJI = LJJI();
        AwemeRawAd awemeRawAd = null;
        Aweme aweme2 = commentContextSourceLJJI != null ? CommentContextSourceKt.aweme(commentContextSourceLJJI) : null;
        c1341810l1P.getClass();
        sbLIZ.append(C1341810l1P.LIZIZ(aweme2) != null);
        C2188811AlT.LIZIZ(sbLIZ);
        CommentContextSource commentContextSourceLJJI2 = LJJI();
        if (C1341810l1P.LIZJ(commentContextSourceLJJI2 != null ? CommentContextSourceKt.aweme(commentContextSourceLJJI2) : null)) {
            this.LLIZLLLIL = 0L;
            this.LLJ = System.currentTimeMillis();
            CommentContextSource commentContextSourceLJJI3 = LJJI();
            if (commentContextSourceLJJI3 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLJJI3)) != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C2184171Adz.LIZLLL("comment_ad", "othershow", awemeRawAd).LJII();
        }
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
