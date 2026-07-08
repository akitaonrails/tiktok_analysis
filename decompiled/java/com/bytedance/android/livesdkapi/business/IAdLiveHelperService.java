package com.bytedance.android.livesdkapi.business;

import X.C006A;
import Y.AObjectS382S0100000_7;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface IAdLiveHelperService extends C006A {
    void Bn1(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);

    void Gw2(Uri uri, EnterRoomConfig enterRoomConfig);

    long g42();

    void iQ2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, long j);

    void oF1(String str, String str2, String str3, Map map, Map map2);

    void yR0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, AObjectS382S0100000_7 aObjectS382S0100000_7);
}
