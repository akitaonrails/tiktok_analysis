package com.ss.android.ugc.aweme.im.saas.host.api.feature.push;

import X.C06QH;
import X.C0Y8T;
import X.C0YTA;
import X.C19323510in;
import X.C869590Y9l;
import X.C892090Yz9;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
@Feature(id = "push", name = "Push")
public interface PushFeature {
    public static final C06QH LIZ = C06QH.LIZ;

    void LIZ();

    void LIZIZ();

    Map<String, String> LIZJ(String str, String str2);

    void LIZLLL(Activity activity, String str);

    void LJ();

    C869590Y9l LJFF(InnerPushMessage innerPushMessage);

    void LJI(C869590Y9l c869590Y9l, C0YTA c0yta);

    boolean LJII(C0Y8T c0y8t);

    String LJIIIIZZ();

    C892090Yz9 LJIIIZ(String str);

    void LJIIJ();

    C19323510in LJIIJJI(InnerPushConfig innerPushConfig, InnerPushUITemplate innerPushUITemplate, Map map, Map map2);

    void LJIIL(String str, String str2);

    InAppPushSetting LJIILIIL();

    boolean LJIILJJIL();

    void LJIILL(List<? extends C869590Y9l> list);

    void LJIILLIIL(int i, List list);

    void LJIIZILJ(String str, String str2);

    void LJIJ(int i, List list);
}
