package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.C034S;
import X.C03N8;
import X.C09AY;
import X.C1120604Zw;
import X.C19EG;
import X.C1AQS;
import X.C259800zU;
import X.C897703f5;
import X.C907803gi;
import X.C914103hj;
import X.EnumC828303Ll;
import X.EnumC925903jd;
import X.EnumC989003to;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayErrorToast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S2600000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.net.Uri] */
    public static final Uri LIZ$0(String str, C259800zU c259800zU) {
        if (c259800zU.element == 0) {
            c259800zU.element = UriProtector.parse(str);
        }
        return (Uri) c259800zU.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS0S2600000_1 awS0S2600000_1, Object obj) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        EnumC925903jd enumC925903jd;
        String name;
        boolean z = false;
        if (((Boolean) obj).booleanValue() && ((C19EG) awS0S2600000_1.l2) != null) {
            IPipoService iPipoService = (IPipoService) ServiceManager.get().getService(IPipoService.class);
            C19EG c19eg = (C19EG) awS0S2600000_1.l2;
            String str = awS0S2600000_1.s0;
            String str2 = (String) ((C259800zU) awS0S2600000_1.l3).element;
            String str3 = (String) ((C259800zU) awS0S2600000_1.l4).element;
            C907803gi c907803gi = C907803gi.LIZ;
            String str4 = awS0S2600000_1.s1;
            c907803gi.getClass();
            String strLJJJJZ = C907803gi.LJJJJZ(str4);
            String str5 = (String) ((C259800zU) awS0S2600000_1.l5).element;
            String str6 = (String) ((C259800zU) awS0S2600000_1.l6).element;
            EnumC989003to enumC989003to = EnumC989003to.HALF_PAGE;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            String currentRegionCode = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode();
            if (C914103hj.LIZ().isMinimalLayout) {
                enumC925903jd = EnumC925903jd.MINIMAL;
            } else {
                enumC925903jd = EnumC925903jd.NORMAL;
            }
            iPipoService.LJIIIIZZ(c19eg, str, str2, str3, strLJJJJZ, str5, str6, enumC989003to, currentRegionCode, null, "default", enumC925903jd, null, null, new AwS580S0100000_1((C897703f5) awS0S2600000_1.l7, 206));
        } else {
            NewPayInfo newPayInfo = new NewPayInfo(null, PayResult.ERROR, new PayErrorToast(null, "", null, null), null, null, null, null, null, null, null);
            C907803gi c907803gi2 = C907803gi.LIZ;
            C897703f5 c897703f5 = (C897703f5) awS0S2600000_1.l7;
            c897703f5.LIZLLL = newPayInfo;
            c907803gi2.LJIJJLI(c897703f5, "need_verify_install_error", false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS0S2600000_1 r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S2600000_1.invoke$1(kotlin.jvm.internal.AwS0S2600000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S2600000_1(C19EG c19eg, C19EG c19eg2, String str, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str2, C259800zU<String> c259800zU3, C259800zU<String> c259800zU4, C897703f5 c897703f5) {
        super(1);
        this.$t = c897703f5;
        this.l2 = c19eg;
        this.s0 = c19eg2;
        this.l3 = str;
        this.l4 = c259800zU;
        this.s1 = c259800zU2;
        this.l5 = str2;
        this.l6 = c259800zU3;
        this.l7 = c259800zU4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2600000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, EnumC828303Ll enumC828303Ll, EcomPaymentInterceptor.PayResultEvent payResultEvent, String str, EcomPaymentInterceptor.CommonPayResultEvent commonPayResultEvent, ExceptionUX exceptionUX, String str2, C03N8 c03n8, int i) {
        super(1);
        this.$t = i;
        this.l2 = orderSubmitAssemViewModel;
        this.l3 = enumC828303Ll;
        this.l4 = payResultEvent;
        this.s0 = str;
        this.l5 = commonPayResultEvent;
        this.l6 = exceptionUX;
        this.s1 = str2;
        this.l7 = c03n8;
    }
}
