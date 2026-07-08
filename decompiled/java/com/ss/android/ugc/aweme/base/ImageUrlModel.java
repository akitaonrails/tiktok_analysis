package com.ss.android.ugc.aweme.base;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ImageUrlModel implements Serializable {

    @C09CT("uri")
    public String mUri;

    @C09CT("url_list")
    public List<String> mUrls = new ArrayList();

    public boolean isEmpty() {
        List<String> list = this.mUrls;
        return list == null || list.isEmpty();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageUrlModel{mUri='");
        sbLIZ.append(this.mUri);
        sbLIZ.append('\'');
        sbLIZ.append(", mUrls=");
        sbLIZ.append(this.mUrls);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getUri() {
        return this.mUri;
    }

    public List<String> getUrls() {
        return this.mUrls;
    }

    public void setUri(String str) {
        this.mUri = str;
    }

    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public ImageUrlModel(String str, List<String> list) {
        this.mUri = str;
        if (list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    this.mUrls.add(str2);
                }
            }
        }
    }
}
