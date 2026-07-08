package com.ss.android.ugc.aweme.im.report;

import X.C0PEM;
import X.C1766506vv;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C869590Y9l;
import X.C912510Zqz;
import X.C912520Zr0;
import X.InterfaceC1688806jO;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ReportUtils implements IReportUtils {
    public static final ReportUtils LIZIZ = new ReportUtils();
    public static final int LIZJ;

    static {
        int iLJ;
        if (C1766506vv.LIZ()) {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("dm_report_msg_list_size", 11);
        } else {
            iLJ = 5;
        }
        LIZJ = iLJ;
    }

    public static List LJI(List list) {
        ReportUtils reportUtils = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (reportUtils.LIZIZ((C869590Y9l) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0083  */
    @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.C869590Y9l r6) {
        /*
            r5 = this;
            boolean r0 = X.C0ZDX.LJJJJZ(r6)
            r4 = 0
            if (r0 == 0) goto L8
            return r4
        L8:
            int r1 = r6.getMsgType()
            r2 = -1
            r0 = 1
            if (r1 == r2) goto L83
            if (r1 == r0) goto L83
            r0 = 15
            if (r1 == r0) goto L83
            r0 = 1026(0x402, float:1.438E-42)
            if (r1 == r0) goto L83
            r0 = 1031(0x407, float:1.445E-42)
            if (r1 == r0) goto L83
            r0 = 1039(0x40f, float:1.456E-42)
            if (r1 == r0) goto L83
            r0 = 4013(0xfad, float:5.623E-42)
            if (r1 == r0) goto L83
            r0 = 4058(0xfda, float:5.686E-42)
            if (r1 == r0) goto L83
            r0 = 4071(0xfe7, float:5.705E-42)
            if (r1 == r0) goto L83
            r0 = 4084(0xff4, float:5.723E-42)
            if (r1 == r0) goto L83
            r0 = 1022(0x3fe, float:1.432E-42)
            if (r1 == r0) goto L83
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r1 == r0) goto L83
            r0 = 4007(0xfa7, float:5.615E-42)
            if (r1 == r0) goto L83
            r0 = 4008(0xfa8, float:5.616E-42)
            if (r1 == r0) goto L83
            r0 = 4010(0xfaa, float:5.619E-42)
            if (r1 == r0) goto L83
            r0 = 4011(0xfab, float:5.62E-42)
            if (r1 == r0) goto L83
            r0 = 4065(0xfe1, float:5.696E-42)
            if (r1 == r0) goto L83
            r0 = 4066(0xfe2, float:5.698E-42)
            if (r1 == r0) goto L83
            switch(r1) {
                case 4000: goto L83;
                case 4001: goto L83;
                case 4002: goto L83;
                default: goto L55;
            }
        L55:
            r3 = 1
        L56:
            boolean r2 = r6.isSuccessStatus()
            X.0YUT r1 = r6.getMessageStatus()
            X.0YUT r0 = X.C0YUT.AVAILABLE
            if (r1 == r0) goto L81
            X.0YUT r1 = r6.getMessageStatus()
            X.0YUT r0 = X.C0YUT.RECALLED
            if (r1 == r0) goto L81
            r1 = 0
        L6b:
            boolean r0 = X.C0ZTJ.LIZJ(r6)
            if (r0 == 0) goto L7f
            boolean r0 = X.C0ZTJ.LJ(r6)
        L75:
            if (r3 == 0) goto L7e
            if (r2 == 0) goto L7e
            if (r1 == 0) goto L7e
            if (r0 == 0) goto L7e
            r4 = 1
        L7e:
            return r4
        L7f:
            r0 = 1
            goto L75
        L81:
            r1 = 1
            goto L6b
        L83:
            r3 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.report.ReportUtils.LIZIZ(X.0Y9l):boolean");
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IReportUtils {
        public final /* synthetic */ ReportUtils LIZIZ = ReportUtils.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
        public final void LIZ(InterfaceC1688806jO interfaceC1688806jO, Activity activity, String str, C869590Y9l c869590Y9l, boolean z) {
            this.LIZIZ.LIZ(interfaceC1688806jO, activity, str, c869590Y9l, z);
        }

        @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
        public final boolean LIZIZ(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LIZIZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
        public final void LIZJ(C19EG c19eg, C912520Zr0 c912520Zr0, List list) {
            this.LIZIZ.getClass();
            ReportUtils.LJ(c19eg, c912520Zr0, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.app.Activity r16, X.C912520Zr0 r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.report.ReportUtils.LJ(android.app.Activity, X.0Zr0, java.util.List):void");
    }

    public static List LJFF(List list, C869590Y9l c869590Y9l, Integer num) {
        int iIntValue;
        int size;
        List listLJI = LJI(list);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LIZJ;
        }
        double d = (iIntValue - 1) / 2.0f;
        int iFloor = (int) Math.floor(d);
        ArrayList arrayList = (ArrayList) listLJI;
        int iIndexOf = arrayList.indexOf(c869590Y9l);
        int iCeil = iIndexOf - ((int) Math.ceil(d));
        if (iCeil < 0) {
            size = Math.min(iIntValue, arrayList.size());
            iCeil = 0;
        } else {
            size = iIndexOf + iFloor + 1;
            if (size > arrayList.size()) {
                size = arrayList.size();
                iCeil = Math.max(size - iIntValue, 0);
            }
        }
        return arrayList.subList(iCeil, size);
    }

    @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
    public final void LIZJ(C19EG c19eg, C912520Zr0 c912520Zr0, List list) {
        LJ(c19eg, c912520Zr0, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C912540Zr2 r7, java.lang.String r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C912530Zr1
            if (r0 == 0) goto L6a
            r5 = r9
            X.0Zr1 r5 = (X.C912530Zr1) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L49
            if (r0 != r2) goto L70
            X.0Zr2 r7 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L25:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L78
            if (r7 == 0) goto L3d
            X.0Y9l r0 = r7.LIZ
            if (r0 != 0) goto L40
            if (r7 == 0) goto L3d
            java.util.List r1 = LJI(r4)
            int r0 = com.ss.android.ugc.aweme.im.report.ReportUtils.LIZJ
            java.util.List r0 = X.C13LP.LL(r1, r0)
            r7.LIZIZ = r0
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.0Y9l r0 = r7.LIZ
            java.util.List r0 = LJFF(r4, r0, r1)
            r7.LIZIZ = r0
            goto L3d
        L49:
            X.C155000ia.LIZIZ(r4)
            X.0ZiB r0 = X.C907030Zi9.LJFF
            r0.getClass()
            X.0Zi9 r0 = X.C907050ZiB.LIZ()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.06uD> r0 = r0.LIZJ
            java.lang.Object r0 = r0.get(r8)
            X.06uD r0 = (X.InterfaceC1755906uD) r0
            if (r0 == 0) goto L78
            r5.LL = r7
            r5.LLILZ = r2
            java.lang.Object r4 = r0.LIZIZ(r5)
            if (r4 != r3) goto L25
            return r3
        L6a:
            X.0Zr1 r5 = new X.0Zr1
            r5.<init>(r6, r9)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.report.ReportUtils.LIZLLL(X.0Zr2, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.report.api.IReportUtils
    public final void LIZ(InterfaceC1688806jO interfaceC1688806jO, Activity activity, String str, C869590Y9l c869590Y9l, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C912510Zqz(interfaceC1688806jO, c869590Y9l, activity, z, null), 3);
    }
}
