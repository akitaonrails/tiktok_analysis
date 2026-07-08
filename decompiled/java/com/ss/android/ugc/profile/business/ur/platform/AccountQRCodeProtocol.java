package com.ss.android.ugc.profile.business.ur.platform;

import X.C1216270hkv;
import X.C19EG;
import X.C621180OYa;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountQRCodeProtocol extends ProfilePlatformProtocol<BizBaseData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_qr_code";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final View LJIIJJI() {
        View view = this.LLILZLL;
        if (view != null) {
            view.setContentDescription(C1216270hkv.LIZJ(2131823311));
        }
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C19EG activity;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C621180OYa.LIZ.LJJLJ(activity, null, null);
            return false;
        }
        return false;
    }
}
