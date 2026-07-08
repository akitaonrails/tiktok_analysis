package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AdQuestionnaire implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("schema")
    public String schema;

    @C09CT("show_interval")
    public Integer showInterval;

    public AdQuestionnaire() {
        this(0, null, null, null, null);
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowInterval(Integer num) {
        this.showInterval = num;
    }

    public AdQuestionnaire(int i, String str, Integer num, String str2, List<String> list) {
        this.id = i;
        this.content = str;
        this.showInterval = num;
        this.schema = str2;
        this.geckoChannel = list;
    }
}
