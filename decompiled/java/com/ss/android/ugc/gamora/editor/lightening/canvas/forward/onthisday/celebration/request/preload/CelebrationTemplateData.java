package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload;

import X.C09CT;
import com.ss.android.ugc.aweme.story.celebration.CelebrationTemplateInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationTemplateData implements Serializable {
    public static final int $stable = 8;

    @C09CT("template_info_map")
    public List<CelebrationTemplateInfo> templateInfo;

    public CelebrationTemplateData() {
        this(null);
    }

    public CelebrationTemplateData(List<CelebrationTemplateInfo> list) {
        this.templateInfo = list;
    }

    public final void setTemplateInfo(List<CelebrationTemplateInfo> list) {
        this.templateInfo = list;
    }
}
