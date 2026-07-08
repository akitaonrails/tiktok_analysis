package com.ss.android.vesdk;

import X.C1DJD;
import X.C1DJE;
import X.C1DJF;
import X.C2188811AlT;
import X.EnumC21617819iy;
import X.InterfaceC1427270nFF;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class VEFocusSettings {
    public C1DJD mCameraFaceFocusPoint;
    public C1DJE mCameraFocusArea;
    public C1DJF mCameraMeteringArea;
    public float mDisplayDensity;
    public InterfaceC1427270nFF mFocusCallback;
    public int mHeight;
    public boolean mIsLock;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean mNeedFocus = true;
    public boolean mNeedMetering = true;
    public boolean mFromUser = true;
    public EnumC21617819iy mCoordinatesMode = EnumC21617819iy.VIEW;

    public C1DJD getCameraFaceFocusPoint() {
        return null;
    }

    public C1DJE getCameraFocusArea() {
        return null;
    }

    public C1DJF getCameraMeteringArea() {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(this.mX);
        sbLIZ.append(", ");
        sbLIZ.append(this.mY);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EnumC21617819iy getCoordinatesMode() {
        return this.mCoordinatesMode;
    }

    public float getDisplayDensity() {
        return this.mDisplayDensity;
    }

    public InterfaceC1427270nFF getFocusCallback() {
        return this.mFocusCallback;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public boolean isFromUser() {
        return this.mFromUser;
    }

    public boolean isLock() {
        return this.mIsLock;
    }

    public boolean isNeedFocus() {
        return this.mNeedFocus;
    }

    public boolean isNeedMetering() {
        return this.mNeedMetering;
    }

    public void setCoordinatesMode(EnumC21617819iy enumC21617819iy) {
        this.mCoordinatesMode = enumC21617819iy;
    }

    public void setDisplayDensity(float f) {
        this.mDisplayDensity = f;
    }

    public void setFromUser(boolean z) {
        this.mFromUser = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setLock(boolean z) {
        this.mIsLock = z;
    }

    public void setNeedFocus(boolean z) {
        this.mNeedFocus = z;
    }

    public void setNeedMetering(boolean z) {
        this.mNeedMetering = z;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public VEFocusSettings(int i, int i2, int i3, int i4, float f) {
        this.mWidth = i3;
        this.mHeight = i4;
        this.mX = i;
        this.mY = i2;
        this.mDisplayDensity = f;
    }

    public VEFocusSettings(int i, int i2, int i3, int i4, float f, InterfaceC1427270nFF interfaceC1427270nFF) {
        this.mWidth = i3;
        this.mHeight = i4;
        this.mX = i;
        this.mY = i2;
        this.mDisplayDensity = f;
        this.mFocusCallback = interfaceC1427270nFF;
    }
}
