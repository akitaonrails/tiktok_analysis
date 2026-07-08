package com.ss.android.ugc.aweme.inbox.bulletin.voice;

import X.C09CT;
import X.C0OPX;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletinVoiceDraftManager {
    public static final ConcurrentHashMap<String, DraftMeta> LIZJ = new ConcurrentHashMap<>();
    public final String LIZ;
    public final Gson LIZIZ = new Gson();

    public final String LIZJ() {
        return C786410Ut5.j4("draft_light_created_%s", Arrays.copyOf(new Object[]{this.LIZ}, 1));
    }

    public final String LIZLLL() {
        return C786410Ut5.j4("draft_light_duration_%s", Arrays.copyOf(new Object[]{this.LIZ}, 1));
    }

    public final String LJ() {
        return C786410Ut5.j4("draft_light_fake_id_%s", Arrays.copyOf(new Object[]{this.LIZ}, 1));
    }

    public final String LJFF() {
        return C786410Ut5.j4("draft_%s", Arrays.copyOf(new Object[]{this.LIZ}, 1));
    }

    public final void LIZ() {
        LIZJ.remove(this.LIZ);
        Keva kevaLJII = LJII();
        kevaLJII.erase(LJFF());
        kevaLJII.erase(LIZLLL());
        kevaLJII.erase(LIZJ());
        kevaLJII.erase(LJ());
    }

    public final DraftMeta LJI() {
        ConcurrentHashMap<String, DraftMeta> concurrentHashMap = LIZJ;
        DraftMeta draftMeta = concurrentHashMap.get(this.LIZ);
        if (draftMeta != null) {
            if (System.currentTimeMillis() - draftMeta.createdAt > 1209600000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VoiceDraftManager: loadDraft cache expired createdAt=");
                sbLIZ.append(draftMeta.createdAt);
                sbLIZ.append(", deleting");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                LIZ();
                return null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VoiceDraftManager: loadDraft cache hit fakeId=");
            sbLIZ2.append(draftMeta.fakeId);
            sbLIZ2.append(" duration=");
            sbLIZ2.append(draftMeta.durationMs);
            sbLIZ2.append("ms waveSize=");
            sbLIZ2.append(draftMeta.waveformData.size());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            return draftMeta;
        }
        String string = LJII().getString(LJFF(), null);
        if (string == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("VoiceDraftManager: loadDraft no draft uid=");
            sbLIZ3.append(this.LIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        }
        try {
            DraftMeta draftMeta2 = (DraftMeta) this.LIZIZ.LJII(string, DraftMeta.class);
            if (System.currentTimeMillis() - draftMeta2.createdAt > 1209600000) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("VoiceDraftManager: loadDraft expired createdAt=");
                sbLIZ4.append(draftMeta2.createdAt);
                sbLIZ4.append(", deleting");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ4));
                LIZ();
                return null;
            }
            concurrentHashMap.put(this.LIZ, draftMeta2);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("VoiceDraftManager: loadDraft keva fakeId=");
            sbLIZ5.append(draftMeta2.fakeId);
            sbLIZ5.append(" duration=");
            sbLIZ5.append(draftMeta2.durationMs);
            sbLIZ5.append("ms waveSize=");
            sbLIZ5.append(draftMeta2.waveformData.size());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ5));
            return draftMeta2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("VoiceDraftManager: loadDraft fromJson failed: ");
            sbLIZ6.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ6));
            LIZ();
            return null;
        }
    }

    public final void LIZIZ() {
        DraftMeta draftMetaLJI;
        Keva kevaLJII = LJII();
        long j = kevaLJII.getLong(LIZLLL(), 0L);
        long j2 = kevaLJII.getLong(LIZJ(), 0L);
        if ((j <= 0 || j2 <= 0) && (draftMetaLJI = LJI()) != null && draftMetaLJI.durationMs > 0) {
            kevaLJII.storeLong(LIZLLL(), draftMetaLJI.durationMs);
            kevaLJII.storeLong(LIZJ(), draftMetaLJI.createdAt);
            kevaLJII.storeString(LJ(), draftMetaLJI.fakeId);
        }
    }

    public final Keva LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bb_voice_draft_");
        sbLIZ.append(this.LIZ);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public BulletinVoiceDraftManager(String str) {
        this.LIZ = str;
    }

    public final void LJIIIIZZ(DraftMeta draftMeta) {
        LIZJ.put(this.LIZ, draftMeta);
        Keva kevaLJII = LJII();
        kevaLJII.storeString(LJFF(), GsonProtectorUtils.toJson(this.LIZIZ, draftMeta));
        kevaLJII.storeLong(LIZLLL(), draftMeta.durationMs);
        kevaLJII.storeLong(LIZJ(), draftMeta.createdAt);
        kevaLJII.storeString(LJ(), draftMeta.fakeId);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceDraftManager: saveDraft fakeId=");
        sbLIZ.append(draftMeta.fakeId);
        sbLIZ.append(" duration=");
        sbLIZ.append(draftMeta.durationMs);
        sbLIZ.append("ms waveSize=");
        sbLIZ.append(draftMeta.waveformData.size());
        sbLIZ.append(" uid=");
        sbLIZ.append(this.LIZ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final class DraftMeta {

        @C09CT("created_at")
        public final long createdAt;

        @C09CT("duration")
        public final long durationMs;

        @C09CT("fake_id")
        public final String fakeId;

        @C09CT("waveform")
        public final List<Float> waveformData;

        public DraftMeta() {
            this(null, 0L, null, 0L, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DraftMeta)) {
                return false;
            }
            DraftMeta draftMeta = (DraftMeta) obj;
            return Intrinsics.LJFF(this.fakeId, draftMeta.fakeId) && this.durationMs == draftMeta.durationMs && Intrinsics.LJFF(this.waveformData, draftMeta.waveformData) && this.createdAt == draftMeta.createdAt;
        }

        public final int hashCode() {
            return (((((this.fakeId.hashCode() * 31) + C786410Ut5.Y2(this.durationMs)) * 31) + this.waveformData.hashCode()) * 31) + C786410Ut5.Y2(this.createdAt);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftMeta(fakeId=");
            sbLIZ.append(this.fakeId);
            sbLIZ.append(", durationMs=");
            sbLIZ.append(this.durationMs);
            sbLIZ.append(", waveformData=");
            sbLIZ.append(this.waveformData);
            sbLIZ.append(", createdAt=");
            sbLIZ.append(this.createdAt);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DraftMeta(String str, long j, List<Float> list, long j2) {
            this.fakeId = str;
            this.durationMs = j;
            this.waveformData = list;
            this.createdAt = j2;
        }

        public DraftMeta(String str, long j, List list, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? System.currentTimeMillis() : j2);
        }
    }
}
