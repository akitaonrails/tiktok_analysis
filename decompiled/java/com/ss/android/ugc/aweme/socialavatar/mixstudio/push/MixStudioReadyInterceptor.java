package com.ss.android.ugc.aweme.socialavatar.mixstudio.push;

import X.C01GW;
import X.C069P;
import X.C1336205Ku;
import X.C1976907ol;
import X.C2097908Jt;
import X.C452501pT;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MixStudioReadyInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(328));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(381));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "mix_studio");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.push.MixStudioReadyInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(Context context, String str, String str2) {
        IMContactApi.LIZ.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, C069P.LIZ().LJ().LJIIL(str, null, "im_local_db"));
        enterChatParams.setChatType(0);
        if (str2 != null) {
            enterChatParams.setExtras(C2097908Jt.LIZJ(new Pair("mix_sticker_id", str2)));
        }
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }
}
