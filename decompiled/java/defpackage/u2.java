package defpackage;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes28.dex */
public final class u2 {
    public final boolean LIZ;
    public final String LIZIZ;
    public long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public final long LJIILIIL;
    public final int LJIILJJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public u2() {
        String str = null;
        long j = 0;
        this(false, str, j, j, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, j, 0 == true ? 1 : 0, 32767);
    }

    public final String toString() {
        return "MessageConfig(takoInitialized=" + this.LIZ + ", conversationId=" + this.LIZIZ + ", messageCursor=" + this.LIZJ + ", readCursor=" + this.LIZLLL + ", resultInfo=" + this.LJ + ", showedDisclaimerPopup=" + this.LJFF + ", acceptedDisclaimerPopup=" + this.LJI + ", disclaimerPopupType=" + this.LJII + ", showedMemoryGuidePopup=" + this.LJIIIIZZ + ", showedLanguageStyleGuidePopup=" + this.LJIIIZ + ", userSend=" + this.LJIIJ + ", enableImageRecord=" + this.LJIIJJI + ", switchStatus=" + this.LJIIL + ", botId=" + this.LJIILIIL + ", botSource=" + this.LJIILJJIL + ')';
    }

    public static u2 LIZ(u2 u2Var, long j) {
        boolean z = u2Var.LIZ;
        String str = u2Var.LIZIZ;
        long j2 = u2Var.LIZLLL;
        String str2 = u2Var.LJ;
        boolean z2 = u2Var.LJFF;
        boolean z3 = u2Var.LJI;
        int i = u2Var.LJII;
        boolean z4 = u2Var.LJIIIIZZ;
        boolean z5 = u2Var.LJIIIZ;
        boolean z6 = u2Var.LJIIJ;
        boolean z7 = u2Var.LJIIJJI;
        String str3 = u2Var.LJIIL;
        long j3 = u2Var.LJIILIIL;
        int i2 = u2Var.LJIILJJIL;
        u2Var.getClass();
        return new u2(z, str, j, j2, str2, z2, z3, i, z4, z5, z6, z7, str3, j3, i2);
    }

    public u2(boolean z, String str, long j, long j2, String str2, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3, long j3, int i2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str2;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = i;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
        this.LJIIJ = z6;
        this.LJIIJJI = z7;
        this.LJIIL = str3;
        this.LJIILIIL = j3;
        this.LJIILJJIL = i2;
    }

    public /* synthetic */ u2(boolean z, String str, long j, long j2, String str2, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3, long j3, int i2, int i3) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0L : j, (i3 & 8) == 0 ? j2 : 0L, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? false : z4, (i3 & 512) != 0 ? false : z5, (i3 & 1024) != 0 ? false : z6, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z7, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str3 : "", (i3 & 8192) != 0 ? 1L : j3, (i3 & 16384) != 0 ? 1 : i2);
    }
}
