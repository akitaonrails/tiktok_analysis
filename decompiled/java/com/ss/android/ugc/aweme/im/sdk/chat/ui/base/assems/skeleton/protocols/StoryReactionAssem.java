package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C019F;
import X.C0ZP4;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C461000I5y;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C869590Y9l;
import X.InterfaceC2217461Bqa;
import android.view.ViewPropertyAnimator;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class StoryReactionAssem extends QuotedAreaReusedAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public ViewPropertyAnimator LLLIL;
    public final AssemVMLazy LLLILZ;
    public C0ZP4 LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryReactionAssem.class, "scrollToMessageViewModel", "getScrollToMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/ability/ScrollToMessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryReactionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ScrollToMessageViewModel.class);
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 311), AFwS236S0000000_6.get$arr$(180), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLI = null;
        ViewPropertyAnimator viewPropertyAnimator = this.LLLIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        C0ZP4 c0zp4 = this.LLLILZJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final /* bridge */ /* synthetic */ void ep(C869590Y9l c869590Y9l, C461000I5y c461000I5y) {
        ep(c869590Y9l, c461000I5y);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem
    /* JADX INFO: renamed from: tp */
    public final void ep(C869590Y9l c869590Y9l, C461000I5y c461000I5y) {
        super.ep(c869590Y9l, c461000I5y);
        AssemVMLazy assemVMLazy = this.LLLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        this.LLLILZJ = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0I6d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461100I6i) obj).LLILLJJLI;
            }
        }, null, new AwS442S0200000_6(this, c869590Y9l, 3), 6);
    }
}
