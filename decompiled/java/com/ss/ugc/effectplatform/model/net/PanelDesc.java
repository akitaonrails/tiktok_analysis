package com.ss.ugc.effectplatform.model.net;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PanelDesc implements Serializable {
    public String extra;
    public UrlModel icon;
    public List<String> tags;
    public String tags_updated_at;
    public String text;

    public PanelDesc() {
        this(null, null, null, null, null);
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public PanelDesc(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        this.text = str;
        this.icon = urlModel;
        this.tags_updated_at = str2;
        this.extra = str3;
        this.tags = list;
    }
}
