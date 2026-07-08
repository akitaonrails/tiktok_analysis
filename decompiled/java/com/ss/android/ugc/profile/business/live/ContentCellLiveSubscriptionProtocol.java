package com.ss.android.ugc.profile.business.live;

import X.C1242730iRb;
import X.C1253930ijf;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellLiveSubscriptionProtocol extends ContentCellProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_live_subscription";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.IQ2(new AwS598S0100000_19(this, 315));
        }
    }

    public final void LJLLL() {
        User userVQ2;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM == null || (userVQ2 = iProfilePlatformVM.vQ2()) == null) {
            return;
        }
        String str = this.LLJI ? "personal_homepage" : "others_homepage";
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String strLIZJ = C1242730iRb.LIZJ(userVQ2);
        boolean z = this.LLJI;
        c1253930ijf.getClass();
        C1253930ijf.LJJIIJZLJL("livesdk_subscribe_icon_click", str, strLIZJ, "click_position", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.live.ContentCellLiveSubscriptionProtocol.LJII(android.view.View):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJI(boolean z) {
        IProfilePlatformVM iProfilePlatformVM;
        User userVQ2;
        String str;
        if (z && (iProfilePlatformVM = this.LLIZLLLIL) != null && (userVQ2 = iProfilePlatformVM.vQ2()) != null) {
            if (this.LLJI) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            String strLIZJ = C1242730iRb.LIZJ(userVQ2);
            boolean z2 = this.LLJI;
            c1253930ijf.getClass();
            C1253930ijf.LJJIIJZLJL("livesdk_subscribe_icon_show", str, strLIZJ, "show_entrance", z2);
        }
    }
}
