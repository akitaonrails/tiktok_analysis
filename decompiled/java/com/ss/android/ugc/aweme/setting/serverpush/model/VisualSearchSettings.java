package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class VisualSearchSettings implements Serializable {

    @C09CT("allow_show_visual_tag")
    public final Boolean allowShowVisualTag;

    public VisualSearchSettings(Boolean bool) {
        this.allowShowVisualTag = bool;
    }
}
