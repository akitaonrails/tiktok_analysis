package kotlin.jvm.internal;

import X.C01GW;
import X.C036E;
import X.C09AY;
import X.C0O0L;
import X.C0SJJ;
import X.C0SJL;
import X.C0SJM;
import X.C0SPV;
import X.C0WIY;
import X.C0XF5;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C291001Au;
import X.C703570Ril;
import X.C719000SIg;
import X.C720840SPi;
import X.C733660SqC;
import X.InterfaceC0148002o;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC1631620sYq;
import X.InterfaceC738070SxJ;
import Y.ARunnableS1S0202000_11;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.ab.FeedDiggNoNetToastExp;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedPlayerComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS660S0100000_11 extends C09AY implements InterfaceC1631620sYq {
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
    public AwS660S0100000_11(C0SPV c0spv, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0spv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS660S0100000_11(C720840SPi c720840SPi, int i) {
        super(3);
        this.$t = i;
        this.l0 = c720840SPi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS660S0100000_11(InterfaceC738070SxJ interfaceC738070SxJ, InterfaceC738070SxJ<S, ITEM> interfaceC738070SxJ2) {
        super(3);
        this.$t = interfaceC738070SxJ2;
        this.l0 = interfaceC738070SxJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS660S0100000_11(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Function2<Object, ? super InterfaceC1445905lJ, Object>, Object, Object, ? extends InterfaceC1449905lx<Object>> interfaceC1631620sYq2) {
        super(3);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS660S0100000_11(VideoDiggVM videoDiggVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoDiggVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS660S0100000_11(LandscapeFeedPlayerComponent landscapeFeedPlayerComponent, int i) {
        super(3);
        this.$t = i;
        this.l0 = landscapeFeedPlayerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS660S0100000_11(List list, List<C0SJL<C719000SIg>> list2) {
        super(3);
        this.$t = list2;
        this.l0 = list;
    }

    public static final Object invoke$0(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        return new C703570Ril((InterfaceC1449905lx) ((InterfaceC1631620sYq) awS660S0100000_11.l0).invoke(obj, obj2, obj3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        if (!((Boolean) ((C291001Au) obj3).LIZ).booleanValue()) {
            if (C1389300mG0.LIZ(((LandscapeFeedPlayerComponent) awS660S0100000_11.l0).getPanelContext()).equals("homepage_hot")) {
                LandscapeFeedPlayerComponent.fo((LandscapeFeedPlayerComponent) awS660S0100000_11.l0);
            }
            ((LandscapeFeedPlayerComponent) awS660S0100000_11.l0).P2().LJFF(System.currentTimeMillis(), null, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        return ((InterfaceC738070SxJ) awS660S0100000_11.l0).itemSync2StateAccept((InterfaceC0148002o) obj, obj2, (List) obj3);
    }

    public static final Object invoke$3(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C0SPV c0spv = (C0SPV) awS660S0100000_11.l0;
        HandlerHook.viewPost(c0spv.LLILLJJLI, new ARunnableS1S0202000_11(c0spv, iIntValue, iIntValue2, obj3, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        C0SJJ c0sjj;
        String str;
        int type;
        C0SJL c0sjl = (C0SJL) obj;
        C0SJL c0sjl2 = (C0SJL) obj2;
        if (!(c0sjl2 instanceof C0SJM)) {
            if (!Intrinsics.LJFF(c0sjl2.LIZLLL(), "br")) {
                ((List) awS660S0100000_11.l0).add(c0sjl2);
                C719000SIg c719000SIg = (C719000SIg) c0sjl2.LLIZ;
                if (c719000SIg != null && c719000SIg.LIZ() && ((type = c719000SIg.LIZ.getType()) == 0 || type == 1 || type == 2 || type == 3 || type == 5)) {
                    ((List) awS660S0100000_11.l0).add(new C0SJM(0, 0, " "));
                    return c0sjl2;
                }
            }
        } else {
            C0SJJ c0sjj2 = (C0SJJ) c0sjl2;
            if (c0sjl instanceof C0SJJ) {
                c0sjj = (C0SJJ) c0sjl;
            } else {
                c0sjj = null;
            }
            if (c0sjj2 != null && c0sjj != null && (str = c0sjj2.LLJI) != null && Intrinsics.LJFF(str, c0sjj.LLJI)) {
                ((List) awS660S0100000_11.l0).add(c0sjl2);
                return c0sjl2;
            }
        }
        return c0sjl2;
    }

    public static final Object invoke$5(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        String aid;
        Aweme aweme;
        int i;
        Context context;
        Activity activityLIZ;
        int iIntValue = ((Number) obj2).intValue();
        if (((Boolean) obj3).booleanValue()) {
            VideoDiggVM videoDiggVM = (VideoDiggVM) awS660S0100000_11.l0;
            videoDiggVM.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C01GW c01gw = FeedDiggNoNetToastExp.LIZ;
            FeedDiggNoNetToastExp.NoNetToastConfig noNetToastConfig = (FeedDiggNoNetToastExp.NoNetToastConfig) c01gw.getValue();
            if (noNetToastConfig != null && noNetToastConfig.enable == 1) {
                C733660SqC.LIZ.getClass();
                if (!C0XF5.LIZIZ() || C036E.LIZ.LIZJ != C0O0L.AVAILABLE) {
                    long j = jCurrentTimeMillis - VideoDiggVM.LLJJI;
                    FeedDiggNoNetToastExp.NoNetToastConfig noNetToastConfig2 = (FeedDiggNoNetToastExp.NoNetToastConfig) c01gw.getValue();
                    if (noNetToastConfig2 != null) {
                        i = noNetToastConfig2.toastInterval;
                    } else {
                        i = 10;
                    }
                    if (j > ((long) (i * 60)) * 1000 && (context = videoDiggVM.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIIZ(2131838490);
                        c1389890mGx.LJIIJJI();
                        VideoDiggVM.LLJJI = jCurrentTimeMillis;
                    }
                }
            }
            VideoItemParams item = ((VideoDiggVM) awS660S0100000_11.l0).getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(obj, aid)) {
                ((VideoDiggVM) awS660S0100000_11.l0).oP1(new C0WIY<>(obj, Integer.valueOf(iIntValue)));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS660S0100000_11 awS660S0100000_11, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C720840SPi c720840SPi = (C720840SPi) awS660S0100000_11.l0;
        HandlerHook.viewPost(c720840SPi, new ARunnableS1S0202000_11(c720840SPi, iIntValue, iIntValue2, obj3, 1));
        return Unit.LIZ;
    }
}
