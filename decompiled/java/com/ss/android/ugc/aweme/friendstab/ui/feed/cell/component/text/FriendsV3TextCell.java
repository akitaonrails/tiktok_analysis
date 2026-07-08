package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.text;

import X.C01GW;
import X.C0I7Z;
import X.C0OB8;
import X.C0SDD;
import X.C0SDF;
import X.C1351060lGK;
import X.C418440Gaw;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC448830Hir;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import android.view.View;
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
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3TextCell extends FriendsV3BaseAwemeCell<FriendsV3CellPostRootAssem, InterfaceC1361270lWn> {
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public BottomSlideIndicatorAbility LLJJIII;
    public IPhotoModeAbility LLJJIJI;
    public IPhotoSlidesAbility LLJJIJIIJIL;
    public IPhotoSlidesEventDispatchAbility LLJJIJIL;
    public ISlideIndicatorAbility LLJJJ;
    public ICommercePhotoSlideAbility LLJJJIL;
    public ICarouselComponentTranslationAbility LLJJJJ;
    public PauseTimeAbility LLJJJJJIL;
    public FeedBarSearchAbility LLJJJJLIIL;
    public InterfaceC448830Hir LLJJL;
    public InterfaceC704110Rjd LLJJLIIIJLLLLLLLZ;
    public FcpMetaTagAbility LLJL;
    public List<InterfaceC687730QyJ> LLJLIL;

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLJJIII;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJJIJIIJIL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJJIJIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJJJ;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJJJIL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJJJJ;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJJJJJIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJL;
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
        return "cell_text";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJLIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new FriendsV3CellPostRootAssem();
    }

    public FriendsV3TextCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 467));
        this.LLJJI = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 468));
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJ.getValue());
        C0I7Z.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), (View) this.LLJJI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.InterfaceC1582750rI1
    public final C0SDF ed() {
        return C0SDF.FAKE_PLAYER;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJLIL == null) {
            this.LLJLIL = new ArrayList();
        }
        ((ArrayList) this.LLJLIL).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJIII = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJIJI = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIJIIJIL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJIJIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJJ = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJJIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJJ = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJJJIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJJJLIIL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJLIL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJL = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJIII = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIJIIJIL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJIJIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJJ = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJJIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJJ = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJJJIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
