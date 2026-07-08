package kotlin.jvm.internal;

import X.AbstractC1542200qEc;
import X.C09AY;
import X.C0GSA;
import X.C1077510e97;
import X.C1105360es2;
import X.C1126240fPi;
import X.C1126260fPk;
import X.C1126380fPw;
import X.C1126390fPx;
import X.C1126400fPy;
import X.C1143920fsE;
import X.C1146210fvv;
import X.C1324720kZq;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1146170fvr;
import X.InterfaceC1554220qY0;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.livesdk.broadcast.feedback.FeedbackAnimWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS125S0101000_17 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        int[] iArr = (int[]) obj;
        View view = ((FeedbackAnimWidget) awS125S0101000_17.l0).getView();
        if (view != null) {
            if (LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache()) {
                ((FeedbackAnimWidget) awS125S0101000_17.l0).x1();
            } else {
                FeedbackAnimWidget feedbackAnimWidget = (FeedbackAnimWidget) awS125S0101000_17.l0;
                if (feedbackAnimWidget.LL == null) {
                    feedbackAnimWidget.x1();
                }
            }
            C1143920fsE c1143920fsE = ((FeedbackAnimWidget) awS125S0101000_17.l0).LL;
            if (c1143920fsE != null) {
                c1143920fsE.LIZ();
            }
            ((FeedbackAnimWidget) awS125S0101000_17.l0).show();
            view.getLocationInWindow(new int[2]);
            C786410Ut5.md((C1324720kZq) ((FeedbackAnimWidget) awS125S0101000_17.l0).LLILLJJLI.getValue(), (iArr[1] - r4[1]) - (awS125S0101000_17.i1 / 2));
            if (C497740JfY.LJJ()) {
                C786410Ut5.Qc((C1324720kZq) ((FeedbackAnimWidget) awS125S0101000_17.l0).LLILLJJLI.getValue(), iArr[0] - r4[0]);
            } else {
                C786410Ut5.Qc((C1324720kZq) ((FeedbackAnimWidget) awS125S0101000_17.l0).LLILLJJLI.getValue(), (iArr[0] - r4[0]) - awS125S0101000_17.i1);
            }
            C1143920fsE c1143920fsE2 = ((FeedbackAnimWidget) awS125S0101000_17.l0).LL;
            if (c1143920fsE2 != null) {
                c1143920fsE2.LJFF();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS125S0101000_17((C1126260fPk) awS125S0101000_17.l0, awS125S0101000_17.i1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS125S0101000_17((C1126240fPi) awS125S0101000_17.l0, awS125S0101000_17.i1, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126260fPk) awS125S0101000_17.l0).LL);
        C1126390fPx.LIZ(c1126390fPx, (r3 - 1) * 0.05f, awS125S0101000_17.i1 * 0.05f);
        c1126390fPx.LIZLLL = 100L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126240fPi) awS125S0101000_17.l0).LL);
        C1126390fPx.LIZ(c1126390fPx, (r3 - 1) * 0.05f, awS125S0101000_17.i1 * 0.05f);
        c1126390fPx.LIZLLL = 100L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList((C0GSA) awS125S0101000_17.l0);
        int i = awS125S0101000_17.i1;
        C1126390fPx.LIZJ(c1126390fPx, ((i - 1) * 64) / 20, (i * 64) / 20, new AwS620S0100000_6((C0GSA) awS125S0101000_17.l0, 106));
        c1126390fPx.LIZLLL = 100L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS125S0101000_17((C0GSA) awS125S0101000_17.l0, awS125S0101000_17.i1, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        return new C1146210fvv(((C1146210fvv) obj).LL, new Pair((EnumC1146170fvr) awS125S0101000_17.l0, Integer.valueOf(awS125S0101000_17.i1)));
    }

    public static final Object invoke$8(AwS125S0101000_17 awS125S0101000_17, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        final OnlineAudienceRankWidget onlineAudienceRankWidget = (OnlineAudienceRankWidget) awS125S0101000_17.l0;
        final int i = awS125S0101000_17.i1;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0esK
            @Override // X.AbstractC1542100qES
            public final void LJLJLLL(SparkContext sparkContext2) {
                DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(OnlineAudienceRankListDialogVisibilityChannel.class, Boolean.TRUE);
                }
                C784440Upu.LIZ().LIZIZ(new C248600xg(true));
                DataChannel dataChannel2 = onlineAudienceRankWidget.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(PanelStateEvent.class, new C0KBR(true, EnumC1105670esX.TOP_VIEWER, (int) C497740JfY.LIZIZ(i), 0));
                }
            }

            @Override // X.AbstractC1542100qES
            public final void LJLL(SparkContext sparkContext2) {
                DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(OnlineAudienceRankListDialogVisibilityChannel.class, Boolean.FALSE);
                }
                C784440Upu.LIZ().LIZIZ(new C248600xg(false));
                onlineAudienceRankWidget.LLJJ = null;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
                C784440Upu.LIZ().LIZIZ(new C248600xg(false));
            }
        });
        final OnlineAudienceRankWidget onlineAudienceRankWidget2 = (OnlineAudienceRankWidget) awS125S0101000_17.l0;
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0esL
            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i2) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
                DataChannel dataChannel = onlineAudienceRankWidget2.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(PanelStateEvent.class, new C0KBR(false, EnumC1105670esX.TOP_VIEWER, 0, 0));
                }
            }
        });
        if (C1105360es2.LIZ(((OnlineAudienceRankWidget) awS125S0101000_17.l0).dataChannel) && !TextUtils.isEmpty(C1105360es2.LIZIZ)) {
            sparkContext.LJJJJZ(new C1077510e97(2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(C0GSA c0gsa, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0gsa;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(C1126240fPi c1126240fPi, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1126240fPi;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(C1126260fPk c1126260fPk, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1126260fPk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(EnumC1146170fvr enumC1146170fvr, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1146170fvr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(FeedbackAnimWidget feedbackAnimWidget, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = feedbackAnimWidget;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0101000_17(OnlineAudienceRankWidget onlineAudienceRankWidget, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = onlineAudienceRankWidget;
        this.i1 = i;
    }
}
