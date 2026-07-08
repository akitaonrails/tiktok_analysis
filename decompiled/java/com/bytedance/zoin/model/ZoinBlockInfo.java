package com.bytedance.zoin.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class ZoinBlockInfo {
    public long blockBeginOffset;
    public String blockCompressedName;
    public long blockEndOffset;
    public String blockName;
    public int totalDecompressedLength;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZoinBlockInfo{blockName='");
        sbLIZ.append(this.blockName);
        sbLIZ.append('\'');
        sbLIZ.append(", blockCompressedName='");
        sbLIZ.append(this.blockCompressedName);
        sbLIZ.append('\'');
        sbLIZ.append(", blockBeginOffset=");
        sbLIZ.append(this.blockBeginOffset);
        sbLIZ.append(", blockEndOffset=");
        sbLIZ.append(this.blockEndOffset);
        sbLIZ.append(", totalDecompressedLength=");
        sbLIZ.append(this.totalDecompressedLength);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
