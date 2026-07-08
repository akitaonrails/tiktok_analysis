package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.C03GK;
import X.C10EU;
import X.C1357970lRT;
import X.C1358170lRn;
import X.C1358180lRo;
import X.C1358220lRs;
import X.C1358230lRt;
import X.C1358550lSP;
import X.C1359720lUI;
import X.C1609400rz0;
import X.C20684815ws;
import X.C21146717pB;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1358190lRp;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostNormalCell extends BaseRepostCell<C1357970lRT> {
    public TuxTextView LLJILJIL;

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final RepostReplyStruct T5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final Function1<C1609400rz0, Unit> I5() {
        return AFwS259S0000000_21.get$arr$(261);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final String R5() {
        UpvoteStruct upvoteStruct;
        User user;
        String uid;
        C1358220lRs c1358220lRs = (C1358220lRs) getItem();
        return (c1358220lRs == null || (upvoteStruct = c1358220lRs.LLILLJJLI) == null || (user = upvoteStruct.user) == null || (uid = user.getUid()) == null) ? "" : uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final UpvoteStruct S5() {
        C1357970lRT c1357970lRT = (C1357970lRT) getItem();
        if (c1357970lRT != null) {
            return c1357970lRT.LLILZIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final void W5() {
        super.W5();
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.t5x);
        this.LLJILJIL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 17), tuxTextView);
        }
        C03GK.LIZ(this.LLJILJIL, EnumC1358190lRp.BUTTON, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell
    public final UpvoteStruct d6() {
        C1357970lRT c1357970lRT = (C1357970lRT) getItem();
        if (c1357970lRT != null) {
            return c1357970lRT.LLILZIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1357970lRT c1357970lRT) {
        super.onBindItemView(c1357970lRT);
        if (C10EU.LJIILLIIL(c1357970lRT.LLILLL.LIZ)) {
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd;
        C1358230lRt.LIZIZ();
        if (C1358180lRo.LIZIZ()) {
            viewTd = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.i6p, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6p, viewGroup, false);
        }
        C1358230lRt.LIZ();
        if (C1358180lRo.LIZJ()) {
            viewTd.setBackground(null);
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e6(String str, String str2) {
        String str3;
        String aid;
        UpvoteStruct upvoteStruct;
        String str4;
        UpvoteStruct upvoteStruct2;
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = V5().LLILLJJLI;
        String str5 = null;
        if (videoItemParams != null) {
            str3 = videoItemParams.mEventType;
        } else {
            str3 = null;
        }
        String strAQ2 = V5().AQ2();
        Aweme aweme = V5().LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1357970lRT c1357970lRT = (C1357970lRT) getItem();
        if (c1357970lRT != null) {
            upvoteStruct = c1357970lRT.LLILZIL;
        } else {
            upvoteStruct = null;
        }
        boolean zLJ = C1359720lUI.LJ(upvoteStruct);
        C1357970lRT c1357970lRT2 = (C1357970lRT) getItem();
        if (c1357970lRT2 != null && (upvoteStruct2 = c1357970lRT2.LLILZIL) != null) {
            str5 = upvoteStruct2.upvoteId;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", strAQ2);
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LIZJ(zLJ ? 1 : 0, "with_text");
        c2344009Gk.LJIIIIZZ("repost_id", str5);
        C1358170lRn.LIZ(c2344009Gk, "click_btn_name", str2);
        if (Intrinsics.LJFF(str, "show")) {
            str4 = "ttsocial_repost_remove_comfirm_menu_show";
        } else if (!Intrinsics.LJFF(str, "click")) {
            return;
        } else {
            str4 = "ttsocial_repost_remove_comfirm_menu_click";
        }
        C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
    }
}
