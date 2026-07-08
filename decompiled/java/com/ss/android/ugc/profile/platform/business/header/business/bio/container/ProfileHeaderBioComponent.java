package com.ss.android.ugc.profile.platform.business.header.business.bio.container;

import X.C13LE;
import com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent;
import com.ss.android.ugc.profile.business.ur.platform.ProfileHeaderAddBioComponent;
import com.ss.android.ugc.profile.business.ur.platform.ProfileHeaderTapToAddBioComponent;
import com.ss.android.ugc.profile.business.ur.platform.relationlabel.ProfileHeaderRelationLabelComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioStructuralInfoContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container.BioUserMailLinkComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.school.BioSchoolBadgeComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.school.ProfileHeaderAddSchoolComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonBioUIComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderBioComponent extends ProfileHeaderBioBaseComponent {
    public final boolean LLJLL = true;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("bio_pronouns", C13LE.LIZ(CommonBioUIComponent.class), null, -1, false);
        Ho("bio_signature", C13LE.LIZ(ProfileHeaderSignatureTranslationComponent.class), null, -1, false);
        Ho("bio_add_bio", C13LE.LIZ(ProfileHeaderAddBioComponent.class), null, -1, false);
        Ho("bio_add_school", C13LE.LIZ(ProfileHeaderAddSchoolComponent.class), null, -1, false);
        Ho("bio_tap_to_add_bio", C13LE.LIZ(ProfileHeaderTapToAddBioComponent.class), null, -1, false);
        Ho("bio_school_name", C13LE.LIZ(BioSchoolBadgeComponent.class), null, -1, false);
        Ho("bio_profile_link", C13LE.LIZ(BioProfileLinkComponent.class), null, -1, false);
        Ho("bio_mail_link", C13LE.LIZ(BioUserMailLinkComponent.class), null, -1, false);
        Ho("bio_business_account", C13LE.LIZ(BioBusinessInfoComponent.class), null, -1, false);
        Ho("bio_structural_info", C13LE.LIZ(BioStructuralInfoContainerComponent.class), null, -1, false);
        Ho("bio_relation_label", C13LE.LIZ(ProfileHeaderRelationLabelComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final boolean op() {
        return this.LLJLL;
    }
}
