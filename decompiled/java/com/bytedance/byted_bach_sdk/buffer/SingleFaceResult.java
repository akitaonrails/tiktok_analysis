package com.bytedance.byted_bach_sdk.buffer;

import java.util.Vector;

/* JADX INFO: loaded from: classes36.dex */
public class SingleFaceResult {
    public long action;
    public float bbox_height;
    public float bbox_width;
    public float bbox_x;
    public float bbox_y;
    public float eye_dist;
    public Vector<Vector<Float>> eye_left;
    public Vector<Vector<Float>> eye_right;
    public Vector<Vector<Float>> eyebrow_left;
    public Vector<Vector<Float>> eyebrow_right;
    public Vector<Short> face_mask;
    public Vector<Float> face_warp_mat;
    public Vector<Vector<Float>> left_iris;
    public Vector<Vector<Float>> lips;
    public int m_height;
    public int m_width;
    public Vector<Short> mouth_mask;
    public Vector<Float> mouth_warp_mat;
    public float occlusion_prob;
    public float pitch;
    public Vector<Vector<Float>> points_array;
    public Vector<Vector<Float>> right_iris;
    public float roll;
    public float score;
    public Vector<Short> teeth_mask;
    public Vector<Float> teeth_warp_mat;
    public long tracking_cnt;
    public Vector<Float> visibility_array;
    public float yaw;
    public int ID = -1;
    public int mouth_id = -1;
    public int mouth_mask_size = -1;
    public int teeth_id = -1;
    public int teeth_mask_size = -1;
    public int face_id = -1;
    public int face_mask_size = -1;
    public int eye_count = -1;
    public int eyebrow_count = -1;
    public int lips_count = -1;
    public int iris_count = -1;
}
