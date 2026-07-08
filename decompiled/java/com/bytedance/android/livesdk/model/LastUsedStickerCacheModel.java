package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.EnumC767810U9z;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LastUsedStickerCacheModel {

    @C09CT("account_type")
    public int accountType;

    @C09CT("category_id")
    public String categoryId;

    @C09CT("effect_id")
    public long effectId;

    @C09CT("md5")
    public List<String> md5;

    @C09CT("photo_file_path")
    public String photoFilePath;

    @C09CT("photo_key")
    public String photoKey;

    @C09CT("photo_path")
    public String photoPath;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("sticker_type")
    public EnumC767810U9z stickerType;

    @C09CT("sub_resource_id")
    public String subResourceId;

    @C09CT("update_time")
    public long updateTime;

    public LastUsedStickerCacheModel() {
        this(EnumC767810U9z.NORMAL, "", 0L, "", "", "", "", 0L, -1, null, null);
    }

    public final String toString() {
        return "LastUsedStickerCacheModel(stickerType=" + this.stickerType + ", resourceId=" + this.resourceId + ", effectId=" + this.effectId + ", categoryId=" + this.categoryId + ", subResourceId=" + this.subResourceId + ", photoKey=" + this.photoKey + ", photoPath=" + this.photoPath + ", updateTime=" + this.updateTime + ", accountType=" + this.accountType + ", md5=" + this.md5 + ", photoFilePath=" + this.photoFilePath + ')';
    }

    public final void LIZ() {
        this.stickerType = EnumC767810U9z.NORMAL;
        this.resourceId = "";
        this.effectId = 0L;
        this.categoryId = "";
        this.subResourceId = "";
        this.photoKey = "";
        this.photoPath = "";
        this.updateTime = 0L;
        this.accountType = -1;
        this.md5 = null;
        this.photoFilePath = null;
    }

    public LastUsedStickerCacheModel(EnumC767810U9z enumC767810U9z, String str, long j, String str2, String str3, String str4, String str5, long j2, int i, List<String> list, String str6) {
        this.stickerType = enumC767810U9z;
        this.resourceId = str;
        this.effectId = j;
        this.categoryId = str2;
        this.subResourceId = str3;
        this.photoKey = str4;
        this.photoPath = str5;
        this.updateTime = j2;
        this.accountType = i;
        this.md5 = list;
        this.photoFilePath = str6;
    }
}
