package kotlin.jvm.internal;

import X.C09AY;
import X.C1104530eqh;
import X.C1126520fQA;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS36S1110000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS36S1110000_17 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS36S1110000_17.invoke$0(kotlin.jvm.internal.AwS36S1110000_17, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS36S1110000_17 awS36S1110000_17, Object obj) {
        String str;
        String str2;
        DataChannel dataChannel = ((C1126520fQA) awS36S1110000_17.l1).LLILZLL;
        if (dataChannel != null) {
            if (awS36S1110000_17.z2) {
                str = "portal";
                str2 = "label";
            } else {
                str = "";
                str2 = "normal";
            }
            dataChannel.LC0(LiveSendRedEnvelopeEvent.class, new C1104530eqh("gift", str, str2, awS36S1110000_17.s0, null, 32));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S1110000_17(C1126520fQA c1126520fQA, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1126520fQA;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S1110000_17(String str, boolean z, PackageListViewModel packageListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = packageListViewModel;
    }
}
