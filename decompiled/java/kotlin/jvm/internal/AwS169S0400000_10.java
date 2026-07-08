package kotlin.jvm.internal;

import X.C09AY;
import X.C0PDT;
import X.C0PDV;
import X.C0PN8;
import X.C0Q9J;
import X.C0QWU;
import X.C0QWW;
import X.C418440Gaw;
import X.C643420PLo;
import X.C670090QQd;
import X.C671660QWe;
import X.C683220Qr2;
import X.C684120QsU;
import X.C685650Qux;
import X.C685660Quy;
import X.C814420VxA;
import X.InterfaceC643430PLp;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS169S0400000_10 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        FeedbackMultipleChoice feedbackMultipleChoice = (FeedbackMultipleChoice) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = C0Q9J.LIZ;
        View view = (View) awS169S0400000_10.l0;
        SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = (SearchFeedbackOptionalFragment) awS169S0400000_10.l1;
        C683220Qr2 c683220Qr2 = (C683220Qr2) awS169S0400000_10.l2;
        C684120QsU.LIZ(view, searchFeedbackOptionalFragment, c683220Qr2, feedbackMultipleChoice, iIntValue, true, new AwS219S0300000_10((Function2) awS169S0400000_10.l3, (Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit>) c683220Qr2, (C683220Qr2) feedbackMultipleChoice, (FeedbackMultipleChoice) 6));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        boolean z;
        String aid;
        C0PDV c0pdv;
        Aweme awemeLIZLLL;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null && dynamicPatch.getOriginType() == ((C643420PLo) awS169S0400000_10.l0).LIZ) {
            z = true;
            ((InterfaceC643430PLp) awS169S0400000_10.l1).FJ();
            C0PDT c0pdt = (C0PDT) awS169S0400000_10.l2;
            C0PN8 c0pn8 = (C0PN8) awS169S0400000_10.l3;
            if (c0pn8 != null && (c0pdv = c0pn8.LLJJJJLIIL) != null && (awemeLIZLLL = c0pdv.LIZLLL(searchMixFeed)) != null) {
                aid = awemeLIZLLL.getAid();
            } else {
                aid = null;
            }
            c0pdt.q1(aid);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        C685660Quy.LJFF((View) awS169S0400000_10.l1, (JSONObject) awS169S0400000_10.l2);
        ((C685660Quy) awS169S0400000_10.l0).LJI(((BaseBridgeMethod) awS169S0400000_10.l3).contextProviderFactory.LIZIZ, (C683220Qr2) obj, (FeedbackMultipleChoice) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        C685650Qux.LJFF((View) awS169S0400000_10.l1, (JSONObject) awS169S0400000_10.l2);
        ((C685650Qux) awS169S0400000_10.l0).LJI(((BaseBridgeMethod) awS169S0400000_10.l3).contextProviderFactory.LIZIZ, (C683220Qr2) obj, (FeedbackMultipleChoice) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((ViewGroup) awS169S0400000_10.l0).addView(((C671660QWe) obj2).LIZ);
        C0QWU c0qwu = (C0QWU) awS169S0400000_10.l1;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        ((C0QWU) awS169S0400000_10.l1).LJIIIIZZ = ((TextView) awS169S0400000_10.l2).getPaddingEnd();
        C0QWU c0qwu2 = (C0QWU) awS169S0400000_10.l1;
        c0qwu2.LIZLLL = true;
        c0qwu2.LJ = ((TextView) awS169S0400000_10.l2).getPaddingStart();
        ((C0QWU) awS169S0400000_10.l1).LJFF = ((TextView) awS169S0400000_10.l2).getPaddingEnd() + iIntValue;
        float f = C0QWW.LIZ;
        C0QWW.LIZJ((ViewGroup) awS169S0400000_10.l0, (TextView) awS169S0400000_10.l2, (C0QWU) awS169S0400000_10.l1, (C670090QQd) awS169S0400000_10.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS169S0400000_10 awS169S0400000_10, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((ViewGroup) awS169S0400000_10.l0).addView(((C671660QWe) obj2).LIZ);
        C0QWU c0qwu = (C0QWU) awS169S0400000_10.l1;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        C0QWU c0qwu2 = (C0QWU) awS169S0400000_10.l1;
        c0qwu2.LJIIIIZZ = 0;
        c0qwu2.LIZLLL = true;
        c0qwu2.LJ = 0;
        c0qwu2.LJFF = iIntValue;
        float f = C0QWW.LIZ;
        C0QWW.LIZJ((ViewGroup) awS169S0400000_10.l0, (TextView) awS169S0400000_10.l3, c0qwu2, (C670090QQd) awS169S0400000_10.l2);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS169S0400000_10(android.view.ViewGroup r3, android.widget.TextView r4, X.C0QWU r5, X.C670090QQd r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 4 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r4
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS169S0400000_10.<init>(android.view.ViewGroup, android.widget.TextView, X.0QWU, X.0QQd, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0400000_10(C643420PLo c643420PLo, InterfaceC643430PLp interfaceC643430PLp, C0PDT c0pdt, C0PN8 c0pn8, int i) {
        super(2);
        this.$t = i;
        this.l0 = c643420PLo;
        this.l1 = interfaceC643430PLp;
        this.l2 = c0pdt;
        this.l3 = c0pn8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0400000_10(C685650Qux c685650Qux, View view, JSONObject jSONObject, BaseBridgeMethod baseBridgeMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = c685650Qux;
        this.l1 = view;
        this.l2 = jSONObject;
        this.l3 = baseBridgeMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS169S0400000_10(C685660Quy c685660Quy, View view, JSONObject jSONObject, BaseBridgeMethod baseBridgeMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = c685660Quy;
        this.l1 = view;
        this.l2 = jSONObject;
        this.l3 = baseBridgeMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS169S0400000_10(View view, View view2, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, C683220Qr2 c683220Qr2, Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = searchFeedbackOptionalFragment;
        this.l3 = c683220Qr2;
    }
}
