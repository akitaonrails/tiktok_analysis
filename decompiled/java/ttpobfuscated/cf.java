package ttpobfuscated;

import ttp.orbu.sdk.ITTPOrbuAppToAppRequestPayload;
import ttp.orbu.sdk.ITTPOrbuInterceptor;
import ttp.orbu.sdk.requestvalidator.OrbuResult;

/* JADX INFO: loaded from: classes24.dex */
public final class cf implements ITTPOrbuInterceptor<ITTPOrbuAppToAppRequestPayload> {
    public final v3 a;

    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    public OrbuResult getOrbuResult() {
        return OrbuResult.a.a;
    }

    public cf(v3 v3Var) {
        this.a = v3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015d  */
    @Override // ttp.orbu.sdk.ITTPOrbuInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ttp.orbu.sdk.TTPOrbuResponse shouldInterceptRequest(ttp.orbu.sdk.ITTPOrbuRequest<? extends ttp.orbu.sdk.ITTPOrbuAppToAppRequestPayload> r26) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.cf.shouldInterceptRequest(ttp.orbu.sdk.ITTPOrbuRequest):ttp.orbu.sdk.TTPOrbuResponse");
    }
}
