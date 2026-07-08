package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVcPiOcrConfigModel {

    @C09CT("enable_pi_ocr")
    public final Boolean enableOcr;

    public PipoVcPiOcrConfigModel() {
        this(Boolean.TRUE);
    }

    public PipoVcPiOcrConfigModel(Boolean bool) {
        this.enableOcr = bool;
    }
}
