package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ResourceListResponse extends C13OE<ResourceListModel> implements Serializable {
    public ResourceListModel data;
    public String message;
    public int status_code;

    public ResourceListResponse() {
        this(null, null, 0);
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i) {
        return new ResourceListResponse(resourceListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceListResponse)) {
            return false;
        }
        ResourceListResponse resourceListResponse = (ResourceListResponse) obj;
        return Intrinsics.LJFF(this.data, resourceListResponse.data) && Intrinsics.LJFF(this.message, resourceListResponse.message) && this.status_code == resourceListResponse.status_code;
    }

    public int hashCode() {
        ResourceListModel resourceListModel = this.data;
        int iHashCode = (resourceListModel == null ? 0 : resourceListModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceListResponse(data=");
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
        ResourceListModel resourceListModel = this.data;
        return (resourceListModel == null || resourceListModel.getResource_list() == null) ? false : true;
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
    public ResourceListModel getResponseData() {
        return this.data;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i;
    }
}
