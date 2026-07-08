package com.ss.android.ugc.aweme.services.uikit;

import com.ss.android.ugc.aweme.services.uikit.CreativeToast;

/* JADX INFO: loaded from: classes22.dex */
public final class CreativeToastConfig {
    public Boolean acrossActivities;
    public boolean blockContinuousToast;
    public CreativeToast.OnDismissListener dismissListener;
    public Long duration;
    public Boolean hasDismissAnimation;
    public Integer icon;
    public Integer iconColor;
    public Integer iconColorRes;
    public boolean isCenterToast;
    public Integer maxWidth;
    public String message;
    public Integer messageRes;
    public CreativeToast.OnShowListener showListener;
    public Integer themeRes;

    public CreativeToastConfig() {
        this(false, null, null, null, null, null, null, null, null, null, false, null, null, null);
    }

    public String toString() {
        return "CreativeToastConfig(isCenterToast=" + this.isCenterToast + ", message=" + this.message + ", messageRes=" + this.messageRes + ", duration=" + this.duration + ", icon=" + this.icon + ", iconColor=" + this.iconColor + ", iconColorRes=" + this.iconColorRes + ", maxWidth=" + this.maxWidth + ", acrossActivities=" + this.acrossActivities + ", themeRes=" + this.themeRes + ", blockContinuousToast=" + this.blockContinuousToast + ", hasDismissAnimation=" + this.hasDismissAnimation + ", dismissListener=" + this.dismissListener + ", showListener=" + this.showListener + ')';
    }

    public final boolean isCenterToast() {
        return this.isCenterToast;
    }

    public final void setAcrossActivities(Boolean bool) {
        this.acrossActivities = bool;
    }

    public final void setBlockContinuousToast(boolean z) {
        this.blockContinuousToast = z;
    }

    public final void setCenterToast(boolean z) {
        this.isCenterToast = z;
    }

    public final void setDismissListener(CreativeToast.OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public final void setHasDismissAnimation(Boolean bool) {
        this.hasDismissAnimation = bool;
    }

    public final void setIcon(Integer num) {
        this.icon = num;
    }

    public final void setIconColor(Integer num) {
        this.iconColor = num;
    }

    public final void setIconColorRes(Integer num) {
        this.iconColorRes = num;
    }

    public final void setMaxWidth(Integer num) {
        this.maxWidth = num;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMessageRes(Integer num) {
        this.messageRes = num;
    }

    public final void setShowListener(CreativeToast.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    public final void setThemeRes(Integer num) {
        this.themeRes = num;
    }

    public CreativeToastConfig(boolean z, String str, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, boolean z2, Boolean bool2, CreativeToast.OnDismissListener onDismissListener, CreativeToast.OnShowListener onShowListener) {
        this.isCenterToast = z;
        this.message = str;
        this.messageRes = num;
        this.duration = l;
        this.icon = num2;
        this.iconColor = num3;
        this.iconColorRes = num4;
        this.maxWidth = num5;
        this.acrossActivities = bool;
        this.themeRes = num6;
        this.blockContinuousToast = z2;
        this.hasDismissAnimation = bool2;
        this.dismissListener = onDismissListener;
        this.showListener = onShowListener;
    }
}
