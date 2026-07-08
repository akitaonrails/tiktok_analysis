package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class PhotoSearchRequestSizeModel {

    @C09CT("compression_config")
    public final Map<String, CompressionConfig> compressionConfig;

    @C09CT("enable")
    public final boolean enable;

    public PhotoSearchRequestSizeModel(boolean z, Map<String, CompressionConfig> map) {
        this.enable = z;
        this.compressionConfig = map;
    }
}
