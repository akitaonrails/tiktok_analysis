package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other;

import X.C01GW;
import X.C0QSJ;
import X.C109100bB;
import X.C1196320hEk;
import X.C1361340lWu;
import X.C13DA;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C444960Hcc;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1361290lWp;
import X.InterfaceC448830Hir;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3LVBCell extends FriendsV3BaseSimpleCell<C1361340lWu> implements FriendsV3ViewStateProtocol, InterfaceC713360RyY, CommonCellAbility, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(170));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 464));
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public BottomSlideIndicatorAbility LLIZLLLIL;
    public IPhotoModeAbility LLJ;
    public IPhotoSlidesAbility LLJI;
    public IPhotoSlidesEventDispatchAbility LLJIJIL;
    public ISlideIndicatorAbility LLJILJIL;
    public ICommercePhotoSlideAbility LLJILJILJ;
    public ICarouselComponentTranslationAbility LLJILLL;
    public PauseTimeAbility LLJJ;
    public FeedBarSearchAbility LLJJI;
    public InterfaceC448830Hir LLJJIII;
    public InterfaceC704110Rjd LLJJIJI;
    public FcpMetaTagAbility LLJJIJIIJIL;
    public List<InterfaceC687730QyJ> LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLIZLLLIL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJ = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJI = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJIJIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJILJIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJILJILJ = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILLL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJ = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJI = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJJIJIL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJIII = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJIJI = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIJIIJIL = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJ;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJI;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJIJIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJILJIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJILJILJ;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJILLL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJJ;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJJI;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJIII;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJJIJI;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJJIJIIJIL;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cb2;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1588310rQz
    public final String gq() {
        return "cell_lvb";
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJ = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJI = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJIJIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJILJIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJILJILJ = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILLL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJ = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJI = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJIII = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJIJI = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJJIJIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(this.itemView);
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public FriendsV3LVBCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 461));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 459));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 460));
        this.LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 462));
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 463));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell, X.InterfaceC1588310rQz
    public final InterfaceC1361290lWp LJIL() {
        return (InterfaceC1361290lWp) getItem();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C1554610qYd.LIZLLL(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1554610qYd.LIZJ(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        ((TuxTextView) this.LLILLL.getValue()).setTuxFont(122);
        ((RadiusLayout) this.LLILZ.getValue()).setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        C786410Ut5.I7(new AbS703S0100000_24(this, 4), (View) this.LLILZ.getValue());
        C427690Gpr.LJI((View) this.LLILZ.getValue(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1361340lWu c1361340lWu) {
        super.onBindItemView(c1361340lWu);
        if (C444960Hcc.LIZIZ()) {
            TuxIconView tuxIconView = (TuxIconView) this.LLILZIL.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_arrow_right_circle_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            c419910GdJ.LJFF = false;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C1361340lWu c1361340lWu2 = (C1361340lWu) getItem();
        if (c1361340lWu2 != null && c1361340lWu2.LLILLJJLI == 2) {
            ((TextView) this.LLILZLL.getValue()).setText(2131834965);
            ((TextView) this.LLIZ.getValue()).setText(2131834964);
        }
    }

    public final void N5(boolean z) {
        String str;
        if (z) {
            str = "ttsocial_friend_tab_lvb_btn_show";
        } else {
            str = "ttsocial_friend_tab_lvb_btn_click";
        }
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("friends_tab_version", "v3.0");
        c13da.put("enter_from", "homepage_friends");
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ(str, mapBuild);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new ArrayList();
        }
        ((ArrayList) this.LLJJIJIL).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            N5(true);
        }
    }
}
