package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionTextMessage;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionCommonResourceTypeAdapter extends TypeAdapter<LightInteractionCommonResource> {
    public final Gson LIZ;

    public LightInteractionCommonResourceTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LightInteractionCommonResource read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        String strLJJJZ4 = null;
        String strLJJJZ5 = null;
        String strLJJJZ6 = null;
        String strLJJJZ7 = null;
        String strLJJJZ8 = null;
        String strLJJJZ9 = null;
        String strLJJJZ10 = null;
        String strLJJJZ11 = null;
        LightInteractionTextMessage lightInteractionTextMessage = null;
        LightInteractionGiphyMessage lightInteractionGiphyMessage = null;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = null;
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        Integer numValueOf = null;
        String strLJJJZ12 = null;
        String strLJJJZ13 = null;
        String strLJJJZ14 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2092588892:
                        if (strLJJJJ.equals("sender_preview_hint_text")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ3 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -2033542158:
                        if (strLJJJJ.equals("gecko_animation_channel")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ14 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -2016567684:
                        if (strLJJJJ.equals("quote_top_receiver")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ6 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1286065038:
                        if (strLJJJJ.equals("message_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ10 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1266164439:
                        if (strLJJJJ.equals("toast_string")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ8 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1095277542:
                        if (strLJJJJ.equals("need_image_flip")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                boolValueOf2 = Boolean.valueOf(c09cu.LJJ());
                            }
                        }
                        break;
                    case -1003307665:
                        if (strLJJJJ.equals("text_msg")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                lightInteractionTextMessage = (LightInteractionTextMessage) this.LIZ.LJIIJ(LightInteractionTextMessage.class).read(c09cu);
                            }
                        }
                        break;
                    case -938504702:
                        if (strLJJJJ.equals("quote_top_sender")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ5 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -421654979:
                        if (strLJJJJ.equals("fullscreen_animate_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ12 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -14240290:
                        if (strLJJJJ.equals("receiver_preview_hint_text")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ4 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -4542778:
                        if (strLJJJJ.equals("need_vibrate")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                boolValueOf = Boolean.valueOf(c09cu.LJJ());
                            }
                        }
                        break;
                    case 17328488:
                        if (strLJJJJ.equals("config_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 535556257:
                        if (strLJJJJ.equals("giphy_msg")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                lightInteractionGiphyMessage = (LightInteractionGiphyMessage) this.LIZ.LJIIJ(LightInteractionGiphyMessage.class).read(c09cu);
                            }
                        }
                        break;
                    case 695186722:
                        if (strLJJJJ.equals("sticker_set_msg")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                lightInteractionStickerSetMessage = (LightInteractionStickerSetMessage) this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).read(c09cu);
                            }
                        }
                        break;
                    case 984174864:
                        if (strLJJJJ.equals("event_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ13 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1229117080:
                        if (strLJJJJ.equals("reference_scene")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ11 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1273285512:
                        if (strLJJJJ.equals("loop_time")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case 1282501904:
                        if (strLJJJJ.equals("quote_text")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ7 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1590386840:
                        if (strLJJJJ.equals("interaction_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1867286771:
                        if (strLJJJJ.equals("push_sent_string")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ9 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        LightInteractionCommonResource lightInteractionCommonResource = new LightInteractionCommonResource(strLJJJZ2, strLJJJZ3, strLJJJZ4, strLJJJZ5, strLJJJZ6, strLJJJZ7, strLJJJZ8, strLJJJZ9, strLJJJZ10, strLJJJZ11, lightInteractionTextMessage, lightInteractionGiphyMessage, lightInteractionStickerSetMessage, boolValueOf, boolValueOf2, numValueOf, strLJJJZ12, strLJJJZ13, strLJJJZ14);
        lightInteractionCommonResource.setConfigName(strLJJJZ);
        return lightInteractionCommonResource;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LightInteractionCommonResource lightInteractionCommonResource) {
        LightInteractionCommonResource lightInteractionCommonResource2 = lightInteractionCommonResource;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getConfigName());
        c09dl.LJIILLIIL("interaction_name");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getInteractionName());
        c09dl.LJIILLIIL("sender_preview_hint_text");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getSenderPreviewHintText());
        c09dl.LJIILLIIL("receiver_preview_hint_text");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getReceiverPreviewHintText());
        c09dl.LJIILLIIL("quote_top_sender");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getQuoteTopSender());
        c09dl.LJIILLIIL("quote_top_receiver");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getQuoteTopReceiver());
        c09dl.LJIILLIIL("quote_text");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getQuoteText());
        c09dl.LJIILLIIL("toast_string");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getToastString());
        c09dl.LJIILLIIL("push_sent_string");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getPushSentString());
        c09dl.LJIILLIIL("message_type");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getMessageType());
        c09dl.LJIILLIIL("reference_scene");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getReferenceScene());
        c09dl.LJIILLIIL("text_msg");
        if (lightInteractionCommonResource2.getTextMsg() == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionTextMessage.class).write(c09dl, lightInteractionCommonResource2.getTextMsg());
        }
        c09dl.LJIILLIIL("giphy_msg");
        if (lightInteractionCommonResource2.getGiphyMessage() == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionGiphyMessage.class).write(c09dl, lightInteractionCommonResource2.getGiphyMessage());
        }
        c09dl.LJIILLIIL("sticker_set_msg");
        if (lightInteractionCommonResource2.getStickerSetMsg() == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).write(c09dl, lightInteractionCommonResource2.getStickerSetMsg());
        }
        c09dl.LJIILLIIL("need_vibrate");
        c09dl.LJJJ(lightInteractionCommonResource2.getNeedVibrate());
        c09dl.LJIILLIIL("need_image_flip");
        c09dl.LJJJ(lightInteractionCommonResource2.getNeedImageFlip());
        c09dl.LJIILLIIL("loop_time");
        c09dl.LJJJJ(lightInteractionCommonResource2.getLoopTime());
        c09dl.LJIILLIIL("fullscreen_animate_id");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getFullscreenAnimateId());
        c09dl.LJIILLIIL("event_name");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getEventName());
        c09dl.LJIILLIIL("gecko_animation_channel");
        c09dl.LJJJJJ(lightInteractionCommonResource2.getGeckoAnimationChannel());
        c09dl.LJII();
    }
}
