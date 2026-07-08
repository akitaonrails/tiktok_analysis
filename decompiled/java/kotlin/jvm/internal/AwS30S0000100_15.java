package kotlin.jvm.internal;

import X.C09AY;
import X.C932680aNW;
import X.C936100aT2;
import X.C954570awp;
import X.C955590ayT;
import X.C976480bWA;
import X.C976800bWg;
import X.EnumC954840axG;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class AwS30S0000100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0000100_15(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        C932680aNW c932680aNW;
        GuestInvitePanelResp.ListUser listUser;
        User user;
        if ((obj instanceof C932680aNW) && (c932680aNW = (C932680aNW) obj) != null && (listUser = c932680aNW.LIZ) != null && (user = listUser.user) != null && user.getId() == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((LinkPlayerInfo) obj).mUser.getId() == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((Number) obj).longValue() == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        Long l = ((LinkUser) obj).userId;
        long j = awS30S0000100_15.j0;
        if (l != null && l.longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((C976480bWA) obj).LIZ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((C976800bWg) obj).LIZ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$14(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        C954570awp c954570awp = (C954570awp) obj;
        if (c954570awp.LIZ == EnumC954840axG.APPLY_GROUP_IM && c954570awp.LIZJ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$15(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        C954570awp c954570awp = (C954570awp) obj;
        if (c954570awp.LIZ == EnumC954840axG.INVITE_GROUP_IM && c954570awp.LIZJ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$16(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if ((obj instanceof C955590ayT) && ((C955590ayT) obj).LJ.getId() == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((Avatar) obj).avatarId == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((Avatar) obj).avatarId == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((Avatar) obj).avatarId == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if ((obj instanceof C936100aT2) && ((C936100aT2) obj).LIZ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        return UserState.LIZ((UserState) obj, 0, 0, 0, 0, 0, 0, awS30S0000100_15.j0, 1023);
    }

    public static final Object invoke$7(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if (((ListByTypeResponse.GiftScoreAppliedUser) obj).giftScore < awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if ((obj instanceof C936100aT2) && ((C936100aT2) obj).LIZ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AwS30S0000100_15 awS30S0000100_15, Object obj) {
        boolean z;
        if ((obj instanceof C936100aT2) && ((C936100aT2) obj).LIZ == awS30S0000100_15.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
