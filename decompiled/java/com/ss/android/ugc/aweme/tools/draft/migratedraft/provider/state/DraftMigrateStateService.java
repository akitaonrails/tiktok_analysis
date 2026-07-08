package com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.state;

import X.C01GW;
import X.C098200Yq;
import X.C0C64;
import X.C0CHQ;
import X.C0WJO;
import X.C189200o6;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DraftMigrateStateService implements IDraftMigrateStateService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(701));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final void clearMigrationCache() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva kevaLIZ = LIZ(currentUserID, "MigrateDraftsState");
        Keva kevaLIZ2 = LIZ(currentUserID, "MigrateDraftsAIGC");
        Keva kevaLIZ3 = LIZ(currentUserID, "MigrateDraftsSize");
        try {
            kevaLIZ.clear();
            kevaLIZ3.clear();
            kevaLIZ2.clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final synchronized ConcurrentHashMap<String, String> LIZIZ(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
        if (concurrentHashMap == null) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            ((ConcurrentHashMap) this.LIZIZ.getValue()).put(str, concurrentHashMap2);
            return concurrentHashMap2;
        }
        return concurrentHashMap;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final List<MigrateDraftStateInfo> queryAllDraftMigrateState(boolean z) {
        Object c098200Yq;
        boolean z2;
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva kevaLIZ = LIZ(currentUserID, "MigrateDraftsState");
        if (!kevaLIZ.getBoolean("has_record", false)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> allKey = kevaLIZ.getAllKey();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : allKey) {
            String str = (String) obj;
            boolean z3 = true;
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || Intrinsics.LJFF(str, "has_record")) {
                z3 = false;
            }
            if (z3) {
                arrayList2.add(obj);
            }
        }
        Keva kevaLIZ2 = LIZ(currentUserID, "MigrateDraftsAIGC");
        Keva kevaLIZ3 = LIZ(currentUserID, "MigrateDraftsSize");
        for (String str2 : arrayList2) {
            String string = kevaLIZ.getString(str2, "NOT_MIGRATE");
            int i = kevaLIZ2.getInt(str2, 0);
            try {
                c098200Yq = DraftMigrateState.valueOf(string);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            DraftMigrateState draftMigrateState = (DraftMigrateState) c098200Yq;
            if (z) {
                arrayList.add(new MigrateDraftStateInfo(str2, Long.valueOf(kevaLIZ3.getLong(str2, 0L)), draftMigrateState, Integer.valueOf(i)));
            } else if (draftMigrateState != DraftMigrateState.MIGRATED) {
                arrayList.add(new MigrateDraftStateInfo(str2, Long.valueOf(kevaLIZ3.getLong(str2, 0L)), draftMigrateState, Integer.valueOf(i)));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final DraftMigrateState queryDraftMigrateState(String str) {
        Object c098200Yq;
        String str2;
        Object c098200Yq2;
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        ConcurrentHashMap<String, String> concurrentHashMapLIZIZ = LIZIZ(currentUserID);
        Object obj = null;
        if (concurrentHashMapLIZIZ.containsKey(str) && (str2 = concurrentHashMapLIZIZ.get(str)) != null) {
            try {
                c098200Yq2 = DraftMigrateState.valueOf(str2);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            DraftMigrateState draftMigrateState = (DraftMigrateState) obj;
            if (draftMigrateState == null) {
                return DraftMigrateState.NOT_MIGRATE;
            }
            return draftMigrateState;
        }
        try {
            c098200Yq = DraftMigrateState.valueOf(LIZ(currentUserID, "MigrateDraftsState").getString(str, "NOT_MIGRATE"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        DraftMigrateState draftMigrateState2 = (DraftMigrateState) obj;
        if (draftMigrateState2 != null) {
            concurrentHashMapLIZIZ.put(str, draftMigrateState2.name());
            return draftMigrateState2;
        }
        return DraftMigrateState.NOT_MIGRATE;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final long queryDraftSize(List<String> list) {
        Keva kevaLIZ = LIZ(C0CHQ.LIZ().getAccountService().getCurrentUserID(), "MigrateDraftsSize");
        Iterator<String> it2 = list.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += kevaLIZ.getLong(it2.next(), 0L);
        }
        return j;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final void updateDraftMigrateAigcInfos(Map<String, Integer> map) {
        Keva kevaLIZ = LIZ(C0CHQ.LIZ().getAccountService().getCurrentUserID(), "MigrateDraftsAIGC");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            kevaLIZ.storeInt(entry.getKey(), entry.getValue().intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final void updateDraftMigrateSize(Map<String, Long> map) {
        Keva kevaLIZ = LIZ(C0CHQ.LIZ().getAccountService().getCurrentUserID(), "MigrateDraftsSize");
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            kevaLIZ.storeLong(entry.getKey(), entry.getValue().longValue());
        }
    }

    public final synchronized Keva LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = (Keva) ((ConcurrentHashMap) this.LIZ.getValue()).get(strLIZIZ);
        if (keva == null) {
            Keva repo = Keva.getRepo(strLIZIZ);
            ((ConcurrentHashMap) this.LIZ.getValue()).put(strLIZIZ, repo);
            return repo;
        }
        return keva;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final void updateDraftMigrateInfos(Map<String, String> map, boolean z) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        ConcurrentHashMap<String, String> concurrentHashMapLIZIZ = LIZIZ(currentUserID);
        Keva kevaLIZ = LIZ(currentUserID, "MigrateDraftsState");
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "migrate_draft_debug_clear_cache", true, false)) {
            concurrentHashMapLIZIZ.clear();
            kevaLIZ.clear();
        }
        if (kevaLIZ.getBoolean("has_record", false) && !z) {
            C0WJO.LIZJ("transfer", "has cache, do not update DraftMigrateInfos");
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            concurrentHashMapLIZIZ.put(entry.getKey(), entry.getValue());
            kevaLIZ.storeString(entry.getKey(), entry.getValue());
        }
        kevaLIZ.storeBoolean("has_record", true);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService
    public final void updateDraftMigrateState(String str, DraftMigrateState draftMigrateState) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        LIZIZ(currentUserID).put(str, draftMigrateState.name());
        LIZ(currentUserID, "MigrateDraftsState").storeString(str, draftMigrateState.name());
    }
}
