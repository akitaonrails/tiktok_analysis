package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.list;

import X.C09CT;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section.ECMixMallSectionDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class ECMixMallListDTO {

    @C09CT("data")
    public k data;

    @C09CT("has_more")
    public Boolean hasMore;

    @C09CT("hidden_scroll_indicator")
    public Integer hiddenScrollIndicator;

    @C09CT("impression_info")
    public n impressionInfo;

    @C09CT("sections")
    public List<ECMixMallSectionDTO> sections;

    @C09CT("style")
    public ECMixMallStyleDTO style;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "default_tab_id";

    @C09CT("next_cursor")
    public int cursor = 1;

    @C09CT("session_id")
    public String sessionId = "";

    public final int getCursor() {
        return this.cursor;
    }

    public final k getData() {
        return this.data;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getHiddenScrollIndicator() {
        return this.hiddenScrollIndicator;
    }

    public final String getId() {
        return this.id;
    }

    public final n getImpressionInfo() {
        return this.impressionInfo;
    }

    public final List<ECMixMallSectionDTO> getSections() {
        return this.sections;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final ECMixMallStyleDTO getStyle() {
        return this.style;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setData(k kVar) {
        this.data = kVar;
    }

    public final void setHasMore(Boolean bool) {
        this.hasMore = bool;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImpressionInfo(n nVar) {
        this.impressionInfo = nVar;
    }

    public final void setSections(List<ECMixMallSectionDTO> list) {
        this.sections = list;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setStyle(ECMixMallStyleDTO eCMixMallStyleDTO) {
        this.style = eCMixMallStyleDTO;
    }
}
