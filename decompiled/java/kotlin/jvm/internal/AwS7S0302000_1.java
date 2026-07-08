package kotlin.jvm.internal;

import X.C09AY;
import X.C1018303yX;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LP;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS7S0302000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS7S0302000_1 awS7S0302000_1, Object obj) {
        String str;
        String str2;
        ButtonAction buttonAction;
        String str3;
        ButtonAction buttonAction2;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        ButtonAction buttonAction3 = null;
        String str4 = "";
        if (C13LP.LJJJLL((List) awS7S0302000_1.l0) != null) {
            DialogButton dialogButton = (DialogButton) C13LP.LJJJLL((List) awS7S0302000_1.l0);
            if (dialogButton == null || (str3 = dialogButton.text) == null) {
                str3 = "";
            }
            Context context = ((C1397580mTM) awS7S0302000_1.l1).LIZ;
            DialogButton dialogButton2 = (DialogButton) C13LP.LJJJLL((List) awS7S0302000_1.l0);
            if (dialogButton2 != null) {
                buttonAction2 = dialogButton2.buttonAction;
            } else {
                buttonAction2 = null;
            }
            c1397620mTQ.LIZJ(0, str3, new C1018303yX(context, buttonAction2, awS7S0302000_1.i3, (Map) awS7S0302000_1.l2));
        }
        if (C13LP.LJJJLZIJ(1, (List) awS7S0302000_1.l0) != null) {
            DialogButton dialogButton3 = (DialogButton) C13LP.LJJJLZIJ(1, (List) awS7S0302000_1.l0);
            if (dialogButton3 == null || (str2 = dialogButton3.text) == null) {
                str2 = "";
            }
            Context context2 = ((C1397580mTM) awS7S0302000_1.l1).LIZ;
            DialogButton dialogButton4 = (DialogButton) C13LP.LJJJLZIJ(1, (List) awS7S0302000_1.l0);
            if (dialogButton4 != null) {
                buttonAction = dialogButton4.buttonAction;
            } else {
                buttonAction = null;
            }
            c1397620mTQ.LIZJ(1, str2, new C1018303yX(context2, buttonAction, awS7S0302000_1.i3, (Map) awS7S0302000_1.l2));
        }
        if (C13LP.LJJJLZIJ(2, (List) awS7S0302000_1.l0) != null) {
            DialogButton dialogButton5 = (DialogButton) C13LP.LJJJLZIJ(2, (List) awS7S0302000_1.l0);
            if (dialogButton5 != null && (str = dialogButton5.text) != null) {
                str4 = str;
            }
            Context context3 = ((C1397580mTM) awS7S0302000_1.l1).LIZ;
            DialogButton dialogButton6 = (DialogButton) C13LP.LJJJLZIJ(2, (List) awS7S0302000_1.l0);
            if (dialogButton6 != null) {
                buttonAction3 = dialogButton6.buttonAction;
            }
            c1397620mTQ.LIZJ(2, str4, new C1018303yX(context3, buttonAction3, awS7S0302000_1.i3, (Map) awS7S0302000_1.l2));
        }
        if (awS7S0302000_1.i4 == 1) {
            c1397620mTQ.LJFF = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS7S0302000_1 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0302000_1.invoke$1(kotlin.jvm.internal.AwS7S0302000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0302000_1(SeaSkuSpecViewModel seaSkuSpecViewModel, SeaSkuSpecViewModel seaSkuSpecViewModel2, int i, List<SaleProp> list, Image image, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = seaSkuSpecViewModel;
        this.i3 = seaSkuSpecViewModel2;
        this.l1 = i;
        this.l2 = list;
        this.i4 = image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0302000_1(List list, List<DialogButton> list2, C1397580mTM c1397580mTM, int i, Map<String, ? extends Object> map, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.l1 = list2;
        this.i3 = c1397580mTM;
        this.l2 = i;
        this.i4 = map;
    }
}
