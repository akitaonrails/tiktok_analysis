package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C1476780oX6;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class SimAudioBitrate implements InterfaceC1477220oXo, Serializable {
    public String audioExtra;
    public C1476780oX6 audioMeta;
    public int quality;
    public List<String> urlList;

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ String getAudioFileId() {
        return null;
    }

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ long getFps() {
        return -1L;
    }

    @Override // X.InterfaceC1477220oXo
    public int getHdrBit() {
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public int getHdrType() {
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ int getVideoHeight() {
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ int getVideoWidth() {
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public int isBytevc1() {
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public int getBitRate() {
        C1476780oX6 c1476780oX6 = this.audioMeta;
        if (c1476780oX6 != null) {
            return (int) c1476780oX6.getBitrate();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public String getChecksum() {
        C1476780oX6 c1476780oX6 = this.audioMeta;
        return c1476780oX6 != null ? c1476780oX6.getFileHash() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public String getGearName() {
        C1476780oX6 c1476780oX6 = this.audioMeta;
        return c1476780oX6 != null ? c1476780oX6.getQualityDesc() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public int getSize() {
        C1476780oX6 c1476780oX6 = this.audioMeta;
        if (c1476780oX6 != null) {
            return (int) c1476780oX6.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public String getUrlKey() {
        C1476780oX6 c1476780oX6 = this.audioMeta;
        return c1476780oX6 != null ? !TextUtils.isEmpty(c1476780oX6.getLanguageCode()) ? this.audioMeta.getFileHash() : this.audioMeta.getQuality() : "";
    }

    @Override // X.InterfaceC1477220oXo
    public List<String> urlList() {
        if (this.urlList == null) {
            ArrayList arrayList = new ArrayList();
            C1476780oX6 c1476780oX6 = this.audioMeta;
            if (c1476780oX6 != null && c1476780oX6.getUrlList() != null) {
                if (!TextUtils.isEmpty(this.audioMeta.getUrlList().getMainUrl())) {
                    arrayList.add(this.audioMeta.getUrlList().getMainUrl());
                }
                if (!TextUtils.isEmpty(this.audioMeta.getUrlList().getBackupUrl())) {
                    arrayList.add(this.audioMeta.getUrlList().getBackupUrl());
                }
                if (!TextUtils.isEmpty(this.audioMeta.getUrlList().getFallbackUrl())) {
                    arrayList.add(this.audioMeta.getUrlList().getFallbackUrl());
                }
            }
            this.urlList = arrayList;
        }
        return this.urlList;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimAudioBitrate{audioMeta=");
        sbLIZ.append(this.audioMeta);
        sbLIZ.append(", audioExtra='");
        sbLIZ.append(this.audioExtra);
        sbLIZ.append('\'');
        sbLIZ.append(", urlList=");
        sbLIZ.append(urlList());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAudioExtra() {
        return this.audioExtra;
    }

    public C1476780oX6 getAudioMeta() {
        return this.audioMeta;
    }

    @Override // X.InterfaceC1477220oXo
    public int getQualityType() {
        return this.quality;
    }

    public void setAudioExtra(String str) {
        this.audioExtra = str;
    }

    public void setAudioMeta(C1476780oX6 c1476780oX6) {
        this.audioMeta = c1476780oX6;
    }

    public void setQualityType(int i) {
        this.quality = i;
    }
}
