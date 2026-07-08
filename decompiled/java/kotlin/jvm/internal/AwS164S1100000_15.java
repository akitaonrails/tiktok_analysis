package kotlin.jvm.internal;

import X.AbstractC1143290frD;
import X.C09AY;
import X.C1105630esT;
import X.C1109770ez9;
import X.C1143300frE;
import X.C1161920gLG;
import X.C16F5;
import X.C176600m4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916150Zwr;
import X.C918060Zzw;
import X.C919900a2u;
import X.C925150aBN;
import X.C930540aK4;
import X.C939720aYs;
import X.C939740aYu;
import X.C943900afc;
import X.C944860ahA;
import X.C948450amx;
import X.C963140bAe;
import X.C971330bNr;
import X.C982030bf7;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownViewModel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS164S1100000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS164S1100000_15 awS164S1100000_15) {
        return Boolean.valueOf(Intrinsics.LJFF(((C971330bNr) awS164S1100000_15.l1).LIZJ.LIZ, awS164S1100000_15.s0));
    }

    public static final Object invoke$1(AwS164S1100000_15 awS164S1100000_15) {
        C16F5 c16f5 = ((C943900afc) awS164S1100000_15.l1).LJJIIJZLJL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131843684, awS164S1100000_15.s0, C963140bAe.LJIIJ(0L)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS164S1100000_15 awS164S1100000_15) {
        C944860ahA c944860ahA = (C944860ahA) awS164S1100000_15.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = awS164S1100000_15.s0;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("sec_source", str);
        c944860ahA.LJ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS164S1100000_15 awS164S1100000_15) {
        boolean z;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        ((C919900a2u) awS164S1100000_15.l1).getClass();
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("ZoomAnchorMessageHandler", "onUserLeft");
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (!C918060Zzw.LIZ(zLIZJ) && ((C919900a2u) awS164S1100000_15.l1).LIZ.LJJ() && Intrinsics.LJFF(awS164S1100000_15.s0, ((C919900a2u) awS164S1100000_15.l1).LIZ.LJIILIIL())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AwS164S1100000_15 awS164S1100000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTicketUIByPlayingStyle, clearTicketUIPlayingStyle, source=");
        sbLIZ.append(awS164S1100000_15.s0);
        C20441214yg.LJIIIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
        C939740aYu c939740aYu = (C939740aYu) awS164S1100000_15.l1;
        View view = c939740aYu.LLLILZLLLI;
        if (view != null) {
            view.setBackgroundResource(R.drawable.ea9);
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(2);
        C1105630esT c1105630esT = c939740aYu.LLLIILIL;
        if (c1105630esT != null) {
            ArrayList<View> arrayList = new ArrayList();
            C1105630esT c1105630esT2 = c939740aYu.LLLIL;
            if (c1105630esT2 != null) {
                arrayList.add(c1105630esT2);
            }
            arrayList.add(c1105630esT);
            for (View view2 : arrayList) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMarginStart(iLIZIZ);
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS164S1100000_15 awS164S1100000_15) {
        ((Function2) awS164S1100000_15.l1).invoke("", awS164S1100000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS164S1100000_15 awS164S1100000_15) {
        return Boolean.valueOf(Intrinsics.LJFF(((C971330bNr) awS164S1100000_15.l1).LIZJ.LIZ, awS164S1100000_15.s0));
    }

    public static final Object invoke$2(AwS164S1100000_15 awS164S1100000_15) {
        C766270U4b.LJIIIZ((Context) awS164S1100000_15.l1, awS164S1100000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS164S1100000_15 awS164S1100000_15) {
        C766270U4b.LJIIIZ((Context) awS164S1100000_15.l1, awS164S1100000_15.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS164S1100000_15 awS164S1100000_15) {
        if (((C939720aYs) awS164S1100000_15.l1).isInPlayMode()) {
            C939720aYs c939720aYs = (C939720aYs) awS164S1100000_15.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTicketUIByPlayingStyle, setTicketUIPlayingStyle, source=");
            sbLIZ.append(awS164S1100000_15.s0);
            c939720aYs.log(C2188811AlT.LIZIZ(sbLIZ));
            ((C939720aYs) awS164S1100000_15.l1).setTicketUIPlayingStyle();
        } else {
            C939720aYs c939720aYs2 = (C939720aYs) awS164S1100000_15.l1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateTicketUIByPlayingStyle, clearTicketUIPlayingStyle, source=");
            sbLIZ2.append(awS164S1100000_15.s0);
            c939720aYs2.log(C2188811AlT.LIZIZ(sbLIZ2));
            ((C939720aYs) awS164S1100000_15.l1).clearTicketUIPlayingStyle();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS164S1100000_15 awS164S1100000_15) {
        DataChannel dataChannel = ((C1109770ez9) awS164S1100000_15.l1).LJIIIZ;
        if (dataChannel != null) {
            dataChannel.LC0(OpenCoHostEvent.class, awS164S1100000_15.s0);
        }
        DataChannel dataChannel2 = ((C1109770ez9) awS164S1100000_15.l1).LJIIIZ;
        if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
            C766270U4b.LIZLLL(2131851531);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS164S1100000_15 awS164S1100000_15) {
        Map<Integer, String> map;
        String str;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && (map = multiGuestDataHolder.LJIJJLI) != null && (str = awS164S1100000_15.s0) != null) {
            ((ConcurrentHashMap) map).put(2, str);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LJJJJIZL(str, false, false, true, false, new C916150Zwr());
            }
        }
        C925150aBN.LJJJJI((MultiLiveAnchorPanelSettings) awS164S1100000_15.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS164S1100000_15 awS164S1100000_15) {
        MatchCountDownViewModel matchCountDownViewModel = (MatchCountDownViewModel) awS164S1100000_15.l1;
        String str = awS164S1100000_15.s0;
        matchCountDownViewModel.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpToSchema, schema = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MatchCountDownViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextLIZ, str, null);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS164S1100000_15 awS164S1100000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS164S1100000_15.s0);
        sbLIZ.append(", onTimeoutBlock");
        C20441214yg.LJIIIZ("CompetitionStatePlayingAnchor", C2188811AlT.LIZIZ(sbLIZ));
        C982030bf7 c982030bf7 = (C982030bf7) awS164S1100000_15.l1;
        C786410Ut5.LJJZZIII(c982030bf7.LJ, new ARunnableS115S0100000_15(c982030bf7, 146));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS164S1100000_15 awS164S1100000_15) {
        DataChannel dataChannel = ((C1109770ez9) awS164S1100000_15.l1).LJIIIZ;
        if (dataChannel != null) {
            dataChannel.LC0(OpenCoHostEvent.class, awS164S1100000_15.s0);
        }
        DataChannel dataChannel2 = ((C1109770ez9) awS164S1100000_15.l1).LJIIIZ;
        if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
            C766270U4b.LIZLLL(2131842739);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C939740aYu c939740aYu, int i) {
        super(0);
        this.$t = i;
        this.s0 = "onAttachedToWindow";
        this.l1 = c939740aYu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C982030bf7 c982030bf7, int i) {
        super(0);
        this.$t = i;
        this.s0 = "onStateTransitCountdownStart";
        this.l1 = c982030bf7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C919900a2u c919900a2u, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c919900a2u;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C939720aYs c939720aYs, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c939720aYs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C943900afc c943900afc, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c943900afc;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C944860ahA c944860ahA, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c944860ahA;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C971330bNr c971330bNr, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c971330bNr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(C1109770ez9 c1109770ez9, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1109770ez9;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(MatchCountDownViewModel matchCountDownViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = matchCountDownViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1100000_15(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = multiLiveAnchorPanelSettings;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS164S1100000_15(Function2 function2, Function2<? super String, ? super String, Unit> function22, String str) {
        super(0);
        this.$t = str;
        this.l1 = function2;
        this.s0 = function22;
    }
}
