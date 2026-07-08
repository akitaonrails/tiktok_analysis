package com.ss.android.ugc.profile.business.cd;

import X.C1252710ihh;
import X.C13LE;
import X.InterfaceC1249800id0;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellSettingsProtocol extends ContentCellProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_settings_and_privacy";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        InterfaceC1249800id0 interfaceC1249800id0;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (interfaceC1249800id0 = (InterfaceC1249800id0) C1252710ihh.LJII(fragment, C13LE.LIZ(InterfaceC1249800id0.class))) != null) {
            interfaceC1249800id0.Yj();
            return false;
        }
        return false;
    }
}
