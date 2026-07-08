package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem;

import X.C069P;
import X.C0ZGS;
import X.C0ZH0;
import X.C0ZH2;
import X.C0ZH3;
import X.C123100dR;
import X.C1360320lVG;
import X.C13DA;
import X.C1599690rjL;
import X.C19EG;
import X.C2097608Jq;
import X.C721360SRi;
import X.C729510SjV;
import X.C740740T3w;
import X.C869590Y9l;
import X.C896930ZGp;
import X.EnumC896890ZGl;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DetailFeedDMViewModel extends AssemViewModel<C896930ZGp> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C896930ZGp(0);
    }

    public static Map wQ2(String str) {
        String str2;
        C13DA c13da = new C13DA();
        if (Intrinsics.LJFF(str, "from_auto_message")) {
            str2 = "link_auto_message";
        } else {
            str2 = "chat_video_detail";
        }
        c13da.put("enter_from", str2);
        return c13da.build();
    }

    public static String zQ2(C0ZGS c0zgs, String str) {
        if (C123100dR.LIZ(str)) {
            boolean zLIZJ = C1360320lVG.LIZJ(str);
            boolean zLIZIZ = C1360320lVG.LIZIZ(str);
            if (c0zgs == C0ZGS.STICKER) {
                return "friend_tab_message_box_exposed_avatar";
            }
            if (c0zgs == C0ZGS.EMOJI) {
                return "friend_tab_message_box_exposed_emoji";
            }
            if (!zLIZJ && !zLIZIZ) {
                return "friend_tab_message_button";
            }
            return "friend_tab_message_box_input";
        }
        IMSharePanelApi.LIZ.getClass();
        return C1599690rjL.LIZ().getShareService().LJ(EnumC896890ZGl.TYPE_FRIENDS_PROFILE_REPOST_TAB);
    }

    public static Map xQ2(C869590Y9l c869590Y9l, String str, String str2) {
        Map<String, String> localExt;
        String str3;
        Map mapWQ2;
        C13DA c13da = new C13DA();
        if (str != null && (mapWQ2 = wQ2(str)) != null) {
            c13da.putAll(new LinkedHashMap(mapWQ2));
        }
        if (str2 == null) {
            str2 = "";
        }
        c13da.put("author_id", str2);
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str3 = localExt.get("aweme_id")) != null) {
            c13da.put("current_video_gid", str3);
        }
        return c13da.build();
    }

    public final void vQ2(C19EG c19eg, CharSequence charSequence, boolean z, boolean z2) {
        String aid;
        C0ZH2 c0zh2;
        Set<String> set;
        if (!z2) {
            return;
        }
        Aweme awemeLJFF = C740740T3w.LJFF(c19eg);
        if (awemeLJFF != null && (aid = awemeLJFF.getAid()) != null && (c0zh2 = C0ZH3.LIZ) != null && (set = c0zh2.LIZIZ) != null) {
            set.add(aid);
        }
        if (!z) {
            return;
        }
        setState(new AwS593S0100000_14(charSequence, 221));
    }

    public static Map yQ2(String str, String str2, Aweme aweme, C0ZGS c0zgs, EnumC896890ZGl enumC896890ZGl) {
        String str3;
        String str4;
        Pair[] pairArr = new Pair[2];
        if (c0zgs.isQuickReply()) {
            str3 = "emoji";
        } else {
            str3 = "text";
        }
        pairArr[0] = new Pair("dm_reply_type", str3);
        if (C729510SjV.LJJIJIL(aweme)) {
            str4 = "story";
        } else {
            str4 = "post";
        }
        pairArr[1] = new Pair("story_type", str4);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        IMSharePanelApi.LIZ.getClass();
        return C1599690rjL.LIZ().getShareService().LJIILLIIL(aweme, str, str2, null, null, C1599690rjL.LIZ().getShareService().LJI(enumC896890ZGl, null), null, mapLJIIJ);
    }

    public static Map AQ2(DetailFeedDMViewModel detailFeedDMViewModel, String str, C721360SRi c721360SRi, String str2, C0ZGS c0zgs, Aweme aweme, EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0, String str3) {
        String str4;
        String str5;
        detailFeedDMViewModel.getClass();
        String strZQ2 = zQ2(c0zgs, str3);
        detailFeedDMViewModel.getClass();
        IMContactApi.LIZ.getClass();
        String uid = null;
        IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str2, null, "quick_dm_box");
        C13DA c13da = new C13DA();
        if (iMUserLIZLLL != null) {
            uid = iMUserLIZLLL.getUid();
        }
        if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
            if (c0zgs.isQuickReply()) {
                str4 = "emoji";
            } else {
                str4 = "text";
            }
            c13da.put("dm_reply_type", str4);
            if (C729510SjV.LJJIJIL(aweme)) {
                str5 = "story";
            } else {
                str5 = "post";
            }
            c13da.put("story_type", str5);
        }
        if (C123100dR.LIZ(str3)) {
            c13da.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str3))));
            c13da.put("friends_tab_version", "v3.0");
            c13da.put("is_collapse_reposts", C1360320lVG.LIZLLL(Boolean.TRUE));
            if (strZQ2 != null) {
                c13da.put("enter_method", strZQ2);
            }
        }
        Map<String, String> mapBuild = c13da.build();
        IMSharePanelApi.LIZ.getClass();
        return C1599690rjL.LIZ().getShareService().LJIILLIIL(aweme, str, strZQ2, null, null, C1599690rjL.LIZ().getShareService().LJI(enumC896890ZGl, c0zh0), c721360SRi, mapBuild);
    }
}
