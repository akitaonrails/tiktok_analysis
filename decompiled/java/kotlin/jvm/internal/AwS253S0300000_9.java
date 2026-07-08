package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AbstractC1593880rZy;
import X.AbstractC2126608Uu;
import X.AbstractC2350809Ja;
import X.AbstractC634910OvJ;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C05P0;
import X.C05P1;
import X.C08S3;
import X.C09AY;
import X.C09R7;
import X.C0N6Y;
import X.C0N9C;
import X.C0NEG;
import X.C0NEH;
import X.C0NEI;
import X.C0NEK;
import X.C0NEN;
import X.C0NHH;
import X.C0NJT;
import X.C0NL3;
import X.C0NLD;
import X.C0OBG;
import X.C0OLV;
import X.C0OPQ;
import X.C0OV5;
import X.C0OVB;
import X.C0OVM;
import X.C0OYY;
import X.C0P0T;
import X.C0PEM;
import X.C0S8S;
import X.C0XI4;
import X.C0XPD;
import X.C0XQ7;
import X.C0Y8T;
import X.C11GO;
import X.C1210880hcE;
import X.C123100dR;
import X.C1252380ihA;
import X.C127M;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1334040kos;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C13IQ;
import X.C13LP;
import X.C1440005kM;
import X.C1524405xy;
import X.C15438062q;
import X.C1906580ziK;
import X.C1909107dp;
import X.C197039127h;
import X.C19EG;
import X.C1AF0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C290780BaW;
import X.C438710HIf;
import X.C467401rs;
import X.C591480NHu;
import X.C592280NKw;
import X.C592290NKx;
import X.C592300NKy;
import X.C602870Nkj;
import X.C606280NqE;
import X.C606500Nqa;
import X.C606540Nqe;
import X.C616200OEw;
import X.C619480ORm;
import X.C623670OdB;
import X.C623720OdG;
import X.C629600Omk;
import X.C629620Omm;
import X.C631370Opb;
import X.C631640Oq2;
import X.C632050Oqh;
import X.C632090Oql;
import X.C632410OrH;
import X.C632840Ory;
import X.C632880Os2;
import X.C632950Os9;
import X.C633020OsG;
import X.C635070OvZ;
import X.C724240Sb0;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.EnumC631120OpC;
import X.EnumC632420OrI;
import X.EnumC632860Os0;
import X.InterfaceC602830Nkf;
import X.InterfaceC602850Nkh;
import X.InterfaceC606300NqG;
import X.InterfaceC634840OvC;
import X.InterfaceC849390XTt;
import X.InterfaceC898260ZLs;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS14S1200000_9;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.entrance.api.EcSearchEntranceConfigApi;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.profile.BulletinBoardProfileNavBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS253S0300000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS253S0300000_9 awS253S0300000_9) {
        String str;
        C635070OvZ c635070OvZ = C635070OvZ.LIZ;
        SchemaParserData schemaParserData = ((MinisNotificationSettingFragment) awS253S0300000_9.l0).SR().schemaParserData;
        if (!((C11GO) ((C127M) awS253S0300000_9.l1)).LJIILIIL()) {
            str = "subscribed";
        } else {
            str = "unsubscribed";
        }
        c635070OvZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(schemaParserData.LIZLLL());
        linkedHashMap.put("click_position", str);
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_minis_notification_page_click", linkedHashMap);
        int i = 1;
        ((C127M) awS253S0300000_9.l1).LJIIJJI(true);
        if (((C11GO) ((C127M) awS253S0300000_9.l1)).LJIILIIL()) {
            i = 2;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) awS253S0300000_9.l2), C0PEM.LIZJ, null, new C467401rs((MinisNotificationSettingFragment) awS253S0300000_9.l0, i, (C127M) awS253S0300000_9.l1, null), 2);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static final Object invoke$1(AwS253S0300000_9 awS253S0300000_9) {
        EnumC632860Os0 enumC632860Os0;
        Fragment fragmentLIZLLL;
        final ProfileRecViewModel profileRecViewModel = (ProfileRecViewModel) awS253S0300000_9.l0;
        InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) awS253S0300000_9.l1;
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Function2) awS253S0300000_9.l2, (Function2<? super Boolean, ? super Boolean, Unit>) 379);
        C632880Os2 c632880Os2 = ((C632950Os9) profileRecViewModel.LLILLL.getValue()).LIZ;
        final ?? r5 = 1;
        if (C632840Ory.LIZ[c632880Os2.LIZIZ().ordinal()] == 1) {
            enumC632860Os0 = EnumC632860Os0.FOLLOWING;
        } else {
            enumC632860Os0 = EnumC632860Os0.TO_FOLLOW;
        }
        C0OVM c0ovm = new C0OVM();
        if (enumC632860Os0 == EnumC632860Os0.TO_FOLLOW) {
            r5 = 0;
        }
        c0ovm.LIZ.LIZLLL = r5;
        c0ovm.LIZJ(c632880Os2.LIZ);
        final C1252380ihA c1252380ihALIZ = c0ovm.LIZ();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (interfaceC898260ZLs != null) {
                interfaceC898260ZLs.AI2(c1252380ihALIZ, "fyp_profile_popup", AFwS292S0000000_9.get$arr$(43));
            }
            awS581S0100000_2.invoke(Boolean.valueOf((boolean) r5));
        } else {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                C0XPD.LIZJ(fragmentLIZLLL, "feed_popup", "click_profile_follow", null, new InterfaceC849390XTt() { // from class: X.0Or3
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        profileRecViewModel.LLILZLL.setValue(new C632260Or2(c1252380ihALIZ, r5));
                    }
                });
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS253S0300000_9 awS253S0300000_9) {
        Map<String, ? extends Object> map;
        String containerID = null;
        try {
            try {
                Object objLIZJ = C7740030o.LIZ().getGson().LIZJ(((EcSearchEntranceConfigApi.RealApi) EcSearchEntranceConfigApi.LIZ.getValue()).fetchEcSearchEntranceConfig(((InterfaceC602850Nkh) awS253S0300000_9.l0).getSource()).get(), HashMap.class);
                if (objLIZJ instanceof Map) {
                    map = (Map) objLIZJ;
                } else {
                    map = null;
                }
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                throw AbstractC2126608Uu.getCompatibleException(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1524405xy c1524405xy = C1524405xy.LIZ;
            String source = ((InterfaceC602850Nkh) awS253S0300000_9.l0).getSource();
            c1524405xy.getClass();
            Map<String, Map<String, Object>> map2 = C1524405xy.LIZIZ;
            if (!map2.containsKey(source)) {
                Keva repo = Keva.getRepo("ecommerce_search_repo");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ecom_search_entrance_config_data");
                sbLIZ.append(source);
                String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                if (C123100dR.LIZ(string)) {
                    Object objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, (Class<Object>) HashMap.class);
                    if ((objFromJson instanceof Map) && objFromJson != null) {
                        map2.put(source, (Map<String, Object>) objFromJson);
                    }
                }
            }
            map = (Map) ((LinkedHashMap) map2).get(source);
            C1AF0.LJFF(th, "EcGetSearchEntranceConfigMethod failed");
        }
        CompletionBlock completionBlock = (CompletionBlock) awS253S0300000_9.l1;
        InterfaceC634840OvC interfaceC634840OvC = ((C602870Nkj) awS253S0300000_9.l2).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC602830Nkf.class, containerID);
        ((InterfaceC602830Nkf) xBaseModelLIZJ).setResponse(map);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS253S0300000_9 awS253S0300000_9) {
        MusicTabInfo musicTabInfo;
        Integer numValueOf;
        String strLJFF;
        String userId;
        User user = (User) awS253S0300000_9.l0;
        if (user != null && (musicTabInfo = user.getMusicTabInfo()) != null) {
            MusicTabClaimInfo musicTabClaimInfo = musicTabInfo.musicTabClaimInfo;
            if (musicTabClaimInfo != null && musicTabClaimInfo.status != ClaimStatus.UNCLAIMED.getValue()) {
                strLJFF = new C0XI4(C632410OrH.LIZIZ(EnumC632420OrI.MUSIC_TAB_BANNER, user)).LJFF();
            } else {
                EnumC632420OrI enumC632420OrI = EnumC632420OrI.MUSIC_TAB_BANNER;
                ClaimStatus.Companion companion = ClaimStatus.Companion;
                MusicTabClaimInfo musicTabClaimInfo2 = musicTabInfo.musicTabClaimInfo;
                if (musicTabClaimInfo2 != null) {
                    numValueOf = Integer.valueOf(musicTabClaimInfo2.status);
                } else {
                    numValueOf = null;
                }
                strLJFF = new C0XI4(C632410OrH.LIZ(enumC632420OrI, companion.of(numValueOf))).LJFF();
            }
            SmartRouter.buildRoute(C786410Ut5.N3((Context) awS253S0300000_9.l1), strLJFF).open();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
            OriginMusicArg originMusicArg = (OriginMusicArg) awS253S0300000_9.l2;
            if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
                userId = "";
            }
            c2344009Gk.LJIIIIZZ("to_user_id", userId);
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, C632050Oqh.LIZJ(user));
            C20684815ws.LJIILLIIL("apply_music_tab_click", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS253S0300000_9 awS253S0300000_9) {
        ((MusicPlayViewModel) awS253S0300000_9.l2).AQ2((C632090Oql) ((C05P0) awS253S0300000_9.l0).getValue(), ((Number) ((C05P1) awS253S0300000_9.l1).getValue()).intValue(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS253S0300000_9 awS253S0300000_9) {
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS253S0300000_9.l0).getValue();
        C631640Oq2 c631640Oq2 = (C631640Oq2) awS253S0300000_9.l1;
        ((OriginMusicListViewModel) awS253S0300000_9.l2).xQ2(c632090Oql);
        HashMap map = new HashMap();
        map.put("music_id", c632090Oql.getMusicModel().getMusicId());
        map.put("song_number", String.valueOf(c632090Oql.getMusicItemModel().similarMusicSize));
        String str = c631640Oq2.LIZ;
        if (str == null) {
            str = "";
        }
        map.put("to_user_id", str);
        C20684815ws.LJIILLIIL("similar_song_click", map);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS253S0300000_9 awS253S0300000_9) {
        ((MusicPlayViewModel) awS253S0300000_9.l2).xQ2((C632090Oql) ((C05P0) awS253S0300000_9.l0).getValue(), ((Number) ((C05P1) awS253S0300000_9.l1).getValue()).intValue(), false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS253S0300000_9 awS253S0300000_9) {
        ((MusicPlayViewModel) awS253S0300000_9.l2).vQ2((C632090Oql) ((C05P0) awS253S0300000_9.l0).getValue(), ((Number) ((C05P1) awS253S0300000_9.l1).getValue()).intValue(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS253S0300000_9 awS253S0300000_9) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((PdpViewModel) awS253S0300000_9.l0), null, null, new C592300NKy((C0NLD) awS253S0300000_9.l1, (PdpViewModel) awS253S0300000_9.l0, (C592290NKx) awS253S0300000_9.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS253S0300000_9 awS253S0300000_9) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((PdpViewModel) awS253S0300000_9.l0), null, null, new C0NL3((C0NLD) awS253S0300000_9.l1, (PdpViewModel) awS253S0300000_9.l0, (C592280NKw) awS253S0300000_9.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS253S0300000_9 awS253S0300000_9) {
        StringBuilder sb = new StringBuilder();
        sb.append(((FeedItemList) awS253S0300000_9.l0).getRequestId());
        sb.append(' ');
        sb.append(((C0N6Y) awS253S0300000_9.l1).LIZ());
        sb.append(" delete items, ");
        List list = (List) awS253S0300000_9.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList);
        return sb.toString();
    }

    public static final Object invoke$19(AwS253S0300000_9 awS253S0300000_9) {
        StringBuilder sb = new StringBuilder();
        sb.append(((FeedItemList) awS253S0300000_9.l0).getRequestId());
        sb.append(' ');
        sb.append(((C0N6Y) awS253S0300000_9.l1).LIZ());
        sb.append(" insert items, ");
        List list = (List) awS253S0300000_9.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList);
        return sb.toString();
    }

    public static final Object invoke$2(AwS253S0300000_9 awS253S0300000_9) {
        ((C629620Omm) awS253S0300000_9.l0).getClass();
        AbstractC1593880rZy.LJ("music_detail_page", "add_song_button", "Add Song directly to your Music Library", "music", "tt_to_dsp", "4010");
        ((C629620Omm) awS253S0300000_9.l0).LIZJ("4010");
        C633020OsG.LIZIZ.LJJIIZ(EnumC631120OpC.MUSIC_DETAIL, (C629600Omk) awS253S0300000_9.l1);
        ((Function0) awS253S0300000_9.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS253S0300000_9 awS253S0300000_9) {
        AbstractC738140SxQ abstractC738140SxQ;
        AssemSupervisor assemSupervisorLJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AbstractC738140SxQ next;
        ReusedAssem<?> reusedAssem = ((AbstractC634910OvJ) awS253S0300000_9.l0).LLILLL;
        AbstractC738140SxQ abstractC738140SxQ2 = null;
        if (reusedAssem != null && (assemSupervisorLJ = C724240Sb0.LJ(reusedAssem)) != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            C13IQ c13iq = (C13IQ) awS253S0300000_9.l2;
            Iterator<AbstractC738140SxQ> it2 = copyOnWriteArrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getClass().isAssignableFrom(C09R7.LIZ(c13iq))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            abstractC738140SxQ = next;
        } else {
            abstractC738140SxQ = null;
        }
        Function1 function1 = (Function1) awS253S0300000_9.l1;
        if (function1 != null) {
            if (abstractC738140SxQ instanceof ReusedAssem) {
                abstractC738140SxQ2 = abstractC738140SxQ;
            }
            function1.invoke(abstractC738140SxQ2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS253S0300000_9 awS253S0300000_9) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NJT((C0S8S) awS253S0300000_9.l0, (Aweme) awS253S0300000_9.l1, (Function0) awS253S0300000_9.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS253S0300000_9 awS253S0300000_9) {
        C0NHH c0nhh;
        C591480NHu c591480NHuLJFF = ((C0NEG) awS253S0300000_9.l0).LJFF((C0NEN) awS253S0300000_9.l1);
        if (c591480NHuLJFF.LIZ && (c0nhh = c591480NHuLJFF.LIZIZ) != null) {
            Aweme aweme = c0nhh.LIZLLL;
            if (aweme != null) {
                AwemeBizExtKt.setCacheSourceType(aweme, C0N9C.COLD_CACHE.ordinal());
            }
            ((C0NEK) awS253S0300000_9.l2).LIZ(c591480NHuLJFF);
        } else {
            ((C0NEK) awS253S0300000_9.l2).LIZ(new C591480NHu(false, (C0NHH) null, "syncPoll return null", 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS253S0300000_9 awS253S0300000_9) {
        C0NHH c0nhh;
        C591480NHu c591480NHuLJFF = ((C0NEH) awS253S0300000_9.l0).LJFF((C0NEN) awS253S0300000_9.l1);
        if (c591480NHuLJFF.LIZ && (c0nhh = c591480NHuLJFF.LIZIZ) != null) {
            Aweme aweme = c0nhh.LIZLLL;
            if (aweme != null) {
                AwemeBizExtKt.setCacheSourceType(aweme, C0N9C.MERGE_CACHE.ordinal());
            }
            ((C0NEK) awS253S0300000_9.l2).LIZ(c591480NHuLJFF);
        } else {
            ((C0NEK) awS253S0300000_9.l2).LIZ(new C591480NHu(false, (C0NHH) null, "syncPoll return null", 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS253S0300000_9 awS253S0300000_9) {
        C0NHH c0nhh;
        C591480NHu c591480NHuLJFF = ((C0NEI) awS253S0300000_9.l0).LJFF((C0NEN) awS253S0300000_9.l1);
        if (c591480NHuLJFF.LIZ && (c0nhh = c591480NHuLJFF.LIZIZ) != null) {
            Aweme aweme = c0nhh.LIZLLL;
            if (aweme != null) {
                AwemeBizExtKt.setCacheSourceType(aweme, C0N9C.FEED_UNCONSUMED.ordinal());
            }
            ((C0NEK) awS253S0300000_9.l2).LIZ(c591480NHuLJFF);
        } else {
            ((C0NEK) awS253S0300000_9.l2).LIZ(new C591480NHu(false, (C0NHH) null, "syncPoll return null", 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS253S0300000_9 awS253S0300000_9) {
        Boolean boolIsLSContent;
        ((C0P0T) awS253S0300000_9.l0).dismiss();
        ARunnableS14S1200000_9 aRunnableS14S1200000_9 = ((VideoFavoriteAssem) awS253S0300000_9.l1).LLLII;
        if (aRunnableS14S1200000_9 != null) {
            aRunnableS14S1200000_9.run();
        }
        IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
        C19EG c19eg = (C19EG) awS253S0300000_9.l2;
        String aid = ((VideoItemParams) C631370Opb.LIZ((VideoFavoriteAssem) awS253S0300000_9.l1)).getAweme().getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        String str2 = ((VideoItemParams) C631370Opb.LIZ((VideoFavoriteAssem) awS253S0300000_9.l1)).mEventType;
        if (str2 != null) {
            str = str2;
        }
        LocalServiceInfo localServiceInfo = ((VideoItemParams) C631370Opb.LIZ((VideoFavoriteAssem) awS253S0300000_9.l1)).getAweme().getLocalServiceInfo();
        if (localServiceInfo != null) {
            boolIsLSContent = localServiceInfo.isLSContent();
        } else {
            boolIsLSContent = null;
        }
        iFavoriteService.LJJJJI(c19eg, aid, str, boolIsLSContent);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS253S0300000_9 awS253S0300000_9) {
        String str;
        UrlModel urlModel = (UrlModel) awS253S0300000_9.l0;
        if (urlModel != null) {
            final SmartImageView smartImageView = (SmartImageView) ((C0OV5) awS253S0300000_9.l1).LIZ.findViewById(R.id.d2h);
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            C1334040kos.LIZ.getClass();
            final String strLIZLLL = C1334040kos.LIZLLL(str);
            if (C290780BaW.LIZ()) {
                ExecutorService executorService = C623720OdG.LIZ;
                C623670OdB c623670OdB = new C623670OdB();
                c623670OdB.LIZ = urlModel;
                c623670OdB.LIZIZ = smartImageView;
                c623670OdB.LIZJ = "bulletin_list_photo_cover";
                c623670OdB.LIZLLL = EnumC1334360kpO.HIGH;
                c623670OdB.LJ = ((C0OV5) awS253S0300000_9.l1).LIZLLL((BulletinPhotoItem) awS253S0300000_9.l2);
                c623670OdB.LJFF = Bitmap.Config.ARGB_8888;
                c623670OdB.LJI = true;
                c623670OdB.LJII = true;
                c623670OdB.LIZ();
            } else {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                final C0OV5 c0ov5 = (C0OV5) awS253S0300000_9.l1;
                final BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) awS253S0300000_9.l2;
                c1331670kl3LJIIIIZZ.LJIILLIIL(new AbstractC2350809Ja() { // from class: X.0OdC
                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                        if (file == null) {
                            return;
                        }
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("file_size", Long.valueOf(file.length())), new Pair("download_duration", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
                        c1331670kl3LJII.LJJ(smartImageView);
                        c1331670kl3LJII.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJII.LIZLLL = true;
                        c1331670kl3LJII.LJJI = c0ov5.LIZLLL(bulletinPhotoItem);
                        C1334040kos c1334040kos = C1334040kos.LIZ;
                        String str2 = strLIZLLL;
                        long j = jCurrentTimeMillis;
                        c1334040kos.getClass();
                        c1331670kl3LJII.LJJJIL = new C1334050kot(new C259800zU(), "bulletin_list_photo_cover", str2, mapLJIIIIZZ, j);
                        c1331670kl3LJII.LJIIJJI();
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                        String message;
                        String message2;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C1334040kos c1334040kos = C1334040kos.LIZ;
                        String str2 = strLIZLLL;
                        EnumC623730OdH enumC623730OdH = EnumC623730OdH.ERROR;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("download failed: ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        sbLIZ.append(", duration=");
                        sbLIZ.append(jCurrentTimeMillis2);
                        sbLIZ.append("ms");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        long j = jCurrentTimeMillis;
                        c1334040kos.getClass();
                        C1334040kos.LJFF("bulletin_list_photo_cover", str2, enumC623730OdH, strLIZIZ, j);
                        if (th == null || (message2 = th.getMessage()) == null) {
                            message2 = "download failed";
                        }
                        C1334040kos.LJIIIIZZ(jCurrentTimeMillis2, "bulletin_list_photo_cover", message2);
                    }
                });
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS253S0300000_9 awS253S0300000_9) {
        String str;
        UrlModel urlModel = (UrlModel) awS253S0300000_9.l0;
        if (urlModel != null) {
            ((C0OVB) awS253S0300000_9.l1).LJIILJJIL = (BulletinPhotoItem) awS253S0300000_9.l2;
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            C1334040kos.LIZ.getClass();
            C1334040kos.LIZLLL(str);
            if (C290780BaW.LIZ()) {
                ExecutorService executorService = C623720OdG.LIZ;
                C623670OdB c623670OdB = new C623670OdB();
                c623670OdB.LIZ = urlModel;
                C0OVB c0ovb = (C0OVB) awS253S0300000_9.l1;
                c623670OdB.LIZIZ = c0ovb.LIZIZ;
                c623670OdB.LIZJ = "bulletin_list_photo_cover";
                c623670OdB.LIZLLL = EnumC1334360kpO.HIGH;
                c623670OdB.LJ = c0ovb.LIZLLL((BulletinPhotoItem) awS253S0300000_9.l2);
                c623670OdB.LJFF = Bitmap.Config.ARGB_8888;
                c623670OdB.LJI = true;
                c623670OdB.LJII = true;
                c623670OdB.LIZ();
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ.LJIILLIIL(((C0OVB) awS253S0300000_9.l1).LJIILL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS253S0300000_9 awS253S0300000_9) {
        if (!C0OBG.LIZ(1000L, (View) awS253S0300000_9.l0)) {
            String str = null;
            try {
                C19EG c19egLIZ = C724240Sb0.LIZ((BulletinBoardProfileNavBarAssem) awS253S0300000_9.l1);
                if (c19egLIZ != null) {
                    BulletinShareModel bulletinShareModel = (BulletinShareModel) awS253S0300000_9.l2;
                    BulletinBoardProfileNavBarAssem bulletinBoardProfileNavBarAssem = (BulletinBoardProfileNavBarAssem) awS253S0300000_9.l1;
                    BulletinBoardInviteSharePackage.Companion.getClass();
                    C0OYY.LIZ(bulletinShareModel, c19egLIZ, "bulletin_board_detail_page", "share_button");
                    C0OPQ c0opq = C0OPQ.LIZ;
                    C0OLV c0olv = (C0OLV) bulletinBoardProfileNavBarAssem.LLIZLLLIL.getValue();
                    if (c0olv != null) {
                        str = c0olv.LL;
                    }
                    C0OPQ.LJIIIIZZ(c0opq, String.valueOf(str), "share_channel", bulletinBoardProfileNavBarAssem.Go().IE(), bulletinBoardProfileNavBarAssem.Go().qF(), null, 16);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS253S0300000_9 awS253S0300000_9) {
        StringBuilder sb = new StringBuilder("batch delete ");
        List list = (List) awS253S0300000_9.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList);
        sb.append(" at ");
        sb.append(((C606540Nqe) awS253S0300000_9.l1).LIZLLL);
        sb.append(" at by ");
        sb.append(((C606500Nqa) awS253S0300000_9.l2).LIZ);
        sb.append(", result=");
        sb.append(((C606540Nqe) awS253S0300000_9.l1).LIZ);
        return sb.toString();
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS253S0300000_9 awS253S0300000_9) {
        FragmentManager supportFragmentManager;
        C619480ORm.LIZ.getClass();
        C01GW c01gw = C619480ORm.LIZIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showed_tips_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            Keva keva2 = (Keva) c01gw.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showed_tips_");
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(((C616200OEw) awS253S0300000_9.l0).getContext()), R.layout.bd7, (C616200OEw) awS253S0300000_9.l0, false);
            C786410Ut5.U8((C197039127h) viewTd.findViewById(R.id.pk7), new ACListenerS144S0100000_9(viewTd, 119));
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C616200OEw) awS253S0300000_9.l0).getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
                tuxSheet.LLJJIII = viewTd;
                tuxSheet.show(supportFragmentManager, "hashtag_tips");
            }
        } else {
            Activity activityLIZ = C1388190mED.LIZ((Context) awS253S0300000_9.l1);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131836311);
                c1389890mGx.LJIIJJI();
            }
        }
        ((C616200OEw) awS253S0300000_9.l0).getSubmitFromXml().setLoading(false);
        if (((C616200OEw) awS253S0300000_9.l0).getShouldDislike()) {
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "hashtag_filter", ((C616200OEw) awS253S0300000_9.l0).getMAweme()));
        }
        Function1 function1 = (Function1) awS253S0300000_9.l2;
        if (function1 != null) {
            function1.invoke((C616200OEw) awS253S0300000_9.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS253S0300000_9 awS253S0300000_9) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMSource-getAllConversations: ");
        sbLIZ.append(((Map) awS253S0300000_9.l0).size());
        sbLIZ.append(", ");
        sbLIZ.append(((List) awS253S0300000_9.l1).size());
        sbLIZ.append(", ");
        List list = (List) awS253S0300000_9.l2;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS253S0300000_9 awS253S0300000_9) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = ((C606280NqE) awS253S0300000_9.l0).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC606300NqG.class, containerID);
        Map<String, ? extends Object> map = (Map) awS253S0300000_9.l2;
        InterfaceC606300NqG interfaceC606300NqG = (InterfaceC606300NqG) xBaseModelLIZJ;
        interfaceC606300NqG.setCode(1);
        interfaceC606300NqG.setMsg("success");
        interfaceC606300NqG.setData(map);
        ((CompletionBlock) awS253S0300000_9.l1).onSuccess(interfaceC606300NqG, "success");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C05P0 c05p0, C05P0 c05p02, MusicPlayViewModel musicPlayViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = musicPlayViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(C05P0 c05p0, C05P0<C632090Oql> c05p02, C631640Oq2 c631640Oq2, OriginMusicListViewModel originMusicListViewModel) {
        super(0);
        this.$t = originMusicListViewModel;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c631640Oq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C0NEG c0neg, C0NEN c0nen, C0NEK c0nek, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0neg;
        this.l1 = c0nen;
        this.l2 = c0nek;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C0NEH c0neh, C0NEN c0nen, C0NEK c0nek, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0neh;
        this.l1 = c0nen;
        this.l2 = c0nek;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C0NEI c0nei, C0NEN c0nen, C0NEK c0nek, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0nei;
        this.l1 = c0nen;
        this.l2 = c0nek;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(InterfaceC602850Nkh interfaceC602850Nkh, InterfaceC602850Nkh interfaceC602850Nkh2, CompletionBlock<InterfaceC602830Nkf> completionBlock, C602870Nkj c602870Nkj) {
        super(0);
        this.$t = c602870Nkj;
        this.l0 = interfaceC602850Nkh;
        this.l1 = interfaceC602850Nkh2;
        this.l2 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(C606280NqE c606280NqE, C606280NqE c606280NqE2, CompletionBlock<InterfaceC606300NqG> completionBlock, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = c606280NqE;
        this.l1 = c606280NqE2;
        this.l2 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C606540Nqe c606540Nqe, C606500Nqa c606500Nqa, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = c606540Nqe;
        this.l2 = c606500Nqa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(C616200OEw c616200OEw, C616200OEw c616200OEw2, Context context, Function1<? super View, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c616200OEw;
        this.l1 = c616200OEw2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(C629620Omm c629620Omm, C629620Omm c629620Omm2, C629600Omk c629600Omk, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c629620Omm;
        this.l1 = c629620Omm2;
        this.l2 = c629600Omk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(AbstractC634910OvJ abstractC634910OvJ, AbstractC634910OvJ<Object> abstractC634910OvJ2, Function1<? super ReusedAssem<?>, Unit> function1, C13IQ<? extends ReusedAssem<?>> c13iq) {
        super(0);
        this.$t = c13iq;
        this.l0 = abstractC634910OvJ;
        this.l1 = abstractC634910OvJ2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C0P0T c0p0t, VideoFavoriteAssem videoFavoriteAssem, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0p0t;
        this.l1 = videoFavoriteAssem;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(C0S8S c0s8s, Aweme aweme, AwS555S0100000_11 awS555S0100000_11, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0s8s;
        this.l1 = aweme;
        this.l2 = awS555S0100000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(View view, BulletinBoardProfileNavBarAssem bulletinBoardProfileNavBarAssem, BulletinShareModel bulletinShareModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = bulletinBoardProfileNavBarAssem;
        this.l2 = bulletinShareModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(UrlModel urlModel, C0OV5 c0ov5, BulletinPhotoItem bulletinPhotoItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = c0ov5;
        this.l2 = bulletinPhotoItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(UrlModel urlModel, C0OVB c0ovb, BulletinPhotoItem bulletinPhotoItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = urlModel;
        this.l1 = c0ovb;
        this.l2 = bulletinPhotoItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(PdpViewModel pdpViewModel, C0NLD c0nld, C592280NKw c592280NKw, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = c0nld;
        this.l2 = c592280NKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(PdpViewModel pdpViewModel, C0NLD c0nld, C592290NKx c592290NKx, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = c0nld;
        this.l2 = c592290NKx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(FeedItemList feedItemList, FeedItemList feedItemList2, C0N6Y c0n6y, List<? extends Aweme> list) {
        super(0);
        this.$t = list;
        this.l0 = feedItemList;
        this.l1 = feedItemList2;
        this.l2 = c0n6y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(MinisNotificationSettingFragment minisNotificationSettingFragment, C127M c127m, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = minisNotificationSettingFragment;
        this.l1 = c127m;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0300000_9(User user, Context context, OriginMusicArg originMusicArg, int i) {
        super(0);
        this.$t = i;
        this.l0 = user;
        this.l1 = context;
        this.l2 = originMusicArg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(ProfileRecViewModel profileRecViewModel, ProfileRecViewModel profileRecViewModel2, InterfaceC898260ZLs interfaceC898260ZLs, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        super(0);
        this.$t = function2;
        this.l0 = profileRecViewModel;
        this.l1 = profileRecViewModel2;
        this.l2 = interfaceC898260ZLs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS253S0300000_9(Map map, Map<String, C0Y8T> map2, List<C0Y8T> list, List<C0Y8T> list2) {
        super(0);
        this.$t = list2;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = list;
    }
}
