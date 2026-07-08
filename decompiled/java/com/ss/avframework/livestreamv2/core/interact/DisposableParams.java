package com.ss.avframework.livestreamv2.core.interact;

import X.C2188811AlT;
import com.ss.lyrax.transcoder.LyraxTranscoderLayoutRegionConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class DisposableParams {
    public String LIZ;
    public List<LyraxTranscoderLayoutRegionConfig> LIZIZ;
    public JSONObject LIZJ;
    public Integer LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisposableParams{effectID='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", regionsBeforeEffect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getEffectID() {
        return this.LIZ;
    }

    public JSONObject getExtraParams() {
        return this.LIZJ;
    }

    public Integer getFps() {
        return this.LIZLLL;
    }

    public List<LyraxTranscoderLayoutRegionConfig> getRegionsBeforeEffect() {
        return this.LIZIZ;
    }
}
