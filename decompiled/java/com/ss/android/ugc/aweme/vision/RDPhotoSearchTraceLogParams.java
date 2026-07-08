package com.ss.android.ugc.aweme.vision;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class RDPhotoSearchTraceLogParams implements Serializable {

    @C09CT("client_process")
    public Long clientProcess;

    @C09CT("data_get")
    public Long dataGet;

    @C09CT("image_compress_cost")
    public Long imageCompressCost;

    @C09CT("image_load_cost")
    public Long imageLoadCost;

    @C09CT("prepare")
    public Long prepare;

    @C09CT("prepare_router_cost")
    public Long prepareRouterCost;

    @C09CT("request_network_cost")
    public Long requestNetworkCost;

    @C09CT("response_network_cost")
    public Long responseNetworkCost;

    @C09CT("root_enter_from_type")
    public String rootEnterFromType;

    public RDPhotoSearchTraceLogParams() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final void setClientProcess(Long l) {
        this.clientProcess = l;
    }

    public final void setDataGet(Long l) {
        this.dataGet = l;
    }

    public final void setImageCompressCost(Long l) {
        this.imageCompressCost = l;
    }

    public final void setImageLoadCost(Long l) {
        this.imageLoadCost = l;
    }

    public final void setPrepare(Long l) {
        this.prepare = l;
    }

    public final void setPrepareRouterCost(Long l) {
        this.prepareRouterCost = l;
    }

    public final void setRequestNetworkCost(Long l) {
        this.requestNetworkCost = l;
    }

    public final void setResponseNetworkCost(Long l) {
        this.responseNetworkCost = l;
    }

    public final void setRootEnterFromType(String str) {
        this.rootEnterFromType = str;
    }

    public RDPhotoSearchTraceLogParams(String str, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
        this.rootEnterFromType = str;
        this.prepare = l;
        this.imageLoadCost = l2;
        this.imageCompressCost = l3;
        this.prepareRouterCost = l4;
        this.dataGet = l5;
        this.clientProcess = l6;
        this.requestNetworkCost = l7;
        this.responseNetworkCost = l8;
    }
}
