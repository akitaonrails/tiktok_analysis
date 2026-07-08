package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("algo_package_config")
    public Map<String, AlgoPkgConfig> algoPackageConfigMap;

    @C09CT("cep_package_coverage_report_list")
    public List<String> cepPkgCoverageReportList;

    @C09CT("delay_download_pkgs")
    public int delayDownloadPkgs;

    @C09CT("enable")
    public int enable;

    @C09CT("guide_trigger_business_names")
    public List<String> guideTriggerBusinessNames;

    @C09CT("im_msg_enable_list")
    public List<String> imMsgEnableList;

    public Config() {
        this(0, null, 0, null, null, null, 63, null);
    }

    public Config(int i, List<String> list, int i2, List<String> list2, Map<String, AlgoPkgConfig> map, List<String> list3) {
        this.enable = i;
        this.imMsgEnableList = list;
        this.delayDownloadPkgs = i2;
        this.guideTriggerBusinessNames = list2;
        this.algoPackageConfigMap = map;
        this.cepPkgCoverageReportList = list3;
    }

    public Config(int i, List list, int i2, List list2, Map map, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 30 : i2, (i3 & 8) != 0 ? C13BV.INSTANCE : list2, (i3 & 16) != 0 ? C2097608Jq.LJ() : map, (i3 & 32) != 0 ? C13BV.INSTANCE : list3);
    }
}
