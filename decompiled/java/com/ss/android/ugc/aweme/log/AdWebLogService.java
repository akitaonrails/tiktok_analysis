package com.ss.android.ugc.aweme.log;

import X.C04TD;
import X.C1022820ciu;
import X.C1023960ckk;
import X.C1035880d3y;
import X.C1036610d59;
import X.C1039420d9g;
import X.C1040580dBY;
import X.C1040740dBo;
import X.C1040750dBp;
import X.C1040770dBr;
import X.C1041460dCy;
import X.C1041470dCz;
import X.C1043510dGH;
import X.C123100dR;
import X.C2184171Adz;
import X.InterfaceC1009950cO9;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS1S3000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebLogService implements IAdWebLogService {
    public boolean LIZ;

    public static IAdWebLogService LJIIIZ() {
        Object objLIZ = C04TD.LIZ(IAdWebLogService.class, false);
        if (objLIZ != null) {
            return (IAdWebLogService) objLIZ;
        }
        if (C04TD.b2 == null) {
            synchronized (IAdWebLogService.class) {
                if (C04TD.b2 == null) {
                    C04TD.b2 = new AdWebLogService();
                }
            }
        }
        return C04TD.b2;
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final C1039420d9g LIZ() {
        return new C1039420d9g();
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final boolean LJFF() {
        if (this.LIZ) {
            return true;
        }
        this.LIZ = true;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final C1040770dBr LJII() {
        return new C1040770dBr();
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final C1040740dBo LIZLLL(C1035880d3y c1035880d3y) {
        return new C1040740dBo(c1035880d3y);
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LJ(C1035880d3y c1035880d3y, int i) {
        AwemeRawAd awemeRawAd;
        String url = null;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("ad_wap_stat", "ad_web_fragment_created", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - C1036610d59.LIZJ), "created_duration");
        if (c1035880d3y != null) {
            url = c1035880d3y.getUrl();
        }
        c1022820ciuLIZLLL.LIZIZ(url, "web_url");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "is_spark");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1036610d59.LIZIZ), "is_pre_create");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LJIIIIZZ(C1035880d3y c1035880d3y, String str) {
        String creativeIdStr;
        String logExtra;
        if (c1035880d3y == null) {
            return;
        }
        InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
        C1043510dGH.LIZ.getClass();
        C1023960ckk c1023960ckk = C1043510dGH.LJFF;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            creativeIdStr = CardStruct.IStatusCode.DEFAULT;
        }
        AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        interfaceC1009950cO9.logAd(c1023960ckk, creativeIdStr, logExtra, null, new AwS67S1000000_16(str, 11));
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LIZIZ(String str, String str2, String str3) {
        if (str != null && str.length() != 0) {
            InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
            C1043510dGH.LIZ.getClass();
            interfaceC1009950cO9.logAd(C1043510dGH.LJFF, str, str2, null, new AwS67S1000000_16(str3, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LJI(String str, String str2, String str3, String str4, String str5) {
        if (str != null && str.length() != 0) {
            int iHashCode = str3.hashCode();
            if (iHashCode != -1819551867) {
                if (iHashCode != 512667455) {
                    if (iHashCode == 1912999166 && str3.equals("draw_ad")) {
                        ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1043510dGH.LIZIZ, str, str2, null, new AwS1S3000000_16(str4, str5, 0));
                        return;
                    }
                    return;
                }
                if (!str3.equals("result_ad_bg")) {
                    return;
                }
                ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1043510dGH.LIZLLL, str, str2, null, new AwS1S3000000_16(str4, str5, 2));
                return;
            }
            if (!str3.equals("result_ad")) {
                return;
            }
            ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1043510dGH.LIZJ, str, str2, null, new AwS1S3000000_16(str4, str5, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.log.IAdWebLogService
    public final void LIZJ(String str, String str2, String str3, String str4, String str5, boolean z, int i, int i2, C1035880d3y c1035880d3y) {
        String str6 = str;
        if (C123100dR.LIZ(str6)) {
            InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
            C1023960ckk c1023960ckk = C1041470dCz.LIZ;
            if (str6 == null) {
                str6 = "";
            }
            interfaceC1009950cO9.logAd(c1023960ckk, str6, str2, null, new C1041460dCy(str3, str4, str5, z, i, i2, c1035880d3y));
            return;
        }
        if (c1035880d3y != null && c1035880d3y.getNonAdWebModel() != null) {
            C1040580dBY c1040580dBY = new C1040580dBY(c1035880d3y);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LIZIZ);
        }
    }
}
