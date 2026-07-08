package com.ss.android.ugc.aweme.tools.beauty.env;

import X.C12HG;
import X.C12JZ;
import X.C1663140tNg;
import X.InterfaceC1294060jmO;
import X.InterfaceC1663190tNl;
import X.InterfaceC1663200tNm;
import X.InterfaceC19734612Jc;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public final class BeautyContext extends C1663140tNg {
    public static int beautificationMode;
    public static C12HG beautyDataMonitor;
    public static Function2<? super Context, ? super String, Unit> beautyDmtToast;
    public static C12JZ beautyResetDialog;
    public static InterfaceC19734612Jc beautyToast;
    public static Context context;
    public static boolean enableQuickShootExperiment;
    public static boolean isBeautyClearGenderRecognize;
    public static boolean isMBeautyMode;
    public static InterfaceC1663200tNm storeFullDialog;
    public static boolean ulikeSupportSeekClear;
    public static InterfaceC1663190tNl useBeautyComposer;
    public static boolean useMInstantBeauty;
    public static final BeautyContext INSTANCE = new BeautyContext();
    public static boolean useComposerPanel = true;
    public static boolean supportSeekClear = true;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUlikeSupportSeekClear$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUseComposerPanel$annotations() {
    }

    public final void destroy() {
        beautyToast = null;
        beautyDmtToast = null;
        beautyResetDialog = null;
    }

    public final boolean enableQuickShootExperiment() {
        return enableQuickShootExperiment;
    }

    public final int getBeautificationMode() {
        return beautificationMode;
    }

    public final C12HG getBeautyDataMonitor() {
        return beautyDataMonitor;
    }

    public final C12JZ getBeautyDialog() {
        return beautyResetDialog;
    }

    public final Function2<Context, String, Unit> getBeautyDmtToast() {
        return beautyDmtToast;
    }

    public final InterfaceC19734612Jc getBeautyToast() {
        return beautyToast;
    }

    public final Context getContext() {
        return context;
    }

    public final InterfaceC1663200tNm getStoreFullDialog() {
        return storeFullDialog;
    }

    @InterfaceC1294060jmO
    public final boolean getUlikeSupportSeekClear() {
        return ulikeSupportSeekClear;
    }

    public final boolean isClearBeautyGenderRecognize() {
        return isBeautyClearGenderRecognize;
    }

    public final boolean isMBeautyMode() {
        return isMBeautyMode;
    }

    public final boolean supportSeekClear() {
        return supportSeekClear;
    }

    public final InterfaceC1663190tNl useComposer() {
        return useBeautyComposer;
    }

    @InterfaceC1294060jmO
    public final boolean useComposerBeautyPanel() {
        return useComposerPanel;
    }

    public final boolean useMInstantBeauty() {
        return useMInstantBeauty;
    }

    public final void setBeautificationMode(int i) {
        beautificationMode = i;
    }

    public final void setBeautyDataMonitor(C12HG c12hg) {
        beautyDataMonitor = c12hg;
    }

    public final void setBeautyDialog(C12JZ c12jz) {
        beautyResetDialog = c12jz;
    }

    public final void setContext(Context context2) {
        context = context2;
    }

    public final void setDmtToastImpl(Function2<? super Context, ? super String, Unit> function2) {
        beautyDmtToast = function2;
    }

    public final void setEnableQuickShootExperiment(boolean z) {
        enableQuickShootExperiment = z;
    }

    public final void setIsMBeautyMode(boolean z) {
        isMBeautyMode = z;
    }

    public final void setStoreFullDialog(InterfaceC1663200tNm interfaceC1663200tNm) {
        storeFullDialog = interfaceC1663200tNm;
    }

    public final void setSupportSeekClear(boolean z) {
        supportSeekClear = z;
    }

    public final void setToastImpl(InterfaceC19734612Jc interfaceC19734612Jc) {
        beautyToast = interfaceC19734612Jc;
    }

    @InterfaceC1294060jmO
    public final void setUlikeSupportSeekClear(boolean z) {
        ulikeSupportSeekClear = z;
    }

    public final void setUseComposer(InterfaceC1663190tNl interfaceC1663190tNl) {
        useBeautyComposer = interfaceC1663190tNl;
    }

    @InterfaceC1294060jmO
    public final void setUseComposerBeautyPanel(boolean z) {
        useComposerPanel = z;
    }

    public final void setUseMInstantBeauty(boolean z) {
        useMInstantBeauty = z;
    }
}
