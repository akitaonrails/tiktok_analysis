package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicRtcSetupResultCallback extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnResultX685897714793731031(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicRtcSetupResultCallback_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicRtcSetupResultCallback_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }
}
