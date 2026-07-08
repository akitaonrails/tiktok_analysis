package com.ss.android.ugc.aweme.commercialize.profile.impl.log;

import X.C1019070ccr;
import X.C1022820ciu;
import X.C1023960ckk;
import X.C1029420ctY;
import X.C1029440cta;
import X.C1029450ctb;
import X.C1029470ctd;
import X.C2184171Adz;
import X.EnumC1029460ctc;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS40S2100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FullScreenLandingPageUnityLoggerImpl implements IFullScreenLandingPageUnityLogger {
    public static String LIZJ(EnumC1029460ctc enumC1029460ctc) {
        int i = C1029450ctb.LIZ[enumC1029460ctc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    return null;
                }
                return "half_to_full_screen_landing_page";
            }
            return "full_screen_landing_page";
        }
        return "halfscreen_page";
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger
    public final void LIZIZ(EnumC1029460ctc enumC1029460ctc, Aweme aweme, String str) {
        C1023960ckk c1023960ckk;
        if (aweme != null && str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3373707) {
                if (iHashCode != 106642994) {
                    if (iHashCode == 109526449 && str.equals("slide")) {
                        c1023960ckk = C1029440cta.LIZJ;
                    } else {
                        return;
                    }
                } else if (str.equals("photo")) {
                    c1023960ckk = C1029440cta.LIZIZ;
                } else {
                    return;
                }
            } else if (str.equals("name")) {
                c1023960ckk = C1029440cta.LIZ;
            } else {
                return;
            }
            if (c1023960ckk != null) {
                new C1029420ctY().logAd(c1023960ckk, new AwS40S2100000_16(aweme, LIZJ(enumC1029460ctc), str, 2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger
    public final void LIZ(EnumC1029460ctc enumC1029460ctc, AwemeRawAd awemeRawAd, String str, Map<String, ? extends Object> map) {
        String str2;
        LinkedHashMap linkedHashMap;
        String strLIZJ = LIZJ(enumC1029460ctc);
        if (strLIZJ != null && str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3373707) {
                if (iHashCode != 106642994) {
                    if (iHashCode == 109526449 && str.equals("slide")) {
                        str2 = "slide";
                    } else {
                        return;
                    }
                } else {
                    str2 = "photo";
                    if (!str.equals("photo")) {
                        return;
                    }
                }
            } else {
                str2 = "name";
                if (!str.equals("name")) {
                    return;
                }
            }
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            C1029470ctd.LIZ.getClass();
            linkedHashMap.put(C1029470ctd.LIZIZ.LIZ, strLIZJ);
            if (Intrinsics.LJFF(str, "slide")) {
                String str3 = C1019070ccr.LIZ;
                C1019070ccr.LIZ = null;
                if (str3 == null) {
                    str3 = "others";
                }
                linkedHashMap.put(C1029470ctd.LIZJ.LIZ, str3);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAd);
            c1022820ciuLIZLLL.LIZJ(str2, "refer");
            c1022820ciuLIZLLL.LIZ(linkedHashMap);
            c1022820ciuLIZLLL.LJII();
        }
    }
}
