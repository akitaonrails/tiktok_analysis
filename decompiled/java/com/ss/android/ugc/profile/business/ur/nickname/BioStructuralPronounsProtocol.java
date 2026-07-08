package com.ss.android.ugc.profile.business.ur.nickname;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralPronounsProtocol extends ProfilePlatformProtocol<BizBaseData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_structural_pronouns";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.FQ2(new AwS598S0100000_19(this, 384));
        }
        View view = this.LLILZLL;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ieD
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }
}
