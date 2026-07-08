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
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultLiveDependencyService implements ILiveDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void addLiveDuration(long j) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void avatarImageStartAnimation(View view, Boolean bool) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean canShowInternalWindow(Long l) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void clearSafeZone() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public View createAvatarImageWithLive(Context context, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public View createLiveCircleView(Context context, int i) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public int getInternalWindowState() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void hideInternalWindow() {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInitedLiveSDK() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInternalWindowMute() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInternalWindowUserManualMute() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void liveCircleViewStartAnimation(boolean z, View view, View view2, View view3) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void muteInternalWindow(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void resetInternalWindow() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void resetUserManualMuteClickState() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setCurrentPlayerMute(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setLiveAudioControllerIntercept(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setLiveFunnelSession(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setResumeAfterMediaConflict(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean startLiveFeed(Context context, RouteIntent routeIntent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void stopLivePlayer(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void updateSafeZone(int i, int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public Boolean isPlaying() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public Object windowLivePlayProxy(C19FO c19fo, StreamUrlStruct streamUrlStruct, C1735010vFb c1735010vFb, String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }
}
