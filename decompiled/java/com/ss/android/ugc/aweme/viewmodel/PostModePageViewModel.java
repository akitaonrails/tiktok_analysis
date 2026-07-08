package com.ss.android.ugc.aweme.viewmodel;

import X.C01GW;
import X.C0SSI;
import X.C13LQ;
import X.C2097608Jq;
import X.C2174741A9g;
import X.C259620AFk;
import X.C304280BwI;
import X.C452501pT;
import X.C721640SSk;
import X.EnumC721170SQp;
import android.os.SystemClock;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModePageViewModel extends ViewModel {
    public EnumC721170SQp LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final MutableLiveData<EnumC721170SQp> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Unit> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Unit> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<Unit> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final MutableLiveData<Unit> LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public final MutableLiveData<Unit> LLJJ;
    public final MutableLiveData LLJJI;
    public final MutableLiveData<Unit> LLJJIII;
    public final MutableLiveData<Unit> LLJJIJI;
    public final MutableLiveData LLJJIJIIJIL;
    public final MutableLiveData<Boolean> LLJJIJIL;
    public final MutableLiveData LLJJJ;
    public final MutableLiveData<Boolean> LLJJJIL;
    public final MutableLiveData LLJJJJ;
    public final MutableLiveData<String> LLJJJJJIL;
    public final MutableLiveData LLJJJJLIIL;
    public final MutableLiveData<Integer> LLJJL;
    public final MutableLiveData LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Boolean> LLJL;
    public final MutableLiveData LLJLIL;
    public final MutableLiveData<Boolean> LLJLILLLLZIIL;
    public final MutableLiveData<Boolean> LLJLL;
    public final MutableLiveData<Boolean> LLJLLIL;
    public final MutableLiveData<Boolean> LLJLLL;
    public final MutableLiveData<Boolean> LLJZ;
    public final MutableLiveData<Boolean> LLJZIJLIL;
    public final C01GW LLL;
    public final MutableLiveData<Integer> LLLF;
    public final MutableLiveData<Boolean> LLLFF;
    public final MutableLiveData<Boolean> LLLFFI;
    public final MutableLiveData<Boolean> LLLFZ;
    public final MutableLiveData<Boolean> LLLI;
    public final MutableLiveData<Boolean> LLLII;
    public final MutableLiveData<Pair<Float, Float>> LLLIIII;
    public final MutableLiveData<Pair<Float, Float>> LLLIIIIL;
    public final MutableLiveData<Unit> LLLIIIL;
    public final MutableLiveData LLLIIL;
    public final MutableLiveData<Boolean> LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public C0SSI LLLILZJ;
    public boolean LLLILZLLLI;
    public final MutableLiveData<Boolean> LLLIZZ;
    public final MutableLiveData LLLJ;
    public final long LLLJIL;
    public final Set<EnumC721170SQp> LLLJL;
    public int LLLL;
    public Long LLLLII;
    public final long LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public Long LLLLIL;
    public long LLLLILI;
    public Long LLLLJ;
    public long LLLLJI;
    public Long LLLLL;
    public long LLLLLIL;

    public final HashMap<String, String> wQ2() {
        Pair[] pairArr = new Pair[3];
        Long l = this.LLLLL;
        if (l != null) {
            this.LLLLLIL += System.currentTimeMillis() - l.longValue();
            this.LLLLL = null;
        }
        pairArr[0] = new Pair("graphic_text_duration", String.valueOf(this.LLLLLIL));
        Long l2 = this.LLLLJ;
        if (l2 != null) {
            this.LLLLJI += System.currentTimeMillis() - l2.longValue();
            this.LLLLJ = null;
        }
        pairArr[1] = new Pair("graphic_read_duration", String.valueOf(this.LLLLJI));
        Long l3 = this.LLLLIL;
        if (l3 != null) {
            this.LLLLILI += System.currentTimeMillis() - l3.longValue();
            this.LLLLIL = null;
        }
        pairArr[2] = new Pair("graphic_comment_read_duration", String.valueOf(this.LLLLILI));
        return C2097608Jq.LJI(pairArr);
    }

    public final MediatorLiveData<Boolean> xQ2() {
        return (MediatorLiveData) this.LLL.getValue();
    }

    public final boolean yQ2() {
        Boolean value = this.LLLI.getValue();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.LJFF(value, bool) || Intrinsics.LJFF(this.LLLFF.getValue(), bool);
    }

    public PostModePageViewModel() {
        MutableLiveData<EnumC721170SQp> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = mutableLiveData2;
        MutableLiveData<Unit> mutableLiveData3 = new MutableLiveData<>();
        this.LLJ = mutableLiveData3;
        this.LLJI = mutableLiveData3;
        new MutableLiveData();
        MutableLiveData<Unit> mutableLiveData4 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData4;
        this.LLJILJIL = mutableLiveData4;
        MutableLiveData<Unit> mutableLiveData5 = new MutableLiveData<>();
        this.LLJILJILJ = mutableLiveData5;
        this.LLJILLL = mutableLiveData5;
        MutableLiveData<Unit> mutableLiveData6 = new MutableLiveData<>();
        this.LLJJ = mutableLiveData6;
        this.LLJJI = mutableLiveData6;
        this.LLJJIII = new MutableLiveData<>();
        MutableLiveData<Unit> mutableLiveData7 = new MutableLiveData<>();
        this.LLJJIJI = mutableLiveData7;
        this.LLJJIJIIJIL = mutableLiveData7;
        new MutableLiveData();
        new MutableLiveData();
        new MutableLiveData();
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.LLJJIJIL = mutableLiveData8;
        this.LLJJJ = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        this.LLJJJIL = mutableLiveData9;
        this.LLJJJJ = mutableLiveData9;
        MutableLiveData<String> mutableLiveData10 = new MutableLiveData<>();
        this.LLJJJJJIL = mutableLiveData10;
        this.LLJJJJLIIL = mutableLiveData10;
        MutableLiveData<Integer> mutableLiveData11 = new MutableLiveData<>();
        this.LLJJL = mutableLiveData11;
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData11;
        new MutableLiveData();
        new MutableLiveData();
        new MutableLiveData();
        new MutableLiveData();
        MutableLiveData<Boolean> mutableLiveData12 = new MutableLiveData<>();
        this.LLJL = mutableLiveData12;
        this.LLJLIL = mutableLiveData12;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData13 = new MutableLiveData<>(bool);
        this.LLJLILLLLZIIL = mutableLiveData13;
        this.LLJLL = mutableLiveData13;
        this.LLJLLIL = new MutableLiveData<>();
        this.LLJLLL = new MutableLiveData<>();
        this.LLJZ = new MutableLiveData<>();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1167));
        this.LLLF = new MutableLiveData<>();
        this.LLLFF = new MutableLiveData<>();
        this.LLLFFI = new MutableLiveData<>();
        this.LLLFZ = new MutableLiveData<>();
        this.LLLI = new MutableLiveData<>();
        this.LLLII = new MutableLiveData<>();
        this.LLLIIII = new MutableLiveData<>();
        this.LLLIIIIL = new MutableLiveData<>();
        MutableLiveData<Unit> mutableLiveData14 = new MutableLiveData<>();
        this.LLLIIIL = mutableLiveData14;
        this.LLLIIL = mutableLiveData14;
        this.LLLIILIL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData15 = new MutableLiveData<>(bool);
        this.LLLIZZ = mutableLiveData15;
        this.LLLJ = mutableLiveData15;
        this.LLLJIL = SystemClock.elapsedRealtime();
        boolean z = false;
        this.LLLJL = C13LQ.LJLIIL(new EnumC721170SQp[]{EnumC721170SQp.PULL_DOWN, EnumC721170SQp.SWIPE_DOWN, EnumC721170SQp.FLOAT_SWIPE_DOWN, EnumC721170SQp.FULL_SWIPE_DOWN, EnumC721170SQp.FLOAT_TAP, EnumC721170SQp.BACK, EnumC721170SQp.BACK_USE_SWIPE_ANIM});
        this.LLLLIIIILLL = 3000L;
        this.LLLLIILL = true;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            z = true;
        } else if (c2174741A9g.LJIILLIIL() && this.LLLLIILL) {
            this.LLLLIILL = false;
        }
        this.LLLLIILLL = z;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        TuxSheet tuxSheet;
        super.onCleared();
        C0SSI c0ssi = this.LLLILZJ;
        if (c0ssi == null || (tuxSheet = c0ssi.LIZJ) == null) {
            return;
        }
        tuxSheet.dismiss();
    }

    public final void AQ2(boolean z) {
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            z = true;
        } else if (c2174741A9g.LJIILLIIL() && this.LLLLIILL) {
            z = false;
            this.LLLLIILL = false;
        }
        this.LLLLIILLL = z;
        this.LLJJJIL.setValue(Boolean.valueOf(z));
    }

    public final boolean BQ2(EnumC721170SQp enumC721170SQp) {
        C01GW c01gw = C259620AFk.LIZ;
        if (((Number) c01gw.getValue()).longValue() <= 0 || !this.LLLJL.contains(enumC721170SQp)) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - this.LLLJIL >= ((Number) c01gw.getValue()).longValue() || ((enumC721170SQp == EnumC721170SQp.BACK || enumC721170SQp == EnumC721170SQp.CLOSE) && this.LLLL >= 5)) {
            return false;
        }
        this.LLLL++;
        return true;
    }

    public final void vQ2(EnumC721170SQp enumC721170SQp) {
        PostModeDetailParams postModeDetailParams;
        C0SSI c0ssi;
        PostModeDetailParams postModeDetailParams2;
        if (this.LLILZIL.getValue() == null) {
            C721640SSk c721640SSk = C721640SSk.LIZ;
            C0SSI c0ssi2 = this.LLLILZJ;
            if (c0ssi2 != null) {
                postModeDetailParams = c0ssi2.LIZ;
            } else {
                postModeDetailParams = null;
            }
            c721640SSk.getClass();
            if (!C721640SSk.LJIILJJIL(postModeDetailParams) || this.LLLILZLLLI || C304280BwI.LIZJ() || ((c0ssi = this.LLLILZJ) != null && (postModeDetailParams2 = c0ssi.LIZ) != null && postModeDetailParams2.enableAnimDegrade)) {
                if (this.LLLLIIL && ((enumC721170SQp == EnumC721170SQp.BACK || enumC721170SQp == EnumC721170SQp.FLOAT_TAP) && BQ2(enumC721170SQp))) {
                    return;
                }
                this.LLILZIL.setValue(enumC721170SQp);
            }
        }
    }

    public final void zQ2(boolean z) {
        if (z) {
            if (this.LLLLJ == null) {
                this.LLLLJ = Long.valueOf(System.currentTimeMillis());
            }
        } else {
            Long l = this.LLLLJ;
            if (l != null) {
                this.LLLLJI += System.currentTimeMillis() - l.longValue();
            }
            this.LLLLJ = null;
        }
    }
}
