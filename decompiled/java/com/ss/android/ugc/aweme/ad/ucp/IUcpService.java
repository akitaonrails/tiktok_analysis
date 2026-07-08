package com.ss.android.ugc.aweme.ad.ucp;

import X.C19EG;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpRouterInterceptor;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS89S1200000_4;

/* JADX INFO: loaded from: classes5.dex */
public interface IUcpService {
    void LIZ(int i, CommonAdData commonAdData);

    void LIZIZ();

    boolean LIZJ();

    boolean LIZLLL(AwemeRawAd awemeRawAd);

    boolean LJ(C19EG c19eg, Intent intent);

    boolean LJFF(Uri uri, AwemeRawAd awemeRawAd);

    boolean LJI(C19EG c19eg, Intent intent);

    boolean LJII(Uri uri);

    boolean LJIIIIZZ(Uri uri, AwemeRawAd awemeRawAd);

    <T> T LJIIIZ(Class<T> cls);

    void LJIIJ(AwemeRawAd awemeRawAd);

    void LJIIJJI(AwemeRawAd awemeRawAd, AwS89S1200000_4 awS89S1200000_4);

    boolean LJIIL(C19EG c19eg, Intent intent);

    UcpRouterInterceptor getInterceptor();
}
