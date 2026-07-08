package ttp.orbu.sdk.configuration.model;

import ttp.orbu.sdk.requestvalidator.OrbuResult;

/* JADX INFO: loaded from: classes24.dex */
public final class UnhandledReturnStrategy {
    public final boolean report;
    public final OrbuResult result;

    public String toString() {
        return "UnhandledReturnStrategy(result=" + this.result + ", report=" + this.report + ')';
    }

    public UnhandledReturnStrategy(OrbuResult orbuResult, boolean z) {
        this.result = orbuResult;
        this.report = z;
    }
}
