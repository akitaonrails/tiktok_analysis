package com.ss.android.ugc.aweme.ui.view.photos;

import X.C01GW;
import X.C0N0Y;
import X.C0SMB;
import X.C0SMF;
import X.C0SOK;
import X.C0SOM;
import X.C0SRL;
import X.C0ST8;
import X.C1558360qeg;
import X.C1558520qew;
import X.C438910HIz;
import X.C452501pT;
import X.C687700QyG;
import X.C716660S9g;
import X.C719520SKg;
import X.C721190SQr;
import X.C786410Ut5;
import X.EnumC721170SQp;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import X.InterfaceC719500SKe;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModePhotosFloatComponent extends PostModePhotosComponent {
    public float LLLL;
    public float LLLLII;
    public boolean LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public Set<InterfaceC469360Ias> LLLLIILLL;
    public Set<InterfaceC719500SKe> LLLLIL;
    public Set<C0SMF> LLLLILI;

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final int LJJIL() {
        return R.id.qey;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final int LJJIZ() {
        return R.id.f795rla;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PostModeDetailScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PostModeDetailScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final void LJIJJLI() {
        Handler handler;
        Handler handler2;
        if (this.LLILZLL == null) {
            ViewGroup viewGroup = this.LLILLL;
            this.LLILZLL = viewGroup != null ? (C716660S9g) viewGroup.findViewById(R.id.qeo) : null;
            if (C0ST8.LIZJ(this.LLILLJJLI.getAweme()) > 1) {
                C716660S9g c716660S9g = this.LLILZLL;
                if (c716660S9g != null) {
                    c716660S9g.setTotalNum(C0ST8.LIZJ(this.LLILLJJLI.getAweme()));
                }
                C716660S9g c716660S9g2 = this.LLILZLL;
                if (c716660S9g2 != null) {
                    C0SOM c0som = this.LLILZ;
                    c716660S9g2.setCurrentNum((c0som != null ? c0som.getCurrentItem() : 0) + 1);
                }
                C716660S9g c716660S9g3 = this.LLILZLL;
                if (c716660S9g3 != null) {
                    C786410Ut5.k1(c716660S9g3, 0);
                }
                C716660S9g c716660S9g4 = this.LLILZLL;
                if (c716660S9g4 != null && (handler2 = c716660S9g4.getHandler()) != null) {
                    handler2.removeCallbacks(this.LLLJ);
                }
                C716660S9g c716660S9g5 = this.LLILZLL;
                if (c716660S9g5 != null) {
                    C438910HIz.LIZ(c716660S9g5, 0L, 3);
                }
                C716660S9g c716660S9g6 = this.LLILZLL;
                if (c716660S9g6 == null || (handler = c716660S9g6.getHandler()) == null) {
                    return;
                }
                C786410Ut5.LJLIIL(2000L, handler, this.LLLJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final boolean LJJ() {
        if (this.LLLLIIIILLL) {
            return true;
        }
        this.LL.LJIIIIZZ.vQ2(EnumC721170SQp.FLOAT_TAP);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final boolean LJJI() {
        IPhotoFloatGuideAbility iPhotoFloatGuideAbility = (IPhotoFloatGuideAbility) this.LLLLIILL.getValue();
        if (iPhotoFloatGuideAbility != null) {
            iPhotoFloatGuideAbility.LJJJJLL(false);
        }
        if (this.LLLLIIIILLL) {
            return true;
        }
        this.LL.LJIIIIZZ.vQ2(EnumC721170SQp.FLOAT_TAP);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final boolean LJJIFFI() {
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility;
        if (this.LLLLIIIILLL || ((iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) this.LLLIIIL.getValue()) != null && iPhotoNestHeaderAbility.dM1() == 1)) {
            return true;
        }
        this.LL.LJIIIIZZ.vQ2(EnumC721170SQp.FLOAT_TAP);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final ViewGroup LJJIJIIJIL() {
        return this.LL.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final void LJJJ() {
        Fragment fragment = this.LL.LIZ;
        if (fragment != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IPhotoSlidesAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, IPhotoSlidesEventDispatchAbility.class, null);
        }
        Set<InterfaceC469360Ias> set = this.LLLLIILLL;
        if (set != null) {
            set.clear();
        }
        Set<InterfaceC719500SKe> set2 = this.LLLLIL;
        if (set2 != null) {
            set2.clear();
        }
        Set<C0SMF> set3 = this.LLLLILI;
        if (set3 != null) {
            set3.clear();
        }
        super.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final void LJJJJ() {
        C0SMB c0smb;
        View view;
        View viewFindViewById;
        C0SOM c0som = this.LLILZ;
        if (c0som != null) {
            c0som.setPageFlingVelocity(C0SOK.LIZ().flingThreshold);
        }
        C0SOM c0som2 = this.LLILZ;
        if (c0som2 != null) {
            c0som2.setPageChangeExtOffset(C0SOK.LIZ().pageExtOffset);
        }
        C0SOM c0som3 = this.LLILZ;
        if (c0som3 != null) {
            c0som3.setCanBlockSystemBackGesture(true);
        }
        C0SOM c0som4 = this.LLILZ;
        if (c0som4 != null) {
            c0som4.LJJJIL();
        }
        C0SOM c0som5 = this.LLILZ;
        Object currentViewHolder = c0som5 != null ? c0som5.getCurrentViewHolder() : null;
        if (!(currentViewHolder instanceof SmartImagePhotoViewHolderV2) || (c0smb = (C0SMB) currentViewHolder) == null || (view = c0smb.LL) == null || (viewFindViewById = view.findViewById(R.id.vmb)) == null) {
            return;
        }
        viewFindViewById.setTransitionName(null);
        viewFindViewById.invalidate();
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final boolean LJJJLZIJ() {
        return C0ST8.LIZJ(this.LLILLJJLI.getAweme()) > 1;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final boolean LJJJZ() {
        C0N0Y playerManager = getPlayerManager();
        if (playerManager != null) {
            playerManager.LIZ();
        }
        C721190SQr c721190SQr = C721190SQr.LIZ;
        C0SRL c0srl = this.LL;
        c721190SQr.getClass();
        C721190SQr.LJIL(c0srl);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final void LJJLIIIJ() {
        C0N0Y playerManager = getPlayerManager();
        if (playerManager != null) {
            playerManager.LJIILLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void GS0(C0SMF c0smf) {
        super.GS0(c0smf);
        if (this.LLLLILI == null) {
            this.LLLLILI = new LinkedHashSet();
        }
        Set<C0SMF> set = this.LLLLILI;
        if (set != null) {
            set.add(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void K5(C0SMF c0smf) {
        super.K5(c0smf);
        if (this.LLLLILI == null) {
            this.LLLLILI = new LinkedHashSet();
        }
        Set<C0SMF> set = this.LLLLILI;
        if (set != null) {
            set.add(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent
    public final void LJIILIIL(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float x = motionEvent.getX() - this.LLLL;
                float y = motionEvent.getY() - this.LLLLII;
                if (Math.abs(x) > ((Number) this.LLLLIIL.getValue()).intValue() && Math.abs(x) > Math.abs(y)) {
                    this.LLLLIIIILLL = true;
                    return;
                }
                return;
            }
            return;
        }
        this.LLLL = motionEvent.getX();
        this.LLLLII = motionEvent.getY();
        this.LLLLIIIILLL = false;
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        super.LLJJI(interfaceC469360Ias);
        if (this.LLLLIILLL == null) {
            this.LLLLIILLL = new LinkedHashSet();
        }
        Set<InterfaceC469360Ias> set = this.LLLLIILLL;
        if (set != null) {
            set.add(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        super.Qt(interfaceC719500SKe);
        Set<InterfaceC719500SKe> set = this.LLLLIL;
        if (set != null) {
            set.remove(interfaceC719500SKe);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        super.b3(interfaceC469360Ias);
        Set<InterfaceC469360Ias> set = this.LLLLIILLL;
        if (set != null) {
            set.remove(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void lv0(C719520SKg c719520SKg) {
        this.LLLILZJ = c719520SKg;
        if (this.LLLLIL == null) {
            this.LLLLIL = new LinkedHashSet();
        }
        Set<InterfaceC719500SKe> set = this.LLLLIL;
        if (set != null) {
            set.add(c719520SKg);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void tj(C0SMF c0smf) {
        super.tj(c0smf);
        Set<C0SMF> set = this.LLLLILI;
        if (set != null) {
            set.remove(c0smf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent, com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        super.x6(interfaceC719500SKe);
        if (this.LLLLIL == null) {
            this.LLLLIL = new LinkedHashSet();
        }
        Set<InterfaceC719500SKe> set = this.LLLLIL;
        if (set != null) {
            set.add(interfaceC719500SKe);
        }
    }

    public PostModePhotosFloatComponent(VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl) {
        super(videoItemParams, photoSharedViewModel, c0srl);
        this.LLLLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(c0srl, 1426));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS555S0100000_11(c0srl, 1613));
    }
}
