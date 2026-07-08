package com.ss.android.ugc.aweme.component.ctacomponent;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleTopviewCTAData implements Serializable {
    public static final int $stable = 0;

    @C09CT("background_color")
    public final String backgroundColorStr;

    @C09CT("text")
    public final String buttonText;

    @C09CT("corner_radius")
    public final Integer cornerRadius;

    @C09CT("inner_content_height")
    public final Integer height;

    @C09CT("text_color")
    public final String textColorStr;

    @C09CT("text_font_size")
    public final Integer textFontSize;

    public final int getBackgroundColor() {
        Object c098200Yq;
        try {
            String str = this.backgroundColorStr;
            c098200Yq = str != null ? Integer.valueOf(Color.parseColor(str)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (num != null) {
            return num.intValue();
        }
        return -2142417587;
    }

    public final int getTextColor() {
        Object c098200Yq;
        try {
            String str = this.textColorStr;
            c098200Yq = str != null ? Integer.valueOf(Color.parseColor(str)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (num != null) {
            return num.intValue();
        }
        return -592138;
    }

    public final int getButtonHeight() {
        Integer num = this.height;
        if (num != null) {
            return num.intValue();
        }
        return 48;
    }

    public final int getButtonRadius() {
        Integer num = this.cornerRadius;
        if (num != null) {
            return num.intValue();
        }
        return 999;
    }

    public AnoleTopviewCTAData(String str, String str2, Integer num, Integer num2, Integer num3, String str3) {
        this.buttonText = str;
        this.backgroundColorStr = str2;
        this.height = num;
        this.cornerRadius = num2;
        this.textFontSize = num3;
        this.textColorStr = str3;
    }
}
