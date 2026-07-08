package com.ss.android.ugc.aweme.minis.service;

import X.AnonymousClass0208;
import X.C0CQT;
import X.C0PEM;
import X.C11S5;
import X.C1266080j3G;
import X.C1381410m3H;
import X.C1381420m3I;
import X.C1395530mQ3;
import X.C1395540mQ4;
import X.C1395550mQ5;
import X.C1395560mQ6;
import X.C1395610mQB;
import X.C1395620mQC;
import X.C1395630mQD;
import X.C1402220maq;
import X.C1499850p8J;
import X.C1701940uOG;
import X.C2140508a3;
import X.C2195221Avo;
import X.C2296808zG;
import X.C23250099c;
import X.C2487409ou;
import X.C5185020h;
import X.EnumC1222640hvC;
import X.EnumC1381400m3G;
import X.EnumC1381430m3J;
import X.EnumC1395570mQ7;
import X.EnumC1395590mQ9;
import X.EnumC507801yO;
import X.InterfaceC1395600mQA;
import Y.ARunnableS90S0200000_21;
import android.app.Activity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.report.api.IMinisReportService;
import com.ss.android.ugc.aweme.minis.report.api.MinisCreateReportResponse;
import com.ss.android.ugc.aweme.minis.report.api.MinisReportGetAuthTokenResponse;
import com.ss.android.ugc.aweme.minis.report.api.MinisUpdateReportRequestV2;
import com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest;
import com.ss.android.ugc.aweme.minis.report.report.MinisUpdateReportRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisReportServiceImpl implements IMinisReportService {
    public final List<C1395560mQ6> LIZ = new ArrayList();
    public final InterfaceC1395600mQA LIZIZ;

    public MinisReportServiceImpl() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LJIIIZ = 1;
        this.LIZIZ = (InterfaceC1395600mQA) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1395600mQA.class);
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LIZIZ(C5185020h c5185020h) {
        this.LIZIZ.LIZJ().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(c5185020h, 12));
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LJ(Function2<? super MinisReportGetAuthTokenResponse, ? super Throwable, Unit> function2) {
        this.LIZIZ.LIZLLL().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1402220maq(function2, 1));
    }

    public final void LJIIL(C1395560mQ6 c1395560mQ6) {
        if (C2140508a3.LIZ()) {
            ((ArrayList) this.LIZ).remove(c1395560mQ6);
        } else {
            C2487409ou.LIZJ(new ARunnableS90S0200000_21(c1395560mQ6, this, 75));
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LIZ(String str, AwS633S0100000_19 awS633S0100000_19) throws JSONException {
        Activity activityLIZLLL = C2195221Avo.LIZLLL();
        if (activityLIZLLL != null) {
            String strLIZ = C2195221Avo.LIZ();
            if (strLIZ != null) {
                C1395560mQ6 c1395560mQ6 = new C1395560mQ6(null, strLIZ, activityLIZLLL, C2195221Avo.LJFF(), awS633S0100000_19, new C1395620mQC(this));
                ((ArrayList) this.LIZ).add(c1395560mQ6);
                if (EnumC1395570mQ7.UNSET == c1395560mQ6.LJI.get()) {
                    c1395560mQ6.LJIIIZ = new C1381420m3I(strLIZ, EnumC1381430m3J.ORDER);
                    c1395560mQ6.LJI.set(EnumC1395570mQ7.STARTED);
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1395550mQ5(c1395560mQ6, str, new AwS635S0100000_21(c1395560mQ6, 166), null), 3);
                    return;
                }
                return;
            }
            C1381410m3H.LIZ(EnumC1381430m3J.ORDER, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "Minis activity has no valid clientKey");
            return;
        }
        C1381410m3H.LIZ(EnumC1381430m3J.ORDER, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "Report activity is not Minis activity");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r12, kotlin.jvm.internal.AwS456S0200000_21 r13) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest r3 = new com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest
            X.0hvC r0 = X.EnumC1222640hvC.VIOLATION
            int r5 = r0.getValue()
            r6 = 0
            r4 = r12
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r0 = X.C2195221Avo.LJIIJ
            if (r0 == 0) goto L3d
            java.lang.Integer r2 = r0.minisType
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r1 = r0.ordinal()
            if (r2 == 0) goto L3d
            int r0 = r2.intValue()
            if (r0 != r1) goto L3d
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L2f:
            r3.setType(r0)
            kotlin.jvm.internal.AwS633S0100000_19 r1 = new kotlin.jvm.internal.AwS633S0100000_19
            r0 = 338(0x152, float:4.74E-43)
            r1.<init>(r13, r0)
            r11.LJIIJJI(r3, r1)
            return
        L3d:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_APP
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MinisReportServiceImpl.LJFF(java.lang.String, kotlin.jvm.internal.AwS456S0200000_21):void");
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LJIIJ(MinisMetaResp minisMetaResp, AnonymousClass0208 anonymousClass0208) throws JSONException {
        Activity activityLIZLLL = C2195221Avo.LIZLLL();
        if (activityLIZLLL != null) {
            String strLIZ = C2195221Avo.LIZ();
            if (strLIZ != null) {
                C1395560mQ6 c1395560mQ6 = new C1395560mQ6(minisMetaResp, strLIZ, activityLIZLLL, C2195221Avo.LJFF(), anonymousClass0208, new C1395630mQD(this));
                ((ArrayList) this.LIZ).add(c1395560mQ6);
                if (EnumC1395570mQ7.UNSET == c1395560mQ6.LJI.get()) {
                    c1395560mQ6.LJI.set(EnumC1395570mQ7.STARTED);
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1395530mQ3(c1395560mQ6, new AwS600S0100000_21(c1395560mQ6, 339), null), 3);
                    return;
                }
                return;
            }
            C1381410m3H.LIZ(EnumC1381430m3J.VIOLATION, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "No client key");
            return;
        }
        C1381410m3H.LIZ(EnumC1381430m3J.VIOLATION, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "Report activity is not Minis activity");
    }

    public final void LJIIJJI(MinisReportRequest minisReportRequest, Function2<? super MinisCreateReportResponse, ? super Throwable, Unit> function2) {
        this.LIZIZ.LIZ(minisReportRequest).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1402220maq(function2, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r12, java.lang.String r13, kotlin.jvm.internal.AwS456S0200000_21 r14) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.minis.report.report.MinisOrderReport r9 = new com.ss.android.ugc.aweme.minis.report.report.MinisOrderReport
            r9.<init>(r13)
            com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest r3 = new com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest
            X.0hvC r0 = X.EnumC1222640hvC.PAYMENT_ORDER
            int r5 = r0.getValue()
            r6 = 0
            r4 = r12
            r7 = r6
            r8 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r0 = X.C2195221Avo.LJIIJ
            if (r0 == 0) goto L41
            java.lang.Integer r2 = r0.minisType
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r1 = r0.ordinal()
            if (r2 == 0) goto L41
            int r0 = r2.intValue()
            if (r0 != r1) goto L41
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L33:
            r3.setType(r0)
            kotlin.jvm.internal.AwS633S0100000_19 r1 = new kotlin.jvm.internal.AwS633S0100000_19
            r0 = 336(0x150, float:4.71E-43)
            r1.<init>(r14, r0)
            r11.LJIIJJI(r3, r1)
            return
        L41:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_APP
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MinisReportServiceImpl.LJI(java.lang.String, java.lang.String, kotlin.jvm.internal.AwS456S0200000_21):void");
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LJIIIIZZ(String str, String str2, AwS633S0100000_19 awS633S0100000_19) throws JSONException {
        Activity activityLIZLLL = C2195221Avo.LIZLLL();
        if (activityLIZLLL != null) {
            String strLIZ = C2195221Avo.LIZ();
            if (strLIZ != null) {
                C1395560mQ6 c1395560mQ6 = new C1395560mQ6(null, strLIZ, activityLIZLLL, C2195221Avo.LJFF(), awS633S0100000_19, new C1395610mQB(this));
                ((ArrayList) this.LIZ).add(c1395560mQ6);
                if (EnumC1395570mQ7.UNSET == c1395560mQ6.LJI.get()) {
                    c1395560mQ6.LJIIIZ = new C1381420m3I(strLIZ, EnumC1381430m3J.FUNCTIONAL);
                    c1395560mQ6.LJI.set(EnumC1395570mQ7.STARTED);
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1395540mQ4(c1395560mQ6, str, str2, new AwS635S0100000_21(c1395560mQ6, 165), null), 3);
                    return;
                }
                return;
            }
            C1381410m3H.LIZ(EnumC1381430m3J.FUNCTIONAL, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "No client key");
            return;
        }
        C1381410m3H.LIZ(EnumC1381430m3J.FUNCTIONAL, EnumC1395590mQ9.START, EnumC1381400m3G.FAIL, null, null, "Report activity is not Minis activity");
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LIZLLL(String str, String str2, EnumC507801yO enumC507801yO, AwS456S0200000_21 awS456S0200000_21) {
        this.LIZIZ.LIZIZ(new MinisUpdateReportRequest(str, str2, Integer.valueOf(enumC507801yO.getValue()))).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(awS456S0200000_21, 13));
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LJII(String str, EnumC1222640hvC enumC1222640hvC, int i, AwS455S0200000_19 awS455S0200000_19) {
        LJIIJJI(new MinisReportRequest(str, enumC1222640hvC.getValue(), null, null, null, null, Integer.valueOf(i)), new AwS633S0100000_19(awS455S0200000_19, 337));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.jvm.internal.AwS456S0200000_21 r15) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.minis.report.report.MinisFunctionReport r6 = new com.ss.android.ugc.aweme.minis.report.report.MinisFunctionReport
            r6.<init>(r13, r14)
            com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest r3 = new com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest
            X.0hvC r0 = X.EnumC1222640hvC.FUNCTIONALITY
            int r5 = r0.getValue()
            r7 = 0
            r4 = r12
            r8 = r7
            r9 = r7
            r10 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r0 = X.C2195221Avo.LJIIJ
            if (r0 == 0) goto L41
            java.lang.Integer r2 = r0.minisType
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r1 = r0.ordinal()
            if (r2 == 0) goto L41
            int r0 = r2.intValue()
            if (r0 != r1) goto L41
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L33:
            r3.setType(r0)
            kotlin.jvm.internal.AwS633S0100000_19 r1 = new kotlin.jvm.internal.AwS633S0100000_19
            r0 = 335(0x14f, float:4.7E-43)
            r1.<init>(r15, r0)
            r11.LJIIJJI(r3, r1)
            return
        L41:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_APP
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MinisReportServiceImpl.LJIIIZ(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.AwS456S0200000_21):void");
    }

    @Override // com.ss.android.ugc.aweme.minis.report.api.IMinisReportService
    public final void LIZJ(String str, List list, String str2, String str3, EnumC507801yO enumC507801yO, C5185020h c5185020h) {
        this.LIZIZ.LJ(new MinisUpdateReportRequestV2(str, list, str3, str2, Integer.valueOf(enumC507801yO.getValue()))).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(c5185020h, 14));
    }
}
