package com.ss.android.ugc.aweme.commercialize.live.service;

import X.C0X9S;
import X.InterfaceC1016620cYu;
import X.InterfaceC990070bs5;
import X.InterfaceC999040c6Y;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommercializeLiveService {
    void LIZ(JSONObject jSONObject);

    boolean LIZIZ();

    void LIZJ(Aweme aweme);

    InterfaceC990070bs5 LIZLLL(FrameLayout frameLayout);

    boolean LJ(Aweme aweme);

    AdLiveEnterRoomConfig LJFF(Aweme aweme, AwemeRawAd awemeRawAd, int i, String str);

    InterfaceC1016620cYu LJI();

    String LJII(Aweme aweme, boolean z);

    void LJIIIIZZ(Integer num, Long l, String str, String str2);

    void LJIIIZ(Context context, Aweme aweme, int i, User user, boolean z);

    void LJIIJ();

    C0X9S LJIIJJI(int i, String str, String str2, long j, String str3, String str4);

    InterfaceC999040c6Y LJIIL();

    void LJIILIIL(JSONObject jSONObject);

    void LJIILJJIL(Aweme aweme, EnterRoomConfig enterRoomConfig, int i, String str);

    InterfaceC999040c6Y LJIILL();

    void LJIILLIIL(JSONObject jSONObject);

    String LJIIZILJ(Aweme aweme);

    void LJIJ(String str, String str2, Map map);

    void LJIJI(Context context, Aweme aweme, User user);

    String Rj(String str);
}
