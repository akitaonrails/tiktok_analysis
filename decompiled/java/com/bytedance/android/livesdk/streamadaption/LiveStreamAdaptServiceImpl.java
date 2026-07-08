package com.bytedance.android.livesdk.streamadaption;

import X.C01GW;
import X.C1126504at;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveStreamAdaptServiceImpl implements ILiveStreamAdaptService {
    public static final /* synthetic */ int LIZJ = 0;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(120));

    @Override // com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService
    public final String LIZIZ(String str) {
        return ((ILiveStreamAdaptConfigService) this.LIZIZ.getValue()).LIZIZ().get(str);
    }

    @Override // com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService
    public final boolean LIZ(int i, String str, boolean z) {
        String str2;
        if (!((ILiveStreamAdaptConfigService) this.LIZIZ.getValue()).LIZ().contains(str)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panel ");
        if (z) {
            str2 = "show";
        } else {
            str2 = "dismiss";
        }
        sbLIZ.append(str2);
        sbLIZ.append(" panelId=");
        sbLIZ.append(str);
        sbLIZ.append(" panelBusiness=");
        sbLIZ.append("EC");
        sbLIZ.append(" mode=");
        sbLIZ.append(0);
        C2188811AlT.LIZIZ(sbLIZ);
        EventBus.LIZLLL().LJIILL(new C1126504at(i, str, z));
        return true;
    }
}
