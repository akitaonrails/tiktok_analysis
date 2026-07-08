package com.ss.lyrax.augur;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.augur.command.AbsAugurCommand;
import com.ss.lyrax.augur.command.AugurCommandWrapper;
import com.ss.lyrax.augur.command.AugurUpdateFpsResolutionCommand;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.ttlh_adapter.TTLHOptionCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurAdaptiveWrapper implements IAugur {
    public final IAugur augur;
    public final AugurCommandWrapper augurCommandWrapper;
    public boolean forceDowngradeFlag;

    public static class Instance {
        public static AugurAdaptiveWrapper instance;
    }

    @Override // com.ss.lyrax.augur.IAugur, com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.augur.getNativePtr();
    }

    public Map<String, String> getPerfAdaptiveMetricInfo() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<String, AbsAugurCommand>> it2 = this.augurCommandWrapper.getCommandDataMap().entrySet().iterator();
            String str = "";
            String str2 = "default";
            while (it2.hasNext()) {
                AbsAugurCommand value = it2.next().getValue();
                if (!TextUtils.isEmpty(value.adaptiveStrategyName)) {
                    arrayList.add(value.adaptiveStrategyName);
                }
                JSONObject jSONObject2 = value.adaptiveStrategyLevelJSON;
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, value.adaptiveStrategyLevelJSON.get(next));
                    }
                }
                if (!TextUtils.isEmpty(value.adaptiveStrategyStatus)) {
                    if (TextUtils.equals(str2, "default")) {
                        str2 = value.adaptiveStrategyStatus;
                    } else if (TextUtils.equals(str2, "up")) {
                        if (TextUtils.equals(value.adaptiveStrategyStatus, "down")) {
                            str2 = "mix";
                        }
                    } else if (TextUtils.equals(str2, "down") && TextUtils.equals(value.adaptiveStrategyStatus, "up")) {
                        str2 = "mix";
                    }
                }
                if (value instanceof AugurUpdateFpsResolutionCommand) {
                    str = value.resolutionStrategyExtraStatus;
                }
                if (!TextUtils.isEmpty(value.adaptiveStrategyStatusListItem)) {
                    arrayList2.add(value.adaptiveStrategyStatusListItem);
                }
            }
            map.put("adaptive_strategy_status", str2);
            if (arrayList.size() > 0) {
                CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                StringBuilder sb = new StringBuilder();
                if (charSequenceArr.length > 0) {
                    sb.append(charSequenceArr[0]);
                    for (int i = 1; i < charSequenceArr.length; i++) {
                        sb.append((CharSequence) "#");
                        sb.append(charSequenceArr[i]);
                    }
                }
                map.put("adaptive_strategy_name_list", sb.toString());
                map.put("adaptive_strategy_level_list", C786410Ut5.J3(jSONObject));
            }
            if (arrayList2.size() > 0) {
                CharSequence[] charSequenceArr2 = (CharSequence[]) arrayList2.toArray(new String[0]);
                StringBuilder sb2 = new StringBuilder();
                if (charSequenceArr2.length > 0) {
                    sb2.append(charSequenceArr2[0]);
                    for (int i2 = 1; i2 < charSequenceArr2.length; i2++) {
                        sb2.append((CharSequence) "#");
                        sb2.append(charSequenceArr2[i2]);
                    }
                }
                map.put("adaptive_strategy_status_list", sb2.toString());
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("resolution_strategy_extra_status", str);
                return map;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return map;
    }

    @Override // com.ss.lyrax.augur.IAugur
    public boolean isAugurInited() {
        return this.augur.isAugurInited();
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void runStrategyGraphOnce() {
        this.augur.runStrategyGraphOnce();
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void start() {
        this.augur.start();
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void stop() {
        this.augur.stop();
    }

    public void triggerLinkMicVideoParamsGenerate() {
        this.augur.updateFeature("event_type", "generate_linkmic_video_params");
        this.augur.runStrategyGraphOnce();
    }

    public void tryReplayForceDowngradeEvent() {
        if (this.forceDowngradeFlag) {
            this.augur.updateFeature("event_type", "force_downgrade");
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void destroy() {
        TTLHOptionCenter.release();
        this.augur.unregisterCommand("kTTLH");
        this.augur.destroy();
        Instance.instance = null;
    }

    public static AugurAdaptiveWrapper getInstance() {
        return Instance.instance;
    }

    public AugurAdaptiveWrapper(AugurOption augurOption) {
        AugurImpl augurImpl = new AugurImpl(augurOption);
        this.augur = augurImpl;
        AugurCommandWrapper augurCommandWrapper = new AugurCommandWrapper();
        this.augurCommandWrapper = augurCommandWrapper;
        TTLHOptionCenter.init(augurImpl.registerCommand(augurCommandWrapper, augurOption.scene));
    }

    public static synchronized void init(AugurOption augurOption) {
        if (Instance.instance == null) {
            Instance.instance = new AugurAdaptiveWrapper(augurOption);
        }
    }

    public static synchronized void trySetConfigRequester(long j) {
        AugurAdaptiveWrapper augurAdaptiveWrapper = Instance.instance;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.setConfigRequester(j);
        }
    }

    public void clearEffectStrategyReport(String str) {
        if (TextUtils.equals(str, "face_extra_model_name")) {
            clearStrategyReport("effect_face_strategy");
        } else {
            if (!TextUtils.equals(str, "matting_model_name")) {
                return;
            }
            clearStrategyReport("effect_matting_strategy");
        }
    }

    public void clearStrategyReport(String str) {
        AugurCommandWrapper augurCommandWrapper = this.augurCommandWrapper;
        if (augurCommandWrapper != null) {
            augurCommandWrapper.clearStrategyReport(str);
        }
    }

    public void forceDowngrade(boolean z) {
        this.forceDowngradeFlag = z;
        if (z) {
            this.augur.updateFeature("event_type", "force_downgrade");
        }
    }

    public void setAugurCommandHandler(AugurCommandWrapper.AugurCommandHandler augurCommandHandler) {
        AugurCommandWrapper augurCommandWrapper = this.augurCommandWrapper;
        if (augurCommandWrapper != null) {
            augurCommandWrapper.setAugurCommandHandler(augurCommandHandler);
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void setConfigRequester(long j) {
        this.augur.setConfigRequester(j);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public long unregisterCommand(String str) {
        return this.augur.unregisterCommand(str);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeatures(Map<String, Object> map) {
        this.augur.updateFeatures(map);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public long registerCommand(IAugurCommand iAugurCommand, LyraxScene lyraxScene) {
        return this.augur.registerCommand(iAugurCommand, lyraxScene);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateConfig(String str, AugurConfigExtraInfo augurConfigExtraInfo) {
        this.augur.updateConfig(str, augurConfigExtraInfo);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateConfigAsync(String str, AugurConfigExtraInfo augurConfigExtraInfo) {
        this.augur.updateConfigAsync(str, augurConfigExtraInfo);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, double d) {
        this.augur.updateFeature(str, d);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, float f) {
        this.augur.updateFeature(str, f);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, int i) {
        this.augur.updateFeature(str, i);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, long j) {
        this.augur.updateFeature(str, j);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, String str2) {
        this.augur.updateFeature(str, str2);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, JSONArray jSONArray) {
        this.augur.updateFeature(str, jSONArray);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, JSONObject jSONObject) {
        this.augur.updateFeature(str, jSONObject);
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, boolean z) {
        this.augur.updateFeature(str, z);
    }
}
