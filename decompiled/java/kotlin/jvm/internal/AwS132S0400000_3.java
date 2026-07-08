package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C09I6;
import X.C0WZX;
import X.C1066680dre;
import X.C118300cf;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1621190sI1;
import X.C1701330uNH;
import X.C189200o6;
import X.C20145713s7;
import X.C2204961BRm;
import X.C2262208tg;
import X.C2262608tk;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C786410Ut5;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AwS132S0400000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS132S0400000_3 awS132S0400000_3) {
        return C23250099c.LJ(C23271099x.INSTANCE, new C2262208tg((C259800zU) awS132S0400000_3.l0, (C118300cf) awS132S0400000_3.l1, (List) awS132S0400000_3.l2, (Set) awS132S0400000_3.l3, null));
    }

    public static final Object invoke$1(AwS132S0400000_3 awS132S0400000_3) {
        if (((List) awS132S0400000_3.l0).size() == ((C118300cf) awS132S0400000_3.l1).element) {
            ((Function2) awS132S0400000_3.l2).invoke(C09I6.COMPLETE, (List) awS132S0400000_3.l3);
        } else {
            ((Function2) awS132S0400000_3.l2).invoke(C09I6.ERROR, (List) awS132S0400000_3.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS132S0400000_3 awS132S0400000_3) {
        Context context = (Context) awS132S0400000_3.l0;
        if (context != null || (context = (Context) ((WeakReference) awS132S0400000_3.l1).get()) != null) {
            C259800zU c259800zU = (C259800zU) awS132S0400000_3.l2;
            Map map = (Map) awS132S0400000_3.l3;
            String str = (String) c259800zU.element;
            try {
                C1066680dre.LIZ("open_in_browser", map);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(UriProtector.parse(str));
                intent.putExtra("pns.sandbox.dataflow_id", 1207969290);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOWvYNHA2SWLHTc4pr0lD6Ou5RblzMX6Ckr+P/OWY2g1yA==", null));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS132S0400000_3 awS132S0400000_3) {
        ClipboardManager clipboardManager;
        Context context = (Context) awS132S0400000_3.l0;
        if (context != null || (context = (Context) ((WeakReference) awS132S0400000_3.l1).get()) != null) {
            C259800zU c259800zU = (C259800zU) awS132S0400000_3.l2;
            Map map = (Map) awS132S0400000_3.l3;
            String str = (String) c259800zU.element;
            try {
                C1066680dre.LIZ("copy_link", map);
                Activity activityLIZ = C1388190mED.LIZ(context);
                Unit unit = null;
                if (activityLIZ != null) {
                    Object objF2 = C786410Ut5.F2(activityLIZ, "clipboard");
                    if ((objF2 instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) objF2) != null) {
                        C20145713s7.LIZJ(clipboardManager, ClipData.newPlainText(str, str), CertProviderManagerKt.findCert("bpea-news_anchor_iab_copy_link", 1476399146));
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx.LJII(R.attr.a1h);
                    c1389890mGx.LJIIIZ(2131829543);
                    c1389890mGx.LJIIJJI();
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S0400000_3(C259800zU c259800zU, C259800zU<List<Pair<FeatureExtraction, Integer>>> c259800zU2, C118300cf c118300cf, List<C2262608tk> list, Set<String> set) {
        super(0);
        this.$t = set;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c118300cf;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S0400000_3(Context context, Context context2, WeakReference<Context> weakReference, C259800zU<String> c259800zU, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = weakReference;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS132S0400000_3(List list, List<C1621190sI1> list2, C118300cf c118300cf, Function2<? super C09I6, ? super List<? extends VEFrame>, Unit> function2, List<VEFrame> list3) {
        super(0);
        this.$t = list3;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c118300cf;
        this.l3 = function2;
    }
}
