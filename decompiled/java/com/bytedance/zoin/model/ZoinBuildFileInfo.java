package com.bytedance.zoin.model;

import X.C2188811AlT;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class ZoinBuildFileInfo implements Comparable<ZoinBuildFileInfo> {
    public int alignedFileLength;
    public int beginOffset;
    public long checkNumber;
    public String compressedName;
    public String decompressPath;
    public int endOffset;
    public int fileLength;
    public String name;
    public LinkedList<String> neededDeps = new LinkedList<>();
    public int offsetInFile;
    public String relativePath;

    public int getFileBlockLength() {
        return this.endOffset - this.beginOffset;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.checkNumber;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZoinBuildFileInfo{name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", checkNumber=");
        sbLIZ.append(this.checkNumber);
        sbLIZ.append(", fileLength=");
        sbLIZ.append(this.fileLength);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoinBuildFileInfo)) {
            return false;
        }
        ZoinBuildFileInfo zoinBuildFileInfo = (ZoinBuildFileInfo) obj;
        if (this.checkNumber != zoinBuildFileInfo.checkNumber) {
            return false;
        }
        String str = this.name;
        String str2 = zoinBuildFileInfo.name;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoinBuildFileInfo zoinBuildFileInfo) {
        return this.beginOffset - zoinBuildFileInfo.beginOffset;
    }
}
