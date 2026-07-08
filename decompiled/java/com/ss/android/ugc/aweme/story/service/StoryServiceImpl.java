package com.ss.android.ugc.aweme.story.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0B0V;
import X.C0M9T;
import X.C0MLA;
import X.C0O0P;
import X.C0PEM;
import X.C0RMW;
import X.C0ROF;
import X.C0ROW;
import X.C0SPF;
import X.C0SVD;
import X.C0SZ8;
import X.C0TRR;
import X.C0X12;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1558420qem;
import X.C1558520qew;
import X.C1569070qvx;
import X.C1598930ri7;
import X.C1601110rld;
import X.C1618440sDa;
import X.C1622206Wu;
import X.C18158079g;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C306750C0r;
import X.C330620Cxg;
import X.C331801Qm;
import X.C332001Qo;
import X.C439001nI;
import X.C452070Ho5;
import X.C452501pT;
import X.C705930RmZ;
import X.C706480RnS;
import X.C708880RrK;
import X.C712310Rwr;
import X.C718010SEl;
import X.C721900STk;
import X.C724750Sbp;
import X.C726870SfF;
import X.C726880SfG;
import X.C726890SfH;
import X.C726920SfK;
import X.C727100Sfc;
import X.C727530SgJ;
import X.C727640SgU;
import X.C728090ShD;
import X.C728210ShP;
import X.C728470Shp;
import X.C728480Shq;
import X.C729220Sj2;
import X.C729440SjO;
import X.C729510SjV;
import X.C735840Sti;
import X.C736950SvV;
import X.C737430SwH;
import X.C786410Ut5;
import X.InterfaceC1259230isD;
import X.InterfaceC1259300isK;
import X.InterfaceC1569000qvq;
import X.InterfaceC1588370rR5;
import X.InterfaceC1593650rZb;
import X.InterfaceC1597000rf0;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1605350rsT;
import X.InterfaceC1618460sDc;
import X.InterfaceC2135708Yh;
import X.InterfaceC330760Cxu;
import X.InterfaceC427710Gpt;
import X.InterfaceC438300HGq;
import X.InterfaceC438360HGw;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC706770Rnv;
import X.InterfaceC713360RyY;
import X.InterfaceC718030SEn;
import X.InterfaceC721960STq;
import X.InterfaceC727710Sgb;
import X.InterfaceC728100ShE;
import X.InterfaceC729810Sjz;
import X.InterfaceC729970SkF;
import X.InterfaceC729990SkH;
import X.InterfaceC734870Ss9;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS2S1000000_4;
import Y.ARunnableS75S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.MoveGestureInterceptAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.service.IStoryDebugService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.api.IStoryFollowUpPublishService;
import com.ss.android.ugc.aweme.story.audiencefooter.view.AudienceFooterBottomSheetComponent;
import com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import com.ss.android.ugc.aweme.story.celebration.create.reqeust.CelebrationMaterialLegoTask;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardInterceptor;
import com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.IStoryImmersiveUserFeedAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.storytopost.StoryToPostStateAbility;
import com.ss.android.ugc.aweme.story.friends.IStoryFriendsService;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceLogicAssem;
import com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceUIAssem;
import com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import com.ss.android.ugc.aweme.story.preload.StoryUidPreloader;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.ss.android.ugc.aweme.story.setting.ui.size.StoryAvatarConfigWrapper;
import com.ss.android.ugc.aweme.story.uiconfig.color.ColorConfigFactoryWrapper;
import com.ss.android.ugc.aweme.story.uiconfig.color.FactoryColorConfig;
import com.ss.android.ugc.aweme.story.uiconfig.color.GlobalStoryColorConfigFactory;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryServiceImpl implements IStoryService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(206));
    public int LIZIZ;
    public volatile boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJII() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFollowUpPublishService LJIILLIIL() {
        return (IStoryFollowUpPublishService) PluggableExtentionKt.pluggableSpi$default(IStoryFollowUpPublishService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIL() {
        StoryGuideUploadCardManager.LL.getClass();
        IStoryDebugService iStoryDebugService = (IStoryDebugService) ServiceManager.get().getService(IStoryDebugService.class);
        boolean zLIZJ = iStoryDebugService != null ? iStoryDebugService.LIZJ() : false;
        Map<String, Boolean> map = StoryGuideUploadCardManager.LLILZ;
        if (Intrinsics.LJFF(((LinkedHashMap) map).get(StoryGuideUploadCardManager.LIZJ()), Boolean.TRUE)) {
            if (!zLIZJ) {
                StoryGuideUploadCardManager.LLILLL.put(StoryGuideUploadCardManager.LIZJ(), null);
            }
            map.put(StoryGuideUploadCardManager.LIZJ(), Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0TRR LJJIII() {
        return new C0TRR() { // from class: X.0TQk
            @Override // X.C0TRR
            public final int LIZ() {
                throw null;
            }

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 2;
            }

            @Override // X.C0TRR
            public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                boolean z;
                List<CardShowInfo> list2;
                final int i;
                if (list != null) {
                    for (CardInsertResultInfo cardInsertResultInfo : list) {
                        int i2 = cardInsertResultInfo.cardInsertStatus;
                        if (10000 == cardInsertResultInfo.cardType && i2 != 20000) {
                            switch (i2) {
                                case 71001:
                                    i = 60001;
                                    break;
                                case 71002:
                                    i = 60002;
                                    break;
                                default:
                                    i = C538540LAe.LLJJJIL;
                                    break;
                            }
                            C2487409ou.LIZLLL(4000L, new Runnable() { // from class: X.0Sg9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    Activity activity;
                                    C19EG c19egLIZIZ;
                                    C1C7U.LIZ("StoryPushInsertExecutor@bc72.tryGetCardTypes$1$1");
                                    try {
                                        Activity[] activityStack = ActivityStack.getActivityStack();
                                        int length = activityStack.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                activity = null;
                                                break;
                                            }
                                            activity = activityStack[i3];
                                            if (activity instanceof InterfaceC1603190roz) {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        int i4 = i;
                                        if (activity != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null) {
                                            C728470Shp.LIZ(i4, c19egLIZIZ);
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("StoryPushInsertExecutor@bc72.tryGetCardTypes$1$1");
                                }
                            });
                        }
                    }
                }
                if (feedCardInsertData.LIZ == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (list2 = feedCardInsertData.showInfoList) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (CardShowInfo cardShowInfo : list2) {
                    if (2 == cardShowInfo.ruleType && 10000 == cardShowInfo.cardType) {
                        String str = C746610TQl.LIZ;
                        C746610TQl.LIZ = "";
                        if (str.length() == 0) {
                            return null;
                        }
                        arrayList.add(new CardTypeRequest(cardShowInfo.cardType, "", str));
                    }
                }
                return arrayList;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryMainTrackService LJJIJIIJI() {
        Object objLIZ = C04TD.LIZ(StoryMainTrackService.class, false);
        if (objLIZ != null) {
            return (StoryMainTrackService) objLIZ;
        }
        if (C04TD.B5 == null) {
            synchronized (StoryMainTrackService.class) {
                if (C04TD.B5 == null) {
                    C04TD.B5 = new StoryMainTrackServiceImpl();
                }
            }
        }
        return C04TD.B5;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729990SkH LJJIZ() {
        C01GW c01gw = C0B0V.LIZ;
        return (InterfaceC729990SkH) C0B0V.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryRevealService LJJJJ() {
        return (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1569000qvq LJJJJJL() {
        C18158079g.LIZ.getClass();
        return C18158079g.LIZ() ? C1569070qvx.LIZ : new C727640SgU();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJJLL() {
        StoryGuideUploadCardManager.LL.getClass();
        return Intrinsics.LJFF(StoryGuideUploadCardManager.LLJ, "STORY_ENTRANCE_GUIDE_CARD");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final StoryHomepageService LJJJJZ() {
        Object objLIZ = C04TD.LIZ(StoryHomepageService.class, false);
        if (objLIZ != null) {
            return (StoryHomepageService) objLIZ;
        }
        if (C04TD.A5 == null) {
            synchronized (StoryHomepageService.class) {
                if (C04TD.A5 == null) {
                    C04TD.A5 = new StoryHomepageServiceImpl();
                }
            }
        }
        return C04TD.A5;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJLIIL() {
        StoryGuideUploadCardManager storyGuideUploadCardManager = StoryGuideUploadCardManager.LL;
        Map<String, Boolean> map = StoryGuideUploadCardManager.LLILZ;
        storyGuideUploadCardManager.getClass();
        if (Intrinsics.LJFF(((LinkedHashMap) map).get(StoryGuideUploadCardManager.LIZJ()), Boolean.TRUE)) {
            C0ROF.LIZ.getClass();
            C0ROF.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJLL() {
        StoryGuideUploadCardManager.LL.getClass();
        StoryInsertCard storyInsertCard = (StoryInsertCard) ((LinkedHashMap) StoryGuideUploadCardManager.LLILLL).get(StoryGuideUploadCardManager.LIZJ());
        if (storyInsertCard != null) {
            return storyInsertCard.insertLast();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryPreloaderV2 LJJLI() {
        return (IStoryPreloaderV2) PluggableExtentionKt.pluggableSpi$default(IStoryPreloaderV2.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void clear() {
        C729220Sj2.LL.getClass();
        C728210ShP c728210ShP = C729220Sj2.LLILLL;
        c728210ShP.LIZJ.clear();
        c728210ShP.LIZIZ().clear();
        c728210ShP.LIZIZ.set(false);
        C729440SjO c729440SjO = C729220Sj2.LJIIZILJ().LLILLJJLI;
        c729440SjO.LLILZIL = false;
        c729440SjO.LLILZLL = false;
        c729440SjO.LLIZ.set(false);
        C728090ShD.LIZ.clear();
        C726920SfK.LIZ.getClass();
        ((LinkedHashMap) C726920SfK.LIZIZ).clear();
        ((LinkedHashMap) C726920SfK.LIZJ).clear();
        ((LinkedHashMap) C726920SfK.LIZLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LIZ() {
        return C1601110rld.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIIZ() {
        if (C306750C0r.LIZ()) {
            C439001nI.LIZ.getClass();
            if (C439001nI.LIZLLL()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C332001Qo(null), 3);
                if (this.LIZJ) {
                    return;
                }
                this.LIZJ = true;
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(new InterfaceC427710Gpt() { // from class: X.01Vb
                    @Override // X.InterfaceC427710Gpt
                    public final void LLLLLLZZ(int i, User user, User user2) {
                        String uid;
                        String uid2;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        if (user2 != null) {
                            uid2 = user2.getUid();
                        } else {
                            uid2 = null;
                        }
                        if (!Intrinsics.LJFF(uid, uid2) && user2 != null) {
                            this.LL.getClass();
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C332001Qo(null), 3);
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJIIJZLJL() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableLightningPrivacySetting() && C1601110rld.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC734870Ss9 LJIIJJI() {
        return C737430SwH.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438300HGq LJIILL() {
        return new InterfaceC438300HGq() { // from class: X.0H7F
            public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("😍", "😂", "😳");

            @Override // X.InterfaceC438300HGq
            public final List LIZ(int i, int i2, List list) {
                List<String> listLIZIZ;
                if (i >= 0 && i2 >= 0) {
                    if (list == null || list.isEmpty()) {
                        list = LIZIZ;
                    }
                    if (i2 != 0) {
                        listLIZIZ = C424420Gka.LIZ().LIZIZ(i2);
                    } else {
                        listLIZIZ = C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!listLIZIZ.contains(obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = (ArrayList) C13LP.LJLIL(arrayList, listLIZIZ);
                    return arrayList2.subList(0, Math.min(i, arrayList2.size()));
                }
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1618460sDc LJIJJLI() {
        return new InterfaceC1618460sDc() { // from class: X.14To
            public static boolean LJFF;
            public static Aweme LJIIIIZZ;
            public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1861107Qr());
            public static final C01GW LIZJ = C452501pT.LIZIZ(new C728300ShY());
            public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1861007Qq());
            public static long LJ = -1;
            public static String LJI = "";
            public static String LJII = "";
            public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1863907Rt());

            @Override // X.InterfaceC1618460sDc
            public final void LIZLLL() {
                LJFF = false;
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIJJ() {
                LJFF = false;
                LJII = LJI;
                LJI = "";
            }

            @Override // X.InterfaceC1618460sDc
            public final ForwardImageDownloader LJFF() {
                return new ForwardImageDownloader() { // from class: X.0MLh
                    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C581260Mqy(CoroutineExceptionHandler.LJJLIL, 5)));

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader
                    public final void downloadPhotoModeResource(ForwardMedia forwardMedia, List<ForwardMediaDownloader.DownloadConfig> list, boolean z, ForwardImageDownloader.ImageDownloadListener imageDownloadListener) {
                        C23250099c.LIZLLL(this.LIZ, null, null, new C566890MLf(forwardMedia, list, imageDownloadListener, this, z, null), 3);
                    }
                };
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJII() {
                ((Keva) LIZIZ.getValue()).storeBoolean(LIZ("public_comment_to_story_guide_status"), false);
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIILIIL() {
                if (LJII.length() == 0 || LJFF) {
                    return;
                }
                LJFF = true;
            }

            @Override // X.InterfaceC1618460sDc
            public final boolean LJIIZILJ() {
                return ((Keva) LIZIZ.getValue()).getBoolean(LIZ("public_comment_to_story_guide_status"), true);
            }

            @Override // X.InterfaceC1618460sDc
            public final ForwardVideoPlayerCacheProvider LIZIZ() {
                return C201973141b.LIZ;
            }

            @Override // X.InterfaceC1618460sDc
            public final ForwardMediaDownloader LIZJ() {
                return C201973141b.LIZ;
            }

            @Override // X.InterfaceC1618460sDc
            public final long LJIILL() {
                return LJ;
            }

            public static String LIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public static void LJJII(EnumC729530SjX enumC729530SjX) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(enumC729530SjX.getId(), "reason");
                C20684815ws.LJIILLIIL("share_to_story_entrance_not_showing", c2344009Gk.LIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC1618460sDc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIJ(X.C20271514Tp r17) {
                /*
                    r16 = this;
                    r0 = 196683(0x3004b, float:2.75612E-40)
                    boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
                    X.141b r7 = X.C201973141b.LIZ
                    r7.getClass()
                    java.lang.Class<com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService> r0 = com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService.class
                    r1 = 0
                    r4 = 14
                    r5 = 0
                    r2 = r1
                    r3 = r1
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                    com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService r0 = (com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService) r0
                    if (r0 == 0) goto L25
                    X.0M9f r0 = r0.LIZLLL()
                    if (r0 == 0) goto L25
                    r0.trimLowMemoryTask()
                L25:
                    X.01GW r0 = X.C201973141b.LIZJ
                    java.lang.Object r2 = r0.getValue()
                    X.0sDc r2 = (X.InterfaceC1618460sDc) r2
                    r5 = r17
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LIZIZ
                    java.lang.String r1 = "Required value was null."
                    if (r0 == 0) goto Lb3
                    r2.LJJ(r0)
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.LIZIZ
                    if (r4 == 0) goto Laa
                    int r0 = r4.getAwemeType()
                    r6 = 1
                    if (r0 != 0) goto La8
                    boolean r0 = X.C287150BNh.LIZ()
                    if (r0 == 0) goto La8
                    r3 = 1
                    java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r9 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
                    r10 = 0
                    r13 = 14
                    r14 = 0
                    r11 = r10
                    r12 = r10
                    java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
                    com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r2 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r2
                    if (r2 == 0) goto La2
                    android.content.Context r1 = r5.LIZ
                    java.lang.String r0 = "share_to_story"
                    boolean r0 = r2.LIZJ(r1, r0, r6)
                    if (r0 != r6) goto La2
                    X.054G r2 = X.C201973141b.LIZLLL
                    X.057e r1 = new X.057e
                    r1.<init>(r14)
                    r0 = 3
                    X.C23250099c.LIZLLL(r2, r14, r14, r1, r0)
                L6f:
                    X.0MML r12 = new X.0MML
                    int r0 = r5.LJIIIIZZ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct r2 = X.C201973141b.LJIIIIZZ(r4, r0)
                    com.ss.android.ugc.aweme.sticker.data.MentionStruct r1 = X.C201973141b.LJFF(r4)
                    boolean r0 = r5.LJIILIIL
                    r12.<init>(r2, r1, r0, r3)
                    X.1E2W r9 = X.C1E2W.LIZIZ
                    android.content.Context r10 = r5.LIZ
                    java.lang.String r3 = r5.LIZJ
                    r13 = 0
                    java.lang.String r2 = r5.LJ
                    boolean r0 = r5.LJIILJJIL
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    java.lang.String r0 = ""
                    r7.getClass()
                    com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r11 = X.C201973141b.LIZLLL(r3, r0, r2, r4, r1)
                    r14 = 8
                    r15 = r13
                    com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService.DefaultImpls.startForward$default(r9, r10, r11, r12, r13, r14, r15)
                La2:
                    if (r8 == 0) goto La7
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                La7:
                    return
                La8:
                    r3 = 0
                    goto L6f
                Laa:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r1.toString()
                    r0.<init>(r1)
                    throw r0
                Lb3:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20271414To.LJIIJ(X.14Tp):void");
            }

            @Override // X.InterfaceC1618460sDc
            public final synchronized void LJIIJJI(String str) {
                C01GW c01gw = LJIIIZ;
                Aweme aweme = (Aweme) ((HashMap) c01gw.getValue()).get(str);
                if (aweme == null) {
                    return;
                }
                ((HashMap) c01gw.getValue()).remove(str);
                AwemeExtKt.updateAwemeShareToStoryStatusWhenDeleted(aweme);
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIILJJIL(long j) {
                LJ = j;
            }

            @Override // X.InterfaceC1618460sDc
            public final synchronized void LJIILLIIL(Aweme aweme) {
                Aweme aweme2 = LJIIIIZZ;
                if (aweme2 == null) {
                    return;
                }
                ((HashMap) LJIIIZ.getValue()).put(aweme.getAid(), aweme2);
                AwemeExtKt.updateAwemeShareToStoryStatusWhenShared(aweme2);
            }

            @Override // X.InterfaceC1618460sDc
            public final ForwardMedia LJIJJLI(MediaModel mediaModel) {
                C201973141b.LIZ.getClass();
                return C201973141b.LIZJ(mediaModel);
            }

            @Override // X.InterfaceC1618460sDc
            public final synchronized void LJJ(Aweme aweme) {
                LJIIIIZZ = aweme;
            }

            @Override // X.InterfaceC1618460sDc
            public final long LJJIFFI(long j) {
                C01GW c01gw = LIZLLL;
                Pair pair = (Pair) ((HashMap) c01gw.getValue()).get(Long.valueOf(j));
                if (pair != null) {
                    ((HashMap) c01gw.getValue()).remove(Long.valueOf(j));
                    String str = (String) pair.getSecond();
                    if (str == null) {
                        str = "";
                    }
                    LJI = str;
                    return ((Number) pair.getFirst()).longValue();
                }
                return -1L;
            }

            @Override // X.InterfaceC1618460sDc
            public final boolean LJ(Fragment fragment, Aweme aweme) {
                String aid;
                String aid2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("forceInitialStartZero: hasAdoptedLastShareToStorySourceId = ");
                sbLIZ.append(LJFF);
                sbLIZ.append(", lastShareToStorySourceId = ");
                sbLIZ.append(LJII);
                sbLIZ.append(", aweme?.aid = ");
                UserStory userStory = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!LJFF) {
                    LJII = "";
                    return false;
                }
                if (!C0RMW.LIZ.LJJIIJZLJL(fragment)) {
                    LJII = "";
                    return false;
                }
                if (aweme != null) {
                    aid2 = aweme.getAid();
                } else {
                    aid2 = null;
                }
                if (Intrinsics.LJFF(aid2, LJII)) {
                    LJFF = false;
                    LJII = "";
                    return true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("forceInitialStartZero return false: other, aweme?.userStory = ");
                if (aweme != null) {
                    userStory = aweme.getUserStory();
                }
                sbLIZ2.append(userStory);
                C2188811AlT.LIZIZ(sbLIZ2);
                LJII = "";
                return false;
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIIIIZZ(String str, String str2) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("action_type", str);
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                C20684815ws.LJIILLIIL("mention_add_to_story_button", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIIL(CommentVideoModel commentVideoModel, C20271514Tp c20271514Tp) {
                C563770M9f c563770M9fLIZLLL;
                C201973141b c201973141b = C201973141b.LIZ;
                c201973141b.getClass();
                SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
                if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                    c563770M9fLIZLLL.trimLowMemoryTask();
                }
                InterfaceC1618460sDc interfaceC1618460sDc = (InterfaceC1618460sDc) C201973141b.LIZJ.getValue();
                Aweme aweme = c20271514Tp.LIZIZ;
                if (aweme != null) {
                    interfaceC1618460sDc.LJJ(aweme);
                    Aweme aweme2 = c20271514Tp.LIZIZ;
                    if (aweme2 != null) {
                        C1E2W c1e2w = C1E2W.LIZIZ;
                        Context context = c20271514Tp.LIZ;
                        String str = c20271514Tp.LIZJ;
                        String str2 = c20271514Tp.LJ;
                        Boolean boolValueOf = Boolean.valueOf(c20271514Tp.LJIILJJIL);
                        c201973141b.getClass();
                        ICreativeForwardService.DefaultImpls.startForward$default(c1e2w, context, C201973141b.LIZLLL(str, "", str2, aweme2, boolValueOf), new C0MMM(commentVideoModel, C201973141b.LJIIIIZZ(aweme2, Integer.valueOf(c20271514Tp.LJIIIIZZ)), C201973141b.LJFF(aweme2), false, false), null, 8, null);
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIJ(C20271514Tp c20271514Tp, Function0<Unit> function0) {
                boolean zLJI = MethodIDManager.LJI(196667);
                C201973141b c201973141b = C201973141b.LIZ;
                c201973141b.getClass();
                if (((ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class)).needJumpToOnThisDayPreviewPage()) {
                    ArrayList arrayList = new ArrayList();
                    List<Aweme> list = c20271514Tp.LJFF;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Aweme aweme : list) {
                            C201973141b c201973141b2 = C201973141b.LIZ;
                            String str = c20271514Tp.LIZJ;
                            String str2 = c20271514Tp.LIZLLL;
                            Boolean bool = Boolean.FALSE;
                            c201973141b2.getClass();
                            arrayList2.add(C201973141b.LIZLLL(str, str2, "", aweme, bool));
                        }
                        arrayList.addAll(arrayList2);
                    }
                    List<MediaModel> list2 = c20271514Tp.LJIIIZ;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (MediaModel mediaModel : list2) {
                            C201973141b.LIZ.getClass();
                            arrayList3.add(C201973141b.LIZJ(mediaModel));
                        }
                        arrayList.addAll(arrayList3);
                    }
                    C1E2W.LIZIZ.forwardOnThisDay(c20271514Tp.LIZ, arrayList, new C0MML(null, null, false, false), 0, c20271514Tp.LJ, null, c20271514Tp.LJIIJ, c20271514Tp.LJIIJJI, c20271514Tp.LJIIL, function0);
                } else {
                    Aweme aweme2 = c20271514Tp.LIZIZ;
                    if (aweme2 != null) {
                        C1E2W c1e2w = C1E2W.LIZIZ;
                        Context context = c20271514Tp.LIZ;
                        String str3 = c20271514Tp.LIZJ;
                        String str4 = c20271514Tp.LIZLLL;
                        Boolean bool2 = Boolean.FALSE;
                        c201973141b.getClass();
                        c1e2w.forwardOnThisDay(context, C201973141b.LIZLLL(str3, str4, "", aweme2, bool2), new C0MML(C201973141b.LJIIIIZZ(aweme2, -1), C201973141b.LJFF(aweme2), false, false), function0);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC1618460sDc
            public final boolean LJIJI(Aweme aweme, boolean z) {
                int duration;
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    LJJII(EnumC729530SjX.NOT_LOGIN);
                    return false;
                }
                if (!C1601110rld.LIZ()) {
                    return false;
                }
                InteractPermission interactPermission = aweme.getInteractPermission();
                if (interactPermission != null && interactPermission.getAllowAddingToStory() == 0) {
                    Video video = aweme.getVideo();
                    if (video != null) {
                        duration = video.getDuration();
                    } else {
                        duration = Integer.MAX_VALUE;
                    }
                    if (duration > ((Number) LIZJ.getValue()).longValue()) {
                        LJJII(EnumC729530SjX.VIDEO_IS_TOO_LONG);
                        return false;
                    }
                    if (!C729980SkG.LJIIIIZZ(aweme)) {
                        C735280Sso.LIZ.getClass();
                        if (!C735280Sso.LJI(aweme)) {
                            LJJII(EnumC729530SjX.NOT_SELF_AND_NOT_PUBLIC);
                            return false;
                        }
                    }
                    if (!aweme.getIsTikTokStory() || z) {
                        return true;
                    }
                    LJJII(EnumC729530SjX.STORY_CANT_BE_SHARED_FROM_ENTRANCE);
                    return false;
                }
                LJJII(EnumC729530SjX.NO_PERMISSION_TO_ADD_TO_STORY);
                return false;
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJIL(C20271514Tp c20271514Tp, String str) {
                C201973141b.LIZ.getClass();
                C1E2W.LIZIZ.forwardOnThisDay(c20271514Tp.LIZ, c20271514Tp.LJ, new C0MML(null, null, false, false), c20271514Tp.LJII, str, c20271514Tp.LJIILL, c20271514Tp.LJIILLIIL, c20271514Tp.LJIIZILJ, c20271514Tp.LJIJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[EDGE_INSN: B:13:0x0058->B:14:0x005a BREAK  A[LOOP:0: B:7:0x0040->B:33:0x0040], PHI: r20
              0x005a: PHI (r20v2 boolean) = (r20v0 boolean), (r20v3 boolean) binds: [B:28:0x014e, B:13:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
            @Override // X.InterfaceC1618460sDc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27, kotlin.jvm.functions.Function1 r28) {
                /*
                    Method dump skipped, instruction units count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20271414To.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, kotlin.jvm.functions.Function1):void");
            }

            @Override // X.InterfaceC1618460sDc
            public final void LJJI(long j, long j2, String str) {
                ((HashMap) LIZLLL.getValue()).put(Long.valueOf(j), new Pair(Long.valueOf(j2), str));
            }

            @Override // X.InterfaceC1618460sDc
            public final ForwardMedia LJIIIZ(String str, String str2, Aweme aweme, Boolean bool) {
                C201973141b.LIZ.getClass();
                return C201973141b.LIZLLL(str, str2, "", aweme, bool);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0ROW LJJ() {
        return C706480RnS.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259230isD LJJI() {
        return C726920SfK.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1593650rZb LJJIFFI() {
        return C729220Sj2.LL;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1259300isK LJJII() {
        return C726870SfF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC706770Rnv LJJIIJ() {
        return C0RMW.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryInboxService LJJIIZI() {
        return C1598930ri7.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC718030SEn LJJIJIIJIL() {
        return new InterfaceC718030SEn() { // from class: X.0SEk
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(466));

            /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
            @Override // X.InterfaceC718030SEn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo LIZIZ() {
                /*
                    r5 = this;
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    com.ss.android.ugc.aweme.story.education.StoryNewUserEducationData r0 = X.C0M9T.LIZ()
                    boolean r0 = r0.enable24hEducation
                    r4 = 1
                    if (r0 != 0) goto L1e
                    com.ss.android.ugc.aweme.story.education.StoryNewUserEducationData r0 = X.C0M9T.LIZ()
                    boolean r0 = r0.enableAILiveEducationSuppression
                    if (r0 != 0) goto L1e
                    com.ss.android.ugc.aweme.story.education.StoryNewUserEducationData r0 = X.C0M9T.LIZ()
                    boolean r0 = r0.enableViewerInsightOverlay
                    if (r0 == 0) goto L32
                L1e:
                    X.0SEl r0 = X.C718010SEl.LIZ
                    r0.getClass()
                    boolean r0 = X.C718010SEl.LJIIJ()
                    if (r0 != 0) goto L32
                    com.ss.android.ugc.aweme.story.feed.InsertStruct r1 = new com.ss.android.ugc.aweme.story.feed.InsertStruct
                    r0 = 2
                    r1.<init>(r0)
                    r3.add(r1)
                L32:
                    X.01GW r0 = X.C718000SEk.LIZIZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.aweme.service.IStoryDebugService r0 = (com.ss.android.ugc.aweme.service.IStoryDebugService) r0
                    if (r0 == 0) goto L6c
                    boolean r2 = r0.LIZJ()
                L40:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "mockGuideUploadCard: "
                    r1.append(r0)
                    r1.append(r2)
                    X.C2188811AlT.LIZIZ(r1)
                    if (r2 != 0) goto L5c
                    com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager r0 = com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager.LL
                    r0.getClass()
                    boolean r0 = com.ss.android.ugc.aweme.story.feed.guideuploadcard.StoryGuideUploadCardManager.LIZ()
                    if (r0 == 0) goto L64
                L5c:
                    com.ss.android.ugc.aweme.story.feed.InsertStruct r0 = new com.ss.android.ugc.aweme.story.feed.InsertStruct
                    r0.<init>(r4)
                    r3.add(r0)
                L64:
                    boolean r0 = r3.isEmpty()
                    if (r0 == 0) goto L6e
                    r0 = 0
                    return r0
                L6c:
                    r2 = 0
                    goto L40
                L6e:
                    com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo r0 = new com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo
                    r0.<init>(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C718000SEk.LIZIZ():com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo");
            }

            @Override // X.InterfaceC718030SEn
            public final void LIZ(List<StoryInsertCard> list) {
                StoryInsertCard storyInsertCard;
                boolean z;
                StoryInsertCard next;
                Integer num;
                Iterator<StoryInsertCard> it2 = list.iterator();
                while (true) {
                    storyInsertCard = null;
                    z = false;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.cardType == 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                StoryInsertCard storyInsertCard2 = next;
                if (storyInsertCard2 != null) {
                    StoryGuideUploadCardManager.LL.getClass();
                    StoryGuideUploadCardManager.LIZIZ(storyInsertCard2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("response cards,cardType: ");
                    sbLIZ.append(storyInsertCard2.cardType);
                    sbLIZ.append(", insertIndex:");
                    sbLIZ.append(storyInsertCard2.insertIndex);
                    sbLIZ.append(", coverUrls:");
                    sbLIZ.append(storyInsertCard2.coverUrls);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                Iterator<StoryInsertCard> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    StoryInsertCard next2 = it3.next();
                    if (next2.cardType == 2) {
                        storyInsertCard = next2;
                        break;
                    }
                }
                StoryInsertCard storyInsertCard3 = storyInsertCard;
                if (storyInsertCard3 != null && (num = storyInsertCard3.userHasPublishStory) != null) {
                    if (num.intValue() != 0) {
                        z = true;
                    }
                    C718010SEl.LIZ.getClass();
                    C718010SEl.LJIIIIZZ(z);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597970rgZ LJJIJIL() {
        return C0SVD.LL;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729970SkF LJJIJLIJ() {
        return new InterfaceC729970SkF() { // from class: X.0rxm
            @Override // X.InterfaceC729970SkF
            public final C727830Sgn LIZ() {
                ColorConfig colorConfig;
                ColorConfig colorConfig2;
                ColorConfig colorConfig3;
                FactoryColorConfig next;
                FactoryColorConfig next2;
                C727830Sgn c727830Sgn = C1608670rxp.LIZIZ;
                if (c727830Sgn == null) {
                    ColorConfigFactoryWrapper colorConfigFactoryWrapper = ((GlobalStoryColorConfigFactory) C1608670rxp.LIZ.getValue()).colorConfig;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("color json: ");
                    sbLIZ.append(colorConfigFactoryWrapper);
                    C2188811AlT.LIZIZ(sbLIZ);
                    ColorConfig colorConfig4 = C1608650rxn.LIZ;
                    List<FactoryColorConfig> list = colorConfigFactoryWrapper.avatarBadgeColor;
                    FactoryColorConfig factoryColorConfig = null;
                    if (C1608660rxo.LIZ) {
                        Iterator<FactoryColorConfig> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (Intrinsics.LJFF(next2.id, C1608660rxo.LIZJ)) {
                                break;
                            }
                        }
                        FactoryColorConfig factoryColorConfig2 = next2;
                        if (factoryColorConfig2 == null || (colorConfig = factoryColorConfig2.colorConfig) == null) {
                            colorConfig = C1608650rxn.LJII;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("badge find res: ");
                        sbLIZ2.append(colorConfig);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        colorConfig = C1608650rxn.LJII;
                    }
                    List<FactoryColorConfig> list2 = colorConfigFactoryWrapper.recordButtonColor;
                    if (C1608660rxo.LIZ) {
                        Iterator<FactoryColorConfig> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.LJFF(next.id, C1608660rxo.LIZJ)) {
                                break;
                            }
                        }
                        FactoryColorConfig factoryColorConfig3 = next;
                        if (factoryColorConfig3 == null || (colorConfig2 = factoryColorConfig3.colorConfig) == null) {
                            colorConfig2 = C1608650rxn.LIZLLL;
                        }
                    } else {
                        colorConfig2 = C1608650rxn.LIZLLL;
                    }
                    List<FactoryColorConfig> list3 = colorConfigFactoryWrapper.storyTagColor;
                    if (C1608660rxo.LIZ) {
                        Iterator<FactoryColorConfig> it4 = list3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            FactoryColorConfig next3 = it4.next();
                            if (Intrinsics.LJFF(next3.id, C1608660rxo.LIZJ)) {
                                factoryColorConfig = next3;
                                break;
                            }
                        }
                        FactoryColorConfig factoryColorConfig4 = factoryColorConfig;
                        if (factoryColorConfig4 == null || (colorConfig3 = factoryColorConfig4.colorConfig) == null) {
                            colorConfig3 = C1608650rxn.LJIIJ;
                        }
                    } else if (C281310B0v.LIZ()) {
                        Iterator<FactoryColorConfig> it5 = list3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            FactoryColorConfig next4 = it5.next();
                            if (Intrinsics.LJFF(next4.id, "blue_theme_type_v2")) {
                                factoryColorConfig = next4;
                                break;
                            }
                        }
                        FactoryColorConfig factoryColorConfig5 = factoryColorConfig;
                        if (factoryColorConfig5 == null || (colorConfig3 = factoryColorConfig5.colorConfig) == null) {
                            colorConfig3 = C1608650rxn.LJIIJ;
                        }
                    } else {
                        Iterator<FactoryColorConfig> it6 = list3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            FactoryColorConfig next5 = it6.next();
                            if (Intrinsics.LJFF(next5.id, "blue_theme_type_v1")) {
                                factoryColorConfig = next5;
                                break;
                            }
                        }
                        FactoryColorConfig factoryColorConfig6 = factoryColorConfig;
                        if (factoryColorConfig6 == null || (colorConfig3 = factoryColorConfig6.colorConfig) == null) {
                            colorConfig3 = C1608650rxn.LJIIJ;
                        }
                    }
                    c727830Sgn = new C727830Sgn(colorConfig4, colorConfig, colorConfig2, colorConfig3);
                    C1608670rxp.LIZIZ = c727830Sgn;
                }
                return c727830Sgn;
            }

            @Override // X.InterfaceC729970SkF
            public final C727720Sgc LIZIZ() {
                int i = C1605420rsa.LIZ;
                Double dValueOf = Double.valueOf(2.5d);
                StoryAvatarConfigWrapper storyAvatarConfigWrapper = new StoryAvatarConfigWrapper(3.0f, 2.5f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
                StoryAvatarConfigWrapper storyAvatarConfigWrapper2 = new StoryAvatarConfigWrapper(1.5f, 3.5f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
                StoryAvatarConfigWrapper storyAvatarConfigWrapper3 = new StoryAvatarConfigWrapper(3.0f, 2.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                StoryAvatarConfigWrapper storyAvatarConfigWrapper4 = new StoryAvatarConfigWrapper(1.5f, 3.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                StoryAvatarConfigWrapper storyAvatarConfigWrapper5 = new StoryAvatarConfigWrapper(2.0f, 2.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                if (i == 1) {
                    HashMap map = new HashMap();
                    map.put("blue_state", storyAvatarConfigWrapper);
                    map.put("gray_state", storyAvatarConfigWrapper2);
                    return new C727720Sgc(map);
                }
                if (i != 2) {
                    HashMap map2 = new HashMap();
                    map2.put("blue_state", storyAvatarConfigWrapper5);
                    map2.put("gray_state", storyAvatarConfigWrapper5);
                    return new C727720Sgc(map2);
                }
                HashMap map3 = new HashMap();
                map3.put("blue_state", storyAvatarConfigWrapper3);
                map3.put("gray_state", storyAvatarConfigWrapper4);
                return new C727720Sgc(map3);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[PHI: r6
              0x0021: PHI (r6v2 int[]) = (r6v0 int[]), (r6v3 int[]) binds: [B:7:0x001b, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d A[PHI: r6
              0x001d: PHI (r6v3 int[]) = (r6v0 int[]), (r6v4 int[]) binds: [B:7:0x001b, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC729970SkF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.graphics.LinearGradient LIZJ(android.content.Context r10, float r11, float r12) {
                /*
                    r9 = this;
                    r2 = 0
                    X.0Sgn r0 = r9.LIZ()
                    com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig r0 = r0.LIZ
                    X.0RKw r1 = X.C694210RKx.LIZ(r0, r10)
                    if (r1 == 0) goto L11
                    int[] r6 = r1.LIZ
                    if (r6 != 0) goto L1d
                L11:
                    X.0rvF r0 = X.C1607070rvF.LIZIZ
                    X.0rt5 r0 = r0.LJI()
                    int[] r6 = r0.LJIIL(r10)
                    if (r1 == 0) goto L21
                L1d:
                    float[] r7 = r1.LIZIZ
                    if (r7 != 0) goto L25
                L21:
                    float[] r7 = X.C1606910ruz.LIZIZ()
                L25:
                    android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
                    android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
                    r5 = r12
                    r4 = r11
                    r3 = r2
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1608640rxm.LIZJ(android.content.Context, float, float):android.graphics.LinearGradient");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC721960STq LJJJIL() {
        return C721900STk.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final NetworkPartner LJJJJI() {
        return StoryGuideUploadCardInterceptor.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC729810Sjz LJJJJIZL() {
        return new InterfaceC729810Sjz() { // from class: X.12N9
            @Override // X.InterfaceC729810Sjz
            public final void LIZ(View view, VideoPublishEditModel videoPublishEditModel, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
                Context context;
                C19EG c19egLIZIZ;
                FragmentManager supportFragmentManager;
                if (view == null || (context = view.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || videoPublishEditModel == null) {
                    return;
                }
                AudienceFooterBottomSheetComponent audienceFooterBottomSheetComponent = new AudienceFooterBottomSheetComponent();
                Bundle bundle = new Bundle();
                C1428470nHB.LLIL(bundle, videoPublishEditModel);
                audienceFooterBottomSheetComponent.setArguments(bundle);
                audienceFooterBottomSheetComponent.LLIZLLLIL = function1;
                audienceFooterBottomSheetComponent.LLJ = function12;
                AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(367);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = audienceFooterBottomSheetComponent;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(1);
                C12YQ c12yq = new C12YQ(aFwS218S0000000_29, 1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLILLJJLI = c12yq;
                tuxSheet2.show(supportFragmentManager, "AudienceFooter");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1605350rsT LJJJLZIJ() {
        return new InterfaceC1605350rsT() { // from class: X.0SfJ
            public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(181));
            public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
            public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
            public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(176));
            public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));

            public static float[] LIZJ(float[] fArr) {
                if (C444960Hcc.LIZIZ()) {
                    C844470XAv.LIZ.getClass();
                    return new float[]{C12ES.LJIIJ(C844470XAv.LIZ()) - fArr[0], fArr[1]};
                }
                return fArr;
            }

            @Override // X.InterfaceC1605350rsT
            public final float[] LIZ(String str) {
                int iHashCode;
                if (Intrinsics.LJFF(str, "inbox_top_cell")) {
                    C844470XAv.LIZ.getClass();
                    return LIZJ(((ISkylightOutBridge) ServiceManager.get().getService(ISkylightOutBridge.class)).LIZIZ(new float[]{LJFF, (C497820Jfg.LIZJ(C844470XAv.LIZ()) + LJII) - LIZLLL}));
                }
                if (Intrinsics.LJFF(str, "follow_top_cell")) {
                    C844470XAv.LIZ.getClass();
                    return LIZJ(new float[]{LJ, (C497820Jfg.LIZJ(C844470XAv.LIZ()) + LJI) - LIZJ});
                }
                if (str != null && ((iHashCode = str.hashCode()) == -1578177162 ? str.equals("friends_top_cell") : iHashCode == 744829374 ? str.equals("hot_top_cell") : iHashCode == 1722831452 && str.equals("pull_down"))) {
                    C844470XAv.LIZ.getClass();
                    return LIZJ(new float[]{LJ, (C497820Jfg.LIZJ(C844470XAv.LIZ()) + LIZIZ) - LIZJ});
                }
                return new float[]{0.0f, 0.0f};
            }

            @Override // X.InterfaceC1605350rsT
            public final void LIZIZ(C427660Gpo c427660Gpo) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c427660Gpo, "scaleX", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c427660Gpo, "scaleY", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c427660Gpo, "alpha", 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                animatorSet.start();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryFriendsService LJJJZ() {
        return new IStoryFriendsService() { // from class: X.0SfA
            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final C13IQ<? extends UIContentAssem> getToolBarAssem() {
                return C13LE.LIZ(StoryToolBarIconAssem.class);
            }

            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final Pair<C13IQ<? extends UISlotAssem>, C13IQ<? extends ReusedAssem<? extends C03H5>>> getFriendsDetailViewerEntranceAssem() {
                return new Pair<>(C13LE.LIZ(FriendsDetailViewerEntranceUIAssem.class), C13LE.LIZ(FriendsDetailViewerEntranceLogicAssem.class));
            }

            @Override // com.ss.android.ugc.aweme.story.friends.IStoryFriendsService
            public final InterfaceC1570900qyu newStoryToolBarViewGenerator() {
                return new InterfaceC1570900qyu() { // from class: X.0rbi
                    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(12));
                    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(11));
                    public final String LLILLL = "friends_story_entrance";

                    @Override // X.InterfaceC1570900qyu
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void S1(boolean z) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void T1() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void U1(View view) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void X1(int i) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void Z1() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void a2() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final boolean b2() {
                        return false;
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final boolean c2() {
                        return false;
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void d2(Integer num) {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void e2() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final boolean enabled() {
                        return true;
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void g2() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void onCreate() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void onPause() {
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void onResume() {
                    }

                    public final boolean LIZIZ() {
                        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final void onDestroyView() {
                        ((C1594940rbg) this.LL.getValue()).onDestroyView();
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final String getTag() {
                        return this.LLILLL;
                    }

                    @Override // X.InterfaceC1570900qyu
                    public final View f2(Context context) {
                        int i;
                        int iLIZIZ;
                        int iLIZIZ2;
                        ConstraintLayout constraintLayout = new ConstraintLayout(context);
                        View viewF2 = ((C1594940rbg) this.LL.getValue()).f2(context);
                        int i2 = 7;
                        if (LIZIZ()) {
                            i = 7;
                        } else {
                            i = 6;
                        }
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                        if (!LIZIZ()) {
                            i2 = 11;
                        }
                        C426750GoL.LJIIIZ(viewF2, Integer.valueOf(iLIZIZ3), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)))), 0, false, 16);
                        int iLIZIZ4 = -2;
                        if (LIZIZ()) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        } else {
                            iLIZIZ = -2;
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(viewF2);
                        C19ME c19me = new C19ME(-2, iLIZIZ);
                        c19me.startToStart = 0;
                        c19me.endToStart = R.id.w_f;
                        constraintLayout.addView(frameLayout, c19me);
                        ImageView imageView = new ImageView(context);
                        imageView.setId(R.id.w_e);
                        if (LIZIZ()) {
                            C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(-2, -2, 8388627));
                        }
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setId(R.id.w_f);
                        frameLayout2.addView(imageView);
                        frameLayout2.setClipChildren(false);
                        if (LIZIZ()) {
                            C426750GoL.LJIIL(frameLayout2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, 30);
                        }
                        if (LIZIZ()) {
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                        } else {
                            iLIZIZ2 = -2;
                        }
                        if (LIZIZ()) {
                            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        }
                        C19ME c19me2 = new C19ME(iLIZIZ2, iLIZIZ4);
                        c19me2.endToEnd = 0;
                        constraintLayout.addView(frameLayout2, c19me2);
                        constraintLayout.setClipChildren(false);
                        return constraintLayout;
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1597000rf0 LJJLIIIJILLIZJL() {
        return new InterfaceC1597000rf0() { // from class: X.0rsu
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(524));
            public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
            public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(525));
            public static final AtomicBoolean LJ = new AtomicBoolean(false);

            @Override // X.InterfaceC1597000rf0
            public final void LIZ(String str, EnumC1606080rte enumC1606080rte, EnumC1605470rsf enumC1605470rsf) {
                if (enumC1605470rsf != EnumC1605470rsf.ON || str.length() == 0) {
                    return;
                }
                AtomicBoolean atomicBoolean = LIZJ;
                if (!atomicBoolean.get()) {
                    EnumC1606080rte enumC1606080rte2 = EnumC1606080rte.FEED;
                    C303310Buj c303310Buj = new C0CX9() { // from class: X.0Buj
                        @Override // X.C0CX9
                        public final void LIZIZ(String str2) {
                            if (((Number) C0AWG.LIZ.getValue()).intValue() != 0) {
                                try {
                                    C823050WQl.LIZLLL().execute(new ARunnableS2S1000000_4(str2, 1));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    };
                    C01GW c01gw = LIZIZ;
                    ((ConcurrentHashMap) c01gw.getValue()).put(enumC1606080rte2, c303310Buj);
                    ((ConcurrentHashMap) c01gw.getValue()).put(EnumC1606080rte.INBOX_TOP_LIST, C0AWN.LIZ);
                    ((ConcurrentHashMap) c01gw.getValue()).put(EnumC1606080rte.FRIENDS_SKYLIGHT, C312190CLp.LIZ);
                    ((ConcurrentHashMap) c01gw.getValue()).put(EnumC1606080rte.FYP_SKYLIGHT, C0CX3.LIZ);
                    atomicBoolean.set(true);
                }
                C0CX9 c0cx9 = (C0CX9) ((ConcurrentHashMap) LIZIZ.getValue()).get(enumC1606080rte);
                if (c0cx9 != null) {
                    c0cx9.LIZIZ(str);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC1597000rf0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.EnumC1596540reG r7, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r8, boolean r9) {
                /*
                    Method dump skipped, instruction units count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1605620rsu.LIZIZ(X.0reG, java.util.List, boolean):void");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC330760Cxu LJJLIIIJJI() {
        return C330620Cxg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC1588370rR5 LJJLIIIJJIZ() {
        return new InterfaceC1588370rR5() { // from class: X.0Si4
            public static boolean LJ(Aweme aweme) {
                UserStory userStory;
                if (!C729510SjV.LJJIIZ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || userStory.getTotalCount() != 1 || userStory.getHasMoreBefore() || userStory.getHasMoreAfter() || userStory.getCurrentPosition() != 0) {
                    return false;
                }
                return true;
            }

            public static boolean LJFF(Aweme aweme) {
                UserStory userStory;
                if (!C729510SjV.LJJIIZ(aweme) || aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.isPostStyle()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1588370rR5
            public final List<Aweme> LIZ(List<? extends Aweme> list) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : list) {
                    Aweme aweme2 = aweme;
                    if (!C1601110rld.LIZ() && !C0BNZ.LIZ()) {
                        if (!C729510SjV.LJJIJIL(aweme2)) {
                            arrayList.add(aweme);
                        }
                    } else if (!C1601110rld.LIZ() && C0BNZ.LIZ()) {
                        if (!C729510SjV.LJJIJIL(aweme2) || LJ(aweme2)) {
                            arrayList.add(aweme);
                        }
                    } else if (C1601110rld.LIZ()) {
                        if (!LJFF(aweme2)) {
                            arrayList.add(aweme);
                        }
                    } else if (!C729510SjV.LJJIJIL(aweme2)) {
                        arrayList.add(aweme);
                    }
                }
                return arrayList;
            }

            @Override // X.InterfaceC1588370rR5
            public final List<FollowFeed> LIZIZ(List<? extends FollowFeed> list) {
                Aweme aweme;
                ArrayList arrayList = new ArrayList();
                for (FollowFeed followFeed : list) {
                    FollowFeed followFeed2 = followFeed;
                    Aweme aweme2 = null;
                    if (!C1601110rld.LIZ() && !C0BNZ.LIZ()) {
                        if (followFeed2 != null) {
                            aweme2 = followFeed2.getAweme();
                        }
                        if (!C729510SjV.LJJIJIL(aweme2)) {
                            arrayList.add(followFeed);
                        }
                    } else if (!C1601110rld.LIZ() && C0BNZ.LIZ()) {
                        if (followFeed2 != null) {
                            aweme = followFeed2.getAweme();
                        } else {
                            aweme = null;
                        }
                        if (C729510SjV.LJJIJIL(aweme)) {
                            if (followFeed2 != null) {
                                aweme2 = followFeed2.getAweme();
                            }
                            if (LJ(aweme2)) {
                            }
                        }
                        arrayList.add(followFeed);
                    } else if (C1601110rld.LIZ()) {
                        if (followFeed2 != null) {
                            aweme2 = followFeed2.getAweme();
                        }
                        if (!LJFF(aweme2)) {
                            arrayList.add(followFeed);
                        }
                    } else {
                        if (followFeed2 != null) {
                            aweme2 = followFeed2.getAweme();
                        }
                        if (!C729510SjV.LJJIJIL(aweme2)) {
                            arrayList.add(followFeed);
                        }
                    }
                }
                return arrayList;
            }

            @Override // X.InterfaceC1588370rR5
            public final List<FriendsFeed> LIZJ(List<FriendsFeed> list) {
                Aweme aweme;
                ArrayList arrayList = new ArrayList();
                for (FriendsFeed friendsFeed : list) {
                    FriendsFeed friendsFeed2 = friendsFeed;
                    Aweme aweme2 = null;
                    if (!C1601110rld.LIZ() && !C0BNZ.LIZ()) {
                        if (friendsFeed2 != null) {
                            aweme2 = friendsFeed2.getAweme();
                        }
                        if (!C729510SjV.LJJIJIL(aweme2)) {
                            arrayList.add(friendsFeed);
                        }
                    } else if (!C1601110rld.LIZ() && C0BNZ.LIZ()) {
                        if (friendsFeed2 != null) {
                            aweme = friendsFeed2.getAweme();
                        } else {
                            aweme = null;
                        }
                        if (C729510SjV.LJJIJIL(aweme)) {
                            if (friendsFeed2 != null) {
                                aweme2 = friendsFeed2.getAweme();
                            }
                            if (LJ(aweme2)) {
                            }
                        }
                        arrayList.add(friendsFeed);
                    } else if (C1601110rld.LIZ()) {
                        if (friendsFeed2 != null) {
                            aweme2 = friendsFeed2.getAweme();
                        }
                        if (!LJFF(aweme2)) {
                            arrayList.add(friendsFeed);
                        }
                    } else {
                        if (friendsFeed2 != null) {
                            aweme2 = friendsFeed2.getAweme();
                        }
                        if (!C729510SjV.LJJIJIL(aweme2)) {
                            arrayList.add(friendsFeed);
                        }
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1588370rR5
            public final List<Aweme> LIZLLL(List<? extends Aweme> list) {
                if (C1601110rld.LIZ()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!C729510SjV.LJJIJIL((Aweme) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
                return list;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC438360HGw LJJLIIIJL() {
        return new InterfaceC438360HGw() { // from class: X.0HGr
            /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
            @Override // X.InterfaceC438360HGw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<java.lang.String> LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
                /*
                    r5 = this;
                    r4 = 0
                    X.064U r1 = X.C064U.LIZ     // Catch: java.lang.Throwable -> L4f
                    if (r6 == 0) goto L1f
                    com.ss.android.ugc.aweme.music.model.CelebrationMetaData r0 = r6.getCelebrationMetaData()     // Catch: java.lang.Throwable -> L4f
                    if (r0 == 0) goto L1f
                    java.lang.Integer r0 = r0.celebrationType     // Catch: java.lang.Throwable -> L4f
                Ld:
                    r1.getClass()     // Catch: java.lang.Throwable -> L4f
                    java.util.List r3 = X.C064U.LIZIZ(r0)     // Catch: java.lang.Throwable -> L4f
                    r2 = 1
                    r1 = 0
                    if (r3 == 0) goto L21
                    boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4f
                    if (r0 != 0) goto L21
                    goto L23
                L1f:
                    r0 = r4
                    goto Ld
                L21:
                    r0 = 1
                    goto L24
                L23:
                    r0 = 0
                L24:
                    if (r0 != 0) goto L30
                    r0 = 3
                    java.util.List r0 = r3.subList(r1, r0)     // Catch: java.lang.Throwable -> L4f
                    java.util.List r0 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L4f
                    return r0
                L30:
                    if (r6 == 0) goto L3e
                    X.0inu r0 = X.C1256560inu.LIZ     // Catch: java.lang.Throwable -> L4f
                    r0.getClass()     // Catch: java.lang.Throwable -> L4f
                    boolean r0 = X.C1256560inu.LJ(r6)     // Catch: java.lang.Throwable -> L4f
                    if (r0 != r2) goto L3e
                    goto L3f
                L3e:
                    r2 = 0
                L3f:
                    if (r2 == 0) goto L44
                    java.util.List<java.lang.String> r0 = r6.quickReplyEmojis     // Catch: java.lang.Throwable -> L4f
                    return r0
                L44:
                    java.util.List r0 = LJI(r6, r1)     // Catch: java.lang.Throwable -> L4f
                    if (r0 == 0) goto L4e
                    java.util.List r4 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L4f
                L4e:
                    return r4
                L4f:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    X.00Yq r0 = new X.00Yq
                    r0.<init>(r1)
                    X.C189200o6.m2constructorimpl(r0)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C438310HGr.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
            }

            @Override // X.InterfaceC438360HGw
            public final View LIZJ(View view) {
                int iIntValue;
                TuxIconView tuxIconView;
                Drawable background;
                Integer numLIZJ;
                if (view == null) {
                    return null;
                }
                View viewFindViewById = view.findViewById(R.id.so2);
                Context context = view.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                if (viewFindViewById != null && (background = viewFindViewById.getBackground()) != null) {
                    background.setTint(iIntValue);
                }
                if ((viewFindViewById instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewFindViewById) != null) {
                    tuxIconView.setTintColorRes(R.attr.ee);
                }
                return viewFindViewById;
            }

            @Override // X.InterfaceC438360HGw
            public final List<String> LJFF(Aweme aweme) {
                Integer num;
                boolean z;
                CelebrationMetaData celebrationMetaData;
                try {
                    C064U c064u = C064U.LIZ;
                    if (aweme != null && (celebrationMetaData = aweme.getCelebrationMetaData()) != null) {
                        num = celebrationMetaData.celebrationType;
                    } else {
                        num = null;
                    }
                    c064u.getClass();
                    List listLIZIZ = C064U.LIZIZ(num);
                    boolean z2 = false;
                    if (listLIZIZ == null || listLIZIZ.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return C13LP.LLIIII(listLIZIZ.subList(0, 3));
                    }
                    if (aweme != null) {
                        C1256560inu.LIZ.getClass();
                        if (C1256560inu.LJ(aweme)) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        List<String> list = aweme.quickReplyEmojis;
                        if (list == null) {
                            return null;
                        }
                        return C13LP.LLIIII(list);
                    }
                    List listLJI = LJI(aweme, true);
                    if (listLJI == null) {
                        return null;
                    }
                    return C13LP.LLIIII(listLJI);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return null;
                }
            }

            public static List LJI(Aweme aweme, boolean z) {
                List<String> listLIZ;
                List<String> listLIZ2;
                if (z) {
                    String[] strArr = C07MG.LIZ;
                    listLIZ = (List) C07MG.LIZIZ.getValue();
                } else {
                    listLIZ = C07PJ.LIZ();
                }
                if (C1E99.LIZJ()) {
                    Pair pairLIZ = C1E99.LIZ(aweme);
                    InterfaceC438300HGq interfaceC438300HGqLJIILL = C1618440sDa.LIZIZ.LJIILL();
                    if (aweme != null) {
                        listLIZ2 = C714760S1y.LIZ(aweme);
                    } else {
                        listLIZ2 = null;
                    }
                    return interfaceC438300HGqLJIILL.LIZ(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), listLIZ2);
                }
                if (!C290730BaR.LIZ()) {
                    return listLIZ;
                }
                if (!z && !C729510SjV.LJJIJIL(aweme)) {
                    return listLIZ;
                }
                C0HXP c0hxpLIZ = C424420Gka.LIZ();
                if (listLIZ == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                return c0hxpLIZ.LIZIZ(listLIZ.size());
            }

            @Override // X.InterfaceC438360HGw
            public final void LJ(View view, Function0<Unit> function0, Function0<Unit> function02) {
                view.animate().cancel();
                C786410Ut5.Ob(view, 1.0f);
                C786410Ut5.pc(view, 1.0f);
                view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150L).setInterpolator(new LinearInterpolator()).withStartAction(new ARunnableS75S0200000_6(view, (Function0) function0, 77)).withEndAction(new ARunnableS75S0200000_6(view, (Function0) function02, 79)).start();
            }

            @Override // X.InterfaceC438360HGw
            public final boolean LIZ(Aweme aweme, boolean z, boolean z2, boolean z3) {
                Story story;
                C01GW c01gw = C263910AVx.LIZ;
                if (((Number) c01gw.getValue()).intValue() > 0 && z2) {
                    return true;
                }
                if (aweme != null && (story = aweme.getStory()) != null && story.exposeEmojiDisable) {
                    return false;
                }
                if (C281310B0v.LIZ() && z && C07MG.LIZJ) {
                    return true;
                }
                if (z3 && !z && C729510SjV.LJJIJIL(aweme) && ((Number) c01gw.getValue()).intValue() > 0) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC438360HGw
            public final List LIZLLL(LinearLayout linearLayout, final String str, final int i, final AwS550S0100000_6 awS550S0100000_6, final String str2, final String str3, final Integer num, final String str4, final AwS550S0100000_6 awS550S0100000_62) {
                C438320HGs.LIZ.getClass();
                Aweme aweme = (Aweme) awS550S0100000_6.invoke();
                List<String> list = C13BV.INSTANCE;
                C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                if (c1618440sDa.LJJLIIIJL().LIZ(aweme, true, false, false)) {
                    C786410Ut5.LJJJJJL(linearLayout);
                    List<String> listLJFF = c1618440sDa.LJJLIIIJL().LJFF(aweme);
                    if (listLJFF != null) {
                        list = listLJFF;
                    }
                    final int i2 = 0;
                    for (String str5 : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            final String str6 = str5;
                            C438320HGs c438320HGs = C438320HGs.LIZ;
                            View.OnClickListener onClickListener = new View.OnClickListener(i2, str6, str, i, awS550S0100000_6, str2, str3, num, str4, awS550S0100000_62) { // from class: X.0S1h
                                public final /* synthetic */ int LL;
                                public final /* synthetic */ String LLILLJJLI;
                                public final /* synthetic */ Function0<Aweme> LLILLL;
                                public final /* synthetic */ String LLILZ;
                                public final /* synthetic */ String LLILZIL;
                                public final /* synthetic */ boolean LLILZLL = true;
                                public final /* synthetic */ Integer LLIZ;
                                public final /* synthetic */ String LLIZLLLIL;
                                public final /* synthetic */ Function0<Unit> LLJ;

                                {
                                    this.LLILLL = awS550S0100000_6;
                                    this.LLILZ = str2;
                                    this.LLILZIL = str3;
                                    this.LLIZ = num;
                                    this.LLIZLLLIL = str4;
                                    this.LLJ = awS550S0100000_62;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    User author;
                                    String str7;
                                    String str8;
                                    String str9;
                                    String strLJIJJLI;
                                    String str10;
                                    C438320HGs c438320HGs2 = C438320HGs.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("emoji_");
                                    sbLIZ.append(this.LL);
                                    View viewFindViewWithTag = view.findViewWithTag(C2188811AlT.LIZIZ(sbLIZ));
                                    String str11 = this.LLILLJJLI;
                                    Function0<Aweme> function0 = this.LLILLL;
                                    String str12 = this.LLILZ;
                                    String str13 = this.LLILZIL;
                                    boolean z = this.LLILZLL;
                                    Integer num2 = this.LLIZ;
                                    String str14 = this.LLIZLLLIL;
                                    Function0<Unit> function02 = this.LLJ;
                                    c438320HGs2.getClass();
                                    if (viewFindViewWithTag != null) {
                                        C424420Gka.LIZ().LIZJ(str11);
                                        Aweme awemeInvoke = function0.invoke();
                                        if (awemeInvoke != null && (author = awemeInvoke.getAuthor()) != null) {
                                            InterfaceC1365380ldQ shareService = ((IMSharePanelApi) ServiceManager.get().getService(IMSharePanelApi.class)).getShareService();
                                            String str15 = "";
                                            if (str12 == null) {
                                                str7 = "";
                                            } else {
                                                str7 = str12;
                                            }
                                            EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE;
                                            Pair[] pairArr = new Pair[2];
                                            pairArr[0] = new Pair("dm_reply_type", "emoji");
                                            if (C729510SjV.LJJIJIL(awemeInvoke)) {
                                                str8 = "story";
                                            } else {
                                                str8 = "post";
                                            }
                                            pairArr[1] = new Pair("story_type", str8);
                                            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                                            String requestId = awemeInvoke.getRequestId();
                                            if (requestId != null) {
                                                mapLJIIJ.put("request_id", requestId);
                                            }
                                            String aid = awemeInvoke.getAid();
                                            if (aid == null) {
                                                aid = "";
                                            }
                                            mapLJIIJ.put("use_story_gid", aid);
                                            HashMap<String, String> mobParams = awemeInvoke.getMobParams();
                                            if (mobParams != null && Intrinsics.LJFF(mobParams.get("is_from_push"), "1")) {
                                                String str16 = mobParams.get("is_from_push");
                                                if (str16 == null) {
                                                    str16 = "";
                                                }
                                                mapLJIIJ.put("is_from_push", str16);
                                                String str17 = mobParams.get("push_type");
                                                if (str17 == null) {
                                                    str17 = "";
                                                }
                                                mapLJIIJ.put("push_type", str17);
                                                String str18 = mobParams.get("push_id");
                                                if (str18 == null) {
                                                    str18 = "";
                                                }
                                                mapLJIIJ.put("push_id", str18);
                                            }
                                            if (awemeInvoke.storyHighlightInfo != null) {
                                                mapLJIIJ.put("is_add_story_highlight", "1");
                                                if (!Intrinsics.LJFF(str13, "top_cell")) {
                                                    str10 = "1";
                                                } else {
                                                    str10 = CardStruct.IStatusCode.DEFAULT;
                                                }
                                                mapLJIIJ.put("is_highlight_immersive_flow", str10);
                                            }
                                            StoryNoteInfo storyNoteInfo = awemeInvoke.storyNoteInfo;
                                            if (storyNoteInfo != null && (strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(storyNoteInfo.subType))) != null) {
                                                mapLJIIJ.put("holiday_type", strLJIJJLI);
                                                mapLJIIJ.put("has_festivals_custom", "1");
                                            }
                                            if (str14 != null) {
                                                mapLJIIJ.put("is_centralized_avatar", str14);
                                            }
                                            String str19 = str13;
                                            shareService.LJJJI(str11, author, awemeInvoke, str7, enumC896890ZGl, str13, null, null, false, mapLJIIJ, new AwS582S0100000_3(function02, (Function0<Unit>) 79));
                                            if (str13 == null) {
                                                str19 = "feed";
                                            }
                                            if (str12 == null) {
                                                str9 = "";
                                            } else {
                                                str9 = str12;
                                            }
                                            String aid2 = awemeInvoke.getAid();
                                            String authorUid = AwemeExtKt.getAuthorUid(awemeInvoke);
                                            C735840Sti c735840Sti = C735840Sti.LIZ;
                                            User author2 = awemeInvoke.getAuthor();
                                            c735840Sti.getClass();
                                            C0S1M.LIZ("click_story_dm_input_box", QuickDMEventParam.LIZ(new QuickDMEventParam(str19, str9, aid2, authorUid, String.valueOf(C735840Sti.LJIIIIZZ(author2)), null, null, null, false, z, null, false, 15328), "click_exposed_emoji", null, null, 16351));
                                            IUnifyQuickReplyAnalytics.LIZ.getClass();
                                            IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
                                            if (iUnifyQuickReplyAnalyticsLIZ != null) {
                                                EnumC2172611A1b.Companion.getClass();
                                                EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str12);
                                                C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
                                                EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.AUTO;
                                                String aid3 = awemeInvoke.getAid();
                                                if (aid3 != null) {
                                                    str15 = aid3;
                                                }
                                                iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, str15, C0ZH1.STORY, C0S2R.PRIVATE, EnumC714710S1t.CLICK_OUTER_EMOJI, C0I0B.LJFF.LIZIZ());
                                            }
                                        }
                                        C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(viewFindViewWithTag, str11, num2, new C5182020e(function0, (Function0<Unit>) 188));
                                    }
                                    C1618440sDa.LIZIZ.LJJLIIIJL().LJ(view, null, null);
                                }
                            };
                            c438320HGs.getClass();
                            Context context = linearLayout.getContext();
                            FrameLayout frameLayout = new FrameLayout(context);
                            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                            tuxTextView.setText(str6);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("emoji_");
                            sbLIZ.append(i2);
                            tuxTextView.setTag(C2188811AlT.LIZIZ(sbLIZ));
                            tuxTextView.LJJJJI(25.0f);
                            tuxTextView.setGravity(17);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 17;
                            Float fValueOf = Float.valueOf(6.0f);
                            layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), 0);
                            frameLayout.addView(tuxTextView, layoutParams);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                            layoutParams2.gravity = 17;
                            linearLayout.addView(frameLayout, layoutParams2);
                            C786410Ut5.O7(frameLayout, onClickListener);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    C786410Ut5.LJJJJJL(linearLayout);
                }
                return list;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC728100ShE LJJLIIIJLJLI() {
        return C728090ShD.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryCelebrationService LJJLIIIJLLLLLLLZ() {
        return new IStoryCelebrationService() { // from class: X.0MTG
            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final void clearKevaForDebug() {
                C0MTE.LIZ.getClass();
                C0MTE.LIZIZ.clear();
                ((Keva) C0MTE.LIZJ.getValue()).clear();
                ((Keva) C0MTE.LIZLLL.getValue()).clear();
                C0MQ9.LIZ.getClass();
                ((Keva) C0MQ9.LIZJ.getValue()).clear();
                ((Keva) C0MQ9.LIZLLL.getValue()).clear();
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final C0CCZ getPreloadLegoTask() {
                return new CelebrationMaterialLegoTask();
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC1599360rio getStoryCelebrationCellInterception() {
                return new C0MTI();
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC1597960rgY getStoryCelebrationPublishHandler() {
                return new InterfaceC1597960rgY() { // from class: X.0MTO
                    public Observer<C0RD4> LIZ;

                    @Override // X.InterfaceC1597960rgY
                    public final void LIZ(LifecycleOwner lifecycleOwner) {
                        C19EG c19eg;
                        Activity activityLIZ = C2421209eE.LIZ();
                        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                            if (C1591220rVg.LIZLLL()) {
                                DataCenter.vQ2(ViewModelProviders.of(c19eg), null).AQ2(this.LIZ);
                            } else {
                                DataCenter.vQ2(ViewModelProviders.of(c19eg), lifecycleOwner).AQ2(this.LIZ);
                            }
                        }
                    }

                    @Override // X.InterfaceC1597960rgY
                    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
                        C19EG c19eg;
                        Activity activityLIZ = C2421209eE.LIZ();
                        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                            this.LIZ = new AObserverS212S0100000_8(lifecycleOwner, 75);
                            DataCenter.vQ2(ViewModelProviders.of(c19eg), lifecycleOwner).yQ2("changeTabAfterPublish", this.LIZ, true);
                        }
                    }
                };
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [T, X.13BV] */
            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v6 */
            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final Map<String, Object> getStoryCelebrationRequestParam() {
                HashMap celebrationMaterialInboxRequestParam = ((ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class)).getCelebrationMaterialInboxRequestParam();
                C0MTE.LIZ.getClass();
                C259800zU c259800zU = new C259800zU();
                ?? r2 = C13BV.INSTANCE;
                c259800zU.element = r2;
                ?? r22 = r2;
                if (!((IStoryDebugService) ServiceManager.get().getService(IStoryDebugService.class)).LIZIZ()) {
                    try {
                        List listLLIIII = C13LP.LLIIII(C0MTE.LIZIZ.getAllKey());
                        ?? arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
                        Iterator it2 = listLLIIII.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                        }
                        c259800zU.element = arrayList;
                        r22 = arrayList;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        r22 = c259800zU.element;
                    }
                }
                celebrationMaterialInboxRequestParam.put("celebration_exit", r22);
                return celebrationMaterialInboxRequestParam;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final InterfaceC567940MPg getCelebrationConfigHandler() {
                return C0MQ9.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final void exitInboxStoryCelebrationEntrance(VideoPublishEditModel videoPublishEditModel) {
                CelebrationData celebrationData;
                String uniqueId;
                Integer celebrationType;
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel != null && (celebrationData = creativeModel.celebrationData) != null && (uniqueId = celebrationData.getUniqueId()) != null && (celebrationType = celebrationData.getCelebrationType()) != null) {
                    int iIntValue = celebrationType.intValue();
                    C0MTE.LIZ.getClass();
                    C0MTE.LIZJ(iIntValue, new String[]{uniqueId});
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String getCelebrationEntranceUniqueId(com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData r7) {
                /*
                    r6 = this;
                    r5 = 0
                    java.lang.String r4 = ""
                    if (r7 == 0) goto L24
                    com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.imageUrl     // Catch: X.C0XIO -> L54
                    if (r0 == 0) goto L24
                    java.lang.String r3 = r0.getUri()     // Catch: X.C0XIO -> L54
                    if (r3 == 0) goto L24
                    java.lang.String r0 = "/"
                    java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: X.C0XIO -> L54
                    r1 = 0
                    r0 = 6
                    java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r3, r2, r1, r0)     // Catch: X.C0XIO -> L54
                    if (r0 == 0) goto L24
                    java.lang.Object r3 = X.C13LP.LJJLIIIJJI(r0)     // Catch: X.C0XIO -> L54
                    java.lang.String r3 = (java.lang.String) r3     // Catch: X.C0XIO -> L54
                    goto L25
                L24:
                    r3 = r5
                L25:
                    if (r7 == 0) goto L29
                    java.lang.String r5 = r7.extraData     // Catch: X.C0XIO -> L54
                L29:
                    java.lang.Class<com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam> r0 = com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam.class
                    java.lang.Object r2 = X.C051M.LIZIZ(r0, r5)     // Catch: X.C0XIO -> L54
                    com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam r2 = (com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam) r2     // Catch: X.C0XIO -> L54
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: X.C0XIO -> L54
                    if (r2 == 0) goto L3b
                    java.lang.String r0 = r2.uniqueId     // Catch: X.C0XIO -> L54
                    if (r0 != 0) goto L3c
                L3b:
                    r0 = r4
                L3c:
                    r1.append(r0)     // Catch: X.C0XIO -> L54
                    if (r2 == 0) goto L45
                    java.lang.Integer r0 = r2.coverType     // Catch: X.C0XIO -> L54
                    if (r0 != 0) goto L46
                L45:
                    r0 = r4
                L46:
                    r1.append(r0)     // Catch: X.C0XIO -> L54
                    if (r3 != 0) goto L4c
                    r3 = r4
                L4c:
                    r1.append(r3)     // Catch: X.C0XIO -> L54
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: X.C0XIO -> L54
                    return r0
                L54:
                    r2 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "json parse error! "
                    r1.append(r0)
                    java.lang.String r0 = r2.getMessage()
                    if (r0 != 0) goto L6f
                    int r0 = r2.getErrorCode()
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                L6f:
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0MTG.getCelebrationEntranceUniqueId(com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean isCelebrationExited(int r5) {
                /*
                    r4 = this;
                    X.0MTE r0 = X.C0MTE.LIZ
                    r0.getClass()
                    r3 = 0
                    com.bytedance.keva.Keva r1 = X.C0MTE.LIZIZ     // Catch: java.lang.Throwable -> L14
                    java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L14
                    java.lang.String[] r1 = r1.getStringArray(r0, r3)     // Catch: java.lang.Throwable -> L14
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L14
                    goto L20
                L14:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r1 = new X.00Yq
                    r1.<init>(r0)
                    X.C189200o6.m2constructorimpl(r1)
                L20:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                    if (r0 != 0) goto L27
                    r3 = r1
                L27:
                    java.lang.String[] r3 = (java.lang.String[]) r3
                    r2 = 1
                    if (r3 == 0) goto L30
                    int r1 = r3.length
                    r0 = 0
                    if (r1 != 0) goto L31
                L30:
                    r0 = 1
                L31:
                    r2 = r2 ^ r0
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0MTG.isCelebrationExited(int):boolean");
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final boolean shouldShowCreationEntrance(SkylightData skylightData) {
                String str;
                Integer num;
                boolean z;
                StoryCelebrationInboxParam storyCelebrationInboxParamLIZ = C0MTJ.LIZ(skylightData);
                boolean z2 = false;
                if (storyCelebrationInboxParamLIZ == null || (str = storyCelebrationInboxParamLIZ.uniqueId) == null || (num = storyCelebrationInboxParamLIZ.celebrationType) == null) {
                    return false;
                }
                int iIntValue = num.intValue();
                C0MTE.LIZ.getClass();
                if (((IStoryDebugService) ServiceManager.get().getService(IStoryDebugService.class)).LIZIZ()) {
                    return true;
                }
                try {
                    boolean zLJIILLIIL = C13LQ.LJIILLIIL(str, C0MTE.LIZIZ.getStringArray(String.valueOf(iIntValue), new String[0]));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0MTE.LIZIZ.hashCode());
                    sbLIZ.append(" shouldShowCreationEntrance: uniqueId: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" celebrationType: ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" res: ");
                    if (!zLJIILLIIL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(" \n ");
                    sbLIZ.append(((Object[]) C12848051a.LIZ(C0MTE.LIZIZ, new String[0], String.valueOf(iIntValue))).length);
                    C2188811AlT.LIZIZ(sbLIZ);
                    z2 = !zLJIILLIIL;
                    return z2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    return z2;
                }
            }

            @Override // com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService
            public final List<ForwardMedia> convertAwemeToForwardMedia(List<? extends Aweme> list, int i, String str) {
                Object c098200Yq;
                try {
                    C566880MLe.LIZ.getClass();
                    c098200Yq = C566880MLe.LIZ(list, i, str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C13BV c13bv = C13BV.INSTANCE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = c13bv;
                }
                return (List) c098200Yq;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int getTag() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatWithStoryShareViewModel.class);
        AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(205);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(479);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        return (InterfaceC2135708Yh) new C736950SvV(c19719912DlLIZ, aFwS198S0000000_11, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS243S0000000_11, null, null, null).getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIIIIZZ(Aweme aweme) {
        SimplePublishModel simplePublishModel;
        C0SPF c0spfLJIIJ = C729220Sj2.LL.LJIIJ(AwemeBizExtKt.getScheduleId(aweme));
        if (c0spfLJIIJ != null && (simplePublishModel = c0spfLJIIJ.LIZ) != null) {
            return simplePublishModel.creationId;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (interfaceC665370Q7z != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedPanelPlatformAbility.class, null)) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null) {
            if ((c0sz8LJLIL instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryToPostStateAbility.class, null)) != null) {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            } else {
                C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryToPostStateAbility.class, null);
                }
            }
            StoryToPostStateAbility storyToPostStateAbility = (StoryToPostStateAbility) interfaceC494301wDLIZ2;
            if (storyToPostStateAbility != null) {
                return storyToPostStateAbility.HJ();
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final String LJIILIIL(Aweme aweme) {
        SimplePublishModel simplePublishModel;
        C0SPF c0spfLJIIJ = C729220Sj2.LL.LJIIJ(AwemeBizExtKt.getScheduleId(aweme));
        if (c0spfLJIIJ != null && (simplePublishModel = c0spfLJIIJ.LIZ) != null) {
            return simplePublishModel.publishId;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIILJJIL(String str) {
        if (str == null) {
            return false;
        }
        for (Aweme aweme : C729220Sj2.LL.LJIIIZ()) {
            if (C729510SjV.LJJIJIL(aweme) && Intrinsics.LJFF(aweme.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIZILJ(int i) {
        this.LIZIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJI(Aweme aweme) {
        ((HashMap) C712310Rwr.LIZ.getValue()).put(aweme.getAid(), aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIL(AwS587S0100000_8 awS587S0100000_8) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C331801Qm(awS587S0100000_8, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final RectF LJJJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        if (interfaceC665370Q7z == null || (feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z, FeedCollectionViewPagerAbility.class, null)) == null || (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) == null) {
            return null;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryPhotoAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryPhotoAbility.class, null);
            } else {
                interfaceC494301wDLIZ = null;
            }
        }
        StoryPhotoAbility storyPhotoAbility = (StoryPhotoAbility) interfaceC494301wDLIZ;
        if (storyPhotoAbility == null) {
            return null;
        }
        return storyPhotoAbility.I8();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJJJI(Aweme aweme) {
        ICreativeSocialBridgeService iCreativeSocialBridgeService;
        String strLJIILIIL = LJIILIIL(aweme);
        if (strLJIILIIL == null || (iCreativeSocialBridgeService = (ICreativeSocialBridgeService) PluggableExtentionKt.pluggableSpi$default(ICreativeSocialBridgeService.class, false, false, false, 14, null)) == null || !iCreativeSocialBridgeService.LJJIIJ(strLJIILIIL)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJJJLI(String str) {
        Map<String, Function1<Intent, String>> map = C727530SgJ.LIZ;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("__story_uid_preloader_require_uids", str, bundle);
        bundle.putBoolean("__story_uid_preloader_write_user_story_repo", false);
        C727530SgJ.LIZLLL(bundle, StoryUidPreloader.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final InterfaceC727710Sgb LJJJJZI(Context context) {
        return new C726880SfG(context);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final C0SPF LJJL(String str) {
        return C729220Sj2.LL.LJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Bitmap LJJLIIJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        Bitmap bitmapGG0;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        if (interfaceC665370Q7z != null && (feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z, FeedCollectionViewPagerAbility.class, null)) != null && (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) != null) {
            if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryPhotoAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryPhotoAbility.class, null);
                } else {
                    interfaceC494301wDLIZ = null;
                }
            }
            StoryPhotoAbility storyPhotoAbility = (StoryPhotoAbility) interfaceC494301wDLIZ;
            if (storyPhotoAbility != null && (bitmapGG0 = storyPhotoAbility.gG0()) != null && (!bitmapGG0.isRecycled())) {
                return bitmapGG0;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIJ(int i, C19EG c19eg) {
        C19EG c19egLIZIZ;
        if (c19eg != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19eg)) != null) {
            C728470Shp.LIZ(i, c19egLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIIZ(Aweme aweme, String str) {
        C728480Shq.LLILZIL.getValue().put(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJIJ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        boolean zLIZJ;
        StoryGuideUploadCardManager.LL.getClass();
        IStoryDebugService iStoryDebugService = (IStoryDebugService) ServiceManager.get().getService(IStoryDebugService.class);
        if (iStoryDebugService != null) {
            zLIZJ = iStoryDebugService.LIZJ();
        } else {
            zLIZJ = false;
        }
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z, UserFeedViewPagerAbility.class, null);
        if (userFeedViewPagerAbility != null) {
            userFeedViewPagerAbility.bh1();
        }
        if (!zLIZJ) {
            StoryGuideUploadCardManager.LLILLL.put(StoryGuideUploadCardManager.LIZJ(), null);
        }
        StoryGuideUploadCardManager.LLILZ.put(StoryGuideUploadCardManager.LIZJ(), Boolean.FALSE);
        C0ROF c0rof = C0ROF.LIZ;
        Keva keva = C0ROF.LIZIZ;
        c0rof.getClass();
        keva.storeLong(C0ROF.LIZ("story_publish_success_timestamp"), System.currentTimeMillis());
        if (C0M9T.LIZ().enableReduceRequestAfterHasPublishedStory) {
            C718010SEl.LIZ.getClass();
            String strLJFF = C718010SEl.LJFF();
            if (!Intrinsics.LJFF(strLJFF, "TTKStoryEducationPublishState_")) {
                C718010SEl.LJI().storeInt(strLJFF, 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJJLIIIIJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        String from;
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility3;
        InterfaceC713360RyY interfaceC713360RyYFz23;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ3;
        CommonCellAbility commonCellAbility4;
        InterfaceC713360RyY interfaceC713360RyYFz24;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ4;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        IVideoCellAbility iVideoCellAbility;
        BaseFeedPageParams baseFeedPageParamsNJ2;
        C2189821An6 c2189821An6;
        InterfaceC494301wD interfaceC494301wDLIZ3 = null;
        if (interfaceC665370Q7z != null && (iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(interfaceC665370Q7z, IVideoCellAbility.class, null)) != null && (baseFeedPageParamsNJ2 = iVideoCellAbility.nJ2()) != null && (c2189821An6 = baseFeedPageParamsNJ2.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        boolean zLJIILLIIL = C1618440sDa.LIZIZ.LJJIIJ().LJIILLIIL(from);
        if (interfaceC665370Q7z != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedPanelPlatformAbility.class, null)) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
            c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if (zLJIILLIIL) {
            if (c0sz8LJLIL != null) {
                if ((c0sz8LJLIL instanceof CommonCellAbility) && (commonCellAbility4 = (CommonCellAbility) c0sz8LJLIL) != null && (interfaceC713360RyYFz24 = commonCellAbility4.Fz2()) != null && (interfaceC665370Q7zLIZIZ4 = C1558420qem.LIZIZ(interfaceC713360RyYFz24)) != null && (interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ4, IStoryImmersiveUserFeedAbility.class, null)) != null) {
                    interfaceC494301wDLIZ3 = interfaceC494301wDLIZ2;
                } else {
                    C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
                    if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility3 = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz23 = commonCellAbility3.Fz2()) != null && (interfaceC665370Q7zLIZIZ3 = C1558420qem.LIZIZ(interfaceC713360RyYFz23)) != null) {
                        interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ3, IStoryImmersiveUserFeedAbility.class, null);
                    }
                }
                IStoryImmersiveUserFeedAbility iStoryImmersiveUserFeedAbility = (IStoryImmersiveUserFeedAbility) interfaceC494301wDLIZ3;
                if (iStoryImmersiveUserFeedAbility != null) {
                    iStoryImmersiveUserFeedAbility.dT(z);
                    return;
                }
                return;
            }
            return;
        }
        if (c0sz8LJLIL == null) {
            return;
        }
        if ((c0sz8LJLIL instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, MoveGestureInterceptAbility.class, null)) != null) {
            interfaceC494301wDLIZ3 = interfaceC494301wDLIZ;
        } else {
            C0SZ8 c0sz8LLJLLL2 = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL2 instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL2) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, MoveGestureInterceptAbility.class, null);
            }
        }
        MoveGestureInterceptAbility moveGestureInterceptAbility = (MoveGestureInterceptAbility) interfaceC494301wDLIZ3;
        if (moveGestureInterceptAbility == null) {
            return;
        }
        moveGestureInterceptAbility.Ay1(z);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final List LJJLIIIJ(int i, Aweme aweme) {
        UserStory userStory;
        String authorUid;
        Integer numValueOf;
        String aid;
        String aid2;
        try {
            if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || !C729510SjV.LJJIJIL(aweme) || (userStory = aweme.getUserStory()) == null) {
                return null;
            }
            int iLIZJ = C708880RrK.LIZJ(userStory);
            Pair<Integer, Aweme> pairLIZIZ = C708880RrK.LIZIZ(userStory.getStories(), iLIZJ, userStory, null);
            int iIntValue = pairLIZIZ.getFirst().intValue();
            Aweme second = pairLIZIZ.getSecond();
            C727100Sfc c727100Sfc = new C727100Sfc();
            if (a0.LJJIIZI(aweme.getAid(), "highlight", false)) {
                authorUid = aweme.getAid();
            } else {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            if (iIntValue < 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(iIntValue);
            }
            c727100Sfc.getClass();
            C727100Sfc.LIZIZ(authorUid, authorUid2, userStory, numValueOf, second, false);
            if (iIntValue < 0) {
                return null;
            }
            List<Aweme> stories = userStory.getStories();
            if (i > 1 && iIntValue != stories.size() - 1) {
                int size = i + iIntValue;
                if (size > stories.size()) {
                    size = stories.size();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getFirstNStoryAwemeForPreload: target index = ");
                sbLIZ.append(iLIZJ);
                sbLIZ.append(",first index = ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", first aid = ");
                Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(iIntValue, stories);
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append(",\nlast index = ");
                sbLIZ.append(size);
                sbLIZ.append(",last aid = ");
                Aweme aweme3 = (Aweme) C13LP.LJJJLZIJ(size, stories);
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                } else {
                    aid2 = null;
                }
                sbLIZ.append(aid2);
                C2188811AlT.LIZIZ(sbLIZ);
                return stories.subList(iIntValue, size);
            }
            return Collections.singletonList(stories.get(iIntValue));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final <T extends C0X12> void LJJJJJ(String str, T t, Function1<? super T, ? extends List<? extends Aweme>> function1) {
        if (t == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0O0P(function1, t, this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    @Override // com.ss.android.ugc.aweme.story.IStoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJL(X.InterfaceC665370Q7z r10, androidx.fragment.app.Fragment r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            r2 = 0
            if (r10 == 0) goto L4d
            java.lang.Class<com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility> r0 = com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r10, r0, r2)
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r0 = (com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility) r0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r0.Mb()
            if (r0 == 0) goto L4d
            X.0SZ8 r5 = r0.LJLIL()
            if (r5 == 0) goto L4e
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.LJIIIIZZ()
        L1d:
            boolean r0 = X.C281310B0v.LIZ()
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L4b
            boolean r0 = X.C729510SjV.LJJIJIL(r4)
            if (r0 == 0) goto L4b
            r3 = 1
        L2c:
            com.ss.android.ugc.aweme.IAccountUserService r1 = X.C0XQ7.LJFF()
            if (r4 == 0) goto L49
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r4)
        L36:
            X.0XPy r1 = (X.AbstractC848400XPy) r1
            boolean r1 = r1.LIZJ(r0)
            if (r5 == 0) goto L47
            X.0SZ8 r0 = r5.LLJLLL()
        L42:
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryGuideUploadCardVH
            if (r0 == 0) goto L50
            return r7
        L47:
            r0 = r2
            goto L42
        L49:
            r0 = r2
            goto L36
        L4b:
            r3 = 0
            goto L2c
        L4d:
            r5 = r2
        L4e:
            r4 = r2
            goto L1d
        L50:
            X.01GW r0 = r9.LIZ
            java.lang.Object r0 = r0.getValue()
            X.0K77 r0 = (X.C0K77) r0
            if (r0 == 0) goto L61
            boolean r0 = r0.LJIJJ(r4)
            if (r0 != r7) goto L61
            return r7
        L61:
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            X.0Rnv r0 = r0.LJJIIJ()
            boolean r0 = r0.LJJIIJZLJL(r11)
            if (r0 == 0) goto La5
            if (r1 != 0) goto La4
            if (r11 == 0) goto L75
            X.19EG r2 = r11.getActivity()
        L75:
            int r6 = X.C14KQ.LJIIIIZZ(r2)
            int r5 = X.C726890SfH.LIZIZ(r11)
            if (r12 == 0) goto La4
            float r4 = r12.getRawX()
            float r3 = r12.getRawY()
            X.01GW r2 = X.C726840SfC.LIZIZ
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.story.experiment.StoryGestureLR r0 = (com.ss.android.ugc.aweme.story.experiment.StoryGestureLR) r0
            float r1 = r0.left
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.story.experiment.StoryGestureLR r0 = (com.ss.android.ugc.aweme.story.experiment.StoryGestureLR) r0
            float r0 = r0.right
            android.graphics.RectF r0 = X.C726890SfH.LIZ(r1, r0, r6, r5)
            boolean r0 = r0.contains(r4, r3)
            if (r0 == 0) goto La4
            return r8
        La4:
            return r7
        La5:
            if (r3 == 0) goto Laa
            if (r1 == 0) goto Laa
            r8 = 1
        Laa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.service.StoryServiceImpl.LJJJJL(X.0Q7z, androidx.fragment.app.Fragment, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    @Override // com.ss.android.ugc.aweme.story.IStoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJL(androidx.fragment.app.Fragment r53, X.C2189821An6 r54, java.lang.String r55, java.lang.String r56, X.EnumC1985807qC r57) {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.service.StoryServiceImpl.LJJIJL(androidx.fragment.app.Fragment, X.1An6, java.lang.String, java.lang.String, X.07qC):boolean");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean LJIJJ(float f, float f2, List<? extends NormalTrackTimeStamp> list, C705930RmZ c705930RmZ, Context context, Fragment fragment) {
        return C726890SfH.LIZJ(f, f2, list, c705930RmZ, context, fragment);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void LJIIL(String str, User user, String str2, String str3, boolean z, int i, Integer num, Function2<? super String, ? super HashMap<String, String>, Boolean> function2, boolean z2) {
        String uid;
        boolean z3;
        String requestId;
        UserAllStoryMetadata allStoryMetadata;
        List<Integer> list;
        Integer num2;
        String strLIZ;
        UserAllStoryMetadata allStoryMetadata2;
        List<StoryLiteMetadata> list2;
        new Object() { // from class: X.0SfD
        }.getClass();
        HashMap map = new HashMap();
        if (function2 != null) {
            function2.invoke(str, map);
        }
        Integer numValueOf = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        int followStatusRelation = 0;
        if (user != null && (allStoryMetadata2 = user.getAllStoryMetadata()) != null && (list2 = allStoryMetadata2.storyLiteMetadata) != null && !list2.isEmpty()) {
            Iterator<StoryLiteMetadata> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().isSubOnly()) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJ(Boolean.valueOf(z3), "if_subscriber_only");
        C735840Sti.LIZ.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(user), "follow_status");
        if (user != null) {
            followStatusRelation = user.getFollowStatusRelation();
        }
        c2344009Gk.LIZJ(followStatusRelation, "follow_status_relation");
        c2344009Gk.LIZJ(i, "is_unread");
        if (user == null || (requestId = user.getRequestId()) == null) {
            requestId = "";
        }
        c2344009Gk.LJIIIIZZ("req_id", requestId);
        c2344009Gk.LJI(map);
        if (num != null && num.intValue() > 1 && z) {
            c2344009Gk.LIZJ(num.intValue(), "unread_rd_num");
        }
        if (user != null && (allStoryMetadata = user.getAllStoryMetadata()) != null && (list = allStoryMetadata.storyCelebrationList) != null && (num2 = (Integer) C13LP.LJJJLL(list)) != null && (strLIZ = C0MLA.LIZ(num2)) != null) {
            c2344009Gk.LJFF("story_theme", strLIZ);
        }
        c2344009Gk.LJ(Boolean.valueOf(z2), "is_avatar_component");
        if (Intrinsics.LJFF(str3, "top_cell")) {
            if (user != null) {
                numValueOf = Integer.valueOf(user.getFollowStatusRelation());
            }
            c2344009Gk.LJ(numValueOf, "follow_status_relation");
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
