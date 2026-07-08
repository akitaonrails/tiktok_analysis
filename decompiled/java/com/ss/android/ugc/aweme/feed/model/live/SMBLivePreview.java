package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class SMBLivePreview implements Serializable {

    @C09CT("display_interval")
    public long displayInterval;

    @C09CT("ai_summary")
    public LiveAiSummary liveAiSummary;

    @C09CT("preview_item")
    public List<PreviewItem> previewItem = new ArrayList();

    public static final class PreviewItem implements Serializable {

        @C09CT("type")
        public int type;

        @C09CT("title")
        public String title = "";

        @C09CT("content")
        public String content = "";

        @C09CT("icon_token")
        public String iconToken = "";

        public static /* synthetic */ void getType$annotations() {
        }
    }
}
