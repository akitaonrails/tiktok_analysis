package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class MatchDonationText implements Serializable {

    @C09CT("double_donation_text")
    public final String matchDonateText;

    @C09CT("double_donation_highlight")
    public final String matchDonationHighlightText;

    @C09CT("double_donation_sticker")
    public final String matchDonationTextForSticker;

    public MatchDonationText(String str, String str2, String str3) {
        this.matchDonationTextForSticker = str;
        this.matchDonateText = str2;
        this.matchDonationHighlightText = str3;
    }
}
