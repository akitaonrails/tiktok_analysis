package com.ss.android.ugc.aweme.commercialize.depend;

import X.C1017160cZm;
import X.C1017180cZo;
import X.C1024900cmG;
import android.content.Context;
import com.ss.android.ugc.aweme.IRewardAdapterDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceRewardAdapterDependentImpl implements IRewardAdapterDepend {
    @Override // com.ss.android.ugc.aweme.IRewardAdapterDepend
    public final boolean LIZ(Context context, AwemeRawAd awemeRawAd, String str) {
        String strLJII;
        if (awemeRawAd != null) {
            if (!C1017180cZo.LIZ(awemeRawAd)) {
                return false;
            }
            strLJII = C1017180cZo.LJII(awemeRawAd, false, false);
        } else {
            strLJII = null;
        }
        return C1024900cmG.LIZLLL(context, awemeRawAd, strLJII, false, str, null);
    }

    @Override // com.ss.android.ugc.aweme.IRewardAdapterDepend
    public final void LIZJ(Aweme aweme, String str, Map map) {
        C1017160cZm.LIZIZ(aweme, str, map, false);
    }
}
