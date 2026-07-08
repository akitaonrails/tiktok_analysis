package com.tiktok.strategycenter.bytedt;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class TTMStrategyCenterByteDTModelInfo {
    public final float loadTime;
    public final float maxDepth;
    public final int modelType;
    public final float nFeature;
    public final float treeRelation;
    public final float treeSize;

    public final TTMStrategyCenterByteDTModelType getModelType() {
        return TTMStrategyCenterByteDTModelType.parseFromIntVal(this.modelType);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMStrategyCenterByteDTModelInfo(modelType=");
        sbLIZ.append(getModelType());
        sbLIZ.append(", treeRelation=");
        sbLIZ.append(this.treeRelation);
        sbLIZ.append(", treeSize=");
        sbLIZ.append(this.treeSize);
        sbLIZ.append(", maxDepth=");
        sbLIZ.append(this.maxDepth);
        sbLIZ.append(", nFeature=");
        sbLIZ.append(this.nFeature);
        sbLIZ.append(", loadTime=");
        sbLIZ.append(this.loadTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final float getLoadTime() {
        return this.loadTime;
    }

    public final float getMaxDepth() {
        return this.maxDepth;
    }

    public final float getNFeature() {
        return this.nFeature;
    }

    public final float getTreeRelation() {
        return this.treeRelation;
    }

    public final float getTreeSize() {
        return this.treeSize;
    }

    public TTMStrategyCenterByteDTModelInfo(int i, float f, float f2, float f3, float f4, float f5) {
        this.modelType = i;
        this.treeRelation = f;
        this.treeSize = f2;
        this.maxDepth = f3;
        this.nFeature = f4;
        this.loadTime = f5;
    }
}
