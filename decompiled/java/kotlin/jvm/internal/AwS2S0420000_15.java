package kotlin.jvm.internal;

import X.C09AY;
import X.C11PQ;
import X.C1283180jUq;
import X.C1283230jUv;
import X.C19GU;
import X.C2188811AlT;
import X.C259800zU;
import X.C785410UrT;
import X.C925610aC7;
import X.C938220aWS;
import X.C938230aWT;
import X.C940020aZM;
import X.C942010acZ;
import X.EnumC965730bEp;
import X.InterfaceC942030acb;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS2S0420000_15 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$0(AwS2S0420000_15 awS2S0420000_15) {
        C925610aC7.LIZJ((PerceptionDialogInfo) awS2S0420000_15.l1, (PunishEventInfo) awS2S0420000_15.l0, "click", "default_tab", awS2S0420000_15.z4, awS2S0420000_15.z5);
        C19GU c19gu = (C19GU) ((C259800zU) awS2S0420000_15.l2).element;
        if (c19gu != null) {
            c19gu.dismiss();
            C785410UrT.LIZ(c19gu);
        }
        Function1 function1 = (Function1) awS2S0420000_15.l3;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((PerceptionDialogInfo) awS2S0420000_15.l1).scene));
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$1(AwS2S0420000_15 awS2S0420000_15) {
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS2S0420000_15.l0);
        C942010acZ c942010acZ = (C942010acZ) awS2S0420000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS2S0420000_15.l2);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS2S0420000_15.z4);
        sbLIZ.append(" new=");
        sbLIZ.append(awS2S0420000_15.z5);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c942010acZ.getClass();
        C942010acZ.LJJIFFI("onAudioMuteStateChanged", strLIZIZ);
        C938220aWS c938220aWSLJIJJLI = ((C940020aZM) awS2S0420000_15.l3).LJIJJLI();
        if (c938220aWSLJIJJLI != null && (c938230aWTLIZJ = c938220aWSLJIJJLI.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS2S0420000_15.z5)));
        }
        List<InterfaceC942030acb> list = ((C940020aZM) awS2S0420000_15.l3).LLJJIJIIJIL;
        if (list != null) {
            boolean z = awS2S0420000_15.z5;
            for (InterfaceC942030acb interfaceC942030acb : (ArrayList) list) {
                if (interfaceC942030acb != null) {
                    interfaceC942030acb.LJII(strLIZ, z);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0420000_15 awS2S0420000_15) {
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS2S0420000_15.l2);
        C942010acZ c942010acZ = (C942010acZ) awS2S0420000_15.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS2S0420000_15.l1);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS2S0420000_15.z4);
        sbLIZ.append(" new=");
        sbLIZ.append(awS2S0420000_15.z5);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c942010acZ.getClass();
        C942010acZ.LJJIFFI("onAudioOccupiedChanged", strLIZIZ);
        List<InterfaceC942030acb> list = ((C940020aZM) awS2S0420000_15.l3).LLJJIJIIJIL;
        if (list != null) {
            for (InterfaceC942030acb interfaceC942030acb : (ArrayList) list) {
                if (interfaceC942030acb != null) {
                    interfaceC942030acb.LIZIZ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0420000_15 awS2S0420000_15) {
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<Boolean>> c11pq;
        String strLIZ = C1283180jUq.LIZ((C1283230jUv) awS2S0420000_15.l0);
        C942010acZ c942010acZ = (C942010acZ) awS2S0420000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archType=");
        sbLIZ.append((EnumC965730bEp) awS2S0420000_15.l2);
        sbLIZ.append(" linkMicId=");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" old=");
        sbLIZ.append(awS2S0420000_15.z4);
        sbLIZ.append(" new=");
        sbLIZ.append(awS2S0420000_15.z5);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c942010acZ.getClass();
        C942010acZ.LJJIFFI("onVideoMuteStateChanged", strLIZIZ);
        C938220aWS c938220aWSLJIJJLI = ((C940020aZM) awS2S0420000_15.l3).LJIJJLI();
        if (c938220aWSLJIJJLI != null && (c938230aWTLIZJ = c938220aWSLJIJJLI.LIZJ(strLIZ, true, false)) != null && (c11pq = c938230aWTLIZJ.LIZIZ) != null) {
            c11pq.onNext(Collections.singletonList(Boolean.valueOf(!awS2S0420000_15.z5)));
        }
        List<InterfaceC942030acb> list = ((C940020aZM) awS2S0420000_15.l3).LLJJIJIIJIL;
        if (list != null) {
            for (InterfaceC942030acb interfaceC942030acb : (ArrayList) list) {
                if (interfaceC942030acb != null) {
                    interfaceC942030acb.LJIJJLI();
                }
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S0420000_15(X.C942010acZ r3, X.C940020aZM r4, X.EnumC965730bEp r5, X.C1283230jUv r6, boolean r7, boolean r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 1: goto L17;
                case 2: goto L5;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r6
            r1.z4 = r7
            r1.z5 = r8
            r1.l3 = r4
            r0 = 0
        L13:
            r1.<init>(r0)
            return
        L17:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r3
            r1.l2 = r5
            r1.z4 = r7
            r1.z5 = r8
            r1.l3 = r4
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S0420000_15.<init>(X.0acZ, X.0aZM, X.0bEp, X.0jUv, boolean, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0420000_15(PunishEventInfo punishEventInfo, PunishEventInfo punishEventInfo2, PerceptionDialogInfo perceptionDialogInfo, boolean z, boolean z2, C259800zU<LiveDialog> c259800zU, Function1<? super Integer, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = punishEventInfo;
        this.l1 = punishEventInfo2;
        this.z4 = perceptionDialogInfo;
        this.z5 = z;
        this.l2 = z2;
        this.l3 = c259800zU;
    }
}
