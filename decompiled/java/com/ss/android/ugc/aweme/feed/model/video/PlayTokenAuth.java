package com.ss.android.ugc.aweme.feed.model.video;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayTokenAuth implements Serializable {

    @C09CT("auth")
    public String auth;
    public int hostIndex;

    @C09CT("hosts")
    public List<String> hosts;

    @C09CT("token")
    public String token;

    @C09CT("version")
    public Integer version;

    @C09CT("vid")
    public String vid;

    public final void resetHostIndex() {
        this.hostIndex = 0;
    }

    public final int getVersionN() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final String tryGetHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size()) {
            return null;
        }
        return (String) ListProtector.get(this.hosts, this.hostIndex);
    }

    public final boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size() - 1) {
            return false;
        }
        this.hostIndex++;
        return true;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final int getHostIndex() {
        return this.hostIndex;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void setAuth(String str) {
        this.auth = str;
    }

    public final void setHostIndex(int i) {
        this.hostIndex = i;
    }

    public final void setHosts(List<String> list) {
        this.hosts = list;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }

    public final void setVersionN(int i) {
        this.version = Integer.valueOf(i);
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}
