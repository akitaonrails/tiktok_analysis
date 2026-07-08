package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionLevelTaskAllResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public PermissionLevelTaskAllExtra extra;

    public static final class ResponseData {

        @C09CT("remaining_days")
        public int remainingDays;

        @C09CT("show_notice")
        public boolean showNotice;

        @C09CT("stages")
        public List<PermissionLevelStage> stages;
    }
}
