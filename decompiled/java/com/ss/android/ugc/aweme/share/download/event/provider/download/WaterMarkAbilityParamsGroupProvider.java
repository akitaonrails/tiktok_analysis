package com.ss.android.ugc.aweme.share.download.event.provider.download;

import X.C1380870m2P;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;

/* JADX INFO: loaded from: classes22.dex */
public final class WaterMarkAbilityParamsGroupProvider implements BaseDownloadParamsGroupProvider<C1380870m2P> {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1282004zy getParam() {
        /*
            r13 = this;
            com.bytedance.provider.impl.GScope r3 = com.bytedance.provider.impl.GScope.LL
            java.lang.Class<X.0m2O> r1 = X.C1380860m2O.class
            java.lang.String r0 = "Download"
            r2 = 0
            X.0qZQ r0 = X.C1554960qZC.LIZIZ(r3, r0, r1, r2)
            if (r0 == 0) goto Lad
            X.014t r4 = r0.getSource()
            X.0m2O r4 = (X.C1380860m2O) r4
        L13:
            X.0m2P r5 = new X.0m2P
            if (r4 == 0) goto L3b
            java.lang.String r0 = r4.LL
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            r3.append(r0)
            java.lang.String r0 = com.ss.android.common.applog.AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()
            r3.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            java.lang.String r6 = X.C08HM.LIZJ(r0)
            if (r6 != 0) goto L3d
        L3b:
            java.lang.String r6 = ""
        L3d:
            if (r4 == 0) goto Laa
            boolean r1 = r4.LLILZ
            r0 = 1
            if (r1 != r0) goto Laa
            java.lang.String r9 = "1"
        L46:
            if (r4 == 0) goto La8
            boolean r3 = r4.LLILLL
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto La2
            java.lang.String r0 = "ins_special"
            r1.append(r0)
        L56:
            com.ss.android.ugc.aweme.share.download.service.IDownloadService r0 = com.ss.android.ugc.trill.download.DownloadServiceImpl.LJ()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L6d
            if (r3 == 0) goto L6d
            boolean r0 = X.C1380880m2Q.LIZ()
            if (r0 == 0) goto L6d
            java.lang.String r0 = ",ins_ending"
            r1.append(r0)
        L6d:
            java.lang.String r10 = r1.toString()
            if (r4 == 0) goto La0
            long r0 = r4.LLILZIL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L79:
            java.lang.String r11 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L85
            long r0 = r4.LLILZLL
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L85:
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r0 = -1
            if (r4 == 0) goto L9d
            long r2 = r4.LLILZLL
            long r0 = r4.LLILZIL
        L91:
            long r2 = r2 - r0
            int r7 = (int) r2
            if (r4 == 0) goto L9b
            int r8 = r4.LLIZ
        L97:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L9b:
            r8 = 0
            goto L97
        L9d:
            r2 = -1
            goto L91
        La0:
            r0 = r2
            goto L79
        La2:
            java.lang.String r0 = "topleft"
            r1.append(r0)
            goto L56
        La8:
            r3 = 0
            goto L4a
        Laa:
            java.lang.String r9 = "0"
            goto L46
        Lad:
            r4 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.download.event.provider.download.WaterMarkAbilityParamsGroupProvider.getParam():X.04zy");
    }
}
