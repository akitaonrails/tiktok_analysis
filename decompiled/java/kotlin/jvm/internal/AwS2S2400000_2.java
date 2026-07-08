package kotlin.jvm.internal;

import X.C09AY;
import X.C1175960ghu;
import X.C13IQ;
import X.C1680206i0;
import X.C2097608Jq;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS2S2400000_2 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS2S2400000_2 awS2S2400000_2, Object obj) {
        ISocialGameService iSocialGameService;
        if (((Boolean) obj).booleanValue() && (iSocialGameService = (ISocialGameService) awS2S2400000_2.l2) != null) {
            Context context = ((View) awS2S2400000_2.l3).getContext();
            String str = awS2S2400000_2.s0;
            if (str == null) {
                str = "";
            }
            iSocialGameService.LIZIZ(context, str, ((C1680206i0) awS2S2400000_2.l4).LLILZ, (EmojiGameInfo) awS2S2400000_2.l5, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("enter_method", awS2S2400000_2.s1)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2400000_2 awS2S2400000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((UISlotAssem) awS2S2400000_2.l2, new AwS116S1100000_2((C1175960ghu) awS2S2400000_2.l3, awS2S2400000_2.s0, 7));
        UISlotAssem uISlotAssem = (UISlotAssem) awS2S2400000_2.l2;
        C13IQ c13iq = (C13IQ) awS2S2400000_2.l4;
        assembler.RQ2(uISlotAssem, new AwS87S1200000_2((FrameLayout) awS2S2400000_2.l5, awS2S2400000_2.s1, c13iq, 5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S2400000_2(UISlotAssem uISlotAssem, UISlotAssem uISlotAssem2, C1175960ghu c1175960ghu, String str, C13IQ<? extends UIAssem> c13iq, String str2, FrameLayout frameLayout) {
        super(1);
        this.$t = frameLayout;
        this.l2 = uISlotAssem;
        this.l3 = uISlotAssem2;
        this.s0 = c1175960ghu;
        this.l4 = str;
        this.s1 = c13iq;
        this.l5 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2400000_2(ISocialGameService iSocialGameService, View view, String str, C1680206i0 c1680206i0, EmojiGameInfo emojiGameInfo, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = iSocialGameService;
        this.l3 = view;
        this.s0 = str;
        this.l4 = c1680206i0;
        this.l5 = emojiGameInfo;
        this.s1 = str2;
    }
}
