package kotlin.jvm.internal;

import X.C09AY;
import X.C109S;
import X.C1389890mGx;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptPrivacySettingsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class AwS677S0100000_28 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS677S0100000_28(VideoReviewStatusVM videoReviewStatusVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoReviewStatusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS677S0100000_28(User user, int i) {
        super(3);
        this.$t = i;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS677S0100000_28(PaPromptPrivacySettingsFragment paPromptPrivacySettingsFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = paPromptPrivacySettingsFragment;
    }

    public static final Object invoke$0(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        String aid;
        VideoItemParams videoItemParams;
        Aweme aweme;
        AwemeStatus statusSafety;
        Aweme aweme2;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ((VideoReviewStatusVM) awS677S0100000_28.l0).getClass();
        if (num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                WeakReference<Aweme> weakReference = ((VideoReviewStatusVM) awS677S0100000_28.l0).LLILZLL;
                if (weakReference != null && (aweme2 = weakReference.get()) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(obj, aid)) {
                    WeakReference<Aweme> weakReference2 = ((VideoReviewStatusVM) awS677S0100000_28.l0).LLILZLL;
                    if (weakReference2 != null && (aweme = weakReference2.get()) != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null) {
                        statusSafety.setMuteStripStatus(num.intValue());
                        statusSafety.setMusicEditStatus(num2.intValue());
                    }
                    WeakReference<VideoItemParams> weakReference3 = ((VideoReviewStatusVM) awS677S0100000_28.l0).LLILZIL;
                    if (weakReference3 != null && (videoItemParams = weakReference3.get()) != null) {
                        VideoReviewStatusVM videoReviewStatusVM = (VideoReviewStatusVM) awS677S0100000_28.l0;
                        videoReviewStatusVM.setState(new AwS394S0200000_28(videoReviewStatusVM, videoItemParams, 20));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        PushSettingFollowListAdapter.FollowItemViewHolder followItemViewHolder = (PushSettingFollowListAdapter.FollowItemViewHolder) obj;
        int iIntValue = ((Number) obj3).intValue();
        if (obj2 != null) {
            User user = (User) awS677S0100000_28.l0;
            if (followItemViewHolder.LLJILLL) {
                ((PushSettingNotificationChoiceViewModel) followItemViewHolder.LLJJ.getValue()).LLIZLLLIL = true;
                followItemViewHolder.LLJILLL = false;
            } else {
                user.setLivePushNotificationStatus(iIntValue);
                followItemViewHolder.X5(iIntValue);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        C109S c109s = (C109S) obj;
        ((Number) obj3).intValue();
        if (c109s.LJIJI()) {
            int i = c109s.LJIILLIIL().tipsType;
            if (i != 1) {
                if (i == 2) {
                    C1389890mGx c1389890mGx = new C1389890mGx((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0);
                    c1389890mGx.LJIIIZ(2131845578);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0);
                c1389890mGx2.LJIIIZ(2131847649);
                c1389890mGx2.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0).getClass();
        PaPromptPrivacySettingsFragment.RR("dm_setting_friends");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0).getClass();
        PaPromptPrivacySettingsFragment.RR("dm_setting_potential_connection");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        C109S c109s = (C109S) obj;
        ((Number) obj3).intValue();
        if (c109s.LJIJI() && c109s.LJIILLIIL().tipsType == 3) {
            C1389890mGx c1389890mGx = new C1389890mGx((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0);
            c1389890mGx.LJIIIZ(2131846178);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS677S0100000_28 awS677S0100000_28, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((PaPromptPrivacySettingsFragment) awS677S0100000_28.l0).getClass();
        PaPromptPrivacySettingsFragment.RR("dm_setting_others");
        return Unit.LIZ;
    }
}
