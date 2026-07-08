package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class UpSyncItem {
    public final transient String LIZ;
    public final transient List<String> LIZIZ;
    public final transient int LIZJ;
    public final transient boolean LIZLLL;
    public final transient boolean LJ;
    public final transient boolean LJFF;
    public final transient Function0<Unit> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    @C09CT("chat_sug_key")
    public final String chatSugKey;

    @C09CT("extension")
    public Map<String, String> extension;

    @C09CT("messages")
    public final List<UpSyncMessage> messages;

    @C09CT(Scene.SCENE_SERVICE)
    public Integer upSyncScene;

    public UpSyncItem() {
        this(null, null, null, 0, false, false, false, null, null, null, null, false, false, 8191, null);
    }

    public final int hashCode() {
        int iHashCode = this.chatSugKey.hashCode() * 31;
        String str = this.LIZ;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        Function0<Unit> function0 = this.LJI;
        int iHashCode3 = (((iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31) + this.messages.hashCode()) * 31;
        Integer num = this.upSyncScene;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.extension;
        return ((((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        return "UpSyncItem(chatSugKey=" + this.chatSugKey + ", chatSugCarryInLogId=" + this.LIZ + ", chatSugList=" + this.LIZIZ + ", chatSugCardType=" + this.LIZJ + ", isFirstSug=" + this.LIZLLL + ", isMiddlePageSug=" + this.LJ + ", isHandledInVM=" + this.LJFF + ", onAfterSyncRequest=" + this.LJI + ", messages=" + this.messages + ", upSyncScene=" + this.upSyncScene + ", extension=" + this.extension + ", isPreload=" + this.LJII + ", isOnlySug=" + this.LJIIIIZZ + ')';
    }

    public UpSyncItem(String str, String str2, List<String> list, int i, boolean z, boolean z2, boolean z3, Function0<Unit> function0, List<UpSyncMessage> list2, Integer num, Map<String, String> map, boolean z4, boolean z5) {
        this.chatSugKey = str;
        this.LIZ = str2;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = function0;
        this.messages = list2;
        this.upSyncScene = num;
        this.extension = map;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
    }

    public UpSyncItem(String str, String str2, List list, int i, boolean z, boolean z2, boolean z3, Function0 function0, List list2, Integer num, Map map, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : function0, (i2 & 256) != 0 ? C13BV.INSTANCE : list2, (i2 & 512) != 0 ? null : num, (i2 & 1024) == 0 ? map : null, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? z4 : true, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z5 : false);
    }
}
