package com.ss.android.ugc.aweme.commentv2.commentlist.ui;

import X.C0BTU;
import X.C0BY0;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19467111Ef;
import X.C2217381BqS;
import X.C426750GoL;
import X.C506101y7;
import X.C687700QyG;
import X.C726120Se2;
import X.C786410Ut5;
import X.C946803n0;
import X.C990310bsT;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommentFloatAdAssem extends UIContentAssem implements ICommentFloatAdAbility, ICommentPageReusedProtocol, ICommentPageVisibilityProtocol, InterfaceC1554640qYg, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final CommentFloatAdAssem LLIZLLLIL = this;
    public final C726120Se2 LLJ = new C726120Se2();
    public WidgetManager LLJI;
    public DataCenter LLJIJIL;
    public Widget LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentFloatAdAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1220573421) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        DataCenter dataCenter = this.LLJIJIL;
        if (dataCenter != null) {
            dataCenter.zQ2(7, "comment_dialog_state");
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        DataCenter dataCenter;
        DataCenter dataCenter2 = this.LLJIJIL;
        if (dataCenter2 != null) {
            dataCenter2.zQ2(8, "comment_dialog_state");
        }
        if (((Number) C0BTU.LIZ.getValue()).intValue() > 0 && (dataCenter = this.LLJIJIL) != null) {
            dataCenter.zQ2(0, "comment_ad_view_state");
        }
        DataCenter dataCenter3 = this.LLJIJIL;
        if (dataCenter3 != null) {
            dataCenter3.zQ2(5, "comment_dialog_state");
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility
    public final void e40() {
        DataCenter dataCenter = this.LLJIJIL;
        if (dataCenter != null) {
            C726120Se2 c726120Se2 = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
            dataCenter.zQ2(new Pair(0, commentContextSourceLIZ != null ? commentContextSourceLIZ.getCurrSortType() : null), "comment_shown");
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility
    public final Boolean isVisible() {
        IAdCommentDepend iAdCommentDependLJJIJ = AdCommentDependImpl.LJJIJ();
        Widget widget = this.LLJILJIL;
        if (widget == null) {
            return Boolean.FALSE;
        }
        if (iAdCommentDependLJJIJ != null) {
            return Boolean.valueOf(iAdCommentDependLJJIJ.LJJII(widget));
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Widget widget = this.LLJILJIL;
        if (widget != null) {
            WidgetManager widgetManager = this.LLJI;
            if (widgetManager != null) {
                widgetManager.getLifecycle().removeObserver(widget);
                int i = C19467111Ef.LIZ[widgetManager.getLifecycle().getCurrentState().ordinal()];
                if (i == 2) {
                    widget.onDestroy();
                } else if (i == 3) {
                    widget.onStop();
                    widget.onDestroy();
                } else if (i == 4) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
                widget.LLILZIL = null;
                widget.LLILZ = null;
                ((CopyOnWriteArrayList) widgetManager.LLIZLLLIL).remove(widget);
                View view = widget.LLILLJJLI;
                if (view != widget.LLILLL && (view instanceof ViewGroup)) {
                    C786410Ut5.LJJJJI((ViewGroup) view);
                }
            }
            this.LLJI = null;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public final void Go(Aweme aweme) {
        DataCenter dataCenter;
        if (aweme != null && (dataCenter = this.LLJIJIL) != null) {
            dataCenter.zQ2(new Pair(aweme, null), "comment_aweme_and_params");
            dataCenter.zQ2(new Pair(aweme, C990310bsT.LIZ(aweme)), "comment_aweme_and_link");
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility
    public final void ZI0(int i) {
        C426750GoL.LJIIIZ(LJJIJL(), null, null, null, Integer.valueOf(i), false, 23);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public final void bT(Aweme aweme) {
        DataCenter dataCenter = this.LLJIJIL;
        if (dataCenter != null) {
            dataCenter.zQ2(0, "comment_ad_view_state");
        }
        Go(aweme);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentPageScope.class}).unbindAbility(this.LLIZLLLIL, ICommentFloatAdAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentFloatAdAbility
    public final void gf0(CommentStruct commentStruct) {
        DataCenter dataCenter = this.LLJIJIL;
        if (dataCenter != null) {
            dataCenter.zQ2(commentStruct, "comment_ad_struct");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CommentCommonModel commonModel;
        WidgetManager widgetManager;
        Lifecycle lifecycle;
        super.onViewCreated(view);
        Fragment fragmentLIZ = C946803n0.LIZ(LJJIJL());
        if (fragmentLIZ != null && this.LLJILJIL == null) {
            this.LLJIJIL = DataCenter.vQ2(ViewModelProviders.of(fragmentLIZ), this);
            this.LLJILJIL = AdCommentDependImpl.LJJIJ().LJFF(AFwS204S0000000_16.get$arr$(576));
            WidgetManager widgetManagerSR = WidgetManager.SR(LJJIJL(), C946803n0.LIZ(LJJIJL()));
            this.LLJI = widgetManagerSR;
            if (widgetManagerSR != null) {
                widgetManagerSR.UR(this.LLJIJIL);
            }
            WidgetManager widgetManager2 = this.LLJI;
            Aweme aweme = null;
            if (widgetManager2 != null) {
                Widget widget = this.LLJILJIL;
                if (widget == null) {
                    widget = null;
                }
                widgetManager2.PR(R.id.er2, widget);
            }
            if (((Number) C0BY0.LIZ.getValue()).intValue() > 0 && (widgetManager = this.LLJI) != null && (lifecycle = widgetManager.getLifecycle()) != null) {
                C506101y7.LIZ(lifecycle, new ARunnableS116S0100000_16(this, 283));
            }
            C726120Se2 c726120Se2 = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
            CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
            if (commentContextSourceLIZ != null && (commonModel = commentContextSourceLIZ.getCommonModel()) != null) {
                aweme = commonModel.aweme;
            }
            Go(aweme);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentPageScope.class}).bindAbility(this.LLIZLLLIL, ICommentFloatAdAbility.class);
    }
}
