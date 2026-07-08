package com.ss.android.ugc.aweme.ecommerce.dependency.live;

import X.AbstractC1538680q8w;
import X.C04TD;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0XQS;
import X.C0XQT;
import X.C1143920fsE;
import X.C1388190mED;
import X.C1610670s13;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C1735010vFb;
import X.C189200o6;
import X.C19FO;
import X.C1AEQ;
import X.C1AF0;
import X.C20748616Hc;
import X.C2252611DEt;
import X.C291230BbF;
import X.InterfaceC1364105Vn;
import X.InterfaceC20673515v3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.IWindowLivePlayerCompat;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveDependencyService implements ILiveDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void clearSafeZone() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().clearSafeZone();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public int getInternalWindowState() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().getInternalWindowState();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void hideInternalWindow() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().hideInternalWindow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInitedLiveSDK() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).isInitedLiveSDK();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInternalWindowMute() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().isInternalWindowMute();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean isInternalWindowUserManualMute() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().isInternalWindowUserManualMute();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public Boolean isPlaying() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void resetInternalWindow() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().resetInternalWindow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void resetUserManualMuteClickState() {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().resetUserManualMuteClickState();
    }

    public static ILiveDependencyService createILiveDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILiveDependencyService.class, z);
        if (objLIZ != null) {
            return (ILiveDependencyService) objLIZ;
        }
        if (C04TD.z == null) {
            synchronized (ILiveDependencyService.class) {
                if (C04TD.z == null) {
                    C04TD.z = new LiveDependencyService();
                }
            }
        }
        return C04TD.z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void addLiveDuration(long j) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().addLiveDuration(j);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean canShowInternalWindow(Long l) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().canShowInternalWindow(l);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void muteInternalWindow(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIZ(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w) {
        if (abstractC1538680q8w == null) {
            return;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).registerSubSparkPlugin(abstractC1538680q8w);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setCurrentPlayerMute(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setLiveAudioControllerIntercept(boolean z) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.e0(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setLiveFunnelSession(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().setLiveFunnelSession(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void setResumeAfterMediaConflict(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().setResumeAfterMediaConflict(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void stopLivePlayer(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().LIZIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void avatarImageStartAnimation(View view, Boolean bool) {
        if (!(view instanceof C1610670s13)) {
            C1AF0.LIZJ("avatarImageWithLive is not AvatarImageWithLive");
            return;
        }
        C1610670s13 c1610670s13 = (C1610670s13) view;
        c1610670s13.setUseLiveAnimStyle(Intrinsics.LJFF(bool, Boolean.TRUE));
        c1610670s13.LJFF(true);
        C1143920fsE c1143920fsE = c1610670s13.LLIZ;
        if (c1143920fsE != null) {
            c1143920fsE.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public View createAvatarImageWithLive(Context context, String str) {
        C1610670s13 c1610670s13 = new C1610670s13(context, null);
        c1610670s13.setImageUrl(str);
        return c1610670s13;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public View createLiveCircleView(Context context, int i) {
        C1610770s1D c1610770s1D = new C1610770s1D(context);
        c1610770s1D.setStrokeWidth(i);
        return c1610770s1D;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public boolean startLiveFeed(Context context, RouteIntent routeIntent) {
        C1AEQ.LIZ.getClass();
        if (routeIntent != null && context != null) {
            AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(context, routeIntent, 170);
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (!iAccountService.LJIIJ().isLogin()) {
                ILoginService iLoginServiceLIZJ = iAccountService.LIZJ();
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = C1388190mED.LIZ(context);
                c0xqs.LJ = new C20748616Hc(awS434S0200000_33, 5);
                iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                return true;
            }
            awS434S0200000_33.invoke();
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().onImageLoaded(z, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void liveCircleViewStartAnimation(boolean z, View view, View view2, View view3) {
        if (!(view3 instanceof C1610770s1D)) {
            C1AF0.LIZJ("avatarCircleView is not LiveCircleView");
        } else {
            new C1610740s1A(z, view, view2, (C1610770s1D) view3).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void updateSafeZone(int i, int i2, int i3, int i4) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().updateSafeZone(i, i2, i3, i4);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public Object windowLivePlayProxy(C19FO c19fo, StreamUrlStruct streamUrlStruct, C1735010vFb c1735010vFb, String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        EnterRoomConfig enterRoomConfig;
        if (c1735010vFb == null) {
            enterRoomConfig = null;
        } else {
            enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = c1735010vFb.LIZ;
            roomsData.enterFromMerge = "shop";
            roomsData.enterMethod = "live_cover";
            roomsData.actionType = "click";
            enterRoomConfig.mECData.ecCommonExtraParam.put("source_previous_page", "shop_mini_window");
            enterRoomConfig.mLogData.sourceBtmToken = c1735010vFb.LIZIZ;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (C291230BbF.LIZ() > 0) {
            C189200o6.m2constructorimpl(true);
            c2252611DEt.resumeWith(true);
        } else {
            IWindowLivePlayerCompat iWindowLivePlayerCompat = (IWindowLivePlayerCompat) PluggableExtentionKt.pluggableSpi$default(IWindowLivePlayerCompat.class, false, false, false, 14, null);
            if (iWindowLivePlayerCompat != null) {
                iWindowLivePlayerCompat.LIZ(c19fo, streamUrlStruct, enterRoomConfig, str, map);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService
    public void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().showInternalWindow(activity, dialogFragment, bool, map, num, num2, num3, num4);
    }
}
