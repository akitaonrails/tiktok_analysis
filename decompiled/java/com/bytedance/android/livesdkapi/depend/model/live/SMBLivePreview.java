package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AILiveSummary;

/* JADX INFO: loaded from: classes.dex */
public final class SMBLivePreview {

    @C09CT("ai_summary")
    public AILiveSummary aiSummary;

    @C09CT("create_time")
    public long createTime;

    @C09CT("display_interval")
    public long displayInterval;

    @C09CT("preview_item")
    public List<PreviewItem> previewItem = new ArrayList();

    public static final class PreviewItem {

        @C09CT("type")
        public int type;

        @C09CT("title")
        public String title = "";

        @C09CT("content")
        public String content = "";

        @C09CT("icon_token")
        public String iconToken = "";
    }
}
