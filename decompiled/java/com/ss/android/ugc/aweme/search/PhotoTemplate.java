package com.ss.android.ugc.aweme.search;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PhotoTemplate implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    @C09CT("use_count")
    public int useCount;

    public List<String> children() {
        return null;
    }

    public boolean isCombine() {
        return false;
    }

    public String desc() {
        return this.desc;
    }

    public UrlModel icon() {
        return this.icon;
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }
}
