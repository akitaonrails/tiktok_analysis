package kotlin.jvm.internal;

import X.AbstractC19994813Le;
import X.C09AY;
import X.C0N6Z;
import X.C0SZ8;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1022820ciu;
import X.C11EV;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1483410ohn;
import X.C1A2W;
import X.C1AF0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2190281Anq;
import X.C2191131ApD;
import X.C2191501Apo;
import X.C2191511App;
import X.C2245741Cv6;
import X.C2245821CvE;
import X.C2487409ou;
import X.C291001Au;
import X.C520680KbS;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC584570MwJ;
import X.EnumC584610MwN;
import X.InterfaceC1546650qLn;
import X.InterfaceC1603020roi;
import X.InterfaceC2217701Bqy;
import X.InterfaceC2217711Bqz;
import X.InterfaceC583650Mup;
import Y.ACListenerS168S0100000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS85S0200000_16;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.component.progress.IVideoPlayProgressAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AFwS323S0000000_34 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(45);
    public final int $t;

    public static AFwS323S0000000_34 get$arr$(int i) {
        AFwS323S0000000_34 aFwS323S0000000_34 = (AFwS323S0000000_34) arr$.get(i);
        if (aFwS323S0000000_34 != null) {
            return aFwS323S0000000_34;
        }
        arr$.compareAndSet(i, null, new AFwS323S0000000_34(i));
        return (AFwS323S0000000_34) arr$.get(i);
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS323S0000000_34(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        int width;
        C11EV c11ev = (C11EV) obj;
        GifEmoji gifEmoji = ((GifEmojiState) obj2).getGifEmoji();
        c11ev.getClass();
        UrlModel thumbnail = gifEmoji.getThumbnail();
        if (thumbnail != null) {
            C844470XAv.LIZ.getClass();
            int iLIZJ = (int) C12ES.LIZJ(60.0f, C844470XAv.LIZ());
            if (thumbnail.getWidth() != 0 && thumbnail.getHeight() != 0) {
                Math.min(C814420VxA.LIZIZ((thumbnail.getWidth() / thumbnail.getHeight()) * iLIZJ), (int) C12ES.LIZJ(107.0f, C844470XAv.LIZ()));
                throw null;
            }
            throw null;
        }
        Emoji emoji = new Emoji();
        UrlModel origin = ((GifEmoji) c11ev.LLILLJJLI).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        emoji.setAnimateUrl(origin);
        UrlModel thumbnail2 = ((GifEmoji) c11ev.LLILLJJLI).getThumbnail();
        if (thumbnail2 == null) {
            thumbnail2 = new UrlModel();
        }
        emoji.setStaticUrl(thumbnail2);
        emoji.setId(((GifEmoji) c11ev.LLILLJJLI).getImageId());
        UrlModel origin2 = ((GifEmoji) c11ev.LLILLJJLI).getOrigin();
        int height = 0;
        if (origin2 != null) {
            width = origin2.getWidth();
        } else {
            width = 0;
        }
        emoji.setWidth(width);
        UrlModel origin3 = ((GifEmoji) c11ev.LLILLJJLI).getOrigin();
        if (origin3 != null) {
            height = origin3.getHeight();
        }
        emoji.setHeight(height);
        emoji.setStickerType(((GifEmoji) c11ev.LLILLJJLI).getStickerType());
        emoji.setAnimateType("gif");
        emoji.setDisplayName("GIF");
        emoji.setLogPb(((GifEmoji) c11ev.LLILLJJLI).getLogPb());
        c11ev.getAdapterPosition();
        throw null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJLL((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJI((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIIIIZZ();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        return Boolean.valueOf(((InterfaceC2217701Bqy) obj).LJJLIIIJLLLLLLLZ((SparkActivity) obj2));
    }

    public static final Object invoke$17(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJJ((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJIJIL();
        return Boolean.FALSE;
    }

    public static final Object invoke$19(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJJJLL((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((Runnable) obj2).run();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJJJJ((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIIZILJ();
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJLIIIJJIZ((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJLIIIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIJJLI();
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJLIIIJJI((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJJJZI((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJJIL((InterfaceC1546650qLn) obj2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        Object obj3;
        Activity activityLIZ;
        View viewFindViewById;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null) {
            C724270Sb3 c724270Sb3 = midAdCellComponent.LLJI;
            EnumC584570MwJ enumC584570MwJXo1 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            Aweme awemeM199clone = ((VideoItemParams) obj3).getAweme().m199clone();
            if ((C2245741Cv6.LIZIZ(awemeM199clone) && midAdCellComponent.Ep(awemeM199clone)) || C2245741Cv6.LIZJ(awemeM199clone)) {
                midAdCellComponent.Tp().vQ2(awemeM199clone);
            }
            if (C2245741Cv6.LIZIZ(awemeM199clone)) {
                midAdCellComponent.LLLILZ.LJIIIIZZ = false;
                midAdCellComponent.Vp();
            }
            IMidAdAbility iMidAdAbilityQp = midAdCellComponent.Qp();
            if (iMidAdAbilityQp != null) {
                iMidAdAbilityQp.r3(awemeM199clone);
            }
            if (midAdCellComponent.Jp() && C2245741Cv6.LIZIZ(midAdCellComponent.Tp().LL)) {
                IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) midAdCellComponent.LLLFZ.getValue();
                if (iAutoAScrollAbility != null) {
                    enumC584570MwJXo1 = iAutoAScrollAbility.xo1();
                }
                if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START && !midAdCellComponent.LLLIZZ) {
                    midAdCellComponent.LLLIZZ = true;
                }
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) midAdCellComponent.Fp().getLayoutParams();
                IAutoAScrollAbility iAutoAScrollAbility2 = (IAutoAScrollAbility) midAdCellComponent.LLLFZ.getValue();
                if (iAutoAScrollAbility2 != null) {
                    enumC584570MwJXo1 = iAutoAScrollAbility2.xo1();
                }
                if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START && !midAdCellComponent.LLLIZZ) {
                    Context context = midAdCellComponent.getContext();
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (viewFindViewById = activityLIZ.findViewById(R.id.bei)) != null) {
                        layoutParams.topMargin += viewFindViewById.getHeight() + ((int) C12ES.LIZJ(8.0f, midAdCellComponent.getContext()));
                    }
                    midAdCellComponent.LLLIZZ = true;
                }
                C786410Ut5.X5(layoutParams, midAdCellComponent.Fp());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$29(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            midAdCellComponent.LLLILZ.LIZLLL = zBooleanValue;
            midAdCellComponent.aq(zBooleanValue, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJI();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        String aid;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (!((Boolean) c291001Au.LIZ).booleanValue()) {
                midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
                midAdCellComponent.Tp().resetState();
                if (C2245741Cv6.LIZIZ(midAdCellComponent.Tp().LL)) {
                    HashMap<String, Aweme> map = C0N6Z.LIZ;
                    Aweme aweme = midAdCellComponent.Tp().LL;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    C0N6Z.LJ(aid);
                }
            } else {
                midAdCellComponent.getClass();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$31(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && midAdCellComponent.Ep(midAdCellComponent.Tp().LL)) {
            midAdCellComponent.Tp().yQ2(((Number) c291001Au.LIZ).longValue(), midAdCellComponent.LLLILZ, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$32(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            midAdCellComponent.LLLILZ.LJI = ((Boolean) c291001Au.LIZ).booleanValue();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        Long lXQ2;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null) {
            MidAdVM midAdVMTp = midAdCellComponent.Tp();
            if (C2245741Cv6.LIZIZ(midAdVMTp.LL) && (lXQ2 = MidAdVM.xQ2(midAdVMTp.LL)) != null) {
                long jLongValue = lXQ2.longValue() - Mp4ScreenVideoLoadTimeout.CONTROL;
                Long lHQ2 = MidAdVM.HQ2(midAdVMTp.LL);
                if (lHQ2 != null) {
                    long jLongValue2 = lHQ2.longValue();
                    long currentPosition = C1483410ohn.LJLJJI().getCurrentPosition();
                    if (jLongValue2 <= currentPosition && currentPosition < jLongValue) {
                        midAdVMTp.LLIZLLLIL = false;
                    } else if (currentPosition < jLongValue2) {
                        midAdVMTp.LLIZ = false;
                        midAdVMTp.LLIZLLLIL = false;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        String aid;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null && !midAdCellComponent.Up()) {
            midAdCellComponent.Xp(midAdCellComponent.Tp().LL, false);
            Aweme aweme = midAdCellComponent.Tp().LL;
            if (aweme != null) {
                String str = midAdCellComponent.LLJLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onMidRollAdUnselectedEvent] aweme=");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(", replaceAweme=");
                Aweme aweme2 = midAdCellComponent.Tp().LLILLJJLI;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (C2245741Cv6.LIZJ(aweme) && !midAdCellComponent.LLLJIL) {
                    midAdCellComponent.Wp(aweme, 0L);
                } else if (C2245741Cv6.LIZIZ(aweme)) {
                    HashMap<String, Aweme> map = C0N6Z.LIZ;
                    C0N6Z.LJ(aweme.getAid());
                    C0N6Z.LJIIIZ = false;
                    String aid2 = aweme.getAid();
                    if (aid2 != null) {
                        C0N6Z.LJFF.put(aid2, Boolean.TRUE);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$35(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null && (!midAdCellComponent.Jp() || C2245741Cv6.LIZIZ(midAdCellComponent.Tp().LL))) {
            C1022620cia.LIZ(midAdCellComponent.LLJLLIL, "[hideCountDown]");
            midAdCellComponent.Ip().setText(C786410Ut5.j4(midAdCellComponent.Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{"5"}, 1)));
            midAdCellComponent.Gp().setText(C786410Ut5.j4(midAdCellComponent.Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{"5"}, 1)));
            midAdCellComponent.dq(8);
            midAdCellComponent.LLLILZJ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        Long lXQ2;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (C2245741Cv6.LIZIZ(midAdCellComponent.Tp().LL) && midAdCellComponent.Ep(midAdCellComponent.Tp().LL)) {
            C1022620cia.LJ(midAdCellComponent.LLJLLIL, "[onRenderFirstFrameEvent]");
            final MidAdVM midAdVMTp = midAdCellComponent.Tp();
            IVideoPlayProgressAbility iVideoPlayProgressAbility = (IVideoPlayProgressAbility) midAdCellComponent.LLLII.getValue();
            final C2245821CvE c2245821CvE = midAdCellComponent.LLLILZ;
            if (midAdVMTp.wQ2() && iVideoPlayProgressAbility != null && !(!midAdVMTp.LLJJI.isEmpty()) && (lXQ2 = MidAdVM.xQ2(midAdVMTp.LL)) != null) {
                final long jLongValue = lXQ2.longValue();
                Long lHQ2 = MidAdVM.HQ2(midAdVMTp.LL);
                if (lHQ2 != null) {
                    long jLongValue2 = lHQ2.longValue();
                    long j = jLongValue - Mp4ScreenVideoLoadTimeout.CONTROL;
                    String str = MidAdVM.LLJJIII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[registerProgressObserver] insertTime=");
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(", requestTime=");
                    sbLIZ.append(jLongValue2);
                    sbLIZ.append(", countDownTime=");
                    sbLIZ.append(j);
                    C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    C1A2W c1a2w = new C1A2W() { // from class: X.1CvC
                        @Override // X.C1A2W
                        public final void LIZ(long j2) {
                            if (midAdVMTp.zQ2()) {
                                return;
                            }
                            C1022620cia.LJ(MidAdVM.LLJJIII, "[onProgressChangeNew][Once] reach request time");
                            midAdVMTp.DQ2(c2245821CvE);
                        }
                    };
                    C1A2W c1a2w2 = new C1A2W() { // from class: X.1CvB
                        @Override // X.C1A2W
                        public final void LIZ(long j2) {
                            if (midAdVMTp.zQ2()) {
                                return;
                            }
                            C1022620cia.LJ(MidAdVM.LLJJIII, "[onProgressChangeNew][Once] reach countdown time");
                            midAdVMTp.BQ2(c2245821CvE);
                        }
                    };
                    C1A2W c1a2w3 = new C1A2W() { // from class: X.1Cv9
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.C1A2W
                        public final void LIZ(long j2) {
                            if (j2 >= jLongValue || midAdVMTp.zQ2()) {
                                return;
                            }
                            midAdVMTp.AQ2(c2245821CvE, j2, jLongValue, (C2245781CvA) midAdVMTp.getState());
                        }
                    };
                    C1A2W c1a2w4 = new C1A2W() { // from class: X.1Cv8
                        @Override // X.C1A2W
                        public final void LIZ(long j2) {
                            if (midAdVMTp.zQ2() || C2245741Cv6.LIZ(midAdVMTp.LL)) {
                                return;
                            }
                            C1022620cia.LJ(MidAdVM.LLJJIII, "[onProgressChangeNew][Once] reach insert time");
                            midAdVMTp.CQ2(c2245821CvE, j2, jLongValue);
                        }
                    };
                    iVideoPlayProgressAbility.iD1(jLongValue2, true, c1a2w);
                    MidAdVM.FQ2(midAdVMTp.LLJJI, jLongValue2, c1a2w);
                    iVideoPlayProgressAbility.iD1(j, true, c1a2w2);
                    MidAdVM.FQ2(midAdVMTp.LLJJI, j, c1a2w2);
                    iVideoPlayProgressAbility.iD1(j, false, c1a2w3);
                    MidAdVM.FQ2(midAdVMTp.LLJJI, j, c1a2w3);
                    iVideoPlayProgressAbility.iD1(jLongValue, true, c1a2w4);
                    MidAdVM.FQ2(midAdVMTp.LLJJI, jLongValue, c1a2w4);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        Aweme aweme;
        String aid;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null && ((aweme = midAdCellComponent.Tp().LL) == null || !C1017070cZd.LLIIL(aweme))) {
            if (C2245741Cv6.LIZ(midAdCellComponent.Tp().LL)) {
                C1022620cia.LIZ(midAdCellComponent.LLJLLIL, "[onPlayCompleted] insert Post-Roll Ads");
                midAdCellComponent.Tp().yQ2(C1483410ohn.LJLJJI().getDuration(), midAdCellComponent.LLLILZ, true);
            }
            if (C2245741Cv6.LIZIZ(midAdCellComponent.Tp().LL)) {
                HashMap<String, Aweme> map = C0N6Z.LIZ;
                Aweme aweme2 = midAdCellComponent.Tp().LL;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                C0N6Z.LJ(aid);
            }
            MidAdVM midAdVMTp = midAdCellComponent.Tp();
            C2245821CvE c2245821CvE = midAdCellComponent.LLLILZ;
            midAdVMTp.getClass();
            C2487409ou.LIZJ(new ARunnableS85S0200000_16(midAdVMTp, c2245821CvE, 64));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$38(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        AwemeRawAd awemeRawAd;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (((Number) c291001Au.LIZ).intValue() >= 0 && midAdCellComponent.Ep(midAdCellComponent.Tp().LL) && midAdCellComponent.LLLIL) {
            if (!midAdCellComponent.LLLILZJ) {
                midAdCellComponent.LLLILZJ = true;
                midAdCellComponent.dq(0);
                Aweme aweme = midAdCellComponent.Tp().LLILLJJLI;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("count_down", "refer");
                c1022820ciuLIZLLL.LJII();
            }
            midAdCellComponent.Ip().setText(C786410Ut5.j4(midAdCellComponent.Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{String.valueOf(((Number) c291001Au.LIZ).intValue())}, 1)));
            midAdCellComponent.Gp().setText(C786410Ut5.j4(midAdCellComponent.Ip().getContext().getString(2131834548), Arrays.copyOf(new Object[]{String.valueOf(((Number) c291001Au.LIZ).intValue())}, 1)));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$39(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        C0SZ8 c0sz8LJLIL;
        String aid;
        IMidAdAbility iMidAdAbilityQp;
        InterfaceC583650Mup interfaceC583650Mup;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        int iIntValue;
        ViewGroup rootView;
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        String aid2;
        String aid3;
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue() && midAdCellComponent.LLLILZJ && midAdCellComponent.LLLIL && midAdCellComponent.Ep(midAdCellComponent.Tp().LL)) {
            C1483410ohn.LJLJJI().LIZ();
            boolean zLIZ = true;
            try {
                SettingsManager.LIZLLL().getClass();
                zLIZ = SettingsManager.LIZ("ad_post_roll_player_fix_setting_1", true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            String aid4 = null;
            if (zLIZ) {
                C1483410ohn.LJLJJI().LJJIL(null);
            }
            IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class);
            if (iAdReRankServiceManagerService != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                Aweme aweme = midAdCellComponent.Tp().LL;
                if (aweme != null) {
                    aid2 = aweme.getAid();
                } else {
                    aid2 = null;
                }
                Aweme aweme2 = midAdCellComponent.Tp().LLILLJJLI;
                if (aweme2 != null) {
                    aid3 = aweme2.getAid();
                } else {
                    aid3 = null;
                }
                interfaceC1603020roiLIZIZ.c5(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), aid2, aid3);
            }
            Context context = midAdCellComponent.getContext();
            if (context != null) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.a_e);
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                frameLayout.setBackgroundColor(iIntValue);
                IMidAdAbility iMidAdAbilityQp2 = midAdCellComponent.Qp();
                if (iMidAdAbilityQp2 != null && (rootView = iMidAdAbilityQp2.getRootView()) != null) {
                    rootView.addView(frameLayout);
                }
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) midAdCellComponent.LLLI.getValue();
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
                c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL();
            } else {
                c0sz8LJLIL = null;
            }
            if ((c0sz8LJLIL instanceof InterfaceC583650Mup) && (interfaceC583650Mup = (InterfaceC583650Mup) c0sz8LJLIL) != null) {
                interfaceC583650Mup.Ai1(false);
            }
            VideoSeekBarMaskView videoSeekBarMaskView = midAdCellComponent.LLLIILIL;
            if (videoSeekBarMaskView != null) {
                videoSeekBarMaskView.setDownInRect(false);
            }
            IClearModePanelComponent iClearModePanelComponent = (IClearModePanelComponent) midAdCellComponent.LLLFFI.getValue();
            if (iClearModePanelComponent != null) {
                iClearModePanelComponent.Rs0();
            }
            if (!midAdCellComponent.Up() && (iMidAdAbilityQp = midAdCellComponent.Qp()) != null) {
                iMidAdAbilityQp.LJJIII();
            }
            HandlerHook.viewPostDelay(midAdCellComponent.LJJIJL(), new ARunnableS134S0100000_34(midAdCellComponent, 79), 50L);
            HashMap<String, Aweme> map = C0N6Z.LIZ;
            Aweme aweme3 = midAdCellComponent.Tp().LL;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            C0N6Z.LJ(aid);
            Aweme aweme4 = midAdCellComponent.Tp().LL;
            if (aweme4 != null) {
                aid4 = aweme4.getAid();
            }
            Aweme aweme5 = midAdCellComponent.Tp().LLILLJJLI;
            if (aid4 != null && aweme5 != null) {
                C0N6Z.LIZIZ.put(aid4, aweme5);
                C0N6Z.LJI.put(aid4, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJIIJZLJL((SparkActivity) obj2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$40(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            if (midAdCellComponent.Up()) {
                C1022620cia.LIZ(midAdCellComponent.LLJLLIL, "[enterReplaceOrigin]");
                Aweme aweme = midAdCellComponent.Tp().LL;
                if (aweme != null && C2245741Cv6.LIZJ(aweme)) {
                    midAdCellComponent.Wp(aweme, 0L);
                }
            } else {
                IMidAdAbility iMidAdAbilityQp = midAdCellComponent.Qp();
                if (iMidAdAbilityQp != null) {
                    iMidAdAbilityQp.LJJIII();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        if (obj2 != null) {
            midAdCellComponent.aq(true, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$42(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Integer num;
        final boolean z;
        final ViewGroup rootView;
        final FrameLayout frameLayout;
        final MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au.LIZ != 0 && (aweme = midAdCellComponent.Tp().LL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int skipAdTime = awemeRawAd.getSkipAdTime();
            Integer num2 = (Integer) c291001Au.LIZ;
            int i = skipAdTime / LSPassThroughRecordSizeConfig.DEFAULT;
            if (((num2 != null && num2.intValue() == i) || ((num = (Integer) c291001Au.LIZ) != null && num.intValue() == -1 && skipAdTime == -1)) && !midAdCellComponent.LLLILZLLLI) {
                midAdCellComponent.LLLILZLLLI = true;
                Aweme aweme2 = midAdCellComponent.Tp().LL;
                if (aweme2 != null && C1017070cZd.LLIIL(aweme2)) {
                    midAdCellComponent.Bp();
                } else {
                    Integer num3 = (Integer) c291001Au.LIZ;
                    if (num3 != null && num3.intValue() == -1 && skipAdTime == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    IMidAdAbility iMidAdAbilityQp = midAdCellComponent.Qp();
                    if (iMidAdAbilityQp != null && (rootView = iMidAdAbilityQp.getRootView()) != null && (frameLayout = (FrameLayout) C520680KbS.LIZ(R.id.a_e, rootView)) != null) {
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), C1308910kAL.LIZJ(R.attr.e1, frameLayout.getContext()), 0);
                        valueAnimatorOfObject.setDuration(300L);
                        valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(frameLayout, 158));
                        valueAnimatorOfObject.addListener(new AnimatorListenerAdapter() { // from class: X.1CvO
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                C786410Ut5.LJJJLZIJ(frameLayout, rootView);
                                if (z) {
                                    midAdCellComponent.Bp();
                                }
                            }
                        });
                        valueAnimatorOfObject.start();
                    }
                }
            }
            Integer num4 = (Integer) c291001Au.LIZ;
            if (num4 != null && num4.intValue() == 0) {
                midAdCellComponent.Ip().setText(midAdCellComponent.Fp().getContext().getString(2131834546));
                midAdCellComponent.Bp();
                C786410Ut5.K7(midAdCellComponent.Fp(), new ACListenerS168S0100000_34(midAdCellComponent, 40));
            } else {
                Integer num5 = (Integer) c291001Au.LIZ;
                if (num5 == null || num5.intValue() != -1) {
                    midAdCellComponent.Ip().setText(C786410Ut5.j4(midAdCellComponent.Ip().getContext().getString(2131834547), Arrays.copyOf(new Object[]{String.valueOf(c291001Au.LIZ)}, 1)));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$43(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        MidAdCellComponent midAdCellComponent = (MidAdCellComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            midAdCellComponent.LLLILZ.LIZIZ = zBooleanValue;
            midAdCellComponent.aq(zBooleanValue, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        C2191511App c2191511App = (C2191511App) obj;
        Pair pair = (Pair) obj2;
        if (c2191511App != null) {
            C2191501Apo.LIZ.getClass();
            C2191501Apo.LIZ(c2191511App);
        } else if (pair != null) {
            C2191501Apo.LIZ.getClass();
            if (((AbstractC19994813Le) C2191501Apo.LJFF.getValue()).nextFloat() <= C2191131ApD.LIZ().trackerSample) {
                C2191501Apo.LIZIZ().LIZ(pair.getFirst(), "error_code");
                Object second = pair.getSecond();
                if (second != null) {
                    C2191501Apo.LIZIZ().LIZ(second, "error_reason");
                }
                C2190281Anq c2190281AnqLIZIZ = C2191501Apo.LIZIZ();
                c2190281AnqLIZIZ.getClass();
                C20684815ws.LJIJ("measure_download_image_speed", new JSONObject(C2097608Jq.LJIIZILJ(c2190281AnqLIZIZ.LIZIZ())));
                c2190281AnqLIZIZ.LIZIZ().clear();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJIJIIJI((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJIJIIJIL((InterfaceC1546650qLn) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJLJLI((SparkActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS323S0000000_34 aFwS323S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIIIZ();
        return Unit.LIZ;
    }
}
