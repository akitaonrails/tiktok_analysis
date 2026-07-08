package com.ss.android.ugc.aweme.services.uikit;

/* JADX INFO: loaded from: classes22.dex */
public final class OriginUsingToast {
    public boolean isTuxToast;
    public boolean isTuxToastLegacy;

    public OriginUsingToast() {
        this(false, false);
    }

    public final boolean isTuxToast() {
        return this.isTuxToast;
    }

    public final boolean isTuxToastLegacy() {
        return this.isTuxToastLegacy;
    }

    public final void setTuxToast(boolean z) {
        this.isTuxToast = z;
    }

    public final void setTuxToastLegacy(boolean z) {
        this.isTuxToastLegacy = z;
    }

    public OriginUsingToast(boolean z, boolean z2) {
        this.isTuxToast = z;
        this.isTuxToastLegacy = z2;
    }
}
