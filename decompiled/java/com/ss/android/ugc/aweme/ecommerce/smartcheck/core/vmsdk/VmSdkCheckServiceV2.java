package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk;

import X.C01CU;
import X.C1005650cHD;
import X.C1005720cHK;
import X.C13LP;
import X.C21187817vo;
import X.EnumC1005690cHH;
import X.EnumC21186417va;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class VmSdkCheckServiceV2 implements ISmartCheckService {
    public JsWorkerWrapper LIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final C1005650cHD getServiceInfo() {
        Map<String, Integer> map = C1005720cHK.LIZ;
        return new C1005650cHD("vmsdk_v2", C1005720cHK.LIZ.get("vmsdk_v2"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C21160517rP
            if (r0 == 0) goto Lae
            r4 = r10
            X.17rP r4 = (X.C21160517rP) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r8 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r7 = 6
            r6 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4a
            if (r0 == r1) goto L6d
            if (r0 != r3) goto Lb5
            X.C155000ia.LIZIZ(r8)
        L27:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r1 = r8.booleanValue()
            if (r1 != 0) goto L45
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
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L4a:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2 r0 = X.C21187817vo.LIZ()
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2$SmartCheckSwitch r0 = r0.switchConfig
            boolean r0 = r0.masterSwitch
            if (r0 != 0) goto L5d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5d:
            r4.LLILLL = r1
            X.17vp r0 = X.C21187917vp.LIZ
            X.C21187917vp.LIZ(r0, r6, r7)
            X.17rk r0 = com.ss.android.ugc.aweme.ecommerce.smartcheck.core.rule.ProtocolRuleApi.LIZ
            java.lang.Object r8 = r0.LIZ(r4)
            if (r8 != r5) goto L70
            return r5
        L6d:
            X.C155000ia.LIZIZ(r8)
        L70:
            com.google.gson.k r8 = (com.google.gson.k) r8
            if (r8 == 0) goto L95
            com.bytedance.keva.Keva r0 = X.C0VS8.LIZ
            java.lang.String r2 = r8.toString()
            com.bytedance.keva.Keva r1 = X.C0VS8.LIZ
            java.lang.String r0 = "protocol_rule"
            r1.storeString(r0, r2)
            X.17vp r2 = X.C21187917vp.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "protocol rule="
            r1.append(r0)
            r1.append(r8)
            X.C2188811AlT.LIZIZ(r1)
            X.C21187917vp.LIZ(r2, r6, r7)
        L95:
            X.1DFH r0 = X.C0PEM.LIZ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.17rS r1 = new X.17rS
            r1.<init>(r9, r6)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r2, r6, r6, r1, r0)
            r4.LLILLL = r3
            java.lang.Object r8 = r0.LJLIIIL(r4)
            if (r8 != r5) goto L27
            return r5
        Lae:
            X.17rP r4 = new X.17rP
            r4.<init>(r9, r10)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final boolean LIZIZ(C01CU c01cu) {
        List listLJLIL = C13LP.LJLIL(C21187817vo.LIZ().schemaConfig.nativeSchemaList, C21187817vo.LIZ().schemaConfig.feSchemaList);
        String str = c01cu.LJFF;
        if (Intrinsics.LJFF(str, EnumC1005690cHH.REQUEST.getValue())) {
            return C21187817vo.LIZ().apiList.contains(c01cu.LJ);
        }
        if (Intrinsics.LJFF(str, EnumC1005690cHH.SCHEMA.getValue())) {
            return ((ArrayList) listLJLIL).contains(c01cu.LJ);
        }
        if (Intrinsics.LJFF(str, EnumC1005690cHH.EVENT.getValue())) {
            return true;
        }
        return false;
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
        }
        return enumC21186417va;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C01CU r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2.LIZJ(X.01CU, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper r24, X.C01CU r25, java.lang.String r26, java.lang.String r27, X.InterfaceC1364105Vn<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2.LIZLLL(com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper, X.01CU, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
