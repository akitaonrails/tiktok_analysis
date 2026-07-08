package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class BusinessGoodsPublishModel {
    public String draftId;
    public String title;
    public String videoPath;

    public int hashCode() {
        String str = this.videoPath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toJsonString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    public String getDraftId() {
        return this.draftId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public static BusinessGoodsPublishModel toObj(String str) {
        return (BusinessGoodsPublishModel) GsonProtectorUtils.fromJson(new Gson(), str, BusinessGoodsPublishModel.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.videoPath, ((BusinessGoodsPublishModel) obj).videoPath);
        }
        return false;
    }

    public void setDraftId(String str) {
        this.draftId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public BusinessGoodsPublishModel(String str, String str2) {
        this.draftId = str;
        this.title = str2;
    }

    public BusinessGoodsPublishModel(String str, String str2, String str3) {
        this.draftId = str;
        this.title = str2;
        this.videoPath = str3;
    }
}
