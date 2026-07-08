package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import X.C103L;
import X.C10A1;
import X.C10AV;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C191871104n;
import X.C19EG;
import X.C666390QBx;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.PromoteVideoVisibilitySettingFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteVideoSettingSheet implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19egLIZIZ);
            dialogC1389620mGW.LJJLJ(2131835638);
            C786410Ut5.J4(dialogC1389620mGW);
            Aweme aweme = C666390QBx.LIZ;
            C10A1 c10a1LJFF = C191871104n.LJFF();
            String aid = aweme.getAid();
            AwS61S0500000_28 awS61S0500000_28 = new AwS61S0500000_28(aweme, dialogC1389620mGW, c19egLIZIZ, this, bundle, 2);
            AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(dialogC1389620mGW, c19egLIZIZ, 24);
            c10a1LJFF.getClass();
            C10A1.LIZ(aid, awS429S0200000_28, awS61S0500000_28);
            return null;
        }
        return null;
    }

    public final void openHalfSheet(C19EG c19eg, C103L c103l, Aweme aweme, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, Bundle bundle) {
        SoftReference<C103L> softReference;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("target", "video_privacy_promote_video_visibility", bundle);
        C786410Ut5.LJJIZ(bundle, "restriction", privacyVideoRestrictionModel.getRestriction());
        C786410Ut5.LJJIZ(bundle, "settings", privacyVideoRestrictionModel.getSettings());
        if (c103l == null) {
            softReference = null;
        } else {
            softReference = new SoftReference<>(c103l);
        }
        C10AV.LIZ = softReference;
        PromoteVideoVisibilitySettingFragment promoteVideoVisibilitySettingFragment = new PromoteVideoVisibilitySettingFragment();
        promoteVideoVisibilitySettingFragment.setArguments(bundle);
        promoteVideoVisibilitySettingFragment.LLILLL = aweme;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = promoteVideoVisibilitySettingFragment;
        c1390920mIc.LJIIIIZZ(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLILLL = false;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.10BP
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        tuxSheet.show(c19eg.getSupportFragmentManager(), "promote_video_setting");
    }
}
