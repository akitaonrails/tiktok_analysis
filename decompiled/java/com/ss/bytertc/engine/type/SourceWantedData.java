package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalSourceWantedData;

/* JADX INFO: loaded from: classes21.dex */
public class SourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceWantedData{width='");
        sbLIZ.append(this.width);
        sbLIZ.append('\'');
        sbLIZ.append(", height='");
        sbLIZ.append(this.height);
        sbLIZ.append('\'');
        sbLIZ.append(", frameRate='");
        sbLIZ.append(this.frameRate);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SourceWantedData() {
    }

    public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
        this.width = internalSourceWantedData.width;
        this.height = internalSourceWantedData.height;
        this.frameRate = internalSourceWantedData.frameRate;
    }
}
