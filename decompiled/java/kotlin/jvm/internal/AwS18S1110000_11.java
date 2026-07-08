package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C703900RjI;
import X.C703910RjJ;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS18S1110000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS18S1110000_11 r9) {
        /*
            java.lang.String r1 = r9.s0
            java.lang.String r0 = "bottom_banner"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7f
            boolean r0 = r9.z2
            r8 = 0
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L3d
            java.lang.Class<com.ss.android.ugc.aweme.tako.ITakoService> r3 = com.ss.android.ugc.aweme.tako.ITakoService.class
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.tako.ITakoService r0 = (com.ss.android.ugc.aweme.tako.ITakoService) r0
            if (r0 == 0) goto L71
            X.0lFt r1 = r0.LJIILL()
            if (r1 == 0) goto L71
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent r0 = (com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent) r0
            X.0R8b r0 = r0.jm()
            if (r0 == 0) goto L6f
            X.0RJN r0 = r0.LIZIZ()
            if (r0 == 0) goto L6f
            X.1An6 r0 = r0.LIZJ
        L37:
            boolean r0 = r1.LJ(r0)
            if (r0 != r2) goto L71
        L3d:
            java.lang.Class<com.ss.android.ugc.aweme.tako.ITakoService> r3 = com.ss.android.ugc.aweme.tako.ITakoService.class
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.tako.ITakoService r3 = (com.ss.android.ugc.aweme.tako.ITakoService) r3
            if (r3 == 0) goto L6c
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent r0 = (com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent) r0
            android.view.View r2 = r0.LJJIJL()
            int r0 = X.C1111004We.LIZ()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.z2
            r1.intValue()
            if (r0 == 0) goto L69
            boolean r0 = X.C1110904Wd.LIZ()
            if (r0 == 0) goto L69
            r8 = r1
        L69:
            r3.LJJZZIII(r2, r8)
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6f:
            r0 = r8
            goto L37
        L71:
            float r0 = X.C715390S4j.LIZ
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent r0 = (com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent) r0
            android.view.View r0 = r0.LJJIJL()
            X.C715390S4j.LIZIZ(r4, r0)
            goto L6c
        L7f:
            float r0 = X.C715390S4j.LIZ
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent r0 = (com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent) r0
            android.view.View r1 = r0.LJJIJL()
            r0 = 4
            X.C715390S4j.LIZIZ(r0, r1)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S1110000_11.invoke$0(kotlin.jvm.internal.AwS18S1110000_11):java.lang.Object");
    }

    public static final Object invoke$1(AwS18S1110000_11 awS18S1110000_11) {
        int iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: mount process => fcp node key ");
        sbLIZ.append(awS18S1110000_11.s0);
        sbLIZ.append(". enable: ");
        sbLIZ.append(awS18S1110000_11.z2);
        sbLIZ.append(" --- condition hash: ");
        ConditionData conditionData = (ConditionData) awS18S1110000_11.l1;
        if (conditionData != null) {
            iHashCode = conditionData.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS18S1110000_11 awS18S1110000_11) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSlotVisibilityCascade aid=");
        sbLIZ.append(((C703900RjI) awS18S1110000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS18S1110000_11.s0);
        sbLIZ.append(" visible=");
        sbLIZ.append(awS18S1110000_11.z2);
        sbLIZ.append(" childCount=");
        Set<String> set = ((C703900RjI) awS18S1110000_11.l1).LJFF.get(awS18S1110000_11.s0);
        int size2 = 0;
        if (set != null) {
            size = set.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" pendingForSlot=");
        ArrayDeque<C703910RjJ> arrayDeque = ((C703900RjI) awS18S1110000_11.l1).LJ.get(awS18S1110000_11.s0);
        if (arrayDeque != null) {
            size2 = arrayDeque.size();
        }
        sbLIZ.append(size2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS18S1110000_11 awS18S1110000_11) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSlotVisibility aid=");
        sbLIZ.append(((C703900RjI) awS18S1110000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS18S1110000_11.s0);
        sbLIZ.append(" visible=");
        sbLIZ.append(awS18S1110000_11.z2);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS18S1110000_11.l1).LIZJ);
        sbLIZ.append(" pendingForSlot=");
        ArrayDeque<C703910RjJ> arrayDeque = ((C703900RjI) awS18S1110000_11.l1).LJ.get(awS18S1110000_11.s0);
        if (arrayDeque != null) {
            size = arrayDeque.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS18S1110000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1110000_11(C703900RjI c703900RjI, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c703900RjI;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S1110000_11(String str, boolean z, ConditionData conditionData, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = conditionData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S1110000_11(String str, String str2, boolean z, BaseCellSlotComponent<RECEIVER> baseCellSlotComponent) {
        super(0);
        this.$t = baseCellSlotComponent;
        this.s0 = str;
        this.z2 = str2;
        this.l1 = z;
    }
}
