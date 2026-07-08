package com.ss.android.ugc.nearby.feedcard;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0GS6;
import X.C0HWQ;
import X.C0P0T;
import X.C0QSJ;
import X.C118300cf;
import X.C1189060h32;
import X.C1204470hRt;
import X.C1204510hRx;
import X.C1204880hSY;
import X.C1205040hSo;
import X.C1205240hT8;
import X.C1205270hTB;
import X.C1205290hTD;
import X.C1209080hZK;
import X.C1220000hqw;
import X.C123100dR;
import X.C1391600mJi;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1570830qyn;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C266850Ad1;
import X.C341940Daq;
import X.C419910GdJ;
import X.C427660Gpo;
import X.C443090HZb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C631370Opb;
import X.C687700QyG;
import X.C720360SNm;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1235690iGF;
import X.InterfaceC1340660kzY;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.nearby.container.NearbyFragment;
import com.ss.android.ugc.nearby.container.NearbyStaggeredGridLayoutManager;
import com.ss.android.ugc.nearby.container.ability.IFeedContentAbility;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS3S2101000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS6S2201000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedCellAssem extends ReusedUISlotAssem<NearbyFeedCellAssem> implements InterfaceC712990Rxx<C1204470hRt> {
    public static final C1205270hTB LLLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public static final int LLLLII;
    public static Drawable LLLLIIIILLL;
    public static TuxIconDrawable LLLLIIL;
    public static TuxIconDrawable LLLLIILL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public SmartImageView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C427660Gpo LLJLL;
    public ConstraintLayout LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxIconView LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public View LLLFFI;
    public C1205240hT8 LLLFZ;
    public String LLLI = "";
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final AssemVMLazy LLLIIIL;
    public final C736950SvV LLLIIL;
    public final C736950SvV LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public long LLLJ;
    public int LLLJIL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0hTB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NearbyFeedCellAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/nearby/container/vm/NearbyContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLJL = new Object() { // from class: X.0hTB
        };
        Integer num = C1205040hSo.LIZ().cardIndex;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        LLLLII = (num != null ? num.intValue() : 8) - 1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ds3;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public NearbyFeedCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NearbyContainerViewModel.class);
        this.LLLIIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2356), AFwS256S0000000_18.get$arr$(798), null, true);
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(631);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NearbyFeedSharedViewModel.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(799);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 2357);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLLIIL = new C736950SvV(c19719912DlLIZ2, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(630);
        this.LLLIILIL = new C736950SvV(C13LE.LIZ(NearbyFeedInnerSharedViewModel.class), aFwS206S0000000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(800), new AwS562S0100000_18((AbstractC738140SxQ) this, 2358), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLIZZ = true;
    }

    public final NearbyContainerViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLLIIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        return (NearbyContainerViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yp() {
        String uid;
        String string;
        String str;
        String string2;
        String string3;
        C0P0T c0p0tLIZIZ;
        NearbyFragment nearbyFragment;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        View viewFindViewById;
        RecyclerView recyclerView;
        NearbyStaggeredGridLayoutManager nearbyStaggeredGridLayoutManager;
        Context context;
        String string4;
        PoiDataStruct poiDataStruct;
        SmartImageView smartImageView;
        FrameLayout frameLayout2;
        View viewFindViewById2;
        User author;
        User currentUser;
        if (((Boolean) C266850Ad1.LIZ.getValue()).booleanValue()) {
            C1204510hRx c1204510hRx = (C1204510hRx) ((AssemViewModel) this.LLLIIL.getValue()).getState();
            c1204510hRx.getClass();
            if (c1204510hRx.getListState().LL instanceof C1623706Xj) {
                return;
            }
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            String str2 = "";
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                uid = "";
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((C1204470hRt) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
            String uid2 = (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid();
            if (C123100dR.LIZ(uid) && Intrinsics.LJFF(uid, uid2)) {
                return;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            Aweme aweme2 = ((C1204470hRt) (c724270Sb32 != null ? c724270Sb32.LL : null)).LL;
            String aid = aweme2 != null ? aweme2.getAid() : null;
            int iTp = tp();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            NearbyFragment nearbyFragment2 = fragmentLJI instanceof NearbyFragment ? (NearbyFragment) fragmentLJI : null;
            if (nearbyFragment2 != null && (smartImageView = this.LLJLIL) != null && (frameLayout2 = nearbyFragment2.LLIZLLLIL) != null && (viewFindViewById2 = frameLayout2.findViewById(R.id.rn0)) != null) {
                int[] iArr = new int[2];
                smartImageView.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewFindViewById2.getLocationOnScreen(iArr2);
                int i = iArr[1];
                if (i < iArr2[1]) {
                    if ((r2 - i) / smartImageView.getHeight() >= 0.5f) {
                        return;
                    }
                } else if (i + smartImageView.getHeight() > iArr2[1] + viewFindViewById2.getHeight() && ((iArr[1] + smartImageView.getHeight()) - (iArr2[1] + viewFindViewById2.getHeight())) / smartImageView.getHeight() >= 0.5f) {
                    return;
                }
            }
            C1205290hTD c1205290hTD = C1205290hTD.LIZ;
            String str3 = aid == null ? "" : aid;
            String str4 = uid2 == null ? "" : uid2;
            C724270Sb3 c724270Sb33 = this.LLJI;
            Aweme aweme3 = ((C1204470hRt) (c724270Sb33 != null ? c724270Sb33.LL : null)).LL;
            if (aweme3 == null || (string = Integer.valueOf(aweme3.getAwemeType()).toString()) == null) {
                string = "";
            }
            C724270Sb3 c724270Sb34 = this.LLJI;
            Aweme aweme4 = ((C1204470hRt) (c724270Sb34 != null ? c724270Sb34.LL : null)).LL;
            if (aweme4 == null || (poiDataStruct = aweme4.getPoiDataStruct()) == null || (str = poiDataStruct.poiId) == null) {
                str = "";
            }
            String strValueOf = String.valueOf(iTp);
            c1205290hTD.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk.LJIIIIZZ("group_id", str3);
            c2344009Gk.LJIIIIZZ("author_id", str4);
            c2344009Gk.LJIIIIZZ("aweme_type", string);
            c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
            c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
            c2344009Gk.LJIIIIZZ("nearby_rank", strValueOf);
            C20684815ws.LJIILLIIL("nearby_card_long_press", c2344009Gk.LIZ);
            Context context2 = getContext();
            if (context2 == null || (string2 = context2.getString(2131837933)) == null) {
                string2 = "";
            }
            C443090HZb c443090HZb = new C443090HZb(string2, new AwS3S2101000_18(this, aid, uid2, iTp, 1), R.raw.icon_flag, null, 0, null, 0, false, false, null, 1016);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = C341940Daq.LIZ(-6.0d);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                int height = c19egLIZ.getWindow().getDecorView().getHeight();
                View viewLIZ = C1570830qyn.LIZ(c19egLIZ);
                if (viewLIZ == null) {
                    viewLIZ = c19egLIZ.findViewById(R.id.nwe);
                }
                int[] iArr3 = new int[2];
                viewLIZ.getLocationInWindow(iArr3);
                c118300cf.element += height - iArr3[1];
            }
            Context context3 = getContext();
            if (context3 == null || (string3 = context3.getString(2131837932)) == null) {
                string3 = "";
            }
            C443090HZb c443090HZb2 = new C443090HZb(string3, new AwS6S2201000_18(this, aid, uid2, iTp, c118300cf, 1), R.raw.icon_heart_broken, null, 0, null, 0, false, false, null, 1016);
            Context context4 = getContext();
            if (context4 != null && (string4 = context4.getString(2131837931)) != null) {
                str2 = string4;
            }
            List listSingletonList = Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZb2, new C443090HZb(str2, new AwS6S2201000_18(this, aid, uid2, iTp, c118300cf, 0), R.raw.icon_person_x_mark, null, 0, null, 0, false, false, null, 1016), c443090HZb));
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view == null || (context = getContext()) == null) {
                c0p0tLIZIZ = null;
            } else {
                C0HWQ c0hwq = new C0HWQ(context);
                c0hwq.LJIIL(listSingletonList);
                c0hwq.LLJ = true;
                int iLIZ = C341940Daq.LIZ(0.0d);
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LJFF = iLIZ;
                c1391600mJi.LIZIZ = view;
                int iLIZ2 = C341940Daq.LIZ(5.0d);
                C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
                c1391600mJi2.LJIIIIZZ = iLIZ2;
                c1391600mJi2.LJIIL = false;
                c1391600mJi2.LJII = -1001L;
                c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
                c0p0tLIZIZ = c0hwq.LIZIZ();
                c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0hT4
                    @Override // X.InterfaceC1340660kzY
                    public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                        NearbyFragment nearbyFragment3;
                        String aid2;
                        Object ability;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate;
                        ViewPropertyAnimator viewPropertyAnimatorAlpha;
                        ViewPropertyAnimator duration;
                        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
                        RecyclerView recyclerView2;
                        NearbyStaggeredGridLayoutManager nearbyStaggeredGridLayoutManager2;
                        Fragment fragmentLJI2 = C724240Sb0.LJI(this.LIZ);
                        Object obj = null;
                        if (fragmentLJI2 instanceof NearbyFragment) {
                            nearbyFragment3 = (NearbyFragment) fragmentLJI2;
                        } else {
                            nearbyFragment3 = null;
                        }
                        if (nearbyFragment3 != null) {
                            FrameLayout frameLayout3 = nearbyFragment3.LLIZLLLIL;
                            if (frameLayout3 != null && (recyclerView2 = (RecyclerView) frameLayout3.findViewById(R.id.rn0)) != null) {
                                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                                if ((layoutManager instanceof NearbyStaggeredGridLayoutManager) && (nearbyStaggeredGridLayoutManager2 = (NearbyStaggeredGridLayoutManager) layoutManager) != null) {
                                    nearbyStaggeredGridLayoutManager2.LLJJJJLIIL = true;
                                }
                            }
                            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(nearbyFragment3, null), MainActivityScope.class);
                            if (c0qsjLIZJ != null) {
                                ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
                            } else {
                                ability = null;
                            }
                            if (!(ability instanceof HomeViewPagerAbility)) {
                                ability = null;
                            }
                            HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) ability;
                            if (homeViewPagerAbility != null) {
                                homeViewPagerAbility.LLIFFJFJJ(true);
                            } else {
                                HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(nearbyFragment3);
                                if (homeViewPagerAbilityLIZIZ != null) {
                                    homeViewPagerAbilityLIZIZ.LLIFFJFJJ(true);
                                }
                            }
                            C0GS6 c0gs6 = nearbyFragment3.LLJJ;
                            if (c0gs6 != null && (viewPropertyAnimatorAnimate = c0gs6.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(150L)) != null && (viewPropertyAnimatorWithEndAction = duration.withEndAction(new ARunnableS106S0100000_6(nearbyFragment3, 211))) != null) {
                                viewPropertyAnimatorWithEndAction.start();
                            }
                        }
                        NearbyFeedCellAssem nearbyFeedCellAssem = this.LIZ;
                        nearbyFeedCellAssem.LLLILZ = false;
                        if ((abstractC1391670mJp instanceof C1391690mJr) && !nearbyFeedCellAssem.LLLIL) {
                            C1205290hTD c1205290hTD2 = C1205290hTD.LIZ;
                            C724270Sb3 c724270Sb35 = nearbyFeedCellAssem.LLJI;
                            if (c724270Sb35 != null) {
                                obj = c724270Sb35.LL;
                            }
                            Aweme aweme5 = ((C1204470hRt) obj).LL;
                            if (aweme5 == null || (aid2 = aweme5.getAid()) == null) {
                                aid2 = "";
                            }
                            c1205290hTD2.getClass();
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("enter_from", "homepage_nearby");
                            c2344009Gk2.LJIIIIZZ("group_id", aid2);
                            C20684815ws.LJIILLIIL("nearby_feedback_window_exit", c2344009Gk2.LIZ);
                        }
                    }
                });
            }
            if (this.LLLILZ) {
                return;
            }
            this.LLLILZ = true;
            this.LLLIL = false;
            if (c0p0tLIZIZ != null) {
                c0p0tLIZIZ.show();
            }
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (!(fragmentLJI2 instanceof NearbyFragment) || (nearbyFragment = (NearbyFragment) fragmentLJI2) == null) {
                    return;
                }
                FrameLayout frameLayout3 = nearbyFragment.LLIZLLLIL;
                if (frameLayout3 != null && (recyclerView = (RecyclerView) frameLayout3.findViewById(R.id.rn0)) != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof NearbyStaggeredGridLayoutManager) && (nearbyStaggeredGridLayoutManager = (NearbyStaggeredGridLayoutManager) layoutManager) != null) {
                        nearbyStaggeredGridLayoutManager.LLJJJJLIIL = false;
                    }
                }
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(nearbyFragment, null), MainActivityScope.class);
                Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeViewPagerAbility.class) : null;
                if (!(ability instanceof HomeViewPagerAbility)) {
                    ability = null;
                }
                HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) ability;
                if (homeViewPagerAbility != null) {
                    homeViewPagerAbility.LLIFFJFJJ(false);
                } else {
                    HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(nearbyFragment);
                    if (homeViewPagerAbilityLIZIZ != null) {
                        homeViewPagerAbilityLIZIZ.LLIFFJFJJ(false);
                    }
                }
                C19EG activity = nearbyFragment.getActivity();
                if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(R.id.tya)) == null || (frameLayout = nearbyFragment.LLIZLLLIL) == null || (viewFindViewById = frameLayout.findViewById(R.id.p4b)) == null) {
                    return;
                }
                final Context context5 = nearbyFragment.getContext();
                nearbyFragment.LLJJ = context5 != null ? new View(context5) { // from class: X.0GS6
                    public final Paint LL;
                    public final Path LLILLJJLI;
                    public RectF LLILLL;

                    {
                        int iIntValue;
                        super(context5, null);
                        Paint paint = new Paint(1);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context5);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        paint.setColor(iIntValue);
                        paint.setStyle(Paint.Style.FILL);
                        this.LL = paint;
                        this.LLILLJJLI = new Path();
                        this.LLILLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        super.onDraw(canvas);
                        this.LLILLJJLI.reset();
                        this.LLILLJJLI.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
                        Path path = new Path();
                        path.addRect(this.LLILLL, Path.Direction.CW);
                        this.LLILLJJLI.op(path, Path.Op.DIFFERENCE);
                        canvas.drawPath(this.LLILLJJLI, this.LL);
                    }

                    public final void setHoleRect$nearby_release(Rect rect) {
                        this.LLILLL = new RectF(rect);
                        invalidate();
                    }
                } : 0;
                C0GS6 c0gs6 = nearbyFragment.LLJJ;
                if (c0gs6 != null) {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs6);
                    c0gs6.setLayoutParams(layoutParams);
                    c0gs6.setBackgroundColor(0);
                    Rect rectAS = nearbyFragment.aS(view2, viewGroup);
                    Rect rectAS2 = nearbyFragment.aS(viewFindViewById, viewGroup);
                    rectAS.top = Math.max(rectAS.top, rectAS2.top);
                    rectAS.bottom = Math.min(rectAS.bottom, rectAS2.bottom);
                    c0gs6.setHoleRect$nearby_release(rectAS);
                    viewGroup.addView(c0gs6);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs6);
                    c0gs6.setAlpha(0.0f);
                    c0gs6.animate().alpha(0.9f).setDuration(150L).start();
                }
            }
        }
    }

    public final int tp() {
        IFeedContentAbility iFeedContentAbility;
        int iLIZIZ = C631370Opb.LIZIZ(this);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        return iLIZIZ - ((fragmentLJIIJ == null || (iFeedContentAbility = (IFeedContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IFeedContentAbility.class, null)) == null) ? 0 : iFeedContentAbility.hq1());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        TuxIconDrawable tuxIconDrawable;
        this.LLJJLIIIJLLLLLLLZ = view;
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.kgf);
        this.LLJL = (TuxTextView) view.findViewById(R.id.tvw_desc);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.kh4);
        if (tuxIconView != null) {
            Context context = tuxIconView.getContext();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C720360SNm.LJIIL(((C1204470hRt) obj).LL)) {
                if (LLLLIILL == null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_horizontal_bars;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    c419910GdJ.LJFF = true;
                    LLLLIILL = c419910GdJ.LIZ(context);
                }
                tuxIconDrawable = LLLLIILL;
            } else {
                if (LLLLIIL == null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_image_alt_1_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                    c419910GdJ2.LJFF = true;
                    LLLLIIL = c419910GdJ2.LIZ(context);
                }
                tuxIconDrawable = LLLLIIL;
            }
            tuxIconView.setImageDrawable(tuxIconDrawable);
        } else {
            tuxIconView = null;
        }
        this.LLJLILLLLZIIL = tuxIconView;
        this.LLJLL = (C427660Gpo) view.findViewById(R.id.kg0);
        this.LLJLLIL = (ConstraintLayout) view.findViewById(R.id.bjo);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.tvw_nick);
        this.LLJZ = (TuxIconView) view.findViewById(R.id.c4k);
        view.findViewById(R.id.user_profile_layout);
        this.LLJZIJLIL = (ConstraintLayout) view.findViewById(R.id.qwv);
        this.LLL = (TuxTextView) view.findViewById(R.id.r51);
        this.LLLF = (TuxTextView) view.findViewById(R.id.r1u);
        this.LLLFF = (TuxTextView) view.findViewById(R.id.r1v);
        this.LLLFFI = view.findViewById(R.id.p41);
        C723830SaL.LIZ(this, null, new AwS597S0100000_18(this, 601));
        C2211751BhN.LIZ(getContentView(), new C1209080hZK(this, 6));
    }

    public final void op(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Integer numValueOf;
        Object obj4;
        String requestId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//user/profile");
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj5 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        smartRouteBuildRoute.withParam("uid", AwemeExtKt.getAuthorUid(((C1204470hRt) obj).LL));
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        smartRouteBuildRoute.withParam("sec_uid", AwemeExtKt.getSecAuthorUid(((C1204470hRt) obj2).LL));
        smartRouteBuildRoute.withParam("enter_from", "homepage_nearby");
        smartRouteBuildRoute.withParam("enter_method", str);
        smartRouteBuildRoute.withParam("previous_page", "homepage_nearby");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "homepage_nearby");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "homepage_nearby");
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        User author = ((C1204470hRt) obj3).LL.getAuthor();
        if (author != null) {
            numValueOf = Integer.valueOf(author.getCommerceUserLevel());
        } else {
            numValueOf = null;
        }
        smartRouteBuildRoute.withParam("profile_enterprise_type", numValueOf);
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        User author2 = ((C1204470hRt) obj4).LL.getAuthor();
        if (author2 != null) {
            requestId = author2.getRequestId();
        } else {
            requestId = null;
        }
        smartRouteBuildRoute.withParam("search_request_id", requestId);
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        }
        smartRouteBuildRoute.withParam("video_id", ((C1204470hRt) obj5).LL.getAid());
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0226 A[PHI: r10 r11 r12
      0x0226: PHI (r10v7 boolean) = (r10v3 boolean), (r10v3 boolean), (r10v8 boolean) binds: [B:267:0x045d, B:268:0x045f, B:128:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r11v8 boolean) = (r11v4 boolean), (r11v4 boolean), (r11v9 boolean) binds: [B:267:0x045d, B:268:0x045f, B:128:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r12v11 boolean) = (r12v5 boolean), (r12v5 boolean), (r12v12 boolean) binds: [B:267:0x045d, B:268:0x045f, B:128:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x045b A[PHI: r12
      0x045b: PHI (r12v4 boolean) = (r12v3 boolean), (r12v12 boolean), (r12v12 boolean) binds: [B:263:0x0457, B:124:0x021e, B:125:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    @Override // X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(final X.C1204470hRt r36) {
        /*
            Method dump skipped, instruction units count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem.up(X.0hRt):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1204470hRt c1204470hRt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1204470hRt c1204470hRt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C1205240hT8 c1205240hT8;
        long diggCount;
        C1204470hRt c1204470hRt = (C1204470hRt) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            C1205240hT8 c1205240hT82 = this.LLLFZ;
            if (c1205240hT82 != null) {
                AwemeStatistics statistics = c1204470hRt.LL.getStatistics();
                if (statistics != null) {
                    diggCount = statistics.getDiggCount();
                } else {
                    diggCount = 0;
                }
                c1205240hT8 = new C1205240hT8(c1205240hT82.LIZ, c1205240hT82.LIZIZ, c1205240hT82.LIZJ, c1205240hT82.LIZLLL, c1205240hT82.LJ, c1205240hT82.LJFF, c1205240hT82.LJI, c1205240hT82.LJII, c1205240hT82.LJIIIIZZ, c1205240hT82.LJIIIZ, c1205240hT82.LJIIJ, diggCount, c1205240hT82.LJIIL, c1205240hT82.LJIILIIL, c1205240hT82.LJIILJJIL, c1205240hT82.LJIILL, c1205240hT82.LJIILLIIL, c1205240hT82.LJIIZILJ, c1205240hT82.LJIJ);
            } else {
                c1205240hT8 = null;
            }
            this.LLLFZ = c1205240hT8;
            return;
        }
        up(c1204470hRt);
    }
}
