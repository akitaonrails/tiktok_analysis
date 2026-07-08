package com.ss.android.ugc.effectmanager.common.model;

import X.C0UER;
import X.C0UES;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public class ModelInfo implements Serializable {
    public String _name;
    public List<ModelInfo> demotion_list;
    public ExtendedUrlModel file_url;
    public int level;
    public String model_type;
    public String name;
    public String name_sec;
    public ExtendedUrlModel signature_file_url;
    public int status;
    public long totalSize;
    public int type;
    public String version;

    public ModelInfo() {
        this("", "", "", null, 0L, 0, 1, 0, null, null, "");
    }

    public String getName() {
        String strDecrypt;
        if (a0.LJJJIL(this._name) && (!a0.LJJJIL(getName_sec()))) {
            C0UES c0ues = C0UER.LIZ;
            if (c0ues == null || (strDecrypt = c0ues.decrypt(getName_sec())) == null) {
                strDecrypt = "";
            }
            this._name = strDecrypt;
        }
        return a0.LJJJIL(this._name) ? this.name : this._name;
    }

    public ExtendedUrlModel getFileUrl() {
        return getFile_url();
    }

    public final String getMD5() {
        ExtendedUrlModel file_url = getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelInfo(name=");
        sbLIZ.append(getName());
        sbLIZ.append(", version=");
        sbLIZ.append(getVersion());
        sbLIZ.append(", type=");
        sbLIZ.append(getType());
        sbLIZ.append(", totalSize=");
        sbLIZ.append(getTotalSize());
        sbLIZ.append(", fileUri=");
        ExtendedUrlModel file_url = getFile_url();
        sbLIZ.append(file_url != null ? file_url.getUri() : null);
        sbLIZ.append(", signatureUri=");
        ExtendedUrlModel signature_file_url = getSignature_file_url();
        sbLIZ.append(signature_file_url != null ? signature_file_url.getUri() : null);
        sbLIZ.append(", modelType=");
        sbLIZ.append(getModel_type());
        sbLIZ.append(", status=");
        sbLIZ.append(getStatus());
        sbLIZ.append(", level=");
        sbLIZ.append(getLevel());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public List<ModelInfo> getDemotion_list() {
        return this.demotion_list;
    }

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public int getLevel() {
        return this.level;
    }

    public String getModel_type() {
        return this.model_type;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public ExtendedUrlModel getSignature_file_url() {
        return this.signature_file_url;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDemotion_list(List<ModelInfo> list) {
        this.demotion_list = list;
    }

    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        setFile_url(extendedUrlModel);
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setModel_type(String str) {
        this.model_type = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_sec(String str) {
        this.name_sec = str;
    }

    public void setSignature_file_url(ExtendedUrlModel extendedUrlModel) {
        this.signature_file_url = extendedUrlModel;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2, int i3, List<ModelInfo> list, ExtendedUrlModel extendedUrlModel2, String str4) {
        this._name = str;
        this.name_sec = str2;
        this.version = str3;
        this.file_url = extendedUrlModel;
        this.totalSize = j;
        this.type = i;
        this.status = i2;
        this.level = i3;
        this.demotion_list = list;
        this.signature_file_url = extendedUrlModel2;
        this.model_type = str4;
        this.name = "";
    }
}
