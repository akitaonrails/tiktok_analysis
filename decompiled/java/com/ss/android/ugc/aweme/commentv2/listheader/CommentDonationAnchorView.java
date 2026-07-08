package com.ss.android.ugc.aweme.commentv2.listheader;

import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C726120Se2;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public final class CommentDonationAnchorView extends UIContentAssem implements ICommentPageReusedProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C726120Se2 LLIZLLLIL = new C726120Se2();
    public View LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentDonationAnchorView.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final CommentContextSource Go() {
        C726120Se2 c726120Se2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return c726120Se2.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        if (r0.shouldShowVideoDesc == true) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.listheader.CommentDonationAnchorView.Ho(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Ho(aid);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String aid;
        Aweme aweme;
        super.onViewCreated(view);
        CommentContextSource commentContextSourceGo = Go();
        if (commentContextSourceGo != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceGo)) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Ho(aid);
    }
}
