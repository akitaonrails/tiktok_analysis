package com.ss.android.ugc.aweme.services.draft.model;

import X.C09CT;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class MigrateDraftStateInfo implements Serializable {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("free_space")
    public final Long freeSpace;

    @C09CT("isAigc")
    public final Integer isAigc;

    @C09CT("migrateDraftState")
    public final DraftMigrateState migrateDraftState;

    public final MigrateDraftStateInfo copy(String str, Long l, DraftMigrateState draftMigrateState, Integer num) {
        return new MigrateDraftStateInfo(str, l, draftMigrateState, num);
    }

    public final Integer isAigc() {
        return this.isAigc;
    }

    public MigrateDraftStateInfo(String str, Long l, DraftMigrateState draftMigrateState, Integer num) {
        this.creationId = str;
        this.freeSpace = l;
        this.migrateDraftState = draftMigrateState;
        this.isAigc = num;
    }
}
