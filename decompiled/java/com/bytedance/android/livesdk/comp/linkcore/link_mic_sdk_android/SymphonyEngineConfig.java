package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import X.C2183271AcX;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class SymphonyEngineConfig extends AbstractC1283560jVS {
    public static final C2183271AcX LLILZ = new Object() { // from class: X.1AcX
    };

    public static final native long MoltenFfiNativeNewX8177652974745248895(ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_SymphonyEngineConfig_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C2183271AcX c2183271AcX = LLILZ;
            long j = ((C1283590jVV) abstractC1283580jVU).LIZ;
            c2183271AcX.getClass();
            molten_ffi_link_mic_sdk_SymphonyEngineConfig_free(j);
        }
    }

    public SymphonyEngineConfig(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }
}
