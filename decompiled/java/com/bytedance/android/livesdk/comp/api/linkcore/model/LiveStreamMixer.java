package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C1275030jHh;
import X.C1276580jKC;
import X.C1276600jKE;
import X.C1276630jKH;
import X.C1276650jKJ;
import X.C1AZU;
import X.InterfaceC1276590jKD;
import X.InterfaceC969870bLV;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public abstract class LiveStreamMixer implements InterfaceC1276590jKD {
    public volatile boolean enableRoundCorner;
    public volatile InterfaceC969870bLV infoProvider;
    public final Map<C1AZU, InterfaceC969870bLV> infoProviderList = new HashMap();
    public volatile C1275030jHh interactConfig;

    @Override // X.InterfaceC1276590jKD
    public abstract /* synthetic */ String mixStream(int i, int i2, List<C1276580jKC> list);

    @Override // X.InterfaceC1276590jKD
    public abstract /* synthetic */ boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE);

    public abstract /* synthetic */ boolean updateMixSpatialAudio(C1276650jKJ c1276650jKJ, C1276630jKH c1276630jKH);

    public boolean getEnableRoundCorner() {
        return this.enableRoundCorner;
    }

    public final InterfaceC969870bLV getInfoProvider() {
        return this.infoProvider;
    }

    public final Map<C1AZU, InterfaceC969870bLV> getInfoProviderList() {
        return this.infoProviderList;
    }

    public final C1275030jHh getInteractConfig() {
        return this.interactConfig;
    }

    public InterfaceC969870bLV getPlayerInfoProvider() {
        return this.infoProvider;
    }

    public final InterfaceC969870bLV getPlayerInfoProviderWithArchType(C1AZU c1azu) {
        return this.infoProviderList.get(c1azu);
    }

    public void setConfig(C1275030jHh c1275030jHh) {
        this.interactConfig = c1275030jHh;
    }

    public void setEnableRoundCorner(boolean z) {
        this.enableRoundCorner = z;
    }

    public final void setInfoProvider(InterfaceC969870bLV interfaceC969870bLV) {
        this.infoProvider = interfaceC969870bLV;
    }

    public final void setInteractConfig(C1275030jHh c1275030jHh) {
        this.interactConfig = c1275030jHh;
    }

    public void setPlayerInfoProvider(InterfaceC969870bLV interfaceC969870bLV) {
        this.infoProvider = interfaceC969870bLV;
    }

    public void setPlayerInfoProviderWithArchType(C1AZU c1azu, InterfaceC969870bLV interfaceC969870bLV) {
        this.infoProviderList.put(c1azu, interfaceC969870bLV);
    }
}
