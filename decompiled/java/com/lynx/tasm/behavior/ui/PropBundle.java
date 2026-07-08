package com.lynx.tasm.behavior.ui;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class PropBundle {
    public JavaOnlyMap LIZ = new JavaOnlyMap();
    public JavaOnlyArray LIZIZ = null;
    public JavaOnlyArray LIZJ = null;

    public static PropBundle createPropBundle() {
        return new PropBundle();
    }

    public void resetEventHandler() {
        JavaOnlyArray javaOnlyArray = this.LIZIZ;
        if (javaOnlyArray == null) {
            return;
        }
        javaOnlyArray.clear();
    }

    public PropBundle shallowCopy() {
        PropBundle propBundle = new PropBundle();
        propBundle.LIZ = JavaOnlyMap.shallowCopy(getProps());
        if (getEventHandlers() != null) {
            propBundle.LIZIZ = JavaOnlyArray.shallowCopy(getEventHandlers());
        }
        if (getGestures() != null) {
            propBundle.LIZJ = JavaOnlyArray.shallowCopy(getGestures());
        }
        return propBundle;
    }

    public ReadableArray getEventHandlers() {
        return this.LIZIZ;
    }

    public ReadableArray getGestures() {
        return this.LIZJ;
    }

    public ReadableMap getProps() {
        return this.LIZ;
    }

    public boolean contains(String str) {
        return this.LIZ.containsKey(str);
    }

    public void putEventHandler(JavaOnlyMap javaOnlyMap) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JavaOnlyArray();
        }
        this.LIZIZ.pushMap(javaOnlyMap);
    }

    public void putGesture(JavaOnlyMap javaOnlyMap) {
        if (this.LIZJ == null) {
            this.LIZJ = new JavaOnlyArray();
        }
        this.LIZJ.pushMap(javaOnlyMap);
    }

    public void putNull(String str) {
        this.LIZ.putNull(str);
    }

    public void putArray(String str, JavaOnlyArray javaOnlyArray) {
        this.LIZ.putArray(str, javaOnlyArray);
    }

    public void putBool(String str, boolean z) {
        this.LIZ.putBoolean(str, z);
    }

    public void putDouble(String str, double d) {
        this.LIZ.putDouble(str, d);
    }

    public void putInt(String str, int i) {
        this.LIZ.putInt(str, i);
    }

    public void putLong(String str, long j) {
        this.LIZ.putLong(str, j);
    }

    public void putMap(String str, JavaOnlyMap javaOnlyMap) {
        this.LIZ.putMap(str, javaOnlyMap);
    }

    public void putString(String str, String str2) {
        this.LIZ.putString(str, str2);
    }
}
