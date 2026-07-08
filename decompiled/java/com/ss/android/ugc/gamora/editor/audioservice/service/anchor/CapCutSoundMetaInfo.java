package com.ss.android.ugc.gamora.editor.audioservice.service.anchor;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CapCutSoundMetaInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public CapCutOriginalVolumeInfo originalVolumedata;

    public CapCutSoundMetaInfo() {
        this(null);
    }

    public CapCutSoundMetaInfo(CapCutOriginalVolumeInfo capCutOriginalVolumeInfo) {
        this.originalVolumedata = capCutOriginalVolumeInfo;
    }

    public final void setOriginalVolumedata(CapCutOriginalVolumeInfo capCutOriginalVolumeInfo) {
        this.originalVolumedata = capCutOriginalVolumeInfo;
    }
}
