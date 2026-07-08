package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C069M;
import X.C09AY;
import X.C0HL2;
import X.C0HL4;
import X.C0HL5;
import X.C0HL8;
import X.C0HLE;
import X.C0HLG;
import X.C0HLS;
import X.C0HLV;
import X.C0HV6;
import X.C0PEM;
import X.C0WZX;
import X.C0ZDN;
import X.C1388190mED;
import X.C1558520qew;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C2243571Crb;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C439590HLp;
import X.C440410HOt;
import X.C457490Hwp;
import X.C457510Hwr;
import X.C457520Hws;
import X.C457780HxI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC430090Gtj;
import X.EnumC439240HKg;
import X.EnumC439250HKh;
import X.EnumC439270HKj;
import X.EnumC439280HKk;
import X.EnumC439580HLo;
import X.EnumC439680HLy;
import X.EnumC440890HQp;
import X.EnumC451180Hme;
import X.InterfaceC0148002o;
import X.ViewTreeObserverOnGlobalLayoutListenerC425660Gma;
import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.popupmanager.IMManagePopupAbility;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IIMCameraAlbumUpdateBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS135S0400000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS135S0400000_6 awS135S0400000_6) {
        C786410Ut5.C3(((View) awS135S0400000_6.l0).getViewTreeObserver(), (ViewTreeObserverOnGlobalLayoutListenerC425660Gma) awS135S0400000_6.l1);
        FrameLayout frameLayout = (FrameLayout) awS135S0400000_6.l2;
        return Boolean.valueOf(HandlerHook.viewPost(frameLayout, new ARunnableS75S0200000_6(frameLayout, (View) awS135S0400000_6.l3, 0)));
    }

    public static final Object invoke$1(AwS135S0400000_6 awS135S0400000_6) {
        IIMCameraAlbumUpdateBridge.LIZ.getClass();
        IIMCameraAlbumUpdateBridge value = C457520Hws.LIZIZ.getValue();
        ViewGroup viewGroupLJIJI = null;
        if (value == null) {
            return null;
        }
        IMManagePopupAbility iMManagePopupAbility = (IMManagePopupAbility) C1558520qew.LIZ(C1558520qew.LJIIL((UIAssem) awS135S0400000_6.l0), IMManagePopupAbility.class, null);
        if (iMManagePopupAbility != null) {
            viewGroupLJIJI = iMManagePopupAbility.LJIJI();
        }
        return value.LIZ(viewGroupLJIJI, (View) awS135S0400000_6.l1, ((C457780HxI) awS135S0400000_6.l2).LL, new C457490Hwp((IAlbumUpdateGuideViewModel) ((C736950SvV) awS135S0400000_6.l3).getValue()), new C457510Hwr((IAlbumUpdateGuideViewModel) ((C736950SvV) awS135S0400000_6.l3).getValue()));
    }

    public static final Object invoke$10(AwS135S0400000_6 awS135S0400000_6) {
        if (((C0HV6) awS135S0400000_6.l0).LJIILIIL((View) awS135S0400000_6.l1)) {
            ((C0HV6) awS135S0400000_6.l0).LJII(((View) awS135S0400000_6.l1).getContext());
            ((C0HV6) awS135S0400000_6.l0).LJIIIIZZ();
            Context context = ((UIAssem) awS135S0400000_6.l2).getContext();
            if (context != null) {
                new C0ZDN(context).LIZ(0);
                ((Function1) awS135S0400000_6.l3).invoke((View) awS135S0400000_6.l1);
                ((C0HV6) awS135S0400000_6.l0).LJ(EnumC430090Gtj.LOCKED);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS135S0400000_6 awS135S0400000_6) {
        if (((C0HV6) awS135S0400000_6.l0).LJIILIIL((View) awS135S0400000_6.l1)) {
            ((C0HV6) awS135S0400000_6.l0).LJII(((View) awS135S0400000_6.l1).getContext());
            ((C0HV6) awS135S0400000_6.l0).LJIJJLI();
            Context context = ((UIAssem) awS135S0400000_6.l2).getContext();
            if (context != null) {
                new C0ZDN(context).LIZ(0);
                ((Function1) awS135S0400000_6.l3).invoke((View) awS135S0400000_6.l1);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS135S0400000_6 awS135S0400000_6) {
        Activity activityLIZ = C1388190mED.LIZ(((View) awS135S0400000_6.l0).getContext());
        if (activityLIZ != null) {
            Integer num = (Integer) awS135S0400000_6.l1;
            DefaultStickerClickHandler defaultStickerClickHandler = (DefaultStickerClickHandler) awS135S0400000_6.l2;
            StickerTemplate stickerTemplate = (StickerTemplate) awS135S0400000_6.l3;
            int type = EnumC451180Hme.PHOTO_STICKER.getType();
            String string = null;
            if (num != null && num.intValue() == type) {
                Long lLIZIZ = C2243571Crb.LIZIZ(stickerTemplate);
                if (lLIZIZ != null) {
                    string = lLIZIZ.toString();
                }
                String strLIZ = C2243571Crb.LIZ(stickerTemplate);
                defaultStickerClickHandler.getClass();
                DefaultStickerClickHandler.LJFF(activityLIZ, string, strLIZ, "photo_sticker");
            } else {
                int type2 = EnumC451180Hme.AIGC_STICKER.getType();
                if (num != null && num.intValue() == type2) {
                    Long lLIZIZ2 = C2243571Crb.LIZIZ(stickerTemplate);
                    if (lLIZIZ2 != null) {
                        string = lLIZIZ2.toString();
                    }
                    String strLIZ2 = C2243571Crb.LIZ(stickerTemplate);
                    defaultStickerClickHandler.getClass();
                    DefaultStickerClickHandler.LJFF(activityLIZ, string, strLIZ2, "ai_generated");
                } else {
                    Long lLIZIZ3 = C2243571Crb.LIZIZ(stickerTemplate);
                    if (lLIZIZ3 != null) {
                        string = lLIZIZ3.toString();
                    }
                    String strLIZ3 = C2243571Crb.LIZ(stickerTemplate);
                    String strValueOf = String.valueOf(C2243571Crb.LIZLLL(stickerTemplate));
                    defaultStickerClickHandler.getClass();
                    DefaultStickerClickHandler.LJFF(activityLIZ, string, strLIZ3, strValueOf);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS135S0400000_6 awS135S0400000_6) {
        IShareMessageHelper.LIZ.getClass();
        IShareMessageHelper iShareMessageHelperLIZ = C069M.LIZ();
        if (iShareMessageHelperLIZ != null) {
            iShareMessageHelperLIZ.LIZ(((DefaultStickerClickHandler) awS135S0400000_6.l0).LL, ((View) awS135S0400000_6.l1).getContext(), null, (StickerTemplate) awS135S0400000_6.l2, (C869590Y9l) awS135S0400000_6.l3, "sticker_pop_up", "chat", true, new AwS550S0100000_6((DefaultStickerClickHandler) awS135S0400000_6.l0, 322));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S0400000_6 awS135S0400000_6) {
        Object value;
        Object value2;
        EnumC439250HKh enumC439250HKh;
        Object value3;
        ArrayList arrayList;
        C05P0 c05p0 = (C05P0) awS135S0400000_6.l2;
        Boolean bool = Boolean.FALSE;
        c05p0.setValue(bool);
        ((C05P0) awS135S0400000_6.l3).setValue(bool);
        C0HL8 c0hl8 = ((SocialAvatarCameraSceneV2) ((BaseSocialAvatarCameraScene) awS135S0400000_6.l0)).LLLF.LLJLLL;
        c0hl8.LIZIZ = "personal_homepage";
        c0hl8.LIZ = "generation_error";
        C0HLG.LIZLLL(c0hl8);
        C0HLG.LJ(C0HLE.RETRY, (C0HLS) ((C05P0) ((C259800zU) awS135S0400000_6.l1).element).getValue(), ((SocialAvatarCameraSceneV2) ((BaseSocialAvatarCameraScene) awS135S0400000_6.l0)).LLLF.LLJLLL.LJIILLIIL);
        SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = ((SocialAvatarCameraSceneV2) ((BaseSocialAvatarCameraScene) awS135S0400000_6.l0)).LLLF;
        if ((socialAvatarCreationViewModelV2 instanceof SocialAvatarCreationViewModelV2) && socialAvatarCreationViewModelV2 != null) {
            socialAvatarCreationViewModelV2.zQ2(socialAvatarCreationViewModelV2.xQ2(), 0L, AFwS236S0000000_6.get$arr$(425));
            C2252321DDq c2252321DDq = socialAvatarCreationViewModelV2.LLJIJIL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C0HL5.LIZ((C0HL5) value, EnumC439280HKk.NOT_IN_WAITING, 0L, 6)));
            C2252321DDq c2252321DDq2 = socialAvatarCreationViewModelV2.LLJILJILJ;
            do {
                value2 = c2252321DDq2.getValue();
                enumC439250HKh = EnumC439250HKh.NORMAL;
                value2.getClass();
            } while (!c2252321DDq2.compareAndSet(value2, new C0HL2(enumC439250HKh)));
            C2252321DDq c2252321DDq3 = socialAvatarCreationViewModelV2.LLJJ;
            while (!c2252321DDq3.compareAndSet(c2252321DDq3.getValue(), EnumC439270HKj.NONE)) {
            }
            C2252321DDq c2252321DDq4 = socialAvatarCreationViewModelV2.LLJJIII;
            while (!c2252321DDq4.compareAndSet(c2252321DDq4.getValue(), EnumC439240HKg.NONE)) {
            }
            C2252321DDq c2252321DDq5 = socialAvatarCreationViewModelV2.LLILZIL;
            do {
                value3 = c2252321DDq5.getValue();
                arrayList = new ArrayList();
                value3.getClass();
            } while (!c2252321DDq5.compareAndSet(value3, new C0HL4(null, arrayList)));
            socialAvatarCreationViewModelV2.LLJLLL.LJJI = false;
        }
        ((BaseSocialAvatarCameraScene) awS135S0400000_6.l0).LLLLLLIL();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS135S0400000_6 awS135S0400000_6) {
        int i = C439590HLp.LIZ[((EnumC439580HLo) ((C05P1) awS135S0400000_6.l0).getValue()).ordinal()];
        C0HLV c0hlv = null;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                SmartRouter.buildRoute((Context) awS135S0400000_6.l1, "aweme://push_setting_manager").open();
            }
        } else {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", ((Context) awS135S0400000_6.l1).getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", ((Context) awS135S0400000_6.l1).getApplicationInfo().uid);
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", ((Context) awS135S0400000_6.l1).getPackageName());
                intent.putExtra("app_uid", ((Context) awS135S0400000_6.l1).getApplicationInfo().uid);
            }
            intent.addFlags(268435456);
            Context context = (Context) awS135S0400000_6.l1;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQZsa04t++ugSuKBGBT2D+SIPrtuoErQ1nITxRZ3rR+Ez4=", null));
        }
        C0HL8 c0hl8 = ((SocialAvatarCameraSceneV2) awS135S0400000_6.l2).LLLF.LLJLLL;
        EnumC439680HLy enumC439680HLy = EnumC439680HLy.GO_TO_NOTIFICATION;
        int i2 = C439590HLp.LIZIZ[((C0HL5) awS135S0400000_6.l3).LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    c0hlv = C0HLV.UPLOADING;
                }
            } else {
                c0hlv = C0HLV.QUEUE;
            }
        } else {
            c0hlv = C0HLV.GENERATING;
        }
        if (((C05P1) awS135S0400000_6.l0).getValue() != EnumC439580HLo.ALLOWED) {
            z = false;
        }
        C0HLG.LJFF(c0hl8, enumC439680HLy, c0hlv, z);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS135S0400000_6 awS135S0400000_6) {
        ((Function0) awS135S0400000_6.l0).invoke();
        C786410Ut5.LJJJZ((ImageView) awS135S0400000_6.l2, (FrameLayout) awS135S0400000_6.l1);
        C786410Ut5.LJJJZ((View) awS135S0400000_6.l3, (FrameLayout) awS135S0400000_6.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS135S0400000_6 awS135S0400000_6) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C440410HOt((MixStudioResultsBaseAssem) awS135S0400000_6.l0, (Fragment) awS135S0400000_6.l2, (Context) awS135S0400000_6.l3, null), 3);
        ((MixStudioResultsBaseAssem) awS135S0400000_6.l0).hp().xQ2(EnumC440890HQp.HOME);
        ((Function0) awS135S0400000_6.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS135S0400000_6 awS135S0400000_6) {
        IShareMessageHelper.LIZ.getClass();
        IShareMessageHelper iShareMessageHelperLIZ = C069M.LIZ();
        if (iShareMessageHelperLIZ != null) {
            iShareMessageHelperLIZ.LIZ(((DefaultStickerClickHandler) awS135S0400000_6.l0).LL, ((View) awS135S0400000_6.l1).getContext(), null, (StickerTemplate) awS135S0400000_6.l2, (C869590Y9l) awS135S0400000_6.l3, "sticker_pop_up", "chat", true, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS135S0400000_6 awS135S0400000_6) {
        IShareMessageHelper.LIZ.getClass();
        IShareMessageHelper iShareMessageHelperLIZ = C069M.LIZ();
        if (iShareMessageHelperLIZ != null) {
            iShareMessageHelperLIZ.LIZ(((DefaultStickerClickHandler) awS135S0400000_6.l0).LL, ((View) awS135S0400000_6.l1).getContext(), null, (StickerTemplate) awS135S0400000_6.l2, (C869590Y9l) awS135S0400000_6.l3, "sticker_pop_up", "chat", true, new AwS550S0100000_6((DefaultStickerClickHandler) awS135S0400000_6.l0, 1356));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(C05P0 c05p0, Context context, SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, C0HL5 c0hl5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = context;
        this.l2 = socialAvatarCameraSceneV2;
        this.l3 = c0hl5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0400000_6(C0HV6 c0hv6, C0HV6 c0hv62, View view, UIAssem uIAssem, Function1<? super View, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c0hv6;
        this.l1 = c0hv62;
        this.l2 = view;
        this.l3 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(Context context, Fragment fragment, MixStudioResultsBaseAssem mixStudioResultsBaseAssem, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = mixStudioResultsBaseAssem;
        this.l1 = function0;
        this.l2 = fragment;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(View view, ViewTreeObserverOnGlobalLayoutListenerC425660Gma viewTreeObserverOnGlobalLayoutListenerC425660Gma, FrameLayout frameLayout, View view2, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = viewTreeObserverOnGlobalLayoutListenerC425660Gma;
        this.l2 = frameLayout;
        this.l3 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(View view, Integer num, DefaultStickerClickHandler defaultStickerClickHandler, StickerTemplate stickerTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = num;
        this.l2 = defaultStickerClickHandler;
        this.l3 = stickerTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0400000_6(UIAssem uIAssem, UIAssem uIAssem2, View view, C457780HxI c457780HxI, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV) {
        super(0);
        this.$t = c736950SvV;
        this.l0 = uIAssem;
        this.l1 = uIAssem2;
        this.l2 = view;
        this.l3 = c457780HxI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(DefaultStickerClickHandler defaultStickerClickHandler, View view, StickerTemplate stickerTemplate, C869590Y9l c869590Y9l, int i) {
        super(0);
        this.$t = i;
        this.l0 = defaultStickerClickHandler;
        this.l1 = view;
        this.l2 = stickerTemplate;
        this.l3 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(DefaultStickerClickHandler defaultStickerClickHandler, RoundingCornerLayout roundingCornerLayout, StickerTemplate stickerTemplate, C869590Y9l c869590Y9l, int i) {
        super(0);
        this.$t = i;
        this.l0 = defaultStickerClickHandler;
        this.l1 = roundingCornerLayout;
        this.l2 = stickerTemplate;
        this.l3 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0400000_6(BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, BaseSocialAvatarCameraScene baseSocialAvatarCameraScene2, C259800zU<C05P0<C0HLS>> c259800zU, C05P0<Boolean> c05p0, C05P0<Boolean> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = baseSocialAvatarCameraScene;
        this.l1 = baseSocialAvatarCameraScene2;
        this.l2 = c259800zU;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0400000_6(AwS403S0200000_2 awS403S0200000_2, FrameLayout frameLayout, ImageView imageView, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS403S0200000_2;
        this.l1 = frameLayout;
        this.l2 = imageView;
        this.l3 = view;
    }
}
