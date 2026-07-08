package com.ss.android.ugc.aweme.sticker.model;

/* JADX INFO: loaded from: classes4.dex */
public final class PropInfoData {
    public static final int $stable = 8;
    public Boolean iconShowMob;
    public Long panelInfoInvokeTime;
    public Long panelInfoInvokeTime1;
    public Long receivePanelInfoTime;
    public Long receivePanelInfoTime1;
    public Long receivePanelInfoTime2;
    public Long setStickerTime;

    public PropInfoData() {
        this(Boolean.FALSE, null, null, null, null, null, null);
    }

    public final Boolean getIconShowMob() {
        return this.iconShowMob;
    }

    public final Long getPanelInfoInvokeTime() {
        return this.panelInfoInvokeTime;
    }

    public final Long getPanelInfoInvokeTime1() {
        return this.panelInfoInvokeTime1;
    }

    public final Long getReceivePanelInfoTime() {
        return this.receivePanelInfoTime;
    }

    public final Long getReceivePanelInfoTime1() {
        return this.receivePanelInfoTime1;
    }

    public final Long getReceivePanelInfoTime2() {
        return this.receivePanelInfoTime2;
    }

    public final Long getSetStickerTime() {
        return this.setStickerTime;
    }

    public final void setIconShowMob(Boolean bool) {
        this.iconShowMob = bool;
    }

    public final void setPanelInfoInvokeTime(Long l) {
        this.panelInfoInvokeTime = l;
    }

    public final void setPanelInfoInvokeTime1(Long l) {
        this.panelInfoInvokeTime1 = l;
    }

    public final void setReceivePanelInfoTime(Long l) {
        this.receivePanelInfoTime = l;
    }

    public final void setReceivePanelInfoTime1(Long l) {
        this.receivePanelInfoTime1 = l;
    }

    public final void setReceivePanelInfoTime2(Long l) {
        this.receivePanelInfoTime2 = l;
    }

    public final void setSetStickerTime(Long l) {
        this.setStickerTime = l;
    }

    public PropInfoData(Boolean bool, Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        this.iconShowMob = bool;
        this.panelInfoInvokeTime = l;
        this.panelInfoInvokeTime1 = l2;
        this.receivePanelInfoTime1 = l3;
        this.receivePanelInfoTime2 = l4;
        this.receivePanelInfoTime = l5;
        this.setStickerTime = l6;
    }
}
