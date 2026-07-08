package com.ss.android.ugc.aweme.series.innerfeed.component;

import X.C01GW;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class PineDramaReachBottomParamComponent extends BasePanelComponent implements ReachBottomCacheAbility, InterfaceC1554640qYg {
    public final C01GW LL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -128955267) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final boolean r32() {
        return false;
    }

    public PineDramaReachBottomParamComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1009), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 14));
        }
        this.LL = c01gwLIZIZ;
    }

    public final void bo(JSONObject jSONObject) throws JSONException {
        String seriesEnterEntrance;
        IPaidContentPanelAbility iPaidContentPanelAbility = (IPaidContentPanelAbility) this.LL.getValue();
        if (iPaidContentPanelAbility != null && (seriesEnterEntrance = iPaidContentPanelAbility.getSeriesEnterEntrance()) != null && seriesEnterEntrance.length() != 0) {
            jSONObject.putOpt("series_enter_entrance", seriesEnterEntrance);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final void g10(JSONObject jSONObject) throws JSONException {
        bo(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility
    public final boolean iJ(JSONObject jSONObject) throws JSONException {
        bo(jSONObject);
        return false;
    }
}
