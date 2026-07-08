package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CategoryEffectListResponse extends C13OE<CategoryPageModel> implements Serializable {
    public CategoryPageModel data;
    public String message;
    public int status_code;

    public CategoryEffectListResponse() {
        this(null, null, 0);
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i) {
        return new CategoryEffectListResponse(categoryPageModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectListResponse)) {
            return false;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) obj;
        return Intrinsics.LJFF(this.data, categoryEffectListResponse.data) && Intrinsics.LJFF(this.message, categoryEffectListResponse.message) && this.status_code == categoryEffectListResponse.status_code;
    }

    public int hashCode() {
        CategoryPageModel categoryPageModel = this.data;
        int iHashCode = (categoryPageModel == null ? 0 : categoryPageModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryEffectListResponse(data=");
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
        CategoryPageModel categoryPageModel = this.data;
        return (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) ? false : true;
    }

    public final CategoryPageModel getData() {
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
    public CategoryPageModel getResponseData() {
        return this.data;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i;
    }
}
