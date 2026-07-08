package com.ss.android.ugc.aweme.analytics;

import X.C2097608Jq;
import X.C2097908Jt;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics;
import kotlin.Pair;

/* JADX INFO: loaded from: classes36.dex */
public final class IMCreateChatAnalytics implements IIMCreateChatAnalytics {
    public static final IMCreateChatAnalytics LIZ = new IMCreateChatAnalytics();

    public static final class Service implements IIMCreateChatAnalytics {
        public final /* synthetic */ IMCreateChatAnalytics LIZ = IMCreateChatAnalytics.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
        public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
        public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
        public final void LIZJ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZJ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
        public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZLLL(interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
    public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("dismiss_new_chat_panel", C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_new_chat_panel", C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
    public final void LIZJ(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_new_group_chat_panel", C2097908Jt.LIZJ(new Pair("enter_from", "notification_page")));
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics
    public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("dismiss_new_group_chat_panel", C2097608Jq.LJ());
    }
}
