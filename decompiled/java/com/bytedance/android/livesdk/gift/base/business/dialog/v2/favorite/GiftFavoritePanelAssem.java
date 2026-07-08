package com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite;

import X.AbstractC1585810rMx;
import X.AbstractC214823195h;
import X.AbstractC21688119uJ;
import X.C019F;
import X.C0IJT;
import X.C1129850fVX;
import X.C1148840g0A;
import X.C1148900g0G;
import X.C1148910g0H;
import X.C1148930g0J;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C16FV;
import X.C19719912Dl;
import X.C21688219uK;
import X.C2217381BqS;
import X.C423520Gj8;
import X.C474500IjA;
import X.C497740JfY;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1149050g0V;
import X.InterfaceC2217461Bqa;
import X.RunnableC781530UlD;
import Y.ACListenerS152S0100000_17;
import Y.ACListenerS86S1100000_17;
import Y.ALAdapterS7S0300000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoriteViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftFavoritePanelAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public FrameLayout LLJI;
    public RunnableC781530UlD LLJIJIL;
    public RunnableC781530UlD LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16FS LLJILLL;
    public LinearLayout LLJJ;
    public View LLJJI;
    public C16F5 LLJJIII;
    public C1148930g0J LLJJIJI;
    public C1148930g0J LLJJIJIIJIL;
    public final C1148900g0G LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftFavoritePanelAssem.class, "favoriteViewModel", "getFavoriteViewModel()Lcom/bytedance/android/livesdk/gift/base/business/dialog/v2/favorite/GiftFavoriteViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0g0G] */
    public GiftFavoritePanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftFavoriteViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS561S0100000_17(c19719912DlLIZ, 136), AFwS254S0000000_17.get$arr$(45), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1148840g0A.class, null), checkSupervisorPrepared());
        this.LLJJIJIL = new InterfaceC1149050g0V() { // from class: X.0g0G
            @Override // X.InterfaceC1149050g0V
            public final void LIZ(int i) {
                int i2;
                LinkedList linkedList;
                GiftFavoriteViewModel giftFavoriteViewModelGo = this.LIZ.Go();
                if (i >= giftFavoriteViewModelGo.getState().LLILLJJLI.size()) {
                    C20441214yg.LJ("favoritegift", "EXCEED OTHER LIST BOUNDS, ERROR!");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adding favorite gift from position ");
                sbLIZ.append(i);
                sbLIZ.append(": ");
                sbLIZ.append(((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LLILLJJLI, i)).LIZ);
                C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
                Long l = ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LLILLJJLI, i)).LIZLLL;
                int i3 = (i - giftFavoriteViewModelGo.LLILLJJLI) + 1;
                Integer num = ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LLILLJJLI, i)).LIZJ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_candidate_gift_add");
                c474500IjALIZ.LJIL();
                C1129850fVX.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(l, "gift_id");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "actual_gift_position");
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "gift_position");
                c474500IjALIZ.LJJII(num, "gift_price");
                c474500IjALIZ.LIZ();
                if (giftFavoriteViewModelGo.xQ2() >= 4) {
                    giftFavoriteViewModelGo.setState(AFwS254S0000000_17.get$arr$(442));
                    return;
                }
                LinkedList linkedListVQ2 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LL);
                LinkedList linkedListVQ22 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LLILLJJLI);
                C1148910g0H c1148910g0HLIZ = C1148910g0H.LIZ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LLILLJJLI, i), EnumC1148880g0E.FAVORITE_ITEM, false, 1007);
                C500260Jjc.LJJJLIIL(linkedListVQ22, new AwS596S0100000_17(c1148910g0HLIZ, 661));
                Iterator it2 = linkedListVQ2.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C1148910g0H) it2.next()).LJ == EnumC1148880g0E.EMPTY_ITEM) {
                        if (i4 >= 0) {
                            linkedListVQ2.add(i4, c1148910g0HLIZ);
                        }
                    } else {
                        i4++;
                    }
                }
                if (linkedListVQ2.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it3 = linkedListVQ2.iterator();
                    i2 = 0;
                    while (it3.hasNext()) {
                        EnumC1148880g0E enumC1148880g0E = ((C1148910g0H) it3.next()).LJ;
                        if (enumC1148880g0E == EnumC1148880g0E.FAVORITE_ITEM || enumC1148880g0E == EnumC1148880g0E.FAVORITE_DISABLED_ITEM) {
                            i2++;
                            if (i2 < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                }
                Long l2 = c1148910g0HLIZ.LIZLLL;
                Integer num2 = c1148910g0HLIZ.LIZJ;
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("edit_featured_area_candidate_gift_add_success");
                c474500IjALIZ2.LJIL();
                C1129850fVX.LIZ(c474500IjALIZ2);
                c474500IjALIZ2.LJJII(l2, "gift_id");
                c474500IjALIZ2.LJJII(Integer.valueOf(i2), "added_position");
                c474500IjALIZ2.LJJII(num2, "gift_price");
                c474500IjALIZ2.LIZ();
                if (i2 >= 4) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedListVQ22, 10));
                    Iterator it4 = linkedListVQ22.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(C1148910g0H.LIZ((C1148910g0H) it4.next(), null, true, 895));
                    }
                    linkedList = new LinkedList(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(linkedListVQ22, 10));
                    Iterator it5 = linkedListVQ22.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(C1148910g0H.LIZ((C1148910g0H) it5.next(), null, false, 895));
                    }
                    linkedList = new LinkedList(arrayList2);
                }
                GiftFavoriteViewModel.wQ2(linkedListVQ2);
                giftFavoriteViewModelGo.setState(new AwS383S0200000_17(linkedListVQ2, (LinkedList<C1148910g0H>) linkedList, (LinkedList<C1148910g0H>) 117));
            }

            @Override // X.InterfaceC1149050g0V
            public final void LIZIZ(int i) {
                GiftFavoriteViewModel giftFavoriteViewModelGo = this.LIZ.Go();
                if (i >= giftFavoriteViewModelGo.getState().LL.size()) {
                    C20441214yg.LJ("favoritegift", "EXCEED FAV LIST BOUNDS, ERROR!");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removing favorite gift from position ");
                sbLIZ.append(i);
                sbLIZ.append(": ");
                sbLIZ.append(((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LL, i)).LIZ);
                C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
                LinkedList linkedListVQ2 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LL);
                LinkedList linkedListVQ22 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LLILLJJLI);
                C1148910g0H c1148910g0HLIZ = C1148910g0H.LIZ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LL, i), EnumC1148880g0E.OTHER_ITEM, false, 1007);
                C500260Jjc.LJJJLIIL(linkedListVQ2, new AwS596S0100000_17(c1148910g0HLIZ, 662));
                if (!c1148910g0HLIZ.LJI) {
                    linkedListVQ22.add(1, c1148910g0HLIZ);
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedListVQ22, 10));
                Iterator it2 = linkedListVQ22.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1148910g0H.LIZ((C1148910g0H) it2.next(), null, false, 895));
                }
                LinkedList linkedList = new LinkedList(arrayList);
                Long l = c1148910g0HLIZ.LIZLLL;
                Integer num = c1148910g0HLIZ.LIZJ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_gift_delete");
                c474500IjALIZ.LJIL();
                C1129850fVX.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(l, "gift_id");
                c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "gift_delete_position");
                c474500IjALIZ.LJJII(num, "gift_price");
                c474500IjALIZ.LIZ();
                GiftFavoriteViewModel.wQ2(linkedListVQ2);
                giftFavoriteViewModelGo.setState(new AwS383S0200000_17(linkedListVQ2, (LinkedList<C1148910g0H>) linkedList, (LinkedList<C1148910g0H>) 120));
            }

            @Override // X.InterfaceC1149050g0V
            public final void LIZJ(int i, int i2) {
                GiftFavoriteViewModel giftFavoriteViewModelGo = this.LIZ.Go();
                if (i >= 0 && i <= giftFavoriteViewModelGo.getState().LL.size() - 1 && i2 >= 0 && i2 <= giftFavoriteViewModelGo.getState().LL.size() - 1) {
                    LinkedList linkedListVQ2 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LL);
                    if (i >= i2) {
                        int i3 = i2 + 1;
                        if (i3 <= i) {
                            while (true) {
                                int i4 = i - 1;
                                Collections.swap(linkedListVQ2, i, i4);
                                if (i == i3) {
                                    break;
                                } else {
                                    i = i4;
                                }
                            }
                        }
                    } else {
                        while (i < i2) {
                            int i5 = i + 1;
                            Collections.swap(linkedListVQ2, i, i5);
                            i = i5;
                        }
                    }
                    giftFavoriteViewModelGo.setState(new AwS596S0100000_17(linkedListVQ2, (LinkedList<C050G>) 663));
                }
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final GiftFavoriteViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (GiftFavoriteViewModel) assemVMLazy.getValue();
    }

    public final C1148840g0A Ho() {
        return (C1148840g0A) this.LLJ.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String strLJIJI;
        C16FV c16fv;
        TextView textView;
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.hqt);
        this.LLJI = frameLayout;
        C16F5 c16f5 = null;
        if (frameLayout != null && (textView = (TextView) frameLayout.findViewById(R.id.hqg)) != null) {
            textView.setText(C497740JfY.LJIJI(2131841934));
        }
        FrameLayout frameLayout2 = this.LLJI;
        if (frameLayout2 != null && (c16fv = (C16FV) frameLayout2.findViewById(R.id.hqe)) != null) {
            C786410Ut5.m8(c16fv, new ACListenerS152S0100000_17(this, 178));
        }
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            c16f5 = (C16F5) frameLayout3.findViewById(R.id.hqf);
        }
        this.LLJILJILJ = c16f5;
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0g0Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1149010g0R) obj).LL;
            }
        }, null, new AwS631S0100000_17(this, 44), 6);
        if (Ho().LLILLL) {
            strLJIJI = C497740JfY.LJIJI(2131843768);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843767);
        }
        C16F5 c16f52 = this.LLJILJILJ;
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new ACListenerS86S1100000_17(this, strLJIJI, 4));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.eoq);
        this.LLJILLL = c16fs;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131840990));
        }
        C16FS c16fs2 = this.LLJILLL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS152S0100000_17(this, 176));
        }
        List<C1148910g0H> list = Go().getState().LL;
        List<C1148910g0H> list2 = Go().getState().LLILLJJLI;
        TextView textView2 = (TextView) view.findViewById(R.id.hr8);
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131843758));
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.hr9);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 177));
        }
        this.LLJIJIL = (RunnableC781530UlD) view.findViewById(R.id.gpq);
        final Context context = getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context) { // from class: com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoritePanelAssem$initFavoriteRecyclerView$unscrollableGridLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        };
        RunnableC781530UlD runnableC781530UlD = this.LLJIJIL;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(gridLayoutManager);
        }
        C1148930g0J c1148930g0J = new C1148930g0J(true, this.LLJJIJIL);
        this.LLJJIJI = c1148930g0J;
        c1148930g0J.LLLI(list);
        RunnableC781530UlD runnableC781530UlD2 = this.LLJIJIL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLJJIJI);
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJIJIL;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.setItemAnimator(new C423520Gj8() { // from class: X.0g0N
                public final AccelerateInterpolator LLJJIJIL;
                public final InterpolatorC1088720eRC LLJJJ;

                {
                    this.LLILZ = 150L;
                    this.LLJJIJIL = new AccelerateInterpolator();
                    this.LLJJJ = new InterpolatorC1088720eRC(0.16d, 0.64d, 0.31d, 0.98d);
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                    float height;
                    C1148920g0I c1148920g0I;
                    View view2 = viewHolder.itemView;
                    if (viewHolder instanceof C1148980g0O) {
                        super.LJJI(viewHolder);
                        return true;
                    }
                    if ((viewHolder instanceof C1148920g0I) && (c1148920g0I = (C1148920g0I) viewHolder) != null && c1148920g0I.LLILLL) {
                        height = view2.getHeight();
                    } else {
                        height = (-1) * view2.getHeight();
                    }
                    C786410Ut5.ed(view2, height);
                    view2.animate().translationY(0.0f).setDuration(350L).setInterpolator(this.LLJJJ).setListener(new ALAdapterS7S0300000_17(view2, this, viewHolder, 12)).start();
                    return true;
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
                    boolean zLJJII = super.LJJII(viewHolder, i, i2, i3, i4);
                    if (zLJJII) {
                        viewHolder.itemView.animate().setInterpolator(this.LLJJIJIL).setDuration(350L).start();
                    }
                    return zLJJII;
                }
            });
        }
        final C1148930g0J c1148930g0J2 = this.LLJJIJI;
        new C21688219uK(new AbstractC21688119uJ(c1148930g0J2) { // from class: X.0g0K
            public final C1148930g0J LIZJ;
            public int LIZLLL = -1;

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILL() {
            }

            {
                this.LIZJ = c1148930g0J2;
            }

            @Override // X.AbstractC21688119uJ
            public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                C1148920g0I c1148920g0I;
                super.LIZJ(recyclerView, viewHolder);
                if ((viewHolder instanceof C1148920g0I) && (c1148920g0I = (C1148920g0I) viewHolder) != null) {
                    c1148920g0I.L5();
                }
            }

            @Override // X.AbstractC21688119uJ
            public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (!(viewHolder instanceof C1148920g0I) || !((C1148920g0I) viewHolder).LLILLL) {
                    return 0;
                }
                return AbstractC21688119uJ.LJIIIZ(12, 0);
            }

            @Override // X.AbstractC21688119uJ
            public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                Long lValueOf;
                ArrayList arrayList;
                List<T> list3;
                C1148920g0I c1148920g0I;
                C1148920g0I c1148920g0I2;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                ViewPropertyAnimator duration;
                ArrayList arrayList2 = null;
                if (i == 2) {
                    if ((viewHolder instanceof C1148920g0I) && (c1148920g0I2 = (C1148920g0I) viewHolder) != null) {
                        c1148920g0I2.N5();
                        C500260Jjc.LJIILIIL(c1148920g0I2.LLILZLL);
                        C500260Jjc.LJIILIIL(c1148920g0I2.LLJIJIL);
                        ImageView imageView = c1148920g0I2.LLIZ;
                        if (imageView != null && (viewPropertyAnimatorAnimate = imageView.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.5f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(c1148920g0I2.LLJILJILJ)) != null) {
                            duration.start();
                        }
                        C500260Jjc.LLFFF(c1148920g0I2.LLJILJIL);
                        return;
                    }
                    return;
                }
                boolean z = viewHolder instanceof C1148920g0I;
                if (z && (c1148920g0I = (C1148920g0I) viewHolder) != null) {
                    c1148920g0I.L5();
                }
                if (z && viewHolder != null) {
                    lValueOf = Long.valueOf(viewHolder.getItemId());
                } else {
                    lValueOf = null;
                }
                C1148930g0J c1148930g0J3 = this.LIZJ;
                if (c1148930g0J3 != null && (list3 = c1148930g0J3.LL.LJFF) != 0) {
                    arrayList = new ArrayList();
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        Long l = ((C1148910g0H) it2.next()).LIZLLL;
                        if (l != null) {
                            arrayList.add(l);
                        }
                    }
                } else {
                    arrayList = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_gift_move");
                c474500IjALIZ.LJIL();
                C1129850fVX.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(lValueOf, "gift_id");
                if (arrayList != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((Number) obj).longValue() != 0) {
                            arrayList2.add(obj);
                        }
                    }
                }
                c474500IjALIZ.LJJII(arrayList2, "new_featured_gift_id_set");
                c474500IjALIZ.LIZ();
            }

            @Override // X.AbstractC21688119uJ
            public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                C1148930g0J c1148930g0J3;
                if (viewHolder2 instanceof C1148920g0I) {
                    if (this.LIZLLL == -1) {
                        this.LIZLLL = viewHolder.getAbsoluteAdapterPosition();
                    }
                    C1148920g0I c1148920g0I = (C1148920g0I) viewHolder2;
                    if (c1148920g0I.LLILLL && (c1148930g0J3 = this.LIZJ) != null) {
                        c1148930g0J3.LLILLL.LIZJ(viewHolder.getAbsoluteAdapterPosition(), c1148920g0I.getAbsoluteAdapterPosition());
                        return true;
                    }
                    return true;
                }
                return true;
            }
        }).LJ(this.LLJIJIL);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0g0W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1149010g0R) obj).LL;
            }
        }, null, new AwS631S0100000_17(this, 42), 6);
        C1148930g0J c1148930g0J3 = new C1148930g0J(false, this.LLJJIJIL);
        this.LLJJIJIIJIL = c1148930g0J3;
        c1148930g0J3.LLLI(list2);
        this.LLJILJIL = (RunnableC781530UlD) view.findViewById(R.id.gqx);
        final GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 4);
        gridLayoutManager2.LLIZ = new AbstractC214823195h() { // from class: X.0g0b
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                return i == 0 ? 4 : 1;
            }
        };
        RunnableC781530UlD runnableC781530UlD4 = this.LLJILJIL;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.setLayoutManager(gridLayoutManager2);
        }
        RunnableC781530UlD runnableC781530UlD5 = this.LLJILJIL;
        if (runnableC781530UlD5 != null) {
            runnableC781530UlD5.setAdapter(this.LLJJIJIIJIL);
        }
        RunnableC781530UlD runnableC781530UlD6 = this.LLJILJIL;
        if (runnableC781530UlD6 != null) {
            runnableC781530UlD6.setItemAnimator(new C423520Gj8() { // from class: X.0g0N
                public final AccelerateInterpolator LLJJIJIL;
                public final InterpolatorC1088720eRC LLJJJ;

                {
                    this.LLILZ = 150L;
                    this.LLJJIJIL = new AccelerateInterpolator();
                    this.LLJJJ = new InterpolatorC1088720eRC(0.16d, 0.64d, 0.31d, 0.98d);
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                    float height;
                    C1148920g0I c1148920g0I;
                    View view2 = viewHolder.itemView;
                    if (viewHolder instanceof C1148980g0O) {
                        super.LJJI(viewHolder);
                        return true;
                    }
                    if ((viewHolder instanceof C1148920g0I) && (c1148920g0I = (C1148920g0I) viewHolder) != null && c1148920g0I.LLILLL) {
                        height = view2.getHeight();
                    } else {
                        height = (-1) * view2.getHeight();
                    }
                    C786410Ut5.ed(view2, height);
                    view2.animate().translationY(0.0f).setDuration(350L).setInterpolator(this.LLJJJ).setListener(new ALAdapterS7S0300000_17(view2, this, viewHolder, 12)).start();
                    return true;
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
                    boolean zLJJII = super.LJJII(viewHolder, i, i2, i3, i4);
                    if (zLJJII) {
                        viewHolder.itemView.animate().setInterpolator(this.LLJJIJIL).setDuration(350L).start();
                    }
                    return zLJJII;
                }
            });
        }
        RunnableC781530UlD runnableC781530UlD7 = this.LLJILJIL;
        if (runnableC781530UlD7 != null) {
            runnableC781530UlD7.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0g0D
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                    this.Go().LLILLJJLI = gridLayoutManager2.findFirstVisibleItemPosition();
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0g0Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1149010g0R) obj).LLILLJJLI;
            }
        }, null, new AwS631S0100000_17(this, 45), 6);
        this.LLJJI = view.findViewById(R.id.fzj);
        this.LLJJIII = (C16F5) view.findViewById(R.id.hq5);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.hq4);
        C16F5 c16f53 = this.LLJJIII;
        if (c16f53 != null) {
            c16f53.setText(Go().zQ2());
        }
        if (Go().xQ2() >= 4) {
            View view2 = this.LLJJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            C16F5 c16f54 = this.LLJJIII;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 8);
            }
            LinearLayout linearLayout = this.LLJJ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0g0X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1149010g0R) obj).LL;
            }
        }, null, new AwS631S0100000_17(this, 43), 6);
        String str = Ho().LLILZIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_edit_panel_show");
        c474500IjALIZ.LJIL();
        C1129850fVX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "button_type");
        c474500IjALIZ.LIZ();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0g0S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1149010g0R) obj).LLILLL;
            }
        }, null, AFwS301S0000000_17.get$arr$(7), 6);
    }
}
