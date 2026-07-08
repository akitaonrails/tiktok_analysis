package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC1375550ltp;
import X.C1371430lnB;
import X.C1374080lrS;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* JADX INFO: loaded from: classes22.dex */
public final class IntentShareLink extends AbsIntentShare {
    public final ShareContentType LL = ShareContentType.LINK;

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final ShareContentType LIZJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final AbstractC1375550ltp LIZ(Context context, C1374080lrS c1374080lrS) {
        return new C1371430lnB(c1374080lrS.LIZ, AbsIntentShare.LJ(c1374080lrS), AbsIntentShare.LIZLLL(c1374080lrS));
    }
}
