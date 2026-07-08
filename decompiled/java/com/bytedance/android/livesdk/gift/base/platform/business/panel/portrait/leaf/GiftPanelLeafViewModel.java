package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf;

import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C01GW;
import X.C0UX6;
import X.C1121600fIE;
import X.C1124350fMf;
import X.C1129370fUl;
import X.C1130100fVw;
import X.C1130930fXH;
import X.C1131340fXw;
import X.C1131900fYq;
import X.C1148030fyr;
import X.C1161920gLG;
import X.C13LQ;
import X.C1954807lC;
import X.C497740JfY;
import X.EnumC1130940fXI;
import X.InterfaceC1094160eZy;
import X.InterfaceC1106030et7;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractivePanelSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.reddot.RedDotAssetsSetting;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.BagItem;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelLeafViewModel extends ViewModel {
    public boolean LLJJJ;
    public final MutableLiveData<GiftPanelBanner> LL = new MutableLiveData<>();
    public final MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>(1);
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>(1);
    public final MutableLiveData<Long> LLILZIL = new MutableLiveData<>(Long.valueOf(C1131900fYq.LIZIZ(C497740JfY.LJII(), "default_dialog_item")));
    public String LLILZLL = "";
    public final Map<Long, Integer> LLIZ = new LinkedHashMap();
    public final LinkedList<Integer> LLIZLLLIL = new LinkedList<>();
    public final LinkedList<Long> LLJ = new LinkedList<>();
    public final LinkedList<String> LLJI = new LinkedList<>();
    public final LinkedList<String> LLJIJIL = new LinkedList<>();
    public final LinkedList<Integer> LLJILJIL = new LinkedList<>();
    public final Map<Long, String> LLJILJILJ = new LinkedHashMap();
    public final LinkedList<C1129370fUl> LLJILLL = new LinkedList<>();
    public final LinkedList<Long> LLJJ = new LinkedList<>();
    public final LinkedList<String> LLJJI = new LinkedList<>();
    public final LinkedList<Long> LLJJIII = new LinkedList<>();
    public final LinkedList<Integer> LLJJIJI = new LinkedList<>();
    public final LinkedList<Integer> LLJJIJIIJIL = new LinkedList<>();
    public final long LLJJIJIL = 7777777;
    public final MutableLiveData<EnumC1130940fXI> LLJJJIL = new MutableLiveData<>(EnumC1130940fXI.DEFAULT);
    public final NextLiveData<C1124350fMf> LLJJJJ = new NextLiveData<>();
    public final Set<Integer> LLJJJJJIL = C13LQ.LJLIIL(new Integer[]{15, 16, 18, 20});

    public static boolean yQ2() {
        C01GW c01gw = C1131340fXw.LIZ;
        List list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            BagItem bagItem = (BagItem) next;
            if (bagItem.available && bagItem.itemType == 101) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean DQ2() {
        Integer value = this.LLILLL.getValue();
        return value != null && value.intValue() == 1 && C1130100fVw.LIZ.LJFF == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean BQ2(int i) {
        boolean z;
        Integer value;
        if (i != 1) {
            switch (i) {
                case 15:
                    MutableLiveData<Integer> mutableLiveData = this.LLILLL;
                    if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null && value.intValue() == 15) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean boolLIZIZ = InterfaceC1094160eZy.u1.LIZIZ();
                    boolean zIA2 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).iA2(z);
                    if (boolLIZIZ.booleanValue() || zIA2) {
                        return true;
                    }
                    return false;
                case 16:
                    if (!C1121600fIE.LIZ.getBoolean(C1121600fIE.LIZ(), false) || yQ2()) {
                        return true;
                    }
                    if (C1131340fXw.LIZLLL() && (!r1.getBoolean(C1121600fIE.LIZJ(), false))) {
                        return true;
                    }
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    if (LiveGiftInteractivePanelSetting.INSTANCE.isEnable() && !InterfaceC1106030et7.M6.LIZIZ().booleanValue()) {
                        return true;
                    }
                    return false;
            }
        }
        return false;
    }

    public final C0UX6 vQ2(int i) {
        if (i != 16) {
            if (i == 17 && RedDotAssetsSetting.INSTANCE.enableAssetsRedDot()) {
                return C0UX6.RED_DOT_LIVE_GIFT_PANEL_INTERACTIVE_GIFT_TAB;
            }
            return null;
        }
        if (RedDotAssetsSetting.INSTANCE.enableAssetsRedDot()) {
            if (yQ2()) {
                return C0UX6.RED_DOT_LIVE_GIFT_PANEL_CAMPAIGN_T25_FEST_VOTE_BACKPACK_TAB;
            }
            return C0UX6.RED_DOT_LIVE_GIFT_PANEL_BACKPACK_TAB;
        }
        return null;
    }

    public static int xQ2(int i, EnumC1130940fXI enumC1130940fXI) {
        if (i == 1) {
            int i2 = C1130930fXH.LIZ[enumC1130940fXI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return R.drawable.ev5;
                    }
                    throw new C1954807lC();
                }
                return R.drawable.ev4;
            }
            return R.drawable.ev3;
        }
        return 0;
    }

    public static boolean zQ2(RecyclerView recyclerView, View view) {
        int bottom;
        int top;
        int top2;
        int bottom2;
        if (view != null) {
            bottom = view.getBottom();
            top = view.getTop();
        } else {
            bottom = 0;
            top = 0;
        }
        int i = bottom - top;
        if (view != null) {
            top2 = view.getTop();
        } else {
            top2 = 0;
        }
        double d = i;
        if (top2 < (-0.5d) * d) {
            return false;
        }
        if (view != null) {
            bottom2 = view.getBottom();
        } else {
            bottom2 = Integer.MAX_VALUE;
        }
        if (bottom2 >= ((double) recyclerView.getHeight()) + (d * 0.5d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(X.RunnableC781530UlD r23, androidx.recyclerview.widget.GridLayoutManager r24, java.util.LinkedList r25) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel.CQ2(X.0UlD, androidx.recyclerview.widget.GridLayoutManager, java.util.LinkedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[LOOP:0: B:5:0x000f->B:11:0x0029, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[EDGE_INSN: B:23:0x0046->B:20:0x0046 BREAK  A[LOOP:0: B:5:0x000f->B:11:0x0029], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> wQ2(androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.GridLayoutManager r11, java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r12) {
        /*
            r9 = this;
            int r6 = r11.findFirstVisibleItemPosition()
            int r5 = r11.findLastVisibleItemPosition()
            r4 = -1
            if (r5 < 0) goto L44
            r3 = -1
            r8 = -1
            r2 = 0
            r7 = 0
        Lf:
            if (r12 == 0) goto L2c
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r12)
            X.0fQI r0 = (X.AbstractC1126600fQI) r0
            if (r0 == 0) goto L2c
            int r0 = r0.LIZ
            java.util.Set<java.lang.Integer> r1 = r9.LLJJJJJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2c
        L27:
            if (r2 == r5) goto L46
            int r2 = r2 + 1
            goto Lf
        L2c:
            if (r2 < r6) goto L3c
            android.view.View r0 = r11.findViewByPosition(r2)
            boolean r0 = zQ2(r10, r0)
            if (r0 == 0) goto L3c
            if (r3 != r4) goto L3b
            r3 = r7
        L3b:
            r8 = r7
        L3c:
            X.195h r0 = r11.LLIZ
            int r0 = r0.LJFF(r2)
            int r7 = r7 + r0
            goto L27
        L44:
            r8 = -1
            goto L47
        L46:
            r4 = r3
        L47:
            int r0 = r4 / 4
            int r0 = r0 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r8 / 4
            int r0 = r0 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel.wQ2(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.GridLayoutManager, java.util.LinkedList):kotlin.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f9 A[LOOP:0: B:10:0x0044->B:111:0x02f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0334 A[EDGE_INSN: B:261:0x0334->B:127:0x0334 BREAK  A[LOOP:0: B:10:0x0044->B:111:0x02f9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[PHI: r3
      0x0082: PHI (r3v113 X.0fQI) = (r3v112 X.0fQI), (r3v112 X.0fQI), (r3v112 X.0fQI), (r3v112 X.0fQI), (r3v112 X.0fQI), (r3v112 X.0fQI), (r3v119 X.0fQI) binds: [B:22:0x006c, B:24:0x0070, B:26:0x0074, B:28:0x0078, B:122:0x0326, B:31:0x0080, B:20:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(X.RunnableC781530UlD r44, androidx.recyclerview.widget.GridLayoutManager r45, java.util.LinkedList r46, java.util.List r47, java.util.Map r48, java.util.List r49, java.util.List r50, X.C1128600fTW r51, java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel.AQ2(X.0UlD, androidx.recyclerview.widget.GridLayoutManager, java.util.LinkedList, java.util.List, java.util.Map, java.util.List, java.util.List, X.0fTW, java.lang.String):void");
    }
}
