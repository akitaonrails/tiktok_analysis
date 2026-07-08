package com.ss.android.ugc.profile.business.music;

import X.C1257790ipt;
import X.C1257950iq9;
import X.C19U0;
import X.C268330AfP;
import android.view.View;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileGhostMusicBusiness extends ProfileTabBaseBusiness {
    public boolean LLILLL;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_music";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        return C268330AfP.LJII() ? R.raw.icon_color_profile_music_fill : R.raw.icon_3pt_music_note_alt;
    }

    public ProfileGhostMusicBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void sW(C19U0 c19u0, int i) {
        View view;
        IProfileMusicTabService iProfileMusicTabService;
        if (i == 17 && this.LLILLL) {
            if (c19u0 != null) {
                view = c19u0.LJFF;
            } else {
                view = null;
            }
            if (view instanceof C1257790ipt) {
                this.LLILLL = false;
                ServiceManager serviceManager = ServiceManager.get();
                if (serviceManager != null && (iProfileMusicTabService = (IProfileMusicTabService) serviceManager.getService(IProfileMusicTabService.class)) != null) {
                    iProfileMusicTabService.LJJII();
                }
                TuxAlertBadgeLayout tuxAlertBadgeLayout = ((C1257790ipt) c19u0.LJFF).LLILZ;
                if (tuxAlertBadgeLayout != null && tuxAlertBadgeLayout.LLJIJIL) {
                    tuxAlertBadgeLayout.LIZIZ();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        boolean zLJJIIJ;
        IProfileMusicTabService iProfileMusicTabService;
        ProfileTabBaseBusiness.LIZJ(view);
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iProfileMusicTabService = (IProfileMusicTabService) serviceManager.getService(IProfileMusicTabService.class)) != null) {
            zLJJIIJ = iProfileMusicTabService.LJJIIJ();
        } else {
            zLJJIIJ = false;
        }
        this.LLILLL = zLJJIIJ;
        if (i == 17 && zLJJIIJ) {
            ProfileTabBaseBusiness.LJFF(view);
        } else {
            ProfileTabBaseBusiness.LIZJ(view);
        }
    }
}
