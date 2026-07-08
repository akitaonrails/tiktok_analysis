package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.C092G;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501170pAR;
import com.bytedance.retrofit2.mime.TypedFile;

/* JADX INFO: loaded from: classes4.dex */
public interface CustomStickerApi {
    @C092G
    @InterfaceC1501170pAR("/media/api/pic/iss")
    C11NZ<CutoutResponse> cutoutSticker(@InterfaceC1501030pAD("file") TypedFile typedFile);

    @C092G
    @InterfaceC1501170pAR("/media/api/pic/iss")
    Object cutoutStickerSuspend(@InterfaceC1501030pAD("file") TypedFile typedFile, InterfaceC1364105Vn<? super CutoutResponse> interfaceC1364105Vn);
}
