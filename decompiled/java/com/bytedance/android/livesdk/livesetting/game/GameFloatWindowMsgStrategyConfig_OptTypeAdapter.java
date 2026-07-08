package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class GameFloatWindowMsgStrategyConfig_OptTypeAdapter extends TypeAdapter<GameFloatWindowMsgStrategyConfig> {
    public final Gson LIZ;

    public GameFloatWindowMsgStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameFloatWindowMsgStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameFloatWindowMsgStrategyConfig gameFloatWindowMsgStrategyConfig = new GameFloatWindowMsgStrategyConfig(2000L, 1000L, 3, false, false, 3, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 696088131:
                        if (strLJJJJ.equals("max_count_chat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.maxCountChat = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 696208411:
                        if (strLJJJJ.equals("max_count_gift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.maxCountGift = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1692987430:
                        if (strLJJJJ.equals("enabled_strategy_chat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.enableStrategyChat = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1693107710:
                        if (strLJJJJ.equals("enabled_strategy_gift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.enableStrategyGift = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1752416701:
                        if (strLJJJJ.equals("strategy_chat_show_time1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.strategyChatShowTimeOne = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1752416702:
                        if (strLJJJJ.equals("strategy_chat_show_time2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.strategyChatShowTimeTwo = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1761955628:
                        if (strLJJJJ.equals("strategy_chat_free_time_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameFloatWindowMsgStrategyConfig.strategyChatFreeTimeNum = c09cu.LJJIZ();
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
        return gameFloatWindowMsgStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameFloatWindowMsgStrategyConfig gameFloatWindowMsgStrategyConfig) throws IOException {
        GameFloatWindowMsgStrategyConfig gameFloatWindowMsgStrategyConfig2 = gameFloatWindowMsgStrategyConfig;
        if (gameFloatWindowMsgStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategy_chat_show_time1");
        c09dl.LJJIZ(gameFloatWindowMsgStrategyConfig2.strategyChatShowTimeOne);
        c09dl.LJIILLIIL("strategy_chat_show_time2");
        c09dl.LJJIZ(gameFloatWindowMsgStrategyConfig2.strategyChatShowTimeTwo);
        c09dl.LJIILLIIL("strategy_chat_free_time_num");
        c09dl.LJJJJ(Integer.valueOf(gameFloatWindowMsgStrategyConfig2.strategyChatFreeTimeNum));
        c09dl.LJIILLIIL("enabled_strategy_chat");
        c09dl.LJJJJJL(gameFloatWindowMsgStrategyConfig2.enableStrategyChat);
        c09dl.LJIILLIIL("enabled_strategy_gift");
        c09dl.LJJJJJL(gameFloatWindowMsgStrategyConfig2.enableStrategyGift);
        c09dl.LJIILLIIL("max_count_gift");
        c09dl.LJJJJ(Integer.valueOf(gameFloatWindowMsgStrategyConfig2.maxCountGift));
        c09dl.LJIILLIIL("max_count_chat");
        c09dl.LJJJJ(Integer.valueOf(gameFloatWindowMsgStrategyConfig2.maxCountChat));
        c09dl.LJII();
    }
}
