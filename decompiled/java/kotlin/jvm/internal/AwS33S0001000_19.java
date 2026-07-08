package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C09AY;
import X.C1158970gGV;
import X.C1215290hjL;
import X.C1218620hoi;
import X.C1221150hsn;
import X.C1221230hsv;
import X.C1236480iHW;
import X.C1250500ie8;
import X.C1258560ir8;
import X.C1263140iyW;
import X.C1264900j1M;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C291001Au;
import X.C346160Dhe;
import X.EnumC1155170gAN;
import X.EnumC1221220hsu;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states.FollowingRelationState;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS33S0001000_19 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f989i0;

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
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0001000_19(int i) {
        super(1);
        this.$t = i;
        this.f989i0 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0001000_19(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f989i0 = i;
    }

    public static final Object invoke$0(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1263140iyW.LIZ((C1263140iyW) obj, null, null, false, new C291001Au(Integer.valueOf(awS33S0001000_19.f989i0)), 7);
    }

    public static final Object invoke$1(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1221150hsn.LIZ((C1221150hsn) obj, null, null, null, null, null, null, null, new C291001Au(new C1221230hsv(EnumC1221220hsu.DOWNLOADING, awS33S0001000_19.f989i0, 4)), null, 895);
    }

    public static final Object invoke$10(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        FollowRelationState followRelationState = (FollowRelationState) obj;
        return followRelationState.copy(followRelationState.connectedRelationCount, awS33S0001000_19.f989i0, followRelationState.mutualCount, followRelationState.isFollowingTab, followRelationState.tabIndex, followRelationState.isFollowerTab, followRelationState.hasVisitedFollowerTab, followRelationState.hasVisitedFriendsTab, followRelationState.isPrivacyGuideClosed);
    }

    public static final Object invoke$11(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1218620hoi.LIZ((C1218620hoi) obj, null, null, new C291001Au(Integer.valueOf(awS33S0001000_19.f989i0)), 3);
    }

    public static final Object invoke$12(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        int i;
        C1250500ie8 c1250500ie8 = (C1250500ie8) obj;
        Integer numValueOf = Integer.valueOf(awS33S0001000_19.f989i0);
        int iIntValue = numValueOf.intValue();
        if (iIntValue != 3 && iIntValue != -1) {
            numValueOf.intValue();
            i = 2;
        } else {
            i = c1250500ie8.LLILLL;
        }
        return C1250500ie8.LIZ(c1250500ie8, false, awS33S0001000_19.f989i0, i, false, new C1623706Xj(), null, null, null, false, false, 1001);
    }

    public static final Object invoke$13(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ((Window) obj).getAttributes().height = awS33S0001000_19.f989i0;
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ((Window) obj).getAttributes().height = awS33S0001000_19.f989i0;
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ((CustomDialogFragment) obj).MR(new AwS33S0001000_19(awS33S0001000_19.f989i0, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ((Window) obj).getAttributes().height = awS33S0001000_19.f989i0;
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1258560ir8.LIZ((C1258560ir8) obj, null, null, null, null, new C291001Au(Integer.valueOf(awS33S0001000_19.f989i0)), null, null, false, null, null, 2015);
    }

    public static final Object invoke$18(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1215290hjL.LIZ((C1215290hjL) obj, null, new C291001Au(Integer.valueOf(awS33S0001000_19.f989i0)), null, 5);
    }

    public static final Object invoke$19(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1158970gGV.LIZ((C1158970gGV) obj, null, awS33S0001000_19.f989i0, null, 5);
    }

    public static final Object invoke$2(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        String str;
        C1264900j1M c1264900j1M = (C1264900j1M) obj;
        if (awS33S0001000_19.f989i0 == EnumC1155170gAN.DEFAULT.getValue()) {
            str = "default";
        } else {
            str = "latest";
        }
        return C1264900j1M.LIZ(c1264900j1M, false, null, null, null, str, null, null, 0, 239);
    }

    public static final Object invoke$20(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1158970gGV.LIZ((C1158970gGV) obj, new C291001Au(Integer.valueOf(awS33S0001000_19.f989i0)), 0, null, 6);
    }

    public static final Object invoke$21(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1158970gGV.LIZ((C1158970gGV) obj, null, 0, Integer.valueOf(awS33S0001000_19.f989i0), 3);
    }

    public static final Object invoke$22(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ((TuxIconView) obj).setTintColor(awS33S0001000_19.f989i0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1236480iHW.LIZ((C1236480iHW) obj, null, new C1623606Xi(Integer.valueOf(awS33S0001000_19.f989i0)), null, null, null, 29);
    }

    public static final Object invoke$4(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C346160Dhe.LIZ((C346160Dhe) obj, false, false, null, new C1623606Xi(Integer.valueOf(awS33S0001000_19.f989i0)), null, 23);
    }

    public static final Object invoke$5(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ProfilePlatformProtocol profilePlatformProtocol = (ProfilePlatformProtocol) obj;
        if (profilePlatformProtocol != null && profilePlatformProtocol.LJJJZ()) {
            profilePlatformProtocol.LLJ = awS33S0001000_19.f989i0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        ProfilePlatformProtocol profilePlatformProtocol = (ProfilePlatformProtocol) obj;
        if (profilePlatformProtocol != null) {
            profilePlatformProtocol.LLJ = awS33S0001000_19.f989i0;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        AbstractC1623806Xk<Integer> c1623606Xi;
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        AbstractC1623806Xk<Integer> abstractC1623806Xk = c1236480iHW.LLILLJJLI;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            c1623606Xi = new C1623606Xi<>(Integer.valueOf(((Number) ((C1623606Xi) abstractC1623806Xk).LIZ).intValue() + awS33S0001000_19.f989i0));
        } else {
            c1623606Xi = abstractC1623806Xk;
        }
        return C1236480iHW.LIZ(c1236480iHW, null, c1623606Xi, null, null, null, 29);
    }

    public static final Object invoke$8(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        return C1264900j1M.LIZ((C1264900j1M) obj, false, null, null, null, null, null, null, awS33S0001000_19.f989i0, 127);
    }

    public static final Object invoke$9(AwS33S0001000_19 awS33S0001000_19, Object obj) {
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        return followingRelationState.copy(followingRelationState.userId, followingRelationState.secUserId, followingRelationState.isSelf, followingRelationState.recommendList, followingRelationState.jediListState, followingRelationState.isHotsoonHasMore, followingRelationState.vcdCount, followingRelationState.hotsoonText, followingRelationState.unreadCountMap, followingRelationState.unreadUidList, followingRelationState.pageToken, awS33S0001000_19.f989i0, followingRelationState.listState, followingRelationState.payload, followingRelationState.refresh, followingRelationState.removeUid, followingRelationState.followingListOwner);
    }
}
