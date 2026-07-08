package com.ss.ttlivestreamer.core.scene_detect;

import X.C2188811AlT;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHSceneDetectResultInfo {
    public int age;
    public boolean available;
    public float averageBrightness;
    public float faceBrightness;
    public int faceCount;
    public List<Float> faceRect;
    public float gender;
    public ByteBuffer mattingBuffer;
    public int mattingInfoHeight;
    public int mattingInfoWidth;
    public int processCostMs;
    public int sceneType = -1;
    public ByteBuffer skinSegBuffer;
    public int skinSegHeight;
    public int skinSegWidth;
    public float strongLuminance;

    public TTLHSceneDetectResultInfo() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[zgx] scene detect info, available: ");
        sbLIZ.append(this.available);
        sbLIZ.append(", ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("age: ");
        sbLIZ2.append(this.age);
        sbLIZ2.append(", ");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append("gender: ");
        sbLIZ3.append(this.gender);
        sbLIZ3.append(", ");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append("faceCount: ");
        sbLIZ4.append(this.faceCount);
        sbLIZ4.append(", ");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ4);
        sbLIZ5.append("faceRect: ");
        sbLIZ5.append(this.faceRect);
        sbLIZ5.append(", ");
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ5);
        sbLIZ6.append("mattingInfoWidth: ");
        sbLIZ6.append(this.mattingInfoWidth);
        sbLIZ6.append(", ");
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ6);
        sbLIZ7.append("mattingInfoHeight: ");
        sbLIZ7.append(this.mattingInfoHeight);
        sbLIZ7.append(", ");
        String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(strLIZIZ7);
        sbLIZ8.append("mattingBuffer: ");
        sbLIZ8.append(this.mattingBuffer);
        sbLIZ8.append(", ");
        String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(strLIZIZ8);
        sbLIZ9.append("sceneType: ");
        sbLIZ9.append(this.sceneType);
        sbLIZ9.append(", ");
        String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ9);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(strLIZIZ9);
        sbLIZ10.append("faceBrightness: ");
        sbLIZ10.append(this.faceBrightness);
        sbLIZ10.append(", ");
        String strLIZIZ10 = C2188811AlT.LIZIZ(sbLIZ10);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(strLIZIZ10);
        sbLIZ11.append("averageBrightness: ");
        sbLIZ11.append(this.averageBrightness);
        sbLIZ11.append(", ");
        String strLIZIZ11 = C2188811AlT.LIZIZ(sbLIZ11);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(strLIZIZ11);
        sbLIZ12.append("strongLuminance: ");
        sbLIZ12.append(this.strongLuminance);
        sbLIZ12.append(", ");
        String strLIZIZ12 = C2188811AlT.LIZIZ(sbLIZ12);
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append(strLIZIZ12);
        sbLIZ13.append("processCostMs: ");
        sbLIZ13.append(this.processCostMs);
        sbLIZ13.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ13);
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setAvailable(boolean z) {
        this.available = z;
    }

    public void setAverageBrightness(float f) {
        this.averageBrightness = f;
    }

    public void setFaceBrightness(float f) {
        this.faceBrightness = f;
    }

    public void setFaceCount(int i) {
        this.faceCount = i;
    }

    public void setGender(float f) {
        this.gender = f;
    }

    public void setMattingBuffer(ByteBuffer byteBuffer) {
        this.mattingBuffer = byteBuffer;
    }

    public void setSceneType(int i) {
        this.sceneType = i;
    }

    public void setSkinSegBuffer(ByteBuffer byteBuffer) {
        this.skinSegBuffer = byteBuffer;
    }

    public void setStrongLuminance(float f) {
        this.strongLuminance = f;
    }

    public void setMattingInfoSize(int i, int i2) {
        this.mattingInfoWidth = i;
        this.mattingInfoHeight = i2;
    }

    public void setSkinSegInfoSize(int i, int i2) {
        this.skinSegWidth = i;
        this.skinSegHeight = i2;
    }

    public TTLHSceneDetectResultInfo(ByteBuffer byteBuffer, int i, int i2) {
        this.mattingBuffer = byteBuffer;
        this.mattingInfoWidth = i;
        this.mattingInfoHeight = i2;
    }

    public void setFaceRect(float f, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        this.faceRect = arrayList;
        arrayList.add(Float.valueOf(f));
        this.faceRect.add(Float.valueOf(f2));
        this.faceRect.add(Float.valueOf(f3));
        this.faceRect.add(Float.valueOf(f4));
    }
}
