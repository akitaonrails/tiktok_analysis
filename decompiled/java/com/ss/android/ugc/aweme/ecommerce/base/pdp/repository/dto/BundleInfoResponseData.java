package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleInfoResponseData {

    @C09CT("bundle_info_list")
    public final List<BundleInfo> bundleInfoList;

    @C09CT("request_id")
    public final String requestId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleInfoResponseData)) {
            return false;
        }
        BundleInfoResponseData bundleInfoResponseData = (BundleInfoResponseData) obj;
        return Intrinsics.LJFF(this.bundleInfoList, bundleInfoResponseData.bundleInfoList) && Intrinsics.LJFF(this.requestId, bundleInfoResponseData.requestId);
    }

    public BundleInfoResponseData(List<BundleInfo> list, String str) {
        this.bundleInfoList = list;
        this.requestId = str;
    }
}
