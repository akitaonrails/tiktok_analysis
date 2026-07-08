package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateTabTemplateRectUriSettingsData {

    @C09CT("enable_extra_uri")
    public final boolean enable;

    @C09CT("extra_uri_key")
    public final String keyOfExtra;

    public CreateTabTemplateRectUriSettingsData() {
        this(true, "template_rect_uri");
    }

    public CreateTabTemplateRectUriSettingsData(boolean z, String str) {
        this.enable = z;
        this.keyOfExtra = str;
    }
}
