package com.ss.android.ugc.aweme.shortvideo;

import X.C199555136b;
import X.C2221281Bwk;
import com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadByFileService implements IAudioExtractUpload {
    public C2221281Bwk LIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void cancelUpload() {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            c2221281Bwk.cancelUpload();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getCurrentUploadOffset() {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return ((Long) c2221281Bwk.LJIILL.LIZ).longValue();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getFileSize() {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk == null) {
            return 0L;
        }
        if (c2221281Bwk.LJII) {
            return c2221281Bwk.LJIILJJIL.length();
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getHeaderSize() {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.getHeaderSize();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final boolean isProduceFinish() {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.LJII;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void disableDeleteCacheWhenEnd(boolean z) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            c2221281Bwk.LJIJI = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void stopUpload(boolean z) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            c2221281Bwk.stopUpload(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getCrc32ByOffset(long j, long j2) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.getCrc32ByOffset(j, j2);
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final long getNoConsumeBufferSize(long j, int i) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.getNoConsumeBufferSize(j, i);
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final int consume(int i, byte[] bArr, int i2) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.consume(i, bArr, i2);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void init(String str, String str2, boolean z) {
        C2221281Bwk c2221281Bwk = new C2221281Bwk(str, str2);
        if (z) {
            c2221281Bwk.LJFF();
        }
        this.LIZ = c2221281Bwk;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final void produce(byte[] bArr, long j, int i, boolean z) {
        C2221281Bwk c2221281Bwk;
        if (bArr != null && (c2221281Bwk = this.LIZ) != null) {
            c2221281Bwk.LIZ(new C199555136b(bArr), j, i, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload
    public final int streamConsume(long j, byte[] bArr, int i, int i2) {
        C2221281Bwk c2221281Bwk = this.LIZ;
        if (c2221281Bwk != null) {
            return c2221281Bwk.streamConsume(j, bArr, i, i2);
        }
        return 0;
    }
}
