package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DownloadableModelResponse extends C13OE<Data> implements Serializable {
    public Data data;
    public String message;
    public int status_code;

    public DownloadableModelResponse() {
        this(null, null, 0);
    }

    public final DownloadableModelResponse copy(Data data, String str, int i) {
        return new DownloadableModelResponse(data, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponse)) {
            return false;
        }
        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) obj;
        return Intrinsics.LJFF(this.data, downloadableModelResponse.data) && Intrinsics.LJFF(this.message, downloadableModelResponse.message) && this.status_code == downloadableModelResponse.status_code;
    }

    public int hashCode() {
        Data data = this.data;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadableModelResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
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
        return this.data;
    }

    public static final class Data implements Serializable {
        public Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        public Data() {
            this(null);
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }
    }

    public final void setData(Data data) {
        this.data = data;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public DownloadableModelResponse(Data data, String str, int i) {
        this.data = data;
        this.message = str;
        this.status_code = i;
    }
}
