package kotlin.jvm.internal;

import X.C09AY;
import X.C1294730jnT;
import X.C13BV;
import X.C13LP;
import X.C16F5;
import X.C930230aJZ;
import X.C930360aJm;
import X.C937280aUw;
import X.C940770aaZ;
import X.C948360amo;
import X.C948400ams;
import X.InterfaceC930220aJY;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS42S0301000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS42S0301000_15 awS42S0301000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C930360aJm) awS42S0301000_15.l0).LIZIZ((Boolean) ((LiveData) awS42S0301000_15.l1).getValue(), "updateGuestMirrorStatus failed", (Boolean) ((LiveData) awS42S0301000_15.l2).getValue(), Integer.valueOf(awS42S0301000_15.i3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S0301000_15 awS42S0301000_15, Object obj) {
        List listLJLIL;
        C1294730jnT c1294730jnT = (C1294730jnT) obj;
        int i = awS42S0301000_15.i3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    listLJLIL = C13BV.INSTANCE;
                } else {
                    listLJLIL = C13LP.LJLIL((List) awS42S0301000_15.l0, (List) awS42S0301000_15.l2);
                }
            } else {
                listLJLIL = C13LP.LJLIL((List) awS42S0301000_15.l1, (List) awS42S0301000_15.l2);
            }
        } else {
            listLJLIL = C13LP.LJLIL((List) awS42S0301000_15.l1, (List) awS42S0301000_15.l0);
        }
        return Boolean.valueOf(listLJLIL.contains(c1294730jnT.LIZJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[PHI: r6
      0x0041: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:10:0x003f, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[PHI: r6
      0x0045: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:10:0x003f, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[PHI: r6 r7
      0x0048: PHI (r6v1 java.lang.String) = (r6v3 java.lang.String), (r6v4 java.lang.String) binds: [B:14:0x0046, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r7v0 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String) binds: [B:14:0x0046, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS42S0301000_15 r12, java.lang.Object r13) {
        /*
            tikcast.linkmic.common.LayoutState r13 = (tikcast.linkmic.common.LayoutState) r13
            java.lang.Object r2 = r12.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r2 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract) r2
            r3 = 1
            r2.isLayoutOperationEnable = r3
            java.lang.Object r1 = r12.l1
            X.0aJZ r1 = (X.C930230aJZ) r1
            int r0 = r12.i3
            r1.LIZ = r0
            X.0amo r2 = r2.LJIIIZ()
            if (r2 == 0) goto L26
            int r1 = r12.i3
            r0 = -1
            r2.LLIZ = r0
            r2.LLLJ(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.notifyItemChanged(r1, r0)
        L26:
            java.lang.String r2 = "click"
            java.lang.Object r0 = r12.l1
            X.0aJZ r0 = (X.C930230aJZ) r0
            java.lang.String r3 = r0.LIZJ
            java.lang.String r4 = r0.LIZLLL
            int r0 = r0.LIZIZ
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r8 = ""
            if (r13 == 0) goto L3e
            java.lang.String r6 = r13.layoutId
            if (r6 != 0) goto L41
        L3e:
            r6 = r8
            if (r13 == 0) goto L45
        L41:
            java.lang.String r7 = r13.layoutKey
            if (r7 != 0) goto L48
        L45:
            r7 = r8
            if (r13 == 0) goto L59
        L48:
            tikcast.linkmic.common.MultiGuestLayoutExtra r0 = r13.multiGuestLayoutExtra
            if (r0 == 0) goto L59
            int r0 = r0.currentPanelLayoutType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L59
            r8 = r0
        L59:
            java.lang.String r9 = "1"
            java.lang.Object r0 = r12.l2
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.next()
            X.0ams r0 = (X.C948400ams) r0
            int r0 = r0.LIZIZ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L68
            r10.add(r0)
            goto L68
        L80:
            java.lang.String r11 = "origin_panel"
            java.lang.Object r0 = r12.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract) r0
            java.lang.String r12 = r0.LJJIL()
            X.0aM1 r1 = new X.0aM1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C931740aM0.LJIIJJI(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS42S0301000_15.invoke$2(kotlin.jvm.internal.AwS42S0301000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS42S0301000_15 awS42S0301000_15, Object obj) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        C16F5 c16f5 = ((LayoutSettingContract) awS42S0301000_15.l0).maxPosCountTvV3;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(iIntValue));
        }
        TextView textView = (TextView) ((View) awS42S0301000_15.l1).findViewById(R.id.o4p);
        if (textView != null) {
            textView.setText(String.valueOf(iIntValue));
        }
        ((PopupWindow) awS42S0301000_15.l2).dismiss();
        if (C937280aUw.LIZ(((LayoutSettingContract) awS42S0301000_15.l0).source)) {
            ((LayoutSettingContract) awS42S0301000_15.l0).simpleLayoutDataSourceForV3.LIZLLL(iIntValue + 1);
            C948360amo c948360amoLJIIIZ = ((LayoutSettingContract) awS42S0301000_15.l0).LJIIIZ();
            if (c948360amoLJIIIZ != null && (i = c948360amoLJIIIZ.LLILZLL) >= 0 && i < c948360amoLJIIIZ.getItemCount() && c948360amoLJIIIZ.LLLJIL(c948360amoLJIIIZ.LLILZLL)) {
                c948360amoLJIIIZ.notifyItemChanged(c948360amoLJIIIZ.LLILZLL);
            }
        } else {
            InterfaceC930220aJY interfaceC930220aJY = ((LayoutSettingContract) awS42S0301000_15.l0).simpleLayoutDataSourceForV3;
            int i2 = iIntValue + 1;
            interfaceC930220aJY.LJ(interfaceC930220aJY.getPanelLayoutType(), i2);
            C940770aaZ.LIZ().getAction().LJFF(((LayoutSettingContract) awS42S0301000_15.l0).simpleLayoutDataSourceForV3.getPanelLayoutType(), i2, new AwS27S0102000_15(awS42S0301000_15.i3, iIntValue, (LayoutSettingContract) awS42S0301000_15.l0, 0), new AwS27S0102000_15(awS42S0301000_15.i3, iIntValue, (LayoutSettingContract) awS42S0301000_15.l0, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0301000_15(int i, int i2, List<String> list, List<String> list2, List<String> list3) {
        super(1);
        this.$t = list3;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = list;
        this.l2 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0301000_15(C930360aJm c930360aJm, C930360aJm c930360aJm2, int i, LiveData<Boolean> liveData, LiveData<Boolean> liveData2) {
        super(1);
        this.$t = liveData2;
        this.l0 = c930360aJm;
        this.i3 = c930360aJm2;
        this.l1 = i;
        this.l2 = liveData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0301000_15(LayoutSettingContract layoutSettingContract, LayoutSettingContract layoutSettingContract2, C930230aJZ c930230aJZ, int i, List<C948400ams> list) {
        super(1);
        this.$t = list;
        this.l0 = layoutSettingContract;
        this.l1 = layoutSettingContract2;
        this.i3 = c930230aJZ;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0301000_15(LayoutSettingContract layoutSettingContract, View view, PopupWindow popupWindow, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = layoutSettingContract;
        this.l1 = view;
        this.l2 = popupWindow;
        this.i3 = i;
    }
}
