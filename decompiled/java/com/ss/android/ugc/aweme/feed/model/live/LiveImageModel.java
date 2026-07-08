package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LiveImageModel implements Serializable {

    @C09CT("avg_color")
    public String avgColor;

    @C09CT("height")
    public int height;

    @C09CT("image_type")
    public int imageType;

    @C09CT("open_web_url")
    public String schema;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;

    public int hashCode() {
        return hash(this.avgColor, this.uri, this.urlList, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.uri)) {
            return true;
        }
        List<String> list = this.urlList;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getImageType() {
        return this.imageType;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public static int hash(Object... objArr) {
        int iHashCode;
        if (objArr == null) {
            return 0;
        }
        int i = 1;
        for (Object obj : objArr) {
            int i2 = i * 31;
            if (obj == null) {
                iHashCode = 0;
            } else {
                iHashCode = obj.hashCode();
            }
            i = i2 + iHashCode;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveImageModel liveImageModel = (LiveImageModel) obj;
        if (this.width == liveImageModel.width && this.height == liveImageModel.height && equals(this.avgColor, liveImageModel.avgColor) && equals(this.uri, liveImageModel.uri) && equals(this.urlList, liveImageModel.urlList)) {
            return true;
        }
        return false;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
