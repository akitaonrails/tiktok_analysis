package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0SQ1;
import X.C0SWV;
import X.C1336205Ku;
import X.C1342220l24;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C720930SPr;
import X.InterfaceC913210Zs7;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class ReactionBubbleDmReplyCell extends ReactionBubbleContentCell<C0SWV> {
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String U5() {
        return "dm";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final C0SQ1 L5() {
        C0SWV c0swv = (C0SWV) getItem();
        if (c0swv != null) {
            return c0swv.LLILZLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String W5() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0SWV c0swv = (C0SWV) getItem();
        if (c0swv == null || (str = c0swv.LLILLL) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        C0SWV c0swv2 = (C0SWV) getItem();
        sbLIZ.append(c0swv2 != null ? Long.valueOf(c0swv2.LLILZ).toString() : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return strLIZIZ != null ? strLIZIZ : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final User getUser() {
        C0SWV c0swv = (C0SWV) getItem();
        if (c0swv != null) {
            return c0swv.LLILLJJLI;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Set<String> set;
        super.onViewAttachedToWindow();
        C0SQ1 c0sq1L5 = L5();
        if (c0sq1L5 == null || (set = c0sq1L5.LJI) == null || set.contains(W5())) {
            return;
        }
        set.add(W5());
        C0SWV c0swv = (C0SWV) getItem();
        if (c0swv != null) {
            Pair[] pairArr = new Pair[4];
            C0SQ1 c0sq1 = c0swv.LLILZLL;
            pairArr[0] = new Pair(c0sq1 != null ? c0sq1.LIZIZ : null, "enter_from");
            C0SQ1 c0sq12 = c0swv.LLILZLL;
            pairArr[1] = new Pair(c0sq12 != null ? c0sq12.LJ : null, "story_type");
            pairArr[2] = new Pair("dm", "notice_type");
            pairArr[3] = new Pair(c0swv.LLILLJJLI.getUid(), "from_user_id");
            C20684815ws.LJIJI("interaction_bullet_show", pairArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final CharSequence I5(C720930SPr c720930SPr) {
        return ((C0SWV) c720930SPr).LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String N5(C720930SPr c720930SPr) {
        String str;
        C0SWV c0swv = (C0SWV) c720930SPr;
        User user = c0swv.LLILLJJLI;
        C0SQ1 c0sq1 = c0swv.LLILZLL;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        return C1342220l24.LJ(user, str, true, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final /* bridge */ /* synthetic */ String P5(C720930SPr c720930SPr) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final /* bridge */ /* synthetic */ boolean S5(C720930SPr c720930SPr) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final void V5(View view) {
        String str;
        String authorUid;
        String aid;
        Aweme aweme;
        C0SQ1 c0sq1;
        Aweme aweme2;
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        Context context = view.getContext();
        C2201941BFw c2201941BFw = IMUser.Companion;
        User user = getUser();
        c2201941BFw.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, C2201941BFw.LIZJ(user));
        C0SQ1 c0sq1L5 = L5();
        Long lValueOf = null;
        if (c0sq1L5 != null) {
            str = c0sq1L5.LIZIZ;
        } else {
            str = null;
        }
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterMethodForMob("click_story_dm_bullet");
        enterChatParams.setEnterFrom(0);
        C0SWV c0swv = (C0SWV) getItem();
        if (c0swv == null || (c0sq1 = c0swv.LLILZLL) == null || (aweme2 = c0sq1.LIZ) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        enterChatParams.setAuthorId(authorUid);
        C0SQ1 c0sq1L52 = L5();
        if (c0sq1L52 != null && (aweme = c0sq1L52.LIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        enterChatParams.setGroupId(aid);
        enterChatParams.setQuickChat(true);
        C0SWV c0swv2 = (C0SWV) getItem();
        if (c0swv2 != null) {
            lValueOf = Long.valueOf(c0swv2.LLILZ);
        }
        enterChatParams.setScrollToMsgId(lValueOf);
        imChatService.LJIILLIIL(enterChatParams, new InterfaceC913210Zs7() { // from class: X.0SWW
            @Override // X.InterfaceC913210Zs7
            public final void onDismiss() {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }

            @Override // X.InterfaceC913210Zs7
            public final void onShow() {
                C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            }
        });
    }
}
