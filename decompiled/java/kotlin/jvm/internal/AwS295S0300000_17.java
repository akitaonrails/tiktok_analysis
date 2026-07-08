package kotlin.jvm.internal;

import X.AbstractC1126600fQI;
import X.AbstractC1139430fkz;
import X.AnonymousClass0054;
import X.C09AY;
import X.C1085590eM9;
import X.C1092560eXO;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1126540fQC;
import X.C1128710fTh;
import X.C1136560fgM;
import X.C1146530fwR;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C238400w2;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS295S0300000_17 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS295S0300000_17 r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS295S0300000_17.invoke$0(kotlin.jvm.internal.AwS295S0300000_17, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS295S0300000_17 awS295S0300000_17, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((AbstractC1139430fkz) awS295S0300000_17.l0).LJIIIZ((C1136560fgM) awS295S0300000_17.l1, (AssetsModel) awS295S0300000_17.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS295S0300000_17 awS295S0300000_17, Object obj, Object obj2) {
        List<Long> list = (List) obj;
        List<Integer> list2 = (List) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert response = ");
        sbLIZ.append(list);
        C20441214yg.LJ("RealTime", C2188811AlT.LIZIZ(sbLIZ));
        C1128710fTh c1128710fTh = (C1128710fTh) awS295S0300000_17.l0;
        long j = ((C238400w2) awS295S0300000_17.l1).element;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList = (LinkedList) awS295S0300000_17.l2;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c1128710fTh.LJJJJ(j, linkedList, list, list2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS295S0300000_17 awS295S0300000_17, Object obj, Object obj2) {
        C20441214yg.LJFF("LiveLinkMicGiftFlyAnimationHelper", "loadWebpAnimation small fly webp failed,", (Throwable) obj2);
        ((C1085590eM9) awS295S0300000_17.l0).LIZ((C1126540fQC) awS295S0300000_17.l1);
        C1118780fDg.LIZIZ((C1118840fDm) awS295S0300000_17.l2, 4, 2, 2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS295S0300000_17(C1085590eM9 c1085590eM9, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1085590eM9;
        this.l1 = c1126540fQC;
        this.l2 = c1118840fDm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS295S0300000_17(C1128710fTh c1128710fTh, C1128710fTh c1128710fTh2, C238400w2 c238400w2, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        super(2);
        this.$t = linkedList;
        this.l0 = c1128710fTh;
        this.l1 = c1128710fTh2;
        this.l2 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS295S0300000_17(AbstractC1139430fkz abstractC1139430fkz, C1136560fgM c1136560fgM, AssetsModel assetsModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC1139430fkz;
        this.l1 = c1136560fgM;
        this.l2 = assetsModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS295S0300000_17(C1146530fwR c1146530fwR, C1092560eXO c1092560eXO, GiftAnchorPanelGiftPageCenterAssemCompose giftAnchorPanelGiftPageCenterAssemCompose, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1146530fwR;
        this.l1 = c1092560eXO;
        this.l2 = giftAnchorPanelGiftPageCenterAssemCompose;
    }
}
