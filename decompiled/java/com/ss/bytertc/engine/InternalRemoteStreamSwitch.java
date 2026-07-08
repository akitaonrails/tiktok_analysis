package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRemoteStreamSwitch {
    public boolean afterEnable;
    public int afterVideoIndex;
    public boolean beforeEnable;
    public int beforeVideoIndex;
    public boolean isScreen;
    public int reason;
    public String uid;

    public InternalRemoteStreamSwitch() {
    }

    public InternalRemoteStreamSwitch(String str, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        this.uid = str;
        this.isScreen = z;
        this.beforeVideoIndex = i;
        this.afterVideoIndex = i2;
        this.beforeEnable = z2;
        this.afterEnable = z3;
        this.reason = i3;
    }

    public static InternalRemoteStreamSwitch create(String str, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        return new InternalRemoteStreamSwitch(str, z, i, i2, z2, z3, i3);
    }
}
