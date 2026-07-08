package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEComposerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEComposerFilterParam> CREATOR = new C2325341G0m(36);
    public int action;
    public boolean autoDump;
    public int mode;
    public String[] nodePaths;
    public String[] oldNodePaths;
    public int orderType;
    public boolean saveInTheModel;
    public int status;
    public String[] tags;
    public String[] updateNodeKeys;
    public float[] updateNodeValues;

    private void reset() {
        this.mode = 0;
        this.orderType = 0;
        this.status = 0;
        this.action = 0;
        this.oldNodePaths = null;
        this.nodePaths = null;
        this.tags = null;
        this.updateNodeKeys = null;
        this.updateNodeValues = null;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isOverallComposer() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValid() {
        /*
            r5 = this;
            int r1 = r5.action
            r4 = 0
            r0 = 1
            if (r1 == r0) goto L60
            r0 = 4
            if (r1 == r0) goto L60
            r0 = 8
            if (r1 == r0) goto L4b
            r0 = 16
            if (r1 == r0) goto L60
            r0 = 32
            if (r1 == r0) goto L46
            r0 = 64
            if (r1 != r0) goto L6d
            java.lang.String[] r0 = r5.oldNodePaths
            if (r0 == 0) goto L29
            java.lang.String[] r1 = r5.nodePaths
            if (r1 == 0) goto L29
            java.lang.String[] r0 = r5.tags
            if (r0 == 0) goto L29
            int r1 = r1.length
            int r0 = r0.length
            if (r1 == r0) goto L6d
        L29:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isValid, action: "
            r1.append(r0)
            int r0 = r5.action
            r1.append(r0)
            java.lang.String r0 = ", param invalid"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "VEComposerFilterParam"
            X.C2484209oO.LIZJ(r0, r1)
            return r4
        L46:
            java.lang.String[] r0 = r5.nodePaths
            if (r0 != 0) goto L6d
            goto L29
        L4b:
            java.lang.String[] r0 = r5.nodePaths
            if (r0 == 0) goto L29
            java.lang.String[] r3 = r5.updateNodeKeys
            if (r3 == 0) goto L29
            float[] r2 = r5.updateNodeValues
            if (r2 == 0) goto L29
            int r1 = r0.length
            int r0 = r3.length
            if (r1 != r0) goto L29
            int r1 = r3.length
            int r0 = r2.length
            if (r1 == r0) goto L6d
            goto L29
        L60:
            java.lang.String[] r1 = r5.nodePaths
            if (r1 == 0) goto L29
            java.lang.String[] r0 = r5.tags
            if (r0 == 0) goto L29
            int r1 = r1.length
            int r0 = r0.length
            if (r1 == r0) goto L6d
            goto L29
        L6d:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.filterparam.VEComposerFilterParam.isValid():boolean");
    }

    public VEComposerFilterParam() {
        this.filterName = "composer filter";
        this.filterType = 18;
        this.filterDurationType = 1;
        reset();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEComposerFilterParam{mode=");
        sbLIZ.append(this.mode);
        sbLIZ.append(", orderType=");
        sbLIZ.append(this.orderType);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", action='");
        sbLIZ.append(this.action);
        sbLIZ.append('\'');
        sbLIZ.append(", oldNodePaths='");
        sbLIZ.append(this.oldNodePaths);
        sbLIZ.append('\'');
        sbLIZ.append(", nodePaths='");
        sbLIZ.append(this.nodePaths);
        sbLIZ.append('\'');
        sbLIZ.append(", tags='");
        sbLIZ.append(this.tags);
        sbLIZ.append('\'');
        sbLIZ.append(", updateNodekeys='");
        sbLIZ.append(this.updateNodeKeys);
        sbLIZ.append('\'');
        sbLIZ.append(", updateNodeValues='");
        sbLIZ.append(this.updateNodeValues);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEComposerFilterParam(Parcel parcel) {
        super(parcel);
        this.mode = parcel.readInt();
        this.orderType = parcel.readInt();
        this.action = parcel.readInt();
        parcel.readStringArray(this.oldNodePaths);
        parcel.readStringArray(this.nodePaths);
        parcel.readStringArray(this.tags);
        parcel.readStringArray(this.updateNodeKeys);
        parcel.readFloatArray(this.updateNodeValues);
    }

    public void removeComposerNodes(String[] strArr) {
        reset();
        this.action = 32;
        this.nodePaths = strArr;
    }

    public void appendComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 16;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void reloadComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 4;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void setComposerMode(int i, int i2) {
        reset();
        this.action = 2;
        this.mode = i;
        this.orderType = i2;
    }

    public void setComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 1;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.orderType);
        parcel.writeInt(this.action);
        parcel.writeStringArray(this.oldNodePaths);
        parcel.writeStringArray(this.nodePaths);
        parcel.writeStringArray(this.tags);
        parcel.writeStringArray(this.updateNodeKeys);
        parcel.writeFloatArray(this.updateNodeValues);
    }

    public void replaceComposerNodesWithTag(String[] strArr, String[] strArr2, String[] strArr3) {
        reset();
        this.action = 64;
        this.oldNodePaths = strArr;
        this.nodePaths = strArr2;
        this.tags = strArr3;
    }

    public void updateMultiComposerNodes(String[] strArr, String[] strArr2, float[] fArr) {
        reset();
        this.action = 8;
        this.nodePaths = strArr;
        this.updateNodeKeys = strArr2;
        this.updateNodeValues = fArr;
    }
}
