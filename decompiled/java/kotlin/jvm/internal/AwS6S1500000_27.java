package kotlin.jvm.internal;

import X.C09AY;
import X.C0H16;
import X.C1558520qew;
import X.C1852810yJb;
import X.C1855920yOc;
import X.C1857420yR2;
import X.C1858670yT3;
import X.C1859240yTy;
import X.C1859250yTz;
import X.C1860010yVD;
import X.C1862330yYx;
import X.C1862660yZU;
import X.C1862950yZx;
import X.C1863340yaa;
import X.C19723912Ez;
import X.C20227614Cs;
import X.C2097608Jq;
import X.C259800zU;
import X.C298860BnY;
import X.C419910GdJ;
import X.EnumC1857430yR3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1859220yTw;
import X.InterfaceC1859630yUb;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpRequestInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.processor.TakoSearchCarryProcessor;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotEnterProcessor;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS6S1500000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S1500000_27 awS6S1500000_27, Object obj) {
        InterfaceC1587906Jp interfaceC1587906JpLIZLLL;
        C1859240yTy c1859240yTy = (C1859240yTy) obj;
        c1859240yTy.LIZ = (View) awS6S1500000_27.l1;
        TakoPlaceholderSource takoPlaceholderSource = (TakoPlaceholderSource) awS6S1500000_27.l2;
        String str = awS6S1500000_27.s0;
        TakoNewMarkdownAssem takoNewMarkdownAssem = (TakoNewMarkdownAssem) awS6S1500000_27.l3;
        FrameLayout frameLayout = takoNewMarkdownAssem.LLJZIJLIL;
        TakoCardAbility takoCardAbilitySp = takoNewMarkdownAssem.sp();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) awS6S1500000_27.l4;
        int iLIZ = C0H16.LIZ(spannableStringBuilder, spannableStringBuilder.getSpanStart((InterfaceC1859630yUb) awS6S1500000_27.l5));
        InterfaceC1859220yTw interfaceC1859220yTwLJ = C1859250yTz.LJ(((InterfaceC1859630yUb) awS6S1500000_27.l5).getDataType());
        Function0<ReusedUIAssem<?>> function0LJI = null;
        if (interfaceC1859220yTwLJ != null) {
            interfaceC1587906JpLIZLLL = interfaceC1859220yTwLJ.LIZLLL(takoPlaceholderSource, str, frameLayout, takoCardAbilitySp, iLIZ);
        } else {
            interfaceC1587906JpLIZLLL = null;
        }
        c1859240yTy.LIZJ = interfaceC1587906JpLIZLLL;
        InterfaceC1859220yTw interfaceC1859220yTwLJ2 = C1859250yTz.LJ(((InterfaceC1859630yUb) awS6S1500000_27.l5).getDataType());
        if (interfaceC1859220yTwLJ2 != null) {
            function0LJI = interfaceC1859220yTwLJ2.LJI(interfaceC1587906JpLIZLLL);
        }
        c1859240yTy.LIZIZ = function0LJI;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS6S1500000_27 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS6S1500000_27.invoke$1(kotlin.jvm.internal.AwS6S1500000_27, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS6S1500000_27 awS6S1500000_27, Object obj) {
        Map<String, String> mapLJ;
        String str;
        Integer numValueOf;
        String strNZ0;
        Map<String, String> mapLJ2;
        String strNZ02;
        View view = (View) obj;
        ((TakoChatUIAbility) awS6S1500000_27.l1).iS1(false);
        Context context = ((View) awS6S1500000_27.l2).getContext();
        ArrayList arrayList = new ArrayList();
        Message message = (Message) awS6S1500000_27.l3;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS6S1500000_27.l5;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        arrayList.add(C1857420yR2.LIZ(new AwS29S1400000_27(interfaceC665370Q7z, (InterfaceC665370Q7z) message, (Message) view.getContext(), (Context) C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), (List<Message>) "extended_panel", (String) 5)));
        C1857420yR2.LJIIL(arrayList, view, message, interfaceC665370Q7z, false, "extended_panel", 8);
        new C1860010yVD(context, null, (Message) awS6S1500000_27.l3, (RecyclerView) awS6S1500000_27.l4, false, arrayList, new AwS571S0100000_27((TakoChatUIAbility) awS6S1500000_27.l1, 1226), null, true, true, Integer.valueOf(R.style.agm), 130).LIZIZ(view);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1500000_27.l5, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Message message2 = (Message) awS6S1500000_27.l3;
        String str2 = message2.uuid;
        String str3 = message2.subSessionId;
        Long lValueOf = Long.valueOf(message2.actionId);
        Long lValueOf2 = Long.valueOf(((Message) awS6S1500000_27.l3).botId);
        String strLIZIZ = C1855920yOc.LIZIZ((Message) awS6S1500000_27.l3);
        String str4 = awS6S1500000_27.s0;
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS6S1500000_27.l3).ext.activeAiImageSubBar));
        Integer numValueOf2 = null;
        Message message3 = (Message) awS6S1500000_27.l3;
        String str5 = "multi_answer";
        if (message3.isMultiAnswer) {
            str = "multi_answer";
            numValueOf = Integer.valueOf(message3.selectedAnswerIndex + 1);
        } else {
            str = "default";
            numValueOf = null;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1500000_27.l5, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) awS6S1500000_27.l5;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str2, str3, lValueOf, lValueOf2, "more", strLIZIZ, str4, strLIZLLL, null, null, null, str, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z2), 69120);
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1500000_27.l5, ITakoContextAbility.class, null);
        if (iTakoContextAbility2 == null || (mapLJ2 = iTakoContextAbility2.getCommonParams()) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        Message message4 = (Message) awS6S1500000_27.l3;
        String str6 = message4.uuid;
        String str7 = message4.subSessionId;
        long j = message4.actionId;
        long j2 = message4.botId;
        String strLIZIZ2 = C1855920yOc.LIZIZ(message4);
        String strLIZLLL2 = C1852810yJb.LIZLLL(Integer.valueOf(((Message) awS6S1500000_27.l3).ext.activeAiImageSubBar));
        String strLJJI = C1857420yR2.LJJI((Message) awS6S1500000_27.l3);
        Message message5 = (Message) awS6S1500000_27.l3;
        if (!message5.isMultiAnswer) {
            str5 = "default";
        } else {
            numValueOf2 = Integer.valueOf(message5.selectedAnswerIndex + 1);
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility2 = (ITakoScreenTypeAbility) C1558520qew.LIZ((InterfaceC665370Q7z) awS6S1500000_27.l5, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility2 == null || (strNZ02 = iTakoScreenTypeAbility2.nZ0()) == null) {
            strNZ02 = "full_screen";
        }
        C1862330yYx.LJJLL(c1862330yYx, mapLJ2, str6, str7, Long.valueOf(j), Long.valueOf(j2), strLIZIZ2, strLIZLLL2, strLJJI, str5, numValueOf2, "tako", strNZ02, "extended_panel", C1862950yZx.LIZJ((InterfaceC665370Q7z) awS6S1500000_27.l5), 16384);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S1500000_27 awS6S1500000_27, Object obj) {
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZ = EnumC1857430yR3.MORE;
        c19723912Ez.LIZJ = Integer.valueOf(R.string.loy);
        c19723912Ez.LIZLLL = R.attr.a1i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1i);
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS6S1500000_27((TakoChatUIAbility) awS6S1500000_27.l1, (View) awS6S1500000_27.l2, (Message) awS6S1500000_27.l3, (RecyclerView) awS6S1500000_27.l4, (InterfaceC665370Q7z) awS6S1500000_27.l5, awS6S1500000_27.s0, 2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS6S1500000_27 awS6S1500000_27, Object obj) {
        int i;
        Map<String, String> map;
        TakoCarriedUpRequestInfo takoCarriedUpRequestInfo;
        C1863340yaa c1863340yaa = (C1863340yaa) obj;
        new AwS609S0100000_30((C1862660yZU) awS6S1500000_27.l3, 237).invoke(c1863340yaa.LJ);
        c1863340yaa.LIZ(new AwS141S1100000_27((TakoActiveBotItem) awS6S1500000_27.l4, awS6S1500000_27.s0, 19));
        new AwS236S0300000_27((AIBotEnterProcessor) awS6S1500000_27.l1, (TakoEnterParams) awS6S1500000_27.l2, (IMessageAbility) awS6S1500000_27.l5, 33).invoke(c1863340yaa.LIZIZ);
        new AwS609S0100000_30((TakoEnterParams) awS6S1500000_27.l2, 238).invoke(c1863340yaa.LIZJ);
        new AwS609S0100000_30((TakoEnterParams) awS6S1500000_27.l2, 239).invoke(c1863340yaa.LJFF);
        AFwS274S0000000_30.get$arr$(284).invoke(c1863340yaa.LIZLLL);
        new AwS609S0100000_30((TakoActiveBotItem) awS6S1500000_27.l4, 240).invoke(c1863340yaa.LJIIIZ);
        AIBotEnterProcessor aIBotEnterProcessor = (AIBotEnterProcessor) awS6S1500000_27.l1;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS6S1500000_27.l2;
        aIBotEnterProcessor.getClass();
        if (C298860BnY.LIZ() && !C20227614Cs.LIZLLL(takoEnterParams) && !Intrinsics.LJFF(takoEnterParams.enterFrom, "general_search_tikbot")) {
            i = 5;
        } else {
            i = 7;
        }
        c1863340yaa.LJII = Integer.valueOf(i);
        TakoCarriedUpData takoCarriedUpData = ((TakoEnterParams) awS6S1500000_27.l2).carriedUpData;
        if (takoCarriedUpData != null && (takoCarriedUpRequestInfo = takoCarriedUpData.requestInfo) != null) {
            map = takoCarriedUpRequestInfo.messageParams;
        } else {
            map = null;
        }
        c1863340yaa.LJIIJ = map;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1500000_27(TakoChatUIAbility takoChatUIAbility, View view, Message message, RecyclerView recyclerView, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoChatUIAbility;
        this.l2 = view;
        this.l3 = message;
        this.l4 = recyclerView;
        this.l5 = interfaceC665370Q7z;
        this.s0 = "exposed_button";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1500000_27(View view, TakoPlaceholderSource takoPlaceholderSource, String str, TakoNewMarkdownAssem takoNewMarkdownAssem, SpannableStringBuilder spannableStringBuilder, InterfaceC1859630yUb interfaceC1859630yUb, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.l2 = takoPlaceholderSource;
        this.s0 = str;
        this.l3 = takoNewMarkdownAssem;
        this.l4 = spannableStringBuilder;
        this.l5 = interfaceC1859630yUb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S1500000_27(TakoEnterParams takoEnterParams, TakoEnterParams takoEnterParams2, C259800zU<String> c259800zU, TakoMixFeed takoMixFeed, TakoSearchCarryProcessor takoSearchCarryProcessor, C1862660yZU c1862660yZU, String str) {
        super(1);
        this.$t = str;
        this.l1 = takoEnterParams;
        this.l2 = takoEnterParams2;
        this.l3 = c259800zU;
        this.l4 = takoMixFeed;
        this.l5 = takoSearchCarryProcessor;
        this.s0 = c1862660yZU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1500000_27(AIBotEnterProcessor aIBotEnterProcessor, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, TakoActiveBotItem takoActiveBotItem, String str, IMessageAbility iMessageAbility, int i) {
        super(1);
        this.$t = i;
        this.l1 = aIBotEnterProcessor;
        this.l2 = takoEnterParams;
        this.l3 = c1862660yZU;
        this.l4 = takoActiveBotItem;
        this.s0 = str;
        this.l5 = iMessageAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1500000_27(TakoChatUIAbility takoChatUIAbility, View view, Message message, RecyclerView recyclerView, InterfaceC665370Q7z interfaceC665370Q7z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoChatUIAbility;
        this.l2 = view;
        this.l3 = message;
        this.l4 = recyclerView;
        this.l5 = interfaceC665370Q7z;
        this.s0 = str;
    }
}
