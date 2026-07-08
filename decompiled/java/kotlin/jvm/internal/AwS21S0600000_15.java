package kotlin.jvm.internal;

import X.C09AY;
import X.C11PQ;
import X.C1283180jUq;
import X.C1283230jUv;
import X.C13LP;
import X.C2188811AlT;
import X.C937310aUz;
import X.C938220aWS;
import X.C938230aWT;
import X.C938350aWf;
import X.C939240aY6;
import X.C940020aZM;
import X.C941990acX;
import X.C942000acY;
import X.C942010acZ;
import X.C943630afB;
import X.EnumC942070acf;
import X.EnumC943640afC;
import X.EnumC965730bEp;
import X.InterfaceC942030acb;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS21S0600000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS21S0600000_15 awS21S0600000_15) {
        C11PQ<Boolean> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS21S0600000_15.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS21S0600000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l2);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l3);
        C937310aUz.LJII("onOnlineStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ()) {
            if (C943630afB.LIZ().onlineStateOpt) {
                ((C942000acY) awS21S0600000_15.l4).LIZ.put(strLIZ, (EnumC942070acf) awS21S0600000_15.l3);
                ((C942000acY) awS21S0600000_15.l4).LJJIFFI(strLIZ);
            } else {
                C938220aWS c938220aWS = ((MultiGuestLayoutRenderV2) awS21S0600000_15.l5).LLJ;
                if (c938220aWS != null) {
                    boolean z = true;
                    C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false);
                    if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
                        if (((EnumC942070acf) awS21S0600000_15.l3) != EnumC942070acf.NORMAL_STATE) {
                            z = false;
                        }
                        c11pq.onNext(Boolean.valueOf(z));
                    }
                }
            }
        }
        List<InterfaceC942030acb> listLLIIII = C13LP.LLIIII(((MultiGuestLayoutRenderV2) awS21S0600000_15.l5).LLILZLL.values());
        EnumC942070acf enumC942070acf = (EnumC942070acf) awS21S0600000_15.l3;
        for (InterfaceC942030acb interfaceC942030acb : listLLIIII) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIJJ(strLIZ, enumC942070acf);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0600000_15 awS21S0600000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<Boolean> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS21S0600000_15.l2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS21S0600000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC943640afC) awS21S0600000_15.l3);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC943640afC) awS21S0600000_15.l4);
        C937310aUz.LJII("onRtcConnectionStateChange", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ()) {
            if (C943630afB.LIZ().onlineStateOpt) {
                ((C942000acY) awS21S0600000_15.l0).LIZIZ.put(strLIZ, (EnumC943640afC) awS21S0600000_15.l4);
                ((C942000acY) awS21S0600000_15.l0).LJJIFFI(strLIZ);
            } else if (((EnumC943640afC) awS21S0600000_15.l4) == EnumC943640afC.DISCONNECT && (c938220aWS = ((MultiGuestLayoutRenderV2) awS21S0600000_15.l5).LLJ) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
                c11pq.onNext(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S0600000_15 awS21S0600000_15) {
        C11PQ<Boolean> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS21S0600000_15.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS21S0600000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l2);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l3);
        C937310aUz.LJII("onOnlineStateChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ()) {
            if (C943630afB.LIZ().onlineStateOpt) {
                ((C941990acX) awS21S0600000_15.l4).LIZ.put(strLIZ, (EnumC942070acf) awS21S0600000_15.l3);
                ((C941990acX) awS21S0600000_15.l4).LJJIFFI(strLIZ);
            } else {
                C938220aWS c938220aWS = ((C939240aY6) awS21S0600000_15.l5).LLJJJIL;
                if (c938220aWS != null) {
                    boolean z = true;
                    C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false);
                    if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
                        if (((EnumC942070acf) awS21S0600000_15.l3) != EnumC942070acf.NORMAL_STATE) {
                            z = false;
                        }
                        c11pq.onNext(Boolean.valueOf(z));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S0600000_15 awS21S0600000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<Boolean> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS21S0600000_15.l2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS21S0600000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC943640afC) awS21S0600000_15.l3);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC943640afC) awS21S0600000_15.l4);
        C937310aUz.LJII("onRtcConnectionStateChange", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ()) {
            if (C943630afB.LIZ().onlineStateOpt) {
                ((C941990acX) awS21S0600000_15.l0).LIZIZ.put(strLIZ, (EnumC943640afC) awS21S0600000_15.l4);
                ((C941990acX) awS21S0600000_15.l0).LJJIFFI(strLIZ);
            } else if (((EnumC943640afC) awS21S0600000_15.l4) == EnumC943640afC.DISCONNECT && (c938220aWS = ((C939240aY6) awS21S0600000_15.l5).LLJJJIL) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
                c11pq.onNext(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS21S0600000_15 awS21S0600000_15) {
        C11PQ<Boolean> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS21S0600000_15.l0);
        C942010acZ c942010acZ = (C942010acZ) awS21S0600000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS21S0600000_15.l2);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l3);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC942070acf) awS21S0600000_15.l4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c942010acZ.getClass();
        C942010acZ.LJJIFFI("onOnlineStateChanged", strLIZIZ);
        if (C943630afB.LIZ().onlineStateOpt) {
            ((C942010acZ) awS21S0600000_15.l1).LIZ.put(strLIZ, (EnumC942070acf) awS21S0600000_15.l4);
            ((C942010acZ) awS21S0600000_15.l1).LJJII(strLIZ);
        } else {
            C938220aWS c938220aWSLJIJJLI = ((C940020aZM) awS21S0600000_15.l5).LJIJJLI();
            if (c938220aWSLJIJJLI != null) {
                boolean z = true;
                C938230aWT c938230aWTLIZJ = c938220aWSLJIJJLI.LIZJ(strLIZ, true, false);
                if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LIZJ) != null) {
                    if (((EnumC942070acf) awS21S0600000_15.l4) != EnumC942070acf.NORMAL_STATE) {
                        z = false;
                    }
                    c11pq.onNext(Boolean.valueOf(z));
                }
            }
        }
        List<InterfaceC942030acb> list = ((C940020aZM) awS21S0600000_15.l5).LLJJIJIIJIL;
        if (list != null) {
            EnumC942070acf enumC942070acf = (EnumC942070acf) awS21S0600000_15.l4;
            for (InterfaceC942030acb interfaceC942030acb : (ArrayList) list) {
                if (interfaceC942030acb != null) {
                    interfaceC942030acb.LJIJJ(strLIZ, enumC942070acf);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0600000_15(C941990acX c941990acX, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2, C939240aY6 c939240aY6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c941990acX;
        this.l1 = enumC965730bEp;
        this.l2 = c1283230jUv;
        this.l3 = enumC943640afC;
        this.l4 = enumC943640afC2;
        this.l5 = c939240aY6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0600000_15(C942000acY c942000acY, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2, MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c942000acY;
        this.l1 = enumC965730bEp;
        this.l2 = c1283230jUv;
        this.l3 = enumC943640afC;
        this.l4 = enumC943640afC2;
        this.l5 = multiGuestLayoutRenderV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0600000_15(C1283230jUv c1283230jUv, C942010acZ c942010acZ, EnumC965730bEp enumC965730bEp, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2, C940020aZM c940020aZM, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = c942010acZ;
        this.l2 = enumC965730bEp;
        this.l3 = enumC942070acf;
        this.l4 = enumC942070acf2;
        this.l5 = c940020aZM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0600000_15(C1283230jUv c1283230jUv, EnumC965730bEp enumC965730bEp, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2, C941990acX c941990acX, C939240aY6 c939240aY6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = enumC965730bEp;
        this.l2 = enumC942070acf;
        this.l3 = enumC942070acf2;
        this.l4 = c941990acX;
        this.l5 = c939240aY6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0600000_15(C1283230jUv c1283230jUv, EnumC965730bEp enumC965730bEp, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2, C942000acY c942000acY, MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = enumC965730bEp;
        this.l2 = enumC942070acf;
        this.l3 = enumC942070acf2;
        this.l4 = c942000acY;
        this.l5 = multiGuestLayoutRenderV2;
    }
}
