package kotlin.jvm.internal;

import X.AbstractC981450beB;
import X.AbstractC981980bf2;
import X.C055500If;
import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C921180a4y;
import X.C924380aA8;
import X.C924390aA9;
import X.C924640aAY;
import X.C924760aAk;
import X.C928400aGc;
import X.C981990bf3;
import X.EnumC973680bRe;
import X.EnumC974260bSa;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public class AwS9S0120000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
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

    public static final Object invoke$0(AwS9S0120000_15 awS9S0120000_15, Object obj) {
        SpotInfo next;
        MultiGuestSpotExtra multiGuestSpotExtra;
        String str;
        C055500If c055500If = (C055500If) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doJoinDirect onSuccess status=");
        sbLIZ.append(c055500If.LIZ);
        C20441214yg.LIZIZ("MultiGuestSuspendJoinedHelper", C2188811AlT.LIZIZ(sbLIZ));
        C928400aGc.LLILZLL = Integer.valueOf(awS9S0120000_15.z1 ? 1 : 0);
        List<SpotInfo> list = c055500If.LJ;
        Integer numValueOf = null;
        if (list != null) {
            Iterator<SpotInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PosIdentity posIdentity = next.posIdentity;
                    if (posIdentity != null) {
                        str = posIdentity.value;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C928400aGc.LLJILJIL.getValue()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SpotInfo spotInfo = next;
            if (spotInfo != null && (multiGuestSpotExtra = spotInfo.multiGuestSpotExtra) != null) {
                numValueOf = Integer.valueOf(multiGuestSpotExtra.spotRank);
            }
        }
        C924640aAY.LIZIZ = numValueOf;
        C924380aA8.LIZ((DataChannel) awS9S0120000_15.l0, new C924390aA9("guest_apply_anchor", new C924760aAk(awS9S0120000_15.z2, C928400aGc.LLILLJJLI), 12));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0120000_15 awS9S0120000_15, Object obj) {
        AbstractC981980bf2 abstractC981980bf2 = (AbstractC981980bf2) awS9S0120000_15.l0;
        abstractC981980bf2.LJFF = false;
        if (awS9S0120000_15.z1) {
            if (awS9S0120000_15.z2) {
                abstractC981980bf2.LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.NEGATIVE_OVER;
                if (((AbstractC981980bf2) awS9S0120000_15.l0).LIZ.Y2() == EnumC974260bSa.PUNISH || ((AbstractC981980bf2) awS9S0120000_15.l0).LIZ.Y2() == EnumC974260bSa.DRAW) {
                    AbstractC981450beB.LJJIJL((AbstractC981980bf2) awS9S0120000_15.l0, "punish_cut_short_request_negative", null, false, 14);
                }
            } else {
                abstractC981980bf2.LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.POSITIVE_OVER;
                if (((AbstractC981980bf2) awS9S0120000_15.l0).LIZ.Y2() == EnumC974260bSa.PUNISH || ((AbstractC981980bf2) awS9S0120000_15.l0).LIZ.Y2() == EnumC974260bSa.DRAW) {
                    AbstractC981450beB.LJJIJL((AbstractC981980bf2) awS9S0120000_15.l0, "cut_short_request", null, false, 14);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0120000_15(C981990bf3 c981990bf3, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c981990bf3;
        this.z1 = false;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0120000_15(boolean z, boolean z2, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = dataChannel;
        this.z2 = z2;
    }
}
