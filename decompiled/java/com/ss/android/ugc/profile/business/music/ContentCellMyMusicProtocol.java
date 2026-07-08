package com.ss.android.ugc.profile.business.music;

import X.C1889790zHF;
import X.C633020OsG;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellMyMusicProtocol extends ContentCellProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_my_music";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        if (!C633020OsG.LIZIZ.LJJLIIIJ()) {
            return false;
        }
        C1889790zHF c1889790zHF = C1889790zHF.LIZ;
        return c1889790zHF.LIZ().hasMusicDsp() && c1889790zHF.LIZ().shouldShowMyMusicEntrance();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C1889790zHF.LIZ.LIZ().trackEnterMyMusic();
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        return C1889790zHF.LIZ.LIZ().showProfileMenuPanelAlertBadge();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        if (z) {
            C1889790zHF c1889790zHF = C1889790zHF.LIZ;
            c1889790zHF.LIZ().trackProfileMenuPanelShow();
            c1889790zHF.LIZ().trackEnterProfileMenuPanel();
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM != null) {
                iProfilePlatformVM.BQ2();
            }
        }
    }
}
