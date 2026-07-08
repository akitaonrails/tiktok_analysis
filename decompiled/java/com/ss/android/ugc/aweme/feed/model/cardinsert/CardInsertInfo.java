package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class CardInsertInfo implements Serializable {

    @C09CT("card_id")
    public long cardId;

    @C09CT("card_impl_type")
    public int cardImplType;

    @C09CT("card_material")
    public String cardInsertStatus;

    @C09CT("card_source")
    public int cardSource;

    @C09CT("card_type")
    public int cardType;
    public String diffType;
    public transient String fetchLogId;
    public int isRealTime;

    @C09CT("lynx_template")
    public LynxTemplate lynxTemplate;
    public String showTiming;

    public CardInsertInfo() {
        this(0, 0L, "", 0, 0, null, "");
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final int getCardImplType() {
        return this.cardImplType;
    }

    public final String getCardInsertStatus() {
        return this.cardInsertStatus;
    }

    public final int getCardSource() {
        return this.cardSource;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final String getDiffType() {
        return this.diffType;
    }

    public final String getFetchLogId() {
        return this.fetchLogId;
    }

    public final LynxTemplate getLynxTemplate() {
        return this.lynxTemplate;
    }

    public final String getShowTiming() {
        return this.showTiming;
    }

    public final int isRealTime() {
        return this.isRealTime;
    }

    public final void setCardId(long j) {
        this.cardId = j;
    }

    public final void setCardImplType(int i) {
        this.cardImplType = i;
    }

    public final void setCardInsertStatus(String str) {
        this.cardInsertStatus = str;
    }

    public final void setCardSource(int i) {
        this.cardSource = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setDiffType(String str) {
        this.diffType = str;
    }

    public final void setFetchLogId(String str) {
        this.fetchLogId = str;
    }

    public final void setLynxTemplate(LynxTemplate lynxTemplate) {
        this.lynxTemplate = lynxTemplate;
    }

    public final void setRealTime(int i) {
        this.isRealTime = i;
    }

    public final void setShowTiming(String str) {
        this.showTiming = str;
    }

    public CardInsertInfo(int i, long j, String str, int i2, int i3, LynxTemplate lynxTemplate, String str2) {
        this.cardType = i;
        this.cardId = j;
        this.cardInsertStatus = str;
        this.cardSource = i2;
        this.cardImplType = i3;
        this.lynxTemplate = lynxTemplate;
        this.diffType = str2;
    }
}
