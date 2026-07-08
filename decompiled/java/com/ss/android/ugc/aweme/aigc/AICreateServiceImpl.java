package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C09IC;
import X.C0ET4;
import X.C0LU9;
import X.C0LUH;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C452501pT;
import X.C516501zn;
import X.C539960LFq;
import X.C546780LcS;
import X.C546820LcW;
import X.C546940Lci;
import X.C547140Ld2;
import X.C547860LeC;
import X.EnumC1642750sqn;
import X.InterfaceC346201Wa;
import X.InterfaceC548420Lf6;
import X.InterfaceC548510LfF;
import Y.AgS76S1200000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager;
import com.ss.android.ugc.aweme.aikit.api.common.AIConfigService;
import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AICreateServiceImpl implements AICreateService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(45));
    public final AIConfigService LIZIZ;

    public AICreateServiceImpl() {
        C547860LeC.LIZ.getClass();
        this.LIZIZ = C547860LeC.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0116 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String iw(X.C546750LcP r31) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AICreateServiceImpl.iw(X.0LcP):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    public final void z1(String str) {
        AIGCArchWorkflowManager aIGCArchWorkflowManager = (AIGCArchWorkflowManager) this.LIZ.getValue();
        if (aIGCArchWorkflowManager != null) {
            aIGCArchWorkflowManager.z1(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kw(java.lang.String r12, X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C546770LcR
            if (r0 == 0) goto L43
            r4 = r13
            X.0LcR r4 = (X.C546770LcR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto La1
            X.C155000ia.LIZIZ(r3)
        L23:
            X.0LSZ r3 = (X.C0LSZ) r3
            if (r3 == 0) goto La9
            goto L49
        L28:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager> r5 = com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = (com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager) r0
            if (r0 == 0) goto La9
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJFF(r12, r4)
            if (r3 != r2) goto L23
            return r2
        L43:
            X.0LcR r4 = new X.0LcR
            r4.<init>(r11, r13)
            goto L12
        L49:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r3.LJIILIIL     // Catch: java.lang.Throwable -> L9c
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput> r0 = com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput.class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> L9c
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r0 = (com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput) r0     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput r0 = r0.parentTaskInput     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r0 = r0.commonParentTaskInput     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            java.util.List<com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem> r0 = r0.inputItems     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            java.util.List r0 = X.C0LMJ.LIZ(r0)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r4.<init>()     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L9c
        L77:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9a
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L9c
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C123100dR.LIZ(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L91
            boolean r0 = X.C2286708xd.LIZJ(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = 0
            goto L94
        L93:
            r0 = 1
        L94:
            if (r0 == 0) goto L77
            r4.add(r2)     // Catch: java.lang.Throwable -> L9c
            goto L77
        L9a:
            return r4
        L9b:
            return r10
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r10
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AICreateServiceImpl.kw(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lw(java.lang.String r13, X.InterfaceC1364105Vn<? super X.InterfaceC346201Wa<? extends com.ss.android.ugc.aweme.aikit.api.create.CreateState>> r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AICreateServiceImpl.lw(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    public final void mw(C539960LFq c539960LFq, AITheaterCreationModel aITheaterCreationModel) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C546940Lci.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC548510LfF.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548510LfF.class, C546940Lci.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 676));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C546780LcS.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC548420Lf6.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548420Lf6.class, C546780LcS.class, new AwS374S0200000_8(new C0ET4(), c539960LFq, aITheaterCreationModel, 181));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    public final void nw(String str, AIGCCreationModel aIGCCreationModel) {
        AIGCArchWorkflowManager aIGCArchWorkflowManager = (AIGCArchWorkflowManager) this.LIZ.getValue();
        if (aIGCArchWorkflowManager != null) {
            aIGCArchWorkflowManager.A1(str);
        }
        if (aIGCCreationModel != null) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancel ");
            sbLIZ.append(str);
            c547140Ld2.LIZ("AICreateService", C2188811AlT.LIZIZ(sbLIZ));
            aIGCCreationModel.kx(new AwS59S1000000_8(str, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
    public final Object jw(final String str, final AIGCCreationModel aIGCCreationModel, C0LUH c0luh) {
        InterfaceC346201Wa<C0LU9> interfaceC346201WaB1;
        final InterfaceC346201Wa interfaceC346201WaLJIILJJIL;
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeWorkflowState, taskId: ");
        sbLIZ.append(str);
        sbLIZ.append(", lifecycleConfig: ");
        sbLIZ.append(c0luh);
        c547140Ld2.LIZ("AICreateService", C2188811AlT.LIZIZ(sbLIZ));
        AIGCArchWorkflowManager aIGCArchWorkflowManager = (AIGCArchWorkflowManager) this.LIZ.getValue();
        if (aIGCArchWorkflowManager != null && (interfaceC346201WaB1 = aIGCArchWorkflowManager.B1(str, c0luh)) != null && (interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(AFwS291S0000000_8.get$arr$(32), interfaceC346201WaB1)) != null) {
            return new InterfaceC346201Wa<CreateState>() { // from class: X.0LcV
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super CreateState> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC346201WaLJIILJJIL.collect(new AgS76S1200000_8(interfaceC346701Wf, aIGCCreationModel, str, 1), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
        }
        return new C516501zn(CreateState.NullState.INSTANCE, 1);
    }
}
