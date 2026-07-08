package kotlin.jvm.internal;

import X.C09AY;
import X.C0GV1;
import X.C0GV4;
import X.C13LC;
import X.C1858660yT2;
import X.C1863850ybP;
import X.C631370Opb;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.SearchTakoSugCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS28S1201000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S1201000_10 awS28S1201000_10) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbilityZp = ((TakoAnswerBaseAssem) awS28S1201000_10.l1).zp();
        String str = null;
        if (iTakoContextAbilityZp != null && (c13lcT71 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str = c1863850ybP.LLILZIL;
        }
        C0GV4.LIZ = new C0GV1(str, ((C1858660yT2) C631370Opb.LIZ((TakoAnswerBaseAssem) awS28S1201000_10.l1)).LL.LLILLL.uuid, awS28S1201000_10.s0, awS28S1201000_10.i3);
        ((View) awS28S1201000_10.l2).postInvalidate();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S1201000_10 awS28S1201000_10) {
        Map map;
        String str;
        String str2;
        SearchTakoSugCardAssem searchTakoSugCardAssem = (SearchTakoSugCardAssem) awS28S1201000_10.l1;
        String str3 = awS28S1201000_10.s0;
        int i = awS28S1201000_10.i3;
        List list = (List) awS28S1201000_10.l2;
        String str4 = null;
        if (list != null) {
            map = (Map) ListProtector.get(list, i);
        } else {
            map = null;
        }
        if (!searchTakoSugCardAssem.LLJLL) {
            str = "click_recommend_word";
            str2 = null;
        } else {
            str = "click_ask_card";
            str4 = "send_text_msg";
            str2 = "recommend_word";
        }
        searchTakoSugCardAssem.up(str3, str, str4, str2, map, true);
        if (searchTakoSugCardAssem.LLJLL) {
            searchTakoSugCardAssem.yp();
        } else {
            searchTakoSugCardAssem.Bp();
        }
        searchTakoSugCardAssem.Ap(Integer.valueOf(i), "click_recommend_word", str3, map, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S1201000_10 awS28S1201000_10) {
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = (AbstractSearchIntermediateFragmentNew) awS28S1201000_10.l1;
        SearchSugEntity searchSugEntity = (SearchSugEntity) awS28S1201000_10.l2;
        String str = awS28S1201000_10.s0;
        int i = awS28S1201000_10.i3;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AbstractSearchIntermediateFragmentNew.LLJLLL;
        abstractSearchIntermediateFragmentNew.oS(i, searchSugEntity, str, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1201000_10(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, SearchSugEntity searchSugEntity, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = abstractSearchIntermediateFragmentNew;
        this.l2 = searchSugEntity;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S1201000_10(SearchTakoSugCardAssem searchTakoSugCardAssem, SearchTakoSugCardAssem searchTakoSugCardAssem2, String str, int i, List<? extends Map<String, String>> list) {
        super(0);
        this.$t = list;
        this.l1 = searchTakoSugCardAssem;
        this.s0 = searchTakoSugCardAssem2;
        this.i3 = str;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S1201000_10(TakoAnswerBaseAssem takoAnswerBaseAssem, TakoAnswerBaseAssem<C1858660yT2> takoAnswerBaseAssem2, String str, int i, View view) {
        super(0);
        this.$t = view;
        this.l1 = takoAnswerBaseAssem;
        this.s0 = takoAnswerBaseAssem2;
        this.i3 = str;
        this.l2 = i;
    }
}
