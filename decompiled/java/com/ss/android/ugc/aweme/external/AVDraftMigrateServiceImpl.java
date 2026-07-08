package com.ss.android.ugc.aweme.external;

import X.C01GW;
import X.C05YD;
import X.C098200Yq;
import X.C0BF4;
import X.C0PEM;
import X.C0WZX;
import X.C1192104lT;
import X.C1339505Mb;
import X.C1339605Mc;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C189200o6;
import X.C19EG;
import X.C1BWL;
import X.C1DFH;
import X.C2107308Nj;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C291110Bb3;
import X.C291120Bb4;
import X.C452501pT;
import X.C817503Hh;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class AVDraftMigrateServiceImpl implements AVDraftMigrateService {
    public final String LIZ = "com.nc.tiktok.usmain";
    public final String LIZIZ = "com.zhiliaoapp.musically";
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1192104lT());

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final MigrateTaskStatus currentMigrateFlowStatus() {
        C05YD<MigrateTaskStatus> taskStatus;
        MigrateTaskStatus value;
        IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
        return (iDraftMigrateFlowService == null || (taskStatus = iDraftMigrateFlowService.getTaskStatus()) == null || (value = taskStatus.getValue()) == null) ? MigrateTaskStatus.Idle.INSTANCE : value;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean isM2MigrateProfileHoverClicked() {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            return false;
        }
        Keva keva = (Keva) this.LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("m2_migrate_profile_hover_clicked_");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final void setM2MigrateProfileHoverClicked() {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            return;
        }
        Keva keva = (Keva) this.LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("m2_migrate_profile_hover_clicked_");
        sbLIZ.append(currentUserID);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final int draftMigrateUnMigrateCount() {
        IDraftMigrateStateService iDraftMigrateStateService;
        int i = 0;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) == null) {
            return 0;
        }
        List listQueryAllDraftMigrateState$default = IDraftMigrateStateService.DefaultImpls.queryAllDraftMigrateState$default(iDraftMigrateStateService, false, 1, null);
        if (listQueryAllDraftMigrateState$default != null && !listQueryAllDraftMigrateState$default.isEmpty()) {
            Iterator it2 = listQueryAllDraftMigrateState$default.iterator();
            i = 0;
            while (it2.hasNext()) {
                DraftMigrateState draftMigrateState = ((MigrateDraftStateInfo) it2.next()).migrateDraftState;
                if (draftMigrateState != DraftMigrateState.NOT_MIGRATE && draftMigrateState != DraftMigrateState.MIGRATED && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean enableM1MigrateDraft() {
        return C291110Bb3.LIZ() && isM2Installed();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean enableM2MigrateDraft() {
        return C291120Bb4.LIZ() && isM1Installed();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final String getM2AppName() {
        return C0BF4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean hadMigratedDraft() {
        IDraftMigrateStateService iDraftMigrateStateService;
        List<MigrateDraftStateInfo> listQueryAllDraftMigrateState;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) == null || (listQueryAllDraftMigrateState = iDraftMigrateStateService.queryAllDraftMigrateState(true)) == null || listQueryAllDraftMigrateState.isEmpty()) {
            return false;
        }
        Iterator<MigrateDraftStateInfo> it2 = listQueryAllDraftMigrateState.iterator();
        while (it2.hasNext()) {
            MigrateDraftStateInfo next = it2.next();
            if (next.migrateDraftState == DraftMigrateState.MIGRATED) {
                return next != null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean hasDraftMigrateFailed() {
        return hasDraftMigrateFailedCount() > 0;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final int hasDraftMigrateFailedCount() {
        IDraftMigrateStateService iDraftMigrateStateService;
        int i = 0;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) == null) {
            return 0;
        }
        List listQueryAllDraftMigrateState$default = IDraftMigrateStateService.DefaultImpls.queryAllDraftMigrateState$default(iDraftMigrateStateService, false, 1, null);
        if (listQueryAllDraftMigrateState$default != null && !listQueryAllDraftMigrateState$default.isEmpty()) {
            Iterator it2 = listQueryAllDraftMigrateState$default.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((MigrateDraftStateInfo) it2.next()).migrateDraftState == DraftMigrateState.MIGRATED_FAILED && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean isAllDraftMigrated() {
        IDraftMigrateStateService iDraftMigrateStateService;
        List listQueryAllDraftMigrateState$default;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) == null || (listQueryAllDraftMigrateState$default = IDraftMigrateStateService.DefaultImpls.queryAllDraftMigrateState$default(iDraftMigrateStateService, false, 1, null)) == null) {
            return false;
        }
        Iterator it2 = listQueryAllDraftMigrateState$default.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((MigrateDraftStateInfo) next).migrateDraftState != DraftMigrateState.MIGRATED) {
                if (next == null) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean isDraftMigrateNotStarted() {
        IDraftMigrateStateService iDraftMigrateStateService;
        return (enableM1MigrateDraft() || enableM2MigrateDraft()) && (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) != null && IDraftMigrateStateService.DefaultImpls.queryAllDraftMigrateState$default(iDraftMigrateStateService, false, 1, null) == null;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean isM1Installed() {
        return C2162308dZ.LJFF(C1BWL.LIZ(), this.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final boolean isM2Installed() {
        return C2162308dZ.LJFF(C1BWL.LIZ(), this.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final int migratedDraftCount() {
        IDraftMigrateStateService iDraftMigrateStateService;
        List listQueryAllDraftMigrateState$default;
        int i = 0;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null)) == null || (listQueryAllDraftMigrateState$default = IDraftMigrateStateService.DefaultImpls.queryAllDraftMigrateState$default(iDraftMigrateStateService, false, 1, null)) == null) {
            return 0;
        }
        if (!listQueryAllDraftMigrateState$default.isEmpty()) {
            Iterator it2 = listQueryAllDraftMigrateState$default.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((MigrateDraftStateInfo) it2.next()).migrateDraftState == DraftMigrateState.MIGRATED && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final void openM1OrGoGP() {
        try {
            LIZIZ(C1BWL.LIZ(), this.LIZIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final void openM2OrGoGP() {
        try {
            LIZIZ(C1BWL.LIZ(), this.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final long getTotalFailedMigrateSpaceSize(List<String> list) {
        IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null);
        if (iDraftMigrateStateService == null) {
            return 0L;
        }
        return iDraftMigrateStateService.queryDraftSize(list);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final void observeM2DraftMigrationResult(C19EG c19eg) {
        IDraftMigrateFlowService iDraftMigrateFlowService;
        if ((!enableM1MigrateDraft() && !enableM2MigrateDraft()) || (iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null)) == null) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1339605Mc(iDraftMigrateFlowService, this, c19eg, null), 2);
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+wd5rc0jMoCfcnkaKlnUIaCNwINOofbI5YecdKUVC2V1c=", null));
    }

    public static void LIZIZ(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            LIZ(context, launchIntentForPackage);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("market://details?id=");
            sbLIZ.append(str);
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            LIZ(context, intent);
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://play.google.com/store/apps/details?id=");
            sbLIZ2.append(str);
            intent2.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
            intent2.addFlags(268435456);
            LIZ(context, intent2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService
    public final void observeMigrateFlowStatus(LifecycleOwner lifecycleOwner, Function1<? super MigrateTaskStatus, Unit> function1) {
        IDraftMigrateFlowService iDraftMigrateFlowService = (IDraftMigrateFlowService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateFlowService.class, false, false, false, 14, null);
        if (iDraftMigrateFlowService == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1339505Mb(lifecycleOwner, iDraftMigrateFlowService, function1, null), 2);
    }
}
