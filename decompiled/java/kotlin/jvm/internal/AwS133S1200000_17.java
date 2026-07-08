package kotlin.jvm.internal;

import X.AbstractC1114210f6J;
import X.C09AY;
import X.C1093040eYA;
import X.C1093140eYK;
import X.C1093150eYL;
import X.C1101780emG;
import X.C1101790emH;
import X.C1110090ezf;
import X.C1124580fN2;
import X.C1127390fRZ;
import X.C19322110iZ;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC1092770eXj;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS133S1200000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS133S1200000_17 awS133S1200000_17) {
        C1110090ezf.LIZIZ((AbstractC1114210f6J) awS133S1200000_17.l1, (TextView) awS133S1200000_17.l2, awS133S1200000_17.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS133S1200000_17 awS133S1200000_17) {
        C19322110iZ.LIZLLL((FragmentManager) awS133S1200000_17.l1, CampaignRechargePanel.class, awS133S1200000_17.s0, null, (Bundle) awS133S1200000_17.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS133S1200000_17 awS133S1200000_17) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.requestExpandShortTouch onActivate -> success, id=");
        sbLIZ.append(((C1101780emG) awS133S1200000_17.l1).LIZ);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) awS133S1200000_17.l2;
        C1101780emG c1101780emG = (C1101780emG) awS133S1200000_17.l1;
        function1.invoke(new C1101790emH(c1101780emG.LIZ, c1101780emG.LIZLLL, c1101780emG.LIZJ, awS133S1200000_17.s0, Boolean.TRUE, null, null, c1101780emG.LIZIZ, 96));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS133S1200000_17 awS133S1200000_17) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.requestExpandShortTouch onInactivate -> forceShrink, id=");
        sbLIZ.append(((C1101780emG) awS133S1200000_17.l1).LIZ);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) awS133S1200000_17.l2;
        C1101780emG c1101780emG = (C1101780emG) awS133S1200000_17.l1;
        function1.invoke(new C1101790emH(c1101780emG.LIZ, c1101780emG.LIZLLL, c1101780emG.LIZJ, awS133S1200000_17.s0, null, null, null, c1101780emG.LIZIZ, 112));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS133S1200000_17 awS133S1200000_17) {
        Object obj;
        String str;
        String str2;
        String str3;
        C1093140eYK c1093140eYK;
        C1093140eYK c1093140eYK2;
        C1093140eYK c1093140eYK3;
        InterfaceC1092770eXj interfaceC1092770eXj = (InterfaceC1092770eXj) awS133S1200000_17.l1;
        if (interfaceC1092770eXj != null) {
            String str4 = awS133S1200000_17.s0;
            C1093150eYL c1093150eYL = (C1093150eYL) awS133S1200000_17.l2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean boolValueOf = null;
            if (c1093150eYL != null && (c1093140eYK3 = c1093150eYL.LIZIZ) != null) {
                obj = c1093140eYK3.LIZJ;
            } else {
                obj = null;
            }
            linkedHashMap.put("result", obj);
            if (c1093150eYL != null && (c1093140eYK2 = c1093150eYL.LIZIZ) != null) {
                str = c1093140eYK2.LIZ;
            } else {
                str = null;
            }
            linkedHashMap.put("bizName", str);
            if (c1093150eYL != null && (c1093140eYK = c1093150eYL.LIZIZ) != null) {
                str2 = c1093140eYK.LIZIZ;
            } else {
                str2 = null;
            }
            linkedHashMap.put("ruleName", str2);
            if (c1093150eYL != null) {
                str3 = c1093150eYL.LIZJ;
            } else {
                str3 = null;
            }
            linkedHashMap.put("error", str3);
            if (c1093150eYL != null) {
                boolValueOf = Boolean.valueOf(c1093150eYL.LIZ);
            }
            linkedHashMap.put("success", boolValueOf);
            interfaceC1092770eXj.LIZLLL(new C1093040eYA(str4, c1093150eYL, linkedHashMap));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS133S1200000_17 r14) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r14.l1
            X.0fRZ r0 = (X.C1127390fRZ) r0
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r0.LJJJJJL()
            r9 = 0
            if (r0 == 0) goto L8d
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LL
            if (r1 == 0) goto L8d
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r7 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r7
        L17:
            java.lang.Object r2 = r14.l1
            X.0fRZ r2 = (X.C1127390fRZ) r2
            android.content.Context r6 = r2.LL
            java.lang.Object r0 = r14.l2
            com.bytedance.android.livesdk.model.GiftPanelBanner r0 = (com.bytedance.android.livesdk.model.GiftPanelBanner) r0
            java.lang.String r3 = r14.s0
            java.lang.String r0 = r0.schemaUrl
            java.lang.String r4 = "gift_bar"
            if (r0 == 0) goto L8a
            if (r7 == 0) goto L46
            com.bytedance.android.live.base.model.user.User r0 = r7.getOwner()
            if (r0 == 0) goto L74
            boolean r1 = r0.isSubscribed()
            r0 = 1
            if (r1 != r0) goto L74
        L38:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            r0.w2()
            X.C494790Jan.LJIIJJI(r6, r7, r4, r9)
        L46:
            java.lang.String r0 = "livesdk_subscribe_icon_click"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r2.LJJJJJL()
            if (r0 == 0) goto L72
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LL
        L54:
            r1.LJIJJLI(r0)
            java.lang.String r0 = "click_position"
            r1.LJJII(r4, r0)
            java.lang.String r0 = "user_type"
            r1.LJJII(r3, r0)
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r2.LJJJJJL()
            if (r0 == 0) goto L69
            com.bytedance.ies.sdk.datachannel.DataChannel r9 = r0.LL
        L69:
            X.C518420KUu.LIZIZ(r1, r9)
            r1.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L72:
            r0 = r9
            goto L54
        L74:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            X.0Jan r5 = r0.w2()
            java.lang.String r8 = "gift_bar"
            r11 = 0
            r10 = r9
            r13 = r11
            r5.LIZ(r6, r7, r8, r9, r10, r11, r13)
            goto L46
        L8a:
            if (r7 == 0) goto L46
            goto L38
        L8d:
            r7 = r9
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S1200000_17.invoke$5(kotlin.jvm.internal.AwS133S1200000_17):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS133S1200000_17 r14) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r14.l1
            X.0fN2 r0 = (X.C1124580fN2) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LLILLJJLI
            r5 = 0
            if (r1 == 0) goto L7a
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r7 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r7
        L11:
            java.lang.Object r2 = r14.l1
            X.0fN2 r2 = (X.C1124580fN2) r2
            android.content.Context r6 = r2.LL
            java.lang.Object r0 = r14.l2
            com.bytedance.android.livesdk.model.GiftPanelBanner r0 = (com.bytedance.android.livesdk.model.GiftPanelBanner) r0
            java.lang.String r3 = r14.s0
            java.lang.String r0 = r0.schemaUrl
            java.lang.String r4 = "gift_bar"
            if (r0 == 0) goto L77
            if (r7 == 0) goto L40
            com.bytedance.android.live.base.model.user.User r0 = r7.getOwner()
            if (r0 == 0) goto L60
            boolean r1 = r0.isSubscribed()
            r0 = 1
            if (r1 != r0) goto L60
        L32:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            r0.w2()
            X.C494790Jan.LJIIJJI(r6, r7, r4, r5)
        L40:
            java.lang.String r0 = "livesdk_subscribe_icon_click"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r2.LLILLJJLI
            r1.LJIJJLI(r0)
            java.lang.String r0 = "click_position"
            r1.LJJII(r4, r0)
            java.lang.String r0 = "user_type"
            r1.LJJII(r3, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r2.LLILLJJLI
            X.C518420KUu.LIZIZ(r1, r0)
            r1.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService) r0
            X.0Jan r5 = r0.w2()
            java.lang.String r8 = "gift_bar"
            r9 = 0
            r11 = 0
            r10 = r9
            r13 = r11
            r5.LIZ(r6, r7, r8, r9, r10, r11, r13)
            goto L40
        L77:
            if (r7 == 0) goto L40
            goto L32
        L7a:
            r7 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S1200000_17.invoke$6(kotlin.jvm.internal.AwS133S1200000_17):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1200000_17(InterfaceC1092770eXj interfaceC1092770eXj, String str, C1093150eYL c1093150eYL, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1092770eXj;
        this.s0 = str;
        this.l2 = c1093150eYL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S1200000_17(C1101780emG c1101780emG, C1101780emG c1101780emG2, Function1<? super C1101790emH, Unit> function1, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1101780emG;
        this.l2 = c1101780emG2;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1200000_17(AbstractC1114210f6J abstractC1114210f6J, TextView textView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1114210f6J;
        this.l2 = textView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1200000_17(C1124580fN2 c1124580fN2, GiftPanelBanner giftPanelBanner, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1124580fN2;
        this.l2 = giftPanelBanner;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1200000_17(C1127390fRZ c1127390fRZ, GiftPanelBanner giftPanelBanner, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1127390fRZ;
        this.l2 = giftPanelBanner;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S1200000_17(Bundle bundle, FragmentManager fragmentManager, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragmentManager;
        this.s0 = str;
        this.l2 = bundle;
    }
}
