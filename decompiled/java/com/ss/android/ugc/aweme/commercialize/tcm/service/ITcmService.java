package com.ss.android.ugc.aweme.commercialize.tcm.service;

import X.C05NB;
import X.C1050500dRY;
import X.C1209820haW;
import X.InterfaceC1028200cra;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import kotlin.jvm.internal.AwS260S0300000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface ITcmService {
    void LIZ(JSONObject jSONObject);

    boolean LIZIZ(Aweme aweme, String str);

    C1209820haW LIZJ(Context context, ViewGroup viewGroup);

    void LIZLLL(Context context, Aweme aweme);

    C1050500dRY LJ(Context context, Aweme aweme, String str, AwS260S0300000_16 awS260S0300000_16);

    void LJFF(Aweme aweme, String str);

    void LJI(C05NB c05nb);

    TcmConfig LJII();

    boolean LJIIIIZZ(Aweme aweme, String str);

    int LJIIIZ(Integer num);

    TcmOrderStatusBottomBarTrigger LJIIJ();

    boolean LJIIJJI();

    int LJIIL();

    void LJIILIIL(Context context, Aweme aweme);

    Integer LJIILJJIL();

    void LJIILL(Aweme aweme, Activity activity);

    void LJIILLIIL(JSONObject jSONObject);

    void LJIIZILJ(Context context, IESJsBridge iESJsBridge, InterfaceC1028200cra interfaceC1028200cra);
}
