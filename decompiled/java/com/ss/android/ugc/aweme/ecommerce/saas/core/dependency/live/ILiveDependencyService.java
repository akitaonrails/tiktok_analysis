package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live;

import X.AbstractC1538680q8w;
import X.C1735010vFb;
import X.C19FO;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public interface ILiveDependencyService extends IECommerceHostService {
    void addLiveDuration(long j);

    void avatarImageStartAnimation(View view, Boolean bool);

    boolean canShowInternalWindow(Long l);

    void clearSafeZone();

    View createAvatarImageWithLive(Context context, String str);

    View createLiveCircleView(Context context, int i);

    int getInternalWindowState();

    void hideInternalWindow();

    boolean isInitedLiveSDK();

    boolean isInternalWindowMute();

    boolean isInternalWindowUserManualMute();

    Boolean isPlaying();

    void liveCircleViewStartAnimation(boolean z, View view, View view2, View view3);

    void muteInternalWindow(boolean z);

    void onImageLoaded(boolean z, String str, JSONObject jSONObject);

    void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w);

    void resetInternalWindow();

    void resetUserManualMuteClickState();

    void setCurrentPlayerMute(boolean z);

    void setLiveAudioControllerIntercept(boolean z);

    void setLiveFunnelSession(boolean z);

    void setResumeAfterMediaConflict(boolean z);

    void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4);

    boolean startLiveFeed(Context context, RouteIntent routeIntent);

    void stopLivePlayer(boolean z);

    void updateSafeZone(int i, int i2, int i3, int i4);

    Object windowLivePlayProxy(C19FO c19fo, StreamUrlStruct streamUrlStruct, C1735010vFb c1735010vFb, String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
