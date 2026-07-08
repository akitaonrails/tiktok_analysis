package com.ss.android.ugc.aweme.ad.subpage;

import X.C01GW;
import X.C0SCL;
import X.C1035880d3y;
import X.C1037780d72;
import X.C1037820d76;
import X.C452501pT;
import X.InterfaceC1037760d70;
import X.InterfaceC1041500dD2;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLandPageService implements ICommerceLandPageService {
    public static final /* synthetic */ int LLILLL = 0;
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1037820d76());

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final C1037780d72 LIZ() {
        return (C1037780d72) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().Fd1(sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void TQ1(Aweme aweme) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().TQ1(aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2
      0x001f: PHI (r2v1 T extends X.0d70) = (r2v0 T extends X.0d70), (r2v4 T extends X.0d70) binds: [B:6:0x001a, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.InterfaceC1037760d70> T VW0(java.lang.Class<T> r4) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.subpage.CommerceLandPageService.VW0(java.lang.Class):X.0d70");
    }

    @Override // X.InterfaceC1037760d70
    public final void r3(Aweme aweme) {
        this.LL = true;
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().r3(aweme);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void Ou(SparkContext sparkContext, Context context) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().Ou(sparkContext, context);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().Ox0(jSONObject, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void Yi0(int i, List<? extends Aweme> list) {
        if (!this.LL) {
            return;
        }
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().Yi0(i, list);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().gz1(c0scl, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().tU(c1035880d3y, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void wK1(SparkContext sparkContext, String str) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().wK1(sparkContext, str);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().cT(c1035880d3y, webView, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void hv(SparkContext sparkContext, int i, String str) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().hv(sparkContext, i, str);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().mf1(c1035880d3y, webView, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().z82(str, str2, interfaceC1041500dD2, sparkContext);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
        boolean zLJI = MethodIDManager.LJI(71986);
        Iterator<InterfaceC1037760d70> it2 = LIZ().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().vE0(str, interfaceC1041500dD2, z, awemeRawAd, str2, str3, str4);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
