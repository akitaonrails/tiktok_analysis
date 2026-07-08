package kotlin.jvm.internal;

import X.C09AY;
import X.C11PQ;
import X.C1283180jUq;
import X.C1283230jUv;
import X.C13LP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C937310aUz;
import X.C938220aWS;
import X.C938230aWT;
import X.C938350aWf;
import X.C939240aY6;
import X.C941990acX;
import X.C942000acY;
import X.EnumC965730bEp;
import X.InterfaceC942030acb;
import X.ViewOnClickListenerC986770bml;
import Y.ARunnableS84S0200000_15;
import android.os.Handler;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveLeagueMatchRankBadgeDisplayDuration;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS0S0320000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0320000_15 awS0S0320000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS0S0320000_15.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS0S0320000_15.l0);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS0S0320000_15.z3);
        sbLIZ.append(" new=");
        sbLIZ.append(awS0S0320000_15.z4);
        C937310aUz.LJII("onAudioMuteStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((MultiGuestLayoutRenderV2) awS0S0320000_15.l2).LLJ) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS0S0320000_15.z4)));
        }
        List<InterfaceC942030acb> listLLIIII = C13LP.LLIIII(((MultiGuestLayoutRenderV2) awS0S0320000_15.l2).LLILZLL.values());
        boolean z = awS0S0320000_15.z4;
        for (InterfaceC942030acb interfaceC942030acb : listLLIIII) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJII(strLIZ, z);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0320000_15 awS0S0320000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS0S0320000_15.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS0S0320000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS0S0320000_15.z3);
        sbLIZ.append(" new=");
        sbLIZ.append(awS0S0320000_15.z4);
        C937310aUz.LJII("onVideoMuteStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((MultiGuestLayoutRenderV2) awS0S0320000_15.l2).LLJ) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS0S0320000_15.z4)));
        }
        for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(((MultiGuestLayoutRenderV2) awS0S0320000_15.l2).LLILZLL.values())) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIJJLI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0320000_15 awS0S0320000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS0S0320000_15.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS0S0320000_15.l0);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS0S0320000_15.z3);
        sbLIZ.append(" new=");
        sbLIZ.append(awS0S0320000_15.z4);
        C937310aUz.LJII("onAudioMuteStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((C939240aY6) awS0S0320000_15.l2).LLJJJIL) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS0S0320000_15.z4)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S0320000_15 awS0S0320000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS0S0320000_15.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS0S0320000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS0S0320000_15.z3);
        sbLIZ.append(" new=");
        sbLIZ.append(awS0S0320000_15.z4);
        C937310aUz.LJII("onVideoMuteStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((C939240aY6) awS0S0320000_15.l2).LLJJJIL) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS0S0320000_15.z4)));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS0S0320000_15 awS0S0320000_15) {
        Handler handler;
        if (!awS0S0320000_15.z3 && (handler = ((ViewOnClickListenerC986770bml) awS0S0320000_15.l0).getHandler()) != null) {
            C786410Ut5.LJLIIL(LiveLeagueMatchRankBadgeDisplayDuration.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT, handler, new ARunnableS84S0200000_15((ViewOnClickListenerC986770bml) awS0S0320000_15.l0, (BattleComboInfo) awS0S0320000_15.l1, (GiftGalleryBadgeInfo) awS0S0320000_15.l2, 30));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("badgeStreakAni animation end, change to play win streak animation ");
        sbLIZ.append(awS0S0320000_15.z4);
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0320000_15(C1283230jUv c1283230jUv, EnumC965730bEp enumC965730bEp, boolean z, boolean z2, C939240aY6 c939240aY6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = enumC965730bEp;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = c939240aY6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0320000_15(C1283230jUv c1283230jUv, EnumC965730bEp enumC965730bEp, boolean z, boolean z2, MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = enumC965730bEp;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = multiGuestLayoutRenderV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0320000_15(boolean z, ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, boolean z2, BattleComboInfo battleComboInfo, GiftGalleryBadgeInfo giftGalleryBadgeInfo, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = viewOnClickListenerC986770bml;
        this.z4 = z2;
        this.l1 = battleComboInfo;
        this.l2 = giftGalleryBadgeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0320000_15(C941990acX c941990acX, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2, C939240aY6 c939240aY6, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC965730bEp;
        this.l1 = c1283230jUv;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = c939240aY6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0320000_15(C942000acY c942000acY, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2, MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC965730bEp;
        this.l1 = c1283230jUv;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = multiGuestLayoutRenderV2;
    }
}
