package com.ss.android.ugc.sdk.channel.third.instagram;

import X.C01GW;
import X.C0M7Y;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1374810lsd;
import X.C1375540lto;
import X.C1376530lvP;
import X.C452501pT;
import X.EnumC1376430lvF;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class InstagramChannel extends IWrapChannel {
    public final C01GW LL = C452501pT.LIZIZ(new C1376530lvP());

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJJL() {
        return "instagram";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJZ() {
        return "com.instagram.android";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y) {
        int iIntValue = ((Number) this.LL.getValue()).intValue();
        if (iIntValue == EnumC1376430lvF.SYSTEM_SHARE.getNum()) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
            if (interfaceC1369790lkXLIZ != null) {
                return interfaceC1369790lkXLIZ.LJJJIL(c1375540lto, activity, c0m7y);
            }
            return false;
        }
        if (iIntValue == EnumC1376430lvF.INTENT_SHARE.getNum()) {
            return LJJJIL(c1375540lto, activity, c0m7y);
        }
        return LJJJIL(c1375540lto, activity, c0m7y);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y) {
        int iIntValue = ((Number) this.LL.getValue()).intValue();
        if (iIntValue == EnumC1376430lvF.SYSTEM_SHARE.getNum()) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ("more", null, null, 6);
            if (interfaceC1369790lkXLIZ != null) {
                return interfaceC1369790lkXLIZ.LJIJ(c1374270lrl, activity, c0m7y);
            }
            return false;
        }
        if (iIntValue == EnumC1376430lvF.INTENT_SHARE.getNum()) {
            return LJIJ(c1374270lrl, activity, c0m7y);
        }
        return LJIJ(c1374270lrl, activity, c0m7y);
    }
}
