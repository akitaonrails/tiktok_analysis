package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.EnumC551560LkA;
import X.EnumC551570LkB;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.TemplateCompareData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class PUgcTemplateData implements Parcelable {
    public static final Parcelable.Creator<PUgcTemplateData> CREATOR = new Parcelable.Creator<PUgcTemplateData>() { // from class: X.0L0L
        @Override // android.os.Parcelable.Creator
        public final PUgcTemplateData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            TemplateCompareData templateCompareDataCreateFromParcel;
            boolean z5;
            boolean z6;
            boolean z7;
            Integer numValueOf;
            boolean z8;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                linkedHashSet.add(parcel.readString());
            }
            int i8 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int i10 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList3.add(Integer.valueOf(parcel.readInt()));
            }
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet3.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                templateCompareDataCreateFromParcel = null;
            } else {
                templateCompareDataCreateFromParcel = TemplateCompareData.CREATOR.createFromParcel(parcel);
            }
            TemplateCompareData templateCompareData = templateCompareDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string3 = parcel.readString();
            int i14 = parcel.readInt();
            String string4 = parcel.readString();
            int i15 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i16 = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            int i17 = parcel.readInt();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i20 = parcel.readInt();
            int i21 = parcel.readInt();
            int i22 = parcel.readInt();
            String string6 = parcel.readString();
            int i23 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                linkedHashSet4.add(parcel.readString());
            }
            int i25 = parcel.readInt();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet(i25);
            for (int i26 = 0; i26 != i25; i26++) {
                linkedHashSet5.add(parcel.readString());
            }
            return new PUgcTemplateData(string, z, arrayListCreateStringArrayList, arrayList, string2, i3, arrayList2, z2, linkedHashSet, linkedHashSet2, z3, z4, arrayListCreateStringArrayList2, arrayList3, linkedHashSet3, templateCompareData, z5, f, z6, string3, i14, string4, i15, z7, i16, numValueOf, arrayListCreateStringArrayList3, i17, string5, z8, i18, i19, i20, i21, i22, string6, linkedHashSet4, linkedHashSet5);
        }

        @Override // android.os.Parcelable.Creator
        public final PUgcTemplateData[] newArray(int i) {
            return new PUgcTemplateData[i];
        }
    };

    @C09CT("ai_create_fl2v_cnt")
    public int aiCreateFL2VCnt;

    @C09CT("ai_create_i2i_cnt")
    public int aiCreateI2ICnt;

    @C09CT("ai_create_i2v_cnt")
    public int aiCreateI2VCnt;

    @C09CT("ai_create_stylized_fl2v_cnt")
    public int aiCreateStylizedFL2VCnt;

    @C09CT("ai_create_stylized_i2v_cnt")
    public int aiCreateStylizedI2VCnt;

    @C09CT("ai_template_func_list")
    public String aiTemplateFuncList;

    @C09CT("asset_from")
    public Integer assetFrom;

    @C09CT("can_post")
    public boolean canPostTemplate;

    @C09CT("combine_effect_template_model")
    public String combineEffectNLETemplateModel;

    @C040H
    public int contentCnt;

    @C09CT("feature_codes")
    public List<Integer> featureCodes;

    @C09CT("feature_list")
    public List<String> featureList;

    @C09CT("template_fill_mode")
    public int fillMode;

    @C040H
    public List<Integer> fixedSlotIndex;

    @C040H
    public List<String> fixedSlots;

    @C09CT("fl2v_nle")
    public String fl2vNLEModel;

    @C09CT("has_i2v")
    public boolean hasI2V;

    @C09CT("has_magic")
    public boolean hasMagic;

    @C09CT("has_matting")
    public boolean hasMatting;

    @C09CT("hashtags")
    public List<String> hashtags;

    @C09CT("is_from_create_template")
    public boolean isFromCreateTemplate;

    @C09CT("is_magic_retry")
    public boolean isRetry;

    @C09CT("using_server_magic")
    public boolean isUsingServerMaigc;

    @C09CT("i2v_matting_process_state")
    public int iv2AsyncAndMatting;

    @InterfaceC2270908v5
    @C09CT("magic_dependency_res")
    @InterfaceC2270808v4
    public Set<String> magicDependencyRes;

    @C09CT("magic_process_state")
    public int magicProcessState;

    @InterfaceC2270908v5
    @C09CT("matting_cached_res")
    public Set<String> mattingCachedRes;

    @InterfaceC2270908v5
    @C09CT("matting_dependency_res")
    public Set<String> mattingDependencyRes;

    @C09CT("media_compress_list")
    @C0MY0
    @InterfaceC2270808v4
    public Set<String> mediaCompressResult;

    @C09CT("need_handle_ai_create")
    public boolean needHandleAICreate;

    @C040H
    public String pugcTemplateZipUrl;

    @C09CT("magic_retry_count")
    public int retryCount;

    @C040H
    public List<Integer> slotDurations;

    @C040H
    public TemplateCompareData templateCompareData;

    @C09CT("template_complexity_score")
    public float templateComplexityScore;

    @C09CT("template_internal_res")
    @C0MY0
    @InterfaceC2270808v4
    public Set<String> templateInternalRes;

    @C09CT("template_title")
    public String templateTitle;

    @C040H
    public String uploadVid;

    public PUgcTemplateData() {
        this(null, false, null, null, null, 0, null, false, null, null, false, false, null, null, null, null, false, 0.0f, false, null, 0, null, 0, false, 0, null, null, 0, null, false, 0, 0, 0, 0, 0, null, null, null, -1, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pugcTemplateZipUrl);
        parcel.writeInt(this.canPostTemplate ? 1 : 0);
        parcel.writeStringList(this.fixedSlots);
        List<Integer> list = this.fixedSlotIndex;
        parcel.writeInt(list.size());
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.uploadVid);
        parcel.writeInt(this.contentCnt);
        List<Integer> list2 = this.slotDurations;
        parcel.writeInt(list2.size());
        Iterator<Integer> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(it3.next().intValue());
        }
        parcel.writeInt(this.isFromCreateTemplate ? 1 : 0);
        Set<String> set = this.mattingDependencyRes;
        parcel.writeInt(set.size());
        Iterator<String> it4 = set.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
        Set<String> set2 = this.mattingCachedRes;
        parcel.writeInt(set2.size());
        Iterator<String> it5 = set2.iterator();
        while (it5.hasNext()) {
            parcel.writeString(it5.next());
        }
        parcel.writeInt(this.hasMatting ? 1 : 0);
        parcel.writeInt(this.hasMagic ? 1 : 0);
        parcel.writeStringList(this.featureList);
        List<Integer> list3 = this.featureCodes;
        parcel.writeInt(list3.size());
        Iterator<Integer> it6 = list3.iterator();
        while (it6.hasNext()) {
            parcel.writeInt(it6.next().intValue());
        }
        Set<String> set3 = this.magicDependencyRes;
        parcel.writeInt(set3.size());
        Iterator<String> it7 = set3.iterator();
        while (it7.hasNext()) {
            parcel.writeString(it7.next());
        }
        TemplateCompareData templateCompareData = this.templateCompareData;
        if (templateCompareData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateCompareData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isUsingServerMaigc ? 1 : 0);
        parcel.writeFloat(this.templateComplexityScore);
        parcel.writeInt(this.hasI2V ? 1 : 0);
        parcel.writeString(this.templateTitle);
        parcel.writeInt(this.fillMode);
        parcel.writeString(this.combineEffectNLETemplateModel);
        parcel.writeInt(this.magicProcessState);
        parcel.writeInt(this.isRetry ? 1 : 0);
        parcel.writeInt(this.retryCount);
        Integer num = this.assetFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.hashtags);
        parcel.writeInt(this.iv2AsyncAndMatting);
        parcel.writeString(this.fl2vNLEModel);
        parcel.writeInt(this.needHandleAICreate ? 1 : 0);
        parcel.writeInt(this.aiCreateI2ICnt);
        parcel.writeInt(this.aiCreateI2VCnt);
        parcel.writeInt(this.aiCreateFL2VCnt);
        parcel.writeInt(this.aiCreateStylizedI2VCnt);
        parcel.writeInt(this.aiCreateStylizedFL2VCnt);
        parcel.writeString(this.aiTemplateFuncList);
        Set<String> set4 = this.templateInternalRes;
        parcel.writeInt(set4.size());
        Iterator<String> it8 = set4.iterator();
        while (it8.hasNext()) {
            parcel.writeString(it8.next());
        }
        Set<String> set5 = this.mediaCompressResult;
        parcel.writeInt(set5.size());
        Iterator<String> it9 = set5.iterator();
        while (it9.hasNext()) {
            parcel.writeString(it9.next());
        }
    }

    public PUgcTemplateData(String str, boolean z, List<String> list, List<Integer> list2, String str2, int i, List<Integer> list3, boolean z2, Set<String> set, Set<String> set2, boolean z3, boolean z4, List<String> list4, List<Integer> list5, Set<String> set3, TemplateCompareData templateCompareData, boolean z5, float f, boolean z6, String str3, int i2, String str4, int i3, boolean z7, int i4, Integer num, List<String> list6, int i5, String str5, boolean z8, int i6, int i7, int i8, int i9, int i10, String str6, Set<String> set4, Set<String> set5) {
        this.pugcTemplateZipUrl = str;
        this.canPostTemplate = z;
        this.fixedSlots = list;
        this.fixedSlotIndex = list2;
        this.uploadVid = str2;
        this.contentCnt = i;
        this.slotDurations = list3;
        this.isFromCreateTemplate = z2;
        this.mattingDependencyRes = set;
        this.mattingCachedRes = set2;
        this.hasMatting = z3;
        this.hasMagic = z4;
        this.featureList = list4;
        this.featureCodes = list5;
        this.magicDependencyRes = set3;
        this.templateCompareData = templateCompareData;
        this.isUsingServerMaigc = z5;
        this.templateComplexityScore = f;
        this.hasI2V = z6;
        this.templateTitle = str3;
        this.fillMode = i2;
        this.combineEffectNLETemplateModel = str4;
        this.magicProcessState = i3;
        this.isRetry = z7;
        this.retryCount = i4;
        this.assetFrom = num;
        this.hashtags = list6;
        this.iv2AsyncAndMatting = i5;
        this.fl2vNLEModel = str5;
        this.needHandleAICreate = z8;
        this.aiCreateI2ICnt = i6;
        this.aiCreateI2VCnt = i7;
        this.aiCreateFL2VCnt = i8;
        this.aiCreateStylizedI2VCnt = i9;
        this.aiCreateStylizedFL2VCnt = i10;
        this.aiTemplateFuncList = str6;
        this.templateInternalRes = set4;
        this.mediaCompressResult = set5;
    }

    public PUgcTemplateData(String str, boolean z, List list, List list2, String str2, int i, List list3, boolean z2, Set set, Set set2, boolean z3, boolean z4, List list4, List list5, Set set3, TemplateCompareData templateCompareData, boolean z5, float f, boolean z6, String str3, int i2, String str4, int i3, boolean z7, int i4, Integer num, List list6, int i5, String str5, boolean z8, int i6, int i7, int i8, int i9, int i10, String str6, Set set4, Set set5, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z, (i11 & 4) != 0 ? new ArrayList() : list, (i11 & 8) != 0 ? new ArrayList() : list2, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? 0 : i, (i11 & 64) != 0 ? new ArrayList() : list3, (i11 & 128) != 0 ? false : z2, (i11 & 256) != 0 ? new LinkedHashSet() : set, (i11 & 512) != 0 ? new LinkedHashSet() : set2, (i11 & 1024) != 0 ? false : z3, (i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z4, (i11 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new ArrayList() : list4, (i11 & 8192) != 0 ? new ArrayList() : list5, (i11 & 16384) != 0 ? new LinkedHashSet() : set3, (32768 & i11) != 0 ? null : templateCompareData, (65536 & i11) != 0 ? false : z5, (131072 & i11) != 0 ? -1.0f : f, (262144 & i11) != 0 ? false : z6, (524288 & i11) != 0 ? "" : str3, (1048576 & i11) != 0 ? 0 : i2, (2097152 & i11) != 0 ? null : str4, (4194304 & i11) != 0 ? EnumC551570LkB.INIT.getValue() : i3, (8388608 & i11) != 0 ? false : z7, (16777216 & i11) != 0 ? 0 : i4, (33554432 & i11) != 0 ? null : num, (67108864 & i11) != 0 ? C13BV.INSTANCE : list6, (134217728 & i11) != 0 ? EnumC551560LkA.INIT.getValue() : i5, (268435456 & i11) != 0 ? null : str5, (536870912 & i11) != 0 ? false : z8, (1073741824 & i11) != 0 ? 0 : i6, (i11 & Integer.MIN_VALUE) != 0 ? 0 : i7, (i12 & 1) != 0 ? 0 : i8, (i12 & 2) != 0 ? 0 : i9, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? null : str6, (i12 & 16) != 0 ? new LinkedHashSet() : set4, (i12 & 32) != 0 ? new LinkedHashSet() : set5);
    }
}
