package com.bytedance.router.fragment;

/* JADX INFO: loaded from: classes33.dex */
public final class PopOp extends FragmentOp {
    public boolean popInclusive;
    public boolean tryFinishActivity;

    public PopOp() {
        this(null, null);
    }

    public final boolean getPopInclusive() {
        return this.popInclusive;
    }

    public final boolean getTryFinishActivity() {
        return this.tryFinishActivity;
    }

    public PopOp(String str) {
        this(str, null);
    }

    public final void setPopInclusive(boolean z) {
        this.popInclusive = z;
    }

    public final void setTryFinishActivity(boolean z) {
        this.tryFinishActivity = z;
    }

    public PopOp(String str, String str2) {
        super(str, str2, false);
        this.tryFinishActivity = true;
        this.popInclusive = true;
    }
}
