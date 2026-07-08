package com.ss.android.ugc.aweme.prop.fragment;

import X.C01GW;
import X.C0P4Z;
import X.C0PEM;
import X.C116D;
import X.C1386280mB8;
import X.C1390410mHn;
import X.C1398410mUh;
import X.C13LE;
import X.C13LP;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C297540BlQ;
import X.C322490CkZ;
import X.C336720DHy;
import X.C452501pT;
import X.C615400OBu;
import X.C615450OBz;
import X.C626470Ohh;
import X.C626490Ohj;
import X.EnumC452301pR;
import X.InterfaceC626480Ohi;
import Y.AObserverS213S0100000_9;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeUpdateExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.VideoType;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class DesignerStickerDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiI2JjFiHELIOSDSogISIiLD0APCwvIiohDCA4KCY/CTIpJCofITY4Dz0yLygpJzs=";
    public Aweme LLLILZLLLI;
    public String LLLIZZ;
    public UrlModel LLLJ;
    public String LLLJIL;
    public int LLLJL = 2;
    public boolean LLLL = true;
    public C1390410mHn LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public final ViewModelLazy LLLLIILLL;
    public InterfaceC626480Ohi LLLLIL;
    public String LLLLILI;
    public final C01GW LLLLJ;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean PR() {
        C626490Ohj c626490Ohj = C626490Ohj.LIZ;
        String str = this.LLLJIL;
        c626490Ohj.getClass();
        return C626490Ohj.LIZ(str);
    }

    public final FeatureVideoViewModel uS() {
        return (FeatureVideoViewModel) this.LLLLIILLL.getValue();
    }

    public DesignerStickerDetailAwemeListFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS553S0100000_9(new AwS553S0100000_9((Fragment) this, 1453), (Function0<Unit>) 1454));
        this.LLLLIILLL = C336720DHy.LIZ(this, C13LE.LIZ(FeatureVideoViewModel.class), new AwS553S0100000_9(c01gwLIZ, 1455), new AwS410S0200000_9((Function0) null, c01gwLIZ, 62), new AwS410S0200000_9(this, c01gwLIZ, 63));
        this.LLLLILI = "";
        this.LLLLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1452));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C297540BlQ.LIZ()) {
            C116D.LIZ();
            C116D.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final List hS(List list) {
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) C13LP.LJJJLL(this.LLJLLIL);
        if (!this.LLLLIILL && newFaceStickerBean != null) {
            this.LLLLIILL = true;
            C20684815ws.LJIILLIIL("show_prop_detail_page", C322490CkZ.LIZ(newFaceStickerBean, this.LLLLILI, !((ArrayList) list).isEmpty()));
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DesignerStickerDetailFragment", "updateRelatedAweme");
        this.LLLILZLLLI = null;
        ArrayList<Aweme> arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Aweme aweme = (Aweme) it2.next();
            if (aweme.getDetailPageVideoTag() == VideoTag.FEATURED_VIDEO) {
                this.LLLILZLLLI = aweme;
                this.LLLJL = 1;
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DesignerStickerDetailFragment", "updateRelatedAweme find related_aweme");
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            Aweme aweme2 = new Aweme() { // from class: X.0Ohk
                public static final C626510Ohl Companion = new Object() { // from class: X.0Ohl
                };
                public static final int $stable = 8;
            };
            AwemeBizExtKt.setFeatureVideo(aweme2, VideoType.NO_FEATURE_VIDEO_SELECTED);
            AwemeBizExtKt.setIcon(aweme2, this.LLLJ);
            arrayList2.add(aweme2);
            NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) C13LP.LJJJLL(this.LLJLLIL);
            if (newFaceStickerBean2 != null && !this.LLLLIIL) {
                this.LLLLIIL = true;
                C20684815ws.LJIILLIIL("show_ame_encourage_post_card", C322490CkZ.LIZ(newFaceStickerBean2, this.LLLLILI, false));
            }
            this.LLLL = true;
        } else {
            this.LLLL = false;
            Aweme aweme3 = new Aweme() { // from class: X.0Ohk
                public static final C626510Ohl Companion = new Object() { // from class: X.0Ohl
                };
                public static final int $stable = 8;
            };
            if (this.LLLILZLLLI != null && this.LLLJL == 1) {
                AwemeBizExtKt.setFeatureVideo(aweme3, VideoType.FEATURE_VIDEO_CLIENT_SELECTED);
                AwemeUpdateExtKt.update(aweme3, this.LLLILZLLLI);
            } else {
                AwemeBizExtKt.setFeatureVideo(aweme3, VideoType.NO_FEATURE_VIDEO_SELECTED);
                AwemeBizExtKt.setIcon(aweme3, this.LLLJ);
                NewFaceStickerBean newFaceStickerBean3 = (NewFaceStickerBean) C13LP.LJJJLL(this.LLJLLIL);
                if (newFaceStickerBean3 != null && !this.LLLLIIL) {
                    this.LLLLIIL = true;
                    C20684815ws.LJIILLIIL("show_ame_encourage_post_card", C322490CkZ.LIZ(newFaceStickerBean3, this.LLLLILI, true));
                }
            }
            arrayList2.add(aweme3);
            if (this.LLLILZLLLI != null && this.LLLJL == 1) {
                for (Aweme aweme4 : arrayList) {
                    Aweme aweme5 = this.LLLILZLLLI;
                    if (aweme5 != null && !Intrinsics.LJFF(aweme4.getAid(), aweme5.getAid())) {
                        arrayList2.add(aweme4);
                    }
                }
            } else {
                arrayList2.addAll(list);
            }
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().end("tool_performance_effect_shoot_same", "setData");
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean iS(int i) {
        MobileEffectViewModel mobileEffectViewModel;
        MobileEffectViewModel mobileEffectViewModel2;
        if (this.LLLLJ.getValue() != null && (mobileEffectViewModel = (MobileEffectViewModel) this.LLLLJ.getValue()) != null && mobileEffectViewModel.LL && (mobileEffectViewModel2 = (MobileEffectViewModel) this.LLLLJ.getValue()) != null && !mobileEffectViewModel2.LLILLJJLI) {
            return false;
        }
        return super.iS(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wS(X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment.wS(X.05Vn):java.lang.Object");
    }

    public final void yS(Aweme aweme) {
        Aweme aweme2;
        String videoId;
        String str = this.LLLIZZ;
        if (str == null) {
            return;
        }
        String secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme);
        if (secAuthorUid != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
            c2344009Gk.LJIIIIZZ("prop_id", str);
            c2344009Gk.LJIIIIZZ("prop_author_id", secAuthorUid);
            c2344009Gk.LJIIIIZZ("enter_method", C615450OBz.LIZIZ);
            c2344009Gk.LIZJ(1, "is_prop_author_video");
            C20684815ws.LJIILLIIL("apply_specific_featured_video", c2344009Gk.LIZ);
        }
        String str2 = "";
        if (this.LLLJL == 1) {
            Aweme aweme3 = this.LLLILZLLLI;
            if (aweme3 == null) {
                videoId = "";
            } else {
                videoId = aweme3.getVideo().getVideoId();
            }
            aweme2 = this.LLLILZLLLI;
        } else {
            aweme2 = null;
            videoId = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "//effect/featurevideo/awemelist");
        smartRouteBuildRoute.withParam("sticker_id", str);
        C1386280mB8.LIZ(smartRouteBuildRoute, aweme);
        smartRouteBuildRoute.withParam("extra_related_item", aweme2);
        smartRouteBuildRoute.withParam("author_id", this.LLLJIL);
        if (videoId != null) {
            str2 = videoId;
        }
        smartRouteBuildRoute.withParam("video_id", str2);
        smartRouteBuildRoute.open(0, new C0P4Z(this, 4));
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        smartRouteNR.withParam("feed_data_sticker_model", new ArrayList(this.LLJLLIL));
        smartRouteNR.withParam("extra_edit_effect_uid", this.LLJZ);
        return smartRouteNR;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void ZF(Aweme aweme, View view) {
        String str = this.LLLIZZ;
        if (str == null || this.LLLLIIIILLL) {
            return;
        }
        this.LLLLIIIILLL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C626470Ohh(aweme, view, this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("prop_page_enter_from")) == null) {
            string = "";
        }
        this.LLLLILI = string;
        uS().LLILLL.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 16));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C615400OBu(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zS(com.ss.android.ugc.aweme.feed.model.Aweme r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0OC4
            if (r0 == 0) goto L45
            r4 = r7
            X.0OC4 r4 = (X.C0OC4) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L43
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.model.VideoType r1 = com.ss.android.ugc.aweme.feed.model.VideoType.NO_FEATURE_VIDEO_SELECTED
            com.ss.android.ugc.aweme.feed.model.VideoType r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.isFeatureVideo(r6)
            if (r1 != r0) goto L43
            r4.LLILLL = r2
            java.lang.Object r1 = r5.wS(r4)
            if (r1 != r3) goto L22
            return r3
        L43:
            r2 = 0
            goto L2a
        L45:
            X.0OC4 r4 = new X.0OC4
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment.zS(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }
}
