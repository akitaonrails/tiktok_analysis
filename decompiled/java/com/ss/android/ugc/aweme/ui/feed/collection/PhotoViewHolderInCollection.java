package com.ss.android.ugc.aweme.ui.feed.collection;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C03H5;
import X.C0R6M;
import X.C0RF0;
import X.C0RH2;
import X.C0RH3;
import X.C0RHA;
import X.C0S9P;
import X.C0SUL;
import X.C0T1R;
import X.C118300cf;
import X.C1376010luZ;
import X.C13LE;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C2179771ASp;
import X.C304280BwI;
import X.C343710Ddh;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691430RAf;
import X.C696330RTb;
import X.C720310SNh;
import X.C721220SQu;
import X.C723830SaL;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.ProviderViewHolderCompatibility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoViewHolderInCollection extends BasePostViewCell implements PhotoModeVHAbility, IPhotosViewHolderType {
    public final C0RF0 LLLLII;
    public final C01GW LLLLIIIILLL;
    public String LLLLIIL;
    public final C696330RTb LLLLIILL;
    public final C630740Ooa LLLLIILLL;
    public final C630740Ooa LLLLIL;
    public C0RH2 LLLLILI;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void LLFF() {
        LLLLZIL(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell
    public boolean LLLLJI() {
        return this instanceof FriendsDetailPhotoViewHolder;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLZZZIL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 6;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void fadeInWidgetContainer() {
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_photos";
    }

    public final PhotoViewModelV2 LLLLZI() {
        return (PhotoViewModelV2) this.LLLLIIIILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZ() {
        if (C0T1R.LJFF(this.LLJJIJIIJIL)) {
            return !LLLLZI().LLJJ;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean l1() {
        if (!C0T1R.LJFF(this.LLJJIJIIJIL)) {
            return false;
        }
        if (C304280BwI.LIZIZ()) {
            IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
            return Intrinsics.LJFF(iPhotoModeAbility != null ? Boolean.valueOf(iPhotoModeAbility.Av2()) : ((C0S9P) LLLLZI().getState()).LLIZ, Boolean.TRUE);
        }
        Boolean bool = ((C0S9P) LLLLZI().getState()).LLIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void permitEventReport() {
        this.LLLLIILL.LLJIJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final boolean LLLZZIL() {
        return !LLLLZI().LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final int getCurrentPlayPosition() {
        IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
        if (iPhotoModeAbility != null) {
            return iPhotoModeAbility.fj1();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final C0SUL om() {
        LongPressAbility longPressAbility = (LongPressAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LongPressAbility.class, null);
        if (longPressAbility != null) {
            return longPressAbility.om();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        LLLLZI().LJJIII();
        ((LinkedHashMap) C720310SNh.LJ).clear();
        LLLLZIL(false);
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), PhotoModeVHAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoModeVHAbility
    public final C696330RTb P02() {
        return this.LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void F0(String str) {
        LLLLZI().LLILLJJLI.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0RH2, X.0Rwk] */
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        String strCQ2;
        super.LJJIJIIJIL(i);
        C19EG c19eg = this.LLJILLL;
        if (c19eg != null) {
            strCQ2 = C343710Ddh.LIZ(c19eg).CQ2();
        } else {
            strCQ2 = null;
        }
        this.LLLLIIL = strCQ2;
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        ?? r1 = new AbstractC712240Rwk() { // from class: X.0RH2
            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i2) {
                if (i2 == 1) {
                    if (c118300cf.element != i2) {
                        this.LLLLZI().wQ2();
                        c118300cf.element = i2;
                        return;
                    }
                    return;
                }
                if (i2 != 0 || c118300cf.element == i2) {
                    return;
                }
                this.LLLLZI().xQ2();
                c118300cf.element = i2;
            }
        };
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLLIILLL.getValue();
        if (userFeedViewPagerAbility != 0) {
            userFeedViewPagerAbility.yR(r1);
        }
        this.LLLLILI = r1;
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJIJJ = 0;
        this.LLLLIILL.LLILLJJLI = C2179771ASp.LJIIIIZZ();
        C696330RTb c696330RTb = this.LLLLIILL;
        c696330RTb.LLIZ = 0L;
        c696330RTb.LLIZLLLIL = 0L;
        LLLLZI().OQ2(this.LLJILLL);
        LLLLZIL(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIL(C0R6M c0r6m) {
        if (c0r6m != null && Intrinsics.LJFF(c0r6m.LIZIZ, "HOME")) {
            LLLLZLL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIZ(C0RHA c0rha) {
        if (c0rha != null) {
            if (c0rha.LIZ) {
                LLLLZI().getClass();
                LLLLZI().PQ2();
                LLLLZLL(false);
            } else {
                LLLLZI().getClass();
                PhotoViewModelV2.JQ2(LLLLZI());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJLIIIL(int r5) {
        /*
            r4 = this;
            super.LJLIIIL(r5)
            r3 = 0
            r0 = 2
            if (r0 != r5) goto L44
            X.19EG r0 = r4.LLJILLL
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = X.C486860J7k.LIZIZ(r0)
            java.lang.String r0 = "page_profile"
            boolean r2 = r1.FQ2(r0)
        L15:
            java.lang.String r1 = r4.LLLLIIL
            X.19EG r0 = r4.LLJILLL
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r0)
            java.lang.String r0 = r0.CQ2()
        L23:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            X.0RF0 r0 = r4.LLLLII
            androidx.fragment.app.Fragment r0 = r0.LIZJ
            boolean r0 = r0.getUserVisibleHint()
            if (r0 == 0) goto L38
            if (r2 != 0) goto L38
            if (r1 == 0) goto L38
        L35:
            r4.LLLLZIL(r3)
        L38:
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r4.LLLLZI()
            r0.KQ2()
            return
        L40:
            r0 = 0
            goto L23
        L42:
            r2 = 0
            goto L15
        L44:
            if (r0 == r5) goto L38
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection.LJLIIIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public void LLLI(int i) {
        super.LLLI(i);
        LLLLZIL(true);
    }

    public final void LLLLZIL(boolean z) {
        if (z) {
            LLLLZLL(false);
        } else {
            LLLLZLL(true);
        }
    }

    public final void LLLLZLL(boolean z) {
        if (z) {
            C0RH3 c0rh3LIZJ = this.LLLLIILL.LIZJ();
            if (c0rh3LIZJ != null) {
                PhotoViewModelV2 photoViewModelV2LLLLZI = LLLLZI();
                photoViewModelV2LLLLZI.LLJILLL.LIZJ(c0rh3LIZJ.LIZ, c0rh3LIZJ.LIZIZ);
            }
            Aweme aweme = this.LLJJIJIIJIL;
            if (aweme != null) {
                this.LLLLIILL.LIZ(aweme);
                return;
            }
            return;
        }
        C696330RTb.LIZLLL(this.LLLLIILL);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean declineReport(String str) {
        return this.LLLLIILL.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final long getSavedDuration(String str) {
        return this.LLLLIILL.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        C0RH2 c0rh2 = this.LLLLILI;
        if (c0rh2 != null) {
            UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLLIILLL.getValue();
            if (userFeedViewPagerAbility != null) {
                userFeedViewPagerAbility.vE1(c0rh2);
            }
            this.LLLLILI = null;
        }
        LLLLZIL(false);
        LLLLZI().LJJIII();
        ((LinkedHashMap) C720310SNh.LJ).clear();
        ProviderViewHolderCompatibility providerViewHolderCompatibility = (ProviderViewHolderCompatibility) this.LLLLIL.getValue();
        if (providerViewHolderCompatibility != null) {
            providerViewHolderCompatibility.gP1(this.LLJJIJIIJIL, new AwS555S0100000_11(this, 985));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        super.onPausePlay(str);
        LLLLZI().KQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        super.onRenderFirstFrame(c1480420ocy);
        LLLLZI().LQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        super.onRenderReady(c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        super.onResumePlay(str);
        if (this.LLLLIILL.LLJI == -1) {
            LLLLZLL(false);
        }
        LLLLZI().LQ2();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setCurrentPlayPosition(int i) {
        IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IPhotoModeAbility.class, null);
        if (iPhotoModeAbility != null) {
            iPhotoModeAbility.kH0(i);
        }
    }

    public PhotoViewHolderInCollection(C0RF0 c0rf0, C691430RAf c691430RAf) {
        super(c0rf0, c691430RAf);
        this.LLLLII = c0rf0;
        this.LLLLIIIILLL = C737910Sx3.LIZLLL(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(775), EnumC452301pR.SYNCHRONIZED);
        this.LLLLIILL = new C696330RTb(c0rf0.LJIIIZ, null, 11);
        this.LLLLIILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1625));
        this.LLLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1624));
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, PhotoModeVHAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        super.LJJJJ(i, aweme);
        LLLLZI().LLJJIJIIJIL = aweme;
        if (aweme != null && C721220SQu.LIZLLL(aweme)) {
            C723830SaL.LIZLLL(NG1(), C13LE.LIZ(PhotoFeedLivePhotoComponent.class));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public /* bridge */ /* synthetic */ VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        return LLLIILIL(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        LLLLZI().LQ2();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void saveDuration(long j, String str) {
        this.LLLLIILL.LLJILJILJ += j;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setStartTime(long j, String str) {
        this.LLLLIILL.LLILZIL = Long.valueOf(j);
    }
}
