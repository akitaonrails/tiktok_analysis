package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CommercialVideoInfo implements Serializable {

    @C09CT("ibe_infos")
    public List<IBEInfo> ibeInfos;

    @C09CT("ibe_metadata")
    public InteractiveBrandedEffectInfo ibeMetaInfo;

    @C09CT("mission_info")
    public final MissionInfo missionInfo;

    public final List<IBEInfo> getIbeInfos() {
        return this.ibeInfos;
    }

    public final InteractiveBrandedEffectInfo getIbeMetaInfo() {
        return this.ibeMetaInfo;
    }

    public final MissionInfo getMissionInfo() {
        return this.missionInfo;
    }

    public final void setIbeInfos(List<IBEInfo> list) {
        this.ibeInfos = list;
    }

    public final void setIbeMetaInfo(InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        this.ibeMetaInfo = interactiveBrandedEffectInfo;
    }
}
