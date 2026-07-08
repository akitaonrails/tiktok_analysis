package com.ss.android.vesdk;

import X.C08FF;
import X.C09GA;
import X.C212350188e;
import X.C2188811AlT;
import X.C2208811Bcd;
import X.C786410Ut5;
import X.EnumC1284080jWI;
import X.EnumC1284870jXZ;
import X.EnumC994320byw;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.n;
import com.ss.android.vesdk.runtime.TEConfigCenter;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes35.dex */
public class VEConfigCenter {
    public static n mAbJson;
    public static Set<String> mAbset;
    public static volatile VEConfigCenter sInstance;
    public boolean enableByteBench;
    public boolean mIsInitByteBench;
    public static final Object sByteBenchLock = new Object();
    public static boolean enablePreloadSo = false;
    public static boolean mEnableReadFromABManager = false;
    public static boolean mEnableReadFromVEJava = false;
    public static boolean mIsLocalTest = false;
    public static Set<String> sExcludedEffectLicenses = null;
    public static volatile boolean mIsConfigCenterInitialized = false;
    public final HashMap<String, ValuePkt> sConfigs = new HashMap<>();
    public final HashMap<String, ValuePkt> sCahceConfigs = new HashMap<>();
    public final Map<String, ValuePkt> sModifiedConfigs = new HashMap();

    /* JADX INFO: loaded from: classes21.dex */
    public static class ValuePkt {
        public EnumC1284080jWI abType;
        public EnumC1284870jXZ configType;
        public DataType dataType;
        public String description;
        public AtomicBoolean locked = new AtomicBoolean(false);
        public Object value;

        public <T> T getValueAndLock() {
            if (!this.locked.get()) {
                this.locked.set(true);
            }
            return (T) this.value;
        }

        public String toString() {
            Object obj = this.value;
            return obj != null ? obj.toString() : "";
        }

        public EnumC1284080jWI getABType() {
            return this.abType;
        }

        public EnumC1284870jXZ getConfigType() {
            return this.configType;
        }

        public DataType getDataType() {
            return this.dataType;
        }

        public <T> T getValue() {
            return (T) this.value;
        }

        public void setAbType(EnumC1284080jWI enumC1284080jWI) {
            this.abType = enumC1284080jWI;
        }

        public ValuePkt updateValue(Object obj) {
            if (this.locked.get()) {
                return this;
            }
            this.value = obj;
            return this;
        }

        public ValuePkt(DataType dataType, Object obj, EnumC1284870jXZ enumC1284870jXZ, String str) {
            this.value = obj;
            this.dataType = dataType;
            this.configType = enumC1284870jXZ;
            this.description = str;
        }
    }

    public void initByteBench() {
    }

    public void setABSetType(EnumC994320byw enumC994320byw) {
    }

    public int setEffectGetABListener() {
        VEEffectConfig.nativeSetEffectGetABValueCallback();
        return 0;
    }

