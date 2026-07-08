package com.ss.bytertc.engine;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLocalVideoStats {
    public int codecEventCode;
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public double encoderOutputFrameRate;
    public double inputFrameRate;
    public boolean isHardwareCodec;
    public boolean isScreen;
    public int jitter;
    public double rendererOutputFrameRate;
    public int rtt;
    public double sentFrameRate;
    public float sentKBitrate;
    public String simEncInfo;
    public int statsInterval;
    public int videoDenoiseMode;
    public float videoLossRate;
    public ArrayList<Integer> simEncWidth = new ArrayList<>();
    public ArrayList<Integer> simEncHeight = new ArrayList<>();
    public ArrayList<Integer> simEncFramerate = new ArrayList<>();
    public ArrayList<Integer> simEncBps = new ArrayList<>();

    public InternalLocalVideoStats() {
    }

    public InternalLocalVideoStats(float f, double d, double d2, double d3, double d4, int i, float f2, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, boolean z2, int i9, int i10, String str) {
        this.sentKBitrate = f;
        this.inputFrameRate = d;
        this.sentFrameRate = d2;
        this.encoderOutputFrameRate = d3;
        this.rendererOutputFrameRate = d4;
        this.statsInterval = i;
        this.videoLossRate = f2;
        this.rtt = i2;
        this.encodedBitrate = i3;
        this.encodedFrameWidth = i4;
        this.encodedFrameHeight = i5;
        this.encodedFrameCount = i6;
        this.codecType = i7;
        this.isHardwareCodec = z;
        this.codecEventCode = i8;
        this.isScreen = z2;
        this.jitter = i9;
        this.videoDenoiseMode = i10;
        this.simEncInfo = str;
        for (String str2 : str.split("\\+")) {
            if (!str2.isEmpty()) {
                String[] strArrSplit = str2.split("x");
                if (strArrSplit.length == 4) {
                    this.simEncWidth.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[0])));
                    this.simEncHeight.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[1])));
                    this.simEncFramerate.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[2])));
                    this.simEncBps.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[3])));
                }
            }
        }
    }

    public static InternalLocalVideoStats create(float f, double d, double d2, double d3, double d4, int i, float f2, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, boolean z2, int i9, int i10, String str) {
        return new InternalLocalVideoStats(f, d, d2, d3, d4, i, f2, i2, i3, i4, i5, i6, i7, z, i8, z2, i9, i10, str);
    }
}
