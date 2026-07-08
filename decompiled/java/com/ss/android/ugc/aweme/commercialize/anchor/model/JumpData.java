package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class JumpData implements Serializable {

    @C09CT("access_key_type")
    public Integer akType;

    @C09CT("business_data")
    public BusinessData businessData;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("page_data")
    public PageData pageData;

    @C09CT("router_data")
    public String routerData;

    @C09CT("use_commerce_router")
    public Boolean useCRouter;

    public final Integer getAkType() {
        return this.akType;
    }

    public final BusinessData getBusinessData() {
        return this.businessData;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final PageData getPageData() {
        return this.pageData;
    }

    public final String getRouterData() {
        return this.routerData;
    }

    public final Boolean getUseCRouter() {
        return this.useCRouter;
    }

    public final void setAkType(Integer num) {
        this.akType = num;
    }

    public final void setBusinessData(BusinessData businessData) {
        this.businessData = businessData;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setPageData(PageData pageData) {
        this.pageData = pageData;
    }

    public final void setRouterData(String str) {
        this.routerData = str;
    }

    public final void setUseCRouter(Boolean bool) {
        this.useCRouter = bool;
    }
}
