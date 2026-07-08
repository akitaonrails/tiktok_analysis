package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ShortTouchItem implements Serializable {

    @C09CT("activity_id")
    public String activityId = "";

    @C09CT("anime_type")
    public int animeType;

    @C09CT("fc_second")
    public long fcSecond;

    @C09CT("height")
    public long height;

    @C09CT("icon_skin")
    public String iconSkin;

    @C09CT("left_margin")
    public long leftMargin;

    @C09CT("name")
    public String name;

    @C09CT("preview_setting")
    public ShortTouchPreviewSetting previewSetting;

    @C09CT("schema")
    public String schema;

    @C09CT("top_margin")
    public long topMargin;

    @C09CT("width")
    public long width;

    public long getFcSecond() {
        return this.fcSecond;
    }

    public long getHeight() {
        return this.height;
    }

    public long getLeftMargin() {
        return this.leftMargin;
    }

    public String getName() {
        return this.name;
    }

    public ShortTouchPreviewSetting getPreviewSetting() {
        return this.previewSetting;
    }

    public String getSchema() {
        return this.schema;
    }

    public long getTopMargin() {
        return this.topMargin;
    }

    public long getWidth() {
        return this.width;
    }

    public void setFcSecond(long j) {
        this.fcSecond = j;
    }

    public void setHeight(long j) {
        this.height = j;
    }

    public void setLeftMargin(long j) {
        this.leftMargin = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreviewSetting(ShortTouchPreviewSetting shortTouchPreviewSetting) {
        this.previewSetting = shortTouchPreviewSetting;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTopMargin(long j) {
        this.topMargin = j;
    }

    public void setWidth(long j) {
        this.width = j;
    }
}
