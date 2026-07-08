package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AbstractC813200VvC;
import X.C031C;
import X.C03DZ;
import X.C09AY;
import X.C0CNO;
import X.C0SKG;
import X.C0UTG;
import X.C0UTJ;
import X.C1276604z6;
import X.C1397620mTQ;
import X.C13LP;
import X.C13LQ;
import X.C13XS;
import X.C15MM;
import X.C15TH;
import X.C163E;
import X.C1697810uHb;
import X.C16CO;
import X.C16CR;
import X.C1749280vcc;
import X.C1749400vco;
import X.C19290510dT;
import X.C19323610io;
import X.C198H;
import X.C199Y;
import X.C19EG;
import X.C20359314lT;
import X.C20359414lU;
import X.C20361214lm;
import X.C20365514mT;
import X.C20365614mU;
import X.C20374514nv;
import X.C20375014o0;
import X.C20382814pG;
import X.C20409114tV;
import X.C20441214yg;
import X.C20496915Ih;
import X.C20510715Np;
import X.C20511315Nv;
import X.C20600815jK;
import X.C20614415lW;
import X.C20629915o1;
import X.C20671715ul;
import X.C2188811AlT;
import X.C259800zU;
import X.C294250Bg7;
import X.C500260Jjc;
import X.C510160Jza;
import X.C7740030o;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C936903lP;
import X.C978360bZC;
import X.EnumC1749360vck;
import X.EnumC20615215le;
import X.InterfaceC1041760dDS;
import X.InterfaceC1106030et7;
import X.InterfaceC1891350zJl;
import X.InterfaceC20354714kj;
import X.InterfaceC20375514o5;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS95S0300000_31;
import android.app.Activity;
import android.content.Context;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.playentity.BackgroundEffectEntity;
import com.bytedance.android.live.effect.playentity.EnhanceEntity;
import com.bytedance.android.live.effect.playentity.MusicEntity;
import com.bytedance.android.live.effect.playentity.PropEffectEntity;
import com.bytedance.android.live.effect.playentity.SoundEffectsEntity;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.AIWallpaperEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.ManageGuestEntity;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.interaction.playentity.DrawGuessEntity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.business.sticker.assem.CommonHorizontalContainerAssem;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image.SeaSkuImageSpecCell;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.aweme.web.jsbridge.EditPageMethod;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class AwS240S0300000_31 extends C09AY implements Function1 {
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
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        if (C294250Bg7.LIZ() == 0 || !C0SKG.LIZ.enableAtomicDedup || ((AtomicBoolean) awS240S0300000_31.l0).compareAndSet(false, true)) {
            ((C163E) awS240S0300000_31.l1).LJIIJ((Aweme) awS240S0300000_31.l2, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        Boolean bool = (Boolean) obj;
        if (C294250Bg7.LIZ() == 0 || !C0SKG.LIZ.enableAtomicDedup || ((AtomicBoolean) awS240S0300000_31.l0).compareAndSet(false, true)) {
            ((C163E) awS240S0300000_31.l1).LJIIJ((Aweme) awS240S0300000_31.l2, bool.booleanValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((MusicEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((MusicEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJ((PropEffectEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((PropEffectEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((SoundEffectsEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((SoundEffectsEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        C500260Jjc.LJJLIIIJJI(0L, new AwS275S0300000_31((StickerEffectEntity) awS240S0300000_31.l0, (StickerEffectEntity) awS240S0300000_31.l1, (C20361214lm) awS240S0300000_31.l2, (Function0<? extends InterfaceC20354714kj>) 7));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJI((StickerEffectEntity) awS240S0300000_31.l0, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((Function0) awS240S0300000_31.l2).invoke(), null, null, 0L, 56);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((StickerEffectEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((Function0) awS240S0300000_31.l2).invoke(), true);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((VoiceEffectsEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Assembler) obj).RQ2((C19EG) awS240S0300000_31.l0, new AwS397S0200000_31((FrameLayout) awS240S0300000_31.l1, (CommonHorizontalContainerAssem) awS240S0300000_31.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((VoiceEffectsEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((AIWallpaperEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((AIWallpaperEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((ManageGuestEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((ManageGuestEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((DrawGuessEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((DrawGuessEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        int i;
        int i2;
        boolean z;
        int i3;
        Integer numValueOf;
        Integer numValueOf2;
        EnumC1749360vck enumC1749360vck;
        List<String> list = ((C936903lP) obj).LL;
        C031C c031c = (C031C) awS240S0300000_31.l0;
        C20510715Np c20510715Np = c031c.LLIZLLLIL;
        ((SeaSkuImageSpecCell) awS240S0300000_31.l1).LLJJIJIIJIL = c20510715Np.LIZ;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(c031c.LLILZLL, list);
        List list2 = (List) awS240S0300000_31.l2;
        SeaSkuImageSpecCell seaSkuImageSpecCell = (SeaSkuImageSpecCell) awS240S0300000_31.l1;
        C031C c031c2 = (C031C) awS240S0300000_31.l0;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj2 : list2) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                SalePropValue salePropValue = (SalePropValue) obj2;
                String str = salePropValue.propValueId;
                if (str != null) {
                    String str2 = salePropValue.propValue;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int i6 = C1749400vco.LIZ;
                    if (C1749400vco.LIZ(i4, seaSkuImageSpecCell.LLJJIJIIJIL)) {
                        i = c20510715Np.LJII;
                        i2 = c20510715Np.LJIILIIL;
                    } else {
                        i = c20510715Np.LJI;
                        i2 = c20510715Np.LJIILJJIL;
                    }
                    boolean zBQ2 = seaSkuImageSpecCell.T5().BQ2(c031c2.LLILZLL, str, list);
                    if (i4 == c20510715Np.LJIIIIZZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i7 = c031c2.LLILZLL;
                    boolean z2 = seaSkuImageSpecCell.T5().LL;
                    Image image = salePropValue.image;
                    SalePropTag salePropTag = salePropValue.salePropTag;
                    boolean zLJFF = Intrinsics.LJFF(objLJJJLZIJ, str);
                    int i8 = c20510715Np.LIZJ;
                    if (z) {
                        i2 = c20510715Np.LJIIIZ;
                    }
                    if (z) {
                        i3 = c20510715Np.LJIIJJI;
                        numValueOf = Integer.valueOf(i);
                        numValueOf2 = Integer.valueOf(c20510715Np.LJIIL);
                    } else {
                        i3 = i;
                        numValueOf = null;
                        numValueOf2 = null;
                    }
                    if (seaSkuImageSpecCell.LLJJIJIIJIL) {
                        enumC1749360vck = EnumC1749360vck.PERCENT;
                    } else {
                        enumC1749360vck = EnumC1749360vck.SPLITTHREE;
                    }
                    arrayList.add(new C20511315Nv(i7, i4, z2, str, str2, image, salePropTag, zBQ2, zLJFF, i8, i2, i3, numValueOf, numValueOf2, enumC1749360vck.getValue(), seaSkuImageSpecCell.LLJJI));
                }
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SeaSkuImageSpecCell) awS240S0300000_31.l1).LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return null;
        }
        state.LJIILL(arrayList, null);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) obj;
        C15TH c15th = (C15TH) awS240S0300000_31.l0;
        if (c15th == C15TH.LOAD_MORE) {
            ((ExploreTopicGeneralFeedListViewModel) awS240S0300000_31.l1).KQ2(exploreTopicAwemeListResponse, c15th, (ExploreFeedRequestOverride) awS240S0300000_31.l2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((NetworkStandardUIServiceImpl) awS240S0300000_31.l2).markTipsEnable((C1749280vcc) awS240S0300000_31.l1, true);
        Function0 function0 = (Function0) awS240S0300000_31.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Assembler) obj).RQ2((C19EG) awS240S0300000_31.l0, new AwS397S0200000_31((FrameLayout) awS240S0300000_31.l1, (CommonHorizontalContainerAssem) awS240S0300000_31.l2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Boolean) obj).booleanValue();
        C0CNO.LIZLLL(0L, new AwS275S0300000_31((MusicModel) awS240S0300000_31.l0, (MusicModel) awS240S0300000_31.l1, (VerticalMusicViewV2) awS240S0300000_31.l2, (Map<String, String>) 30));
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((EditPageMethod) awS240S0300000_31.l0).mContextRef.get(), "//openVideoEdit");
        smartRouteBuildRoute.withParam("media_path", ((JSONObject) awS240S0300000_31.l1).optString("media_path"));
        smartRouteBuildRoute.withParam("upload_type", ((JSONObject) awS240S0300000_31.l1).optString("upload_type"));
        smartRouteBuildRoute.withParam("assets", ((JSONObject) awS240S0300000_31.l1).optString("assets"));
        smartRouteBuildRoute.withParam("shoot_way", ((JSONObject) awS240S0300000_31.l1).optString("shoot_way"));
        smartRouteBuildRoute.withParam("anchors", ((JSONObject) awS240S0300000_31.l1).optString("anchors"));
        smartRouteBuildRoute.withParam("challenge_id", ((JSONObject) awS240S0300000_31.l1).optString("challenge_id"));
        smartRouteBuildRoute.withParam("challenge_name", ((JSONObject) awS240S0300000_31.l1).optString("challenge_name"));
        smartRouteBuildRoute.withParam("creation_id", ((JSONObject) awS240S0300000_31.l1).optString("creation_id"));
        smartRouteBuildRoute.withParam("extra", ((JSONObject) awS240S0300000_31.l1).optString("extra"));
        smartRouteBuildRoute.withParam("from_jsb", true);
        smartRouteBuildRoute.withParam("creative_initial_model", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, new ECommerceCreativeVideoParams(((JSONObject) awS240S0300000_31.l1).optString("oec_music_id")), null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null))));
        if (obj != null) {
            smartRouteBuildRoute.withParam("add_your_record_param", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), obj));
        }
        smartRouteBuildRoute.open();
        InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) awS240S0300000_31.l2;
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.onSuccess(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        InterfaceC20630715o9 interfaceC20630715o9;
        FragmentManager fragmentManager;
        AbstractC813200VvC abstractC813200VvC = (AbstractC813200VvC) obj;
        ((ConcurrentHashMap) awS240S0300000_31.l0).remove(abstractC813200VvC);
        InterfaceC214897198d interfaceC214897198d = (InterfaceC214897198d) awS240S0300000_31.l1;
        if (interfaceC214897198d != null) {
            C198H c198hLIZLLL = C20629915o1.LIZLLL(interfaceC214897198d);
            if ((c198hLIZLLL instanceof InterfaceC20630715o9) && (interfaceC20630715o9 = (InterfaceC20630715o9) c198hLIZLLL) != null && (fragmentManager = interfaceC20630715o9.getFragmentManager()) != null) {
                fragmentManager.LLIILZL(abstractC813200VvC);
            }
        }
        ((FragmentManager) awS240S0300000_31.l2).LLIILZL(abstractC813200VvC);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        C20496915Ih c20496915Ih = (C20496915Ih) obj;
        if (c20496915Ih.LIZ != Integer.MAX_VALUE) {
            ((LiveData) awS240S0300000_31.l0).removeObservers((LifecycleOwner) awS240S0300000_31.l1);
            ((Function2) awS240S0300000_31.l2).invoke(Integer.valueOf(c20496915Ih.LIZ), c20496915Ih.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$34(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        boolean z;
        boolean z2;
        Function1 function1;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!((C16CO) awS240S0300000_31.l0).mViewDestroyed) {
            C16CO c16co = (C16CO) awS240S0300000_31.l0;
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) awS240S0300000_31.l1;
            C16CR c16cr = c16co.LLJJLIIIJLLLLLLLZ;
            boolean z3 = true;
            if (c16cr != null && c16cr.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (tikTokMediaModel.selectIndex < 0 && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            TextView textView = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
            if (textView != null) {
                textView.setBackgroundResource(R.drawable.aab);
            }
            int i = 2131834989;
            String string = null;
            if (z2) {
                TextView textView2 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                if (textView2 != null) {
                    C786410Ut5.S4(0.34f, textView2);
                }
                TextView textView3 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                if (textView3 != null) {
                    textView3.setSelected(false);
                }
                TextView textView4 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                if (textView4 != null) {
                    textView4.setText("");
                }
                TextView textView5 = ((C16CO) awS240S0300000_31.l0).LLJJJJ;
                if (textView5 != null) {
                    C786410Ut5.S4(0.34f, textView5);
                }
                TextView textView6 = ((C16CO) awS240S0300000_31.l0).LLJJJJ;
                if (textView6 != null) {
                    Context context = textView6.getContext();
                    if (context != null) {
                        string = context.getString(2131834989);
                    }
                    textView6.setText(string);
                }
                C03DZ.LIZ(((C16CO) awS240S0300000_31.l0).LLJLIL);
                if (!zBooleanValue && (function1 = (Function1) awS240S0300000_31.l2) != null) {
                    function1.invoke(Boolean.FALSE);
                }
            } else {
                TextView textView7 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                if (textView7 != null) {
                    C786410Ut5.S4(1.0f, textView7);
                }
                TextView textView8 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                if (textView8 != null) {
                    if (((TikTokMediaModel) awS240S0300000_31.l1).selectIndex < 0) {
                        z3 = false;
                    }
                    textView8.setSelected(z3);
                }
                int i2 = ((TikTokMediaModel) awS240S0300000_31.l1).selectIndex;
                if (i2 >= 0) {
                    TextView textView9 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                    if (textView9 != null) {
                        textView9.setText(String.valueOf(i2));
                    }
                } else {
                    TextView textView10 = ((C16CO) awS240S0300000_31.l0).LLJJIJIL;
                    if (textView10 != null) {
                        textView10.setText("");
                    }
                }
                C16CO c16co2 = (C16CO) awS240S0300000_31.l0;
                TextView textView11 = c16co2.LLJJJJ;
                if (textView11 != null) {
                    Activity activity = c16co2.mActivity;
                    if (activity != null) {
                        if (((TikTokMediaModel) awS240S0300000_31.l1).selectIndex >= 0) {
                            i = 2131834990;
                        }
                        string = activity.getString(i);
                    }
                    textView11.setText(string);
                }
                TextView textView12 = ((C16CO) awS240S0300000_31.l0).LLJJJJ;
                if (textView12 != null) {
                    C786410Ut5.S4(1.0f, textView12);
                }
                View view = ((C16CO) awS240S0300000_31.l0).LLJJJJJIL;
                if (view != null) {
                    C786410Ut5.T4(view, 1.0f);
                }
                C03DZ.LIZJ(((C16CO) awS240S0300000_31.l0).LLJLIL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        AbstractC738140SxQ abstractC738140SxQLIZIZ;
        Assembler assembler = (Assembler) obj;
        if (C13LQ.LJIILJJIL(0, (int[]) awS240S0300000_31.l0)) {
            ((C20671715ul) awS240S0300000_31.l1).LJJIIZ(assembler, (InnerPushMessage) awS240S0300000_31.l2, true, (int[]) awS240S0300000_31.l0);
        } else {
            AssemSupervisor assemSupervisorLJJIJIL = ((C20671715ul) awS240S0300000_31.l1).LJJIJIL();
            if (assemSupervisorLJJIJIL != null && (abstractC738140SxQLIZIZ = C1276604z6.LIZIZ(assemSupervisorLJJIJIL, 0)) != null) {
                C20671715ul c20671715ul = (C20671715ul) awS240S0300000_31.l1;
                C19290510dT.LIZLLL("InnerPushAssemWindow", "[updateView] existed custom global assem, remove it");
                AssemSupervisor assemSupervisorLJJIJIL2 = c20671715ul.LJJIJIL();
                if (assemSupervisorLJJIJIL2 != null) {
                    C1276604z6.LJ(assemSupervisorLJJIJIL2, null, abstractC738140SxQLIZIZ);
                }
                c20671715ul.LJJIJLIJ();
                c20671715ul.LJJIJIIJI(true);
            }
            ((C20671715ul) awS240S0300000_31.l1).LJJIIJZLJL(assembler, (InnerPushMessage) awS240S0300000_31.l2, true, (int[]) awS240S0300000_31.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$36(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        Condition condition = (Condition) obj;
        String strLJIIJJI = C20359314lT.LJIIJJI(condition);
        T t = ((C259800zU) awS240S0300000_31.l0).element;
        if (t != 0) {
            ((C20361214lm) t).LJII = strLJIIJJI;
            BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = ((PlaybookEditorDialog) awS240S0300000_31.l1).BS();
            if (basePlaybookEditorViewModelBS != null) {
                basePlaybookEditorViewModelBS.LLILZ.LJFF((C20359414lU) awS240S0300000_31.l2, (C20361214lm) ((C259800zU) awS240S0300000_31.l0).element);
            }
            C20359414lU c20359414lU = (C20359414lU) awS240S0300000_31.l2;
            if (c20359414lU.LJ != null) {
                c20359414lU.LJ = null;
                BasePlaybookEditorViewModel basePlaybookEditorViewModelBS2 = ((PlaybookEditorDialog) awS240S0300000_31.l1).BS();
                if (basePlaybookEditorViewModelBS2 != null) {
                    basePlaybookEditorViewModelBS2.CQ2((C20359414lU) awS240S0300000_31.l2);
                }
            }
        } else {
            ((C20359414lU) awS240S0300000_31.l2).LJ = strLJIIJJI;
            BasePlaybookEditorViewModel basePlaybookEditorViewModelBS3 = ((PlaybookEditorDialog) awS240S0300000_31.l1).BS();
            if (basePlaybookEditorViewModelBS3 != null) {
                basePlaybookEditorViewModelBS3.CQ2((C20359414lU) awS240S0300000_31.l2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConditionChange, condition is ");
        sbLIZ.append(condition);
        C20441214yg.LJIIIZ("Editor_PlaybookEditorDialog", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            InterfaceC1106030et7.S8.LIZJ(Boolean.FALSE);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJ("edit_playbook", "create_confirm", ((PlaybookEditorDialog) awS240S0300000_31.l0).JS(), ((PlaybookEditorDialog) awS240S0300000_31.l0).HS(), ((PlaybookEditorDialog) awS240S0300000_31.l0).ES(), null, null);
            PlaybookEditorDialog.FS((C510160Jza) awS240S0300000_31.l1, (BasePlaybookEditorViewModel) awS240S0300000_31.l2, (PlaybookEditorDialog) awS240S0300000_31.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            PlaybookEditorDialog.GS((C510160Jza) awS240S0300000_31.l1, (BasePlaybookEditorViewModel) awS240S0300000_31.l2, (PlaybookEditorDialog) awS240S0300000_31.l0);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$39(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((ArrayList) ((ExploreRecommendTopicListComponent) awS240S0300000_31.l0).LLLJ).remove(obj);
        C786410Ut5.LJJJLZIJ((ImageView) awS240S0300000_31.l2, (ViewGroup) awS240S0300000_31.l1);
        ((ExploreRecommendTopicListComponent) awS240S0300000_31.l0).tq();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release((CancellationSignal) awS240S0300000_31.l1, new AwS432S0200000_31((Executor) awS240S0300000_31.l2, (Executor) awS240S0300000_31.l0, (C15MM<Void, C13XS>) 4));
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849194, new AwS397S0200000_31((Function0) awS240S0300000_31.l0, (Function0<Unit>) awS240S0300000_31.l1, (Function0<Unit>) 104));
        c1397620mTQ.LJII(2131849193, new AwS610S0100000_31((Function0) awS240S0300000_31.l2, (Function0<Unit>) 489));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LIZJ(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LJII(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LIZJ(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LIZJ(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LJII(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        View view;
        Object parent = ((C20375014o0) awS240S0300000_31.l0).itemView.getParent();
        if (parent instanceof RecyclerView) {
            view = (View) parent;
        } else {
            view = null;
        }
        C20374514nv.LIZIZ(view);
        InterfaceC20375514o5 interfaceC20375514o5 = ((C20375014o0) awS240S0300000_31.l0).LL;
        if (interfaceC20375514o5 != null) {
            interfaceC20375514o5.LIZJ(((C20365614mU) awS240S0300000_31.l1).LIZ, ((C20365514mT) awS240S0300000_31.l2).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(((C20614415lW) obj).LLILZLL.LIZ.LIZ);
        if (linkedHashMap.get(((User) awS240S0300000_31.l0).getUid()) != EnumC20615215le.SENT) {
            linkedHashMap.put(((User) awS240S0300000_31.l0).getUid(), (EnumC20615215le) awS240S0300000_31.l1);
            ((StoryUserListContainerViewModel) awS240S0300000_31.l2).setState(new AwS610S0100000_31(linkedHashMap, (Map<String, EnumC20615215le>) 525));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        return C19323610io.LJJIJL((C19323610io) obj, null, new ACListenerS95S0300000_31((PhotoTranslationPanelFragment) awS240S0300000_31.l0, (PushSettings) awS240S0300000_31.l1, (String[]) awS240S0300000_31.l2, 2), false, null, null, false, false, null, false, false, null, false, false, 16777211);
    }

    public static final Object invoke$49(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        Boolean boolValueOf;
        Playbook playbookLJIILJJIL;
        Context context = (Context) obj;
        if (!Intrinsics.LJFF(((C20409114tV) awS240S0300000_31.l0).LJI, "live_endpage")) {
            return null;
        }
        C0UTJ c0utj = (C0UTJ) awS240S0300000_31.l1;
        if (c0utj != null && (playbookLJIILJJIL = c0utj.LJIILJJIL()) != null) {
            boolValueOf = Boolean.valueOf(playbookLJIILJJIL.LIZ());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            return null;
        }
        C20409114tV c20409114tV = (C20409114tV) awS240S0300000_31.l0;
        return new C0UTG(context, c20409114tV.LJI, c20409114tV.LJFF, (C20382814pG) awS240S0300000_31.l2, null, true);
    }

    public static final Object invoke$5(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJ((BackgroundEffectEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJI((BackgroundEffectEntity) awS240S0300000_31.l0, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, null, null, 0L, 56);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((BackgroundEffectEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        PlayEntityUtilKt.LJ((EnhanceEntity) awS240S0300000_31.l0, ((Number) obj).intValue(), (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS240S0300000_31 awS240S0300000_31, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((EnhanceEntity) awS240S0300000_31.l0, 2, (C20361214lm) awS240S0300000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS240S0300000_31.l2).element, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(C259800zU c259800zU, C259800zU<C20361214lm> c259800zU2, PlaybookEditorDialog playbookEditorDialog, C20359414lU c20359414lU) {
        super(1);
        this.$t = c20359414lU;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = playbookEditorDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(C031C c031c, C031C c031c2, SeaSkuImageSpecCell seaSkuImageSpecCell, List<SalePropValue> list) {
        super(1);
        this.$t = list;
        this.l0 = c031c;
        this.l1 = c031c2;
        this.l2 = seaSkuImageSpecCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(C510160Jza c510160Jza, BasePlaybookEditorViewModel basePlaybookEditorViewModel, PlaybookEditorDialog playbookEditorDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = playbookEditorDialog;
        this.l1 = c510160Jza;
        this.l2 = basePlaybookEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(C20375014o0 c20375014o0, C20365614mU c20365614mU, C20365514mT c20365514mT, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20375014o0;
        this.l1 = c20365614mU;
        this.l2 = c20365514mT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(C20409114tV c20409114tV, C0UTJ c0utj, C20382814pG c20382814pG, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20409114tV;
        this.l1 = c0utj;
        this.l2 = c20382814pG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(C15TH c15th, ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, ExploreFeedRequestOverride exploreFeedRequestOverride, int i) {
        super(1);
        this.$t = i;
        this.l0 = c15th;
        this.l1 = exploreTopicGeneralFeedListViewModel;
        this.l2 = exploreFeedRequestOverride;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(C16CO c16co, C16CO c16co2, TikTokMediaModel tikTokMediaModel, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c16co;
        this.l1 = c16co2;
        this.l2 = tikTokMediaModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(CancellationSignal cancellationSignal, CancellationSignal cancellationSignal2, Executor executor, C15MM<Void, C13XS> c15mm) {
        super(1);
        this.$t = c15mm;
        this.l1 = cancellationSignal;
        this.l2 = cancellationSignal2;
        this.l0 = executor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(FrameLayout frameLayout, C19EG c19eg, CommonHorizontalContainerAssem commonHorizontalContainerAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = frameLayout;
        this.l2 = commonHorizontalContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(MutableLiveData mutableLiveData, Object obj, AwS308S0300000_31 awS308S0300000_31, int i) {
        super(1);
        this.$t = i;
        this.l0 = mutableLiveData;
        this.l1 = obj;
        this.l2 = awS308S0300000_31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(BackgroundEffectEntity backgroundEffectEntity, BackgroundEffectEntity backgroundEffectEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = backgroundEffectEntity;
        this.l1 = backgroundEffectEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(EnhanceEntity enhanceEntity, EnhanceEntity enhanceEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = enhanceEntity;
        this.l1 = enhanceEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(MusicEntity musicEntity, MusicEntity musicEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = musicEntity;
        this.l1 = musicEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(PropEffectEntity propEffectEntity, PropEffectEntity propEffectEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = propEffectEntity;
        this.l1 = propEffectEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(SoundEffectsEntity soundEffectsEntity, SoundEffectsEntity soundEffectsEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = soundEffectsEntity;
        this.l1 = soundEffectsEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(StickerEffectEntity stickerEffectEntity, StickerEffectEntity stickerEffectEntity2, C20361214lm c20361214lm, Function0<? extends InterfaceC20354714kj> function0) {
        super(1);
        this.$t = function0;
        this.l0 = stickerEffectEntity;
        this.l1 = stickerEffectEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(VoiceEffectsEntity voiceEffectsEntity, VoiceEffectsEntity voiceEffectsEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = voiceEffectsEntity;
        this.l1 = voiceEffectsEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(AIWallpaperEntity aIWallpaperEntity, AIWallpaperEntity aIWallpaperEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = aIWallpaperEntity;
        this.l1 = aIWallpaperEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(ManageGuestEntity manageGuestEntity, ManageGuestEntity manageGuestEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = manageGuestEntity;
        this.l1 = manageGuestEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(DrawGuessEntity drawGuessEntity, DrawGuessEntity drawGuessEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = drawGuessEntity;
        this.l1 = drawGuessEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(PhotoTranslationPanelFragment photoTranslationPanelFragment, PushSettings pushSettings, String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = photoTranslationPanelFragment;
        this.l1 = pushSettings;
        this.l2 = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(ExploreRecommendTopicListComponent exploreRecommendTopicListComponent, ViewGroup viewGroup, ImageView imageView, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreRecommendTopicListComponent;
        this.l1 = viewGroup;
        this.l2 = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(User user, EnumC20615215le enumC20615215le, StoryUserListContainerViewModel storyUserListContainerViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = enumC20615215le;
        this.l2 = storyUserListContainerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, NetworkStandardUIServiceImpl networkStandardUIServiceImpl2, C1749280vcc c1749280vcc, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l2 = networkStandardUIServiceImpl;
        this.l1 = networkStandardUIServiceImpl2;
        this.l0 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(MusicModel musicModel, MusicModel musicModel2, VerticalMusicViewV2 verticalMusicViewV2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = musicModel;
        this.l1 = musicModel2;
        this.l2 = verticalMusicViewV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(EditPageMethod editPageMethod, JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS, int i) {
        super(1);
        this.$t = i;
        this.l0 = editPageMethod;
        this.l1 = jSONObject;
        this.l2 = interfaceC1041760dDS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(ConcurrentHashMap concurrentHashMap, C199Y c199y, FragmentManager fragmentManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = concurrentHashMap;
        this.l1 = c199y;
        this.l2 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(AtomicBoolean atomicBoolean, C163E c163e, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = atomicBoolean;
        this.l1 = c163e;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS240S0300000_31(Function0 function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        super(1);
        this.$t = function04;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = function03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS240S0300000_31(int[] iArr, C20671715ul c20671715ul, InnerPushMessage innerPushMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = iArr;
        this.l1 = c20671715ul;
        this.l2 = innerPushMessage;
    }
}
