package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0SVD;
import X.C0SY7;
import X.C1607100rvI;
import X.C296550Bjp;
import X.C705440Rlm;
import X.C707400Row;
import X.C786410Ut5;
import X.EnumC1260930iux;
import X.EnumC1450305m1;
import X.InterfaceC707420Roy;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerTracerInfoStruct;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AwS289S0300000_11 extends C09AY implements Function2 {
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
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS289S0300000_11 awS289S0300000_11, Object obj, Object obj2) {
        BannerTracerInfoStruct bannerTracerInfoStruct;
        String str;
        Map<String, String> mapLIZ;
        String string;
        BannerCommonStruct bannerCommonStruct = (BannerCommonStruct) ((Function0) awS289S0300000_11.l0).invoke();
        C707400Row.LIZ.getClass();
        if (bannerCommonStruct != null && (bannerTracerInfoStruct = bannerCommonStruct.tracerInfo) != null && (str = bannerTracerInfoStruct.tracerInfoValue) != null && str.length() != 0) {
            View viewLJJIJL = ((FeedCommonBannerTrigger) awS289S0300000_11.l2).LJJIJL();
            InterfaceC707420Roy interfaceC707420Roy = (InterfaceC707420Roy) awS289S0300000_11.l1;
            if (interfaceC707420Roy != null) {
                mapLIZ = interfaceC707420Roy.LIZ();
            } else {
                mapLIZ = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : C707400Row.LIZ(bannerCommonStruct).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (Intrinsics.LJFF(key, "btm")) {
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    if (value == null) {
                        value = null;
                    }
                    for (Map.Entry entry2 : BtmSDK.createReportParams$default(btmSDK, String.valueOf(value), PageFinder.via(viewLJJIJL), null, 4, null).entrySet()) {
                        Object key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (value2 != null) {
                            string = value2.toString();
                        } else {
                            string = null;
                        }
                        linkedHashMap.put(key2, string);
                    }
                } else {
                    linkedHashMap.put(key, value);
                }
            }
            if (mapLIZ != null && !mapLIZ.isEmpty()) {
                linkedHashMap.putAll(mapLIZ);
            }
            return linkedHashMap;
        }
        InterfaceC707420Roy interfaceC707420Roy2 = (InterfaceC707420Roy) awS289S0300000_11.l1;
        if (interfaceC707420Roy2 == null) {
            return null;
        }
        return interfaceC707420Roy2.LIZ();
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS289S0300000_11 awS289S0300000_11, Object obj, Object obj2) {
        PriorityProtocol priorityProtocol = (PriorityProtocol) obj;
        if (((Boolean) obj2).booleanValue()) {
            Function1 function1 = (Function1) awS289S0300000_11.l0;
            if (function1 != null) {
                function1.invoke(priorityProtocol.Vt());
            }
        } else {
            C786410Ut5.LJLLLLLL(0, ((FcpMetaTagContainer) awS289S0300000_11.l1).LJJIJL());
            View viewVt = priorityProtocol.Vt();
            Function1 function12 = (Function1) awS289S0300000_11.l2;
            if (function12 != null) {
                function12.invoke(viewVt);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS289S0300000_11 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.050n r8 = (X.C12835050n) r8
            java.lang.Object r1 = r7.l0
            X.05m1 r1 = (X.EnumC1450305m1) r1
            X.05m1 r0 = X.EnumC1450305m1.BY_PASS
            r4 = 1
            if (r1 == r0) goto L63
            boolean r0 = r9 instanceof X.InterfaceC700210RdL
            r1 = 0
            if (r0 == 0) goto L68
            X.0RdL r9 = (X.InterfaceC700210RdL) r9
            if (r9 == 0) goto L69
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol r0 = (com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol) r0
            boolean r6 = X.C700140RdE.LIZJ(r8, r0, r9)
            if (r6 != 0) goto L6a
            java.lang.String r5 = "don't handle signal"
        L20:
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            if (r9 == 0) goto L29
            java.lang.String r1 = r9.LIZ()
        L29:
            java.util.List r2 = X.C1697810uHb.LJIIL(r1)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "incoming_signal"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_accepted"
            r1.<init>(r0, r2)
            r3[r4] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            r8.LIZ(r5, r0)
            if (r6 == 0) goto L62
            java.lang.Object r1 = r7.l2
            com.ss.android.ugc.aweme.feed.model.banner.ConditionData r1 = (com.ss.android.ugc.aweme.feed.model.banner.ConditionData) r1
            int r0 = r1.slotConsumeTimes
            if (r0 > 0) goto L56
            r4 = 0
        L56:
            r1.setCanApplySlot(r4)
            java.lang.Object r1 = r7.l2
            com.ss.android.ugc.aweme.feed.model.banner.ConditionData r1 = (com.ss.android.ugc.aweme.feed.model.banner.ConditionData) r1
            boolean r0 = r1.canApplySlot
            r1.setCanApplyDisplay(r0)
        L62:
            r4 = r6
        L63:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L68:
            r9 = r1
        L69:
            r6 = 1
        L6a:
            r5 = r1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS289S0300000_11.invoke$2(kotlin.jvm.internal.AwS289S0300000_11, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS289S0300000_11 awS289S0300000_11, Object obj, Object obj2) {
        String requestId;
        C1607100rvI c1607100rvI = (C1607100rvI) awS289S0300000_11.l0;
        User user = (User) awS289S0300000_11.l1;
        c1607100rvI.getClass();
        if (user != null) {
            C0SVD c0svd = C0SVD.LL;
            String strLJFF = c1607100rvI.LJFF();
            EnumC1260930iux enumC1260930iux = EnumC1260930iux.FOLLOW;
            if (C296550Bjp.LIZ()) {
                requestId = user.getRequestId();
            } else {
                requestId = null;
            }
            c0svd.LJFF(strLJFF, "top_cell", enumC1260930iux, user, requestId, true);
        }
        if (obj2 == C0SY7.FOLLOWED || obj2 == C0SY7.FOLLOW_MUTUAL) {
            ((C0SVD) ((C1607100rvI) awS289S0300000_11.l0).LJ.getValue()).LIZIZ(102, (User) awS289S0300000_11.l1, ((C1607100rvI) awS289S0300000_11.l0).LJFF());
            ISkylightMafService iSkylightMafService = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null);
            if (iSkylightMafService != null) {
                iSkylightMafService.LJ();
            }
        }
        if (obj2 == C0SY7.UNFOLLOW) {
            ((C0SVD) ((C1607100rvI) awS289S0300000_11.l0).LJ.getValue()).LIZIZ(103, (User) awS289S0300000_11.l1, ((C1607100rvI) awS289S0300000_11.l0).LJFF());
        }
        C1607100rvI c1607100rvI2 = (C1607100rvI) awS289S0300000_11.l0;
        RelationButton relationButton = (RelationButton) awS289S0300000_11.l2;
        c1607100rvI2.getClass();
        if (relationButton != null) {
            relationButton.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).withEndAction(new ARunnableS106S0100000_6((Object) relationButton, 288)).start();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS289S0300000_11 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS289S0300000_11.invoke$4(kotlin.jvm.internal.AwS289S0300000_11, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS289S0300000_11(Aweme aweme, C013C c013c, C705440Rlm c705440Rlm, int i) {
        super(2);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = c013c;
        this.l2 = c705440Rlm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS289S0300000_11(User user, RelationButton relationButton, C1607100rvI c1607100rvI, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1607100rvI;
        this.l1 = user;
        this.l2 = relationButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS289S0300000_11(Function1 function1, Function1<? super View, Unit> function12, FcpMetaTagContainer fcpMetaTagContainer, Function1<? super View, Unit> function13) {
        super(2);
        this.$t = function13;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = fcpMetaTagContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS289S0300000_11(AwS555S0100000_11 awS555S0100000_11, InterfaceC707420Roy interfaceC707420Roy, FeedCommonBannerTrigger feedCommonBannerTrigger, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS555S0100000_11;
        this.l1 = interfaceC707420Roy;
        this.l2 = feedCommonBannerTrigger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS289S0300000_11(EnumC1450305m1 enumC1450305m1, FcpNodeProtocol fcpNodeProtocol, String str, ConditionData conditionData, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC1450305m1;
        this.l1 = fcpNodeProtocol;
        this.l2 = conditionData;
    }
}
