package kotlin.jvm.internal;

import X.C07QI;
import X.C09AY;
import X.C0PEM;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1856660yPo;
import X.C1858720yT8;
import X.C1862330yYx;
import X.C1862950yZx;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C326880Cre;
import X.C419910GdJ;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS1S1710000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public boolean z8;

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

    public static final Object invoke$0(AwS1S1710000_27 awS1S1710000_27, Object obj) {
        String str;
        LinkedHashMap linkedHashMap;
        Map<String, String> commonParams;
        C326880Cre c326880CreM50;
        Message message;
        Map<String, String> mapLJ;
        String str2;
        Integer numValueOf;
        String strNZ0;
        View view = (View) obj;
        if (!awS1S1710000_27.z8) {
            TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) awS1S1710000_27.l1;
            if (takoInteractionConfig != null) {
                C1858720yT8.LIZ(takoInteractionConfig, true, (InterfaceC665370Q7z) awS1S1710000_27.l2);
            }
            if (Intrinsics.LJFF(awS1S1710000_27.s0, "long_press")) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1710000_27.l2, ITakoContextAbility.class, null);
                if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                Message message2 = (Message) awS1S1710000_27.l3;
                String str3 = message2.uuid;
                String str4 = message2.subSessionId;
                long j = message2.actionId;
                long j2 = message2.botId;
                String strLIZIZ = C1855920yOc.LIZIZ(message2);
                String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS1S1710000_27.l3).ext.activeAiImageSubBar));
                Message message3 = (Message) awS1S1710000_27.l3;
                boolean z = message3.isMultiAnswer;
                if (z) {
                    str2 = "multi_answer";
                } else {
                    str2 = "default";
                }
                if (z) {
                    numValueOf = Integer.valueOf(message3.selectedAnswerIndex + 1);
                } else {
                    numValueOf = null;
                }
                ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1710000_27.l2, ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                    strNZ0 = "full_screen";
                }
                C1862950yZx c1862950yZx = C1862950yZx.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS1S1710000_27.l2;
                c1862950yZx.getClass();
                C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str3, str4, Long.valueOf(j), Long.valueOf(j2), "publish", strLIZIZ, awS1S1710000_27.s0, strLIZLLL, null, null, null, str2, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
            }
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1710000_27.l2, TakoCardAbility.class, null);
            if (takoCardAbility != null && (c326880CreM50 = takoCardAbility.m50()) != null && (message = c326880CreM50.LLILLL) != null) {
                str = message.uuid;
            } else {
                str = null;
            }
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1710000_27.l2, ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null && (commonParams = iTakoContextAbility2.getCommonParams()) != null) {
                linkedHashMap = new LinkedHashMap(commonParams);
                Message message4 = (Message) awS1S1710000_27.l3;
                if (true ^ a0.LJJJIL(message4.ext.imageTemplateId)) {
                    linkedHashMap.put("image_template_id", message4.ext.imageTemplateId);
                    linkedHashMap.put("is_unchanged_tako_template", String.valueOf(message4.ext.isUnchangedTakoTemplate));
                }
            } else {
                linkedHashMap = null;
            }
            LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) awS1S1710000_27.l4;
            if (lifecycleCoroutineScope != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C1856660yPo((InterfaceC665370Q7z) awS1S1710000_27.l2, (List) awS1S1710000_27.l6, view, (View) awS1S1710000_27.l7, (TakoInteractionConfig) awS1S1710000_27.l1, str, linkedHashMap, (Message) awS1S1710000_27.l3, awS1S1710000_27.s0, null), 2);
            }
            C1862330yYx.LJLJL(C1862330yYx.LIZ, (Map) awS1S1710000_27.l5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1710000_27 awS1S1710000_27, Object obj) {
        int i;
        int i2;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.POST_VIDEO;
        c19723912Ez.LJIIIZ = awS1S1710000_27.z8;
        c19723912Ez.LIZJ = 2131849897;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            i2 = R.raw.icon_plus;
        } else {
            i2 = R.raw.icon_post;
        }
        c419910GdJ.LIZ = i2;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS1S1710000_27(awS1S1710000_27.z8, (TakoInteractionConfig) awS1S1710000_27.l1, (InterfaceC665370Q7z) awS1S1710000_27.l2, awS1S1710000_27.s0, (Message) awS1S1710000_27.l3, (LifecycleCoroutineScope) awS1S1710000_27.l4, (Map) awS1S1710000_27.l5, (List) awS1S1710000_27.l6, (View) awS1S1710000_27.l7, 0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1710000_27(boolean z, boolean z2, TakoInteractionConfig takoInteractionConfig, InterfaceC665370Q7z interfaceC665370Q7z, String str, Message message, LifecycleCoroutineScope lifecycleCoroutineScope, Map<String, String> map, List<BaseVideo> list, View view) {
        super(1);
        this.$t = view;
        this.z8 = z;
        this.l1 = z2;
        this.l2 = takoInteractionConfig;
        this.s0 = interfaceC665370Q7z;
        this.l3 = str;
        this.l4 = message;
        this.l5 = lifecycleCoroutineScope;
        this.l6 = map;
        this.l7 = list;
    }
}
