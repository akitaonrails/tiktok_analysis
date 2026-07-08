package com.ss.lyrax.augur.command;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.augur.AugurCommandRequest;
import com.ss.lyrax.augur.AugurCommandResponse;
import com.ss.lyrax.augur.IAugurCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurCommandWrapper implements IAugurCommand {
    public AtomicReference<AugurCommandHandler> mCommandHandler = new AtomicReference<>();
    public Map<String, AbsAugurCommand> commandDataMap = new HashMap();
    public final int INVALID_EFFECT_LEVEL = -1;

    public interface AugurCommandHandler {
        AugurCommandResponse updateDenoiseParams(AugurUpdateDenoiseParamsCommand augurUpdateDenoiseParamsCommand);

        AugurCommandResponse updateEffectModel(AugurEffectModelCommand augurEffectModelCommand);

        AugurCommandResponse updateEffectResource(AugurEffectResourceCommand augurEffectResourceCommand);

        AugurCommandResponse updateEffectStrategy(AugurEffectStrategyCommand augurEffectStrategyCommand);

        void updateEffectSuperResolutionStatus(AugurEffectSuperResolutionCommand augurEffectSuperResolutionCommand);

        AugurCommandResponse updateFPSAndResolution(AugurUpdateFpsResolutionCommand augurUpdateFpsResolutionCommand);

        AugurCommandResponse updateGameFPSAndResolution(AugurUpdateFpsResolutionCommand augurUpdateFpsResolutionCommand);

        AugurCommandResponse updateLinkMicPerformanceParams(AugurUpdateLinkMicPerformanceParamsCommand augurUpdateLinkMicPerformanceParamsCommand);

        AugurCommandResponse updateLinkMicVideoParams(AugurUpdateLinkMicVideoParamsCommand augurUpdateLinkMicVideoParamsCommand);

        AugurCommandResponse updateShowToast(AugurShowToastCommand augurShowToastCommand);

        AugurCommandResponse updateSimulcast(AugurSimulcastCommand augurSimulcastCommand);

        AugurCommandResponse updateStreamHDParams(AugurUpdateStreamHDParamsCommand augurUpdateStreamHDParamsCommand);

        AugurCommandResponse updateSubscribeSimulcast(AugurSubscribeSimulcastCommand augurSubscribeSimulcastCommand);
    }

    public Map<String, AbsAugurCommand> getCommandDataMap() {
        return this.commandDataMap;
    }

    public void clearStrategyReport(String str) {
        this.commandDataMap.remove(str);
    }

    public void setAugurCommandHandler(AugurCommandHandler augurCommandHandler) {
        this.mCommandHandler.set(augurCommandHandler);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateDenoiseParams(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateDenoiseParamsCommand augurUpdateDenoiseParamsCommandFromJSON = AugurUpdateDenoiseParamsCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateDenoiseParamsCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateDenoiseParams(augurUpdateDenoiseParamsCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateEffectGPUTurbo(AugurCommandRequest augurCommandRequest) {
        return new AugurCommandResponse();
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateEffectModel(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurEffectModelCommand augurEffectModelCommandFromJSON = AugurEffectModelCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurEffectModelCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateEffectModel(augurEffectModelCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateEffectResource(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurEffectResourceCommand augurEffectResourceCommandFromJSON = AugurEffectResourceCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurEffectResourceCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateEffectResource(augurEffectResourceCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateEffectStrategy(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurEffectStrategyCommand augurEffectStrategyCommandFromJSON = AugurEffectStrategyCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateEffectStrategy(augurEffectStrategyCommandFromJSON);
            }
            if (TextUtils.equals(augurEffectStrategyCommandFromJSON.ruleName, "effect_model_strategy")) {
                JSONObject adaptiveResultJSONObject = augurCommandResponse.getAdaptiveResultJSONObject();
                if (adaptiveResultJSONObject.optInt("execute") == 1) {
                    parseEffectModelStrategyCommand(augurEffectStrategyCommandFromJSON, adaptiveResultJSONObject);
                    this.commandDataMap.put(augurCommandRequest.getRuleName(), augurEffectStrategyCommandFromJSON);
                    return augurCommandResponse;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateFPSAndResolution(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateFpsResolutionCommand augurUpdateFpsResolutionCommandFromJSON = AugurUpdateFpsResolutionCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateFpsResolutionCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateFPSAndResolution(augurUpdateFpsResolutionCommandFromJSON);
                return augurCommandResponse;
            }
            return augurCommandResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return augurCommandResponse;
        }
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateGameFPSAndResolution(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateFpsResolutionCommand augurUpdateFpsResolutionCommandFromJSON = AugurUpdateFpsResolutionCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateFpsResolutionCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateGameFPSAndResolution(augurUpdateFpsResolutionCommandFromJSON);
                return augurCommandResponse;
            }
            return augurCommandResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return augurCommandResponse;
        }
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateLinkMicPerformanceParams(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateLinkMicPerformanceParamsCommand augurUpdateLinkMicPerformanceParamsCommandFromJSON = AugurUpdateLinkMicPerformanceParamsCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateLinkMicPerformanceParamsCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateLinkMicPerformanceParams(augurUpdateLinkMicPerformanceParamsCommandFromJSON);
                return augurCommandResponse;
            }
            return augurCommandResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return augurCommandResponse;
        }
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateLinkMicVideoParams(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateLinkMicVideoParamsCommand augurUpdateLinkMicVideoParamsCommandFromJSON = AugurUpdateLinkMicVideoParamsCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateLinkMicVideoParamsCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateLinkMicVideoParams(augurUpdateLinkMicVideoParamsCommandFromJSON);
                return augurCommandResponse;
            }
            return augurCommandResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return augurCommandResponse;
        }
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateShowToast(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurShowToastCommand augurShowToastCommandFromJSON = AugurShowToastCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurShowToastCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateShowToast(augurShowToastCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateSimulcast(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurSimulcastCommand augurSimulcastCommandFromJSON = AugurSimulcastCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurSimulcastCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateSimulcast(augurSimulcastCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateStreamHDParams(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurUpdateStreamHDParamsCommand augurUpdateStreamHDParamsCommandFromJSON = AugurUpdateStreamHDParamsCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurUpdateStreamHDParamsCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateStreamHDParams(augurUpdateStreamHDParamsCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public AugurCommandResponse updateSubscribeSimulcast(AugurCommandRequest augurCommandRequest) {
        AugurCommandResponse augurCommandResponse = new AugurCommandResponse();
        try {
            JSONObject jSONObject = new JSONObject(augurCommandRequest.getAdaptiveResult());
            AugurSubscribeSimulcastCommand augurSubscribeSimulcastCommandFromJSON = AugurSubscribeSimulcastCommand.fromJSON(jSONObject.optJSONObject("to_params"), jSONObject);
            this.commandDataMap.put(augurCommandRequest.getRuleName(), augurSubscribeSimulcastCommandFromJSON);
            AugurCommandHandler augurCommandHandler = this.mCommandHandler.get();
            if (augurCommandHandler != null) {
                augurCommandResponse = augurCommandHandler.updateSubscribeSimulcast(augurSubscribeSimulcastCommandFromJSON);
                return augurCommandResponse;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurCommandResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r1
      0x0084: PHI (r1v3 int) = (r1v4 int), (r1v5 int) binds: [B:35:0x007b, B:33:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseEffectModelStrategyCommand(com.ss.lyrax.augur.command.AugurEffectStrategyCommand r11, org.json.JSONObject r12) {
        /*
            r10 = this;
            if (r12 == 0) goto Lba
            if (r11 == 0) goto Lba
            java.lang.String r0 = "direction"
            java.lang.String r0 = r12.optString(r0)     // Catch: java.lang.Exception -> Lb6
            r11.adaptiveStrategyStatus = r0     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "to_params"
            org.json.JSONObject r1 = r12.optJSONObject(r0)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "from_params"
            org.json.JSONObject r9 = r12.optJSONObject(r0)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "init"
            org.json.JSONObject r7 = r12.optJSONObject(r0)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r6 = "tt_face_extra"
            java.lang.String r8 = "tt_matting"
            java.lang.String r2 = "effect_level"
            r5 = -1
            if (r1 == 0) goto L4c
            org.json.JSONObject r0 = r1.optJSONObject(r8)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L43
            int r4 = r0.optInt(r2, r5)     // Catch: java.lang.Exception -> Lb6
            org.json.JSONObject r0 = r11.adaptiveStrategyLevelJSON     // Catch: java.lang.Exception -> Lb6
            r0.put(r8, r4)     // Catch: java.lang.Exception -> Lb6
        L36:
            org.json.JSONObject r0 = r1.optJSONObject(r6)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L4d
            int r1 = r0.optInt(r2, r5)     // Catch: java.lang.Exception -> Lb6
            if (r4 != r5) goto L46
            goto L45
        L43:
            r4 = -1
            goto L36
        L45:
            r4 = r1
        L46:
            org.json.JSONObject r0 = r11.adaptiveStrategyLevelJSON     // Catch: java.lang.Exception -> Lb6
            r0.put(r6, r1)     // Catch: java.lang.Exception -> Lb6
            goto L4d
        L4c:
            r4 = -1
        L4d:
            if (r9 == 0) goto L68
            org.json.JSONObject r0 = r9.optJSONObject(r8)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L66
            int r3 = r0.optInt(r2)     // Catch: java.lang.Exception -> Lb6
            if (r3 != r5) goto L69
        L5b:
            org.json.JSONObject r0 = r9.optJSONObject(r6)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L69
            int r3 = r0.optInt(r2, r5)     // Catch: java.lang.Exception -> Lb6
            goto L69
        L66:
            r3 = -1
            goto L5b
        L68:
            r3 = -1
        L69:
            if (r7 == 0) goto L85
            org.json.JSONObject r0 = r7.optJSONObject(r8)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L82
            int r1 = r0.optInt(r2)     // Catch: java.lang.Exception -> Lb6
            if (r1 != r5) goto L84
        L77:
            org.json.JSONObject r0 = r7.optJSONObject(r6)     // Catch: java.lang.Exception -> Lb6
            if (r0 == 0) goto L84
            int r5 = r0.optInt(r2, r5)     // Catch: java.lang.Exception -> Lb6
            goto L85
        L82:
            r1 = -1
            goto L77
        L84:
            r5 = r1
        L85:
            java.lang.String r2 = "effect_model_down"
            java.lang.String r1 = "effect_model_default"
            java.lang.String r0 = "effect_model_up"
            if (r4 < 0) goto Lba
            if (r5 < 0) goto L9b
            if (r4 >= r5) goto L94
            r11.adaptiveStrategyStatusListItem = r0     // Catch: java.lang.Exception -> Lb6
            goto L9b
        L94:
            if (r4 <= r5) goto L99
            r11.adaptiveStrategyStatusListItem = r2     // Catch: java.lang.Exception -> Lb6
            goto L9b
        L99:
            r11.adaptiveStrategyStatusListItem = r1     // Catch: java.lang.Exception -> Lb6
        L9b:
            if (r3 < 0) goto Lba
            if (r4 >= r3) goto La6
            r11.adaptiveStrategyName = r0     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "up"
            r11.adaptiveStrategyStatus = r0     // Catch: java.lang.Exception -> Lb6
            return
        La6:
            if (r4 <= r3) goto Laf
            r11.adaptiveStrategyName = r2     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "down"
            r11.adaptiveStrategyStatus = r0     // Catch: java.lang.Exception -> Lb6
            return
        Laf:
            r11.adaptiveStrategyName = r1     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "default"
            r11.adaptiveStrategyStatus = r0     // Catch: java.lang.Exception -> Lb6
            return
        Lb6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lyrax.augur.command.AugurCommandWrapper.parseEffectModelStrategyCommand(com.ss.lyrax.augur.command.AugurEffectStrategyCommand, org.json.JSONObject):void");
    }
}
