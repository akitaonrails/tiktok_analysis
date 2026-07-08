package com.ss.android.ugc.aweme.im.streak.impl.monitor;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class RestoreDelayCallbackData {

    @C09CT("click_restore_button")
    public final long clickRestoreButton;

    @C09CT("peerid")
    public final String peerId;

    @C09CT("receive_restore_response")
    public final long receiveRestoreResponse;

    @C09CT("restore_result")
    public final int restoreResult;

    @C09CT("uuid")
    public final String uuid;

    public RestoreDelayCallbackData() {
        this("", "", 0L, 0L, 1);
    }

    public RestoreDelayCallbackData(String str, String str2, long j, long j2, int i) {
        this.uuid = str;
        this.peerId = str2;
        this.clickRestoreButton = j;
        this.receiveRestoreResponse = j2;
        this.restoreResult = i;
    }
}
