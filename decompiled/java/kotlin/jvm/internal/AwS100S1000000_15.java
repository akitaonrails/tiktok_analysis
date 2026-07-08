package kotlin.jvm.internal;

import X.C09AY;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C915910ZwT;
import X.C915980Zwa;
import X.C925600aC6;
import X.C927240aEk;
import X.C955400ayA;
import X.C955440ayE;
import X.C956080azG;
import X.EnumC920540a3w;
import X.InterfaceC934710aQn;
import X.InterfaceC954180awC;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS100S1000000_15 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS100S1000000_15 awS100S1000000_15) {
        C766270U4b.LJIIIZ(C497740JfY.LJII(), awS100S1000000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS100S1000000_15 awS100S1000000_15) {
        C766270U4b.LJIIIZ(C497740JfY.LJII(), awS100S1000000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS100S1000000_15 awS100S1000000_15) {
        C955440ayE c955440ayERemove = C956080azG.LIZ.remove("event_cohost_show_invitation_list");
        if (c955440ayERemove != null) {
            c955440ayERemove.LJIIL(awS100S1000000_15.s0, Scene.SCENE_SERVICE, true);
            c955440ayERemove.LJIILIIL();
            c955440ayERemove.LJIJJLI("content_first_frame");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS100S1000000_15 awS100S1000000_15) {
        C925600aC6.LJIJJLI("outside_liveroom");
        String str = awS100S1000000_15.s0;
        if (Intrinsics.LJFF(str, "guest_end_recommend_request")) {
            new C927240aEk("endLivePage", "guestReviewApply").LIZ();
        } else if (Intrinsics.LJFF(str, "guest_review_panel_recommend_link_room_request")) {
            new C927240aEk("summaryV", "applyBtn").LIZ();
        } else {
            new C927240aEk("summaryV", "applyBtn").LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS100S1000000_15 awS100S1000000_15) {
        C925600aC6.LIZ = awS100S1000000_15.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS100S1000000_15 awS100S1000000_15) {
        C766270U4b.LJIIJJI(awS100S1000000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS100S1000000_15 awS100S1000000_15) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, awS100S1000000_15.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS100S1000000_15 awS100S1000000_15) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Ac;
        C915910ZwT.LIZ(String.valueOf(awS100S1000000_15.s0), c20337914i1.LIZIZ().booleanValue(), false);
        if (c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS100S1000000_15 awS100S1000000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS100S1000000_15.s0);
        sbLIZ.append(" , checkMatchPermission failed ");
        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS100S1000000_15 awS100S1000000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS100S1000000_15.s0);
        sbLIZ.append(" , checkMatchPermission failed ");
        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS100S1000000_15 awS100S1000000_15) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LLF(new Room(), EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, C915980Zwa.LJI().LIZ().LLLFZ(), false, awS100S1000000_15.s0, 188);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS100S1000000_15 awS100S1000000_15) {
        Integer numValueOf;
        String str;
        String strU3;
        RtcUserInfo rtcUserInfoG0;
        List<LinkUser> listLIZLLL;
        HashMap map = new HashMap();
        map.put("layout_id", awS100S1000000_15.s0);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            numValueOf = Integer.valueOf(listLIZLLL.size());
        } else {
            numValueOf = null;
        }
        map.put("linked_user_count", String.valueOf(numValueOf));
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        String str2 = "";
        if (interfaceC954180awCLLJLL2 == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL2.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
            str = "";
        }
        map.put("linkmic_id", str);
        if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null && (strU3 = interfaceC954180awCLLJLL3.U3()) != null) {
                str2 = strU3;
            }
            map.put("channel_id", str2);
        }
        return map;
    }

    public static final Object invoke$9(AwS100S1000000_15 awS100S1000000_15) {
        C766270U4b.LJIIJJI(awS100S1000000_15.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S1000000_15(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
