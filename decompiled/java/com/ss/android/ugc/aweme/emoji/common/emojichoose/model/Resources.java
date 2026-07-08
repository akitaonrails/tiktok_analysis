package com.ss.android.ugc.aweme.emoji.common.emojichoose.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public class Resources implements Serializable {
    public int LL;
    public String LLILLJJLI;

    @C09CT("display_name")
    public String displayName;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("resource_url")
    public String resourceUrl;

    @C09CT("version")
    public String version;

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.id;
    }

    public int getOptional() {
        return this.LL;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getType() {
        return this.LLILLJJLI;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Resources) || this.id != ((Resources) obj).getId()) {
            return false;
        }
        return true;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setOptional(int i) {
        this.LL = i;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setType(String str) {
        this.LLILLJJLI = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
