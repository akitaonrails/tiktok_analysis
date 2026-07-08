package com.ss.android.ugc.aweme.log;

import X.C2273211DyJ;
import X.C2273221DyK;
import X.C2273231DyL;
import kotlin.jvm.internal.AwS0S3002000_35;
import kotlin.jvm.internal.AwS26S2000000_35;
import kotlin.jvm.internal.AwS2S2001000_35;
import kotlin.jvm.internal.AwS6S3400000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class AdChatAgentLogService implements IAdChatAgentLogService {
    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LIZ(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LIZLLL, str, str2, null, new AwS26S2000000_35(str3, str4, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LIZJ(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJIIJJI, str, str2, null, new AwS2S2001000_35(str3, str4, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LIZLLL(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJIIIZ, str, str2, null, new AwS26S2000000_35(str3, str4, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJ(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJIIL, str, str2, null, new AwS2S2001000_35(str3, str4, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJII(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LIZ, str, str2, null, new AwS26S2000000_35(str3, str4, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJIIIIZZ(String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LIZIZ, str, str2, null, new AwS26S2000000_35(str3, str4, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJIIIZ(int i, String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LIZJ, str, str2, null, new AwS2S2001000_35(i, str3, str4, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJFF(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJ, str, str2, null, new AwS0S3002000_35(i, i2, str3, str4, str5, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJIIJ(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJFF, str, str2, null, new AwS0S3002000_35(i, i2, str3, str4, str5, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJIIL(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJI, str, str2, null, new AwS0S3002000_35(str3, str4, str5, i, i2, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJIIJJI(int i, int i2, Long l, String str, String str2, String str3, String str4, String str5) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJII, str, str2, null, new C2273231DyL(i, i2, l, str3, str4, str5));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LIZIZ(int i, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJIIJ, str, str2, null, new C2273221DyK(str3, str4, str5, l, l2, str6, i));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdChatAgentLogService
    public final void LJI(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, String str5, Long l4) {
        if (str != null && str.length() != 0) {
            new AdChatAgentLogger().logAd(C2273211DyJ.LJIIIIZZ, str, str2, null, new AwS6S3400000_35(str3, str4, l, l2, l3, str5, l4, 0));
        }
    }
}
