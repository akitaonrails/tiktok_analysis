package kotlin.jvm.internal;

import X.C07QI;
import X.C09AY;
import X.C0PEM;
import X.C12FQ;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1856670yPp;
import X.C1858720yT8;
import X.C1862330yYx;
import X.C1862950yZx;
import X.C1919007fQ;
import X.C19723912Ez;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C419910GdJ;
import X.C817503Hh;
import X.EnumC1857430yR3;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS1S1510000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public boolean z6;

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

    public static final Object invoke$0(AwS1S1510000_27 awS1S1510000_27, Object obj) {
        int i;
        Integer numValueOf;
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf2;
        String strNZ0;
        View view = (View) obj;
        if (!awS1S1510000_27.z6) {
            Context context = view.getContext();
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                i = 2131822519;
            } else {
                i = 2131837962;
            }
            if (C07QI.LIZ()) {
                numValueOf = Integer.valueOf(R.raw.icon_exclamation_mark_circle_fill);
            } else {
                numValueOf = null;
            }
            if (C12FQ.LIZJ(context, (View) awS1S1510000_27.l1, numValueOf, i)) {
                TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) awS1S1510000_27.l2;
                if (takoInteractionConfig != null) {
                    C1858720yT8.LIZ(takoInteractionConfig, true, (InterfaceC665370Q7z) awS1S1510000_27.l3);
                }
                if (Intrinsics.LJFF(awS1S1510000_27.s0, "long_press")) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1510000_27.l3, ITakoContextAbility.class, null);
                    if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    Message message = (Message) awS1S1510000_27.l4;
                    String str2 = message.uuid;
                    String str3 = message.subSessionId;
                    long j = message.actionId;
                    long j2 = message.botId;
                    String strLIZIZ = C1855920yOc.LIZIZ(message);
                    String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS1S1510000_27.l4).ext.activeAiImageSubBar));
                    Message message2 = (Message) awS1S1510000_27.l4;
                    boolean z = message2.isMultiAnswer;
                    if (z) {
                        str = "multi_answer";
                    } else {
                        str = "default";
                    }
                    if (z) {
                        numValueOf2 = Integer.valueOf(message2.selectedAnswerIndex + 1);
                    } else {
                        numValueOf2 = null;
                    }
                    ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS1S1510000_27.l3, ITakoScreenTypeAbility.class, null);
                    if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                        strNZ0 = "full_screen";
                    }
                    C1862950yZx c1862950yZx = C1862950yZx.LIZ;
                    InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS1S1510000_27.l3;
                    c1862950yZx.getClass();
                    C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, Long.valueOf(j), Long.valueOf(j2), "save", strLIZIZ, awS1S1510000_27.s0, strLIZLLL, null, null, null, str, numValueOf2, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
                }
                WeakReference weakReference = new WeakReference((View) awS1S1510000_27.l1);
                WeakReference weakReference2 = new WeakReference((InterfaceC665370Q7z) awS1S1510000_27.l3);
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1856670yPp(weakReference, (List) awS1S1510000_27.l5, (Message) awS1S1510000_27.l4, awS1S1510000_27.s0, (InterfaceC665370Q7z) awS1S1510000_27.l3, weakReference2, (TakoInteractionConfig) awS1S1510000_27.l2, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1510000_27 awS1S1510000_27, Object obj) {
        int i;
        Integer numValueOf;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.SAVE_VIDEO;
        c19723912Ez.LJIIIZ = awS1S1510000_27.z6;
        c19723912Ez.LIZJ = 2131849898;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.attr.a1i;
        } else {
            i = R.attr.a1h;
        }
        c19723912Ez.LIZLLL = i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
        if (C1919007fQ.LIZLLL()) {
            numValueOf = Integer.valueOf(R.attr.a1i);
        } else {
            numValueOf = Integer.valueOf(R.attr.a1h);
        }
        c419910GdJ.LJ = numValueOf;
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS1S1510000_27(awS1S1510000_27.z6, (View) awS1S1510000_27.l1, (TakoInteractionConfig) awS1S1510000_27.l2, (InterfaceC665370Q7z) awS1S1510000_27.l3, awS1S1510000_27.s0, (Message) awS1S1510000_27.l4, (List) awS1S1510000_27.l5, 0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1510000_27(boolean z, boolean z2, View view, TakoInteractionConfig takoInteractionConfig, InterfaceC665370Q7z interfaceC665370Q7z, String str, Message message, List<BaseVideo> list) {
        super(1);
        this.$t = list;
        this.z6 = z;
        this.l1 = z2;
        this.l2 = view;
        this.l3 = takoInteractionConfig;
        this.s0 = interfaceC665370Q7z;
        this.l4 = str;
        this.l5 = message;
    }
}
