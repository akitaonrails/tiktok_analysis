package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DspEntityInfo implements Serializable {

    @C09CT("dsp_entity_id")
    public String dspEntityId;

    @C09CT("platform")
    public Integer dspPlatform;

    @C09CT("identifier")
    public String identifier;

    @C09CT("source_entity_id")
    public String sourceEntityId;

    public DspEntityInfo() {
    }

    public DspEntityInfo(String str, String str2, Integer num, String str3) {
        this.identifier = str;
        this.dspEntityId = str2;
        this.dspPlatform = num;
        this.sourceEntityId = str3;
    }
}
