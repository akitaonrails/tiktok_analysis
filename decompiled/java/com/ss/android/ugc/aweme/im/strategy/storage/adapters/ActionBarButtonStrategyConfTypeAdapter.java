package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.DisplayNameLang;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarButtonStrategyConfTypeAdapter extends TypeAdapter<ActionBarButtonStrategyConf> {
    public final Gson LIZ;

    public ActionBarButtonStrategyConfTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ActionBarButtonStrategyConf read(C09CU c09cu) {
        try {
            c09cu.LIZIZ();
            Integer numValueOf = null;
            String strLJJJZ = null;
            String strLJJJZ2 = null;
            String strLJJJZ3 = null;
            String strLJJJZ4 = null;
            String strLJJJZ5 = null;
            String strLJJJZ6 = null;
            String strLJJJZ7 = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            String strLJJJZ8 = null;
            String strLJJJZ9 = null;
            String strLJJJZ10 = null;
            String strLJJJZ11 = null;
            DisplayNameLang displayNameLang = null;
            String strLJJJZ12 = null;
            String strLJJJZ13 = null;
            Float fValueOf = null;
            String strLJJJZ14 = null;
            String strLJJJZ15 = null;
            Map map = null;
            boolean zLJJ = false;
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (strLJJJJ != null) {
                    switch (strLJJJJ.hashCode()) {
                        case -2107722413:
                            if (strLJJJJ.equals("click_action_schema")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ15 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case -1390915716:
                            if (strLJJJJ.equals("icon_dark")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ4 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case -1221029593:
                            if (strLJJJJ.equals("height")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    numValueOf3 = Integer.valueOf(c09cu.LJJIZ());
                                }
                            }
                            break;
                        case -377153155:
                            if (strLJJJJ.equals("sort_logic")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ14 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case -109978594:
                            if (strLJJJJ.equals("static_url")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ8 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 3355:
                            if (strLJJJJ.equals(FollowStatusChangeMethod.PARAM_UID)) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ5 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 3226745:
                            if (strLJJJJ.equals("icon")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ3 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 3575610:
                            if (strLJJJJ.equals("type")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    numValueOf = Integer.valueOf(c09cu.LJJIZ());
                                }
                            }
                            break;
                        case 11576648:
                            if (strLJJJJ.equals("button_id")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ14 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 110371416:
                            if (strLJJJJ.equals("title")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ2 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 113126854:
                            if (strLJJJJ.equals("width")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    numValueOf2 = Integer.valueOf(c09cu.LJJIZ());
                                }
                            }
                            break;
                        case 174824609:
                            if (strLJJJJ.equals("light_interaction_name")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ13 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 272578533:
                            if (strLJJJJ.equals("display_name_lang")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    displayNameLang = (DisplayNameLang) this.LIZ.LJIIJ(DisplayNameLang.class).read(c09cu);
                                }
                            }
                            break;
                        case 621291653:
                            if (strLJJJJ.equals("scp_biz_extra")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    map = (Map) this.LIZ.LJIIJ(Map.class).read(c09cu);
                                }
                            }
                            break;
                        case 885608043:
                            if (strLJJJJ.equals("static_type")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ10 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 979421212:
                            if (strLJJJJ.equals("resource_name")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ12 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 1044822488:
                            if (strLJJJJ.equals("animate_type")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ11 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 1142083345:
                            if (strLJJJJ.equals("animate_url")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ9 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 1234537196:
                            if (strLJJJJ.equals("resource_id")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ6 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 1349547969:
                            if (strLJJJJ.equals("sequence")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    fValueOf = Float.valueOf((float) c09cu.LJJIL());
                                }
                            }
                            break;
                        case 1524067274:
                            if (strLJJJJ.equals("action_schema")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 1615086568:
                            if (strLJJJJ.equals("display_name")) {
                                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                    c09cu.LJJJJJL();
                                } else {
                                    strLJJJZ7 = c09cu.LJJJZ();
                                }
                            }
                            break;
                        case 2090633662:
                            if (strLJJJJ.equals("flip_icon_on_rtl")) {
                                zLJJ = c09cu.LJJ();
                            }
                            break;
                    }
                }
                c09cu.LJJZ();
            }
            c09cu.LJII();
            return new ActionBarButtonStrategyConf(numValueOf, strLJJJZ, strLJJJZ2, strLJJJZ3, strLJJJZ4, strLJJJZ5, strLJJJZ6, strLJJJZ7, numValueOf2, numValueOf3, strLJJJZ8, strLJJJZ9, strLJJJZ10, strLJJJZ11, displayNameLang, strLJJJZ12, strLJJJZ13, zLJJ, fValueOf, strLJJJZ14, null, strLJJJZ15, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ActionBarButtonStrategyConf(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ActionBarButtonStrategyConf actionBarButtonStrategyConf) {
        Double dValueOf;
        ActionBarButtonStrategyConf actionBarButtonStrategyConf2 = actionBarButtonStrategyConf;
        try {
            c09dl.LIZLLL();
            c09dl.LJIILLIIL("type");
            c09dl.LJJJJ(actionBarButtonStrategyConf2.type);
            c09dl.LJIILLIIL("action_schema");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.actionSchema);
            c09dl.LJIILLIIL("title");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.title);
            c09dl.LJIILLIIL("icon");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.icon);
            c09dl.LJIILLIIL("icon_dark");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.iconDark);
            c09dl.LJIILLIIL(FollowStatusChangeMethod.PARAM_UID);
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.id);
            c09dl.LJIILLIIL("resource_id");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.resourceId);
            c09dl.LJIILLIIL("display_name");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.displayName);
            c09dl.LJIILLIIL("width");
            c09dl.LJJJJ(actionBarButtonStrategyConf2.width);
            c09dl.LJIILLIIL("height");
            c09dl.LJJJJ(actionBarButtonStrategyConf2.height);
            c09dl.LJIILLIIL("static_url");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.staticUrl);
            c09dl.LJIILLIIL("animate_url");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.animateUrl);
            c09dl.LJIILLIIL("static_type");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.staticType);
            c09dl.LJIILLIIL("animate_type");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.animateType);
            c09dl.LJIILLIIL("display_name_lang");
            if (actionBarButtonStrategyConf2.displayNameLang == null) {
                c09dl.LJIJJ();
            } else {
                this.LIZ.LJIIJ(DisplayNameLang.class).write(c09dl, actionBarButtonStrategyConf2.displayNameLang);
            }
            c09dl.LJIILLIIL("resource_name");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.resourceName);
            c09dl.LJIILLIIL("light_interaction_name");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.lightInteractionName);
            c09dl.LJIILLIIL("flip_icon_on_rtl");
            c09dl.LJJJJJL(actionBarButtonStrategyConf2.flipIconOnRTL);
            c09dl.LJIILLIIL("sequence");
            if (actionBarButtonStrategyConf2.sequence != null) {
                dValueOf = Double.valueOf(r0.floatValue());
            } else {
                dValueOf = null;
            }
            c09dl.LJJJJ(dValueOf);
            c09dl.LJIILLIIL("button_id");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.buttonId);
            c09dl.LJIILLIIL("sort_logic");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.sortLogic);
            c09dl.LJIILLIIL("click_action_schema");
            c09dl.LJJJJJ(actionBarButtonStrategyConf2.clickActionSchema);
            c09dl.LJIILLIIL("scp_biz_extra");
            if (actionBarButtonStrategyConf2.scpBizExtra == null) {
                c09dl.LJIJJ();
            } else {
                this.LIZ.LJIIJ(Map.class).write(c09dl, actionBarButtonStrategyConf2.scpBizExtra);
            }
            c09dl.LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
