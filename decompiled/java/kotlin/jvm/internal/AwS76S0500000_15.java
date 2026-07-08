package kotlin.jvm.internal;

import X.AbstractC19484711Kz;
import X.C09AY;
import X.C11HU;
import X.C11KT;
import X.C11PQ;
import X.C11S5;
import X.C1283180jUq;
import X.C1283230jUv;
import X.C1463860oCG;
import X.C1463950oCP;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C937310aUz;
import X.C938220aWS;
import X.C938230aWT;
import X.C938350aWf;
import X.C938510aWv;
import X.C939240aY6;
import X.C940470aa5;
import X.C941990acX;
import X.C942000acY;
import X.C942010acZ;
import X.C943630afB;
import X.C953770avX;
import X.C961300b7g;
import X.C971050bNP;
import X.C971120bNW;
import X.C971330bNr;
import X.C971360bNu;
import X.C974060bSG;
import X.C974990bTl;
import X.C975060bTs;
import X.C975830bV7;
import X.C975860bVA;
import X.C975960bVK;
import X.DialogC971210bNf;
import X.EnumC1286590jaL;
import X.EnumC918810a19;
import X.EnumC919170a1j;
import X.EnumC943640afC;
import X.EnumC965730bEp;
import X.EnumC971100bNU;
import X.EnumC974980bTk;
import X.EnumC975850bV9;
import X.InterfaceC2329309At;
import X.InterfaceC937840aVq;
import X.InterfaceC940380aZw;
import X.InterfaceC975520bUc;
import X.InterfaceC975900bVE;
import Y.ACallableS91S0400000_15;
import Y.AfS184S0100000_15;
import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.MultiGuestBoardTemplateOfficialConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS76S0500000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS76S0500000_15 awS76S0500000_15) throws InterruptedException {
        Bitmap bitmapLJI;
        INLEMediaRuntime mediaRuntimeApi;
        DialogC971210bNf dialogC971210bNf = (DialogC971210bNf) awS76S0500000_15.l0;
        List list = (List) awS76S0500000_15.l1;
        List list2 = (List) awS76S0500000_15.l2;
        for (C971330bNr c971330bNr : dialogC971210bNf.LLJZIJLIL) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(c971330bNr.LIZJ.LIZ, ((C971360bNu) obj).LIZ)) {
                        c971330bNr.LIZJ.LIZ = ((C971360bNu) ListProtector.get(list2, i)).LIZ;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Iterator<C971330bNr> it2 = dialogC971210bNf.LLJZIJLIL.iterator();
        while (it2.hasNext()) {
            dialogC971210bNf.LLJZ.LJIIJ(new C971120bNW(EnumC971100bNU.TEXT, null, null, null, null, it2.next(), null, 94));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextByTranslatedTexts, starlingKetList: ");
        sbLIZ.append(list);
        sbLIZ.append(", translatedTextList: ");
        sbLIZ.append(list2);
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
        Thread.sleep(MultiGuestBoardTemplateOfficialConfigSetting.INSTANCE.getValue().renderMillSecondInternal);
        try {
            C971050bNP c971050bNP = ((DialogC971210bNf) awS76S0500000_15.l0).LLJZ;
            C1463860oCG c1463860oCG = c971050bNP.LIZLLL;
            if (c1463860oCG != null && (mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi()) != null) {
                bitmapLJI = ((C1463950oCP) mediaRuntimeApi).getCurrDisplayImage(-1);
            } else {
                bitmapLJI = null;
            }
            MultiCanvasUtils.LIZ.getClass();
            if (!MultiCanvasUtils.LJIIZILJ(bitmapLJI)) {
                bitmapLJI = c971050bNP.LJI(2);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("try to get bitmap, translatedTextList: ");
            sbLIZ2.append((List) awS76S0500000_15.l2);
            C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
            C11HU c11huLJJ = AbstractC19484711Kz.LJIJI(new ACallableS91S0400000_15(bitmapLJI, (List) awS76S0500000_15.l2, (DialogC971210bNf) awS76S0500000_15.l0, (C953770avX) awS76S0500000_15.l4, 0)).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ());
            InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) awS76S0500000_15.l3;
            c11huLJJ.LJJIIZ(new AfS184S0100000_15(interfaceC2329309At, 7), new AfS184S0100000_15(interfaceC2329309At, 8));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((InterfaceC2329309At) awS76S0500000_15.l3).onError(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS76S0500000_15 awS76S0500000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Integer>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS76S0500000_15.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS76S0500000_15.l0);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC1286590jaL) awS76S0500000_15.l2);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC1286590jaL) awS76S0500000_15.l3);
        C937310aUz.LJII("onNetworkQualityChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((MultiGuestLayoutRenderV2) awS76S0500000_15.l4).LLJ) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZLLL) != null) {
            c11pq.onNext(Collections.singletonList(Integer.valueOf(((EnumC1286590jaL) awS76S0500000_15.l3).ordinal())));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS76S0500000_15 awS76S0500000_15) {
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Integer>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS76S0500000_15.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS76S0500000_15.l0);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC1286590jaL) awS76S0500000_15.l2);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC1286590jaL) awS76S0500000_15.l3);
        C937310aUz.LJII("onNetworkQualityChanged", C2188811AlT.LIZIZ(sbLIZ));
        if (C938350aWf.LIZ() && (c938220aWS = ((C939240aY6) awS76S0500000_15.l4).LLJJJIL) != null && (c938230aWTLIZJ = c938220aWS.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZLLL) != null) {
            c11pq.onNext(Collections.singletonList(Integer.valueOf(((EnumC1286590jaL) awS76S0500000_15.l3).ordinal())));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS76S0500000_15 awS76S0500000_15) {
        C974990bTl c974990bTl = (C974990bTl) awS76S0500000_15.l0;
        C974060bSG c974060bSG = (C974060bSG) awS76S0500000_15.l1;
        List list = (List) awS76S0500000_15.l2;
        c974990bTl.LJIILJJIL(c974060bSG, (EnumC919170a1j) awS76S0500000_15.l4, (MultiMatchPrepareResponse) awS76S0500000_15.l3, list);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS76S0500000_15 awS76S0500000_15) {
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZ("match_combined_inviter_dialog");
        if (((List) awS76S0500000_15.l0).size() == 2) {
            ((C974990bTl) awS76S0500000_15.l1).LJIIL((C974060bSG) awS76S0500000_15.l2, (MultiMatchPrepareResponse) awS76S0500000_15.l3);
        } else if (((List) awS76S0500000_15.l0).size() > 2) {
            C974990bTl c974990bTl = (C974990bTl) awS76S0500000_15.l1;
            C974060bSG c974060bSG = (C974060bSG) awS76S0500000_15.l2;
            List list = (List) awS76S0500000_15.l0;
            c974990bTl.LJII(c974060bSG, (EnumC919170a1j) awS76S0500000_15.l4, (MultiMatchPrepareResponse) awS76S0500000_15.l3, list);
        }
        C975060bTs.LIZ("livesdk_match_inviter_lynx_fallback_success", new HashMap());
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS76S0500000_15 awS76S0500000_15) {
        Boolean boolValueOf;
        String str;
        C975960bVK c975960bVKM3;
        InterfaceC975900bVE interfaceC975900bVE = (InterfaceC975900bVE) ((C975830bV7) awS76S0500000_15.l0).LJIILJJIL();
        if (interfaceC975900bVE != null) {
            EnumC974980bTk enumC974980bTk = (EnumC974980bTk) awS76S0500000_15.l1;
            EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) awS76S0500000_15.l2;
            InterfaceC975520bUc interfaceC975520bUc = ((C975830bV7) awS76S0500000_15.l0).LIZIZ;
            if (interfaceC975520bUc != null) {
                boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
            } else {
                boolValueOf = null;
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            InterfaceC975520bUc interfaceC975520bUc2 = ((C975830bV7) awS76S0500000_15.l0).LIZIZ;
            if (interfaceC975520bUc2 == null || (c975960bVKM3 = interfaceC975520bUc2.m3()) == null || (str = c975960bVKM3.LJIILIIL) == null) {
                str = "";
            }
            interfaceC975900bVE.LJJIJL(enumC974980bTk, enumC975850bV9, zLJJJI, str, (GiftMode) awS76S0500000_15.l3, new AwS480S0200000_15((EnumC975850bV9) awS76S0500000_15.l2, (C975830bV7) awS76S0500000_15.l0, 3), new AwS416S0200000_15((EnumC919170a1j) awS76S0500000_15.l4, (C975830bV7) awS76S0500000_15.l0, 74), new AwS559S0100000_15((C975830bV7) awS76S0500000_15.l0, 860), new AwS559S0100000_15((C975830bV7) awS76S0500000_15.l0, 861), new C975860bVA((C975830bV7) awS76S0500000_15.l0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS76S0500000_15 awS76S0500000_15) {
        int i;
        C940470aa5 c940470aa5 = (C940470aa5) awS76S0500000_15.l0;
        C938510aWv c938510aWv = (C938510aWv) awS76S0500000_15.l1;
        if (c938510aWv != null) {
            i = c938510aWv.LIZ;
        } else {
            i = 0;
        }
        InterfaceC940380aZw interfaceC940380aZwLJIIJJI = c940470aa5.LJIIJJI(i, c940470aa5.LLILZ);
        if (interfaceC940380aZwLJIIJJI != null) {
            interfaceC940380aZwLJIIJJI.LJIILL((InterfaceC937840aVq) awS76S0500000_15.l2, (EnumC918810a19) awS76S0500000_15.l3, (EnumC918810a19) awS76S0500000_15.l4, (C938510aWv) awS76S0500000_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS76S0500000_15 awS76S0500000_15) {
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS76S0500000_15.l0);
        C942010acZ c942010acZ = (C942010acZ) awS76S0500000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS76S0500000_15.l2);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append((EnumC943640afC) awS76S0500000_15.l3);
        sbLIZ.append(" new=");
        sbLIZ.append((EnumC943640afC) awS76S0500000_15.l4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c942010acZ.getClass();
        C942010acZ.LJJIFFI("onRtcConnectionStateChange", strLIZIZ);
        if (C943630afB.LIZ().onlineStateOpt) {
            ((C942010acZ) awS76S0500000_15.l1).LIZIZ.put(strLIZ, (EnumC943640afC) awS76S0500000_15.l4);
            ((C942010acZ) awS76S0500000_15.l1).LJJII(strLIZ);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS76S0500000_15(X.C974060bSG r3, X.C974990bTl r4, X.EnumC919170a1j r5, com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse r6, java.util.List r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 3 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r7
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r6
            r1.l4 = r5
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r7
            r1.l3 = r6
            r1.l4 = r5
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS76S0500000_15.<init>(X.0bSG, X.0bTl, X.0a1j, com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse, java.util.List, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(C940470aa5 c940470aa5, C938510aWv c938510aWv, InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, int i) {
        super(0);
        this.$t = i;
        this.l0 = c940470aa5;
        this.l1 = c938510aWv;
        this.l2 = interfaceC937840aVq;
        this.l3 = enumC918810a19;
        this.l4 = enumC918810a192;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(DialogC971210bNf dialogC971210bNf, List list, List list2, C11KT c11kt, C953770avX c953770avX, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogC971210bNf;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = c11kt;
        this.l4 = c953770avX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(C975830bV7 c975830bV7, EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, GiftMode giftMode, EnumC919170a1j enumC919170a1j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c975830bV7;
        this.l1 = enumC974980bTk;
        this.l2 = enumC975850bV9;
        this.l3 = giftMode;
        this.l4 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(C1283230jUv c1283230jUv, C942010acZ c942010acZ, EnumC965730bEp enumC965730bEp, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1283230jUv;
        this.l1 = c942010acZ;
        this.l2 = enumC965730bEp;
        this.l3 = enumC943640afC;
        this.l4 = enumC943640afC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(C941990acX c941990acX, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC1286590jaL enumC1286590jaL, EnumC1286590jaL enumC1286590jaL2, C939240aY6 c939240aY6, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC965730bEp;
        this.l1 = c1283230jUv;
        this.l2 = enumC1286590jaL;
        this.l3 = enumC1286590jaL2;
        this.l4 = c939240aY6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0500000_15(C942000acY c942000acY, EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC1286590jaL enumC1286590jaL, EnumC1286590jaL enumC1286590jaL2, MultiGuestLayoutRenderV2 multiGuestLayoutRenderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC965730bEp;
        this.l1 = c1283230jUv;
        this.l2 = enumC1286590jaL;
        this.l3 = enumC1286590jaL2;
        this.l4 = multiGuestLayoutRenderV2;
    }
}
