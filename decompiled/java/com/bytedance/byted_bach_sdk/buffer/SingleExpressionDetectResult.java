package com.bytedance.byted_bach_sdk.buffer;

import X.C08FF;
import java.util.Vector;

/* JADX INFO: loaded from: classes36.dex */
public class SingleExpressionDetectResult {
    public float age;
    public float attractive;
    public float boy_prob;
    public Vector<Float> exp_probs;
    public float happy_score;
    public float quality;
    public float real_face_prob;
    public int ID = -1;
    public FaceGender gender = FaceGender.UNKNOWN;
    public FaceExpression exp_type = FaceExpression.UNKNOWN;

    /* JADX INFO: loaded from: classes26.dex */
    public enum FaceExpression {
        ANGRY,
        DISGUST,
        FEAR,
        HAPPY,
        SAD,
        SURPRISE,
        NEUTRAL,
        NUM_EXPRESSION,
        UNKNOWN;

        public static FaceExpression valueOf(String str) {
            return (FaceExpression) C08FF.LIZ(FaceExpression.class, str);
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    public enum FaceGender {
        MALE,
        FEMALE,
        UNKNOWN;

        public static FaceGender valueOf(String str) {
            return (FaceGender) C08FF.LIZ(FaceGender.class, str);
        }
    }
}
