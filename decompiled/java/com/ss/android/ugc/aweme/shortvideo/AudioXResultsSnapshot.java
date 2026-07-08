package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioXResultsSnapshot {
    public final float be0;
    public final float be1;
    public final float ctps;
    public final float do_;
    public final float drr;
    public final float li;
    public final float mp;
    public final float rcd;
    public final float tacm;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioXResultsSnapshot)) {
            return false;
        }
        AudioXResultsSnapshot audioXResultsSnapshot = (AudioXResultsSnapshot) obj;
        return Float.compare(this.li, audioXResultsSnapshot.li) == 0 && Float.compare(this.do_, audioXResultsSnapshot.do_) == 0 && Float.compare(this.tacm, audioXResultsSnapshot.tacm) == 0 && Float.compare(this.ctps, audioXResultsSnapshot.ctps) == 0 && Float.compare(this.drr, audioXResultsSnapshot.drr) == 0 && Float.compare(this.mp, audioXResultsSnapshot.mp) == 0 && Float.compare(this.rcd, audioXResultsSnapshot.rcd) == 0 && Float.compare(this.be0, audioXResultsSnapshot.be0) == 0 && Float.compare(this.be1, audioXResultsSnapshot.be1) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioXResultsSnapshot(li=");
        sbLIZ.append(this.li);
        sbLIZ.append(", do_=");
        sbLIZ.append(this.do_);
        sbLIZ.append(", tacm=");
        sbLIZ.append(this.tacm);
        sbLIZ.append(", ctps=");
        sbLIZ.append(this.ctps);
        sbLIZ.append(", drr=");
        sbLIZ.append(this.drr);
        sbLIZ.append(", mp=");
        sbLIZ.append(this.mp);
        sbLIZ.append(", rcd=");
        sbLIZ.append(this.rcd);
        sbLIZ.append(", be0=");
        sbLIZ.append(this.be0);
        sbLIZ.append(", be1=");
        sbLIZ.append(this.be1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((((((((((Float.floatToIntBits(this.li) * 31) + Float.floatToIntBits(this.do_)) * 31) + Float.floatToIntBits(this.tacm)) * 31) + Float.floatToIntBits(this.ctps)) * 31) + Float.floatToIntBits(this.drr)) * 31) + Float.floatToIntBits(this.mp)) * 31) + Float.floatToIntBits(this.rcd)) * 31) + Float.floatToIntBits(this.be0)) * 31) + Float.floatToIntBits(this.be1);
    }

    public AudioXResultsSnapshot(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.li = f;
        this.do_ = f2;
        this.tacm = f3;
        this.ctps = f4;
        this.drr = f5;
        this.mp = f6;
        this.rcd = f7;
        this.be0 = f8;
        this.be1 = f9;
    }
}
