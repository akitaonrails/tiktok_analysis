package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes36.dex */
public final class PermitStatus {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final String stateToString(int i) {
            return i == 1 ? "agree" : "reject";
        }
    }
}
