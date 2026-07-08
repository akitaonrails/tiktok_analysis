package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ScanQRCodeResponse extends C13OE<DataNode> implements Serializable {
    public DataNode data;
    public String message;
    public int status_code;

    public ScanQRCodeResponse() {
        this(null, null, 0);
    }

    public final ScanQRCodeResponse copy(DataNode dataNode, String str, int i) {
        return new ScanQRCodeResponse(dataNode, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanQRCodeResponse)) {
            return false;
        }
        ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) obj;
        return Intrinsics.LJFF(this.data, scanQRCodeResponse.data) && Intrinsics.LJFF(this.message, scanQRCodeResponse.message) && this.status_code == scanQRCodeResponse.status_code;
    }

    public int hashCode() {
        DataNode dataNode = this.data;
        int iHashCode = (dataNode == null ? 0 : dataNode.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanQRCodeResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        DataNode dataNode = this.data;
        return (dataNode == null || dataNode.effect == null) ? false : true;
    }

    public final DataNode getData() {
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
    public DataNode getResponseData() {
        return this.data;
    }

    public static final class DataNode implements Serializable {
        public PlatformEffect effect;
        public List<String> url_prefix;

        public DataNode() {
            this(null, null);
        }

        public final void setEffect(PlatformEffect platformEffect) {
            this.effect = platformEffect;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public DataNode(PlatformEffect platformEffect, List<String> list) {
            this.effect = platformEffect;
            this.url_prefix = list;
        }
    }

    public final void setData(DataNode dataNode) {
        this.data = dataNode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ScanQRCodeResponse(DataNode dataNode, String str, int i) {
        this.data = dataNode;
        this.message = str;
        this.status_code = i;
    }
}
