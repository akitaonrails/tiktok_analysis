package com.ss.android.ugc.aweme.share.download.protocol;

import X.AbstractC1382670m5J;
import X.AbstractC21169117sn;
import X.C15O7;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DefaultMuteAudioAbilityProtocol<CONTEXT extends AbstractC21169117sn> extends MuteAudioAbilityProtocol<CONTEXT> {
    public final AbstractC1382670m5J LL;

    public DefaultMuteAudioAbilityProtocol(CONTEXT context) {
        this.LL = DownloadServiceImpl.LJ().LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol
    public final C15O7<Integer> LIZJ(String str, String str2) {
        AbstractC1382670m5J abstractC1382670m5J = this.LL;
        if (abstractC1382670m5J != null) {
            return abstractC1382670m5J.LIZ(str, str2);
        }
        return null;
    }
}
