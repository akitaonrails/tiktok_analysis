package com.ss.android.ugc.aweme.tag.service;

import X.C098200Yq;
import X.C10EU;
import X.C11VD;
import X.C12ES;
import X.C1390920mIc;
import X.C13BV;
import X.C15438062q;
import X.C1572660r1k;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C2201941BFw;
import X.C298690BnH;
import X.C298710BnJ;
import X.C737520SwQ;
import X.C737560SwU;
import X.C737600SwY;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import Y.ACListenerS115S0200000_11;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.ui.page.VideoCaptionMentionPanel;
import com.ss.android.ugc.aweme.mention.ui.page.VideoMentionListPanel;
import com.ss.android.ugc.aweme.tag.FeedTaggedListFragment;
import com.ss.android.ugc.aweme.tag.VideoTagPanel;
import com.ss.android.ugc.aweme.tag.viewmodel.SocialVideoTagShareVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS57S1000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS99S0110000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TagServiceImpl implements ITagService {
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZ() {
        C737600SwY.LIZ = C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final C11VD LJII() {
        return new C11VD() { // from class: X.0Hje
            public VideoMentionListPanel LIZ;

            @Override // X.C11VD
            public final VideoCaptionMentionPanel LIZIZ() {
                VideoCaptionMentionPanel videoCaptionMentionPanel = new VideoCaptionMentionPanel();
                Bundle bundle = new Bundle();
                bundle.putBoolean("need_nav", false);
                videoCaptionMentionPanel.setArguments(bundle);
                return videoCaptionMentionPanel;
            }

            @Override // X.C11VD
            public final void LIZ(boolean z) {
                VideoMentionListPanel videoMentionListPanel = this.LIZ;
                if (videoMentionListPanel != null && videoMentionListPanel.getActivity() != null) {
                    videoMentionListPanel.SR().setState(new AwS21S0010000_6(z, 8));
                }
            }

            @Override // X.C11VD
            public final void LIZLLL(String str) {
                VideoMentionListPanel videoMentionListPanel = this.LIZ;
                if (videoMentionListPanel != null && videoMentionListPanel.getActivity() != null) {
                    videoMentionListPanel.SR().setState(new AwS57S1000000_6(str, 5));
                }
            }

            @Override // X.C11VD
            public final void LIZJ(C19EG c19eg, AwS608S0100000_29 awS608S0100000_29) {
                VideoMentionListPanel videoMentionListPanel = new VideoMentionListPanel();
                this.LIZ = videoMentionListPanel;
                C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.o7j, videoMentionListPanel);
                c19ehLJIIJ.LJIIJ();
                VideoMentionListPanel videoMentionListPanel2 = this.LIZ;
                if (videoMentionListPanel2 != null) {
                    videoMentionListPanel2.LLIZLLLIL = new AwS585S0100000_6(awS608S0100000_29, 390);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final int LIZIZ() {
        return C298690BnH.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final LiveData LJ(LifecycleRegistry lifecycleRegistry) {
        if (lifecycleRegistry.getCurrentState().compareTo(Lifecycle.State.INITIALIZED) <= 0) {
            return null;
        }
        return ((SocialVideoTagShareVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycleRegistry, SocialVideoTagShareVM.class)).LL;
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJFF(C19EG c19eg, final boolean z, final Function0<Unit> function0) {
        if (c19eg != null) {
            Keva repo = Keva.getRepo("repo_video_tag");
            int iLIZIZ = C298710BnJ.LIZIZ();
            if (iLIZIZ != 0 && !repo.getBoolean("key_intro_has_shown", false)) {
                if ((C1697810uHb.LJ(1, 2, 5).contains(Integer.valueOf(C298710BnJ.LIZIZ())) && z) || (iLIZIZ == 3 && !z)) {
                    repo.storeBoolean("key_intro_has_shown", true);
                    final C737560SwU c737560SwU = new C737560SwU(c19eg, null, 0);
                    AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c737560SwU, 944);
                    C786410Ut5.a9(c737560SwU.getVideoTagIntroCloseButtonFromXml(), new ACListenerS115S0200000_11(c737560SwU, awS555S0100000_11, 43));
                    C786410Ut5.U8(c737560SwU.getVideoTagIntroCtaFromXml(), new ACListenerS115S0200000_11(c737560SwU, awS555S0100000_11, 44));
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIII = c737560SwU;
                    tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener(function0, this, z, c737560SwU) { // from class: X.0SwT
                        public final /* synthetic */ Function0<Unit> LL;
                        public final /* synthetic */ boolean LLILLJJLI;
                        public final /* synthetic */ C737560SwU LLILLL;

                        {
                            this.LLILLJJLI = z;
                            this.LLILLL = c737560SwU;
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.LL.invoke();
                            try {
                                C737520SwQ.LIZ("close_tag_introduce_bottom_sheet", new AwS99S0110000_11(this.LLILLJJLI, this.LLILLL, 2));
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    };
                    tuxSheet.show(c19eg.getSupportFragmentManager(), "VideoTagIntroView");
                    try {
                        C737520SwQ.LIZ("show_tag_introduce_bottom_sheet", new AwS26S0010000_11(z, 2));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJI(C19EG c19eg, Aweme aweme, String str, String str2) {
        int size;
        List<InteractionTagUserInfo> list;
        float fLJIIIIZZ = C12ES.LJIIIIZZ(c19eg) * 0.5f;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "aweme", aweme);
        if ((C298710BnJ.LIZ() || C298690BnH.LIZIZ()) && C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            size = 1;
        } else {
            size = 0;
        }
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null && (list = interactionTagInfo.taggedUsers) != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InteractionTagUserInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toUser(it2.next()));
            }
            C786410Ut5.LJJIZ(bundle, "tagged_users", arrayList);
            size += list.size();
        }
        if (str == null) {
            str = "";
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("anchor_type", str2, bundle);
        float f = (size * 64.0f) + 60.0f;
        if (size == 1) {
            f += 36.0f;
        }
        float fLIZJ = C12ES.LIZJ(f, c19eg);
        if (fLIZJ <= fLJIIIIZZ) {
            fLJIIIIZZ = fLIZJ;
        }
        FeedTaggedListFragment.LLJILJILJ.getClass();
        FeedTaggedListFragment feedTaggedListFragment = new FeedTaggedListFragment();
        feedTaggedListFragment.setArguments(bundle);
        feedTaggedListFragment.LLJILJIL = new AwS555S0100000_11(feedTaggedListFragment, 943);
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(true);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = (int) fLJIIIIZZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = feedTaggedListFragment;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0SwV
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FypAutoScrollService fypAutoScrollService2 = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
                if (fypAutoScrollService2 != null) {
                    fypAutoScrollService2.setDescDialogShowing(false);
                }
            }
        };
        tuxSheet.show(c19eg.getSupportFragmentManager(), "FeedTaggedListFragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZJ(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        ?? arrayList;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//social/taglist");
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InteractionTagUserInfo interactionTagUserInfo : list) {
                IMUser.Companion.getClass();
                IMUser iMUserLIZIZ = C2201941BFw.LIZIZ(interactionTagUserInfo);
                if (iMUserLIZIZ == null) {
                    iMUserLIZIZ = new IMUser();
                }
                arrayList.add(iMUserLIZIZ);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        smartRouteBuildRoute.withParam("init_config", new C1572660r1k(str, aweme, i, arrayList, null, 16, null));
        smartRouteBuildRoute.open(111, onActivityResultCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZLLL(C19EG c19eg, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC1631620sYq<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq) {
        ?? arrayList;
        if (c19eg == null) {
            return;
        }
        VideoTagPanel videoTagPanel = new VideoTagPanel();
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InteractionTagUserInfo interactionTagUserInfo : list) {
                IMUser.Companion.getClass();
                IMUser iMUserLIZIZ = C2201941BFw.LIZIZ(interactionTagUserInfo);
                if (iMUserLIZIZ == null) {
                    iMUserLIZIZ = new IMUser();
                }
                arrayList.add(iMUserLIZIZ);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        videoTagPanel.LLIZ = new C1572660r1k(str, aweme, i, arrayList, interfaceC1631620sYq);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = videoTagPanel;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0SwW
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        tuxSheet.show(c19eg.getSupportFragmentManager(), "VideoTagPanel");
    }
}
