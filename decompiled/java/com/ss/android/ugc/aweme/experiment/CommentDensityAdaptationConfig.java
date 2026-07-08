package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDensityAdaptationConfig implements Serializable {

    @C09CT("adapted_layouts")
    public final List<String> adaptedLayouts;

    @C09CT("bias_scale_ignore_threshold")
    public final float biasScaleIgnoreThreshold;

    @C09CT("bias_scale_max_bias")
    public final float biasScaleMaxBias;

    @C09CT("design_width_dp")
    public final int designWidthDp;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("skip_in_multi_window")
    public final boolean skipInMultiWindow;

    @C09CT("support_ui_scale_down")
    public final boolean supportUiScaleDown;

    @C09CT("support_ui_scale_up")
    public final boolean supportUiScaleUp;

    @C09CT("threshold_width_dp")
    public final int thresholdWidthDp;

    @C09CT("unwrap_base_to_activity")
    public final boolean unwrapBaseToActivity;

    @C09CT("use_bridge_owner_for_vm")
    public final boolean useBridgeOwnerForVm;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentDensityAdaptationConfig)) {
            return false;
        }
        CommentDensityAdaptationConfig commentDensityAdaptationConfig = (CommentDensityAdaptationConfig) obj;
        return this.enabled == commentDensityAdaptationConfig.enabled && this.designWidthDp == commentDensityAdaptationConfig.designWidthDp && this.thresholdWidthDp == commentDensityAdaptationConfig.thresholdWidthDp && this.supportUiScaleUp == commentDensityAdaptationConfig.supportUiScaleUp && this.supportUiScaleDown == commentDensityAdaptationConfig.supportUiScaleDown && Float.compare(this.biasScaleIgnoreThreshold, commentDensityAdaptationConfig.biasScaleIgnoreThreshold) == 0 && Float.compare(this.biasScaleMaxBias, commentDensityAdaptationConfig.biasScaleMaxBias) == 0 && this.skipInMultiWindow == commentDensityAdaptationConfig.skipInMultiWindow && this.unwrapBaseToActivity == commentDensityAdaptationConfig.unwrapBaseToActivity && this.useBridgeOwnerForVm == commentDensityAdaptationConfig.useBridgeOwnerForVm && Intrinsics.LJFF(this.adaptedLayouts, commentDensityAdaptationConfig.adaptedLayouts);
    }

    public String toString() {
        return "CommentDensityAdaptationConfig(enabled=" + this.enabled + ", designWidthDp=" + this.designWidthDp + ", thresholdWidthDp=" + this.thresholdWidthDp + ", supportUiScaleUp=" + this.supportUiScaleUp + ", supportUiScaleDown=" + this.supportUiScaleDown + ", biasScaleIgnoreThreshold=" + this.biasScaleIgnoreThreshold + ", biasScaleMaxBias=" + this.biasScaleMaxBias + ", skipInMultiWindow=" + this.skipInMultiWindow + ", unwrapBaseToActivity=" + this.unwrapBaseToActivity + ", useBridgeOwnerForVm=" + this.useBridgeOwnerForVm + ", adaptedLayouts=" + this.adaptedLayouts + ')';
    }

    public CommentDensityAdaptationConfig() {
        this(false, 390, 390, false, true, 0.08f, 0.5f, true, true, true, C1697810uHb.LJIIJJI("aweme_comment_fragment_comment_page_list_v2", "aweme_comment_fragment_comment_list_v2", "aweme_comment_comment_page_header_anchor", "aweme_comment_comment_page_action_bar", "aweme_comment_item_comment_new_style_for_reply", "aweme_comment_item_comment_reply", "aweme_comment_item_comment_reply_button", "aweme_comment_item_status_footer", "aweme_comment_keyboard_fake_placeholder", "comment_header_search_layout", "comment_management_title"));
    }

    public int hashCode() {
        return (((((((((((((((((((C786410Ut5.Z2(this.enabled) * 31) + this.designWidthDp) * 31) + this.thresholdWidthDp) * 31) + C786410Ut5.Z2(this.supportUiScaleUp)) * 31) + C786410Ut5.Z2(this.supportUiScaleDown)) * 31) + Float.floatToIntBits(this.biasScaleIgnoreThreshold)) * 31) + Float.floatToIntBits(this.biasScaleMaxBias)) * 31) + C786410Ut5.Z2(this.skipInMultiWindow)) * 31) + C786410Ut5.Z2(this.unwrapBaseToActivity)) * 31) + C786410Ut5.Z2(this.useBridgeOwnerForVm)) * 31) + this.adaptedLayouts.hashCode();
    }

    public CommentDensityAdaptationConfig(boolean z, int i, int i2, boolean z2, boolean z3, float f, float f2, boolean z4, boolean z5, boolean z6, List<String> list) {
        this.enabled = z;
        this.designWidthDp = i;
        this.thresholdWidthDp = i2;
        this.supportUiScaleUp = z2;
        this.supportUiScaleDown = z3;
        this.biasScaleIgnoreThreshold = f;
        this.biasScaleMaxBias = f2;
        this.skipInMultiWindow = z4;
        this.unwrapBaseToActivity = z5;
        this.useBridgeOwnerForVm = z6;
        this.adaptedLayouts = list;
    }
}
