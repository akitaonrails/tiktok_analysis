package com.ss.android.ugc.aweme.mob;

import X.C01GW;
import X.C0RF0;
import X.C0S9P;
import X.C0SAX;
import X.C0SMF;
import X.C13LE;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C716880SAc;
import X.C716900SAe;
import X.C716910SAf;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC469360Ias;
import X.InterfaceC719500SKe;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mob.PhotoFeedImageMonitorComponent;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoFeedImageMonitorComponent extends BaseCellLogicComponent<PhotoFeedImageMonitorComponent> implements InterfaceC1146704e9 {
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(298));
    public final C0SAX LLJJIJIIJIL = new C0SAX();
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 513));
    public final C716900SAe LLJJJ = new InterfaceC469360Ias() { // from class: X.0SAe
        @Override // X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageSelected(int i) {
            if (((PhotoViewModelV2) this.LL.LLJJIJI.getValue()).LLJJJJ) {
                PhotoFeedImageMonitorComponent photoFeedImageMonitorComponent = this.LL;
                int i2 = photoFeedImageMonitorComponent.LLJJJJJIL;
                if (i2 != i) {
                    photoFeedImageMonitorComponent.LLJJIJIIJIL.LIZIZ(i2);
                    this.LL.LLJJIJIIJIL.LIZJ(i);
                }
                this.LL.LLJJJJJIL = i;
            }
        }
    };
    public final C716880SAc LLJJJIL = new InterfaceC719500SKe() { // from class: X.0SAc
        @Override // X.InterfaceC719500SKe
        public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
            this.LL.LLJJIJIIJIL.LIZLLL(slidesImageLoadParams);
        }

        @Override // X.InterfaceC719500SKe
        public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
            this.LL.LLJJIJIIJIL.LIZLLL(slidesImageLoadParams);
        }

        @Override // X.InterfaceC719500SKe
        public final void n5(int i, JSONObject jSONObject) {
            String strOptString;
            C0SAX c0sax = this.LL.LLJJIJIIJIL;
            c0sax.getClass();
            try {
                C0SAZ c0sazLIZ = c0sax.LIZ(i);
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("hit_cdn_cache");
                } else {
                    strOptString = null;
                }
                c0sazLIZ.LJIIIIZZ = strOptString;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    };
    public final C716910SAf LLJJJJ = new C0SMF() { // from class: X.0SAf
        @Override // X.C0SMF
        public final void Yb() {
        }

        @Override // X.C0SMF
        public final void wd(int i) {
            this.LL.LLJJIJIIJIL.LJ(i);
        }
    };
    public int LLJJJJJIL = -1;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    public final IPhotoSlidesEventDispatchAbility Bo() {
        return (IPhotoSlidesEventDispatchAbility) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo != null) {
            iPhotoSlidesEventDispatchAbilityBo.Qt(this.LLJJJIL);
        }
        this.LLJJIJIIJIL.LIZIZ(this.LLJJJJJIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo != null) {
            iPhotoSlidesEventDispatchAbilityBo.b3(this.LLJJJ);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo2 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo2 != null) {
            iPhotoSlidesEventDispatchAbilityBo2.Qt(this.LLJJJIL);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo3 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo3 != null) {
            iPhotoSlidesEventDispatchAbilityBo3.tj(this.LLJJJJ);
        }
        C0SAX c0sax = this.LLJJIJIIJIL;
        c0sax.LIZIZ.LIZLLL(null, null, AFwS198S0000000_11.get$arr$(538));
        ((LinkedHashMap) c0sax.LIZ).clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo != null) {
            iPhotoSlidesEventDispatchAbilityBo.LLJJI(this.LLJJJ);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo2 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo2 != null) {
            iPhotoSlidesEventDispatchAbilityBo2.x6(this.LLJJJIL);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo3 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo3 != null) {
            iPhotoSlidesEventDispatchAbilityBo3.K5(this.LLJJJJ);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo != null) {
            iPhotoSlidesEventDispatchAbilityBo.b3(this.LLJJJ);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo2 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo2 != null) {
            iPhotoSlidesEventDispatchAbilityBo2.Qt(this.LLJJJIL);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo3 = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo3 != null) {
            iPhotoSlidesEventDispatchAbilityBo3.tj(this.LLJJJJ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feed-monitor, holder pause mode ");
            sbLIZ.append(i);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJJIJIIJIL.LIZIZ(this.LLJJJJJIL);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0SAX c0sax = this.LLJJIJIIJIL;
        String aid = videoItemParams2.getAweme().getAid();
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        Integer numValueOf = Integer.valueOf(AwemeBizOptExtKt.getAwemeCacheType(videoItemParams2.getAweme()));
        c0sax.LIZJ = aid;
        c0sax.LJ = str;
        c0sax.LJFF = Boolean.FALSE;
        c0sax.LIZLLL = numValueOf;
        int i = ((C0S9P) ((AssemViewModel) this.LLJJIJI.getValue()).getState()).LL;
        this.LLJJJJJIL = i;
        this.LLJJIJIIJIL.LJ(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbilityBo = Bo();
        if (iPhotoSlidesEventDispatchAbilityBo != null) {
            iPhotoSlidesEventDispatchAbilityBo.x6(this.LLJJJIL);
        }
        this.LLJJIJIIJIL.LIZJ(this.LLJJJJJIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        C0SAX c0sax = this.LLJJIJIIJIL;
        c0sax.LIZJ = null;
        c0sax.LJ = null;
        c0sax.LJFF = null;
        c0sax.LIZLLL = null;
        this.LLJJJJJIL = -1;
    }
}
