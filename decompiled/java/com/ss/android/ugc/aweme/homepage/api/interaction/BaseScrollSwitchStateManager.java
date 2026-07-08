package com.ss.android.ugc.aweme.homepage.api.interaction;

import X.C13LP;
import X.C1590430rUP;
import X.C1590630rUj;
import X.C443120HZe;
import X.C786410Ut5;
import X.EnumC2029507xF;
import X.InterfaceC1210210hb9;
import X.InterfaceC1590650rUl;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class BaseScrollSwitchStateManager extends ViewModel {
    public final CurrentPagerItem LL = new CurrentPagerItem();
    public final MutableLiveData<List<C1590430rUP>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<HashMap<Integer, CommonPageFragment>> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData<Boolean> LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData<Integer> LLIZLLLIL;
    public final MutableLiveData<Integer> LLJ;
    public final MutableLiveData<C443120HZe<Integer, Float, Integer>> LLJI;
    public final MutableLiveData<Integer> LLJIJIL;
    public final MutableLiveData<EnumC2029507xF> LLJILJIL;
    public final NextLiveData<Pair<String, Boolean>> LLJILJILJ;
    public final NextLiveData<String> LLJILLL;
    public final NextLiveData<String> LLJJ;
    public final NextLiveData<String> LLJJI;
    public final MutableLiveData<InterfaceC1210210hb9> LLJJIII;
    public final MutableLiveData<Pair<Boolean, Boolean>> LLJJIJI;
    public MutableLiveData<Fragment> LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public WeakReference<Fragment> LLJJJIL;
    public final MutableLiveData<Integer> LLJJJJ;
    public final MutableLiveData<Integer> LLJJJJJIL;
    public final MutableLiveData<C443120HZe<Integer, Float, Integer>> LLJJJJLIIL;
    public final MutableLiveData<Boolean> LLJJL;
    public final MutableLiveData<C443120HZe<Boolean, Fragment, Boolean>> LLJJLIIIJLLLLLLLZ;

    public final boolean AQ2() {
        return this.LLIZ.getValue().booleanValue();
    }

    public final boolean DQ2() {
        return this.LLILZ.getValue().booleanValue();
    }

    public final boolean GQ2() {
        Pair<Boolean, Boolean> value = this.LLJJIJI.getValue();
        return value != null && value.getFirst().booleanValue() && value.getSecond().booleanValue();
    }

    public final Fragment vQ2() {
        Fragment value = this.LLJJIJIIJIL.getValue();
        if (this.LLJJIJIIJIL.getValue() == null) {
            return null;
        }
        return value;
    }

    public final String wQ2() {
        return !this.LL.isRealBridgeSet() ? "" : CQ2(this.LL.getValue().intValue());
    }

    public final CommonPageFragment zQ2() {
        if (this.LL.isRealBridgeSet()) {
            return yQ2(this.LL.getValue().intValue());
        }
        return null;
    }

    public BaseScrollSwitchStateManager() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLILZ = mutableLiveData;
        this.LLILZIL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData3;
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILJILJ = new NextLiveData<>();
        new NextLiveData();
        this.LLJILLL = new NextLiveData<>();
        this.LLJJ = new NextLiveData<>();
        this.LLJJI = new NextLiveData<>();
        this.LLJJIII = new MutableLiveData<>();
        new MutableLiveData();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = new MutableLiveData<>();
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
        InterfaceC1590650rUl interfaceC1590650rUl = C1590630rUj.LIZ;
        if (interfaceC1590650rUl == null || !interfaceC1590650rUl.LIZ() || Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            Boolean bool = Boolean.TRUE;
            mutableLiveData.setValue(bool);
            mutableLiveData2.setValue(bool);
            mutableLiveData3.setValue(bool);
            return;
        }
        Boolean bool2 = Boolean.TRUE;
        mutableLiveData.postValue(bool2);
        mutableLiveData2.postValue(bool2);
        mutableLiveData3.postValue(bool2);
    }

    public final String BQ2(int i) {
        boolean z;
        C1590430rUP c1590430rUP;
        List<C1590430rUP> value = this.LLILLJJLI.getValue();
        if (value != null && !value.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c1590430rUP = (C1590430rUP) C13LP.LJJJLZIJ(i, value)) == null) {
            return null;
        }
        return c1590430rUP.LIZIZ;
    }

    public final String CQ2(int i) {
        Integer numValueOf;
        int iIntValue;
        if (this.LLILLJJLI.getValue() == null) {
            iIntValue = 0;
        } else {
            List<C1590430rUP> value = this.LLILLJJLI.getValue();
            if (value != null) {
                numValueOf = Integer.valueOf(value.size());
            } else {
                numValueOf = null;
            }
            iIntValue = numValueOf.intValue();
        }
        if (i >= 0 && i < iIntValue) {
            return ((C1590430rUP) ListProtector.get(this.LLILLJJLI.getValue(), i)).LIZIZ;
        }
        return "";
    }

    public final int EQ2(String str) {
        if (this.LLILLJJLI.getValue() != null) {
            int size = this.LLILLJJLI.getValue().size();
            for (int i = 0; i < size; i++) {
                if (TextUtils.equals(str, ((C1590430rUP) ListProtector.get(this.LLILLJJLI.getValue(), i)).LIZIZ)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final boolean FQ2(String str) {
        return TextUtils.equals(str, wQ2());
    }

    public final void KQ2(boolean z) {
        this.LLILZ.setValue(Boolean.valueOf(z));
    }

    public final void LQ2(InterfaceC1210210hb9 interfaceC1210210hb9) {
        this.LLJJIII.setValue(interfaceC1210210hb9);
    }

    public final CommonPageFragment xQ2(String str) {
        return yQ2(EQ2(str));
    }

    public final CommonPageFragment yQ2(int i) {
        if (this.LLILLL.getValue() != null && !this.LLILLL.getValue().isEmpty()) {
            return this.LLILLL.getValue().get(Integer.valueOf(i));
        }
        return null;
    }

    public final void HQ2(LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        this.LLJ.observe(lifecycleOwner, observer);
    }

    public final void IQ2(LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        this.LLIZLLLIL.observe(lifecycleOwner, observer);
    }

    public final void kE0(String str, boolean z) {
        this.LL.setValue(EQ2(str), z);
    }

    public final void JQ2(float f, int i, int i2) {
        this.LLJI.setValue(new C443120HZe<>(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }
}
