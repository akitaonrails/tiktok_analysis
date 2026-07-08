package com.ss.android.ugc.aweme.story.service;

import X.C103K;
import X.C2188811AlT;
import X.C298470Bmv;
import X.EnumC191820102o;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class StoryMentionShareService implements IStoryMentionShareService {
    public final Map<String, Boolean> LIZ = new LinkedHashMap();
    public final Map<String, Boolean> LIZIZ = new LinkedHashMap();

    public static EnumC191820102o LJIILJJIL() {
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService == null) {
            return EnumC191820102o.LLILZIL;
        }
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_social_story_mention_reshare");
        if (eligibilityModelLIZ == null) {
            return EnumC191820102o.LLILZIL;
        }
        if (!eligibilityModelLIZ.isEligible()) {
            return EnumC191820102o.LLILZIL;
        }
        String str = eligibilityModelLIZ.decisionCode;
        return Intrinsics.LJFF(str, "reshare_allowed_default_on_toggle_visible") ? EnumC191820102o.LLILLL : Intrinsics.LJFF(str, "reshare_allowed_default_off_toggle_visible") ? EnumC191820102o.LLILZ : EnumC191820102o.LLILZIL;
    }

    public static String LJIILL() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) {
            return null;
        }
        return currentUser.getUid();
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LIZIZ() {
        boolean z = LJIILJJIL().LLILLJJLI;
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return z;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_pre_publish_share_enabled_");
        sbLIZ.append(strLJIILL);
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LIZJ() {
        String strLJIILL;
        if (!C298470Bmv.LIZ() || (strLJIILL = LJIILL()) == null) {
            return false;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre_publish_tooltip_count_");
        sbLIZ.append(strLJIILL);
        return repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 2;
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LJ() {
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post_publish_tooltip_count_");
        sbLIZ.append(strLJIILL);
        int i = repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva repo2 = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("post_publish_tooltip_count_");
        sbLIZ2.append(strLJIILL);
        repo2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJFF() {
        String strLJIILL;
        if (!C298470Bmv.LIZ() || (strLJIILL = LJIILL()) == null) {
            return false;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post_publish_tooltip_count_");
        sbLIZ.append(strLJIILL);
        return repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 2;
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJI() {
        return C298470Bmv.LIZ() && isPrivateAccount() && LJIILJJIL().LL;
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJII() {
        boolean z = LJIILJJIL().LLILLJJLI;
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return z;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_post_publish_share_enabled_");
        sbLIZ.append(strLJIILL);
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJIIIIZZ() {
        return C298470Bmv.LIZ() && isPrivateAccount() && LJIILJJIL().LL;
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LJIILIIL() {
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre_publish_tooltip_count_");
        sbLIZ.append(strLJIILL);
        int i = repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva repo2 = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pre_publish_tooltip_count_");
        sbLIZ2.append(strLJIILL);
        repo2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean isPrivateAccount() {
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        return privacyUserSettingsV2LJIIIIZZ != null && C103K.LIZ(privacyUserSettingsV2LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LIZ(String str) {
        if (str == null || str.length() == 0 || this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, Boolean.valueOf(LIZIZ()));
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LIZLLL(String str) {
        if (str == null || str.length() == 0 || this.LIZIZ.containsKey(str)) {
            return;
        }
        this.LIZIZ.put(str, Boolean.valueOf(LJII()));
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LJIIIZ(boolean z) {
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_pre_publish_share_enabled_");
        sbLIZ.append(strLJIILL);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final void LJIIJ(boolean z) {
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return;
        }
        Keva repo = Keva.getRepo("story_mention_share");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_post_publish_share_enabled_");
        sbLIZ.append(strLJIILL);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJIIJJI(String str) {
        if (str != null && str.length() != 0) {
            Boolean boolRemove = this.LIZIZ.remove(str);
            if (boolRemove != null) {
                return boolRemove.booleanValue();
            }
            return LJII();
        }
        return LJII();
    }

    @Override // com.ss.android.ugc.aweme.story.service.IStoryMentionShareService
    public final boolean LJIIL(String str) {
        if (str != null && str.length() != 0) {
            Boolean boolRemove = this.LIZ.remove(str);
            if (boolRemove != null) {
                return boolRemove.booleanValue();
            }
            return LIZIZ();
        }
        return LIZIZ();
    }
}
