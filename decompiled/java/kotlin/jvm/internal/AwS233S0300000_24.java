package kotlin.jvm.internal;

import X.AbstractC1606860ruu;
import X.AbstractC1609440rz4;
import X.AbstractC19852312lt;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C013C;
import X.C07TW;
import X.C09AY;
import X.C0DHZ;
import X.C0SZ4;
import X.C0SZ5;
import X.C1163440gNi;
import X.C1223430hwT;
import X.C1247530iZL;
import X.C1397630mTR;
import X.C13IQ;
import X.C1571210qzP;
import X.C1579330rCV;
import X.C1591480rW6;
import X.C1591980rWu;
import X.C1591990rWv;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592470rXh;
import X.C1592520rXm;
import X.C1592730rY7;
import X.C1599380riq;
import X.C1606310ru1;
import X.C1606520ruM;
import X.C1606650ruZ;
import X.C1606890rux;
import X.C1607030rvB;
import X.C1609400rz0;
import X.C1609730rzX;
import X.C1609770rzb;
import X.C1611580s2W;
import X.C1611650s2d;
import X.C1611880s30;
import X.C1612160s3S;
import X.C1612210s3X;
import X.C1612740s4O;
import X.C1612750s4P;
import X.C1612800s4U;
import X.C1612810s4V;
import X.C1614710s7Z;
import X.C1614780s7g;
import X.C1617190sBZ;
import X.C189200o6;
import X.C1954807lC;
import X.C2097908Jt;
import X.C2252611DEt;
import X.C23250099c;
import X.C291001Au;
import X.C592330NLb;
import X.C757070Tmr;
import X.C786410Ut5;
import X.EnumC1571190qzN;
import X.EnumC1579340rCW;
import X.EnumC1606740rui;
import X.InterfaceC1361290lWp;
import X.InterfaceC1398730mVD;
import X.InterfaceC1580560rEU;
import X.InterfaceC20236714Gf;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnLongClickListenerC1620730sHH;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.friendstab.repo.LandingInfo;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.impl.SeriesLimitedFreeServiceImpl;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesVideoPlaylistHeadAssem;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailHeaderAssem;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import com.ss.android.ugc.aweme.sidebar.components.section.SideBarListSectionComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AwS233S0300000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        String str;
        VipSubscriptionDetail vipSubscriptionDetail;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) awS233S0300000_24.l0;
        if (vipSubscriptionDetailResponse == null || (vipSubscriptionDetail = vipSubscriptionDetailResponse.detail) == null || (str = vipSubscriptionDetail.contractId) == null) {
            str = "";
        }
        if (str.length() > 0) {
            SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModelSR = ((SeriesVipSubscriptionFragment) awS233S0300000_24.l1).SR();
            Context context = (Context) awS233S0300000_24.l2;
            C1614710s7Z c1614710s7Z = (C1614710s7Z) seriesVipSubscriptionViewModelSR.getState();
            if (!c1614710s7Z.LLILZIL && !c1614710s7Z.LLIZ && !c1614710s7Z.LLIZLLLIL) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(seriesVipSubscriptionViewModelSR), null, null, new C1614780s7g(seriesVipSubscriptionViewModelSR, str, context, null), 3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131848139, new AwS233S0300000_24((VipSubscriptionDetailResponse) awS233S0300000_24.l0, (SeriesVipSubscriptionFragment) awS233S0300000_24.l1, (Context) awS233S0300000_24.l2, 0));
        c1397630mTR.LJI(2131848140, null);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        UrlModel urlModelLIZIZ;
        Function1<C1609770rzb, Unit> function1;
        C1609730rzX c1609730rzX;
        C1609770rzb c1609770rzb = (C1609770rzb) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS233S0300000_24.l0;
        C189200o6.m2constructorimpl(c1609770rzb);
        interfaceC20236714Gf.resumeWith(c1609770rzb);
        C1609730rzX c1609730rzX2 = (C1609730rzX) awS233S0300000_24.l1;
        if (c1609730rzX2 != null) {
            urlModelLIZIZ = c1609730rzX2.LIZIZ();
        } else {
            urlModelLIZIZ = null;
        }
        if (Intrinsics.LJFF(urlModelLIZIZ, c1609770rzb.LIZLLL) && (c1609730rzX = (C1609730rzX) awS233S0300000_24.l1) != null) {
            c1609730rzX.LIZLLL();
        }
        AbstractC1609440rz4 abstractC1609440rz4 = ((C1609400rz0) awS233S0300000_24.l2).LIZLLL;
        if (abstractC1609440rz4 != null && (function1 = abstractC1609440rz4.LIZ) != null) {
            function1.invoke(c1609770rzb);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1611650s2d c1611650s2d = (C1611650s2d) obj;
        CollectionDetailModel collectionDetailModelGo = ((SeriesDetailHeaderAssem) awS233S0300000_24.l0).Go();
        if (collectionDetailModelGo != null && collectionDetailModelGo.canCollectionRefund && !Intrinsics.LJFF(c1611650s2d.LL, Boolean.TRUE) && !C757070Tmr.LIZ()) {
            ((List) awS233S0300000_24.l1).add((C1247530iZL) awS233S0300000_24.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        return C1579330rCV.LIZ((C1579330rCV) obj, null, (C0DHZ) awS233S0300000_24.l0, (Integer) awS233S0300000_24.l1, (EnumC1579340rCW) awS233S0300000_24.l2, null, null, 49);
    }

    public static final Object invoke$13(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        boolean z;
        C1611650s2d c1611650s2d = (C1611650s2d) obj;
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) PluggableExtentionKt.pluggableSpi$default(MiniDramaPaymentService.class, false, false, false, 14, null);
        if (miniDramaPaymentService != null && miniDramaPaymentService.LJI()) {
            z = true;
        } else {
            z = false;
        }
        CollectionDetailModel collectionDetailModelGo = ((SeriesVideoPlaylistHeadAssem) awS233S0300000_24.l0).Go();
        if (collectionDetailModelGo != null && collectionDetailModelGo.canCollectionRefund && !Intrinsics.LJFF(c1611650s2d.LL, Boolean.TRUE) && !z) {
            ((List) awS233S0300000_24.l1).add((C1247530iZL) awS233S0300000_24.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        SeriesLimitedFreeServiceImpl seriesLimitedFreeServiceImpl = (SeriesLimitedFreeServiceImpl) awS233S0300000_24.l0;
        if (seriesLimitedFreeServiceImpl.LJ) {
            seriesLimitedFreeServiceImpl.LJ = false;
            ((Function0) awS233S0300000_24.l1).invoke();
        } else {
            ((Function1) awS233S0300000_24.l2).invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        ((SideBarListSectionComponent) awS233S0300000_24.l0).yp((Assembler) obj, (InterfaceC1580560rEU) awS233S0300000_24.l1, new AwS581S0100000_2((ViewGroup) awS233S0300000_24.l2, 514));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$16(kotlin.jvm.internal.AwS233S0300000_24 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS233S0300000_24.invoke$16(kotlin.jvm.internal.AwS233S0300000_24, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$17(kotlin.jvm.internal.AwS233S0300000_24 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS233S0300000_24.invoke$17(kotlin.jvm.internal.AwS233S0300000_24, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        final C1606310ru1 c1606310ru1 = (C1606310ru1) obj;
        if (Intrinsics.LJFF(c1606310ru1.LIZ.getConfig().LIZ.LJIILIIL, Boolean.TRUE)) {
            View view = c1606310ru1.LIZIZ;
            final AbstractC1606860ruu abstractC1606860ruu = (AbstractC1606860ruu) awS233S0300000_24.l0;
            final InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) awS233S0300000_24.l1;
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0rvV
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view2) {
                    View.OnClickListener onClickListener;
                    Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> onNodeClickListener = c1606310ru1.LIZ.getClickListener().getOnNodeClickListener();
                    if (onNodeClickListener != null) {
                        onNodeClickListener.invoke(EnumC1608710rxt.AVATAR, abstractC1606860ruu);
                    }
                    InterfaceC1398730mVD interfaceC1398730mVD2 = interfaceC1398730mVD;
                    if ((interfaceC1398730mVD2 instanceof View.OnClickListener) && (onClickListener = (View.OnClickListener) interfaceC1398730mVD2) != null) {
                        onClickListener.onClick(c1606310ru1.LIZIZ);
                    }
                }
            }, view);
            c1606310ru1.LIZIZ.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(c1606310ru1, 2));
        } else {
            View view2 = c1606310ru1.LIZIZ;
            final C1606890rux c1606890rux = (C1606890rux) awS233S0300000_24.l2;
            final InterfaceC1398730mVD interfaceC1398730mVD2 = (InterfaceC1398730mVD) awS233S0300000_24.l1;
            final AbstractC1606860ruu abstractC1606860ruu2 = (AbstractC1606860ruu) awS233S0300000_24.l0;
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0rvW
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    C1606890rux c1606890rux2 = c1606890rux;
                    final C1606310ru1 c1606310ru12 = c1606310ru1;
                    final InterfaceC1398730mVD interfaceC1398730mVD3 = interfaceC1398730mVD2;
                    final AbstractC1606860ruu abstractC1606860ruu3 = abstractC1606860ruu2;
                    GestureDetector gestureDetector = c1606890rux2.LJIIJJI;
                    if (gestureDetector == null) {
                        final AvatarComponentView avatarComponentView = c1606310ru12.LIZ;
                        gestureDetector = new GestureDetector(avatarComponentView.getContext(), new C21648719nx() { // from class: X.0rvX
                            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                            public final boolean onDoubleTap(MotionEvent motionEvent2) {
                                View.OnClickListener onClickListenerLIZIZ = avatarComponentView.getClickListener().LIZIZ(2);
                                if (onClickListenerLIZIZ != null) {
                                    onClickListenerLIZIZ.onClick(avatarComponentView);
                                    return true;
                                }
                                return true;
                            }

                            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                            public final void onLongPress(MotionEvent motionEvent2) {
                                View.OnClickListener onClickListenerLIZIZ = avatarComponentView.getClickListener().LIZIZ(3);
                                if (onClickListenerLIZIZ != null) {
                                    onClickListenerLIZIZ.onClick(avatarComponentView);
                                }
                            }

                            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                            public final boolean onSingleTapConfirmed(MotionEvent motionEvent2) {
                                View.OnClickListener onClickListener;
                                Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> onNodeClickListener = c1606310ru12.LIZ.getClickListener().getOnNodeClickListener();
                                if (onNodeClickListener != null) {
                                    onNodeClickListener.invoke(EnumC1608710rxt.AVATAR, abstractC1606860ruu3);
                                }
                                InterfaceC1398730mVD interfaceC1398730mVD4 = interfaceC1398730mVD3;
                                if ((interfaceC1398730mVD4 instanceof View.OnClickListener) && (onClickListener = (View.OnClickListener) interfaceC1398730mVD4) != null) {
                                    onClickListener.onClick(c1606310ru12.LIZIZ);
                                    return true;
                                }
                                return true;
                            }
                        });
                        gestureDetector.setIsLongpressEnabled(true);
                        c1606890rux2.LJIIJJI = gestureDetector;
                    }
                    gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        return C1612210s3X.LIZ((C1612210s3X) obj, null, null, null, null, null, null, (Integer) awS233S0300000_24.l0, (List) awS233S0300000_24.l1, (Integer) awS233S0300000_24.l2, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, -449);
    }

    public static final Object invoke$2(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        String str;
        LandingInfo landingInfo;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        FriendsV3FeedListViewModel friendsV3FeedListViewModel = (FriendsV3FeedListViewModel) awS233S0300000_24.l0;
        FriendsV3FeedResponse friendsV3FeedResponse = (FriendsV3FeedResponse) awS233S0300000_24.l1;
        List<String> list = null;
        if (friendsV3FeedResponse != null && (landingInfo = friendsV3FeedResponse.landingInfo) != null) {
            str = landingInfo.anchorItemId;
        } else {
            str = null;
        }
        List list2 = (List) awS233S0300000_24.l2;
        friendsV3FeedListViewModel.getClass();
        C291001Au c291001AuYQ2 = FriendsV3FeedListViewModel.yQ2(str, friendsV3FeedResponse, list2);
        FriendsV3FeedResponse friendsV3FeedResponse2 = (FriendsV3FeedResponse) awS233S0300000_24.l1;
        if (friendsV3FeedResponse2 != null) {
            list = friendsV3FeedResponse2.newlyShownMafIds;
        }
        return C1223430hwT.LIZ(c1223430hwT, null, null, null, null, c291001AuYQ2, null, list, 175);
    }

    public static final Object invoke$20(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        SkylightListViewModel skylightListViewModel = (SkylightListViewModel) awS233S0300000_24.l0;
        AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24((C1599380riq) awS233S0300000_24.l1, (LifecycleOwner) awS233S0300000_24.l2, 111);
        skylightListViewModel.getClass();
        skylightListViewModel.withState(new AwS603S0100000_24(awS390S0200000_24, 676));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1606310ru1 c1606310ru1 = (C1606310ru1) obj;
        C1607030rvB c1607030rvB = (C1607030rvB) awS233S0300000_24.l0;
        List list = (List) awS233S0300000_24.l1;
        c1607030rvB.getClass();
        C1607030rvB.LJII(c1606310ru1, list);
        C1607030rvB c1607030rvB2 = (C1607030rvB) awS233S0300000_24.l0;
        List list2 = (List) awS233S0300000_24.l2;
        List list3 = (List) awS233S0300000_24.l1;
        c1607030rvB2.getClass();
        C1607030rvB.LJFF(c1606310ru1, list2, list3);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1606310ru1 c1606310ru1 = (C1606310ru1) obj;
        C1607030rvB c1607030rvB = (C1607030rvB) awS233S0300000_24.l0;
        List list = (List) awS233S0300000_24.l1;
        c1607030rvB.getClass();
        C1607030rvB.LJII(c1606310ru1, list);
        C1607030rvB c1607030rvB2 = (C1607030rvB) awS233S0300000_24.l0;
        List list2 = (List) awS233S0300000_24.l2;
        List list3 = (List) awS233S0300000_24.l1;
        c1607030rvB2.getClass();
        C1607030rvB.LJFF(c1606310ru1, list2, list3);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C592330NLb c592330NLb;
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        ImageView customImageView = c1592080rX4.getCustomImageView();
        if (customImageView != null) {
            EnumC1571190qzN enumC1571190qzN = (EnumC1571190qzN) awS233S0300000_24.l0;
            C1592080rX4 c1592080rX42 = (C1592080rX4) awS233S0300000_24.l1;
            C1592450rXf c1592450rXf = (C1592450rXf) awS233S0300000_24.l2;
            Drawable drawable = null;
            customImageView.setImageTintList(null);
            int i = C1571210qzP.LIZ[enumC1571190qzN.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    C1591980rWu tab = c1592080rX4.getTab();
                    if (tab != null && tab.LJIIIIZZ != null) {
                        C1591980rWu tab2 = c1592080rX4.getTab();
                        if (tab2 != null) {
                            drawable = tab2.LJIIIIZZ;
                        }
                        customImageView.setImageDrawable(drawable);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1591980rWu tab3 = c1592080rX4.getTab();
                if (tab3 != null && tab3.LJII != null) {
                    C1591980rWu tab4 = c1592080rX4.getTab();
                    if (tab4 != null) {
                        drawable = tab4.LJII;
                    }
                    customImageView.setImageDrawable(drawable);
                }
            }
            boolean zLJFF = Intrinsics.LJFF(c1592080rX4, c1592080rX42);
            C1591980rWu tab5 = c1592080rX4.getTab();
            if (tab5 != null && (c592330NLb = tab5.LJIIIZ) != null) {
                if (enumC1571190qzN != EnumC1571190qzN.DARK) {
                    z = false;
                }
                C1592450rXf.LJJI(c1592450rXf, c1592080rX4, c592330NLb, z, Boolean.valueOf(zLJFF), false, 8);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        EnumC1571190qzN enumC1571190qzN;
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        ImageView customImageView$homepage_common_release = c1592080rX4.getCustomImageView$homepage_common_release();
        EnumC1571190qzN enumC1571190qzN2 = null;
        if (Intrinsics.LJFF(c1592080rX4, (C1592080rX4) awS233S0300000_24.l0)) {
            if (mCustomTextView$homepage_common_release != null) {
                C786410Ut5.S4(1.0f, mCustomTextView$homepage_common_release);
            }
            if (customImageView$homepage_common_release != null) {
                C786410Ut5.V4(customImageView$homepage_common_release, 1.0f);
            }
            C1591990rWv c1591990rWv = ((C1591980rWu) awS233S0300000_24.l1).LJI;
            if (c1591990rWv != null) {
                enumC1571190qzN2 = c1591990rWv.LIZ;
            }
            if (enumC1571190qzN2 == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(mCustomTextView$homepage_common_release, false);
            }
        } else {
            C1591990rWv c1591990rWv2 = ((C1591980rWu) awS233S0300000_24.l1).LJI;
            if (c1591990rWv2 != null) {
                enumC1571190qzN = c1591990rWv2.LIZ;
            } else {
                enumC1571190qzN = null;
            }
            if (enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(mCustomTextView$homepage_common_release, true);
            }
            if (C1591480rW6.LJFF()) {
                C1591990rWv c1591990rWv3 = ((C1591980rWu) awS233S0300000_24.l1).LJI;
                if (c1591990rWv3 != null) {
                    enumC1571190qzN2 = c1591990rWv3.LIZ;
                }
                if (enumC1571190qzN2 == EnumC1571190qzN.LIGHT) {
                    if (mCustomTextView$homepage_common_release != null) {
                        C786410Ut5.S4(C1592730rY7.LJFF, mCustomTextView$homepage_common_release);
                    }
                    if (customImageView$homepage_common_release != null) {
                        C786410Ut5.V4(customImageView$homepage_common_release, C1592730rY7.LJFF);
                    }
                } else {
                    if (mCustomTextView$homepage_common_release != null) {
                        C786410Ut5.S4(C1592730rY7.LJ, mCustomTextView$homepage_common_release);
                    }
                    if (customImageView$homepage_common_release != null) {
                        C786410Ut5.V4(customImageView$homepage_common_release, C1592730rY7.LJ);
                    }
                }
            } else {
                if (mCustomTextView$homepage_common_release != null) {
                    C786410Ut5.S4(((C1592470rXh) awS233S0300000_24.l2).getMinAlpha(), mCustomTextView$homepage_common_release);
                }
                if (customImageView$homepage_common_release != null) {
                    C786410Ut5.V4(customImageView$homepage_common_release, ((C1592470rXh) awS233S0300000_24.l2).getMinAlpha());
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1592080rX4 c1592080rX4 = (C1592080rX4) obj;
        TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            C786410Ut5.LLIL(mCustomTextView$homepage_common_release, 0);
        }
        ImageView customImageView$homepage_common_release = c1592080rX4.getCustomImageView$homepage_common_release();
        if (customImageView$homepage_common_release != null) {
            C786410Ut5.LJZI(0, customImageView$homepage_common_release);
        }
        ((C013C) awS233S0300000_24.l0).element = C1592450rXf.LJJI((C1592450rXf) awS233S0300000_24.l1, c1592080rX4, (C592330NLb) awS233S0300000_24.l2, true, null, true, 4);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS233S0300000_24 r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS233S0300000_24.invoke$5(kotlin.jvm.internal.AwS233S0300000_24, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        C1612740s4O c1612740s4O = (C1612740s4O) obj;
        PaidContentVideoPanel paidContentVideoPanel = (PaidContentVideoPanel) awS233S0300000_24.l0;
        Map<String, String> map = c1612740s4O.LIZIZ;
        Map<String, String> map2 = c1612740s4O.LIZJ;
        Map<String, IapSubscriptionProduct> map3 = c1612740s4O.LJ;
        paidContentVideoPanel.X2 = new C1612750s4P(map, map2, map3, c1612740s4O.LJFF);
        List listLIZJ = C1612810s4V.LIZJ((List) awS233S0300000_24.l1, map, map2, map3);
        C1612800s4U c1612800s4U = C1612800s4U.LIZ;
        JSONObject jSONObject = (JSONObject) awS233S0300000_24.l2;
        c1612800s4U.getClass();
        JSONObject jSONObjectLJ = C1612800s4U.LJ(listLIZJ, jSONObject);
        C1606520ruM.LIZ.getClass();
        if (C1606520ruM.LIZ()) {
            C1606650ruZ.LIZIZ.LIZIZ(null, "short_drama_subscription_purchase_panel", C2097908Jt.LIZJ(new Pair("iap_biz_data", jSONObjectLJ)));
        } else {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((PaidContentVideoPanel) awS233S0300000_24.l0).Q2;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(C2097908Jt.LIZJ(new Pair("iap_biz_data", jSONObjectLJ)));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        List<PurchaseOption> list;
        Integer num;
        Integer num2;
        boolean z;
        CollectionDetailModel collectionDetailModel;
        C1612160s3S c1612160s3S = (C1612160s3S) obj;
        C1611580s2W c1611580s2W = new C1611580s2W(false, false, true, 0, false, 24);
        PaidContentVideoListResponse paidContentVideoListResponse = (PaidContentVideoListResponse) ((AbstractC19852312lt) awS233S0300000_24.l0).orNull();
        if (paidContentVideoListResponse == null || (list = paidContentVideoListResponse.purchaseOptions) == null) {
            list = c1612160s3S.LLJIJIL;
        }
        PaidContentVideoListResponse paidContentVideoListResponse2 = (PaidContentVideoListResponse) ((AbstractC19852312lt) awS233S0300000_24.l0).orNull();
        if (paidContentVideoListResponse2 == null || (num = paidContentVideoListResponse2.firstUnpurchasedSeqId) == null) {
            num = c1612160s3S.LLJILJILJ;
        }
        PaidContentVideoListResponse paidContentVideoListResponse3 = (PaidContentVideoListResponse) ((AbstractC19852312lt) awS233S0300000_24.l0).orNull();
        if (paidContentVideoListResponse3 == null || (num2 = paidContentVideoListResponse3.preselectIndex) == null) {
            num2 = c1612160s3S.LLJILJIL;
        }
        PaidCollectionDetailResponse paidCollectionDetailResponse = (PaidCollectionDetailResponse) ((AbstractC19852312lt) awS233S0300000_24.l1).orNull();
        if (paidCollectionDetailResponse != null && (collectionDetailModel = paidCollectionDetailResponse.collectionDetail) != null) {
            z = collectionDetailModel.enableSingleVideoPurchase;
        } else {
            z = ((C1612160s3S) ((SeriesDetailVideoListViewModel) awS233S0300000_24.l2).getState()).LLJILLL;
        }
        return C1612160s3S.LIZ(c1612160s3S, c1611580s2W, null, null, null, null, false, false, null, null, list, num2, num, z, null, null, null, 246782);
    }

    public static final Object invoke$8(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        String id;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS233S0300000_24.l0;
        InterfaceC1580560rEU interfaceC1580560rEU = (InterfaceC1580560rEU) awS233S0300000_24.l1;
        if (interfaceC1580560rEU != null) {
            id = interfaceC1580560rEU.getId();
        } else {
            id = null;
        }
        c0sz4.LLILLJJLI = id;
        c0sz4.LLJIJIL = C1163440gNi.LIZLLL;
        ((Function1) awS233S0300000_24.l2).invoke(c0sz4);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS233S0300000_24 awS233S0300000_24, Object obj) {
        UrlModel urlModelLIZIZ;
        C1609730rzX c1609730rzX;
        AbstractC1609440rz4 abstractC1609440rz4;
        Function1<C1609770rzb, Unit> function1;
        C1609770rzb c1609770rzb = (C1609770rzb) obj;
        C1609400rz0 c1609400rz0 = (C1609400rz0) awS233S0300000_24.l0;
        if (c1609400rz0 != null && (abstractC1609440rz4 = c1609400rz0.LIZLLL) != null && (function1 = abstractC1609440rz4.LIZ) != null) {
            function1.invoke(c1609770rzb);
        }
        if (c1609770rzb.LIZIZ) {
            C1609730rzX c1609730rzX2 = (C1609730rzX) awS233S0300000_24.l1;
            if (c1609730rzX2 != null) {
                c1609730rzX2.LJI(c1609770rzb.LIZLLL);
            }
            C1609730rzX c1609730rzX3 = (C1609730rzX) awS233S0300000_24.l1;
            if (c1609730rzX3 != null) {
                c1609730rzX3.LJFF(c1609770rzb.LIZJ);
            }
            C1609730rzX c1609730rzX4 = (C1609730rzX) awS233S0300000_24.l1;
            if (c1609730rzX4 != null) {
                c1609730rzX4.LJII(c1609770rzb.LJ);
            }
            C1609730rzX c1609730rzX5 = (C1609730rzX) awS233S0300000_24.l1;
            if (c1609730rzX5 != null) {
                c1609730rzX5.LJ();
            }
        }
        C1609730rzX c1609730rzX6 = (C1609730rzX) awS233S0300000_24.l2;
        String strLIZJ = null;
        if (c1609730rzX6 != null) {
            urlModelLIZIZ = c1609730rzX6.LIZIZ();
        } else {
            urlModelLIZIZ = null;
        }
        if (Intrinsics.LJFF(urlModelLIZIZ, c1609770rzb.LIZLLL)) {
            C1609730rzX c1609730rzX7 = (C1609730rzX) awS233S0300000_24.l2;
            if (c1609730rzX7 != null) {
                strLIZJ = c1609730rzX7.LIZJ();
            }
            if (Intrinsics.LJFF(strLIZJ, c1609770rzb.LJ) && (c1609730rzX = (C1609730rzX) awS233S0300000_24.l2) != null) {
                c1609730rzX.LIZLLL();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C013C c013c, C1592450rXf c1592450rXf, C592330NLb c592330NLb, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c1592450rXf;
        this.l2 = c592330NLb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C0DHZ c0dhz, Integer num, EnumC1579340rCW enumC1579340rCW, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0dhz;
        this.l1 = num;
        this.l2 = enumC1579340rCW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(EnumC1571190qzN enumC1571190qzN, C1592080rX4 c1592080rX4, C1592450rXf c1592450rXf, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1571190qzN;
        this.l1 = c1592080rX4;
        this.l2 = c1592450rXf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C1592080rX4 c1592080rX4, C1591980rWu c1591980rWu, C1592470rXh c1592470rXh, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1592080rX4;
        this.l1 = c1591980rWu;
        this.l2 = c1592470rXh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(EnumC1606740rui enumC1606740rui, C1606890rux c1606890rux, AbstractC1606860ruu abstractC1606860ruu, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1606740rui;
        this.l1 = c1606890rux;
        this.l2 = abstractC1606860ruu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(AbstractC1606860ruu abstractC1606860ruu, InterfaceC1398730mVD interfaceC1398730mVD, C1606890rux c1606890rux, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1606860ruu;
        this.l1 = interfaceC1398730mVD;
        this.l2 = c1606890rux;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(C1607030rvB c1607030rvB, C1607030rvB c1607030rvB2, List<C07TW> list, List<? extends User> list2) {
        super(1);
        this.$t = list2;
        this.l0 = c1607030rvB;
        this.l1 = c1607030rvB2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C1609400rz0 c1609400rz0, C1609730rzX c1609730rzX, C1609730rzX c1609730rzX2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1609400rz0;
        this.l1 = c1609730rzX;
        this.l2 = c1609730rzX2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C1611880s30 c1611880s30, SeriesDetailVideoListViewModel seriesDetailVideoListViewModel, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1611880s30;
        this.l1 = seriesDetailVideoListViewModel;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(AbstractC19852312lt abstractC19852312lt, AbstractC19852312lt<PaidContentVideoListResponse> abstractC19852312lt2, AbstractC19852312lt<PaidCollectionDetailResponse> abstractC19852312lt3, SeriesDetailVideoListViewModel seriesDetailVideoListViewModel) {
        super(1);
        this.$t = seriesDetailVideoListViewModel;
        this.l0 = abstractC19852312lt;
        this.l1 = abstractC19852312lt2;
        this.l2 = abstractC19852312lt3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(C13IQ c13iq, C13IQ<? extends UISlotAssem> c13iq2, InterfaceC1580560rEU interfaceC1580560rEU, Function1<? super C0SZ5, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c13iq;
        this.l1 = c13iq2;
        this.l2 = interfaceC1580560rEU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(C2252611DEt c2252611DEt, C1609730rzX c1609730rzX, C1609400rz0 c1609400rz0, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = c1609730rzX;
        this.l2 = c1609400rz0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(FriendsV3FeedListViewModel friendsV3FeedListViewModel, FriendsV3FeedListViewModel friendsV3FeedListViewModel2, FriendsV3FeedResponse friendsV3FeedResponse, List<? extends InterfaceC1361290lWp> list) {
        super(1);
        this.$t = list;
        this.l0 = friendsV3FeedListViewModel;
        this.l1 = friendsV3FeedListViewModel2;
        this.l2 = friendsV3FeedResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(SkylightListViewModel skylightListViewModel, C1599380riq c1599380riq, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = skylightListViewModel;
        this.l1 = c1599380riq;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(SeriesLimitedFreeServiceImpl seriesLimitedFreeServiceImpl, AwS568S0100000_24 awS568S0100000_24, AwS119S0400000_24 awS119S0400000_24, int i) {
        super(1);
        this.$t = i;
        this.l0 = seriesLimitedFreeServiceImpl;
        this.l1 = awS568S0100000_24;
        this.l2 = awS119S0400000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(VipSubscriptionDetailResponse vipSubscriptionDetailResponse, SeriesVipSubscriptionFragment seriesVipSubscriptionFragment, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = vipSubscriptionDetailResponse;
        this.l1 = seriesVipSubscriptionFragment;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(SeriesVideoPlaylistHeadAssem seriesVideoPlaylistHeadAssem, SeriesVideoPlaylistHeadAssem seriesVideoPlaylistHeadAssem2, List<C1247530iZL> list, C1247530iZL c1247530iZL) {
        super(1);
        this.$t = c1247530iZL;
        this.l0 = seriesVideoPlaylistHeadAssem;
        this.l1 = seriesVideoPlaylistHeadAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(PaidContentVideoPanel paidContentVideoPanel, PaidContentVideoPanel paidContentVideoPanel2, List<VipSubscriptionPurchaseOption> list, JSONObject jSONObject) {
        super(1);
        this.$t = jSONObject;
        this.l0 = paidContentVideoPanel;
        this.l1 = paidContentVideoPanel2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(SeriesDetailHeaderAssem seriesDetailHeaderAssem, SeriesDetailHeaderAssem seriesDetailHeaderAssem2, List<C1247530iZL> list, C1247530iZL c1247530iZL) {
        super(1);
        this.$t = c1247530iZL;
        this.l0 = seriesDetailHeaderAssem;
        this.l1 = seriesDetailHeaderAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(SideBarListSectionComponent sideBarListSectionComponent, InterfaceC1580560rEU interfaceC1580560rEU, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = sideBarListSectionComponent;
        this.l1 = interfaceC1580560rEU;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS233S0300000_24(Integer num, Integer num2, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = num;
        this.l1 = list;
        this.l2 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS233S0300000_24(List list, List<C1617190sBZ> list2, MiniDramaPricingServiceImpl miniDramaPricingServiceImpl, Context context) {
        super(1);
        this.$t = context;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = miniDramaPricingServiceImpl;
    }
}
