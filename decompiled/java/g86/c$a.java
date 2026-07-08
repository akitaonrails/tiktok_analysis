package g86;

import X.AbstractC1317910kOr;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c$a extends AbstractC1317910kOr {
    public final byte[] LIZIZ;
    public final int LIZJ;
    public int LIZLLL;

    public c$a() {
        int iMax = Math.max(SpeechEngineDefines.TTS_WORK_MODE_BOTH, 20);
        this.LIZIZ = new byte[iMax];
        this.LIZJ = iMax;
    }

    public final void LIZJ(int i) {
        while ((i & (-128)) != 0) {
            byte[] bArr = this.LIZIZ;
            int i2 = this.LIZLLL;
            this.LIZLLL = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        byte[] bArr2 = this.LIZIZ;
        int i3 = this.LIZLLL;
        this.LIZLLL = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void LIZLLL(long j) {
        while (((-128) & j) != 0) {
            byte[] bArr = this.LIZIZ;
            int i = this.LIZLLL;
            this.LIZLLL = i + 1;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        byte[] bArr2 = this.LIZIZ;
        int i2 = this.LIZLLL;
        this.LIZLLL = i2 + 1;
        bArr2[i2] = (byte) j;
    }
}
