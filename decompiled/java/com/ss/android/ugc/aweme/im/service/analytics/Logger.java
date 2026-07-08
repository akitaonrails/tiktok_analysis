package com.ss.android.ugc.aweme.im.service.analytics;

import X.C0I0B;
import X.C2097608Jq;
import X.C830490Whz;
import X.InterfaceC1294060jmO;
import X.InterfaceC1493105sv;
import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class Logger implements ILogger {
    public static final Logger LIZIZ = new Logger();

    public static final class Service implements ILogger {
        public final /* synthetic */ Logger LIZIZ = Logger.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LIZ() {
            this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LIZJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZJ(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LIZLLL(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZLLL(str, str2, str3, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LJ(SharePackage sharePackage, String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJ(sharePackage, str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
        public final void LJFF(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJFF(str, str2, str3, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LIZ() {
        C0I0B.LJFF.LIZIZ().sendEvent("index_bar_click", C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "contact_list");
        c830490Whz.put("enter_method", "click_multi_choose_button");
        interfaceC1493105sv.sendEvent("enter_multi_choose_contact", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LIZJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", str);
        interfaceC1493105sv.sendEvent("search_contact", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LJ(SharePackage sharePackage, String str, InterfaceC1493105sv interfaceC1493105sv) {
        Bundle bundle = sharePackage.extras;
        String string = bundle.getString("previous_page");
        String string2 = bundle.getString("enter_from");
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", str);
        c830490Whz.put("enter_from", string2);
        c830490Whz.put("previous_page", string);
        interfaceC1493105sv.sendEvent("enter_more_friend_list", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LIZLLL(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("chat_type", str2);
        c830490Whz.put("conversation_id", str);
        if (str3 != null) {
            c830490Whz.put("enter_from", str3);
        }
        interfaceC1493105sv.sendEvent("chat_report_click", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ILogger
    public final void LJFF(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("chat_type", "private");
        c830490Whz.put("to_status", str2);
        interfaceC1493105sv.sendEvent(str3, c830490Whz);
    }
}
