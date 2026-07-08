package com.ss.ugc.effectplatform.model;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class HorizontalEffectsResponse extends C13OE<HorizontalEffectsModel> implements Serializable {
    public HorizontalEffectsModel data;
    public String message;
    public int status_code;

    public HorizontalEffectsResponse() {
        this(null, null, 0);
    }

    public final HorizontalEffectsResponse copy(HorizontalEffectsModel horizontalEffectsModel, String str, int i) {
        return new HorizontalEffectsResponse(horizontalEffectsModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalEffectsResponse)) {
            return false;
        }
        HorizontalEffectsResponse horizontalEffectsResponse = (HorizontalEffectsResponse) obj;
        return Intrinsics.LJFF(this.data, horizontalEffectsResponse.data) && Intrinsics.LJFF(this.message, horizontalEffectsResponse.message) && this.status_code == horizontalEffectsResponse.status_code;
    }

    public int hashCode() {
        HorizontalEffectsModel horizontalEffectsModel = this.data;
        int iHashCode = (horizontalEffectsModel == null ? 0 : horizontalEffectsModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalEffectsResponse(data=");
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
        return this.data != null;
    }

    public final HorizontalEffectsModel getData() {
        return this.data;
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
    public HorizontalEffectsModel getResponseData() {
        return this.data;
    }

    public final void setData(HorizontalEffectsModel horizontalEffectsModel) {
        this.data = horizontalEffectsModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public HorizontalEffectsResponse(HorizontalEffectsModel horizontalEffectsModel, String str, int i) {
        this.data = horizontalEffectsModel;
        this.message = str;
        this.status_code = i;
    }
}
