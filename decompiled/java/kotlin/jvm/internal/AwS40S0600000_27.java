package kotlin.jvm.internal;

import X.AbstractC1806300x6a;
import X.C09AY;
import X.C0ZP4;
import X.C118300cf;
import X.C1556220qbE;
import X.C1556660qbw;
import X.C1803830x2b;
import X.C1805210x4p;
import X.C1805370x55;
import X.C1805380x56;
import X.C1805470x5F;
import X.C1805530x5L;
import X.C1806690x7D;
import X.C1806860x7U;
import X.C1852860yJg;
import X.C1853060yK0;
import X.C1862660yZU;
import X.C1863280yaU;
import X.C259800zU;
import X.C291001Au;
import X.C500260Jjc;
import X.InterfaceC1804890x4J;
import X.InterfaceC1806790x7N;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tracking.TrackingEventV3Data;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoAutoSendProcessor;
import defpackage.k9;
import defpackage.r2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS40S0600000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S0600000_27 awS40S0600000_27, Object obj) {
        MessageChunkResult messageChunkResult = (MessageChunkResult) awS40S0600000_27.l0;
        Message message = messageChunkResult.messages;
        if (message != null) {
            C118300cf c118300cf = (C118300cf) awS40S0600000_27.l1;
            C118300cf c118300cf2 = (C118300cf) awS40S0600000_27.l2;
            C1863280yaU.LJJJJI((C1863280yaU) awS40S0600000_27.l3, message, (r2) awS40S0600000_27.l4, Math.max(c118300cf.element, c118300cf2.element), null, (k9) awS40S0600000_27.l5, messageChunkResult.extra, null, 72);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0600000_27 awS40S0600000_27, Object obj) {
        List<TikTokMediaModel> list;
        C1853060yK0 c1853060yK0 = (C1853060yK0) obj;
        C1852860yJg c1852860yJgLIZ = C1852860yJg.LIZ(c1853060yK0.LLILZIL, (List) awS40S0600000_27.l0);
        if (((C1853060yK0) awS40S0600000_27.l1).LLILLL) {
            list = (List) awS40S0600000_27.l2;
        } else {
            list = c1853060yK0.LLILLJJLI;
        }
        return C1853060yK0.LIZ(c1853060yK0, (PreviewMediaState) awS40S0600000_27.l3, list, false, null, c1852860yJgLIZ, null, (List) awS40S0600000_27.l4, false, null, null, (C291001Au) awS40S0600000_27.l5, null, null, 0, null, 63404);
    }

    public static final Object invoke$2(AwS40S0600000_27 awS40S0600000_27, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            TakoAutoSendProcessor takoAutoSendProcessor = (TakoAutoSendProcessor) awS40S0600000_27.l0;
            Fragment fragment = (Fragment) awS40S0600000_27.l1;
            TakoEnterParams takoEnterParams = (TakoEnterParams) awS40S0600000_27.l2;
            C1862660yZU c1862660yZU = (C1862660yZU) awS40S0600000_27.l3;
            IMessageAbility iMessageAbility = (IMessageAbility) awS40S0600000_27.l4;
            takoAutoSendProcessor.getClass();
            TakoAutoSendProcessor.LIZ(fragment, iMessageAbility, takoEnterParams, c1862660yZU);
            C0ZP4 c0zp4 = (C0ZP4) ((C259800zU) awS40S0600000_27.l5).element;
            if (c0zp4 != null) {
                c0zp4.dispose();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS40S0600000_27 awS40S0600000_27, Object obj) {
        Boolean boolValueOf;
        Diamond diamond;
        boolean z;
        boolean z2;
        int i;
        C1556660qbw c1556660qbw = (C1556660qbw) awS40S0600000_27.l0;
        Map<String, String> mapLIZ = null;
        InterfaceC1806790x7N interfaceC1806790x7N = null;
        C1805470x5F c1805470x5FLIZ = C1805470x5F.LIZ((C1805470x5F) obj, new C1556220qbE(c1556660qbw.LIZ), C1805210x4p.LIZ((C1805210x4p) awS40S0600000_27.l1, null, false, false, c1556660qbw.LIZIZ, null, null, false, false, null, false, null, null, (C1805370x55) awS40S0600000_27.l2, (C1805370x55) awS40S0600000_27.l3, null, false, null, 118773), null, null, 12);
        C1805530x5L c1805530x5L = (C1805530x5L) awS40S0600000_27.l4;
        RechargePanelBodyViewModel rechargePanelBodyViewModel = (RechargePanelBodyViewModel) awS40S0600000_27.l5;
        C1805370x55 c1805370x55 = (C1805370x55) awS40S0600000_27.l2;
        C1805370x55 c1805370x552 = (C1805370x55) awS40S0600000_27.l3;
        C1556660qbw c1556660qbw2 = (C1556660qbw) awS40S0600000_27.l0;
        C1805210x4p c1805210x4p = (C1805210x4p) awS40S0600000_27.l1;
        C1806690x7D value = c1805530x5L.LLILZIL.LIZJ.getValue();
        if (value != null) {
            boolValueOf = Boolean.valueOf(value.LIZ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) && !c1805470x5FLIZ.LLILLJJLI.LJIILL) {
            InterfaceC1804890x4J interfaceC1804890x4J = rechargePanelBodyViewModel.LLILZIL;
            C1805530x5L c1805530x5LWQ2 = rechargePanelBodyViewModel.wQ2();
            boolean zLIZIZ = c1805470x5FLIZ.LLILLJJLI.LIZIZ();
            TrackingEventV3Data trackingEventV3DataXQ2 = rechargePanelBodyViewModel.xQ2(false);
            if (trackingEventV3DataXQ2 != null) {
                mapLIZ = trackingEventV3DataXQ2.LIZ();
            }
            interfaceC1804890x4J.LJIIJ(c1805530x5LWQ2, false, c1805370x55, c1805370x552, zLIZIZ, mapLIZ, false, rechargePanelBodyViewModel.vQ2());
            InterfaceC1804890x4J interfaceC1804890x4J2 = rechargePanelBodyViewModel.LLILZIL;
            C1803830x2b c1803830x2b = c1805530x5L.LLILLL;
            DataChannel dataChannel = c1805530x5L.LLILZ;
            if (c1805370x552 != null) {
                diamond = c1805370x552.LJIIL;
            } else {
                diamond = null;
            }
            Iterator<InterfaceC1806790x7N> it2 = c1556660qbw2.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1806790x7N next = it2.next();
                if (next instanceof AbstractC1806300x6a) {
                    interfaceC1806790x7N = next;
                    break;
                }
            }
            if (interfaceC1806790x7N != null) {
                z = true;
            } else {
                z = false;
            }
            C1806860x7U c1806860x7U = c1805530x5L.LLILZIL.LIZ;
            if (c1805370x552 != null && c1805370x552.LJIIIIZZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            Map<String, String> mapLIZIZ = c1806860x7U.LIZIZ(z2, true, false);
            boolean zLIZIZ2 = c1805210x4p.LIZIZ();
            int iVQ2 = rechargePanelBodyViewModel.vQ2();
            List<InterfaceC1806790x7N> list = c1556660qbw2.LIZ;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
                interfaceC1804890x4J2.LJII(c1803830x2b, dataChannel, diamond, zLIZIZ2, z, mapLIZIZ, null, iVQ2, i);
            } else {
                for (InterfaceC1806790x7N interfaceC1806790x7N2 : list) {
                    if ((interfaceC1806790x7N2 instanceof C1805380x56) && !((C1805380x56) interfaceC1806790x7N2).LJIILIIL) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
                interfaceC1804890x4J2.LJII(c1803830x2b, dataChannel, diamond, zLIZIZ2, z, mapLIZIZ, null, iVQ2, i);
            }
        }
        return c1805470x5FLIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0600000_27(C1556660qbw c1556660qbw, C1805210x4p c1805210x4p, C1805370x55 c1805370x55, C1805370x55 c1805370x552, C1805530x5L c1805530x5L, RechargePanelBodyViewModel rechargePanelBodyViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1556660qbw;
        this.l1 = c1805210x4p;
        this.l2 = c1805370x55;
        this.l3 = c1805370x552;
        this.l4 = c1805530x5L;
        this.l5 = rechargePanelBodyViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0600000_27(MessageChunkResult messageChunkResult, C118300cf c118300cf, C118300cf c118300cf2, C1863280yaU c1863280yaU, r2 r2Var, k9 k9Var, int i) {
        super(1);
        this.$t = i;
        this.l0 = messageChunkResult;
        this.l1 = c118300cf;
        this.l2 = c118300cf2;
        this.l3 = c1863280yaU;
        this.l4 = r2Var;
        this.l5 = k9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS40S0600000_27(TakoAutoSendProcessor takoAutoSendProcessor, TakoAutoSendProcessor takoAutoSendProcessor2, Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C259800zU<C0ZP4> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = takoAutoSendProcessor;
        this.l1 = takoAutoSendProcessor2;
        this.l2 = fragment;
        this.l3 = takoEnterParams;
        this.l4 = c1862660yZU;
        this.l5 = iMessageAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS40S0600000_27(List list, List<TikTokMediaModel> list2, C1853060yK0 c1853060yK0, List<? extends TikTokMediaModel> list3, PreviewMediaState previewMediaState, List<TikTokMediaModel> list4, C291001Au<? extends TikTokMediaModel> c291001Au) {
        super(1);
        this.$t = c291001Au;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c1853060yK0;
        this.l3 = list3;
        this.l4 = previewMediaState;
        this.l5 = list4;
    }
}
