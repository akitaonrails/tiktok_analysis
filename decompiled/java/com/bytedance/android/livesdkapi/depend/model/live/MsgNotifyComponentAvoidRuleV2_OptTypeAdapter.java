package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComponentAvoidRuleV2_OptTypeAdapter extends TypeAdapter<MsgNotifyComponentAvoidRuleV2> {
    public final Gson LIZ;

    public MsgNotifyComponentAvoidRuleV2_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MsgNotifyComponentAvoidRuleV2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = new MsgNotifyComponentAvoidRuleV2();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1989270568:
                        if (strLJJJJ.equals("first_recover_info")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.firstRecoverInfo = (MsgNotifyComponentRecoverInfo) this.LIZ.LJIIJ(MsgNotifyComponentRecoverInfo.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1165461084:
                        if (strLJJJJ.equals("priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.priority = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -656482948:
                        if (strLJJJJ.equals("avoid_watch_early_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.avoidWatchEarlyMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -578706683:
                        if (strLJJJJ.equals("interrupt_recover_info")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.interruptRecoverInfo = (MsgNotifyComponentRecoverInfo) this.LIZ.LJIIJ(MsgNotifyComponentRecoverInfo.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -497943151:
                        if (strLJJJJ.equals("max_active_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.maxActiveCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -119418635:
                        if (strLJJJJ.equals("recover_threshold_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.recoverThresholdMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 790374683:
                        if (strLJJJJ.equals("sub_component_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.subComponentType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 924172579:
                        if (strLJJJJ.equals("max_recover_remain_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.maxRecoverRemainMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1008208194:
                        if (strLJJJJ.equals("avoid_scene")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.avoidScene = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1290803574:
                        if (strLJJJJ.equals("can_be_interrupt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.canBeInterrupt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1370341692:
                        if (strLJJJJ.equals("component_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                msgNotifyComponentAvoidRuleV2.componentType = c09cu.LJJIZ();
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
        return msgNotifyComponentAvoidRuleV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2) throws IOException {
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV22 = msgNotifyComponentAvoidRuleV2;
        if (msgNotifyComponentAvoidRuleV22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("avoid_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, msgNotifyComponentAvoidRuleV22.avoidScene, String.class);
        c09dl.LJIILLIIL("avoid_watch_early_ms");
        c09dl.LJJIZ(msgNotifyComponentAvoidRuleV22.avoidWatchEarlyMs);
        c09dl.LJIILLIIL("can_be_interrupt");
        c09dl.LJJJJJL(msgNotifyComponentAvoidRuleV22.canBeInterrupt);
        c09dl.LJIILLIIL("component_type");
        c09dl.LJJJJ(Integer.valueOf(msgNotifyComponentAvoidRuleV22.componentType));
        c09dl.LJIILLIIL("first_recover_info");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(MsgNotifyComponentRecoverInfo.class);
        typeAdapterLJIIJ.write(c09dl, msgNotifyComponentAvoidRuleV22.firstRecoverInfo);
        c09dl.LJIILLIIL("interrupt_recover_info");
        typeAdapterLJIIJ.write(c09dl, msgNotifyComponentAvoidRuleV22.interruptRecoverInfo);
        c09dl.LJIILLIIL("max_active_count");
        c09dl.LJJJJ(Integer.valueOf(msgNotifyComponentAvoidRuleV22.maxActiveCount));
        c09dl.LJIILLIIL("max_recover_remain_ms");
        c09dl.LJJIZ(msgNotifyComponentAvoidRuleV22.maxRecoverRemainMs);
        c09dl.LJIILLIIL("priority");
        c09dl.LJJIZ(msgNotifyComponentAvoidRuleV22.priority);
        c09dl.LJIILLIIL("recover_threshold_ms");
        c09dl.LJJIZ(msgNotifyComponentAvoidRuleV22.recoverThresholdMs);
        c09dl.LJIILLIIL("sub_component_type");
        c09dl.LJJJJ(Integer.valueOf(msgNotifyComponentAvoidRuleV22.subComponentType));
        c09dl.LJII();
    }
}
