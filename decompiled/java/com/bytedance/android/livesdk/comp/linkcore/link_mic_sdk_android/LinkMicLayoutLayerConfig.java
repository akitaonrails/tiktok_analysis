package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import X.C2182421AbA;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class LinkMicLayoutLayerConfig extends AbstractC1283560jVS {
    public static final C2182421AbA LLILZ = new C2182421AbA();

    public static final native long MoltenFfiNativeNewX1166122948281177197(ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicLayoutLayerConfig_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C2182421AbA c2182421AbA = LLILZ;
            long j = ((C1283590jVV) abstractC1283580jVU).LIZ;
            c2182421AbA.getClass();
            molten_ffi_link_mic_sdk_LinkMicLayoutLayerConfig_free(j);
        }
    }

    public LinkMicLayoutLayerConfig(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }
}
