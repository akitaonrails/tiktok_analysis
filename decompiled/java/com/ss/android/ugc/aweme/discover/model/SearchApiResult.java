package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchApiResult extends BaseResponse implements C0X12, InterfaceC1201180hMa {

    @C09CT("components")
    public List<ComponentInfo> components;

    @C09CT("header")
    public DynamicPatch dynamicHeader;

    @C09CT("mask_layer")
    public DynamicPatch dynamicMask;

    @C09CT("global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;

    @C09CT("log_pb")
    public LogPbBean logPb;
    public C1494600ozq requestInfo;

    @C09CT("search_nil_info")
    public SearchNilInfo searchNilInfo;

    @C09CT("search_nil_text")
    public SearchNilText searchNilText;
    public String requestId = "";

    @C09CT("item_count")
    public int itemCount = -1;

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int getDisableReorder() {
        GlobalDoodleConfig globalDoodleConfig = this.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            return globalDoodleConfig.getDisableReorder();
        }
        return 0;
    }

    public DynamicPatch getDynamicHeader() {
        return this.dynamicHeader;
    }

    public DynamicPatch getDynamicMask() {
        return this.dynamicMask;
    }

    public GlobalDoodleConfig getGlobalDoodleConfig() {
        return this.globalDoodleConfig;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq getRequestInfo() {
        return this.requestInfo;
    }

    public SearchNilInfo getSearchNilInfo() {
        return this.searchNilInfo;
    }

    public SearchNilText getSearchNilText() {
        return this.searchNilText;
    }

    public void setDisableReorder(int i) {
        GlobalDoodleConfig globalDoodleConfig = this.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            globalDoodleConfig.setDisableReorder(i);
        }
    }

    public void setDynamicHeader(DynamicPatch dynamicPatch) {
        this.dynamicHeader = dynamicPatch;
    }

    public void setDynamicMask(DynamicPatch dynamicPatch) {
        this.dynamicMask = dynamicPatch;
    }

    public void setGlobalDoodleConfig(GlobalDoodleConfig globalDoodleConfig) {
        this.globalDoodleConfig = globalDoodleConfig;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }
}
