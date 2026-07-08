package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C09AY;
import X.C0DQF;
import X.C1388190mED;
import X.C13LC;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1857420yR2;
import X.C1862330yYx;
import X.C1862950yZx;
import X.C1863850ybP;
import X.C1906580ziK;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C419910GdJ;
import X.C597050NbL;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS7S1310000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

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

    public static final Object invoke$0(AwS7S1310000_27 awS7S1310000_27, Object obj) {
        Activity activityLIZ;
        Map<String, String> commonParams;
        String strLJJI;
        String str;
        String str2;
        String str3;
        Integer numValueOf;
        String strNZ0;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        C0DQF.LJIIIZ(activityLIZ, (View) awS7S1310000_27.l1);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (awS7S1310000_27.z4) {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS7S1310000_27.l2, ITakoContextAbility.class, null);
            if (iTakoContextAbility != null) {
                commonParams = iTakoContextAbility.uG1();
                if (commonParams == null) {
                }
            }
            commonParams = C2097608Jq.LJ();
        } else {
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS7S1310000_27.l2, ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null) {
                commonParams = iTakoContextAbility2.getCommonParams();
                if (commonParams == null) {
                }
            }
            commonParams = C2097608Jq.LJ();
        }
        Message message = (Message) awS7S1310000_27.l3;
        String str4 = message.uuid;
        String str5 = message.subSessionId;
        long j = message.actionId;
        long j2 = message.botId;
        String strLIZIZ = C1855920yOc.LIZIZ(message);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS7S1310000_27.l3).ext.activeAiImageSubBar));
        if (awS7S1310000_27.z4) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            strLJJI = C1857420yR2.LJJI((Message) awS7S1310000_27.l3);
        } else {
            strLJJI = null;
        }
        if (awS7S1310000_27.z4) {
            str = "chat";
        } else {
            str = "tako";
        }
        TakoMixFeed takoMixFeedLJIIIZ = ((Message) awS7S1310000_27.l3).LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            str2 = takoMixFeedLJIIIZ.text;
        } else {
            str2 = null;
        }
        Message message2 = (Message) awS7S1310000_27.l3;
        if (message2.isMultiAnswer) {
            str3 = "multi_answer";
            numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
        } else {
            str3 = "default";
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS7S1310000_27.l2, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS7S1310000_27.l2;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, commonParams, str4, str5, Long.valueOf(j), Long.valueOf(j2), "report", strLIZIZ, awS7S1310000_27.s0, strLIZLLL, strLJJI, str, str2, str3, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 65536);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S1310000_27 awS7S1310000_27, Object obj) {
        int i;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.REPORT;
        c19723912Ez.LIZJ = 2131849773;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_flag;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS7S1310000_27((View) awS7S1310000_27.l1, (InterfaceC665370Q7z) awS7S1310000_27.l2, (Message) awS7S1310000_27.l3, awS7S1310000_27.s0, awS7S1310000_27.z4, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S1310000_27 awS7S1310000_27, Object obj) {
        Activity activityLIZ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        C0DQF.LJIIIZ(activityLIZ, (View) awS7S1310000_27.l1);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS7S1310000_27.l2, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            Message message = (Message) awS7S1310000_27.l3;
            boolean z = awS7S1310000_27.z4;
            String str2 = awS7S1310000_27.s0;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            String str4 = c1863850ybP.LLILLJJLI;
            String str5 = c1863850ybP.LLILZIL;
            String str6 = message.uuid;
            if (z) {
                str = "highlighted_word";
            } else {
                str = "segmented_word";
            }
            String str7 = c1863850ybP.LLILZLL;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c1863850ybP.LLIZ;
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str5), new Pair("enter_from", str3), new Pair("enter_method", str4), new Pair("message_id", str6), new Pair("panel_source", str), new Pair("word_content", str2));
            if (str7.length() > 0) {
                mapLJIIJ.put("tako_session_id", str7);
            }
            if (str8 != null && str8.length() > 0) {
                mapLJIIJ.put("tako_chat_id", str8);
            }
            c20235014FoLIZ.LIZ("tikbot_panel_report_click", mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS7S1310000_27 awS7S1310000_27, Object obj) {
        int i;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.ENTITY_REPORT;
        c19723912Ez.LIZJ = 2131849773;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_flag;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS7S1310000_27((View) awS7S1310000_27.l1, (InterfaceC665370Q7z) awS7S1310000_27.l2, (Message) awS7S1310000_27.l3, awS7S1310000_27.s0, awS7S1310000_27.z4, 2);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS7S1310000_27(android.view.View r3, X.InterfaceC665370Q7z r4, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r5, java.lang.String r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 0: goto L15;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r1.z4 = r7
            r1.s0 = r6
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l1 = r3
            r1.z4 = r7
            r1.l2 = r4
            r1.l3 = r5
            r1.s0 = r6
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S1310000_27.<init>(android.view.View, X.0Q7z, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, java.lang.String, boolean, int):void");
    }
}
