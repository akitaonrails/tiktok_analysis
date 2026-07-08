package com.ss.android.ugc.aweme.share.download.protocol;

import X.AbstractC1382680m5K;
import X.AbstractC21169117sn;
import X.C21169917sv;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DefaultWaterMarkAbilityProtocol<CONTEXT extends AbstractC21169117sn> extends WaterMarkAbilityProtocol<CONTEXT> {
    public final AbstractC1382680m5K LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LIZ() {
        AbstractC1382680m5K abstractC1382680m5K = this.LLILLJJLI;
        if (abstractC1382680m5K != null) {
            abstractC1382680m5K.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LJFF() {
        AbstractC1382680m5K abstractC1382680m5K = this.LLILLJJLI;
        if (abstractC1382680m5K != null) {
            abstractC1382680m5K.LIZJ();
        }
    }

    public DefaultWaterMarkAbilityProtocol(CONTEXT context) {
        this.LLILLJJLI = DownloadServiceImpl.LJ().LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LJIIJ(C21169917sv c21169917sv) {
        AbstractC1382680m5K abstractC1382680m5K = this.LLILLJJLI;
        if (abstractC1382680m5K != null) {
            abstractC1382680m5K.LIZLLL(c21169917sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LIZJ(String str, String str2) {
        AbstractC1382680m5K abstractC1382680m5K = this.LLILLJJLI;
        if (abstractC1382680m5K != null) {
            abstractC1382680m5K.LIZIZ(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LJIIJJI(long j, long j2, boolean z, String str, String str2) {
        AbstractC1382680m5K abstractC1382680m5K = this.LLILLJJLI;
        if (abstractC1382680m5K != null) {
            abstractC1382680m5K.LJ(j, j2, z, str, str2);
        }
    }
}
