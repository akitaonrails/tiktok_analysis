package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import X.C103L;
import X.C10A1;
import X.C10AV;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1440005kM;
import X.C191833103b;
import X.C191871104n;
import X.C19EG;
import X.C453940Hr6;
import X.C666390QBx;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.VideoPrivacySettingFragment2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS2S0520000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingDialogRouter implements IRouteAction {
    public static final int $stable = 0;

    public final void sendLoopCurrentStoryEvent(Aweme aweme, boolean z) {
        C1440005kM.LIZ(new C453940Hr6(z, false, 6));
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Activity activityLIZ;
        C19EG c19eg;
        boolean z;
        Aweme aweme = C666390QBx.LIZ;
        if (aweme == null) {
            return null;
        }
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            sendLoopCurrentStoryEvent(aweme, true);
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
            dialogC1389620mGW.LJJLJ(2131835638);
            C786410Ut5.J4(dialogC1389620mGW);
            boolean z2 = false;
            if (bundle != null) {
                z = bundle.getBoolean("is_from_long_press_panel", false);
                z2 = bundle.getBoolean("extra_is_from_friends_v3_water_fall", false);
            } else {
                z = false;
            }
            C10A1 c10a1LJFF = C191871104n.LJFF();
            String aid = aweme.getAid();
            AwS2S0520000_28 awS2S0520000_28 = new AwS2S0520000_28(bundle, c19eg, dialogC1389620mGW, this, aweme, z, z2, 1);
            AwS156S0400000_28 awS156S0400000_28 = new AwS156S0400000_28(dialogC1389620mGW, c19eg, this, aweme, 3);
            c10a1LJFF.getClass();
            C10A1.LIZ(aid, awS156S0400000_28, awS2S0520000_28);
        }
        return null;
    }

    public final VideoPrivacySettingFragment2 getSheetV2(Bundle bundle, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, Aweme aweme, C103L c103l) {
        VideoItemRestriction restriction;
        VideoItemSettings settings;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SoftReference<C103L> softReference = null;
        if (privacyVideoRestrictionModel != null) {
            restriction = privacyVideoRestrictionModel.getRestriction();
        } else {
            restriction = null;
        }
        C786410Ut5.LJJIZ(bundle, "restriction", restriction);
        if (privacyVideoRestrictionModel != null) {
            settings = privacyVideoRestrictionModel.getSettings();
        } else {
            settings = null;
        }
        C786410Ut5.LJJIZ(bundle, "settings", settings);
        C786410Ut5.LJJJI("page_tag", "video_privacy_settings_page", bundle);
        if (c103l != null) {
            softReference = new SoftReference<>(c103l);
        }
        C10AV.LIZ = softReference;
        VideoPrivacySettingFragment2 videoPrivacySettingFragment2 = new VideoPrivacySettingFragment2();
        videoPrivacySettingFragment2.setArguments(bundle);
        videoPrivacySettingFragment2.LLILZLL = aweme;
        return videoPrivacySettingFragment2;
    }

    public final void doOpenSheet(final Aweme aweme, C19EG c19eg, Fragment fragment, final boolean z, final boolean z2) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = fragment;
        c1390920mIc.LJIIIIZZ(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.10BO
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.LL.sendLoopCurrentStoryEvent(aweme, false);
                if (z) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0is2
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
                if (z2) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.10BQ
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
            }
        };
        tuxSheet.show(c19eg.getSupportFragmentManager(), "PrivacySettingDialog");
    }

    public final void tryOpenSheet(Aweme aweme, C19EG c19eg, Bundle bundle, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, boolean z, boolean z2) {
        C191833103b.LIZIZ(c19eg, "video_privacy_settings_page", new AwS2S0520000_28(this, aweme, c19eg, bundle, privacyVideoRestrictionModel, z, z2, 2));
    }
}
