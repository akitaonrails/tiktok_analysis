package com.bytedance.android.livesdk.impl.revenue.guardian;

import X.C1117670fBt;
import X.C19322110iZ;
import X.C748880TZe;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.api.revenue.guardian.IGuardianService;
import com.bytedance.android.livesdk.impl.revenue.guardian.autograph.GuardianAutographPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
public class GuardianService implements IGuardianService {
    @Override // com.bytedance.android.livesdk.api.revenue.guardian.IGuardianService
    public final void yt0(DataChannel dataChannel, String str) {
        FragmentManager fragmentManager;
        String str2 = GuardianAutographPage._pnsPageId;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            GuardianAutographPage guardianAutographPage = new GuardianAutographPage();
            guardianAutographPage.LLJLLL = dataChannel;
            guardianAutographPage.LLJZ = new C1117670fBt(dataChannel);
            guardianAutographPage.LLJZIJLIL = str;
            C19322110iZ.LJFF(fragmentManager, guardianAutographPage, "guardian_autograph_page", null, 0);
        }
    }
}
