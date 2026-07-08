package com.ss.android.ugc.aweme.channel.share.channel.wrap;

import X.C0M7Y;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1375540lto;
import android.app.Activity;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class WrapDefaultMessengerChannel extends IWrapChannel {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJJL() {
        return "wrap_messenger";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJZ() {
        return "com.facebook.orca";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y) {
        return LJJJIL(c1375540lto, activity, c0m7y);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y) {
        return LJIIL(c1371420lnA, activity, c0m7y);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y) {
        return LJIJ(c1374270lrl, activity, c0m7y);
    }
}
