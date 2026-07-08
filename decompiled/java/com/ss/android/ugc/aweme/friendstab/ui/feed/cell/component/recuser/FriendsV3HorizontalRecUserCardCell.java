package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.recuser;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0QSJ;
import X.C0XQ7;
import X.C1196320hEk;
import X.C1262780ixw;
import X.C1361310lWr;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1569520qwg;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C314560CUs;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import X.InterfaceC448830Hir;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.friendstab.experiment.RecUserCardConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3HorizontalRecUserCardCell extends FriendsV3BaseSimpleCell<C1361310lWr> implements FriendsV3ViewStateProtocol, InterfaceC713360RyY, CommonCellAbility, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(174));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 494));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 492));
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public BottomSlideIndicatorAbility LLILZLL;
    public IPhotoModeAbility LLIZ;
    public IPhotoSlidesAbility LLIZLLLIL;
    public IPhotoSlidesEventDispatchAbility LLJ;
    public ISlideIndicatorAbility LLJI;
    public ICommercePhotoSlideAbility LLJIJIL;
    public ICarouselComponentTranslationAbility LLJILJIL;
    public PauseTimeAbility LLJILJILJ;
    public FeedBarSearchAbility LLJILLL;
    public InterfaceC448830Hir LLJJ;
    public InterfaceC704110Rjd LLJJI;
    public FcpMetaTagAbility LLJJIII;
    public List<InterfaceC687730QyJ> LLJJIJI;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLILZLL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLIZ = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLIZLLLIL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJ = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJI = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJIJIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILJIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJILJILJ = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJILLL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJJIJI, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJ = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJI = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIII = (FcpMetaTagAbility) obj;
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
            return this.LLILZLL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLIZ;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJ;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJI;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJIJIL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJILJIL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJILJILJ;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJILLL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJ;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJJI;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJJIII;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cau;
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
        return "cell_recommend_users";
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLILZLL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLIZ = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJ = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJI = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJIJIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILJIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJILJILJ = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJILLL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJ = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJI = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJJIJI;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public final C1262780ixw L5() {
        return (C1262780ixw) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public final void N5() {
        if (C1569520qwg.LIZ) {
            C1262780ixw c1262780ixwL5 = L5();
            if (c1262780ixwL5 != null) {
                c1262780ixwL5.reset();
            }
            C1262780ixw c1262780ixwL52 = L5();
            if (c1262780ixwL52 != null) {
                c1262780ixwL52.LLFZ(false);
            }
            C1569520qwg.LIZ = false;
        }
    }

    public FriendsV3HorizontalRecUserCardCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 491));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 493));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(L5());
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        C1554610qYd.LIZLLL(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        if (interfaceC665370Q7zLIZIZ != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLIZIZ, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            C1262780ixw c1262780ixwL5 = L5();
            if (c1262780ixwL5 != null) {
                c1262780ixwL5.LJLJLLL(null, getCurrentFragment(), new AwS385S0200000_19(this, curUser, 119));
            }
            C1262780ixw c1262780ixwL52 = L5();
            if (c1262780ixwL52 != null) {
                c1262780ixwL52.Eg(new InterfaceC1261750iwH() { // from class: X.0ixS
                    @Override // X.InterfaceC1261750iwH
                    public final void LLF(RecyclerView recyclerView, int i) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC1261750iwH
                    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                        User user;
                        String uid;
                        FriendsV3FeedListAbility friendsV3FeedListAbility;
                        if (((RecUserCardConfig) C1588170rQl.LIZIZ.getValue()).enableDeduplicate && (abstractC1261460ivo instanceof C1261350ivd)) {
                            T t = abstractC1261460ivo.LIZ;
                            if ((t instanceof C1261860iwS) && (user = (User) t) != null && (uid = user.getUid()) != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LL.LLILLL.getValue()) != null) {
                                friendsV3FeedListAbility.Nx1(uid);
                            }
                        }
                    }

                    @Override // X.InterfaceC1261750iwH
                    public final void nO0(C1075800e6M c1075800e6M) {
                        C1262780ixw c1262780ixwL53;
                        List<InterfaceC1891350zJl> listLIZ = c1075800e6M.LIZJ.LIZ();
                        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
                        if (!(abstractC1623806Xk instanceof C1623706Xj) && !(abstractC1623806Xk instanceof C491101vh)) {
                            if (abstractC1623806Xk instanceof C1623606Xi) {
                                ((AbstractC20628015ni) this.LL.LLILZIL.getValue()).setLoading(false);
                                if (listLIZ != null) {
                                    if (listLIZ.size() == 0) {
                                        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LL.LLILLL.getValue();
                                        if (friendsV3FeedListAbility != null) {
                                            friendsV3FeedListAbility.R12();
                                            return;
                                        }
                                        return;
                                    }
                                    if (listLIZ.size() <= 0 || (c1262780ixwL53 = this.LL.L5()) == null) {
                                        return;
                                    }
                                    C339190DRl.LIZLLL(c1262780ixwL53);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ((AbstractC20628015ni) this.LL.LLILZIL.getValue()).setLoading(true);
                        C1262780ixw c1262780ixwL54 = this.LL.L5();
                        if (c1262780ixwL54 == null) {
                            return;
                        }
                        C339190DRl.LIZIZ(c1262780ixwL54);
                    }
                });
            }
            L5().setSeeAllStyle(new ACListenerS122S0200000_19(this, curUser, 63));
        }
        N5();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJJIJI == null) {
            this.LLJJIJI = new ArrayList();
        }
        ((ArrayList) this.LLJJIJI).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            C314560CUs.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_show_time_");
            C0XQ7.LJ();
            sbLIZ.append(C0XQ7.LIZ.LJIIJ().getCurUser().getUid());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C314560CUs.LIZJ.put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
            ((Keva) C314560CUs.LIZIZ.getValue()).storeLong(strLIZIZ, jCurrentTimeMillis);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
        N5();
    }
}
