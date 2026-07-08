package kotlin.jvm.internal;

import X.C09AY;
import X.C13LC;
import X.C14FI;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1857420yR2;
import X.C1861630yXp;
import X.C1862330yYx;
import X.C1862660yZU;
import X.C1862950yZx;
import X.C1863850ybP;
import X.C1863960yba;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C2097608Jq;
import X.C259800zU;
import X.C419910GdJ;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.processor.TakoSearchCarryProcessor;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS9S2400000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS9S2400000_27 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS9S2400000_27.invoke$0(kotlin.jvm.internal.AwS9S2400000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS9S2400000_27 awS9S2400000_27, Object obj) {
        TakoSearchCarryProcessor takoSearchCarryProcessor = (TakoSearchCarryProcessor) awS9S2400000_27.l2;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS9S2400000_27.l3;
        IMessageAbility iMessageAbility = (IMessageAbility) awS9S2400000_27.l4;
        String str = awS9S2400000_27.s0;
        C1862660yZU c1862660yZU = (C1862660yZU) awS9S2400000_27.l5;
        String str2 = awS9S2400000_27.s1;
        takoSearchCarryProcessor.getClass();
        iMessageAbility.Uj0(C1861630yXp.LIZ(new C1863960yba(takoEnterParams, str, c1862660yZU, (SearchLandingPageResponse) obj, str2)));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S2400000_27 awS9S2400000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (!((Message) awS9S2400000_27.l2).sender.isSelf && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS9S2400000_27.l3, ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            int i = C14FI.LIZ;
            C14FI.LIZ(c1863850ybP.LLILZIL);
        }
        Function0 function0 = (Function0) awS9S2400000_27.l4;
        if (function0 != null) {
            function0.invoke();
        } else {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            C1857420yR2.LJJ((View) awS9S2400000_27.l5, awS9S2400000_27.s0);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS9S2400000_27.l3, ITakoContextAbility.class, null);
            if (iTakoContextAbility2 == null || (mapLJ = iTakoContextAbility2.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            Message message = (Message) awS9S2400000_27.l2;
            String str2 = message.uuid;
            String str3 = message.subSessionId;
            Long lValueOf = Long.valueOf(message.actionId);
            Long lValueOf2 = Long.valueOf(((Message) awS9S2400000_27.l2).botId);
            String strLIZIZ = C1855920yOc.LIZIZ((Message) awS9S2400000_27.l2);
            String str4 = awS9S2400000_27.s1;
            String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS9S2400000_27.l2).ext.activeAiImageSubBar));
            Message message2 = (Message) awS9S2400000_27.l2;
            if (message2.isMultiAnswer) {
                str = "multi_answer";
                numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
            } else {
                str = "default";
                numValueOf = null;
            }
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS9S2400000_27.l3, ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C1862950yZx c1862950yZx = C1862950yZx.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS9S2400000_27.l3;
            c1862950yZx.getClass();
            C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, lValueOf, lValueOf2, "copy", strLIZIZ, str4, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS9S2400000_27 awS9S2400000_27, Object obj) {
        int i;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.COPY;
        c19723912Ez.LIZJ = 2131835685;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_doc_on_doc;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS9S2400000_27((Message) awS9S2400000_27.l2, (Message) awS9S2400000_27.l3, (InterfaceC665370Q7z) awS9S2400000_27.l4, (Function0<Unit>) awS9S2400000_27.l5, (View) awS9S2400000_27.s0, awS9S2400000_27.s1, (String) 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S2400000_27(Message message, Message message2, InterfaceC665370Q7z interfaceC665370Q7z, Function0<Unit> function0, View view, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = message;
        this.l3 = message2;
        this.l4 = interfaceC665370Q7z;
        this.l5 = function0;
        this.s0 = view;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S2400000_27(TakoSearchCarryProcessor takoSearchCarryProcessor, TakoEnterParams takoEnterParams, IMessageAbility iMessageAbility, String str, C1862660yZU c1862660yZU, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = takoSearchCarryProcessor;
        this.l3 = takoEnterParams;
        this.l4 = iMessageAbility;
        this.s0 = str;
        this.l5 = c1862660yZU;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S2400000_27(String str, String str2, Boolean bool, String str3, C259800zU<String> c259800zU, TakoPlaceholderSource takoPlaceholderSource, Message message) {
        super(1);
        this.$t = message;
        this.s0 = str;
        this.l2 = str2;
        this.s1 = bool;
        this.l3 = str3;
        this.l4 = c259800zU;
        this.l5 = takoPlaceholderSource;
    }
}
