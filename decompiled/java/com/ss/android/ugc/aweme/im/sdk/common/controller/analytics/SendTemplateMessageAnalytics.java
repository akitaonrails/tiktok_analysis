package com.ss.android.ugc.aweme.im.sdk.common.controller.analytics;

import X.AnonymousClass0629;
import X.C08JS;
import X.C0PEM;
import X.C0YC9;
import X.C0ZCK;
import X.C0ZCL;
import X.C23250099c;
import X.C817503Hh;
import X.C869590Y9l;
import X.C901060ZWm;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.service.analytics.ISendTemplateMessageAnalytics;

/* JADX INFO: loaded from: classes15.dex */
public final class SendTemplateMessageAnalytics implements ISendTemplateMessageAnalytics {
    public static final SendTemplateMessageAnalytics LIZIZ = new SendTemplateMessageAnalytics();

    public static final class Service implements ISendTemplateMessageAnalytics {
        public final /* synthetic */ SendTemplateMessageAnalytics LIZIZ = SendTemplateMessageAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.ISendTemplateMessageAnalytics
        public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
            this.LIZIZ.LIZ(c869590Y9l, c0yc9);
        }
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 3001) {
            switch (msgType) {
                case 1801:
                    return "image_card";
                case 1802:
                    return "photo_card";
                case 1803:
                    return "video_card";
                default:
                    return "unknown";
            }
        }
        return "image_card";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.ISendTemplateMessageAnalytics
    public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
        IMAIServiceAPI.LIZ.getClass();
        if (AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId())) {
            return;
        }
        int msgStatus = c869590Y9l.getMsgStatus();
        if (msgStatus != 1) {
            if (msgStatus != 2 && msgStatus != 3) {
                return;
            }
            if (!C901060ZWm.LIZ(c869590Y9l).containsKey("intercept_report_send_message") && !AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId())) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C0ZCK(c869590Y9l, c0yc9, null), 2);
            }
            if (c869590Y9l.getMsgStatus() != 3) {
                return;
            }
            c869590Y9l.addLocalExt("r:retry_local_ext_map", C08JS.LIZLLL(C901060ZWm.LIZ(c869590Y9l)));
            return;
        }
        if (C901060ZWm.LIZ(c869590Y9l).containsKey("intercept_report_send_message") || AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId())) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C0ZCL(c869590Y9l, null), 2);
    }
}
