package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0SUC;
import X.C0SY7;
import X.C0ZDN;
import X.C106C;
import X.C109H;
import X.C10CW;
import X.C10IS;
import X.C10IT;
import X.C10PW;
import X.C10PX;
import X.C1261860iwS;
import X.C1271804yK;
import X.C1308405Ac;
import X.C1387050mCN;
import X.C1389890mGx;
import X.C1590970rVH;
import X.C1667160tUA;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1720106oR;
import X.C1887930zEF;
import X.C1903110zcj;
import X.C1905080zfu;
import X.C1905130zfz;
import X.C1907160zjG;
import X.C1907330zjX;
import X.C1907570zjv;
import X.C1908890zm3;
import X.C191984108w;
import X.C19207610Ck;
import X.C19228610Km;
import X.C19228710Kn;
import X.C197039127h;
import X.C20028913Yh;
import X.C20684815ws;
import X.C2097908Jt;
import X.C211000rc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23271099x;
import X.C2344009Gk;
import X.C259800zU;
import X.C296550Bjp;
import X.C786410Ut5;
import X.C817650W5r;
import X.C849850XVn;
import X.C912070ZqH;
import X.EnumC1387060mCO;
import X.EnumC1905950zhJ;
import X.EnumC19228810Ko;
import X.EnumC2274741E1w;
import X.InterfaceC1589330rSd;
import X.InterfaceC1680500tpg;
import X.InterfaceC1907510zjp;
import X.InterfaceC497601wk;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.ui.assem.ManualSwitchCreatorInboxAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS463S0200000_28 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS463S0200000_28(com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem r3, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 7: goto Lf;
                case 8: goto L5;
                case 9: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS463S0200000_28.<init>(com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem, com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, int):void");
    }

    public static final Object invoke$0(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        if (obj == C0SY7.FOLLOW_REQUESTED) {
            HandlerHook.viewPostDelay((C1907570zjv) awS463S0200000_28.l0, new ARunnableS128S0100000_28((InterfaceC1907510zjp) awS463S0200000_28.l1, 5), 500L);
        } else {
            HandlerHook.viewPostDelay((C1907570zjv) awS463S0200000_28.l0, new ARunnableS128S0100000_28((InterfaceC1907510zjp) awS463S0200000_28.l1, 6), 200L);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$1(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((C191984108w) awS463S0200000_28.l0).LIZ(null, ((C109H) awS463S0200000_28.l1).LLILLL);
        ((C109H) awS463S0200000_28.l1).LJIILIIL().LLILLJJLI.LIZ(zBooleanValue ? 1 : 0, (View) obj);
        C1887930zEF.LIZ(zBooleanValue ? 1 : 0, ((C109H) awS463S0200000_28.l1).LLILZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        ((Function0) awS463S0200000_28.l0).invoke();
        ((ManualSwitchCreatorInboxAssem) awS463S0200000_28.l1).kp("confirm");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        Fragment fragment = (Fragment) obj;
        ((C10PW) awS463S0200000_28.l0).LLILZ.invoke(fragment, Boolean.valueOf(!((Boolean) obj2).booleanValue()));
        ((C10PX) awS463S0200000_28.l1).LIZ = fragment;
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(C912070ZqH.LIZIZ.LJIIZILJ().LJI());
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            interfaceC1680500tpg.LJ();
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, interfaceC1680500tpg);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ2;
            Unit unit = Unit.LIZ;
            interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg.LJII(interfaceC497601wk);
            Object objLJJ3 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1308405Ac(interfaceC497601wk, c05p0, null);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
            }
            interfaceC1680500tpg.LJ();
            C1680540tpk.LJFF(unit, (Function2) objLJJ3, interfaceC1680500tpg);
            String str = (String) c05p0.getValue();
            if (str == null) {
                str = "";
            }
            interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
            boolean zLJII2 = interfaceC1680500tpg.LJII((C1903110zcj) awS463S0200000_28.l0) | interfaceC1680500tpg.LJJIIJ((C1271804yK) awS463S0200000_28.l1);
            C1903110zcj c1903110zcj = (C1903110zcj) awS463S0200000_28.l0;
            C1271804yK c1271804yK = (C1271804yK) awS463S0200000_28.l1;
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS429S0200000_28(c1903110zcj, c1271804yK, 130);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            Function0 function0 = (Function0) objLJJ4;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ((C1271804yK) awS463S0200000_28.l1);
            C1271804yK c1271804yK2 = (C1271804yK) awS463S0200000_28.l1;
            Object objLJJ5 = interfaceC1680500tpg.LJJ();
            if (zLJJIIJ || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AwS572S0100000_28(c1271804yK2, 884);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
            }
            interfaceC1680500tpg.LJ();
            C1667160tUA.LIZ(str, function0, (Function0) objLJJ5, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        ((PrivacyItemVM) awS463S0200000_28.l0).wQ2((Context) obj, (String) obj2, ((C106C) awS463S0200000_28.l1).LJ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        String str;
        C211000rc.LIZ("[Push-New]");
        ((C19207610Ck) awS463S0200000_28.l0).LLJ = C10CW.LIZ;
        InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
        C19207610Ck c19207610Ck = (C19207610Ck) awS463S0200000_28.l0;
        String str2 = ((PopupInstanceConfig) awS463S0200000_28.l1).panelType;
        c19207610Ck.getClass();
        if (Intrinsics.LJFF(str2, "push_new_default")) {
            str = "338_normal";
        } else if (Intrinsics.LJFF(str2, "push_new_toggle")) {
            str = "338_toggle";
        } else {
            str = "338";
        }
        interfaceC1589330rSdLIZJ.LJIJI(str, "turnOnNotif_bottomSheet_button_notNow", false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        String str;
        C2189821An6 c2189821An6 = (C2189821An6) obj;
        Context context = (Context) obj2;
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(((VideoItemParams) awS463S0200000_28.l0).getAweme());
        if (statusSafety != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null && (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) != null && muteDetailUrl.length() > 0) {
            Long lValueOf = null;
            if (1 != 0) {
                VideoReviewStatusVM videoReviewStatusVM = (VideoReviewStatusVM) awS463S0200000_28.l1;
                VideoItemParams videoItemParams = (VideoItemParams) awS463S0200000_28.l0;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
                smartRouteBuildRoute.withParam(UriProtector.parse(muteDetailUrl));
                smartRouteBuildRoute.open();
                videoReviewStatusVM.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                List<Integer> list = VideoReviewStatusVM.LLIZLLLIL;
                c2344009Gk.LJIIIIZZ("enter_from", C10IS.LIZ(c2189821An6));
                c2344009Gk.LJIIIIZZ("enter_method", C10IS.LIZIZ(c2189821An6));
                c2344009Gk.LJIIIIZZ("group_id", videoItemParams.getAweme().getAid());
                Music music = videoItemParams.getAweme().getMusic();
                if (music != null) {
                    lValueOf = Long.valueOf(music.getId());
                }
                c2344009Gk.LJ(lValueOf, "music_id");
                if (C10IT.LJI(videoItemParams.getAweme())) {
                    str = "copyright";
                } else {
                    str = "other";
                }
                c2344009Gk.LJIIIIZZ("mute_reason", str);
                C20684815ws.LJIILLIIL("click_violation_detail_page_entrance", c2344009Gk.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        Context context = (Context) obj;
        VideoReviewStatusVM videoReviewStatusVM = (VideoReviewStatusVM) awS463S0200000_28.l0;
        if (videoReviewStatusVM.LL && videoReviewStatusVM.LLILLL) {
            videoReviewStatusVM.LL = false;
            List<Integer> list = VideoReviewStatusVM.LLIZLLLIL;
            C10IS.LIZLLL(((VideoItemParams) awS463S0200000_28.l1).getAweme(), C0SUC.LIZ(context));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        MusNotice mBaseNotice;
        Aweme aweme;
        String strJ4;
        NoticeUITemplate noticeUITemplate;
        String str;
        NoticeExtraData noticeExtraData;
        C1905130zfz expandAbility = ((C1907160zjG) awS463S0200000_28.l0).getExpandAbility();
        if (expandAbility == null || (mBaseNotice = expandAbility.LIZ) == null) {
            mBaseNotice = ((C1907160zjG) awS463S0200000_28.l0).getMBaseNotice();
        }
        GeneralTemplateNotice generalTemplateNotice = ((C1907330zjX) awS463S0200000_28.l1).LIZ;
        if (generalTemplateNotice != null && (noticeExtraData = generalTemplateNotice.extraData) != null) {
            aweme = noticeExtraData.aweme;
        } else {
            aweme = null;
        }
        if (C1905080zfu.LIZIZ(mBaseNotice)) {
            strJ4 = C786410Ut5.j4("aweme://story/detail/%s?cid=%s&refer=notification_page&comment_enter_method=click_view_reply&video_from=STORY_ENTRANCE_DEFAULT", Arrays.copyOf(new Object[]{obj, obj2}, 2));
        } else if (aweme != null && C817650W5r.LIZ(aweme)) {
            strJ4 = C786410Ut5.j4("aweme://text_post/detail/%s?cid=%s&refer=notification_page&comment_enter_method=click_view_reply", Arrays.copyOf(new Object[]{obj, obj2}, 2));
        } else {
            strJ4 = C786410Ut5.j4("aweme://aweme/detail/%s?cid=%s&refer=notification_page&comment_enter_method=click_view_reply", Arrays.copyOf(new Object[]{obj, obj2}, 2));
        }
        if (strJ4 != null) {
            ((C1907160zjG) awS463S0200000_28.l0).LJ(EnumC1905950zhJ.MIDDLE, strJ4);
        } else {
            C1907330zjX c1907330zjX = (C1907330zjX) awS463S0200000_28.l1;
            C1907160zjG c1907160zjG = (C1907160zjG) awS463S0200000_28.l0;
            GeneralTemplateNotice generalTemplateNotice2 = c1907330zjX.LIZ;
            if (generalTemplateNotice2 != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null && (str = noticeUITemplate.toastText) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c1907160zjG);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeTemplateView", "schemaUrl is null");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        ((C259800zU) awS463S0200000_28.l0).element = obj2;
        if (((CountDownLatch) awS463S0200000_28.l1).getCount() == 1) {
            ((CountDownLatch) awS463S0200000_28.l1).countDown();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        RecSwipeButtonsAssem recSwipeButtonsAssem = (RecSwipeButtonsAssem) obj;
        C1261860iwS c1261860iwS = (C1261860iwS) obj2;
        if (c1261860iwS != null) {
            if (c1261860iwS.getFollowStatus() == 0) {
                C786410Ut5.t0((RelationButton) awS463S0200000_28.l0, 0);
            } else {
                C786410Ut5.t0((RelationButton) awS463S0200000_28.l0, 4);
            }
            RelationButton relationButton = (RelationButton) awS463S0200000_28.l0;
            RecSwipeButtonsAssem recSwipeButtonsAssem2 = (RecSwipeButtonsAssem) awS463S0200000_28.l1;
            C1387050mCN c1387050mCN = new C1387050mCN(c1261860iwS);
            c1387050mCN.LJFF = EnumC2274741E1w.FEED_BIG_CARD;
            c1387050mCN.LIZIZ = false;
            c1387050mCN.LJIIJ = true;
            c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
            c1387050mCN.LJIIJJI = C1590970rVH.LIZ(recSwipeButtonsAssem2);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
            relationButton.setFollowClickInterceptor(new C19228610Km(c1261860iwS, recSwipeButtonsAssem, null));
            relationButton.setTracker(new AwS429S0200000_28(recSwipeButtonsAssem, c1261860iwS, 115));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        C0SY7 c0sy7 = (C0SY7) obj;
        Context context = ((RecSwipeButtonsAssem) awS463S0200000_28.l0).getContext();
        if (context != null) {
            new C0ZDN(context).LIZ(0);
        }
        ((RecSwipeButtonsAssem) awS463S0200000_28.l0).cp().vQ2(EnumC19228810Ko.CLICK_UNFOLLOW);
        ((RecSwipeButtonsAssem) awS463S0200000_28.l0).cp();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[UnfollowRelationButton]  setFollowClickListener relationStatusType = ");
        sbLIZ.append(c0sy7.name());
        sbLIZ.append(" and relationStatusType2 = ");
        sbLIZ.append(obj2);
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.t0((RelationButton) awS463S0200000_28.l1, 4);
        C197039127h c197039127h = ((RecSwipeButtonsAssem) awS463S0200000_28.l0).LLJJJJLIIL;
        RelationButton relationButton = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h, 0);
        RelationButton relationButton2 = ((RecSwipeButtonsAssem) awS463S0200000_28.l0).LLJJL;
        if (relationButton2 != null) {
            relationButton = relationButton2;
        }
        C786410Ut5.t0(relationButton, 0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS463S0200000_28 awS463S0200000_28, Object obj, Object obj2) {
        String requestId;
        String requestId2;
        RecSwipeButtonsAssem recSwipeButtonsAssem = (RecSwipeButtonsAssem) obj;
        C1261860iwS c1261860iwS = (C1261860iwS) obj2;
        if (c1261860iwS != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unfollow button for ");
            sbLIZ.append(c1261860iwS.getFollowStatus());
            C2188811AlT.LIZIZ(sbLIZ);
            int followStatus = c1261860iwS.getFollowStatus();
            if (followStatus != 1 && followStatus != 2 && followStatus != 4) {
                C786410Ut5.t0((RelationButton) awS463S0200000_28.l0, 4);
            } else {
                C786410Ut5.t0((RelationButton) awS463S0200000_28.l0, 0);
            }
            RelationButton relationButton = (RelationButton) awS463S0200000_28.l0;
            RecSwipeButtonsAssem recSwipeButtonsAssem2 = (RecSwipeButtonsAssem) awS463S0200000_28.l1;
            if (C296550Bjp.LIZ() && ((requestId = c1261860iwS.getRequestId()) == null || requestId.length() == 0)) {
                Aweme aweme = recSwipeButtonsAssem.cp().LLILLJJLI;
                if (aweme != null) {
                    requestId2 = aweme.getRequestId();
                } else {
                    requestId2 = null;
                }
                c1261860iwS.setRequestId(requestId2);
            }
            C1387050mCN c1387050mCN = new C1387050mCN(c1261860iwS);
            c1387050mCN.LJFF = EnumC2274741E1w.FEED_BIG_CARD;
            c1387050mCN.LIZIZ = false;
            c1387050mCN.LJIIJ = true;
            c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
            c1387050mCN.LJII.putAll(C2097908Jt.LIZJ(new Pair(C0SY7.FOLLOWED, new C1908890zm3(relationButton.getContext().getResources().getString(R.string.jqm), null))));
            c1387050mCN.LJIIJJI = C1590970rVH.LIZ(recSwipeButtonsAssem2);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
            relationButton.setFollowClickInterceptor(new C19228710Kn(c1261860iwS, recSwipeButtonsAssem, null));
            relationButton.setTracker(new AwS429S0200000_28(recSwipeButtonsAssem, c1261860iwS, 116));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS463S0200000_28(com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM r3, com.ss.android.ugc.aweme.feed.model.VideoItemParams r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS463S0200000_28.<init>(com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM, com.ss.android.ugc.aweme.feed.model.VideoItemParams, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS463S0200000_28(C259800zU c259800zU, C259800zU<String> c259800zU2, CountDownLatch countDownLatch) {
        super(2);
        this.$t = countDownLatch;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C1903110zcj c1903110zcj, C1271804yK c1271804yK, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1903110zcj;
        this.l1 = c1271804yK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C1907160zjG c1907160zjG, C1907330zjX c1907330zjX, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1907160zjG;
        this.l1 = c1907330zjX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C1907570zjv c1907570zjv, InterfaceC1907510zjp interfaceC1907510zjp, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1907570zjv;
        this.l1 = interfaceC1907510zjp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C191984108w c191984108w, C109H c109h, int i) {
        super(2);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C19207610Ck c19207610Ck, PopupInstanceConfig popupInstanceConfig, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19207610Ck;
        this.l1 = popupInstanceConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(C10PW c10pw, C10PX c10px, int i) {
        super(2);
        this.$t = i;
        this.l0 = c10pw;
        this.l1 = c10px;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(PrivacyItemVM privacyItemVM, C106C c106c, int i) {
        super(2);
        this.$t = i;
        this.l0 = privacyItemVM;
        this.l1 = c106c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS463S0200000_28(AwS429S0200000_28 awS429S0200000_28, ManualSwitchCreatorInboxAssem manualSwitchCreatorInboxAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS429S0200000_28;
        this.l1 = manualSwitchCreatorInboxAssem;
    }
}
