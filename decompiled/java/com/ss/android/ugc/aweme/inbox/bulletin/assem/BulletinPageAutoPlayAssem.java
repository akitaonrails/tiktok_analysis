package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1566880qsQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class BulletinPageAutoPlayAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 653));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 652));
    public final AssemVMLazy LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public InterfaceC1566880qsQ LLJILLL;
    public int LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPageAutoPlayAssem.class, "autoPlayViewModel", "getAutoPlayViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinAutoPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinPageAutoPlayAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinAutoPlayViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 655), AFwS264S0000000_24.get$arr$(186), null, true);
        this.LLJJ = -1;
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 654));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = (RecyclerView) this.LLIZLLLIL.getValue();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener((AbstractC1585810rMx) this.LLJJI.getValue());
        }
        InterfaceC1566880qsQ interfaceC1566880qsQ = this.LLJILLL;
        if (interfaceC1566880qsQ != null) {
            interfaceC1566880qsQ.LJJL();
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJILJIL = false;
        InterfaceC1566880qsQ interfaceC1566880qsQ = this.LLJILLL;
        if (interfaceC1566880qsQ != null) {
            interfaceC1566880qsQ.LJJL();
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJILJIL = true;
        Ho(0);
    }

    public final void Go(InterfaceC1566880qsQ interfaceC1566880qsQ) {
        int position;
        if (interfaceC1566880qsQ != null) {
            interfaceC1566880qsQ.startPlay();
        }
        InterfaceC1566880qsQ interfaceC1566880qsQ2 = this.LLJILLL;
        if (interfaceC1566880qsQ2 != null) {
            interfaceC1566880qsQ2.LJJL();
        }
        this.LLJILLL = interfaceC1566880qsQ;
        if (interfaceC1566880qsQ != null) {
            position = interfaceC1566880qsQ.getPosition();
        } else {
            position = -1;
        }
        this.LLJJ = position;
    }

    public final void Ho(int i) {
        int iIntValue;
        int iIntValue2;
        int i2;
        int iIndexOf;
        InterfaceC1566880qsQ interfaceC1566880qsQ;
        RecyclerView recyclerView = (RecyclerView) this.LLIZLLLIL.getValue();
        if (recyclerView == null) {
            return;
        }
        Pair pair = null;
        if (!this.LLJILJIL) {
            InterfaceC1566880qsQ interfaceC1566880qsQ2 = this.LLJILLL;
            if (interfaceC1566880qsQ2 != null) {
                interfaceC1566880qsQ2.LJJL();
            }
            this.LLJILLL = null;
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LLJ.getValue();
        if (linearLayoutManager != null) {
            pair = new Pair(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
        }
        if (pair != null) {
            iIntValue = ((Number) pair.getFirst()).intValue();
            iIntValue2 = ((Number) pair.getSecond()).intValue();
        } else {
            iIntValue = -1;
            iIntValue2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        if (iIntValue <= iIntValue2) {
            int i3 = iIntValue;
            while (true) {
                Object objFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3);
                if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1566880qsQ) && (interfaceC1566880qsQ = (InterfaceC1566880qsQ) objFindViewHolderForAdapterPosition) != null && interfaceC1566880qsQ.B0()) {
                    arrayList.add(interfaceC1566880qsQ);
                }
                if (i3 == iIntValue2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (C13LP.LJJJJ(this.LLJILLL, arrayList) && iIntValue <= (i2 = this.LLJJ) && i2 <= iIntValue2) {
            if (i != -1) {
                if (i == 1 && (iIndexOf = arrayList.indexOf(this.LLJILLL)) > 0) {
                    Go((InterfaceC1566880qsQ) ListProtector.get(arrayList, iIndexOf - 1));
                    return;
                }
                return;
            }
            int iIndexOf2 = arrayList.indexOf(this.LLJILLL);
            if (iIndexOf2 >= arrayList.size() - 1) {
                return;
            }
            Go((InterfaceC1566880qsQ) ListProtector.get(arrayList, iIndexOf2 + 1));
            return;
        }
        if (i != -1) {
            if (i != 0 && i != 1) {
                return;
            }
            Go((InterfaceC1566880qsQ) C13LP.LJJLIIIJL(arrayList));
            return;
        }
        Go((InterfaceC1566880qsQ) C13LP.LJJJLL(arrayList));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RecyclerView recyclerView = (RecyclerView) this.LLIZLLLIL.getValue();
        if (recyclerView != null) {
            recyclerView.addOnScrollListener((AbstractC1585810rMx) this.LLJJI.getValue());
        }
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qsO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618040OLy) obj).LL;
            }
        }, this, null, null, null, new AwS603S0100000_24(this, 117), 28, null);
    }
}
