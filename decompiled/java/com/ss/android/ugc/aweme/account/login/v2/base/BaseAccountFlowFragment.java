package com.ss.android.ugc.aweme.account.login.v2.base;

import X.AbstractC845940XGm;
import X.AbstractC846040XGw;
import X.C01GW;
import X.C0XGA;
import X.C0XU1;
import X.C0XWU;
import X.C0XXT;
import X.C0XYD;
import X.C13LE;
import X.C19EG;
import X.C336720DHy;
import X.C452501pT;
import X.C845950XGn;
import X.EnumC452301pR;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC849540XUi;
import X.InterfaceC852200Xbu;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseAccountFlowFragment extends AmeBaseFragment implements InterfaceC852200Xbu, C0XYD {
    public final ViewModelLazy LL = C336720DHy.LIZ(this, C13LE.LIZ(AccountFlowSharedViewModel.class), new AwS548S0100000_4((Fragment) this, 47), new AwS405S0200000_4((Function0) null, this, 8), new AwS548S0100000_4((Fragment) this, 48));
    public final ViewModelLazy LLILLJJLI;
    public ArrayList<AbstractC846040XGw<? extends C0XGA>> LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final String LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    public String ZR() {
        return "";
    }

    @Override // X.C0XYD
    public final BaseAccountFlowFragment getMobParams() {
        return this;
    }

    public abstract boolean onBackPressed();

    @Override // X.C0XYD
    public final InterfaceC849540XUi Fb() {
        return (InterfaceC849540XUi) this.LLJJIII.getValue();
    }

    public final void MR() {
        ArrayList<AbstractC846040XGw<? extends C0XGA>> arrayList = this.LLILLL;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            AbstractC846040XGw abstractC846040XGw = (AbstractC846040XGw) ListProtector.get(arrayList, size);
            if (!abstractC846040XGw.LIZIZ) {
                abstractC846040XGw.LIZIZ = true;
                AbstractC845940XGm abstractC845940XGm = abstractC846040XGw.LIZ;
                if (abstractC845940XGm != null) {
                    abstractC845940XGm.LJ = null;
                    C845950XGn c845950XGn = abstractC845940XGm.LJI;
                    if (c845950XGn != null) {
                        c845950XGn.LLILLJJLI.compareAndSet(false, true);
                    }
                }
            }
            ListProtector.remove(arrayList, size);
        }
    }

    public final Map<String, String> NR() {
        return (Map) this.LLJJJ.getValue();
    }

    public final AccountFlowSharedViewModel OR() {
        return (AccountFlowSharedViewModel) this.LL.getValue();
    }

    public final String PR() {
        return (String) this.LLJILJIL.getValue();
    }

    @Override // X.C0XYD
    public final String Qm() {
        return (String) this.LLILZLL.getValue();
    }

    public String RR() {
        return (String) this.LLJI.getValue();
    }

    public final EnumC852660Xce SR() {
        return (EnumC852660Xce) this.LLJJJIL.getValue();
    }

    public final String UR() {
        return (String) this.LLJ.getValue();
    }

    @Override // X.C0XYD
    public final C0XWU VF() {
        return (C0XWU) this.LLJJI.getValue();
    }

    public final EnumC852910Xd3 VR() {
        return (EnumC852910Xd3) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC852200Xbu
    public final String channel() {
        return (String) this.LLJILJILJ.getValue();
    }

    @Override // X.C0XYD
    public final C0XU1 dD() {
        return (C0XU1) this.LLJJIJI.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLIZ.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLIZLLLIL.getValue();
    }

    @Override // X.C0XYD
    public final C0XXT m8() {
        return (C0XXT) this.LLJJ.getValue();
    }

    public BaseAccountFlowFragment() {
        String string;
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS557S0100000_13(new AwS557S0100000_13((Fragment) this, 60), 61));
        this.LLILLJJLI = C336720DHy.LIZ(this, C13LE.LIZ(AccountFlowFragmentViewModel.class), new AwS548S0100000_4(c01gwLIZ, 49), new AwS405S0200000_4((Function0) null, c01gwLIZ, 9), new AwS405S0200000_4(this, c01gwLIZ, 10));
        this.LLILZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 62));
        this.LLILZIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 52));
        this.LLILZLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 57));
        this.LLIZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 44));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 45));
        this.LLJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 59));
        this.LLJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 46));
        Bundle arguments = getArguments();
        this.LLJIJIL = (arguments == null || (string = arguments.getString("enter_type")) == null) ? "" : string;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 55));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 43));
        this.LLJILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 54));
        this.LLJJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(76));
        this.LLJJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(74));
        this.LLJJIII = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(75));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(77));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 56));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 53));
        this.LLJJJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 51));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 58));
    }

    public String LJJLIIIJJI() {
        return getEnterFrom();
    }

    public String LLIIJI() {
        return getEnterMethod();
    }

    @Override // X.C0XYD
    public EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
        return VR();
    }

    @Override // X.InterfaceC852200Xbu
    public final String bt() {
        return PR();
    }

    @Override // X.InterfaceC852200Xbu
    public final String dm() {
        return RR();
    }

    @Override // X.InterfaceC852200Xbu
    public final Bundle getExtras() {
        return getArguments();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        MR();
        super.onDestroyView();
    }

    @Override // X.C0XYD
    public final EnumC852660Xce scene() {
        return SR();
    }

    @Override // X.InterfaceC852200Xbu
    public final String Nn() {
        return this.LLJIJIL;
    }

    public final void WR(Bundle bundle) {
        C19EG activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) ViewModelProviders.of(activity).get(ActionResultModel.class)).LLILLJJLI.postValue(bundle);
        }
    }

    @Override // X.C0XYD
    public final void fo(Bundle bundle) {
        C19EG activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) ViewModelProviders.of(activity).get(ActionResultModel.class)).LL.postValue(bundle);
        }
    }

    @Override // X.C0XYD
    public final <T extends C0XGA> void gk(AbstractC846040XGw<T> abstractC846040XGw) {
        if (this.LLILLL == null) {
            this.LLILLL = new ArrayList<>();
        }
        this.LLILLL.add(abstractC846040XGw);
    }
}
