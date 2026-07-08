package kotlin.jvm.internal;

import X.1JLP;
import X.1JLc;
import X.C01U6;
import X.C09AY;
import X.C0BL0;
import X.C0T1G;
import X.C0TEO;
import X.C0TJB;
import X.C0TKJ;
import X.C0U68;
import X.C0UD4;
import X.C0UQ8;
import X.C0UV0;
import X.C0UV1;
import X.C10H5;
import X.C10SV;
import X.C1161920gLG;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1548820qPI;
import X.C1894200zOM;
import X.C1894250zOR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2207321BaE;
import X.C2344009Gk;
import X.C354201Zc;
import X.C473410IhP;
import X.C486980J7w;
import X.C497740JfY;
import X.C500260Jjc;
import X.C753670ThN;
import X.C753880Thi;
import X.C766720U5u;
import X.C766730U5v;
import X.C772400URq;
import X.C772410URr;
import X.C772780UTc;
import X.C780470UjV;
import X.C807840VmY;
import X.C810670Vr7;
import X.C951990asf;
import X.DialogC780480UjW;
import X.EnumC486990J7x;
import X.InterfaceC760910Tt3;
import X.InterfaceC772390URp;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.livesdk.broadcast.PreviewGoLiveLoadingEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorGCBlockABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDelayManualEndTimeSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.performance.LiveJatoSetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.SmartRouter;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AwS161S1100000_12 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS161S1100000_12 awS161S1100000_12) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) awS161S1100000_12.l1, awS161S1100000_12.s0);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AwS161S1100000_12 awS161S1100000_12) {
        1JLP r1;
        1JLc r0 = ((C0TEO) awS161S1100000_12.l1).LIZJ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIIIZZ(awS161S1100000_12.s0);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AwS161S1100000_12 awS161S1100000_12) {
        1JLP r1;
        1JLc r0 = ((C0TEO) awS161S1100000_12.l1).LIZJ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIJ(awS161S1100000_12.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS161S1100000_12 awS161S1100000_12) {
        Context context;
        C772410URr c772410URrLJII;
        C772410URr c772410URrLJII2;
        C772410URr c772410URrLJII3;
        DataChannel dataChannel;
        if (C354201Zc.LJFF(((PreviewStartLiveWidget) awS161S1100000_12.l1).J1()) && !LiveDelayManualEndTimeSetting.INSTANCE.getValue().enable) {
            if (!((PreviewStartLiveWidget) awS161S1100000_12.l1).O1() && (dataChannel = ((PreviewStartLiveWidget) awS161S1100000_12.l1).dataChannel) != null) {
                dataChannel.LC0(PreviewGoLiveLoadingEvent.class, Boolean.TRUE);
            }
        } else {
            PreviewStartLiveWidget previewStartLiveWidget = (PreviewStartLiveWidget) awS161S1100000_12.l1;
            if (previewStartLiveWidget.LLJIJIL == null && previewStartLiveWidget.LLILLL && (context = previewStartLiveWidget.context) != null) {
                C780470UjV c780470UjV = new C780470UjV(context);
                c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
                previewStartLiveWidget.LLJIJIL = c780470UjV.LIZ();
            }
            DialogC780480UjW dialogC780480UjW = ((PreviewStartLiveWidget) awS161S1100000_12.l1).LLJIJIL;
            if (dialogC780480UjW != null) {
                C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjW);
            }
        }
        C772780UTc.LIZIZ = System.currentTimeMillis();
        C486980J7w.LJFF(EnumC486990J7x.CreateLive);
        BroadcastTimeLog.LIZ("live_action", String.valueOf(System.currentTimeMillis()));
        Boolean bool = null;
        if (((PreviewStartLiveWidget) awS161S1100000_12.l1).O1()) {
            if (Intrinsics.LJFF(awS161S1100000_12.s0, "retry")) {
                PreviewStartLiveWidget previewStartLiveWidget2 = (PreviewStartLiveWidget) awS161S1100000_12.l1;
                String str = awS161S1100000_12.s0;
                C0UQ8 c0uq8 = previewStartLiveWidget2.LLILZ;
                if (c0uq8 != null && (c772410URrLJII3 = c0uq8.LJII(previewStartLiveWidget2.context, previewStartLiveWidget2.dataChannel, previewStartLiveWidget2.LLJI)) != null) {
                    C772400URq.LIZ.LIZ(c772410URrLJII3, str);
                }
            } else {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Boolean bool2 = Boolean.TRUE;
                dataChannelGlobal.JQ2(C951990asf.class, bool2);
                PreviewStartLiveWidget previewStartLiveWidget3 = (PreviewStartLiveWidget) awS161S1100000_12.l1;
                previewStartLiveWidget3.getClass();
                C20441214yg.LIZIZ("songsong", "send room request");
                C473410IhP.LJ(previewStartLiveWidget3.LLJJL);
                C473410IhP.LIZJ(previewStartLiveWidget3.LLJJL, 20000L);
                C0UQ8 c0uq82 = previewStartLiveWidget3.LLILZ;
                if (c0uq82 != null && (c772410URrLJII2 = c0uq82.LJII(previewStartLiveWidget3.context, previewStartLiveWidget3.dataChannel, previewStartLiveWidget3.LLJI)) != null) {
                    C772400URq.LIZ.LIZ(c772410URrLJII2, "video_button_click");
                }
                final PreviewStartLiveWidget previewStartLiveWidget4 = (PreviewStartLiveWidget) awS161S1100000_12.l1;
                DataChannel dataChannel2 = previewStartLiveWidget4.dataChannel;
                if (dataChannel2 != null) {
                    bool = (Boolean) dataChannel2.gg0(C753880Thi.class);
                }
                if (C500260Jjc.LJJJI(bool)) {
                    InterfaceC772390URp.f0.LJFF(Long.valueOf(System.currentTimeMillis()));
                }
                C2207321BaE.LIZIZ();
                C0UV0 c0uv0 = C0UV0.LiveResource;
                if (!c0uv0.isInstalled()) {
                    DataChannel dataChannel3 = previewStartLiveWidget4.dataChannel;
                    if (dataChannel3 != null) {
                        dataChannel3.LC0(PreviewGoLiveLoadingEvent.class, bool2);
                    }
                    c0uv0.checkInstall(previewStartLiveWidget4.context, new C0UV1() { // from class: X.0URL
                        @Override // X.C0UV1
                        public final void onSuccess() {
                            DataChannel dataChannel4 = previewStartLiveWidget4.dataChannel;
                            if (dataChannel4 != null) {
                                dataChannel4.LC0(PreviewGoLiveLoadingEvent.class, Boolean.FALSE);
                            }
                            C0UV0.LiveResource.load(previewStartLiveWidget4.context, false);
                            previewStartLiveWidget4.V1();
                        }
                    });
                } else {
                    previewStartLiveWidget4.V1();
                }
            }
        } else {
            AnchorGCBlockABSetting anchorGCBlockABSetting = AnchorGCBlockABSetting.INSTANCE;
            if ((anchorGCBlockABSetting.isV1() || anchorGCBlockABSetting.isV3()) && !LiveJatoSetting.isEnable()) {
                JatoXL.requestBlockGc(2000L);
            }
            DataChannelGlobal.LLILZ.JQ2(C951990asf.class, Boolean.FALSE);
            PreviewStartLiveWidget previewStartLiveWidget5 = (PreviewStartLiveWidget) awS161S1100000_12.l1;
            C0UQ8 c0uq83 = previewStartLiveWidget5.LLILZ;
            if (c0uq83 != null && (c772410URrLJII = c0uq83.LJII(previewStartLiveWidget5.context, previewStartLiveWidget5.dataChannel, previewStartLiveWidget5.LLJI)) != null) {
                C772400URq.LIZ.LIZ(c772410URrLJII, awS161S1100000_12.s0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS161S1100000_12 awS161S1100000_12) {
        C766720U5u c766720U5u = C766720U5u.LIZ;
        String str = C0UD4.LIZ;
        C766730U5v c766730U5v = new C766730U5v();
        C753670ThN c753670ThN = new C753670ThN();
        final InterfaceC760910Tt3 interfaceC760910Tt3 = (InterfaceC760910Tt3) awS161S1100000_12.l1;
        final String str2 = awS161S1100000_12.s0;
        C0U68<RoomSticker> c0u68 = new C0U68<RoomSticker>() { // from class: X.0Tt2
            @Override // X.C0U68
            public final void onFail() {
                interfaceC760910Tt3.LIZ(str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0U68
            public final void onSuccess(List<C0U74<RoomSticker>> list) {
                Object obj;
                C259800zU c259800zU = new C259800zU();
                String str3 = str2;
                Iterator<C0U74<RoomSticker>> it2 = list.iterator();
                while (true) {
                    obj = null;
                    T t = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Iterator<RoomSticker> it3 = it2.next().LIZIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            RoomSticker next = it3.next();
                            if (Intrinsics.LJFF(next.LIZ, str3)) {
                                t = next;
                                break;
                            }
                        }
                    }
                    c259800zU.element = t;
                }
                InterfaceC760910Tt3<Object> interfaceC760910Tt32 = interfaceC760910Tt3;
                String str4 = str2;
                Object obj2 = c259800zU.element;
                if (obj2 != null) {
                    obj = obj2;
                }
                interfaceC760910Tt32.LIZIZ(obj, str4);
            }
        };
        c766720U5u.getClass();
        C766720U5u.LJIIIIZZ("livesticker", c766730U5v, c753670ThN, c0u68);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS161S1100000_12 awS161S1100000_12) {
        C10H5 c10h5 = C10H5.NEW_USER_GUIDE_SHOW;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", awS161S1100000_12.s0);
        c2344009Gk.LJIIIIZZ("guide_type", "slide");
        C0TJB c0tjb = (C0TJB) awS161S1100000_12.l1;
        if (((Boolean) C0BL0.LIZ.getValue()).booleanValue()) {
            c2344009Gk.LJFF("gid", c0tjb.LJIJI);
        }
        C10SV.LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS161S1100000_12 awS161S1100000_12) {
        C0T1G c0t1g = (C0T1G) awS161S1100000_12.l1;
        String str = awS161S1100000_12.s0;
        if (str == null) {
            str = "";
        }
        return Boolean.valueOf(c0t1g.LJI(2, str));
    }

    public static final Object invoke$7(AwS161S1100000_12 awS161S1100000_12) {
        SmartRouter.buildRoute((Context) awS161S1100000_12.l1, awS161S1100000_12.s0).open();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS161S1100000_12 awS161S1100000_12) {
        C1894200zOM c1894200zOM = (C1894200zOM) awS161S1100000_12.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear for ");
        sbLIZ.append(awS161S1100000_12.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1894200zOM.getClass();
        C01U6.LIZIZ(new AwS188S0000000_3(strLIZIZ, 1));
        C1894200zOM c1894200zOM2 = (C1894200zOM) awS161S1100000_12.l1;
        c1894200zOM2.LLJIJIL = C1894250zOR.LIZIZ;
        c1894200zOM2.LLJILJIL = null;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LIZIZ(c1894200zOM2.LIZ(), "incentive_feed_lynx_card", null);
        C1894200zOM c1894200zOM3 = (C1894200zOM) awS161S1100000_12.l1;
        Iterator it2 = ((List) c1894200zOM3.LLIZLLLIL.getValue()).iterator();
        while (it2.hasNext()) {
            C1548820qPI.LJIIIIZZ((String) it2.next(), c1894200zOM3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS161S1100000_12 awS161S1100000_12) {
        return C810670Vr7.LIZJ(((C0TKJ) awS161S1100000_12.l1).LIZIZ, 0, awS161S1100000_12.s0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(C0TEO c0teo, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0teo;
        this.s0 = "ByteLink";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(C0T1G c0t1g, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0t1g;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(C0TKJ c0tkj, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0tkj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS161S1100000_12(InterfaceC760910Tt3 interfaceC760910Tt3, InterfaceC760910Tt3<Object> interfaceC760910Tt32, String str) {
        super(0);
        this.$t = str;
        this.l1 = interfaceC760910Tt3;
        this.s0 = interfaceC760910Tt32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(C1894200zOM c1894200zOM, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1894200zOM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(PreviewStartLiveWidget previewStartLiveWidget, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = previewStartLiveWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S1100000_12(String str, C0TJB c0tjb, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0tjb;
    }
}
