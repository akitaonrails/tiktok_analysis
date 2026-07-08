package com.ss.android.ugc.aweme.business.live.assem;

import X.AbstractC1569120qw2;
import X.C1569180qw8;
import X.C1595910rdF;
import X.C1596010rdP;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC1582650rHr;
import Y.ARunnableS124S0100000_24;
import android.os.Handler;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ab.AvatarRefreshConfig;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightFrontierMessageRefreshAssem extends AbsSkylightLiveRefreshAssem {
    public long LLJI;
    public ARunnableS124S0100000_24 LLJIJIL;

    @Override // com.ss.android.ugc.aweme.business.live.assem.AbsSkylightLiveRefreshAssem
    public final boolean fo() {
        AvatarRefreshConfig avatarRefreshConfigLIZ = C1595910rdF.LIZ();
        if (SystemClock.uptimeMillis() - this.LLJI < avatarRefreshConfigLIZ.refreshInterval * LSPassThroughRecordSizeConfig.DEFAULT) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC1569120qw2 abstractC1569120qw2LIZIZ = C1569180qw8.LIZIZ(m163do());
            linkedHashMap.put("enter_from", abstractC1569120qw2LIZIZ != null ? abstractC1569120qw2LIZIZ.LIZ : null);
            linkedHashMap.put("refresh_type", "high_value_explicit_refresh");
            C1596010rdP.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(linkedHashMap);
            c2344009Gk.LIZJ(1, "fail_reason");
            C20684815ws.LJIILLIIL("story_fixed_icon_refresh_fail", c2344009Gk.LIZ);
            return false;
        }
        this.LLJI = SystemClock.uptimeMillis();
        if (avatarRefreshConfigLIZ.delayMs == 0) {
            FeedSkylightListViewModel.OQ2((FeedSkylightListViewModel) this.LLILZ.getValue(), EnumC1582650rHr.HIGH_VALUE_FOLLOW_RELATIONSHIP, "auto", true, null, null, 24);
            return true;
        }
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = this.LLJIJIL;
        if (aRunnableS124S0100000_24 != null) {
            ((Handler) this.LL.getValue()).removeCallbacks(aRunnableS124S0100000_24);
        }
        ARunnableS124S0100000_24 aRunnableS124S0100000_242 = new ARunnableS124S0100000_24(this, 151);
        this.LLJIJIL = aRunnableS124S0100000_242;
        C786410Ut5.LJLIIL(avatarRefreshConfigLIZ.delayMs, (Handler) this.LL.getValue(), aRunnableS124S0100000_242);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.business.live.assem.AbsSkylightLiveRefreshAssem, X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = this.LLJIJIL;
        if (aRunnableS124S0100000_24 != null) {
            ((Handler) this.LL.getValue()).removeCallbacks(aRunnableS124S0100000_24);
        }
        this.LLJIJIL = null;
    }
}
