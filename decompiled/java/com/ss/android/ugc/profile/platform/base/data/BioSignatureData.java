package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class BioSignatureData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("add_bio_guide_emoji")
    public Icon guideIcon;

    @C09CT("add_bio_guide_text")
    public String guideText;

    @C09CT("signature_extra")
    public List<SignatureExtraInfo> signatureExtra;

    public final Icon getGuideIcon() {
        return this.guideIcon;
    }

    public final String getGuideText() {
        return this.guideText;
    }

    public final List<SignatureExtraInfo> getSignatureExtra() {
        return this.signatureExtra;
    }

    public final void setGuideIcon(Icon icon) {
        this.guideIcon = icon;
    }

    public final void setGuideText(String str) {
        this.guideText = str;
    }

    public final void setSignatureExtra(List<SignatureExtraInfo> list) {
        this.signatureExtra = list;
    }
}
