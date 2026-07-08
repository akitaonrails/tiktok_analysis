package kotlin.jvm.internal;

import X.C09AY;
import X.C1561220qjI;
import X.C1852270yIj;
import X.C1852290yIl;
import X.C1852650yJL;
import X.C1854260yLw;
import X.C19EG;
import X.C2097608Jq;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCStyleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS2S2301000_27 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S2301000_27 awS2S2301000_27) {
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        CreativeTemplate creativeTemplate = (CreativeTemplate) awS2S2301000_27.l2;
        int i = awS2S2301000_27.i5;
        C19EG c19eg = (C19EG) awS2S2301000_27.l3;
        TakoPageContext takoPageContext = (TakoPageContext) awS2S2301000_27.l4;
        String str = awS2S2301000_27.s0;
        String str2 = awS2S2301000_27.s1;
        c1852270yIj.getClass();
        C1852270yIj.LJIIIZ(creativeTemplate, i, c19eg, takoPageContext, str, str2, null, null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2301000_27 awS2S2301000_27) {
        String str;
        C1561220qjI.LIZ.getClass();
        if (C1561220qjI.LIZ()) {
            C1852290yIl c1852290yIl = C1852290yIl.LIZ;
            C19EG c19eg = (C19EG) awS2S2301000_27.l2;
            CreativeTemplate creativeTemplate = (CreativeTemplate) awS2S2301000_27.l3;
            C1852270yIj.LIZ.getClass();
            C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
            AIGCStyleConfig aIGCStyleConfig = null;
            if (c1852650yJL != null) {
                aIGCStyleConfig = c1852650yJL.LJIIJ;
            }
            String str2 = C1852270yIj.LIZJ.get("enter_from");
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = C1852270yIj.LIZJ.get("enter_method");
            if (str4 == null) {
                str4 = "";
            }
            C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
            if (c1852650yJL2 == null || (str = c1852650yJL2.LJI) == null) {
                str = "";
            }
            TakoPageContext takoPageContext = (TakoPageContext) awS2S2301000_27.l4;
            Pair[] pairArr = new Pair[5];
            String str5 = awS2S2301000_27.s0;
            if (str5 == null) {
                str5 = "";
            }
            pairArr[0] = new Pair("tab_id", str5);
            String str6 = awS2S2301000_27.s1;
            if (str6 == null) {
                str6 = "";
            }
            pairArr[1] = new Pair("template_tab", str6);
            String str7 = C1852270yIj.LIZJ.get("process_id");
            if (str7 == null) {
                str7 = "";
            }
            pairArr[2] = new Pair("process_id", str7);
            String str8 = C1852270yIj.LIZJ.get("tako_session_id");
            if (str8 == null) {
                str8 = "";
            }
            pairArr[3] = new Pair("tako_session_id", str8);
            String str9 = C1852270yIj.LIZJ.get("tako_chat_id");
            if (str9 != null) {
                str3 = str9;
            }
            pairArr[4] = new Pair("tako_chat_id", str3);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            String str10 = C1852270yIj.LJ.get("word_page_source");
            if (str10 != null) {
                mapLJIIJ.put("word_page_source", str10);
            }
            String str11 = C1852270yIj.LJ.get("guide_type");
            if (str11 != null) {
                mapLJIIJ.put("guide_type", str11);
            }
            c1852290yIl.getClass();
            C1852290yIl.LIZ(c19eg, creativeTemplate, aIGCStyleConfig, str2, str4, str, takoPageContext, mapLJIIJ, null);
        } else {
            C1854260yLw c1854260yLw = C1854260yLw.LIZ;
            String str12 = ((CreativeTemplate) awS2S2301000_27.l3).templatePrompt;
            C1852270yIj.LIZ.getClass();
            C1852650yJL c1852650yJL3 = C1852270yIj.LIZLLL;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI = C1852270yIj.LJIIJJI();
            CreativeTemplate creativeTemplate2 = (CreativeTemplate) awS2S2301000_27.l3;
            C1854260yLw.LJIIIZ(c1854260yLw, (C19EG) awS2S2301000_27.l2, c1852650yJL3, interfaceC665370Q7zLJIIJJI, str12, C1852270yIj.LJFF(creativeTemplate2.assets), creativeTemplate2.templateId, awS2S2301000_27.s0, awS2S2301000_27.s1, 1001, null, 1024);
        }
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        CreativeTemplate creativeTemplate3 = (CreativeTemplate) awS2S2301000_27.l3;
        int i = awS2S2301000_27.i5;
        String str13 = awS2S2301000_27.s0;
        String str14 = awS2S2301000_27.s1;
        c1852270yIj.getClass();
        C1852270yIj.LJIILJJIL(creativeTemplate3, i, str13, str14);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS2S2301000_27(int r3, X.C19EG r4, com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate r5, com.ss.android.ugc.aweme.tako.model.TakoPageContext r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l2 = r4
            r1.l3 = r5
            r1.l4 = r6
            r1.s0 = r7
            r1.s1 = r8
            r1.i5 = r3
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l2 = r5
            r1.i5 = r3
            r1.l3 = r4
            r1.l4 = r6
            r1.s0 = r7
            r1.s1 = r8
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS2S2301000_27.<init>(int, X.19EG, com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate, com.ss.android.ugc.aweme.tako.model.TakoPageContext, java.lang.String, java.lang.String, int):void");
    }
}
