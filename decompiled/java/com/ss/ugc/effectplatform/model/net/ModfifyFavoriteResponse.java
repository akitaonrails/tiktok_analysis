package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ModfifyFavoriteResponse extends C13OE<List<? extends String>> implements Serializable {
    public List<String> data;
    public String message;
    public int status_code;

    public ModfifyFavoriteResponse() {
        this(null, null, 0);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return true;
    }

    public final ModfifyFavoriteResponse copy(List<String> list, String str, int i) {
        return new ModfifyFavoriteResponse(list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModfifyFavoriteResponse)) {
            return false;
        }
        ModfifyFavoriteResponse modfifyFavoriteResponse = (ModfifyFavoriteResponse) obj;
        return Intrinsics.LJFF(this.data, modfifyFavoriteResponse.data) && Intrinsics.LJFF(this.message, modfifyFavoriteResponse.message) && this.status_code == modfifyFavoriteResponse.status_code;
    }

    public int hashCode() {
        List<String> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModfifyFavoriteResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getData() {
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

    @Override // X.C13OE
    public List<? extends String> getResponseData() {
        return this.data;
    }

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ModfifyFavoriteResponse(List<String> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }
}
