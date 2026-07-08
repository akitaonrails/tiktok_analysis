package kotlin.jvm.internal;

import X.C09AY;
import X.C0FNV;
import X.C11JF;
import X.C1223430hwT;
import X.C1562360ql8;
import X.C1573210r2d;
import X.C1579330rCV;
import X.C1581070rFJ;
import X.C1581170rFT;
import X.C1588110rQf;
import X.C1591100rVU;
import X.C1605720rt4;
import X.C1610970s1X;
import X.C1611650s2d;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C343280Dd0;
import X.C491001vg;
import X.C627260Oiy;
import X.C727890Sgt;
import X.C995680c18;
import X.DialogC848910XRx;
import X.EnumC1605740rt6;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC1582750rI1;
import X.InterfaceC1583870rJp;
import X.InterfaceC1588310rQz;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageStateAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundFragment;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelAssem;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.ss.android.ugc.aweme.vibefeed.clientai.service.VibeClientAIServiceImpl;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS138S1100000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.QQ2((StoryUserListPanelAssem) awS138S1100000_24.l1, AFwS229S0000000_2.get$arr$(504));
        String str = awS138S1100000_24.s0;
        if (Intrinsics.LJFF(str, "mention")) {
            assembler.QQ2((StoryUserListPanelAssem) awS138S1100000_24.l1, AFwS264S0000000_24.get$arr$(402));
            IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService != null && iStoryMentionShareService.LJIIIIZZ()) {
                assembler.QQ2((StoryUserListPanelAssem) awS138S1100000_24.l1, AFwS264S0000000_24.get$arr$(403));
            }
        } else if (Intrinsics.LJFF(str, "dm")) {
            assembler.QQ2((StoryUserListPanelAssem) awS138S1100000_24.l1, AFwS264S0000000_24.get$arr$(404));
        }
        assembler.QQ2((StoryUserListPanelAssem) awS138S1100000_24.l1, AFwS264S0000000_24.get$arr$(405));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        int iIntValue;
        VibeClientAIServiceImpl vibeClientAIServiceImpl = (VibeClientAIServiceImpl) awS138S1100000_24.l1;
        Object obj2 = vibeClientAIServiceImpl.LIZ;
        String str = awS138S1100000_24.s0;
        synchronized (obj2) {
            try {
                vibeClientAIServiceImpl.LIZIZ.remove(str);
                if (obj == null) {
                    Integer num = vibeClientAIServiceImpl.LIZLLL.get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i = iIntValue + 1;
                    vibeClientAIServiceImpl.LIZLLL.put(str, Integer.valueOf(i));
                    if (i >= 3) {
                        vibeClientAIServiceImpl.LIZJ.add(str);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mark completed after ");
                        sbLIZ.append(i);
                        sbLIZ.append(" consecutive failures key=");
                        sbLIZ.append(str);
                        C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    vibeClientAIServiceImpl.LIZJ.add(str);
                    vibeClientAIServiceImpl.LIZLLL.remove(str);
                }
                vibeClientAIServiceImpl.LIZIZ.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        ((SeriesRefundRatingViewModel) awS138S1100000_24.l1).setState(new AwS138S1100000_24((Throwable) obj, awS138S1100000_24.s0, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        return C1573210r2d.LIZ((C1573210r2d) obj, awS138S1100000_24.s0, (SeriesCenterCenterScene) awS138S1100000_24.l1, null, null, null, 57);
    }

    public static final Object invoke$12(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        long j;
        C11JF c11jfLJIIL;
        SeriesRefundFragment seriesRefundFragment = (SeriesRefundFragment) awS138S1100000_24.l1;
        Context context = seriesRefundFragment.getContext();
        if (context != null) {
            DialogC848910XRx dialogC848910XRxLIZIZ = ((IDonationService) ServiceManager.get().getService(IDonationService.class)).LIZIZ(context);
            seriesRefundFragment.LLILZLL = dialogC848910XRxLIZIZ;
            if (dialogC848910XRxLIZIZ != null) {
                C0FNV.LIZJ(dialogC848910XRxLIZIZ);
            }
        }
        SeriesRefundFragment seriesRefundFragment2 = (SeriesRefundFragment) awS138S1100000_24.l1;
        String str = awS138S1100000_24.s0;
        int i = 0;
        int i2 = -1;
        for (Object obj2 : (ArrayList) seriesRefundFragment2.LLILLL) {
            int i3 = i + 1;
            if (i >= 0) {
                if (((CompoundButton) obj2).isChecked()) {
                    i2 = i;
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        SeriesRefundRatingViewModel seriesRefundRatingViewModel = (SeriesRefundRatingViewModel) seriesRefundFragment2.LLILLJJLI.getValue();
        Bundle arguments = seriesRefundFragment2.getArguments();
        if (arguments != null) {
            j = arguments.getLong("collection_id");
        } else {
            j = 0;
        }
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) PluggableExtentionKt.pluggableSpi$default(MiniDramaPaymentService.class, false, false, false, 14, null);
        if (miniDramaPaymentService != null && (c11jfLJIIL = miniDramaPaymentService.LJIIL(j, i2, str, new AwS568S0100000_24(seriesRefundRatingViewModel, 1831), new AwS138S1100000_24(seriesRefundRatingViewModel, str, 8), new AwS138S1100000_24(seriesRefundRatingViewModel, str, 10))) != null) {
            seriesRefundRatingViewModel.disposeOnClear(c11jfLJIIL);
        }
        ((SeriesRefundFragment) awS138S1100000_24.l1).NR("collection_refund_confirmation_submit");
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        Aweme aweme = (Aweme) obj;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme change ");
        sbLIZ.append(((C1605720rt4) awS138S1100000_24.l1).LIZJ.LIZ(aweme));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("SocPubStatusCache", strLIZIZ);
        C1605720rt4 c1605720rt4 = (C1605720rt4) awS138S1100000_24.l1;
        c1605720rt4.LIZLLL(awS138S1100000_24.s0, c1605720rt4.LIZJ.LIZ(aweme), EnumC1605740rt6.AWEME_CHANGE);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        if (!Intrinsics.LJFF(awS138S1100000_24.s0, ((C995680c18) obj).LLILLJJLI)) {
            ((FeedAvatarDefaultVM) awS138S1100000_24.l1).setState(new AwS74S1000000_24(awS138S1100000_24.s0, 23));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$15(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        String str;
        C1591100rVU c1591100rVU = C1591100rVU.LIZ;
        String strLIZLLL = ((InterfaceC1583870rJp) awS138S1100000_24.l1).LIZLLL();
        c1591100rVU.getClass();
        C1591100rVU.LIZ(strLIZLLL);
        String str2 = awS138S1100000_24.s0;
        switch (str2.hashCode()) {
            case -1965615457:
                if (str2.equals("Nearby")) {
                    str = "homepage_nearby";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
            case -1525083535:
                if (str2.equals("Following")) {
                    str = "homepage_follow";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
            case -1309089240:
                if (str2.equals("FRIENDS_FEED")) {
                    str = "homepage_friends";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
            case 2576150:
                if (str2.equals("Shop")) {
                    str = "shop_tab";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
            case 984907784:
                if (str2.equals("For You")) {
                    str = "homepage_hot";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
            case 1270713017:
                if (str2.equals("Popular")) {
                    str = "faq_page";
                    C20684815ws.LJIILLIIL("homepage_main_tab_name_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                }
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        List<C343280Dd0> list = ((C1581070rFJ) obj).LLILLJJLI.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.LJFF(((C343280Dd0) ListProtector.get(list, i)).LL.getAid(), awS138S1100000_24.s0)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((LiveDualFeedListViewModel) awS138S1100000_24.l1).listRemoveItemAt(((Number) ListProtector.get(arrayList, i2)).intValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        C1581070rFJ c1581070rFJ = (C1581070rFJ) obj;
        c1581070rFJ.getClass();
        if (!(C627260Oiy.LIZLLL(c1581070rFJ) instanceof C1623706Xj)) {
            ((LiveDualFeedListViewModel) awS138S1100000_24.l1).manualListRefresh();
            if (Intrinsics.LJFF(awS138S1100000_24.s0, "click_button_icon") || Intrinsics.LJFF(awS138S1100000_24.s0, "click_top_icon")) {
                ((LiveDualFeedListViewModel) awS138S1100000_24.l1).setState(AFwS264S0000000_24.get$arr$(562));
            }
            ((LiveDualFeedListViewModel) awS138S1100000_24.l1).wQ2(awS138S1100000_24.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        InterfaceC1588310rQz interfaceC1588310rQz;
        LinearLayoutManager linearLayoutManager;
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        String str = awS138S1100000_24.s0;
        int i = 0;
        if (list != null) {
            Iterator<InterfaceC1361290lWp> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1361290lWp next = it2.next();
                if ((next instanceof InterfaceC1361270lWn) && Intrinsics.LJFF(C1588110rQf.LIZ((InterfaceC1361270lWn) next), str)) {
                    if (i2 >= 0) {
                        FriendsV3SkylightAbility friendsV3SkylightAbility = (FriendsV3SkylightAbility) ((FriendsV3FeedListAssem) awS138S1100000_24.l1).LLJILLL.getValue();
                        if (friendsV3SkylightAbility != null) {
                            friendsV3SkylightAbility.yv0();
                        }
                        int measuredHeight = ((FriendsV3FeedListAssem) awS138S1100000_24.l1).Go().getMeasuredHeight() / 4;
                        if (measuredHeight >= 0) {
                            i = measuredHeight;
                        }
                        RecyclerView.LayoutManager layoutManager = ((FriendsV3FeedListAssem) awS138S1100000_24.l1).Go().getLayoutManager();
                        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                            linearLayoutManager.scrollToPositionWithOffset(i2, i);
                        }
                        FriendsV3FeedListAssem friendsV3FeedListAssem = (FriendsV3FeedListAssem) awS138S1100000_24.l1;
                        Object objFindViewHolderForAdapterPosition = friendsV3FeedListAssem.Go().findViewHolderForAdapterPosition(i2);
                        if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1588310rQz) && (interfaceC1588310rQz = (InterfaceC1588310rQz) objFindViewHolderForAdapterPosition) != null) {
                            InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz.LLIZLLLIL();
                            if (interfaceC1582750rI1LLIZLLLIL != null) {
                                interfaceC1582750rI1LLIZLLLIL.bk();
                            }
                            IFriendsV3PageStateAbility iFriendsV3PageStateAbility = (IFriendsV3PageStateAbility) friendsV3FeedListAssem.LLJJ.getValue();
                            if (iFriendsV3PageStateAbility != null) {
                                iFriendsV3PageStateAbility.fF1(interfaceC1588310rQz);
                            }
                            FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) friendsV3FeedListAssem.LLJJI.getValue();
                            if (friendsV3PlayerAbility != null) {
                                friendsV3PlayerAbility.KI2(interfaceC1588310rQz);
                            }
                            friendsV3FeedListAssem.LLJJIJI = interfaceC1588310rQz;
                            friendsV3FeedListAssem.LLJJIJIIJIL = interfaceC1582750rI1LLIZLLLIL;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        List<C1581170rFT> list = ((C1579330rCV) obj).LL.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.LJFF(((C1581170rFT) ListProtector.get(list, i)).LL.getAid(), awS138S1100000_24.s0)) {
                    ListProtector.add(arrayList, 0, Integer.valueOf(i));
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((SchoolPostsListViewModel) awS138S1100000_24.l1).listRemoveItemAt(((Number) it2.next()).intValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        int iIntValue;
        Map map = (Map) obj;
        String str = awS138S1100000_24.s0;
        HashMap<String, Integer> map2 = C1562360ql8.LJII;
        Integer num = map2.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map2.put(str, Integer.valueOf(iIntValue + 1));
        map.put("calculate_count", String.valueOf(iIntValue));
        Function1 function1 = (Function1) awS138S1100000_24.l1;
        if (function1 != null) {
            function1.invoke(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        C1623606Xi c1623606Xi = new C1623606Xi((PaidCollectionRefundResponse) awS138S1100000_24.l1);
        return C1611650s2d.LIZ((C1611650s2d) obj, Boolean.TRUE, true, ((PaidCollectionRefundResponse) awS138S1100000_24.l1).webPurchasePrice, c1623606Xi, awS138S1100000_24.s0, 12);
    }

    public static final Object invoke$8(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        ((SeriesRefundRatingViewModel) awS138S1100000_24.l1).setState(new AwS138S1100000_24((PaidCollectionRefundResponse) obj, awS138S1100000_24.s0, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS138S1100000_24 awS138S1100000_24, Object obj) {
        return C1611650s2d.LIZ((C1611650s2d) obj, Boolean.FALSE, false, null, new C491001vg((Throwable) awS138S1100000_24.l1), awS138S1100000_24.s0, 30);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS138S1100000_24(com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS138S1100000_24.<init>(com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(InterfaceC1583870rJp interfaceC1583870rJp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC1583870rJp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(C1605720rt4 c1605720rt4, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1605720rt4;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(SeriesRefundRatingViewModel seriesRefundRatingViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seriesRefundRatingViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(PaidCollectionRefundResponse paidCollectionRefundResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = paidCollectionRefundResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(StoryUserListPanelAssem storyUserListPanelAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = storyUserListPanelAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(VibeClientAIServiceImpl vibeClientAIServiceImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = vibeClientAIServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(String str, FeedAvatarDefaultVM feedAvatarDefaultVM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = feedAvatarDefaultVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(String str, FriendsV3FeedListAssem friendsV3FeedListAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = friendsV3FeedListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(String str, SeriesCenterCenterScene seriesCenterCenterScene, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = seriesCenterCenterScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(String str, SchoolPostsListViewModel schoolPostsListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = schoolPostsListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS138S1100000_24(String str, String str2, Function1<? super Map<String, String>, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(Throwable th, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = th;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS138S1100000_24(SeriesRefundFragment seriesRefundFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l1 = seriesRefundFragment;
        this.s0 = str;
    }
}
