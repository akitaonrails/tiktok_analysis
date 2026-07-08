package com.ss.android.ugc.aweme.upvote.detail.repostshare;

import X.C10EU;
import X.C1159070gGf;
import X.C1356790lPZ;
import X.C1358170lRn;
import X.C1358550lSP;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareRepostViewModel extends AssemViewModel<C1159070gGf> {
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159070gGf(0);
    }

    public final void vQ2() {
        setStateImmediate(AFwS257S0000000_19.get$arr$(329));
    }

    public final void wQ2(Aweme aweme, UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, String str) {
        String uid;
        User user;
        String uid2;
        String aid;
        User author;
        User user2;
        String strLIZIZ = C1356790lPZ.LIZIZ(repostReplyStruct, upvoteStruct);
        String uid3 = null;
        if (repostReplyStruct == null || (user2 = repostReplyStruct.user) == null || (uid = user2.getUid()) == null) {
            if (upvoteStruct != null && (user = upvoteStruct.user) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
        }
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        String str2 = this.LL;
        String str3 = this.LLILLL;
        User userLIZ = C10EU.LIZ();
        if (userLIZ != null) {
            uid2 = userLIZ.getUid();
        } else {
            uid2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(uid, uid2);
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_type", str3);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid3 = author.getUid();
        }
        c2344009Gk.LJIIIIZZ("author_id", uid3);
        c2344009Gk.LJIIIIZZ("panel_source", "repost_share_panel");
        c2344009Gk.LJIIIIZZ("button_name", str);
        C1358170lRn.LIZ(c2344009Gk, "repost_type", strLIZIZ);
        C1358170lRn.LIZ(c2344009Gk, "is_self", Integer.valueOf(zLJFF ? 1 : 0));
        C1358170lRn.LIZ(c2344009Gk, "to_user_id", uid);
        C20684815ws.LJIILLIIL("ttsocial_share_panel_btn_click", c2344009Gk.LIZ);
    }
}
