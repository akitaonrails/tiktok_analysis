package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.PreWarmAdSparkHybridContext;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public class AFwS339S0000000_16 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static AFwS339S0000000_16 get$arr$(int i) {
        AFwS339S0000000_16 aFwS339S0000000_16 = (AFwS339S0000000_16) arr$.get(i);
        if (aFwS339S0000000_16 != null) {
            return aFwS339S0000000_16;
        }
        arr$.compareAndSet(i, null, new AFwS339S0000000_16(i));
        return (AFwS339S0000000_16) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS339S0000000_16(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS339S0000000_16 aFwS339S0000000_16, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (!(obj3 instanceof PreWarmAdSparkHybridContext)) {
            return Boolean.FALSE;
        }
        String strEncode = Uri.encode("about:blank");
        boolean z = false;
        if (a0.LJJIIZI(str, strEncode, false) || a0.LJJIIZI(str2, strEncode, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AFwS339S0000000_16 aFwS339S0000000_16, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AFwS339S0000000_16 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r13 = r15
            java.lang.Number r14 = (java.lang.Number) r14
            int r3 = r14.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L1e
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L88
            r0 = 4
        L1d:
            r4 = r4 | r0
        L1e:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L30
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L30
            r13.LIZJ()
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L86
            r0 = 1
        L3b:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L53
        L4a:
            kotlin.jvm.internal.AwS58S0001000_16 r2 = new kotlin.jvm.internal.AwS58S0001000_16
            r0 = 2
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L53:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            r0 = 2131847151(0x7f1167ef, float:1.9327771E38)
            java.lang.String r7 = X.C0MBB.LIZIZ(r0, r13)
            r0 = 2131847138(0x7f1167e2, float:1.9327745E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r13)
            kotlin.jvm.internal.AwS630S0100000_16 r1 = new kotlin.jvm.internal.AwS630S0100000_16
            r0 = 64
            r1.<init>(r2, r0)
            r0 = -21335964(0xfffffffffeba7064, float:-1.2390999E38)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2d
        L86:
            r0 = 0
            goto L3b
        L88:
            r0 = 2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS339S0000000_16.invoke$2(kotlin.jvm.internal.AFwS339S0000000_16, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
