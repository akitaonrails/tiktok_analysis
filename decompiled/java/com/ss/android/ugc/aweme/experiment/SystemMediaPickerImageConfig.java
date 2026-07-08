package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SystemMediaPickerImageConfig {

    @C09CT("support_mime_types")
    public final List<String> supportMimeTyps;

    public SystemMediaPickerImageConfig() {
        this(C1697810uHb.LJIIJJI("image/jpeg", "image/gif", "image/png", "image/tiff", "image/jp2", "image/jpx"));
    }

    public SystemMediaPickerImageConfig(List<String> list) {
        this.supportMimeTyps = list;
    }
}
