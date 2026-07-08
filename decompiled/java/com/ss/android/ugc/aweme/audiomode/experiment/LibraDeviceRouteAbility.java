package com.ss.android.ugc.aweme.audiomode.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class LibraDeviceRouteAbility {

    @C09CT("bluetooth")
    public final int outputDeviceBluetoothHeadset;

    @C09CT("speaker")
    public final int outputDeviceBuiltinSpeaker;

    @C09CT("others")
    public final int outputDeviceOthers;

    @C09CT("usb_headset")
    public final int outputDeviceUsbHeadset;

    @C09CT("wired_headset")
    public final int outputDeviceWiredHeadset;

    public LibraDeviceRouteAbility() {
        this(2, 2, 2, 3, 2);
    }

    public final int LIZ(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return this.outputDeviceOthers;
                        }
                        return this.outputDeviceUsbHeadset;
                    }
                    return this.outputDeviceWiredHeadset;
                }
                return this.outputDeviceOthers;
            }
            return this.outputDeviceBluetoothHeadset;
        }
        return this.outputDeviceBuiltinSpeaker;
    }

    public LibraDeviceRouteAbility(int i, int i2, int i3, int i4, int i5) {
        this.outputDeviceBuiltinSpeaker = i;
        this.outputDeviceBluetoothHeadset = i2;
        this.outputDeviceWiredHeadset = i3;
        this.outputDeviceUsbHeadset = i4;
        this.outputDeviceOthers = i5;
    }
}
