package com.bytedance.android.livesdk.signaling.model;

import X.C09CT;
import com.bytedance.android.livesdk.signaling.model.BaseUplinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class UplinkModel<T extends BaseUplinkData> {

    @C09CT("biz_type")
    public String bizType;

    @C09CT("data")
    public T data;

    @C09CT("extra")
    public ExtraT extra;

    @C09CT("sub_type")
    public String subType;

    public UplinkModel() {
        this("", "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UplinkModel)) {
            return false;
        }
        UplinkModel uplinkModel = (UplinkModel) obj;
        return Intrinsics.LJFF(this.bizType, uplinkModel.bizType) && Intrinsics.LJFF(this.subType, uplinkModel.subType) && Intrinsics.LJFF(this.data, uplinkModel.data) && Intrinsics.LJFF(this.extra, uplinkModel.extra);
    }

    public UplinkModel(String str, String str2, T t, ExtraT extraT) {
        this.bizType = str;
        this.subType = str2;
        this.data = t;
        this.extra = extraT;
    }
}
