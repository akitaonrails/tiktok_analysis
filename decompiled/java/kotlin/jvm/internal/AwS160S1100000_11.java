package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C0A49;
import X.C0S9I;
import X.C0SJJ;
import X.C0SX2;
import X.C0SX8;
import X.C0SXC;
import X.C0XQ7;
import X.C1247120iYg;
import X.C1260960iv0;
import X.C189200o6;
import X.C1894700zPA;
import X.C1897250zTH;
import X.C19EG;
import X.C20684815ws;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C2344009Gk;
import X.C700150RdF;
import X.C701360RfC;
import X.C701480RfO;
import X.C703900RjI;
import X.C706480RnS;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.InterfaceC702260Rge;
import X.InterfaceC702820RhY;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3UserInfoAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.FcpAbilityKt$createFcpComponentProtocol$1;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS160S1100000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS160S1100000_11 awS160S1100000_11) {
        ((C700150RdF) awS160S1100000_11.l1).LIZLLL(awS160S1100000_11.s0);
        ((C700150RdF) awS160S1100000_11.l1).LJ(awS160S1100000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS160S1100000_11 awS160S1100000_11) {
        ((C700150RdF) awS160S1100000_11.l1).LIZLLL(awS160S1100000_11.s0);
        ((C700150RdF) awS160S1100000_11.l1).LJ(awS160S1100000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runWhenSlotVisibleOrPend immediate_empty_slot aid=");
        sbLIZ.append(((C703900RjI) awS160S1100000_11.l1).LIZIZ);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS160S1100000_11.l1).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0SXD, android.view.ViewTreeObserver$OnPreDrawListener] */
    public static /* bridge */ /* synthetic */ Object invoke$11(AwS160S1100000_11 awS160S1100000_11) {
        String curUserId;
        C0SXC c0sxc = C0SXC.LIZ;
        TextView textView = (TextView) awS160S1100000_11.l1;
        c0sxc.getClass();
        C0SXC.LJIIIZ(textView);
        final TextView textView2 = (TextView) awS160S1100000_11.l1;
        C0SXC.LJI();
        ?? r1 = new ViewTreeObserver.OnPreDrawListener(textView2) { // from class: X.0SXD
            public final WeakReference<TextView> LL;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Rect rectLIZLLL;
                C0SXC c0sxc2 = C0SXC.LIZ;
                TextView textView3 = this.LL.get();
                c0sxc2.getClass();
                WeakReference<TextView> weakReference = C0SXC.LJI;
                TextView textView4 = weakReference != null ? weakReference.get() : null;
                if (textView3 == null) {
                    C0SXC.LIZ();
                    return true;
                }
                if (textView4 == textView3 && C0SXC.LJFF != null) {
                    Rect rectLIZJ = C0SXC.LIZJ(textView3);
                    if (rectLIZJ == null || (rectLIZLLL = C0SXC.LIZLLL(textView3)) == null || rectLIZJ.bottom <= rectLIZLLL.top || rectLIZJ.top >= rectLIZLLL.bottom) {
                        C0SXC.LIZ();
                        return true;
                    }
                    C0SXC.LJIIIZ(textView3);
                }
                return true;
            }

            {
                this.LL = new WeakReference<>(textView2);
            }
        };
        C0SXC.LJII = r1;
        C786410Ut5.y3(textView2.getViewTreeObserver(), r1);
        C0SX8 c0sx8 = C0SX8.LIZ;
        String str = awS160S1100000_11.s0;
        c0sx8.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_feature_onboarding", c2344009Gk.LIZ);
        try {
            curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            curUserId = "default";
        }
        Keva keva = (Keva) C0SXC.LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_onboarding_");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        BPEAHandler bPEAHandler = C0SXC.LIZLLL;
        C0SX2 c0sx2 = C0SXC.LJ;
        bPEAHandler.removeCallbacks(c0sx2);
        C786410Ut5.LJLIIL(3000L, bPEAHandler, c0sx2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS160S1100000_11 awS160S1100000_11) {
        if (!TextUtils.isEmpty(awS160S1100000_11.s0) && ((Boolean) C0A49.LIZ.getValue()).booleanValue()) {
            Object objLJ = ((LinkedHashMap) ((C1897250zTH) awS160S1100000_11.l1).LJFF).get(awS160S1100000_11.s0);
            if (objLJ == null) {
                C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                objLJ = C2178808gE.LIZ().LJ(((C1897250zTH) awS160S1100000_11.l1).LIZ);
                if (objLJ != null) {
                    C1897250zTH c1897250zTH = (C1897250zTH) awS160S1100000_11.l1;
                    c1897250zTH.LJFF.put(awS160S1100000_11.s0, (ReferralFeedBanner) objLJ);
                } else {
                    return null;
                }
            }
            return objLJ;
        }
        C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
        return C2178808gE.LIZ().LJ(((C1897250zTH) awS160S1100000_11.l1).LIZ);
    }

    public static final Object invoke$13(AwS160S1100000_11 awS160S1100000_11) {
        ((TextView) ((FriendsV3UserInfoAssem) awS160S1100000_11.l1).LLJLLIL.getValue()).setText(awS160S1100000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: request mount <= fcp node key ");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(". enable: ");
        sbLIZ.append(((ConditionData) awS160S1100000_11.l1).canApplySlot);
        sbLIZ.append(" --- condition hash: ");
        sbLIZ.append(((ConditionData) awS160S1100000_11.l1).hashCode());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: request un_mount <= fcp node key ");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(". --- condition hash: ");
        sbLIZ.append(((ConditionData) awS160S1100000_11.l1).hashCode());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS160S1100000_11 awS160S1100000_11) {
        return new C1260960iv0("chat", (User) awS160S1100000_11.l1, awS160S1100000_11.s0, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, EnumC1260920iuw.MESSAGE_CARD.getType(), (String) null, (String) null, "top", (String) null, (String) null, (String) null, 0, 0, (Boolean) null, 0, (String) null, false, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, 0, (String) null, (Boolean) null, (Map) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Long) null, 0, (Integer) null, (String) null, (String) null, 0, 0, (Integer) null, (Map) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (C1247120iYg) null, (Map) null, -9224, -1, 16383);
    }

    public static final Object invoke$17(AwS160S1100000_11 awS160S1100000_11) {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        Context context = (Context) awS160S1100000_11.l1;
        String str = awS160S1100000_11.s0;
        c706480RnS.getClass();
        C706480RnS.LJIIIZ(context, str);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS160S1100000_11 awS160S1100000_11) {
        C19EG c19egLIZ = C724240Sb0.LIZ((ReusedUISlotAssem) awS160S1100000_11.l1);
        if (c19egLIZ != null) {
            String str = awS160S1100000_11.s0;
            C706480RnS.LIZ.getClass();
            C706480RnS.LJIIIZ(c19egLIZ, str);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$19(AwS160S1100000_11 awS160S1100000_11) {
        C0S9I c0s9i = (C0S9I) awS160S1100000_11.l1;
        try {
            C2276411E8h.LIZIZ.LJI(4, "photomode_perf", c0s9i.getEventName(), awS160S1100000_11.s0);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS160S1100000_11 awS160S1100000_11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLIZ = ((FcpAbilityKt$createFcpComponentProtocol$1) awS160S1100000_11.l1).LIZ(awS160S1100000_11.s0);
        if (mapLIZ != null) {
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        return linkedHashMap;
    }

    public static final Object invoke$3(AwS160S1100000_11 awS160S1100000_11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC736810SvH interfaceC736810SvHLJFF = ((InterfaceC702260Rge) awS160S1100000_11.l1).LJFF(awS160S1100000_11.s0);
        if (interfaceC736810SvHLJFF != null && (interfaceC736810SvHLJFF instanceof InterfaceC702820RhY)) {
            for (Map.Entry<String, String> entry : ((InterfaceC702820RhY) interfaceC736810SvHLJFF).R9().entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Object invoke$4(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed FcpNode(");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(") receive timing callback. signal is empty! current_aid: ");
        sbLIZ.append(((C701360RfC) awS160S1100000_11.l1).LLJJ.LJLI());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS160S1100000_11 awS160S1100000_11) {
        C701480RfO c701480RfO = (C701480RfO) awS160S1100000_11.l1;
        String str = awS160S1100000_11.s0;
        c701480RfO.LJI(str, c701480RfO.LJFF(str), false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS160S1100000_11 awS160S1100000_11) {
        Boolean boolValueOf;
        int iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("condition: rebind => fcp node key ");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(". enable: ");
        ConditionData conditionData = (ConditionData) awS160S1100000_11.l1;
        if (conditionData != null) {
            boolValueOf = Boolean.valueOf(conditionData.canApplySlot);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" --- condition hash: ");
        ConditionData conditionData2 = (ConditionData) awS160S1100000_11.l1;
        if (conditionData2 != null) {
            iHashCode = conditionData2.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS160S1100000_11 r2) {
        /*
            java.lang.Object r0 = r2.l1
            X.0RfO r0 = (X.C701480RfO) r0
            X.0ReC r1 = r0.LJ
            java.lang.String r0 = r0.LIZ
            com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel r0 = r1.kn(r0)
            if (r0 == 0) goto L26
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.banner.ConditionData> r1 = r0.componentsConditionMap
            if (r1 == 0) goto L26
            java.lang.String r0 = r2.s0
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.feed.model.banner.ConditionData r0 = (com.ss.android.ugc.aweme.feed.model.banner.ConditionData) r0
            if (r0 == 0) goto L26
            boolean r1 = r0.canApplyDisplay
            r0 = 1
            if (r1 != r0) goto L26
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L26:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS160S1100000_11.invoke$7(kotlin.jvm.internal.AwS160S1100000_11):java.lang.Object");
    }

    public static final Object invoke$8(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rebuildLongTextComponentBuilder original: ");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(" new: ");
        sbLIZ.append(((C0SJJ) awS160S1100000_11.l1).LLJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS160S1100000_11 awS160S1100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePendingTasks finish aid=");
        sbLIZ.append(((C703900RjI) awS160S1100000_11.l1).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS160S1100000_11.s0);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS160S1100000_11.l1).LIZJ);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS160S1100000_11.l1).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(C700150RdF c700150RdF, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c700150RdF;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(C701480RfO c701480RfO, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c701480RfO;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(InterfaceC702260Rge interfaceC702260Rge, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC702260Rge;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(C703900RjI c703900RjI, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c703900RjI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(C0S9I c0s9i, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0s9i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(TextView textView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = textView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS160S1100000_11(ReusedUISlotAssem reusedUISlotAssem, ReusedUISlotAssem<Object> reusedUISlotAssem2, String str) {
        super(0);
        this.$t = str;
        this.l1 = reusedUISlotAssem;
        this.s0 = reusedUISlotAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(FriendsV3UserInfoAssem friendsV3UserInfoAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = friendsV3UserInfoAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(User user, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = user;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fcpAbilityKt$createFcpComponentProtocol$1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(String str, C701360RfC c701360RfC, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c701360RfC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(String str, C0SJJ c0sjj, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0sjj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(String str, C1897250zTH c1897250zTH, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1897250zTH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S1100000_11(String str, ConditionData conditionData, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = conditionData;
    }
}
