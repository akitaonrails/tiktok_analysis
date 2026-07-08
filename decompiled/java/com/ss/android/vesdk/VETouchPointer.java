package com.ss.android.vesdk;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes34.dex */
public class VETouchPointer {
    public TouchEvent event;
    public float force;
    public float majorRadius;
    public int pointerId;
    public float x;
    public float y;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pointerId: ");
        sbLIZ.append(this.pointerId);
        sbLIZ.append(", TouchEvent: ");
        sbLIZ.append(this.event);
        sbLIZ.append(", x: ");
        sbLIZ.append(this.x);
        sbLIZ.append(", y: ");
        sbLIZ.append(this.y);
        sbLIZ.append(", force: ");
        sbLIZ.append(this.force);
        sbLIZ.append(", majorRadius: ");
        sbLIZ.append(this.majorRadius);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VETouchPointer() {
    }

    public TouchEvent getEvent() {
        return this.event;
    }

    public float getForce() {
        return this.force;
    }

    public float getMajorRadius() {
        return this.majorRadius;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public enum TouchEvent {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED;

        public static TouchEvent valueOf(String str) {
            return (TouchEvent) C08FF.LIZ(TouchEvent.class, str);
        }
    }

    public void setEvent(TouchEvent touchEvent) {
        this.event = touchEvent;
    }

    public void setForce(float f) {
        this.force = f;
    }

    public void setMajorRadius(float f) {
        this.majorRadius = f;
    }

    public void setPointerId(int i) {
        this.pointerId = i;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }

    public VETouchPointer(int i, TouchEvent touchEvent, float f, float f2, float f3, float f4) {
        this.pointerId = i;
        this.event = touchEvent;
        this.x = f;
        this.y = f2;
        this.force = f3;
        this.majorRadius = f4;
    }
}
