package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk;

import X.C01CU;
import X.C1005650cHD;
import X.C1005720cHK;
import X.C1120604Zw;
import X.C1121904a9;
import X.C21187717vn;
import X.EnumC1005690cHH;
import X.EnumC21186417va;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VmSdkCheckService implements ISmartCheckService {
    public JsWorkerWrapper LIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final C1005650cHD getServiceInfo() {
        Map<String, Integer> map = C1005720cHK.LIZ;
        return new C1005650cHD("vmsdk", C1005720cHK.LIZ.get("vmsdk"));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21160417rO
            if (r0 == 0) goto L8f
            r5 = r9
            X.17rO r5 = (X.C21160417rO) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L96
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L40
            X.17vk r2 = new X.17vk
            java.lang.String r0 = "vmsdk"
            r2.<init>(r0)
            X.0cHE r0 = X.EnumC1005660cHE.JS_WORKER_ERROR
            int r3 = r0.getValue()
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r7 = "no js environment"
            r6 = r5
            r2.LJIIIZ(r3, r4, r5, r6, r7)
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L45:
            X.C155000ia.LIZIZ(r1)
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.getClass()
            X.04a9 r0 = X.C1120604Zw.LIZIZ()
            if (r0 == 0) goto L9e
            boolean r0 = r0.LJ
            if (r0 != r4) goto L9e
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckSettingModel r0 = X.C21187717vn.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings$EcVmSdkConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings.LIZ()
            boolean r0 = r0.enableCommonCheckApi
            if (r0 != 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings$EcVmSdkConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings.LIZ()
            boolean r0 = r0.enableCommonCheckRoute
            if (r0 != 0) goto L75
        L6f:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L75:
            X.1DFH r0 = X.C0PEM.LIZ
            X.054G r3 = X.C2296808zG.LIZ(r0)
            X.17rR r2 = new X.17rR
            r1 = 0
            r2.<init>(r8, r1)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r3, r1, r1, r2, r0)
            r5.LLILLL = r4
            java.lang.Object r1 = r0.LJLIIIL(r5)
            if (r1 != r6) goto L22
            return r6
        L8f:
            X.17rO r5 = new X.17rO
            r5.<init>(r8, r9)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final boolean LIZIZ(C01CU c01cu) {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJ) {
            return false;
        }
        String str = c01cu.LJFF;
        if (Intrinsics.LJFF(str, EnumC1005690cHH.REQUEST.getValue())) {
            return C21187717vn.LIZ().apiList.contains(c01cu.LJ);
        }
        if (!Intrinsics.LJFF(str, EnumC1005690cHH.SCHEMA.getValue())) {
            return false;
        }
        return C21187717vn.LIZ().schemaList.contains(c01cu.LJ);
    }

    public final EnumC21186417va LJ(Integer num) {
        EnumC21186417va enumC21186417va = EnumC21186417va.SUCCESS;
        int value = enumC21186417va.getValue();
        if (num == null || num.intValue() != value) {
            EnumC21186417va enumC21186417va2 = EnumC21186417va.COMMON_ERROR;
            int value2 = enumC21186417va2.getValue();
            if (num != null && num.intValue() == value2) {
                return enumC21186417va2;
            }
            EnumC21186417va enumC21186417va3 = EnumC21186417va.MISSING;
            int value3 = enumC21186417va3.getValue();
            if (num != null && num.intValue() == value3) {
                return enumC21186417va3;
            }
            EnumC21186417va enumC21186417va4 = EnumC21186417va.WRONG_TYPE;
            int value4 = enumC21186417va4.getValue();
            if (num != null && num.intValue() == value4) {
                return enumC21186417va4;
            }
            EnumC21186417va enumC21186417va5 = EnumC21186417va.OUT_OF_RANGE;
            int value5 = enumC21186417va5.getValue();
            if (num != null && num.intValue() == value5) {
                return enumC21186417va5;
            }
            EnumC21186417va enumC21186417va6 = EnumC21186417va.CONDITION_NOT_SATISFIED;
            int value6 = enumC21186417va6.getValue();
            if (num != null && num.intValue() == value6) {
                return enumC21186417va6;
            }
            EnumC21186417va enumC21186417va7 = EnumC21186417va.NOT_EQUAL_TO_TARGET;
            int value7 = enumC21186417va7.getValue();
            if (num != null && num.intValue() == value7) {
                return enumC21186417va7;
            }
            EnumC21186417va enumC21186417va8 = EnumC21186417va.REGEX_ERROR;
            int value8 = enumC21186417va8.getValue();
            if (num != null && num.intValue() == value8) {
                return enumC21186417va8;
            }
            EnumC21186417va enumC21186417va9 = EnumC21186417va.EMPTY;
            int value9 = enumC21186417va9.getValue();
            if (num != null && num.intValue() == value9) {
                return enumC21186417va9;
            }
            EnumC21186417va enumC21186417va10 = EnumC21186417va.REDUNDANT;
            int value10 = enumC21186417va10.getValue();
            if (num != null && num.intValue() == value10) {
                return enumC21186417va10;
            }
            EnumC21186417va enumC21186417va11 = EnumC21186417va.SYNTAX_ERROR;
            int value11 = enumC21186417va11.getValue();
            if (num != null && num.intValue() == value11) {
                return enumC21186417va11;
            }
        }
        return enumC21186417va;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C01CU r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService.LIZJ(X.01CU, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper r23, X.C01CU r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn<? super java.lang.Boolean> r27) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService.LIZLLL(com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper, X.01CU, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
