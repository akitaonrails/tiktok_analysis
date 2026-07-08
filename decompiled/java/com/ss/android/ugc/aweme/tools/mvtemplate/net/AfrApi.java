package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.C092G;
import X.C11NZ;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.k;

/* JADX INFO: loaded from: classes4.dex */
public interface AfrApi {
    @C092G
    @InterfaceC1501170pAR("/media/api/pic/afr")
    C11NZ<ImageResponse> getImageInfo(@InterfaceC1501070pAH("algorithms") String str, @InterfaceC1501070pAH("key") String str2, @InterfaceC1501070pAH("algorithm_type") String str3, @InterfaceC1501030pAD("file") TypedFile typedFile, @InterfaceC1501030pAD("conf") k kVar);

    @C092G
    @InterfaceC1501170pAR("/media/api/pic/video")
    C11NZ<VideoResponse> getVideoInfo(@InterfaceC1501070pAH("algorithm") String str, @InterfaceC1501070pAH("key") String str2, @InterfaceC1501070pAH("algorithm_type") int i, @InterfaceC1501030pAD("file") TypedFile typedFile, @InterfaceC1501030pAD("conf") k kVar);
}
