package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0VEG;
import X.C0W4T;
import X.C0WUT;
import X.C0WUV;
import X.C13LE;
import X.C1549500qQO;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C786410Ut5;
import X.InterfaceC824510WWb;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AwS449S0200000_13 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS449S0200000_13(C013C c013c, C013C c013c2, Function2<? super Integer, ? super String, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = c013c;
        this.l1 = c013c2;
    }

    public static final Object invoke$0(AwS449S0200000_13 awS449S0200000_13, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        if (!((C013C) awS449S0200000_13.l0).element) {
            ((Function2) awS449S0200000_13.l1).invoke(Integer.valueOf(iIntValue), obj2);
            ((C013C) awS449S0200000_13.l0).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS449S0200000_13 awS449S0200000_13, Object obj, Object obj2) {
        ((Function0) awS449S0200000_13.l0).invoke();
        ((OneClickLoginService) awS449S0200000_13.l1).getClass();
        OneClickLoginService.LJIL((String) obj, (String) obj2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS449S0200000_13 awS449S0200000_13, Object obj, Object obj2) {
        InterfaceC824510WWb interfaceC824510WWb;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue && (interfaceC824510WWb = (InterfaceC824510WWb) awS449S0200000_13.l0) != null) {
            interfaceC824510WWb.LIZ(false);
        }
        Function2 function2 = (Function2) awS449S0200000_13.l1;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(zBooleanValue), obj2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS449S0200000_13 awS449S0200000_13, Object obj, Object obj2) {
        int iB4;
        C0W4T c0w4t;
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            C0WUV c0wuv = (C0WUV) C1549500qQO.LIZLLL(C13LE.LIZ(C0WUV.class));
            c0wuv.setSmsCode(str);
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS82S0200000_13(c0wuv, (CompletionBlock) awS449S0200000_13.l1, 108));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13((CompletionBlock) awS449S0200000_13.l1, 296));
        }
        C0WUT c0wut = (C0WUT) awS449S0200000_13.l0;
        c0wut.getClass();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopBroadcastReceiver, mCanUseFeature:");
        sbLIZ.append(c0wut.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        Context context = c0wut.LIZ;
        if (context != null) {
            try {
                iB4 = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iB4 = 1;
            }
        } else {
            iB4 = 1;
        }
        if (C0VEG.LIZ(c0wut.LIZ) && iB4 == 0 && (c0w4t = c0wut.LIZLLL) != null) {
            try {
                C786410Ut5.LJJIFFI(c0w4t.LIZ, c0w4t);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unregister exception: ");
                sbLIZ2.append(e2.getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh2.getClass();
                C2341109Fh.LJ(strLIZIZ2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS449S0200000_13(C0WUT c0wut, C0WUT c0wut2, CompletionBlock<C0WUV> completionBlock) {
        super(2);
        this.$t = completionBlock;
        this.l0 = c0wut;
        this.l1 = c0wut2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS449S0200000_13(InterfaceC824510WWb interfaceC824510WWb, InterfaceC824510WWb interfaceC824510WWb2, Function2<? super Boolean, ? super String, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = interfaceC824510WWb;
        this.l1 = interfaceC824510WWb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS449S0200000_13(OneClickLoginService oneClickLoginService, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = function0;
        this.l1 = oneClickLoginService;
    }
}
