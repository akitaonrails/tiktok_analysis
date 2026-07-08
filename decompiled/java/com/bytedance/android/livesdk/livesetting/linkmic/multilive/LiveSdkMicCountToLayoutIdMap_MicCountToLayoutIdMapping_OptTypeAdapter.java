package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter extends TypeAdapter<LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping = new LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping("1016", "1015", "1017", "1006", "1014", "1002", "1012", "1022", "1013", "1011", "1014", "1012", "1013_seat", "1011_seat", "1013_c1", "1011_c1", "1013_seat_c1", "1011_seat_c1");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1811061741:
                        if (strLJJJJ.equals("origin_unfix_grid_with_empty_seat_when_no_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.gridFloatWithoutGuest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1730584427:
                        if (strLJJJJ.equals("origin_grid_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.originGridFix = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1589163540:
                        if (strLJJJJ.equals("fix_grid_3_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixGrid3UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1465046457:
                        if (strLJJJJ.equals("fix_grid_8_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixGrid8UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1284235943:
                        if (strLJJJJ.equals("origin_panel_float_with_empty_seat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.panelFloatWithEmptySeat = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -877730383:
                        if (strLJJJJ.equals("origin_unfix_float_with_empty_seat_when_no_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.panelFloatWithoutGuest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -575761023:
                        if (strLJJJJ.equals("origin_panel_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.originPanelFix = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -564790819:
                        if (strLJJJJ.equals("origin_unfix_float_with_empty_seat_always")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.panelFloatWithEmptySeatWithoutGuest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -453915795:
                        if (strLJJJJ.equals("origin_grid_float_with_empty_seat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.gridFloatWithEmptySeat = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -159129251:
                        if (strLJJJJ.equals("fix_panel_8_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixPanel8UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 153646795:
                        if (strLJJJJ.equals("fix_grid_4_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixGrid4UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 650217375:
                        if (strLJJJJ.equals("fix_panel_6_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixPanel6UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 833226171:
                        if (strLJJJJ.equals("origin_unfix_grid_with_empty_seat_always")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.gridFloatWithEmptySeatWithoutGuest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 962993421:
                        if (strLJJJJ.equals("fix_grid_2_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixGrid2UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1027408931:
                        if (strLJJJJ.equals("grid_float")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.gridFloat = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1459564001:
                        if (strLJJJJ.equals("fix_panel_4_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixPanel4UiBtn = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1580072033:
                        if (strLJJJJ.equals("panel_float")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.panelFloat = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1896457130:
                        if (strLJJJJ.equals("fix_grid_5_ui_btn")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                micCountToLayoutIdMapping.fixGrid5UiBtn = c09cu.LJJJZ();
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
        return micCountToLayoutIdMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping) {
        LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping2 = micCountToLayoutIdMapping;
        if (micCountToLayoutIdMapping2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fix_grid_2_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixGrid2UiBtn);
        c09dl.LJIILLIIL("fix_grid_3_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixGrid3UiBtn);
        c09dl.LJIILLIIL("fix_grid_4_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixGrid4UiBtn);
        c09dl.LJIILLIIL("fix_grid_5_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixGrid5UiBtn);
        c09dl.LJIILLIIL("fix_grid_8_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixGrid8UiBtn);
        c09dl.LJIILLIIL("fix_panel_4_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixPanel4UiBtn);
        c09dl.LJIILLIIL("fix_panel_6_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixPanel6UiBtn);
        c09dl.LJIILLIIL("fix_panel_8_ui_btn");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.fixPanel8UiBtn);
        c09dl.LJIILLIIL("grid_float");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.gridFloat);
        c09dl.LJIILLIIL("panel_float");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.panelFloat);
        c09dl.LJIILLIIL("origin_grid_fix");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.originGridFix);
        c09dl.LJIILLIIL("origin_panel_fix");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.originPanelFix);
        c09dl.LJIILLIIL("origin_grid_float_with_empty_seat");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.gridFloatWithEmptySeat);
        c09dl.LJIILLIIL("origin_panel_float_with_empty_seat");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.panelFloatWithEmptySeat);
        c09dl.LJIILLIIL("origin_unfix_grid_with_empty_seat_when_no_guest");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.gridFloatWithoutGuest);
        c09dl.LJIILLIIL("origin_unfix_float_with_empty_seat_when_no_guest");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.panelFloatWithoutGuest);
        c09dl.LJIILLIIL("origin_unfix_grid_with_empty_seat_always");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.gridFloatWithEmptySeatWithoutGuest);
        c09dl.LJIILLIIL("origin_unfix_float_with_empty_seat_always");
        c09dl.LJJJJJ(micCountToLayoutIdMapping2.panelFloatWithEmptySeatWithoutGuest);
        c09dl.LJII();
    }
}
