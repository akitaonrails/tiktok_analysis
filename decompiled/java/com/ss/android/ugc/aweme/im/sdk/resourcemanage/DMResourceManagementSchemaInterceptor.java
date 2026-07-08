package com.ss.android.ugc.aweme.im.sdk.resourcemanage;

import X.C01GW;
import X.C05E5;
import X.C0PEM;
import X.C0PEN;
import X.C0PEO;
import X.C1336205Ku;
import X.C13LP;
import X.C1697810uHb;
import X.C169Q;
import X.C169Z;
import X.C207288169m;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C287670BPh;
import X.C452501pT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.im.sdk.resourcemanage.lego.DMDowngradeRejectionExecutionTaskConfig;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class DMResourceManagementSchemaInterceptor implements IInterceptor {
    public final Map<String, List<String>> LL = C2097608Jq.LJIIIIZZ(new Pair("chat/center", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("chat/message", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("chatting/message", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("im/stranger", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("im/detail", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("chat/center2", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("im/stranger_list", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("im/chat_room", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("im/friend_chat_detail", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("notification", C1697810uHb.LJIIJJI("enter_chat_page", "enter_inbox", "dm")), new Pair("inbox", C1697810uHb.LJIIJJI("enter_inbox", "enter_chat_page", "dm")), new Pair("user/notification", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("user/inbox/follower", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("home_inbox_fragment", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/system_notice/unsubscribe_setting", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/system_notice", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/system_notice/unsubscribe_setting_new", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/activity", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/followers", C1697810uHb.LJIIJJI("enter_inbox", "dm")), new Pair("inbox/bulletin_board", C1697810uHb.LJIIJJI("enter_inbox", "dm")));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(198));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean shouldHandleRoute(RouteIntent routeIntent) {
        return false;
    }

    public DMResourceManagementSchemaInterceptor() {
        C169Q c169q = C169Q.LLILLJJLI;
        C169Z c169z = C169Z.START_UP_STATE_ID;
        C05E5 c05e5 = new C05E5(c169z, AFwS276S0000000_31.get$arr$(140));
        c169q.getClass();
        C169Q.LJIIJJI("enter_chat_page", c05e5);
        C169Q.LJIIJJI("enter_inbox", new C05E5(c169z, AFwS276S0000000_31.get$arr$(141)));
        C169Q.LJIIJJI("dm", new C05E5(c169z, AFwS276S0000000_31.get$arr$(142)));
    }

    public static String LIZ(RouteIntent routeIntent) {
        String host;
        Uri uri = routeIntent.getUri();
        if (uri != null && (host = uri.getHost()) != null) {
            String path = routeIntent.getPath();
            if (path != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(host);
                sbLIZ.append(path);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return host;
        }
        return null;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws Exception {
        C0PEO c0peo;
        if (routeIntent == null) {
            return false;
        }
        List<String> list = this.LL.get(LIZ(routeIntent));
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C169Q.LLILLJJLI.LJIIIIZZ(it2.next(), C2097608Jq.LJ());
            }
        }
        C01GW c01gw = C207288169m.LIZIZ;
        if (((DMDowngradeRejectionExecutionTaskConfig) c01gw.getValue()).isEnable && C13LP.LJJJJ(LIZ(routeIntent), (Set) this.LLILLJJLI.getValue())) {
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            Intent extra = routeIntent.getExtra();
            if (extra != null && imChatService.LJJII(extra) && ((DMDowngradeRejectionExecutionTaskConfig) c01gw.getValue()).isEnable) {
                C169Q.LLILLJJLI.getClass();
                if (C287670BPh.LIZ()) {
                    c0peo = (C0PEO) C169Q.LLILZ.getValue();
                } else {
                    c0peo = new C0PEO() { // from class: X.169g
                        @Override // X.C0PEO
                        public final void LIZ() {
                        }

                        @Override // X.C0PEO
                        public final void LIZJ() {
                        }
                    };
                }
                c0peo.LIZJ();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0PEN(c0peo, null), 3);
            }
        }
        return false;
    }
}
