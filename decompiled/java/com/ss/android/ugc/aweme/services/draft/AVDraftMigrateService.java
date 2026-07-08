package com.ss.android.ugc.aweme.services.draft;

import X.C19EG;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface AVDraftMigrateService {
    MigrateTaskStatus currentMigrateFlowStatus();

    int draftMigrateUnMigrateCount();

    boolean enableM1MigrateDraft();

    boolean enableM2MigrateDraft();

    String getM2AppName();

    long getTotalFailedMigrateSpaceSize(List<String> list);

    boolean hadMigratedDraft();

    boolean hasDraftMigrateFailed();

    int hasDraftMigrateFailedCount();

    boolean isAllDraftMigrated();

    boolean isDraftMigrateNotStarted();

    boolean isM1Installed();

    boolean isM2Installed();

    boolean isM2MigrateProfileHoverClicked();

    int migratedDraftCount();

    void observeM2DraftMigrationResult(C19EG c19eg);

    void observeMigrateFlowStatus(LifecycleOwner lifecycleOwner, Function1<? super MigrateTaskStatus, Unit> function1);

    void openM1OrGoGP();

    void openM2OrGoGP();

    void setM2MigrateProfileHoverClicked();
}
