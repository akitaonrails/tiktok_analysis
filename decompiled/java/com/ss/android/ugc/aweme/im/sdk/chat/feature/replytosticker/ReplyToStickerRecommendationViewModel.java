package com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker;

import X.AnonymousClass0956;
import X.C01GW;
import X.C06RM;
import X.C0HJO;
import X.C0I3C;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1629106Zl;
import X.C23250099c;
import X.C452070Ho5;
import X.C452501pT;
import X.C452920HpS;
import X.C453220Hpw;
import X.C453240Hpy;
import X.C453530HqR;
import X.C454980Hsm;
import X.C457780HxI;
import X.C723600SZy;
import X.C724750Sbp;
import X.C736950SvV;
import X.C869590Y9l;
import X.InterfaceC0148002o;
import X.InterfaceC453150Hpp;
import X.InterfaceC456120Huc;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplyToStickerRecommendationViewModel extends AssemViewModel<C453220Hpw> implements InterfaceC453150Hpp {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C736950SvV LLILLJJLI;
    public final C01GW LLILLL;
    public volatile C869590Y9l LLILZ;
    public AnonymousClass0956 LLILZIL;
    public Function0<Boolean> LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public InterfaceC456120Huc LLJI;
    public volatile C452920HpS LLJIJIL;
    public volatile boolean LLJILJIL;

    @Override // X.InterfaceC453150Hpp
    public final void lx0() {
        this.LLIZLLLIL = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C453220Hpw(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyToStickerRecommendationViewModel() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 220);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(MessageReplyVM.class), new AwS550S0100000_6(awS550S0100000_6, 221), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS236S0000000_6.get$arr$(117), null, null, null);
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(81));
        this.LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(80));
        this.LLJI = C1629106Zl.LL;
    }

    public final boolean wQ2(C869590Y9l c869590Y9l) {
        C869590Y9l c869590Y9l2 = this.LLILZ;
        if (c869590Y9l2 == null || c869590Y9l.getMsgId() != c869590Y9l2.getMsgId()) {
            return false;
        }
        return true;
    }

    public final void vQ2(InterfaceC456120Huc interfaceC456120Huc, boolean z) {
        Function0<Boolean> function0;
        if (interfaceC456120Huc != null) {
            this.LLJI = interfaceC456120Huc;
        }
        boolean z2 = false;
        if (C06RM.LIZ() && interfaceC456120Huc != null && this.LLILZ != null && (function0 = this.LLILZLL) != null && function0.invoke().booleanValue()) {
            setState(AFwS236S0000000_6.get$arr$(116));
            return;
        }
        if (z && (!C06RM.LIZ() || !Intrinsics.LJFF(interfaceC456120Huc, C1629106Zl.LL))) {
            z2 = true;
        }
        this.LLIZ = null;
        this.LLJIJIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        setState(new AwS21S0010000_6(z2, 1));
    }

    public static void xQ2(ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModel, boolean z, C869590Y9l c869590Y9l, int i) {
        String str;
        C0HJO c0hjoLIZ;
        boolean z2;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            c869590Y9l = null;
        }
        if (z) {
            if (!C06RM.LIZ() && !Intrinsics.LJFF(replyToStickerRecommendationViewModel.LLJI, C1629106Zl.LL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            Function0<Boolean> function0 = replyToStickerRecommendationViewModel.LLILZLL;
            if (function0 != null && function0.invoke().booleanValue() && !replyToStickerRecommendationViewModel.LLIZLLLIL && !z2) {
                str = "open_keyboard";
            } else {
                return;
            }
        } else {
            if (c869590Y9l != null) {
                ((MessageReplyVM) replyToStickerRecommendationViewModel.LLILLJJLI.getValue()).qH1(new C454980Hsm(c869590Y9l, C0I3C.REPLY_ICON));
            }
            replyToStickerRecommendationViewModel.setState(AFwS236S0000000_6.get$arr$(472));
            str = "sticker_reply_button";
        }
        C869590Y9l c869590Y9l2 = replyToStickerRecommendationViewModel.LLILZ;
        if (c869590Y9l2 != null && (c0hjoLIZ = C453530HqR.LIZ(c869590Y9l2)) != null && !Intrinsics.LJFF(c0hjoLIZ.LIZ, replyToStickerRecommendationViewModel.LLIZ)) {
            replyToStickerRecommendationViewModel.vQ2(null, !C06RM.LIZ());
            replyToStickerRecommendationViewModel.LLIZ = c0hjoLIZ.LIZ;
            replyToStickerRecommendationViewModel.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(replyToStickerRecommendationViewModel), C0PEM.LIZJ, null, new C453240Hpy(c0hjoLIZ, c869590Y9l2, str, replyToStickerRecommendationViewModel, null), 2);
        }
    }
}
