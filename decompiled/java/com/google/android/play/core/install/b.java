package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends InstallState {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;

    @Override // com.google.android.play.core.install.InstallState
    public final long LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int LIZJ() {
        return this.LIZ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String LIZLLL() {
        return this.LJ;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long LJ() {
        return this.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ ^ 1000003;
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LIZLLL) * 1000003) ^ this.LJ.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.LIZ + ", bytesDownloaded=" + this.LIZIZ + ", totalBytesToDownload=" + this.LIZJ + ", installErrorCode=" + this.LIZLLL + ", packageName=" + this.LJ + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.LIZ == installState.LIZJ() && this.LIZIZ == installState.LIZ() && this.LIZJ == installState.LJ() && this.LIZLLL == installState.LIZIZ() && this.LJ.equals(installState.LIZLLL())) {
                return true;
            }
        }
        return false;
    }

    public b(int i, long j, long j2, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i2;
        if (str != null) {
            this.LJ = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
}
