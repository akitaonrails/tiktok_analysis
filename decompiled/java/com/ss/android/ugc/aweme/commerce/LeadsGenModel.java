package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class LeadsGenModel implements Serializable {

    @C09CT("action_name")
    public String actionName;

    @C09CT("business_data")
    public String businessData;

    @C09CT("has_leads_gen")
    public boolean hasLeadsGen;

    @C09CT("page_id")
    public long pageId;

    @C09CT("page_name")
    public String pageName;

    @C09CT("schema_url")
    public String schema;

    public final String getActionName() {
        return this.actionName;
    }

    public final String getBusinessData() {
        return this.businessData;
    }

    public final boolean getHasLeadsGen() {
        return this.hasLeadsGen;
    }

    public final long getPageId() {
        return this.pageId;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final void setBusinessData(String str) {
        this.businessData = str;
    }

    public final void setHasLeadsGen(boolean z) {
        this.hasLeadsGen = z;
    }

    public final void setPageId(long j) {
        this.pageId = j;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
