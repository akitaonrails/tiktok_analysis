package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class GiftGuideClientAI_OptTypeAdapter extends TypeAdapter<GiftGuideClientAI> {
    public final Gson LIZ;

    public GiftGuideClientAI_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftGuideClientAI read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftGuideClientAI giftGuideClientAI = new GiftGuideClientAI("", "", 10000L, 30L, false, 30L, 10, 5, 5, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, null, new NativeTriggerConfig(null, null, 3, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2037415281:
                        if (strLJJJJ.equals("gift_combo_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.giftComboCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1994156400:
                        if (strLJJJJ.equals("polling_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.pollingDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1097435739:
                        if (strLJJJJ.equals("frequency_control_business_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.frequencyControlBusinessName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -478449772:
                        if (strLJJJJ.equals("massive_comment_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.massiveCommentCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -385684946:
                        if (strLJJJJ.equals("frequency_control_task_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.frequencyControlTaskDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -260047304:
                        if (strLJJJJ.equals("collect_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.enableCollect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 42932283:
                        if (strLJJJJ.equals("trigger_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.triggerDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 629885866:
                        if (strLJJJJ.equals("business_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.businessName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 874469560:
                        if (strLJJJJ.equals("massive_gifts_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.massiveGiftCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1113163498:
                        if (strLJJJJ.equals("client_ai_task_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.taskTimeout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1914333241:
                        if (strLJJJJ.equals("auto_trigger_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.autoTriggerConfigMap = C473040Igo.LIZIZ(this.LIZ, c09cu, AutoTriggerConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2123749585:
                        if (strLJJJJ.equals("native_trigger_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideClientAI.nativeTriggerConfig = (NativeTriggerConfig) this.LIZ.LJIIJ(NativeTriggerConfig.class).read(c09cu);
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
        return giftGuideClientAI;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGuideClientAI giftGuideClientAI) throws IOException {
        GiftGuideClientAI giftGuideClientAI2 = giftGuideClientAI;
        if (giftGuideClientAI2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("frequency_control_business_name");
        c09dl.LJJJJJ(giftGuideClientAI2.frequencyControlBusinessName);
        c09dl.LJIILLIIL("business_name");
        c09dl.LJJJJJ(giftGuideClientAI2.businessName);
        c09dl.LJIILLIIL("frequency_control_task_delay");
        c09dl.LJJIZ(giftGuideClientAI2.frequencyControlTaskDelay);
        c09dl.LJIILLIIL("polling_duration");
        c09dl.LJJIZ(giftGuideClientAI2.pollingDuration);
        c09dl.LJIILLIIL("collect_enable");
        c09dl.LJJJJJL(giftGuideClientAI2.enableCollect);
        c09dl.LJIILLIIL("trigger_duration");
        c09dl.LJJIZ(giftGuideClientAI2.triggerDuration);
        c09dl.LJIILLIIL("massive_comment_count");
        c09dl.LJJJJ(Integer.valueOf(giftGuideClientAI2.massiveCommentCount));
        c09dl.LJIILLIIL("massive_gifts_count");
        c09dl.LJJJJ(Integer.valueOf(giftGuideClientAI2.massiveGiftCount));
        c09dl.LJIILLIIL("gift_combo_count");
        c09dl.LJJJJ(Integer.valueOf(giftGuideClientAI2.giftComboCount));
        c09dl.LJIILLIIL("client_ai_task_timeout");
        c09dl.LJJJJ(Integer.valueOf(giftGuideClientAI2.taskTimeout));
        c09dl.LJIILLIIL("auto_trigger_config");
        C473040Igo.LJ(this.LIZ, c09dl, giftGuideClientAI2.autoTriggerConfigMap, AutoTriggerConfig.class);
        c09dl.LJIILLIIL("native_trigger_config");
        this.LIZ.LJIIJ(NativeTriggerConfig.class).write(c09dl, giftGuideClientAI2.nativeTriggerConfig);
        c09dl.LJII();
    }
}
