package com.ss.android.ugc.aweme.ecommercelive.audience.common.service;

import X.C099F;
import X.C1311670kEn;
import X.C183S;
import X.C188I;
import X.InterfaceC1364105Vn;
import X.InterfaceC1611000s1a;
import X.InterfaceC999030c6X;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public interface IEcommerceLiveService {
    boolean Ba();

    boolean Ch();

    boolean K6();

    List<C1311670kEn> LJJII();

    InterfaceC999030c6X LJJIII();

    boolean LJJIIJ();

    void LJJIIJZLJL(String str, String str2);

    boolean LJJIIZ();

    void LJJIIZI(long j, C099F c099f);

    C188I LJJIJ();

    long LJJIJIIJI();

    boolean LJJIJIIJIL(String str);

    void LJJIJIL(Fragment fragment, Map map);

    void LJJIJL(Fragment fragment, Map map);

    InterfaceC1611000s1a LJJIJLIJ();

    Pair<Boolean, List<String>> LJJIL();

    C183S LJJIZ();

    void LJJJ(List<? extends Aweme> list);

    LifecycleObserver Nf();

    boolean Pf(int i, String str, boolean z, boolean z2);

    boolean Wh();

    void Xt(int i, long j, HashMap map);

    void Yt(long j, HashMap<String, String> map, LifecycleOwner lifecycleOwner);

    void fw(Integer num, String str, Map map);

    n getLiveRelatedProductInfo(String str, String str2);

    Map<String, String> getRoomInfo();

    String il(String str, Map<String, String> map);

    boolean isECVisible(Room room);

    boolean lf();

    Object reportAction(String str, String str2, String str3, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean s7();

    void setCurrentRoomId(Long l);

    void startVideoPlaybackActivity(Context context, RouteIntent routeIntent);

    void startVideoReplayActivity(Context context, RouteIntent routeIntent);

    boolean zs();
}
