package com.tiktok.ttf.image.task;

import X.C080U;
import X.C1494850p0F;
import X.C828420Wee;
import X.InterfaceC1329940kiG;
import X.InterfaceC1334000koo;
import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface IInitImageHook {
    void LIZ(JSONObject jSONObject);

    boolean LIZIZ();

    InterfaceC1329940kiG LIZJ();

    void LIZLLL(Uri uri, long j, boolean z, C1494850p0F c1494850p0F);

    int LJ();

    boolean LJFF();

    Boolean LJI();

    boolean LJII();

    boolean LJIIIIZZ();

    boolean LJIIIZ();

    InterfaceC1334000koo LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL();

    boolean LJIILIIL();

    float LJIILJJIL();

    C828420Wee LJIILL(Boolean bool, String str, Map map);

    C080U LJIILLIIL();

    boolean LJIIZILJ();

    void LJIJ(String str);

    int getNetworkType();

    String getTTMockFakeImgUrl();

    void monitorCommonLog(String str, JSONObject jSONObject);
}
