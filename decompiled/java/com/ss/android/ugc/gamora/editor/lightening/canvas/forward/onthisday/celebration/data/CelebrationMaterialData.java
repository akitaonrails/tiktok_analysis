package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationMaterialData implements Serializable {
    public static final int $stable = 8;

    @C09CT("server_material_list")
    public List<ForwardMedia> forwardMediaList;

    public CelebrationMaterialData() {
        this(null);
    }

    public final List<ForwardMedia> getForwardMediaList() {
        return this.forwardMediaList;
    }

    public CelebrationMaterialData(List<ForwardMedia> list) {
        this.forwardMediaList = list;
    }

    public final void setForwardMediaList(List<ForwardMedia> list) {
        this.forwardMediaList = list;
    }
}
