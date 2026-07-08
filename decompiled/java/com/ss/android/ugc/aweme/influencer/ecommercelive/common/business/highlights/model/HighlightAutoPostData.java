package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightAutoPostData implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 8;
    public boolean LL;

    @C09CT("auto_post_max_count_per_live")
    public final Integer autoPostMaxCountPerLive;

    @C09CT("auto_post_switch")
    public final Integer autoPostSwitch;

    @C09CT("guidance_image")
    public final String guideIconUrl;

    @C09CT("privacy_policy_schema")
    public final String privacyPolicySchema;

    @C09CT("show_auto_post")
    public final Boolean showAutoPost;

    @C09CT("show_guidance")
    public final Boolean showGuidance;

    @C09CT("signed_tos")
    public final Boolean signedTos;

    @C09CT("tos_schema")
    public final String tosSchema;

    public final HighlightAutoPostData copy(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, String str2, Boolean bool3, String str3) {
        return new HighlightAutoPostData(bool, num, num2, bool2, str, str2, bool3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightAutoPostData)) {
            return false;
        }
        HighlightAutoPostData highlightAutoPostData = (HighlightAutoPostData) obj;
        return Intrinsics.LJFF(this.showAutoPost, highlightAutoPostData.showAutoPost) && Intrinsics.LJFF(this.autoPostMaxCountPerLive, highlightAutoPostData.autoPostMaxCountPerLive) && Intrinsics.LJFF(this.autoPostSwitch, highlightAutoPostData.autoPostSwitch) && Intrinsics.LJFF(this.signedTos, highlightAutoPostData.signedTos) && Intrinsics.LJFF(this.tosSchema, highlightAutoPostData.tosSchema) && Intrinsics.LJFF(this.privacyPolicySchema, highlightAutoPostData.privacyPolicySchema) && Intrinsics.LJFF(this.showGuidance, highlightAutoPostData.showGuidance) && Intrinsics.LJFF(this.guideIconUrl, highlightAutoPostData.guideIconUrl);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        Boolean bool = this.showAutoPost;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.autoPostMaxCountPerLive;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.autoPostSwitch;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.signedTos;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.tosSchema;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.privacyPolicySchema;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.showGuidance;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.guideIconUrl;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightAutoPostData(showAutoPost=");
        sbLIZ.append(this.showAutoPost);
        sbLIZ.append(", autoPostMaxCountPerLive=");
        sbLIZ.append(this.autoPostMaxCountPerLive);
        sbLIZ.append(", autoPostSwitch=");
        sbLIZ.append(this.autoPostSwitch);
        sbLIZ.append(", signedTos=");
        sbLIZ.append(this.signedTos);
        sbLIZ.append(", tosSchema=");
        sbLIZ.append(this.tosSchema);
        sbLIZ.append(", privacyPolicySchema=");
        sbLIZ.append(this.privacyPolicySchema);
        sbLIZ.append(", showGuidance=");
        sbLIZ.append(this.showGuidance);
        sbLIZ.append(", guideIconUrl=");
        sbLIZ.append(this.guideIconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getAutoPostMaxCountPerLive() {
        return this.autoPostMaxCountPerLive;
    }

    public final Integer getAutoPostSwitch() {
        return this.autoPostSwitch;
    }

    public final String getGuideIconUrl() {
        return this.guideIconUrl;
    }

    public final String getPrivacyPolicySchema() {
        return this.privacyPolicySchema;
    }

    public final Boolean getShowAutoPost() {
        return this.showAutoPost;
    }

    public final Boolean getShowGuidance() {
        return this.showGuidance;
    }

    public final Boolean getSignedTos() {
        return this.signedTos;
    }

    public final String getTosSchema() {
        return this.tosSchema;
    }

    public final boolean isGuideFirstShow() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final void setGuideFirstShow(boolean z) {
        this.LL = z;
    }

    public HighlightAutoPostData(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, String str2, Boolean bool3, String str3) {
        this.showAutoPost = bool;
        this.autoPostMaxCountPerLive = num;
        this.autoPostSwitch = num2;
        this.signedTos = bool2;
        this.tosSchema = str;
        this.privacyPolicySchema = str2;
        this.showGuidance = bool3;
        this.guideIconUrl = str3;
    }
}
