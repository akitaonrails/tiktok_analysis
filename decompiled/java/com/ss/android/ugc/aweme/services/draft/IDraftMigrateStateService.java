package com.ss.android.ugc.aweme.services.draft;

import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IDraftMigrateStateService {
    void clearMigrationCache();

    List<MigrateDraftStateInfo> queryAllDraftMigrateState(boolean z);

    DraftMigrateState queryDraftMigrateState(String str);

    long queryDraftSize(List<String> list);

    void updateDraftMigrateAigcInfos(Map<String, Integer> map);

    void updateDraftMigrateInfos(Map<String, String> map, boolean z);

    void updateDraftMigrateSize(Map<String, Long> map);

    void updateDraftMigrateState(String str, DraftMigrateState draftMigrateState);

    public static final class DefaultImpls {
        public static /* synthetic */ List queryAllDraftMigrateState$default(IDraftMigrateStateService iDraftMigrateStateService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return iDraftMigrateStateService.queryAllDraftMigrateState(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryAllDraftMigrateState");
        }

        public static /* synthetic */ void updateDraftMigrateInfos$default(IDraftMigrateStateService iDraftMigrateStateService, Map map, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                iDraftMigrateStateService.updateDraftMigrateInfos(map, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDraftMigrateInfos");
        }
    }
}
