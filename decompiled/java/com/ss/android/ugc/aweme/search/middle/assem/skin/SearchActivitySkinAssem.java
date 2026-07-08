package com.ss.android.ugc.aweme.search.middle.assem.skin;

import X.C019F;
import X.C0QLM;
import X.C0QOE;
import X.C0QOO;
import X.C100000Zi;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C671330QUx;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736820SvI;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC669910QPl;
import X.InterfaceC671320QUw;
import Y.AObserverS214S0100000_10;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchActivitySkinAssem extends UISlotAssem implements SearchSkinAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0QOO.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final AObserverS214S0100000_10 LLJJIJI;
    public final AObserverS214S0100000_10 LLJJIJIIJIL;
    public final AObserverS214S0100000_10 LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchActivitySkinAssem.class, "skinBgVM", "getSkinBgVM()Lcom/ss/android/ugc/aweme/search/middle/assem/skin/SearchSkinBgViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchActivitySkinAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchSkinBgViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 773), AFwS241S0000000_10.get$arr$(181), null, true);
        this.LLJJIJI = new AObserverS214S0100000_10(this, 31);
        this.LLJJIJIIJIL = new AObserverS214S0100000_10(this, 30);
        this.LLJJIJIL = new AObserverS214S0100000_10(this, 29);
        this.LLJJJ = true;
        this.LLJJJJ = C100000Zi.LIZ();
        this.LLJJJJJIL = C100000Zi.LIZ();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.esb;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1239379587) {
            return null;
        }
        return this;
    }

    public final C0QOO ip() {
        return (C0QOO) this.LLJJI.getValue();
    }

    public final SearchSkinBgViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SearchSkinBgViewModel) assemVMLazy.getValue();
    }

    public final View hp() {
        C671330QUx c671330QUx;
        C0QOO c0qooIp = ip();
        if (c0qooIp == null || (c671330QUx = c0qooIp.LLILZ) == null) {
            return null;
        }
        return c671330QUx.LIZ;
    }

    public final SmartImageView kp() {
        C671330QUx c671330QUx;
        C0QOO c0qooIp = ip();
        View view = (c0qooIp == null || (c671330QUx = c0qooIp.LLILZ) == null) ? null : c671330QUx.LIZIZ;
        if (view instanceof SmartImageView) {
            return (SmartImageView) view;
        }
        return null;
    }

    public final SmartImageView lp() {
        C671330QUx c671330QUx;
        C0QOO c0qooIp = ip();
        View view = (c0qooIp == null || (c671330QUx = c0qooIp.LLILZ) == null) ? null : c671330QUx.LIZJ;
        if (view instanceof SmartImageView) {
            return (SmartImageView) view;
        }
        return null;
    }

    public final SmartImageView mp() {
        C671330QUx c671330QUx;
        C0QOO c0qooIp = ip();
        View view = (c0qooIp == null || (c671330QUx = c0qooIp.LLILZ) == null) ? null : c671330QUx.LIZLLL;
        if (view instanceof SmartImageView) {
            return (SmartImageView) view;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC669910QPl interfaceC669910QPl;
        NextLiveData<Integer> nextLiveDataLIZIZ;
        InterfaceC671320QUw interfaceC671320QUw;
        NextLiveData<Boolean> ecMiddleAIStateObservable;
        InterfaceC671320QUw interfaceC671320QUw2;
        NextLiveData<Boolean> nextLiveDataLJ;
        super.onDestroy();
        C0QOO c0qooIp = ip();
        if (c0qooIp != null && (interfaceC671320QUw2 = c0qooIp.LLILLJJLI) != null && (nextLiveDataLJ = interfaceC671320QUw2.LJ()) != null) {
            nextLiveDataLJ.removeObserver(this.LLJJIJIIJIL);
        }
        C0QOO c0qooIp2 = ip();
        if (c0qooIp2 != null && (interfaceC671320QUw = c0qooIp2.LLILLJJLI) != null && (ecMiddleAIStateObservable = interfaceC671320QUw.getEcMiddleAIStateObservable()) != null) {
            ecMiddleAIStateObservable.removeObserver(this.LLJJIJIL);
        }
        C0QOO c0qooIp3 = ip();
        if (c0qooIp3 == null || (interfaceC669910QPl = c0qooIp3.LL) == null || (nextLiveDataLIZIZ = interfaceC669910QPl.LIZIZ()) == null) {
            return;
        }
        nextLiveDataLIZIZ.removeObserver(this.LLJJIJI);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJJJIL = false;
        sp(op().getState());
    }

    @Override // com.ss.android.ugc.aweme.search.SearchSkinAbility
    public final void J81(boolean z) {
        op().setState(new AwS25S0010000_10(z, 21));
    }

    @Override // com.ss.android.ugc.aweme.search.SearchSkinAbility
    public final void MJ0(boolean z) {
        op().setState(new AwS25S0010000_10(z, 20));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC669910QPl interfaceC669910QPl;
        NextLiveData<Integer> nextLiveDataF6;
        InterfaceC671320QUw interfaceC671320QUw;
        NextLiveData<Boolean> ecMiddleAIStateObservable;
        InterfaceC671320QUw interfaceC671320QUw2;
        NextLiveData<Boolean> nextLiveDataLJ;
        super.onViewCreated(view);
        SearchSkinBgViewModel searchSkinBgViewModelOp = op();
        subscribe(searchSkinBgViewModelOp, C736820SvI.LIZIZ(searchSkinBgViewModelOp.usedInReusedScene), null, new AwS624S0100000_10(this, 31));
        C0QOO c0qooIp = ip();
        if (c0qooIp != null && (interfaceC671320QUw2 = c0qooIp.LLILLJJLI) != null && (nextLiveDataLJ = interfaceC671320QUw2.LJ()) != null) {
            nextLiveDataLJ.removeObserver(this.LLJJIJIIJIL);
            getActualLifecycleOwner();
            nextLiveDataLJ.observe(this, this.LLJJIJIIJIL);
        }
        C0QOO c0qooIp2 = ip();
        if (c0qooIp2 != null && (interfaceC671320QUw = c0qooIp2.LLILLJJLI) != null && (ecMiddleAIStateObservable = interfaceC671320QUw.getEcMiddleAIStateObservable()) != null) {
            ecMiddleAIStateObservable.removeObserver(this.LLJJIJIL);
            getActualLifecycleOwner();
            ecMiddleAIStateObservable.observe(this, this.LLJJIJIL);
        }
        C0QOO c0qooIp3 = ip();
        if (c0qooIp3 != null && (interfaceC669910QPl = c0qooIp3.LL) != null && (nextLiveDataF6 = interfaceC669910QPl.F6()) != null) {
            nextLiveDataF6.removeObserver(this.LLJJIJI);
            getActualLifecycleOwner();
            nextLiveDataF6.observe(this, this.LLJJIJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C671310QUv r19) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.assem.skin.SearchActivitySkinAssem.sp(X.0QUv):void");
    }

    @Override // com.ss.android.ugc.aweme.search.SearchSkinAbility
    public final void Z01(C0QOE c0qoe, C0QLM c0qlm) {
        op().setState(new AwS376S0200000_10(c0qoe, c0qlm, 162));
    }
}
