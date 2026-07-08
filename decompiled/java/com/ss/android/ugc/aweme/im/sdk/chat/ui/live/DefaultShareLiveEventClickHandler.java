package com.ss.android.ugc.aweme.im.sdk.chat.ui.live;

import X.C098200Yq;
import X.C0I0B;
import X.C0ZDX;
import X.C0ZVS;
import X.C1389890mGx;
import X.C189200o6;
import X.C2213981Bky;
import X.C824410WVr;
import X.C869590Y9l;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareLiveEventClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultShareLiveEventClickHandler implements MessageListShareLiveEventClickAbility {
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareLiveEventClickAbility
    public final void CC2(View view, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent) {
        String str;
        String str2;
        Object c098200Yq;
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        if (iMLiveServiceLIZ != null) {
            iMLiveServiceLIZ.isEnableLive();
            String linkUrl = shareLiveEventContent.getLinkUrl();
            if (linkUrl != null && linkUrl.length() > 0) {
                try {
                    c098200Yq = UriProtector.parse(linkUrl);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String host = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Uri uri = (Uri) c098200Yq;
                if (uri != null) {
                    host = uri.getHost();
                }
                if (Intrinsics.LJFF(host, "webcast_lynxview_popup")) {
                    SmartRouter.buildRoute(C2213981Bky.LIZIZ.getCurrentActivity(), linkUrl).open();
                } else {
                    C824410WVr.LIZ(C2213981Bky.LIZIZ.getCurrentActivity(), linkUrl, true);
                }
            }
            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                str = "livesdk_live_event_anchor_entrance_click";
            } else {
                str = "livesdk_live_event_user_entrance_click";
            }
            if (C0ZDX.LJJIJIIJIL(c869590Y9l)) {
                str2 = "group_chat";
            } else {
                str2 = "single_chat";
            }
            IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMMessageAdapterAnalytics.class, false, false, false, 14, null);
            if (iIMMessageAdapterAnalytics != null) {
                iIMMessageAdapterAnalytics.LIZLLL(str, shareLiveEventContent.getEventId(), shareLiveEventContent.isPaidEvent(), shareLiveEventContent.getEventId(), shareLiveEventContent.getEventType(), str2, c869590Y9l.getConversationId(), String.valueOf(c869590Y9l.getSender()), C0I0B.LJFF.LIZIZ());
                return;
            }
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131831116);
        c1389890mGx.LJIIJJI();
    }
}
