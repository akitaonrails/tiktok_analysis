package com.ss.android.ugc.aweme.im.saas.host.impl.camera;

import X.C05YD;
import X.C0HV9;
import X.C1163440gNi;
import X.C1175804iq;
import X.C912070ZqH;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaUIBridgeApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class IMMediaUIBridgeService implements IMMediaUIBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaUIBridgeApi
    public final Function1 LIZ(BaseChatInputAssem baseChatInputAssem, C05YD c05yd, C1175804iq c1175804iq, C1163440gNi c1163440gNi, C0HV9 c0hv9, Function2 function2) {
        return C912070ZqH.LIZIZ.getUiService().LIZIZ(baseChatInputAssem, c05yd, c1175804iq, c1163440gNi, c0hv9, function2);
    }
}
