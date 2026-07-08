package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ImagePreviewModel implements Serializable {

    @C09CT("data")
    public String data;

    @C09CT("preview_type")
    public int previewType;

    public String getData() {
        return this.data;
    }

    public int getPreviewType() {
        return this.previewType;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setPreviewType(int i) {
        this.previewType = i;
    }
}
