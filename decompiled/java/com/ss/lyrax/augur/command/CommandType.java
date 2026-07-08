package com.ss.lyrax.augur.command;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum CommandType {
    UPDATE_STREAMHD_PARAMS("updateStreamHDParams"),
    UPDATE_DENOISE_PARAMS("updateDenoiseParams"),
    UPDATE_FPS_RESOLUTION("updateFPSAndResolution"),
    EFFECT_MODEL(AugurCommandConstant.COMMAND_UPDATE_EFFECT_MODEL),
    EFFECT_RESOURCE(AugurCommandConstant.COMMAND_UPDATE_EFFECT_RESOURCE),
    EFFECT_STRATEGY("updateEffectStrategy"),
    REPORT_TRACE("reportTrace"),
    SIMULCAST("updateSimulcast"),
    GPU_TURBO("updateEffectGPUTurbo"),
    SUBSCRIBE_SIMULCAST("subscribeRemoteStream"),
    SHOW_TOAST("showToast"),
    UPDATE_GAME_FPS_RESOLUTION("updateGameFPSAndResolution"),
    UPDATE_LINKMIC_VIDEO_PARAMS("updatelinkMicVideoParams"),
    UPDATE_LINKMIC_PERFORMANCE_PARAMS("updatelinkMicPerformanceParams");

    public String name;

    public String getCommandName() {
        return this.name;
    }

    public static CommandType fromGameString(String str) {
        str.getClass();
        if (!str.equals("updateFPSAndResolution")) {
            return null;
        }
        return UPDATE_GAME_FPS_RESOLUTION;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static CommandType fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1913642710:
                if (!str.equals("showToast")) {
                    return null;
                }
                return SHOW_TOAST;
            case -1512638000:
                if (!str.equals("subscribeRemoteStream")) {
                    return null;
                }
                return SUBSCRIBE_SIMULCAST;
            case -1470754483:
                if (!str.equals("updateEffectStrategy")) {
                    return null;
                }
                return EFFECT_STRATEGY;
            case -775774428:
                if (!str.equals("updateSimulcast")) {
                    return null;
                }
                return SIMULCAST;
            case -677019061:
                if (!str.equals("updateStreamHDParams")) {
                    return null;
                }
                return UPDATE_STREAMHD_PARAMS;
            case -27467818:
                if (!str.equals("updateDenoiseParams")) {
                    return null;
                }
                return UPDATE_DENOISE_PARAMS;
            case 504753039:
                if (!str.equals(AugurCommandConstant.COMMAND_UPDATE_EFFECT_MODEL)) {
                    return null;
                }
                return EFFECT_MODEL;
            case 657754796:
                if (!str.equals("updateEffectGPUTurbo")) {
                    return null;
                }
                return GPU_TURBO;
            case 695349736:
                if (!str.equals(AugurCommandConstant.COMMAND_UPDATE_EFFECT_RESOURCE)) {
                    return null;
                }
                return EFFECT_RESOURCE;
            case 1739498083:
                if (!str.equals("updateFPSAndResolution")) {
                    return null;
                }
                return UPDATE_FPS_RESOLUTION;
            default:
                return null;
        }
    }

    public static CommandType valueOf(String str) {
        return (CommandType) C08FF.LIZ(CommandType.class, str);
    }

    CommandType(String str) {
        this.name = str;
    }
}
