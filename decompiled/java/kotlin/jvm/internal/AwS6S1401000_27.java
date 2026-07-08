package kotlin.jvm.internal;

import X.C09AY;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1858720yT8;
import X.C1862330yYx;
import X.C1862950yZx;
import X.C2097608Jq;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS6S1401000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S1401000_27 awS6S1401000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) awS6S1401000_27.l1;
        if (takoInteractionConfig != null) {
            C1858720yT8.LIZLLL(takoInteractionConfig, (View) awS6S1401000_27.l2, Integer.valueOf(awS6S1401000_27.i5), (InterfaceC665370Q7z) awS6S1401000_27.l3, awS6S1401000_27.s0);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1401000_27.l3, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message = (Message) awS6S1401000_27.l4;
        String str2 = message.uuid;
        String str3 = message.subSessionId;
        long j = message.actionId;
        long j2 = message.botId;
        String strLIZIZ = C1855920yOc.LIZIZ(message);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS6S1401000_27.l4).ext.activeAiImageSubBar));
        Message message2 = (Message) awS6S1401000_27.l4;
        boolean z = message2.isMultiAnswer;
        if (z) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z) {
            numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
        } else {
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1401000_27.l3, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS6S1401000_27.l3;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, Long.valueOf(j), Long.valueOf(j2), "dislike", strLIZIZ, awS6S1401000_27.s0, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1401000_27 awS6S1401000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) awS6S1401000_27.l1;
        if (takoInteractionConfig != null) {
            C1858720yT8.LIZLLL(takoInteractionConfig, (View) awS6S1401000_27.l2, Integer.valueOf(awS6S1401000_27.i5), (InterfaceC665370Q7z) awS6S1401000_27.l3, awS6S1401000_27.s0);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1401000_27.l3, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message = (Message) awS6S1401000_27.l4;
        String str2 = message.uuid;
        String str3 = message.subSessionId;
        long j = message.actionId;
        long j2 = message.botId;
        String strLIZIZ = C1855920yOc.LIZIZ(message);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS6S1401000_27.l4).ext.activeAiImageSubBar));
        Message message2 = (Message) awS6S1401000_27.l4;
        boolean z = message2.isMultiAnswer;
        if (z) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z) {
            numValueOf = Integer.valueOf(message2.selectedAnswerIndex + 1);
        } else {
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1401000_27.l3, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS6S1401000_27.l3;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, Long.valueOf(j), Long.valueOf(j2), "like", strLIZIZ, awS6S1401000_27.s0, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1401000_27(TakoInteractionConfig takoInteractionConfig, View view, int i, InterfaceC665370Q7z interfaceC665370Q7z, String str, Message message, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = takoInteractionConfig;
        this.l2 = view;
        this.i5 = i;
        this.l3 = interfaceC665370Q7z;
        this.s0 = str;
        this.l4 = message;
    }
}
