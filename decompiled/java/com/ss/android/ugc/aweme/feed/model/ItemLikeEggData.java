package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ItemLikeEggData implements Serializable {

    @C09CT("file_type")
    public String fileType;

    @C09CT("material_url")
    public String materialUrl;

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }
}
