package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class RateSettingsResponse<T extends PlayerTypeAbConfigV2> extends BaseResponse {

    @C09CT("adaptive_gear_group")
    public GearConfig adaptiveGearGroup;

    @C09CT("auto_biterate_curv")
    public AutoBitrateCurve autoBitrateCurve;

    @C09CT("auto_bitrate_params")
    public AutoBitrateSet autoBitrateSet;

    @C09CT("auto_bitrate_params_live")
    public AutoBitrateSet autoBitrateSetLive;

    @C09CT("auto_bitrate_params_music")
    public AutoBitrateSet autoBitrateSetMusic;

    @C09CT("bandwidth_map")
    public List<BandwidthSet> bandwidthSet;

    @C09CT("player_type_v2")
    public T decodeType;

    @C09CT("default_gear_group")
    public String defaultGearGroup;

    @C09CT("definition_gear_group")
    public GearConfig definitionGearGroup;

    @C09CT("flow_gear_group")
    public GearConfig flowGearGroup;

    @C09CT("gear_set")
    public List<GearSet> gearSet;

    public AutoBitrateSet getHighBitrateCurve() {
        AutoBitrateSet autoBitrateSet;
        AutoBitrateCurve autoBitrateCurve = this.autoBitrateCurve;
        return (autoBitrateCurve == null || (autoBitrateSet = autoBitrateCurve.highBitrateSet) == null) ? this.autoBitrateSet : autoBitrateSet;
    }

    public AutoBitrateSet getLowQltyCurv() {
        AutoBitrateCurve autoBitrateCurve = this.autoBitrateCurve;
        if (autoBitrateCurve == null) {
            return null;
        }
        return autoBitrateCurve.lowerQltyCurvParam;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup != null) {
            return (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null) ? false : true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RateSettingsResponse{flowGearGroup=");
        sbLIZ.append(this.flowGearGroup);
        sbLIZ.append(", adaptiveGearGroup=");
        sbLIZ.append(this.adaptiveGearGroup);
        sbLIZ.append(", defaultGearGroup='");
        sbLIZ.append(this.defaultGearGroup);
        sbLIZ.append('\'');
        sbLIZ.append(", definitionGearGroup=");
        sbLIZ.append(this.definitionGearGroup);
        sbLIZ.append(", gearSet=");
        sbLIZ.append(this.gearSet);
        sbLIZ.append(", bandwidthSet=");
        sbLIZ.append(this.bandwidthSet);
        sbLIZ.append(", autoBitrateSet=");
        sbLIZ.append(this.autoBitrateSet);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GearConfig getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public AutoBitrateSet getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public AutoBitrateSet getAutoBitrateSetLive() {
        return this.autoBitrateSetLive;
    }

    public AutoBitrateSet getAutoBitrateSetMusic() {
        return this.autoBitrateSetMusic;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public PlayerTypeAbConfigV2 getDecodeType() {
        return this.decodeType;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public GearConfig getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public GearConfig getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public void setAdaptiveGearGroup(GearConfig gearConfig) {
        this.adaptiveGearGroup = gearConfig;
    }

    public void setAutoBitrateSet(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSet = autoBitrateSet;
    }

    public void setAutoBitrateSetLive(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSetLive = autoBitrateSet;
    }

    public void setAutoBitrateSetMusic(AutoBitrateSet autoBitrateSet) {
        this.autoBitrateSetMusic = autoBitrateSet;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(GearConfig gearConfig) {
        this.definitionGearGroup = gearConfig;
    }

    public void setFlowGearGroup(GearConfig gearConfig) {
        this.flowGearGroup = gearConfig;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
