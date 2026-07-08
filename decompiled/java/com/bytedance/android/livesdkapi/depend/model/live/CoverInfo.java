package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CoverInfo {

    @C09CT("height")
    public Long height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Long width;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.urlList;
        if (list != null && !list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.urlList);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        sb.replace(0, 2, "CoverInfo{");
        sb.append('}');
        return sb.toString();
    }
}
