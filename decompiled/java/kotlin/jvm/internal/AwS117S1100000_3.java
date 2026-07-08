package kotlin.jvm.internal;

import X.C034Y;
import X.C07WE;
import X.C07ZT;
import X.C07ZU;
import X.C07ZV;
import X.C098200Yq;
import X.C09AY;
import X.C09VC;
import X.C0WZX;
import X.C1397620mTQ;
import X.C1701330uNH;
import X.C189200o6;
import X.C1909107dp;
import X.C19423210ys;
import X.C1954807lC;
import X.C19EG;
import X.C20684815ws;
import X.C2124108Tv;
import X.C2124208Tw;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2382909Vj;
import X.C2383309Vn;
import X.C840290Wxn;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.third.container.SparkThirdActivity;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS117S1100000_3 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(C840290Wxn c840290Wxn, int i) {
        super(1);
        this.$t = i;
        this.l1 = c840290Wxn;
        this.s0 = "sss-network-channel";
    }

    public static final Object invoke$0(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS117S1100000_3.s0, new AwS582S0100000_3((Context) awS117S1100000_3.l1, 18));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        SmartRouter.buildRoute((BaseActivity) awS117S1100000_3.l1, awS117S1100000_3.s0).open();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        String str = awS117S1100000_3.s0;
        if (str != null && str.length() != 0) {
            String str2 = awS117S1100000_3.s0;
            C19EG c19eg = (C19EG) awS117S1100000_3.l1;
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(UriProtector.parse(str2));
                intent.putExtra("pns.sandbox.dataflow_id", 1207967489);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, c19eg);
                C2204961BRm.LLJJJJ(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKxYY3H2Dn0OlcCeTfBLrP8ZLLbqYUmyGt/uNz/K2KJoX6X8Ns6", null));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        String str;
        String strValueOf;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        ResetEntryTextData resetEntryTextData = (ResetEntryTextData) awS117S1100000_3.l1;
        String str2 = null;
        if (resetEntryTextData != null) {
            str = resetEntryTextData.ok;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ResetEntryTextData resetEntryTextData2 = (ResetEntryTextData) awS117S1100000_3.l1;
            if (resetEntryTextData2 != null) {
                str2 = resetEntryTextData2.ok;
            }
            strValueOf = String.valueOf(str2);
        } else {
            strValueOf = awS117S1100000_3.s0;
        }
        c1397620mTQ.LIZJ(0, strValueOf, AFwS231S0000000_3.get$arr$(160));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        List<C2124208Tw> list = (List) obj;
        new AwS152S1100000_3(awS117S1100000_3.s0, (String) list, (List<? extends Aweme>) 8);
        C034Y.LIZ();
        String str = awS117S1100000_3.s0;
        LynxView lynxView = (LynxView) awS117S1100000_3.l1;
        for (C2124208Tw c2124208Tw : list) {
            C2124108Tv.LL.getClass();
            C2124108Tv.LIZIZ(str, lynxView, c2124208Tw);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        String str = (String) obj;
        int iLJJIZ = a0.LJJIZ(str, '=', 0, false, 6);
        if (iLJJIZ >= 0) {
            String strSubstring = str.substring(0, iLJJIZ);
            ((C840290Wxn) awS117S1100000_3.l1).getClass();
            if (Intrinsics.LJFF(URLDecoder.decode(strSubstring, StandardCharsets.UTF_8.name()), awS117S1100000_3.s0)) {
                C840290Wxn c840290Wxn = (C840290Wxn) awS117S1100000_3.l1;
                String strSubstring2 = str.substring(iLJJIZ + 1);
                c840290Wxn.getClass();
                return URLDecoder.decode(strSubstring2, StandardCharsets.UTF_8.name());
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$6(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        C07ZV c07zv = (C07ZV) obj;
        CompletionBlock completionBlock = (CompletionBlock) ((AtomicReference) awS117S1100000_3.l1).getAndSet(null);
        if (completionBlock != null) {
            if (c07zv instanceof C07ZT) {
                try {
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C09VC.class, awS117S1100000_3.s0);
                    ((C09VC) xBaseModelLIZJ).setResponse(((C07ZT) c07zv).LIZ);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } else if (c07zv instanceof C07ZU) {
                try {
                    C2382909Vj.LIZ(completionBlock, 0, ((C07ZU) c07zv).LIZ, null, 4);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String str = awS117S1100000_3.s0;
        c19423210ys.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("deny_avatar_camera", c2344009Gk.LIZ);
        ((Function1) awS117S1100000_3.l1).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS117S1100000_3 awS117S1100000_3, Object obj) {
        boolean z;
        String str = (String) obj;
        if (Intrinsics.LJFF(((C07WE) awS117S1100000_3.l1).LIZ(), new C07WE(str).LIZ()) && !Intrinsics.LJFF(str, awS117S1100000_3.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(C07WE c07we, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c07we;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(SparkThirdActivity sparkThirdActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = sparkThirdActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(BaseActivity baseActivity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseActivity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(LynxView lynxView, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = lynxView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(ResetEntryTextData resetEntryTextData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = resetEntryTextData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1100000_3(String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S1100000_3(String str, String str2, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S1100000_3(AtomicReference atomicReference, AtomicReference<CompletionBlock<C09VC>> atomicReference2, C2383309Vn c2383309Vn, String str) {
        super(1);
        this.$t = str;
        this.l1 = atomicReference;
        this.s0 = c2383309Vn;
    }
}
