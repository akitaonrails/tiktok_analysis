package com.ss.android.ugc.aweme.services.uikit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;

/* JADX INFO: loaded from: classes22.dex */
public final class CreativeToastBuilder {
    public final CreativeToastConfig config = new CreativeToastConfig(false, null, null, null, null, null, null, null, null, null, false, null, null, null);
    public final OriginUsingToast originUsingToast = new OriginUsingToast(false, false);

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

    public final CreativeToastConfig getConfig() {
        return this.config;
    }

    public final OriginUsingToast getOriginUsingToast() {
        return this.originUsingToast;
    }

    public final CreativeToastBuilder acrossActivities(boolean z) {
        this.config.setAcrossActivities(Boolean.valueOf(z));
        return this;
    }

    public final CreativeToastBuilder blockContinuousToast(boolean z) {
        this.config.setBlockContinuousToast(z);
        return this;
    }

    public final CreativeToastBuilder duration(long j) {
        this.config.setDuration(Long.valueOf(j));
        return this;
    }

    public final CreativeToastBuilder forceTheme(int i) {
        this.config.setThemeRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder hasDismissAnimation(boolean z) {
        this.config.setHasDismissAnimation(Boolean.valueOf(z));
        return this;
    }

    public final CreativeToastBuilder icon(int i) {
        this.config.setIcon(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder iconColor(int i) {
        this.config.setIconColor(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder iconColorRes(int i) {
        this.config.setIconColorRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder isCenterToast(boolean z) {
        this.config.setCenterToast(z);
        return this;
    }

    public final CreativeToastBuilder isTuxToast(boolean z) {
        this.originUsingToast.setTuxToast(z);
        return this;
    }

    public final CreativeToastBuilder isTuxToastLegacy(boolean z) {
        this.originUsingToast.setTuxToastLegacy(z);
        return this;
    }

    public final CreativeToastBuilder message(String str) {
        this.config.setMessage(str);
        return this;
    }

    public final CreativeToastBuilder messageRes(int i) {
        this.config.setMessageRes(Integer.valueOf(i));
        return this;
    }

    public final CreativeToastBuilder onDismissListener(CreativeToast.OnDismissListener onDismissListener) {
        this.config.setDismissListener(onDismissListener);
        return this;
    }

    public final CreativeToastBuilder onShowListener(CreativeToast.OnShowListener onShowListener) {
        this.config.setShowListener(onShowListener);
        return this;
    }
}
