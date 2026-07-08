package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0Q93;
import X.C118300cf;
import X.C259800zU;
import X.C430890Gv1;
import X.C654210PlL;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS31S0600000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS31S0600000_10 r4, java.lang.Object r5) {
        /*
            X.0QFL r5 = (X.C0QFL) r5
            java.lang.Object r0 = r4.l0
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            int r1 = r0.intValue()
        Lc:
            java.lang.Object r0 = r4.l1
            X.00cf r0 = (X.C118300cf) r0
            int r0 = r0.element
            if (r0 != r1) goto L19
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L17:
            r1 = 2
            goto Lc
        L19:
            java.lang.Object r3 = r4.l2
            X.00cf r3 = (X.C118300cf) r3
            int r1 = r3.element
            r0 = 5
            if (r1 != r0) goto L25
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L25:
            r2 = 1
            int r0 = r1 + 1
            r3.element = r0
            X.0Vlm r0 = r5.getPageInfo()
            java.lang.String r0 = r0.LIZIZ
            java.lang.String r1 = X.C0QFO.LIZIZ(r0)
            java.lang.Object r0 = r4.l3
            com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService r0 = (com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService) r0
            X.01GW r0 = r0.LJIJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 != 0) goto L54
            java.lang.ref.WeakReference r0 = r5.getHost()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r0.get()
        L50:
            boolean r0 = r0 instanceof X.C0QFS
            if (r0 == 0) goto L9b
        L54:
            java.lang.Object r0 = r4.l3
            com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService r0 = (com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService) r0
            X.01GW r0 = r0.LJIJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 == 0) goto L91
            java.lang.Object r0 = r4.l4
            X.013C r0 = (X.C013C) r0
            r0.element = r2
            X.0QFM r0 = X.C0QFM.LIZ
            r0.getClass()
            X.0QFQ r0 = X.C0QFM.LIZ(r5)
            if (r0 == 0) goto L8c
            X.0QFR r0 = r0.LL
            if (r0 == 0) goto L8c
            X.01GW r0 = r0.LIZ
            java.lang.Object r1 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L8c
            java.lang.Object r0 = r4.l5
            java.util.Map r0 = (java.util.Map) r0
            r0.putAll(r1)
        L8c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L91:
            java.lang.Object r1 = r4.l1
            X.00cf r1 = (X.C118300cf) r1
            int r0 = r1.element
            int r0 = r0 + 1
            r1.element = r0
        L9b:
            r2 = 0
            goto L8c
        L9d:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS31S0600000_10.invoke$0(kotlin.jvm.internal.AwS31S0600000_10, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS31S0600000_10 awS31S0600000_10, Object obj) {
        SubFilterOptionStruct subFilterOptionStruct = (SubFilterOptionStruct) awS31S0600000_10.l0;
        SubFilterOptionStruct subFilterOptionStruct2 = (SubFilterOptionStruct) awS31S0600000_10.l1;
        SubFilterOptionStruct subFilterOptionStruct3 = (SubFilterOptionStruct) awS31S0600000_10.l2;
        SubFilterOptionStruct subFilterOptionStruct4 = (SubFilterOptionStruct) awS31S0600000_10.l3;
        SubFilterOptionStruct subFilterOptionStruct5 = (SubFilterOptionStruct) awS31S0600000_10.l4;
        SubFilterOptionStruct subFilterOptionStruct6 = (SubFilterOptionStruct) awS31S0600000_10.l5;
        obj.getClass();
        return new C0Q93(subFilterOptionStruct, subFilterOptionStruct2, subFilterOptionStruct3, subFilterOptionStruct4, subFilterOptionStruct5, subFilterOptionStruct6, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$2(kotlin.jvm.internal.AwS31S0600000_10 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS31S0600000_10.invoke$2(kotlin.jvm.internal.AwS31S0600000_10, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S0600000_10(Context context, Context context2, View view, C654210PlL c654210PlL, C430890Gv1 c430890Gv1, TuxIconView tuxIconView, C259800zU<EntityCardTitle> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = view;
        this.l3 = c654210PlL;
        this.l4 = c430890Gv1;
        this.l5 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0600000_10(SubFilterOptionStruct subFilterOptionStruct, SubFilterOptionStruct subFilterOptionStruct2, SubFilterOptionStruct subFilterOptionStruct3, SubFilterOptionStruct subFilterOptionStruct4, SubFilterOptionStruct subFilterOptionStruct5, SubFilterOptionStruct subFilterOptionStruct6, int i) {
        super(1);
        this.$t = i;
        this.l0 = subFilterOptionStruct;
        this.l1 = subFilterOptionStruct2;
        this.l2 = subFilterOptionStruct3;
        this.l3 = subFilterOptionStruct4;
        this.l4 = subFilterOptionStruct5;
        this.l5 = subFilterOptionStruct6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S0600000_10(Integer num, Integer num2, C118300cf c118300cf, C118300cf c118300cf2, AbsSearchService absSearchService, C013C c013c, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = c118300cf;
        this.l3 = c118300cf2;
        this.l4 = absSearchService;
        this.l5 = c013c;
    }
}
