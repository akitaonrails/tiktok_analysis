package defpackage;

import X.C2188811AlT;
import X.C786410Ut5;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public interface d2 {
    float LIZ(String str);

    void LIZIZ(String str);

    boolean LIZJ();

    LiveData<a> LIZLLL();

    void LJ(String str);

    int LJFF();

    void LJI(String str, String str2);

    void LJII(String str);

    void LJIIIIZZ(String str, String str2);

    void LJIIIZ(String str, AudioCommentModel audioCommentModel);

    boolean LJIIJ(String str);

    int LJIIJJI(String str);

    public interface a {

        public static final class e implements a {
            public static final e LIZ = new e();
        }

        /* JADX INFO: renamed from: d2$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes13.dex */
        public static final class C0035a implements a {
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0035a) && Intrinsics.LJFF(this.LIZ, ((C0035a) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BufferingEnd(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public C0035a(String str) {
                this.LIZ = str;
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        public static final class b implements a {
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.LJFF(this.LIZ, ((b) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BufferingStart(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public b(String str) {
                this.LIZ = str;
            }
        }

        public static final class d implements a {
            public final String LIZ;
            public final int LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.LJFF(this.LIZ, dVar.LIZ) && this.LIZIZ == dVar.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", code=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public d(String str, int i) {
                this.LIZ = str;
                this.LIZIZ = i;
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        public static final class h implements a {
            public final String LIZ;
            public final boolean LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.LJFF(this.LIZ, hVar.LIZ) && this.LIZIZ == hVar.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Preparing(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", isContinueAudioPlay=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public h(String str, boolean z) {
                this.LIZ = str;
                this.LIZIZ = z;
            }
        }

        public static final class c implements a {
            public final String LIZ;
            public final String LIZIZ;
            public final Long LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.LJFF(this.LIZ, cVar.LIZ) && Intrinsics.LJFF(this.LIZIZ, cVar.LIZIZ) && Intrinsics.LJFF(this.LIZJ, cVar.LIZJ);
            }

            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode() * 31;
                String str = this.LIZIZ;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l = this.LIZJ;
                return iHashCode2 + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Completion(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", playReason=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", playDuration=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public c(String str, String str2, Long l) {
                this.LIZ = str;
                this.LIZIZ = str2;
                this.LIZJ = l;
            }
        }

        public static final class g implements a {
            public final String LIZ;
            public final long LIZIZ;
            public final int LIZJ;
            public final long LIZLLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.LJFF(this.LIZ, gVar.LIZ) && this.LIZIZ == gVar.LIZIZ && this.LIZJ == gVar.LIZJ && this.LIZLLL == gVar.LIZLLL;
            }

            public final int hashCode() {
                return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Playing(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", startTimeMillis=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", totalDurationMillis=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", firstFrameDuration=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public g(int i, long j, long j2, String str) {
                this.LIZ = str;
                this.LIZIZ = j;
                this.LIZJ = i;
                this.LIZLLL = j2;
            }
        }

        public static final class i implements a {
            public final String LIZ;
            public final int LIZIZ = 0;
            public final int LIZJ = 0;
            public final String LIZLLL;
            public final String LJ;
            public final Long LJFF;
            public final Boolean LJI;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.LJFF(this.LIZ, iVar.LIZ) && this.LIZIZ == iVar.LIZIZ && this.LIZJ == iVar.LIZJ && Intrinsics.LJFF(this.LIZLLL, iVar.LIZLLL) && Intrinsics.LJFF(this.LJ, iVar.LJ) && Intrinsics.LJFF(this.LJFF, iVar.LJFF) && Intrinsics.LJFF(this.LJI, iVar.LJI);
            }

            public final int hashCode() {
                int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
                String str = this.LIZLLL;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.LJ;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l = this.LJFF;
                int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool = this.LJI;
                return iHashCode4 + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Stop(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", currentPlaybackTimeMillis=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", totalDurationMillis=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", reason=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", playReason=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", playDuration=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", isLastStatePaused=");
                sbLIZ.append(this.LJI);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public i(String str, String str2, String str3, Long l, Boolean bool) {
                this.LIZ = str;
                this.LIZLLL = str2;
                this.LJ = str3;
                this.LJFF = l;
                this.LJI = bool;
            }
        }

        public static final class f implements a {
            public final String LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final Long LJFF;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.LJFF(this.LIZ, fVar.LIZ) && this.LIZIZ == fVar.LIZIZ && this.LIZJ == fVar.LIZJ && Intrinsics.LJFF(this.LIZLLL, fVar.LIZLLL) && Intrinsics.LJFF(this.LJ, fVar.LJ) && Intrinsics.LJFF(this.LJFF, fVar.LJFF);
            }

            public final int hashCode() {
                int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
                String str = this.LJ;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l = this.LJFF;
                return iHashCode2 + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Paused(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", currentPlaybackTimeMillis=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", totalDurationMillis=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", reason=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", playReason=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", playDuration=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public f(int i, int i2, Long l, String str, String str2, String str3) {
                this.LIZ = str;
                this.LIZIZ = i;
                this.LIZJ = i2;
                this.LIZLLL = str2;
                this.LJ = str3;
                this.LJFF = l;
            }
        }
    }
}
