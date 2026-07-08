package com.ss.android.ugc.aweme.feed.model;

import X.C09C2;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class LiveAdCardModel extends BaseResponse implements Serializable {

    @C09CT("component_data")
    public final ComponentData componentData;

    @C09CT("component_fail_reason")
    public final String componentFailReason;

    @C09CT("frontend_extra_data")
    public final Object frontendExtraData;

    @C09CT("live_products")
    public final Object liveProduct;

    public final LiveAdCardModel copy(ComponentData componentData, Object obj, Object obj2, String str) {
        return new LiveAdCardModel(componentData, obj, obj2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveAdCardModel)) {
            return false;
        }
        LiveAdCardModel liveAdCardModel = (LiveAdCardModel) obj;
        return Intrinsics.LJFF(this.componentData, liveAdCardModel.componentData) && Intrinsics.LJFF(this.liveProduct, liveAdCardModel.liveProduct) && Intrinsics.LJFF(this.frontendExtraData, liveAdCardModel.frontendExtraData) && Intrinsics.LJFF(this.componentFailReason, liveAdCardModel.componentFailReason);
    }

    public int hashCode() {
        ComponentData componentData = this.componentData;
        int iHashCode = (componentData == null ? 0 : componentData.hashCode()) * 31;
        Object obj = this.liveProduct;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.frontendExtraData;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.componentFailReason;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveAdCardModel(componentData=");
        sbLIZ.append(this.componentData);
        sbLIZ.append(", liveProduct=");
        sbLIZ.append(this.liveProduct);
        sbLIZ.append(", frontendExtraData=");
        sbLIZ.append(this.frontendExtraData);
        sbLIZ.append(", componentFailReason=");
        sbLIZ.append(this.componentFailReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LiveProduct getLiveProductCase() {
        if (this.liveProduct == null) {
            return null;
        }
        return (LiveProduct) GsonProtectorUtils.fromJson(C09C2.LIZ(), GsonProtectorUtils.toJson(C09C2.LIZ(), this.liveProduct), LiveProduct.class);
    }

    public final ComponentData getComponentData() {
        return this.componentData;
    }

    public final String getComponentFailReason() {
        return this.componentFailReason;
    }

    public final Object getFrontendExtraData() {
        return this.frontendExtraData;
    }

    public final Object getLiveProduct() {
        return this.liveProduct;
    }

    public LiveAdCardModel(ComponentData componentData, Object obj, Object obj2, String str) {
        this.componentData = componentData;
        this.liveProduct = obj;
        this.frontendExtraData = obj2;
        this.componentFailReason = str;
    }
}
