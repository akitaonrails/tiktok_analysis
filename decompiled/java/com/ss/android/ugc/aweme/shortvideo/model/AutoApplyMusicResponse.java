package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoApplyMusicResponse extends BaseResponse {

    @C09CT("extra_params")
    public String extraParams;

    @C09CT("need_auto_apply_music")
    public Boolean needAutoApplyMusic;

    public AutoApplyMusicResponse() {
        this(null, null);
    }

    public final AutoApplyMusicResponse copy(Boolean bool, String str) {
        return new AutoApplyMusicResponse(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoApplyMusicResponse)) {
            return false;
        }
        AutoApplyMusicResponse autoApplyMusicResponse = (AutoApplyMusicResponse) obj;
        return Intrinsics.LJFF(this.needAutoApplyMusic, autoApplyMusicResponse.needAutoApplyMusic) && Intrinsics.LJFF(this.extraParams, autoApplyMusicResponse.extraParams);
    }

    public int hashCode() {
        Boolean bool = this.needAutoApplyMusic;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.extraParams;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoApplyMusicResponse(needAutoApplyMusic=");
        sbLIZ.append(this.needAutoApplyMusic);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getExtraParams() {
        return this.extraParams;
    }

    public final Boolean getNeedAutoApplyMusic() {
        return this.needAutoApplyMusic;
    }

    public final void setExtraParams(String str) {
        this.extraParams = str;
    }

    public final void setNeedAutoApplyMusic(Boolean bool) {
        this.needAutoApplyMusic = bool;
    }

    public AutoApplyMusicResponse(Boolean bool, String str) {
        this.needAutoApplyMusic = bool;
        this.extraParams = str;
    }
}
