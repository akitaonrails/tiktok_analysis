package com.ss.android.ugc.aweme.aikit.api.create.generation;

import X.C09CT;
import X.C2188811AlT;
import X.C542780LQm;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AICreateBusinessExtra implements Serializable {
    public static final C542780LQm Companion = new Object() { // from class: X.0LQm
    };

    @C09CT("auto_task")
    public final Boolean autoTask;

    @C09CT("dm_message_params")
    public final Object dmMessageParams;

    @C09CT("entrance_scene")
    public final String entranceScene;

    @C09CT("server_task_id")
    public final String serverTaskId;

    public AICreateBusinessExtra() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICreateBusinessExtra)) {
            return false;
        }
        AICreateBusinessExtra aICreateBusinessExtra = (AICreateBusinessExtra) obj;
        return Intrinsics.LJFF(this.dmMessageParams, aICreateBusinessExtra.dmMessageParams) && Intrinsics.LJFF(this.entranceScene, aICreateBusinessExtra.entranceScene) && Intrinsics.LJFF(this.autoTask, aICreateBusinessExtra.autoTask) && Intrinsics.LJFF(this.serverTaskId, aICreateBusinessExtra.serverTaskId);
    }

    public int hashCode() {
        Object obj = this.dmMessageParams;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.entranceScene;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.autoTask;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.serverTaskId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICreateBusinessExtra(dmMessageParams=");
        sbLIZ.append(this.dmMessageParams);
        sbLIZ.append(", entranceScene=");
        sbLIZ.append(this.entranceScene);
        sbLIZ.append(", autoTask=");
        sbLIZ.append(this.autoTask);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, String> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Gson gson = new Gson();
        Object obj = this.dmMessageParams;
        if (obj != null) {
            linkedHashMap.put("dm_message_params", GsonProtectorUtils.toJson(gson, obj));
        }
        String str = this.entranceScene;
        if (str != null) {
            linkedHashMap.put("entrance_scene", str);
        }
        Boolean bool = this.autoTask;
        if (bool != null) {
            linkedHashMap.put("auto_task", String.valueOf(bool.booleanValue()));
        }
        String str2 = this.serverTaskId;
        if (str2 != null) {
            linkedHashMap.put("server_task_id", str2);
        }
        return linkedHashMap;
    }

    public AICreateBusinessExtra(Object obj, String str, Boolean bool, String str2) {
        this.dmMessageParams = obj;
        this.entranceScene = str;
        this.autoTask = bool;
        this.serverTaskId = str2;
    }
}
