package com.bytedance.router.fragment;

/* JADX INFO: loaded from: classes33.dex */
public final class PushOp extends FragmentOp {
    public int enterAnim;
    public int exitAnim;
    public final Integer flag;
    public boolean isHideCurrentFragment;
    public int popEnterAnim;
    public int popExitAnim;
    public PushType pushType;

    public PushOp() {
        this(null, null, null);
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final Integer getFlag() {
        return this.flag;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    public final PushType getPushType() {
        return this.pushType;
    }

    public final boolean isHideCurrentFragment() {
        return this.isHideCurrentFragment;
    }

    public PushOp(String str) {
        this(str, null, null);
    }

    public final void setEnterAnim(int i) {
        this.enterAnim = i;
    }

    public final void setExitAnim(int i) {
        this.exitAnim = i;
    }

    public final void setHideCurrentFragment(boolean z) {
        this.isHideCurrentFragment = z;
    }

    public final void setPopEnterAnim(int i) {
        this.popEnterAnim = i;
    }

    public final void setPopExitAnim(int i) {
        this.popExitAnim = i;
    }

    public final void setPushType(PushType pushType) {
        this.pushType = pushType;
    }

    public PushOp(String str, String str2) {
        this(str, str2, null);
    }

    public PushOp(String str, String str2, Integer num) {
        super(str, str2, false);
        this.flag = num;
        this.pushType = PushType.REPLACE;
        this.isHideCurrentFragment = true;
        this.popEnterAnim = -1;
        this.popExitAnim = -1;
        this.enterAnim = -1;
        this.exitAnim = -1;
    }
}
