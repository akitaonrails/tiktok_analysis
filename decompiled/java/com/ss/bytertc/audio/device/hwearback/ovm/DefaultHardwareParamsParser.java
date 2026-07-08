package com.ss.bytertc.audio.device.hwearback.ovm;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.base.ManufacturerChecker;
import com.ss.bytertc.audio.device.hwearback.ovm.HardwareEarbackParams;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class DefaultHardwareParamsParser implements IHardwareParamsParser {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int parseFlags(String str) {
        int i = 0;
        for (String str2 : str.split("\\|")) {
            str2.getClass();
            switch (str2.hashCode()) {
                case -1849380614:
                    if (!str2.equals("AUDIO_OUTPUT_FLAG_FAST")) {
                    }
                    break;
                case -1126076303:
                    if (str2.equals("AUDIO_INPUT_FLAG_FAST")) {
                        i |= 1;
                    } else {
                        continue;
                    }
                    break;
                case -313407739:
                    if (!str2.equals("AUDIO_INPUT_FLAG_ROW")) {
                    }
                    break;
                case -311213931:
                    if (str2.equals("AUDIO_OUTPUT_FLAG_DEEP_BUFFER")) {
                        i |= 8;
                    } else {
                        continue;
                    }
                    break;
                default:
                    break;
            }
            i |= 4;
        }
        return i;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.ovm.IHardwareParamsParser
    public HardwareEarbackParams parse(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            HardwareEarbackParams hardwareEarbackParams = new HardwareEarbackParams();
            hardwareEarbackParams.playParamsList = new ArrayList();
            hardwareEarbackParams.recordParamsList = new ArrayList();
            if (jSONObject.has("audioTrackParam")) {
                try {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "audioTrackParam");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        HardwareEarbackParams.Play play = new HardwareEarbackParams.Play();
                        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i2);
                        String string = JSONObjectProtectorUtils.getString(jSONObject2, "streamType");
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "sampleRate");
                        String string3 = JSONObjectProtectorUtils.getString(jSONObject2, "format");
                        String string4 = JSONObjectProtectorUtils.getString(jSONObject2, "flag");
                        play.streamType = parseInt(string, 3);
                        play.sampleRate = parseInt(string2, 48000);
                        play.format = parseInt(string3, 2);
                        play.version = 0;
                        if (string4.contains("|")) {
                            play.flags = parseFlags(string4);
                            play.version = 1;
                        } else if (string4.startsWith("0x")) {
                            play.flags = CastIntegerProtector.parseInt(string4.substring(2), 16);
                        } else {
                            play.flags = parseInt(string4, -1);
                        }
                        hardwareEarbackParams.playParamsList.add(play);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (jSONObject.has("audioRecordParam")) {
                try {
                    JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "audioRecordParam");
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        HardwareEarbackParams.Record record = new HardwareEarbackParams.Record();
                        JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray2, i3);
                        String string5 = JSONObjectProtectorUtils.getString(jSONObject3, "sampleRate");
                        String string6 = JSONObjectProtectorUtils.getString(jSONObject3, "format");
                        String string7 = JSONObjectProtectorUtils.getString(jSONObject3, "flag");
                        String string8 = JSONObjectProtectorUtils.getString(jSONObject3, "source");
                        record.sampleRate = parseInt(string5, 48000);
                        record.format = parseInt(string6, 2);
                        record.version = 0;
                        if (string7.contains("|")) {
                            record.flags = parseFlags(string7);
                            record.version = 1;
                            i = 0;
                        } else {
                            if (string7.startsWith("0x")) {
                                record.flags = CastIntegerProtector.parseInt(string7.substring(2), 16);
                            } else if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP && "8".equals(string7)) {
                                record.flags = -1;
                            } else {
                                record.flags = parseInt(string7, -1);
                            }
                            i = 0;
                        }
                        record.source = parseInt(string8, i);
                        hardwareEarbackParams.recordParamsList.add(record);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            return hardwareEarbackParams;
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    private int parseInt(String str, int i) {
        if (str.equals("default")) {
            return i;
        }
        return CastIntegerProtector.parseInt(str);
    }
}
