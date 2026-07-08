package kotlin.jvm.internal;

import X.AbstractC634910OvJ;
import X.C01GW;
import X.C09AY;
import X.C0CNO;
import X.C0RGG;
import X.C0S9P;
import X.C0SA6;
import X.C0SQK;
import X.C586380MzE;
import X.C699990Rcz;
import X.C700170RdH;
import X.C700190RdJ;
import X.C700800ReI;
import X.InterfaceC699620RcO;
import X.InterfaceC700000Rd0;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS21S1400000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S1400000_11 awS21S1400000_11, Object obj) {
        InterfaceC699620RcO interfaceC699620RcO = (InterfaceC699620RcO) obj;
        for (String str : (List) awS21S1400000_11.l1) {
            interfaceC699620RcO.LJ(str, C700800ReI.LIZJ((C700170RdH) awS21S1400000_11.l4, str), false, "decision failed", false, awS21S1400000_11.s0, (List) awS21S1400000_11.l2, null, null, null);
        }
        for (String str2 : (List) awS21S1400000_11.l3) {
            interfaceC699620RcO.LJ(str2, C700800ReI.LIZJ((C700170RdH) awS21S1400000_11.l4, str2), false, "decision failed", true, awS21S1400000_11.s0, (List) awS21S1400000_11.l2, "low_priority", null, null);
        }
        for (String str3 : (List) awS21S1400000_11.l2) {
            interfaceC699620RcO.LJ(str3, C700800ReI.LIZJ((C700170RdH) awS21S1400000_11.l4, str3), true, "decision success", true, awS21S1400000_11.s0, (List) awS21S1400000_11.l2, null, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S1400000_11 awS21S1400000_11, Object obj) {
        boolean z;
        int i;
        C0S9P c0s9p = (C0S9P) obj;
        C0SA6 c0sa6 = ((PhotoViewModelV2) awS21S1400000_11.l1).LL;
        int i2 = c0s9p.LL;
        boolean zLJFF = Intrinsics.LJFF(c0s9p.LLIZ, Boolean.TRUE);
        Float f = (Float) awS21S1400000_11.l2;
        Boolean bool = (Boolean) awS21S1400000_11.l3;
        Float f2 = (Float) awS21S1400000_11.l4;
        String str = awS21S1400000_11.s0;
        if (c0sa6.LIZJ > 0) {
            Aweme aweme = c0sa6.LJ;
            if (aweme != null) {
                C0SQK c0sqk = C0SQK.LIZ;
                String str2 = c0sa6.LIZLLL;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c0sa6.LIZJ;
                if (c0sa6.LIZIZ && !zLJFF) {
                    z = true;
                } else {
                    z = false;
                }
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && photoModeImageInfo.hasTitle()) {
                    i = 1;
                } else {
                    i = 0;
                }
                Integer numValueOf = Integer.valueOf(i);
                boolean z2 = c0sa6.LIZ;
                Boolean boolValueOf = Boolean.valueOf(!zLJFF);
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                c0sqk.logPinchZoom(str2, aweme, i2, jElapsedRealtime, z, numValueOf, z2, f, boolValueOf, bool, Boolean.valueOf(C586380MzE.LIZ().LIZJ(c0sa6.LIZLLL)), c0sa6.LJIIIIZZ, f2, str);
            }
            c0sa6.LIZJ = -1L;
            c0sa6.LIZIZ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S1400000_11 awS21S1400000_11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((ConditionData) awS21S1400000_11.l1).setCanApplySlot(zBooleanValue);
        C0CNO.LIZLLL(0L, new C699990Rcz((AbstractC634910OvJ) awS21S1400000_11.l2, zBooleanValue, (FcpNodeProtocol) awS21S1400000_11.l3, awS21S1400000_11.s0, (C700190RdJ) awS21S1400000_11.l4));
        InterfaceC700000Rd0 interfaceC700000Rd0Wb1 = ((FcpNodeProtocol) awS21S1400000_11.l3).wb1();
        if (interfaceC700000Rd0Wb1 != null) {
            interfaceC700000Rd0Wb1.l0(zBooleanValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1400000_11(ConditionData conditionData, FcpNodeProtocol fcpNodeProtocol, C700190RdJ c700190RdJ, String str, AbstractC634910OvJ abstractC634910OvJ, int i) {
        super(1);
        this.$t = i;
        this.l1 = conditionData;
        this.l2 = abstractC634910OvJ;
        this.l3 = fcpNodeProtocol;
        this.s0 = str;
        this.l4 = c700190RdJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1400000_11(PhotoViewModelV2 photoViewModelV2, Float f, Boolean bool, Float f2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = photoViewModelV2;
        this.l2 = f;
        this.l3 = bool;
        this.l4 = f2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS21S1400000_11(List list, List<String> list2, String str, List<String> list3, List<String> list4, C700170RdH c700170RdH) {
        super(1);
        this.$t = c700170RdH;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
        this.l3 = list3;
        this.l4 = list4;
    }
}
