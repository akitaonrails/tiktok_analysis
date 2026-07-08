package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.common.model.ModelV2;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DownloadableModelResponseV2 extends C13OE<Data> implements Serializable {
    public String message;
    public Data model_info;
    public int status_code;

    public DownloadableModelResponseV2() {
        this(null, null, 0);
    }

    public final DownloadableModelResponseV2 copy(Data data, String str, int i) {
        return new DownloadableModelResponseV2(data, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponseV2)) {
            return false;
        }
        DownloadableModelResponseV2 downloadableModelResponseV2 = (DownloadableModelResponseV2) obj;
        return Intrinsics.LJFF(this.model_info, downloadableModelResponseV2.model_info) && Intrinsics.LJFF(this.message, downloadableModelResponseV2.message) && this.status_code == downloadableModelResponseV2.status_code;
    }

    public int hashCode() {
        Data data = this.model_info;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadableModelResponseV2(model_info=");
        sbLIZ.append(this.model_info);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Data getModel_info() {
        return this.model_info;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public Data getResponseData() {
        return this.model_info;
    }

    public static final class Data implements Serializable {
        public List<? extends ModelV2> models;
        public List<String> signature_url_prefix;
        public List<String> url_prefix;
        public String url_suffix;

        public Data() {
            this(null, null, "", null);
        }

        public final void setModels(List<? extends ModelV2> list) {
            this.models = list;
        }

        public final void setSignature_url_prefix(List<String> list) {
            this.signature_url_prefix = list;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public final void setUrl_suffix(String str) {
            this.url_suffix = str;
        }

        public Data(List<? extends ModelV2> list, List<String> list2, String str, List<String> list3) {
            this.models = list;
            this.url_prefix = list2;
            this.url_suffix = str;
            this.signature_url_prefix = list3;
        }
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setModel_info(Data data) {
        this.model_info = data;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public DownloadableModelResponseV2(Data data, String str, int i) {
        this.model_info = data;
        this.message = str;
        this.status_code = i;
    }
}
