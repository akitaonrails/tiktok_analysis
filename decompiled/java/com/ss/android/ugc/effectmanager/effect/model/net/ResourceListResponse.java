package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* JADX INFO: loaded from: classes23.dex */
public class ResourceListResponse extends BaseNetResponse {
    public ResourceListModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        return (resourceListModel == null || resourceListModel.getResourceList() == null) ? false : true;
    }

    public ResourceListModel getData() {
        return this.data;
    }

    public void setData(ResourceListModel resourceListModel) {
        this.data = resourceListModel;
    }
}
