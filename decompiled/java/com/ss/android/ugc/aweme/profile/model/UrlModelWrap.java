package com.ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class UrlModelWrap implements Serializable {
    public int position;
    public UrlModel urlModel;

    public String toJsonString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    public int getPosition() {
        return this.position;
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public static UrlModelWrap fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (UrlModelWrap) GsonProtectorUtils.fromJson(new Gson(), str, UrlModelWrap.class);
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUrlModel(UrlModel urlModel) {
        this.urlModel = urlModel;
    }

    public UrlModelWrap(int i, UrlModel urlModel) {
        this.position = i;
        this.urlModel = urlModel;
    }
}
