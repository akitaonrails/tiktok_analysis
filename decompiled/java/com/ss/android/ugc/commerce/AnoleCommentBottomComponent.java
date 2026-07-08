package com.ss.android.ugc.commerce;

import X.C1009310cN7;
import X.C1017180cZo;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C726120Se2;
import X.C786410Ut5;
import X.EnumC696280RSw;
import X.InterfaceC1014340cVE;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleCommentBottomComponent extends UIContentAssem implements ICommentPageVisibilityProtocol, ICommentPageReusedProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C726120Se2 LLIZLLLIL = new C726120Se2();
    public final String LLJ = EnumC696280RSw.TT_FEED_COMMENT_BOTTOM.getSlotName();
    public Aweme LLJI;
    public IAnoleManager LLJIJIL;
    public ViewGroup LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnoleCommentBottomComponent.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        IAnoleManager iAnoleManager = this.LLJIJIL;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIJJI(this.LLJ);
        }
        this.LLJILJILJ = false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
        ICommerceCommentService iCommerceCommentServiceLIZJ;
        C1009310cN7 c1009310cN7LIZIZ;
        ViewGroup viewGroup;
        Aweme aweme = this.LLJI;
        IAnoleManager iAnoleManager = null;
        if (!C1017180cZo.LIZIZ(aweme != null ? aweme.getAwemeRawAd() : null, this.LLJ) || this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        if (this.LLJILJIL == null) {
            FrameLayout frameLayout = (FrameLayout) LJJIJL().findViewById(R.id.bm2);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(LJJIJL().getContext());
                frameLayout.setId(R.id.bm2);
                View viewLJJIJL = LJJIJL();
                if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                    viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            C786410Ut5.LJZ(0, frameLayout);
            this.LLJILJIL = frameLayout;
        }
        if (this.LLJIJIL == null) {
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iCommerceCommentServiceLIZJ = iCommerceService.LIZJ()) != null && (c1009310cN7LIZIZ = iCommerceCommentServiceLIZJ.LIZIZ(getContext(), this.LLJI)) != null) {
                iAnoleManager = c1009310cN7LIZIZ.LLILZ;
            }
            this.LLJIJIL = iAnoleManager;
        }
        IAnoleManager iAnoleManager2 = this.LLJIJIL;
        if (iAnoleManager2 != null) {
            iAnoleManager2.mount(this.LLJILJIL, this.LLJ, new InterfaceC1014340cVE() { // from class: X.0Se3
                @Override // X.InterfaceC1014340cVE
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZLLL(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJFF(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJII() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJJJIL() {
                }
            });
        }
        IAnoleManager iAnoleManager3 = this.LLJIJIL;
        if (iAnoleManager3 != null) {
            iAnoleManager3.LJIJI(this.LLJ);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        this.LLJI = aweme;
        this.LLJIJIL = null;
        this.LLJILJILJ = false;
        this.LLJILJIL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        CommentCommonModel commonModel;
        C726120Se2 c726120Se2 = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
        if (commentContextSourceLIZ != null && (commonModel = commentContextSourceLIZ.getCommonModel()) != null) {
            aweme = commonModel.aweme;
        } else {
            aweme = null;
        }
        this.LLJI = aweme;
    }
}
