package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyTransferConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.CustomMessageBubbleNewLabelResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerConfigResolvingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerScoreUpdatingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyConfigDataTypeAdapter extends TypeAdapter<StrategyConfigData> {
    public final Gson LIZ;

    public StrategyConfigDataTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final StrategyConfigData read(C09CU c09cu) {
        c09cu.LIZIZ();
        LinkedHashMap linkedHashMap = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        LinkedHashMap linkedHashMap2 = null;
        LinkedHashMap linkedHashMap3 = null;
        LinkedHashMap linkedHashMap4 = null;
        LinkedHashMap linkedHashMap5 = null;
        LinkedHashMap linkedHashMap6 = null;
        LinkedHashMap linkedHashMap7 = null;
        LinkedHashMap linkedHashMap8 = null;
        LinkedHashMap linkedHashMap9 = null;
        LinkedHashMap linkedHashMap10 = null;
        LinkedHashMap linkedHashMap11 = null;
        LinkedHashMap linkedHashMap12 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -779376008:
                        if (strLJJJJ.equals("action_bar_base_state")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap7 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap7.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(ActionBarStrategyConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case -527375826:
                        if (strLJJJJ.equals("action_bar_state_transfer")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap8 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap8.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(ActionBarStrategyTransferConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 61309516:
                        if (strLJJJJ.equals("preshown_sticker")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap9 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap9.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(PreshownStickerConfigResolvingResult.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 352911745:
                        if (strLJJJJ.equals("err_scenes")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList2 = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList2.add(c09cu.LJJJZ());
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case 524130316:
                        if (strLJJJJ.equals("light_interaction_common_resource")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap5 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap5.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(LightInteractionCommonResource.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 716907989:
                        if (strLJJJJ.equals("light_interaction_entry_test")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap4 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap4.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(LightInteractionEntryConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 770713272:
                        if (strLJJJJ.equals("resource_scenes")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList.add(c09cu.LJJJZ());
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case 851242472:
                        if (strLJJJJ.equals("custom_message_bubble_new_label")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap11 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap11.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(CustomMessageBubbleNewLabelResult.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1116678428:
                        if (strLJJJJ.equals("light_interaction_entry")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap2 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap2.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(LightInteractionEntryConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1209245167:
                        if (strLJJJJ.equals("streak_milestone")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap3 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap3.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(StreakMilestoneConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1487415703:
                        if (strLJJJJ.equals("preshown_sticker_action_scores")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap10 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap10.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(PreshownStickerScoreUpdatingResult.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1529364082:
                        if (strLJJJJ.equals("decision_trees")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(DecisionTree.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1659697673:
                        if (strLJJJJ.equals("chat_config")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap12 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap12.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(ChatFeatureListConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                    case 1852186250:
                        if (strLJJJJ.equals("action_bar")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                linkedHashMap6 = new LinkedHashMap();
                                c09cu.LIZIZ();
                                while (c09cu.LJIIZILJ()) {
                                    linkedHashMap6.put(c09cu.LJJJJ(), this.LIZ.LJIIJ(ActionBarStrategyConf.class).read(c09cu));
                                }
                                c09cu.LJII();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new StrategyConfigData(linkedHashMap, arrayList, arrayList2, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8, linkedHashMap9, linkedHashMap10, linkedHashMap11, linkedHashMap12, null);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StrategyConfigData strategyConfigData) {
        StrategyConfigData strategyConfigData2 = strategyConfigData;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("decision_trees");
        if (strategyConfigData2.getDecisionTree() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, DecisionTree> decisionTree = strategyConfigData2.getDecisionTree();
            if (decisionTree != null) {
                for (Map.Entry<String, DecisionTree> entry : decisionTree.entrySet()) {
                    String key = entry.getKey();
                    DecisionTree value = entry.getValue();
                    c09dl.LJIILLIIL(key);
                    this.LIZ.LJIIJ(DecisionTree.class).write(c09dl, value);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("resource_scenes");
        if (strategyConfigData2.getResourceScenes() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> resourceScenes = strategyConfigData2.getResourceScenes();
            if (resourceScenes != null) {
                Iterator<String> it2 = resourceScenes.iterator();
                while (it2.hasNext()) {
                    c09dl.LJJJJJ(it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("err_scenes");
        if (strategyConfigData2.getErrScenes() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> errScenes = strategyConfigData2.getErrScenes();
            if (errScenes != null) {
                Iterator<String> it3 = errScenes.iterator();
                while (it3.hasNext()) {
                    c09dl.LJJJJJ(it3.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("light_interaction_entry");
        if (strategyConfigData2.getLightInteractionEntry() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, LightInteractionEntryConf> lightInteractionEntry = strategyConfigData2.getLightInteractionEntry();
            if (lightInteractionEntry != null) {
                for (Map.Entry<String, LightInteractionEntryConf> entry2 : lightInteractionEntry.entrySet()) {
                    String key2 = entry2.getKey();
                    LightInteractionEntryConf value2 = entry2.getValue();
                    c09dl.LJIILLIIL(key2);
                    this.LIZ.LJIIJ(LightInteractionEntryConf.class).write(c09dl, value2);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("streak_milestone");
        if (strategyConfigData2.getStreakMilestone() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, StreakMilestoneConf> streakMilestone = strategyConfigData2.getStreakMilestone();
            if (streakMilestone != null) {
                for (Map.Entry<String, StreakMilestoneConf> entry3 : streakMilestone.entrySet()) {
                    String key3 = entry3.getKey();
                    StreakMilestoneConf value3 = entry3.getValue();
                    c09dl.LJIILLIIL(key3);
                    this.LIZ.LJIIJ(StreakMilestoneConf.class).write(c09dl, value3);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("light_interaction_entry_test");
        if (strategyConfigData2.getLightInteractionEntryTest() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, LightInteractionEntryConf> lightInteractionEntryTest = strategyConfigData2.getLightInteractionEntryTest();
            if (lightInteractionEntryTest != null) {
                for (Map.Entry<String, LightInteractionEntryConf> entry4 : lightInteractionEntryTest.entrySet()) {
                    String key4 = entry4.getKey();
                    LightInteractionEntryConf value4 = entry4.getValue();
                    c09dl.LJIILLIIL(key4);
                    this.LIZ.LJIIJ(LightInteractionEntryConf.class).write(c09dl, value4);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("light_interaction_common_resource");
        if (strategyConfigData2.getLightInteractionCommonResource() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, LightInteractionCommonResource> lightInteractionCommonResource = strategyConfigData2.getLightInteractionCommonResource();
            if (lightInteractionCommonResource != null) {
                for (Map.Entry<String, LightInteractionCommonResource> entry5 : lightInteractionCommonResource.entrySet()) {
                    String key5 = entry5.getKey();
                    LightInteractionCommonResource value5 = entry5.getValue();
                    c09dl.LJIILLIIL(key5);
                    this.LIZ.LJIIJ(LightInteractionCommonResource.class).write(c09dl, value5);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("action_bar");
        if (strategyConfigData2.getActionBarEntry() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, ActionBarStrategyConf> actionBarEntry = strategyConfigData2.getActionBarEntry();
            if (actionBarEntry != null) {
                for (Map.Entry<String, ActionBarStrategyConf> entry6 : actionBarEntry.entrySet()) {
                    String key6 = entry6.getKey();
                    ActionBarStrategyConf value6 = entry6.getValue();
                    c09dl.LJIILLIIL(key6);
                    this.LIZ.LJIIJ(ActionBarStrategyConf.class).write(c09dl, value6);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("action_bar_base_state");
        if (strategyConfigData2.getActionBarBaseState() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, ActionBarStrategyConf> actionBarBaseState = strategyConfigData2.getActionBarBaseState();
            if (actionBarBaseState != null) {
                for (Map.Entry<String, ActionBarStrategyConf> entry7 : actionBarBaseState.entrySet()) {
                    String key7 = entry7.getKey();
                    ActionBarStrategyConf value7 = entry7.getValue();
                    c09dl.LJIILLIIL(key7);
                    this.LIZ.LJIIJ(ActionBarStrategyConf.class).write(c09dl, value7);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("action_bar_state_transfer");
        if (strategyConfigData2.getActionBarStateTransfer() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, ActionBarStrategyTransferConf> actionBarStateTransfer = strategyConfigData2.getActionBarStateTransfer();
            if (actionBarStateTransfer != null) {
                for (Map.Entry<String, ActionBarStrategyTransferConf> entry8 : actionBarStateTransfer.entrySet()) {
                    String key8 = entry8.getKey();
                    ActionBarStrategyTransferConf value8 = entry8.getValue();
                    c09dl.LJIILLIIL(key8);
                    this.LIZ.LJIIJ(ActionBarStrategyTransferConf.class).write(c09dl, value8);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("preshown_sticker");
        if (strategyConfigData2.getPreshownStickerConfigResolvingResult() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, PreshownStickerConfigResolvingResult> preshownStickerConfigResolvingResult = strategyConfigData2.getPreshownStickerConfigResolvingResult();
            if (preshownStickerConfigResolvingResult != null) {
                for (Map.Entry<String, PreshownStickerConfigResolvingResult> entry9 : preshownStickerConfigResolvingResult.entrySet()) {
                    String key9 = entry9.getKey();
                    PreshownStickerConfigResolvingResult value9 = entry9.getValue();
                    c09dl.LJIILLIIL(key9);
                    this.LIZ.LJIIJ(PreshownStickerConfigResolvingResult.class).write(c09dl, value9);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("preshown_sticker_action_scores");
        if (strategyConfigData2.getPreshownStickerScoreUpdatingResult() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, PreshownStickerScoreUpdatingResult> preshownStickerScoreUpdatingResult = strategyConfigData2.getPreshownStickerScoreUpdatingResult();
            if (preshownStickerScoreUpdatingResult != null) {
                for (Map.Entry<String, PreshownStickerScoreUpdatingResult> entry10 : preshownStickerScoreUpdatingResult.entrySet()) {
                    String key10 = entry10.getKey();
                    PreshownStickerScoreUpdatingResult value10 = entry10.getValue();
                    c09dl.LJIILLIIL(key10);
                    this.LIZ.LJIIJ(PreshownStickerScoreUpdatingResult.class).write(c09dl, value10);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("custom_message_bubble_new_label");
        if (strategyConfigData2.getCustomMessageBubbleNewLabelResult() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, CustomMessageBubbleNewLabelResult> customMessageBubbleNewLabelResult = strategyConfigData2.getCustomMessageBubbleNewLabelResult();
            if (customMessageBubbleNewLabelResult != null) {
                for (Map.Entry<String, CustomMessageBubbleNewLabelResult> entry11 : customMessageBubbleNewLabelResult.entrySet()) {
                    String key11 = entry11.getKey();
                    CustomMessageBubbleNewLabelResult value11 = entry11.getValue();
                    c09dl.LJIILLIIL(key11);
                    this.LIZ.LJIIJ(CustomMessageBubbleNewLabelResult.class).write(c09dl, value11);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJIILLIIL("chat_config");
        if (strategyConfigData2.getChatFeaturesConfig() == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZLLL();
            Map<String, ChatFeatureListConf> chatFeaturesConfig = strategyConfigData2.getChatFeaturesConfig();
            if (chatFeaturesConfig != null) {
                for (Map.Entry<String, ChatFeatureListConf> entry12 : chatFeaturesConfig.entrySet()) {
                    String key12 = entry12.getKey();
                    ChatFeatureListConf value12 = entry12.getValue();
                    c09dl.LJIILLIIL(key12);
                    this.LIZ.LJIIJ(ChatFeatureListConf.class).write(c09dl, value12);
                }
            }
            c09dl.LJII();
        }
        c09dl.LJII();
    }
}
