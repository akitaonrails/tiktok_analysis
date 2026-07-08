package com.ss.android.ugc.aweme.effectcreator.models;

import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPackageDataWrapper implements Parcelable {
    public static final Parcelable.Creator<EffectPackageDataWrapper> CREATOR = new Parcelable.Creator<EffectPackageDataWrapper>() { // from class: X.0vKa
        @Override // android.os.Parcelable.Creator
        public final EffectPackageDataWrapper createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList.add(EffectObjectDataWrapper.CREATOR.createFromParcel(parcel));
            }
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList2.add(EffectCommandDataWrapper.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string7 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(EffectHint.CREATOR.createFromParcel(parcel));
            }
            int i15 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            int i16 = parcel.readInt();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EffectPackageDataWrapper(string, string2, string3, string4, string5, string6, j, j2, j3, j4, i, i2, i3, i4, i5, i6, i7, i8, arrayList, arrayList2, boolValueOf, string7, arrayList3, i15, z2, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, i16, string20, string21, string22, string23, string24, string25, string26, string27, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectPackageDataWrapper[] newArray(int i) {
            return new EffectPackageDataWrapper[i];
        }
    };
    public final int actionCount;
    public final String ameAigcAigcModelId;
    public final String ameAigcEnterFrom;
    public final String ameAigcFl2vPresetId;
    public final boolean ameAigcIfAddReference;
    public final String ameAigcPresetId;
    public final String ameAigcPromptTextAfterTrans;
    public final String ameAigcPromptTextAfterTransFl2v;
    public final String ameAigcPromptTextBeforeTrans;
    public final String ameAigcPromptTextBeforeTransFl2v;
    public final String ameAigcStyleId;
    public final int ameAigcType;
    public final String ameEnterFrom;
    public final String ameSaveFrom;
    public final String anyFromDiscover;
    public List<EffectHint> availableEffectHintList;
    public final String campaignBindMethod;
    public final String campaignId;
    public final int commandCount;
    public final List<EffectCommandDataWrapper> commandDataList;
    public final boolean containsAIMakeup;
    public final long duration;
    public final String enterFrom;
    public final String enterType;
    public final long interactionDuration;
    public final Boolean isFromTemplateUnedited;
    public final long layerDuration;
    public final int objectCount;
    public final List<EffectObjectDataWrapper> objectDataList;
    public final String openGLVersion;
    public final int performanceScore;
    public final String projectId;
    public final long projectSize;
    public final String projectSource;
    public final String publishSource;
    public final int sequenceCount;
    public final String shootPageEnterFrom;
    public final String shootTabName;
    public final String shootWay;
    public final String tabKey;
    public final String templateId;
    public final String templateResId;
    public final int triggerCount;
    public final String userEntryMethod;
    public final int validActionCount;
    public final int validCommandCount;
    public final int validTriggerCount;

    public EffectPackageDataWrapper() {
        this(null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, -1, 32767);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectPackageDataWrapper)) {
            return false;
        }
        EffectPackageDataWrapper effectPackageDataWrapper = (EffectPackageDataWrapper) obj;
        return Intrinsics.LJFF(this.projectId, effectPackageDataWrapper.projectId) && Intrinsics.LJFF(this.projectSource, effectPackageDataWrapper.projectSource) && Intrinsics.LJFF(this.publishSource, effectPackageDataWrapper.publishSource) && Intrinsics.LJFF(this.enterFrom, effectPackageDataWrapper.enterFrom) && Intrinsics.LJFF(this.templateId, effectPackageDataWrapper.templateId) && Intrinsics.LJFF(this.templateResId, effectPackageDataWrapper.templateResId) && this.projectSize == effectPackageDataWrapper.projectSize && this.duration == effectPackageDataWrapper.duration && this.layerDuration == effectPackageDataWrapper.layerDuration && this.interactionDuration == effectPackageDataWrapper.interactionDuration && this.objectCount == effectPackageDataWrapper.objectCount && this.commandCount == effectPackageDataWrapper.commandCount && this.triggerCount == effectPackageDataWrapper.triggerCount && this.actionCount == effectPackageDataWrapper.actionCount && this.validCommandCount == effectPackageDataWrapper.validCommandCount && this.validActionCount == effectPackageDataWrapper.validActionCount && this.validTriggerCount == effectPackageDataWrapper.validTriggerCount && this.sequenceCount == effectPackageDataWrapper.sequenceCount && Intrinsics.LJFF(this.objectDataList, effectPackageDataWrapper.objectDataList) && Intrinsics.LJFF(this.commandDataList, effectPackageDataWrapper.commandDataList) && Intrinsics.LJFF(this.isFromTemplateUnedited, effectPackageDataWrapper.isFromTemplateUnedited) && Intrinsics.LJFF(this.ameSaveFrom, effectPackageDataWrapper.ameSaveFrom) && Intrinsics.LJFF(this.availableEffectHintList, effectPackageDataWrapper.availableEffectHintList) && this.performanceScore == effectPackageDataWrapper.performanceScore && this.containsAIMakeup == effectPackageDataWrapper.containsAIMakeup && Intrinsics.LJFF(this.userEntryMethod, effectPackageDataWrapper.userEntryMethod) && Intrinsics.LJFF(this.shootWay, effectPackageDataWrapper.shootWay) && Intrinsics.LJFF(this.anyFromDiscover, effectPackageDataWrapper.anyFromDiscover) && Intrinsics.LJFF(this.tabKey, effectPackageDataWrapper.tabKey) && Intrinsics.LJFF(this.shootTabName, effectPackageDataWrapper.shootTabName) && Intrinsics.LJFF(this.ameEnterFrom, effectPackageDataWrapper.ameEnterFrom) && Intrinsics.LJFF(this.campaignId, effectPackageDataWrapper.campaignId) && Intrinsics.LJFF(this.campaignBindMethod, effectPackageDataWrapper.campaignBindMethod) && Intrinsics.LJFF(this.enterType, effectPackageDataWrapper.enterType) && Intrinsics.LJFF(this.shootPageEnterFrom, effectPackageDataWrapper.shootPageEnterFrom) && Intrinsics.LJFF(this.ameAigcEnterFrom, effectPackageDataWrapper.ameAigcEnterFrom) && Intrinsics.LJFF(this.openGLVersion, effectPackageDataWrapper.openGLVersion) && this.ameAigcType == effectPackageDataWrapper.ameAigcType && Intrinsics.LJFF(this.ameAigcStyleId, effectPackageDataWrapper.ameAigcStyleId) && Intrinsics.LJFF(this.ameAigcAigcModelId, effectPackageDataWrapper.ameAigcAigcModelId) && Intrinsics.LJFF(this.ameAigcPresetId, effectPackageDataWrapper.ameAigcPresetId) && Intrinsics.LJFF(this.ameAigcPromptTextBeforeTrans, effectPackageDataWrapper.ameAigcPromptTextBeforeTrans) && Intrinsics.LJFF(this.ameAigcPromptTextAfterTrans, effectPackageDataWrapper.ameAigcPromptTextAfterTrans) && Intrinsics.LJFF(this.ameAigcFl2vPresetId, effectPackageDataWrapper.ameAigcFl2vPresetId) && Intrinsics.LJFF(this.ameAigcPromptTextBeforeTransFl2v, effectPackageDataWrapper.ameAigcPromptTextBeforeTransFl2v) && Intrinsics.LJFF(this.ameAigcPromptTextAfterTransFl2v, effectPackageDataWrapper.ameAigcPromptTextAfterTransFl2v) && this.ameAigcIfAddReference == effectPackageDataWrapper.ameAigcIfAddReference;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((this.projectId.hashCode() * 31) + this.projectSource.hashCode()) * 31) + this.publishSource.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.templateId.hashCode()) * 31) + this.templateResId.hashCode()) * 31) + C786410Ut5.Y2(this.projectSize)) * 31) + C786410Ut5.Y2(this.duration)) * 31) + C786410Ut5.Y2(this.layerDuration)) * 31) + C786410Ut5.Y2(this.interactionDuration)) * 31) + this.objectCount) * 31) + this.commandCount) * 31) + this.triggerCount) * 31) + this.actionCount) * 31) + this.validCommandCount) * 31) + this.validActionCount) * 31) + this.validTriggerCount) * 31) + this.sequenceCount) * 31) + this.objectDataList.hashCode()) * 31) + this.commandDataList.hashCode()) * 31;
        Boolean bool = this.isFromTemplateUnedited;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.ameSaveFrom.hashCode()) * 31) + this.availableEffectHintList.hashCode()) * 31) + this.performanceScore) * 31) + C786410Ut5.Z2(this.containsAIMakeup)) * 31) + this.userEntryMethod.hashCode()) * 31) + this.shootWay.hashCode()) * 31) + this.anyFromDiscover.hashCode()) * 31) + this.tabKey.hashCode()) * 31) + this.shootTabName.hashCode()) * 31) + this.ameEnterFrom.hashCode()) * 31) + this.campaignId.hashCode()) * 31) + this.campaignBindMethod.hashCode()) * 31) + this.enterType.hashCode()) * 31) + this.shootPageEnterFrom.hashCode()) * 31) + this.ameAigcEnterFrom.hashCode()) * 31) + this.openGLVersion.hashCode()) * 31) + this.ameAigcType) * 31) + this.ameAigcStyleId.hashCode()) * 31) + this.ameAigcAigcModelId.hashCode()) * 31) + this.ameAigcPresetId.hashCode()) * 31) + this.ameAigcPromptTextBeforeTrans.hashCode()) * 31) + this.ameAigcPromptTextAfterTrans.hashCode()) * 31) + this.ameAigcFl2vPresetId.hashCode()) * 31) + this.ameAigcPromptTextBeforeTransFl2v.hashCode()) * 31) + this.ameAigcPromptTextAfterTransFl2v.hashCode()) * 31) + C786410Ut5.Z2(this.ameAigcIfAddReference);
    }

    public final String toString() {
        return "EffectPackageDataWrapper(projectId=" + this.projectId + ", projectSource=" + this.projectSource + ", publishSource=" + this.publishSource + ", enterFrom=" + this.enterFrom + ", templateId=" + this.templateId + ", templateResId=" + this.templateResId + ", projectSize=" + this.projectSize + ", duration=" + this.duration + ", layerDuration=" + this.layerDuration + ", interactionDuration=" + this.interactionDuration + ", objectCount=" + this.objectCount + ", commandCount=" + this.commandCount + ", triggerCount=" + this.triggerCount + ", actionCount=" + this.actionCount + ", validCommandCount=" + this.validCommandCount + ", validActionCount=" + this.validActionCount + ", validTriggerCount=" + this.validTriggerCount + ", sequenceCount=" + this.sequenceCount + ", objectDataList=" + this.objectDataList + ", commandDataList=" + this.commandDataList + ", isFromTemplateUnedited=" + this.isFromTemplateUnedited + ", ameSaveFrom=" + this.ameSaveFrom + ", availableEffectHintList=" + this.availableEffectHintList + ", performanceScore=" + this.performanceScore + ", containsAIMakeup=" + this.containsAIMakeup + ", userEntryMethod=" + this.userEntryMethod + ", shootWay=" + this.shootWay + ", anyFromDiscover=" + this.anyFromDiscover + ", tabKey=" + this.tabKey + ", shootTabName=" + this.shootTabName + ", ameEnterFrom=" + this.ameEnterFrom + ", campaignId=" + this.campaignId + ", campaignBindMethod=" + this.campaignBindMethod + ", enterType=" + this.enterType + ", shootPageEnterFrom=" + this.shootPageEnterFrom + ", ameAigcEnterFrom=" + this.ameAigcEnterFrom + ", openGLVersion=" + this.openGLVersion + ", ameAigcType=" + this.ameAigcType + ", ameAigcStyleId=" + this.ameAigcStyleId + ", ameAigcAigcModelId=" + this.ameAigcAigcModelId + ", ameAigcPresetId=" + this.ameAigcPresetId + ", ameAigcPromptTextBeforeTrans=" + this.ameAigcPromptTextBeforeTrans + ", ameAigcPromptTextAfterTrans=" + this.ameAigcPromptTextAfterTrans + ", ameAigcFl2vPresetId=" + this.ameAigcFl2vPresetId + ", ameAigcPromptTextBeforeTransFl2v=" + this.ameAigcPromptTextBeforeTransFl2v + ", ameAigcPromptTextAfterTransFl2v=" + this.ameAigcPromptTextAfterTransFl2v + ", ameAigcIfAddReference=" + this.ameAigcIfAddReference + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.projectId);
        parcel.writeString(this.projectSource);
        parcel.writeString(this.publishSource);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateResId);
        parcel.writeLong(this.projectSize);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.layerDuration);
        parcel.writeLong(this.interactionDuration);
        parcel.writeInt(this.objectCount);
        parcel.writeInt(this.commandCount);
        parcel.writeInt(this.triggerCount);
        parcel.writeInt(this.actionCount);
        parcel.writeInt(this.validCommandCount);
        parcel.writeInt(this.validActionCount);
        parcel.writeInt(this.validTriggerCount);
        parcel.writeInt(this.sequenceCount);
        List<EffectObjectDataWrapper> list = this.objectDataList;
        parcel.writeInt(list.size());
        Iterator<EffectObjectDataWrapper> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<EffectCommandDataWrapper> list2 = this.commandDataList;
        parcel.writeInt(list2.size());
        Iterator<EffectCommandDataWrapper> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Boolean bool = this.isFromTemplateUnedited;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.ameSaveFrom);
        List<EffectHint> list3 = this.availableEffectHintList;
        parcel.writeInt(list3.size());
        Iterator<EffectHint> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.performanceScore);
        parcel.writeInt(this.containsAIMakeup ? 1 : 0);
        parcel.writeString(this.userEntryMethod);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.anyFromDiscover);
        parcel.writeString(this.tabKey);
        parcel.writeString(this.shootTabName);
        parcel.writeString(this.ameEnterFrom);
        parcel.writeString(this.campaignId);
        parcel.writeString(this.campaignBindMethod);
        parcel.writeString(this.enterType);
        parcel.writeString(this.shootPageEnterFrom);
        parcel.writeString(this.ameAigcEnterFrom);
        parcel.writeString(this.openGLVersion);
        parcel.writeInt(this.ameAigcType);
        parcel.writeString(this.ameAigcStyleId);
        parcel.writeString(this.ameAigcAigcModelId);
        parcel.writeString(this.ameAigcPresetId);
        parcel.writeString(this.ameAigcPromptTextBeforeTrans);
        parcel.writeString(this.ameAigcPromptTextAfterTrans);
        parcel.writeString(this.ameAigcFl2vPresetId);
        parcel.writeString(this.ameAigcPromptTextBeforeTransFl2v);
        parcel.writeString(this.ameAigcPromptTextAfterTransFl2v);
        parcel.writeInt(this.ameAigcIfAddReference ? 1 : 0);
    }

    public EffectPackageDataWrapper(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<EffectObjectDataWrapper> list, List<EffectCommandDataWrapper> list2, Boolean bool, String str7, List<EffectHint> list3, int i9, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i10, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z2) {
        this.projectId = str;
        this.projectSource = str2;
        this.publishSource = str3;
        this.enterFrom = str4;
        this.templateId = str5;
        this.templateResId = str6;
        this.projectSize = j;
        this.duration = j2;
        this.layerDuration = j3;
        this.interactionDuration = j4;
        this.objectCount = i;
        this.commandCount = i2;
        this.triggerCount = i3;
        this.actionCount = i4;
        this.validCommandCount = i5;
        this.validActionCount = i6;
        this.validTriggerCount = i7;
        this.sequenceCount = i8;
        this.objectDataList = list;
        this.commandDataList = list2;
        this.isFromTemplateUnedited = bool;
        this.ameSaveFrom = str7;
        this.availableEffectHintList = list3;
        this.performanceScore = i9;
        this.containsAIMakeup = z;
        this.userEntryMethod = str8;
        this.shootWay = str9;
        this.anyFromDiscover = str10;
        this.tabKey = str11;
        this.shootTabName = str12;
        this.ameEnterFrom = str13;
        this.campaignId = str14;
        this.campaignBindMethod = str15;
        this.enterType = str16;
        this.shootPageEnterFrom = str17;
        this.ameAigcEnterFrom = str18;
        this.openGLVersion = str19;
        this.ameAigcType = i10;
        this.ameAigcStyleId = str20;
        this.ameAigcAigcModelId = str21;
        this.ameAigcPresetId = str22;
        this.ameAigcPromptTextBeforeTrans = str23;
        this.ameAigcPromptTextAfterTrans = str24;
        this.ameAigcFl2vPresetId = str25;
        this.ameAigcPromptTextBeforeTransFl2v = str26;
        this.ameAigcPromptTextAfterTransFl2v = str27;
        this.ameAigcIfAddReference = z2;
    }

    public EffectPackageDataWrapper(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list, List list2, Boolean bool, String str7, List list3, int i9, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i10, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z2, int i11, int i12) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? 0L : j, (i11 & 128) != 0 ? 0L : j2, (i11 & 256) != 0 ? 0L : j3, (i11 & 512) == 0 ? j4 : 0L, (i11 & 1024) != 0 ? 0 : i, (i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i2, (i11 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i3, (i11 & 8192) != 0 ? 0 : i4, (i11 & 16384) != 0 ? 0 : i5, (32768 & i11) != 0 ? 0 : i6, (65536 & i11) != 0 ? 0 : i7, (131072 & i11) != 0 ? 0 : i8, (262144 & i11) != 0 ? C13BV.INSTANCE : list, (524288 & i11) != 0 ? C13BV.INSTANCE : list2, (1048576 & i11) != 0 ? null : bool, (2097152 & i11) != 0 ? "" : str7, (4194304 & i11) != 0 ? C13BV.INSTANCE : list3, (8388608 & i11) != 0 ? 0 : i9, (16777216 & i11) != 0 ? false : z, (33554432 & i11) != 0 ? "" : str8, (67108864 & i11) != 0 ? "" : str9, (134217728 & i11) != 0 ? "" : str10, (268435456 & i11) != 0 ? "" : str11, (536870912 & i11) != 0 ? "" : str12, (1073741824 & i11) != 0 ? "" : str13, (i11 & Integer.MIN_VALUE) != 0 ? "" : str14, (i12 & 1) != 0 ? "" : str15, (i12 & 2) != 0 ? "" : str16, (i12 & 4) != 0 ? "" : str17, (i12 & 8) != 0 ? "" : str18, (i12 & 16) != 0 ? "" : str19, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? "" : str20, (i12 & 128) != 0 ? "" : str21, (i12 & 256) != 0 ? "" : str22, (i12 & 512) != 0 ? "" : str23, (i12 & 1024) != 0 ? "" : str24, (i12 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str25, (i12 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str26, (i12 & 8192) == 0 ? str27 : "", (i12 & 16384) == 0 ? z2 : false);
    }
}
