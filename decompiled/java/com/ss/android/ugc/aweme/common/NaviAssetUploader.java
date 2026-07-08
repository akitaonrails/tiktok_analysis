package com.ss.android.ugc.aweme.common;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1C7U;
import X.C2188811AlT;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class NaviAssetUploader {
    public static final NaviAssetUploader LIZ = new NaviAssetUploader();

    public static final class NaviAssetUploadHandler extends BPEAHandler {
        public final Function1<AvatarUri, Unit> LL;

        /* JADX WARN: Multi-variable type inference failed */
        public NaviAssetUploadHandler(Function1<? super AvatarUri, Unit> function1) {
            super(Looper.getMainLooper());
            this.LL = function1;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("NaviAssetUploader$NaviAssetUploadHandler@cbb0.handleMessage");
            if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
                this.LL.invoke((AvatarUri) HandlerHook.getMessageObj(message.obj));
            }
            C1C7U.LIZIZ("NaviAssetUploader$NaviAssetUploadHandler@cbb0.handleMessage");
        }
    }

    public static void LIZ(File file, Function1 function1) {
        long j = 1024;
        int length = (int) (((file.length() / j) + 1) * j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Api.LIZIZ);
        sbLIZ.append("?uid=");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJZ(new NaviAssetUploadHandler(function1), C2188811AlT.LIZIZ(sbLIZ), length, file.getPath(), null);
    }
}
