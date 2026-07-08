package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookContent {

    @C09CT("content_extra")
    public PlaybookContentExtra contentExtra;

    @C09CT("content_source")
    public int contentSource;

    @C09CT("content_status")
    public int contentStatus;

    @C09CT("editor_info")
    public PlaybookEditorInfo editorInfo;

    @C09CT("min_symphony_engine_app_version")
    public long minSymphonyEngineAppVersion;

    @C09CT("need_async_update")
    public boolean needAsyncUpdate;

    @C09CT("original_playbook_content_id")
    public long originalPlaybookContentId;

    @C09CT("playbook_content_id")
    public long playbookContentId;

    @C09CT("support_automation")
    public boolean supportAutomation;

    @C09CT("text_type")
    public int textType;

    @C09CT("title")
    public String title = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("description")
    public String description = "";

    @C09CT("flow_str")
    public String flowStr = "";

    @C09CT("cover_uri")
    public String coverUri = "";

    @C09CT("tag_types")
    public List<Integer> tagTypes = new ArrayList();

    @C09CT("tag_aggregations")
    public List<PlaybookTagAggregation> tagAggregations = new ArrayList();

    @C09CT("function_extra_map")
    public Map<Long, PlaybookFlowExtra> functionExtraMap = new LinkedHashMap();

    public final int hashCode() {
        int iY2 = ((((((((((((((C786410Ut5.Y2(this.playbookContentId) * 31) + C786410Ut5.Y2(this.originalPlaybookContentId)) * 31) + this.textType) * 31) + this.contentStatus) * 31) + C786410Ut5.Y2(this.minSymphonyEngineAppVersion)) * 31) + this.title.hashCode()) * 31) + this.coverUrl.hashCode()) * 31) + this.description.hashCode()) * 31;
        PlaybookEditorInfo playbookEditorInfo = this.editorInfo;
        return ((((((((iY2 + (playbookEditorInfo != null ? playbookEditorInfo.hashCode() : 0)) * 31) + this.flowStr.hashCode()) * 31) + this.coverUri.hashCode()) * 31) + this.tagTypes.hashCode()) * 31) + this.tagAggregations.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(PlaybookContent.class, cls)) {
            return false;
        }
        PlaybookContent playbookContent = (PlaybookContent) obj;
        if (this.playbookContentId == playbookContent.playbookContentId && this.originalPlaybookContentId == playbookContent.originalPlaybookContentId && this.textType == playbookContent.textType && this.contentStatus == playbookContent.contentStatus && this.minSymphonyEngineAppVersion == playbookContent.minSymphonyEngineAppVersion && Intrinsics.LJFF(this.title, playbookContent.title) && Intrinsics.LJFF(this.coverUrl, playbookContent.coverUrl) && Intrinsics.LJFF(this.description, playbookContent.description) && Intrinsics.LJFF(this.editorInfo, playbookContent.editorInfo) && Intrinsics.LJFF(this.flowStr, playbookContent.flowStr) && Intrinsics.LJFF(this.coverUri, playbookContent.coverUri) && Intrinsics.LJFF(this.tagTypes, playbookContent.tagTypes) && Intrinsics.LJFF(this.tagAggregations, playbookContent.tagAggregations)) {
            return true;
        }
        return false;
    }
}
