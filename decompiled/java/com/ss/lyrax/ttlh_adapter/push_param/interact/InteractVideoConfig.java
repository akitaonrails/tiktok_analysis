package com.ss.lyrax.ttlh_adapter.push_param.interact;

/* JADX INFO: loaded from: classes21.dex */
public class InteractVideoConfig {
    public boolean guestCamera15Fps;
    public boolean interactUseBufferPoolInSingleView;
    public int simChannelNumber;
    public boolean simulcastEventDriven;
    public boolean upgrade1080x1920Default;

    public InteractVideoConfig() {
        this.interactUseBufferPoolInSingleView = true;
        this.upgrade1080x1920Default = true;
        this.simChannelNumber = 1;
    }

    public boolean getGuestCamera15Fps() {
        return this.guestCamera15Fps;
    }

    public boolean getInteractUseBufferPoolInSingleView() {
        return this.interactUseBufferPoolInSingleView;
    }

    public int getSimChannelNumber() {
        return this.simChannelNumber;
    }

    public boolean getSimulcastEventDriven() {
        return this.simulcastEventDriven;
    }

    public boolean getUpgrade1080x1920Default() {
        return this.upgrade1080x1920Default;
    }

    public InteractVideoConfig(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.interactUseBufferPoolInSingleView = z;
        this.upgrade1080x1920Default = z2;
        this.simulcastEventDriven = z3;
        this.simChannelNumber = i;
        this.guestCamera15Fps = z4;
    }
}
