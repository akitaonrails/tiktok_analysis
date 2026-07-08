package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C03H5;
import X.C0HHT;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C281460B1k;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasePhotoSlidesAssem<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(509));
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final BasePhotoSlidesAssem$descExpandModeProtocol$1 LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasePhotoSlidesAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem$descExpandModeProtocol$1] */
    public BasePhotoSlidesAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoFavoriteVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 998), null, AFwS243S0000000_11.get$arr$(508));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(510));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(511));
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11((BasePhotoSlidesAssem) this, 997));
        this.LLLF = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem$descExpandModeProtocol$1
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void Bp() {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJZ.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(AFwS243S0000000_11.get$arr$(729));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        if (C281460B1k.LIZ()) {
            return;
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLF));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0S8h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, new AwS625S0100000_11(this, 81), 6);
    }
}
