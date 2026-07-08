package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting;

import X.C01GW;
import X.C051E;
import X.C098200Yq;
import X.C09GK;
import X.C1083270eIP;
import X.C1083280eIQ;
import X.C1083520eIo;
import X.C1092980eY4;
import X.C1122350fJR;
import X.C1122360fJS;
import X.C1122390fJV;
import X.C1122470fJd;
import X.C1122490fJf;
import X.C1122540fJk;
import X.C1122610fJr;
import X.C1122620fJs;
import X.C1122630fJt;
import X.C1122640fJu;
import X.C1122680fJy;
import X.C1122700fK0;
import X.C1122750fK5;
import X.C1122790fK9;
import X.C1122800fKA;
import X.C1122810fKB;
import X.C1122830fKD;
import X.C1122840fKE;
import X.C1122850fKF;
import X.C1122880fKI;
import X.C1122890fKJ;
import X.C1123050fKZ;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1883607Zi;
import X.C189200o6;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1122660fJw;
import X.EnumC1122690fJz;
import X.InterfaceC1092860eXs;
import X.InterfaceC1122940fKO;
import X.RunnableC1122650fJv;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.room.CommentSendEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SkuRoutingLeadConversionEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SmbCommentDetectorState;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ServiceSkuRoutingConfigSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsIdentifyCommentMethodSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBIndustryInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.DMInfo;
import webcast.api.sub.FormInfo;
import webcast.api.sub.PreviewDisplay;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes18.dex */
public final class ServiceRoutingDetector extends LiveRecyclableWidget {
    public Room LL;
    public volatile boolean LLILZ;
    public int LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C1883607Zi LLJILJILJ;
    public RunnableC1122650fJv LLJILLL;
    public boolean LLJJ;
    public final C1122630fJt LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1122620fJs LLJJIJIL;
    public C1122470fJd LLJJJ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1083280eIQ());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1083270eIP(this));
    public String LLILZIL = "";
    public List<? extends EnumC1122660fJw> LLIZ = C13BV.INSTANCE;
    public String LLJ = "";
    public final Set<EnumC1122660fJw> LLJILJIL = new LinkedHashSet();
    public final C1122360fJS LLJJI = new InterfaceC1122940fKO() { // from class: X.0fJS
        @Override // X.InterfaceC1122940fKO
        public final void LIZ(EnumC1122660fJw enumC1122660fJw) {
            C051E.LIZ("feature.suppression", new Pair("sku", enumC1122660fJw), new Pair("suppressed", Boolean.FALSE), new Pair("source", "psp_pre_trigger"));
        }

        @Override // X.InterfaceC1122940fKO
        public final boolean LIZIZ(EnumC1122660fJw enumC1122660fJw) {
            boolean z;
            String str = C1122370fJT.LIZ.get(enumC1122660fJw);
            if (str == null) {
                C051E.LIZ("feature.viewer.skip", new Pair("sku", enumC1122660fJw), new Pair("reason", "missing_show_status_key"));
                return false;
            }
            try {
                Object objLIZ = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).LIZ(str, "f_live_smb", "default");
                if (!Intrinsics.LJFF(objLIZ, Boolean.TRUE) && !Intrinsics.LJFF(objLIZ, 1) && !Intrinsics.LJFF(objLIZ, "1")) {
                    z = false;
                } else {
                    z = true;
                }
                C051E.LIZ("feature.viewer", new Pair("sku", enumC1122660fJw), new Pair("key", str), new Pair("group", "f_live_smb"), new Pair("raw", objLIZ), new Pair("enabled", Boolean.valueOf(z)));
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C051E.LIZ("feature.viewer.error", new Pair("sku", enumC1122660fJw), new Pair("key", str), new Pair("group", "f_live_smb"), new Pair("message", e.getMessage()));
                return false;
            }
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Pair[] pairArr = new Pair[1];
        Room room = this.LL;
        pairArr[0] = new Pair("room_id", room != null ? Long.valueOf(room.getId()) : null);
        C051E.LIZ("lifecycle.unload", pairArr);
        this.LL = null;
        this.LLILZ = false;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = false;
        this.LLIZLLLIL = false;
        this.LLIZ = C13BV.INSTANCE;
        this.LLJILJIL.clear();
        C1122620fJs c1122620fJs = this.LLJJIJIL;
        if (c1122620fJs != null) {
            c1122620fJs.LIZIZ();
        }
        C1122470fJd c1122470fJd = this.LLJJJ;
        if (c1122470fJd != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append("comment.destroy");
            sbLIZ.append(']');
            C20441214yg.LIZIZ("SkuRouting", C2188811AlT.LIZIZ(sbLIZ));
            c1122470fJd.LJ.LJ();
        }
        C1122680fJy c1122680fJyZ1 = z1();
        c1122680fJyZ1.getClass();
        C051E.LIZ("bubble.destroy", new Pair("has_clicked_guidance", Boolean.valueOf(c1122680fJyZ1.LJIIIZ)));
        c1122680fJyZ1.LIZLLL.removeCallbacksAndMessages(null);
        c1122680fJyZ1.LJIIIZ = false;
        C1122630fJt c1122630fJt = this.LLJJIII;
        c1122630fJt.getClass();
        C051E.LIZ("frequency.reset", new Pair("room_id", c1122630fJt.LJIIIZ), new Pair("session", Integer.valueOf(c1122630fJt.LJ)), new Pair("sku_counts", c1122630fJt.LJFF));
        c1122630fJt.LJ = 0;
        ((LinkedHashMap) c1122630fJt.LJFF).clear();
        c1122630fJt.LJI = 0L;
        c1122630fJt.LJII = 0;
        c1122630fJt.LJIIIIZZ = false;
        ((Handler) this.LLILLJJLI.getValue()).removeCallbacksAndMessages(null);
    }

    public final void A1() {
        if (!this.LLJIJIL) {
            C051E.LIZ("models.init.skip", new Pair("reason", "detector_state_missing"));
            return;
        }
        Pair[] pairArr = new Pair[2];
        LivePcsIdentifyCommentMethodSetting livePcsIdentifyCommentMethodSetting = LivePcsIdentifyCommentMethodSetting.INSTANCE;
        pairArr[0] = new Pair("comment_method", Integer.valueOf(livePcsIdentifyCommentMethodSetting.getValue()));
        pairArr[1] = new Pair("entry_ready", Boolean.valueOf(this.LLIZLLLIL && (this.LLIZ.isEmpty() ^ true)));
        C051E.LIZ("models.init", pairArr);
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new C1122620fJs(new C1122700fK0(this), new C1122840fKE(), new C1122890fKJ(this));
        }
        E1();
        if (this.LLJI) {
            C051E.LIZ("comment.observe.skip", new Pair("reason", "already_started"));
            return;
        }
        if (!livePcsIdentifyCommentMethodSetting.enable()) {
            C051E.LIZ("comment.observe.skip", new Pair("reason", "setting_disabled"));
            return;
        }
        C051E.LIZ("comment.observe.start", new Pair("method", Integer.valueOf(livePcsIdentifyCommentMethodSetting.getValue())));
        C1122470fJd c1122470fJd = new C1122470fJd(new C1122880fKI(this), new C1122830fKD(this));
        this.LLJJJ = c1122470fJd;
        if (c1122470fJd.LJFF) {
            C051E.LIZ("comment.model.download", new Pair("method", "client_ai"));
            c1122470fJd.LIZLLL.bc2(new C09GK(new C1122790fK9(c1122470fJd)));
        } else {
            C051E.LIZ("comment.model.download.skip", new Pair("method", "server_ai"));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CommentSendEvent.class, new C1122490fJf(this));
        }
        this.LLJI = true;
    }

    public final void E1() {
        Object c098200Yq;
        if (this.LLJJ) {
            C051E.LIZ("interaction.register.skip", new Pair("reason", "already_triggered_once"));
            return;
        }
        if (!this.LLILZ) {
            C051E.LIZ("interaction.register.skip", new Pair("reason", "icon_not_visible"));
            return;
        }
        if (!x1("interaction.register")) {
            C1122620fJs c1122620fJs = this.LLJJIJIL;
            if (c1122620fJs != null) {
                c1122620fJs.LIZIZ();
                return;
            }
            return;
        }
        final C1122620fJs c1122620fJs2 = this.LLJJIJIL;
        if (c1122620fJs2 != null) {
            if (c1122620fJs2.LIZLLL) {
                C051E.LIZ("interaction.register.skip", new Pair("reason", "already_registered"), new Pair("business", "sku_routing_prediction_strategy_v1"));
                return;
            }
            C051E.LIZ("interaction.register", new Pair("business", "sku_routing_prediction_strategy_v1"), new Pair("strategy_key", "sku_routing_prediction_strategy_v1"));
            try {
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0fJW
                    @Override // X.InterfaceC1092860eXs
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LJ(C1092890eXv c1092890eXv) {
                        Object obj;
                        InterfaceC805220ViK interfaceC805220ViK;
                        Object c098200Yq2;
                        String str;
                        HashMap<String, String> mapLIZ;
                        boolean z;
                        Set<String> setKeySet;
                        C0J0M c0j0m = c1092890eXv.LIZIZ;
                        if (c0j0m != null) {
                            obj = c0j0m.LIZ;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof InterfaceC805220ViK) {
                            interfaceC805220ViK = (InterfaceC805220ViK) obj;
                        } else {
                            interfaceC805220ViK = null;
                        }
                        boolean z2 = true;
                        if (interfaceC805220ViK == null) {
                            Pair[] pairArr = new Pair[3];
                            pairArr[0] = new Pair("received", Boolean.TRUE);
                            pairArr[1] = new Pair("is_ttm_result", Boolean.FALSE);
                            C0J0M c0j0m2 = c1092890eXv.LIZIZ;
                            if (c0j0m2 == null || c0j0m2.LIZ == null) {
                                z2 = false;
                            }
                            pairArr[2] = new Pair("has_decision_value", Boolean.valueOf(z2));
                            C051E.LIZ("interaction.strategy.callback", pairArr);
                            return;
                        }
                        C1122620fJs c1122620fJs3 = c1122620fJs2;
                        try {
                            AbstractC2213701BkW abstractC2213701BkWLIZLLL = interfaceC805220ViK.LIZLLL();
                            if (abstractC2213701BkWLIZLLL != null) {
                                str = abstractC2213701BkWLIZLLL.LIZIZ;
                            } else {
                                str = null;
                            }
                            Boolean bool = Boolean.TRUE;
                            C051E.LIZ("interaction.strategy.callback", new Pair("received", bool), new Pair("is_ttm_result", bool), new Pair("strategy_key", str), new Pair("expected_key", "sku_routing_prediction_strategy_v1"), new Pair("key_matched", Boolean.valueOf(Intrinsics.LJFF(str, "sku_routing_prediction_strategy_v1"))));
                            if (Intrinsics.LJFF(str, "sku_routing_prediction_strategy_v1")) {
                                Object objLIZJ = interfaceC805220ViK.LIZJ();
                                if (objLIZJ != null) {
                                    mapLIZ = C328030CtV.LIZ(objLIZJ);
                                } else {
                                    mapLIZ = null;
                                }
                                Pair[] pairArr2 = new Pair[3];
                                pairArr2[0] = new Pair("strategy_key", str);
                                if (mapLIZ != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                pairArr2[1] = new Pair("has_value", Boolean.valueOf(z));
                                if (mapLIZ != null) {
                                    setKeySet = mapLIZ.keySet();
                                } else {
                                    setKeySet = null;
                                }
                                pairArr2[2] = new Pair("value_keys", setKeySet);
                                C051E.LIZ("interaction.strategy", pairArr2);
                                if (mapLIZ != null) {
                                    c1122620fJs3.LIZ(mapLIZ);
                                }
                            }
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl != null) {
                            C051E.LIZ("interaction.strategy.exception", new Pair("message", thM5exceptionOrNullimpl.getMessage()));
                        }
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZLLL(String str, C477840IoY c477840IoY) {
                        C051E.LIZ("interaction.strategy.error", new Pair("business", str), new Pair("error", c477840IoY));
                    }
                }, new C1092980eY4().LIZIZ(), null, "sku_routing_prediction_strategy_v1");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C051E.LIZ("interaction.register.error", new Pair("business", "sku_routing_prediction_strategy_v1"), new Pair("message", thM5exceptionOrNullimpl.getMessage()));
            }
            boolean zM8isSuccessimpl = C189200o6.m8isSuccessimpl(c098200Yq);
            c1122620fJs2.LIZLLL = zM8isSuccessimpl;
            C051E.LIZ("interaction.register.result", new Pair("business", "sku_routing_prediction_strategy_v1"), new Pair("registered", Boolean.valueOf(zM8isSuccessimpl)));
        }
    }

    public final C1122680fJy z1() {
        return (C1122680fJy) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0fJS] */
    public ServiceRoutingDetector() {
        C1123050fKZ c1123050fKZ = C1123050fKZ.LIZ;
        c1123050fKZ.getClass();
        ServiceSkuRoutingConfigSetting serviceSkuRoutingConfigSetting = ServiceSkuRoutingConfigSetting.INSTANCE;
        this.LLJJIII = new C1122630fJt(serviceSkuRoutingConfigSetting.getMaxShowPerSession(), serviceSkuRoutingConfigSetting.getMaxShowPerDay(), new C1083520eIo(c1123050fKZ));
        this.LLJJIJI = C452501pT.LIZIZ(new C1122850fKF(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1122800fKA(this));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0fJv, java.lang.Runnable] */
    public final void C1(C1883607Zi c1883607Zi) {
        boolean z = false;
        C051E.LIZ("trigger.receive", new Pair("source", c1883607Zi.LIZIZ), new Pair("score", Float.valueOf(c1883607Zi.LIZJ)), new Pair("has_strategy_result", Boolean.valueOf(!c1883607Zi.LIZLLL.isEmpty())));
        int i = C1122750fK5.LIZ[c1883607Zi.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    y1(c1883607Zi);
                    return;
                }
                throw new C1954807lC();
            }
            C1883607Zi c1883607Zi2 = this.LLJILJILJ;
            if (c1883607Zi2 != null) {
                this.LLJILJILJ = null;
                RunnableC1122650fJv runnableC1122650fJv = this.LLJILLL;
                if (runnableC1122650fJv != null) {
                    ((Handler) this.LLILLJJLI.getValue()).removeCallbacks(runnableC1122650fJv);
                }
                this.LLJILLL = null;
                EnumC1122690fJz enumC1122690fJz = EnumC1122690fJz.BOTH;
                C051E.LIZ("trigger.merge", new Pair("source", enumC1122690fJz), new Pair("pending_interaction_score", Float.valueOf(c1883607Zi2.LIZJ)), new Pair("comment_score", Float.valueOf(c1883607Zi.LIZJ)));
                y1(new C1883607Zi(enumC1122690fJz, c1883607Zi2.LIZJ, c1883607Zi2.LIZLLL));
                return;
            }
            C051E.LIZ("trigger.direct", new Pair("source", c1883607Zi.LIZIZ), new Pair("score", Float.valueOf(c1883607Zi.LIZJ)));
            y1(c1883607Zi);
            return;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("source", c1883607Zi.LIZIZ);
        pairArr[1] = new Pair("window_ms", 3000L);
        if (this.LLJILJILJ != null) {
            z = true;
        }
        pairArr[2] = new Pair("replace_existing", Boolean.valueOf(z));
        C051E.LIZ("trigger.pending", pairArr);
        this.LLJJ = true;
        this.LLJILJILJ = c1883607Zi;
        ?? r3 = new Runnable() { // from class: X.0fJv
            public final void LIZ() {
                ServiceRoutingDetector serviceRoutingDetector = this.LL;
                C1883607Zi c1883607Zi3 = serviceRoutingDetector.LLJILJILJ;
                if (c1883607Zi3 == null) {
                    return;
                }
                serviceRoutingDetector.LLJILJILJ = null;
                serviceRoutingDetector.LLJILLL = null;
                C051E.LIZ("trigger.execute_pending", new Pair("source", c1883607Zi3.LIZIZ), new Pair("score", Float.valueOf(c1883607Zi3.LIZJ)));
                this.LL.y1(c1883607Zi3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ServiceRoutingDetector@3bc6.onTriggerSignal$mergeRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ServiceRoutingDetector@3bc6.onTriggerSignal$mergeRunnable$1");
            }
        };
        this.LLJILLL = r3;
        C786410Ut5.LJLIIL(3000L, (Handler) this.LLILLJJLI.getValue(), r3);
    }

    public final void D1(String str) {
        Long lValueOf;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Long lValueOf2;
        Boolean boolValueOf3;
        C1122390fJV c1122390fJV;
        boolean z;
        Long lValueOf3;
        String string;
        Long lValueOf4;
        SMBIndustryInfo sMBIndustryInfo;
        B1(this.LL, "room.sku_state.parse");
        SMBPreviewResponse.ResponseData responseDataLIZ = C1122350fJR.LIZ(this.LL, str);
        if (responseDataLIZ == null) {
            C051E.LIZ("preview.order", new Pair("stage", str), new Pair("has_preview_data", Boolean.FALSE));
            c1122390fJV = new C1122390fJV(false, C13BV.INSTANCE);
        } else {
            PreviewDisplay previewDisplay = responseDataLIZ.displaySwitch;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (previewDisplay != null) {
                if (previewDisplay.hasSuggestedQuestion) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    DMInfo dMInfo = responseDataLIZ.dmInfo;
                    if (dMInfo != null) {
                        lValueOf3 = Long.valueOf(dMInfo.skuId);
                    } else {
                        lValueOf3 = null;
                    }
                    EnumC1122660fJw enumC1122660fJw = EnumC1122660fJw.DM;
                    if (lValueOf3 != null && lValueOf3.longValue() > 0) {
                        linkedHashMap.put(lValueOf3, enumC1122660fJw);
                    }
                }
                if (previewDisplay != null && previewDisplay.hasForm) {
                    Iterator<FormInfo> it2 = responseDataLIZ.formInfoList.iterator();
                    while (it2.hasNext()) {
                        Long lValueOf5 = Long.valueOf(it2.next().skuId);
                        EnumC1122660fJw enumC1122660fJw2 = EnumC1122660fJw.FORM;
                        if (lValueOf5 != null && lValueOf5.longValue() > 0) {
                            linkedHashMap.put(lValueOf5, enumC1122660fJw2);
                        }
                    }
                }
            }
            List<Long> list = responseDataLIZ.skuOrder;
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it3 = list.iterator();
            while (it3.hasNext()) {
                Object obj = linkedHashMap.get(Long.valueOf(it3.next().longValue()));
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList);
            Pair[] pairArr = new Pair[12];
            pairArr[0] = new Pair("stage", str);
            pairArr[1] = new Pair("has_preview_data", Boolean.TRUE);
            if (previewDisplay != null) {
                lValueOf = Long.valueOf(previewDisplay.activeSkuCount);
            } else {
                lValueOf = null;
            }
            pairArr[2] = new Pair("active_sku_count", lValueOf);
            pairArr[3] = new Pair("sku_order", responseDataLIZ.skuOrder);
            if (previewDisplay != null) {
                boolValueOf = Boolean.valueOf(previewDisplay.hasForm);
            } else {
                boolValueOf = null;
            }
            pairArr[4] = new Pair("has_form", boolValueOf);
            pairArr[5] = new Pair("form_count", Integer.valueOf(responseDataLIZ.formInfoList.size()));
            if (previewDisplay != null) {
                boolValueOf2 = Boolean.valueOf(previewDisplay.hasSuggestedQuestion);
            } else {
                boolValueOf2 = null;
            }
            pairArr[6] = new Pair("has_dm", boolValueOf2);
            DMInfo dMInfo2 = responseDataLIZ.dmInfo;
            if (dMInfo2 != null) {
                lValueOf2 = Long.valueOf(dMInfo2.skuId);
            } else {
                lValueOf2 = null;
            }
            pairArr[7] = new Pair("dm_sku_id", lValueOf2);
            List<FormInfo> list2 = responseDataLIZ.formInfoList;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<FormInfo> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(Long.valueOf(it4.next().skuId));
            }
            pairArr[8] = new Pair("form_sku_ids", arrayList2);
            if (previewDisplay != null) {
                boolValueOf3 = Boolean.valueOf(previewDisplay.hasBooking);
            } else {
                boolValueOf3 = null;
            }
            pairArr[9] = new Pair("has_booking", boolValueOf3);
            pairArr[10] = new Pair("course_count", Integer.valueOf(responseDataLIZ.courseList.size()));
            pairArr[11] = new Pair("order", listLJJJJI);
            C051E.LIZ("preview.order", pairArr);
            c1122390fJV = new C1122390fJV(true, listLJJJJI);
        }
        this.LLIZLLLIL = c1122390fJV.LIZ;
        this.LLIZ = c1122390fJV.LIZIZ;
        Room room = this.LL;
        if (room == null || (sMBIndustryInfo = room.smbIndustryInfo) == null || (string = Integer.valueOf(sMBIndustryInfo.type).toString()) == null) {
            string = "";
        }
        this.LLJ = string;
        z1().LJI = this.LLJ;
        Pair[] pairArr2 = new Pair[4];
        Room room2 = this.LL;
        if (room2 != null) {
            lValueOf4 = Long.valueOf(room2.getId());
        } else {
            lValueOf4 = null;
        }
        pairArr2[0] = new Pair("room_id", lValueOf4);
        pairArr2[1] = new Pair("has_preview_data", Boolean.valueOf(this.LLIZLLLIL));
        pairArr2[2] = new Pair("routing_order", this.LLIZ);
        pairArr2[3] = new Pair("industry_type", this.LLJ);
        C051E.LIZ("room.parse", pairArr2);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append("lifecycle.init");
        sbLIZ.append(']');
        C20441214yg.LIZIZ("SkuRouting", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        String string;
        C1123050fKZ.LIZ.getClass();
        if (!ServiceSkuRoutingConfigSetting.INSTANCE.isEnabled()) {
            C051E.LIZ("init.skip", new Pair("reason", "setting_disabled"), new Pair("config", C1123050fKZ.LIZ()));
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        Long lValueOf = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LL = room;
        Pair[] pairArr = new Pair[3];
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        }
        pairArr[0] = new Pair("room_id", lValueOf);
        pairArr[1] = new Pair("is_anchor", Boolean.valueOf(((Boolean) this.LLILLL.getValue()).booleanValue()));
        pairArr[2] = new Pair("config", C1123050fKZ.LIZ());
        C051E.LIZ("init.start", pairArr);
        C1122630fJt c1122630fJt = this.LLJJIII;
        Room room2 = this.LL;
        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
            string = "";
        }
        c1122630fJt.LJIIIZ = string;
        C051E.LIZ("frequency.room", new Pair("room_id", string));
        z1().LJFF = this.LL;
        D1("on_load");
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, RoomChannel.class, new C1122810fKB(this));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, SmbCommentDetectorState.class, new C1122540fJk(this));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, PcsAudienceServicePlusIconVisibleChannel.class, new C1122640fJu(this));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, SkuRoutingLeadConversionEvent.class, new C1122610fJr(this));
    }

    public final boolean x1(String str) {
        if (!this.LLIZLLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".skip");
            C051E.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Pair("reason", "preview_missing"));
            return false;
        }
        if (!this.LLIZ.isEmpty()) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".skip");
        C051E.LIZ(C2188811AlT.LIZIZ(sbLIZ2), new Pair("reason", "no_dm_form_sku"));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x049f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(X.C1883607Zi r29) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector.y1(X.07Zi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B1(com.bytedance.android.livesdkapi.depend.model.live.Room r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector.B1(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }
}
