package com.bytedance.android.livesdk.comp.api.game.service;

import X.C006A;
import X.C01GU;
import X.C1050980dSK;
import X.C1084710eKj;
import X.C1105940esy;
import X.C1869750ykv;
import X.C1878890yzf;
import X.C1881050z39;
import X.C1881370z3f;
import X.C1881470z3p;
import X.C1882550z5Z;
import X.C1882810z5z;
import X.C1884390z8X;
import X.C197400pQ;
import X.C843920X8s;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONObject;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface IGamePartnershipService extends C006A {
    void At(String str, String str2);

    void BP0(Activity activity, String str, String str2, Function2<? super JSONObject, ? super UserInfo, Unit> function2);

    C1881370z3f Ce0(Context context);

    C1105940esy EU0();

    void GB1(DataChannel dataChannel, boolean z);

    void Gf(int i, String str, String str2, long j, String str3, String str4);

    C1882810z5z HU0();

    C843920X8s Je0();

    boolean Mn(String str);

    void Nq0(Context context, Room room, DataChannel dataChannel, Function1<? super C1869750ykv, Unit> function1);

    C1878890yzf S32();

    C1084710eKj UK1();

    C1884390z8X V01();

    Boolean Vd1(long j);

    BriefGameTask Vg0();

    void Wo2(long j, Function1<? super AnchorRoomInfoResponse.ResponseData, Unit> function1);

    void Yb2(Context context, Room room, DataChannel dataChannel, Boolean bool);

    void bO(Context context, String str, String str2);

    Class<? extends LiveRecyclableWidget> bV0();

    C1881050z39 cg2(Context context, Room room, DataChannel dataChannel, int i, Map map, String str, AwS603S0100000_24 awS603S0100000_24, AwS607S0100000_28 awS607S0100000_28);

    C197400pQ fy0();

    void hn1(Activity activity, String str, Map<String, String> map, boolean z);

    C1882550z5Z iz0(Context context);

    C1881470z3p jn2(long j, Context context);

    void kA2(Room room);

    void kr1(long j, DataChannel dataChannel);

    boolean m71(int i, long j, String str, boolean z);

    C01GU oK0();

    void oU0(Context context, String str, Map<String, String> map);

    boolean pW0(long j, List<PartnershipGameOfflineMessage.OfflineGameInfo> list);

    void pv(Activity activity, String str, Map map, C1050980dSK c1050980dSK);

    void r11(Context context, String str, String str2, String str3);

    boolean rp(String str, String str2, String str3, long j, String str4, int i, String str5, String str6, String str7, String str8);

    void s40(Room room);

    void tm0(DataChannel dataChannel, Long l);
}
