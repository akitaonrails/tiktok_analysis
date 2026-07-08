package com.ss.android.ugc.aweme.prop.fragment;

import X.C0A13;
import X.C0CHQ;
import X.C0CNO;
import X.C0HTI;
import X.C0OBG;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C1261230ivR;
import X.C1398410mUh;
import X.C1401220mZE;
import X.C1401450mZb;
import X.C15O7;
import X.C19EG;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C294100Bfs;
import X.C322490CkZ;
import X.C616540OGe;
import X.C626500Ohk;
import X.C636090OxD;
import X.C786410Ut5;
import X.ExecutorC1592406Li;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.prop.fragment.StickerDetailAwemeListFramgent;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.prop.presenter.StickerMobProvider;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.performance.PreloadVesdkServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class StickerDetailAwemeListFramgent extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiHELIOSI2JjFiGjs6Ky4pOws2PCQlJQ4kLSgpBSYgPAM+KCI0LSs4";
    public boolean LLLILZLLLI = true;
    public boolean LLLIZZ = true;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public StickerMobProvider LLLL;
    public boolean LLLLII;
    public MobileEffectViewModel LLLLIIIILLL;
    public C1401220mZE LLLLIIL;

    public final void uS() {
        final String str;
        C1261230ivR c1261230ivR = this.LLJJJJ;
        if (c1261230ivR == null || c1261230ivR.mmItems == null || this.LLLLII || !this.LLLJIL) {
            return;
        }
        this.LLLJIL = false;
        T t = this.LLILZ.LL;
        if (t == 0 || !(t.getData() instanceof StickerPropAwemeList) || (str = ((StickerPropAwemeList) this.LLILZ.LL.getData()).draftQueryId) == null || str.isEmpty()) {
            return;
        }
        C0CNO.LIZ(C15O7.LJI, new Function0() { // from class: X.0M4r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final int iQueryDraftCount;
                final StickerDetailAwemeListFramgent stickerDetailAwemeListFramgent = this.LL;
                final String str2 = str;
                stickerDetailAwemeListFramgent.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                if (arrayList.isEmpty()) {
                    iQueryDraftCount = 0;
                } else {
                    iQueryDraftCount = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().queryDraftCount(new C0M4M(EnumC562220M3g.NORMAL, new C562260M3k(EnumC562230M3h.EFFECT, arrayList, EnumC562250M3j.LIKE)));
                }
                C371410EhH.LIZIZ(new Runnable() { // from class: X.0mZD
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        StickerDetailAwemeListFramgent stickerDetailAwemeListFramgent2 = stickerDetailAwemeListFramgent;
                        int i = iQueryDraftCount;
                        String str3 = str2;
                        stickerDetailAwemeListFramgent2.getClass();
                        C1C7U.LIZ("StickerDetailAwemeListFramgent@2927.lambda$checkIfNeedRefreshDraft$2$1L");
                        if (stickerDetailAwemeListFramgent2.isDetached()) {
                            C1C7U.LIZIZ("StickerDetailAwemeListFramgent@2927.lambda$checkIfNeedRefreshDraft$2$1L");
                            return;
                        }
                        try {
                            T t2 = stickerDetailAwemeListFramgent2.LLILZ.LL;
                            if (t2 != 0 && (((AbstractC1255880imo) t2).getData() instanceof StickerPropAwemeList)) {
                                ((StickerPropAwemeList) ((AbstractC1255880imo) stickerDetailAwemeListFramgent2.LLILZ.LL).getData()).draftCount = Integer.valueOf(i);
                            }
                            C1261230ivR c1261230ivR2 = stickerDetailAwemeListFramgent2.LLJJJJ;
                            if (c1261230ivR2 != null && c1261230ivR2.mmItems != 0) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= stickerDetailAwemeListFramgent2.LLJJJJ.mmItems.size()) {
                                        break;
                                    }
                                    if (!(ListProtector.get(stickerDetailAwemeListFramgent2.LLJJJJ.mmItems, i2) instanceof C1401450mZb)) {
                                        i2++;
                                    } else if (i2 >= 0) {
                                        if (i > 0) {
                                            ((C1401450mZb) stickerDetailAwemeListFramgent2.LLJJJJ.mmItems.get(i2)).shouldUpdate = true;
                                            ((C1401450mZb) stickerDetailAwemeListFramgent2.LLJJJJ.mmItems.get(i2)).setCount(i);
                                            stickerDetailAwemeListFramgent2.LLJJJJ.notifyItemChanged(i2);
                                        } else {
                                            stickerDetailAwemeListFramgent2.LLJJJJ.mmItems.remove(i2);
                                            stickerDetailAwemeListFramgent2.Y1(i2);
                                        }
                                    }
                                }
                            }
                            if (i > 0 && str3 != null && !str3.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(str3);
                                stickerDetailAwemeListFramgent2.LLJJJJ.mmItems.add(0, (T) new C1401450mZb(arrayList2, "effect_detail", i));
                                stickerDetailAwemeListFramgent2.LLJJJJ.notifyDataSetChanged();
                            }
                            C1C7U.LIZIZ("StickerDetailAwemeListFramgent@2927.lambda$checkIfNeedRefreshDraft$2$1L");
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1C7U.LIZIZ("StickerDetailAwemeListFramgent@2927.lambda$checkIfNeedRefreshDraft$2$1L");
                    }
                });
                return Unit.LIZ;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void dS() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        TuxTextView tuxTextViewOR = OR(R.string.l6r);
        C786410Ut5.h9(tuxTextViewOR, new ACListenerS155S0100000_21(this, 212));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fud, null, false);
        ImageView imageView = (ImageView) viewTd.findViewById(R.id.w6c);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.pe;
        imageView.setImageDrawable(c0hti.LIZ(viewTd.getContext()));
        C1235870iGX c1235870iGX = this.LLJJIJIL;
        C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(getContext());
        c1209530ha3LIZ.LIZIZ(viewTd);
        c1209530ha3LIZ.LIZLLL(tuxTextViewOR);
        c1235870iGX.setBuilder(c1209530ha3LIZ);
        FrameLayout frameLayout = this.LLJJJ;
        if (frameLayout != null) {
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = 0;
        }
    }

    public final Intent getIntent() {
        C19EG activity = getActivity();
        if (activity == null) {
            return null;
        }
        if (SAFExtensionKt.LJIIIZ(this) != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof StickerPropDetailFragment) {
                return ((StickerPropDetailFragment) parentFragment).ZR();
            }
        }
        return activity.getIntent();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi(ISocPubStatusRepoService.class);
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LIZ(hashCode());
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!C0A13.LIZ() || this.LLLLIIL == null) {
            return;
        }
        C0CHQ.LIZ().LJI().LIZ().unregisterListener(this.LLLLIIL);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLLLII = true;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        this.LLLLII = false;
        if (this.LLLILZLLLI && C294100Bfs.LIZJ) {
            this.LLLILZLLLI = false;
            ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS121S0100000_21(this, 122));
        }
        try {
            uS();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC19400810vG
    public final void LJLJLLL(String str) {
        this.LLLI = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void gS(C1398410mUh c1398410mUh) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("play_page_name", this.LLLI, bundle);
        c1398410mUh.LJI = bundle;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final List hS(List list) {
        String stringExtra;
        if (getActivity() != null) {
            try {
                stringExtra = getIntent().getStringExtra("prop_page_enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        if (!this.LLLJ && !this.LLJLLIL.isEmpty()) {
            this.LLLJ = true;
            C20684815ws.LJIILLIIL("show_prop_detail_page", C322490CkZ.LIZ((NewFaceStickerBean) ListProtector.get(this.LLJLLIL, 0), stringExtra, !((ArrayList) list).isEmpty()));
        }
        if (this.LLLIZZ) {
            PreloadVesdkServiceImpl.createIPreloadVesdkServicebyMonsterPlugin(false).preloadVesdk();
        }
        ArrayList arrayList = new ArrayList();
        if (this.LLILZ.LL.getData() instanceof StickerPropAwemeList) {
            StickerPropAwemeList stickerPropAwemeList = (StickerPropAwemeList) this.LLILZ.LL.getData();
            int iIntValue = stickerPropAwemeList.draftCount.intValue();
            String str = stickerPropAwemeList.draftQueryId;
            if (iIntValue > 0 && str != null && !str.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                arrayList.add(new C1401450mZb(arrayList2, "effect_detail", iIntValue));
                if (!this.LLLJL) {
                    this.LLLJL = true;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "effect_detail_page");
                    c2344009Gk.LJIIIIZZ("entrance_type", "pin");
                    c2344009Gk.LIZJ(iIntValue, "draft_cnt");
                    C20684815ws.LJIILLIIL("recall_drafts_entrance_show", c2344009Gk.LIZ);
                }
            }
        }
        arrayList.addAll(list);
        this.LLLIZZ = arrayList.isEmpty();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().end("tool_performance_effect_shoot_same", "setData");
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final boolean iS(int i) {
        Fragment parentFragment;
        if (this.LLLLIIIILLL == null && (parentFragment = getParentFragment()) != null && parentFragment.isAdded()) {
            this.LLLLIIIILLL = (MobileEffectViewModel) new ViewModelProvider(parentFragment).get(MobileEffectViewModel.class);
        }
        MobileEffectViewModel mobileEffectViewModel = this.LLLLIIIILLL;
        if (mobileEffectViewModel != null && mobileEffectViewModel.LL && !mobileEffectViewModel.LLILLJJLI) {
            return false;
        }
        return super.iS(i);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi(ISocPubStatusRepoService.class);
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LJIIJJI(hashCode());
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        if (this.LLJLLIL != null) {
            smartRouteNR.withParam("feed_data_sticker_model", new ArrayList(this.LLJLLIL));
        }
        String str = this.LLJLLL;
        if (str != null) {
            smartRouteNR.withParam("feed_data_sticker_group_id", str);
        }
        if (getIntent() != null && getIntent().getIntExtra("is_favourite_prop", 0) == 1) {
            smartRouteNR.withParam("is_favourite_prop", 1);
        }
        String str2 = this.LLJZ;
        if (str2 != null) {
            smartRouteNR.withParam("extra_edit_effect_uid", str2);
        }
        String str3 = this.LLJZIJLIL;
        if (str3 != null) {
            smartRouteNR.withParam("voice_conversion_effect_id", str3);
            smartRouteNR.withParam("voice_conversion_effect_name", this.LLL);
        }
        if (this.LLLL != null && C636090OxD.LIZ()) {
            String strCurSquareActionPosition = MusicDetailCommonModel.curSquareActionPosition(aweme, this.LLLL.LL);
            smartRouteNR.withParam("transport_mdp_square_action_position", strCurSquareActionPosition);
            smartRouteNR.withParam("followup_square_rec_type", this.LLLL.LIZIZ(aweme));
            smartRouteNR.withParam("followup_square_rec_reason", this.LLLL.LIZ(getContext(), aweme));
            if (!strCurSquareActionPosition.isEmpty()) {
                smartRouteNR.withParam("shoot_way", "followup_square");
                smartRouteNR.withParam("music_selected_from", "followup_square");
            }
        }
        HashMap map = new HashMap();
        map.put("enter_position", "video_cover");
        smartRouteNR.withParam("feed_param_extra", map);
        return smartRouteNR;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0mZE] */
    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C0A13.LIZ()) {
            if (this.LLLLIIL == null) {
                this.LLLLIIL = new IDraftListener() { // from class: X.0mZE
                    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
                    public final void onDeleted(AwemeDraft awemeDraft) {
                        StickerDetailAwemeListFramgent stickerDetailAwemeListFramgent = this.LIZ;
                        if (stickerDetailAwemeListFramgent.LLLLII) {
                            stickerDetailAwemeListFramgent.LLLJIL = true;
                            return;
                        }
                        try {
                            stickerDetailAwemeListFramgent.LLLJIL = true;
                            stickerDetailAwemeListFramgent.uS();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
                    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                        this.LIZ.LLLJIL = true;
                    }
                };
            }
            C0CHQ.LIZ().LJI().LIZ().registerListener(this.LLLLIIL);
        }
        if (C636090OxD.LIZ() && getActivity() != null) {
            this.LLLL = new StickerMobProvider(getIntent());
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC1260110itd
    public final void I2(Aweme aweme, View view, String str) {
        String string;
        String string2;
        if (aweme instanceof C626500Ohk) {
            if (C0OBG.LIZIZ(view)) {
                return;
            }
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null) {
                string = "";
            } else {
                string = arguments.getString("qa_origin_detail_key", "");
            }
            if (arguments == null) {
                string2 = "";
            } else {
                string2 = arguments.getString("shoot_enter_from", "");
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
            smartRouteBuildRoute.withParam("refer", str);
            smartRouteBuildRoute.withParam("previous_page", this.LLILZIL);
            smartRouteBuildRoute.withParam("shoot_enter_from", string2);
            smartRouteBuildRoute.withParam("extra_previous_page_position", this.LLJ);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
            smartRouteBuildRoute.withParam("video_from", "");
            smartRouteBuildRoute.withParam("video_challenge_profile_from", "");
            smartRouteBuildRoute.withParam("video_type", this.LL);
            smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
            String str3 = this.LLJILJIL;
            if (str3 != null) {
                str2 = str3;
            }
            smartRouteBuildRoute.withParam("process_id", str2);
            smartRouteBuildRoute.withParam("duo_type", "duo_detail");
            smartRouteBuildRoute.withParam("from_group_id", this.LLILZLL);
            smartRouteBuildRoute.withParam("creation_id", this.LLLIL);
            smartRouteBuildRoute.withParam("qa_origin_detail_key", string);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LLJJIII);
            smartRouteBuildRoute.open();
            return;
        }
        xe(view, aweme, str, 0);
    }
}
