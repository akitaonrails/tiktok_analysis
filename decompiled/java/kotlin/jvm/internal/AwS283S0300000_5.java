package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0E48;
import X.C0E55;
import X.C0VSJ;
import X.C1389890mGx;
import X.C13LP;
import X.C19EG;
import X.C2188811AlT;
import X.C284660BDs;
import X.C354090DuR;
import X.C354610DvH;
import X.C355090Dw3;
import X.C368630Ecn;
import X.C376630Eph;
import X.EnumC356070Dxd;
import X.InterfaceC351350Dq1;
import X.InterfaceC368720Ecw;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS283S0300000_5 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149 A[PHI: r13
      0x0149: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v7 java.lang.String) binds: [B:38:0x0139, B:43:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS283S0300000_5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS283S0300000_5.invoke$0(kotlin.jvm.internal.AwS283S0300000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS283S0300000_5 awS283S0300000_5, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        ((C376630Eph) awS283S0300000_5.l0).O4((Function2) awS283S0300000_5.l1, ((C013C) awS283S0300000_5.l2).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS283S0300000_5 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Number r6 = (java.lang.Number) r6
            float r3 = r6.floatValue()
            java.lang.Object r2 = r5.l0
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2 instanceof X.AbstractC368090Ebv
            if (r0 == 0) goto L2c
            X.0Ebv r2 = (X.AbstractC368090Ebv) r2
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L2c
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r2.LLJ
            if (r1 == 0) goto L2c
            X.0EcG r0 = r2.LL
            java.lang.Long r0 = r0.LIZ(r1, r3)
            if (r0 == 0) goto L2c
            long r0 = r0.longValue()
            r2.LIZLLL(r0)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            java.lang.Object r0 = r5.l1
            X.0Ecw r0 = (X.InterfaceC368720Ecw) r0
            android.view.View r1 = r0.getView()
            boolean r0 = r1 instanceof X.AbstractC368090Ebv
            r4 = 0
            if (r0 == 0) goto L41
            X.0Ebv r1 = (X.AbstractC368090Ebv) r1
            if (r1 == 0) goto L41
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r1.getNleTrackSlot$editor_trackpanel_release()
        L41:
            java.lang.Object r0 = r5.l2
            X.0Ecn r0 = (X.C368630Ecn) r0
            kotlin.jvm.functions.Function2 r1 = r0.getOnShouldInterceptSlotClickEvent()
            if (r1 == 0) goto L71
            java.lang.Object r3 = r5.l1
            X.0Ecw r3 = (X.InterfaceC368720Ecw) r3
            java.lang.Object r2 = r5.l2
            X.0Ecn r2 = (X.C368630Ecn) r2
            if (r7 == 0) goto L29
            android.view.View r0 = r3.getView()
            java.lang.Object r0 = r1.invoke(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L29
            X.0Eco r1 = r2.getClipHelper()
            java.util.Map r0 = r2.getSegmentParams()
            r1.LJIIJ(r3, r0)
            goto L29
        L71:
            java.lang.Object r0 = r5.l2
            X.0Ecn r0 = (X.C368630Ecn) r0
            java.lang.Object r2 = r5.l1
            X.0Ecw r2 = (X.InterfaceC368720Ecw) r2
            X.0Eco r1 = r0.getClipHelper()
            java.util.Map r0 = r0.getSegmentParams()
            r1.LJIIJ(r2, r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS283S0300000_5.invoke$2(kotlin.jvm.internal.AwS283S0300000_5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS283S0300000_5 awS283S0300000_5, Object obj, Object obj2) {
        NLEAIMattingType nLEAIMattingType;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = C354090DuR.LJI;
            ArrayList arrayList = new ArrayList();
            for (String str : copyOnWriteArraySet) {
                String str2 = str;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    arrayList.add(str);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MattingUtils onApplyMatting runningSlotIds= ");
            sbLIZ.append(C13LP.LJJLIIIJ(arrayList, ":", null, null, 0, null, null, 62));
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
            if (!arrayList.isEmpty()) {
                C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS283S0300000_5.l0);
                c1389890mGx.LJIIJ(((C19EG) awS283S0300000_5.l0).getString(2131830433));
                c1389890mGx.LJIIJJI();
            } else {
                C0E48 c0e48 = (C0E48) awS283S0300000_5.l1;
                if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
                    player.pause(false);
                }
                if (((Boolean) C284660BDs.LIZ.getValue()).booleanValue()) {
                    nLEAIMattingType = NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY;
                } else {
                    nLEAIMattingType = NLEAIMattingType.TYPE_AI;
                }
                int iSwigValue = nLEAIMattingType.swigValue();
                C0E48 c0e482 = (C0E48) awS283S0300000_5.l1;
                if (c0e482 != null && (interfaceC351350Dq1LLFII = c0e482.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LJIL(null, new C0VSJ(C354090DuR.LIZJ), iSwigValue, false, null, null, EnumC356070Dxd.DONE, new AwS371S0200000_5((Function1) awS283S0300000_5.l2, (Function1<? super NLEAIMatting, Unit>) awS283S0300000_5.l1, (C0E48) 286));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS283S0300000_5(C354610DvH c354610DvH, C354610DvH c354610DvH2, Map<NLETrackSlot, NLETrack> map, Map<String, Pair<Long, Long>> map2) {
        super(2);
        this.$t = map2;
        this.l0 = c354610DvH;
        this.l1 = c354610DvH2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS283S0300000_5(C376630Eph c376630Eph, C376630Eph c376630Eph2, Function2<? super Boolean, ? super Boolean, Unit> function2, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = c376630Eph;
        this.l1 = c376630Eph2;
        this.l2 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS283S0300000_5(C19EG c19eg, C0E48 c0e48, AwS371S0200000_5 awS371S0200000_5, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c0e48;
        this.l2 = awS371S0200000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS283S0300000_5(View view, InterfaceC368720Ecw interfaceC368720Ecw, C368630Ecn c368630Ecn, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = interfaceC368720Ecw;
        this.l2 = c368630Ecn;
    }
}
