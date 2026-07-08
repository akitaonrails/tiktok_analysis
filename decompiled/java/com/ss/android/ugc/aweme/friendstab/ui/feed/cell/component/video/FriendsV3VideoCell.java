package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video;

import X.C0OB8;
import X.C0SDD;
import X.C0SDF;
import X.C1351060lGK;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC1891350zJl;
import X.InterfaceC448830Hir;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.FriendsV3CellPostRootAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3VideoCell extends FriendsV3BaseAwemeCell<FriendsV3CellPostRootAssem, InterfaceC1361270lWn> {
    public BottomSlideIndicatorAbility LLJJ;
    public IPhotoModeAbility LLJJI;
    public IPhotoSlidesAbility LLJJIII;
    public IPhotoSlidesEventDispatchAbility LLJJIJI;
    public ISlideIndicatorAbility LLJJIJIIJIL;
    public ICommercePhotoSlideAbility LLJJIJIL;
    public ICarouselComponentTranslationAbility LLJJJ;
    public PauseTimeAbility LLJJJIL;
    public FeedBarSearchAbility LLJJJJ;
    public InterfaceC448830Hir LLJJJJJIL;
    public InterfaceC704110Rjd LLJJJJLIIL;
    public FcpMetaTagAbility LLJJL;
    public List<InterfaceC687730QyJ> LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLJJ;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJJI;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJJIII;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJJIJIIJIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJJIJIL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJJJ;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJJJIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJJJJ;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJJJJIL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJJL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1588310rQz
    public final String gq() {
        return "cell_video";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJJLIIIJLLLLLLLZ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new FriendsV3CellPostRootAssem();
    }

    @Override // X.InterfaceC1588310rQz
    public final boolean G2() {
        C0SDD c0sdd;
        C1351060lGK c1351060lGKLJLIIL;
        CommentItemList commentItemList;
        T item = getItem();
        List<Comment> list = null;
        if ((item instanceof C0SDD) && (c0sdd = (C0SDD) item) != null && (c1351060lGKLJLIIL = c0sdd.LJLIIL()) != null && (commentItemList = c1351060lGKLJLIIL.LIZ) != null) {
            list = commentItemList.items;
        }
        return true ^ (list == null || list.isEmpty());
    }

    @Override // X.InterfaceC1588310rQz
    public final InterfaceC1361290lWp LJIL() {
        return (InterfaceC1361290lWp) getItem();
    }

    @Override // X.InterfaceC1588310rQz
    public final Aweme getAweme() {
        C0OB8 c0ob8 = (C0OB8) getItem();
        if (c0ob8 != null) {
            return c0ob8.getAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.InterfaceC1582750rI1
    public final C0SDF ed() {
        return C0SDF.REAL_PLAYER;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell
    /* JADX INFO: renamed from: T5 */
    public final void onBindItemView(InterfaceC1361290lWp interfaceC1361290lWp) {
        super.onBindItemView(interfaceC1361290lWp);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView((InterfaceC1361290lWp) interfaceC1891350zJl);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        }
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJ = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJI = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIII = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJIJI = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJIJIIJIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJIJIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJ = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJJJ = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJJLIIIJLLLLLLLZ, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJJJJIL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJJJLIIL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJL = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJ = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJI = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIII = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJIJIIJIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJIJIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJ = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJJJ = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJJJJIL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
