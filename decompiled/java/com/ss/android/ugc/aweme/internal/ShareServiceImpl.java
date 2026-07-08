package com.ss.android.ugc.aweme.internal;

import X.AbstractC20659615so;
import X.C0LAB;
import X.C1397510mTF;
import X.C1402840mbq;
import X.C1668306g5;
import X.C1B46;
import X.C20684815ws;
import X.C621180OYa;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS59S1300000_21;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareServiceImpl implements IShareService {
    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final String LIZIZ(int i) {
        if (i == 2) {
            return "instagram";
        }
        if (i == 3) {
            return "instagram_story";
        }
        if (i == 101) {
            return "twitter";
        }
        switch (i) {
            case 5:
                return "whatsapp";
            case 6:
                return "facebook";
            case 7:
                return "messenger";
            case 8:
                return "snapchat";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "vk";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "zalo";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "line";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "kakaotalk";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "sms";
            case 14:
                return "whatsapp_status";
            default:
                return "";
        }
    }

    public static void LIZLLL(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("sdk_source_app", str2);
        C20684815ws.LJIILLIIL("return_sdk_source_app_popup", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final void LIZ(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("publish_private_status", i);
        bundle.putBoolean("music_prevent_download", z);
        C621180OYa.LIZIZ.LJJJJJ(bundle, null, "ug_publish_share_show");
    }

    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final void LIZJ(final Activity activity, final C1402840mbq c1402840mbq) {
        if (activity.getIntent() == null) {
            return;
        }
        if ((c1402840mbq == null && (c1402840mbq = (C1402840mbq) activity.getIntent().getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG")) == null) || !C1B46.LJFF(c1402840mbq)) {
            return;
        }
        final String str = c1402840mbq.mAppName;
        if (str == null) {
            str = "";
        }
        PopupManager.LJIJ(new AbstractC20659615so<C1397510mTF>() { // from class: X.0m9O
            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19FO c19fo;
                Activity activity2 = activity;
                if (!(activity2 instanceof C19EG) || (c19fo = (C19FO) activity2) == null) {
                    return null;
                }
                return new C688120Qyw(c19fo, c19fo, null);
            }

            @Override // com.bytedance.poplayer.IStandardPopupTask
            public final Object LJII(C688120Qyw c688120Qyw) {
                String strLIZIZ;
                String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    strLIZIZ = u.LJJIFFI(u.LJJIFFI(C555520LqY.LIZIZ(2131846727), "{s_appName}", str, false), "%1$s", str, false);
                } else {
                    strLIZIZ = C555520LqY.LIZIZ(2131846728);
                }
                C1397580mTM c1397580mTM = new C1397580mTM(c688120Qyw.LIZ);
                c1397580mTM.LIZIZ(strLIZIZ);
                c1397580mTM.LJFF(2131846729);
                C985403tE.LIZ(c1397580mTM, new AwS59S1300000_21(activity, c1402840mbq, this, str, 2));
                c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_tick_circle_fill, 0, activity, Integer.valueOf(R.attr.a1v));
                return new C1397510mTF(c1397580mTM);
            }

            @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
            public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
                ShareServiceImpl shareServiceImpl = this;
                String str2 = str;
                shareServiceImpl.getClass();
                ShareServiceImpl.LIZLLL("show", str2);
                Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
                if (window != null) {
                    return window.getDecorView();
                }
                return null;
            }
        }, "share_to_tt_return_or_stay_popup", new C1668306g5("studio_share_to_tt_return_or_stay_popup_draft_saved"));
    }
}
