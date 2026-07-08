package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes36.dex */
public final class ReplyStatus {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final String replyStatusToString(int i) {
            return i == 1 ? "agree" : "reject";
        }
    }
}
