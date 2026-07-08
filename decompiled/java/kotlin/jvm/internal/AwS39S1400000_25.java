package kotlin.jvm.internal;

import X.AbstractC1291220jho;
import X.C09AY;
import X.C0TU5;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1324750kZt;
import X.C13MA;
import X.C1686700tzg;
import X.C1686720tzi;
import X.C259800zU;
import X.EnumC1671200tag;
import X.InterfaceC1330440kj4;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.sticker.repository.internals.HorizontalEffectsFetcher;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.trill.feedback.api.FaqSubCategoryItem;
import com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lnn.l;

/* JADX INFO: loaded from: classes26.dex */
public class AwS39S1400000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S1400000_25 awS39S1400000_25) {
        String str;
        C0TU5 c0tu5 = C0TU5.LIZ;
        String str2 = ((FaqSubCategoryItem) awS39S1400000_25.l1).faqId;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = awS39S1400000_25.s0;
        if (Intrinsics.LJFF(((Function0) awS39S1400000_25.l2).invoke(), awS39S1400000_25.s0)) {
            str = "fold";
        } else {
            str = "unfold";
        }
        C0TU5.LIZLLL(c0tu5, str2, null, "faq_topic_category", "faq_topic_list", str3, str, 2);
        if (((FaqSubCategoryItem) awS39S1400000_25.l1).children == null || !(!r0.isEmpty())) {
            ((CSPComposeViewModel) awS39S1400000_25.l3).wQ2((FaqSubCategoryItem) awS39S1400000_25.l1, (Context) awS39S1400000_25.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S1400000_25 awS39S1400000_25) {
        HorizontalEffectsFetcher horizontalEffectsFetcher = (HorizontalEffectsFetcher) awS39S1400000_25.l1;
        horizontalEffectsFetcher.effectPlatform.LJJIJLIJ(horizontalEffectsFetcher.panel);
        ((HorizontalEffectsFetcher) awS39S1400000_25.l1).effectPlatform.LJJIIJZLJL((Map) awS39S1400000_25.l2, (C13MA) awS39S1400000_25.l3, false, awS39S1400000_25.s0, ((HorizontalEffectsFetcherRequest) awS39S1400000_25.l4).whitelistScene);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S1400000_25 awS39S1400000_25) {
        ((HorizontalEffectsFetcher) awS39S1400000_25.l1).effectPlatform.LJJIIJZLJL((Map) awS39S1400000_25.l2, (C13MA) awS39S1400000_25.l3, true, awS39S1400000_25.s0, ((HorizontalEffectsFetcherRequest) awS39S1400000_25.l4).whitelistScene);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS39S1400000_25 awS39S1400000_25) {
        AbstractC1291220jho abstractC1291220jho;
        C1322110kVd c1322110kVd = (C1322110kVd) awS39S1400000_25.l1;
        List list = (List) awS39S1400000_25.l2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        l lVar = (l) awS39S1400000_25.l3;
        if (lVar.LLILLL) {
            abstractC1291220jho = (AbstractC1291220jho) lVar.LLJJI.getValue();
        } else {
            abstractC1291220jho = null;
        }
        C1324750kZt.LJIILIIL(c1322110kVd, list, -1, -1, config, abstractC1291220jho, null, (C1320700kTM) ((C259800zU) awS39S1400000_25.l4).element, awS39S1400000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS39S1400000_25 awS39S1400000_25) {
        ((C1686700tzg) awS39S1400000_25.l1).LJIIJJI((Function0) awS39S1400000_25.l2, (C1686720tzi) awS39S1400000_25.l3, awS39S1400000_25.s0, (EnumC1671200tag) awS39S1400000_25.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S1400000_25(C1322110kVd c1322110kVd, C1322110kVd c1322110kVd2, List<String> list, l lVar, C259800zU<C1320700kTM<InterfaceC1330440kj4>> c259800zU, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1322110kVd;
        this.l2 = c1322110kVd2;
        this.l3 = list;
        this.l4 = lVar;
        this.s0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S1400000_25(C1686700tzg c1686700tzg, C1686700tzg c1686700tzg2, Function0<Unit> function0, C1686720tzi c1686720tzi, String str, EnumC1671200tag enumC1671200tag) {
        super(0);
        this.$t = enumC1671200tag;
        this.l1 = c1686700tzg;
        this.l2 = c1686700tzg2;
        this.l3 = function0;
        this.s0 = c1686720tzi;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S1400000_25(HorizontalEffectsFetcher horizontalEffectsFetcher, HorizontalEffectsFetcher horizontalEffectsFetcher2, Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest) {
        super(0);
        this.$t = horizontalEffectsFetcherRequest;
        this.l1 = horizontalEffectsFetcher;
        this.l2 = horizontalEffectsFetcher2;
        this.l3 = map;
        this.s0 = c13ma;
        this.l4 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S1400000_25(FaqSubCategoryItem faqSubCategoryItem, FaqSubCategoryItem faqSubCategoryItem2, String str, Function0<String> function0, CSPComposeViewModel cSPComposeViewModel, Context context) {
        super(0);
        this.$t = context;
        this.l1 = faqSubCategoryItem;
        this.s0 = faqSubCategoryItem2;
        this.l2 = str;
        this.l3 = function0;
        this.l4 = cSPComposeViewModel;
    }
}
