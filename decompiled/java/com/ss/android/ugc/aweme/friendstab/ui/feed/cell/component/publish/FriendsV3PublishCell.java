package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0LAB;
import X.C0QSJ;
import X.C0S1B;
import X.C0SDJ;
import X.C0W17;
import X.C0XQ7;
import X.C1057880ddS;
import X.C109100bB;
import X.C1196320hEk;
import X.C1210004oM;
import X.C1361320lWs;
import X.C1395330mPj;
import X.C13DA;
import X.C1449410nox;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1593790rZp;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C197039127h;
import X.C2188811AlT;
import X.C2276971EAl;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.C838410Wul;
import X.EnumC1606090rtf;
import X.InterfaceC1146704e9;
import X.InterfaceC1361290lWp;
import X.InterfaceC448830Hir;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import X.ViewOnAttachStateChangeListenerC1620720sHG;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.experiment.TopPublishCardHintConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleAssemCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3PublishCell extends FriendsV3BaseSimpleAssemCell<FriendsV3PublishCellAssem, C1361320lWs> implements FriendsV3ViewStateProtocol, InterfaceC713360RyY, CommonCellAbility, C0QSJ, InterfaceC1146704e9 {
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public AvatarComponentView LLJJ;
    public C197039127h LLJJI;
    public BottomSlideIndicatorAbility LLJJIJI;
    public IPhotoModeAbility LLJJIJIIJIL;
    public IPhotoSlidesAbility LLJJIJIL;
    public IPhotoSlidesEventDispatchAbility LLJJJ;
    public ISlideIndicatorAbility LLJJJIL;
    public ICommercePhotoSlideAbility LLJJJJ;
    public ICarouselComponentTranslationAbility LLJJJJJIL;
    public PauseTimeAbility LLJJJJLIIL;
    public FeedBarSearchAbility LLJJL;
    public InterfaceC448830Hir LLJJLIIIJLLLLLLLZ;
    public InterfaceC704110Rjd LLJL;
    public FcpMetaTagAbility LLJLIL;
    public List<InterfaceC687730QyJ> LLJLILLLLZIIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(172));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 490));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(173));
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new AwS568S0100000_24(this, 489));

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJIJI = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJIJIIJIL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIJIL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJJ = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJJIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJJJ = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJJJIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJJLIIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJLILLLLZIIL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJLIL = (FcpMetaTagAbility) obj;
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
            return this.LLJJIJI;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJJIJIIJIL;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJJIJIL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJJJ;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJJJIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJJJJ;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJJJJJIL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJJL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJLIL;
        }
        return null;
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
        return "cell_publish";
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJJIJIIJIL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJJIJIL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJJJ = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJJJIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJJJJ = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJJJJJIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJLILLLLZIIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(this.itemView);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new FriendsV3PublishCellAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJ.getValue();
    }

    public final void S5() {
        Context context = this.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(C0XQ7.LJFF().getCurUser().getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", C0XQ7.LJFF().getCurSecUserId());
        smartRouteBuildRoute.open();
    }

    public final void T5() {
        if (R5("open_album")) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://createPhoto");
            smartRouteBuildRoute.withParam("shoot_way", "fixed_shoot_cell");
            smartRouteBuildRoute.withParam("enter_from", "homepage_friends");
            smartRouteBuildRoute.withParam("enter_method", "friend_top_publish_cell");
            smartRouteBuildRoute.withParam("default_tab", CardStruct.IStatusCode.DEFAULT);
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TuxIconView tuxIconView;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLIZIZ, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        super.onItemViewCreated();
        this.LLJILJILJ = (TuxTextView) this.itemView.findViewById(R.id.rjc);
        this.LLJILLL = (TuxTextView) this.itemView.findViewById(R.id.user_info);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.pnn);
        this.LLJILJIL = (TuxIconView) this.itemView.findViewById(R.id.xrd);
        this.LLJJ = (AvatarComponentView) this.itemView.findViewById(R.id.bh2);
        this.LLJJI = (C197039127h) this.itemView.findViewById(R.id.xpy);
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AbS703S0100000_24(this, 6), tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LLJILJILJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTypeface(C1697580uHE.LIZIZ(0.0f, 450, 0.0f, 0.0f, null, 0.0f, 100, null, 157));
            C01GW c01gw = C1593790rZp.LIZIZ;
            tuxTextView2.setText(((TopPublishCardHintConfig) c01gw.getValue()).enable ? ((TopPublishCardHintConfig) c01gw.getValue()).content : this.itemView.getContext().getResources().getString(2131838830));
        }
        TuxTextView tuxTextView3 = this.LLJILLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C1057880ddS.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname()));
        }
        AvatarComponentView avatarComponentView = this.LLJJ;
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            config.LIZ(AFwS264S0000000_24.get$arr$(678));
            config.LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.FEED, null, false, false, null, 254)));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        AvatarComponentView avatarComponentView2 = this.LLJJ;
        if (avatarComponentView2 != null) {
            C786410Ut5.I7(new AbS703S0100000_24(this, 19), avatarComponentView2);
        }
        AvatarComponentView avatarComponentView3 = this.LLJJ;
        if (avatarComponentView3 != null) {
            C0S1B.LIZ(avatarComponentView3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), this, false, null, 56);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_image_stack;
        Integer numValueOf = Integer.valueOf(R.attr.a1j);
        c419910GdJ.LJ = numValueOf;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        Integer numValueOf2 = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZIZ = numValueOf2;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext()));
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            tuxIconView2.setImageDrawable(layerDrawableLJIILIIL);
        }
        if (C1395330mPj.LIZIZ()) {
            TuxIconView tuxIconView3 = this.LLJIJIL;
            if (tuxIconView3 != null) {
                C426750GoL.LJIIIZ(tuxIconView3, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJIJIL;
            if (tuxIconView4 != null) {
                C426750GoL.LJIIIZ(tuxIconView4, 0, 0, Integer.valueOf(((Boolean) this.LLJI.getValue()).booleanValue() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : 0), 0, false, 16);
            }
        }
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            TuxIconView tuxIconView5 = this.LLJILJIL;
            if (tuxIconView5 != null) {
                C339190DRl.LIZLLL(tuxIconView5);
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZ = R.raw.icon_image_edit;
            c419910GdJ2.LJ = numValueOf;
            TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(this.itemView.getContext());
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z2.LIZIZ = numValueOf2;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            LayerDrawable layerDrawableLJIILIIL2 = C426750GoL.LJIILIIL(tuxIconDrawableLIZ2, c384050F3z2.LIZ(this.itemView.getContext()));
            TuxIconView tuxIconView6 = this.LLJILJIL;
            if (tuxIconView6 != null) {
                tuxIconView6.setImageDrawable(layerDrawableLJIILIIL2);
            }
            TuxIconView tuxIconView7 = this.LLJILJIL;
            if (tuxIconView7 != null) {
                C786410Ut5.a9(tuxIconView7, new ACListenerS158S0100000_24(this, 96));
            }
        } else {
            TuxIconView tuxIconView8 = this.LLJILJIL;
            if (tuxIconView8 != null) {
                C339190DRl.LIZIZ(tuxIconView8);
            }
        }
        TuxIconView tuxIconView9 = this.LLJIJIL;
        if (tuxIconView9 != null) {
            C786410Ut5.a9(tuxIconView9, new ACListenerS158S0100000_24(this, 97));
        }
        TuxTextView tuxTextView4 = this.LLJILJILJ;
        if (tuxTextView4 != null) {
            C786410Ut5.h9(tuxTextView4, new ACListenerS158S0100000_24(this, 98));
        }
        if (C1395330mPj.LIZIZ()) {
            TuxIconView tuxIconView10 = this.LLJILJIL;
            if (tuxIconView10 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView10, 8);
            }
            C197039127h c197039127h = this.LLJJI;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
            C197039127h c197039127h2 = this.LLJJI;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS158S0100000_24(this, 99));
            }
            Context context = getContext();
            if (context != null) {
                C197039127h c197039127h3 = this.LLJJI;
                if (c197039127h3 != null) {
                    c197039127h3.setButtonVariant(-1);
                }
                C197039127h c197039127h4 = this.LLJJI;
                if (c197039127h4 != null) {
                    c197039127h4.setIconTintColorRes(R.attr.a0o);
                }
                C197039127h c197039127h5 = this.LLJJI;
                if (c197039127h5 != null) {
                    c197039127h5.setTextColorRes(R.attr.a0o);
                }
                C197039127h c197039127h6 = this.LLJJI;
                if (c197039127h6 != null) {
                    C384050F3z c384050F3z3 = new C384050F3z();
                    c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
                    c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a00);
                    c197039127h6.setBackgroundDrawable(c384050F3z3.LIZ(context));
                }
                TuxTextView tuxTextView5 = this.LLJILJILJ;
                if (tuxTextView5 != null) {
                    String strLIZLLL = (String) C1210004oM.LIZ.getValue();
                    if (strLIZLLL.length() == 0) {
                        strLIZLLL = C838410Wul.LIZLLL(2131850119, context);
                    }
                    tuxTextView5.setText(strLIZLLL);
                }
            }
        }
        if (!C2276971EAl.LIZ() && (tuxIconView = this.LLJIJIL) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        }
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1620720sHG(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleAssemCell, X.InterfaceC1588310rQz
    public final InterfaceC1361290lWp LJIL() {
        return (InterfaceC1361290lWp) getItem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        C1554610qYd.LIZLLL(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, this);
        super.onDestroy();
    }

    public static void U5(String str) {
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            C1449410nox c1449410nox = new C1449410nox(str, "fixed_shoot_cell", "homepage_friends", null, null, null, null, null, 248);
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("friends_tab_version", "v3.0");
            c0lab.LJ("enter_method", "friend_top_publish_cell");
            iRecordMobService.LIZIZ(c1449410nox, c0lab, null);
        }
    }

    public static void V5(String str) {
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("enter_from", "homepage_friends");
        c13da.put("button_name", str);
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ("ttsocial_friend_tab_publish_cell_click", mapBuild);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleAssemCell, X.InterfaceC1588310rQz
    public final void LLJJ(C0SDJ c0sdj) {
        super.LLJJ(c0sdj);
        if (Intrinsics.LJFF(c0sdj.LLILLL, Boolean.TRUE)) {
            FriendsV3InputPanelAbility friendsV3InputPanelAbility = (FriendsV3InputPanelAbility) this.LLJJIII.getValue();
            if (friendsV3InputPanelAbility != null) {
                friendsV3InputPanelAbility.bB0();
                return;
            }
            return;
        }
        FriendsV3InputPanelAbility friendsV3InputPanelAbility2 = (FriendsV3InputPanelAbility) this.LLJJIII.getValue();
        if (friendsV3InputPanelAbility2 == null) {
            return;
        }
        friendsV3InputPanelAbility2.Ph2();
    }

    public final boolean R5(String str) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(this.itemView.getContext(), "fixed_shoot_cell", true)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VE plugin not ready, Friends Tab entry skipped. enterFrom=homepage_friends, scene=");
        sbLIZ.append("fixed_shoot_cell");
        sbLIZ.append(", action=");
        sbLIZ.append(str);
        C0W17.LIZJ("PhotoPostCell", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleAssemCell, com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return super.onCreateItemView(viewGroup);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = new ArrayList();
        }
        ((ArrayList) this.LLJLILLLLZIIL).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            C109100bB c109100bB = C109100bB.LIZ;
            C13DA c13da = new C13DA();
            c13da.put("enter_from", "homepage_friends");
            Map mapBuild = c13da.build();
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_friend_tab_publish_cell_show", mapBuild);
        }
    }
}
