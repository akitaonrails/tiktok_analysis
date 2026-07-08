package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ForceVideo implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public String[] urlList;

    @C09CT("width")
    public int width;

    public ForceVideo() {
        this(0, 0, "", null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForceVideo(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(Arrays.toString(this.urlList));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(String[] strArr) {
        this.urlList = strArr;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ForceVideo(int i, int i2, String str, String[] strArr) {
        this.height = i;
        this.width = i2;
        this.uri = str;
        this.urlList = strArr;
    }
}
