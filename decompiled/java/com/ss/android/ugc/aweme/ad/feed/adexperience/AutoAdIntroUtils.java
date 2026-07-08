package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C04TD;
import X.C1003340cDU;
import X.C1027410cqJ;
import X.C1027580cqa;
import X.C2188811AlT;
import X.C770750ULh;
import X.C844470XAv;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class AutoAdIntroUtils implements IAutoAdIntroUtils {
    public final C770750ULh LIZ;
    public final C770750ULh LIZIZ;

    public static IAutoAdIntroUtils LIZLLL() {
        Object objLIZ = C04TD.LIZ(IAutoAdIntroUtils.class, false);
        if (objLIZ != null) {
            return (IAutoAdIntroUtils) objLIZ;
        }
        if (C04TD.LJLJL == null) {
            synchronized (IAutoAdIntroUtils.class) {
                if (C04TD.LJLJL == null) {
                    C04TD.LJLJL = new AutoAdIntroUtils();
                }
            }
        }
        return C04TD.LJLJL;
    }

    public AutoAdIntroUtils() {
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LIZLLL = 1;
        c770750ULh.LJIJ = true;
        C844470XAv.LIZ.getClass();
        c770750ULh.LJII(C844470XAv.LIZ().getString(2131826892), AFwS252S0000000_16.get$arr$(77));
        this.LIZ = c770750ULh;
        C770750ULh c770750ULh2 = new C770750ULh();
        c770750ULh2.LIZLLL = 1;
        c770750ULh2.LJIJ = true;
        c770750ULh2.LJII(C844470XAv.LIZ().getString(2131826892), AFwS252S0000000_16.get$arr$(76));
        this.LIZIZ = c770750ULh2;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAutoAdIntroUtils
    public final TuxSheet LIZ(AdDisclaimer adDisclaimer, String str, int i, AwemeRawAd awemeRawAd) {
        AutoData autoData;
        Map<String, AutoData> map = adDisclaimer.autoDataMap;
        if (map != null && (autoData = map.get(str)) != null) {
            return LIZIZ(autoData, str, i, awemeRawAd, 1, 0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAutoAdIntroUtils
    public final TuxSheet LIZIZ(AutoData autoData, String str, int i, AwemeRawAd awemeRawAd, int i2, int i3) {
        C770750ULh c770750ULh;
        String string;
        String fullText;
        if (awemeRawAd == null) {
            return null;
        }
        if (i2 == 1) {
            c770750ULh = this.LIZ;
        } else {
            c770750ULh = this.LIZIZ;
        }
        c770750ULh.LIZJ = new AwS595S0100000_16(autoData, 61);
        String buttonText = awemeRawAd.getButtonText();
        if (buttonText == null || !(!a0.LJJJIL(buttonText))) {
            C844470XAv.LIZ.getClass();
            buttonText = C844470XAv.LIZ().getString(2131826891);
        }
        String str2 = "";
        if (i != 1) {
            if (i != 2) {
                string = "";
            } else {
                C844470XAv.LIZ.getClass();
                string = C844470XAv.LIZ().getString(2131826893);
            }
        } else {
            C844470XAv.LIZ.getClass();
            string = C844470XAv.LIZ().getString(2131826894);
        }
        c770750ULh.LJ = string;
        if (!TextUtils.isEmpty(autoData.getFullText()) ? (fullText = autoData.getFullText()) != null : (fullText = autoData.getText()) != null) {
            str2 = fullText;
        }
        c770750ULh.LJFF = str2;
        c770750ULh.LJI(buttonText, new C1003340cDU(this, autoData, awemeRawAd, i2, i3, str, i));
        return c770750ULh.LIZIZ().LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAutoAdIntroUtils
    public final void LIZJ(Context context, String str, String str2, String str3, AwemeRawAd awemeRawAd, boolean z) {
        long jLongValue;
        long jLongValue2;
        if (context == null) {
            return;
        }
        C1027580cqa c1027580cqa = new C1027580cqa();
        c1027580cqa.LJJIII(str2);
        c1027580cqa.LJJII(z);
        c1027580cqa.LJ(awemeRawAd);
        c1027580cqa.LJJIJL("draw_ad");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draw_ad_");
        sbLIZ.append(str);
        c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
        Long adId = awemeRawAd.getAdId();
        long jLongValue3 = 0;
        if (adId != null) {
            jLongValue = adId.longValue();
        } else {
            jLongValue = 0;
        }
        c1027580cqa.LIZ(jLongValue);
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId != null) {
            jLongValue2 = creativeId.longValue();
        } else {
            jLongValue2 = 0;
        }
        c1027580cqa.LJI(jLongValue2);
        c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            jLongValue3 = groupId.longValue();
        }
        c1027580cqa.LJIILIIL(jLongValue3);
        if (C1027410cqJ.LIZLLL(context, c1027580cqa.LIZ).LIZ()) {
            return;
        }
        c1027580cqa.LJJJIL(str3);
        c1027580cqa.LIZ.LIZIZ.LJJIZ = true;
        c1027580cqa.LJIJ(awemeRawAd.getWebviewType());
        c1027580cqa.LJIILLIIL(1);
        C1027410cqJ.LIZ(context, c1027580cqa.LIZ).LIZ();
    }
}
