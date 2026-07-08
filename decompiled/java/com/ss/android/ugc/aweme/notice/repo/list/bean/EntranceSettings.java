package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class EntranceSettings {

    @C09CT("entrance_id")
    public final int entranceId;

    @C09CT("function_settings")
    public final List<InboxEntranceFunction> functionSettings;

    public EntranceSettings() {
        this(-1, null);
    }

    public EntranceSettings(int i, List<InboxEntranceFunction> list) {
        this.entranceId = i;
        this.functionSettings = list;
    }
}
