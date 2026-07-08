package kotlin.jvm.internal;

import X.AbstractC1110800f0o;
import X.C09AY;
import X.C0KAJ;
import X.C1110810f0p;
import X.C1113670f5R;
import X.C1113680f5S;
import X.C1114030f61;
import X.C1114050f63;
import X.EnumC1110950f13;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS1S0720000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public boolean z7;
    public boolean z8;

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

    public static final Object invoke$0(AwS1S0720000_17 awS1S0720000_17, Object obj) {
        C1114050f63 c1114050f63 = (C1114050f63) obj;
        C1110810f0p c1110810f0p = C1110810f0p.LIZ;
        DataChannel dataChannel = ((AbstractC1110800f0o) awS1S0720000_17.l0).LLIIIILZ().LJIIIZ;
        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) awS1S0720000_17.l0;
        C0KAJ c0kaj = C0KAJ.MANUALLY_ROUTE;
        c1110810f0p.getClass();
        C1110810f0p.LIZ(dataChannel, abstractC1110800f0o, c0kaj);
        if (awS1S0720000_17.z7) {
            ((AbstractC1110800f0o) awS1S0720000_17.l0).LJIIIIZZ = new Pair<>((EnumC1110950f13) awS1S0720000_17.l1, null);
            C1114030f61 c1114030f61 = (C1114030f61) awS1S0720000_17.l2;
            c1114030f61.LIZLLL(c1114050f63, 1L, awS1S0720000_17.z8, new AwS22S0600000_17(c1114030f61, (C1114030f61) c1114050f63, (C1114050f63) awS1S0720000_17.l5, (C1113680f5S) awS1S0720000_17.l6, (Function2<? super String, ? super EnumC1110950f13, Unit>) awS1S0720000_17.l4, (PublicAreaMessageCommon.OperationState) awS1S0720000_17.l1, (EnumC1110950f13) 0));
        }
        Function2 function2 = (Function2) awS1S0720000_17.l3;
        if (function2 != null) {
            function2.invoke(((PublicAreaMessageCommon.OperationState) awS1S0720000_17.l4).scene, (EnumC1110950f13) awS1S0720000_17.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0720000_17 awS1S0720000_17, Object obj) {
        C1114050f63 c1114050f63 = (C1114050f63) obj;
        ((AbstractC1110800f0o) awS1S0720000_17.l0).LJIIIIZZ = new Pair<>((EnumC1110950f13) awS1S0720000_17.l1, (PublicAreaMessageCommon.OperationState) awS1S0720000_17.l2);
        C1114030f61 c1114030f61 = (C1114030f61) awS1S0720000_17.l3;
        c1114030f61.LIZLLL(c1114050f63, 0L, awS1S0720000_17.z7, new C1113670f5R((Function2) awS1S0720000_17.l4, (PublicAreaMessageCommon.OperationState) awS1S0720000_17.l2, (EnumC1110950f13) awS1S0720000_17.l1, c1114050f63, c1114030f61, (AbstractC1110800f0o) awS1S0720000_17.l0, awS1S0720000_17.z8, (C1113680f5S) awS1S0720000_17.l5, (Function2) awS1S0720000_17.l6));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS1S0720000_17(X.C1113680f5S r3, X.EnumC1110950f13 r4, X.AbstractC1110800f0o r5, X.C1114030f61 r6, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.OperationState r7, kotlin.jvm.functions.Function2 r8, kotlin.jvm.functions.Function2 r9, boolean r10, boolean r11, int r12) {
        /*
            r2 = this;
            r2.$t = r12
            if (r12 == 0) goto L1c
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r7
            r1.l3 = r6
            r1.z7 = r10
            r1.l4 = r8
            r1.z8 = r11
            r1.l5 = r3
            r1.l6 = r9
            r0 = 1
        L18:
            r1.<init>(r0)
            return
        L1c:
            r1 = r2
            r1.l0 = r5
            r1.z7 = r10
            r1.l1 = r4
            r1.l2 = r6
            r1.z8 = r11
            r1.l3 = r8
            r1.l4 = r7
            r1.l5 = r3
            r1.l6 = r9
            r0 = 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S0720000_17.<init>(X.0f5S, X.0f13, X.0f0o, X.0f61, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$OperationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, int):void");
    }
}
