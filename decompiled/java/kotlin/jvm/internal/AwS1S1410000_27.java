package kotlin.jvm.internal;

import X.C09AY;
import X.C12FB;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1862330yYx;
import X.C1862870yZp;
import X.C1862950yZx;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C419910GdJ;
import X.C597050NbL;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS1S1410000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

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

    public static final Object invoke$0(AwS1S1410000_27 awS1S1410000_27, Object obj) {
        String str;
        Integer numValueOf;
        Map<String, String> mapLJ;
        Integer numValueOf2;
        String strNZ0;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Function0 function0 = (Function0) awS1S1410000_27.l1;
        String str9 = "multi_answer";
        if (function0 != null) {
            function0.invoke();
        } else {
            View view = (View) awS1S1410000_27.l2;
            boolean z = awS1S1410000_27.z5;
            Message message = (Message) awS1S1410000_27.l3;
            String str10 = message.uuid;
            String str11 = message.subSessionId;
            long j = message.actionId;
            Long lValueOf = Long.valueOf(message.botId);
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS1S1410000_27.l4;
            String str12 = awS1S1410000_27.s0;
            String strLIZIZ = C1855920yOc.LIZIZ((Message) awS1S1410000_27.l3);
            String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS1S1410000_27.l3).ext.activeAiImageSubBar));
            Message message2 = (Message) awS1S1410000_27.l3;
            if (message2.isMultiAnswer) {
                str = "multi_answer";
                numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
            } else {
                str = "default";
                numValueOf = null;
            }
            C12FB.LIZLLL(view, z, str10, str11, j, lValueOf, interfaceC665370Q7z, str12, strLIZIZ, strLIZLLL, str, numValueOf);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1410000_27.l4, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message3 = (Message) awS1S1410000_27.l3;
        String str13 = message3.uuid;
        String str14 = message3.subSessionId;
        long j2 = message3.actionId;
        long j3 = message3.botId;
        String strLIZIZ2 = C1855920yOc.LIZIZ(message3);
        String strLIZLLL2 = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS1S1410000_27.l3).ext.activeAiImageSubBar));
        Message message4 = (Message) awS1S1410000_27.l3;
        if (!message4.isMultiAnswer) {
            str9 = "default";
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(message4.selectedAnswerIndex + 1);
        }
        Map<String, String> commonParams = null;
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1410000_27.l4, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) awS1S1410000_27.l4;
        c1862950yZx.getClass();
        String str15 = null;
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str13, str14, Long.valueOf(j2), Long.valueOf(j3), "share_select", strLIZIZ2, awS1S1410000_27.s0, strLIZLLL2, null, null, null, str9, numValueOf2, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z2), 69120);
        if (awS1S1410000_27.z5 && Intrinsics.LJFF(awS1S1410000_27.s0, "exposed_button")) {
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1410000_27.l4, ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null) {
                commonParams = iTakoContextAbility2.getCommonParams();
            }
            Message message5 = (Message) awS1S1410000_27.l3;
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            Pair[] pairArr = new Pair[8];
            if (commonParams != null) {
                str2 = commonParams.get("enter_from");
            } else {
                str2 = null;
            }
            pairArr[0] = new Pair("enter_from", str2);
            if (commonParams != null) {
                str3 = commonParams.get("enter_method");
            } else {
                str3 = null;
            }
            pairArr[1] = new Pair("enter_method", str3);
            if (commonParams != null) {
                str4 = commonParams.get("process_id");
            } else {
                str4 = null;
            }
            pairArr[2] = new Pair("process_id", str4);
            if (commonParams != null) {
                str5 = commonParams.get("tako_session_id");
            } else {
                str5 = null;
            }
            pairArr[3] = new Pair("tako_session_id", str5);
            if (commonParams != null) {
                str6 = commonParams.get("tako_chat_id");
            } else {
                str6 = null;
            }
            pairArr[4] = new Pair("tako_chat_id", str6);
            if (commonParams != null) {
                str7 = commonParams.get("sub_process_id");
            } else {
                str7 = null;
            }
            pairArr[5] = new Pair("sub_process_id", str7);
            if (commonParams != null) {
                str8 = commonParams.get("bot_id");
            } else {
                str8 = null;
            }
            pairArr[6] = new Pair("bot_id", str8);
            pairArr[7] = new Pair("message_id", message5.uuid);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (commonParams != null) {
                str15 = commonParams.get("inspiration_session_id");
            }
            c20235014FoLIZ.LIZ("tikbot_post_button_click", C2097608Jq.LJIIL(mapLJIIJ, C1862870yZp.LIZ(str15)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1410000_27 awS1S1410000_27, Object obj) {
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.SHARE;
        c19723912Ez.LIZJ = 2131849790;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_turn_up_right;
        C1919007fQ.LIZ.getClass();
        boolean zLIZLLL = C1919007fQ.LIZLLL();
        int i = R.attr.a1i;
        if (zLIZLLL) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        if (!C1919007fQ.LIZLLL()) {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        c19723912Ez.LJIIJ = new AwS1S1410000_27((Function0) awS1S1410000_27.l1, (Function0<Unit>) awS1S1410000_27.l2, (View) awS1S1410000_27.z5, (boolean) awS1S1410000_27.l3, (Message) awS1S1410000_27.l4, (InterfaceC665370Q7z) awS1S1410000_27.s0, (String) 0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS1S1410000_27 r7, java.lang.Object r8) {
        /*
            X.12Ez r8 = (X.C19723912Ez) r8
            X.0yR3 r0 = X.EnumC1857430yR3.DISLIKE
            r8.LIZ = r0
            r0 = 2131849680(0x7f1171d0, float:1.93329E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.LIZJ = r0
            boolean r0 = r7.z5
            r4 = 2131100622(0x7f0603ce, float:1.781363E38)
            r3 = 2131100623(0x7f0603cf, float:1.7813633E38)
            if (r0 != 0) goto L76
            X.07fQ r0 = X.C1919007fQ.LIZ
            r0.getClass()
            boolean r0 = X.C1919007fQ.LIZLLL()
            if (r0 != 0) goto L76
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
        L27:
            r8.LIZLLL = r0
            boolean r2 = r7.z5
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            if (r2 == 0) goto L72
            r0 = 2130774895(0x7f010b6f, float:1.7152978E38)
        L35:
            r1.LIZ = r0
            if (r2 == 0) goto L5f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L3d:
            r1.LJ = r0
            r8.LJ = r1
            kotlin.jvm.internal.AwS6S1401000_27 r0 = new kotlin.jvm.internal.AwS6S1401000_27
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig) r1
            java.lang.Object r2 = r7.l2
            android.view.View r2 = (android.view.View) r2
            r3 = 2
            java.lang.Object r4 = r7.l3
            X.0Q7z r4 = (X.InterfaceC665370Q7z) r4
            java.lang.String r5 = r7.s0
            java.lang.Object r6 = r7.l4
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r6 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r6
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.LJIIJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            X.07fQ r0 = X.C1919007fQ.LIZ
            r0.getClass()
            boolean r0 = X.C1919007fQ.LIZLLL()
            if (r0 == 0) goto L6d
            r4 = 2131100623(0x7f0603cf, float:1.7813633E38)
        L6d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L3d
        L72:
            r0 = 2130774894(0x7f010b6e, float:1.7152976E38)
            goto L35
        L76:
            r0 = 2131100623(0x7f0603cf, float:1.7813633E38)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S1410000_27.invoke$2(kotlin.jvm.internal.AwS1S1410000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS1S1410000_27 r7, java.lang.Object r8) {
        /*
            X.12Ez r8 = (X.C19723912Ez) r8
            X.0yR3 r0 = X.EnumC1857430yR3.LIKE
            r8.LIZ = r0
            r0 = 2131849681(0x7f1171d1, float:1.9332903E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.LIZJ = r0
            boolean r0 = r7.z5
            r4 = 2131100622(0x7f0603ce, float:1.781363E38)
            r3 = 2131100623(0x7f0603cf, float:1.7813633E38)
            if (r0 != 0) goto L68
            X.07fQ r0 = X.C1919007fQ.LIZ
            r0.getClass()
            boolean r0 = X.C1919007fQ.LIZLLL()
            if (r0 != 0) goto L68
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
        L27:
            r8.LIZLLL = r0
            boolean r2 = r7.z5
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            if (r2 == 0) goto L64
            r0 = 2130774897(0x7f010b71, float:1.7152982E38)
        L35:
            r1.LIZ = r0
            if (r2 == 0) goto L5f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L3d:
            r1.LJ = r0
            r8.LJ = r1
            kotlin.jvm.internal.AwS6S1401000_27 r0 = new kotlin.jvm.internal.AwS6S1401000_27
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig) r1
            java.lang.Object r2 = r7.l2
            android.view.View r2 = (android.view.View) r2
            r3 = 1
            java.lang.Object r4 = r7.l3
            X.0Q7z r4 = (X.InterfaceC665370Q7z) r4
            java.lang.String r5 = r7.s0
            java.lang.Object r6 = r7.l4
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r6 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r6
            r7 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.LJIIJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L3d
        L64:
            r0 = 2130774896(0x7f010b70, float:1.715298E38)
            goto L35
        L68:
            r0 = 2131100623(0x7f0603cf, float:1.7813633E38)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S1410000_27.invoke$3(kotlin.jvm.internal.AwS1S1410000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1410000_27(Function0 function0, Function0<Unit> function02, View view, boolean z, Message message, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.z5 = view;
        this.l3 = z;
        this.l4 = message;
        this.s0 = interfaceC665370Q7z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1410000_27(boolean z, TakoInteractionConfig takoInteractionConfig, View view, InterfaceC665370Q7z interfaceC665370Q7z, String str, Message message, int i) {
        super(1);
        this.$t = i;
        this.z5 = z;
        this.l1 = takoInteractionConfig;
        this.l2 = view;
        this.l3 = interfaceC665370Q7z;
        this.s0 = str;
        this.l4 = message;
    }
}
