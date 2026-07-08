package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class EffectQRCode implements Serializable {
    public String qrCodeText;

    public EffectQRCode() {
        this("");
    }

    public final String getQrCodeText() {
        return this.qrCodeText;
    }

    public EffectQRCode(String str) {
        this.qrCodeText = str;
    }

    public final void setQrCodeText(String str) {
        this.qrCodeText = str;
    }
}
