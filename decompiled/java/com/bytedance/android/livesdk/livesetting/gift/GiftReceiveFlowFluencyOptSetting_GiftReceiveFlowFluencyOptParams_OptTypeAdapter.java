package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftReceiveFlowFluencyOptSetting_GiftReceiveFlowFluencyOptParams_OptTypeAdapter extends TypeAdapter<GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams> {
    public final Gson LIZ;

    public GiftReceiveFlowFluencyOptSetting_GiftReceiveFlowFluencyOptParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams = new GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams(false, false, false, false, false, false, false, false, false, 80L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1820969436:
                        if (strLJJJJ.equals("assets_model_cache_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.assetsModelCacheOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1604799005:
                        if (strLJJJJ.equals("preload_assets_model")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.preloadAssetsModel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1568358730:
                        if (strLJJJJ.equals("guest_cache_assets_model_when_linkmic")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.guestCacheAssetsModeLWhenLinkmic = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -379708971:
                        if (strLJJJJ.equals("lazy_init_render_sdk")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.lazyInitRenderSDK = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -142816837:
                        if (strLJJJJ.equals("skip_gift_msg_in_background")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.skipGiftMsgInBackground = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 80921778:
                        if (strLJJJJ.equals("async_report_event")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.asyncReportEvent = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1264130345:
                        if (strLJJJJ.equals("async_report_event_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.asyncReportEventV2 = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1951062839:
                        if (strLJJJJ.equals("skip_gift_msg_delay_in_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.skipGiftMsgDelayInMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2061710627:
                        if (strLJJJJ.equals("preload_effect_for_sender")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftReceiveFlowFluencyOptParams.preloadEffectForSender = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return giftReceiveFlowFluencyOptParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams) throws IOException {
        GiftReceiveFlowFluencyOptSetting.GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams2 = giftReceiveFlowFluencyOptParams;
        if (giftReceiveFlowFluencyOptParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.isEnable);
        c09dl.LJIILLIIL("preload_effect_for_sender");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.preloadEffectForSender);
        c09dl.LJIILLIIL("preload_assets_model");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.preloadAssetsModel);
        c09dl.LJIILLIIL("lazy_init_render_sdk");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.lazyInitRenderSDK);
        c09dl.LJIILLIIL("assets_model_cache_opt");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.assetsModelCacheOpt);
        c09dl.LJIILLIIL("guest_cache_assets_model_when_linkmic");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.guestCacheAssetsModeLWhenLinkmic);
        c09dl.LJIILLIIL("async_report_event");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.asyncReportEvent);
        c09dl.LJIILLIIL("async_report_event_v2");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.asyncReportEventV2);
        c09dl.LJIILLIIL("skip_gift_msg_in_background");
        c09dl.LJJJJJL(giftReceiveFlowFluencyOptParams2.skipGiftMsgInBackground);
        c09dl.LJIILLIIL("skip_gift_msg_delay_in_ms");
        c09dl.LJJIZ(giftReceiveFlowFluencyOptParams2.skipGiftMsgDelayInMs);
        c09dl.LJII();
    }
}
