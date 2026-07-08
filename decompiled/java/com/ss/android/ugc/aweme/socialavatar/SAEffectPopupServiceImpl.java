package com.ss.android.ugc.aweme.socialavatar;

import X.AnonymousClass0951;
import X.C0C64;
import X.C0HMP;
import X.C0HYP;
import X.C0IDQ;
import X.C259800zU;
import X.C418440Gaw;
import X.C437560HDu;
import X.C439850HMp;
import X.C814420VxA;
import X.EnumC437540HDs;
import X.EnumC439790HMj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService;

/* JADX INFO: loaded from: classes7.dex */
public final class SAEffectPopupServiceImpl implements SocialAvatarEffectPopupService {
    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService
    public final boolean LIZJ() {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "social_avatar_generation_precheck_ab", true) == 0;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService
    public final void LIZIZ() {
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("should_show_effect_popup", true);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService
    public final boolean LIZ(String str) {
        EnumC437540HDs enumC437540HDs;
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
        if (iSocialAvatarCreationStatusService == null || (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(str)) == null || (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) == null || (enumC437540HDs = c437560HDu.LIZ) == null) {
            enumC437540HDs = EnumC437540HDs.UNKNOWN;
        }
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "social_avatar_effect_generation_popup_ab", true) == 1) {
                C0HYP.LIZ.getClass();
                if (C0HYP.LJ().getBoolean("should_show_effect_popup", false) && !C0HYP.LJ().getBoolean("has_shown_effect_popup", false)) {
                    C0HMP.LIZ.getClass();
                    if (C0HMP.LIZJ().getBytes(C0HMP.LJ("key_effect_input_image"), null) != null && C0HMP.LIZJ().getBytes(C0HMP.LJ("key_effect_header_image"), null) != null && (enumC437540HDs == EnumC437540HDs.UNKNOWN || enumC437540HDs == EnumC437540HDs.IDLE)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.bytedance.tux.sheet.intro.TuxPanel] */
    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService
    public final TuxPanel LIZLLL(EnumC439790HMj enumC439790HMj) {
        SAEffectPopupFragment sAEffectPopupFragment = new SAEffectPopupFragment(enumC439790HMj);
        C259800zU c259800zU = new C259800zU();
        C439850HMp c439850HMp = new C439850HMp();
        TuxPanel tuxPanel = c439850HMp.LIZ;
        tuxPanel.LLJ = true;
        tuxPanel.LLILLJJLI = sAEffectPopupFragment;
        tuxPanel.LLILZLL = new C0IDQ(c259800zU, enumC439790HMj, 3);
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600)));
        ?? r0 = c439850HMp.LIZ;
        r0.LLIZ = numValueOf;
        c259800zU.element = r0;
        return r0;
    }
}
