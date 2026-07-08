package com.bytedance.byted_bach_sdk.buffer;

import com.bytedance.byted_bach_sdk.buffer.SingleExpressionDetectResult;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: loaded from: classes36.dex */
public class BachExpressionDetectAlgorithmOutput extends BachAlgorithmOutput {
    public Vector<SingleExpressionDetectResult> expressionDetectResults = new Vector<>();

    public BachExpressionDetectAlgorithmOutput(HashMap<String, BachObject>[] mapArr) {
        SingleExpressionDetectResult.FaceGender faceGender;
        for (HashMap<String, BachObject> map : mapArr) {
            SingleExpressionDetectResult singleExpressionDetectResult = new SingleExpressionDetectResult();
            singleExpressionDetectResult.ID = (int) map.get(FollowStatusChangeMethod.PARAM_UID).valueResult.int64Val;
            singleExpressionDetectResult.age = (float) map.get("age").valueResult.doubleVal;
            singleExpressionDetectResult.boy_prob = (float) map.get("boy_prob").valueResult.doubleVal;
            if (map.get("gender").valueResult.int64Val < 0) {
                singleExpressionDetectResult.gender = SingleExpressionDetectResult.FaceGender.UNKNOWN;
            } else {
                if (map.get("gender").valueResult.int64Val == 1) {
                    faceGender = SingleExpressionDetectResult.FaceGender.MALE;
                } else {
                    faceGender = SingleExpressionDetectResult.FaceGender.FEMALE;
                }
                singleExpressionDetectResult.gender = faceGender;
            }
            singleExpressionDetectResult.attractive = (float) map.get("attractive").valueResult.doubleVal;
            singleExpressionDetectResult.happy_score = (float) map.get("happy_score").valueResult.doubleVal;
            if (map.get("exp_type").valueResult.int64Val < 0) {
                singleExpressionDetectResult.exp_type = SingleExpressionDetectResult.FaceExpression.UNKNOWN;
            } else {
                singleExpressionDetectResult.exp_type = SingleExpressionDetectResult.FaceExpression.values()[(int) map.get("exp_type").valueResult.int64Val];
            }
            Vector<Float> vector = new Vector<>();
            for (double d : map.get("exp_probs").valueResult.vecFVal) {
                vector.add(Float.valueOf((float) d));
            }
            singleExpressionDetectResult.exp_probs = vector;
            singleExpressionDetectResult.real_face_prob = (float) map.get("real_face_prob").valueResult.doubleVal;
            singleExpressionDetectResult.quality = (float) map.get("quality").valueResult.doubleVal;
            this.expressionDetectResults.add(singleExpressionDetectResult);
        }
    }
}
