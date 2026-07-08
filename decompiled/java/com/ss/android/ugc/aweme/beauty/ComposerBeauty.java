package com.ss.android.ugc.aweme.beauty;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ComposerBeauty {
    public boolean add2Nodes;
    public final ComposerBeautyExtraBeautify beautifyExtra;
    public final boolean categoryExclusive;
    public final BeautyCategoryExtra categoryExtra;
    public final String categoryId;
    public final List<ComposerBeauty> childList;
    public int defaultProgress;
    public int downloadStateInternal;
    public transient Function0<Integer> downloadStateLazy;
    public final Effect effect;
    public boolean enable;
    public final ComposerBeautyExtra extra;
    public final boolean isBeautyMode;
    public final boolean isCollectionType;
    public boolean isLocalItem;
    public int localIconResId;
    public final String parentId;
    public final String parentName;
    public final String parentResId;
    public int progressValue;
    public int secondProgressValue;
    public boolean selected;
    public boolean showDot;
    public boolean showRedDot;

    public final int getDownloadState() {
        if (this.downloadStateInternal == 1) {
            Function0<Integer> function0 = this.downloadStateLazy;
            this.downloadStateInternal = function0 != null ? function0.invoke().intValue() : 1;
            this.downloadStateLazy = null;
        }
        return this.downloadStateInternal;
    }

    public int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean needFaceDetect() {
        Iterator<String> it2 = this.effect.getRequirements().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (Intrinsics.LJFF(next, "faceDetect")) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean getAdd2Nodes() {
        return this.add2Nodes;
    }

    public final ComposerBeautyExtraBeautify getBeautifyExtra() {
        return this.beautifyExtra;
    }

    public final boolean getCategoryExclusive() {
        return this.categoryExclusive;
    }

    public final BeautyCategoryExtra getCategoryExtra() {
        return this.categoryExtra;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<ComposerBeauty> getChildList() {
        return this.childList;
    }

    public final int getDefaultProgress() {
        return this.defaultProgress;
    }

    public final Function0<Integer> getDownloadStateLazy() {
        return this.downloadStateLazy;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ComposerBeautyExtra getExtra() {
        return this.extra;
    }

    public final int getLocalIconResId() {
        return this.localIconResId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final String getParentResId() {
        return this.parentResId;
    }

    public final int getProgressValue() {
        return this.progressValue;
    }

    public final int getSecondProgressValue() {
        return this.secondProgressValue;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowDot() {
        return this.showDot;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final boolean isBeautyMode() {
        return this.isBeautyMode;
    }

    public final boolean isCollectionType() {
        return this.isCollectionType;
    }

    public final boolean isLocalItem() {
        return this.isLocalItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeauty)) {
            return false;
        }
        boolean z = this.isBeautyMode;
        if (z) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            if (z != composerBeauty.isBeautyMode) {
                return false;
            }
            return Intrinsics.LJFF(composerBeauty.categoryExtra.categoryId, this.categoryExtra.categoryId);
        }
        ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
        if (Intrinsics.LJFF(composerBeauty2.effect.getEffectId(), this.effect.getEffectId()) && Intrinsics.LJFF(this.categoryId, composerBeauty2.categoryId) && Intrinsics.LJFF(this.parentId, composerBeauty2.parentId)) {
            return true;
        }
        return false;
    }

    public final void setAdd2Nodes(boolean z) {
        this.add2Nodes = z;
    }

    public final void setDefaultProgress(int i) {
        this.defaultProgress = i;
    }

    public final void setDownloadState(int i) {
        this.downloadStateLazy = null;
        this.downloadStateInternal = i;
    }

    public final void setDownloadStateLazy(Function0<Integer> function0) {
        this.downloadStateLazy = function0;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setLocalIconResId(int i) {
        this.localIconResId = i;
    }

    public final void setLocalItem(boolean z) {
        this.isLocalItem = z;
    }

    public final void setProgressValue(int i) {
        this.progressValue = i;
    }

    public final void setSecondProgressValue(int i) {
        this.secondProgressValue = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowDot(boolean z) {
        this.showDot = z;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }

    public ComposerBeauty(Effect effect, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, String str, boolean z, boolean z2, String str2, String str3, String str4, List<ComposerBeauty> list, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6, boolean z7, boolean z8, int i3, int i4, int i5, BeautyCategoryExtra beautyCategoryExtra, boolean z9) {
        this.effect = effect;
        this.extra = composerBeautyExtra;
        this.beautifyExtra = composerBeautyExtraBeautify;
        this.categoryId = str;
        this.categoryExclusive = z;
        this.isCollectionType = z2;
        this.parentId = str2;
        this.parentName = str3;
        this.parentResId = str4;
        this.childList = list;
        this.selected = z3;
        this.showRedDot = z4;
        this.showDot = z5;
        this.progressValue = i;
        this.secondProgressValue = i2;
        this.enable = z6;
        this.add2Nodes = z7;
        this.isLocalItem = z8;
        this.localIconResId = i3;
        this.defaultProgress = i4;
        this.downloadStateInternal = i5;
        this.categoryExtra = beautyCategoryExtra;
        this.isBeautyMode = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComposerBeauty(Effect effect, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, String str, boolean z, boolean z2, String str2, String str3, String str4, List list, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6, boolean z7, boolean z8, int i3, int i4, int i5, BeautyCategoryExtra beautyCategoryExtra, boolean z9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z10 = z9;
        BeautyCategoryExtra beautyCategoryExtra2 = beautyCategoryExtra;
        int i7 = i5;
        int i8 = i4;
        int i9 = i3;
        boolean z11 = z8;
        boolean z12 = z7;
        boolean z13 = z6;
        int i10 = i2;
        int i11 = i;
        boolean z14 = z5;
        boolean z15 = z4;
        boolean z16 = z3;
        String str5 = str4;
        String str6 = str3;
        boolean z17 = z2;
        boolean z18 = z;
        String str7 = str2;
        String str8 = (i6 & 8) != 0 ? "" : str;
        z18 = (i6 & 16) != 0 ? false : z18;
        z17 = (i6 & 32) != 0 ? false : z17;
        str7 = (i6 & 64) != 0 ? null : str7;
        str6 = (i6 & 128) != 0 ? null : str6;
        str5 = (i6 & 256) != 0 ? null : str5;
        List list2 = (i6 & 512) == 0 ? list : null;
        z16 = (i6 & 1024) != 0 ? false : z16;
        z15 = (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z15;
        z14 = (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z14;
        i11 = (i6 & 8192) != 0 ? 0 : i11;
        this(effect, composerBeautyExtra, composerBeautyExtraBeautify, str8, z18, z17, str7, str6, str5, list2, z16, z15, z14, i11, (i6 & 16384) != 0 ? i11 : i10, (32768 & i6) != 0 ? true : z13, (65536 & i6) != 0 ? false : z12, (131072 & i6) != 0 ? false : z11, (262144 & i6) != 0 ? -1 : i9, (524288 & i6) != 0 ? 0 : i8, (1048576 & i6) != 0 ? 1 : i7, (2097152 & i6) != 0 ? new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null) : beautyCategoryExtra2, (i6 & 4194304) != 0 ? false : z10);
    }
}
