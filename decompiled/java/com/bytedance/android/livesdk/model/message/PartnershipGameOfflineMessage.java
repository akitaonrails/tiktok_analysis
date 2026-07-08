package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipGameOfflineMessage extends AbstractC1136060ffY {

    @C09CT("offline_game_list")
    public List<OfflineGameInfo> offlineGameList;

    public static final class OfflineGameInfo {

        @C09CT("offline_type")
        public int offlineType;

        @C09CT("task_list_len")
        public int taskListLen;

        @C09CT("task_type")
        public int taskType;

        @C09CT("task_id")
        public String taskId = "";

        @C09CT("toast_text")
        public String toastText = "";

        @C09CT("game_id")
        public String gameId = "";
    }

    public PartnershipGameOfflineMessage() {
        this.type = C001A.PARTNERSHIP_GAME_OFFLINE_MESSAGE;
    }
}
