package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y8T;
import X.C0YMF;
import X.C0YXG;
import X.C0ZAY;
import X.C1322110kVd;
import X.C13LE;
import X.C15438062q;
import X.C1576320r7e;
import X.C451690HnT;
import X.C696620RUe;
import X.C871400YGk;
import X.C879180YeK;
import X.C889840YvW;
import X.C889910Yvd;
import X.C889930Yvf;
import X.C895240ZAc;
import X.C902920ZbW;
import X.InterfaceC859420XnY;
import X.InterfaceC871310YGb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS122S0101000_14 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        C895240ZAc c895240ZAcLIZ = C895240ZAc.LIZ((C895240ZAc) awS122S0101000_14.l0, awS122S0101000_14.i1, false, false, false, 1919);
        obj.getClass();
        return new C0ZAY(c895240ZAcLIZ);
    }

    public static final Object invoke$1(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        C889840YvW c889840YvW = (C889840YvW) obj;
        List<C889910Yvd> list = c889840YvW.LL;
        InboxFilterBarViewModel inboxFilterBarViewModel = (InboxFilterBarViewModel) awS122S0101000_14.l0;
        int i = awS122S0101000_14.i1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C889910Yvd c889910YvdLIZ : list) {
            FilterTabType filterTabType = c889910YvdLIZ.LIZ;
            inboxFilterBarViewModel.getClass();
            if (filterTabType == C889930Yvf.LIZ.LJI().getFirst()) {
                c889910YvdLIZ = C889910Yvd.LIZ(c889910YvdLIZ, null, Integer.valueOf(i), 63);
            }
            arrayList.add(c889910YvdLIZ);
        }
        return C889840YvW.LIZ(c889840YvW, arrayList, null, null, null, null, 30);
    }

    public static final Object invoke$2(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        ((C0YXG) obj).LJI(awS122S0101000_14.i1, (C0Y8T) awS122S0101000_14.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = C13LE.LIZ(IMMessagePowerListAssem.class);
        c696620RUe.LLIZLLLIL = awS122S0101000_14.i1;
        c696620RUe.LJ((C902920ZbW) awS122S0101000_14.l0, "MESSAGE_LIST_CONFIG");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        return C1576320r7e.LIZ((C1576320r7e) obj, null, false, 0L, null, ((InterfaceC859420XnY) ((TakoBotCenterViewModel) awS122S0101000_14.l0).vQ2().getOperator()).LJLLJ(awS122S0101000_14.i1), 15);
    }

    public static final Object invoke$5(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        UrlModel urlModel = (UrlModel) ListProtector.get(((C879180YeK) awS122S0101000_14.l0).LJIIIIZZ, 0);
        int i = awS122S0101000_14.i1;
        C451690HnT.LJ((C1322110kVd) obj, urlModel, "IMInnerPushShowDelegate", i, i, null, 992);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        UrlModel urlModel = (UrlModel) ListProtector.get(((C879180YeK) awS122S0101000_14.l0).LJIIIIZZ, 0);
        int i = awS122S0101000_14.i1;
        C451690HnT.LJ((C1322110kVd) obj, urlModel, "IMInnerPushShowDelegate:TYPE_AGGREGATED", i, i, null, 992);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS122S0101000_14 awS122S0101000_14, Object obj) {
        ((C0YMF) obj).LJIILLIIL(((C871400YGk) ((InterfaceC871310YGb) awS122S0101000_14.l0)).LJIIIZ, awS122S0101000_14.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[PHI: r2
      0x00d4: PHI (r2v1 float[]) = (r2v0 float[]), (r2v0 float[]), (r2v8 float[]), (r2v8 float[]), (r2v8 float[]) binds: [B:3:0x0013, B:5:0x0017, B:19:0x0057, B:21:0x005b, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS122S0101000_14 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S0101000_14.invoke$8(kotlin.jvm.internal.AwS122S0101000_14, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS122S0101000_14 r6, java.lang.Object r7) {
        /*
            X.0Yje r7 = (X.InterfaceC882480Yje) r7
            X.0YkJ r5 = r7.LIZ()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.LIZIZ
            java.lang.String r0 = "chat_response"
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof com.ugc.android.clientai.lang.response.ChatCompletionResponse
            if (r0 == 0) goto L63
            com.ugc.android.clientai.lang.response.ChatCompletionResponse r1 = (com.ugc.android.clientai.lang.response.ChatCompletionResponse) r1
            if (r1 == 0) goto L63
            java.util.List r0 = r1.getChoices()
            if (r0 == 0) goto L63
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ugc.android.clientai.lang.response.ChatCompletionResponse$Choice r0 = (com.ugc.android.clientai.lang.response.ChatCompletionResponse.Choice) r0
            if (r0 == 0) goto L63
            com.ugc.android.clientai.lang.message.Message r0 = r0.message
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.content
            if (r3 == 0) goto L63
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r1 = 0
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r3, r2, r1, r0)
            if (r0 == 0) goto L63
            java.util.List r0 = X.C13LP.LLIIII(r0)
            if (r0 == 0) goto L63
            java.lang.Object r4 = r6.l0
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L4f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L4f
            r3.add(r1)
            goto L4f
        L63:
            X.13BV r2 = X.C13BV.INSTANCE
            goto L6e
        L66:
            int r0 = r6.i1
            java.util.List r2 = X.C13LP.LL(r3, r0)
            if (r2 == 0) goto L63
        L6e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "top_emojis"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            r5.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS122S0101000_14.invoke$9(kotlin.jvm.internal.AwS122S0101000_14, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(int i, C0Y8T c0y8t, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0y8t;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(int i, C902920ZbW c902920ZbW, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c902920ZbW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0101000_14(int i, int i2, List<String> list) {
        super(1);
        this.$t = list;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(InterfaceC871310YGb interfaceC871310YGb, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC871310YGb;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(C879180YeK c879180YeK, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c879180YeK;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(C895240ZAc c895240ZAc, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c895240ZAc;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(InboxFilterBarViewModel inboxFilterBarViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = inboxFilterBarViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0101000_14(TakoBotCenterViewModel takoBotCenterViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = takoBotCenterViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S0101000_14(List list, List<String> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
