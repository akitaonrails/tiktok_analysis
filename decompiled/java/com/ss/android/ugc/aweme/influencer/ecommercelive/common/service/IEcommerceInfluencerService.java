package com.ss.android.ugc.aweme.influencer.ecommercelive.common.service;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.n;
import java.util.List;
import org.json.JSONObject;
import webcast.data.BottomContainerComponent;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes33.dex */
public interface IEcommerceInfluencerService {
    String Bb(String str, JSONObject jSONObject);

    void Gi(String str, JSONObject jSONObject);

    void I7(TopRightBannerContainerComponent topRightBannerContainerComponent, boolean z);

    void LIZ(Bundle bundle, FragmentManager fragmentManager);

    void LIZIZ(Bundle bundle, FragmentManager fragmentManager);

    void LIZJ(Bundle bundle, FragmentManager fragmentManager);

    List<IInterceptor> LIZLLL();

    void LJ(String str, String str2);

    String Tv(int i, GoLiveECIconInfo goLiveECIconInfo);

    String Xh(GoLiveECIconInfo goLiveECIconInfo);

    View Yk(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner);

    void in(BottomContainerComponent bottomContainerComponent, boolean z);

    boolean kp();

    void ld(String str);

    int ln();

    void nj(Long l);

    View oa(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent);

    n tl();

    boolean vo(SecondaryBannerComponent secondaryBannerComponent);

    boolean wg(String str);
}
