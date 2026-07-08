package com.bytedance.touchpoint.core.pendant.manager;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C13054058y;
import X.C13LP;
import X.C1619720sFe;
import X.C1697810uHb;
import X.C1723230uwb;
import X.C1894320zOY;
import X.C1894330zOZ;
import X.C1894690zP9;
import X.C1895390zQH;
import X.C1895550zQX;
import X.C1896570zSB;
import X.C1896870zSf;
import X.C1896880zSg;
import X.C1896890zSh;
import X.C1896900zSi;
import X.C1896910zSj;
import X.C1896960zSo;
import X.C1897010zSt;
import X.C1899570zX1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C736820SvI;
import X.EnumC452301pR;
import X.InterfaceC1896760zSU;
import X.InterfaceC1896860zSe;
import Y.ARunnableS128S0100000_28;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.touchpoint.api.service.ITouchPointOptService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.ui.pendant.SpecActWidget;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS114S0110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SpecActPendantManager extends BasePendantManager implements View.OnClickListener {
    public static final C01GW<SpecActPendantManager> LLJJIJIIJIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1896960zSo());
    public static final List<String> LLJJIJIL = C1697810uHb.LJIIJJI("new", "top", "mood_boost");
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1896910zSj());
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1896570zSB());
    public final C1896870zSf LLJJIJI = new C1896870zSf();

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final void LJIIZILJ() {
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static boolean LJJIIZ() {
        C1896890zSh c1896890zSh = (C1896890zSh) C1619720sFe.LIZ.LIZ(1);
        if (c1896890zSh != null) {
            return c1896890zSh.LJIIIZ();
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final void LJIJ() {
        C1895550zQX.LL.getClass();
        if (C1895550zQX.LLILLL) {
            if (C1895550zQX.LLILLJJLI == null) {
                C1895550zQX.LLILLJJLI = C1894330zOZ.LIZ();
            }
            SpecActPendantManager specActPendantManager = C1895550zQX.LLILLJJLI;
            if (specActPendantManager != null) {
                specActPendantManager.LJJIFFI();
            }
        }
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final SpecActWidget LJIJI() {
        SpecActWidget specActWidget = new SpecActWidget();
        specActWidget.setOnClickListener(this);
        return specActWidget;
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final C1899570zX1 LJIJJ() {
        return C1899570zX1.LIZLLL.getValue();
    }

    @Override // com.bytedance.touchpoint.core.pendant.manager.BasePendantManager
    public final boolean LJIL() {
        NormalPendant normalPendant;
        C1894690zP9 c1894690zP9 = this.LL;
        if (c1894690zP9 == null || (normalPendant = c1894690zP9.LIZ) == null) {
            return false;
        }
        return C1723230uwb.LIZJ(normalPendant.lottieFileZip);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIII() {
        /*
            r4 = this;
            X.0zP9 r0 = r4.LL
            if (r0 == 0) goto Lc
            com.bytedance.touchpoint.api.model.NormalPendant r0 = r0.LIZ
            if (r0 == 0) goto Lc
            java.lang.String r1 = r0.normalJumpLink
            if (r1 != 0) goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        L16:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r3 = "enter_from"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r3)
            if (r0 == 0) goto L28
            int r0 = r0.length()
            if (r0 != 0) goto L3c
        L28:
            android.net.Uri$Builder r2 = r1.buildUpon()
            java.lang.String r1 = r4.LLJI
            java.lang.String r0 = "For You"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = "homepage_hot"
        L38:
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r3, r0)
        L3c:
            java.lang.String r0 = r1.toString()
            return r0
        L41:
            java.lang.String r0 = "homepage_follow"
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJJIII():java.lang.String");
    }

    public final Map<String, String> LJJIIJ() {
        NormalPendant normalPendant;
        String str;
        C1894690zP9 c1894690zP9 = this.LL;
        if (c1894690zP9 == null || (normalPendant = c1894690zP9.LIZ) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("touch_point_id", "1");
        String str2 = normalPendant.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("touch_point_name", str2);
        linkedHashMap.put("launch_plan_id", String.valueOf(normalPendant.LIZJ));
        Map<String, String> map = normalPendant.LJ;
        if (map != null && (str = map.get("program_id")) != null) {
            linkedHashMap.put("program_id", str);
        }
        linkedHashMap.put("feed_widget_status", LJJII());
        return linkedHashMap;
    }

    public final void LJJIIJZLJL() {
        C1896890zSh c1896890zSh;
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        C1896890zSh c1896890zSh2 = (C1896890zSh) c1619720sFe.LIZ(1);
        if (c1896890zSh2 == null || !c1896890zSh2.LIZJ() || (c1896890zSh = (C1896890zSh) c1619720sFe.LIZ(1)) == null) {
            return;
        }
        c1896890zSh.LJII(new AwS607S0100000_28(this, 33));
    }

    public final void LJJIIZI() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        C13054058y.LIZ(new ARunnableS128S0100000_28(this, 87));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee A[PHI: r8
      0x00ee: PHI (r8v1 int) = (r8v0 int), (r8v7 int), (r8v7 int) binds: [B:77:0x00eb, B:43:0x0079, B:45:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2 A[PHI: r8 r9
      0x00f2: PHI (r8v2 int) = (r8v1 int), (r8v6 int), (r8v6 int) binds: [B:80:0x00ef, B:48:0x0083, B:50:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r9v1 int) = (r9v0 int), (r9v5 int), (r9v5 int) binds: [B:80:0x00ef, B:48:0x0083, B:50:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6 A[PHI: r8 r9 r10
      0x00f6: PHI (r8v3 int) = (r8v2 int), (r8v5 int), (r8v5 int), (r8v5 int) binds: [B:83:0x00f3, B:53:0x008d, B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r9v2 int) = (r9v1 int), (r9v4 int), (r9v4 int), (r9v4 int) binds: [B:83:0x00f3, B:53:0x008d, B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v3 int), (r10v3 int) binds: [B:83:0x00f3, B:53:0x008d, B:55:0x0091, B:57:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJJIJIIJIL():boolean");
    }

    public SpecActPendantManager() {
        ITouchPointOptService.LIZ.getClass();
        ITouchPointOptService iTouchPointOptServiceLIZ = C1895390zQH.LIZ();
        if (iTouchPointOptServiceLIZ != null) {
            iTouchPointOptServiceLIZ.LIZ();
        }
        ((BaseTouchPointDataVM) this.LLIZ.getValue()).vQ2(new C2217381BqS() { // from class: X.0zSC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1896880zSg(this));
        ((BaseTouchPointDataVM) this.LLIZ.getValue()).vQ2(new C2217381BqS() { // from class: X.0zSD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1896900zSi(this));
    }

    public final void LJJIFFI() {
        if (LJIIJJI().isBound()) {
            String strLJIILLIIL = BasePendantManager.LJIILLIIL();
            if (strLJIILLIIL != null) {
                this.LLILZ.remove(strLJIILLIIL);
            }
            String strLJIILLIIL2 = BasePendantManager.LJIILLIIL();
            if (strLJIILLIIL2 != null) {
                this.LLILLL.remove(strLJIILLIIL2);
            }
            LJIIJJI().activateWidget(new AwS114S0110000_28(this, 3));
        }
    }

    public final String LJJII() {
        return LJIIJJI().normalPendantIsFold() ? "fold" : "unfold";
    }

    public final void LJJIJ() {
        LJJI();
        this.LLJJIII = false;
    }

    public final boolean LJJIJIIJI(String str) {
        List<String> list;
        String strLJIJI;
        C1894690zP9 c1894690zP9;
        NormalPendant normalPendant;
        List<String> list2;
        NormalPendant normalPendant2;
        NormalPendant normalPendant3;
        C1894690zP9 c1894690zP92 = this.LL;
        String strLJIJI2 = null;
        if (c1894690zP92 != null && (normalPendant3 = c1894690zP92.LIZ) != null) {
            list = normalPendant3.validPages;
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            C1894690zP9 c1894690zP93 = this.LL;
            if (c1894690zP93 != null && (normalPendant2 = c1894690zP93.LIZ) != null) {
                list2 = normalPendant2.validPages;
            } else {
                list2 = null;
            }
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJI2 = abstractC1896090zRP.LJIJI();
            }
            if (list2 == null || !(!list2.isEmpty()) || C13LP.LJJJJ(strLJIJI2, list2)) {
                return true;
            }
            return false;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP2 != null) {
            strLJIJI = abstractC1896090zRP2.LJIJI();
        } else {
            strLJIJI = null;
        }
        if (!Intrinsics.LJFF(strLJIJI, "stem")) {
            if (Intrinsics.LJFF("For You", str)) {
                List<String> list3 = LLJJIJIL;
                AbstractC1896090zRP abstractC1896090zRP3 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP3 != null) {
                    strLJIJI2 = abstractC1896090zRP3.LJIJI();
                }
                if (!C13LP.LJJJJ(strLJIJI2, list3)) {
                    return true;
                }
            }
            if (Intrinsics.LJFF("Following", str) && (c1894690zP9 = this.LL) != null && (normalPendant = c1894690zP9.LIZ) != null) {
                return normalPendant.showInFollow;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[PHI: r2
      0x00f6: PHI (r2v5 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:57:0x00f4, B:55:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[PHI: r2
      0x0106: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:57:0x00f4, B:59:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(boolean r8) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJJIJL(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[LOOP:0: B:36:0x0088->B:38:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.onClick(android.view.View):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0095. Please report as an issue. */
    public final void LJJIJIL(boolean z, boolean z2, boolean z3) {
        boolean z4;
        Boolean boolValueOf;
        int iIntValue;
        int iIntValue2;
        boolean z5;
        int iIntValue3;
        ArrayList<InterfaceC1896760zSU> arrayList = C1897010zSt.LIZ;
        InterfaceC1896860zSe interfaceC1896860zSeLJIIJJI = LJIIJJI();
        int iIntValue4 = 0;
        if (interfaceC1896860zSeLJIIJJI != null && interfaceC1896860zSeLJIIJJI.isBound()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean boolValueOf2 = null;
        if (z4 && ((interfaceC1896860zSeLJIIJJI != null && interfaceC1896860zSeLJIIJJI.isPendantShowing()) || z2 || z3)) {
            for (Bubble bubble : C1897010zSt.LJFF) {
                if (bubble.bubbleType == 9) {
                    Map<Integer, Integer> map = C1897010zSt.LJI;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Integer num = (Integer) linkedHashMap.get(9);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = bubble.showTimesEveryLaunch;
                    if (num2 != null && num2.intValue() > 0) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = Integer.MAX_VALUE;
                    }
                    if (iIntValue >= iIntValue2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(bubble.bubbleType);
                        sbLIZ.append(" show times(");
                        Integer num3 = (Integer) linkedHashMap.get(9);
                        if (num3 != null) {
                            iIntValue4 = num3.intValue();
                        }
                        sbLIZ.append(iIntValue4);
                        sbLIZ.append(") > max times(");
                        sbLIZ.append(bubble.showTimesEveryLaunch);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    Bubble currentBubble = interfaceC1896860zSeLJIIJJI.getCurrentBubble();
                    switch (bubble.bubbleType) {
                        case 16:
                            interfaceC1896860zSeLJIIJJI.showNormalShapeBubble(bubble, z, null);
                            z5 = false;
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        case 22:
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            if (!interfaceC1896860zSeLJIIJJI.normalPendantIsFold()) {
                                String str = bubble.longContent;
                                if (str == null) {
                                    str = "";
                                }
                                interfaceC1896860zSeLJIIJJI.showNormalLongBubble(str, "watch_video", bubble);
                                z5 = true;
                            }
                            z5 = false;
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        case 23:
                        case 27:
                        case 32:
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            interfaceC1896860zSeLJIIJJI.showNormalShapeBubble(bubble, z, null);
                            z5 = true;
                            break;
                        case 19:
                            interfaceC1896860zSeLJIIJJI.showNormalShapeBubble(bubble, z, AFwS217S0000000_28.get$arr$(520));
                            z5 = true;
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        case 31:
                            interfaceC1896860zSeLJIIJJI.showAntiFraudBubble(bubble);
                            z5 = true;
                            break;
                        case 21:
                        case 25:
                            interfaceC1896860zSeLJIIJJI.showNormalShapeBubble(bubble, z, null);
                            z5 = true;
                            break;
                        case 26:
                            interfaceC1896860zSeLJIIJJI.showReminderBubble(bubble);
                            z5 = false;
                            break;
                    }
                    Integer num4 = (Integer) linkedHashMap.get(9);
                    if (num4 != null) {
                        iIntValue3 = num4.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    map.put(9, Integer.valueOf(iIntValue3 + 1));
                    String str2 = bubble.LIZIZ;
                    if (str2 == null || str2.length() == 0 || !z5) {
                        return;
                    }
                    int i = bubble.bubbleType;
                    if ((i != 13 && i != 15) || currentBubble == null || currentBubble.bubbleType != i) {
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        int i2 = bubble.LIZ;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        String strValueOf = String.valueOf(bubble.bubbleType);
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        linkedHashMap2.put("sub_type", strValueOf);
                        linkedHashMap2.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                        linkedHashMap2.put("task_key", "");
                        Integer num5 = bubble.LIZJ;
                        c1894320zOY.getClass();
                        C1894320zOY.LJIJJ(i2, linkedHashMap2, num5, null, null, "");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("widget status does not match(isBound:");
        if (interfaceC1896860zSeLJIIJJI != null) {
            boolValueOf = Boolean.valueOf(interfaceC1896860zSeLJIIJJI.isBound());
        } else {
            boolValueOf = null;
        }
        sbLIZ2.append(boolValueOf);
        sbLIZ2.append(", isShowing:");
        if (interfaceC1896860zSeLJIIJJI != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC1896860zSeLJIIJJI.isPendantShowing());
        }
        sbLIZ2.append(boolValueOf2);
        sbLIZ2.append("), return.");
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
