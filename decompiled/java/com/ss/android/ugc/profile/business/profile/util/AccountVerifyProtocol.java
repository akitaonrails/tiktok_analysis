package com.ss.android.ugc.profile.business.profile.util;

import X.C12ES;
import X.C1558420qem;
import X.C1558520qew;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C814420VxA;
import X.EnumC1248260iaW;
import X.EnumC428940Grs;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountVerifyProtocol extends ProfilePlatformProtocol<BizBaseData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_verify";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        TuxIconView tuxIconView;
        if (C268330AfP.LIZLLL()) {
            View view = this.LLILZLL;
            if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
                return;
            }
            tuxIconView.setIconRes(R.raw.icon_bitmap_blue_v_badge);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJ() {
        return C268330AfP.LIZLLL() ? -1 : null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIJIIJIL() {
        if (C268330AfP.LIZLLL()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJIL() {
        if (C268330AfP.LIZLLL()) {
            return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        TuxIconView tuxIconView;
        int iLIZIZ;
        if (C2537109wv.LJI()) {
            return false;
        }
        View view = this.LLILZLL;
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
            IUserNameAbility iUserNameAbility = (IUserNameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IUserNameAbility.class, null);
            Float fValueOf = iUserNameAbility != null ? Float.valueOf(iUserNameAbility.wj0()) : null;
            if (getContext() != null && fValueOf != null) {
                int iLJIILJJIL = C12ES.LJIILJJIL(fValueOf.floatValue(), getContext());
                if (iLJIILJJIL == 17) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else if (iLJIILJJIL != 20) {
                    switch (iLJIILJJIL) {
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        case 14:
                        case 15:
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                            break;
                        default:
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                            break;
                    }
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                }
                tuxIconView.setIconWidth(iLIZIZ);
                tuxIconView.setIconHeight(iLIZIZ);
            }
            C428150Gqb.LIZ(tuxIconView, EnumC428940Grs.ALPHA, 0.0f);
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.ICON;
    }
}
