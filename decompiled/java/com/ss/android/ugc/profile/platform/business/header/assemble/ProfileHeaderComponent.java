package com.ss.android.ugc.profile.platform.business.header.assemble;

import X.C1253010iiB;
import X.C1253780ijQ;
import X.C13LE;
import X.C1558520qew;
import X.C2537109wv;
import X.C268330AfP;
import X.C728030Sh7;
import X.C728040Sh8;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureComponent;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble.ProfileHeaderAvatarComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.container.ProfileHeaderBioComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTAComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.ProfileHeaderInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.ProfileHeaderInfoComponentV2;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble.ProfileHeaderRecommendComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.assemble.ProfileHeaderStoryHighlightsComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.assemble.ProfileHeaderTopTipsComponent;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderComponent extends ProfileHeaderBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility == null || !profileBaseAbility.q1()) {
            IProfileAppDiffProtocol.LIZ.getClass();
            if (C1253780ijQ.LIZ().LJII(AFwS207S0000000_19.get$arr$(741))) {
                Ho("header_avatar", C13LE.LIZ(ProfileHeaderAvatarComponent.class), null, 0, false);
            }
            Ho("info", C13LE.LIZ(!C268330AfP.LIZLLL() ? ProfileHeaderInfoComponent.class : ProfileHeaderInfoComponentV2.class), null, 1, false);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("disable_other_profile_force_insert_cta", true)) {
                Ho("cta", C13LE.LIZ(ProfileHeaderCTAComponent.class), null, -1, false);
            } else {
                Ho("cta", C13LE.LIZ(ProfileHeaderCTAComponent.class), null, 2, false);
            }
            Ho("recommend", C13LE.LIZ(ProfileHeaderRecommendComponent.class), null, -1, false);
            Ho("bio", C13LE.LIZ(ProfileHeaderBioComponent.class), null, -1, false);
            Ho("header_top_tips", C13LE.LIZ(ProfileHeaderTopTipsComponent.class), null, -1, false);
            Ho("advanced_feature", C13LE.LIZ(ProfileHeaderAdvancedFeatureComponent.class), null, -1, false);
            C728030Sh7.LIZ.getClass();
            if (C728030Sh7.LIZ()) {
                Ho("story_highlight", C13LE.LIZ(ProfileHeaderStoryHighlightsComponent.class), null, -1, false);
            }
            C1253010iiB.LIZJ.LJIILJJIL(this);
            return;
        }
        if ((this.LLJILLL && !((Boolean) C2537109wv.LIZJ.getValue()).booleanValue()) || (!this.LLJILLL && !((Boolean) C2537109wv.LIZLLL.getValue()).booleanValue())) {
            Ho("header_top_tips", C13LE.LIZ(ProfileHeaderTopTipsComponent.class), null, 0, false);
        }
        IProfileAppDiffProtocol.LIZ.getClass();
        if (C1253780ijQ.LIZ().LJII(AFwS207S0000000_19.get$arr$(543))) {
            Ho("header_avatar", C13LE.LIZ(ProfileHeaderAvatarComponent.class), null, 1, false);
        }
        Ho("info", C13LE.LIZ(!C268330AfP.LIZLLL() ? ProfileHeaderInfoComponent.class : ProfileHeaderInfoComponentV2.class), null, 2, false);
        if (!this.LLJILLL || !C2537109wv.LJ()) {
            Ho("cta", C13LE.LIZ(ProfileHeaderCTAComponent.class), null, 3, false);
        }
        Ho("recommend", C13LE.LIZ(ProfileHeaderRecommendComponent.class), null, -1, false);
        Ho("bio", C13LE.LIZ(ProfileHeaderBioComponent.class), null, -1, false);
        Ho("advanced_feature", C13LE.LIZ(ProfileHeaderAdvancedFeatureComponent.class), null, -1, false);
        C728040Sh8.LIZ.getClass();
        if (C728040Sh8.LIZ()) {
            Ho("story_highlight", C13LE.LIZ(ProfileHeaderStoryHighlightsComponent.class), null, -1, false);
        }
    }
}
