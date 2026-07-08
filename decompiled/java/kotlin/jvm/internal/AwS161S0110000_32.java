package kotlin.jvm.internal;

import X.AbstractC1537870q7d;
import X.AbstractC21154217qO;
import X.C09AY;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1537830q7Z;
import X.C1537910q7h;
import X.C1538140q84;
import X.C1538590q8n;
import X.C1741560vQA;
import X.C2097608Jq;
import X.C21208817zC;
import X.EnumC1067640dtC;
import X.InterfaceC1531560pxS;
import X.InterfaceC1541990qEH;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AwS161S0110000_32 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0110000_32(AbstractC21154217qO abstractC21154217qO, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC21154217qO;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0110000_32(C21208817zC c21208817zC, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c21208817zC;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS161S0110000_32 awS161S0110000_32, Object obj, Object obj2, Object obj3) {
        Integer num;
        Pair pair = (Pair) obj2;
        Map map = (Map) obj3;
        if (((Boolean) obj).booleanValue()) {
            AbstractC21154217qO abstractC21154217qO = (AbstractC21154217qO) awS161S0110000_32.l0;
            C1741560vQA c1741560vQA = abstractC21154217qO.LLILLL.LJIIIZ;
            Pair[] pairArr = new Pair[3];
            boolean z = false;
            pairArr[0] = new Pair("page_visible", Boolean.valueOf(abstractC21154217qO.LL.LIZLLL.K4()));
            pairArr[1] = new Pair("is_pending", Boolean.valueOf(awS161S0110000_32.z1));
            INativePrefetchPopupService iNativePrefetchPopupService = (INativePrefetchPopupService) PluggableExtentionKt.pluggableSpi$default(INativePrefetchPopupService.class, false, false, false, 14, null);
            if (iNativePrefetchPopupService != null && iNativePrefetchPopupService.LIZLLL()) {
                z = true;
            }
            pairArr[2] = new Pair("is_template_prefetch", Boolean.valueOf(z));
            C1741560vQA.LIZJ(c1741560vQA, "load_success", 0L, C2097608Jq.LJIIJ(pairArr), 2);
        } else {
            AbstractC21154217qO abstractC21154217qO2 = (AbstractC21154217qO) awS161S0110000_32.l0;
            String str = null;
            if (pair != null) {
                num = (Integer) pair.getFirst();
                str = (String) pair.getSecond();
            } else {
                num = null;
            }
            abstractC21154217qO2.LJIILIIL(num, "load_fail", str, map, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS161S0110000_32 awS161S0110000_32, Object obj, Object obj2, Object obj3) {
        SparkContext sparkContext;
        HybridSchemaParam hybridSchemaParam;
        C1537720q7O c1537720q7O;
        final C1537720q7O c1537720q7O2;
        C1537910q7h c1537910q7h;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 sparkContext2 = (C1537480q70) obj3;
        if (sparkContext2 == null) {
            sparkContext2 = new SparkContext();
            sparkContext2.LJJIIZ(str);
        }
        if (sparkContext2 instanceof SparkContext) {
            sparkContext = (SparkContext) sparkContext2;
        } else {
            sparkContext = null;
        }
        if (sparkContext != null) {
            boolean z = awS161S0110000_32.z1;
            C1538140q84 c1538140q84 = C1538140q84.LIZ;
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LIZLLL = false;
            c1538590q8n.LJ = false;
            c1538590q8n.LJFF = false;
            c1538590q8n.LJI = false;
            c1538590q8n.LJIIIZ = true;
            C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
            if (z) {
                sparkContext.usePreload = true;
                sparkContext.LJJJZ("enable_pending_js_task", CardStruct.IStatusCode.DEFAULT);
            } else {
                sparkContext.usePreload = true;
                sparkContext.LJJJZ("enable_pending_js_task", "1");
            }
        }
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext2.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParam = interfaceC1531560pxS.LIZJ()) == null) {
            hybridSchemaParam = new HybridSchemaParam(EnumC1067640dtC.LYNX);
        }
        C21208817zC c21208817zC = (C21208817zC) awS161S0110000_32.l0;
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext2, context, new AbstractC1537870q7d() { // from class: X.17zH
        });
        if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
        } else {
            c1537720q7O = null;
        }
        c21208817zC.LLILZ = c1537720q7O;
        final C21208817zC c21208817zC2 = (C21208817zC) awS161S0110000_32.l0;
        if (c21208817zC2.LLILLJJLI && (c1537720q7O2 = c21208817zC2.LLILZ) != null) {
            InterfaceC1531560pxS interfaceC1531560pxS2 = c1537720q7O2.getHybridContext().hybridParams;
            if ((interfaceC1531560pxS2 instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS2) != null) {
                c1537910q7h.LJJIFFI = true;
            }
            c1537720q7O2.addLynxViewClient(new LynxViewClient() { // from class: X.17wP
                public final /* synthetic */ String LLILLL = "api first";

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILJJIL() {
                    if (C770702zh.LIZ(c21208817zC2.LLIZLLLIL)) {
                        c1537720q7O2.updateData(TemplateData.LJII(C21208817zC.LIZ(c21208817zC2.LLIZLLLIL, this.LLILLL)));
                        c21208817zC2.LLIZLLLIL = null;
                    }
                }
            });
        }
        ((C21208817zC) awS161S0110000_32.l0).LIZJ();
        return ((C21208817zC) awS161S0110000_32.l0).LLILZ;
    }
}
