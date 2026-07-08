package com.ss.android.ugc.aweme.socialavatar.view.v2;

import X.C01GW;
import X.C0CHQ;
import X.C19EG;
import X.C439720HMc;
import X.C452501pT;
import X.C530750Krh;
import X.EnumC444760HcI;
import Y.ARunnableS108S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCameraSceneV2 extends BaseSocialAvatarCameraScene {
    public static final /* synthetic */ int LLLFZ = 0;
    public final SocialAvatarCreationViewModelV2 LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 704));
    public C439720HMc LLLFFI;

    @Override // com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (this.LLLF.xQ2().getValue().LIZIZ != EnumC444760HcI.INITIAL) {
            this.LLLF.AQ2();
            LLLLLLIL();
        }
    }

    public SocialAvatarCameraSceneV2(SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2) {
        this.LLLF = socialAvatarCreationViewModelV2;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene, com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19EG c19eg = (C19EG) this.mActivity;
        if (c19eg != null) {
            getLifecycle();
            this.LLLFFI = new C439720HMc(c19eg, this.mParentScene);
        }
        if (C530750Krh.LJFF == null) {
            C530750Krh.LIZIZ(C0CHQ.LIZ);
        }
        ((Handler) this.LLLFF.getValue()).postDelayed(new ARunnableS108S0100000_8(this, 66), 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    @Override // com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLL(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2.LLLLLLL(kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    @Override // com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL(X.C0HL5 r33, X.InterfaceC1680820tqC r34, X.InterfaceC1680500tpg r35, int r36) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2.LLLLLLLLL(X.0HL5, X.0tqC, X.0tpg, int):void");
    }
}
