package com.ss.android.ugc.aweme.services.publisherror;

import X.C1434650nR9;
import X.C2188811AlT;
import android.content.Context;
import com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishErrorHandleContext {
    public final Context context;
    public final C1434650nR9 error;
    public final String errorMsg;
    public final String region;
    public final int retryCount;
    public final IUploadRecoverInfoStore store;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishErrorHandleContext)) {
            return false;
        }
        PublishErrorHandleContext publishErrorHandleContext = (PublishErrorHandleContext) obj;
        return Intrinsics.LJFF(this.context, publishErrorHandleContext.context) && Intrinsics.LJFF(this.error, publishErrorHandleContext.error) && Intrinsics.LJFF(this.store, publishErrorHandleContext.store) && this.retryCount == publishErrorHandleContext.retryCount && Intrinsics.LJFF(this.region, publishErrorHandleContext.region) && Intrinsics.LJFF(this.errorMsg, publishErrorHandleContext.errorMsg);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        C1434650nR9 c1434650nR9 = this.error;
        int iHashCode2 = (iHashCode + (c1434650nR9 == null ? 0 : c1434650nR9.hashCode())) * 31;
        IUploadRecoverInfoStore iUploadRecoverInfoStore = this.store;
        int iHashCode3 = (((((iHashCode2 + (iUploadRecoverInfoStore == null ? 0 : iUploadRecoverInfoStore.hashCode())) * 31) + this.retryCount) * 31) + this.region.hashCode()) * 31;
        String str = this.errorMsg;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishErrorHandleContext(context=");
        sbLIZ.append(this.context);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", store=");
        sbLIZ.append(this.store);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", region=");
        sbLIZ.append(this.region);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getErrorMatchKey() {
        return StudioPublishErrorHandleConfig.INSTANCE.buildPublishErrorMatchKey(this.error);
    }

    public PublishErrorHandleContext(Context context, C1434650nR9 c1434650nR9, IUploadRecoverInfoStore iUploadRecoverInfoStore, int i, String str, String str2) {
        this.context = context;
        this.error = c1434650nR9;
        this.store = iUploadRecoverInfoStore;
        this.retryCount = i;
        this.region = str;
        this.errorMsg = str2;
    }
}
