package ttpobfuscated;

import ttp.orbu.sdk.ITTPOrbuInterceptor;
import ttp.orbu.sdk.ITTPOrbuLiveSEIRequestPayload;
import ttp.orbu.sdk.requestvalidator.OrbuResult;

/* JADX INFO: renamed from: ttpobfuscated.if, reason: invalid class name */
/* JADX INFO: loaded from: classes24.dex */
public final class Cif implements ITTPOrbuInterceptor<ITTPOrbuLiveSEIRequestPayload> {
    public final v3 a;

    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    public OrbuResult getOrbuResult() {
        return OrbuResult.a.a;
    }

    public Cif(v3 v3Var) {
        this.a = v3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015d  */
    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ttp.orbu.sdk.TTPOrbuResponse shouldInterceptRequest(ttp.orbu.sdk.ITTPOrbuRequest<? extends ttp.orbu.sdk.ITTPOrbuLiveSEIRequestPayload> r26) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.Cif.shouldInterceptRequest(ttp.orbu.sdk.ITTPOrbuRequest):ttp.orbu.sdk.TTPOrbuResponse");
    }
}
