package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AbstractC621770Oa7;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C034R;
import X.C09AE;
import X.C09AY;
import X.C0LAB;
import X.C0NRN;
import X.C0NVR;
import X.C0O0B;
import X.C0O2K;
import X.C0O9L;
import X.C0OD0;
import X.C0OLV;
import X.C0OPX;
import X.C0ORG;
import X.C0OUZ;
import X.C0PEM;
import X.C0SUG;
import X.C1177570gkV;
import X.C1251150ifB;
import X.C1252710ihh;
import X.C12ES;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C13Z4;
import X.C1440005kM;
import X.C1558520qew;
import X.C1667330tUR;
import X.C1674010tfD;
import X.C1687430u0r;
import X.C1720106oR;
import X.C1906580ziK;
import X.C19651011uW;
import X.C19719212De;
import X.C19EG;
import X.C20088213iq;
import X.C20663515tR;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2214851BmN;
import X.C2222691Bz1;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C291001Au;
import X.C447520Hgk;
import X.C599880Nfu;
import X.C607440Ns6;
import X.C608530Ntr;
import X.C608590Ntx;
import X.C610200NwY;
import X.C612130Nzf;
import X.C615070OAn;
import X.C621180OYa;
import X.C621760Oa6;
import X.C623610Od5;
import X.C624550Oeb;
import X.C625130OfX;
import X.C631370Opb;
import X.C632090Oql;
import X.C634850OvD;
import X.C690870R8b;
import X.C704830Rkn;
import X.C724270Sb3;
import X.C733420Spo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.C866950Xzh;
import X.InterfaceC1369790lkX;
import X.InterfaceC1680500tpg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634010Otr;
import X.InterfaceC665370Q7z;
import X.InterfaceC898260ZLs;
import Y.ATListenerS443S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.components.tabs.TabChildParams;
import com.ss.android.ugc.aweme.components.tabs.TabFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareSensorConfigProvider;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.create.BulletinBoardCreateAnimAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.profile.BulletinBoardProfileInfoAssem;
import com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchMainNavBarAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightAutoPostSwitchCell;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.layout.VerticalComponentViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.MusicListAssem;
import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPUGCPlayAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.music.v2.assem.story.StoryMusicCoverAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitCardCell;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profilerec.ui.ProfileRecFragment;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public class AwS445S0200000_9 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(C013C c013c, C013C c013c2, C259800zU<ECSystemPhotoModel> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = c013c;
        this.l1 = c013c2;
    }

    public static final Object invoke$0(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        Activity activityLIZ;
        String strEnterFrom;
        Activity activityLIZIZ;
        String str = (String) obj;
        if (((Boolean) obj2).booleanValue()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            if (activityLIZ instanceof C19EG) {
                C0O9L c0o9l = C0O9L.LIZ;
                C19EG c19eg = (C19EG) activityLIZ;
                CommentContextSource commentContextSource = (CommentContextSource) awS445S0200000_9.l0;
                if (commentContextSource == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource)) == null) {
                    strEnterFrom = "";
                }
                View view = (View) awS445S0200000_9.l1;
                c0o9l.getClass();
                C0O9L.LIZJ(c19eg, str, strEnterFrom, view);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1674010tfD.LIZ(((TabFragment) awS445S0200000_9.l0).getChildFragmentManager(), C1687430u0r.LIZ(((TabChildParams) awS445S0200000_9.l1).components), null, (VerticalComponentViewModel) ((TabFragment) awS445S0200000_9.l0).LL.getValue(), null, interfaceC1680500tpg, 0, 20);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS445S0200000_9 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            X.0SxQ r11 = (X.AbstractC738140SxQ) r11
            X.01Au r12 = (X.C291001Au) r12
            T r4 = r12.LIZ
            com.ss.android.ugc.aweme.music.model.MusicGroup r4 = (com.ss.android.ugc.aweme.music.model.MusicGroup) r4
            if (r4 == 0) goto L5c
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem r0 = (com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem) r0
            java.lang.Object r2 = r10.l1
            X.00zU r2 = (X.C259800zU) r2
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r3 = r0.Ap()
            r3.getClass()
            r5 = 0
            r10 = 62
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            java.util.List r0 = com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.vQ2(r3, r4, r5, r6, r7, r8, r9, r10)
            r3.listSetItems(r0)
            r0 = 897(0x381, float:1.257E-42)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r3.setState(r0)
            com.ss.android.ugc.aweme.music.model.Music r0 = r4.getSourceMusic()
            if (r0 == 0) goto L3c
            java.lang.String r1 = r0.getIdStr()
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = ""
        L3e:
            T r0 = r2.element
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L5c
            r2.element = r1
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r11)
            if (r0 == 0) goto L5c
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131837966(0x7f11440e, float:1.9309142E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$10(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        if (((OriginMusicListViewModel) awS445S0200000_9.l0).LLJ) {
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) PluggableExtentionKt.pluggableSpi$default(IProfileMusicTabService.class, false, false, false, 14, null);
            if (iProfileMusicTabService != null) {
                iProfileMusicTabService.LIZIZ();
            }
        } else {
            ((MusicListComposableAssem) awS445S0200000_9.l1).LLJJL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MusicPgcMetaInfoAssem musicPgcMetaInfoAssem = (MusicPgcMetaInfoAssem) awS445S0200000_9.l0;
        View view = (View) awS445S0200000_9.l1;
        musicPgcMetaInfoAssem.getClass();
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem = (MusicPgcMetaInfoWithArtistAssem) awS445S0200000_9.l0;
        View view = (View) awS445S0200000_9.l1;
        musicPgcMetaInfoWithArtistAssem.getClass();
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        if (interfaceC665370Q7zLJIIL != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMDPAutoPlayAbility.class, null)) != null) {
            iMDPAutoPlayAbility.Fq2(true);
        }
        ((StoryMusicCoverAssem) awS445S0200000_9.l0).sp().wQ2((Music) awS445S0200000_9.l1, false, true, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String str;
        Boolean boolValueOf;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mob Show Poi Card poiName: ");
        PoiRevisitCardItem item = ((PoiRevisitCardCell) awS445S0200000_9.l0).getItem();
        String str3 = null;
        if (item != null) {
            str = item.poiName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("  skeleton: ");
        PoiRevisitCardItem item2 = ((PoiRevisitCardCell) awS445S0200000_9.l0).getItem();
        if (item2 != null) {
            boolValueOf = Boolean.valueOf(item2.LL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiRevisitCardItem item3 = ((PoiRevisitCardCell) awS445S0200000_9.l0).getItem();
        if (item3 == null || !item3.LL) {
            C1177570gkV c1177570gkV = C1177570gkV.LIZ;
            String str4 = ((PoiRevisitCardCell) awS445S0200000_9.l0).I5().LLILZIL;
            IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) awS445S0200000_9.l1;
            c1177570gkV.getClass();
            String strLIZ = C1177570gkV.LIZ(iPoiRevisitNavAssemAbility);
            PoiRevisitCardItem item4 = ((PoiRevisitCardCell) awS445S0200000_9.l0).getItem();
            if (item4 != null) {
                str3 = item4.poiId;
            }
            PoiRevisitCardItem item5 = ((PoiRevisitCardCell) awS445S0200000_9.l0).getItem();
            if (item5 == null || (str2 = item5.keyCategory) == null) {
                str2 = "";
            }
            C1177570gkV.LJ(str4, strLIZ, "vertical", str3, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String str;
        Boolean boolValueOf;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mob Show Poi Card poiName: ");
        PoiRevisitCardItem item = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).getItem();
        String str3 = null;
        if (item != null) {
            str = item.poiName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("  skeleton: ");
        PoiRevisitCardItem item2 = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).getItem();
        if (item2 != null) {
            boolValueOf = Boolean.valueOf(item2.LL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiRevisitCardItem item3 = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).getItem();
        if (item3 == null || !item3.LL) {
            C1177570gkV c1177570gkV = C1177570gkV.LIZ;
            String str4 = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).L5().LLILZIL;
            IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) awS445S0200000_9.l1;
            c1177570gkV.getClass();
            String strLIZ = C1177570gkV.LIZ(iPoiRevisitNavAssemAbility);
            PoiRevisitCardItem item4 = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).getItem();
            if (item4 != null) {
                str3 = item4.poiId;
            }
            PoiRevisitCardItem item5 = ((PoiRevisitHorizontalCell) awS445S0200000_9.l0).getItem();
            if (item5 == null || (str2 = item5.keyCategory) == null) {
                str2 = "";
            }
            C1177570gkV.LJ(str4, strLIZ, "horizontal", str3, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) ((C01GW) awS445S0200000_9.l1).getValue();
            ProfileRecFragment profileRecFragment = (ProfileRecFragment) awS445S0200000_9.l0;
            C1667330tUR.LJ(interfaceC898260ZLs, profileRecFragment.LL, (ProfileRecViewModel) profileRecFragment.LLILLJJLI.getValue(), interfaceC1680500tpg, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS445S0200000_9.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C634850OvD.LIZ((ComposeView) awS445S0200000_9.l0, null, C13Z4.LIZJ(-1692004714, new AwS647S0100000_33((SettingsComposeRvmpFragment) awS445S0200000_9.l1, 27), interfaceC1680500tpg), interfaceC1680500tpg, 392, 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS445S0200000_9 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r0 = r8 instanceof X.C614080O6s
            r5 = 0
            if (r0 == 0) goto L6a
            X.0O6s r8 = (X.C614080O6s) r8
            if (r8 == 0) goto L6b
            java.lang.Throwable r1 = r8.getE()
        Lf:
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L67
            X.093u r1 = (X.C23112093u) r1
            if (r1 == 0) goto L67
            int r0 = r1.getErrorCode()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "api"
        L21:
            if (r8 == 0) goto L65
            java.lang.Throwable r1 = r8.getE()
        L27:
            boolean r0 = r1 instanceof X.C1494690ozz
            if (r0 == 0) goto L39
            X.0ozz r1 = (X.C1494690ozz) r1
            if (r1 == 0) goto L39
            int r0 = r1.getCronetInternalErrorCode()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "net"
        L39:
            X.0O8a r2 = new X.0O8a
            r2.<init>()
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel r1 = (com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel) r1
            java.lang.String r0 = r1.LLILZIL
            r2.LIZLLL = r0
            java.lang.String r0 = "click_fav_button"
            r2.LJIILLIIL = r0
            r2.LJIIZILJ = r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LL
            if (r0 == 0) goto L54
            java.lang.String r5 = r0.getAid()
        L54:
            r2.LJIJI = r5
            r2.LJIJ = r3
            r2.LJIILJJIL()
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L65:
            r1 = r5
            goto L27
        L67:
            r4 = r5
            r3 = r5
            goto L21
        L6a:
            r8 = r5
        L6b:
            r1 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$19(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        Function2 function2 = (Function2) awS445S0200000_9.l0;
        if (function2 != null) {
            function2.invoke(obj, obj2);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_success", "2");
        C20684815ws.LJIILLIIL("collection_request_result", c2344009Gk.LIZ);
        ((C09AE) awS445S0200000_9.l1).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String str = (String) obj;
        if (((Boolean) obj2).booleanValue()) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF instanceof C19EG) {
                View viewFindViewById = ((View) awS445S0200000_9.l0).getRootView().findViewById(R.id.rlb);
                C0O9L c0o9l = C0O9L.LIZ;
                C19EG c19eg = (C19EG) activityLJFF;
                String str2 = ((PostModeFavoriteViewModel) awS445S0200000_9.l1).LLILZIL;
                if (str2 == null) {
                    str2 = "graphic_detail";
                }
                if (viewFindViewById == null) {
                    viewFindViewById = (View) awS445S0200000_9.l0;
                }
                c0o9l.getClass();
                C0O9L.LIZJ(c19eg, str, str2, viewFindViewById);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        Integer numValueOf;
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = null;
        if (addYoursStickerStruct != null) {
            AddYoursCollectionCellAssem addYoursCollectionCellAssem = (AddYoursCollectionCellAssem) awS445S0200000_9.l0;
            C19EG c19eg = (C19EG) awS445S0200000_9.l1;
            Aweme aweme = ((C615070OAn) C631370Opb.LIZ(addYoursCollectionCellAssem)).LLILZLL;
            if (aweme != null) {
                numValueOf = Integer.valueOf(AwemeExtKt.getFollowStatus(aweme));
            } else {
                numValueOf = null;
            }
            AddYourRecordParam addYourRecordParam = new AddYourRecordParam(addYoursStickerStruct, false, false, "personal_homepage", "add_yours", "personal_homepage_favourite_shoot", String.valueOf(numValueOf), true, !zBooleanValue, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false);
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C724270Sb3 c724270Sb3 = addYoursCollectionCellAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            }
            c19651011uW.LIZLLL(c19eg, ((C615070OAn) obj3).LLILZLL, addYourRecordParam);
        } else {
            AddYoursCollectionCellAssem addYoursCollectionCellAssem2 = (AddYoursCollectionCellAssem) awS445S0200000_9.l0;
            ((C1389890mGx) addYoursCollectionCellAssem2.LLJZ.getValue()).LJIIJJI();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot get valid add yours for topic, topicId=");
            C724270Sb3 c724270Sb32 = addYoursCollectionCellAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            }
            sbLIZ.append(((C615070OAn) obj3).LL);
            C1720106oR.LIZ("AddYoursCollectionCell", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String string;
        AddYoursHubAbility addYoursHubAbility;
        C0OD0 c0od0D30;
        User user;
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C19EG c19eg = (C19EG) awS445S0200000_9.l0;
        Aweme video = ((C0O2K) C631370Opb.LIZ((AddYoursHubItemCellAssem) awS445S0200000_9.l1)).LLILLJJLI.getVideo();
        if (!((C0O2K) C631370Opb.LIZ((AddYoursHubItemCellAssem) awS445S0200000_9.l1)).LLILLL && (addYoursHubAbility = (AddYoursHubAbility) ((AddYoursHubItemCellAssem) awS445S0200000_9.l1).LLLFFI.getValue()) != null && (c0od0D30 = addYoursHubAbility.D30()) != null && (user = c0od0D30.LIZIZ) != null) {
            string = Integer.valueOf(user.getFollowStatus()).toString();
        } else {
            string = null;
        }
        c19651011uW.LIZLLL(c19eg, video, new AddYourRecordParam(addYoursStickerStruct, false, false, "add_yours_topic_list_page", "add_yours", "topic_list_page_shoot", string, true, !zBooleanValue, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        C20684815ws.LJIILLIIL("similar_song_show", C2097608Jq.LJIIIIZZ(new Pair("music_id", ((C632090Oql) awS445S0200000_9.l0).getMusicModel().getMusicId()), new Pair("song_number", String.valueOf(((C632090Oql) awS445S0200000_9.l0).getMusicItemModel().similarMusicSize)), new Pair("to_user_id", ((HighlightSelectMusicSimilarSoundsAssem) awS445S0200000_9.l1).LLJLIL.getValue())));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        C0SUG c0sug = (C0SUG) awS445S0200000_9.l0;
        C19EG c19eg = (C19EG) awS445S0200000_9.l1;
        String str = c0sug.LL;
        if (str != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("story_type", "story");
            c0lab.LJ("to_user_id", str);
            c0lab.LJ("enter_from", "notification_page");
            c0lab.LJ("enter_method", "highlight_topcell_user_guide");
            C20684815ws.LJIILLIIL("enter_personal_detail", c0lab.LIZ);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("enter_from", "notification_page");
            smartRouteBuildRoute.withParam("enter_method", "highlight_topcell_user_guide");
            smartRouteBuildRoute.withParam("uid", str);
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    View view = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIII;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    View view2 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJI;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    View view3 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                    View view4 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
                    if (view4 != null) {
                        view4.clearAnimation();
                    }
                }
            } else {
                View view5 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIII;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(0, view5);
                }
                View view6 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJI;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(8, view6);
                }
                View view7 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                View view8 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
                if (view8 != null) {
                    view8.clearAnimation();
                }
            }
        } else {
            View view9 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIII;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(8, view9);
            }
            View view10 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJI;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(8, view10);
            }
            View view11 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
            if (view11 != null) {
                C786410Ut5.LJLLLLLL(0, view11);
            }
            View view12 = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJI;
            if (view12 != null) {
                view12.startAnimation(AnimationUtils.loadAnimation((Context) awS445S0200000_9.l1, R.anim.e9));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        if (interfaceC665370Q7zLJIIL != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMDPAutoPlayAbility.class, null)) != null) {
            iMDPAutoPlayAbility.Fq2(true);
        }
        ((MusicCoverAssem) awS445S0200000_9.l0).sp().wQ2((Music) awS445S0200000_9.l1, false, true, 0);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        boolean z;
        String string;
        C291001Au c291001Au = (C291001Au) obj2;
        int i = ((MusicCoverAssem) awS445S0200000_9.l0).sp().getState().LLILLJJLI;
        if (i != 0) {
            if (i > 60000) {
                z = true;
            } else {
                z = false;
            }
            int iIntValue = i - ((Number) c291001Au.LIZ).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            int iLIZ = C814420VxA.LIZ(((double) iIntValue) / 1000.0d);
            TuxTextView tuxTextView = ((MusicCoverAssem) awS445S0200000_9.l0).LLJJIJIL;
            if (tuxTextView != null) {
                if (z) {
                    int i2 = (iLIZ * LSPassThroughRecordSizeConfig.DEFAULT) / LSPassThroughRecordSizeConfig.DEFAULT;
                    int i3 = i2 % 60;
                    int i4 = i2 / 60;
                    int i5 = i4 / 60;
                    int i6 = i4 % 60;
                    if (i5 == 0) {
                        string = C786410Ut5.k4(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
                    } else {
                        string = C786410Ut5.k4(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
                    }
                } else {
                    C2222691Bz1 c2222691Bz1 = C2222691Bz1.LIZ;
                    Context context = (Context) awS445S0200000_9.l1;
                    c2222691Bz1.getClass();
                    if (C2222691Bz1.LJI(context)) {
                        string = u.LJJIFFI(((Context) awS445S0200000_9.l1).getString(2131847110), "%d", String.valueOf(iLIZ), false);
                    } else {
                        string = ((Context) awS445S0200000_9.l1).getString(2131847110, Integer.valueOf(iLIZ));
                    }
                }
                tuxTextView.setText(string);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        if (interfaceC665370Q7zLJIIL != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMDPAutoPlayAbility.class, null)) != null) {
            iMDPAutoPlayAbility.Fq2(true);
        }
        ((MusicPUGCPlayAssem) awS445S0200000_9.l0).mp().wQ2((Music) awS445S0200000_9.l1, false, true, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((C0NVR) awS445S0200000_9.l0).LIZ(fFloatValue, ((Number) obj2).floatValue());
        ((C817403Hg) awS445S0200000_9.l1).element = fFloatValue;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        C704830Rkn c704830Rkn;
        C19EG c19egLIZ;
        String aid;
        String strKey;
        Aweme aweme;
        Aweme aweme2;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        Map map = (Map) obj;
        Function0 function02 = (Function0) obj2;
        QuickExternalShareSensorConfigProvider quickExternalShareSensorConfigProvider = (QuickExternalShareSensorConfigProvider) awS445S0200000_9.l0;
        WeakReference weakReference = (WeakReference) awS445S0200000_9.l1;
        String str = null;
        if (weakReference != null) {
            c704830Rkn = (C704830Rkn) weakReference.get();
        } else {
            c704830Rkn = null;
        }
        quickExternalShareSensorConfigProvider.getClass();
        C608530Ntr.LLJJI.getClass();
        VideoItemParams videoItemParamsLIZIZ = C608590Ntx.LIZIZ(c704830Rkn);
        QuickExternalShareVM quickExternalShareVMLIZ = C608590Ntx.LIZ(c704830Rkn);
        if (c704830Rkn != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null) {
            c19egLIZ = C0O0B.LIZ(c690870R8bInvoke);
        } else {
            c19egLIZ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleShowIntercept aid: ");
        if (videoItemParamsLIZIZ != null && (aweme2 = videoItemParamsLIZIZ.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (quickExternalShareVMLIZ != null) {
            String strLIZJ = C733420Spo.LIZJ();
            InterfaceC1369790lkX interfaceC1369790lkX = quickExternalShareVMLIZ.LLILLJJLI;
            if (interfaceC1369790lkX == null || (strKey = interfaceC1369790lkX.key()) == null) {
                strKey = "";
            }
            if (!Intrinsics.LJFF(strKey, strLIZJ)) {
                if (c19egLIZ != null) {
                    ShareExtService shareExtService = C621180OYa.LIZIZ;
                    if (videoItemParamsLIZIZ != null) {
                        aweme = videoItemParamsLIZIZ.getAweme();
                        str = videoItemParamsLIZIZ.mEventType;
                    } else {
                        aweme = null;
                    }
                    shareExtService.LJJLIL(aweme, c19egLIZ, str, new AwS44S0500000_9(quickExternalShareVMLIZ, (QuickExternalShareVM) quickExternalShareSensorConfigProvider, (QuickExternalShareSensorConfigProvider) c704830Rkn, (C704830Rkn) map, (Map<String, Object>) function02, (Function0<Unit>) 0));
                }
            } else if (quickExternalShareVMLIZ.LLILLJJLI != null) {
                QuickExternalShareSensorConfigProvider.LIZ(c704830Rkn, quickExternalShareVMLIZ, map);
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C19719212De c19719212De = ((MusicCellCompose) awS445S0200000_9.l0).LLIZLLLIL;
            C632090Oql c632090Oql = (C632090Oql) awS445S0200000_9.l1;
            c19719212De.invoke(c632090Oql, c632090Oql.getMusicModel(), ((C632090Oql) awS445S0200000_9.l1).getMusicItemModel(), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C19719212De c19719212De = ((MusicCellCompose) awS445S0200000_9.l0).LLIZLLLIL;
            C632090Oql c632090Oql = (C632090Oql) awS445S0200000_9.l1;
            c19719212De.invoke(c632090Oql, c632090Oql.getMusicModel(), ((C632090Oql) awS445S0200000_9.l1).getMusicItemModel(), interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        BulletinBoardProfileInfoAssem bulletinBoardProfileInfoAssem = (BulletinBoardProfileInfoAssem) awS445S0200000_9.l0;
        View view = (View) awS445S0200000_9.l1;
        bulletinBoardProfileInfoAssem.getClass();
        TextView textView = (TextView) view.findViewById(R.id.d3v);
        if (textView != null) {
            textView.setText(C0OPX.LJFF(2131755123, jLongValue));
        }
        View viewFindViewById = view.findViewById(R.id.d3v);
        if (viewFindViewById != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        bulletinBoardProfileInfoAssem.LLJI = jLongValue;
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        ((ECPhotoSearchBubbleAssem) awS445S0200000_9.l0).zo(((Boolean) obj).booleanValue(), (ECSystemPhotoModel) obj2, (C621760Oa6) ((AbstractC621770Oa7) awS445S0200000_9.l1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$34(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        ((C013C) awS445S0200000_9.l0).element = ((Boolean) obj).booleanValue();
        ((C259800zU) awS445S0200000_9.l1).element = obj2;
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        ((C013C) awS445S0200000_9.l0).element = true;
        C625130OfX.LJ(C625130OfX.LIZ, "click_offline_mode_toast", "offline_mode_page", null, null, null, null, null, null, null, null, null, null, null, null, null, "offline_video_intro", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "manage", null, null, null, -32772, 122879);
        ((Function0) awS445S0200000_9.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        ((C20663515tR) awS445S0200000_9.l0).LJI((C19EG) obj, (InnerPushMessage) awS445S0200000_9.l1, true, new C607440Ns6(obj2));
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String str;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("music_id", ((C632090Oql) awS445S0200000_9.l0).getMusicModel().getMusicId());
        pairArr[1] = new Pair("song_number", String.valueOf(((C632090Oql) awS445S0200000_9.l0).getMusicItemModel().similarMusicSize));
        C447520Hgk c447520Hgk = (C447520Hgk) C1252710ihh.LJIIIIZZ((SearchMusicCellSimilarSoundsAssem) awS445S0200000_9.l1, C13LE.LIZ(InterfaceC634010Otr.class));
        if (c447520Hgk == null || (str = c447520Hgk.LIZ) == null) {
            str = "";
        }
        pairArr[2] = new Pair("to_user_id", str);
        C20684815ws.LJIILLIIL("similar_song_show", C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$38(kotlin.jvm.internal.AwS445S0200000_9 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r3 = r7.booleanValue()
            java.lang.Object r1 = r6.l0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "entrance_page"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L16
            java.lang.String r1 = ""
        L16:
            X.0OPQ r0 = X.C0OPQ.LIZ
            r0.getClass()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "bulletin_board"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "follow"
            X.C20684815ws.LJIILLIIL(r0, r1)
            if (r3 == 0) goto L6d
            X.0PSR r5 = new X.0PSR
            X.0OPh r0 = X.C618910OPh.LIZ
            java.lang.Object r4 = r6.l1
            com.ss.android.ugc.aweme.profile.model.User r4 = (com.ss.android.ugc.aweme.profile.model.User) r4
            r0.getClass()
            if (r4 == 0) goto L81
            int r0 = r4.getFollowStatus()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 4
            r1 = 1
            if (r3 == 0) goto L81
            int r0 = r3.intValue()
            if (r0 != 0) goto L72
            if (r4 == 0) goto L70
            boolean r0 = r4.isSecret()
            if (r0 == r1) goto L63
            int r0 = r4.getFollowerStatus()
            if (r0 != r1) goto L70
            r2 = 2
        L63:
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r5.<init>(r2, r0)
            X.C1440005kM.LIZ(r5)
        L6d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            r2 = 1
            goto L63
        L72:
            int r0 = r3.intValue()
            if (r0 == r2) goto L81
            int r0 = r3.intValue()
            if (r0 == r1) goto L81
            r3.intValue()
        L81:
            r2 = 0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$38(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$39(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String userId;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("music_id", ((C632090Oql) awS445S0200000_9.l0).getMusicModel().getMusicId());
        pairArr[1] = new Pair("song_number", String.valueOf(((C632090Oql) awS445S0200000_9.l0).getMusicItemModel().similarMusicSize));
        OriginMusicArg originMusicArg = (OriginMusicArg) ((MusicCellSimilarSoundsAssem) awS445S0200000_9.l1).LLJLIL.getValue();
        if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
            userId = "";
        }
        pairArr[2] = new Pair("to_user_id", userId);
        C20684815ws.LJIILLIIL("similar_song_show", C2097608Jq.LJIIIIZZ(pairArr));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCreateFragment - getGeckoImageResPathWithFetch - isSuccess = ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", prefixPath = ");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C624550Oeb.LIZJ((ImageView) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJ.getValue(), str, "bg", C624550Oeb.LIZIZ(R.dimen.jy, 303, (View) awS445S0200000_9.l1), C624550Oeb.LIZIZ(R.dimen.jx, 326, (View) awS445S0200000_9.l1));
        C624550Oeb.LIZJ((ImageView) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJI.getValue(), str, "emoji", C624550Oeb.LIZIZ(R.dimen.f599k0, 340, (View) awS445S0200000_9.l1), C624550Oeb.LIZIZ(R.dimen.jz, 191, (View) awS445S0200000_9.l1));
        C624550Oeb.LIZJ((ImageView) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJIJIL.getValue(), str, "image", C624550Oeb.LIZIZ(R.dimen.k6, 242, (View) awS445S0200000_9.l1), C624550Oeb.LIZIZ(R.dimen.k1, 237, (View) awS445S0200000_9.l1));
        C624550Oeb.LIZJ((ImageView) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJILJIL.getValue(), str, "time", C624550Oeb.LIZIZ(R.dimen.k5, 196, (View) awS445S0200000_9.l1), C624550Oeb.LIZIZ(R.dimen.k4, 215, (View) awS445S0200000_9.l1));
        C624550Oeb.LIZJ((ImageView) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJILJILJ.getValue(), str, "poll", C624550Oeb.LIZIZ(R.dimen.k3, 250, (View) awS445S0200000_9.l1), C624550Oeb.LIZIZ(R.dimen.k2, 252, (View) awS445S0200000_9.l1));
        BulletinBoardCreateAnimAssem bulletinBoardCreateAnimAssem = (BulletinBoardCreateAnimAssem) awS445S0200000_9.l0;
        C786410Ut5.LJLIIL(4000L, bulletinBoardCreateAnimAssem.LLJLL, bulletinBoardCreateAnimAssem.LLJLLIL);
        BulletinBoardCreateAnimAssem bulletinBoardCreateAnimAssem2 = (BulletinBoardCreateAnimAssem) awS445S0200000_9.l0;
        GestureDetector gestureDetector = bulletinBoardCreateAnimAssem2.LLJL;
        if (gestureDetector != null) {
            ((View) bulletinBoardCreateAnimAssem2.LLIZLLLIL.getValue()).setOnTouchListener(new ATListenerS443S0100000_9(gestureDetector, 1));
        }
        if (zBooleanValue) {
            ((C0OUZ) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJLLL.getValue()).LIZJ();
        } else {
            ((C0OUZ) ((BulletinBoardCreateAnimAssem) awS445S0200000_9.l0).LLJLLL.getValue()).LIZLLL(9004000);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NRN((C610200NwY) awS445S0200000_9.l0, (Context) awS445S0200000_9.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ((HighlightAutoPostSwitchCell) awS445S0200000_9.l0).LLILZLL.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        Function2 function2 = (Function2) awS445S0200000_9.l1;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        Object obj3;
        Aweme aweme;
        C291001Au c291001Au = (C291001Au) obj2;
        String aid = null;
        if (c291001Au != null) {
            obj3 = c291001Au.LIZ;
        } else {
            obj3 = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) awS445S0200000_9.l0;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(obj3, aid)) {
            ((C599880Nfu) awS445S0200000_9.l1).LJ(true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4 A[PHI: r8
      0x00f4: PHI (r8v1 java.util.Map<java.lang.String, java.lang.String>) = 
      (r8v0 java.util.Map<java.lang.String, java.lang.String>)
      (r8v3 java.util.Map<java.lang.String, java.lang.String>)
      (r8v3 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:60:0x00f1, B:41:0x00b5, B:43:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$43(kotlin.jvm.internal.AwS445S0200000_9 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$43(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$44(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        String aid;
        Aweme aweme;
        if (((Boolean) obj2).booleanValue()) {
            ((VideoFavoriteVM) awS445S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(1002));
            C2214851BmN.LJFF(5);
        } else {
            VideoItemParams item = ((VideoFavoriteVM) awS445S0200000_9.l0).getItem();
            if (item == null || (aweme = item.getAweme()) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            C1440005kM.LIZ(new C034R(aid));
        }
        ((Function0) awS445S0200000_9.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS445S0200000_9 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r6 = r11
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r0 = r10.l0
            X.0ORG r0 = (X.C0ORG) r0
            java.lang.String r7 = r0.LIZLLL
            r9 = 1
            r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.0ORG r0 = (X.C0ORG) r0
            boolean r4 = r6.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r2 = r10.l0
            X.0ORG r2 = (X.C0ORG) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r4 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L59
        L4f:
            kotlin.jvm.internal.AwS410S0200000_9 r8 = new kotlin.jvm.internal.AwS410S0200000_9
            r0 = 22
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L59:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.l0
            X.0ORG r0 = (X.C0ORG) r0
            java.lang.String r7 = r0.LJFF
            r6.LJJIIJZLJL(r3)
            java.lang.Object r0 = r10.l0
            X.0ORG r0 = (X.C0ORG) r0
            boolean r3 = r6.LJJIIJ(r0)
            java.lang.Object r0 = r10.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r6.LJJIIJ(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            X.0ORG r2 = (X.C0ORG) r2
            java.lang.Object r1 = r10.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r8 = r6.LJJ()
            if (r3 != 0) goto L95
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L9f
        L95:
            kotlin.jvm.internal.AwS410S0200000_9 r8 = new kotlin.jvm.internal.AwS410S0200000_9
            r0 = 23
            r8.<init>(r2, r1, r0)
            r6.LJJIJIIJI(r8)
        L9f:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r6.LJ()
            r4 = 48
            r5 = 0
            X.C1668330tW3.LJIIIZ(r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$5(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS445S0200000_9 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$6(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        EntranceSettings entranceSettings;
        List<InboxEntranceFunction> list;
        TuxNavBar tuxNavBar;
        UIAssem uIAssem = (UIAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            AssemVMLazy assemVMLazy = ((WorkBenchMainNavBarAssem) awS445S0200000_9.l0).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchMainNavBarAssem.LLJ;
            WorkBenchNoticeResponse workBenchNoticeResponse = ((C623610Od5) assemVMLazy.getValue().getState()).LL;
            if (workBenchNoticeResponse != null && (entranceSettings = workBenchNoticeResponse.getEntranceSettings()) != null && (list = entranceSettings.functionSettings) != null && C866950Xzh.LIZIZ(list) && (tuxNavBar = (TuxNavBar) ((View) awS445S0200000_9.l1).findViewById(R.id.workbench_main_navbar)) != null) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_gear;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS410S0200000_9(uIAssem, (WorkBenchMainNavBarAssem) awS445S0200000_9.l0, 38));
                tuxNavBar.LIZ(c1251150ifB);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS445S0200000_9 awS445S0200000_9, Object obj, Object obj2) {
        if (((OriginMusicListViewModel) awS445S0200000_9.l0).LLJ) {
            IProfileMusicTabService iProfileMusicTabService = (IProfileMusicTabService) PluggableExtentionKt.pluggableSpi$default(IProfileMusicTabService.class, false, false, false, 14, null);
            if (iProfileMusicTabService != null) {
                iProfileMusicTabService.LIZIZ();
            }
        } else {
            ((MusicListAssem) awS445S0200000_9.l1).LLJI = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS445S0200000_9 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            X.0SxQ r11 = (X.AbstractC738140SxQ) r11
            X.01Au r12 = (X.C291001Au) r12
            T r4 = r12.LIZ
            com.ss.android.ugc.aweme.music.model.MusicGroup r4 = (com.ss.android.ugc.aweme.music.model.MusicGroup) r4
            if (r4 == 0) goto L5c
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.music.assem.list.MusicListAssem r0 = (com.ss.android.ugc.aweme.music.assem.list.MusicListAssem) r0
            java.lang.Object r2 = r10.l1
            X.00zU r2 = (X.C259800zU) r2
            com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r3 = r0.ip()
            r3.getClass()
            r5 = 0
            r10 = 62
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            java.util.List r0 = com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.vQ2(r3, r4, r5, r6, r7, r8, r9, r10)
            r3.listSetItems(r0)
            r0 = 897(0x381, float:1.257E-42)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r3.setState(r0)
            com.ss.android.ugc.aweme.music.model.Music r0 = r4.getSourceMusic()
            if (r0 == 0) goto L3c
            java.lang.String r1 = r0.getIdStr()
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = ""
        L3e:
            T r0 = r2.element
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L5c
            r2.element = r1
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r11)
            if (r0 == 0) goto L5c
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131837966(0x7f11440e, float:1.9309142E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS445S0200000_9.invoke$9(kotlin.jvm.internal.AwS445S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C013C c013c, AwS553S0100000_9 awS553S0100000_9, int i) {
        super(2);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = awS553S0100000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C0NVR c0nvr, C817403Hg c817403Hg, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0nvr;
        this.l1 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C610200NwY c610200NwY, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c610200NwY;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(C0ORG c0org, C0ORG c0org2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c0org;
        this.l1 = c0org2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C632090Oql c632090Oql, MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c632090Oql;
        this.l1 = musicCellSimilarSoundsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C632090Oql c632090Oql, HighlightSelectMusicSimilarSoundsAssem highlightSelectMusicSimilarSoundsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c632090Oql;
        this.l1 = highlightSelectMusicSimilarSoundsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C632090Oql c632090Oql, SearchMusicCellSimilarSoundsAssem searchMusicCellSimilarSoundsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c632090Oql;
        this.l1 = searchMusicCellSimilarSoundsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C0SUG c0sug, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0sug;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C20663515tR c20663515tR, InnerPushMessage innerPushMessage, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20663515tR;
        this.l1 = innerPushMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(C19EG c19eg, AddYoursHubItemCellAssem addYoursHubItemCellAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = addYoursHubItemCellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(View view, PostModeFavoriteViewModel postModeFavoriteViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = postModeFavoriteViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(ComposeView composeView, SettingsComposeRvmpFragment settingsComposeRvmpFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = settingsComposeRvmpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(CommentContextSource commentContextSource, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = commentContextSource;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(TabFragment tabFragment, TabChildParams tabChildParams, int i) {
        super(2);
        this.$t = i;
        this.l0 = tabFragment;
        this.l1 = tabChildParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(ECPhotoSearchBubbleAssem eCPhotoSearchBubbleAssem, AbstractC621770Oa7 abstractC621770Oa7, int i) {
        super(2);
        this.$t = i;
        this.l0 = eCPhotoSearchBubbleAssem;
        this.l1 = abstractC621770Oa7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(QuickExternalShareSensorConfigProvider quickExternalShareSensorConfigProvider, QuickExternalShareSensorConfigProvider quickExternalShareSensorConfigProvider2, WeakReference<C704830Rkn> weakReference) {
        super(2);
        this.$t = weakReference;
        this.l0 = quickExternalShareSensorConfigProvider;
        this.l1 = quickExternalShareSensorConfigProvider2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(VideoFavoriteVM videoFavoriteVM, C612130Nzf c612130Nzf, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoFavoriteVM;
        this.l1 = c612130Nzf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(VideoItemParams videoItemParams, C599880Nfu c599880Nfu, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = c599880Nfu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(BulletinPageFragment bulletinPageFragment, C0OLV c0olv, int i) {
        super(2);
        this.$t = i;
        this.l0 = bulletinPageFragment;
        this.l1 = c0olv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(BulletinBoardCreateAnimAssem bulletinBoardCreateAnimAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = bulletinBoardCreateAnimAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(BulletinBoardProfileInfoAssem bulletinBoardProfileInfoAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = bulletinBoardProfileInfoAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(WorkBenchMainNavBarAssem workBenchMainNavBarAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = workBenchMainNavBarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(HighlightAutoPostSwitchCell highlightAutoPostSwitchCell, HighlightAutoPostSwitchCell highlightAutoPostSwitchCell2, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = highlightAutoPostSwitchCell;
        this.l1 = highlightAutoPostSwitchCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(MusicListAssem musicListAssem, MusicListAssem musicListAssem2, C259800zU<String> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = musicListAssem;
        this.l1 = musicListAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(MusicListComposableAssem musicListComposableAssem, MusicListComposableAssem musicListComposableAssem2, C259800zU<String> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = musicListComposableAssem;
        this.l1 = musicListComposableAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicCellCompose musicCellCompose, C632090Oql c632090Oql, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicCellCompose;
        this.l1 = c632090Oql;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicCoverAssem musicCoverAssem, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicCoverAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicCoverAssem musicCoverAssem, Music music, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicCoverAssem;
        this.l1 = music;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicPUGCPlayAssem musicPUGCPlayAssem, Music music, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPUGCPlayAssem;
        this.l1 = music;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicPgcMetaInfoAssem musicPgcMetaInfoAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPgcMetaInfoAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicPgcMetaInfoWithArtistAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(StoryMusicCoverAssem storyMusicCoverAssem, Music music, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyMusicCoverAssem;
        this.l1 = music;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(OriginMusicListViewModel originMusicListViewModel, MusicListAssem musicListAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = originMusicListViewModel;
        this.l1 = musicListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(OriginMusicListViewModel originMusicListViewModel, MusicListComposableAssem musicListComposableAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = originMusicListViewModel;
        this.l1 = musicListComposableAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(PoiRevisitCardCell poiRevisitCardCell, IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiRevisitCardCell;
        this.l1 = iPoiRevisitNavAssemAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(PoiRevisitHorizontalCell poiRevisitHorizontalCell, IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiRevisitHorizontalCell;
        this.l1 = iPoiRevisitNavAssemAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(User user, Map map, int i) {
        super(2);
        this.$t = i;
        this.l0 = map;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS445S0200000_9(ProfileRecFragment profileRecFragment, ProfileRecFragment profileRecFragment2, C01GW<? extends InterfaceC898260ZLs> c01gw) {
        super(2);
        this.$t = c01gw;
        this.l0 = profileRecFragment;
        this.l1 = profileRecFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(PostModeFavoriteViewModel postModeFavoriteViewModel, AwS553S0100000_9 awS553S0100000_9, int i) {
        super(2);
        this.$t = i;
        this.l0 = postModeFavoriteViewModel;
        this.l1 = awS553S0100000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(AddYoursCollectionCellAssem addYoursCollectionCellAssem, C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = addYoursCollectionCellAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS445S0200000_9(Function2 function2, AnonymousClass0956 anonymousClass0956, int i) {
        super(2);
        this.$t = i;
        this.l0 = function2;
        this.l1 = anonymousClass0956;
    }
}
