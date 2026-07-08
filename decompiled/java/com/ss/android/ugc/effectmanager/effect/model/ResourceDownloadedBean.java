package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ResourceDownloadedBean implements Serializable {
    public String localFilePath;
    public ResourceListModel.ResourceListBean resourceBean;

    public ResourceDownloadedBean() {
        this(new ResourceListModel.ResourceListBean(null, null, null), "");
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public final void setResourceBean(ResourceListModel.ResourceListBean resourceListBean) {
        this.resourceBean = resourceListBean;
    }

    public ResourceDownloadedBean(ResourceListModel.ResourceListBean resourceListBean, String str) {
        this.resourceBean = resourceListBean;
        this.localFilePath = str;
    }
}
