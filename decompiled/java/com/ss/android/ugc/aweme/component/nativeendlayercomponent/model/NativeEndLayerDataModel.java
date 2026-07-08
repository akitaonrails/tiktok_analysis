package com.ss.android.ugc.aweme.component.nativeendlayercomponent.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeEndLayerDataModel implements Serializable {
    public static final int $stable = 8;
    public String btnCloseText;
    public int btnCtaColor;
    public float btnCtaCornerRadiusPx;
    public String btnCtaText;
    public Integer btnCtaTextColor;

    @C09CT("countdown_button")
    public CountdownButton countdownButton;
    public String desc;

    @C09CT("is_one_to_n")
    public boolean isOneToN;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;
    public String realShowType;

    @C09CT("should_degrade_to_iab")
    public final boolean shouldDegradeToIAB;
    public boolean shouldLoadIAB;

    @C09CT("show_type")
    public final int showType;

    public final boolean isOneToN() {
        return this.isOneToN;
    }

    public final void setBtnCloseText(String str) {
        this.btnCloseText = str;
    }

    public final void setBtnCtaColor(int i) {
        this.btnCtaColor = i;
    }

    public final void setBtnCtaCornerRadiusPx(float f) {
        this.btnCtaCornerRadiusPx = f;
    }

    public final void setBtnCtaText(String str) {
        this.btnCtaText = str;
    }

    public final void setBtnCtaTextColor(Integer num) {
        this.btnCtaTextColor = num;
    }

    public final void setCountdownButton(CountdownButton countdownButton) {
        this.countdownButton = countdownButton;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setOneToN(boolean z) {
        this.isOneToN = z;
    }

    public final void setRealShowType(String str) {
        this.realShowType = str;
    }

    public final void setShouldLoadIAB(boolean z) {
        this.shouldLoadIAB = z;
    }

    public NativeEndLayerDataModel(int i, String str, Integer num, float f, String str2, String str3, int i2, boolean z, String str4, boolean z2, boolean z3, AnoleLogInfo anoleLogInfo, CountdownButton countdownButton) {
        this.btnCtaColor = i;
        this.btnCtaText = str;
        this.btnCtaTextColor = num;
        this.btnCtaCornerRadiusPx = f;
        this.btnCloseText = str2;
        this.desc = str3;
        this.showType = i2;
        this.shouldDegradeToIAB = z;
        this.realShowType = str4;
        this.shouldLoadIAB = z2;
        this.isOneToN = z3;
        this.logInfo = anoleLogInfo;
        this.countdownButton = countdownButton;
    }
}
