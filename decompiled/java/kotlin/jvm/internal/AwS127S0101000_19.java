package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.AbstractC1261460ivo;
import X.AbstractC1263550izB;
import X.AbstractC1264080j02;
import X.C09AY;
import X.C1075830e6P;
import X.C1221150hsn;
import X.C1221260hsy;
import X.C1225010hz1;
import X.C1242300iQu;
import X.C1242310iQv;
import X.C1248940ibc;
import X.C1250500ie8;
import X.C1251150ifB;
import X.C1255650imR;
import X.C1261350ivd;
import X.C1261480ivq;
import X.C1261650iw7;
import X.C1261770iwJ;
import X.C1261860iwS;
import X.C1262050iwl;
import X.C1262070iwn;
import X.C1262090iwp;
import X.C1263190iyb;
import X.C1263210iyd;
import X.C1264120j06;
import X.C1265700j2e;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1558520qew;
import X.C1607070rvF;
import X.C1608730rxv;
import X.C1749280vcc;
import X.C1910890zpH;
import X.C19EH;
import X.C2188811AlT;
import X.C268330AfP;
import X.C278720AwA;
import X.C291001Au;
import X.C338420DOm;
import X.C491001vg;
import X.C786410Ut5;
import X.EnumC1221310ht3;
import X.EnumC1249130ibv;
import X.EnumC1606080rte;
import X.EnumC2274741E1w;
import X.InterfaceC1219340hps;
import X.InterfaceC1261750iwH;
import X.InterfaceC1262230ix3;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS88S0200000_19;
import Y.AfS112S0300000_19;
import Y.AfS155S0200000_19;
import android.view.animation.RotateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.favorites.business.video.invalid.FavoriteInvalidVideosServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowingListAssem;
import com.ss.android.ugc.profile.business.ur.platform.recommendbutton.HeaderCTARecommendButtonComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AwS127S0101000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(C1255650imR c1255650imR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1255650imR;
        this.i1 = 0;
    }

    public static final Object invoke$0(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        AbstractC1263550izB abstractC1263550izBLIZ;
        C1075830e6P c1075830e6P;
        AbstractC1263550izB abstractC1263550izBLIZ2;
        int iIntValue = ((Number) obj).intValue();
        FollowingListAssem followingListAssem = (FollowingListAssem) awS127S0101000_19.l0;
        int i = awS127S0101000_19.i1;
        if (iIntValue <= 0) {
            if (followingListAssem.ep()) {
                new AwS563S0100000_19(followingListAssem, 11).invoke();
            } else {
                followingListAssem.getClass();
            }
        } else {
            if (followingListAssem.ep()) {
                C1910890zpH c1910890zpHAp = followingListAssem.ap();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add empty chunk to index: ");
                sbLIZ.append(i);
                c1910890zpHAp.LIZ("following_assem", C2188811AlT.LIZIZ(sbLIZ));
                C1075830e6P c1075830e6P2 = followingListAssem.LLJILLL;
                if (c1075830e6P2 != null) {
                    abstractC1263550izBLIZ = c1075830e6P2.LIZ();
                } else {
                    abstractC1263550izBLIZ = null;
                }
                if (abstractC1263550izBLIZ != null && abstractC1263550izBLIZ.LJIIJ().LIZJ() == 0 && (c1075830e6P = followingListAssem.LLJILLL) != null && (abstractC1263550izBLIZ2 = c1075830e6P.LIZ()) != null) {
                    abstractC1263550izBLIZ2.LJII(C338420DOm.LIZ(followingListAssem.Go()));
                }
                followingListAssem.LLJ = true;
            }
            C1749280vcc c1749280vccBp = followingListAssem.bp();
            if (c1749280vccBp != null) {
                C786410Ut5.LJLLLLLL(8, c1749280vccBp);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = followingListAssem.Go();
            if (viewOnAttachStateChangeListenerC20604515jvGo != null) {
                C786410Ut5.LJLLLLLL(0, viewOnAttachStateChangeListenerC20604515jvGo);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        FragmentManager supportFragmentManager;
        C1242310iQv c1242310iQv = ((C1242300iQu) awS127S0101000_19.l0).LL.LLIZLLLIL;
        Fragment fragment = c1242310iQv.LLILLJJLI;
        if (fragment == null || (supportFragmentManager = fragment.getFragmentManager()) == null) {
            supportFragmentManager = c1242310iQv.LL.getSupportFragmentManager();
        }
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("DELETE_NOTICE_ACTION_SHEET_TAG");
        if (fragmentLJJJJZI != null) {
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
        ((C1242300iQu) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        if (!((C1255650imR) awS127S0101000_19.l0).LJ()) {
            ((C1255650imR) awS127S0101000_19.l0).LJIIL(awS127S0101000_19.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        if (!((C1255650imR) awS127S0101000_19.l0).LJ()) {
            ((C1255650imR) awS127S0101000_19.l0).LJIILJJIL(awS127S0101000_19.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((C1255650imR) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        final int i = awS127S0101000_19.i1;
        final FavoriteInvalidVideosServiceImpl favoriteInvalidVideosServiceImpl = (FavoriteInvalidVideosServiceImpl) awS127S0101000_19.l0;
        c1397620mTQ.LJ(2131846212, new Function1<C1397660mTU, Unit>() { // from class: X.0iu3
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1397660mTU c1397660mTU) {
                C1260420iu8 c1260420iu8 = C1260420iu8.LIZ;
                int i2 = i;
                c1260420iu8.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("action_type", "confirm");
                c2344009Gk.LIZJ(i2, "unavailable_video_cnt");
                C20684815ws.LJIILLIIL("unavailable_confirm_modal_click", c2344009Gk.LIZ);
                c1397660mTU.LIZ().LIZIZ(null);
                FavoriteInvalidVideosServiceImpl favoriteInvalidVideosServiceImpl2 = favoriteInvalidVideosServiceImpl;
                long j = 0;
                if (!favoriteInvalidVideosServiceImpl2.LIZLLL().LIZ) {
                    C1260390iu5 c1260390iu5LIZJ = favoriteInvalidVideosServiceImpl2.LIZJ();
                    c1260390iu5LIZJ.getClass();
                    String strLJ = c1260390iu5LIZJ.LJFF.LJ();
                    Keva kevaLIZIZ = C1260410iu7.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJ);
                    sbLIZ.append("_invalid_detected_cursor");
                    j = kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                }
                C19EG c19eg = favoriteInvalidVideosServiceImpl2.LLILLL;
                if (c19eg != null && favoriteInvalidVideosServiceImpl2.LLIZLLLIL == null) {
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
                    C786410Ut5.J4(dialogC1389620mGW);
                    favoriteInvalidVideosServiceImpl2.LLIZLLLIL = dialogC1389620mGW;
                }
                C1260440iuA c1260440iuA = favoriteInvalidVideosServiceImpl2.LLIZ;
                SettingsManager.LIZLLL().getClass();
                int iLJ = SettingsManager.LJ("favorite_clear_invalid_timeout_seconds", 10);
                AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(favoriteInvalidVideosServiceImpl2, 2918);
                AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(favoriteInvalidVideosServiceImpl2, 2919);
                if (!c1260440iuA.LIZLLL) {
                    c1260440iuA.LIZLLL = true;
                    ARunnableS88S0200000_19 aRunnableS88S0200000_19 = new ARunnableS88S0200000_19(c1260440iuA, awS563S0100000_192, 41);
                    c1260440iuA.LIZIZ = aRunnableS88S0200000_19;
                    C786410Ut5.LJLIIL(((long) iLJ) * 1000, c1260440iuA.LIZJ, aRunnableS88S0200000_19);
                    InterfaceC1260430iu9.LIZ.getClass();
                    c1260440iuA.LIZ = (C11JF) ((InterfaceC1260430iu9) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1260430iu9.class)).LIZ(j).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS112S0300000_19(c1260440iuA, awS563S0100000_19, awS563S0100000_192, 2), new AfS155S0200000_19(c1260440iuA, awS563S0100000_192, 11));
                }
                return Unit.LIZ;
            }
        });
        final int i2 = awS127S0101000_19.i1;
        c1397620mTQ.LJII(2131846211, new Function1<C1397660mTU, Unit>() { // from class: X.0iu4
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C1397660mTU c1397660mTU) {
                C1260420iu8 c1260420iu8 = C1260420iu8.LIZ;
                int i3 = i2;
                c1260420iu8.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("action_type", "cancel");
                c2344009Gk.LIZJ(i3, "unavailable_video_cnt");
                C20684815ws.LJIILLIIL("unavailable_confirm_modal_click", c2344009Gk.LIZ);
                c1397660mTU.LIZ().LIZIZ(null);
                return Unit.LIZ;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1261750iwH) obj).Kk0(new C1261480ivq(awS127S0101000_19.i1, (C1261770iwJ) awS127S0101000_19.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1261750iwH) obj).Kk0(new C1261480ivq(awS127S0101000_19.i1, ((C1261650iw7) awS127S0101000_19.l0).LLILZIL));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1261750iwH) obj).Kk0(new C1261350ivd(awS127S0101000_19.i1, (C1261860iwS) awS127S0101000_19.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        boolean z;
        C1262050iwl c1262050iwl;
        C1262090iwp c1262090iwp = (C1262090iwp) obj;
        c1262090iwp.LIZ = awS127S0101000_19.i1;
        RecFriendsFragment.LLJJIJIL.getClass();
        c1262090iwp.LJIILIIL = RecFriendsFragment.LLJJJIL;
        int i = 0;
        if (((Number) C278720AwA.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        c1262090iwp.LJIJJLI = z;
        if (((RecFriendsFragment) awS127S0101000_19.l0).dS()) {
            c1262050iwl = new C1262050iwl(2131836020, R.attr.a1h, 43, 0, 0, 0, 0, 0, false, null, false, 8184);
        } else {
            i = 0;
            c1262050iwl = new C1262050iwl(2131834673, 0, 0, 0, 0, 0, 0, 0, false, null, false, 8190);
        }
        c1262090iwp.LJIIIIZZ = c1262050iwl;
        c1262090iwp.LJIIJJI = new C1262070iwn(i);
        c1262090iwp.LJJIIJ = ((RecFriendsFragment) awS127S0101000_19.l0).VR().getNewSuggestArea();
        c1262090iwp.LJJIII = C1607070rvF.LIZIZ.LJI().LJIIIIZZ(EnumC1606080rte.INBOX_SUGGESTED_ACCOUNT);
        c1262090iwp.LJJIJ = true;
        c1262090iwp.LJJJJJ = true;
        c1262090iwp.LJJJJL = ((RecFriendsFragment) awS127S0101000_19.l0).dS();
        if (((Boolean) ((RecFriendsFragment) awS127S0101000_19.l0).LLJJIJIIJIL.getValue()).booleanValue()) {
            c1262090iwp.LJFF = EnumC2274741E1w.CUSTOM_VIDEO_COVER;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        C291001Au c291001Au;
        C1250500ie8 c1250500ie8 = (C1250500ie8) obj;
        C491001vg c491001vg = new C491001vg(new Exception("load fail!"));
        UserProfileUserCardVM userProfileUserCardVM = (UserProfileUserCardVM) awS127S0101000_19.l0;
        int i = awS127S0101000_19.i1;
        userProfileUserCardVM.getClass();
        if (i == 0) {
            c291001Au = new C291001Au(2131850547);
        } else {
            c291001Au = null;
        }
        return C1250500ie8.LIZ(c1250500ie8, false, 0, 0, false, c491001vg, c291001Au, null, null, false, false, 970);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e1 -> B:10:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x00c7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS127S0101000_19 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS127S0101000_19.invoke$21(kotlin.jvm.internal.AwS127S0101000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((C1225010hz1) awS127S0101000_19.l0).LLILZ.LIZ(Integer.valueOf(awS127S0101000_19.i1), "cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        C1263190iyb c1263190iyb;
        C1265700j2e c1265700j2e = (C1265700j2e) ((AbstractC1264080j02) awS127S0101000_19.l0);
        P p = c1265700j2e.LIZJ;
        if (p instanceof C1263190iyb) {
            c1263190iyb = (C1263190iyb) p;
        } else {
            c1263190iyb = null;
        }
        List<T> list = c1265700j2e.LIZLLL;
        int i = awS127S0101000_19.i1;
        obj.getClass();
        return new C1263210iyd(false, c1263190iyb, true, i, list);
    }

    public static final Object invoke$25(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        List<T> list = ((C1264120j06) ((AbstractC1264080j02) awS127S0101000_19.l0)).LIZIZ;
        int i = awS127S0101000_19.i1;
        obj.getClass();
        return new C1263210iyd(false, null, false, i, list);
    }

    public static final Object invoke$26(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if (((MinisFragment) awS127S0101000_19.l0).hS() != null) {
            C1251150ifB c1251150ifB = (C1251150ifB) abstractC1250290idn;
            AwS33S0001000_19 awS33S0001000_19 = new AwS33S0001000_19(awS127S0101000_19.i1, 22);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJFF = awS33S0001000_19;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1261750iwH) obj).Kk0(new C1261350ivd(awS127S0101000_19.i1, (C1261770iwJ) awS127S0101000_19.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        final C1261860iwS c1261860iwS = ((C1261650iw7) awS127S0101000_19.l0).LLILZIL;
        final int i = awS127S0101000_19.i1;
        ((InterfaceC1261750iwH) obj).Kk0(new AbstractC1261460ivo<InterfaceC1262230ix3>(i, c1261860iwS) { // from class: X.0ivc
        });
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        return C1221150hsn.LIZ((C1221150hsn) obj, null, null, null, null, null, new C291001Au(new C1221260hsy((EnumC1221310ht3) awS127S0101000_19.l0, awS127S0101000_19.i1)), null, null, null, 991);
    }

    public static final Object invoke$6(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        TuxIconView tuxIconView = (TuxIconView) obj;
        int i = awS127S0101000_19.i1;
        HeaderCTARecommendButtonComponent headerCTARecommendButtonComponent = (HeaderCTARecommendButtonComponent) awS127S0101000_19.l0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    headerCTARecommendButtonComponent.getClass();
                    tuxIconView.setIconRes(R.raw.icon_spinner_normal);
                    tuxIconView.clearAnimation();
                    if (!C268330AfP.LJFF()) {
                        C786410Ut5.Fb(tuxIconView, 180.0f);
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600L);
                    tuxIconView.startAnimation(rotateAnimation);
                }
            } else {
                headerCTARecommendButtonComponent.Xp(tuxIconView, false);
            }
        } else {
            headerCTARecommendButtonComponent.Xp(tuxIconView, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        EnumC1249130ibv enumC1249130ibv;
        AbstractC1250290idn abstractC1250290idnLJJLIIIJLJLI;
        NavbarPlatformProtocol navbarPlatformProtocol = (NavbarPlatformProtocol) obj;
        NavbarBaseUIComponent navbarBaseUIComponent = (NavbarBaseUIComponent) awS127S0101000_19.l0;
        int i = navbarBaseUIComponent.LLJILLL;
        int i2 = awS127S0101000_19.i1;
        if (i != i2) {
            if (navbarPlatformProtocol != null) {
                navbarPlatformProtocol.LLJ = i2;
            }
            super/*com.ss.android.ugc.profile.platform.base.component.BaseUIComponent*/.Xn(i2);
            C1248940ibc c1248940ibcZp = ((NavbarBaseUIComponent) awS127S0101000_19.l0).zp();
            if (c1248940ibcZp != null && (enumC1249130ibv = c1248940ibcZp.LL) != null) {
                NavbarBaseUIComponent navbarBaseUIComponent2 = (NavbarBaseUIComponent) awS127S0101000_19.l0;
                int i3 = awS127S0101000_19.i1;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(navbarBaseUIComponent2);
                String value = enumC1249130ibv.getValue();
                if (value == null) {
                    value = "";
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, INavbarBaseAbility.class, value);
                if (iNavbarBaseAbility != null) {
                    if (navbarPlatformProtocol == null || (abstractC1250290idnLJJLIIIJLJLI = navbarPlatformProtocol.LJJLIIIJLJLI()) == null) {
                        abstractC1250290idnLJJLIIIJLJLI = navbarBaseUIComponent2.LLJL;
                    }
                    iNavbarBaseAbility.aP1(i3, abstractC1250290idnLJJLIIIJLJLI, navbarBaseUIComponent2.Jp());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS127S0101000_19 awS127S0101000_19, Object obj) {
        ((InterfaceC1219340hps) awS127S0101000_19.l0).LIZIZ(awS127S0101000_19.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, C1261650iw7 c1261650iw7, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1261650iw7;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, C1261860iwS c1261860iwS, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1261860iwS;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, C1608730rxv c1608730rxv, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1608730rxv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, FavoriteInvalidVideosServiceImpl favoriteInvalidVideosServiceImpl, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = favoriteInvalidVideosServiceImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, RecFriendsFragment recFriendsFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = recFriendsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(int i, HeaderCTARecommendButtonComponent headerCTARecommendButtonComponent, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = headerCTARecommendButtonComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(EnumC1221310ht3 enumC1221310ht3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1221310ht3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(C1225010hz1 c1225010hz1, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1225010hz1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(C1242300iQu c1242300iQu, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1242300iQu;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(C1261770iwJ c1261770iwJ, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1261770iwJ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S0101000_19(AbstractC1264080j02 abstractC1264080j02, AbstractC1264080j02<C1261860iwS> abstractC1264080j022, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1264080j02;
        this.i1 = abstractC1264080j022;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(MinisFragment minisFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = minisFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(UserProfileUserCardVM userProfileUserCardVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = userProfileUserCardVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(FollowingListAssem followingListAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = followingListAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS127S0101000_19(NavbarBaseUIComponent navbarBaseUIComponent, NavbarBaseUIComponent<T> navbarBaseUIComponent2, int i) {
        super(1);
        this.$t = i;
        this.l0 = navbarBaseUIComponent;
        this.i1 = navbarBaseUIComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0101000_19(InterfaceC1219340hps interfaceC1219340hps, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC1219340hps;
        this.i1 = i;
    }
}
