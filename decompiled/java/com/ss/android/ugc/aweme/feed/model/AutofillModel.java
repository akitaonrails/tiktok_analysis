package com.ss.android.ugc.aweme.feed.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AutofillModel implements Serializable {

    @C09CT("autofill_window")
    public final AutofillWindowModel autofillWindow;

    @C09CT("disclaimer")
    public final AutofillDisclaimerModel disclaimer;

    @C09CT("enable")
    public boolean enable;

    @C09CT("promo_code_info")
    @C09CS(JsonToStringAdapter.class)
    public final String promoCodeInfo;

    @C09CT("save_window")
    public final AutofillWindowModel saveWindow;

    @C09CT("update_window")
    public final AutofillWindowModel updateWindow;

    public final AutofillWindowModel getAutofillWindow() {
        return this.autofillWindow;
    }

    public final AutofillDisclaimerModel getDisclaimer() {
        return this.disclaimer;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getPromoCodeInfo() {
        return this.promoCodeInfo;
    }

    public final AutofillWindowModel getSaveWindow() {
        return this.saveWindow;
    }

    public final AutofillWindowModel getUpdateWindow() {
        return this.updateWindow;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }
}
