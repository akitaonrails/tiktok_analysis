package com.ss.android.ugc.aweme.ecommercelive.audience.common.framework.serviceimpl;

import X.C07O9;
import X.C1739680vN8;
import X.C181J;
import X.C1E62;
import X.C21186517vb;
import X.C21207217yw;
import X.C21211417zc;
import X.EnumC1115870f8z;
import X.InterfaceC1730620v8W;
import X.InterfaceC1739690vN9;
import X.InterfaceC20673515v3;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.zhiliaoapp.musically.R;
import g1c.AjS22S0300000_26;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1730620v8W interfaceC1730620v8WF3;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6().registerSlot(new C21207217yw());
        if ((!((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() || !((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.LJJJJL(C21186517vb.LJ.getValue());
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 != null && (interfaceC1730620v8WF3 = iLiveOuterService2.f3()) != null) {
            interfaceC1730620v8WF3.LIZ(1, C181J.LIZ.getValue());
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O3().LIZ(EnumC1115870f8z.ECOMMERCE, C21211417zc.LIZ.getValue());
        InterfaceC1739690vN9 interfaceC1739690vN9 = new InterfaceC1739690vN9() { // from class: X.0vN8
            public static final List<String> LIZIZ() {
                return Collections.singletonList("live_pin_card");
            }

            @Override // X.InterfaceC1739690vN9
            public final InterfaceC1756300vnw LIZ(C1739710vNB c1739710vNB) {
                if (Intrinsics.LJFF(c1739710vNB.LIZ, "live_pin_card")) {
                    return new InterfaceC1756300vnw(c1739710vNB) { // from class: X.0vN6
                        public final C1739710vNB LIZ;

                        @Override // X.InterfaceC1756300vnw
                        public final void LIZ() {
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LIZ("onViewDetached");
                        }

                        {
                            this.LIZ = c1739710vNB;
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [X.0vN3, android.view.View] */
                        @Override // X.InterfaceC1756300vnw
                        public final View LIZIZ(Context context) {
                            ?? r1 = new ConstraintLayout(context, null) { // from class: X.0vN3
                                public final void setData(C1739710vNB c1739710vNB2) {
                                    Object obj;
                                    PdpTopBubble pdpTopBubble;
                                    Type type;
                                    synchronized (C1739650vN5.LIZ) {
                                        try {
                                            obj = C1739650vN5.LIZIZ.get("cache_key_live_pin_card_portable_view");
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    HashMap map = null;
                                    if ((obj instanceof PdpTopBubble) && (pdpTopBubble = (PdpTopBubble) obj) != null) {
                                        e0((SmartImageView) findViewById(R.id.lmc), pdpTopBubble.leftIcon, pdpTopBubble.leftIconDark);
                                        e0((SmartImageView) findViewById(R.id.lto), pdpTopBubble.rightIcon, pdpTopBubble.rightIconDark);
                                        String str = pdpTopBubble.text;
                                        if (str != null && str.length() > 0) {
                                            SpannableString spannableString = new SpannableString(pdpTopBubble.text);
                                            String str2 = pdpTopBubble.highlightText;
                                            if (str2 != null && str2.length() > 0) {
                                                Integer numValueOf = Integer.valueOf(a0.LJJJ(str, str2, 0, false, 6));
                                                if (numValueOf.intValue() >= 0) {
                                                    int iIntValue = numValueOf.intValue();
                                                    C786410Ut5.p2(spannableString, new C444920HcY(62, false), iIntValue, str2.length() + iIntValue, 17);
                                                }
                                            }
                                            ((TextView) findViewById(R.id.zxa)).setText(spannableString);
                                        }
                                        String str3 = c1739710vNB2.LIZIZ;
                                        try {
                                            Gson gsonLJFF = C1741890vQh.LJFF();
                                            C1120604Zw.LIZ.getClass();
                                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                                C13JX c13jx = KTypeProjection.LIZJ;
                                                C13JW c13jwLJII = C13LE.LJII(String.class);
                                                c13jx.getClass();
                                                type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(String.class))));
                                            } else {
                                                type = new TypeToken<HashMap<String, String>>() { // from class: X.0vN4
                                                }.getType();
                                            }
                                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
                                            if (!(objFromJson instanceof HashMap)) {
                                                objFromJson = null;
                                            }
                                            map = (HashMap) objFromJson;
                                        } catch (s e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        C786410Ut5.I7(new AjS22S0300000_26(map, this, pdpTopBubble, 14), this);
                                    }
                                }

                                {
                                    super(context, attributeSet);
                                    ViewGroup.inflate(context, R.layout.bw7, this);
                                }

                                public final void e0(SmartImageView smartImageView, ECImage eCImage, ECImage eCImage2) {
                                    if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).l4(getContext())) {
                                        eCImage = eCImage2;
                                    }
                                    if (eCImage == null) {
                                        return;
                                    }
                                    ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.width = C679280Qkg.LIZ(eCImage.width);
                                        layoutParams.height = C679280Qkg.LIZ(eCImage.height);
                                        C786410Ut5.W5(smartImageView, layoutParams);
                                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(eCImage.url);
                                        c1331670kl3LJIIIZ.LJJ(smartImageView);
                                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            };
                            r1.setData(this.LIZ);
                            return r1;
                        }

                        @Override // X.InterfaceC1756300vnw
                        public final void LIZLLL(boolean z) {
                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onContainerVisibilityChanged: ");
                            sbLIZ.append(z);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c2341109Fh.getClass();
                            C2341109Fh.LJ(strLIZIZ);
                        }

                        @Override // X.InterfaceC1756300vnw
                        public final void o5(View view) {
                            Object obj;
                            PdpTopBubble pdpTopBubble;
                            Map<String, String> map;
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LIZ("onViewAttached");
                            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "product_detail"), new Pair("module_name", "shopping_bag_brand_info_guide"));
                            c1507790pL7.getClass();
                            C1507790pL7.LIZJ("tiktokec_module_show", mapLJIIIIZZ);
                            synchronized (C1739650vN5.LIZ) {
                                try {
                                    obj = C1739650vN5.LIZIZ.get("cache_key_live_pin_card_portable_view");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if ((obj instanceof PdpTopBubble) && (pdpTopBubble = (PdpTopBubble) obj) != null && (map = pdpTopBubble.daInfo) != null) {
                                Map<String, String> mapLIZIZ = C1739720vNC.LIZIZ(new C1741520vQ6("c8066").LIZ(CardStruct.IStatusCode.DEFAULT), PageFinder.via(view));
                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                linkedHashMap.putAll(mapLIZIZ);
                                C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", linkedHashMap);
                            }
                        }

                        @Override // X.InterfaceC1756300vnw
                        public final void LIZJ(View view, float f) {
                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onDragProgressChanged: ");
                            sbLIZ.append(f);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c2341109Fh.getClass();
                            C2341109Fh.LIZ(strLIZIZ);
                            float f2 = 0.0f;
                            if (f >= 0.0f && f <= 1.0f) {
                                float f3 = f * 0.3f;
                                if (f3 <= 0.04d) {
                                    f2 = 1.0f - (f3 / 0.04f);
                                }
                                C786410Ut5.T4(view, f2);
                            }
                        }
                    };
                }
                return null;
            }
        };
        Iterator<String> it2 = C1739680vN8.LIZIZ().iterator();
        while (it2.hasNext()) {
            C07O9.LIZ.put(it2.next(), interfaceC1739690vN9);
        }
        if (C1E62.LIZJ) {
            final AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(56);
            HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
            if (hostSetupWatcher.isHostSetup()) {
                aFwS223S0000000_32.invoke();
            } else {
                hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.ecommercelive.audience.common.business.clientai.EcLivePitayaMessageRegistry$checkSdkReady$1
                    @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                    public void onHostSetup(boolean z) {
                        if (z) {
                            aFwS223S0000000_32.invoke();
                        }
                    }
                });
            }
        }
    }
}
