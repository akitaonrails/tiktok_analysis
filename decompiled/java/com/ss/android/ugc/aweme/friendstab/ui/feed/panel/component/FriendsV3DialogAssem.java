package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC848400XPy;
import X.C0PEM;
import X.C0XQ7;
import X.C1388190mED;
import X.C1587220rPE;
import X.C1668306g5;
import X.C1917290zzb;
import X.C19EG;
import X.C2126108Up;
import X.C2232408os;
import X.C23250099c;
import X.C2450909j1;
import X.C278460Avk;
import X.C343710Ddh;
import X.C442570HXb;
import X.C724240Sb0;
import X.C757570Tnf;
import X.C757580Tng;
import X.EnumC439790HMj;
import X.InterfaceC1586360rNq;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3DialogAssem extends BasePanelComponent implements IFriendsDialogAbility, InterfaceC1586360rNq {
    public final void bo() {
        C19EG c19egLIZ;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), (((Number) C278460Avk.LIZ.getValue()).intValue() & 1) == 1 ? new C2232408os(C2126108Up.LIZ) : C0PEM.LIZJ, null, new C757580Tng(this, null), 2);
        SocialAvatarEffectPopupService socialAvatarEffectPopupService = (SocialAvatarEffectPopupService) PluggableExtentionKt.pluggableSpi$default(SocialAvatarEffectPopupService.class, false, false, false, 14, null);
        if (socialAvatarEffectPopupService == null || !socialAvatarEffectPopupService.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        PopupManager.LJIIZILJ(new C442570HXb(c19egLIZ, EnumC439790HMj.FRIENDS), new C1668306g5("social_social_avatar_effect_avatar_generation_prompt_friends_tab"));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        Fragment fragmentLJI;
        Context context;
        PopupInstanceConfig popupInstanceConfig;
        String strLJ;
        super.onParentViewCreated();
        C1587220rPE.LIZ.getClass();
        if (C1587220rPE.LIZLLL()) {
            bo();
            if (StateOwner.LL.LIZIZ() != null && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFriendCount() > 0 && (fragmentLJI = C724240Sb0.LJI(this)) != null && (context = fragmentLJI.getContext()) != null) {
                if (ChannelsAuthRefactorExp.INSTANCE.enabled() || ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                    IUniAuthGuidePopupApi iUniAuthGuidePopupApi = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpi$default(IUniAuthGuidePopupApi.class, false, false, false, 14, null);
                    if (iUniAuthGuidePopupApi != null) {
                        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = iUniAuthGuidePopupApi.LIZJ("friends_tab");
                        unifiedAuthPopupConfigLIZJ.setSceneId("friends_tab_scene");
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                        if (c19egLIZIZ != null) {
                            IUniAuthGuidePopupApi iUniAuthGuidePopupApi2 = (IUniAuthGuidePopupApi) PluggableExtentionKt.pluggableSpi$default(IUniAuthGuidePopupApi.class, false, false, false, 14, null);
                            if (iUniAuthGuidePopupApi2 == null || (strLJ = iUniAuthGuidePopupApi2.LJ(c19egLIZIZ)) == null) {
                                strLJ = "";
                            }
                            unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
                        }
                        unifiedAuthPopupConfigLIZJ.setEnterFrom("homepage_friends");
                        unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_friends");
                        List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                        if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                            popupInstanceConfig.setPopupCombinationType(1);
                        }
                        iUniAuthGuidePopupApi.LIZLLL(context, null, unifiedAuthPopupConfigLIZJ);
                    }
                } else {
                    INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
                    if (iNoticeService != null) {
                        iNoticeService.LJJLIIIJILLIZJL(context, new C1917290zzb(null, "homepage_friends", null, "enter_homepage_friends", null, null, null, null, "ug_338_friends", 4085));
                    }
                }
            }
        } else {
            C1587220rPE.LIZIZ.storeBoolean("has_shown_permission_dialog", true);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), (((Number) C278460Avk.LIZ.getValue()).intValue() & 1) == 1 ? new C2232408os(C2126108Up.LIZ) : C0PEM.LIZJ, null, new C757570Tnf(this, null), 2);
        }
        C2450909j1.LIZJ(new AwS568S0100000_24(this, 503));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C343710Ddh.LIZ(c19egLIZ).wQ2(this);
        }
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (Intrinsics.LJFF(str, "FRIENDS_TAB")) {
            C1587220rPE.LIZ.getClass();
            if (C1587220rPE.LIZLLL()) {
                bo();
            }
        }
    }
}
