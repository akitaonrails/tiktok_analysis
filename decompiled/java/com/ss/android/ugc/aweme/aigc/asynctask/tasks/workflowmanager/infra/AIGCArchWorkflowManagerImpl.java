package com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra;

import X.C05RH;
import X.C095D;
import X.C0LSZ;
import X.C0LU9;
import X.C0LUD;
import X.C0LUE;
import X.C0LUG;
import X.C0LUH;
import X.C0LUI;
import X.C1954807lC;
import X.C23250099c;
import X.C23271099x;
import X.C516501zn;
import X.C539140LCm;
import X.C542710LQf;
import X.C542800LQo;
import X.C546660LcG;
import X.C581150Mqn;
import X.C861640Xr8;
import X.InterfaceC346201Wa;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCArchWorkflowManagerImpl implements AIGCArchWorkflowManager {
    public static ICreationAsyncTaskManager LIZ() {
        return (ICreationAsyncTaskManager) PluggableExtentionKt.pluggableSpi$default(ICreationAsyncTaskManager.class, false, false, false, 14, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r2.equals("STOPPED") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r2.equals(com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager.DEFAULT) == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0LU9 LIZIZ(X.C0LSZ r17) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZIZ(X.0LSZ):X.0LU9");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager
    public final C542800LQo<Boolean> A1(String str) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJJIII(str);
        }
        return new C542800LQo<>(Boolean.TRUE, null);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager
    public final C542800LQo<String> C1(AIGCArchWorkflowInput aIGCArchWorkflowInput) {
        return (C542800LQo) C23250099c.LJ(C23271099x.INSTANCE, new C542710LQf(this, aIGCArchWorkflowInput, null));
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager
    public final void z1(String str) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJJIJIL(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager
    public final InterfaceC346201Wa<C0LU9> B1(String str, C0LUH c0luh) {
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL2;
        if (c0luh instanceof C546660LcG) {
            return new C095D(new C0LUI(this, str, (C546660LcG) c0luh, null));
        }
        if (Intrinsics.LJFF(c0luh, C0LUE.LIZ)) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJL2 = iCreationAsyncTaskManagerLIZ.LJJJJL(str)) != null) {
                return new C581150Mqn(new C861640Xr8(new C539140LCm(this, str, null), new C05RH(interfaceC346201WaLJJJJL2)), this, 6);
            }
            return new C516501zn(C0LUD.LIZ, 1);
        }
        if (Intrinsics.LJFF(c0luh, C0LUG.LIZ)) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = LIZ();
            if (iCreationAsyncTaskManagerLIZ2 != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManagerLIZ2.LJJJJL(str)) != null) {
                return new C581150Mqn(new C05RH(interfaceC346201WaLJJJJL), this, 7);
            }
            return new C516501zn(C0LUD.LIZ, 1);
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super X.C542800LQo<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0LU1
            if (r0 == 0) goto L3f
            r4 = r7
            X.0LU1 r4 = (X.C0LU1) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0LQo r2 = new X.0LQo
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0 = 0
            r2.<init>(r1, r0)
            return r2
        L2d:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = LIZ()
            if (r0 == 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJIIIZ(r6, r4)
            if (r0 != r2) goto L22
            return r2
        L3f:
            X.0LU1 r4 = new X.0LU1
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.D1(java.util.List, X.05Vn):java.lang.Object");
    }
}
