package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C0SOW;
import X.C1558520qew;
import X.C19252910Tv;
import X.C687700QyG;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC707300Rom;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC704100Rjc;
import X.InterfaceC737790Swr;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;

/* JADX INFO: loaded from: classes12.dex */
public final class TabletsPhotosDotIndicatorAssem extends AbsPhotosDotIndicatorAssem implements BottomSlideIndicatorAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public final TabletsPhotosDotIndicatorAssem LLLIZZ = this;

    @Override // com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility
    public final void Yv1() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 144986585) {
            return null;
        }
        return this;
    }

    @Override // X.C0SDU
    public final boolean isVisible() {
        IAdCarouselService iAdCarouselService = (IAdCarouselService) this.LLLIIIL.getValue();
        if (iAdCarouselService != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (iAdCarouselService.LIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        C0SOW c0sow;
        C0SOW c0sow2 = this.LLJLLL;
        if (c0sow2 != null) {
            c0sow2.setDotSize(C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LIZLLL(null, null));
        }
        super.up(videoItemParams);
        IAdCarouselService iAdCarouselService = (IAdCarouselService) this.LLLIIIL.getValue();
        if (iAdCarouselService != null && iAdCarouselService.LIZ(videoItemParams.getAweme())) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LJ() && (c0sow = this.LLJLLL) != null) {
            c0sow.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem
    public final EnumC707300Rom Jp(boolean z) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (AwemeExtKt.isAdTraffic(((VideoItemParams) obj).getAweme())) {
            if (z) {
                if (Ip()) {
                    return EnumC707300Rom.PROGRESS_BAR;
                }
                return EnumC707300Rom.SLIDE;
            }
            if (Ip()) {
                return EnumC707300Rom.PROGRESS_BAR;
            }
            return EnumC707300Rom.DEFAULT;
        }
        return super.Jp(z);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLLIZZ, BottomSlideIndicatorAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            c0sow.setIsTabletCarousel(true);
        }
        InterfaceC704100Rjc interfaceC704100RjcLLFF = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF();
        C0SOW c0sow2 = this.LLJLLL;
        if (!(c0sow2 instanceof View)) {
            c0sow2 = null;
        }
        interfaceC704100RjcLLFF.LIZIZ(c0sow2);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLLIZZ, BottomSlideIndicatorAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility
    public final void Od(float f, int i) {
        C0SOW c0sow;
        if (Ip() && (c0sow = this.LLJLLL) != null) {
            c0sow.LJIILIIL(f, i);
        }
    }

    @Override // X.C0RHD
    public final boolean R1(MotionEvent motionEvent, View view) {
        return onTouch(view, motionEvent);
    }
}
