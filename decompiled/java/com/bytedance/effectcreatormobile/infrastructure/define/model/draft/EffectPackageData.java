package com.bytedance.effectcreatormobile.infrastructure.define.model.draft;

import X.AnonymousClass0016;
import X.C09CT;
import X.C13BV;
import X.C1738080vKY;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPackageData {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public List<C1738080vKY> LJIILIIL;
    public List<AnonymousClass0016> LJIILJJIL;
    public String LJIILL;
    public List<EffectHint> LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public int LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public boolean LJJIL;
    public Boolean LJJIZ;
    public String LJJJ;

    @C09CT("total_duration")
    public long duration;

    @C09CT("interaction_duration")
    public long interactionDuration;

    @C09CT("layer_duration")
    public long layerDuration;

    @C09CT("project_id")
    public String projectId;

    @C09CT("project_source")
    public String projectSource;

    public EffectPackageData() {
        this(null, null, null, null, null, false, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, -1, 16383, null);
    }

    public EffectPackageData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<C1738080vKY> list, List<AnonymousClass0016> list2, String str7, List<EffectHint> list3, int i8, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i9, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z2, Boolean bool) {
        this.projectId = str;
        this.projectSource = str2;
        this.LIZ = str3;
        this.LIZIZ = str4;
        this.LIZJ = str5;
        this.LIZLLL = z;
        this.LJ = str6;
        this.LJFF = j;
        this.duration = j2;
        this.layerDuration = j3;
        this.interactionDuration = j4;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
        this.LJIIJJI = i6;
        this.LJIIL = i7;
        this.LJIILIIL = list;
        this.LJIILJJIL = list2;
        this.LJIILL = str7;
        this.LJIILLIIL = list3;
        this.LJIIZILJ = i8;
        this.LJIJ = str8;
        this.LJIJI = str9;
        this.LJIJJ = str10;
        this.LJIJJLI = str11;
        this.LJIL = str12;
        this.LJJ = str13;
        this.LJJI = str15;
        this.LJJIFFI = str16;
        this.LJJII = str17;
        this.LJJIII = str18;
        this.LJJIIJ = str19;
        this.LJJIIJZLJL = i9;
        this.LJJIIZ = str20;
        this.LJJIIZI = str21;
        this.LJJIJ = str22;
        this.LJJIJIIJI = str23;
        this.LJJIJIIJIL = str24;
        this.LJJIJIL = str25;
        this.LJJIJL = str26;
        this.LJJIJLIJ = str27;
        this.LJJIL = z2;
        this.LJJIZ = bool;
        this.LJJJ = "";
    }

    public EffectPackageData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, List list2, String str7, List list3, int i8, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i9, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z2, Boolean bool, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? false : z, (i10 & 64) != 0 ? "" : str6, (i10 & 128) != 0 ? 0L : j, (i10 & 256) != 0 ? 0L : j2, (i10 & 512) != 0 ? 0L : j3, (i10 & 1024) == 0 ? j4 : 0L, (i10 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i10 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i2, (i10 & 8192) != 0 ? 0 : i3, (i10 & 16384) != 0 ? 0 : i4, (32768 & i10) != 0 ? 0 : i5, (65536 & i10) != 0 ? 0 : i6, (131072 & i10) != 0 ? 0 : i7, (262144 & i10) != 0 ? C13BV.INSTANCE : list, (524288 & i10) != 0 ? C13BV.INSTANCE : list2, (1048576 & i10) != 0 ? "" : str7, (2097152 & i10) != 0 ? C13BV.INSTANCE : list3, (4194304 & i10) != 0 ? 0 : i8, (8388608 & i10) != 0 ? "" : str8, (16777216 & i10) != 0 ? "" : str9, (33554432 & i10) != 0 ? CardStruct.IStatusCode.DEFAULT : str10, (67108864 & i10) != 0 ? "" : str11, (134217728 & i10) != 0 ? "" : str12, (268435456 & i10) != 0 ? "" : str13, (536870912 & i10) != 0 ? "" : str14, (1073741824 & i10) != 0 ? "automatic" : str15, (i10 & Integer.MIN_VALUE) != 0 ? "" : str16, (i11 & 1) != 0 ? "" : str17, (i11 & 2) != 0 ? "" : str18, (i11 & 4) != 0 ? "" : str19, (i11 & 8) != 0 ? 0 : i9, (i11 & 16) != 0 ? "" : str20, (i11 & 32) != 0 ? "" : str21, (i11 & 64) != 0 ? "" : str22, (i11 & 128) != 0 ? "" : str23, (i11 & 256) != 0 ? "" : str24, (i11 & 512) != 0 ? "" : str25, (i11 & 1024) != 0 ? "" : str26, (i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str27 : "", (i11 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2, (i11 & 8192) != 0 ? null : bool);
    }
}
