package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report;

import X.C051M;
import X.C0PEM;
import X.C0YC9;
import X.C0YCH;
import X.C0YCP;
import X.C0ZCM;
import X.C2296808zG;
import X.C23250099c;
import X.C869590Y9l;
import X.C914170Ztf;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.service.service.ISendMsgReportUtil;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMsgReportUtil implements ISendMsgReportUtil {
    public static final SendMsgReportUtil LIZIZ = new SendMsgReportUtil();

    public static final class Service implements ISendMsgReportUtil {
        public final /* synthetic */ SendMsgReportUtil LIZIZ = SendMsgReportUtil.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.ISendMsgReportUtil
        public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
            this.LIZIZ.LIZ(c869590Y9l, c0yc9);
        }
    }

    public static int LIZIZ(C0YC9 c0yc9) {
        C0YCH c0ychLIZ;
        if (c0yc9 == null || (c0ychLIZ = c0yc9.LIZ()) == null) {
            return -1;
        }
        int i = C0YCP.LIZ[c0ychLIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                int statusCode = 0;
                if (i != 4) {
                    return 0;
                }
                String str = c0yc9.LJJII;
                if (str != null) {
                    try {
                        CheckMessage checkMessage = (CheckMessage) C051M.LIZIZ(CheckMessage.class, str);
                        if (checkMessage != null) {
                            statusCode = checkMessage.getStatusCode();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                long j = c0yc9.LJJIFFI;
                if (statusCode == 0 && j != -1) {
                    statusCode = (int) j;
                }
                int i2 = c0yc9.LJJIII;
                if (statusCode == 0 && i2 != -1) {
                    return i2;
                }
                return statusCode;
            }
            return c0yc9.LJJIIJ;
        }
        return c0yc9.LJJIIJZLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(org.json.JSONObject r7, X.C0YC9 r8) {
        /*
            if (r8 != 0) goto L3
            return
        L3:
            long r4 = r8.LJIL
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto Lc
            r8 = 0
        Lc:
            java.lang.String r5 = "0"
            java.lang.String r4 = "sdk_metrics_valid"
            if (r8 == 0) goto L64
            java.lang.String r0 = "sdk_bs_stc"
            r7.put(r0, r2)
            java.lang.String r6 = "sdk_bs_sc"
            long r0 = r8.LJFF
            r7.put(r6, r0)
            java.lang.String r6 = "sdk_bs_ncc"
            long r0 = r8.LJI
            r7.put(r6, r0)
            java.lang.String r0 = "sdk_bs_fci"
            r7.put(r0, r5)
            java.lang.String r0 = "sdk_bs_fcic"
            r7.put(r0, r2)
            java.lang.String r6 = "sdk_bs_c"
            long r0 = r8.LJII
            r7.put(r6, r0)
            java.lang.String r6 = "sdk_nrc"
            long r0 = r8.LJIIL
            r7.put(r6, r0)
            java.lang.String r0 = "sdk_afs_stc"
            r7.put(r0, r2)
            java.lang.String r6 = "sdk_afs_usc"
            long r0 = r8.LJIJI
            r7.put(r6, r0)
            java.lang.String r0 = "sdk_afs_ncc"
            r7.put(r0, r2)
            java.lang.String r2 = "sdk_afs_c"
            long r0 = r8.LJIJJ
            r7.put(r2, r0)
            java.lang.String r2 = "sdk_c"
            long r0 = r8.LJIL
            r7.put(r2, r0)
            java.lang.String r0 = "1"
            org.json.JSONObject r0 = r7.put(r4, r0)
            if (r0 != 0) goto L67
        L64:
            r7.put(r4, r5)
        L67:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            java.lang.String r0 = "send_message_performance"
            X.C20684815ws.LJIJ(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report.SendMsgReportUtil.LIZLLL(org.json.JSONObject, X.0YC9):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.ISendMsgReportUtil
    public final void LIZ(C869590Y9l c869590Y9l, C0YC9 c0yc9) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 5))), null, null, new C0ZCM(c869590Y9l, SystemClock.uptimeMillis(), c0yc9, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(2:4|(1:6)(1:27))(0)|7|(1:(1:10)(2:78|79))(22:18|(1:20)(1:26)|21|(2:23|(1:25))|13|14|(2:17|15)|83|28|(1:30)(1:45)|31|(1:35)|36|(1:40)|41|(1:43)|44|82|46|(1:48)(1:49)|50|(3:52|(7:58|(1:60)(1:69)|61|(1:65)|66|(3:80|70|(1:72))(1:73)|76)|77)(2:53|54))|11|(1:13)|14|(1:15)|83|28|(0)(0)|31|(2:33|35)(0)|36|(2:38|40)(0)|41|(0)|44|82|46|(0)(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0181, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = new java.util.HashMap();
        r1.put("error_msg", X.C786410Ut5.J3(r5));
        X.C0W8I.LIZ.getClass();
        X.C0W8I.LJ("send_msg_error", "im_error_event", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[Catch: Exception -> 0x0181, TryCatch #1 {Exception -> 0x0181, blocks: (B:46:0x012a, B:48:0x013a, B:50:0x0141, B:52:0x0146, B:53:0x0150, B:54:0x0180), top: B:82:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146 A[Catch: Exception -> 0x0181, TryCatch #1 {Exception -> 0x0181, blocks: (B:46:0x012a, B:48:0x013a, B:50:0x0141, B:52:0x0146, B:53:0x0150, B:54:0x0180), top: B:82:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150 A[Catch: Exception -> 0x0181, TryCatch #1 {Exception -> 0x0181, blocks: (B:46:0x012a, B:48:0x013a, B:50:0x0141, B:52:0x0146, B:53:0x0150, B:54:0x0180), top: B:82:0x012a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C869590Y9l r17, long r18, X.C0YC9 r20, X.InterfaceC1364105Vn<? super org.json.JSONObject> r21) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report.SendMsgReportUtil.LIZJ(X.0Y9l, long, X.0YC9, X.05Vn):java.lang.Object");
    }
}
