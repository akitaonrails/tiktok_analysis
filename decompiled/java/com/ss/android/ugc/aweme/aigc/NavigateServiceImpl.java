package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C099R;
import X.C0LNG;
import X.C0LNR;
import X.C0LO6;
import X.C0LO7;
import X.C0LOB;
import X.C0PEM;
import X.C13012057i;
import X.C1770106wV;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C546330Lbj;
import X.C546820LcW;
import X.C547130Ld1;
import X.C547140Ld2;
import X.C547160Ld4;
import X.C548010LeR;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCPost;
import com.ss.android.ugc.aweme.aikit.api.common.NavigateService;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes9.dex */
public final class NavigateServiceImpl implements NavigateService {
    public static void LJFF(AIGCDraft aIGCDraft, String str) {
        C547130Ld1.LIZ(aIGCDraft.serverTaskId, C546330Lbj.LIZIZ(aIGCDraft.businessKey), "NavigateServiceImpl", str);
    }

    public static void LJIIJJI(Function1 function1, Function1 function12) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770106wV(CoroutineExceptionHandler.LJJLIL, function12, 0))), null, null, new C13012057i(function1, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
    public final void LIZ(Context context, AIGCDraft aIGCDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("navigateCloudDraft:");
        sbLIZ.append(aIGCDraft);
        LJFF(aIGCDraft, C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI(new C0LOB(this, context, aIGCDraft, null), new AwS217S0300000_8(context, this, aIGCDraft, 3));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
    public final void LIZIZ(Context context, AIGCPost aIGCPost) {
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("navigatePost:");
        sbLIZ.append(aIGCPost);
        c547140Ld2.LIZ("NavigateServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI(new C0LNR(this, context, aIGCPost, null), new AwS587S0100000_8(context, 28));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
    public final void LIZJ(Context context, AIGCDraft aIGCDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("navigateCloudDraftEdit:");
        sbLIZ.append(aIGCDraft);
        LJFF(aIGCDraft, C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI(new C0LNG(this, context, aIGCDraft, null), new AwS217S0300000_8(context, this, aIGCDraft, 4));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
    public final void LIZLLL(Context context, AIGCDraft aIGCDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("navigateCloudDraftPreview:");
        sbLIZ.append(aIGCDraft);
        LJFF(aIGCDraft, C2188811AlT.LIZIZ(sbLIZ));
        LJIIJJI(new C0LO6(this, context, aIGCDraft, null), new AwS217S0300000_8(context, this, aIGCDraft, 5));
    }

    public static void LJIIL(AIGCDraft aIGCDraft, String str, Throwable th) {
        C01GW c01gw = C547160Ld4.LIZ;
        C547160Ld4.LJFF(aIGCDraft.serverTaskId, C546330Lbj.LIZIZ(aIGCDraft.businessKey), C548010LeR.LJIIIZ, new AwS122S1100000_8(str, th, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r9, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.NavigateServiceImpl.LJ(android.content.Context, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(android.content.Context r13, com.ss.android.ugc.aweme.aikit.api.common.AIGCPost r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r12 = this;
            r8 = r13
            r10 = r14
            boolean r0 = r15 instanceof X.C0LNT
            r9 = r12
            if (r0 == 0) goto L91
            r4 = r15
            X.0LNT r4 = (X.C0LNT) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L15:
            java.lang.Object r7 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            java.lang.String r6 = "NavigateServiceImpl"
            r5 = 2
            r2 = 1
            r11 = 0
            if (r0 == 0) goto L35
            if (r0 == r2) goto L2e
            if (r0 != r5) goto L98
            X.C155000ia.LIZIZ(r7)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            com.ss.android.ugc.aweme.aikit.api.common.AIGCPost r10 = r4.LLILLJJLI
            java.lang.Object r8 = r4.LL
            android.content.Context r8 = (android.content.Context) r8
            goto L65
        L35:
            X.C155000ia.LIZIZ(r7)
            X.0Ld2 r7 = X.C546820LcW.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "realNavigatePost:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r7.LIZ(r6, r0)
            X.0LeC r0 = X.C547860LeC.LIZ     // Catch: java.lang.Exception -> L6d
            r0.getClass()     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.aikit.api.common.AITaskService r1 = X.C547860LeC.LJII()     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = r10.awemeId     // Catch: java.lang.Exception -> L6d
            r4.LL = r8     // Catch: java.lang.Exception -> L6b
            r4.LLILLJJLI = r10     // Catch: java.lang.Exception -> L6b
            r4.LLILZIL = r2     // Catch: java.lang.Exception -> L6b
            java.lang.Object r7 = r1.LJFF(r0)     // Catch: java.lang.Exception -> L6b
            if (r7 != r3) goto L68
            goto La0
        L65:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L6f
        L68:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7     // Catch: java.lang.Exception -> L6f
            goto L7b
        L6b:
            r2 = move-exception
            goto L70
        L6d:
            r2 = move-exception
            goto L70
        L6f:
            r2 = move-exception
        L70:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0Ld2 r1 = X.C546820LcW.LIZIZ
            java.lang.String r0 = "realNavigatePost getAwemeInfo error"
            r1.LIZIZ(r6, r0, r2)
            r7 = r11
        L7b:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0LOR r6 = new X.0LOR
            r6.<init>(r7, r8, r9, r10, r11)
            r4.LL = r11
            r4.LLILLJJLI = r11
            r4.LLILZIL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r6)
            if (r0 != r3) goto L2b
            return r3
        L91:
            X.0LNT r4 = new X.0LNT
            r4.<init>(r9, r15)
            goto L15
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.NavigateServiceImpl.LJIIIZ(android.content.Context, com.ss.android.ugc.aweme.aikit.api.common.AIGCPost, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(android.content.Context r22, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.NavigateServiceImpl.LJIIJ(android.content.Context, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft, X.05Vn):java.lang.Object");
    }

    public static Object LJI(Context context, AIGCDraft aIGCDraft, CameoDraft cameoDraft, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        LJFF(aIGCDraft, "navigateToCameoPreview");
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0LO7(context, aIGCDraft, cameoDraft, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d8 A[PHI: r6
      0x01d8: PHI (r6v11 java.lang.Object) = (r6v0 java.lang.Object), (r6v13 java.lang.Object) binds: [B:81:0x01d5, B:79:0x01d2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(android.content.Context r17, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r18, com.ss.android.ugc.aweme.draft.model.AwemeDraft r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.NavigateServiceImpl.LJII(android.content.Context, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r10, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r11, com.ss.android.ugc.aweme.draft.model.AwemeDraft r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C0LO9
            if (r0 == 0) goto Laa
            r4 = r13
            X.0LO9 r4 = (X.C0LO9) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r1 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r7 = 3
            r6 = 2
            r8 = 1
            r5 = 0
            if (r0 == 0) goto L2a
            if (r0 == r8) goto L5f
            if (r0 == r6) goto Lb9
            if (r0 != r7) goto Lb1
            X.C155000ia.LIZIZ(r1)
        L29:
            return r1
        L2a:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "realNavigateGenerationFailure:hasLocalDraft="
            r1.append(r0)
            if (r12 == 0) goto L5d
            r0 = 1
        L39:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJFF(r11, r0)
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AITaskService r1 = X.C547860LeC.LJII()
            java.lang.String r0 = r11.serverTaskId
            r4.LL = r10
            r4.LLILLJJLI = r11
            r4.LLILLL = r12
            r4.LLILZLL = r8
            java.lang.Object r1 = r1.LIZIZ(r0, r5, r4)
            if (r1 != r3) goto L6a
            return r3
        L5d:
            r0 = 0
            goto L39
        L5f:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r12 = r4.LLILLL
            com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r11 = r4.LLILLJJLI
            java.lang.Object r10 = r4.LL
            android.content.Context r10 = (android.content.Context) r10
            X.C155000ia.LIZIZ(r1)
        L6a:
            com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse r1 = (com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse) r1
            com.ss.android.ugc.aweme.aikit.api.common.task.TaskInfoData r2 = r1.data
            if (r2 == 0) goto L92
            com.ss.android.ugc.aweme.aikit.api.common.task.TaskLifecycleInfo r0 = r2.lifecycleInfo
            if (r0 == 0) goto L92
            boolean r0 = r0.isFromChat()
            if (r0 != r8) goto L92
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0LNz r0 = new X.0LNz
            r0.<init>(r10, r2, r5)
            r4.LL = r5
            r4.LLILLJJLI = r5
            r4.LLILLL = r5
            r4.LLILZLL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto Lbc
            return r3
        L92:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0LOC r0 = new X.0LOC
            r0.<init>(r10, r11, r12, r5)
            r4.LL = r5
            r4.LLILLJJLI = r5
            r4.LLILLL = r5
            r4.LLILZLL = r7
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)
            if (r1 != r3) goto L29
            return r3
        Laa:
            X.0LO9 r4 = new X.0LO9
            r4.<init>(r9, r13)
            goto L12
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb9:
            X.C155000ia.LIZIZ(r1)
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.NavigateServiceImpl.LJIIIIZZ(android.content.Context, com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }
}
