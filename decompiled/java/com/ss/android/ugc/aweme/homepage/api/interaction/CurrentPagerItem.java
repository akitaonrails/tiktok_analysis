package com.ss.android.ugc.aweme.homepage.api.interaction;

import X.InterfaceC1590610rUh;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes25.dex */
public final class CurrentPagerItem extends MutableLiveData<Integer> {
    public InterfaceC1590610rUh bridge = new InterfaceC1590610rUh() { // from class: X.0rUg
        @Override // X.InterfaceC1590610rUh
        public final void LIZ(int i, boolean z) {
        }

        @Override // X.InterfaceC1590610rUh
        public final void LJ(int i) {
        }

        @Override // X.InterfaceC1590610rUh
        public final int getValue() {
            return 0;
        }
    };
    public boolean isRealBridgeSet;

    @Override // androidx.lifecycle.LiveData
    public Integer getValue() {
        return Integer.valueOf(this.bridge.getValue());
    }

    public final InterfaceC1590610rUh getBridge() {
        return this.bridge;
    }

    public final boolean isRealBridgeSet() {
        return this.isRealBridgeSet;
    }

    public final void setBridge(InterfaceC1590610rUh interfaceC1590610rUh) {
        this.isRealBridgeSet = true;
        this.bridge = interfaceC1590610rUh;
    }

    public final void setRealBridgeSet(boolean z) {
        this.isRealBridgeSet = z;
    }

    public void setValue(int i) {
        this.bridge.LJ(i);
        super.setValue(Integer.valueOf(i));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    public final void setValue(int i, boolean z) {
        setValue(i, z, true);
    }

    public final void setValue(int i, boolean z, boolean z2) {
        this.bridge.LIZ(i, z);
        if (z2) {
            super.setValue(Integer.valueOf(i));
        }
    }
}