    private void addConfigsFromCamera() {
        ValuePkt valuePkt;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray("[{\"key\" : \"ve_camera_type\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"camera type\"},{\"key\": \"ve_is_in_camera2_blocklist\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"is in camera2 blocklist\"},{\"key\": \"ve_camera_wide_angle\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"wide angle\"},{\"key\": \"ve_camera_stablization\",\"dataType\": 1,\"defaultVal\": -1,\"description\": \"stablization\"},{\"key\": \"ve_camera_fps_range\",\"dataType\": 1,\"defaultVal\": 7,\"description\": \"camera lowest fps\"},{\"key\": \"ve_camera_enable_previewing_fallback\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"camera enable previewing fallback\"},{\"key\":\"ve_enable_wide_fov_for_samsung\",\"dataType\":0,\"defaultVal\": false,\"description\": \"enable wide fov\"},{\"key\": \"frame_rate_strategy\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"frame rate strategy\"},{\"key\": \"ve_camera_fps_max\",\"dataType\": 1,\"defaultVal\": 30,\"description\": \"camera fps max limit\"},{\"key\": \"ve_enable_gc_for_camera_metadata\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"enable manual gc for camera metadata\"},{\"key\": \"ve_camera_scene_diff_fps_opt\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera scene diff fps opt\"},{\"key\": \"ve_enable_refactor_camera_focus\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable refactor camera focus\"},{\"key\": \"ve_enable_camera2_zsl_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 zsl capture\"},{\"key\": \"ve_enable_yuv_buffer_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera yuv buffer capture\"},{\"key\": \"ve_enable_camera_devices_cache\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera devices cache to optimize SelectCamera\"},{\"key\": \"ve_camera_ai_augmentation\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"ai augmentation\"},{\"key\": \"ve_enable_camera_api2_detect\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera api2 detection\"},{\"key\": \"ve_disable_camera_hdr\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable camera hdr\"},{\"key\": \"ve_enable_camera_noise_reduce\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable noise reduce for vendor camera\"},{\"key\": \"ve_support_camera_multicam_zoom\",\"dataType\": 0,\"defaultVal\": true,\"description\": \"enable camera2 multicam zoom\"},{\"key\": \"ve_camera_zoom_ratio_max\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio max value\"},{\"key\": \"ve_camera_zoom_ratio_min\",\"dataType\": 2,\"defaultVal\": -1,\"description\": \"camera2 multicam zoom ratio min value\"},{\"key\": \"ve_enable_camera_preview_template\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"camera session template of video mode\"},{\"key\": \"ve_enable_camera2_deferred_surface\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable deferred surface to createCaptureSession\"},{\"key\": \"ve_enable_camera2_abort_session_capture\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable camera2 abort session capture\"},{\"key\": \"ve_enable_camera2_monitor_gyroscope\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable monitor gyroscope for camera2 focus\"},{\"key\": \"ve_enable_force_close_camera_opt\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"trigger close camera double check\"},{\"key\": \"ve_enable_collect_camera_capbilities\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable collect camera capbilities\"},{\"key\": \"ve_enable_camera_switch_camera1_optimize\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"ve enable camera switch camera1 optimize\"},{\"key\": \"ve_camera_capture_hdr\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"enable hdr when use capture mode\"},{\"key\": \"ve_support_dual_camera\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"Whether dual-camera is supported\"},{\"key\": \"ve_dual_camera_expansion_scheme\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Whether to use dual-camera expansion scheme\"},{\"key\": \"key_camera_capture_mfnr\",\"dataType\": 1,\"defaultVal\": 0,\"description\": \"vendor mfnr algorithm type\"},{\"key\": \"ve_camera_disable_rdhw_record\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable huawei record\"},{\"key\": \"ve_disable_handler_message\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"disable tecameraserver handler message\"}]");
            for (int i = 0; i < jSONArray2.length(); i++) {
                jSONArray.put(jSONArray2.get(i));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            JSONArray jSONArray3 = new JSONArray(jSONArray.toString());
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray3, i2);
                int i3 = JSONObjectProtectorUtils.getInt(jSONObject, "dataType");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "description");
                if (i3 == 0) {
                    valuePkt = new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, string);
                } else if (i3 == 1) {
                    valuePkt = new ValuePkt(DataType.INTEGER, Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, string);
                } else if (i3 == 2) {
                    valuePkt = new ValuePkt(DataType.FLOAT, Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, string);
                } else if (i3 == 3) {
                    valuePkt = new ValuePkt(DataType.STRING, JSONObjectProtectorUtils.getString(jSONObject, "defaultVal"), EnumC1284870jXZ.CONFIG_TYPE_AB, string);
                }
                valuePkt.setAbType(EnumC1284080jWI.FORCAMERA);
                addConfig(JSONObjectProtectorUtils.getString(jSONObject, "key"), valuePkt);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private void addConfigsFromEffect() {
        String[] strArr;
        String str;
        ValuePkt valuePkt;
        int i = 0;
        if (!mEnableReadFromVEJava) {
            String[] strArr2 = {"ve_record", "ve_enigma", "ve_edit", "ve_edit_swing", "ve_mv", "ve_detector", "ve_image"};
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                String str2 = strArr2[i2];
                Set<String> set = sExcludedEffectLicenses;
                if (set == null || !set.contains(str2)) {
                    arrayList.add(str2);
                }
                i2++;
            } while (i2 < 7);
            if (arrayList.isEmpty()) {
                strArr = new String[0];
            } else {
                strArr = (String[]) arrayList.toArray(new String[0]);
                if (strArr == null) {
                    return;
                }
            }
            if (strArr.length != 0) {
                try {
                    str = (String) Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("requestABInfoWithLicenseArray", String[].class, Boolean.TYPE).invoke(null, strArr, Boolean.TRUE);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    str = "";
                }
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    while (i < jSONArray.length()) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        int i3 = JSONObjectProtectorUtils.getInt(jSONObject, "dataType");
                        String strOptString = jSONObject.optString("description", "");
                        if (i3 == 0) {
                            valuePkt = new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, strOptString);
                        } else if (i3 == 1) {
                            valuePkt = new ValuePkt(DataType.INTEGER, Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, strOptString);
                        } else if (i3 == 2) {
                            valuePkt = new ValuePkt(DataType.FLOAT, Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, "defaultVal")), EnumC1284870jXZ.CONFIG_TYPE_AB, strOptString);
                        } else if (i3 == 3) {
                            valuePkt = new ValuePkt(DataType.STRING, JSONObjectProtectorUtils.getString(jSONObject, "defaultVal"), EnumC1284870jXZ.CONFIG_TYPE_AB, strOptString);
                        } else {
                            i++;
                        }
                        valuePkt.setAbType(EnumC1284080jWI.FOREFFECT);
                        addConfig(JSONObjectProtectorUtils.getString(jSONObject, "key"), valuePkt);
                        i++;
                    }
                    return;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            return;
        }
        try {
            Object objInvoke = Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("getEffectConfig", new Class[0]).invoke(null, new Object[0]);
            String[] strArr3 = {"", "ve_record", "ve_enigma", "ve_edit", "ve_edit_swing", "ve_mv", "ve_detector", "ve_image"};
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            do {
                String str3 = strArr3[i4];
                Set<String> set2 = sExcludedEffectLicenses;
                if (set2 == null || !set2.contains(str3)) {
                    arrayList2.add(str3);
                }
                i4++;
            } while (i4 < 8);
            String[] strArr4 = (String[]) arrayList2.toArray(new String[0]);
            int length = strArr4.length;
            while (i < length) {
                String str4 = strArr4[i];
                if (objInvoke instanceof Map) {
                    for (Map.Entry entry : ((Map) objInvoke).entrySet()) {
                        if (entry.getKey() instanceof String) {
                            String str5 = (String) entry.getKey();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("effect_config_");
                            sbLIZ.append(str4);
                            sbLIZ.append("_");
                            sbLIZ.append(str5);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (str4 != "") {
                                str5 = strLIZIZ;
                            }
                            if (entry.getValue() instanceof Map.Entry) {
                                Map.Entry entry2 = (Map.Entry) entry.getValue();
                                Object key = entry2.getKey();
                                Object value = entry2.getValue();
                                if (key instanceof Integer) {
                                    int iIntValue = ((Integer) key).intValue();
                                    DataType dataType = DataType.STRING;
                                    if (iIntValue == 0) {
                                        dataType = DataType.BOOLEAN;
                                    } else if (iIntValue == 1) {
                                        dataType = DataType.INTEGER;
                                    } else if (iIntValue == 2) {
                                        dataType = DataType.FLOAT;
                                    }
                                    ValuePkt valuePkt2 = new ValuePkt(dataType, value, EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                                    valuePkt2.setAbType(EnumC1284080jWI.FOREFFECT);
                                    addConfig(str5, valuePkt2);
                                }
                            }
                        }
                    }
                }
                i++;
            }
        } catch (ClassNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    public static VEConfigCenter getInstance() {
        if (sInstance == null) {
            synchronized (VEConfigCenter.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VEConfigCenter();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void clear() {
        this.sConfigs.clear();
    }

    public boolean enableByteBench() {
        if (this.enableByteBench) {
            return true;
        }
        boolean booleanValue = VEGetABManager.getBooleanValue("ve_enable_bytebench", false, false);
        this.enableByteBench = booleanValue;
        return booleanValue;
    }

    public String exportRecordToJson() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ValuePkt> entry : this.sConfigs.entrySet()) {
            try {
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!entry.getValue().getABType().equals(EnumC1284080jWI.FOREFFECT) && (entry.getKey().contains("camera") || entry.getKey().contains("record") || entry.getKey().equals("use_open_gl_three") || entry.getKey().equals("frame_rate_strategy") || entry.getKey().equals("video_duration_opt") || entry.getKey().equals("ve_enable_wide_fov_for_samsung"))) {
                jSONObject.put(entry.getKey(), entry.getValue().value);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public String exportToJson() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, ValuePkt> entry : this.sConfigs.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", entry.getKey());
                if (entry.getValue() != null) {
                    jSONObject.put("description", entry.getValue().description);
                    jSONObject.put("dataType", entry.getValue().dataType);
                    jSONObject.put("value", entry.getValue().value);
                    jSONObject.put("configType", entry.getValue().configType);
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int syncConfigToNative2() {
        Map map = getValue("ve_enable_ab_sync_opt", false).booleanValue() ? this.sModifiedConfigs : this.sConfigs;
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (((ValuePkt) entry.getValue()).abType == EnumC1284080jWI.FOREFFECT) {
                i++;
            } else if (((ValuePkt) entry.getValue()).abType != EnumC1284080jWI.FORCAMERA) {
                i2++;
            }
        }
        String[] strArr = new String[i];
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        String[] strArr2 = new String[i2];
        Object[] objArr2 = new Object[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (Map.Entry entry2 : map.entrySet()) {
            ValuePkt valuePkt = (ValuePkt) entry2.getValue();
            EnumC1284080jWI enumC1284080jWI = valuePkt.abType;
            if (enumC1284080jWI == EnumC1284080jWI.FOREFFECT) {
                strArr[i3] = entry2.getKey();
                objArr[i3] = valuePkt.value;
                DataType dataType = valuePkt.dataType;
                iArr[i3] = dataType == DataType.BOOLEAN ? 0 : (dataType == DataType.INTEGER || dataType == DataType.LONG) ? 1 : dataType == DataType.FLOAT ? 2 : dataType == DataType.STRING ? 3 : -1;
                i3++;
            } else if (enumC1284080jWI != EnumC1284080jWI.FORCAMERA) {
                strArr2[i4] = entry2.getKey();
                objArr2[i4] = valuePkt.value;
                iArr2[i4] = valuePkt.dataType.ordinal();
                i4++;
            }
        }
        if (i > 0) {
            batchUpdateEffectConfig(strArr, objArr, iArr);
        }
        if (i2 > 0) {
            TEConfigCenter.LIZ(strArr2, iArr2, objArr2);
        }
        emendCoconfig();
        return 0;
    }

    public VEConfigCenter() {
        initConfigCenter();
    }

    private void emendCoconfig() {
        boolean zBooleanValue = getInstance().getValue("veabtest_unbind_agfx_and_glbase_fbo", false).booleanValue();
        boolean zBooleanValue2 = getInstance().getValue("enable_render_lib", false).booleanValue();
        boolean zBooleanValue3 = getInstance().getValue("crossplat_glbase_fbo", false).booleanValue();
        if (zBooleanValue && zBooleanValue3 && !zBooleanValue2) {
            return;
        }
        TEConfigCenter.LIZIZ("crossplat_glbase_fbo", new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(getInstance().getValue("enable_render_lib", false).booleanValue()), EnumC1284870jXZ.CONFIG_TYPE_AB, "crossplat_glbase_fbo"));
    }

    public int syncConfigToNative() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : (getValue("ve_enable_ab_sync_opt", false).booleanValue() ? this.sModifiedConfigs : this.sConfigs).entrySet()) {
            if (((ValuePkt) entry.getValue()).abType == EnumC1284080jWI.FOREFFECT) {
                updateEffectConfig((String) entry.getKey(), (ValuePkt) entry.getValue());
            } else if (((ValuePkt) entry.getValue()).abType != EnumC1284080jWI.FORCAMERA) {
                TEConfigCenter.LIZIZ((String) entry.getKey(), (ValuePkt) entry.getValue());
            }
        }
        emendCoconfig();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sync_to_native_cost_ms", jCurrentTimeMillis2);
            b.LIZ("vesdk_config_center_cost", "performance", jSONObject);
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    private void initConfigCenter() {
        DataType dataType = DataType.STRING;
        EnumC1284870jXZ enumC1284870jXZ = EnumC1284870jXZ.CONFIG_TYPE_AB;
        addConfig("wide_camera_id", new ValuePkt(dataType, "-1", enumC1284870jXZ, "wide camera device id"));
        DataType dataType2 = DataType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        addConfig("enable_android_hdr_preview_support", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable android hdr preview support"));
        addConfig("veabtest_enable_hdr_flag_supported", new ValuePkt(dataType2, bool, enumC1284870jXZ, "lv/cc hdr flag for export"));
        addConfig("enable_android_hw_hdr_compile_support", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable android hw hdr compile support"));
        addConfig("enable_fix_hw_hdr_compile", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable fix hw hdr compile"));
        addConfig("ve_encoder_enable_dynamic_bitrate", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable dynamic bitrate algorithm"));
        addConfig("crossplat_glbase_fbo", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable crossplat glbase fbo"));
        addConfig("vboost_compile", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable vboost compile"));
        DataType dataType3 = DataType.INTEGER;
        addConfig("use_open_gl_three", new ValuePkt(dataType3, 1, enumC1284870jXZ, "use GLES3.0"));
        addConfig("vesdk_max_cache_count", new ValuePkt(dataType3, 0, enumC1284870jXZ, "config max cache count for input decode frame"));
        addConfig("gpu_syncobject_type", new ValuePkt(dataType3, 0, EnumC1284870jXZ.CONFIG_TYPE_DEFAULT, "GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        Boolean bool2 = Boolean.TRUE;
        addConfig("compile_probe_use_byte264", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "compile_probe use libbyte264"));
        addConfig("compile_probe_crf", new ValuePkt(dataType3, -1, enumC1284870jXZ, "compile probe use crf"));
        addConfig("compile_probe_interval_frame", new ValuePkt(dataType3, -1, enumC1284870jXZ, "compile probe interval frame"));
        addConfig("compile_probe_sleep_time", new ValuePkt(dataType3, -1, enumC1284870jXZ, "compile probe sleep time"));
        addConfig("use_byte264", new ValuePkt(dataType2, bool, enumC1284870jXZ, "use libbyte264"));
        addConfig("aeabtest_v2api", new ValuePkt(dataType2, bool, enumC1284870jXZ, "use new audiosdk api"));
        addConfig("color_space", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "color space"));
        addConfig("vesdk_audiomix_replace", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "vesdk_audiomix_replace"));
        DataType dataType4 = DataType.FLOAT;
        Float fValueOf = Float.valueOf(1.0f);
        addConfig("ve_audio_clipping_protection_gain", new ValuePkt(dataType4, fValueOf, enumC1284870jXZ, "Audio clipping protection gain to replace climiter. The value should be less than 1.0f and greater than 0.f. Code is in TEAudioComposeUnit. Use case is for video compilation."));
        addConfig("ve_enable_applog_app_and_frequency_control", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Enable applog report control based on app and frequency. For instance, logs not observed on TikTok will be skipped on TT; logs with a float frequency(0 ~ 1.0) will be randomly sampled accordingly."));
        addConfig("ve_destroy_context_when_release_graph_in_tevideoeditorrefactordestructor", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "Destroy context when release graph In TEVideoEditorRefactor destructor. This is to solve online native crash."));
        addConfig("ve_save_bundle_if_wait_too_long_in_audio_decdode_tee_unit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Save bundle if wait too long in audio decode unit."));
        addConfig("ve_clean_gl_source_bin_async", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Clean GL source bin async. This is to resolve ANR issue in gl source bin/unit when clear graph."));
        addConfig("ve_enable_lock_when_check_resource_manager_valid", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Lock mutex when check resource manager valid. Resolve crash issue in TEMediaResourceManager::isValid."));
        addConfig("ve_clear_bundle_in_compile_graph_destroy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Clear bundle in compile graph destroy to avoid crash."));
        addConfig("ve_media_api_refactor_enable_audio_decode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Audio Decode"));
        addConfig("ve_media_api_refactor_enable_video_decode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Video Decode"));
        addConfig("ve_media_api_refactor_enable_audio_output", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Audio Output"));
        addConfig("ve_media_api_refactor_enable_video_output", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Video Output"));
        addConfig("ve_media_api_refactor_enable_compile_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Compile"));
        addConfig("ve_media_api_refactor_enable_graph_destroy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Graph Destroy"));
        addConfig("ve_media_api_refactor_enable_graph_destroy_fix", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "Media Api Refactor, Graph Destroy Fix"));
        addConfig("ve_media_api_refactor_disable_getframe_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Disable GetFrame Opt"));
        addConfig("ve_media_api_refactor_disable_compile_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Disable Compile Opt"));
        addConfig("ve_media_api_refactor_disable_release_safe", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Disable Release Safe"));
        addConfig("ve_media_api_refactor_enable_thread_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Thread Opt"));
        addConfig("ve_media_api_refactor_enable_graph_init", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Media Api Refactor, Graph Init"));
        addConfig("ve_media_api_refactor_enable_frame_allocator_fix", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "Media Api Refactor, Frame Allocator Fix"));
        addConfig("ve_disable_try_execute_call", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Disable try execute call, get real crash stack"));
        addConfig("ve_use_java_get_md5_file_name", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Use java version GetMD5FileName"));
        addConfig("ve_fix_crash_in_te_audio_sles_play_unit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix crash in TEAudioSLESPlayUnit"));
        addConfig("ve_fix_last_frame_with_play_back", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix last frame with play back"));
        addConfig("ve_fix_anr_in_te_opengl_image_frame_allocator", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix ANR in TEOpenGLImageFrameAllocator"));
        addConfig("ve_fix_oom_with_nullptr_frame_in_decode_reader_unit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix OOM with nullptr frame in DecodeReaderUnit"));
        addConfig("ve_fix_crash_in_ve_video_decoder", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix crash in ve video decoder"));
        addConfig("ve_fix_video_info_fps_with_set_nle_model", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix fps in video info with nle set model"));
        addConfig("ve_hdr_camera_switch_drop_residual_frames_count", new ValuePkt(dataType3, 0, enumC1284870jXZ, "HDR camera switch drop residual frames count."));
        addConfig("enable_record_mpeg4", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable record mpeg4"));
        addConfig("ve_enable_record_hevc", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable record hevc"));
        addConfig("ve_enable_libra_max_parallel_render_thread", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_enable_libra_max_parallel_render_thread, only for test"));
        addConfig("ve_enable_libra_decode_gl_opt", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_enable_libra_decode_gl_opt, only for test"));
        addConfig("ve_record_codec_type", new ValuePkt(dataType3, 0, enumC1284870jXZ, "record codec type"));
        addConfig("vesdk_audio_hw_encoder", new ValuePkt(dataType2, bool, enumC1284870jXZ, "audio hw encoder"));
        addConfig("video_duration_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "video_duration_opt"));
        addConfig("enable_render_lib", new ValuePkt(dataType2, bool, enumC1284870jXZ, "vesdk enable render lib"));
        addConfig("renderlib_fbo_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "vesdk renderlib fbo opt"));
        addConfig("vesdk_use_agfxcontext", new ValuePkt(dataType2, bool, enumC1284870jXZ, "vesdk enable agfx ctx"));
        addConfig("ve_enable_preload_effect_res", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable preload effect res"));
        addConfig("ve_opt_first_frame_bypass_effect_frame_cnt", new ValuePkt(dataType3, 3, enumC1284870jXZ, "opt first frame bypass effect frame cnt"));
        addConfig("ve_camera_frame_update_independent_thread", new ValuePkt(dataType2, bool, enumC1284870jXZ, "camera frame update independent thread"));
        addConfig("ve_enable_camera_metadata", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable camera metadata"));
        addConfig("ve_titan_gpu_render_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt titan gpu render follow"));
        addConfig("ve_downscale_render_and_record_origin_content", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve downscale render and record origin content"));
        addConfig("ve_camera_output_and_update_strategy", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve camera output and update strategy"));
        addConfig("ve_enable_compile_buffer_hw_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Android Hw encode compile "));
        addConfig("EnableSwH264DecodeFailBack", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Enable Sw H264 Decode Failback "));
        addConfig("ve_enable_render_encode_resolution_align4", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "render and encode resolution can be align4"));
        EnumC1284870jXZ enumC1284870jXZ2 = EnumC1284870jXZ.CONFIG_TYPE_SETTINGS;
        addConfig("ve_camera_enable_previewing_fallback", new ValuePkt(dataType2, bool, enumC1284870jXZ2, "camera enable previewing fallback"));
        addConfig("ve_enable_pin_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "dmt take pin refactor"));
        addConfig("enable_remux_color_info", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable remux color info"));
        addConfig("ve_fix_codec_not_found", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_fix_codec_not_found"));
        addConfig("remux_video_res", new ValuePkt(dataType3, -1, enumC1284870jXZ, "remux video res"));
        addConfig("ve_compile_report", new ValuePkt(dataType3, 0, enumC1284870jXZ, "compile report state"));
        addConfig("vesdk_gbu_trace_info", new ValuePkt(dataType3, 0, enumC1284870jXZ, "vesdk gbu pipeline trace info"));
        addConfig("EnableMultiThreadDecodeExp2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Enable multi thread decode experiment 2"));
        addConfig("ve_enable_compile_timeout_diagnosis", new ValuePkt(dataType2, bool, enumC1284870jXZ, "compile timeout diagnosis"));
        addConfig("ve_enable_hwdecode_playback_dropframe_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "hwdecode playback dropframe opt"));
        addConfig("ve_enable_mpeg24vp89_hwdecoder2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable mpeg24 vp89 hwdecoder"));
        addConfig("ve_enable_imageAlgorithmReuseAndOptForAmazing", new ValuePkt(dataType2, bool, enumC1284870jXZ, "imageAlgorithm Reuse and optForAmazing"));
        addConfig("byteVC1_10bit_hardware_encoder_timeout", new ValuePkt(dataType3, 10000, enumC1284870jXZ, "byteVC1 10bit hardware encoder timeout params"));
        addConfig("ve_compile_codec_type", new ValuePkt(dataType3, 0, enumC1284870jXZ, "compile support bytevc1 encode"));
        addConfig("ve_compile_hw_bytevc1_max_pixel_count", new ValuePkt(dataType3, 8294400, enumC1284870jXZ, "compile bytevc1 max pixel count"));
        addConfig("ve_enable_common_earback", new ValuePkt(dataType2, bool2, enumC1284870jXZ2, "enable common earback"));
        addConfig("ve_enable_pip_resolution_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable pip resolution opt"));
        addConfig("ve_hardware_encode_fallback", new ValuePkt(dataType3, 0, enumC1284870jXZ, "config for hardware encode fallback to soft, DO NOT set NON-ZERO ON LINE"));
        addConfig("ve_enable_effect_render_without_glreadpixels", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable effect render without glreadpixels"));
        addConfig("ve_enable_global_decoder_pool", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable global decoder pool"));
        addConfig("ve_enable_decoder_dispatch", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable global dispatch for decoder tasks"));
        addConfig("ve_enable_decoder_dispatch2", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable global dispatch "));
        addConfig("ve_disable_ffmpeg_command", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_disable_ffmpeg_command "));
        addConfig("ve_enable_decoder_schedule_opt_hw", new ValuePkt(dataType3, 2, enumC1284870jXZ, "enable decoder schedule for hw"));
        addConfig("ve_enable_fix_seek_last_frame", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "fix seek no last frame"));
        addConfig("ve_enable_readermanager_refactor", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "description tevideoreader manager refactor"));
        addConfig("ve_enable_readermanager_global", new ValuePkt(dataType2, bool, enumC1284870jXZ, "description tevideoreader manager global"));
        addConfig("ve_enable_video_frame_cache", new ValuePkt(dataType3, 0, enumC1284870jXZ, "andorid support video frame cache"));
        addConfig("ve_enable_schdule_device_capability_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "description enable  device monitor opt"));
        addConfig("ve_enable_schdule_preload", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_enable_schdule_preload"));
        addConfig("ve_hwdecode_support_rt_and_or", new ValuePkt(dataType2, bool, enumC1284870jXZ, "hw decode support real-time and operating-rate"));
        addConfig("ve_camera_enable_preview_pure_color_background", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_camera_enable_preview_pure_color_background"));
        addConfig("ve_camera_preview_pure_color_background_rgba", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_camera_preview_pure_color_background_rgba"));
        addConfig("ve_mediacodec_resource_reasonable_distribute", new ValuePkt(dataType2, bool, enumC1284870jXZ, "mediacodec resource reasonable distribute"));
        addConfig("vesdk_ffmpeg_enable_video_timestamp_monotonic", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable ffmpeg video timestamp monotonic"));
        addConfig("ve_enable_audio_reader_preload_reuse", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "support audioReader preload and reuse"));
        addConfig("ve_enable_veimage_optimize_quality", new ValuePkt(dataType2, bool, enumC1284870jXZ, "VEImage enable optimize quality"));
        addConfig("ve_titan_follow_shot_independent_thread", new ValuePkt(dataType2, bool, enumC1284870jXZ, "follow shot independent thread."));
        addConfig("ve_enable_seek_preload_drop_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "seek and preload drop frame"));
        addConfig("ve_enable_slow_seek_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_enable_slow_seek_opt"));
        addConfig("ve_enable_amazing_feature_handle_cache", new ValuePkt(dataType2, bool, enumC1284870jXZ, "amazing feature handle cache"));
        addConfig("ve_enable_image_preload", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable image preload when display"));
        addConfig("ve_enable_amazing_feature_handle_preload", new ValuePkt(dataType2, bool, enumC1284870jXZ, "amazing feature handle preload"));
        addConfig("ve_titan_release_gpu_resource", new ValuePkt(dataType2, bool, enumC1284870jXZ, "titan release gpu resource."));
        addConfig("ve_enable_recorder_native_api", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable recorder native api"));
        addConfig("ve_anable_codec2_output_format_align_16", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable mediacodec output format align 16"));
        addConfig("ve_enable_render_layer", new ValuePkt(dataType2, bool, enumC1284870jXZ2, "enable render layer"));
        addConfig("ve_enable_titan_engine_monitor", new ValuePkt(dataType2, bool, enumC1284870jXZ2, "enable titan engine monitor"));
        addConfig("vesdk_use_bytevcremux_in_publish", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable bytevc1 remux"));
        addConfig("ve_enable_forward_ongoingseek_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable forward ongoingseek opt"));
        addConfig("ve_enable_video_reader_hw_overload_fallback_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable video reader hw_overload fallback opt"));
        addConfig("enable_lens_edit_async_process", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable lens async process"));
        addConfig("enable_lens_edit_params", new ValuePkt(dataType, "", enumC1284870jXZ, "enable_lens_edit_params"));
        addConfig("ve_effect_memory_config", new ValuePkt(dataType, "", enumC1284870jXZ, "effect memory info config"));
        addConfig("EnableImageTextureCache", new ValuePkt(dataType2, bool, enumC1284870jXZ, "EnableImageTextureCache"));
        addConfig("ve_enable_adaptive_encode_level", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable adaptive encode level"));
        addConfig("ve_enable_limit_min_encode_fps", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable limit min encode fps"));
        addConfig("ve_encoder_qp_range", new ValuePkt(dataType, "", enumC1284870jXZ, "encoder qp range"));
        addConfig("ve_encoder_qp_range_for_recorder", new ValuePkt(dataType, "", enumC1284870jXZ, "encoder qp range for recorder"));
        addConfig("ve_enable_business_hw_encode_qp_range", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable business hw encode qp range"));
        addConfig("ve_encoder_b_frame", new ValuePkt(dataType, "", enumC1284870jXZ, "encoder b frame"));
        addConfig("veabtest_hdr_effect_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "description hdr video effect optimization, hdr2sdr effect sdr2hdr"));
        addConfig("ve_load_express_detect_model", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "load express detect model in camera init"));
        addConfig("ve_enable_low_light_enhance", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable low light enhancement algo"));
        addConfig("ve_encoder_initial_qp", new ValuePkt(dataType, "", enumC1284870jXZ, "encoder initial qp"));
        addConfig("ve_compile_remux_bitrate_json", new ValuePkt(dataType, "", enumC1284870jXZ, "compile remux bitrate json"));
        addConfig("ve_compile_reencode_strategy_json", new ValuePkt(dataType, "", enumC1284870jXZ, "compile reencode strategy json"));
        addConfig("ve_enable_uri_convert_android_q", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable uri convert android q"));
        addConfig("ve_compile_gl_fence_ab", new ValuePkt(dataType3, 0, enumC1284870jXZ, "compile glfence, 0 - glfinish; 1 - glfence & wait on server; 2 - glfence & wait on client"));
        addConfig("veabtest_enablePreviewQualityOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable preview quality opt"));
        addConfig("veabtest_enableUpSamplingOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable upsampling opt"));
        addConfig("veabtest_enableGradientCanvasOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable gradient canvas opt"));
        addConfig("veabtest_enableCrossplatCanvasOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable crossplat canvas opt"));
        addConfig("veabtest_enableCrossplatCanvasDownscaleOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable crossplat canvas downscale opt"));
        addConfig("ve_enable_compile_hw_encoder_opt", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable hw compile encoder optimization"));
        addConfig("ve_onekey_process_all_algo_params", new ValuePkt(dataType, "", enumC1284870jXZ, "lens onekey all algo params"));
        addConfig("ve_audio_source_type", new ValuePkt(dataType3, 1, enumC1284870jXZ, "set recorder audio source type"));
        addConfig("ve_enable_odd_display", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve enable odd display"));
        addConfig("ve_enable_img_downsample_calculate_opt", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable img downsample calculate opt"));
        addConfig("ve_enable_sys_image_decoder", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable sys image decoder"));
        addConfig("ve_enable_recorder_veperformance", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_enable_recorder_veperformance"));
        addConfig("ve_enable_fastlanczos_edit_display", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable fastlanczos edit display"));
        addConfig("ve_enable_bytebench", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable get result from bytebench"));
        addConfig("ve_enable_model_hot_update", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable model hot update"));
        addConfig("ve_compile_hide_ve_metadata", new ValuePkt(dataType2, bool, enumC1284870jXZ, "hide ve metadata"));
        addConfig("ve_enable_part_remux", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable part remux optimization"));
        addConfig("ve_enable_seek_parallel_decode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable seek parallel decode"));
        addConfig("ve_enable_seek_backward_drop_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable seek backward opt"));
        addConfig("ve_enable_veimage_gl_nearst", new ValuePkt(dataType3, 1, enumC1284870jXZ, "ve enable veimage gl nearst"));
        addConfig("ve_enable_veimage_lanczos_resample", new ValuePkt(dataType3, 6, enumC1284870jXZ, "ve enable veimage lanczos resample"));
        addConfig("ve_enable_veimage_publish_dp", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable veimage publish dp"));
        addConfig("ve_enable_veimage_smart_composition", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable veimage smart composition"));
        addConfig("ve_enable_veimage_smart_composition_lens_para", new ValuePkt(dataType, "", enumC1284870jXZ, "ve enable veimage smart composition lens para"));
        addConfig("ve_enable_veimage_render_cache", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable veimage render cache"));
        addConfig("ve_enable_veimage_open_contrast", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable veimage open contrast"));
        addConfig("ve_enable_veimage_compress_quality", new ValuePkt(dataType3, 100, enumC1284870jXZ, "ve nable veimage compress quality"));
        addConfig("ve_enable_android_webp_encode_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable webp encode optimization"));
        addConfig("ve_enable_backend_dispatch", new ValuePkt(dataType, "", enumC1284870jXZ, "ve_enable_backend_dispatch"));
        addConfig("ve_enable_matting_backend", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_matting_backend"));
        addConfig("ve_enable_high_gif_optimize", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_enable_high_gif_optimize"));
        addConfig("ve_titan_hw_dec_res_min_side", new ValuePkt(dataType3, -1, enumC1284870jXZ, "If titan decode video`s min side >= this size will use hardware decoder"));
        addConfig("ve_enable_aaudio_mic_record", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable aaudio mic recording"));
        addConfig("ve_enable_audio_track_play", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio track fallback solution"));
        addConfig("ve_enable_audio_track_adjustment", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable audio track av sync adjustment"));
        addConfig("ve_max_supported_effect_video_players", new ValuePkt(dataType3, 2, enumC1284870jXZ, "maximum video players supported in VideoPlayerInterface"));
        addConfig("ve_use_set_sticker_v3", new ValuePkt(dataType2, bool, enumC1284870jXZ, "use bef_effect_set_sticker_with_tag_v3 api"));
        addConfig("ve_disable_effect_multi_outputs", new ValuePkt(dataType2, bool, enumC1284870jXZ, "disable the multiple outputs even if the effect supports"));
        addConfig("ve_enable_aaudio_unit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio rendering using aaudio in the editor"));
        addConfig("ve_enable_aaudio_for_audio_track", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio rendering using aaudio in the recorder instead of audiotrack"));
        addConfig("ve_enable_aaudio_for_opensl", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio rendering using aaudio in the recorder instead of opensl"));
        addConfig("ve_override_recorder_buffer_size", new ValuePkt(dataType3, 0, enumC1284870jXZ, "buffer size for recorder audio playback"));
        addConfig("ve_override_recorder_sample_count", new ValuePkt(dataType3, 0, enumC1284870jXZ, "audio organize samples count for recorder audio playback"));
        addConfig("ve_enable_always_on_audio_stream", new ValuePkt(dataType2, bool, enumC1284870jXZ, "send silence in place of stopping audio stream for recorder audio playback"));
        addConfig("ve_remove_mic_input_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove mic input bin"));
        addConfig("ve_remove_audio_input_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio input bin"));
        addConfig("ve_remove_audio_sync_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio sync bin"));
        addConfig("ve_remove_audio_comb_effect_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio comb effect bin"));
        addConfig("ve_remove_audio_encode_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio encode bin"));
        addConfig("ve_remove_audio_play_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio play bin"));
        addConfig("ve_remove_mic_detect_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove mic detect bin"));
        addConfig("ve_remove_audio_effect_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio effect bin"));
        addConfig("ve_remove_audio_play_effect_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "remove audio play effect bin"));
        addConfig("ve_connect_audio_play_stream", new ValuePkt(dataType2, bool, enumC1284870jXZ, "connects AudioPlayUnit to ALDetectUnit. Requires RemoveAudioPlayBin + RemoveAudioCombEffectBin"));
        addConfig("ve_playunit_sync_destroy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "synchronously destroy TEAudioPlayUnit"));
        addConfig("ve_remove_record_source_bin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "move record source bin logic into units"));
        addConfig("ve_enable_titan_opt_lanczos_screen", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable titan opt lanczos for screen"));
        addConfig("ve_content_adaptive_coding_mode", new ValuePkt(dataType3, 3, enumC1284870jXZ, "ve set content adaptive coding mode"));
        addConfig("ve_ffmpeg_codec_mem_reuse", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve use ffmpeg codec buffer pool in bytevc1 decode"));
        addConfig("ve_camera_prop_cache", new ValuePkt(dataType2, bool, enumC1284870jXZ, "read camera prop in cache for next use"));
        addConfig("ve_camera_preload_effect_algo", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve camera preload effect algo"));
        addConfig("ve_shot_screen_two_frame_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "shot screen two frame opt"));
        addConfig("ve_titan_camera_cpu_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt TECameraServer thread cpu"));
        addConfig("ve_recorder_encode_gop_size", new ValuePkt(dataType3, 0, enumC1284870jXZ, "override recorder encode gop size"));
        addConfig("ve_editor_first_frame_with_surface_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "draw first frame when surface is ready"));
        addConfig("ve_titan_init_thread_pool_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt opengl create message in initthreadpool"));
        addConfig("ve_titan_shot_screen_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "shoot screen use bitmap but except shoot two frame"));
        addConfig("ve_enable_nth_preview_frame_callback", new ValuePkt(dataType3, -1, enumC1284870jXZ, "Enable the N-th preview frame callback"));
        addConfig("veabtest_reuse_diff_size_texture", new ValuePkt(dataType2, bool, enumC1284870jXZ, "reuse texture with different size (resolution) in verenderer, android only"));
        addConfig("veabtest_gles_render_experiment", new ValuePkt(dataType3, 0, enumC1284870jXZ, "used for gles driver debugging while some bugs unable to be reproduced locally, android only"));
        addConfig("veabtest_destroy_gl_context_with_mutex", new ValuePkt(dataType2, bool, enumC1284870jXZ, "use mutex to avoid parallel glcontext destroy, android only"));
        addConfig("veabtest_unbind_agfx_and_glbase_fbo", new ValuePkt(dataType2, bool, enumC1284870jXZ, "unbind agfx and glbase fbo ab, used for cc experiment only"));
        addConfig("veabtest_reuse_diff_size_texture_del_and_new", new ValuePkt(dataType3, 0, enumC1284870jXZ, "reuse texture with different size by delete-new, android cc only"));
        addConfig("ve_enable_preview_sharpness_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable preview sharpness opt"));
        addConfig("ve_enable_encode_operating_rate", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve enable encode operating rate"));
        addConfig("ve_encode_support_operating_rate", new ValuePkt(dataType, "", enumC1284870jXZ, "ve encode support operating rate"));
        addConfig("ve_demux_not_uploading_with_synthesis", new ValuePkt(dataType2, bool, enumC1284870jXZ, "demux not uploading with synthesis"));
        addConfig("ve_decode_support_operating_rate", new ValuePkt(dataType, "", enumC1284870jXZ, "ve decode support operating rate"));
        addConfig("ve_enable_record_encode_operating_rate", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve enable record encode operating rate"));
        addConfig("ve_enable_editor_fake_frame_aspect", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable editor fake frame aspect"));
        addConfig("ve_enable_fix_detach_wav_format", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable fix detach wav format for detachAudioFromVideos"));
        addConfig("ve_enable_pass_effect_when_no_effect_filter", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable pass effect when no effect filter"));
        addConfig("ve_encode_color_space_bt601", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve encode color space bt601"));
        addConfig("ve_smartcodec_video_json_setting", new ValuePkt(dataType, "", enumC1284870jXZ, "ve smartcodec video json setting"));
        addConfig("ve_preview_optimized_lanczos_setting", new ValuePkt(dataType, "", enumC1284870jXZ, "ve preview optimized lanczos settings"));
        addConfig("ve_crop_encode_operating_rate", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve crop encode operating rate"));
        addConfig("ve_enanle_titan_audio_decode_time_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable titan audio decode time opt"));
        addConfig("ve_enable_encode_buffer_operating_rate", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable encode buffer operating rate"));
        addConfig("ve_enable_opt_hwdecode_moire", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable opt hw decode moire"));
        addConfig("ve_enable_first_frame_opt_public", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable first frame opt of public api"));
        addConfig("ve_enable_opt_hwencode_dts", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable opt hw encode dts"));
        addConfig("ve_enable_preview_size_change_opt1", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable preview size change optimize solution 1"));
        addConfig("ve_enable_titan_video_decode_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve titan video decode opt"));
        addConfig("ve_enable_alpha_video_decoder", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_alpha_video_decoder"));
        addConfig("ve_enable_alpha_video_func", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_enable_alpha_video_func"));
        addConfig("ve_enable_export_pip_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable export pip opt"));
        addConfig("veabtest_opt_canvas_by_check_filter", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable canvas by check filter"));
        addConfig("ve_enable_compile_param_dump", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable compile config dump"));
        addConfig("veabtest_enable_seek_noise_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable seek noise opt"));
        addConfig("veabtest_hevc_seek_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve hevc seek optimization"));
        addConfig("veabtest_aboffline_performance", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable the AB offline key for performance"));
        addConfig("ve_enable_operating_rate_support_2k4k", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable operating rate support 2k4k"));
        addConfig("ve_enable_titan_sw_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable sw encode"));
        addConfig("veabtest_decode_av_sync", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve decode av sync"));
        addConfig("veabtest_get_media_info_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable get media info optimization"));
        addConfig("veabtest_find_stream_info_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable find stream info optimization"));
        addConfig("veabtest_media_mime_type_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable get media mime type opt"));
        addConfig("veabtest_enbale_readerunit_merge_fps_pts", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable merge byfps and bypts"));
        addConfig("ve_unify_new_compile_strategy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve unify new compile strategy"));
        addConfig("ve_enable_Renderlayer_MemoryManager_Opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "description renderlayer MemoryManage opt"));
        addConfig("ve_enable_Renderlayer_PreloadCount_Opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "description renderlayer PreloadCount opt"));
        addConfig("ve_enable_decode_low_latency", new ValuePkt(dataType2, bool, enumC1284870jXZ, "description enable decoder low latency"));
        addConfig("ve_enable_hw_decoder_use_surfacetexture_matrix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "description hw decoder use surfacetexture matrix"));
        addConfig("veabtest_fixAudioDriveEOS", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_fixAudioDriveEOS"));
        addConfig("ve_enable_renderlayer_buffer_algorithm", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable renderlayer buffer algorithm"));
        addConfig("veabtest_hook_image_copy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable hook android::ImageCopy to fix crash on SM7325"));
        addConfig("ve_enable_resize_image_optimize", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable use libyuv::ARGBScale to scale rgba image"));
        addConfig("veabtest_enable_editor_matting", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable matting in editor mode in GL thread"));
        addConfig("veabtest_matting_async_count", new ValuePkt(dataType3, 0, enumC1284870jXZ, "TEBachMattingProcessUnit async matting thread count"));
        addConfig("ve_enable_matting_hardware", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable use of hardware decoder during matting"));
        addConfig("ve_fix_reader_flags", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix reader factory flag set"));
        addConfig("veabtest_matting_complete_segment", new ValuePkt(dataType2, bool, enumC1284870jXZ, "matting complete segment"));
        addConfig("ve_enable_matting_cutout_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_matting_cutout_opt"));
        addConfig("ve_enable_algorithm_cache", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable algorithm pre cache"));
        addConfig("ve_update_rich_text_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve update rich text api opt"));
        addConfig("veabtest_opt_alg_las_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "optimaize lvs algorithm"));
        addConfig("ve_enable_commit_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable commit opt"));
        addConfig("ve_enable_transition_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable transition opt"));
        addConfig("ve_enable_track_effect", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable track effect"));
        addConfig("ve_enable_effects_atomic", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable effectsatomic"));
        addConfig("ve_renderlayer_segment_max_cache", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_renderlayer_segment_max_cache"));
        addConfig("ve_enable_swing_clear_texture", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_enable_swing_clear_texture"));
        addConfig("veabtest_report_predict_compile_file_info", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_report_predict_compile_file_info"));
        addConfig("veabtest_fix_anr_of_audio_player", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix anr of release engine"));
        addConfig("ve_enable_change_surface_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable change surface optimize"));
        addConfig("veabtest_enbale_refresh_display_frame_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_enbale_refresh_display_frame_opt"));
        addConfig("ve_enable_seek_with_speed", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_seek_with_speed"));
        addConfig("ve_enable_refresh_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve refresh opt"));
        addConfig("veabtest_fix_large_audio_sample_anr", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "fix large audio sample anr"));
        addConfig("veabtest_audio_gbu_refactor_1", new ValuePkt(dataType2, bool, enumC1284870jXZ, "audio gbu refactor 1"));
        addConfig("veabtest_adjust_audio_effect_order", new ValuePkt(dataType2, bool, enumC1284870jXZ, "apply audio effect in the specified order"));
        addConfig("veabtest_optimizeAudioDelayOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_optimizeAudioDelayOpt"));
        addConfig("veabtest_export_audio_quality_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio quality option when export"));
        addConfig("ve_disable_mt_unused_bins", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "disables unused units and bins"));
        addConfig("ve_enable_effect_delay_init", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable effect delay init"));
        addConfig("ve_enable_record_effect_lazy_loading", new ValuePkt(dataType2, bool, enumC1284870jXZ, "record effect lazy loading"));
        addConfig("veabtest_asyncCopyAndConcat", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_asyncCopyAndConcat"));
        addConfig("ve_enable_recorder_simply_project", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Recorder simply project switch"));
        addConfig("ve_hwencode_detect_duration", new ValuePkt(dataType3, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), enumC1284870jXZ, "ve hwencode detect duration"));
        addConfig("ve_enable_sync_withorigin_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable sync with origin preview frame"));
        addConfig("ve_enable_duet_resolution_down_grade", new ValuePkt(dataType2, bool, enumC1284870jXZ, "duet_resolution_down_grade"));
        addConfig("ve_enable_duet_resolution_down_grade_for_video_clip", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_duet_resolution_down_grade_for_video_clip"));
        addConfig("ve_enable_record_hw_decode", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve enable record hw decode"));
        addConfig("veabtest_enable_audio_skip_samples_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio skip_samples opt"));
        addConfig("ve_enable_camera_first_frame_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable camera first frame display opt"));
        addConfig("ve_enable_recorder_photo_delay_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable recorder photo delay opt"));
        addConfig("veabtest_enable_imagereader_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable imagereader refactor"));
        addConfig("ve_clip_effect_bin_filter_time_interval_bugfix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_clip_effect_bin_filter_time_interval_bugfix"));
        addConfig("veabtest_compile_progress_update_json", new ValuePkt(dataType, "", enumC1284870jXZ, "veabtest_compile_progress_update_json"));
        addConfig("ve_enable_titan_thread_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_titan_thread_opt"));
        addConfig("ve_enable_titan_thread_delay", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_titan_thread_delay_init"));
        addConfig("ve_titan_stop_camera_first", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_titan_stop_camera_first"));
        addConfig("ve_titan_audio_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve titan audio opt"));
        addConfig("ve_shared_egl_context_for_camera_texture_to_editor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_shared_egl_context_for_camera_texture_to_editor"));
        addConfig("ve_enable_ab_sync_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable ab sync opt"));
        addConfig("ve_eanble_protect_track_context", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_eanble_protect_track_context"));
        addConfig("ve_skip_lens_watermark_process", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_skip_lens_watermark_process"));
        addConfig("ve_lens_invisible_watermark_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "lens invisible watermark opt strategy"));
        addConfig("veabtest_enable_imagereader_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable imagereader refactor"));
        addConfig("ve_enable_record_canvas_size_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable record canvas size opt"));
        addConfig("ve_enable_render_res_clear_when_editor_stop", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_render_res_clear_when_editor_stop"));
        addConfig("ve_sub_seq_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt subsequence performance"));
        addConfig("ve_streaming_edit_undertake", new ValuePkt(dataType3, 1, enumC1284870jXZ, "ve streaming edit undertake"));
        addConfig("veabtest_heif_decode_by_libttheif", new ValuePkt(dataType2, bool, enumC1284870jXZ, "decode heif/heic use libttHeif"));
        addConfig("ve_enable_record_effect_filter_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_record_effect_filter_opt"));
        addConfig("veabtest_audioBalancedGain", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio bgm balanced gain"));
        addConfig("ve_enable_image_decode_sharpness_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_image_decode_sharpness_opt"));
        addConfig("ve_opensles_player_destroy_timeout_ms", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_editor_open_sles_player_destroy_timeout_ms"));
        addConfig("veabtest_enable_jpeg_multi_thread_decode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable jpeg multi-thread decode"));
        addConfig("veabtest_limit_android_os_version_for_powervr_gl_bugfix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "trying to fix gl crash by limit some gl logic in vesdk"));
        addConfig("ve_enable_repair_decode_chain", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable repair decode chain"));
        addConfig("ve_enable_transform_unit_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable transform unit refactor"));
        addConfig("veabtest_jpeg_multi_thread_decode_count", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve jpeg multi-thread decode count"));
        addConfig("ve_enable_video_hw_native_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable video hw native encode"));
        addConfig("ve_enable_video_hw_encode_wrapper", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable video hw encode wrapper"));
        addConfig("ve_enable_encode_wrapper_h265", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable video encode wrapper for non-mpg4"));
        addConfig("ve_enable_video_hw_encode_recorder", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable video encode wrapper for recorder"));
        addConfig("veabtest_enable_android_png_decode_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable android png decode optimization"));
        addConfig("veabtest_enable_android_jpg_decode_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable android jpg decode optimization"));
        addConfig("veabtest_enable_compilation_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable compilation module refactor"));
        addConfig("veabtest_enable_bytevc1sw_upgrade", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable bytevc1 sw encoder upgrade"));
        addConfig("ve_camera_enable_surface_sharing", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve camera enable surface sharing"));
        addConfig("ve_preset_effect_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve preset effect opt"));
        addConfig("veabtest_unitBaseFrameAllocatorUseLock", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Unit Base frameAllocator use Lock"));
        addConfig("veabtest_copy_bundle_on_editorgraph_ready", new ValuePkt(dataType2, bool, enumC1284870jXZ, "copy bundle on TEEditorGraph::ready"));
        addConfig("ve_enable_reduce_effectsdk_calls_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Reduce unnecessary EffectSDK API calls in VESDK"));
        addConfig("ve_remove_deprecated_effect_bin_units", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Remove deprecated EffectBin units. Specifically, TEBeautyFilterUnit/TEReshapeFilterUnit/TEColorFilterUnit."));
        addConfig("ve_enable_camera_thread_cleanup", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Clean up camera thread workloads. Randomly sampling ByteBench camera capabilities report. Remove redundant per frame code."));
        addConfig("ve_bytebench_camera_capabilities_report_sampling_rate", new ValuePkt(dataType4, fValueOf, enumC1284870jXZ, "The sampling rate for reporting camera capabilities to Bytebench."));
        addConfig("ve_move_camera_capability_report_bytebench_to_background_thread", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Move `reporting camera capabilities to Bytebench` to background thread."));
        addConfig("ve_boost_camera_thread_priority", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Boost camera thread priority."));
        addConfig("ve_enable_recorder_skip_effects", new ValuePkt(dataType2, bool, enumC1284870jXZ, "skip unnecessary effects api calls in recorder"));
        addConfig("veabtest_skip_reset_workingmode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "skip reset working mode"));
        addConfig("veabtest_opt_darSize", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable opt get video size"));
        addConfig("veabtest_aigc_effect_handle_old_fallback", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "veabtest_aigc_effect_handle_old_fallback"));
        addConfig("ve_enable_enigma_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable enigma optimization"));
        addConfig("ve_enable_global_render_resource", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable global render resource"));
        addConfig("ve_enable_swing_simplify", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable swing simplify"));
        addConfig("ve_enable_copy_watermark_json", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable copy watermark json"));
        addConfig("ve_enable_record_async_framework", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable async framework"));
        addConfig("veabtest_enable_fix_AVSyncUnit2_stack_overflow", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable fix AVSyncUnit2 stack overflow"));
        addConfig("veabtest_enable_skip_redundant_unit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable skip edit redundant unit"));
        addConfig("ve_enable_glsource_bin_removal", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_glsource_bin_removal"));
        addConfig("ve_fix_record_video_time_regression", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_record_video_time_regression"));
        addConfig("ve_enable_hdr_convert_bin_removal", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_hdr_convert_bin_removal"));
        addConfig("veabtest_present_fast", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_present_fast"));
        addConfig("EnableEditorFpsLog", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_present_fast"));
        addConfig("UseImageAllocator", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable image texture reader"));
        addConfig("ve_resolutionlimit_for_imageUploadDirectly", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_resolutionlimit_for_imageUploadDirectly"));
        addConfig("ve_smart_recode_param_thresh", new ValuePkt(dataType4, Float.valueOf(-1.0f), enumC1284870jXZ, "ve_smart_recode_param_thresh"));
        addConfig("ve_enable_pic_upload_directly", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_pic_upload_directly"));
        addConfig("veabtest_continueCompileOnCloudProcessWithMusic", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_continueCompileOnCloudProcessWithMusic"));
        addConfig("ve_enable_audioplayunit_in_editor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Adding AudioPlayUnit used in recorder to editor"));
        addConfig("ve_enable_audio_release_check", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Adding audio capture release check"));
        addConfig("veabtest_vescan_aigc_norm_photo_mode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Use normal photo mode in Bach face detection algorithm"));
        addConfig("veabtest_force_2ndEnc_test_only", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve forces to enable 2nd encode for test purpose only"));
        addConfig("ve_editor_preview_fps", new ValuePkt(dataType3, -1, enumC1284870jXZ, "editor preview fps"));
        addConfig("veabtest_enable_async_render", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable async render"));
        addConfig("ve_enable_getframe_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable get frame optimization"));
        addConfig("ve_engine_thread_default_priority", new ValuePkt(dataType3, -1, enumC1284870jXZ, "record engine thread priofity"));
        addConfig("ve_record_audio_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable record audio opt"));
        addConfig("ve_enable_fix_wrapping_size", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable fix wrapping size"));
        addConfig("ve_recorder_audioplay_cache_size", new ValuePkt(dataType3, 3, enumC1284870jXZ, "recorder audioplay cache size"));
        addConfig("ve_enable_swing_pin_drop_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable swing pin drop frame"));
        addConfig("ve_enable_multi_camera_surface", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable multi camera surface"));
        addConfig("ve_enable_first_video_preload", new ValuePkt(dataType2, bool, enumC1284870jXZ, "first video preload in editor"));
        addConfig("ve_opt_render_handle_preload", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt render handle preload"));
        addConfig("ve_effect_allow_preload_type", new ValuePkt(dataType3, 129, enumC1284870jXZ, "effect allow preload type"));
        addConfig("ve_terational_is_valid_fix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_terational_is_valid_fix"));
        addConfig("enable_high_speed_work_with_vepagemode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable_high_speed_work_with_vepagemode"));
        addConfig("ve_enable_decode_exception_check", new ValuePkt(dataType2, bool, enumC1284870jXZ, "decoder exception check"));
        addConfig("ve_disable_send_mute_frames_when_seek", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_disable_send_mute_frames_when_seek"));
        addConfig("ve_enable_opt_get_images", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable opt get images"));
        addConfig("ve_opt_enable_get_images_decode_one_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve opt get images decode one frame"));
        addConfig("veabtest_enable_vqscore", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable calculating vqscore"));
        addConfig("veabtest_vqscore_process_period", new ValuePkt(dataType3, -1, enumC1284870jXZ, "vqscore processing frame interval"));
        addConfig("veabtest_vqscore_resolution_limit", new ValuePkt(dataType3, 1920, enumC1284870jXZ, "frame resolution limit for vqscore processing"));
        addConfig("veabtest_swing_algorithm_pool", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable swing algorithm pool"));
        addConfig("ve_seek_report_threshold", new ValuePkt(dataType3, 0, enumC1284870jXZ, "seek report threshold"));
        addConfig("ve_seek_EP_Opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "seek EP OPT"));
        addConfig("EnableSeekOpt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "seek opt reverse"));
        addConfig("ve_check_mem_size_bytevc1_sw_enc", new ValuePkt(dataType3, 0, enumC1284870jXZ, "used to control whether enable check avaiable mem size before init bytevc1 sw encoder"));
        addConfig("ve_editor_preview_fps_degrade_ms", new ValuePkt(dataType3, -1, enumC1284870jXZ, "editor preview fps degradation latency in ms"));
        addConfig("ve_ep_preview_fps_degrade_ms", new ValuePkt(dataType3, -1, enumC1284870jXZ, "editor pro preview fps degradation latency in ms"));
        addConfig("ve_enable_editorpro_metrics_sample_rate", new ValuePkt(dataType3, 30, enumC1284870jXZ, "editor pro metrics sample rate"));
        addConfig("ve_enable_spdlog_async", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable spdlog"));
        addConfig("ve_enable_android_alog", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable alog"));
        addConfig("ve_print_vesdk_log", new ValuePkt(dataType2, bool, enumC1284870jXZ, "print VESDK log, not limited by enableNonErrorLog; effect log unchanged"));
        addConfig("ve_record_hdr_bitrate_ratio", new ValuePkt(dataType4, fValueOf, enumC1284870jXZ, "ve record hdr bitrate ratio"));
        addConfig("ve_mediainfo_preload", new ValuePkt(dataType2, bool, enumC1284870jXZ, "mediainfo preload"));
        addConfig("ve_enable_skip_canvas", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable skip canvas rendering"));
        addConfig("ve_delay_gyro", new ValuePkt(dataType2, bool, enumC1284870jXZ, "delay gyro after focus"));
        addConfig("ve_delay_report_camera_capability", new ValuePkt(dataType2, bool, enumC1284870jXZ, "delay report camera capability"));
        addConfig("ve_scale_frame_when_decoding", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve scale video frame when decoding"));
        addConfig("MaxFreeImageTextureBufferCount", new ValuePkt(dataType3, 10, enumC1284870jXZ, "max free image texture buffer count"));
        addConfig("ve_glse_debug_bits_low_end", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve glse debug bits for low end"));
        addConfig("ve_editor_skip_effect_rendering", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve editor skip swing render"));
        addConfig("ve_scale_frame_in_image_file_reader", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve scale frame in image file reader"));
        addConfig("ve_enable_restart_image_decoder", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable restart image decoder"));
        addConfig("veabtest_decoder_by_pts_new_strategy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_decoder_by_pts_new_strategy"));
        addConfig("ve_editor_adjust_fps_by_maxfps", new ValuePkt(dataType2, bool, enumC1284870jXZ, "editor adjust fps by maxfps"));
        addConfig("ve_config_thread_priority", new ValuePkt(dataType, "", enumC1284870jXZ, "ve config thread priority"));
        addConfig("ve_report_create_swing_effect_segment", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve report creating swing effect segment"));
        addConfig("veabtest_write_mp4_strategy", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve write mp4 strategy"));
        addConfig("ve_try_fix_media_writer_flush", new ValuePkt(dataType2, bool, enumC1284870jXZ, "try fix media writer flush"));
        addConfig("veabtest_fixEncodeWriteUnitEof", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix encodeWriteUnit eof"));
        addConfig("veabtest_fix_is_nonref_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix the function te_is_nonref_frame"));
        addConfig("ve_frame_buffer_cache_opt_strategy", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve frame buffer cache opt strategy"));
        addConfig("ve_clear_htsglcontext_after_unused_ms", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve clear htsglcontext after unused ms"));
        addConfig("ve_clear_framebuffer_after_unused_ms", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve clear framebuffer after unused ms"));
        addConfig("ve_enable_multi_capture_pipeline", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable multi camera surface"));
        addConfig("ve_skip_frame_encode_fix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "disable encoder fallback timer while skip frame is enabled"));
        addConfig("veabtest_newAudioComposeQueue", new ValuePkt(dataType2, bool, enumC1284870jXZ, "veabtest_newAudioComposeQueue"));
        addConfig("ve_use_task_api", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_use_task_api"));
        addConfig("ve_fix_record_bgm_loop", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_record_bgm_loop"));
        addConfig("ve_enable_record_bgm_loop_max_duration", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable record bgm loop maxduration"));
        addConfig("ve_skip_record_end_key_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Force key frame after skip record end"));
        addConfig("ve_enable_recorder_render_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable ve recorder render unit optimization"));
        addConfig("ve_delay_jni", new ValuePkt(dataType2, bool, enumC1284870jXZ, " delay some native registrations in JNI_OnLoad"));
        addConfig("ve_enable_resize_on_oneside", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable resize on oneside"));
        addConfig("ve_enable_use_optimize_image", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_use_optimize_image"));
        addConfig("ve_enable_optimize_dynamic_render", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable optimize dynamic render"));
        addConfig("ve_remove_audioMixerUtils", new ValuePkt(dataType2, bool, enumC1284870jXZ, "New functionality to replace AudioMixerUtils"));
        addConfig("ve_enable_camera_focus_mode_fps", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable camera focus mode fps"));
        addConfig("ve_fix_double_compiler_crash", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_fix_double_compiler_crash"));
        addConfig("ve_enable_optimize_dynamic_render", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable optimize dynamic render"));
        addConfig("veabtest_enable_remove_effect_deprecatingAPI", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable effectsdk deprecating api removal"));
        addConfig("ve_camera_fps_op", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Adjust camera fps under low light condition."));
        addConfig("ve_restore_camera_fps_under_better_lighting", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Restore camera fps range(from low light selection) when user is under better lighting condition."));
        addConfig("ve_low_light_camera_fps_lower_threshold", new ValuePkt(dataType3, 10, enumC1284870jXZ, "Lower fps threshold to trigger camera fps change. Goal is to avoid fps change for too low fps."));
        addConfig("ve_low_light_camera_fps_lower_bound_min", new ValuePkt(dataType3, 15, enumC1284870jXZ, "Min value(inclusive) to select low light fps range lower bound."));
        addConfig("ve_low_light_camera_fps_lower_bound_max", new ValuePkt(dataType3, 20, enumC1284870jXZ, "Max value(inclusive) to select low light fps range lower bound."));
        addConfig("ve_fix_camera_set_capture_mode_order", new ValuePkt(dataType2, bool, enumC1284870jXZ, "Fix mPhotoMode assignment order in TECameraServer.setCaptureMode."));
        addConfig("ve_fix_bigSize_highFps_video_read", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_fix_bigSize_highFps_video_read"));
        addConfig("ve_enable_swing_refactor_set_param", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable swing refactor set param"));
        addConfig("ve_enable_rebuild_engine_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable rebuild engine opt"));
        addConfig("ve_fix_cleanbundle_in_audio_compile_graph", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_cleanbundle_in_audio_compile_graph"));
        addConfig("ve_fixup_seek_ep_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fixup_seek_ep_opt"));
        addConfig("ve_reuse_reader_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable reuse reader opt"));
        addConfig("ve_fake_camera_sequence", new ValuePkt(dataType, "", enumC1284870jXZ, "ve fake camera image sequence"));
        addConfig("ve_reverse_opt_hw_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "reverse hardware encode first optimization"));
        addConfig("ve_reverse_opt_sw_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "reverse software encode parameters optimization"));
        addConfig("ve_reverse_opt_storage", new ValuePkt(dataType2, bool, enumC1284870jXZ, "reverse storage optimization"));
        addConfig("ve_play_range_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "opt play range [after speed] by void restarting engine"));
        addConfig("ve_mediainfo_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable mediainfo opt"));
        addConfig("ve_ep_reverse_opt_sw_encode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ep reverse software encode parameters optimization"));
        addConfig("ve_enable_camera_gf", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable camera GF"));
        addConfig("ve_enable_camera_gf_effect_graph", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable camera GF effect graph"));
        addConfig("ve_camera_gf_effect_graph_thread_setting", new ValuePkt(dataType3, 1, enumC1284870jXZ, "camera GF effect graph thread setting. See enum EffectGraphSetting"));
        addConfig("ve_fix_camera_preview_first_frame_callback", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix first frame callback timing after updating frame size or camera facing"));
        addConfig("ve_opt_gf_destroy_thread", new ValuePkt(dataType3, -20, enumC1284870jXZ, "camera GF effect graph destroy thread nice value (-20=original, 0=normal, 19=lowest priority)"));
        addConfig("ve_opt_gf_scale_in_ve_thread", new ValuePkt(dataType2, bool, enumC1284870jXZ, "camera GF effect graph scale in ve thread before effect graph preExecute"));
        addConfig("ve_opt_gf_source_node_lockfree", new ValuePkt(dataType2, bool, enumC1284870jXZ, "camera GF SourceNode uses a lock-free fixed-capacity slot pool instead of mutex+map for per-frame ticket handoff"));
        addConfig("ve_enable_camera_render_independent_thread_gf", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable camera render independent thread GF"));
        addConfig("ve_enable_frame_perf_tracker", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable per-frame stage perf tracker for GF preview"));
        addConfig("ve_frame_perf_tracker_startup_ms", new ValuePkt(dataType3, Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE), enumC1284870jXZ, "startup window ms for frame perf tracker phase classification"));
        addConfig("ve_frame_perf_tracker_report_mode", new ValuePkt(dataType3, 0, enumC1284870jXZ, "frame perf tracker report mode: 0=none, 1=avg only, 2=max only, 3=both"));
        addConfig("ve_enable_async_set_android_surface", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable async setSurface to fix android hang"));
        addConfig("ve_enable_graph_tracer", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable new performance tracer"));
        addConfig("ve_enable_reader_frame_taking_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_enable_reader_frame_taking_opt"));
        addConfig("ve_fix_editing_reader_taking_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_editing_reader_taking_frame"));
        addConfig("ve_taking_min_frame_for_playback", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_taking_min_frame_for_playback"));
        addConfig("ve_perf_editing_preview_opt", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_perf_editing_preview_opt"));
        addConfig("ve_fix_gpu_resource_leak", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_gpu_resource_leak"));
        addConfig("ve_fix_decode_type_android_for_test", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_fix_decode_type_android_for_test"));
        addConfig("ve_cached_pipeline", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_cached_pipeline"));
        addConfig("ve_audio_analyse_metric", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable audio analyse"));
        addConfig("ve_fix_audio_play_crash", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix audio play unit crash"));
        addConfig("ve_fix_audio_decode_thread_cleanup", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio decode thread cleanup fix"));
        addConfig("ve_fix_audio_ag_effect_output_clip", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix audio ag effect output clip"));
        addConfig("ve_fix_sticker_diff_sticker_tag", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix set sticker crash"));
        addConfig("ve_fix_seek_with_frame_hdr2sdr", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix seekwithframe hdr2sdr"));
        addConfig("ve_skip_clean_mediainfo_cache_after_compile", new ValuePkt(dataType2, bool, enumC1284870jXZ, "skip clean mediainfo cache after compile"));
        addConfig("ve_fix_pin_timeout_error", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix pin timeout error"));
        addConfig("ve_fix_continue_audio_split", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix continue audio split"));
        addConfig("ve_fix_continue_audio_split_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix continue audio split opt"));
        addConfig("ve_try_fix_crash_when_close_and_switch_flash_mode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "try fix crash when close and switch flash mode"));
        addConfig("ve_fix_audio_high_frequency", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix audio high frequency cut off"));
        addConfig("ve_optimize_custom_matting", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable optimize custom matting"));
        addConfig("ve_read_specific_stream_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve read specific stream opt"));
        addConfig("ve_enable_audio_remux", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable audio remux"));
        addConfig("ve_enable_audio_remux_use_demuxbin", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_audio_remux_use_demuxbin"));
        addConfig("ve_fix_audio_remux", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix audio remux"));
        addConfig("ve_enable_canvas_optimize", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_canvas_optimize"));
        addConfig("ve_enable_canvas_optimize_v2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_canvas_optimize_v2"));
        addConfig("ve_enable_canvas_optimize_photo", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_canvas_optimize_photo"));
        addConfig("ve_enable_canvas_ignore_size", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_canvas_ignore_size"));
        addConfig("ve_enable_canvas_effect_skip_first_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_canvas_effect_skip_first_frame"));
        addConfig("ve_enable_decode_encode_fence", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable decode encode fence"));
        addConfig("ve_applog_only_report_bussiness", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve applog only report bussiness"));
        addConfig("ve_dynamic_resolution_enable_downgrade_drop_fps_threshold", new ValuePkt(dataType4, Float.valueOf(5.0f), enumC1284870jXZ, "dynamic resolution enable downgrade drop_fps threshold"));
        addConfig("ve_dynamic_resolution_restore_downgrade_drop_fps_threshold", new ValuePkt(dataType4, Float.valueOf(0.5f), enumC1284870jXZ, "dynamic resolution restore downgrade drop_fps threshold"));
        addConfig("ve_fix_image_file_exist", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix image file exist issue"));
        addConfig("ve_enable_solidify_camera_user_config", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable solidify camera user config"));
        addConfig("ve_fix_refreshCurrentFrame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix refreshCurrentFrame without last pipeline"));
        addConfig("ve_enable_media_info_log", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable media info log"));
        addConfig("ve_enable_send_render_info_to_effect", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable send render info to effect."));
        addConfig("ve_fix_network_callback_weakptr", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_network_callback_weakptr"));
        addConfig("ve_fix_streaming_music_stuck_v2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix streaming music stuck v2"));
        addConfig("ve_fix_streaming_thread_create_crash", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_streaming_thread_create_crash"));
        addConfig("ve_set_ttnet_buffer_size", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_set_ttnet_buffer_size"));
        addConfig("ve_enable_streaming_params_isolation", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_streaming_params_isolation"));
        addConfig("ve_enable_streaming_priority_scheduler", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_streaming_priority_scheduler"));
        addConfig("ve_enable_media_check_per_url_resort", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_media_check_per_url_resort"));
        addConfig("ve_enable_streaming_request_quota", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_streaming_request_quota"));
        addConfig("ve_enable_streaming_url_failover", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_streaming_url_failover"));
        addConfig("ve_streaming_failover_threshold", new ValuePkt(dataType3, 1, enumC1284870jXZ, "ve_streaming_failover_threshold"));
        addConfig("ve_enable_driver_request_priority", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_driver_request_priority"));
        addConfig("ve_streaming_read_early_exit", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_streaming_read_early_exit"));
        addConfig("ve_streaming_save_by_rename", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_streaming_save_by_rename"));
        addConfig("ve_streaming_incremental_meta", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_streaming_incremental_meta"));
        addConfig("ve_driver_small_request_window", new ValuePkt(dataType3, 262144, enumC1284870jXZ, "ve_driver_small_request_window"));
        addConfig("ve_driver_read_demand_max_window", new ValuePkt(dataType3, 1048576, enumC1284870jXZ, "ve_driver_read_demand_max_window"));
        addConfig("ve_driver_probe_request_window", new ValuePkt(dataType3, 1048576, enumC1284870jXZ, "ve_driver_probe_request_window"));
        addConfig("ve_driver_rangeseek_request_window", new ValuePkt(dataType3, 1048576, enumC1284870jXZ, "ve_driver_rangeseek_request_window"));
        addConfig("ve_driver_datafill_min_window", new ValuePkt(dataType3, 1048576, enumC1284870jXZ, "ve_driver_datafill_min_window"));
        addConfig("ve_driver_datafill_max_window", new ValuePkt(dataType3, 10485760, enumC1284870jXZ, "ve_driver_datafill_max_window"));
        addConfig("ve_driver_ttnet_request_type_boost", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_driver_ttnet_request_type_boost"));
        addConfig("ve_driver_header_region_init_size", new ValuePkt(dataType3, 1048576, enumC1284870jXZ, "ve_driver_header_region_init_size"));
        addConfig("ve_driver_mp3_header_precise_parse", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_driver_mp3_header_precise_parse"));
        addConfig("ve_driver_mp3_vbr_probe_size", new ValuePkt(dataType3, 524288, enumC1284870jXZ, "ve_driver_mp3_vbr_probe_size"));
        addConfig("ve_enable_streaming_budget_adapt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_enable_streaming_budget_adapt"));
        addConfig("ve_streaming_budget_offset_max_ratio", new ValuePkt(dataType4, fValueOf, enumC1284870jXZ, "ve_streaming_budget_offset_max_ratio"));
        addConfig("ve_streaming_budget_eval_interval_min_us", new ValuePkt(dataType3, 500000, enumC1284870jXZ, "ve_streaming_budget_eval_interval_min_us"));
        addConfig("ve_streaming_budget_eval_interval_max_us", new ValuePkt(dataType3, 30000000, enumC1284870jXZ, "ve_streaming_budget_eval_interval_max_us"));
        addConfig("ve_streaming_budget_eval_ema_alpha_q10", new ValuePkt(dataType3, 3, enumC1284870jXZ, "ve_streaming_budget_eval_ema_alpha_q10"));
        addConfig("ve_streaming_budget_eval_adaptive_watchdog", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_streaming_budget_eval_adaptive_watchdog"));
        addConfig("ve_streaming_media_check_concurrency", new ValuePkt(dataType3, 1, enumC1284870jXZ, "ve_streaming_media_check_concurrency"));
        addConfig("ve_streaming_pause_strategy", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve_streaming_pause_strategy"));
        addConfig("ve_fix_streaming_finished_io_out_of_lock", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_streaming_finished_io_out_of_lock"));
        addConfig("ve_seekdone_and_render_callback_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve seekdone and render callback opt"));
        addConfig("ve_enable_callback_stuck_message", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve enable callback stuck message"));
        addConfig("editing_setdatasource_opt", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve setdatasource opt"));
        addConfig("editing_setdatasource_opt_fix", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix error in editing setdatasource opt"));
        addConfig("editing_setdatasource_opt_fix2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "gate VEConfigID_UseImageAllocator off in setdatasource opt path"));
        addConfig("editing_setdatasource_opt_skip_multi_photo", new ValuePkt(dataType2, bool, enumC1284870jXZ, "editing setdatasource opt skipmulti photo"));
        addConfig("setdatasource_opt_ignore_editormode", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve setDataSource opt ignore editormode"));
        addConfig("ve_media_check_time_out", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve media check time out"));
        addConfig("ve_media_check_max_retry", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve media check max retry"));
        addConfig("ve_enable_effect_msg_run_in_gl", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable effect msg run in GL"));
        addConfig("ve_enable_recorder_destructor_sync", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable recorder destructor sync"));
        addConfig("ve_streaming_connect_time_out", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve streaming connect time out"));
        addConfig("ve_ffmpeg_interrupt_time_out", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve ffmpeg interrupt time out"));
        addConfig("ve_streaming_read_time_out", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve streaming read time out"));
        addConfig("ve_streaming_handle_cache_read_failure", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "control whether HttpFileDriver handles streaming cache read failures"));
        addConfig("ve_streaming_cond_var_wait", new ValuePkt(dataType2, bool, enumC1284870jXZ, "replace busy-wait sleep_for with condition_variable wait_for in HttpFileDriver"));
        addConfig("ve_streaming_cond_var_wait_timeout_us", new ValuePkt(dataType3, 100, enumC1284870jXZ, "condition_variable wait_for timeout in HttpFileDriver (us)"));
        addConfig("ve_start_with_params_timeout", new ValuePkt(dataType3, -1, enumC1284870jXZ, "ve_start_with_params_timeout"));
        addConfig("ve_enable_bmf_color_correction", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable bmf color correction"));
        addConfig("ve_enable_watermark_bundle_removal", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable watermark bundle removal"));
        addConfig("ve_enable_streaming_log", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve enable streaming log"));
        addConfig("ve_media_check_timeout_mode", new ValuePkt(dataType3, 0, enumC1284870jXZ, "ve media check timeout mode"));
        addConfig("ve_fix_recorder_bgm_loop_phase2", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix recorder bgm loop phase2"));
        addConfig("ve_fix_set_safe_area", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_set_safe_area"));
        addConfig("ve_fix_audio_track_crash", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve fix audio track crash"));
        addConfig("ve_enable_audio_strategies", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable audio strategies"));
        addConfig("ve_enable_invalid_param_monitor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable invalid param monitor"));
        addConfig("ve_record_gl_fence_type", new ValuePkt(dataType3, 0, enumC1284870jXZ, "record GPU SyncObject type: 0-glFence; 1-eglFence; 2-glFinish"));
        addConfig("ve_opt_gf_egl_fence", new ValuePkt(dataType2, bool, enumC1284870jXZ, "use EGL fence for GF input texture cross-thread sync (guards glWaitSync crash fix on MediaTek/PowerVR)"));
        addConfig("mock_effect_graph_gl_context_failure_for_test", new ValuePkt(dataType2, bool, enumC1284870jXZ, "mock EffectGraph shared GL context creation failure for test"));
        addConfig("ve_fix_multi_thread_access", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "ve_fix_multi_thread_access"));
        addConfig("ve_camera_source_cache_count", new ValuePkt(dataType3, 1, enumC1284870jXZ, "camera_source_cache_count"));
        addConfig("ve_enable_camera_source_nonblock_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "camera source non-block frame opt"));
        addConfig("ve_camera_cache_policy", new ValuePkt(dataType3, 0, enumC1284870jXZ, "camera cache policy: 0-replace; 1-drop alternate"));
        addConfig("ve_voice_beauty_params", new ValuePkt(dataType, "", enumC1284870jXZ, "ve voice beauty params"));
        addConfig("ve_streaming_sampling_rate", new ValuePkt(dataType4, Float.valueOf(0.001f), enumC1284870jXZ, "ve_streaming_sampling_rate"));
        addConfig("ve_fix_gf_preview_fps", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "fix gf preview fps"));
        addConfig("ve_fix_gf_recorder_preview_fps", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "fix gf recorder preview fps"));
        addConfig("ve_audio_ambient_detect_interval", new ValuePkt(dataType3, 500, enumC1284870jXZ, "ambient loudness detect interval"));
        addConfig("ve_enable_audio_bsr", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable audio bsr"));
        addConfig("ve_fix_video_processor_msg_lost", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix video processor msg lost"));
        addConfig("ve_fix_gf_controller_video_stop", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf controller video stop"));
        addConfig("ve_fix_gf_controller_audio_stop", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf controller audio stop"));
        addConfig("ve_enable_effect_video_player", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable effect video Player"));
        addConfig("ve_compile_stuck_local_test", new ValuePkt(dataType, "", enumC1284870jXZ, "ve_compile_stuck_local_test"));
        addConfig("ve_add_effect_impl_guard", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable effectImpl guard in EFFECTWRAPPER_HANDLER"));
        addConfig("ve_enable_gf_global_gl_queue", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable gf global gl queue"));
        addConfig("ve_fix_gf_audio_decode_crash", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf audio decode crash"));
        addConfig("ve_enable_gf_make_current", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable gf make current"));
        addConfig("ve_fix_gbu_graph_media_context", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gbu recorder graph media context"));
        addConfig("ve_fix_camera_source_destroy", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix camera source destroy"));
        addConfig("veabtest_enable_text_template_optimization", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable text template optimization"));
        addConfig("ve_fix_camera_source_discard", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix camera source discard"));
        addConfig("ve_fix_gf_screenshot_with_rendered_frame", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf screenshot with rendered frame"));
        addConfig("ve_fix_gf_driver_stop_race_condition", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf driver stop race condition"));
        addConfig("ve_fix_gf_output_ticket_discard", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix gf output ticket discard"));
        addConfig("ve_enable_enigma_output_refactor", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable enigma output refactor"));
        addConfig("ve_enable_enigma_scan_output_independent_thread", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable enigma scan output independent thread"));
        addConfig("ve_fix_streaming_media_check_contract", new ValuePkt(dataType2, bool, enumC1284870jXZ, "ve_fix_streaming_media_check_contract"));
        addConfig("ve_fix_screenshot_no_queue", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix screenshot no queue"));
        addConfig("ve_fix_gf_stop_preview_record_race", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable gf driver stop race condition"));
        addConfig("ve_enable_lazy_jni_load", new ValuePkt(dataType2, bool, enumC1284870jXZ, "enable lazy jni load for codec and veimage modules"));
        addConfig("ve_enable_texture_pool_refactor", new ValuePkt(dataType3, 0, enumC1284870jXZ, "enable texture pool refactor"));
        addConfig("ve_global_texture_pool_size", new ValuePkt(dataType3, 90, enumC1284870jXZ, "global texture pool size for frame buffer cache manager"));
        addConfig("ve_fix_avcodec_open_thread_lock", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix avcodec_open2 crash caused by concurrent thread access without lock manager"));
        addConfig("ve_fix_v2_hw_encode_fail_callback", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix v2 recorder dropping TE_MSG_RECORD_HW_ENCODE_FAIL by aligning msg.what with V1"));
        addConfig("ve_enable_log_limit_every_log", new ValuePkt(dataType2, bool2, enumC1284870jXZ, "enable IESMMLog*Every rate-limited logs; false means skip these logs before entering limiter core"));
        addConfig("ve_fix_adjacent_non_tc_tc_transition", new ValuePkt(dataType2, bool, enumC1284870jXZ, "fix adjacent non-TimeChange overlap and TimeChange overlap transition timeline gap"));
        initByteBench();
        if (mIsLocalTest || !mEnableReadFromABManager) {
            addConfigsFromEffect();
            addConfigsFromCamera();
            mAbJson = null;
            mAbset = null;
            mIsConfigCenterInitialized = true;
        }
    }

    public static boolean isConfigCenterInitialized() {
        return mIsConfigCenterInitialized;
    }

    public Map<String, ValuePkt> getConfigs() {
        return this.sConfigs;
    }

    public enum DataType {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        public static DataType valueOf(String str) {
            return (DataType) C08FF.LIZ(DataType.class, str);
        }
    }

    private int importFromJson(String str) {
        try {
            new JSONArray(str);
            this.sConfigs.clear();
            return 0;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static void setEnablePreloadSo(boolean z) {
        enablePreloadSo = z;
    }

    public static void setEnableReadABFromABManager(boolean z) {
        mEnableReadFromABManager = z;
    }

    public static void setEnableReadABFromJava(boolean z) {
        mEnableReadFromVEJava = z;
    }

    public static void setExcludedEffectLicenses(Set<String> set) {
        sExcludedEffectLicenses = set;
    }

    public static void setIsLocalTest(boolean z) {
        mIsLocalTest = z;
        VEGetABManager.setLocalTest(z);
    }

    public ValuePkt getValue(String str) {
        C09GA c09gaLIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            int i = C2208811Bcd.LIZ[valuePkt.dataType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return new ValuePkt(DataType.BOOLEAN, Integer.valueOf(getValue(str, 0)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                            }
                            return valuePkt;
                        }
                        return new ValuePkt(DataType.BOOLEAN, Long.valueOf(getValue(str, 0)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                    }
                    return new ValuePkt(DataType.BOOLEAN, Float.valueOf(getValue(str, 0.0f)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                }
                return new ValuePkt(DataType.BOOLEAN, getValue(str, ""), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
            }
            return new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(getValue(str, false).booleanValue()), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
        }
        return valuePkt;
    }

    public ValuePkt getValueNotNeedByteBench(String str) {
        return this.sConfigs.get(str);
    }

    public Object removeConfig(String str) {
        return this.sConfigs.remove(str);
    }

    public void updateConfigToNative(String str) {
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (valuePkt == null) {
            return;
        }
        TEConfigCenter.LIZIZ(str, valuePkt);
    }

    private void updateEffectConfig(String str, ValuePkt valuePkt) {
        if (valuePkt.getABType() != EnumC1284080jWI.FOREFFECT) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.vesdk.runtime.VEEffectConfig").getDeclaredMethod("setABConfigValue", String.class, Object.class, Integer.TYPE);
            int i = C2208811Bcd.LIZ[valuePkt.getDataType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            return;
                        }
                        declaredMethod.invoke(null, str, valuePkt.getValue(), 1);
                        return;
                    }
                    declaredMethod.invoke(null, str, valuePkt.getValue(), 2);
                    return;
                }
                declaredMethod.invoke(null, str, valuePkt.getValue(), 3);
                return;
            }
            declaredMethod.invoke(null, str, valuePkt.getValue(), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public int addConfig(String str, ValuePkt valuePkt) {
        Set<String> set;
        n nVar;
        if (this.sConfigs.containsKey(str)) {
            return -100;
        }
        if (mEnableReadFromVEJava && (nVar = mAbJson) != null && !nVar.LJJIJIIJIL(str)) {
            return -100;
        }
        if (mEnableReadFromVEJava && (set = mAbset) != null && !set.contains(str)) {
            return -100;
        }
        setValue(str, valuePkt);
        return 0;
    }

    public Boolean getValue(String str, boolean z) {
        C09GA c09gaLIZ;
        boolean zBooleanValue;
        C09GA c09gaLIZ2;
        ValuePkt valuePkt;
        if (mEnableReadFromABManager) {
            ValuePkt valuePkt2 = this.sConfigs.get(str);
            if (valuePkt2 != null && valuePkt2.getValue() != null) {
                zBooleanValue = ((Boolean) valuePkt2.getValue()).booleanValue();
            } else {
                zBooleanValue = z;
            }
            if (!mIsLocalTest && (valuePkt = this.sCahceConfigs.get(str)) != null && valuePkt.getValue() != null) {
                return (Boolean) valuePkt.getValue();
            }
            if (enableByteBench() && (c09gaLIZ2 = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ2.LIZ(str)) {
                boolean zLJFF = c09gaLIZ2.LJFF(str, z);
                this.sCahceConfigs.put(str, new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(zLJFF), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
                return Boolean.valueOf(zLJFF);
            }
            boolean booleanValue = VEGetABManager.getBooleanValue(str, zBooleanValue, false);
            this.sCahceConfigs.put(str, new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(booleanValue), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
            return Boolean.valueOf(booleanValue);
        }
        ValuePkt valuePkt3 = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            return Boolean.valueOf(c09gaLIZ.LJFF(str, z));
        }
        if (valuePkt3 != null && valuePkt3.getValue() != null) {
            return (Boolean) valuePkt3.getValue();
        }
        return Boolean.valueOf(z);
    }

    public ValuePkt setValue(String str, ValuePkt valuePkt) {
        ValuePkt valuePktPut = this.sConfigs.put(str, valuePkt);
        if (valuePkt.abType == EnumC1284080jWI.FOREFFECT && str.equals("enable_jnionload_pthreadonce")) {
            try {
                Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("enableJniOnloadThreadOnce", Boolean.TYPE).invoke(null, valuePkt.getValue());
                return valuePktPut;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return valuePktPut;
    }

    public Object updateValue(String str, Object obj) {
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (valuePkt == null) {
            return null;
        }
        Object obj2 = valuePkt.value;
        valuePkt.updateValue(obj);
        if (valuePkt.abType == EnumC1284080jWI.FOREFFECT && str.equals("enable_jnionload_pthreadonce")) {
            try {
                Class.forName("com.bef.effectsdk.EffectABConfig").getDeclaredMethod("enableJniOnloadThreadOnce", Boolean.TYPE).invoke(null, obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!obj2.equals(valuePkt.value)) {
            this.sModifiedConfigs.put(str, valuePkt);
        }
        return obj2;
    }

    public float getValue(String str, float f) {
        C09GA c09gaLIZ;
        float fFloatValue;
        C09GA c09gaLIZ2;
        ValuePkt valuePkt;
        if (mEnableReadFromABManager) {
            ValuePkt valuePkt2 = this.sConfigs.get(str);
            if (valuePkt2 != null && valuePkt2.getValue() != null) {
                fFloatValue = ((Float) valuePkt2.getValue()).floatValue();
            } else {
                fFloatValue = f;
            }
            if (!mIsLocalTest && (valuePkt = this.sCahceConfigs.get(str)) != null && valuePkt.getValue() != null) {
                return ((Float) valuePkt.getValue()).floatValue();
            }
            if (enableByteBench() && (c09gaLIZ2 = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ2.LIZ(str)) {
                float fLIZIZ = c09gaLIZ2.LIZIZ(f, str);
                this.sCahceConfigs.put(str, new ValuePkt(DataType.FLOAT, Float.valueOf(fLIZIZ), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
                return fLIZIZ;
            }
            float floatValue = VEGetABManager.getFloatValue(str, fFloatValue, false);
            this.sCahceConfigs.put(str, new ValuePkt(DataType.FLOAT, Float.valueOf(floatValue), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
            return floatValue;
        }
        ValuePkt valuePkt3 = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            return c09gaLIZ.LIZIZ(f, str);
        }
        if (valuePkt3 != null && valuePkt3.getValue() != null) {
            return ((Float) valuePkt3.getValue()).floatValue();
        }
        return f;
    }

    public int getValue(String str, int i) {
        C09GA c09gaLIZ;
        int iIntValue;
        C09GA c09gaLIZ2;
        ValuePkt valuePkt;
        if (mEnableReadFromABManager) {
            ValuePkt valuePkt2 = this.sConfigs.get(str);
            if (valuePkt2 != null && valuePkt2.getValue() != null) {
                iIntValue = ((Integer) valuePkt2.getValue()).intValue();
            } else {
                iIntValue = i;
            }
            if (!mIsLocalTest && (valuePkt = this.sCahceConfigs.get(str)) != null && valuePkt.getValue() != null) {
                return ((Integer) valuePkt.getValue()).intValue();
            }
            if (enableByteBench() && (c09gaLIZ2 = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ2.LIZ(str)) {
                int iLJIIL = c09gaLIZ2.LJIIL(i, str);
                this.sCahceConfigs.put(str, new ValuePkt(DataType.INTEGER, Integer.valueOf(iLJIIL), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
                return iLJIIL;
            }
            int intValue = VEGetABManager.getIntValue(str, iIntValue, false);
            this.sCahceConfigs.put(str, new ValuePkt(DataType.INTEGER, Integer.valueOf(intValue), EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
            return intValue;
        }
        ValuePkt valuePkt3 = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            return c09gaLIZ.LJIIL(i, str);
        }
        if (valuePkt3 != null && valuePkt3.getValue() != null) {
            return ((Integer) valuePkt3.getValue()).intValue();
        }
        return i;
    }

    public String getValue(String str, String str2) {
        C09GA c09gaLIZ;
        String str3;
        C09GA c09gaLIZ2;
        ValuePkt valuePkt;
        if (mEnableReadFromABManager) {
            ValuePkt valuePkt2 = this.sConfigs.get(str);
            if (valuePkt2 != null && valuePkt2.getValue() != null) {
                str3 = (String) valuePkt2.getValue();
            } else {
                str3 = str2;
            }
            if (!mIsLocalTest && (valuePkt = this.sCahceConfigs.get(str)) != null && valuePkt.getValue() != null) {
                return (String) valuePkt.getValue();
            }
            if (enableByteBench() && (c09gaLIZ2 = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ2.LIZ(str)) {
                String strLJIIIIZZ = c09gaLIZ2.LJIIIIZZ(str, str2);
                this.sCahceConfigs.put(str, new ValuePkt(DataType.STRING, strLJIIIIZZ, EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
                return strLJIIIIZZ;
            }
            String stringValue = VEGetABManager.getStringValue(str, str3, false);
            this.sCahceConfigs.put(str, new ValuePkt(DataType.STRING, stringValue, EnumC1284870jXZ.CONFIG_TYPE_AB, ""));
            return stringValue;
        }
        ValuePkt valuePkt3 = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            return c09gaLIZ.LJIIIIZZ(str, str2);
        }
        if (valuePkt3 != null && valuePkt3.getValue() != null) {
            return (String) valuePkt3.getValue();
        }
        return str2;
    }

    public long getValue(String str, long j) {
        C09GA c09gaLIZ;
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            return c09gaLIZ.LJIILIIL(j, str);
        }
        if (valuePkt != null && valuePkt.getValue() != null) {
            return ((Long) valuePkt.getValue()).longValue();
        }
        return j;
    }

    private void batchUpdateEffectConfig(String[] strArr, Object[] objArr, int[] iArr) {
        if (strArr != null && objArr != null && iArr != null && strArr.length == objArr.length && strArr.length == iArr.length) {
            VEEffectConfig.batchSetABConfigValue(strArr, objArr, iArr);
        }
    }

    public ValuePkt getValue(String str, DataType dataType, Object obj) {
        C09GA c09gaLIZ;
        if (mEnableReadFromABManager) {
            int i = C2208811Bcd.LIZ[dataType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return new ValuePkt(DataType.INTEGER, Integer.valueOf(getValue(str, ((Integer) obj).intValue())), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                        }
                        return new ValuePkt(DataType.LONG, Long.valueOf(getValue(str, ((Long) obj).longValue())), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                    }
                    return new ValuePkt(DataType.FLOAT, Float.valueOf(getValue(str, ((Float) obj).floatValue())), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                }
                return new ValuePkt(DataType.STRING, getValue(str, (String) obj), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
            }
            return new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(getValue(str, ((Boolean) obj).booleanValue()).booleanValue()), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
        }
        ValuePkt valuePkt = this.sConfigs.get(str);
        if (((Boolean) this.sConfigs.get("ve_enable_bytebench").getValue()).booleanValue() && (c09gaLIZ = C212350188e.LIZJ().LIZ()) != null && c09gaLIZ.LIZ(str)) {
            int i2 = C2208811Bcd.LIZ[valuePkt.dataType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return new ValuePkt(DataType.BOOLEAN, Integer.valueOf(getValue(str, 0)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                            }
                            return valuePkt;
                        }
                        return new ValuePkt(DataType.BOOLEAN, Long.valueOf(getValue(str, 0)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                    }
                    return new ValuePkt(DataType.BOOLEAN, Float.valueOf(getValue(str, 0.0f)), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
                }
                return new ValuePkt(DataType.BOOLEAN, getValue(str, ""), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
            }
            return new ValuePkt(DataType.BOOLEAN, Boolean.valueOf(getValue(str, false).booleanValue()), EnumC1284870jXZ.CONFIG_TYPE_AB, "");
        }
        return valuePkt;
    }
}
