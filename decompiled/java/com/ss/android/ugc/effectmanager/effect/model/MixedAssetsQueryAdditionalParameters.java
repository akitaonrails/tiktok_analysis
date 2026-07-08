package com.ss.android.ugc.effectmanager.effect.model;

import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public final class MixedAssetsQueryAdditionalParameters {
    public final String category_key;
    public final String creation_id;
    public final Pair<String, String> feature_list;
    public final boolean forceApiUpgrade;
    public final String panel_key;
    public final String protocol_version;
    public final String scene;
    public final boolean skipApiUpgrade;
    public final String subScene;

    public MixedAssetsQueryAdditionalParameters(Pair<String, String> pair, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        this.feature_list = pair;
        this.protocol_version = str;
        this.creation_id = str2;
        this.panel_key = str3;
        this.category_key = str4;
        this.skipApiUpgrade = z;
        this.scene = str5;
        this.subScene = str6;
        this.forceApiUpgrade = z2;
    }
}
