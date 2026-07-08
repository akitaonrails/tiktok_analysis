package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDownloadCountMessage extends AbstractC1136060ffY {

    @C09CT("downloaded_count")
    public long downloadedCount;

    @C09CT("game_id")
    public String gameId;

    public PartnershipDownloadCountMessage() {
        this.type = C001A.PARTNERSHIP_DOWNLOAD_COUNT_MESSAGE;
        this.gameId = "";
    }
}
