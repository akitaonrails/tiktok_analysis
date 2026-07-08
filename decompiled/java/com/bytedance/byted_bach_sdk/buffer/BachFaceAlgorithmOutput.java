package com.bytedance.byted_bach_sdk.buffer;

import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: loaded from: classes36.dex */
public class BachFaceAlgorithmOutput extends BachAlgorithmOutput {
    public Vector<SingleFaceResult> faceResults = new Vector<>();

    public BachFaceAlgorithmOutput(HashMap<String, BachObject>[] mapArr) {
        for (HashMap<String, BachObject> map : mapArr) {
            SingleFaceResult singleFaceResult = new SingleFaceResult();
            singleFaceResult.m_width = (int) map.get("m_width").valueResult.int64Val;
            singleFaceResult.m_height = (int) map.get("m_height").valueResult.int64Val;
            singleFaceResult.bbox_x = (float) map.get("bbox_x").valueResult.doubleVal;
            singleFaceResult.bbox_y = (float) map.get("bbox_y").valueResult.doubleVal;
            singleFaceResult.bbox_width = (float) map.get("bbox_width").valueResult.doubleVal;
            singleFaceResult.bbox_height = (float) map.get("bbox_height").valueResult.doubleVal;
            singleFaceResult.score = (float) map.get("score").valueResult.doubleVal;
            singleFaceResult.points_array = new Vector<>();
            for (BachObject bachObject : map.get("points_array").vectorResult) {
                Vector<Float> vector = new Vector<>();
                vector.add(Float.valueOf((float) bachObject.valueResult.vecFVal[0]));
                vector.add(Float.valueOf((float) bachObject.valueResult.vecFVal[1]));
                singleFaceResult.points_array.add(vector);
            }
            Vector<Float> vector2 = new Vector<>();
            for (double d : map.get("visibility_array").valueResult.vecFVal) {
                vector2.add(Float.valueOf((float) d));
            }
            singleFaceResult.visibility_array = vector2;
            singleFaceResult.roll = (float) map.get("roll").valueResult.doubleVal;
            singleFaceResult.yaw = (float) map.get("yaw").valueResult.doubleVal;
            singleFaceResult.pitch = (float) map.get("pitch").valueResult.doubleVal;
            singleFaceResult.eye_dist = (float) map.get("eye_dist").valueResult.doubleVal;
            singleFaceResult.ID = (int) map.get("ID").valueResult.int64Val;
            singleFaceResult.action = map.get("action").valueResult.int64Val;
            singleFaceResult.tracking_cnt = map.get("tracking_cnt").valueResult.int64Val;
            singleFaceResult.occlusion_prob = (float) map.get("occlusion_prob").valueResult.doubleVal;
            if (map.containsKey("mouth_id")) {
                singleFaceResult.mouth_id = (int) map.get("mouth_id").valueResult.int64Val;
                singleFaceResult.mouth_mask_size = (int) map.get("mouth_mask_size").valueResult.int64Val;
                Vector<Short> vector3 = new Vector<>();
                int length = map.get("mouth_mask").valueResult.vecIVal.length;
                for (int i = 0; i < length; i++) {
                    vector3.add(Short.valueOf((short) r8[i]));
                }
                singleFaceResult.mouth_mask = vector3;
                Vector<Float> vector4 = new Vector<>();
                for (double d2 : map.get("mouth_warp_mat").valueResult.vecFVal) {
                    vector4.add(Float.valueOf((float) d2));
                }
                singleFaceResult.mouth_warp_mat = vector4;
            }
            if (map.containsKey("teeth_id")) {
                singleFaceResult.teeth_id = (int) map.get("teeth_id").valueResult.int64Val;
                singleFaceResult.teeth_mask_size = (int) map.get("teeth_mask_size").valueResult.int64Val;
                Vector<Short> vector5 = new Vector<>();
                int length2 = map.get("teeth_mask").valueResult.vecIVal.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    vector5.add(Short.valueOf((short) r8[i2]));
                }
                singleFaceResult.teeth_mask = vector5;
                Vector<Float> vector6 = new Vector<>();
                for (double d3 : map.get("teeth_warp_mat").valueResult.vecFVal) {
                    vector6.add(Float.valueOf((float) d3));
                }
                singleFaceResult.teeth_warp_mat = vector6;
            }
            if (map.containsKey("face_id")) {
                singleFaceResult.face_id = (int) map.get("face_id").valueResult.int64Val;
                singleFaceResult.face_mask_size = (int) map.get("face_mask_size").valueResult.int64Val;
                Vector<Short> vector7 = new Vector<>();
                int length3 = map.get("face_mask").valueResult.vecIVal.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    vector7.add(Short.valueOf((short) r9[i3]));
                }
                singleFaceResult.face_mask = vector7;
                Vector<Float> vector8 = new Vector<>();
                for (double d4 : map.get("face_warp_mat").valueResult.vecFVal) {
                    vector8.add(Float.valueOf((float) d4));
                }
                singleFaceResult.face_warp_mat = vector8;
            }
            if (map.containsKey("eye_count")) {
                singleFaceResult.eye_count = (int) map.get("eye_count").valueResult.int64Val;
                singleFaceResult.eyebrow_count = (int) map.get("eyebrow_count").valueResult.int64Val;
                singleFaceResult.lips_count = (int) map.get("lips_count").valueResult.int64Val;
                singleFaceResult.iris_count = (int) map.get("iris_count").valueResult.int64Val;
                singleFaceResult.eye_left = new Vector<>();
                for (BachObject bachObject2 : map.get("eye_left").vectorResult) {
                    Vector<Float> vector9 = new Vector<>();
                    vector9.add(Float.valueOf((float) bachObject2.valueResult.vecFVal[0]));
                    vector9.add(Float.valueOf((float) bachObject2.valueResult.vecFVal[1]));
                    singleFaceResult.eye_left.add(vector9);
                }
                singleFaceResult.eye_right = new Vector<>();
                for (BachObject bachObject3 : map.get("eye_right").vectorResult) {
                    Vector<Float> vector10 = new Vector<>();
                    vector10.add(Float.valueOf((float) bachObject3.valueResult.vecFVal[0]));
                    vector10.add(Float.valueOf((float) bachObject3.valueResult.vecFVal[1]));
                    singleFaceResult.eye_right.add(vector10);
                }
                singleFaceResult.eyebrow_left = new Vector<>();
                for (BachObject bachObject4 : map.get("eyebrow_left").vectorResult) {
                    Vector<Float> vector11 = new Vector<>();
                    vector11.add(Float.valueOf((float) bachObject4.valueResult.vecFVal[0]));
                    vector11.add(Float.valueOf((float) bachObject4.valueResult.vecFVal[1]));
                    singleFaceResult.eyebrow_left.add(vector11);
                }
                singleFaceResult.eyebrow_right = new Vector<>();
                for (BachObject bachObject5 : map.get("eyebrow_right").vectorResult) {
                    Vector<Float> vector12 = new Vector<>();
                    vector12.add(Float.valueOf((float) bachObject5.valueResult.vecFVal[0]));
                    vector12.add(Float.valueOf((float) bachObject5.valueResult.vecFVal[1]));
                    singleFaceResult.eyebrow_right.add(vector12);
                }
                singleFaceResult.lips = new Vector<>();
                for (BachObject bachObject6 : map.get("lips").vectorResult) {
                    Vector<Float> vector13 = new Vector<>();
                    vector13.add(Float.valueOf((float) bachObject6.valueResult.vecFVal[0]));
                    vector13.add(Float.valueOf((float) bachObject6.valueResult.vecFVal[1]));
                    singleFaceResult.lips.add(vector13);
                }
                singleFaceResult.left_iris = new Vector<>();
                for (BachObject bachObject7 : map.get("left_iris").vectorResult) {
                    Vector<Float> vector14 = new Vector<>();
                    vector14.add(Float.valueOf((float) bachObject7.valueResult.vecFVal[0]));
                    vector14.add(Float.valueOf((float) bachObject7.valueResult.vecFVal[1]));
                    singleFaceResult.left_iris.add(vector14);
                }
                singleFaceResult.right_iris = new Vector<>();
                for (BachObject bachObject8 : map.get("right_iris").vectorResult) {
                    Vector<Float> vector15 = new Vector<>();
                    vector15.add(Float.valueOf((float) bachObject8.valueResult.vecFVal[0]));
                    vector15.add(Float.valueOf((float) bachObject8.valueResult.vecFVal[1]));
                    singleFaceResult.right_iris.add(vector15);
                }
            }
            this.faceResults.add(singleFaceResult);
        }
    }
}
