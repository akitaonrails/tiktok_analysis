package kotlin.jvm.internal;

import X.C09AY;
import X.C1161920gLG;
import X.C1304660k3U;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C497740JfY;
import X.C758340Tou;
import X.C766270U4b;
import X.C783270Uo1;
import X.C926770aDz;
import X.C930480aJy;
import X.C934120aPq;
import X.C934130aPr;
import X.C939710aYr;
import X.C955430ayD;
import X.C955590ayT;
import X.C959640b50;
import X.C973660bRc;
import X.C975570bUh;
import X.C977570bXv;
import X.C977610bXz;
import X.C977760bYE;
import X.C979420bau;
import X.C980940bdM;
import X.C984910bjl;
import X.EnumC958900b3o;
import X.EnumC959580b4u;
import X.EnumC959690b55;
import X.EnumC980440bcY;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.aihistory.MatchAIHistoryViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS133S0110000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS133S0110000_15 awS133S0110000_15) {
        ((C977570bXv) awS133S0110000_15.l0).LJIILL = C977760bYE.LIZ(true);
        C977610bXz c977610bXz = ((C977570bXv) awS133S0110000_15.l0).LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.LIZLLL(awS133S0110000_15.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS133S0110000_15 awS133S0110000_15) {
        Object value;
        C973660bRc.LIZ.LJJJJJ(((MatchAIHistoryViewModel) awS133S0110000_15.l0).LLILLL, "match_option", "pk_icon", "turn_off_share_perf", "turn_off", true);
        C20441214yg.LJIIIZ("MatchAIHistoryViewModel", "onAIHistoryDataShareSwitch: positiveClick");
        MatchAIHistoryViewModel matchAIHistoryViewModel = (MatchAIHistoryViewModel) awS133S0110000_15.l0;
        boolean z = awS133S0110000_15.z1;
        C2252321DDq c2252321DDq = matchAIHistoryViewModel.LLILZIL;
        do {
            value = c2252321DDq.getValue();
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C980940bdM(z)));
        Object obj = ((MatchAIHistoryViewModel) awS133S0110000_15.l0).LLILLJJLI;
        if (obj instanceof LinkDialog) {
            ((LiveDialogFragment) obj).onBackPressed();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS133S0110000_15 awS133S0110000_15) {
        C955430ayD.LJI(awS133S0110000_15.z1, (C955590ayT) awS133S0110000_15.l0, "private_account");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS133S0110000_15 awS133S0110000_15) {
        C955430ayD.LJI(awS133S0110000_15.z1, (C955590ayT) awS133S0110000_15.l0, "subscribers_only_live");
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS133S0110000_15 awS133S0110000_15) {
        C979420bau c979420bau = ((C984910bjl) awS133S0110000_15.l0).LLJILLL;
        if (c979420bau != null) {
            c979420bau.setVisibility(false);
        }
        if (awS133S0110000_15.z1) {
            ((C984910bjl) awS133S0110000_15.l0).LJIL();
        } else {
            ((C984910bjl) awS133S0110000_15.l0).LJJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS133S0110000_15 awS133S0110000_15) {
        boolean z;
        UserState userStateL8;
        ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(((C939710aYr) awS133S0110000_15.l0).getWindow().LJJIIJ());
        if (iLinkStateAbilityLIZJ != null && (userStateL8 = iLinkStateAbilityLIZJ.L8(((C939710aYr) awS133S0110000_15.l0).getInteractId())) != null && userStateL8.videoMuted == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z != awS133S0110000_15.z1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dataHolder videoMuted: ");
            sbLIZ.append(awS133S0110000_15.z1);
            sbLIZ.append(" , stateAbility videoMuted: ");
            sbLIZ.append(z);
            sbLIZ.append(" , linkmic_id : ");
            sbLIZ.append(((C939710aYr) awS133S0110000_15.l0).getInteractId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1AZW.LJFF("MultiGuestV3GuestMask_va_state_ability", strLIZIZ, null, null);
            C1304660k3U c1304660k3U = C1304660k3U.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateVideoAndAudioStatus video , errMsg : ");
            sbLIZ2.append(strLIZIZ);
            c1304660k3U.LIZIZ(510, strLIZIZ, new Throwable(C2188811AlT.LIZIZ(sbLIZ2)), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS133S0110000_15 awS133S0110000_15) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = ((MultiGuestV3GuestPresenter) awS133S0110000_15.l0).getMultiGuestDataHolder();
        boolean z = awS133S0110000_15.z1;
        c930480aJy.getClass();
        C758340Tou c758340TouLJI = C930480aJy.LJI(multiGuestDataHolder, z, true, 1);
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null) {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) awS133S0110000_15.l0;
            return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLinkVideoView(contextLJII, c758340TouLJI, multiGuestV3GuestPresenter.getMultiGuestV3OriginFrameReviewManager(), multiGuestV3GuestPresenter.mDataChannel);
        }
        return null;
    }

    public static final Object invoke$3(AwS133S0110000_15 awS133S0110000_15) {
        if (awS133S0110000_15.z1) {
            C783270Uo1.LIZLLL(new ARunnableS115S0100000_15((C934120aPq) awS133S0110000_15.l0, 48));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS133S0110000_15 awS133S0110000_15) {
        if (awS133S0110000_15.z1) {
            C783270Uo1.LIZLLL(new ARunnableS115S0100000_15((C934130aPr) awS133S0110000_15.l0, 49));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS133S0110000_15 awS133S0110000_15) {
        C979420bau c979420bau = ((C975570bUh) awS133S0110000_15.l0).LLILZIL;
        if (c979420bau != null) {
            c979420bau.setVisibility(false);
        }
        if (awS133S0110000_15.z1) {
            ((C975570bUh) awS133S0110000_15.l0).LJIIJJI();
        } else {
            ((C975570bUh) awS133S0110000_15.l0).LJIIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS133S0110000_15 awS133S0110000_15) {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        c973660bRc.LJJJJJ(((MatchOptionViewModel) awS133S0110000_15.l0).LLILZ, "match_option", "pk_icon", "turn_off_ai_comment", "turn_off", true);
        C20441214yg.LJIIIZ("MatchOptionViewModel", "onAICommentarySwitch: positiveClick");
        ((MatchOptionViewModel) awS133S0110000_15.l0).vQ2(awS133S0110000_15.z1, EnumC980440bcY.AI_COMMENTARY);
        C766270U4b.LIZLLL(2131853693);
        c973660bRc.LJJJJLI(((MatchOptionViewModel) awS133S0110000_15.l0).LLILZ, "turn_off");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS133S0110000_15 awS133S0110000_15) {
        C20441214yg.LJIIIZ("MatchOptionViewModel", "onIcyClashSwitch: positiveClick");
        ((MatchOptionViewModel) awS133S0110000_15.l0).vQ2(awS133S0110000_15.z1, EnumC980440bcY.ICY_CLASH);
        C766270U4b.LIZLLL(2131853056);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS133S0110000_15 awS133S0110000_15) {
        ((C959640b50) awS133S0110000_15.l0).LJJIJ(EnumC958900b3o.PREPARED, null, EnumC959690b55.RECEIVE_QUICK_INVITE_DURING_COHOST_REPLY_AGREE_MESSAGE);
        ((C959640b50) awS133S0110000_15.l0).LIZ.LJ(null, EnumC959580b4u.QUICK_CO_HOST_CONNECTED, null, awS133S0110000_15.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS133S0110000_15 awS133S0110000_15) {
        C20441214yg.LIZIZ("QuickCoHostStateWaited", "[Skip Client Invite Optimization] receive quick pair reply message transit to prepared status");
        ((C959640b50) awS133S0110000_15.l0).LJJIJ(EnumC958900b3o.PREPARED, null, EnumC959690b55.RECEIVE_QUICK_PAIR_REPLY_AGREE_MESSAGE);
        ((C959640b50) awS133S0110000_15.l0).LIZ.LJ(null, EnumC959580b4u.QUICK_CO_HOST_CONNECTED, null, awS133S0110000_15.z1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(C939710aYr c939710aYr, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c939710aYr;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(C959640b50 c959640b50, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c959640b50;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(C975570bUh c975570bUh, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c975570bUh;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(C977570bXv c977570bXv, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977570bXv;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(C984910bjl c984910bjl, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c984910bjl;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(MatchOptionViewModel matchOptionViewModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = matchOptionViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(MatchAIHistoryViewModel matchAIHistoryViewModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = matchAIHistoryViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiGuestV3GuestPresenter;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(boolean z, C934120aPq c934120aPq, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c934120aPq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(boolean z, C934130aPr c934130aPr, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c934130aPr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0110000_15(boolean z, C955590ayT c955590ayT, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c955590ayT;
    }
}
