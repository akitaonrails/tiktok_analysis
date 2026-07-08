package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0CVN;
import X.C0D8F;
import X.C0DHZ;
import X.C0DMI;
import X.C0DOU;
import X.C0DWW;
import X.C0XF1;
import X.C11S5;
import X.C1247510iZJ;
import X.C1389890mGx;
import X.C1390380mHk;
import X.C1390850mIV;
import X.C13LP;
import X.C1449260noi;
import X.C1623660sM0;
import X.C1656550tD3;
import X.C1701940uOG;
import X.C1737170vJ5;
import X.C1737910vKH;
import X.C1848410yCV;
import X.C19221910Hx;
import X.C19576911iZ;
import X.C19EG;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C23250099c;
import X.C291001Au;
import X.C317310CcD;
import X.C322420CkS;
import X.C322450CkV;
import X.C322460CkW;
import X.C341910Dan;
import X.C345040Dfq;
import X.C345050Dfr;
import X.C345120Dfy;
import X.C346520DiE;
import X.C724240Sb0;
import X.EnumC20615215le;
import X.InterfaceC1624480sNK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1891350zJl;
import Y.ACListenerS44S0400000_4;
import Y.ARunnableS23S0110000_4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import avg.f;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.EditCampusPageAssem;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mf.a;

