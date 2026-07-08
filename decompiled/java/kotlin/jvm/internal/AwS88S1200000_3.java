package kotlin.jvm.internal;

import X.AbstractC23051091l;
import X.C098200Yq;
import X.C09AY;
import X.C0OPX;
import X.C0X52;
import X.C1490740otc;
import X.C189200o6;
import X.C2188811AlT;
import X.C2229808oS;
import X.C2231808om;
import android.content.Context;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wuk.c;

/* JADX INFO: loaded from: classes4.dex */
public class AwS88S1200000_3 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS88S1200000_3 r5, java.lang.Object r6) {
        /*
            X.03oi r6 = (X.C957403oi) r6
            X.C0XJZ.LIZIZ(r6)
            java.lang.Object r1 = r5.l1
            X.0X52 r1 = (X.C0X52) r1
            X.08fh r0 = r1.LIZ
            r3 = 0
            if (r0 == 0) goto L8f
            java.lang.Object r2 = r0.LJFF
        L10:
            boolean r0 = r2 instanceof X.C1494600ozq
            if (r0 == 0) goto L8d
            X.0ozq r2 = (X.C1494600ozq) r2
        L16:
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            int r0 = r0.code
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error_code"
            r6.LIZIZ(r0, r1)
            java.net.URL r1 = new java.net.URL
            java.lang.Object r0 = r5.l1
            X.0X52 r0 = (X.C0X52) r0
            X.08fh r0 = r0.LIZ
            if (r0 == 0) goto L31
            java.lang.String r3 = r0.LIZ
        L31:
            r1.<init>(r3)
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "path"
            r6.LIZIZ(r0, r1)
            java.lang.Object r0 = r5.l1
            X.0X52 r0 = (X.C0X52) r0
            java.lang.String r1 = X.C2371709Rb.LIZ(r0)
            java.lang.String r0 = "log_id"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = r5.s0
            r6.LIZIZ(r1, r0)
            if (r2 == 0) goto L8a
            long r0 = r2.LJIILLIIL
        L55:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r6.LIZJ(r0, r1)
            r4 = 0
            if (r2 == 0) goto L88
            boolean r1 = r2.LJJI
            r0 = 1
            if (r1 != r0) goto L88
        L66:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_socket_reused"
            r6.LIZJ(r0, r1)
            java.lang.Object r3 = r5.l2
            kotlin.Pair[] r3 = (kotlin.Pair[]) r3
            int r2 = r3.length
        L74:
            if (r4 >= r2) goto L91
            r0 = r3[r4]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.LIZIZ(r1, r0)
            int r4 = r4 + 1
            goto L74
        L88:
            r0 = 0
            goto L66
        L8a:
            r0 = 0
            goto L55
        L8d:
            r2 = r3
            goto L16
        L8f:
            r2 = r3
            goto L10
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS88S1200000_3.invoke$0(kotlin.jvm.internal.AwS88S1200000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS88S1200000_3 awS88S1200000_3, Object obj) {
        C2231808om c2231808om = (C2231808om) awS88S1200000_3.l1;
        String str = awS88S1200000_3.s0;
        C2229808oS c2229808oS = (C2229808oS) awS88S1200000_3.l2;
        synchronized (c2231808om) {
            try {
                if (c2231808om.LIZJ.get(str) == c2229808oS) {
                    c2231808om.LIZJ.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS88S1200000_3 awS88S1200000_3, Object obj) {
        int i = ((AtomicInteger) awS88S1200000_3.l1).get();
        if (i > 0) {
            try {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance((Context) awS88S1200000_3.l2).cancel(i);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C0OPX.LJII("BulletinVoiceDownloader: HTTP cancel issued vid=" + awS88S1200000_3.s0 + " id=" + i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS88S1200000_3 awS88S1200000_3, Object obj) {
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        ((AtomicReference) awS88S1200000_3.l1).set(C189200o6.m1boximpl(objM10unboximpl));
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getShortLinkConfig, name=");
        sbLIZ.append(awS88S1200000_3.s0);
        sbLIZ.append(", result=");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(objM10unboximpl));
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "RomaSDK", 2);
        ((CountDownLatch) awS88S1200000_3.l2).countDown();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS88S1200000_3 awS88S1200000_3, Object obj) {
        boolean z;
        Effect effect = (Effect) obj;
        c cVar = (c) awS88S1200000_3.l1;
        String str = awS88S1200000_3.s0;
        List<AbstractC23051091l> list = (List) awS88S1200000_3.l2;
        cVar.getClass();
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (AbstractC23051091l abstractC23051091l : list) {
                z = true;
                if (effect == null) {
                    abstractC23051091l.getClass();
                    break;
                }
                if (abstractC23051091l.LIZ(effect, str)) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S1200000_3(C2231808om c2231808om, String str, C2229808oS c2229808oS, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2231808om;
        this.s0 = str;
        this.l2 = c2229808oS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S1200000_3(C0X52 c0x52, C0X52<Response<Object>> c0x522, String str, Pair<String, ? extends Object>[] pairArr) {
        super(1);
        this.$t = pairArr;
        this.l1 = c0x52;
        this.s0 = c0x522;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S1200000_3(AtomicReference atomicReference, AtomicReference<C189200o6<ShortLinkConfig>> atomicReference2, String str, CountDownLatch countDownLatch) {
        super(1);
        this.$t = countDownLatch;
        this.l1 = atomicReference;
        this.s0 = atomicReference2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S1200000_3(c cVar, c cVar2, String str, List<? extends AbstractC23051091l> list) {
        super(1);
        this.$t = list;
        this.l1 = cVar;
        this.s0 = cVar2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S1200000_3(AtomicInteger atomicInteger, C2231808om c2231808om, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = atomicInteger;
        this.s0 = str;
        this.l2 = context;
    }
}
