package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetPhaseInfo_OptTypeAdapter extends TypeAdapter<WidgetPhaseInfo> {
    public final Gson LIZ;

    public WidgetPhaseInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final WidgetPhaseInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetPhaseInfo widgetPhaseInfo = new WidgetPhaseInfo(null, 0, 0, 0L, null, false, 0, null, false, 0, 1023, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1646867447:
                        if (strLJJJJ.equals("delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.delayTimes = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -766966155:
                        if (strLJJJJ.equals("show_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.showStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -530704819:
                        if (strLJJJJ.equals("run_after_frame_draw")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.runAfterFrameDraw = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -484456511:
                        if (strLJJJJ.equals("component_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.componentDelay = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00VU
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3373707:
                        if (strLJJJJ.equals("name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.name = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 100346066:
                        if (strLJJJJ.equals("index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.index = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 275762119:
                        if (strLJJJJ.equals("show_when_last_phase_shown")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.waitLastPhaseShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 941354391:
                        if (strLJJJJ.equals("animate_show_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.animateShow = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1380938712:
                        if (strLJJJJ.equals("function")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.funcList = C473040Igo.LIZ(this.LIZ, c09cu, WidgetFunctionInfo.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1389383004:
                        if (strLJJJJ.equals("load_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetPhaseInfo.loadMode = c09cu.LJJIZ();
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
        return widgetPhaseInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetPhaseInfo widgetPhaseInfo) throws IOException {
        WidgetPhaseInfo widgetPhaseInfo2 = widgetPhaseInfo;
        if (widgetPhaseInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("function");
        C473040Igo.LIZLLL(this.LIZ, c09dl, widgetPhaseInfo2.funcList, WidgetFunctionInfo.class);
        c09dl.LJIILLIIL("load_mode");
        c09dl.LJJJJ(Integer.valueOf(widgetPhaseInfo2.loadMode));
        c09dl.LJIILLIIL("show_strategy");
        c09dl.LJJJJ(Integer.valueOf(widgetPhaseInfo2.showStrategy));
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(widgetPhaseInfo2.delayTimes);
        c09dl.LJIILLIIL("name");
        c09dl.LJJJJJ(widgetPhaseInfo2.name);
        c09dl.LJIILLIIL("show_when_last_phase_shown");
        c09dl.LJJJJJL(widgetPhaseInfo2.waitLastPhaseShow);
        c09dl.LJIILLIIL("animate_show_strategy");
        c09dl.LJJJJ(Integer.valueOf(widgetPhaseInfo2.animateShow));
        c09dl.LJIILLIIL("component_delay");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.00VV
        }).write(c09dl, widgetPhaseInfo2.componentDelay);
        c09dl.LJIILLIIL("run_after_frame_draw");
        c09dl.LJJJJJL(widgetPhaseInfo2.runAfterFrameDraw);
        c09dl.LJIILLIIL("index");
        c09dl.LJJJJ(Integer.valueOf(widgetPhaseInfo2.index));
        c09dl.LJII();
    }
}
