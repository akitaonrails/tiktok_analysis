package com.ss.android.ugc.trill.download.protocol.download;

import X.AbstractC1382550m57;
import X.C086I;
import X.C1379810m0h;
import X.C1382690m5L;
import X.C1382800m5W;
import X.C262380AQa;
import X.C729980SkG;
import X.C844250X9z;
import X.InterfaceC21171017t6;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.download.protocol.DefaultDownloadAbilityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeVideoDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol<C1379810m0h> {
    public final List<String> LLILLL;
    public final String LLILZ;
    public final C1382690m5L LLILZIL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC21171017t6 LIZLLL() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final String LJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0m5L] */
    public AwemeVideoDownloadAbilityProtocol(C1379810m0h c1379810m0h) {
        String strLJFF;
        super(c1379810m0h);
        ArrayList arrayList = new ArrayList();
        UrlModel urlModel = c1379810m0h.LJIILJJIL.LIZ;
        if (urlModel != null && !C086I.LIZIZ(urlModel.getUrlList())) {
            int iIntValue = ((Number) C262380AQa.LIZ.getValue()).intValue();
            for (int i = 0; i < iIntValue; i++) {
                Aweme aweme = ((AbstractC1382550m57) this.LL).LJFF;
                if (aweme != null && aweme.getDownloadWithoutWatermark() && C729980SkG.LJIIIIZZ(aweme) && i == 0) {
                    String str = (String) ListProtector.get(urlModel.getUrlList(), urlModel.getUrlList().size() - 1);
                    if (a0.LJJIIZI(str, "ratio", false)) {
                        strLJFF = new Regex("(ratio=[^&]*)").replace(str, "ratio=default");
                    } else {
                        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                        builderBuildUpon.appendQueryParameter("ratio", "default");
                        strLJFF = builderBuildUpon.toString();
                    }
                } else {
                    strLJFF = (String) ListProtector.get(urlModel.getUrlList(), i % urlModel.getUrlList().size());
                }
                Aweme aweme2 = ((AbstractC1382550m57) this.LL).LJFF;
                if (!TextUtils.isEmpty(strLJFF) && strLJFF.contains("aweme/v1/play")) {
                    strLJFF = C844250X9z.LIZ(strLJFF).LJFF();
                }
                String strLIZ = C1382800m5W.LIZ(aweme2, strLJFF);
                if (strLIZ != null) {
                    strLJFF = strLIZ;
                }
                arrayList.add(strLJFF);
            }
        }
        this.LLILLL = arrayList;
        String aid = c1379810m0h.LJFF.getAid();
        this.LLILZ = aid == null ? "" : aid;
        this.LLILZIL = new InterfaceC21171017t6() { // from class: X.0m5L
            @Override // X.InterfaceC21171017t6
            public final void LIZ() {
            }

            @Override // X.InterfaceC21171017t6
            public final void onCancel() {
            }

            @Override // X.InterfaceC21171017t6
            public final void onFailed() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = false;
            }

            @Override // X.InterfaceC21171017t6
            public final void onStart() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = true;
            }

            @Override // X.InterfaceC21171017t6
            public final void onSuccess() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = false;
            }
        };
    }
}
