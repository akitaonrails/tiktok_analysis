package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("end_reason")
        public int endReason;

        @C09CT("status_not_match")
        public int statusNotMatch;
    }
}
