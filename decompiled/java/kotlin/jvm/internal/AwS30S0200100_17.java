package kotlin.jvm.internal;

import X.AbstractC1098270egb;
import X.AbstractC1542200qEc;
import X.C08D5;
import X.C09AY;
import X.C0IK5;
import X.C1097990eg9;
import X.C1108900exk;
import X.C1108920exm;
import X.C1108940exo;
import X.C1128710fTh;
import X.C1886107a7;
import X.C497740JfY;
import X.InterfaceC465670INx;
import X.ViewOnLayoutChangeListenerC1108930exn;
import Y.ARunnableS86S0200000_17;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS30S0200100_17 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S0200100_17 awS30S0200100_17, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue <= 0) {
            jLongValue = awS30S0200100_17.j2;
        }
        C1097990eg9.LIZIZ().LIZ(Long.valueOf(jLongValue), "delay_duration");
        Handler handlerLIZ = C0IK5.LIZ();
        NewTopRightBannerWidget newTopRightBannerWidget = (NewTopRightBannerWidget) awS30S0200100_17.l0;
        C08D5.LIZIZ(handlerLIZ, new ARunnableS86S0200000_17(newTopRightBannerWidget, awS30S0200100_17.l1, 20), newTopRightBannerWidget, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S0200100_17 awS30S0200100_17, Object obj) {
        C1886107a7 c1886107a7 = (C1886107a7) obj;
        ((C1128710fTh) awS30S0200100_17.l0).LJJJJ(awS30S0200100_17.j2, (LinkedList) awS30S0200100_17.l1, c1886107a7.LIZ, c1886107a7.LIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS30S0200100_17 awS30S0200100_17, Object obj) {
        int iLJIIIZ;
        SparkContext sparkContext = (SparkContext) obj;
        ViewOnLayoutChangeListenerC1108930exn viewOnLayoutChangeListenerC1108930exn = ((LiveGoalPinCardWidget) awS30S0200100_17.l0).LLJI;
        if (viewOnLayoutChangeListenerC1108930exn != null) {
            if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                iLJIIIZ = 0;
            } else {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.as4);
            }
            double dLJJI = C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.asv));
            double dLJJI2 = C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.asu));
            double dLJJI3 = C497740JfY.LJJI(iLJIIIZ + C497740JfY.LJIIIZ(R.dimen.asa));
            double dLJJI4 = C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.akj) + C497740JfY.LJIIIZ(R.dimen.asf));
            viewOnLayoutChangeListenerC1108930exn.LLILLJJLI = new C1108940exo(dLJJI, dLJJI2, dLJJI3, dLJJI4);
            new C1108920exm(dLJJI, dLJJI2, dLJJI3, dLJJI4).invoke(sparkContext);
        }
        String str = ((C1108900exk) awS30S0200100_17.l1).LJII;
        if (str == null) {
            str = "";
        }
        sparkContext.LJJJZ("content_info", str);
        final LiveGoalPinCardWidget liveGoalPinCardWidget = (LiveGoalPinCardWidget) awS30S0200100_17.l0;
        final long j = awS30S0200100_17.j2;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0exp
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                liveGoalPinCardWidget.LLILZIL = new CountDownTimerC1151440g4M(j, liveGoalPinCardWidget, 2);
                CountDownTimerC1151440g4M countDownTimerC1151440g4M = liveGoalPinCardWidget.LLILZIL;
                if (countDownTimerC1151440g4M != null) {
                    countDownTimerC1151440g4M.start();
                }
                liveGoalPinCardWidget.LLJ = SystemClock.elapsedRealtime() + j;
                liveGoalPinCardWidget.show();
            }
        });
        sparkContext.LJJJJJ((LiveGoalPinCardWidget) awS30S0200100_17.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0200100_17(long j, C1128710fTh c1128710fTh, LinkedList linkedList, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1128710fTh;
        this.j2 = j;
        this.l1 = linkedList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0200100_17(long j, NewTopRightBannerWidget newTopRightBannerWidget, AbstractC1098270egb abstractC1098270egb, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = newTopRightBannerWidget;
        this.l1 = abstractC1098270egb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0200100_17(LiveGoalPinCardWidget liveGoalPinCardWidget, C1108900exk c1108900exk, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveGoalPinCardWidget;
        this.l1 = c1108900exk;
        this.j2 = j;
    }
}
