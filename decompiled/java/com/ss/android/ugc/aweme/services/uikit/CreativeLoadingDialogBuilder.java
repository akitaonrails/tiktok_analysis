package com.ss.android.ugc.aweme.services.uikit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CreativeLoadingDialogBuilder {
    public final CreativeLoadingDialogConfig config = new CreativeLoadingDialogConfig(CancelType.GONE, false, null, null, null, null, AFwS273S0000000_29.get$arr$(99), false, false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CancelType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ CancelType[] $VALUES;
        public static final CancelType GONE = new CancelType("GONE", 0);
        public static final CancelType VISIBLE = new CancelType("VISIBLE", 1);
        public static final CancelType VISIBLE_AFTER_5S = new CancelType("VISIBLE_AFTER_5S", 2);
        public static final CancelType VISIBLE_AFTER_15S = new CancelType("VISIBLE_AFTER_15S", 3);

        public static final /* synthetic */ CancelType[] $values() {
            return new CancelType[]{GONE, VISIBLE, VISIBLE_AFTER_5S, VISIBLE_AFTER_15S};
        }

        public static InterfaceC2044707zh<CancelType> getEntries() {
            return $ENTRIES;
        }

        static {
            CancelType[] cancelTypeArr$values = $values();
            $VALUES = cancelTypeArr$values;
            $ENTRIES = new C2254308sP(cancelTypeArr$values);
        }

        public static CancelType[] values() {
            return (CancelType[]) $VALUES.clone();
        }

        public static CancelType valueOf(String str) {
            return (CancelType) C08FF.LIZ(CancelType.class, str);
        }

        public CancelType(String str, int i) {
        }
    }

    public final CreativeLoadingDialogConfig getConfig() {
        return this.config;
    }

    public final CreativeLoadingDialogBuilder backCanCancel(boolean z) {
        this.config.setBackCanCancel(z);
        return this;
    }

    public final CreativeLoadingDialogBuilder cancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.config.setCancelListener(onCancelListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder cancelViewVisibleType(CancelType cancelType) {
        this.config.setCancelViewVisibleType(cancelType);
        return this;
    }

    public final CreativeLoadingDialogBuilder clickCancelListener(Function1<? super Dialog, Unit> function1) {
        this.config.setClickCancelListener(function1);
        return this;
    }

    public final CreativeLoadingDialogBuilder dismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.config.setDismissListener(onDismissListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder hasOverLay(boolean z) {
        this.config.setHasOverLay(z);
        return this;
    }

    public final CreativeLoadingDialogBuilder loadingMessage(String str) {
        this.config.setMessage(str);
        return this;
    }

    public final CreativeLoadingDialogBuilder showListener(DialogInterface.OnShowListener onShowListener) {
        this.config.setShowListener(onShowListener);
        return this;
    }

    public final CreativeLoadingDialogBuilder showProgress(boolean z) {
        this.config.setShowProgress(z);
        return this;
    }
}
