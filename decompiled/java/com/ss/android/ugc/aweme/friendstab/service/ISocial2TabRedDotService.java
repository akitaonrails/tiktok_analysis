package com.ss.android.ugc.aweme.friendstab.service;

import X.C1582080rGw;
import X.C1586930rOl;
import X.C1587230rPF;
import X.C19EG;
import X.EnumC1392960mLu;
import X.EnumC1586970rOp;
import X.EnumC586680Mzi;
import X.InterfaceC1364105Vn;
import X.InterfaceC1584770rLH;
import X.InterfaceC1584860rLQ;
import X.InterfaceC1586780rOW;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes25.dex */
public interface ISocial2TabRedDotService {
    <ViewType> ViewType addTabAvatarView(ViewType viewtype);

    void clearLatestRedDotResponse();

    void dealWithFriendsAvatar(SocialFeedRedDotResponse<? extends UserNewContent> socialFeedRedDotResponse);

    boolean enableTabAvatar();

    C1582080rGw getBeforeEnterInfo();

    NewContentResponse getLatestResponse();

    CopyOnWriteArrayList<SingleTabCounter> getNoticeSnapshotBeforeEnterTab();

    C1586930rOl getRedDotMetadataBeforeEnteringTab();

    String getRedDotRequestId();

    int getSocial2TabAvatarSize(boolean z);

    C1587230rPF getSocialTabNoticeData();

    void loadAvatarAbility(String str, C19EG c19eg);

    CopyOnWriteArrayList<SingleTabCounter> multiCounterSnapshot();

    int numberCountByTag(String str);

    void onAwemeRead(int i, Aweme aweme, String str);

    void onAwemeReadAvoidPerf(int i, Aweme aweme, String str);

    void onAwemeReadV2(Aweme aweme);

    void onFriendsV3StoryDetailRead(int i, Aweme aweme, String str);

    Set<String> originalNumberDotList();

    void polling();

    InterfaceC1584770rLH redDotAsListener();

    InterfaceC1584860rLQ redDotInterface();

    InterfaceC1586780rOW redDotLogic();

    <ViewType> ViewType refreshTabAvatarView(ViewType viewtype, boolean z);

    void removeRedDotByUid(String str, EnumC1392960mLu enumC1392960mLu);

    void request(EnumC1586970rOp enumC1586970rOp);

    Object requestAnyway(EnumC1586970rOp enumC1586970rOp, EnumC586680Mzi enumC586680Mzi, InterfaceC1364105Vn<? super NewContentResponse> interfaceC1364105Vn);

    void updateDynamicDelegate();

    void visitFriendsTab();

    void visitSingleFeed(String str);
}
