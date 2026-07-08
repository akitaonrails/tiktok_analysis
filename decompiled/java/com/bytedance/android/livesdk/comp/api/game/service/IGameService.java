package com.bytedance.android.livesdk.comp.api.game.service;

import X.C006A;
import X.C0IF4;
import X.C0UX6;
import X.C1153020g6u;
import X.C11PQ;
import X.C11RK;
import X.C1269340j8W;
import X.C150R;
import X.C19719912Dl;
import X.C19EG;
import X.C2177041AIc;
import X.C262200zs;
import X.C468440IYo;
import X.C580610Mpv;
import X.C776440Ud0;
import X.C776710UdR;
import X.InterfaceC471600IeU;
import X.InterfaceC773130UUl;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameInGameRankDialog;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameScreenShareTipsDialog;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneAsCameraFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdk.game.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastChooseFragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryFragment;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverMarkWidget;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.InGameRankSettingResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IGameService extends C006A, C0IF4 {
    GameInGameRankDialog BQ1();

    void CE0(Fragment fragment, long j);

    C19719912Dl CH0();

    void DI1(FragmentManager fragmentManager, boolean z, Context context);

    GameAutoCoverWidget DK(String str);

    BaseFragment F60(Map map);

    GamePhoneCameraScannerFragment HN2(Bundle bundle);

    CreateInfoResponse.ResponseData I92();

    void Iw0(Fragment fragment);

    void KT(C19EG c19eg, GameLiveFragment gameLiveFragment);

    InterfaceC471600IeU Kj2();

    void NI0();

    C2177041AIc NM1();

    boolean NQ(DataChannel dataChannel, C0UX6 c0ux6);

    void Oz0(LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    boolean RW1();

    void SD2(ACListenerS142S0100000_7 aCListenerS142S0100000_7);

    C1153020g6u Tk1();

    void Ut(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Map<String, String> map, C580610Mpv c580610Mpv);

    void VN0(Fragment fragment, DataChannel dataChannel);

    PushStreamInfo.Quality WG1();

    void WI();

    void WK();

    void Wp1(String str, String str2);

    void YD(String str);

    PreviewMultiDeviceInterruptGuide Z70(Fragment fragment);

    void ae1();

    void bx2(int i);

    void cR0(Context context, String str, Map map);

    Pair<Float, Float> dQ1();

    boolean dU();

    C262200zs dm2();

    C150R e52();

    GameDrawerCategoryFragment e90(Object obj, Object obj2);

    GameScreenShareTipsDialog eq0(FragmentManager fragmentManager, AwS256S0300000_12 awS256S0300000_12);

    void hY();

    void iD0(C1269340j8W c1269340j8W);

    void initPublicScreenConfiguration();

    void iu1();

    void jN();

    void jX0(JSONObject jSONObject);

    C11PQ<InGameRankSettingResponse.ResponseData> kl0(LifecycleOwner lifecycleOwner, boolean z);

    void lU0();

    String ln2();

    void na1();

    GameFloatWindowTipsDialog ns1(String str);

    void ot0();

    C776440Ud0 pB0(C776710UdR c776710UdR);

    GameBroadcastFragment pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle);

    void pm2();

    void qn2(C11RK c11rk);

    void qz0();

    String r50();

    void r71(long j, LiveMode liveMode);

    GameCastChooseFragment sP2(Bundle bundle);

    GameAutoCoverMarkWidget ss0();

    void u71(PushStreamInfo.Quality quality);

    android.util.Pair<Integer, Integer> vy2(int i, int i2);

    GamePhoneAsCameraFragment wt(Map map);

    void x2();

    C19719912Dl xG0();

    C468440IYo xb1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    boolean yP1();

    void yt1(LifecycleOwner lifecycleOwner, DataChannel dataChannel, AwS591S0100000_12 awS591S0100000_12);

    void zI0();
}
