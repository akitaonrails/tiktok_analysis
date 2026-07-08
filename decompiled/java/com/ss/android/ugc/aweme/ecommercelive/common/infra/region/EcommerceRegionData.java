package com.ss.android.ugc.aweme.ecommercelive.common.infra.region;

import X.C09CT;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class EcommerceRegionData {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public boolean f64switch = true;

    @C09CT("us_region")
    public List<String> usRegions = C1697810uHb.LJIIJJI("us", "gb", "de", "fr", "it", "es", "ie", "jp", "sa", "pl", "nl", "be", "cz", "at", "gr", "pt", "hu");

    @C09CT("sea_region")
    public List<String> seaRegions = C1697810uHb.LJIIJJI(FollowStatusChangeMethod.PARAM_UID, "my", "th", "vn", "ph", "sg", "br", "mx");
}
