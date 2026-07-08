package com.bytedance.android.livesdk.marketing.service;

import X.AbstractC1115900f92;
import X.C0K9J;
import X.C0KAJ;
import X.C0KAK;
import X.C1102070emj;
import X.C1102130emp;
import X.C1102420enI;
import X.C1107810evz;
import X.C1115820f8u;
import X.C1115830f8v;
import X.C1115850f8x;
import X.C1115920f94;
import X.C1115970f99;
import X.C13BV;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C512940K9s;
import X.C786410Ut5;
import X.EnumC1100250ejn;
import X.EnumC1107830ew1;
import X.EnumC1115840f8w;
import X.EnumC1115870f8z;
import X.InterfaceC1096630edx;
import X.InterfaceC1102120emo;
import X.InterfaceC1102150emr;
import X.InterfaceC1102160ems;
import X.InterfaceC1115910f93;
import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel;
import com.bytedance.android.livesdk.marketing.service.LiveMarketingController;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMarketingController implements LifecycleEventObserver, OnIMMessageListener, InterfaceC1102150emr, InterfaceC1102160ems {
    public static C1115920f94 LLILLJJLI;
    public static WeakReference<InterfaceC1115910f93> LLILLL;
    public static IMessageManager LLILZ;
    public static AbstractC1115900f92 LLIZ;
    public static C1115850f8x LLIZLLLIL;
    public static C1115830f8v LLJ;
    public static final LiveMarketingController LL = new LiveMarketingController();
    public static final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public static final Map<EnumC1115870f8z, AbstractC1115900f92> LLILZLL = new LinkedHashMap();
    public static final Set<String> LLJI = new LinkedHashSet();
    public static final C1115820f8u LLJIJIL = new InterfaceC1096630edx() { // from class: X.0f8u
        @Override // X.InterfaceC1096630edx
        public final boolean LIZIZ() {
            return true;
        }

        @Override // X.InterfaceC1096630edx
        public final Map<Integer, List<String>> LIZJ() {
            return null;
        }

        @Override // X.InterfaceC1096630edx
        public final int LIZLLL() {
            return 14;
        }

        @Override // X.InterfaceC1096630edx
        public final void LJI() {
        }

        @Override // X.InterfaceC1096630edx
        public final void LIZ() {
            LiveMarketingController liveMarketingController = LiveMarketingController.LL;
            liveMarketingController.getClass();
            LiveMarketingController.LIZLLL();
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
            c1102070emj.LJIIJ(c1115920f94 != null ? c1115920f94.LJ : null, liveMarketingController, LiveMarketingController.LLJ, null);
        }

        @Override // X.InterfaceC1096630edx
        public final boolean LJ(boolean z) {
            LiveMarketingController.LL.getClass();
            InterfaceC1115910f93 interfaceC1115910f93LIZ = LiveMarketingController.LIZ();
            if (interfaceC1115910f93LIZ != null) {
                return interfaceC1115910f93LIZ.isShowing();
            }
            return false;
        }

        @Override // X.InterfaceC1096630edx
        public final boolean LJFF(String str, Object obj) {
            LiveMarketingController liveMarketingController = LiveMarketingController.LL;
            DataChannel dataChannel = null;
            boolean zLJ = liveMarketingController.LJ(false, null, Collections.singletonList("exclusive"));
            if (zLJ) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                C1115920f94 c1115920f94 = LiveMarketingController.LLILLJJLI;
                if (c1115920f94 != null) {
                    dataChannel = c1115920f94.LJ;
                }
                C1102070emj.LJIJI(c1102070emj, dataChannel, liveMarketingController, LiveMarketingController.LLJ, this);
            }
            return zLJ;
        }
    };

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 14;
    }

    public static InterfaceC1115910f93 LIZ() {
        WeakReference<InterfaceC1115910f93> weakReference = LLILLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZLLL() {
        DataChannel dataChannel;
        Room room;
        C1115850f8x c1115850f8x = LLIZLLLIL;
        if (c1115850f8x != null) {
            Set<String> set = LLJI;
            if (set.contains(c1115850f8x.LIZLLL)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1115850f8x);
                sbLIZ.append(" is in allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                C1115920f94 c1115920f94 = LLILLJJLI;
                C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(14, c1115920f94 != null ? c1115920f94.LJ : null, "watch", false, false);
                if (!c512940K9sLIZLLL.LIZ) {
                    C1102070emj c1102070emj = C1102070emj.LIZ;
                    C1115920f94 c1115920f942 = LLILLJJLI;
                    DataChannel dataChannel2 = c1115920f942 != null ? c1115920f942.LJ : null;
                    LiveMarketingController liveMarketingController = LL;
                    c1102070emj.LJIILL(dataChannel2, liveMarketingController, LLJ, c512940K9sLIZLLL.LIZIZ);
                    EnumC1115870f8z enumC1115870f8z = c1115850f8x.LIZ;
                    C0KAJ c0kaj = C0KAJ.AUTO_CONTROL;
                    Set<String> set2 = c512940K9sLIZLLL.LIZIZ;
                    liveMarketingController.getClass();
                    LIZIZ(enumC1115870f8z, c0kaj, set2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1115850f8x);
                    sbLIZ2.append(" has been frequency controlled. Not show.");
                    C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                set.add(c1115850f8x.LIZLLL);
                C1115920f94 c1115920f943 = LLILLJJLI;
                C1102420enI.LIZIZ(14, false, false, "watch", "LiveMarketingComponent", (c1115920f943 == null || (room = c1115920f943.LIZJ) == null) ? 0L : room.getId());
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c1115850f8x);
                sbLIZ3.append(" is added to allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ3));
            }
            String simpleName = LL.getClass().getSimpleName();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Active behavior and show view, business: ");
            AbstractC1115900f92 abstractC1115900f92 = LLIZ;
            sbLIZ4.append(abstractC1115900f92 != null ? abstractC1115900f92.LIZ() : null);
            C20441214yg.LIZIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ4));
            AbstractC1115900f92 abstractC1115900f922 = LLIZ;
            if (abstractC1115900f922 != null) {
                abstractC1115900f922.LIZIZ();
            }
            InterfaceC1115910f93 interfaceC1115910f93LIZ = LIZ();
            if (interfaceC1115910f93LIZ != null) {
                interfaceC1115910f93LIZ.show();
            }
            C1115920f94 c1115920f944 = LLILLJJLI;
            if (c1115920f944 != null && (dataChannel = c1115920f944.LJ) != null) {
                dataChannel.zW(MarketingCapsuleVisibilityChannel.class, Boolean.TRUE);
            }
            long j = c1115850f8x.LIZJ;
            if (j > 0) {
                C786410Ut5.LJLIIL(j, LLILZIL, new ARunnableS117S0100000_17(c1115850f8x, 109));
            }
        }
    }

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        return Collections.singletonList(C1107810evz.LJJ.LIZ);
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.MARKETING_CAPSULE;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "LiveMarketingController";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        DataChannel dataChannel;
        LIZLLL();
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1115920f94 c1115920f94 = LLILLJJLI;
        if (c1115920f94 != null) {
            dataChannel = c1115920f94.LJ;
        } else {
            dataChannel = null;
        }
        c1102070emj.LJIIJ(dataChannel, this, LLJ, null);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage == null) {
            return;
        }
        Iterator it2 = ((LinkedHashMap) LLILZLL).values().iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            C13BV.INSTANCE.contains(Integer.valueOf(iMessage.getIntType()));
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Iterator it2 = ((LinkedHashMap) LLILZLL).values().iterator();
        while (it2.hasNext()) {
            ((AbstractC1115900f92) it2.next()).LJFF();
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    public static C1115970f99 LIZIZ(EnumC1115870f8z enumC1115870f8z, C0KAJ c0kaj, Set set) {
        AbstractC1115900f92 abstractC1115900f92 = (AbstractC1115900f92) ((LinkedHashMap) LLILZLL).get(enumC1115870f8z);
        if (abstractC1115900f92 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Hide failed due to ");
            EnumC1115840f8w enumC1115840f8w = EnumC1115840f8w.NO_BEHAVIOR;
            sbLIZ.append(enumC1115840f8w);
            C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ));
            return new C1115970f99(false, enumC1115840f8w);
        }
        AbstractC1115900f92 abstractC1115900f922 = LLIZ;
        if (abstractC1115900f922 != null && abstractC1115900f922.LIZ() == abstractC1115900f92.LIZ() && 1 != 0) {
            LIZJ(LL, c0kaj, set, 4);
            return new C1115970f99(true, null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Hide failed due to ");
        EnumC1115840f8w enumC1115840f8w2 = EnumC1115840f8w.NO_BEHAVIOR;
        sbLIZ2.append(enumC1115840f8w2);
        C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ2));
        return new C1115970f99(false, enumC1115840f8w2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(boolean r7, X.C1102130emp r8, java.util.List r9) {
        /*
            r6 = this;
            X.0f93 r0 = LIZ()
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L82
            boolean r0 = r0.isShowing()
            if (r0 != r3) goto L82
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Inactive behavior due to "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r4 = "LiveMarketingController"
            X.C20441214yg.LIZIZ(r4, r0)
            X.0f92 r0 = com.bytedance.android.livesdk.marketing.service.LiveMarketingController.LLIZ
            if (r0 == 0) goto L2a
            r0.LJ()
        L2a:
            r2 = 0
            if (r7 == 0) goto L51
            if (r8 == 0) goto L4e
            int r0 = r8.LIZJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L4e
            int r0 = r1.intValue()
            if (r0 != r3) goto L44
            X.0KAJ r1 = X.C0KAJ.NON_RESUMABLE
        L3f:
            r0 = 2
            LIZJ(r6, r1, r2, r0)
        L43:
            return r3
        L44:
            int r1 = r1.intValue()
            r0 = 3
            if (r1 != r0) goto L4e
            X.0KAJ r1 = X.C0KAJ.SHORT_REMAIN_TIME
            goto L3f
        L4e:
            X.0KAJ r1 = X.C0KAJ.REACH_MAX_ACTIVE_COUNT
            goto L3f
        L51:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = com.bytedance.android.livesdk.marketing.service.LiveMarketingController.LLILZIL
            r0.removeCallbacksAndMessages(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Hide view due to "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r4, r0)
            X.0f93 r0 = LIZ()
            if (r0 == 0) goto L72
            r0.LJJZZI(r5, r5)
        L72:
            X.0f94 r0 = com.bytedance.android.livesdk.marketing.service.LiveMarketingController.LLILLJJLI
            if (r0 == 0) goto L43
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LJ
            if (r2 == 0) goto L43
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel> r1 = com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zW(r1, r0)
            return r3
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.marketing.service.LiveMarketingController.LJ(boolean, X.0emp, java.util.List):boolean");
    }

    public static void LIZJ(LiveMarketingController liveMarketingController, C0KAJ c0kaj, Set set, int i) {
        DataChannel dataChannel;
        EnumC1115840f8w enumC1115840f8w;
        EnumC1115870f8z enumC1115870f8zLIZ;
        DataChannel dataChannel2;
        Set set2 = set;
        if ((i & 2) != 0) {
            set2 = null;
        }
        liveMarketingController.getClass();
        LLILZIL.removeCallbacksAndMessages(null);
        InterfaceC1115910f93 interfaceC1115910f93LIZ = LIZ();
        if (interfaceC1115910f93LIZ != null) {
            interfaceC1115910f93LIZ.LJJZZI(true, false);
        }
        C1115920f94 c1115920f94 = LLILLJJLI;
        if (c1115920f94 != null && (dataChannel2 = c1115920f94.LJ) != null) {
            dataChannel2.zW(MarketingCapsuleVisibilityChannel.class, Boolean.FALSE);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1115920f94 c1115920f942 = LLILLJJLI;
        if (c1115920f942 != null) {
            dataChannel = c1115920f942.LJ;
        } else {
            dataChannel = null;
        }
        C1102070emj.LJIILJJIL(c1102070emj, dataChannel, liveMarketingController, LLJ, c0kaj, null, set2, 48);
        switch (C0KAK.LIZ[c0kaj.ordinal()]) {
            case 1:
                enumC1115840f8w = EnumC1115840f8w.FREQUENCY;
                break;
            case 2:
            case 3:
            case 4:
                enumC1115840f8w = EnumC1115840f8w.CONFLICT;
                break;
            case 5:
            case 6:
                enumC1115840f8w = EnumC1115840f8w.MANUALLY_CLOSE;
                break;
            case 7:
                enumC1115840f8w = EnumC1115840f8w.TIME_OUT;
                break;
            case 8:
                enumC1115840f8w = EnumC1115840f8w.OTHERS;
                break;
            default:
                throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unbind behavior and hide view due to ");
        sbLIZ.append(enumC1115840f8w);
        sbLIZ.append(", business: ");
        AbstractC1115900f92 abstractC1115900f92 = LLIZ;
        if (abstractC1115900f92 != null) {
            enumC1115870f8zLIZ = abstractC1115900f92.LIZ();
        } else {
            enumC1115870f8zLIZ = null;
        }
        sbLIZ.append(enumC1115870f8zLIZ);
        C20441214yg.LIZIZ("LiveMarketingController", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1115900f92 abstractC1115900f922 = LLIZ;
        if (abstractC1115900f922 != null) {
            abstractC1115900f922.LJI(enumC1115840f8w);
        }
        LLIZ = null;
        LLIZLLLIL = null;
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        LJ(z, c1102130emp, c1102130emp.LIZIZ());
    }
}
