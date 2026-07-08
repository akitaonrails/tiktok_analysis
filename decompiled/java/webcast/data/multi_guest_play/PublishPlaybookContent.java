package webcast.data.multi_guest_play;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class PublishPlaybookContent {

    @C09CT("content_extra")
    public PlaybookContentExtra contentExtra;

    @C09CT("editor_info")
    public PlaybookEditorInfo editorInfo;

    @C09CT("min_symphony_engine_app_version")
    public long minSymphonyEngineAppVersion;

    @C09CT("support_automation")
    public boolean supportAutomation;

    @C09CT("text_type")
    public int textType;

    @C09CT("visible_type")
    public int visibleType;

    @C09CT("title")
    public String title = "";

    @C09CT("cover_uri")
    public String coverUri = "";

    @C09CT("description")
    public String description = "";

    @C09CT("flow_str")
    public String flowStr = "";

    @C09CT("tag_aggregations")
    public List<PlaybookTagAggregation> tagAggregations = new ArrayList();
}
