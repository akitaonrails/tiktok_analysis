package com.ss.android.vesdk.algorithm;

import X.EnumC1155100gAG;
import X.InterfaceC1155110gAH;

/* JADX INFO: loaded from: classes36.dex */
public class VEBaseAlgorithmParam implements InterfaceC1155110gAH {
    public String mAlgorithmName;
    public int mAlgorithmType;
    public boolean mForInit;

    public VEBaseAlgorithmParam() {
    }

    public String getAlgorithmName() {
        return this.mAlgorithmName;
    }

    public int getAlgorithmType() {
        return this.mAlgorithmType;
    }

    public boolean getForInit() {
        return this.mForInit;
    }

    @Override // X.InterfaceC1155110gAH
    public EnumC1155100gAG getUsage() {
        return EnumC1155100gAG.DEFAULT;
    }

    public void setAlgorithmName(String str) {
        this.mAlgorithmName = str;
    }

    public void setAlgorithmType(int i) {
        this.mAlgorithmType = i;
    }

    public void setForInit(boolean z) {
        this.mForInit = z;
    }

    public VEBaseAlgorithmParam(int i, String str, boolean z) {
        this.mAlgorithmType = i;
        this.mAlgorithmName = str;
        this.mForInit = z;
    }
}
