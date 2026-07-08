package com.ss.android.ugc.aweme.social.creation.mediapicker;

import X.C01GW;
import X.C0BWR;
import X.C0C64;
import X.C0L9L;
import X.C0LJD;
import X.C0LJE;
import X.C0M8Q;
import X.C1669670tYD;
import X.C19719212De;
import X.C19EG;
import X.C263630AUv;
import X.C281190B0j;
import X.C306760C0s;
import X.C562680M5a;
import X.C562690M5b;
import X.C563530M8h;
import X.C563770M9f;
import X.C563830M9l;
import X.EnumC1427810nG7;
import X.EnumC563950M9x;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class SocMediaPickerServiceImpl implements SocMediaPickerService {
    public final C563770M9f LIZ = new C563770M9f();

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService
    public final SocialMediaPickerConfig LIZ() {
        SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = new SocialMediaPickerConfig.TitleAreaUIConfig(false, false, null, null);
        C01GW c01gw = C0BWR.LIZ;
        SocialMediaPickerConfig.MultiEntranceAreaUIConfig multiEntranceAreaUIConfig = new SocialMediaPickerConfig.MultiEntranceAreaUIConfig(((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2);
        SocialMediaPickerConfig.StickySelectorAreaUIConfig stickySelectorAreaUIConfig = new SocialMediaPickerConfig.StickySelectorAreaUIConfig(false, false);
        SocialMediaPickerConfig.TabAreaUIConfig tabAreaUIConfig = new SocialMediaPickerConfig.TabAreaUIConfig(null, null, 3, null);
        SocialMediaPickerConfig.MediaAreaUIConfig mediaAreaUIConfig = new SocialMediaPickerConfig.MediaAreaUIConfig(((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2, false, false, C0L9L.WIDTH_HEIGHT_9_16, C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_story_album_long_press_exp", true) == 0);
        boolean z = ((Boolean) C281190B0j.LIZIZ.getValue()).booleanValue() || C306760C0s.LIZ();
        C263630AUv.LIZ.getClass();
        return new SocialMediaPickerConfig(new SocialMediaPickerConfig.PageUIConfig(false, EnumC563950M9x.STORY_STYLE, false), titleAreaUIConfig, multiEntranceAreaUIConfig, stickySelectorAreaUIConfig, tabAreaUIConfig, mediaAreaUIConfig, new SocialMediaPickerConfig.MediaLoadingStrategy(C0LJE.IMAGE_AND_VIDEO, false, false, ((Boolean) C263630AUv.LIZIZ.getValue()).booleanValue() ? C0LJD.FLOAT_BOTTOM : C0LJD.FIXED_TOP), new SocialMediaPickerConfig.MediaSelectorStrategy(false, 35, false, false), false, false, z);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService
    public final C563770M9f LIZLLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService
    public final SocialCreationMediaPickerScene LIZJ(C19EG c19eg, String str, Bundle bundle, EnterStoryParam enterStoryParam, C0M8Q c0m8q) {
        return C563830M9l.LIZIZ(c19eg, bundle, enterStoryParam, str, null, null, null, c0m8q, 56);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService
    public final ComposeView LIZIZ(ComponentActivity componentActivity, String str, EnterStoryParam enterStoryParam, C0M8Q c0m8q, Long l, Long l2, Boolean bool, ViewModelStoreOwner viewModelStoreOwner) {
        ViewModelStore viewModelStore;
        EnumC1427810nG7 enumC1427810nG7;
        if (viewModelStoreOwner == null || (viewModelStore = viewModelStoreOwner.getViewModelStore()) == null) {
            viewModelStore = componentActivity.getViewModelStore();
        }
        C562690M5b c562690M5bLIZ = C563830M9l.LIZ(enterStoryParam, str, viewModelStore, new C563530M8h(componentActivity.getApplication(), componentActivity, componentActivity, new AwS552S0100000_8(componentActivity, 833)));
        EnterStoryParam enterStoryParam2 = c562690M5bLIZ.LIZ;
        SocialMediaPickerViewModel socialMediaPickerViewModel = c562690M5bLIZ.LIZIZ;
        ComposeView composeView = new ComposeView(componentActivity, null, 6);
        if (socialMediaPickerViewModel.LL.getPageUIConfig().getSupportDaylightMode()) {
            enumC1427810nG7 = EnumC1427810nG7.Auto;
        } else {
            enumC1427810nG7 = EnumC1427810nG7.Dark;
        }
        C1669670tYD.LJ(composeView, enumC1427810nG7, new C19719212De(999826781, new C562680M5a(socialMediaPickerViewModel, c0m8q, componentActivity, l2, enterStoryParam2, l, bool), true));
        return composeView;
    }
}
