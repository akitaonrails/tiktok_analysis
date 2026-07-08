package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C05YD;
import X.C07XO;
import X.C09AY;
import X.C0HQD;
import X.C0HRH;
import X.C0HYH;
import X.C0QSJ;
import X.C0WZX;
import X.C1372505Yt;
import X.C1440005kM;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1761940vx2;
import X.C19EG;
import X.C19ME;
import X.C1A1F;
import X.C1BWL;
import X.C2204961BRm;
import X.C23250099c;
import X.C289850BXr;
import X.C291001Au;
import X.C337180DJs;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C424040Gjy;
import X.C426750GoL;
import X.C438740HIi;
import X.C443120HZe;
import X.C443300HZw;
import X.C443440HaA;
import X.C457420Hwi;
import X.C461620I8i;
import X.C629480OmY;
import X.C631370Opb;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1762510vxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AAListenerS317S0100000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.FriendsV3CommentButtonAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$stopAudioOnPauseConfig$1$1;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicFanSpotlightBlockAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchVideoDurationAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchVideoDurationCountdownAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.sub.abroll.StoryAbRollComponent;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingVerticalAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AFwS289S0000000_6 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(62);
    public final int $t;

    public static AFwS289S0000000_6 get$arr$(int i) {
        AFwS289S0000000_6 aFwS289S0000000_6 = (AFwS289S0000000_6) arr$.get(i);
        if (aFwS289S0000000_6 != null) {
            return aFwS289S0000000_6;
        }
        arr$.compareAndSet(i, null, new AFwS289S0000000_6(i));
        return (AFwS289S0000000_6) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS289S0000000_6(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$10(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        Boolean bool;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (bool = (Boolean) c291001Au.LIZ()) != null) {
            bool.booleanValue();
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if (fragmentLJI != null) {
                C629480OmY.LJI(fragmentLJI);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        RecyclerView recyclerView = (RecyclerView) obj2;
        IDMResourceManagementService iDMResourceManagementService = (IDMResourceManagementService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementService.class);
        if (iDMResourceManagementService != null) {
            iDMResourceManagementService.LJ(recyclerView);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        if (((Number) C289850BXr.LIZ.getValue()).intValue() == 2) {
            IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIIJ(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        IMCameraBridgeApi.LIZ.getClass();
        IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
        if (iMCameraBridgeApiLIZ != null) {
            iMCameraBridgeApiLIZ.LJJIJIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        Object ability;
        RecyclerView recyclerView = (RecyclerView) obj2;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), ChatRoomScope.class);
        Object obj3 = null;
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(MessageListCLSTracker.class);
        } else {
            ability = null;
        }
        if (ability instanceof MessageListCLSTracker) {
            obj3 = ability;
        }
        MessageListCLSTracker messageListCLSTracker = (MessageListCLSTracker) obj3;
        if (messageListCLSTracker != null) {
            messageListCLSTracker.tG(recyclerView);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AbstractC738140SxQ) obj).getLifecycle().addObserver(new CommonMessageListConfigKt$stopAudioOnPauseConfig$1$1());
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C457420Hwi.LJIIIIZZ((UIAssem) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        MusicFanSpotlightBlockAssem musicFanSpotlightBlockAssem = (MusicFanSpotlightBlockAssem) obj;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = musicFanSpotlightBlockAssem.LLJLILLLLZIIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS106S0100000_6(musicFanSpotlightBlockAssem, 84), 100L);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        Integer num;
        View view;
        SearchVideoDurationAssem searchVideoDurationAssem = (SearchVideoDurationAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (num = (Integer) c291001Au.LIZ) != null) {
            if (num.intValue() == 5) {
                View view2 = searchVideoDurationAssem.LLJJJJJIL;
                if (view2 != null) {
                    C339190DRl.LIZIZ(view2);
                }
            } else if (num.intValue() == 1 && (view = searchVideoDurationAssem.LLJJJJJIL) != null) {
                C339190DRl.LIZLLL(view);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        TuxTextView tuxTextView;
        SearchVideoDurationCountdownAssem searchVideoDurationCountdownAssem = (SearchVideoDurationCountdownAssem) obj;
        String str = (String) obj2;
        if (str != null && str.length() != 0 && (tuxTextView = searchVideoDurationCountdownAssem.LLJJL) != null) {
            tuxTextView.setText(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        Integer num;
        TuxTextView tuxTextView;
        SearchVideoDurationCountdownAssem searchVideoDurationCountdownAssem = (SearchVideoDurationCountdownAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (num = (Integer) c291001Au.LIZ) != null && num.intValue() == 4 && (tuxTextView = searchVideoDurationCountdownAssem.LLJJL) != null) {
            HandlerHook.viewPost(tuxTextView, new ARunnableS106S0100000_6(searchVideoDurationCountdownAssem, 107));
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$22(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C19ME c19me;
        C19ME c19me2;
        View view = (View) obj;
        View view2 = (View) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (c19me != null) {
            c19me.startToStart = -1;
            c19me.startToEnd = view2.getId();
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
            return null;
        }
        c19me2.endToEnd = -1;
        c19me2.endToStart = view.getId();
        return c19me2;
    }

    public static final Object invoke$24(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C19ME c19me;
        C19ME c19me2;
        View view = (View) obj;
        View view2 = (View) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (c19me != null) {
            c19me.endToEnd = -1;
            c19me.endToStart = view2.getId();
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
            return null;
        }
        c19me2.startToStart = -1;
        c19me2.startToEnd = view.getId();
        return c19me2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$25(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                C786410Ut5.T4(uIAssem.LJJIJL(), 0.2f);
            } else {
                C786410Ut5.T4(uIAssem.LJJIJL(), 1.0f);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) throws Throwable {
        StoryAbRollComponent storyAbRollComponent = (StoryAbRollComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && ((Number) c291001Au.LIZ).intValue() == ((VideoItemParams) C631370Opb.LIZ(storyAbRollComponent)).currentPosition) {
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(storyAbRollComponent, 720);
            if (storyAbRollComponent.Jp() != null) {
                awS550S0100000_6.invoke();
            } else {
                HandlerHook.viewPost(storyAbRollComponent.getContentView(), new ARunnableS75S0200000_6(storyAbRollComponent, awS550S0100000_6, 55));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        TakoOnboardingVerticalAssem takoOnboardingVerticalAssem = (TakoOnboardingVerticalAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            int i = ((C443440HaA) C631370Opb.LIZ(takoOnboardingVerticalAssem)).LLILLJJLI;
            View contentView = takoOnboardingVerticalAssem.getContentView();
            C786410Ut5.T4(contentView, 0.0f);
            C786410Ut5.Ob(contentView, 0.85f);
            C786410Ut5.pc(contentView, 0.85f);
            C786410Ut5.ed(contentView, 30.0f);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(takoOnboardingVerticalAssem), null, null, new C443300HZw(i, takoOnboardingVerticalAssem, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C438740HIi c438740HIi = new C438740HIi();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return null;
        }
        Application applicationLIZ = C1BWL.LIZ();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(applicationLIZ), R.layout.d1e, null, false);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.nq0);
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(22 / C418440Gaw.LIZIZ(1));
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZLLL = 1;
        viewTd.setBackground(c384050F3z.LIZ(applicationLIZ));
        viewTd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = viewTd.getMeasuredWidth();
        int measuredHeight = viewTd.getMeasuredHeight();
        float f = iIntValue / 750.0f;
        C786410Ut5.Ob(viewTd, f);
        C786410Ut5.pc(viewTd, f);
        viewTd.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        viewTd.draw(new Canvas(bitmapCreateBitmap));
        c438740HIi.LIZ = bitmapCreateBitmap;
        return c438740HIi.LIZ;
    }

    public static final Object invoke$29(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        int iLJJL;
        AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem = (AIGCOverLabelBannerAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
            if (iTakoService != null) {
                iLJJL = iTakoService.LJJL();
            } else {
                iLJJL = 0;
            }
            FeedBottomBannerView feedBottomBannerView = aIGCOverLabelBannerAssem.LLJLLIL;
            if (feedBottomBannerView != null) {
                feedBottomBannerView.setPaddingRelative(feedBottomBannerView.getPaddingStart(), feedBottomBannerView.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + iLJJL, feedBottomBannerView.getPaddingBottom());
            }
        } else {
            FeedBottomBannerView feedBottomBannerView2 = aIGCOverLabelBannerAssem.LLJLLIL;
            if (feedBottomBannerView2 != null) {
                feedBottomBannerView2.setPaddingRelative(feedBottomBannerView2.getPaddingStart(), feedBottomBannerView2.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), feedBottomBannerView2.getPaddingBottom());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return new AnimatorSet();
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        int i;
        UIAssem uIAssem = (UIAssem) obj;
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            View viewLJJIJL = uIAssem.LJJIJL();
            if (zBooleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        int iLIZIZ;
        FriendsV3CommentButtonAssem friendsV3CommentButtonAssem = (FriendsV3CommentButtonAssem) obj;
        String str = (String) obj2;
        if (((Boolean) friendsV3CommentButtonAssem.LLJLILLLLZIIL.getValue()).booleanValue()) {
            if (str != null) {
                if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                } else if (str.length() <= 2) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                } else {
                    iLIZIZ = -2;
                }
                View contentView = friendsV3CommentButtonAssem.getContentView();
                ViewGroup.LayoutParams layoutParams = friendsV3CommentButtonAssem.getContentView().getLayoutParams();
                layoutParams.width = iLIZIZ;
                C786410Ut5.W5(contentView, layoutParams);
                if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                    C337180DJs.LIZ((View) friendsV3CommentButtonAssem.LLJL.getValue());
                } else {
                    ((TextView) friendsV3CommentButtonAssem.LLJL.getValue()).setText(str);
                    C337180DJs.LIZJ((View) friendsV3CommentButtonAssem.LLJL.getValue());
                }
            }
        } else {
            ((TextView) friendsV3CommentButtonAssem.LLJL.getValue()).setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        float f;
        float f2 = 0.0f;
        if (((Boolean) obj2).booleanValue()) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) View.ALPHA, f, f2));
        if (!C07XO.LIZ) {
            arrayList.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) View.SCALE_X, f, f2));
            arrayList.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) View.SCALE_Y, f, f2));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$45(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        Set set = (Set) obj;
        C443120HZe c443120HZe = (C443120HZe) obj2;
        if (((C05YD) c443120HZe.getThird()).getValue() instanceof C1372505Yt) {
            return new C0HRH(0);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj3 : set) {
            if (((Number) ((C443120HZe) obj3).getFirst()).intValue() == ((Number) c443120HZe.getFirst()).intValue()) {
                linkedHashSet.add(obj3);
            }
        }
        return new C0HQD(linkedHashSet);
    }

    public static final Object invoke$47(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return new AnimatorSet();
    }

    public static final Object invoke$48(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return new AnimatorSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$49(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C2204961BRm.LLJJJ(c19egLIZ, 2097, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYovK2SZ1Ov9PAxMHavLl9kHqqqQyXibIdNQBMtbS8OeWxNNpZf+ui2tZ01FO77pERcB7AseG/sk=", null));
                c19egLIZ.finish();
            }
            C1440005kM.LIZ(new C0HYH());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        if (obj2 != null && !C1A1F.LIZIZ(((VideoItemParams) C631370Opb.LIZ(reusedUIAssem)).mEventType)) {
            C337180DJs.LIZ(reusedUIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$51(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        AnimatorSet animatorSet;
        MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2 = (MUFQuickDMBoxAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (!C1A1F.LIZIZ(((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxAssemV2)).mEventType) && ((Boolean) c291001Au.LIZ).booleanValue() && mUFQuickDMBoxAssemV2.LJJIJL().getVisibility() != 8 && ((animatorSet = mUFQuickDMBoxAssemV2.LLLFF) == null || !animatorSet.isRunning())) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mUFQuickDMBoxAssemV2.LJJIJL(), (Property<View, Float>) View.ALPHA, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.setStartDelay(200L);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(MUFQuickDMBoxAssemV2.LLLII, 0);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZJ());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(mUFQuickDMBoxAssemV2, 133));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
            animatorSet2.addListener(new AAListenerS317S0100000_6(mUFQuickDMBoxAssemV2, 59));
            animatorSet2.addListener(new AAListenerS317S0100000_6(mUFQuickDMBoxAssemV2, 60));
            mUFQuickDMBoxAssemV2.LLLFF = animatorSet2;
            animatorSet2.start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        if (obj2 != null && !C1A1F.LIZIZ(((VideoItemParams) C631370Opb.LIZ(reusedUIAssem)).mEventType)) {
            C337180DJs.LIZ(reusedUIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        if (obj2 != null && !C1A1F.LIZIZ(((VideoItemParams) C631370Opb.LIZ(reusedUIAssem)).mEventType)) {
            C337180DJs.LIZ(reusedUIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$54(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        AnimatorSet animatorSet;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (!C1A1F.LIZIZ(((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxAssem)).mEventType) && ((Boolean) c291001Au.LIZ).booleanValue() && mUFQuickDMBoxAssem.LJJIJL().getVisibility() != 8 && ((animatorSet = mUFQuickDMBoxAssem.LLLFFI) == null || !animatorSet.isRunning())) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mUFQuickDMBoxAssem.LJJIJL(), (Property<View, Float>) View.ALPHA, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.setStartDelay(200L);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(MUFQuickDMBoxAssem.LLLIILIL, 0);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZJ());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(mUFQuickDMBoxAssem, 132));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
            animatorSet2.addListener(new AAListenerS317S0100000_6(mUFQuickDMBoxAssem, 57));
            animatorSet2.addListener(new AAListenerS317S0100000_6(mUFQuickDMBoxAssem, 58));
            mUFQuickDMBoxAssem.LLLFFI = animatorSet2;
            animatorSet2.start();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$55(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$57(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$58(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C424040Gjy c424040Gjy;
        PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem = (PdpCarouselInnerIndicatorAssem) obj;
        if (obj2 != null && (c424040Gjy = pdpCarouselInnerIndicatorAssem.LLJL) != null) {
            c424040Gjy.setSelectedIndex(((C1761940vx2) pdpCarouselInnerIndicatorAssem.sp().getState()).LLILZLL);
            InterfaceC1762510vxx interfaceC1762510vxxOp = pdpCarouselInnerIndicatorAssem.op();
            if (interfaceC1762510vxxOp != null) {
                interfaceC1762510vxxOp.gk(new AwS620S0100000_6(pdpCarouselInnerIndicatorAssem, 166));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C457420Hwi.LJIIIIZZ((UIAssem) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        int marginStart;
        int i;
        int marginEnd;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = (View) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        Integer numValueOf = Integer.valueOf(marginStart);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        C426750GoL.LJIIIZ(view, numValueOf, numValueOf2, Integer.valueOf(marginEnd), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
        AnimatorSet animatorSet = new AnimatorSet();
        float fLIZIZ = C418440Gaw.LIZIZ(4);
        float fLIZIZ2 = C418440Gaw.LIZIZ(12);
        if (!zBooleanValue) {
            fLIZIZ = C418440Gaw.LIZIZ(12);
            fLIZIZ2 = C418440Gaw.LIZIZ(2);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fLIZIZ, fLIZIZ2);
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (!zBooleanValue) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", f2, f);
        float f4 = 0.8f;
        if (zBooleanValue) {
            f4 = 1.0f;
            f3 = 0.8f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 190));
        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat);
        return animatorSet;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$61(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        C457420Hwi.LJIIIIZZ((UIAssem) obj);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$9(AFwS289S0000000_6 aFwS289S0000000_6, Object obj, Object obj2) {
        return Unit.LIZ;
    }
}
