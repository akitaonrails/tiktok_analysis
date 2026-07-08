package com.bytedance.android.livesdk.model;

import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class ItemTab implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("inter_url")
    public String innerStreamUrl;

    @C09CT("name")
    public String name;

    @C09CT("style")
    public int style;

    @C09CT("url")
    public String url;

    public int getStyle() {
        int i = this.style;
        if (i < 1 || i > 4) {
            this.style = 2;
        }
        return this.style;
    }

    public boolean isItemValid() {
        return (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.url)) ? false : true;
    }

    public long getId() {
        return this.id;
    }

    public String getInnerStreamUrl() {
        return this.innerStreamUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
