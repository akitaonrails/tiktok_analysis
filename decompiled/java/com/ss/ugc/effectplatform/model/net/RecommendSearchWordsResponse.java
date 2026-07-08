package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendSearchWordsResponse extends C13OE<RecommendSearchWordsResponse> implements Serializable {
    public RecommendSearchWordsModel data;
    public String message;
    public int status_code;

    public RecommendSearchWordsResponse() {
        this(null, 0, null);
    }

    public final RecommendSearchWordsResponse copy(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        return new RecommendSearchWordsResponse(recommendSearchWordsModel, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsResponse)) {
            return false;
        }
        RecommendSearchWordsResponse recommendSearchWordsResponse = (RecommendSearchWordsResponse) obj;
        return Intrinsics.LJFF(this.data, recommendSearchWordsResponse.data) && this.status_code == recommendSearchWordsResponse.status_code && Intrinsics.LJFF(this.message, recommendSearchWordsResponse.message);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public RecommendSearchWordsResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        RecommendSearchWordsModel recommendSearchWordsModel = this.data;
        int iHashCode = (((recommendSearchWordsModel == null ? 0 : recommendSearchWordsModel.hashCode()) * 31) + this.status_code) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendSearchWordsResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    public final RecommendSearchWordsModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ RecommendSearchWordsResponse getResponseData() {
        getResponseData();
        return this;
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

    public final void setData(RecommendSearchWordsModel recommendSearchWordsModel) {
        this.data = recommendSearchWordsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        this.data = recommendSearchWordsModel;
        this.status_code = i;
        this.message = str;
    }
}
