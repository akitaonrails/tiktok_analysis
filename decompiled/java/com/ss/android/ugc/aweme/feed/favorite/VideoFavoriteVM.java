package com.ss.android.ugc.aweme.feed.favorite;

import X.AbstractC1604130rqV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C07HI;
import X.C0JBR;
import X.C0N9C;
import X.C0S90;
import X.C0SUC;
import X.C0SXF;
import X.C0XPD;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1030680cva;
import X.C1172530gcN;
import X.C123100dR;
import X.C1233040iBy;
import X.C1255240ilm;
import X.C1357130lQ7;
import X.C1357660lQy;
import X.C1359610lU7;
import X.C1360330lVH;
import X.C1366720lfa;
import X.C1367960lha;
import X.C1370890lmJ;
import X.C1375500ltk;
import X.C1380890m2R;
import X.C1381730m3n;
import X.C1383360m6Q;
import X.C1386360mBG;
import X.C1387380mCu;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C14TF;
import X.C1599640rjG;
import X.C15WT;
import X.C1606660rua;
import X.C1612650s4F;
import X.C19651011uW;
import X.C1EE1;
import X.C1EE2;
import X.C1ER1;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217371BqR;
import X.C2277711EDh;
import X.C23250099c;
import X.C2344009Gk;
import X.C294850Bh5;
import X.C295620BiK;
import X.C298410Bmp;
import X.C452501pT;
import X.C523420Kfs;
import X.C584850Mwl;
import X.C612140Nzg;
import X.C627150Oin;
import X.C717590SCv;
import X.C720360SNm;
import X.C731530Sml;
import X.C731920SnO;
import X.C734640Srm;
import X.C734650Srn;
import X.C734660Sro;
import X.C734670Srp;
import X.C734680Srq;
import X.C734780Ss0;
import X.C735370Ssx;
import X.C735840Sti;
import X.C737030Svd;
import X.C738970Syl;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.IFeedMonitorService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.state.ability.IState;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoFavoriteVM extends FeedRightBtnBaseViewModel<C731530Sml> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static long LLJILJIL;
    public long LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C717590SCv LLILZ = new C717590SCv(new C734680Srq());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C734660Sro());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C734640Srm());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C734650Srn());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1172530gcN());
    public final C01GW LLJ = C452501pT.LIZIZ(new C734670Srp());
    public final C01GW LLJI = C452501pT.LIZIZ(new C1255240ilm());

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoFavoriteVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C731530Sml(null, 127);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (Context) c717590SCv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new C731920SnO(this));
    }

    public final AbstractC1604130rqV xQ2() {
        return (AbstractC1604130rqV) this.LLIZLLLIL.getValue();
    }

    public final boolean AQ2() {
        Aweme aweme;
        Aweme aweme2;
        if (!C298410Bmp.LIZ()) {
            return this.LLILLJJLI;
        }
        IState iState = (IState) this.LLIZ.getValue();
        VideoItemParams item = getItem();
        String aid = (item == null || (aweme2 = item.getAweme()) == null) ? null : aweme2.getAid();
        VideoItemParams item2 = getItem();
        return ((Boolean) iState.currentState(aid, Boolean.valueOf((item2 == null || (aweme = item2.getAweme()) == null) ? false : AwemeExtKt.isCollected(aweme)))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final String getZeroNumReplaceString() {
        if (!C295620BiK.LIZ() || !C294850Bh5.LIZ()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(2131838143);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C298410Bmp.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C612140Nzg(this, null), 3);
        }
    }

    public final boolean BQ2(Aweme aweme) {
        Context context;
        if (aweme == null || AwemeExtKt.isCollected(aweme) || !(!C0XQ7.LJFF().getCurSecUserId().equals(AwemeExtKt.getAuthorUid(aweme))) || C1030680cva.LJIIJJI(aweme) || !((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJ() || Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) || !((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIJJLI() || (context = getContext()) == null || C0SXF.LJIL(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C731910SnN CQ2(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM.CQ2(com.ss.android.ugc.aweme.feed.model.Aweme):X.0SnN");
    }

    public final void EQ2(long j) {
        if (j < 0) {
            j = 0;
        }
        this.LL = j;
    }

    public final void yQ2(String str) {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        String str2;
        Aweme aweme3;
        Aweme aweme4;
        DataCenter dataCenter;
        Aweme aweme5;
        PublishPreviewInfo previewData;
        String str3;
        Activity activityLIZ;
        Aweme aweme6;
        String str4;
        String str5;
        boolean zLJI = MethodIDManager.LJI(196692);
        VideoItemParams item = getItem();
        String authorUid = null;
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        String str6 = "";
        if (aweme == null) {
            IFeedMonitorService iFeedMonitorService = (IFeedMonitorService) ServiceManager.get().getService(IFeedMonitorService.class);
            VideoItemParams item2 = getItem();
            if (item2 != null && (str5 = item2.mEventType) != null) {
                str6 = str5;
            }
            iFeedMonitorService.LIZIZ("collect", str6, "awemeIsNull", false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        xQ2().LJ("VideoFavoriteVM handleFavoriteClick");
        C0S90.LIZ();
        VideoItemParams item3 = getItem();
        if (item3 != null && (aweme6 = item3.getAweme()) != null && AwemeExtKt.isScheduleVideo(aweme6)) {
            xQ2().LJ("VideoFavoriteVM handleFavoriteClick isScheduleVideo");
            C1233040iBy c1233040iBy = new C1233040iBy(getContext());
            c1233040iBy.LIZIZ(2131834434);
            c1233040iBy.LIZLLL();
            IFeedMonitorService iFeedMonitorService2 = (IFeedMonitorService) ServiceManager.get().getService(IFeedMonitorService.class);
            VideoItemParams item4 = getItem();
            if (item4 != null && (str4 = item4.mEventType) != null) {
                str6 = str4;
            }
            iFeedMonitorService2.LIZIZ("collect", str6, "isScheduleVideo", false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        VideoItemParams item5 = getItem();
        if (item5 != null && (aweme5 = item5.getAweme()) != null && (previewData = AwemeBizExtKt.getPreviewData(aweme5)) != null && previewData.inPublishing) {
            Context context = getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                xQ2().LJ("VideoFavoriteVM handleFavoriteClick inPublishing");
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131857903);
                c1389890mGx.LJIIJJI();
            }
            IFeedMonitorService iFeedMonitorService3 = (IFeedMonitorService) ServiceManager.get().getService(IFeedMonitorService.class);
            VideoItemParams item6 = getItem();
            if (item6 != null && (str3 = item6.mEventType) != null) {
                str6 = str3;
            }
            iFeedMonitorService3.LIZIZ("collect", str6, "inPublishing", false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        VideoItemParams item7 = getItem();
        if (item7 != null && (dataCenter = item7.dataCenter) != null) {
            dataCenter.zQ2(null, "video_favorite_click");
        }
        if (!AQ2()) {
            VideoItemParams item8 = getItem();
            if (item8 != null) {
                aweme4 = item8.getAweme();
            } else {
                aweme4 = null;
            }
            C1440005kM.LIZ(new C737030Svd(5401, aweme4));
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            xQ2().LJ("VideoFavoriteVM handleFavoriteClick isLoginNot");
            VideoItemParams item9 = getItem();
            if (item9 != null && (aweme3 = item9.getAweme()) != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            Context context2 = getContext();
            if (context2 != null) {
                Activity activityLJII = C1375500ltk.LJII(context2);
                VideoItemParams item10 = getItem();
                if (item10 != null && (str2 = item10.mEventType) != null) {
                    str6 = str2;
                }
                C627150Oin c627150Oin = new C627150Oin();
                C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                VideoItemParams item11 = getItem();
                if (item11 != null && (aweme2 = item11.getAweme()) != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                }
                C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid), c627150Oin.LIZ);
                C0XPD.LIZIZ(activityLJII, str6, "click_favorite_video", c627150Oin.LIZ, new C738970Syl(this, 0));
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        zQ2(str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM.zQ2(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return new C731530Sml(CQ2(videoItemParams.getAweme()), 126);
    }

    public final void DQ2(String str, boolean z, boolean z2) {
        String aid;
        Aweme aweme;
        AwemeStatistics statistics;
        long collectCount;
        Aweme aweme2;
        VideoItemParams item = getItem();
        if (item != null && item.getAweme() != null) {
            AbstractC1604130rqV abstractC1604130rqVXQ2 = xQ2();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshFavoriteState fake: ");
            sbLIZ.append(z);
            sbLIZ.append(" aid: ");
            sbLIZ.append(str);
            sbLIZ.append(" needShowAnim: ");
            sbLIZ.append(z2);
            abstractC1604130rqVXQ2.LJ(C2188811AlT.LIZIZ(sbLIZ));
            VideoItemParams item2 = getItem();
            if (item2 != null && (aweme2 = item2.getAweme()) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(str, aid)) {
                return;
            }
            if (z) {
                if (AQ2()) {
                    EQ2(this.LL - 1);
                } else {
                    EQ2(this.LL + 1);
                }
                this.LLILLJJLI = true ^ AQ2();
                setState(new AwS97S0110000_9(this, z2, 12));
                return;
            }
            VideoItemParams item3 = getItem();
            if (item3 != null && (aweme = item3.getAweme()) != null) {
                Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aweme.getAid());
                Context context = getContext();
                if (context == null || !C0SXF.LJIL(context) || (awemeLLILZ != null && AwemeExtKt.isCollected(aweme) == AwemeExtKt.isCollected(awemeLLILZ))) {
                    if ((awemeLLILZ != null && (statistics = awemeLLILZ.getStatistics()) != null) || (statistics = aweme.getStatistics()) != null) {
                        collectCount = statistics.getCollectCount();
                    } else {
                        collectCount = 0;
                    }
                    EQ2(collectCount);
                    if (this.LL < 0) {
                        EQ2(0L);
                    }
                    this.LLILLJJLI = AwemeExtKt.isCollected(aweme);
                    if (z2) {
                        setState(new AwS97S0110000_9(this, z2, 13));
                    } else {
                        setState(new AwS588S0100000_9(this, 697));
                    }
                }
            }
        }
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
    public final void vQ2(Aweme aweme, String str, String str2) {
        String str3;
        String str4;
        String string;
        VideoItemParams item;
        String str5;
        String enterPosition;
        Activity activityLIZ;
        String externalShareUrlUserId;
        String externalShareAwemeId;
        String externalShareUserOId;
        String externalShareAwemeId2;
        String strLIZ;
        Long exploreTabID;
        String fromExplorePage;
        String str6;
        C2189821An6 c2189821An6LIZ;
        DetailNavArgModel navArgModel;
        int i;
        Aweme aweme2;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        VideoItemParams item2 = getItem();
        if (item2 != null) {
            str3 = item2.mEventType;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str3, "from_music")) {
            FeedCommonService feedCommonService = (FeedCommonService) ServiceManager.get().getService(FeedCommonService.class);
            Context context = getContext();
            VideoItemParams item3 = getItem();
            if (item3 != null) {
                aweme2 = item3.getAweme();
            } else {
                aweme2 = null;
            }
            c2344009Gk.LIZJ(feedCommonService.LJJI(context, aweme2), "music_name");
        }
        Context context2 = getContext();
        String str7 = "favourite_video";
        if (context2 != null) {
            C1357130lQ7.LIZIZ(c2344009Gk, "favourite_video", C0SUC.LIZ(context2).getInboxLogExtra());
        }
        C2189821An6 c2189821An6LIZ2 = C0SUC.LIZ(getContext());
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        String tabName = c2189821An6LIZ2.getTabName();
        if (tabName != null && tabName.length() != 0) {
            c2344009Gk.LJFF("tab_name", c2189821An6LIZ2.getTabName());
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(aweme.getAuthor()));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LIZJ(C735370Ssx.LJJ(aweme), "text_post_content");
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        c2344009Gk.LJIIIIZZ("request_id", C735370Ssx.LJIJJ(aweme));
        if (C720360SNm.LJI(aweme) || C720360SNm.LJIIJJI(aweme)) {
            c2344009Gk.LJFF("is_text_mode", "1");
        }
        if (C720360SNm.LJIIJJI(aweme)) {
            c2344009Gk.LJFF("is_text_trans_pic", "1");
        }
        if (AwemeBizExtKt.getCacheSourceType(aweme) == C0N9C.OFFLINE_MODE.ordinal()) {
            c2344009Gk.LJFF("cache_video_source", "offline_video");
        }
        if (C720360SNm.LJFF(aweme)) {
            c2344009Gk.LJFF("is_comment_to_post", "1");
        }
        c2344009Gk.LJ(Boolean.valueOf(AwemeBizExtKt.isHighlighted(aweme)), "is_highlighted");
        c2344009Gk.LJ(Integer.valueOf(AwemeBizExtKt.getOriginalPos(aweme)), "rank_index");
        c2344009Gk.LIZJ(C0SXF.LJJIII(getContext(), aweme), "is_landscape_screen");
        c2344009Gk.LIZJ(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        C1380890m2R.LJFF(c2344009Gk, aweme);
        if (!AQ2()) {
            C1359610lU7.LJ(c2344009Gk, aweme, null);
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams(str, c1er1.LLZLLLL(str));
        if (!mapFetchSearchParams.isEmpty()) {
            c2344009Gk.LJII(C0JBR.LIZ(aweme, mapFetchSearchParams));
        }
        c1er1.LLILZ(aweme, str, c2344009Gk);
        Map<String, String> mapH0 = c1er1.h0(aweme);
        if (mapH0 != null) {
            c2344009Gk.LJII(mapH0);
        }
        if (C1EE2.LIZIZ.LIZLLL()) {
            VideoItemParams item4 = getItem();
            if (item4 != null) {
                i = item4.isEnterGraphicDetail;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_enter_graphic_detail");
        }
        Context context3 = getContext();
        if (context3 != null && (Intrinsics.LJFF("self_profile_search_result_feed", str) || Intrinsics.LJFF("other_profile_search_result_feed", str))) {
            c2344009Gk.LJFF("item_position", C0SUC.LIZ(context3).getItemPosition());
            c2344009Gk.LJFF("profile_search_id", C0SUC.LIZ(context3).getProfileSearchId());
        }
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            C1387380mCu c1387380mCuLIZLLL = ((IAnchorBusinessOutBridgeService) objPluggableSpi$default).LIZLLL(aweme);
            String str8 = c1387380mCuLIZLLL.LIZJ;
            String str9 = c1387380mCuLIZLLL.LIZLLL;
            if (C123100dR.LIZ(str8)) {
                c2344009Gk.LJFF("tt_template_type", str8);
            }
            if (C123100dR.LIZ(str9)) {
                c2344009Gk.LJFF("tt_template_id", str9);
            }
            VideoItemParams item5 = getItem();
            if (item5 != null) {
                str4 = item5.mEventType;
            } else {
                str4 = null;
            }
            if (Intrinsics.LJFF(str4, "homepage_nearby")) {
                C1606660rua.LIZIZ.LIZJ("homepage_nearby", (HashMap) c2344009Gk.LIZ, aweme, true);
            }
            C1367960lha.LIZ.getClass();
            Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, null);
            if (!mapLJIILJJIL.isEmpty()) {
                c2344009Gk.LJII(mapLJIILJJIL);
            }
            c1er1.LJJJJ().LIZ(c2344009Gk, aweme);
            if (C1386360mBG.LJI(str)) {
                c2344009Gk.LJFF("play_mode", C1386360mBG.LJ());
            }
            if (Intrinsics.LJFF(str, "creation_inspiration")) {
                try {
                    item = getItem();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (item != null && (str5 = item.trackerData) != null) {
                    string = JSONObjectProtectorUtils.getString(new JSONObject(str5), "inspiration_tab");
                } else {
                    string = null;
                }
                c2344009Gk.LJFF("creation_inspiration_category", string);
            }
            if (C123100dR.LIZ(C1381730m3n.LIZ(aweme))) {
                c2344009Gk.LJFF("photo_content_type", C1381730m3n.LIZ(aweme));
            }
            if (c2189821An6LIZ2.getPageType() == 125) {
                DetailNavArgModel navArgModel2 = c2189821An6LIZ2.getNavArgModel();
                if (navArgModel2 != null) {
                    enterPosition = navArgModel2.getEnterPosition();
                } else {
                    enterPosition = null;
                }
            } else {
                enterPosition = C0SUC.LIZ(getContext()).getExtra().get("enter_position");
            }
            if (C123100dR.LIZ(enterPosition)) {
                c2344009Gk.LJFF("enter_position", enterPosition);
            }
            Music music = aweme.getMusic();
            if (music != null) {
                c2344009Gk.LJFF("music_id", String.valueOf(music.getId()));
            }
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            C2344009Gk c2344009Gk2 = (C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
            C0SXF.LJ(c2344009Gk2, aweme, str);
            C2344009Gk c2344009Gk3 = (C2344009Gk) c2277711EDh.LJJIIJ(c2277711EDh.LJJIZ(c2344009Gk2, C0SUC.LIZ(getContext())));
            String exploreTabName = null;
            C0SXF.LJIIIZ(c2344009Gk3, aweme, getContext(), this.feedParams, Boolean.FALSE);
            C0SXF.LJIILJJIL(c2344009Gk3, aweme, getContext());
            C734780Ss0.LIZ(c2344009Gk3, null, this.feedParams);
            Object objLIZIZ = C1612650s4F.LIZIZ(c2344009Gk3, aweme);
            MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
            Context context4 = getContext();
            if (context4 != null) {
                activityLIZ = C1388190mED.LIZ(context4);
            } else {
                activityLIZ = null;
            }
            Object objAppendDetailParams = c1370890lmJ.appendDetailParams(objLIZIZ, str, musicDetailCommonModel.getDetailMobMaps(aweme, activityLIZ));
            String aid = aweme.getAid();
            C2189821An6 c2189821An6 = this.feedParams;
            if (c2189821An6 != null) {
                externalShareUrlUserId = c2189821An6.getExternalShareUrlUserId();
            } else {
                externalShareUrlUserId = null;
            }
            C2189821An6 c2189821An62 = this.feedParams;
            if (c2189821An62 != null) {
                externalShareAwemeId = c2189821An62.getExternalShareAwemeId();
            } else {
                externalShareAwemeId = null;
            }
            C1357660lQy.LIZIZ(aid, externalShareUrlUserId, externalShareAwemeId, "external_sharer_uid", objAppendDetailParams);
            String aid2 = aweme.getAid();
            C2189821An6 c2189821An63 = this.feedParams;
            if (c2189821An63 != null) {
                externalShareUserOId = c2189821An63.getExternalShareUserOId();
            } else {
                externalShareUserOId = null;
            }
            C2189821An6 c2189821An64 = this.feedParams;
            if (c2189821An64 != null) {
                externalShareAwemeId2 = c2189821An64.getExternalShareAwemeId();
            } else {
                externalShareAwemeId2 = null;
            }
            C1357660lQy.LIZIZ(aid2, externalShareUserOId, externalShareAwemeId2, "_oid", objAppendDetailParams);
            C2344009Gk c2344009Gk4 = (C2344009Gk) objAppendDetailParams;
            Map<String, String> extra = c2189821An6LIZ2.getExtra();
            if (extra != null) {
                String str10 = extra.get("game_bottom_bar_scene");
                if (str10 != null) {
                    c2344009Gk4.LJFF("game_bottom_bar_scene", str10);
                }
                c2344009Gk4.LJFF("related_live_tag", extra.get("related_live_tag"));
            }
            c2344009Gk4.LIZJ(aweme.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            c2344009Gk4.LIZJ(aweme.getIsCommentPostVideo() ? 1 : 0, "is_comment_post_video");
            String str11 = "";
            if (!Intrinsics.LJFF("homepage_hot", str)) {
                strLIZ = "";
            } else {
                strLIZ = C1383360m6Q.LIZ(aweme);
            }
            c2344009Gk4.LJIIIIZZ("redistribute_reason", strLIZ);
            c2344009Gk4.LIZJ(C720360SNm.LJII(aweme), "is_inspiration_added");
            c2344009Gk4.LIZJ(C720360SNm.LJIIJ(aweme), "is_photo_text_added");
            Map<String, Object> mapLJII = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
            if (mapLJII != null) {
                for (Map.Entry<String, Object> entry : mapLJII.entrySet()) {
                    c2344009Gk4.LJFF(entry.getKey(), entry.getValue().toString());
                }
            }
            if (!AQ2()) {
                CommentService.LIZ.getClass();
                Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, str);
                if (contentRecReasonParams != null) {
                    c2344009Gk4.LJII(contentRecReasonParams);
                }
            }
            C1366720lfa.LIZ(aweme, c2344009Gk4);
            C1366720lfa.LIZIZ(aweme, c2344009Gk4, str, C0SUC.LIZ(getContext()).getAid());
            C15WT c15wt = C15WT.LIZIZ;
            c15wt.LJFF(c2344009Gk4, str, C0SUC.LIZ(getContext()).getAid(), aweme.getAid());
            DetailNavArgModel navArgModel3 = C0SUC.LIZ(getContext()).getNavArgModel();
            if (navArgModel3 != null) {
                exploreTabID = navArgModel3.getExploreTabID();
            } else {
                exploreTabID = null;
            }
            DetailNavArgModel navArgModel4 = C0SUC.LIZ(getContext()).getNavArgModel();
            if (navArgModel4 != null) {
                exploreTabName = navArgModel4.getExploreTabName();
            }
            DetailNavArgModel navArgModel5 = C0SUC.LIZ(getContext()).getNavArgModel();
            if (navArgModel5 != null) {
                fromExplorePage = navArgModel5.getFromExplorePage();
            } else {
                fromExplorePage = null;
            }
            c15wt.LJIILIIL(c2344009Gk4, str, exploreTabID, exploreTabName, fromExplorePage);
            c15wt.LJIL(c2344009Gk4, str, aweme.getRequestId());
            HashMap<String, String> map = new HashMap<>();
            C1606660rua.LIZIZ.LIZJ(str, map, aweme, false);
            if (!map.isEmpty()) {
                c2344009Gk4.LJI(map);
            }
            C1367960lha.LIZ.getClass();
            IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
            Map mapLJIILJJIL2 = iPoiServiceLIZ.LJIILJJIL(aweme, iPoiServiceLIZ.LJLJL(aweme.getAid()));
            if (mapLJIILJJIL2 != null) {
                c2344009Gk4.LJII(mapLJIILJJIL2);
            }
            if (C07HI.LIZIZ) {
                Map<String, String> mapLJIL = C14TF.LIZIZ.LJIL(aweme, c2189821An6LIZ2);
                String str12 = mapLJIL.get("tako_response_type");
                if (str12 != null) {
                    c2344009Gk4.LJFF("tako_response_type", str12);
                }
                String str13 = mapLJIL.get("tako_response_rank");
                if (str13 != null) {
                    c2344009Gk4.LJFF("tako_response_rank", str13);
                }
                DetailNavArgModel navArgModel6 = c2189821An6LIZ2.getNavArgModel();
                if (navArgModel6 != null) {
                    String takoIndex = navArgModel6.getTakoIndex();
                    if (takoIndex != null && C123100dR.LIZ(takoIndex)) {
                        c2344009Gk4.LJFF("tako_index", takoIndex);
                    }
                    String takoStyle = navArgModel6.getTakoStyle();
                    if (takoStyle != null && C123100dR.LIZ(takoStyle)) {
                        c2344009Gk4.LJFF("tako_style", takoStyle);
                    }
                    String takoWordsPos = navArgModel6.getTakoWordsPos();
                    if (takoWordsPos != null && C123100dR.LIZ(takoWordsPos)) {
                        c2344009Gk4.LJFF("tako_words_pos", takoWordsPos);
                    }
                }
                String messageId = c2189821An6LIZ2.getMessageId();
                if (messageId != null && C123100dR.LIZ(messageId)) {
                    c2344009Gk4.LJFF("message_id", messageId);
                }
                String processId = c2189821An6LIZ2.getProcessId();
                if (processId != null && C123100dR.LIZ(processId)) {
                    c2344009Gk4.LJFF("process_id", processId);
                }
            }
            c2344009Gk4.LIZJ(AwemeBizExtKt.getRank(aweme), "rank");
            c2344009Gk4.LIZJ(C1017070cZd.LJJIIJ(aweme), "has_nova_like_effect");
            c2344009Gk4.LIZJ(aweme.isAd() ? 1 : 0, "is_ad");
            C2344009Gk c2344009Gk5 = (C2344009Gk) C1EE2.LIZIZ.LJJLIL(aweme, c2344009Gk4);
            String homepageUid = C0SUC.LIZ(getContext()).getHomepageUid();
            c2344009Gk5.getClass();
            c2344009Gk5.LJIIIIZZ("homepage_uid", homepageUid);
            c2344009Gk5.LJIIIIZZ("profile_entrance_id", C0SUC.LIZ(getContext()).getProfileEntranceId());
            c2344009Gk5.LJ(Boolean.valueOf(C1EE1.LIZIZ.LJJIII()), "if_default");
            C1599640rjG.LIZIZ.Ou(c2344009Gk5, new C1360330lVH(C1389300mG0.LIZIZ(this.fragment), null, null, null, 14));
            if (AwemeExtKt.isOfflineVideo(aweme)) {
                c2344009Gk5.LIZJ(1, "is_offline_video");
            }
            Context context5 = getContext();
            if (context5 != null && (c2189821An6LIZ = C0SUC.LIZ(context5)) != null && (navArgModel = c2189821An6LIZ.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel.isProfileTabSearch(), Boolean.TRUE)) {
                c2344009Gk5.LJFF("is_profile_tab_search", "1");
                String profileTabSearchId = navArgModel.getProfileTabSearchId();
                if (profileTabSearchId != null) {
                    str11 = profileTabSearchId;
                }
                c2344009Gk5.LJFF("profile_tab_search_id", str11);
            }
            TakoAIVideoMobFiller.INSTANCE.appendFeedParams(c2344009Gk5, c2189821An6LIZ2);
            Map<String, String> map2 = c2344009Gk5.LIZ;
            if (AQ2()) {
                str7 = "cancel_favourite_video";
            }
            C20684815ws.LJIILLIIL(str7, map2);
            if (aweme.isAd()) {
                if (AQ2()) {
                    str6 = "favorite_cancel";
                } else {
                    str6 = "favorite";
                }
                C2184171Adz.LIZLLL("draw_ad", str6, aweme.getAwemeRawAd()).LJII();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C731910SnN wQ2(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r0.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L6c
            int r0 = r0.getFavoriteShowScene()
            if (r0 != r2) goto L6c
            r7 = 1
        L1d:
            X.0SnN r5 = new X.0SnN
            java.lang.Object r0 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r4 = 0
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
        L2c:
            androidx.fragment.app.Fragment r0 = r8.fragment
            if (r0 == 0) goto L65
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L65
            boolean r0 = X.C0SXF.LJIL(r0)
            if (r0 != r2) goto L65
            boolean r0 = X.C0OAD.LIZIZ(r1)
            java.lang.String r3 = "0"
            if (r0 != 0) goto L50
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L50
            java.lang.String r3 = X.C1843500y4a.LIZIZ(r9)
        L4e:
            if (r3 == 0) goto L54
        L50:
            java.lang.String r4 = r8.mapZeroNumToString(r3)
        L54:
            if (r12 == 0) goto L63
            if (r7 != 0) goto L63
        L58:
            r8.updateOrigin(r6)
            boolean r0 = r8.getForceTextShow()
            r5.<init>(r4, r11, r0, r12)
            return r5
        L63:
            r6 = 4
            goto L58
        L65:
            java.lang.String r3 = X.C618720OOo.LIZ(r9)
            goto L4e
        L6a:
            r1 = r4
            goto L2c
        L6c:
            r7 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM.wQ2(long, boolean, boolean):X.0SnN");
    }
}
