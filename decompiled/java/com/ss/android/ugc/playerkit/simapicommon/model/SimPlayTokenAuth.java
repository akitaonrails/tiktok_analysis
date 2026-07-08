package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class SimPlayTokenAuth implements Serializable {
    public int LL;

    @C09CT("auth")
    public String auth;

    @C09CT("hosts")
    public List<String> hosts;
    public Object origin;

    @C09CT("token")
    public String token;

    @C09CT("version")
    public Integer version;

    @C09CT("vid")
    public String vid;

    public void resetHostIndex() {
        this.LL = 0;
    }

    public int getVersion() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.vid) || !TextUtils.isEmpty(this.auth) || !TextUtils.isEmpty(this.token)) {
            return true;
        }
        List<String> list = this.hosts;
        return (list == null || list.size() == 0) ? false : true;
    }

    public String tryGetHost() {
        List<String> list = this.hosts;
        if (list == null || this.LL >= list.size()) {
            return null;
        }
        return (String) ListProtector.get(this.hosts, this.LL);
    }

    public boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list == null || this.LL >= list.size() - 1) {
            return false;
        }
        this.LL++;
        return true;
    }

    public String getAuth() {
        return this.auth;
    }

    public int getHostIndex() {
        return this.LL;
    }

    public List<String> getHosts() {
        return this.hosts;
    }

    public String getToken() {
        return this.token;
    }

    public String getVid() {
        return this.vid;
    }

    public void setAuth(String str) {
        this.auth = str;
    }

    public void setHostIndex(int i) {
        this.LL = i;
    }

    public void setHosts(List<String> list) {
        this.hosts = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVersion(int i) {
        this.version = Integer.valueOf(i);
    }

    public void setVid(String str) {
        this.vid = str;
    }
}
