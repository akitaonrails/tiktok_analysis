package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ResourceConfig {
    public static final TypeAdapter ADAPTER = new ResourceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("channel")
    public String channel;

    @C09CT("zip_file_name")
    public String fileName;

    @C09CT("need_download_files")
    public boolean needDownloadFiles;

    @C09CT("type")
    public int type;

    public ResourceConfig() {
        this(0, "", "", false);
    }

    public ResourceConfig(int i, String str, String str2, boolean z) {
        this.type = i;
        this.fileName = str;
        this.channel = str2;
        this.needDownloadFiles = z;
    }
}
