package com.ss.android.ugc.aweme.tools.draft.migratedraft;

import X.C01GW;
import X.C098200Yq;
import X.C0LAB;
import X.C0MZM;
import X.C0WJO;
import X.C189200o6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C308540C7o;
import X.InterfaceC332260D0u;
import android.content.ContentResolver;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.IMigrateDraftService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class MigrateDraftService implements IMigrateDraftService {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C0WJN
            if (r0 == 0) goto L22
            r5 = r13
            X.0WJN r5 = (X.C0WJN) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            java.lang.String r3 = "MigrateDraftService"
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L59
        L22:
            X.0WJN r5 = new X.0WJN
            r5.<init>(r12, r13)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0MAY r1 = X.C0MAY.LIZIZ     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "runAMEDraftMigrate start"
            X.C201955140j.LJIIIIZZ(r1, r3, r0)     // Catch: java.lang.Throwable -> L69
            java.lang.Class<com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService> r6 = com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L69
            com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService r0 = (com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService) r0     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L5c
            X.0WJP r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L5c
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L69
            if (r0 != r4) goto L5c
            return r4
        L59:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L69
        L5c:
            X.0MAY r1 = X.C0MAY.LIZIZ     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "runAMEDraftMigrate end"
            X.C201955140j.LJIIIIZZ(r1, r3, r0)     // Catch: java.lang.Throwable -> L69
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L69
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L69
            goto L75
        L69:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L75:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L82
            X.0MAY r1 = X.C0MAY.LIZIZ
            java.lang.String r0 = "runAMEDraftMigrate failed "
            X.C201955140j.LJIIIZ(r1, r3, r0, r2)
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x072a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.database.Cursor, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    @Override // com.ss.android.ugc.aweme.services.draft.IMigrateDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object migrateDraft(com.ss.android.ugc.aweme.services.draft.MigrateType r34, java.lang.String r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService.migrateDraft(com.ss.android.ugc.aweme.services.draft.MigrateType, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r12, android.content.ContentResolver r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            r6 = r12
            boolean r0 = r15 instanceof X.C0WJK
            if (r0 == 0) goto L26
            r10 = r15
            X.0WJK r10 = (X.C0WJK) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r10.LLILZ = r2
        L13:
            java.lang.Object r5 = r10.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L38
            if (r0 != r4) goto L30
            java.lang.Object r0 = r10.LL
            goto L2c
        L26:
            X.0WJK r10 = new X.0WJK
            r10.<init>(r11, r15)
            goto L13
        L2c:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L9f
            goto L98
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            java.lang.Object r6 = r10.LL
            android.content.Context r6 = (android.content.Context) r6
            goto L62
        L3d:
            X.C155000ia.LIZIZ(r5)
            X.01GW r0 = X.C0AZJ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L51
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            X.0WJ8 r5 = X.C0WJ8.LIZ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r9 = "public"
            r10.LL = r6     // Catch: java.lang.Throwable -> L9f
            r10.LLILZ = r1     // Catch: java.lang.Throwable -> L9f
            r8 = r14
            r7 = r13
            java.lang.Object r5 = r5.LIZIZ(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9f
            if (r5 != r3) goto L65
            return r3
        L62:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L9f
        L65:
            r2 = r5
            com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult r2 = (com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult) r2     // Catch: java.lang.Throwable -> L9f
            int r0 = r2.getErrorCode()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L99
            java.lang.String r0 = r2.getTargetPath()     // Catch: java.lang.Throwable -> L9f
            boolean r0 = X.C123100dR.LIZ(r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L99
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r2.getTargetPath()     // Catch: java.lang.Throwable -> L9f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L99
            X.0WJD r0 = X.C0WJD.LIZ     // Catch: java.lang.Throwable -> L9f
            r10.LL = r5     // Catch: java.lang.Throwable -> L9f
            r10.LLILZ = r4     // Catch: java.lang.Throwable -> L9f
            r0.getClass()     // Catch: java.lang.Throwable -> L9f
            com.ss.android.ugc.aweme.services.draft.model.MigrateDraftCommonResult r0 = X.C0WJD.LIZ(r6, r1)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r3) goto L97
            return r3
        L97:
            r0 = r5
        L98:
            r5 = r0
        L99:
            com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult r5 = (com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult) r5     // Catch: java.lang.Throwable -> L9f
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L9f
            goto Lab
        L9f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lab:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService.LIZ(android.content.Context, android.content.ContentResolver, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static int LIZLLL(ContentResolver contentResolver, String str, MigrateDraftStateInfo migrateDraftStateInfo, int i, int i2, String str2, DraftMigrateState draftMigrateState) {
        int iIntValue;
        long jLongValue;
        Object c098200Yq;
        InterfaceC332260D0u<MigrateTaskStatus> taskMutableStatus;
        Integer numIsAigc = migrateDraftStateInfo.isAigc();
        if (numIsAigc != null) {
            iIntValue = numIsAigc.intValue();
        } else {
            iIntValue = 0;
        }
        Long l = migrateDraftStateInfo.freeSpace;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        int iLIZIZ = -1;
        try {
            iLIZIZ = C0MZM.LIZIZ(contentResolver, str, i, i2, iIntValue, jLongValue, draftMigrateState, str2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null);
            if (iDraftMigrateStateService != null) {
                iDraftMigrateStateService.updateDraftMigrateState(str, draftMigrateState);
            }
            MigrateDraftStateInfo migrateDraftStateInfoCopy = migrateDraftStateInfo.copy(migrateDraftStateInfo.creationId, migrateDraftStateInfo.freeSpace, draftMigrateState, migrateDraftStateInfo.isAigc);
            IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
            if (iDraftMigrateFlowService != null && (taskMutableStatus = iDraftMigrateFlowService.getTaskMutableStatus()) != null) {
                taskMutableStatus.setValue(new MigrateTaskStatus.Progress(migrateDraftStateInfoCopy, i, i2, str2));
            }
        }
        return iLIZIZ;
    }

    public static void LIZIZ(int i, int i2, int i3, long j, String str, String str2, String str3, boolean z, boolean z2) {
        int i4;
        int i5 = 0;
        if (i3 == 1 && i2 > 0 && i == i2) {
            C308540C7o.LIZ.getClass();
            C308540C7o.LIZIZ(str);
        } else {
            C308540C7o.LIZ.getClass();
            try {
                C01GW c01gw = C308540C7o.LIZIZ;
                ((Keva) c01gw.getValue()).storeInt(str, ((Keva) c01gw.getValue()).getInt(str, 0) + 1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("migrateCnt = ");
        sbLIZ.append(i);
        sbLIZ.append(", migrateSuccessCnt = ");
        sbLIZ.append(i2);
        sbLIZ.append(", migrateStatus = ");
        sbLIZ.append(i3);
        sbLIZ.append(", migrateFailReason = ");
        sbLIZ.append(str3);
        C0WJO.LIZJ("transfer", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_method", str2);
        if (z) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "is_manual_start");
        if (z2) {
            i5 = 1;
        }
        c0lab.LIZ(i5, "is_fail_retry");
        c0lab.LIZ(i, "migrate_cnt");
        c0lab.LIZIZ(SystemClock.elapsedRealtime() - j, "duration");
        c0lab.LIZ(i2, "migrate_success_cnt");
        c0lab.LIZ(i3, "migrate_status");
        c0lab.LJ("migrate_fail_reason", str3);
        C20684815ws.LJIILLIIL("draft_migrate_finish", c0lab.LIZ);
    }
}
