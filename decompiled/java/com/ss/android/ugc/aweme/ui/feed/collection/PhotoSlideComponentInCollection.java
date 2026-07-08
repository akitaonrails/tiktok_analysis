package com.ss.android.ugc.aweme.ui.feed.collection;

import X.C01GW;
import X.C0ZP4;
import X.C13LE;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C692960RGc;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionEventAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.config.FeedPhotoSlideBaseConfig;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent;
import com.ss.android.ugc.aweme.ui.feed.protocol.FeedPhotoSlideConfigurationProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoAfterViewPagerItemSetProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoSlideComponentInCollection extends FeedPhotoSlideComponent implements InterfaceC469360Ias, PhotoAfterViewPagerItemSetProtocol {
    public C0ZP4 LLLLJ;
    public C0ZP4 LLLLJI;
    public final C630740Ooa LLLLIILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 977));
    public final C630740Ooa LLLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 976));
    public final C630740Ooa LLLLILI = C628500Oky.LIZ(new AwS555S0100000_11(this, 975));
    public final C01GW LLLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 979));
    public final C01GW LLLLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 978));
    public final C01GW LLLLLILLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(223));

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent
    public final void Ip() {
        C0ZP4 c0zp4 = this.LLLLJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLLLJI;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        this.LLLLJ = C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0RGb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9P) obj).LL);
            }
        }, null, new AwS625S0100000_11(this, 79), 6);
        this.LLLLJI = C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.0RGa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJJ;
            }
        }, C736820SvI.LJ(), new AwS625S0100000_11(this, 80), 4);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 1493204508 || iHashCode == 1649553494) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent
    public final FeedPhotoSlideConfigurationProtocol Fp() {
        return (FeedPhotoSlideBaseConfig) this.LLLLLILLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, X.InterfaceC696720RUo
    public final boolean ie() {
        return ((Boolean) this.LLLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, X.InterfaceC696720RUo
    public final boolean ke() {
        return ((Boolean) this.LLLLLIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem
    public final void Bp() {
        super.Bp();
        CollectionEventAbility collectionEventAbility = (CollectionEventAbility) this.LLLLILI.getValue();
        if (collectionEventAbility != null) {
            C13LE.LIZ(VideoPlayViewModel.class);
            collectionEventAbility.CP();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        if (ie()) {
            C1618440sDa.LIZIZ.LJJ().LJI(this, "post_mode_feed_item_slide_photos_in_collection", true, new AwS555S0100000_11(this, 980));
        } else {
            super.Co();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return ie() ? R.layout.e_g : R.layout.e_h;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent
    public final void g2() {
        super.g2();
        C0ZP4 c0zp4 = this.LLLLJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLLLJI;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, X.InterfaceC696720RUo
    public final boolean le() {
        return ie();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent, com.ss.android.ugc.aweme.ui.feed.photos.assem.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoAfterViewPagerItemSetProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.collection.PhotoSlideComponentInCollection$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoAfterViewPagerItemSetProtocol.class, this);
                    }
                }
            });
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIL.getValue();
        if (iPhotoSlidesAbility != null) {
            iPhotoSlidesAbility.ML0(false);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoSlidesEventDispatchAbility.class, null);
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.LLJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoAfterViewPagerItemSetProtocol
    public final void YQ(int i, boolean z) {
        Object obj;
        if ((z && i > 0) || !ke()) {
            return;
        }
        FriendsDetailTransitionAbility friendsDetailTransitionAbility = (FriendsDetailTransitionAbility) this.LLLLIILLL.getValue();
        if (friendsDetailTransitionAbility != null) {
            friendsDetailTransitionAbility.xG1();
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1440005kM.LIZ(new C692960RGc(((VideoItemParams) obj).getAweme().getAid(), i));
    }
}
