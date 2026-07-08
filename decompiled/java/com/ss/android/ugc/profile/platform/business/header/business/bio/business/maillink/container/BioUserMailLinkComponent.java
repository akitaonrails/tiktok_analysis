package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container;

import X.C13LE;
import com.ss.android.ugc.profile.business.ur.platform.business.BioUserWebEmailComponent;
import com.ss.android.ugc.profile.business.ur.platform.business.BioUserWebSiteComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class BioUserMailLinkComponent extends BioUserMailLinkBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("bio_email", C13LE.LIZ(BioUserWebEmailComponent.class), null, -1, false);
        Ho("bio_link", C13LE.LIZ(BioUserWebSiteComponent.class), null, -1, false);
    }
}
