package com.ss.android.ugc.aweme.share.business.config;

import X.C1369950lkn;
import X.C1379120lza;
import X.C19252910Tv;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressPanelConfig;
import com.ss.android.ugc.aweme.longpress.LongPressPanelStyleConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeSharePanelLogicProtocol extends TTSharePanelLogicProtocol {
    public final AwemeSharePackage LLILLJJLI;
    public final Aweme LLILLL;
    public final String LLILZ;
    public final C1369950lkn LLILZIL;

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final C1369950lkn getUiConfig() {
        return this.LLILZIL;
    }

    public AwemeSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        AwemeSharePackage awemeSharePackage;
        Aweme awemeLJJIFFI;
        String string;
        SharePackage sharePackage;
        float fFloatValue;
        boolean zBooleanValue;
        LongPressPanelConfig longPressPanelConfig;
        String str;
        LongPressPanelConfig longPressPanelConfig2;
        LongPressPanelStyleConfig longPressPanelStyleConfig;
        Boolean bool;
        LongPressPanelConfig longPressPanelConfig3;
        LongPressPanelStyleConfig longPressPanelStyleConfig2;
        Float f;
        Bundle bundle;
        super(baseSharePackage);
        if (baseSharePackage instanceof AwemeSharePackage) {
            awemeSharePackage = (AwemeSharePackage) baseSharePackage;
        } else {
            awemeSharePackage = null;
        }
        this.LLILLJJLI = awemeSharePackage;
        if (awemeSharePackage != null) {
            Bundle bundle2 = awemeSharePackage.extras;
            if (bundle2 != null) {
                bundle2.getString("panel_source");
            }
            awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        } else {
            awemeLJJIFFI = null;
        }
        this.LLILLL = awemeLJJIFFI;
        if (awemeSharePackage != null && (bundle = awemeSharePackage.extras) != null) {
            string = bundle.getString("enter_from");
        } else {
            string = null;
        }
        this.LLILZ = string;
        String string2 = baseSharePackage.extras.getString("enter_from", "");
        String string3 = baseSharePackage.extras.getString("panel_source", "");
        C1379120lza c1379120lza = C1379120lza.LIZ;
        c1379120lza.getClass();
        if (C1379120lza.LIZIZ(string3)) {
            if (baseSharePackage instanceof SharePackage) {
                sharePackage = (SharePackage) baseSharePackage;
            } else {
                sharePackage = null;
            }
            if (C1379120lza.LIZLLL(sharePackage, string2)) {
                C1369950lkn c1369950lkn = new C1369950lkn();
                LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
                if (lPPProtocolLIZ != null && (longPressPanelConfig3 = lPPProtocolLIZ.longPressPanelConfig) != null && (longPressPanelStyleConfig2 = longPressPanelConfig3.styleConfig) != null && (f = longPressPanelStyleConfig2.heightRatio) != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.5f;
                }
                c1369950lkn.LIZ = fFloatValue;
                c1369950lkn.LIZLLL = true;
                c1369950lkn.LJ = Collections.singletonList("share_channel");
                LPPProtocol lPPProtocolLIZ2 = C1379120lza.LIZ();
                if (lPPProtocolLIZ2 != null && (longPressPanelConfig2 = lPPProtocolLIZ2.longPressPanelConfig) != null && (longPressPanelStyleConfig = longPressPanelConfig2.styleConfig) != null && (bool = longPressPanelStyleConfig.handleEnable) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c1369950lkn.LJI = zBooleanValue;
                c1379120lza.getClass();
                LPPProtocol lPPProtocolLIZ3 = C1379120lza.LIZ();
                c1369950lkn.LJII = (lPPProtocolLIZ3 == null || (longPressPanelConfig = lPPProtocolLIZ3.longPressPanelConfig) == null || (str = longPressPanelConfig.panelType) == null) ? "online_version" : str;
                this.LLILZIL = c1369950lkn;
                if (C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LJ(null)) {
                    c1369950lkn.LJFF = true;
                    return;
                }
                return;
            }
        }
        if (C1379120lza.LIZIZ(string3) && C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LJ(null)) {
            C1369950lkn c1369950lkn2 = new C1369950lkn();
            c1369950lkn2.LJFF = true;
            this.LLILZIL = c1369950lkn2;
            return;
        }
        this.LLILZIL = null;
    }
}
