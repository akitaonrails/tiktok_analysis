package com.ss.android.ugc.profile.business.music;

import X.C1889790zHF;
import X.C633020OsG;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.SemiPopProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class SemiMyMusicProtocol extends SemiPopProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public String getName() {
        return "settings_semi_pop_up_my_music";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public boolean LJJJZ() {
        if (!C633020OsG.LIZIZ.LJJLIIIJ()) {
            return false;
        }
        C1889790zHF c1889790zHF = C1889790zHF.LIZ;
        return c1889790zHF.LIZ().hasMusicDsp() && c1889790zHF.LIZ().shouldShowMyMusicEntrance();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String str;
        ProfileComponents profileComponents = this.LLJILJILJ;
        if (profileComponents != null) {
            str = profileComponents.componentId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "settings_semi_pop_up_base_item")) {
            C1889790zHF.LIZ.LIZ().trackEnterMyMusic();
            return false;
        }
        return false;
    }
}
