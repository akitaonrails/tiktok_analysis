package com.ss.android.ugc.aweme.commentv2.title;

import X.C1349820lEK;
import X.C1350460lFM;
import X.C1350670lFh;
import X.C1351980lHo;
import X.C1354080lLC;
import X.C1354090lLD;
import X.C1354120lLG;
import X.C1354130lLH;
import X.C1354160lLK;
import X.C2549409yu;
import X.InterfaceC1354180lLM;
import X.InterfaceC1354460lLo;
import X.InterfaceC1354470lLp;
import X.InterfaceC1354480lLq;
import X.InterfaceC1354490lLr;
import X.InterfaceC1354510lLt;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.feed.component.ITextMorePanelService;
import com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelCommentService implements ITitlePanelCommentService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLG] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1354120lLG LIZ() {
        return new InterfaceC1354510lLt() { // from class: X.0lLG
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Object obj = c1354140lLI.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    return !c1349800lEI.getVideoDescOnly();
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS372S0200000_6(fragment, (ConstraintLayout) viewGroup, 75), 3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLD] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1354090lLD LIZIZ() {
        return new InterfaceC1354490lLr() { // from class: X.0lLD
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Object obj = c1354140lLI.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    return !c1349800lEI.getVideoDescOnly();
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 77), 3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLC] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1354080lLC LIZJ() {
        return new InterfaceC1354480lLq() { // from class: X.0lLC
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Object obj = c1354140lLI.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    return !c1349800lEI.getVideoDescOnly();
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Context context = c1350290lF5.LIZIZ.getContext();
                if (context != null) {
                    View viewLIZIZ = C21146717pB.LIZIZ(context, R.layout.a52, viewGroup, true);
                    Fragment fragment = c1350290lF5.LIZIZ;
                    C723850SaN.LIZ(fragment, false, null, new AwS384S0200000_18(viewLIZIZ, fragment, 228), 3);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lFh] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1350670lFh LIZLLL() {
        return new InterfaceC1354490lLr() { // from class: X.0lFh
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                return true;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (c1350290lF5.LIZ.LL.LLILZ) {
                    viewGroup.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    viewGroup.requestLayout();
                    return;
                }
                View view = new View(viewGroup.getContext());
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, viewGroup.getContext());
                if (numLIZJ != null) {
                    view.setBackgroundColor(numLIZJ.intValue());
                }
                viewGroup.addView(view, -1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final InterfaceC1354460lLo LJ() {
        boolean z = C2549409yu.LIZ;
        return C2549409yu.LIZ ? new InterfaceC1354460lLo() { // from class: X.0lLF
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Object obj = c1354140lLI.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    return !c1349800lEI.getVideoDescOnly();
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 80), 3);
            }
        } : new InterfaceC1354460lLo() { // from class: X.0lLE
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Object obj = c1354140lLI.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    return !c1349800lEI.getVideoDescOnly();
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 79), 3);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final InterfaceC1354490lLr LJFF() {
        ITextMorePanelService iTextMorePanelService = (ITextMorePanelService) PluggableExtentionKt.pluggableSpi$default(ITextMorePanelService.class, false, false, false, 14, null);
        if (iTextMorePanelService != null) {
            return iTextMorePanelService.LIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final InterfaceC1354490lLr LJI() {
        ITextMorePanelService iTextMorePanelService = (ITextMorePanelService) PluggableExtentionKt.pluggableSpi$default(ITextMorePanelService.class, false, false, false, 14, null);
        if (iTextMorePanelService != null) {
            return iTextMorePanelService.LIZIZ();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLK] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1354160lLK getConfig() {
        return new InterfaceC1354180lLM() { // from class: X.0lLK
            @Override // X.InterfaceC1354180lLM
            public final C1354220lLQ getConfig() {
                return new C1354220lLQ(null, 0.0f, 0.0f, 31);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lEK] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1349820lEK getContext() {
        return new InterfaceC1354470lLp() { // from class: X.0lEK
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                return true;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                C1349800lEI c1349800lEI;
                boolean z;
                Object obj = c1350290lF5.LIZ.LLILLJJLI;
                if ((obj instanceof C1349800lEI) && (c1349800lEI = (C1349800lEI) obj) != null) {
                    CommentContextSource commentContextSource = new CommentContextSource();
                    Aweme aweme = c1350290lF5.LIZ.LL.LL;
                    if (aweme == null) {
                        aweme = c1349800lEI.getAweme();
                    }
                    String requestId = c1349800lEI.getRequestId();
                    String enterFrom = c1349800lEI.getEnterFrom();
                    String videoFrom = c1349800lEI.getVideoFrom();
                    String enterMethod = c1349800lEI.getEnterMethod();
                    String eventType = c1349800lEI.getEventType();
                    boolean zIsMyProfile = c1349800lEI.isMyProfile();
                    String tabName = c1349800lEI.getTabName();
                    boolean zIsSplitMode = c1349800lEI.isSplitMode();
                    boolean zIsCommentClose = c1349800lEI.isCommentClose();
                    boolean zIsCommentLimited = c1349800lEI.isCommentLimited();
                    boolean zIsEnableComment = c1349800lEI.isEnableComment();
                    boolean zIsLandscapeMode = c1349800lEI.isLandscapeMode();
                    int commentNotice = c1349800lEI.getCommentNotice();
                    boolean zIsForceHideBatchManagementView = c1349800lEI.isForceHideBatchManagementView();
                    boolean zIsForceAutoOpenKeyboard = c1349800lEI.isForceAutoOpenKeyboard();
                    boolean zIsForceHideCommentDesc = c1349800lEI.isForceHideCommentDesc();
                    boolean zShouldShowVideoDesc = c1349800lEI.shouldShowVideoDesc();
                    boolean zIsForceHideDonation = c1349800lEI.isForceHideDonation();
                    boolean zIsForceHideKeyboard = c1349800lEI.isForceHideKeyboard();
                    boolean zIsForceHidePoi = c1349800lEI.isForceHidePoi();
                    long sessionId = c1349800lEI.getSessionId();
                    String splitContainerTag = c1349800lEI.getSplitContainerTag();
                    int locatePageType = c1349800lEI.getLocatePageType();
                    boolean zIsSmoothScrollLocate = c1349800lEI.isSmoothScrollLocate();
                    InterfaceC679410Qkt onShowHeightChangeListener = c1349800lEI.getOnShowHeightChangeListener();
                    InterfaceC1350190lEv onScrollStateChangedListener = c1349800lEI.getOnScrollStateChangedListener();
                    boolean zIsNoPermissionVideo = c1349800lEI.isNoPermissionVideo();
                    String showCommentPostCid = c1349800lEI.getShowCommentPostCid();
                    boolean zIsPreCreate = c1349800lEI.isPreCreate();
                    boolean zIsPreBind = c1349800lEI.isPreBind();
                    String channelNameForServer = c1349800lEI.getChannelNameForServer();
                    String fromPage = c1349800lEI.getFromPage();
                    int inboxNoticeType = c1349800lEI.getInboxNoticeType();
                    int inboxNoticeSubType = c1349800lEI.getInboxNoticeSubType();
                    int innerPushType = c1349800lEI.getInnerPushType();
                    String gdLabel = c1349800lEI.getGdLabel();
                    FypExposedCommentMobParams fypExposedCommentMobParams = c1349800lEI.getFypExposedCommentMobParams();
                    String accountType = c1349800lEI.getAccountType();
                    String str = "";
                    if (accountType == null) {
                        accountType = "";
                    }
                    String noticeId = c1349800lEI.getNoticeId();
                    boolean zIsFriendsSimpleDetail = c1349800lEI.isFriendsSimpleDetail();
                    boolean zIsFriendsV3Feed = c1349800lEI.isFriendsV3Feed();
                    if (c1349800lEI.isFriendsV3Feed() && !C296460Bjg.LIZJ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String friendsV3TrackScene = c1349800lEI.getFriendsV3TrackScene();
                    C1349900lES storyCommentPageParam = c1349800lEI.getStoryCommentPageParam();
                    String enterPosition = c1349800lEI.getEnterPosition();
                    int pageType = c1349800lEI.getPageType();
                    String titleClickMethod = c1349800lEI.getTitleClickMethod();
                    boolean videoDescOnly = c1349800lEI.getVideoDescOnly();
                    commentContextSource.setCommonModel(new CommentCommonModel(aweme, requestId, enterFrom, videoFrom, enterMethod, enterPosition, fromPage, false, eventType, Boolean.valueOf(zIsMyProfile), tabName, Boolean.valueOf(zIsSplitMode), pageType, accountType, zIsCommentClose, zIsCommentLimited, zIsEnableComment, zIsLandscapeMode, commentNotice, inboxNoticeType, inboxNoticeSubType, innerPushType, zIsForceHideBatchManagementView, zIsForceAutoOpenKeyboard, zIsForceHideKeyboard, zIsForceHideCommentDesc, zShouldShowVideoDesc, zIsForceHideDonation, zIsForceHidePoi, Long.valueOf(sessionId), splitContainerTag, locatePageType, zIsSmoothScrollLocate, zIsNoPermissionVideo, onShowHeightChangeListener, onScrollStateChangedListener, showCommentPostCid, zIsPreCreate, zIsPreBind, channelNameForServer, fypExposedCommentMobParams, gdLabel, null, noticeId, null, false, false, false, false, false, null, null, -1, null, null, null, "", zIsFriendsSimpleDetail, zIsFriendsV3Feed, z, friendsV3TrackScene, storyCommentPageParam, titleClickMethod, Boolean.valueOf(videoDescOnly), c1349800lEI.getVideoDescViewHeight(), c1349800lEI.isVideoMusicTitleDisplayOnFeed(), c1349800lEI.isFragmentReCreate(), c1349800lEI.getNavigationBarAutoColorOnHide(), null, null, null, null, null, false));
                    String requestId2 = c1349800lEI.getRequestId();
                    if (requestId2 == null) {
                        requestId2 = "";
                    }
                    String fromPage2 = c1349800lEI.getFromPage();
                    if (fromPage2 == null) {
                        fromPage2 = "";
                    }
                    String previousPage = c1349800lEI.getPreviousPage();
                    if (previousPage == null) {
                        previousPage = "";
                    }
                    String videoFrom2 = c1349800lEI.getVideoFrom();
                    if (videoFrom2 == null) {
                        videoFrom2 = "";
                    }
                    String playListType = c1349800lEI.getPlayListType();
                    if (playListType == null) {
                        playListType = "";
                    }
                    String playListIdKey = c1349800lEI.getPlayListIdKey();
                    if (playListIdKey == null) {
                        playListIdKey = "";
                    }
                    String playListId = c1349800lEI.getPlayListId();
                    if (playListId == null) {
                        playListId = "";
                    }
                    String searchId = c1349800lEI.getSearchId();
                    if (searchId == null) {
                        searchId = "";
                    }
                    String searchResultId = c1349800lEI.getSearchResultId();
                    if (searchResultId == null) {
                        searchResultId = "";
                    }
                    String fromGroupId = c1349800lEI.getFromGroupId();
                    if (fromGroupId == null) {
                        fromGroupId = "";
                    }
                    String tagId = c1349800lEI.getTagId();
                    if (tagId == null) {
                        tagId = "";
                    }
                    String parentTagId = c1349800lEI.getParentTagId();
                    if (parentTagId == null) {
                        parentTagId = "";
                    }
                    long videoDuration = c1349800lEI.getVideoDuration();
                    int playLoops = c1349800lEI.getPlayLoops();
                    float playPct = c1349800lEI.getPlayPct();
                    int iLIZ = C735370Ssx.LIZ(c1349800lEI.getAweme());
                    int isEnterGraphicDetail = c1349800lEI.getIsEnterGraphicDetail();
                    boolean zBooleanValue = c1349800lEI.getIsFromPostMode().booleanValue();
                    String creationId = c1349800lEI.getCreationId();
                    if (creationId == null) {
                        creationId = "";
                    }
                    String newsId = c1349800lEI.getNewsId();
                    if (newsId == null) {
                        newsId = "";
                    }
                    boolean zIsHotPlayer = c1349800lEI.isHotPlayer();
                    int isLongItem = c1349800lEI.getIsLongItem();
                    boolean zIsEnterFullScreen = c1349800lEI.isEnterFullScreen();
                    String commentEnterMethod = c1349800lEI.getCommentEnterMethod();
                    if (commentEnterMethod == null) {
                        commentEnterMethod = "";
                    }
                    String lastGroupId = c1349800lEI.getLastGroupId();
                    if (lastGroupId == null) {
                        lastGroupId = "";
                    }
                    String chatType = c1349800lEI.getChatType();
                    if (chatType == null) {
                        chatType = "";
                    }
                    String exploreFromGroupId = c1349800lEI.getExploreFromGroupId();
                    if (exploreFromGroupId == null) {
                        exploreFromGroupId = "";
                    }
                    long exploreTabId = c1349800lEI.getExploreTabId();
                    String exploreTabName = c1349800lEI.getExploreTabName();
                    if (exploreTabName == null) {
                        exploreTabName = "";
                    }
                    String fromExplorePage = c1349800lEI.getFromExplorePage();
                    if (fromExplorePage == null) {
                        fromExplorePage = "";
                    }
                    String externalShareUrlUserId = c1349800lEI.getExternalShareUrlUserId();
                    if (externalShareUrlUserId == null) {
                        externalShareUrlUserId = "";
                    }
                    String externalShareOid = c1349800lEI.getExternalShareOid();
                    if (externalShareOid != null) {
                        str = externalShareOid;
                    }
                    commentContextSource.setEventModel(new CommentEventModel(requestId2, fromPage2, previousPage, videoFrom2, playListType, playListIdKey, playListId, searchId, searchResultId, fromGroupId, tagId, parentTagId, videoDuration, playLoops, playPct, iLIZ, isEnterGraphicDetail, zBooleanValue, creationId, newsId, zIsHotPlayer, isLongItem, zIsEnterFullScreen, "", commentEnterMethod, lastGroupId, false, chatType, 5, exploreFromGroupId, exploreTabId, exploreTabName, fromExplorePage, externalShareUrlUserId, str, c1349800lEI.getFcpPanelScene(), c1349800lEI.getFeedPosition(), null, null, new ArrayList()));
                    commentContextSource.setRefactorTitlePanel(true);
                    Fragment fragment = c1350290lF5.LIZIZ;
                    C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), commentContextSource, CommentContextSource.class, "source_default_key");
                    C723850SaN.LIZ(fragment, false, null, new AwS600S0100000_21(fragment, 303), 3);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lLH] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1354130lLH getDesc() {
        return new InterfaceC1354490lLr() { // from class: X.0lLH
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                return true;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS377S0200000_11((FrameLayout) viewGroup, fragment, 120), 3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lHo] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1351980lHo getMusic() {
        return new InterfaceC1354490lLr() { // from class: X.0lHo
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C1349800lEI c1349800lEI;
                Aweme aweme;
                Music music;
                if (((Number) C0BPH.LIZ.getValue()).intValue() == 0) {
                    return false;
                }
                Object obj = c1354140lLI.LLILLJJLI;
                if (!(obj instanceof C1349800lEI) || (c1349800lEI = (C1349800lEI) obj) == null || c1349800lEI.isVideoMusicTitleDisplayOnFeed()) {
                    return false;
                }
                String eventType = c1349800lEI.getEventType();
                if (eventType == null) {
                    List<String> list = C07PE.LIZ;
                } else {
                    if (((List) C07PE.LIZIZ.getValue()).contains(eventType) && (aweme = c1354140lLI.LL.LL) != null && (music = aweme.getMusic()) != null) {
                        if (music.isPgc() || C716690S9j.LIZ(music)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 81), 3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lFM] */
    @Override // com.ss.android.ugc.aweme.comment.api.ITitlePanelCommentService
    public final C1350460lFM getSearchWord() {
        return new InterfaceC1354490lLr() { // from class: X.0lFM
            @Override // X.InterfaceC1354420lLk
            public final boolean LIZIZ(C1354140lLI c1354140lLI) {
                C19EG c19eg;
                Integer num;
                String strLJIIIIZZ;
                String aid;
                InterfaceC1350330lF9 interfaceC1350330lF9;
                C1350470lFN c1350470lFN = C1350470lFN.LIZ;
                Activity activity = c1354140lLI.LLILLL.get();
                String strH3 = null;
                if (activity instanceof C19EG) {
                    c19eg = (C19EG) activity;
                } else {
                    c19eg = null;
                }
                C1350320lF8 c1350320lF8 = c1354140lLI.LL;
                CommentTopBarComponent commentTopBarComponentLJFF = C1350470lFN.LJFF(c1350470lFN, c19eg, c1350320lF8.LL, c1350320lF8.LLILLL, null, true, 16);
                if (commentTopBarComponentLJFF != null) {
                    num = commentTopBarComponentLJFF.bizType;
                } else {
                    num = null;
                }
                C718860SHs.LIZ.getClass();
                if (!C0BSN.LIZ) {
                    return false;
                }
                EnumC1350510lFR enumC1350510lFR = EnumC1350510lFR.SEARCH;
                int value = enumC1350510lFR.getValue();
                if (num == null || num.intValue() != value || (strLJIIIIZZ = C1350470lFN.LJIIIIZZ(Integer.valueOf(enumC1350510lFR.getValue()))) == null) {
                    return false;
                }
                C1350390lFF c1350390lFF = C1350390lFF.LIZ;
                Aweme aweme = c1354140lLI.LL.LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                c1350390lFF.getClass();
                if (C1350390lFF.LJFF && (interfaceC1350330lF9 = C1350390lFF.LJI.get(aid)) != null) {
                    strH3 = interfaceC1350330lF9.H3();
                }
                if (!strLJIIIIZZ.equals(strH3) || C1350470lFN.LJIIIZ(c1354140lLI.LL.LL, num, true) == null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1354420lLk
            public final void LIZ(C1350290lF5 c1350290lF5, ViewGroup viewGroup) {
                Fragment fragment = c1350290lF5.LIZIZ;
                C723850SaN.LIZ(fragment, false, null, new AwS387S0200000_21((FrameLayout) viewGroup, fragment, 78), 3);
            }
        };
    }
}
