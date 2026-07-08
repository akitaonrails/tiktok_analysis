package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C06VM;
import X.C094W;
import X.C098200Yq;
import X.C09AY;
import X.C0HTI;
import X.C0N4J;
import X.C0XIR;
import X.C1223104qT;
import X.C1351210lGZ;
import X.C13LP;
import X.C1569700qwy;
import X.C1575080r5e;
import X.C1575580r6S;
import X.C1576550r81;
import X.C1581170rFT;
import X.C1600780rl6;
import X.C1614710s7Z;
import X.C1616940sBA;
import X.C1623606Xi;
import X.C189200o6;
import X.C197039127h;
import X.C2097608Jq;
import X.C23112093u;
import X.C241200wU;
import X.C2536509wp;
import X.C419910GdJ;
import X.C491001vg;
import X.C585690My7;
import X.C731910SnN;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC1791930wjP;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.TitleBarLeftAssem;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.StoryGestureThreshold;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public class AwS673S0100000_24 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(C1575580r6S c1575580r6S, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1575580r6S;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(StoryDetailPageFragment storyDetailPageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = storyDetailPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(TitleBarLeftAssem titleBarLeftAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = titleBarLeftAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(PaidContentVideoPanel paidContentVideoPanel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paidContentVideoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(SeriesVipSubscriptionFragment seriesVipSubscriptionFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = seriesVipSubscriptionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(EnterStoryParam enterStoryParam, int i) {
        super(3);
        this.$t = i;
        this.l0 = enterStoryParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(CollabFeedInvitedCell collabFeedInvitedCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = collabFeedInvitedCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(SchoolGroupsListFragment schoolGroupsListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = schoolGroupsListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(SchoolPostsListFragment schoolPostsListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = schoolPostsListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS673S0100000_24(SchoolPostCell schoolPostCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = schoolPostCell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        String str;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = (VipSubscriptionDetailResponse) obj2;
        if (vipSubscriptionDetailResponse != null) {
            List<VipSubscriptionPurchaseOption> list = vipSubscriptionDetailResponse.subsOptions;
            ArrayList arrayList = new ArrayList();
            Iterator<VipSubscriptionPurchaseOption> it2 = list.iterator();
            while (it2.hasNext()) {
                VipSubscriptionPrice vipSubscriptionPrice = it2.next().price;
                if (vipSubscriptionPrice != null && (str = vipSubscriptionPrice.basePlanId) != null && str.length() > 0) {
                    arrayList.add(str);
                }
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList);
            if (!listLJJJJI.isEmpty()) {
                Map<String, String> map = ((C1614710s7Z) ((SeriesVipSubscriptionFragment) awS673S0100000_24.l0).SR().getState()).LLJ;
                if (!listLJJJJI.isEmpty()) {
                    Iterator it3 = listLJJJJI.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        String str2 = map.get(it3.next());
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str2.length() <= 0) {
                            SeriesVipSubscriptionFragment seriesVipSubscriptionFragment = (SeriesVipSubscriptionFragment) awS673S0100000_24.l0;
                            seriesVipSubscriptionFragment.getClass();
                            C1616940sBA c1616940sBA = C1616940sBA.LIZ;
                            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) seriesVipSubscriptionFragment.LLJJ.getValue();
                            String strLIZ = C2536509wp.LIZ();
                            List<VipSubscriptionPurchaseOption> list2 = vipSubscriptionDetailResponse.subsOptions;
                            AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(seriesVipSubscriptionFragment, 19);
                            c1616940sBA.getClass();
                            C1616940sBA.LIZIZ(interfaceC1791930wjP, strLIZ, list2, awS603S0100000_24);
                            break;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        StoryDetailPageFragment storyDetailPageFragment;
        int i;
        StoryDetailAbility storyDetailAbilityAS;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        StoryDetailPageFragment storyDetailPageFragment2 = (StoryDetailPageFragment) awS673S0100000_24.l0;
        storyDetailPageFragment2.LLJ = iIntValue;
        storyDetailPageFragment2.LLJI = iIntValue2;
        if (StoryDetailPageFragment.bS() && !zBooleanValue) {
            StoryDetailPageFragment storyDetailPageFragment3 = (StoryDetailPageFragment) awS673S0100000_24.l0;
            storyDetailPageFragment3.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = storyDetailPageFragment3.LLJILLL;
            if (j == 0) {
                storyDetailPageFragment3.LLJILJIL = 0.0f;
            } else {
                long j2 = jUptimeMillis - j;
                if (1 <= j2 && j2 < 201) {
                    storyDetailPageFragment3.LLJILJIL = (storyDetailPageFragment3.LLJILJIL * 0.5f) + ((((iIntValue2 - storyDetailPageFragment3.LLJILJILJ) * 1000.0f) / j2) * 0.5f);
                } else if (j2 > 200) {
                    storyDetailPageFragment3.LLJILJIL = 0.0f;
                }
            }
            storyDetailPageFragment3.LLJILJILJ = iIntValue2;
            storyDetailPageFragment3.LLJILLL = jUptimeMillis;
        }
        if (C1223104qT.LIZ() && ((iIntValue < 0 || iIntValue2 < 0) && (storyDetailAbilityAS = ((StoryDetailPageFragment) awS673S0100000_24.l0).aS()) != null)) {
            storyDetailAbilityAS.N20(-1);
        }
        int iMin = Math.min(Math.abs(((StoryDetailPageFragment) awS673S0100000_24.l0).LLJ), Math.abs(((StoryDetailPageFragment) awS673S0100000_24.l0).LLJIJIL));
        int iMax = Math.max(Math.abs(((StoryDetailPageFragment) awS673S0100000_24.l0).LLJ), Math.abs(((StoryDetailPageFragment) awS673S0100000_24.l0).LLJIJIL));
        if (((StoryGestureThreshold) C1600780rl6.LIZIZ.getValue()).y <= 0.0f && iMin <= (i = (storyDetailPageFragment = (StoryDetailPageFragment) awS673S0100000_24.l0).LLIZLLLIL) && i <= iMax && !zBooleanValue) {
            if (Build.VERSION.SDK_INT >= 29) {
                C1351210lGZ c1351210lGZ = (C1351210lGZ) storyDetailPageFragment.LLJJ.getValue();
                if (c1351210lGZ != null) {
                    c1351210lGZ.LIZ();
                }
            } else {
                C1351210lGZ c1351210lGZ2 = (C1351210lGZ) storyDetailPageFragment.LLJJ.getValue();
                if (c1351210lGZ2 != null) {
                    c1351210lGZ2.LIZIZ(85, 61);
                }
            }
        }
        StoryDetailPageFragment storyDetailPageFragment4 = (StoryDetailPageFragment) awS673S0100000_24.l0;
        int i2 = storyDetailPageFragment4.LLJ;
        int i3 = storyDetailPageFragment4.LLJIJIL;
        if (i2 < i3) {
            storyDetailPageFragment4.LLJJIJIIJIL = false;
            storyDetailPageFragment4.WR(false);
        } else if (storyDetailPageFragment4.LLJJIJIIJIL && i2 > i3) {
            storyDetailPageFragment4.WR(true);
        }
        ((StoryDetailPageFragment) awS673S0100000_24.l0).LLJIJIL = iIntValue;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS673S0100000_24 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            android.content.Context r5 = (android.content.Context) r5
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r2 = r7.intValue()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r0 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam) r0
            java.lang.String r3 = r0.getEnterFrom()
            int r1 = r3.hashCode()
            r0 = -1572049565(0xffffffffa24c6d63, float:-2.7705064E-18)
            if (r1 == r0) goto L8a
            r0 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r1 == r0) goto L7f
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 != r0) goto L95
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "fyp_live_cover_camera"
        L2f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "{\"request_from\":\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\",\"enter_from\":\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\"}"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "//live_multi_tab"
            com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r5, r0)
            r3.withParam(r6)
            java.lang.String r0 = "sourceParams"
            r3.withParam(r0, r1)
            java.lang.String r0 = "enable_story_tab"
            java.lang.String r1 = "true"
            r3.withParam(r0, r1)
            java.lang.String r0 = "from_independent_live_page"
            r3.withParam(r0, r1)
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r1 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam) r1
            boolean r0 = r1 instanceof android.os.Parcelable
            if (r0 != 0) goto L6f
            r1 = 0
        L6f:
            java.lang.String r0 = "story_param"
            r3.withParam(r0, r1)
            java.lang.String r0 = "key_choose_request_code"
            r3.withParam(r0, r2)
            r3.open()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "follow_top_cell"
            goto L2f
        L8a:
            java.lang.String r0 = "notification_page"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "inbox_top_cell"
            goto L2f
        L95:
            java.lang.String r3 = "default"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS673S0100000_24.invoke$10(kotlin.jvm.internal.AwS673S0100000_24, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        View view;
        C419910GdJ c419910GdJ = (C419910GdJ) obj2;
        String str = (String) obj3;
        TuxIconView tuxIconView = ((TitleBarLeftAssem) awS673S0100000_24.l0).LLJJIII;
        Object parent = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setTuxIcon(c419910GdJ);
        TuxIconView tuxIconView2 = ((TitleBarLeftAssem) awS673S0100000_24.l0).LLJJIII;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setContentDescription(str);
        TuxIconView tuxIconView3 = ((TitleBarLeftAssem) awS673S0100000_24.l0).LLJJIII;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        ViewParent parent2 = tuxIconView3.getParent();
        if (parent2 != null) {
            parent = parent2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setContentDescription(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        PaidContentVideoPanel paidContentVideoPanel;
        Long l;
        if (((List) obj2) != null && (!r4.isEmpty()) && obj3 != null && (l = (paidContentVideoPanel = (PaidContentVideoPanel) awS673S0100000_24.l0).F2) != null) {
            paidContentVideoPanel.R1(l.longValue());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        String string;
        String string2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String string3;
        String string4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        String string5;
        String string6;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        List<?> list = (List) obj3;
        String string7 = null;
        if (abstractC1623806Xk instanceof C491001vg) {
            LinearLayout linearLayout = ((SchoolGroupsListFragment) awS673S0100000_24.l0).LLILZLL;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout);
            }
            if (((C491001vg) abstractC1623806Xk).LIZ instanceof C094W) {
                SchoolGroupsListFragment schoolGroupsListFragment = (SchoolGroupsListFragment) awS673S0100000_24.l0;
                ImageView imageView = schoolGroupsListFragment.LLIZ;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams3.topMargin = ((Number) schoolGroupsListFragment.LLJILJILJ.getValue()).intValue();
                    }
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.nl;
                    imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
                }
                C197039127h c197039127h = schoolGroupsListFragment.LLJI;
                if (c197039127h != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h);
                    Context context = c197039127h.getContext();
                    if (context != null) {
                        string6 = context.getString(2131846928);
                    } else {
                        string6 = null;
                    }
                    c197039127h.setText(string6);
                    C786410Ut5.I7(new AkS91S0100000_24(schoolGroupsListFragment, 9), c197039127h);
                }
                TuxTextView tuxTextView = schoolGroupsListFragment.LLIZLLLIL;
                if (tuxTextView != null) {
                    Context context2 = schoolGroupsListFragment.getContext();
                    if (context2 != null) {
                        string5 = context2.getString(2131846852);
                    } else {
                        string5 = null;
                    }
                    tuxTextView.setText(string5);
                }
                TuxTextView tuxTextView2 = schoolGroupsListFragment.LLJ;
                if (tuxTextView2 != null) {
                    Context context3 = schoolGroupsListFragment.getContext();
                    if (context3 != null) {
                        string7 = context3.getString(2131828601);
                    }
                    tuxTextView2.setText(string7);
                }
            } else {
                SchoolGroupsListFragment schoolGroupsListFragment2 = (SchoolGroupsListFragment) awS673S0100000_24.l0;
                ImageView imageView2 = schoolGroupsListFragment2.LLIZ;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams2.topMargin = ((Number) schoolGroupsListFragment2.LLJILLL.getValue()).intValue();
                    }
                    C0HTI c0hti2 = new C0HTI();
                    c0hti2.LIZ = R.drawable.n_;
                    imageView2.setImageDrawable(c0hti2.LIZ(imageView2.getContext()));
                }
                C197039127h c197039127h2 = schoolGroupsListFragment2.LLJI;
                if (c197039127h2 != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h2);
                    Context context4 = c197039127h2.getContext();
                    if (context4 != null) {
                        string4 = context4.getString(2131828302);
                    } else {
                        string4 = null;
                    }
                    c197039127h2.setText(string4);
                    C786410Ut5.I7(new AkS91S0100000_24(schoolGroupsListFragment2, 7), c197039127h2);
                }
                TuxTextView tuxTextView3 = schoolGroupsListFragment2.LLIZLLLIL;
                if (tuxTextView3 != null) {
                    Context context5 = schoolGroupsListFragment2.getContext();
                    if (context5 != null) {
                        string3 = context5.getString(2131828303);
                    } else {
                        string3 = null;
                    }
                    tuxTextView3.setText(string3);
                }
                TuxTextView tuxTextView4 = schoolGroupsListFragment2.LLJ;
                if (tuxTextView4 != null) {
                    Context context6 = schoolGroupsListFragment2.getContext();
                    if (context6 != null) {
                        string7 = context6.getString(2131828301);
                    }
                    tuxTextView4.setText(string7);
                }
            }
        } else if ((abstractC1623806Xk instanceof C1623606Xi) && (list == null || list.isEmpty())) {
            LinearLayout linearLayout2 = ((SchoolGroupsListFragment) awS673S0100000_24.l0).LLILZLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout2);
            }
            SchoolGroupsListFragment schoolGroupsListFragment3 = (SchoolGroupsListFragment) awS673S0100000_24.l0;
            ImageView imageView3 = schoolGroupsListFragment3.LLIZ;
            if (imageView3 != null) {
                ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams.topMargin = ((Number) schoolGroupsListFragment3.LLJILLL.getValue()).intValue();
                }
                C0HTI c0hti3 = new C0HTI();
                c0hti3.LIZ = R.drawable.ng;
                imageView3.setImageDrawable(c0hti3.LIZ(imageView3.getContext()));
            }
            C197039127h c197039127h3 = schoolGroupsListFragment3.LLJI;
            if (c197039127h3 != null) {
                C786410Ut5.LJLLLLLL(0, c197039127h3);
                Context context7 = c197039127h3.getContext();
                if (context7 != null) {
                    string2 = context7.getString(2131828299);
                } else {
                    string2 = null;
                }
                c197039127h3.setText(string2);
                c197039127h3.LJJJJLI(true);
                c197039127h3.setTuxFont(102);
                C786410Ut5.I7(new AkS91S0100000_24(schoolGroupsListFragment3, 8), c197039127h3);
            }
            TuxTextView tuxTextView5 = schoolGroupsListFragment3.LLIZLLLIL;
            if (tuxTextView5 != null) {
                Context context8 = schoolGroupsListFragment3.getContext();
                if (context8 != null) {
                    string = context8.getString(2131828300);
                } else {
                    string = null;
                }
                tuxTextView5.setText(string);
            }
            TuxTextView tuxTextView6 = schoolGroupsListFragment3.LLJ;
            if (tuxTextView6 != null) {
                Context context9 = schoolGroupsListFragment3.getContext();
                if (context9 != null) {
                    string7 = context9.getString(2131828298);
                }
                tuxTextView6.setText(string7);
            }
        } else {
            LinearLayout linearLayout3 = ((SchoolGroupsListFragment) awS673S0100000_24.l0).LLILZLL;
            if (linearLayout3 != null) {
                C786410Ut5.LJLLLLLL(8, linearLayout3);
            }
        }
        ((SchoolGroupsListFragment) awS673S0100000_24.l0).VR(abstractC1623806Xk, list);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj2;
        List<?> list = (List) obj3;
        if (abstractC1623806Xk instanceof C491001vg) {
            LinearLayout linearLayout = ((SchoolPostsListFragment) awS673S0100000_24.l0).LLIZ;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SchoolPostsListFragment) awS673S0100000_24.l0).LLILZLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
            }
            Throwable th = ((C491001vg) abstractC1623806Xk).LIZ;
            if ((th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 3002634) {
                SchoolPostsListFragment schoolPostsListFragment = (SchoolPostsListFragment) awS673S0100000_24.l0;
                ImageView imageView = schoolPostsListFragment.LLIZLLLIL;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams4.topMargin = schoolPostsListFragment.PR();
                    }
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.n_;
                    imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
                }
                TuxTextView tuxTextView = schoolPostsListFragment.LLJ;
                if (tuxTextView != null) {
                    tuxTextView.setText(2131845009);
                }
                TuxTextView tuxTextView2 = schoolPostsListFragment.LLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(2131845007);
                }
                C197039127h c197039127h = schoolPostsListFragment.LLJIJIL;
                if (c197039127h != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h);
                    c197039127h.setText(2131845008);
                    C786410Ut5.I7(new AkS91S0100000_24(schoolPostsListFragment, 15), c197039127h);
                }
            } else if (th instanceof C1569700qwy) {
                SchoolPostsListFragment schoolPostsListFragment2 = (SchoolPostsListFragment) awS673S0100000_24.l0;
                ImageView imageView2 = schoolPostsListFragment2.LLIZLLLIL;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams3.topMargin = schoolPostsListFragment2.PR();
                    }
                    C0HTI c0hti2 = new C0HTI();
                    c0hti2.LIZ = R.drawable.nl;
                    imageView2.setImageDrawable(c0hti2.LIZ(imageView2.getContext()));
                }
                C197039127h c197039127h2 = schoolPostsListFragment2.LLJIJIL;
                if (c197039127h2 != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h2);
                    c197039127h2.setText(2131845011);
                    C786410Ut5.I7(new AkS91S0100000_24(schoolPostsListFragment2, 17), c197039127h2);
                }
                TuxTextView tuxTextView3 = schoolPostsListFragment2.LLJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(2131845012);
                }
                TuxTextView tuxTextView4 = schoolPostsListFragment2.LLJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(2131845010);
                }
            } else {
                SchoolPostsListFragment schoolPostsListFragment3 = (SchoolPostsListFragment) awS673S0100000_24.l0;
                ImageView imageView3 = schoolPostsListFragment3.LLIZLLLIL;
                if (imageView3 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        marginLayoutParams2.topMargin = schoolPostsListFragment3.PR();
                    }
                    C0HTI c0hti3 = new C0HTI();
                    c0hti3.LIZ = R.drawable.n_;
                    imageView3.setImageDrawable(c0hti3.LIZ(imageView3.getContext()));
                }
                C197039127h c197039127h3 = schoolPostsListFragment3.LLJIJIL;
                if (c197039127h3 != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h3);
                    c197039127h3.setText(2131828302);
                    C786410Ut5.I7(new AkS91S0100000_24(schoolPostsListFragment3, 16), c197039127h3);
                }
                TuxTextView tuxTextView5 = schoolPostsListFragment3.LLJ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(2131845006);
                }
                TuxTextView tuxTextView6 = schoolPostsListFragment3.LLJI;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(2131845004);
                }
            }
        } else if ((abstractC1623806Xk instanceof C1623606Xi) && (list == null || list.isEmpty())) {
            LinearLayout linearLayout2 = ((SchoolPostsListFragment) awS673S0100000_24.l0).LLIZ;
            if (linearLayout2 != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout2);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((SchoolPostsListFragment) awS673S0100000_24.l0).LLILZLL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv2);
            }
            SchoolPostsListFragment schoolPostsListFragment4 = (SchoolPostsListFragment) awS673S0100000_24.l0;
            ImageView imageView4 = schoolPostsListFragment4.LLIZLLLIL;
            if (imageView4 != null) {
                ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams.topMargin = schoolPostsListFragment4.PR();
                }
                C0HTI c0hti4 = new C0HTI();
                c0hti4.LIZ = R.drawable.n_;
                imageView4.setImageDrawable(c0hti4.LIZ(imageView4.getContext()));
            }
            TuxTextView tuxTextView7 = schoolPostsListFragment4.LLJ;
            if (tuxTextView7 != null) {
                tuxTextView7.setText(2131845014);
            }
            TuxTextView tuxTextView8 = schoolPostsListFragment4.LLJI;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(2131845013);
            }
            C197039127h c197039127h4 = schoolPostsListFragment4.LLJIJIL;
            if (c197039127h4 != null) {
                C786410Ut5.LLLLLLJ(c197039127h4, 8);
            }
        }
        ((SchoolPostsListFragment) awS673S0100000_24.l0).VR(abstractC1623806Xk, list);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        String aid;
        C06VM c06vm;
        Aweme aweme;
        C731910SnN c731910SnN = (C731910SnN) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C1581170rFT item = ((SchoolPostCell) awS673S0100000_24.l0).getItem();
        if (item != null && (aweme = item.LL) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, obj)) {
            SchoolPostCell schoolPostCell = (SchoolPostCell) awS673S0100000_24.l0;
            schoolPostCell.getClass();
            if (c731910SnN != null) {
                if (!c731910SnN.LIZJ) {
                    LinearLayout linearLayout = schoolPostCell.LLILZLL;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(4, linearLayout);
                    }
                } else {
                    LinearLayout linearLayout2 = schoolPostCell.LLILZLL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    TuxTextView tuxTextView = schoolPostCell.LLIZLLLIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(c731910SnN.LIZ);
                    }
                }
                C06VM c06vm2 = schoolPostCell.LLIZ;
                if (c06vm2 != null) {
                    c06vm2.setSelected(c731910SnN.LIZIZ);
                }
                if (zBooleanValue && (c06vm = schoolPostCell.LLIZ) != null) {
                    c06vm.LIZ();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS673S0100000_24 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS673S0100000_24.invoke$7(kotlin.jvm.internal.AwS673S0100000_24, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS673S0100000_24 awS673S0100000_24, Object obj, Object obj2, Object obj3) {
        Map<String, String> mapLJ;
        Object c098200Yq;
        List<C1576550r81> list = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (!list.isEmpty() && zBooleanValue) {
            C786410Ut5.LLF(0, ((CollabFeedInvitedCell) awS673S0100000_24.l0).L5());
            ((CollabFeedInvitedCell) awS673S0100000_24.l0).L5().getState().LJFF(null);
            ((CollabFeedInvitedCell) awS673S0100000_24.l0).L5().getState().LIZLLL(list, null);
            C1575080r5e c1575080r5e = ((CollabFeedInvitedCell) awS673S0100000_24.l0).N5().LL;
            if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            String str = mapLJ.get("enter_from");
            if (str == null) {
                str = "";
            }
            for (C1576550r81 c1576550r81 : list) {
                C241200wU c241200wU = C241200wU.LIZ;
                String uid = c1576550r81.LLILLJJLI.getUid();
                String aid = c1576550r81.LL.getAid();
                c241200wU.getClass();
                try {
                    C0N4J.LIZ("collab_panel_video_cover_show", new C585690My7(str, aid, uid));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS673S0100000_24 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            android.content.Context r5 = (android.content.Context) r5
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r2 = r7.intValue()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r0 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam) r0
            java.lang.String r3 = r0.getEnterFrom()
            int r1 = r3.hashCode()
            r0 = -1572049565(0xffffffffa24c6d63, float:-2.7705064E-18)
            if (r1 == r0) goto L8a
            r0 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r1 == r0) goto L7f
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 != r0) goto L95
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "fyp_live_cover_camera"
        L2f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "{\"request_from\":\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\",\"enter_from\":\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\"}"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "//live_multi_tab"
            com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r5, r0)
            r3.withParam(r6)
            java.lang.String r0 = "sourceParams"
            r3.withParam(r0, r1)
            java.lang.String r0 = "enable_story_tab"
            java.lang.String r1 = "true"
            r3.withParam(r0, r1)
            java.lang.String r0 = "from_independent_live_page"
            r3.withParam(r0, r1)
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r1 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam) r1
            boolean r0 = r1 instanceof android.os.Parcelable
            if (r0 != 0) goto L6f
            r1 = 0
        L6f:
            java.lang.String r0 = "story_param"
            r3.withParam(r0, r1)
            java.lang.String r0 = "key_choose_request_code"
            r3.withParam(r0, r2)
            r3.open()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "follow_top_cell"
            goto L2f
        L8a:
            java.lang.String r0 = "notification_page"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "inbox_top_cell"
            goto L2f
        L95:
            java.lang.String r3 = "default"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS673S0100000_24.invoke$9(kotlin.jvm.internal.AwS673S0100000_24, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
