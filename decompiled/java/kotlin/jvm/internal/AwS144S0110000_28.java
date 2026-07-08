package kotlin.jvm.internal;

import X.C01GW;
import X.C01U6;
import X.C09AY;
import X.C109D;
import X.C109O;
import X.C109V;
import X.C109X;
import X.C13BV;
import X.C13EL;
import X.C13EM;
import X.C13LP;
import X.C1619720sFe;
import X.C1879340z0O;
import X.C1884640z8w;
import X.C1893350zMz;
import X.C1893540zNI;
import X.C1893580zNM;
import X.C1893940zNw;
import X.C1894330zOZ;
import X.C1897750zU5;
import X.C1899450zWp;
import X.C1899490zWt;
import X.C1911410zq7;
import X.C191981108t;
import X.C191983108v;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import X.InterfaceC1898130zUh;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.data.datasource.bytesync.ByteSyncEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes29.dex */
public class AwS144S0110000_28 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS144S0110000_28 awS144S0110000_28) {
        C1911410zq7.LIZ("IS_RevampV1", "to call complete()");
        super/*com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent*/.rS(awS144S0110000_28.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS144S0110000_28 awS144S0110000_28) {
        ((InterfaceC1898130zUh) awS144S0110000_28.l0).LJ(awS144S0110000_28.z1, false);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS144S0110000_28 awS144S0110000_28) {
        String str;
        List listLJJLIIIJILLIZJL;
        String str2;
        String strLJJZ;
        String strLJJIL = ((SparkContext) awS144S0110000_28.l0).LJJIL();
        Uri uri = UriProtector.parse(strLJJIL);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "touch_point_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "origin_url")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0)) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), "touch_point_id");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
        }
        int iLIZJ = C1893580zNM.LIZ.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        C1893540zNI.LIZ.getClass();
        if (C1893540zNI.LIZIZ) {
            str = "cold";
        } else {
            str = "hot";
        }
        C1893540zNI.LIZIZ = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = UUID.randomUUID().toString();
        String path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).getPath();
        if (path == null || (strLJJZ = a0.LJJZ(path, e3.d, path)) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJZ, new String[]{"/"}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        String str3 = "";
        if (!listLJJLIIIJILLIZJL.isEmpty()) {
            if (C1893350zMz.LIZ((SparkContext) awS144S0110000_28.l0)) {
                Object it2 = new C13EL(listLJJLIIIJILLIZJL).iterator();
                while (true) {
                    C13EM c13em = (C13EM) it2;
                    if (!c13em.hasNext()) {
                        break;
                    }
                    String str4 = (String) c13em.next();
                    if (!Intrinsics.LJFF(str4, "index") && !Intrinsics.LJFF(str4, "template")) {
                        str3 = str4;
                        break;
                    }
                }
            } else {
                str3 = (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
            }
        }
        String str5 = "full_screen";
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "29")) {
            ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService != null && iTouchPointModuleService.LJ()) {
                str5 = "embedded";
            } else {
                str5 = "full_screen";
            }
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pid", str3), new Pair("touch_point_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), new Pair("router_url", strLJJIL), new Pair("launch_type", str), new Pair("launch_times", String.valueOf(iLIZJ)), new Pair("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), new Pair("open_time", String.valueOf(jCurrentTimeMillis)), new Pair("open_id", string), new Pair("page_type", str5));
        if (awS144S0110000_28.z1) {
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("inc_page_open", mapLJIIJ);
            }
        } else {
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
            if (interfaceC1897260zTILIZIZ2 != null) {
                interfaceC1897260zTILIZIZ2.LIZ("inc_page_close", mapLJIIJ);
            }
        }
        C1893540zNI c1893540zNI = C1893540zNI.LIZ;
        String str6 = ((SparkContext) awS144S0110000_28.l0).containerId;
        boolean z = awS144S0110000_28.z1;
        synchronized (c1893540zNI) {
            if (z) {
                C1893540zNI.LIZJ.put(str6, str3);
                List<String> list = C1893540zNI.LIZLLL;
                ((ArrayList) list).remove(str6);
                ((ArrayList) list).add(str6);
                C1893540zNI.LJ = str3;
            } else {
                Map<String, String> map = C1893540zNI.LIZJ;
                map.remove(str6);
                List<String> list2 = C1893540zNI.LIZLLL;
                ((ArrayList) list2).remove(str6);
                String str7 = (String) C13LP.LJJLIIIJL(list2);
                if (str7 == null || (str2 = (String) ((LinkedHashMap) map).get(str7)) == null) {
                    str2 = "";
                }
                C1893540zNI.LJ = str2;
            }
        }
        if (awS144S0110000_28.z1) {
            C1893940zNw value = C1893940zNw.LJI.getValue();
            value.getClass();
            C01U6.LIZJ(new AwS23S1110000_28(value, true, str3, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS144S0110000_28 awS144S0110000_28) {
        if (awS144S0110000_28.z1) {
            TextView textView = ((C1884640z8w) awS144S0110000_28.l0).LLILZIL;
            if (textView != null) {
                textView.setText(2131820737);
                return Unit.LIZ;
            }
            return null;
        }
        TextView textView2 = ((C1884640z8w) awS144S0110000_28.l0).LLILZIL;
        if (textView2 != null) {
            textView2.setText(2131820738);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$3(AwS144S0110000_28 awS144S0110000_28) {
        C109X c109x = (C109X) awS144S0110000_28.l0;
        c109x.LLJ.LIZLLL(Integer.valueOf(c109x.LJIILIIL()), null, c109x.LLILLJJLI.LIZLLL, awS144S0110000_28.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS144S0110000_28 awS144S0110000_28) {
        C109V c109v = (C109V) awS144S0110000_28.l0;
        c109v.LLJJ.LIZLLL(c109v.LLJILJIL.LLILLL.getValue(), null, c109v.LLJILJILJ.LIZLLL, awS144S0110000_28.z1);
        ((C109V) awS144S0110000_28.l0).LLJILLL.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS144S0110000_28 awS144S0110000_28) {
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ByteSyncEvent byteSyncEvent = (ByteSyncEvent) awS144S0110000_28.l0;
        boolean z = awS144S0110000_28.z1;
        Integer num2 = null;
        if (byteSyncEvent != null) {
            num = byteSyncEvent.actionType;
        } else {
            num = null;
        }
        linkedHashMap.put("action_type", String.valueOf(num));
        linkedHashMap.put("is_background", String.valueOf(z));
        if (byteSyncEvent != null) {
            num2 = byteSyncEvent.expireTimeStamp;
        }
        linkedHashMap.put("expired_time", String.valueOf(num2));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("touchpoint_bytesync_message_receive", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS144S0110000_28 awS144S0110000_28) {
        C191983108v c191983108vLJJIFFI = ((C109O) awS144S0110000_28.l0).LJJIFFI();
        C109O c109o = (C109O) awS144S0110000_28.l0;
        c191983108vLJJIFFI.LIZLLL(c109o.LJJI().LLILLL.getValue(), null, c109o.LLJI.LIZLLL, awS144S0110000_28.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS144S0110000_28 awS144S0110000_28) {
        C109D c109d = (C109D) awS144S0110000_28.l0;
        c109d.LLILZIL.LIZIZ(null, c109d.LLILLL.LIZLLL, awS144S0110000_28.z1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS144S0110000_28 awS144S0110000_28) {
        C1879340z0O c1879340z0OLIZ;
        if (((C1899490zWt) awS144S0110000_28.l0).getVisibility() == 0 && awS144S0110000_28.z1) {
            int i = 8;
            C786410Ut5.LLZZLLIL(((C1899490zWt) awS144S0110000_28.l0).getSmartImageView(), 8);
            C786410Ut5.LLLLLIL(((C1899490zWt) awS144S0110000_28.l0).getNormalLottieView(), 8);
            C786410Ut5.LLZZLLIL(((C1899490zWt) awS144S0110000_28.l0).getSmallSmartImageView(), 8);
            C786410Ut5.LLLLLIL(((C1899490zWt) awS144S0110000_28.l0).getShrinkLottieView(), 0);
            C1899490zWt c1899490zWt = (C1899490zWt) awS144S0110000_28.l0;
            c1899490zWt.getClass();
            C01U6.LIZIZ(new AwS572S0100000_28(c1899490zWt, 1026));
            C1899450zWp.LIZIZ(((C1899490zWt) awS144S0110000_28.l0).getShrinkLottieView(), Integer.MAX_VALUE);
            ImageView closeView = ((C1899490zWt) awS144S0110000_28.l0).getCloseView();
            if (((C1899490zWt) awS144S0110000_28.l0).LLLIIII) {
                i = 0;
            }
            C786410Ut5.LJZI(i, closeView);
            if (((C1899490zWt) awS144S0110000_28.l0).getStaticPendantIsFold() && ((c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(1)) == null || !(c1879340z0OLIZ instanceof C1897750zU5))) {
                C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                C1894330zOZ.LIZ().LJJIIZI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS144S0110000_28 awS144S0110000_28) {
        C191981108t c191981108t = (C191981108t) awS144S0110000_28.l0;
        c191981108t.LLJIJIL.LIZLLL(c191981108t.LLIZ.LLILLL.getValue(), null, c191981108t.LLJ.LIZLLL, awS144S0110000_28.z1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C1899490zWt c1899490zWt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1899490zWt;
        this.z1 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(InterfaceC1898130zUh interfaceC1898130zUh, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1898130zUh;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C191981108t c191981108t, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c191981108t;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C109D c109d, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109d;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C109O c109o, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109o;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C109V c109v, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109v;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(C109X c109x, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c109x;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(SparkContext sparkContext, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = sparkContext;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(ByteSyncEvent byteSyncEvent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = byteSyncEvent;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(InterestSelectionComponentRevampV1 interestSelectionComponentRevampV1, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = interestSelectionComponentRevampV1;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S0110000_28(boolean z, C1884640z8w c1884640z8w, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1884640z8w;
    }
}
