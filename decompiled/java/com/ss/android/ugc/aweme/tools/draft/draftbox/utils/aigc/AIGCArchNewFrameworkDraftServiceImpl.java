package com.ss.android.ugc.aweme.tools.draft.draftbox.utils.aigc;

import X.C099R;
import X.C2387909Xh;
import X.C552940LmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC550540LiW;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCArchNewFrameworkDraftServiceImpl implements IAIGCArchNewFrameworkDraftService {
    public final AIGCWorkflowManagementApi LIZ = (AIGCWorkflowManagementApi) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowManagementApi.class, false, false, false, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C552940LmO> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C545830Lav
            if (r0 == 0) goto L4c
            r5 = r8
            X.0Lav r5 = (X.C545830Lav) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0LiW r1 = (X.InterfaceC550540LiW) r1
            if (r1 == 0) goto L5a
            java.lang.Object r0 = X.C550520LiU.LIZ(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r6.LIZ
            if (r2 == 0) goto L5a
            X.00tW r1 = new X.00tW
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r1.<init>(r0)
            r5.LLILLL = r3
            java.lang.Object r1 = r2.LJFF(r1, r5)
            if (r1 != r4) goto L22
            return r4
        L4c:
            X.0Lav r5 = new X.0Lav
            r5.<init>(r6, r8)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.draftbox.utils.aigc.AIGCArchNewFrameworkDraftServiceImpl.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService
    public final Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        AIGCWorkflowCreationService aIGCWorkflowCreationServiceLIZ = C2387909Xh.LIZ();
        if (aIGCWorkflowCreationServiceLIZ == null) {
            return null;
        }
        return aIGCWorkflowCreationServiceLIZ.LJIJ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService
    public final Object LIZJ(C552940LmO c552940LmO, InterfaceC1364105Vn<? super InterfaceC550540LiW<C552940LmO>> interfaceC1364105Vn) {
        AIGCWorkflowManagementApi aIGCWorkflowManagementApi = this.LIZ;
        if (aIGCWorkflowManagementApi != null) {
            Object objLJIIIZ = aIGCWorkflowManagementApi.LJIIIZ(c552940LmO.LIZ, interfaceC1364105Vn);
            if (objLJIIIZ == C099R.LJFF()) {
                return objLJIIIZ;
            }
            return objLJIIIZ;
        }
        return null;
    }
}
