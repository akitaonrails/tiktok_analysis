package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class SimUrlModel implements Serializable {

    @C09CT("player_access_key")
    public String aK;

    @C09CT("file_cs")
    public String fileCheckSum;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("height")
    public int height;
    public String logLabel;
    public String mdlVideoPath;
    public Object origin;

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

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public String getLogLabel() {
        return this.logLabel;
    }

    public String getMdlVideoPath() {
        return this.mdlVideoPath;
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
        if (!(obj instanceof SimUrlModel)) {
            return false;
        }
        SimUrlModel simUrlModel = (SimUrlModel) obj;
        String str = this.uri;
        if (str != null) {
            if (!str.equals(simUrlModel.uri)) {
                return false;
            }
        } else if (simUrlModel.uri != null) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 != null) {
            if (!str2.equals(simUrlModel.urlKey)) {
                return false;
            }
        } else if (simUrlModel.urlKey != null) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = simUrlModel.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLogLabel(String str) {
        this.logLabel = str;
    }

    public void setMdlVideoPath(String str) {
        this.mdlVideoPath = str;
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
