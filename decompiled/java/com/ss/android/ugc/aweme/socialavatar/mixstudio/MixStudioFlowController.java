package com.ss.android.ugc.aweme.socialavatar.mixstudio;

import X.C01GW;
import X.C05YD;
import X.C0HSD;
import X.C0HSM;
import X.C0HSR;
import X.C0IDY;
import X.C0P0T;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C19EG;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C300640BqQ;
import X.C418440Gaw;
import X.C426750GoL;
import X.C440370HOp;
import X.C440480HPa;
import X.C441590HTh;
import X.C441610HTj;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1235690iGF;
import X.EnumC1338240kve;
import X.EnumC441640HTm;
import X.InterfaceC1348590lCL;
import X.InterfaceC332260D0u;
import X.ViewTreeObserverOnGlobalLayoutListenerC441620HTk;
import Y.ACListenerS53S1200000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioFlowController implements MixStudioLauncher {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(664));

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    public final C05YD<Boolean> LJFF() {
        return (C05YD) this.LIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC441640HTm r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo> r15) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.MixStudioFlowController.LIZJ(X.0HTm, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJII(C19EG c19eg, MixStudioBaseFragment mixStudioBaseFragment, FragmentManager fragmentManager, Function0<Unit> function0) {
        boolean z = false;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = mixStudioBaseFragment;
        tuxSheet.LLJLLL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJI = numLIZJ;
        tuxSheet2.LLILLJJLI = new C0IDY(this, function0, 0);
        if (C440480HPa.LIZJ() && Build.VERSION.SDK_INT >= 35) {
            z = true;
        }
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLIZLLLIL = z;
        if (fragmentManager == null) {
            fragmentManager = c19eg.getSupportFragmentManager();
        }
        tuxSheet3.show(fragmentManager, "MixStudio");
        ((InterfaceC332260D0u) this.LIZ.getValue()).setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    public final void LJ(Context context, FragmentManager fragmentManager, StickerItem stickerItem, EnumC441640HTm enumC441640HTm, C0HSR c0hsr) {
        new MixStudioShareFragment().UR(context, fragmentManager, stickerItem, enumC441640HTm, c0hsr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[PHI: r2
      0x006f: PHI (r2v2 X.0HPg) = (r2v1 X.0HPg), (r2v5 X.0HPg) binds: [B:20:0x006c, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C19EG r7, java.lang.String r8, X.EnumC441640HTm r9, java.lang.String r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher.IdAndElementConfiguration r12, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher.GenerationConfiguration r13) {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository> r0 = com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r1 = (com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository) r1
            r3 = 0
            if (r1 == 0) goto L6b
            X.05YD r0 = r1.getTaskStatus()
            if (r0 == 0) goto L6b
            java.lang.Object r2 = r0.getValue()
        L1b:
            X.05YD r0 = r1.LJFF()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
        L27:
            boolean r0 = r2 instanceof X.C441130HRn
            if (r0 != 0) goto L3a
            boolean r0 = r2 instanceof X.C441120HRm
            if (r0 == 0) goto L71
            if (r1 == 0) goto L71
            boolean r0 = r1.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L71
        L3a:
            com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment r2 = new com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "MixStudioBaseFragment_sticker_vm_key"
            X.C786410Ut5.LJJIZ(r1, r0, r8)
            java.lang.String r4 = "MixStudioBaseFragment_input_landingPage"
            X.0HSD r0 = X.C0HSD.DEFAULT
            X.C786410Ut5.LJJIZ(r1, r4, r0)
            java.lang.String r0 = "MixStudioBaseFragment_input_enterFrom"
            X.C786410Ut5.LJJIZ(r1, r0, r9)
            java.lang.String r0 = "MixStudioBaseFragment_input_enterFrom_mob"
            X.C786410Ut5.LJJJI(r0, r10, r1)
            java.lang.String r0 = "MixStudioBaseFragment_id_and_element_configuration"
            X.C786410Ut5.LJJIJL(r1, r0, r12)
            java.lang.String r0 = "MixStudioBaseFragment_generation_configuration"
            X.C786410Ut5.LJJIJL(r1, r0, r13)
            r2.setArguments(r1)
            r6.LJII(r7, r2, r3, r11)
            return
        L6b:
            r2 = r3
            if (r1 == 0) goto L6f
            goto L1b
        L6f:
            r1 = r3
            goto L27
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.MixStudioFlowController.LIZ(X.19EG, java.lang.String, X.0HTm, java.lang.String, kotlin.jvm.functions.Function0, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher$IdAndElementConfiguration, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher$GenerationConfiguration):void");
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [T, X.0P0T] */
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    public final C0P0T LIZLLL(Context context, final View view, Uri uri, String str, ViewGroup viewGroup, final Boolean bool, AwS407S0200000_6 awS407S0200000_6) {
        SmartImageView smartImageView = new SmartImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
        layoutParams.gravity = 17;
        C426750GoL.LJIIL(smartImageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        C786410Ut5.G6(smartImageView, layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C960203pA.LIZ(R.attr.a1d, context));
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        smartImageView.setBackground(gradientDrawable);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
        c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_INSIDE;
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJI.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJI);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(smartImageView);
        C259800zU c259800zU = new C259800zU();
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c259800zU, (C259800zU<C0P0T>) 1072);
        Context context2 = C1383370m6R.LIZ;
        ViewTreeObserverOnGlobalLayoutListenerC441620HTk viewTreeObserverOnGlobalLayoutListenerC441620HTk = new ViewTreeObserverOnGlobalLayoutListenerC441620HTk(view, awS550S0100000_6);
        C1391550mJd c1391550mJd = new C1391550mJd(context);
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391600mJi.LJIIZILJ = frameLayout;
        if (C300640BqQ.LIZ()) {
            c1391550mJd.LLILLJJLI.LIZJ = viewGroup;
        }
        c1391550mJd.LJI(C960203pA.LIZ(R.attr.a1d, context));
        c1391550mJd.LJIIIZ(true, new ACListenerS53S1200000_6(str, awS407S0200000_6, c259800zU, 0));
        c1391550mJd.LLILLJJLI.LJIILIIL = new InterfaceC1348590lCL() { // from class: X.0HTl
            @Override // X.InterfaceC1348590lCL
            public final void LIZ(C1391620mJk c1391620mJk) {
                c1391620mJk.LIZIZ -= (int) C1383370m6R.LJII(view, Intrinsics.LJFF(bool, Boolean.TRUE));
            }
        };
        c1391550mJd.LJ(new AwS407S0200000_6(view, viewTreeObserverOnGlobalLayoutListenerC441620HTk, 49));
        c1391550mJd.LIZJ(new AwS372S0200000_6(view, viewTreeObserverOnGlobalLayoutListenerC441620HTk, 43));
        c259800zU.element = c1391550mJd.LIZIZ();
        C440370HOp.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "show");
        c2344009Gk.LJIIIIZZ("sticker_id", str);
        C20684815ws.LJIILLIIL("imagine_studio_generated_sticker_popup", c2344009Gk.LIZ);
        return (C0P0T) c259800zU.element;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    public final void LJI(Context context, FragmentManager fragmentManager, Integer num, Long l, String str, EnumC441640HTm enumC441640HTm, C0HSR c0hsr) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C441590HTh(num, l, str, this, context, fragmentManager, enumC441640HTm, c0hsr, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher
    public final void LIZIZ(C19EG c19eg, String str, EnumC441640HTm enumC441640HTm, C441610HTj c441610HTj, C0HSD c0hsd, FriendsIDInfo friendsIDInfo, Function0<Unit> function0, FragmentManager fragmentManager, String str2, MixStudioLauncher.IdAndElementConfiguration idAndElementConfiguration, MixStudioLauncher.GenerationConfiguration generationConfiguration) {
        MixStudioLauncher.PrefillInfo prefillInfo;
        MixStudioBaseFragment mixStudioBaseFragment = new MixStudioBaseFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "MixStudioBaseFragment_input_landingPage", c0hsd);
        if (c441610HTj != null && (prefillInfo = c441610HTj.LIZ) != null) {
            C786410Ut5.LJJIJL(bundle, "MixStudioBaseFragment_input_prefill", prefillInfo);
        }
        if (C0HSM.LIZ() && c441610HTj != null) {
            MixStudioLauncher.PushInfo pushInfo = c441610HTj.LIZJ;
            if (pushInfo != null) {
                C786410Ut5.LJJIJL(bundle, "MixStudioBaseFragment_push_info", pushInfo);
            }
            bundle.putBoolean("MixStudioBaseFragment_is_animated", c441610HTj.LIZIZ);
        }
        C786410Ut5.LJJIZ(bundle, "MixStudioBaseFragment_sticker_vm_key", str);
        C786410Ut5.LJJIZ(bundle, "MixStudioBaseFragment_input_enterFrom", enumC441640HTm);
        C786410Ut5.LJJIZ(bundle, "MixStudioBaseFragment_input_friendsIDInfo", friendsIDInfo);
        C786410Ut5.LJJJI("MixStudioBaseFragment_input_enterFrom_mob", str2, bundle);
        C786410Ut5.LJJIJL(bundle, "MixStudioBaseFragment_id_and_element_configuration", idAndElementConfiguration);
        C786410Ut5.LJJIJL(bundle, "MixStudioBaseFragment_generation_configuration", generationConfiguration);
        mixStudioBaseFragment.setArguments(bundle);
        LJII(c19eg, mixStudioBaseFragment, fragmentManager, function0);
    }
}
