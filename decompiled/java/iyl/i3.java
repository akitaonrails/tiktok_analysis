package iyl;

import X.C1459730o5b;
import X.C1651520t4w;
import X.C1659490tHn;
import X.C1ETD;
import X.C2188811AlT;
import X.C375830EoP;
import X.C786410Ut5;
import X.EnumC1462540oA8;
import X.EnumC1651310t4b;
import X.EnumC441770HTz;
import X.InterfaceC1651320t4c;
import X.InterfaceC1652140t5w;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class i3 implements Comparable<i3>, C1ETD {
    public final int LL;
    public final int LLILLJJLI;
    public final InterfaceC1652140t5w LLILLL;
    public final int LLILZ;
    public final ImageUrlModel LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final CharSequence LLJILJIL;
    public final String LLJILJILJ;
    public final C375830EoP<String> LLJILLL;
    public final Function1<C1459730o5b, Unit> LLJJ;
    public final int LLJJI;
    public final C375830EoP<Pair<Boolean, Boolean>> LLJJIII;
    public final EnumC1462540oA8 LLJJIJI;
    public final C1659490tHn LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final C375830EoP<Boolean> LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final int LLJJJJJIL;
    public final C1651520t4w LLJJJJLIIL;
    public final int LLJJL;
    public final float LLJJLIIIJLLLLLLLZ;
    public final EnumC441770HTz LLJL;
    public final String LLJLIL;
    public final EnumC1651310t4b LLJLILLLLZIIL;
    public final boolean LLJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.LL == i3Var.LL && this.LLILLJJLI == i3Var.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, i3Var.LLILLL) && this.LLILZ == i3Var.LLILZ && Intrinsics.LJFF(this.LLILZIL, i3Var.LLILZIL) && this.LLILZLL == i3Var.LLILZLL && this.LLIZ == i3Var.LLIZ && this.LLIZLLLIL == i3Var.LLIZLLLIL && this.LLJ == i3Var.LLJ && this.LLJI == i3Var.LLJI && this.LLJIJIL == i3Var.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, i3Var.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, i3Var.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, i3Var.LLJILLL) && Intrinsics.LJFF(this.LLJJ, i3Var.LLJJ) && this.LLJJI == i3Var.LLJJI && Intrinsics.LJFF(this.LLJJIII, i3Var.LLJJIII) && this.LLJJIJI == i3Var.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, i3Var.LLJJIJIIJIL) && this.LLJJIJIL == i3Var.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, i3Var.LLJJJ) && this.LLJJJIL == i3Var.LLJJJIL && this.LLJJJJ == i3Var.LLJJJJ && this.LLJJJJJIL == i3Var.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, i3Var.LLJJJJLIIL) && this.LLJJL == i3Var.LLJJL && Float.compare(this.LLJJLIIIJLLLLLLLZ, i3Var.LLJJLIIIJLLLLLLLZ) == 0 && this.LLJL == i3Var.LLJL;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31;
        ImageUrlModel imageUrlModel = this.LLILZIL;
        int iHashCode2 = (((((((((((((iHashCode + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        CharSequence charSequence = this.LLJILJIL;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.LLJILJILJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C375830EoP<String> c375830EoP = this.LLJILLL;
        int iHashCode5 = (iHashCode4 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        Function1<C1459730o5b, Unit> function1 = this.LLJJ;
        int iHashCode6 = (((iHashCode5 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LLJJI) * 31;
        C375830EoP<Pair<Boolean, Boolean>> c375830EoP2 = this.LLJJIII;
        int iHashCode7 = (iHashCode6 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        EnumC1462540oA8 enumC1462540oA8 = this.LLJJIJI;
        int iHashCode8 = (iHashCode7 + (enumC1462540oA8 == null ? 0 : enumC1462540oA8.hashCode())) * 31;
        C1659490tHn c1659490tHn = this.LLJJIJIIJIL;
        int iHashCode9 = (((iHashCode8 + (c1659490tHn == null ? 0 : c1659490tHn.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31;
        C375830EoP<Boolean> c375830EoP3 = this.LLJJJ;
        int iHashCode10 = (((((((iHashCode9 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31) + this.LLJJJJJIL) * 31;
        C1651520t4w c1651520t4w = this.LLJJJJLIIL;
        int iHashCode11 = (((((iHashCode10 + (c1651520t4w == null ? 0 : c1651520t4w.hashCode())) * 31) + this.LLJJL) * 31) + Float.floatToIntBits(this.LLJJLIIIJLLLLLLLZ)) * 31;
        EnumC441770HTz enumC441770HTz = this.LLJL;
        return iHashCode11 + (enumC441770HTz != null ? enumC441770HTz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarItemConfig(position=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(",type=");
        C1651520t4w c1651520t4w = this.LLJJJJLIIL;
        sbLIZ.append(c1651520t4w != null ? c1651520t4w.LIZ : null);
        sbLIZ.append(",selected:");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(",enable:");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(",visible:");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(",showText:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1ETD
    public final boolean LIZJ() {
        return this.LLIZ;
    }

    @Override // X.C1ETD
    public final CharSequence LJFF() {
        return this.LLJILJIL;
    }

    @Override // X.C1ETD
    public final int LJI() {
        return this.LL;
    }

    @Override // X.C1ETD
    public final boolean getEnable() {
        return this.LLIZLLLIL;
    }

    @Override // X.C1ETD
    public final boolean getVisible() {
        return this.LLJI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(i3 i3Var) {
        i3 i3Var2 = i3Var;
        int i = i3Var2.LLJJL;
        int i2 = this.LLJJL;
        if (i2 >= 0 && i >= 0) {
            return Intrinsics.LJI(i2, i);
        }
        if (this.LLILLL.getSection() == i3Var2.LLILLL.getSection()) {
            return this.LLILLL.getOrdinal() - i3Var2.LLILLL.getOrdinal();
        }
        if (this.LLILLL.getSection() == EnumC1651310t4b.FIXED) {
            return -1;
        }
        return 1;
    }

    @Override // X.C1ETD
    public final i3 LJII(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence) {
        return LJIIIZ(this, i, 0, 0, null, 0, z3, z2, false, z, false, charSequence, null, 0, null, null, null, false, null, false, 0.0f, null, 268432702);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i3(int i, int i2, InterfaceC1652140t5w interfaceC1652140t5w, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, CharSequence charSequence, String str, Function1 function1, int i5, EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z5, boolean z6, int i6, C1651520t4w c1651520t4w, int i7, float f, int i8) {
        boolean z7;
        float f2 = f;
        int i9 = i7;
        C1651520t4w c1651520t4w2 = c1651520t4w;
        int i10 = i6;
        boolean z8 = z6;
        boolean z9 = z5;
        C1659490tHn c1659490tHn2 = c1659490tHn;
        EnumC1462540oA8 enumC1462540oA82 = enumC1462540oA8;
        Function1 function12 = function1;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z2;
        boolean z13 = z;
        int i11 = i4;
        int i12 = i3;
        int i13 = i5;
        InterfaceC1652140t5w interfaceC1652140t5w2 = (i8 & 4) != 0 ? n0.LL : interfaceC1652140t5w;
        i12 = (i8 & 8) != 0 ? 0 : i12;
        i11 = (i8 & 32) != 0 ? -1 : i11;
        z13 = (i8 & 64) != 0 ? false : z13;
        z12 = (i8 & 128) != 0 ? true : z12;
        z11 = (i8 & 256) != 0 ? true : z11;
        if ((i8 & 512) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this(i, i2, interfaceC1652140t5w2, i12, null, i11, z13, z12, z11, z7, (i8 & 1024) != 0 ? false : z10, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : charSequence2, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str2, null, (i8 & 16384) != 0 ? null : function12, (32768 & i8) != 0 ? -1 : i13, null, (131072 & i8) != 0 ? null : enumC1462540oA82, (262144 & i8) != 0 ? null : c1659490tHn2, (524288 & i8) != 0 ? false : z9, null, (2097152 & i8) != 0 ? false : z8, false, (8388608 & i8) != 0 ? -1 : i10, (16777216 & i8) != 0 ? null : c1651520t4w2, (33554432 & i8) != 0 ? -1 : i9, (i8 & 67108864) != 0 ? 0.0f : f2, null);
    }

    public static i3 LJIIIZ(i3 i3Var, int i, int i2, int i3, ImageUrlModel imageUrlModel, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, CharSequence charSequence, C375830EoP c375830EoP, int i5, C375830EoP c375830EoP2, EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z6, C375830EoP c375830EoP3, boolean z7, float f, EnumC441770HTz enumC441770HTz, int i6) {
        InterfaceC1652140t5w interfaceC1652140t5w;
        String str;
        Function1<C1459730o5b, Unit> function1;
        boolean z8;
        int i7;
        C1651520t4w c1651520t4w;
        int i8;
        float f2 = f;
        C375830EoP c375830EoP4 = c375830EoP3;
        EnumC1462540oA8 enumC1462540oA82 = enumC1462540oA8;
        boolean z9 = z6;
        C375830EoP c375830EoP5 = c375830EoP;
        boolean z10 = z5;
        boolean z11 = z7;
        C375830EoP c375830EoP6 = c375830EoP2;
        boolean z12 = z4;
        EnumC441770HTz enumC441770HTz2 = enumC441770HTz;
        boolean z13 = z3;
        boolean z14 = z2;
        boolean z15 = z;
        C1659490tHn c1659490tHn2 = c1659490tHn;
        ImageUrlModel imageUrlModel2 = imageUrlModel;
        int i9 = i3;
        int i10 = i2;
        int i11 = i4;
        CharSequence charSequence2 = charSequence;
        int i12 = i5;
        int i13 = i;
        if ((i6 & 1) != 0) {
            i13 = i3Var.LL;
        }
        if ((i6 & 2) != 0) {
            i10 = i3Var.LLILLJJLI;
        }
        if ((i6 & 4) != 0) {
            interfaceC1652140t5w = i3Var.LLILLL;
        } else {
            interfaceC1652140t5w = null;
        }
        if ((i6 & 8) != 0) {
            i9 = i3Var.LLILZ;
        }
        if ((i6 & 16) != 0) {
            imageUrlModel2 = i3Var.LLILZIL;
        }
        if ((i6 & 32) != 0) {
            i11 = i3Var.LLILZLL;
        }
        if ((i6 & 64) != 0) {
            z15 = i3Var.LLIZ;
        }
        if ((i6 & 128) != 0) {
            z14 = i3Var.LLIZLLLIL;
        }
        if ((i6 & 256) != 0) {
            z13 = i3Var.LLJ;
        }
        if ((i6 & 512) != 0) {
            z12 = i3Var.LLJI;
        }
        if ((i6 & 1024) != 0) {
            z10 = i3Var.LLJIJIL;
        }
        if ((i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            charSequence2 = i3Var.LLJILJIL;
        }
        if ((i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str = i3Var.LLJILJILJ;
        } else {
            str = null;
        }
        if ((i6 & 8192) != 0) {
            c375830EoP5 = i3Var.LLJILLL;
        }
        if ((i6 & 16384) != 0) {
            function1 = i3Var.LLJJ;
        } else {
            function1 = null;
        }
        if ((32768 & i6) != 0) {
            i12 = i3Var.LLJJI;
        }
        if ((65536 & i6) != 0) {
            c375830EoP6 = i3Var.LLJJIII;
        }
        if ((131072 & i6) != 0) {
            enumC1462540oA82 = i3Var.LLJJIJI;
        }
        if ((262144 & i6) != 0) {
            c1659490tHn2 = i3Var.LLJJIJIIJIL;
        }
        if ((524288 & i6) != 0) {
            z9 = i3Var.LLJJIJIL;
        }
        if ((1048576 & i6) != 0) {
            c375830EoP4 = i3Var.LLJJJ;
        }
        if ((2097152 & i6) != 0) {
            z8 = i3Var.LLJJJIL;
        } else {
            z8 = false;
        }
        if ((4194304 & i6) != 0) {
            z11 = i3Var.LLJJJJ;
        }
        if ((8388608 & i6) != 0) {
            i7 = i3Var.LLJJJJJIL;
        } else {
            i7 = 0;
        }
        if ((16777216 & i6) != 0) {
            c1651520t4w = i3Var.LLJJJJLIIL;
        } else {
            c1651520t4w = null;
        }
        if ((33554432 & i6) != 0) {
            i8 = i3Var.LLJJL;
        } else {
            i8 = 0;
        }
        if ((67108864 & i6) != 0) {
            f2 = i3Var.LLJJLIIIJLLLLLLLZ;
        }
        if ((i6 & 134217728) != 0) {
            enumC441770HTz2 = i3Var.LLJL;
        }
        i3Var.getClass();
        return new i3(i13, i10, interfaceC1652140t5w, i9, imageUrlModel2, i11, z15, z14, z13, z12, z10, charSequence2, str, c375830EoP5, function1, i12, c375830EoP6, enumC1462540oA82, c1659490tHn2, z9, c375830EoP4, z8, z11, i7, c1651520t4w, i8, f2, enumC441770HTz2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3(int i, int i2, InterfaceC1652140t5w interfaceC1652140t5w, int i3, ImageUrlModel imageUrlModel, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, CharSequence charSequence, String str, C375830EoP<String> c375830EoP, Function1<? super C1459730o5b, Unit> function1, int i5, C375830EoP<Pair<Boolean, Boolean>> c375830EoP2, EnumC1462540oA8 enumC1462540oA8, C1659490tHn c1659490tHn, boolean z6, C375830EoP<Boolean> c375830EoP3, boolean z7, boolean z8, int i6, C1651520t4w c1651520t4w, int i7, float f, EnumC441770HTz enumC441770HTz) {
        i3 i3Var;
        EnumC1651310t4b enumC1651310t4b;
        InterfaceC1651320t4c<Object> interfaceC1651320t4c;
        String key;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = interfaceC1652140t5w;
        this.LLILZ = i3;
        this.LLILZIL = imageUrlModel;
        this.LLILZLL = i4;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = z5;
        this.LLJILJIL = charSequence;
        this.LLJILJILJ = str;
        this.LLJILLL = c375830EoP;
        this.LLJJ = function1;
        this.LLJJI = i5;
        this.LLJJIII = c375830EoP2;
        this.LLJJIJI = enumC1462540oA8;
        this.LLJJIJIIJIL = c1659490tHn;
        this.LLJJIJIL = z6;
        this.LLJJJ = c375830EoP3;
        this.LLJJJIL = z7;
        this.LLJJJJ = z8;
        this.LLJJJJJIL = i6;
        this.LLJJJJLIIL = c1651520t4w;
        this.LLJJL = i7;
        this.LLJJLIIIJLLLLLLLZ = f;
        this.LLJL = enumC441770HTz;
        this.LLJLIL = (c1651520t4w == null || (interfaceC1651320t4c = c1651520t4w.LIZ) == null || (key = interfaceC1651320t4c.getKey()) == null) ? interfaceC1652140t5w.getItemTag() : key;
        this.LLJLILLLLZIIL = (c1651520t4w == null || (enumC1651310t4b = c1651520t4w.LIZIZ) == null) ? interfaceC1652140t5w.getSection() : enumC1651310t4b;
        Object obj = c1651520t4w != null ? c1651520t4w.LIZJ : null;
        if ((obj instanceof i3) && (i3Var = (i3) obj) != null) {
            z4 = i3Var.LLJI;
        }
        this.LLJLL = z4;
    }
}
