package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0C64;
import X.C0CBR;
import X.C1233040iBy;
import X.C1389880mGw;
import X.C1440005kM;
import X.C1590480rUU;
import X.C20684815ws;
import X.C2276411E8h;
import X.C2344009Gk;
import X.C299060Bns;
import X.C325170Cot;
import X.C586100Mym;
import X.C631370Opb;
import X.C712440Rx4;
import X.C724240Sb0;
import X.C730950Slp;
import X.C730960Slq;
import X.C731940SnQ;
import X.C733660SqC;
import X.C734440SrS;
import X.C735370Ssx;
import X.InterfaceC702260Rge;
import X.InterfaceC702820RhY;
import X.InterfaceC736810SvH;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.FcpAbilityKt$createFcpComponentProtocol$1;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS153S1200000_11 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS153S1200000_11 awS153S1200000_11, Object obj, Object obj2) {
        String str;
        boolean zIsLike;
        String str2;
        Aweme aweme = (Aweme) obj2;
        if (((Boolean) obj).booleanValue()) {
            C1590480rUU c1590480rUU = C1590480rUU.LIZ;
            View viewLJJIJL = ((VideoDiggAssem) awS153S1200000_11.l1).LJJIJL();
            VideoItemParams item = ((VideoDiggAssem) awS153S1200000_11.l1).Fp().getItem();
            String str3 = null;
            if (item != null) {
                str = item.mEventType;
            } else {
                str = null;
            }
            c1590480rUU.getClass();
            C1590480rUU.LJ(viewLJJIJL, str, "digg");
            if (C0CBR.LIZLLL) {
                C730950Slp.LIZ(((VideoDiggAssem) awS153S1200000_11.l1).getContentView().findViewById(R.id.ftt));
            } else {
                C731940SnQ c731940SnQ = (C731940SnQ) ((VideoDiggAssem) awS153S1200000_11.l1).getContentView().findViewById(R.id.ftt);
                VideoDiggAssem videoDiggAssem = (VideoDiggAssem) awS153S1200000_11.l1;
                if (!videoDiggAssem.Ep(aweme, (View) awS153S1200000_11.l2, c731940SnQ, ((VideoItemParams) C631370Opb.LIZ(videoDiggAssem)).mEventType, false)) {
                    c731940SnQ.LJIIJJI((View) awS153S1200000_11.l2, aweme);
                }
            }
            if (aweme != null) {
                zIsLike = aweme.isLike();
            } else {
                zIsLike = false;
            }
            VideoItemParams item2 = ((VideoDiggAssem) awS153S1200000_11.l1).Fp().getItem();
            if (item2 == null || (str2 = item2.mEventType) == null) {
                str2 = "";
            }
            C1440005kM.LIZ(new C586100Mym(aweme, str2, zIsLike));
            C733660SqC.LIZ.getClass();
            if (!C733660SqC.LIZ()) {
                if (C299060Bns.LIZ()) {
                    Fragment fragmentLJI = C724240Sb0.LJI((VideoDiggAssem) awS153S1200000_11.l1);
                    if (fragmentLJI != null) {
                        C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI);
                        c1389880mGw.LJIIIIZZ(2131837962);
                        c1389880mGw.LJIIJ();
                    }
                } else {
                    C1233040iBy c1233040iBy = new C1233040iBy(((VideoDiggAssem) awS153S1200000_11.l1).getContext());
                    c1233040iBy.LIZIZ(2131837962);
                    c1233040iBy.LIZLLL();
                }
                C734440SrS c734440SrS = C734440SrS.LIZ;
                C325170Cot c325170Cot = new C325170Cot(3011, "net is not available");
                c734440SrS.getClass();
                C734440SrS.LIZJ(aweme, c325170Cot);
            } else if (aweme == null) {
                C2276411E8h.LIZIZ.LIZJ("common_feed", 6, "VideoDiggAssem", "handleDiggClick:" + ((VideoDiggAssem) awS153S1200000_11.l1).getContext() + ",aweme: null");
                C734440SrS c734440SrS2 = C734440SrS.LIZ;
                C325170Cot c325170Cot2 = new C325170Cot(3016, "aweme is null");
                c734440SrS2.getClass();
                C734440SrS.LIZJ(aweme, c325170Cot2);
            } else {
                C730960Slq c730960SlqLIZ = C730960Slq.LIZ();
                View viewFindViewById = ((VideoDiggAssem) awS153S1200000_11.l1).getContentView().findViewById(R.id.ftt);
                VideoItemParams item3 = ((VideoDiggAssem) awS153S1200000_11.l1).Fp().getItem();
                if (item3 != null) {
                    str3 = item3.mEventType;
                }
                String strLIZJ = C735370Ssx.LIZJ(aweme);
                String strLIZLLL = C735370Ssx.LIZLLL(aweme);
                c730960SlqLIZ.getClass();
                C730960Slq.LIZIZ(viewFindViewById, 1, str3, strLIZJ, strLIZLLL, null);
                ((VideoDiggAssem) awS153S1200000_11.l1).Fp().EQ2(aweme, awS153S1200000_11.s0, new AwS377S0200000_11((VideoDiggAssem) awS153S1200000_11.l1, aweme, 26));
            }
            C0C64.LJIILLIIL().LJIL(31744, 1, "hybrid_test_experiment_string", "default", false);
        } else {
            C1233040iBy c1233040iBy2 = new C1233040iBy(((VideoDiggAssem) awS153S1200000_11.l1).getContext());
            c1233040iBy2.LIZIZ(2131858551);
            c1233040iBy2.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS153S1200000_11 awS153S1200000_11, Object obj, Object obj2) {
        if (Intrinsics.LJFF(obj, C712440Rx4.LIZ(((StoryGuideCardShareViewModel) awS153S1200000_11.l1).LLILZIL))) {
            ((C013C) awS153S1200000_11.l2).element = true;
            ((StoryGuideCardShareViewModel) awS153S1200000_11.l1).LLJ = awS153S1200000_11.s0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS153S1200000_11 awS153S1200000_11, Object obj, Object obj2) {
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        Map<String, String> mapLIZ = ((FcpAbilityKt$createFcpComponentProtocol$1) awS153S1200000_11.l1).LIZ(awS153S1200000_11.s0);
        if (mapLIZ != null) {
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        if (((InterfaceC702260Rge) awS153S1200000_11.l2).LIZIZ(awS153S1200000_11.s0)) {
            ((InterfaceC702260Rge) awS153S1200000_11.l2).LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS153S1200000_11 awS153S1200000_11, Object obj, Object obj2) {
        String str = (String) obj;
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        Map<String, String> mapLIZ = ((FcpAbilityKt$createFcpComponentProtocol$1) awS153S1200000_11.l1).LIZ(awS153S1200000_11.s0);
        if (mapLIZ != null) {
            FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1 = (FcpAbilityKt$createFcpComponentProtocol$1) awS153S1200000_11.l1;
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "btm")) {
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    String value = entry.getValue();
                    if (!(value instanceof String)) {
                        value = null;
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(btmSDK, String.valueOf(value), PageFinder.via(fcpAbilityKt$createFcpComponentProtocol$1.Vt()), null, 4, null).entrySet()) {
                        c2344009Gk.LJ(entry2.getValue(), (String) entry2.getKey());
                    }
                } else {
                    c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                }
            }
        }
        InterfaceC736810SvH interfaceC736810SvHLJFF = ((InterfaceC702260Rge) awS153S1200000_11.l2).LJFF(awS153S1200000_11.s0);
        if (interfaceC736810SvHLJFF != null && (interfaceC736810SvHLJFF instanceof InterfaceC702820RhY)) {
            InterfaceC702820RhY interfaceC702820RhY = (InterfaceC702820RhY) interfaceC736810SvHLJFF;
            for (Map.Entry<String, String> entry3 : interfaceC702820RhY.Pi().entrySet()) {
                c2344009Gk.LJFF(entry3.getKey(), entry3.getValue());
            }
            interfaceC702820RhY.E2();
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS153S1200000_11 awS153S1200000_11, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLIZ = ((FcpAbilityKt$createFcpComponentProtocol$1) awS153S1200000_11.l1).LIZ(awS153S1200000_11.s0);
        if (mapLIZ != null) {
            FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1 = (FcpAbilityKt$createFcpComponentProtocol$1) awS153S1200000_11.l1;
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "btm")) {
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    String value = entry.getValue();
                    if (!(value instanceof String)) {
                        value = null;
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(btmSDK, String.valueOf(value), PageFinder.via(fcpAbilityKt$createFcpComponentProtocol$1.Vt()), null, 4, null).entrySet()) {
                        linkedHashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        InterfaceC736810SvH interfaceC736810SvHLJFF = ((InterfaceC702260Rge) awS153S1200000_11.l2).LJFF(awS153S1200000_11.s0);
        if (interfaceC736810SvHLJFF != null && (interfaceC736810SvHLJFF instanceof InterfaceC702820RhY)) {
            InterfaceC702820RhY interfaceC702820RhY = (InterfaceC702820RhY) interfaceC736810SvHLJFF;
            for (Map.Entry<String, String> entry3 : interfaceC702820RhY.u8().entrySet()) {
                linkedHashMap.put(entry3.getKey(), entry3.getValue());
            }
            interfaceC702820RhY.mk();
        }
        return linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1200000_11(VideoDiggAssem videoDiggAssem, View view, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = videoDiggAssem;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1200000_11(StoryGuideCardShareViewModel storyGuideCardShareViewModel, C013C c013c, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = storyGuideCardShareViewModel;
        this.l2 = c013c;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS153S1200000_11(FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1, String str, InterfaceC702260Rge interfaceC702260Rge, int i) {
        super(2);
        this.$t = i;
        this.l1 = fcpAbilityKt$createFcpComponentProtocol$1;
        this.s0 = str;
        this.l2 = interfaceC702260Rge;
    }
}
