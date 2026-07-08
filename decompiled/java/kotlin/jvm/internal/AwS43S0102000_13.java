package kotlin.jvm.internal;

import X.C09AY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LQ;
import X.C786410Ut5;
import X.C807660VmG;
import X.C810670Vr7;
import X.C814390Vx7;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IntervalDredgeAbility;
import com.ss.android.ugc.bytex.pthread.base.convergence.executor.AdaptiveThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.NewThreadPoolHelper;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS43S0102000_13 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0102000_13 awS43S0102000_13) throws Throwable {
        Object[] objArr = (String[]) awS43S0102000_13.l0;
        int iIntValue = awS43S0102000_13.i1;
        int iIntValue2 = awS43S0102000_13.i2;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMYfl359LG6CYB8TBFbPTAYbb3FQ=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr2 = {objArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)};
        C0WZW c0wzw = new C0WZW(false, "([Ljava/lang/String;II)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11028, "com/facebook/FacebookSdk", "setDataProcessingOptions", FacebookSdk.class, objArr2, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11028, "com/facebook/FacebookSdk", "setDataProcessingOptions", null, objArr2, FacebookSdk.class, c0wzw, false);
        } else {
            Object[] objArr3 = c0wsuLIZIZ.LIZJ;
            if (objArr3 != null) {
                Object obj = objArr3[0];
                if (obj != null) {
                    objArr = (Object[]) obj;
                }
                Object obj2 = objArr3[1];
                if (obj2 != null) {
                    iIntValue = ((Integer) obj2).intValue();
                }
                Object obj3 = c0wsuLIZIZ.LIZJ[2];
                if (obj3 != null) {
                    iIntValue2 = ((Integer) obj3).intValue();
                }
            }
            if (!C807660VmG.LIZ(FacebookSdk.class)) {
                if (objArr == null) {
                    try {
                        objArr = new String[0];
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data_processing_options", new JSONArray((Collection) C13LQ.LJJLL(objArr)));
                    jSONObject.put("data_processing_options_country", iIntValue);
                    jSONObject.put("data_processing_options_state", iIntValue2);
                    Context context = FacebookSdk.LJII;
                    context.getClass();
                    C810670Vr7.LIZJ(context, 0, "com.facebook.sdk.DataProcessingOptions").edit().putString("data_processing_options", C786410Ut5.J3(jSONObject)).apply();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c0wst.LIZ(11028, "com/facebook/FacebookSdk", "setDataProcessingOptions", null, objArr2, FacebookSdk.class, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS43S0102000_13 awS43S0102000_13) {
        ThreadPoolExecutor threadPoolExecutorNewThreadPool = NewThreadPoolHelper.INSTANCE.newThreadPool(awS43S0102000_13.i1, awS43S0102000_13.i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new RejectedExecutionHandler() { // from class: com.ss.android.ugc.bytex.pthread.base.convergence.executor.AdaptiveThreadPoolExecutor$mExecutor$2$1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                throw new RuntimeException("reject handler");
            }
        });
        threadPoolExecutorNewThreadPool.allowCoreThreadTimeOut(true);
        ((AdaptiveThreadPoolExecutor) awS43S0102000_13.l0).mDredgeHandler.bindDredgeAbility(new IntervalDredgeAbility(threadPoolExecutorNewThreadPool, 1023));
        return threadPoolExecutorNewThreadPool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0102000_13(int i, int i2, String[] strArr, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = strArr;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0102000_13(AdaptiveThreadPoolExecutor adaptiveThreadPoolExecutor, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = adaptiveThreadPoolExecutor;
        this.i1 = i;
        this.i2 = i2;
    }
}
