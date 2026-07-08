package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C0C64;
import X.C1DEU;
import X.C2252461DEe;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC546200LbW;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes9.dex */
public final class AITaskServiceImpl implements AITaskService {
    public final C1DEU LIZ;
    public final C01GW LIZIZ;

    public AITaskServiceImpl() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 10, "aikit_local_draft_delete_cameo_draft", true);
        this.LIZ = iLJIJ > 0 ? C2252461DEe.LIZ(iLJIJ) : null;
        this.LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(174));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    public final Object LJFF(String str) {
        try {
            DetailFeedService detailFeedService = (DetailFeedService) PluggableExtentionKt.pluggableSpi$default(DetailFeedService.class, false, false, false, 14, null);
            if (detailFeedService != null) {
                return detailFeedService.LJIIJ(str, "");
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    public final Object LIZ(String str, InterfaceC1364105Vn<? super GetDraftDetailResponse> interfaceC1364105Vn) {
        return ((InterfaceC546200LbW) this.LIZIZ.getValue()).LIZ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    public final Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super GetTaskInfoResponse> interfaceC1364105Vn) {
        return ((InterfaceC546200LbW) this.LIZIZ.getValue()).LIZIZ(str, str2, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0166 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.creative.model.CreativeModel r18, boolean r19, X.InterfaceC1364105Vn<? super X.C542120LNy> r20) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LIZJ(com.ss.android.ugc.aweme.creative.model.CreativeModel, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super java.lang.String> r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LJII(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C546190LbV
            if (r0 == 0) goto L49
            r4 = r8
            X.0LbV r4 = (X.C546190LbV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L4f
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0LSZ r3 = (X.C0LSZ) r3
            if (r3 == 0) goto L57
            java.lang.String r7 = r3.LJIJJLI
        L28:
            return r7
        L29:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L34
            int r0 = r7.length()
            if (r0 != 0) goto L28
        L34:
            boolean r0 = X.C123100dR.LIZ(r6)
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L57
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJFF(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L49:
            X.0LbV r4 = new X.0LbV
            r4.<init>(r5, r8)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L57:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LJIIIIZZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    public final java.lang.Object LIZLLL(X.InterfaceC546090LbL r20, java.lang.String r21, java.lang.String r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LIZLLL(X.0LbL, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:61:0x00c2, B:62:0x00c5, B:63:0x00c7, B:20:0x005a, B:21:0x005d, B:23:0x0063, B:25:0x0067, B:27:0x006d, B:29:0x0071, B:31:0x0075, B:41:0x0088, B:42:0x0094, B:44:0x0098, B:48:0x009f, B:52:0x00a6, B:58:0x00b3, B:54:0x00aa, B:65:0x00d3, B:67:0x00d7, B:68:0x00db, B:71:0x00e1, B:17:0x004b), top: B:80:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r19, X.InterfaceC546090LbL r20, boolean r21, X.InterfaceC1364105Vn<? super X.C542120LNy> r22) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LJ(java.lang.String, X.0LbL, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC546090LbL r14, java.lang.String r15, java.lang.String r16, java.util.List<java.lang.String> r17, boolean r18, X.InterfaceC1364105Vn<? super X.C542120LNy> r19) {
        /*
            r13 = this;
            r3 = r19
            r6 = r14
            boolean r0 = r3 instanceof X.C546170LbT
            r9 = r13
            if (r0 == 0) goto L26
            r4 = r3
            X.0LbT r4 = (X.C546170LbT) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            X.0LbL r6 = r4.LL
            goto L52
        L26:
            X.0LbT r4 = new X.0LbT
            r4.<init>(r9, r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r3)
            X.0LNq r5 = new X.0LNq     // Catch: java.lang.Exception -> L5a
            if (r18 == 0) goto L3d
            r7 = 1
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r12 = 0
            r11 = r17
            r8 = r16
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L5a
            r4.LL = r6     // Catch: java.lang.Exception -> L58
            r4.LLILZ = r0     // Catch: java.lang.Exception -> L58
            java.lang.Object r3 = X.C2296808zG.LJ(r5, r4)     // Catch: java.lang.Exception -> L58
            if (r3 != r2) goto L55
            return r2
        L52:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L5c
        L55:
            X.0LNy r3 = (X.C542120LNy) r3     // Catch: java.lang.Exception -> L5c
            return r3
        L58:
            r0 = move-exception
            goto L5d
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L68
            java.lang.String r1 = "checkDraftAndCameoPermissions error"
        L68:
            r0 = -100
            X.0LNy r3 = X.C542070LNt.LIZ(r6, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AITaskServiceImpl.LJI(X.0LbL, java.lang.String, java.lang.String, java.util.List, boolean, X.05Vn):java.lang.Object");
    }
}
