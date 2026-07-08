package com.ss.android.ugc.aweme.socialavatar.view;

import X.C01GW;
import X.C05P0;
import X.C0HFK;
import X.C0HHA;
import X.C0HKH;
import X.C0HL2;
import X.C0HL5;
import X.C0HL8;
import X.C0HLG;
import X.C0HLH;
import X.C0HLI;
import X.C0HM9;
import X.C0ZDN;
import X.C13FE;
import X.C1669670tYD;
import X.C1684810twd;
import X.C19719212De;
import X.C20028913Yh;
import X.C20088213iq;
import X.C2252321DDq;
import X.C23250099c;
import X.C439630HLt;
import X.C452501pT;
import X.EnumC1427810nG7;
import X.EnumC437540HDs;
import X.EnumC439250HKh;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680820tqC;
import X.InterfaceC1916320zy2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSocialAvatarCameraScene extends AIGCBaseCameraScene {
    public final C05P0<Boolean> LLJZ = C20028913Yh.LJI(Boolean.TRUE);
    public final IComplianceBusinessService LLJZIJLIL = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);
    public final C01GW LLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1029));

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLLIL() {
        Object value;
        EnumC439250HKh enumC439250HKh;
        C2252321DDq c2252321DDq = ((SocialAvatarCameraSceneV2) this).LLLF.LLJILJILJ;
        do {
            value = c2252321DDq.getValue();
            enumC439250HKh = EnumC439250HKh.FAILURE_MODEL_DOWNLOAD;
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C0HL2(enumC439250HKh)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLLJIL() {
        C0HLG.LIZJ(((SocialAvatarCameraSceneV2) this).LLLF.LLJLLL, C0HLH.SHOW);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final boolean LLLLLL() {
        return false;
    }

    public abstract void LLLLLLL(Function1<? super Boolean, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    public abstract void LLLLLLLLL(C0HL5 c0hl5, InterfaceC1680820tqC interfaceC1680820tqC, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        Context context;
        SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2 = (SocialAvatarCameraSceneV2) this;
        if (Intrinsics.LJFF(socialAvatarCameraSceneV2.LLLF.LLJLLL.LJIILIIL, "complete_creation")) {
            ((ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class)).LJIILLIIL(new C0HHA(requireActivity(), "generation_page", "generation_page", null, null, 0, false, false, null, false, null, 4088), EnumC437540HDs.SUCCESSFUL, null);
            super.finish();
            return;
        }
        super.finish();
        C0HL8 c0hl8 = socialAvatarCameraSceneV2.LLLF.LLJLLL;
        if (c0hl8.LJJI) {
            String str = c0hl8.LJIIIZ;
            if (str != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), str);
                smartRouteBuildRoute.withParam(socialAvatarCameraSceneV2.LLLF.LLJLLL.LJIIJ);
                smartRouteBuildRoute.open();
            }
            Intent intent = socialAvatarCameraSceneV2.LLLF.LLJLLL.LJIIJJI;
            if (intent == null || (context = getContext()) == null) {
                return;
            }
            LocalBroadcastManager.LIZ(context).LIZJ(intent);
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onPause() {
        super.onPause();
        if (requireActivity().isFinishing()) {
            LLLLLLJ(true);
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        ((C13FE) this.LLJZ).setValue(Boolean.FALSE);
        if (!C0HM9.LIZ) {
            ((C13FE) this.LLJZ).setValue(Boolean.TRUE);
            return;
        }
        SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2 = (SocialAvatarCameraSceneV2) this;
        socialAvatarCameraSceneV2.LLLF.LLJLLL.LJIILIIL = "go_back";
        Lifecycle lifecycle = getLifecycle();
        IComplianceBusinessService iComplianceBusinessService = this.LLJZIJLIL;
        Context contextRequireContext = requireContext();
        C0HL8 c0hl8 = socialAvatarCameraSceneV2.LLLF.LLJLLL;
        String str = c0hl8.LIZ;
        String str2 = c0hl8.LIZIZ;
        final Function0 function0 = null;
        lifecycle.addObserver(iComplianceBusinessService.LJJJJLI(contextRequireContext, 2131833819, str, str2, "", new InterfaceC1916320zy2() { // from class: X.0HM8
            @Override // X.InterfaceC1916320zy2
            public final boolean goBack() {
                return false;
            }

            @Override // X.InterfaceC1916320zy2
            public final void LIZ() {
                BaseSocialAvatarCameraScene baseSocialAvatarCameraScene = this.LIZ;
                ((SocialAvatarCameraSceneV2) baseSocialAvatarCameraScene).LLLF.LLJLLL.LJIILIIL = null;
                Function0<Unit> function02 = function0;
                ((C13FE) baseSocialAvatarCameraScene.LLJZ).setValue(Boolean.TRUE);
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLL(boolean z) {
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = ((SocialAvatarCameraSceneV2) this).LLLF;
        socialAvatarCreationViewModelV2.LLJLLL.LJIIL = Boolean.valueOf(z);
        socialAvatarCreationViewModelV2.zQ2(socialAvatarCreationViewModelV2.xQ2(), 0L, new AwS21S0010000_6(z, 14));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene
    public final void LLLLLILLIL(C1684810twd c1684810twd) {
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = ((SocialAvatarCameraSceneV2) this).LLLF;
        C0ZDN c0zdn = (C0ZDN) this.LLL.getValue();
        socialAvatarCreationViewModelV2.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialAvatarCreationViewModelV2), null, null, new C439630HLt(socialAvatarCreationViewModelV2, c1684810twd, true, c0zdn, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2 = (SocialAvatarCameraSceneV2) this;
        C0HL8 c0hl8 = socialAvatarCameraSceneV2.LLLF.LLJLLL;
        if (c0hl8.LJIIIIZZ != C0HKH.ERROR) {
            C0HLG.LIZLLL(c0hl8);
        }
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = socialAvatarCameraSceneV2.LLLF;
        if (socialAvatarCreationViewModelV2.LLJLLL.LJIIIIZZ == C0HKH.GENERATION) {
            socialAvatarCreationViewModelV2.DQ2();
            return;
        }
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 694);
        AFwS331S0000000_6 aFwS331S0000000_6LJIIL = ((ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class)).LJIIL(C0HFK.SOCIAL_AVATAR);
        if (aFwS331S0000000_6LJIIL == null) {
            return;
        }
        aFwS331S0000000_6LJIIL.invoke(requireFragmentActivity(), socialAvatarCameraSceneV2.LLLF.LLJLLL.LIZIZ, awS550S0100000_6);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroupOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        composeView.setBackgroundColor(0);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(1515728129, new AwS620S0100000_6(this, 84), true));
        viewGroupOnCreateView.addView(composeView);
        C0HLI.LIZ.getClass();
        C0HLI.LIZJ = 0;
        return viewGroupOnCreateView;
    }
}
