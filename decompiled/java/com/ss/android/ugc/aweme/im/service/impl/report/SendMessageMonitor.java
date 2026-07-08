package com.ss.android.ugc.aweme.im.service.impl.report;

import X.C09EF;
import X.C0YC9;
import X.C1227904rF;
import X.C2188811AlT;
import X.C869590Y9l;
import X.C882400YjW;
import X.C882690Yjz;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report.SendMsgReportUtil;
import com.ss.android.ugc.aweme.im.service.service.ISendMessageMonitor;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageMonitor implements ISendMessageMonitor {
    public static final SendMessageMonitor LIZIZ = new SendMessageMonitor();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements ISendMessageMonitor {
        public final /* synthetic */ SendMessageMonitor LIZIZ = SendMessageMonitor.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.ISendMessageMonitor
        public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
            this.LIZIZ.LIZ(c869590Y9l, c0yc9);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.ISendMessageMonitor
    public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
        if (c869590Y9l == null || c0yc9 == null) {
            return;
        }
        String str = c0yc9.LJJIJ;
        if (str == null) {
            str = "";
        }
        int msgType = c869590Y9l.getMsgType();
        String strName = c0yc9.LIZ().name();
        SendMsgReportUtil.LIZIZ.getClass();
        SendMessageFailureFeedbackRecord sendMessageFailureFeedbackRecord = new SendMessageFailureFeedbackRecord(str, Integer.valueOf(msgType), Integer.valueOf(SendMsgReportUtil.LIZIZ(c0yc9)), strName, Long.valueOf(c869590Y9l.getCreatedAt()));
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(sendMessageFailureFeedbackRecord);
        if (strLJI == null) {
            strLJI = GsonProtectorUtils.toJson(C09EF.LIZ, sendMessageFailureFeedbackRecord);
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedback: message_send_fail, ");
        sbLIZ.append(strLJI);
        C882690Yjz.LJIIIZ("IMErrorMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIIZZ(strLJI);
    }
}
