package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class IconConfig {
    public static final TypeAdapter ADAPTER = new IconConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("container_fixed_height")
    public int containerFixedHeight;

    @C09CT("file_name")
    public String fileName;

    @C09CT("channel")
    public String geckoChannel;

    @C09CT("real_height")
    public int height;

    @C09CT("need_download_files")
    public boolean needDownloadFiles;

    @C09CT("size_unit")
    public boolean useDpUnit;

    @C09CT("real_width")
    public int width;

    public IconConfig() {
        this("", false, "", 0, 0, true, 0);
    }

    public IconConfig(String str, boolean z, String str2, int i, int i2, boolean z2, int i3) {
        this.geckoChannel = str;
        this.needDownloadFiles = z;
        this.fileName = str2;
        this.height = i;
        this.width = i2;
        this.useDpUnit = z2;
        this.containerFixedHeight = i3;
    }
}
