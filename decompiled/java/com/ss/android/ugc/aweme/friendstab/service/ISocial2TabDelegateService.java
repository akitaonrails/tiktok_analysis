package com.ss.android.ugc.aweme.friendstab.service;

import X.AbstractC738140SxQ;
import X.C0VNS;
import X.C13IQ;
import X.C19EG;
import X.C443120HZe;
import X.EnumC1360770lVz;
import X.EnumC1586970rOp;
import X.InterfaceC1571760r0I;
import X.InterfaceC1584770rLH;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes25.dex */
public interface ISocial2TabDelegateService {
    void addTopTabChangeListener(InterfaceC1584770rLH interfaceC1584770rLH);

    boolean checkSearchRestriction();

    void clearFriends2TabAssem();

    boolean friendsTabStylePrivacyHint();

    InterfaceC1571760r0I generateToolbarIconView(Context context);

    String getDefaultLandingPage();

    Fragment getFriendsTabFragment();

    BottomTabProtocol getFriendsTabProtocol();

    int getSocial2TabFeedType(String str);

    String getSocial2TabTabName();

    C13IQ<? extends AbstractC738140SxQ> initFriendsTabMainPageFragmentAssem();

    AbstractC738140SxQ initSocial2TabV1Assem(C19EG c19eg, ExecutorService executorService);

    void initialize(C19EG c19eg, boolean z);

    void onMultiTabLanding(String str);

    void preloadFriendsTabViews(Context context);

    C443120HZe<List<String>, List<String>, List<C0VNS>> readHistory(EnumC1360770lVz enumC1360770lVz);

    void registerRedDotBytesync();

    void runColdStartTaskV2(boolean z, EnumC1586970rOp enumC1586970rOp);

    void runDeferredRedDotTask(EnumC1586970rOp enumC1586970rOp, boolean z);

    boolean shouldInitSocial2TabV1();

    boolean shouldInitSocial2TabV1ForEarlyInit();

    boolean shouldShowFriendsTab();

    boolean shouldShowFriendsTabForEarlyInit();

    void social2TabPublishLanding(Context context);

    void tryToShowForcePermissionDialog();
}
