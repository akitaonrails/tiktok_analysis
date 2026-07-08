package com.ss.android.ugc.gamora.editor.audioservice.service.anchor;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CapCutOriginalVolumeInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("original_volume")
    public Integer capCutOriginalVolume;

    @C09CT("music_volume")
    public Integer capCutmusicVolume;

    public CapCutOriginalVolumeInfo() {
        this(0, 0);
    }

    public final void setCapCutOriginalVolume(Integer num) {
        this.capCutOriginalVolume = num;
    }

    public final void setCapCutmusicVolume(Integer num) {
        this.capCutmusicVolume = num;
    }

    public CapCutOriginalVolumeInfo(Integer num, Integer num2) {
        this.capCutOriginalVolume = num;
        this.capCutmusicVolume = num2;
    }
}
