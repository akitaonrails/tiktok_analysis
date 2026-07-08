package com.ss.android.ugc.aweme.services.uikit;

import android.app.Dialog;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CreativeLoadingDialogConfig {
    public boolean backCanCancel;
    public DialogInterface.OnCancelListener cancelListener;
    public CreativeLoadingDialogBuilder.CancelType cancelViewVisibleType;
    public Function1<? super Dialog, Unit> clickCancelListener;
    public DialogInterface.OnDismissListener dismissListener;
    public boolean hasOverLay;
    public boolean isShowProgress;
    public String message;
    public DialogInterface.OnShowListener showListener;

    public CreativeLoadingDialogConfig() {
        this(CreativeLoadingDialogBuilder.CancelType.GONE, false, null, null, null, null, AFwS273S0000000_29.get$arr$(99), false, false);
    }

    public final boolean isShowProgress() {
        return this.isShowProgress;
    }

    public final void setBackCanCancel(boolean z) {
        this.backCanCancel = z;
    }

    public final void setCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.cancelListener = onCancelListener;
    }

    public final void setCancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType cancelType) {
        this.cancelViewVisibleType = cancelType;
    }

    public final void setClickCancelListener(Function1<? super Dialog, Unit> function1) {
        this.clickCancelListener = function1;
    }

    public final void setDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
    }

    public final void setHasOverLay(boolean z) {
        this.hasOverLay = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setShowListener(DialogInterface.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    public final void setShowProgress(boolean z) {
        this.isShowProgress = z;
    }

    public CreativeLoadingDialogConfig(CreativeLoadingDialogBuilder.CancelType cancelType, boolean z, String str, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnCancelListener onCancelListener, Function1<? super Dialog, Unit> function1, boolean z2, boolean z3) {
        this.cancelViewVisibleType = cancelType;
        this.isShowProgress = z;
        this.message = str;
        this.dismissListener = onDismissListener;
        this.showListener = onShowListener;
        this.cancelListener = onCancelListener;
        this.clickCancelListener = function1;
        this.hasOverLay = z2;
        this.backCanCancel = z3;
    }
}
