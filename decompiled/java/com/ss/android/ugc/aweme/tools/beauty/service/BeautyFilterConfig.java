package com.ss.android.ugc.aweme.tools.beauty.service;

import X.C12HE;
import X.C19729812Hg;
import X.C2188811AlT;
import X.EnumC19731112Ht;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautyFilterConfig {
    public static final C19729812Hg Companion = new Object() { // from class: X.12Hg
    };
    public final int abGroup;
    public boolean autoApplyBeauty;
    public boolean beautyDownloadToThread;
    public boolean beautyEffectOptimize;
    public boolean beautyMainSwitchConfig;
    public boolean beautyMobAddConfig;
    public int beautyOptimizeEffectChange;
    public boolean enableRecordBeautyEligibility;
    public Function1<? super ComposerBeautyExtraBeautify, Unit> getChildrenInitBeautyValueVBlock;
    public final boolean hasTitle;
    public boolean isConvertKey;
    public int itemShape;
    public NoneComposer noneItem;
    public boolean primaryBeautyPanelEnable;
    public final String sequenceKey;
    public boolean uLike2ComposerTagValueConvert;
    public Function1<? super Function0<Unit>, Boolean> updateComposerNodesInterceptor;
    public boolean useResetAll = true;
    public String extraJson = "beautify";
    public EnumC19731112Ht defaultGender = EnumC19731112Ht.FEMALE;
    public C12HE dataConfig = new C12HE();
    public boolean beautySwitchStatus = true;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getItemShape$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUseResetAll$annotations() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyFilterConfig(abGroup=");
        sbLIZ.append(this.abGroup);
        sbLIZ.append(", sequenceKey=");
        sbLIZ.append(this.sequenceKey);
        sbLIZ.append(", hasTitle=");
        sbLIZ.append(this.hasTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isConvertKey() {
        return this.isConvertKey;
    }

    public final void setAutoApplyBeauty(boolean z) {
        this.autoApplyBeauty = z;
    }

    public final void setBeautyDownloadToThread(boolean z) {
        this.beautyDownloadToThread = z;
    }

    public final void setBeautyEffectOptimize(boolean z) {
        this.beautyEffectOptimize = z;
    }

    public final void setBeautyMainSwitchConfig(boolean z) {
        this.beautyMainSwitchConfig = z;
    }

    public final void setBeautyMobAddConfig(boolean z) {
        this.beautyMobAddConfig = z;
    }

    public final void setBeautyOptimizeEffectChange(int i) {
        this.beautyOptimizeEffectChange = i;
    }

    public final void setBeautySwitchStatus(boolean z) {
        this.beautySwitchStatus = z;
    }

    public final void setConvertKey(boolean z) {
        this.isConvertKey = z;
    }

    public final void setDataConfig(C12HE c12he) {
        this.dataConfig = c12he;
    }

    public final void setDefaultGender(EnumC19731112Ht enumC19731112Ht) {
        this.defaultGender = enumC19731112Ht;
    }

    public final void setEnableRecordBeautyEligibility(boolean z) {
        this.enableRecordBeautyEligibility = z;
    }

    public final void setExtraJson(String str) {
        this.extraJson = str;
    }

    public final void setGetChildrenInitBeautyValueVBlock(Function1<? super ComposerBeautyExtraBeautify, Unit> function1) {
        this.getChildrenInitBeautyValueVBlock = function1;
    }

    public final void setItemShape(int i) {
        this.itemShape = i;
    }

    public final void setNoneItem(NoneComposer noneComposer) {
        this.noneItem = noneComposer;
    }

    public final void setPrimaryBeautyPanelEnable(boolean z) {
        this.primaryBeautyPanelEnable = z;
    }

    public final void setULike2ComposerTagValueConvert(boolean z) {
        this.uLike2ComposerTagValueConvert = z;
    }

    public final void setUpdateComposerNodesInterceptor(Function1<? super Function0<Unit>, Boolean> function1) {
        this.updateComposerNodesInterceptor = function1;
    }

    public final void setUseResetAll(boolean z) {
        this.useResetAll = z;
    }

    public BeautyFilterConfig(int i, String str, boolean z) {
        this.abGroup = i;
        this.sequenceKey = str;
        this.hasTitle = z;
    }
}
