package kotlin.jvm.internal;

import X.AbstractC1375550ltp;
import X.C09AY;
import X.C1354540lLw;
import X.C1354580lM0;
import X.C1355130lMt;
import X.C1371430lnB;
import X.C259800zU;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS299S0300000_21 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS299S0300000_21 awS299S0300000_21, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ((InterfaceC1369790lkX) awS299S0300000_21.l0).LJJIFFI((C1371430lnB) ((C259800zU) awS299S0300000_21.l1).element, (Context) awS299S0300000_21.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS299S0300000_21 awS299S0300000_21, Object obj, Object obj2) {
        AbstractC1375550ltp abstractC1375550ltp = (AbstractC1375550ltp) obj;
        if (((Boolean) obj2).booleanValue()) {
            C1355130lMt c1355130lMt = ((ShareInviteContentVM) awS299S0300000_21.l0).LLILZIL;
            if (c1355130lMt == null) {
                c1355130lMt = null;
            }
            c1355130lMt.LIZIZ(((InterfaceC1369790lkX) awS299S0300000_21.l1).key());
            ((InterfaceC1369790lkX) awS299S0300000_21.l1).LJJIIJ(abstractC1375550ltp, (Context) awS299S0300000_21.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS299S0300000_21 awS299S0300000_21, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        C1354540lLw c1354540lLw = (C1354540lLw) awS299S0300000_21.l0;
        C1354580lM0 c1354580lM0 = (C1354580lM0) awS299S0300000_21.l1;
        c1354580lM0.getClass();
        c1354580lM0.LJI = (Bitmap) obj;
        c1354540lLw.LIZIZ(c1354580lM0, (Function0) awS299S0300000_21.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS299S0300000_21(C1354540lLw c1354540lLw, C1354540lLw c1354540lLw2, C1354580lM0 c1354580lM0, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c1354540lLw;
        this.l1 = c1354540lLw2;
        this.l2 = c1354580lM0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS299S0300000_21(InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1369790lkX interfaceC1369790lkX2, C259800zU<C1371430lnB> c259800zU, Context context) {
        super(2);
        this.$t = context;
        this.l0 = interfaceC1369790lkX;
        this.l1 = interfaceC1369790lkX2;
        this.l2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS299S0300000_21(ShareInviteContentVM shareInviteContentVM, InterfaceC1369790lkX interfaceC1369790lkX, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = shareInviteContentVM;
        this.l1 = interfaceC1369790lkX;
        this.l2 = context;
    }
}
