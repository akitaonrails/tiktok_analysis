package kotlin.jvm.internal;

import X.C09AY;
import X.C1741890vQh;
import X.C802003Bi;
import X.C936903lP;
import X.C957403oi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS3S2102000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l2;
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

    public static final Object invoke$0(AwS3S2102000_1 awS3S2102000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZJ("fail_type", Integer.valueOf(awS3S2102000_1.i3));
        c957403oi.LIZJ("origin_rich_text", C1741890vQh.LJIIIIZZ((ECRichText) awS3S2102000_1.l2));
        String str = ((ECRichText) awS3S2102000_1.l2).template;
        if (str == null) {
            str = "";
        }
        c957403oi.LIZJ("template", str);
        c957403oi.LIZJ("argument", awS3S2102000_1.s0);
        c957403oi.LIZJ("module_info", awS3S2102000_1.s1);
        c957403oi.LIZJ("affected_degree", Integer.valueOf(awS3S2102000_1.i4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S2102000_1 awS3S2102000_1, Object obj) {
        boolean z;
        String str = ((C936903lP) obj).LLILLJJLI;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        String str2 = "";
        if (z) {
            ((SeaOneStepOrderSubmitFragment) awS3S2102000_1.l2).bS().LLLLZIL = new C802003Bi("", Integer.valueOf(awS3S2102000_1.i3));
        } else {
            OrderSubmitAssemViewModel orderSubmitAssemViewModelBS = ((SeaOneStepOrderSubmitFragment) awS3S2102000_1.l2).bS();
            String str3 = awS3S2102000_1.s0;
            int i = awS3S2102000_1.i4;
            String str4 = awS3S2102000_1.s1;
            if (str4 != null) {
                str2 = str4;
            }
            orderSubmitAssemViewModelBS.KQ2(i, str3, str2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2102000_1(int i, ECRichText eCRichText, String str, String str2, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i3 = i;
        this.l2 = eCRichText;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2102000_1(SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, String str, int i, int i2, String str2, int i3) {
        super(1);
        this.$t = i3;
        this.l2 = seaOneStepOrderSubmitFragment;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.s1 = str2;
    }
}
