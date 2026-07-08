package com.ss.android.ugc.aweme.comment.viewerlist.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C064L;
import X.C0C64;
import X.C0O26;
import X.C11NJ;
import X.C11S5;
import X.C1211690hdX;
import X.C1350920lG6;
import X.C1356890lPj;
import X.C1357000lPu;
import X.C1357030lPx;
import X.C1357100lQ4;
import X.C1606010rtX;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C20603715jn;
import X.C297570BlT;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.C452501pT;
import X.C897520ZIw;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC1364105Vn;
import X.InterfaceC214902198i;
import Y.AfS113S0300000_21;
import Y.AfS156S0200000_21;
import Y.AfS173S0100000_4;
import Y.AfS1S1111000_19;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeLoadMoreCell;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoViewerListVM extends ViewModel {
    public static final /* synthetic */ int LLJJIJI = 0;
    public BubbleVideoViewerViewModel LLILLJJLI;
    public Aweme LLILLL;
    public String LLJIJIL;
    public final C1357000lPu LLJJIII;
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(155));
    public String LLILZ = "";
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(159));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(160));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(158));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(154));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(153));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(161));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(152));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(156));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(151));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(157));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(162));

    public final String getAwemeId() {
        String aid;
        Aweme aweme = this.LLILLL;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final C897520ZIw vQ2() {
        return (C897520ZIw) this.LLJILLL.getValue();
    }

    public final NextLiveData<Boolean> wQ2() {
        return (NextLiveData) this.LLIZ.getValue();
    }

    public final ViewerListResponse xQ2() {
        return (ViewerListResponse) ((LruCache) this.LLJILJIL.getValue()).get(getAwemeId());
    }

    public final boolean zQ2() {
        return ((Boolean) this.LLJJ.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [X.0lPu] */
    public VideoViewerListVM() {
        final C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 10;
        c20603715jn.LIZLLL = LikeLoadMoreCell.class;
        this.LLJJIII = new AbstractC329610Cw3<PaginationCursor>(c20603715jn) { // from class: X.0lPu
            /* JADX WARN: Type inference failed for: r5v15, types: [T, java.util.List] */
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<PaginationCursor>> interfaceC1364105Vn) {
                String strLJJIFFI;
                boolean z;
                IAVPublishWhiteBoxService iAVPublishWhiteBoxService;
                IAVPublishWhiteBoxService iAVPublishWhiteBoxService2;
                String strLJJIFFI2;
                String strLJJIFFI3;
                ((Set) this.LIZIZ.LLJI.getValue()).clear();
                ViewerListResponse viewerListResponseXQ2 = this.LIZIZ.xQ2();
                if (viewerListResponseXQ2 != null) {
                    VideoViewerListVM videoViewerListVM = this.LIZIZ;
                    if (videoViewerListVM.LLJIJIL == null) {
                        videoViewerListVM.AQ2(viewerListResponseXQ2, interfaceC1364105Vn, null);
                        return;
                    }
                }
                C259800zU c259800zU = new C259800zU();
                String str = this.LIZIZ.LLJIJIL;
                boolean z2 = true;
                if (str != null && str.length() != 0) {
                    VideoViewerListVM videoViewerListVM2 = this.LIZIZ;
                    try {
                        c259800zU.element = C1344990l6X.LIZ(String[].class, videoViewerListVM2.LLJIJIL);
                        String str2 = videoViewerListVM2.LLJIJIL;
                        if (str2 != null && (strLJJIFFI2 = u.LJJIFFI(str2, e3.e, "", false)) != null && (strLJJIFFI3 = u.LJJIFFI(strLJJIFFI2, e3.f, "", false)) != null) {
                            strLJJIFFI = u.LJJIFFI(strLJJIFFI3, "\"", "", false);
                        } else {
                            strLJJIFFI = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        strLJJIFFI = null;
                    }
                    try {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } else {
                    strLJJIFFI = null;
                }
                VideoViewerListVM videoViewerListVM3 = this.LIZIZ;
                videoViewerListVM3.LLJIJIL = null;
                C1357030lPx c1357030lPx = C1357030lPx.LIZIZ;
                String awemeId = videoViewerListVM3.getAwemeId();
                int value = EnumC1233370iCV.PANEL_LIST.getValue();
                VideoViewerListVM videoViewerListVM4 = this.LIZIZ;
                videoViewerListVM4.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 && (iAVPublishWhiteBoxService2 = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) != null && iAVPublishWhiteBoxService2.enableShowWhiteBoxedCard(videoViewerListVM4.getAwemeId())) {
                    z = true;
                } else {
                    z = false;
                }
                VideoViewerListVM videoViewerListVM5 = this.LIZIZ;
                videoViewerListVM5.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) != 1 || (iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) == null || !iAVPublishWhiteBoxService.enableShowWhiteBoxedCard(videoViewerListVM5.getAwemeId())) {
                    z2 = false;
                }
                ((C11NJ) this.LIZIZ.LL.getValue()).LIZ(c1357030lPx.LIZ(awemeId, 0L, 0L, 20, value, strLJJIFFI, false, z, z2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS113S0300000_21(this.LIZIZ, interfaceC1364105Vn, c259800zU, 2), new AfS173S0100000_4(interfaceC1364105Vn, 4)));
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                boolean z;
                boolean z2;
                IAVPublishWhiteBoxService iAVPublishWhiteBoxService;
                IAVPublishWhiteBoxService iAVPublishWhiteBoxService2;
                boolean zLJI = MethodIDManager.LJI(196718);
                PaginationCursor paginationCursor = (PaginationCursor) obj;
                boolean zLJI2 = MethodIDManager.LJI(196718);
                C1357030lPx c1357030lPx = C1357030lPx.LIZIZ;
                String awemeId = this.LIZIZ.getAwemeId();
                long cursor = paginationCursor.getCursor();
                long offset = paginationCursor.getOffset();
                int value = EnumC1233370iCV.PANEL_LIST.getValue();
                VideoViewerListVM videoViewerListVM = this.LIZIZ;
                videoViewerListVM.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 && (iAVPublishWhiteBoxService2 = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) != null && iAVPublishWhiteBoxService2.enableShowWhiteBoxedCard(videoViewerListVM.getAwemeId()) && 1 != 0 && paginationCursor.getCursor() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                VideoViewerListVM videoViewerListVM2 = this.LIZIZ;
                videoViewerListVM2.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) == 1 && (iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) != null && iAVPublishWhiteBoxService.enableShowWhiteBoxedCard(videoViewerListVM2.getAwemeId()) && paginationCursor.getCursor() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((C11NJ) this.LIZIZ.LL.getValue()).LIZ(c1357030lPx.LIZ(awemeId, cursor, offset, 20, value, null, false, z, z2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS156S0200000_21(this.LIZIZ, interfaceC1364105Vn, 3), new AfS173S0100000_4(interfaceC1364105Vn, 5)));
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).LJ();
    }

    public static final class BubbleVideoViewerViewModel extends DataCenter {
        public final VideoViewerListVM LLIZ;
        public final C01GW LLIZLLLIL;

        public BubbleVideoViewerViewModel(VideoViewerListVM videoViewerListVM, LifecycleOwner lifecycleOwner) {
            this.LLIZ = videoViewerListVM;
            new ConcurrentHashMap();
            this.LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(150));
            this.LLILLL = lifecycleOwner;
        }

        public final void CQ2(String str, PaginationCursor paginationCursor, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            IAVPublishWhiteBoxService iAVPublishWhiteBoxService;
            IAVPublishWhiteBoxService iAVPublishWhiteBoxService2;
            if (paginationCursor.getCursor() == 0 && paginationCursor.getOffset() == 0) {
                z = true;
            } else {
                z = false;
            }
            C1357030lPx c1357030lPx = C1357030lPx.LIZIZ;
            long cursor = paginationCursor.getCursor();
            long offset = paginationCursor.getOffset();
            VideoViewerListVM videoViewerListVM = this.LLIZ;
            videoViewerListVM.getClass();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 && (iAVPublishWhiteBoxService2 = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) != null && iAVPublishWhiteBoxService2.enableShowWhiteBoxedCard(videoViewerListVM.getAwemeId()) && paginationCursor.getCursor() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            VideoViewerListVM videoViewerListVM2 = this.LLIZ;
            videoViewerListVM2.getClass();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) == 1 && (iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null)) != null && iAVPublishWhiteBoxService.enableShowWhiteBoxedCard(videoViewerListVM2.getAwemeId()) && paginationCursor.getCursor() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ((C11NJ) this.LLIZ.LL.getValue()).LIZ(c1357030lPx.LIZ(str, cursor, offset, 30, i, null, false, z2, z3).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S1111000_19(i, this, str, z, 0), new AfS1S1111000_19(i, this, str, z, 1)));
        }
    }

    public final void yQ2(Fragment fragment, C19EG c19eg) {
        BubbleVideoViewerViewModel bubbleVideoViewerViewModel = this.LLILLJJLI;
        if (bubbleVideoViewerViewModel == null) {
            LifecycleOwner lifecycleOwner = fragment;
            if (fragment == null) {
                lifecycleOwner = c19eg;
            }
            this.LLILLJJLI = new BubbleVideoViewerViewModel(this, lifecycleOwner);
            return;
        }
        if (fragment == null) {
            return;
        }
        Fragment fragment2 = null;
        LifecycleOwner lifecycleOwner2 = bubbleVideoViewerViewModel.LLILLL;
        if (!(lifecycleOwner2 instanceof InterfaceC214902198i)) {
            lifecycleOwner2 = null;
        }
        if (fragment instanceof InterfaceC214902198i) {
            fragment2 = fragment;
        }
        if (Intrinsics.LJFF(lifecycleOwner2, fragment2)) {
            return;
        }
        this.LLILLJJLI = new BubbleVideoViewerViewModel(this, fragment);
    }

    public final void AQ2(ViewerListResponse viewerListResponse, InterfaceC1364105Vn<? super AbstractC316870CbV<PaginationCursor>> interfaceC1364105Vn, List<String> list) {
        boolean z;
        boolean z2;
        C1356890lPj c1356890lPj;
        ArrayList arrayList = new ArrayList();
        List<User> viewerList = viewerListResponse.getViewerList();
        if (viewerList != null) {
            z = false;
            for (User user : viewerList) {
                if (!((Set) this.LLJI.getValue()).contains(user.getUid())) {
                    if (list != null && list.contains(user.getUid())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (C297570BlT.LIZIZ()) {
                        C1211690hdX.LIZ.getClass();
                        List listLIZ = C1211690hdX.LIZ(user);
                        if (listLIZ != null && !listLIZ.isEmpty()) {
                            c1356890lPj = new C1356890lPj(user, new C1357100lQ4(this.LLILLL, getAwemeId(), this.LLILZ), listLIZ, z2, 12);
                        } else {
                            c1356890lPj = new C1356890lPj(user, new C1357100lQ4(this.LLILLL, getAwemeId(), this.LLILZ), null, z2, 28);
                        }
                    } else {
                        c1356890lPj = new C1356890lPj(user, new C1357100lQ4(this.LLILLL, getAwemeId(), this.LLILZ), null, z2, 28);
                    }
                    if (!arrayList.contains(c1356890lPj)) {
                        if (!z && z2) {
                            z = true;
                        }
                        arrayList.add(c1356890lPj);
                    }
                }
            }
        } else {
            z = false;
        }
        C897520ZIw c897520ZIwVQ2 = vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJIIIIZZ(C0O26.LIZIZ(arrayList, AFwS259S0000000_21.get$arr$(99)));
        }
        if (list != null && !list.isEmpty() && !z) {
            ((LiveData) this.LLJILJILJ.getValue()).setValue(Boolean.TRUE);
        }
        long totalCount = viewerListResponse.getTotalCount();
        Long l = (Long) ((Map) this.LLIZLLLIL.getValue()).get(getAwemeId());
        if (l == null || totalCount != l.longValue()) {
            ((Map) this.LLIZLLLIL.getValue()).put(getAwemeId(), Long.valueOf(totalCount));
            ((LiveData) this.LLJ.getValue()).setValue(new Pair(getAwemeId(), Long.valueOf(totalCount)));
        }
        Integer num = null;
        if (viewerListResponse.getHasMore()) {
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new PaginationCursor(viewerListResponse.getCursor(), viewerListResponse.getOffset()), arrayList, 1);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        } else {
            if (!arrayList.isEmpty()) {
                if (zQ2()) {
                    num = 2131837202;
                }
                arrayList.add(new C064L(num));
            }
            AbstractC316870CbV.LIZ.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(arrayList);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn.resumeWith(c316640Cb8);
        }
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.COMMENT, viewerListResponse.getViewerList(), AFwS259S0000000_21.get$arr$(100));
        C1350920lG6.LJIJI("normal_video", "viewer_list", viewerListResponse.getViewerList(), (Set) this.LLJI.getValue());
        ((LruCache) this.LLJILJIL.getValue()).put(getAwemeId(), viewerListResponse);
    }
}
