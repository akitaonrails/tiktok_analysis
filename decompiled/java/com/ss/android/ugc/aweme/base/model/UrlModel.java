package com.ss.android.ugc.aweme.base.model;

import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class UrlModel implements Serializable {

    @C09CT("player_access_key")
    public String aK;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("height")
    public int height;

    @C09CT("preview")
    public ImagePreviewModel previewModel;

    @C09CT("data_size")
    public long size;

    @C09CT("uri")
    public String uri;

    @C09CT("url_key")
    public String urlKey;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;

    public int hashCode() {
        String str = TextUtils.isEmpty(this.urlKey) ? this.uri : this.urlKey;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.urlList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public ImagePreviewModel getPreviewModel() {
        return this.previewModel;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public String getaK() {
        return this.aK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        String str = this.uri;
        if (str != null) {
            if (!str.equals(urlModel.uri)) {
                return false;
            }
        } else if (urlModel.uri != null) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 != null) {
            if (!str2.equals(urlModel.urlKey)) {
                return false;
            }
        } else if (urlModel.urlKey != null) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = urlModel.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setPreviewModel(ImagePreviewModel imagePreviewModel) {
        this.previewModel = imagePreviewModel;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setaK(String str) {
        this.aK = str;
    }
}