/* JADX INFO: loaded from: classes5.dex */
public class AwS653S0100000_4 extends C09AY implements InterfaceC1631620sYq {
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
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(Activity activity, int i) {
        super(3);
        this.$t = i;
        this.l0 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(Context context, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(LandscapeProfileListAssem landscapeProfileListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = landscapeProfileListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(GiftCardCheckoutAssem giftCardCheckoutAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = giftCardCheckoutAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(PostedListFragment postedListFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = postedListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(LiveHighLightPageFragment liveHighLightPageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = liveHighLightPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(User user, int i) {
        super(3);
        this.$t = i;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(EffectDraftDetailAssem effectDraftDetailAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectDraftDetailAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(DmViewModel dmViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = dmViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(EffectTemplateCategoryFragment effectTemplateCategoryFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectTemplateCategoryFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = findSchoolFriendsPageContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(EditCampusPageAssem editCampusPageAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editCampusPageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS653S0100000_4(Throwable th, int i) {
        super(3);
        this.$t = i;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS653S0100000_4(Function2 function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22) {
        super(3);
        this.$t = function22;
        this.l0 = function2;
    }

    public static final Object invoke$0(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((Function2) awS653S0100000_4.l0).invoke(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((Function2) awS653S0100000_4.l0).invoke(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        ((FindSchoolFriendsPageContainerAssem) awS653S0100000_4.l0).Tp(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        String string;
        boolean z;
        C0DHZ c0dhz = (C0DHZ) obj2;
        Integer num = (Integer) obj3;
        TuxTextView tuxTextView = ((EditCampusPageAssem) awS653S0100000_4.l0).LLJJJJ;
        boolean z2 = false;
        if (tuxTextView != null) {
            if (c0dhz == null && num == null) {
                z = false;
            } else {
                z = true;
            }
            tuxTextView.setEnabled(z);
        }
        EditCampusPageAssem editCampusPageAssem = (EditCampusPageAssem) awS653S0100000_4.l0;
        C0DOU c0dou = editCampusPageAssem.LLJJJIL;
        if (c0dou != null) {
            if (num == null || (string = num.toString()) == null) {
                string = c0dou.getContext().getString(2131846901);
            }
            c0dou.setContent(string);
            if (num == null) {
                z2 = true;
            }
            c0dou.setContentIsPlaceholder(z2);
            View.OnClickListener aCListenerS44S0400000_4 = new ACListenerS44S0400000_4(editCampusPageAssem, num, c0dou, c0dhz, 0);
            if (C1848410yCV.LIZ) {
                aCListenerS44S0400000_4 = new f(aCListenerS44S0400000_4);
            }
            a aVar = new a(aCListenerS44S0400000_4);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0dou);
            }
            c0dou.setOnClickListener(aVar);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 10
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131851294(0x7f11781e, float:1.9336174E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.PostedListFragment) r1
            r0 = 10
            r2.<init>(r1, r4, r0)
            r0 = 108473803(0x6772dcb, float:4.648918E-35)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$12(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 13
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131850441(0x7f1174c9, float:1.9334444E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131828359(0x7f111e87, float:1.9289657E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 16
            r2.<init>(r1, r4, r0)
            r0 = -567760780(0xffffffffde28a874, float:-3.0382728E18)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$13(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 21
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131849662(0x7f1171be, float:1.9332864E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131849661(0x7f1171bd, float:1.9332862E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 19
            r2.<init>(r1, r4, r0)
            r0 = 1456445281(0x56cf9761, float:1.1412454E14)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$14(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L93
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L91
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 19
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131849666(0x7f1171c2, float:1.9332872E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            r0 = 2131849665(0x7f1171c1, float:1.933287E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 18
            r2.<init>(r1, r4, r0)
            r0 = -1799621136(0xffffffff94bbf5f0, float:-1.897918E-26)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r7 = r5
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L91:
            r0 = 0
            goto L3e
        L93:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$15(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 22
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131820917(0x7f110175, float:1.9274562E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem r1 = (com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailAssem) r1
            r0 = 20
            r2.<init>(r1, r4, r0)
            r0 = -1140729130(0xffffffffbc01dad6, float:-0.00792571)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$16(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        C322420CkS c322420CkS;
        C322460CkW c322460CkW;
        C322450CkV c322450CkV = (C322450CkV) obj2;
        C291001Au c291001Au = (C291001Au) obj3;
        if (c291001Au != null && (c322420CkS = (C322420CkS) c291001Au.LIZ()) != null) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(c322420CkS.LIZIZ, c322450CkV.LIZ);
            if ((objLJJJLZIJ instanceof C322460CkW) && (c322460CkW = (C322460CkW) objLJJJLZIJ) != null) {
                EffectDraftDetailAssem effectDraftDetailAssem = (EffectDraftDetailAssem) awS653S0100000_4.l0;
                boolean z = c322420CkS.LIZ;
                effectDraftDetailAssem.getClass();
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectDraftDetailAssem", "goToAMEDraft()");
                HashMap map = new HashMap(c322460CkW.LIZ());
                map.put("if_success", CardStruct.IStatusCode.DEFAULT);
                map.put("error_code", CardStruct.IStatusCode.DEFAULT);
                if (z && C1656550tD3.LIZ()) {
                    C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
                    c1737170vJ5.LIZ = effectDraftDetailAssem.getContext();
                    c1737170vJ5.LIZIZ = "personal_homepage";
                    c1737170vJ5.LJFF = "profile_draft";
                    c1737170vJ5.LIZJ = "personal_homepage";
                    c1737170vJ5.LIZLLL = "ame_editor";
                    c1737170vJ5.LJ = C0DMI.LIZ();
                    c1737170vJ5.LJIIIIZZ = c322460CkW.LIZ;
                    c1737170vJ5.LJIILL = c322460CkW.LJIILIIL;
                    c1737170vJ5.LJIILJJIL = c322460CkW.LJIILJJIL;
                    c1737170vJ5.LJIILLIIL = c322460CkW.LJ;
                    c1737170vJ5.LJIJ = "1";
                    int i = c322460CkW.LJIIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append(i);
                    c1737170vJ5.LJIIZILJ = C2188811AlT.LIZIZ(sbLIZ);
                    if (c322460CkW.LIZ.isAigcEffect()) {
                        c1737170vJ5.LJI = "ame_aigc_draft";
                        c1737170vJ5.LIZIZ(c322460CkW.LIZ.getAigcInfo().getWorkflowTaskId());
                        int i2 = c322460CkW.LJI;
                        if (i2 != 0) {
                            c1737170vJ5.LIZJ(String.valueOf(i2));
                            if (c322460CkW.LJI == 2) {
                                c1737170vJ5.LJIJJ = AigcParams.LIZ(c1737170vJ5.LJIJJ, 0, null, null, null, c322460CkW.LJIIIIZZ, 15);
                            }
                        }
                    }
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(effectDraftDetailAssem), null, null, new C317310CcD(c1737170vJ5, null), 3);
                } else {
                    map.put("error_code", "1");
                    C19EG c19egLIZ = C724240Sb0.LIZ(effectDraftDetailAssem);
                    if (c19egLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJIIIZ(2131820922);
                        c1389890mGx.LJIIJJI();
                        C1737910vKH.LIZ("prop_draft_card_toast", c322460CkW.LIZ());
                    }
                    C1737910vKH.LIZ("prop_draft_card_click", map);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L9b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L99
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 23
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r3 = r16
            java.lang.Object r1 = r3.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131839107(0x7f114883, float:1.9311456E38)
            java.lang.String r9 = r1.getString(r0)
            java.lang.Object r1 = r3.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131839106(0x7f114882, float:1.9311454E38)
            java.lang.String r10 = r1.getString(r0)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            java.lang.Object r1 = r3.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 21
            r2.<init>(r1, r4, r0)
            r0 = -945867546(0xffffffffc79f34e6, float:-81513.8)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L99:
            r0 = 0
            goto L3e
        L9b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$18(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L91
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8f
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 24
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r3 = r16
            java.lang.Object r1 = r3.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131839104(0x7f114880, float:1.931145E38)
            java.lang.String r10 = r1.getString(r0)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            java.lang.Object r1 = r3.l0
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 22
            r2.<init>(r1, r4, r0)
            r0 = 1505033673(0x59b4fdc9, float:6.368067E15)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8f:
            r0 = 0
            goto L3e
        L91:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$19(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((Function2) awS653S0100000_4.l0).invoke(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8d
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8b
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 26
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131855645(0x7f11891d, float:1.9345E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment) r1
            r0 = 23
            r2.<init>(r1, r4, r0)
            r0 = 390845755(0x174bd53b, float:6.586197E-25)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8b:
            r0 = 0
            goto L3e
        L8d:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$20(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$21(kotlin.jvm.internal.AwS653S0100000_4 r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r13 = r16
            r1 = r15
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L87
            r0 = 4
        L1f:
            r4 = r4 | r0
        L20:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L32
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L32
            r13.LIZJ()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L85
            r0 = 1
        L3d:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 29
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L56:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "limitRootAbility (debug) error (contact yangshuai.03): "
            r1.<init>(r0)
            r0 = r14
            java.lang.Object r0 = r0.l0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r14 = 3504(0xdb0, float:4.91E-42)
            r16 = 1968(0x7b0, float:2.758E-42)
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2f
        L85:
            r0 = 0
            goto L3d
        L87:
            r0 = 2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$21(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        MobileEffect mobileEffect;
        boolean z;
        MobileEffect mobileEffect2;
        Effect effect = (Effect) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) awS653S0100000_4.l0;
        InterfaceC1624480sNK interfaceC1624480sNK = effectTemplateCategoryFragment.LLJILJILJ;
        ShortVideoContext shortVideoContext = null;
        InterfaceC1624480sNK interfaceC1624480sNK2 = null;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        String key = C1623660sM0.LIZ(interfaceC1624480sNK).getKey();
        ShortVideoContext shortVideoContext2 = effectTemplateCategoryFragment.LL;
        if (shortVideoContext2 == null) {
            shortVideoContext2 = null;
        }
        C1449260noi.LJ("prop_long_press", C345120Dfy.LIZIZ(iIntValue, key, effect, shortVideoContext2));
        if (effect instanceof MobileEffect) {
            mobileEffect = (MobileEffect) effect;
        } else {
            mobileEffect = null;
        }
        if (mobileEffect != null && mobileEffect.getModerationStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = effect instanceof DraftEffect;
        if (!z && !z2 && C345050Dfr.LIZ) {
            effectTemplateCategoryFragment.LLJJJJ = effect;
            effectTemplateCategoryFragment.LLJJJJLIIL = iIntValue;
            effectTemplateCategoryFragment.LLJJJJJIL = iIntValue2;
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) ((LinkedHashMap) effectTemplateCategoryFragment.LLJI).get(Integer.valueOf(iIntValue));
            Effect effect2 = effectTemplateCategoryFragment.LLJJJJ;
            if (effect2 instanceof MobileEffect) {
                mobileEffect2 = (MobileEffect) effect2;
            } else {
                mobileEffect2 = null;
            }
            if (newFaceStickerBean != null && mobileEffect2 != null) {
                C19EG activity = effectTemplateCategoryFragment.getActivity();
                if (activity != null) {
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    ShortVideoContext shortVideoContext3 = effectTemplateCategoryFragment.LL;
                    if (shortVideoContext3 == null) {
                        shortVideoContext3 = null;
                    }
                    int i = effectTemplateCategoryFragment.LLJJJJLIIL;
                    int i2 = effectTemplateCategoryFragment.LLJJJJJIL;
                    MyEffectsViewModel myEffectsViewModelZR = effectTemplateCategoryFragment.ZR();
                    ShortVideoContext shortVideoContext4 = effectTemplateCategoryFragment.LL;
                    InterfaceC1624480sNK interfaceC1624480sNK3 = effectTemplateCategoryFragment.LLJILJILJ;
                    if (interfaceC1624480sNK3 != null) {
                        interfaceC1624480sNK2 = interfaceC1624480sNK3;
                    }
                    C345120Dfy.LIZLLL(activity, supportFragmentManager, newFaceStickerBean, shortVideoContext3, mobileEffect2, i, i2, myEffectsViewModelZR, C1623660sM0.LIZ(interfaceC1624480sNK2).getKey());
                }
            } else if (effect2 != null) {
                if (!C0XF1.LIZLLL(effectTemplateCategoryFragment.requireContext())) {
                    View view = effectTemplateCategoryFragment.getView();
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131829438);
                        creativeToastBuilder.isTuxToast(true);
                        C1390380mHk.LIZLLL(view, 6001, creativeToastBuilder);
                    }
                } else {
                    MyEffectsViewModel myEffectsViewModelZR2 = effectTemplateCategoryFragment.ZR();
                    String effectId = effect2.getEffectId();
                    myEffectsViewModelZR2.getClass();
                    if (effectId != null) {
                        myEffectsViewModelZR2.LLJLILLLLZIIL.postValue(C0D8F.IN_PROGRESS);
                        C345040Dfq c345040Dfq = C345040Dfq.LIZ;
                        C0CHQ.LIZ().getApplicationService();
                        String strLIZIZ = C19221910Hx.LIZIZ();
                        c345040Dfq.getClass();
                        C345040Dfq.LIZIZ.getStickerDetail(effectId, strLIZIZ).LJL(C11S5.LIZ()).LJLJI(3000L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C346520DiE(myEffectsViewModelZR2, 1));
                    }
                    C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                    C19EG c19egRequireActivity = effectTemplateCategoryFragment.requireActivity();
                    CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                    creativeLoadingDialogBuilder.backCanCancel(false);
                    creativeLoadingDialogBuilder.showProgress(false);
                    creativeLoadingDialogBuilder.loadingMessage(effectTemplateCategoryFragment.getString(R.string.txr));
                    effectTemplateCategoryFragment.LLJJL = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19egRequireActivity, 1, creativeLoadingDialogBuilder);
                }
            }
        } else {
            C19EG activity2 = effectTemplateCategoryFragment.getActivity();
            if (activity2 != null) {
                FragmentManager supportFragmentManager2 = activity2.getSupportFragmentManager();
                ShortVideoContext shortVideoContext5 = effectTemplateCategoryFragment.LL;
                if (shortVideoContext5 != null) {
                    shortVideoContext = shortVideoContext5;
                }
                MyEffectsViewModel myEffectsViewModelZR3 = effectTemplateCategoryFragment.ZR();
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZ = activity2.getString(R.string.gm7);
                c1247510iZJ.LIZJ = 1;
                c1247510iZJ.LIZ(new C0DWW(activity2, shortVideoContext, effect, iIntValue, iIntValue2, myEffectsViewModelZR3));
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LIZ.LLJJIJI = effect.getName();
                c1390850mIV.LIZIZ(c1247510iZJ);
                c1390850mIV.LIZJ().show(supportFragmentManager2, "DeleteAmeEffectDialog");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AwS653S0100000_4 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "senderValid: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", inputCompleted: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            X.01GW r0 = r0.LLJJ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isEnabled()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            r2 = 0
            if (r0 == 0) goto L5f
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "pipo_giftcard_checkout_btn_check_pay_ready"
            r1 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            X.0h8q r0 = r0.Go()
            if (r0 == 0) goto L71
            X.0DEp r0 = r0.LJII(r1)
            if (r0 == 0) goto L71
            X.0uaP r1 = r0.LIZ
        L5a:
            X.0uaP r0 = X.EnumC1709470uaP.SUCCESS
            if (r1 != r0) goto L5f
        L5e:
            r2 = 1
        L5f:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem r0 = (com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutAssem) r0
            X.01GW r0 = r0.LLJJ
            java.lang.Object r0 = r0.getValue()
            X.127h r0 = (X.C197039127h) r0
            r0.setEnabled(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L71:
            r1 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$23(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$24(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        DmViewModel dmViewModel = (DmViewModel) awS653S0100000_4.l0;
        dmViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, EnumC20615215le> value = dmViewModel.LL.getValue();
        if (value != null) {
            linkedHashMap.putAll(value);
        }
        linkedHashMap.put(obj, obj3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(dmViewModel), null, null, new C0CVN(dmViewModel, linkedHashMap, null), 3);
        if (obj3 == EnumC20615215le.SENT) {
            ((ArrayList) ((DmViewModel) awS653S0100000_4.l0).LLILLL).add(obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        C341910Dan c341910Dan;
        C291001Au c291001Au = (C291001Au) obj2;
        C291001Au c291001Au2 = (C291001Au) obj3;
        List<InterfaceC1891350zJl> listLJII = ((LandscapeProfileListAssem) awS653S0100000_4.l0).Go().getState().LJII();
        Iterator it2 = ((ArrayList) listLJII).iterator();
        boolean z = false;
        while (true) {
            String aid = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
            if ((interfaceC1891350zJl instanceof C341910Dan) && (c341910Dan = (C341910Dan) interfaceC1891350zJl) != null) {
                Aweme aweme = c341910Dan.LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                boolean zLJFF = Intrinsics.LJFF(aid, ((Aweme) c291001Au.LIZ).getAid());
                if (zLJFF) {
                    z = true;
                }
                c341910Dan.LLILLJJLI = zLJFF;
            }
        }
        if (z) {
            ((LandscapeProfileListAssem) awS653S0100000_4.l0).Go().getState().LJIILL(listLJII, null);
            LandscapeProfileListAssem landscapeProfileListAssem = (LandscapeProfileListAssem) awS653S0100000_4.l0;
            HandlerHook.viewPost(landscapeProfileListAssem.Go(), new ARunnableS23S0110000_4(landscapeProfileListAssem, ((Boolean) c291001Au2.LIZ).booleanValue(), 1));
        } else {
            ((LandscapeProfileListAssem) awS653S0100000_4.l0).ip().listClear();
            ((LandscapeProfileListAssem) awS653S0100000_4.l0).ip().manualListRefresh();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = r2 & 6
            r4 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto La2
            r0 = 4
        L20:
            r2 = r2 | r0
        L21:
            r1 = r2 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r2 & 14
            r1 = 1
            r2 = 0
            if (r0 != r4) goto La0
            r0 = 1
        L40:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L58
        L4f:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 4
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L58:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r0 = 2131857307(0x7f118f9b, float:1.934837E38)
            java.lang.String r9 = X.C0MBB.LIZIZ(r0, r15)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = r16
            java.lang.Object r0 = r0.l0
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            if (r0 == 0) goto L76
            java.lang.String r0 = r0.getUniqueId()
            if (r0 != 0) goto L78
        L76:
            java.lang.String r0 = ""
        L78:
            r1[r2] = r0
            r0 = 2131857308(0x7f118f9c, float:1.9348372E38)
            java.lang.String r10 = X.C0MBB.LIZJ(r0, r1, r15)
            r8 = 0
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 14
            r1.<init>(r4, r0)
            r0 = 2113768035(0x7dfd8a63, float:4.2126653E37)
            X.12De r13 = X.C13Z4.LIZJ(r0, r1, r15)
            r5 = 1
            r7 = 0
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1424(0x590, float:1.995E-42)
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        La0:
            r0 = 0
            goto L40
        La2:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$4(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS653S0100000_4 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L8b
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L89
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS49S0001000_4 r4 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 5
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = 2131850528(0x7f117520, float:1.933462E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS440S0200000_4 r2 = new kotlin.jvm.internal.AwS440S0200000_4
            r0 = r16
            java.lang.Object r1 = r0.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 3
            r2.<init>(r1, r4, r0)
            r0 = 294473980(0x118d50fc, float:2.2295788E-28)
            X.12De r13 = X.C13Z4.LIZJ(r0, r2, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L89:
            r0 = 0
            goto L3e
        L8b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$5(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS653S0100000_4 r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r17
            r13 = r16
            r1 = r15
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r13 = (X.InterfaceC1680500tpg) r13
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L20
            boolean r0 = r13.LJIJI(r3)
            if (r0 == 0) goto L92
            r0 = 4
        L1f:
            r4 = r4 | r0
        L20:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L32
            boolean r0 = r13.LIZ()
            if (r0 == 0) goto L32
            r13.LIZJ()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r13.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L90
            r0 = 1
        L3d:
            java.lang.Object r2 = r13.LJJ()
            if (r0 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L55
        L4c:
            kotlin.jvm.internal.AwS49S0001000_4 r2 = new kotlin.jvm.internal.AwS49S0001000_4
            r0 = 7
            r2.<init>(r3, r0)
            r13.LJJIJIIJI(r2)
        L55:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.LJ()
            r3 = 1
            X.0tW1 r4 = X.EnumC1668310tW1.Normal
            r5 = 0
            r6 = 0
            java.lang.Object r1 = r14.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131822649(0x7f110839, float:1.9278075E38)
            java.lang.String r7 = r1.getString(r0)
            java.lang.Object r1 = r14.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131822648(0x7f110838, float:1.9278073E38)
            java.lang.String r8 = r1.getString(r0)
            kotlin.jvm.internal.AwS618S0100000_4 r1 = new kotlin.jvm.internal.AwS618S0100000_4
            r0 = 25
            r1.<init>(r2, r0)
            r0 = -167308264(0xfffffffff6071418, float:-6.849293E32)
            X.12De r11 = X.C13Z4.LIZJ(r0, r1, r13)
            r14 = 805309872(0x30000db0, float:4.658558E-10)
            r16 = 1424(0x590, float:1.995E-42)
            r9 = r6
            r10 = r6
            r12 = r6
            r15 = r5
            X.C1668330tW3.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L2f
        L90:
            r0 = 0
            goto L3d
        L92:
            r0 = 2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS653S0100000_4.invoke$6(kotlin.jvm.internal.AwS653S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((Function2) awS653S0100000_4.l0).invoke(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        ((FindSchoolFriendsPageContainerAssem) awS653S0100000_4.l0).Tp(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS653S0100000_4 awS653S0100000_4, Object obj, Object obj2, Object obj3) {
        ((FindSchoolFriendsPageContainerAssem) awS653S0100000_4.l0).Tp(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        return Unit.LIZ;
    }
}
