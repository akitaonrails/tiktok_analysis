package com.bytedance.geckox.sync.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class SyncDownloadChanelModel {

    @C09CT("channel")
    public String channel;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("md5")
    public String md5;

    @C09CT("package_type")
    public int packageType;

    @C09CT("size")
    public long size;

    @C09CT("url")
    public SyncChannelUrlModel url;

    @C09CT("version")
    public long version;

    public static class SyncChannelUrlModel {

        @C09CT("domains")
        public List<String> domains;

        @C09CT("scheme")
        public String scheme;

        @C09CT("uri")
        public String uri;

        public List<String> getDomains() {
            return this.domains;
        }

        public String getScheme() {
            return this.scheme;
        }

        public String getUri() {
            return this.uri;
        }

        public void setDomains(List<String> list) {
            this.domains = list;
        }

        public void setScheme(String str) {
            this.scheme = str;
        }

        public void setUri(String str) {
            this.uri = str;
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public long getId() {
        return this.id;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public long getSize() {
        return this.size;
    }

    public SyncChannelUrlModel getUrl() {
        return this.url;
    }

    public long getVersion() {
        return this.version;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUrl(SyncChannelUrlModel syncChannelUrlModel) {
        this.url = syncChannelUrlModel;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
