package kotlin.jvm.internal;

import X.C09AY;
import X.C1863340yaa;
import X.C718360SFu;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpRequestInfo;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS113S1200000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS113S1200000_30 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData r4 = (com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData) r4
            java.lang.String r0 = r3.s0
            r4.setInputTextContent(r0)
            java.lang.Object r0 = r3.l1
            java.util.List r0 = (java.util.List) r0
            r4.setInputImageUrls(r0)
            java.lang.Object r0 = r3.l1
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 == 0) goto L4a
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L4a
        L1e:
            r4.setAutoOpenGallery(r1)
            java.lang.Object r0 = r3.l2
            X.0SFu r0 = (X.C718360SFu) r0
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerCustomizedInfo r0 = X.C0SH9.LIZIZ(r0)
            if (r0 == 0) goto L47
            java.util.List<com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates> r0 = r0.aiTemplates
            if (r0 == 0) goto L47
            java.lang.Object r0 = X.C1856050yOp.LIZ(r2, r0)
            com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates r0 = (com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates) r0
            if (r0 == 0) goto L47
            boolean r0 = r0.LIZIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L41:
            r4.setRequestShowKeyboard(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L41
        L4a:
            r1 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS113S1200000_30.invoke$0(kotlin.jvm.internal.AwS113S1200000_30, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS113S1200000_30 awS113S1200000_30, Object obj) {
        Map<String, String> map;
        TakoCarriedUpRequestInfo takoCarriedUpRequestInfo;
        C1863340yaa c1863340yaa = (C1863340yaa) obj;
        c1863340yaa.LIZIZ(AFwS274S0000000_30.get$arr$(283));
        c1863340yaa.LIZ(new AwS144S1100000_30((AIBotDisclaimerDialogProcessor) awS113S1200000_30.l2, awS113S1200000_30.s0, 11));
        new AwS609S0100000_30((TakoEnterParams) awS113S1200000_30.l1, 235).invoke(c1863340yaa.LIZJ);
        new AwS609S0100000_30((TakoEnterParams) awS113S1200000_30.l1, 236).invoke(c1863340yaa.LJFF);
        TakoCarriedUpData takoCarriedUpData = ((TakoEnterParams) awS113S1200000_30.l1).carriedUpData;
        if (takoCarriedUpData != null && (takoCarriedUpRequestInfo = takoCarriedUpData.requestInfo) != null) {
            map = takoCarriedUpRequestInfo.messageParams;
        } else {
            map = null;
        }
        c1863340yaa.LJIIJ = map;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S1200000_30(TakoEnterParams takoEnterParams, AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoEnterParams;
        this.l2 = aIBotDisclaimerDialogProcessor;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS113S1200000_30(String str, String str2, List<? extends List<String>> list, C718360SFu c718360SFu) {
        super(1);
        this.$t = c718360SFu;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }
}
