package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1883407Zg;
import X.C1355280lN8;
import X.C13LQ;
import X.C1883307Zf;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveHostIM implements IHostIM {
    public static final LiveHostIM LL = new LiveHostIM();
    public static boolean LLILLJJLI;

    @Override // com.bytedance.android.livesdkapi.host.IHostIM
    public final boolean j71() {
        if (!LLILLJJLI) {
            LLILLJJLI = true;
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                businessCapabilityServiceLIZ.LIZ(EnumC1355300lNA.GO_LIVE);
            }
        }
        EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.GO_LIVE;
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ2 = C1355280lN8.LIZ();
        AbstractC1883407Zg abstractC1883407ZgLJII = businessCapabilityServiceLIZ2 != null ? businessCapabilityServiceLIZ2.LJII(enumC1355300lNA, C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.MICROPHONE, EnumC1355290lN9.CAMERA, EnumC1355290lN9.AUDIO_FOCUS})) : null;
        return (abstractC1883407ZgLJII instanceof C1883307Zf) && ((C1883307Zf) abstractC1883407ZgLJII).LIZIZ.contains(EnumC1355300lNA.VOICE_CALL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostIM
    public final void fr2(boolean z) {
        if (!LLILLJJLI) {
            LLILLJJLI = true;
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                businessCapabilityServiceLIZ.LIZ(EnumC1355300lNA.GO_LIVE);
            }
        }
        if (!z) {
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ2 = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ2 != null) {
                businessCapabilityServiceLIZ2.LIZIZ(EnumC1355300lNA.GO_LIVE);
            }
        }
    }
}
