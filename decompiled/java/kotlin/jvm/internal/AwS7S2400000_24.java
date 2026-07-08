package kotlin.jvm.internal;

import X.C09AY;
import X.C259800zU;
import X.InterfaceC1594550rb3;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS7S2400000_24 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S2400000_24 awS7S2400000_24, Object obj) {
        Assembler assembler = (Assembler) obj;
        TakoTemplateActivity takoTemplateActivity = (TakoTemplateActivity) awS7S2400000_24.l2;
        assembler.FQ2(takoTemplateActivity, new AwS10S2300000_24(takoTemplateActivity, (TakoTemplateActivity) awS7S2400000_24.l3, (C259800zU<String>) awS7S2400000_24.s0, (String) awS7S2400000_24.l4, (C259800zU<String>) awS7S2400000_24.s1, (String) 0));
        assembler.RQ2((TakoTemplateActivity) awS7S2400000_24.l2, new AwS603S0100000_24((List) awS7S2400000_24.l5, (List<? extends InterfaceC1594550rb3>) 319));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S2400000_24 awS7S2400000_24, Object obj) {
        Assembler assembler = (Assembler) obj;
        TakoTemplateActivity takoTemplateActivity = (TakoTemplateActivity) awS7S2400000_24.l2;
        assembler.FQ2(takoTemplateActivity, new AwS10S2300000_24(takoTemplateActivity, (TakoTemplateActivity) awS7S2400000_24.l3, (C259800zU<String>) awS7S2400000_24.s0, (String) awS7S2400000_24.l4, (C259800zU<String>) awS7S2400000_24.s1, (String) 1));
        TakoTemplateActivity takoTemplateActivity2 = (TakoTemplateActivity) awS7S2400000_24.l2;
        assembler.RQ2(takoTemplateActivity2, new AwS390S0200000_24((List) awS7S2400000_24.l5, (List<TakoAITemplates>) takoTemplateActivity2, (TakoTemplateActivity) 43));
        TakoTemplateActivity takoTemplateActivity3 = (TakoTemplateActivity) awS7S2400000_24.l2;
        assembler.RQ2(takoTemplateActivity3, new AwS603S0100000_24(takoTemplateActivity3, 320));
        TakoTemplateActivity takoTemplateActivity4 = (TakoTemplateActivity) awS7S2400000_24.l2;
        assembler.RQ2(takoTemplateActivity4, new AwS603S0100000_24(takoTemplateActivity4, 321));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S2400000_24(TakoTemplateActivity takoTemplateActivity, TakoTemplateActivity takoTemplateActivity2, C259800zU<String> c259800zU, String str, C259800zU<String> c259800zU2, String str2, List<TakoAITemplates> list) {
        super(1);
        this.$t = list;
        this.l2 = takoTemplateActivity;
        this.l3 = takoTemplateActivity2;
        this.s0 = c259800zU;
        this.l4 = str;
        this.s1 = c259800zU2;
        this.l5 = str2;
    }
}
