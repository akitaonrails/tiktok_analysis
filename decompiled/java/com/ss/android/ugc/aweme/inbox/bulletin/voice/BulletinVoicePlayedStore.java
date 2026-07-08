package com.ss.android.ugc.aweme.inbox.bulletin.voice;

import X.C09CT;
import X.C0OPX;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinVoicePlayedStore {
    public static final Gson LIZ = new Gson();
    public static final Type LIZIZ = new TypeToken<List<Entry>>() { // from class: X.0OOj
    }.getType();

    public static final class Entry {

        @C09CT("sid")
        public final String sourceId;

        @C09CT("ts")
        public final long updatedAt;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.LJFF(this.sourceId, entry.sourceId) && this.updatedAt == entry.updatedAt;
        }

        public final int hashCode() {
            return (this.sourceId.hashCode() * 31) + C786410Ut5.Y2(this.updatedAt);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Entry(sourceId=");
            sbLIZ.append(this.sourceId);
            sbLIZ.append(", updatedAt=");
            sbLIZ.append(this.updatedAt);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Entry() {
            this("", System.currentTimeMillis());
        }

        public Entry(String str, long j) {
            this.sourceId = str;
            this.updatedAt = j;
        }
    }

    public static List LIZ(String str, String str2) {
        String string = LIZIZ(str, str2).getString("entries", null);
        if (string == null) {
            return new ArrayList();
        }
        try {
            List list = (List) LIZ.LJIIIIZZ(string, LIZIZ);
            if (list == null) {
                return new ArrayList();
            }
            return list;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoicePlayedStore: readEntries fromJson failed uid=");
            sbLIZ.append(str);
            sbLIZ.append(" bbId=");
            sbLIZ.append(str2);
            sbLIZ.append(" len=");
            sbLIZ.append(string.length());
            sbLIZ.append(": ");
            sbLIZ.append(e.getClass().getSimpleName());
            sbLIZ.append(' ');
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return new ArrayList();
        }
    }

    public static Keva LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bb_voice_played_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
