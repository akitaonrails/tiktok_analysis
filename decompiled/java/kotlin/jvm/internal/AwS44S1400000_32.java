package kotlin.jvm.internal;

import X.C09AY;
import X.C1132380fZc;
import X.C1ATJ;
import X.C21333418eC;
import X.C21335118eT;
import X.C21406118pv;
import X.InterfaceC1631620sYq;
import X.InterfaceC21334018eI;
import android.animation.ValueAnimator;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes33.dex */
public class AwS44S1400000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7 A[Catch: all -> 0x01e0, LOOP:0: B:54:0x01c1->B:56:0x01c7, LOOP_END, TryCatch #0 {all -> 0x01e0, blocks: (B:53:0x015b, B:54:0x01c1, B:56:0x01c7, B:57:0x01d5), top: B:66:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS44S1400000_32 r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS44S1400000_32.invoke$0(kotlin.jvm.internal.AwS44S1400000_32):java.lang.Object");
    }

    public static final Object invoke$1(AwS44S1400000_32 awS44S1400000_32) {
        final C1ATJ c1atj = (C1ATJ) awS44S1400000_32.l1;
        final String str = awS44S1400000_32.s0;
        final C1132380fZc c1132380fZc = (C1132380fZc) awS44S1400000_32.l2;
        final AwS44S1400000_32 awS44S1400000_322 = new AwS44S1400000_32(c1atj, (C1ATJ) str, (String) c1132380fZc, (C1132380fZc) awS44S1400000_32.l3, (Function1<? super C21406118pv, Unit>) awS44S1400000_32.l4, (Function1<? super C21406118pv, Unit>) 0);
        final AwS681S0100000_32 awS681S0100000_32 = new AwS681S0100000_32((Function1) awS44S1400000_32.l4, (Function1<? super C21406118pv, Unit>) 0);
        if (c1atj.LJIIIZ.contains(str)) {
            awS44S1400000_322.invoke();
        } else {
            c1atj.LIZLLL().queryPackage(str, new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$checkPackageStatus$1
                @Override // com.bytedance.pitaya.api.PTYPackageCallback
                public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                    if (z) {
                        c1atj.LJIIIZ.add(str);
                        awS44S1400000_322.invoke();
                    } else {
                        if (!c1132380fZc.LIZ) {
                            awS681S0100000_32.invoke(-3, pTYError, pTYPackageInfo);
                            return;
                        }
                        C1ATJ c1atj2 = c1atj;
                        String str2 = str;
                        final Function0<Unit> function0 = awS44S1400000_322;
                        final AwS630S0100000_16 awS630S0100000_16 = new AwS630S0100000_16(awS681S0100000_32, (InterfaceC1631620sYq<? super Integer, ? super PTYError, ? super PTYPackageInfo, Unit>) 5);
                        c1atj2.LIZLLL().requestUpdate(str2, new PTYRequestConfig(true, null), new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$requestUpdateImmediately$1
                            @Override // com.bytedance.pitaya.api.PTYPackageCallback
                            public void onResult(boolean z2, PTYError pTYError2, PTYPackageInfo pTYPackageInfo2) {
                                if (z2) {
                                    function0.invoke();
                                } else {
                                    awS630S0100000_16.invoke(pTYError2, pTYPackageInfo2);
                                }
                            }
                        });
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S1400000_32 awS44S1400000_32) {
        InterfaceC21334018eI interfaceC21334018eI = (InterfaceC21334018eI) awS44S1400000_32.l1;
        if (interfaceC21334018eI == null || true != interfaceC21334018eI.LIZ(((C21333418eC) awS44S1400000_32.l2).LIZ, (ValueAnimator) awS44S1400000_32.l3, (C21335118eT) awS44S1400000_32.l4)) {
            ((C21333418eC) awS44S1400000_32.l2).LJ(awS44S1400000_32.s0, (C21335118eT) awS44S1400000_32.l4, ((ValueAnimator) awS44S1400000_32.l3).getRepeatCount());
            ((C21333418eC) awS44S1400000_32.l2).LIZIZ.remove(awS44S1400000_32.s0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S1400000_32(InterfaceC21334018eI interfaceC21334018eI, C21333418eC c21333418eC, ValueAnimator valueAnimator, C21335118eT c21335118eT, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC21334018eI;
        this.l2 = c21333418eC;
        this.l3 = valueAnimator;
        this.l4 = c21335118eT;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS44S1400000_32(C1ATJ c1atj, C1ATJ c1atj2, String str, C1132380fZc c1132380fZc, Function1<? super C21406118pv, Unit> function1, Function1<? super C21406118pv, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l1 = c1atj;
        this.s0 = c1atj2;
        this.l2 = str;
        this.l3 = c1132380fZc;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S1400000_32(C1ATJ c1atj, String str, C1132380fZc c1132380fZc, AwS399S0200000_33 awS399S0200000_33, AwS399S0200000_33 awS399S0200000_332, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1atj;
        this.s0 = str;
        this.l2 = c1132380fZc;
        this.l3 = awS399S0200000_33;
        this.l4 = awS399S0200000_332;
    }
}
