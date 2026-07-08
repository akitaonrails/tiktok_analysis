package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicResolutionDemandRuleConfig {
    public static final TypeAdapter ADAPTER = new LinkMicResolutionDemandRuleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("demand_trigger_ratio_threshold")
    public double demandTriggerRatioThreshold;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_receive_im")
    public boolean enableReceiveIm;

    @C09CT("enable_send_im")
    public boolean enableSendIm;

    @C09CT("layout_black_list")
    public List<String> layoutBlackList;

    @C09CT("layout_white_list")
    public List<String> layoutWhiteList;

    public LinkMicResolutionDemandRuleConfig() {
        this(false, null, null, false, false, 0.0d, 63, null);
    }

    public final double getDemandTriggerRatioThreshold() {
        return this.demandTriggerRatioThreshold;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableReceiveIm() {
        return this.enableReceiveIm;
    }

    public final boolean getEnableSendIm() {
        return this.enableSendIm;
    }

    public final List<String> getLayoutBlackList() {
        return this.layoutBlackList;
    }

    public final List<String> getLayoutWhiteList() {
        return this.layoutWhiteList;
    }

    public final void setDemandTriggerRatioThreshold(double d) {
        this.demandTriggerRatioThreshold = d;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEnableReceiveIm(boolean z) {
        this.enableReceiveIm = z;
    }

    public final void setEnableSendIm(boolean z) {
        this.enableSendIm = z;
    }

    public final void setLayoutBlackList(List<String> list) {
        this.layoutBlackList = list;
    }

    public final void setLayoutWhiteList(List<String> list) {
        this.layoutWhiteList = list;
    }

    public LinkMicResolutionDemandRuleConfig(boolean z, List<String> list, List<String> list2, boolean z2, boolean z3, double d) {
        this.enable = z;
        this.layoutWhiteList = list;
        this.layoutBlackList = list2;
        this.enableSendIm = z2;
        this.enableReceiveIm = z3;
        this.demandTriggerRatioThreshold = d;
    }

    public LinkMicResolutionDemandRuleConfig(boolean z, List list, List list2, boolean z2, boolean z3, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C1697810uHb.LJIIJJI("cohost_normal*", "cohost_enlarge*", "cohost_with_guest_6") : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? true : z2, (i & 16) == 0 ? z3 : true, (i & 32) != 0 ? 1.8d : d);
    }
}
