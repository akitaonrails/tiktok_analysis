package com.ss.android.ugc.effectmanager.effect.model;

/* JADX INFO: loaded from: classes9.dex */
public final class AssetCondition {
    public final String aigc_task_id;
    public final String asset_id;
    public final Integer asset_type;
    public final String music_id;
    public final String panel_key;
    public final Long resource_id;

    public AssetCondition() {
        this(null, null, null, null, null, null);
    }

    public AssetCondition(String str, Long l, String str2, Integer num, String str3, String str4) {
        this.asset_id = str;
        this.resource_id = l;
        this.panel_key = str2;
        this.asset_type = num;
        this.aigc_task_id = str3;
        this.music_id = str4;
    }
}
