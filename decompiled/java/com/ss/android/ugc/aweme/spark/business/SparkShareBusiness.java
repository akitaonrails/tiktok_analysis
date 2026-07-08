package com.ss.android.ugc.aweme.spark.business;

import X.AbstractC1968807nS;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class SparkShareBusiness extends AbsSparkShareBusiness {
    public WebView LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0266  */
    @Override // com.ss.android.ugc.aweme.spark.business.AbsSparkShareBusiness
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.business.SparkShareBusiness.LIZJ():void");
    }

    public final String LIZLLL() {
        Map<String, String> params = this.LIZ.getParams();
        if (params != null) {
            return params.get("aweme_id");
        }
        return null;
    }

    public final boolean LJ() {
        String str;
        Map<String, String> params = this.LIZ.getParams();
        if (params != null && (str = params.get("anchor_type")) != null && CastIntegerProtector.parseInt(str) > 0) {
            return true;
        }
        Map<String, String> params2 = this.LIZ.getParams();
        if (TextUtils.equals(params2 != null ? params2.get("is_iab") : null, "1")) {
            return true;
        }
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService == null) {
            return false;
        }
        Map<String, String> params3 = this.LIZ.getParams();
        Aweme awemeEr = iAwemeService.Er(params3 != null ? params3.get("aweme_id") : null);
        return awemeEr != null && AwemeExtKt.isAdTraffic(awemeEr);
    }

    public SparkShareBusiness(AbstractC1968807nS abstractC1968807nS) {
        super(abstractC1968807nS);
    }
}
