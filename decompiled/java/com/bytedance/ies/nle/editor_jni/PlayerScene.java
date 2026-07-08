package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum PlayerScene {
    DEFAULT(0),
    MV(1),
    ALGORITHM(2),
    CANVAS(3),
    ALGORTHM_WITH_CANVAS(4),
    UNKNOWN(5);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static PlayerScene swigToEnum(int i) {
        PlayerScene[] playerSceneArr = (PlayerScene[]) PlayerScene.class.getEnumConstants();
        if (i < playerSceneArr.length && i >= 0) {
            PlayerScene playerScene = playerSceneArr[i];
            if (playerScene.swigValue == i) {
                return playerScene;
            }
        }
        for (PlayerScene playerScene2 : playerSceneArr) {
            if (playerScene2.swigValue == i) {
                return playerScene2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(PlayerScene.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static PlayerScene valueOf(String str) {
        return (PlayerScene) C08FF.LIZ(PlayerScene.class, str);
    }

    PlayerScene() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    PlayerScene(PlayerScene playerScene) {
        int i = playerScene.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    PlayerScene(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
