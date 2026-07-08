package com.ss.android.ugc.aweme.ecommerce.ug.trending.banner;

import X.C013C;
import X.C019F;
import X.C0DWM;
import X.C1006703wf;
import X.C13LE;
import X.C1637806bA;
import X.C1743160vSk;
import X.C1743170vSl;
import X.C1743190vSn;
import X.C19719912Dl;
import X.C1C7U;
import X.C21599719g3;
import X.C2217381BqS;
import X.C422000Ggg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class EcTrendingBannerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public int LLJ;
    public C0DWM LLJI;
    public C1006703wf LLJIJIL;
    public C21599719g3 LLJILJIL;
    public C422000Ggg LLJILJILJ;
    public C1743170vSl LLJILLL;
    public EcTrendingBannerAssem$setUpAutoScroll$1 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcTrendingBannerAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EcTrendingBannerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 350), AFwS264S0000000_24.get$arr$(97), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final TrendingListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (TrendingListViewModel) assemVMLazy.getValue();
    }

    public final void Ho() {
        if (this.LLJ <= 0) {
            return;
        }
        EcTrendingBannerAssem$setUpAutoScroll$1 ecTrendingBannerAssem$setUpAutoScroll$1 = this.LLJJ;
        if (ecTrendingBannerAssem$setUpAutoScroll$1 != null) {
            ecTrendingBannerAssem$setUpAutoScroll$1.removeCallbacksAndMessages(null);
        }
        EcTrendingBannerAssem$setUpAutoScroll$1 ecTrendingBannerAssem$setUpAutoScroll$12 = this.LLJJ;
        if (ecTrendingBannerAssem$setUpAutoScroll$12 != null) {
            C786410Ut5.LJLJJI(0, this.LLJ, ecTrendingBannerAssem$setUpAutoScroll$12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem$setUpAutoScroll$1] */
    public final void Jo() {
        C1743170vSl c1743170vSl;
        List<BannerFrame> list;
        if (this.LLJ > 0 && (c1743170vSl = this.LLJILLL) != null && (list = c1743170vSl.LLILZIL) != null && ((ArrayList) list).size() > 0) {
            if (this.LLJJ == null) {
                final Looper mainLooper = Looper.getMainLooper();
                this.LLJJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.ug.trending.banner.EcTrendingBannerAssem$setUpAutoScroll$1
                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        C21599719g3 c21599719g3;
                        C1C7U.LIZ("EcTrendingBannerAssem@bed0.setUpAutoScroll$1");
                        super.handleMessage(message);
                        C21599719g3 c21599719g32 = this.LL.LLJILJIL;
                        if (c21599719g32 != null && c21599719g32.getAlpha() > 0.8f && (c21599719g3 = this.LL.LLJILJIL) != null) {
                            c21599719g3.setCurrentItem(c21599719g3.getCurrentItem() + 1);
                        }
                        this.LL.Ho();
                        C1C7U.LIZIZ("EcTrendingBannerAssem@bed0.setUpAutoScroll$1");
                    }
                };
            }
            Ho();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1743170vSl c1743170vSl = this.LLJILLL;
        if (c1743170vSl != null) {
            c1743170vSl.LLILZLL.clear();
            ((ArrayList) c1743170vSl.LLILZIL).clear();
        }
        C1743160vSk.LIZ.getClass();
        ((ArrayList) C1743160vSk.LIZIZ).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        EcTrendingBannerAssem$setUpAutoScroll$1 ecTrendingBannerAssem$setUpAutoScroll$1 = this.LLJJ;
        if (ecTrendingBannerAssem$setUpAutoScroll$1 != null) {
            ecTrendingBannerAssem$setUpAutoScroll$1.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Jo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.yk5);
        View viewFindViewById2 = view.findViewById(R.id.ykd);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0vSf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1742800vSA) obj).LLJI;
            }
        }, null, new C1743190vSn(new C013C(), viewFindViewById2, viewFindViewById, this, view), 6);
    }
}
