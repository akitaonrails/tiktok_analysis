package kotlin.jvm.internal;

import X.C03KU;
import X.C09AY;
import X.C1054104Ah;
import X.C19EG;
import X.C23271099x;
import X.C259800zU;
import X.C765002ym;
import X.C818903Hv;
import X.C948503nH;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S3500000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;
    public String s2;

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

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    public static final Object invoke$0(AwS1S3500000_1 awS1S3500000_1, Object obj) {
        String str;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        IdentityInfoOption identityInfoOption;
        String value;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = ((C818903Hv) obj).LLILLL;
        c259800zU.element = r0;
        if (r0 != 0 && (identityInfoOption = r0.getIdentityInfoOption()) != null && (value = identityInfoOption.getValue()) != null && value.length() != 0) {
            str = "edit";
        } else {
            str = "add";
        }
        Context context = (Context) awS1S3500000_1.l3;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            OspAddressViewModel ospAddressViewModel = (OspAddressViewModel) awS1S3500000_1.l4;
            C948503nH.LJI(ospAddressViewModel, C23271099x.INSTANCE, new C03KU(supportFragmentManager, (View) awS1S3500000_1.l5, c259800zU, awS1S3500000_1.s0, str, awS1S3500000_1.s1, (Boolean) awS1S3500000_1.l6, awS1S3500000_1.s2, ospAddressViewModel, (Function1) awS1S3500000_1.l7, null));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS1S3500000_1 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S3500000_1.invoke$1(kotlin.jvm.internal.AwS1S3500000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S3500000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, Map<String, ? extends Object> map, String str, C765002ym c765002ym, PdpShipping pdpShipping, PreOrderInfo preOrderInfo, String str2, String str3) {
        super(1);
        this.$t = str3;
        this.l3 = c1054104Ah;
        this.l4 = c1054104Ah2;
        this.s0 = map;
        this.l5 = str;
        this.l6 = c765002ym;
        this.l7 = pdpShipping;
        this.s1 = preOrderInfo;
        this.s2 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S3500000_1(Context context, OspAddressViewModel ospAddressViewModel, View view, String str, String str2, Boolean bool, String str3, AwS367S0200000_1 awS367S0200000_1, int i) {
        super(1);
        this.$t = i;
        this.l3 = context;
        this.l4 = ospAddressViewModel;
        this.l5 = view;
        this.s0 = str;
        this.s1 = str2;
        this.l6 = bool;
        this.s2 = str3;
        this.l7 = awS367S0200000_1;
    }
}
