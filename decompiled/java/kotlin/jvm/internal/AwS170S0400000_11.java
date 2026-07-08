package kotlin.jvm.internal;

import X.C09AY;
import X.C0SH0;
import X.C0SJF;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C631370Opb;
import X.C707400Row;
import X.C718770SHj;
import X.C718800SHm;
import X.C786410Ut5;
import X.InterfaceC707420Roy;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoInfoGenreTagContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS170S0400000_11 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS170S0400000_11 awS170S0400000_11, Object obj, Object obj2) {
        final VideoGenreTagProtocol videoGenreTagProtocol;
        String aid;
        Aweme awemeIm;
        InteractAreaCommonAbility interactAreaCommonAbility;
        Aweme awemeIm2;
        PriorityProtocol priorityProtocol = (PriorityProtocol) obj;
        if (((Boolean) obj2).booleanValue()) {
            Function1 function1 = (Function1) awS170S0400000_11.l0;
            if (function1 != null) {
                function1.invoke(priorityProtocol.Vt());
            }
        } else {
            PriorityProtocol priorityProtocol2 = (PriorityProtocol) awS170S0400000_11.l1;
            String aid2 = null;
            if ((priorityProtocol2 instanceof VideoGenreTagProtocol) && (videoGenreTagProtocol = (VideoGenreTagProtocol) priorityProtocol2) != null) {
                VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem = (VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2;
                String str = videoInfoGenreTagContainerAssem.LLJLLIL;
                IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) videoInfoGenreTagContainerAssem.LLLF.getValue();
                if (iVideoCellAbility != null && (awemeIm2 = iVideoCellAbility.im()) != null) {
                    aid = awemeIm2.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(str, aid)) {
                    final VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem2 = (VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2;
                    Runnable runnable = new Runnable() { // from class: X.0RKQ
                        public final void LIZ() {
                            View view;
                            Object parent = videoInfoGenreTagContainerAssem2.LJJIJL().getParent();
                            if ((((!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? Float.valueOf(0.0f) : Integer.valueOf(view.getWidth())).floatValue() - videoInfoGenreTagContainerAssem2.tr2()) + videoGenreTagProtocol.Lf() + C418440Gaw.LIZIZ(4) >= ((Number) videoInfoGenreTagContainerAssem2.LLL.getValue()).intValue()) {
                                videoGenreTagProtocol.ka(true);
                            } else {
                                videoGenreTagProtocol.ka(false);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("VideoInfoGenreTagContainerAssem@7dde.tryContentionV2$1$runnable$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("VideoInfoGenreTagContainerAssem@7dde.tryContentionV2$1$runnable$1");
                        }
                    };
                    if (videoInfoGenreTagContainerAssem2.tr2() == 0) {
                        runnable.run();
                    } else {
                        HandlerHook.viewPost(((VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2).LJJIJL(), runnable);
                    }
                }
                Function1 function12 = (Function1) awS170S0400000_11.l3;
                if (function12 != null) {
                    function12.invoke(((PriorityProtocol) awS170S0400000_11.l1).Vt());
                }
                if (Intrinsics.LJFF(((VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2).H3(), ((PriorityProtocol) awS170S0400000_11.l1).zg()) && (interactAreaCommonAbility = (InteractAreaCommonAbility) ((VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2).LLJLL.getValue()) != null) {
                    interactAreaCommonAbility.CL(((VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2).H3(), (VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2, true);
                }
                VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem3 = (VideoInfoGenreTagContainerAssem) awS170S0400000_11.l2;
                IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) videoInfoGenreTagContainerAssem3.LLLF.getValue();
                if (iVideoCellAbility2 != null && (awemeIm = iVideoCellAbility2.im()) != null) {
                    aid2 = awemeIm.getAid();
                }
                videoInfoGenreTagContainerAssem3.LLJLLIL = aid2;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS170S0400000_11 awS170S0400000_11, Object obj, Object obj2) {
        String string;
        String str = (String) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        C707400Row c707400Row = C707400Row.LIZ;
        BannerCommonStruct bannerCommonStruct = (BannerCommonStruct) ((Function0) awS170S0400000_11.l0).invoke();
        View viewLJJIJL = ((FeedCommonBannerTrigger) awS170S0400000_11.l1).LJJIJL();
        c707400Row.getClass();
        Map mapLIZ = C707400Row.LIZ(bannerCommonStruct);
        if (!mapLIZ.isEmpty()) {
            for (Map.Entry entry : mapLIZ.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (Intrinsics.LJFF(str2, "btm")) {
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    if (str3 == null) {
                        str3 = null;
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(btmSDK, String.valueOf(str3), PageFinder.via(viewLJJIJL), null, 4, null).entrySet()) {
                        String str4 = (String) entry2.getKey();
                        Object value = entry2.getValue();
                        if (value != null) {
                            string = value.toString();
                        } else {
                            string = null;
                        }
                        c2344009Gk.LJFF(str4, string);
                    }
                } else {
                    c2344009Gk.LJFF(str2, str3);
                }
            }
        }
        InterfaceC707420Roy interfaceC707420Roy = (InterfaceC707420Roy) awS170S0400000_11.l2;
        if (interfaceC707420Roy != null) {
            c2344009Gk.LJII(interfaceC707420Roy.LIZIZ());
        }
        C0SH0 c0sh0 = (C0SH0) awS170S0400000_11.l3;
        if (c0sh0 != null) {
            c0sh0.I(((VideoItemParams) C631370Opb.LIZ((FeedCommonBannerTrigger) awS170S0400000_11.l1)).getAweme());
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS170S0400000_11 awS170S0400000_11, Object obj, Object obj2) {
        PriorityProtocol priorityProtocol = (PriorityProtocol) obj;
        if (((Boolean) obj2).booleanValue()) {
            Function1 function1 = (Function1) awS170S0400000_11.l0;
            if (function1 != null) {
                function1.invoke(priorityProtocol.Vt());
            }
        } else {
            Function1 function12 = (Function1) awS170S0400000_11.l1;
            if (function12 != null) {
                function12.invoke(((PriorityProtocol) awS170S0400000_11.l2).Vt());
            }
            String strH3 = ((VideoTagContainer) awS170S0400000_11.l3).Ap().H3();
            String strH32 = ((VideoTagContainer) awS170S0400000_11.l3).yp().H3();
            if (Intrinsics.LJFF(strH3, ((PriorityProtocol) awS170S0400000_11.l2).zg())) {
                C786410Ut5.LJLLLLLL(0, ((VideoTagContainer) awS170S0400000_11.l3).Ap().xb());
                InteractAreaCommonAbility interactAreaCommonAbilityZp = ((VideoTagContainer) awS170S0400000_11.l3).zp();
                if (interactAreaCommonAbilityZp != null) {
                    interactAreaCommonAbilityZp.CL(strH3, ((VideoTagContainer) awS170S0400000_11.l3).Ap(), true);
                }
            }
            if (Intrinsics.LJFF(strH32, ((PriorityProtocol) awS170S0400000_11.l2).zg())) {
                C786410Ut5.LJLLLLLL(0, ((VideoTagContainer) awS170S0400000_11.l3).yp().xb());
                InteractAreaCommonAbility interactAreaCommonAbilityZp2 = ((VideoTagContainer) awS170S0400000_11.l3).zp();
                if (interactAreaCommonAbilityZp2 != null) {
                    interactAreaCommonAbilityZp2.CL(strH32, ((VideoTagContainer) awS170S0400000_11.l3).yp(), true);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, X.0SJF] */
    public static final Object invoke$3(AwS170S0400000_11 awS170S0400000_11, Object obj, Object obj2) {
        ?? r6 = (C0SJF) obj;
        ((Boolean) obj2).booleanValue();
        ((C259800zU) awS170S0400000_11.l0).element = r6;
        C259800zU c259800zU = (C259800zU) awS170S0400000_11.l1;
        C718770SHj c718770SHj = (C718770SHj) awS170S0400000_11.l2;
        Aweme aweme = (Aweme) awS170S0400000_11.l3;
        C718800SHm c718800SHm = c718770SHj.LLJZIJLIL;
        T tLJIILIIL = c718800SHm;
        if (c718800SHm == null) {
            tLJIILIIL = c718770SHj.LJIILIIL(r6, aweme, null);
        }
        c259800zU.element = tLJIILIIL;
        C718770SHj c718770SHj2 = (C718770SHj) awS170S0400000_11.l2;
        return c718770SHj2.LJLL((C718800SHm) ((C259800zU) awS170S0400000_11.l1).element, c718770SHj2.LLLFFI, false, (Aweme) awS170S0400000_11.l3, true, false).getFirst();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS170S0400000_11(C259800zU c259800zU, C259800zU<C0SJF> c259800zU2, C259800zU<C718800SHm> c259800zU3, C718770SHj c718770SHj, Aweme aweme) {
        super(2);
        this.$t = aweme;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c259800zU3;
        this.l3 = c718770SHj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS170S0400000_11(Function1 function1, Function1<? super View, Unit> function12, PriorityProtocol priorityProtocol, VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem, Function1<? super View, Unit> function13) {
        super(2);
        this.$t = function13;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = priorityProtocol;
        this.l3 = videoInfoGenreTagContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS170S0400000_11(Function1 function1, Function1<? super View, Unit> function12, Function1<? super View, Unit> function13, PriorityProtocol priorityProtocol, VideoTagContainer videoTagContainer) {
        super(2);
        this.$t = videoTagContainer;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function13;
        this.l3 = priorityProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0400000_11(AwS555S0100000_11 awS555S0100000_11, FeedCommonBannerTrigger feedCommonBannerTrigger, InterfaceC707420Roy interfaceC707420Roy, C0SH0 c0sh0, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS555S0100000_11;
        this.l1 = feedCommonBannerTrigger;
        this.l2 = interfaceC707420Roy;
        this.l3 = c0sh0;
    }
}
