package com.ss.android.ugc.aweme.music.artist.ui;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0XF1;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1233040iBy;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C1398110mUD;
import X.C1398550mUv;
import X.C1398560mUw;
import X.C1443560nfW;
import X.C1449410nox;
import X.C1449430noz;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C298260Bma;
import X.C723850SaN;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.InterfaceC1164630gPd;
import X.InterfaceC447510Hgj;
import X.InterfaceC836760Ws6;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC836760Ws6
public final class ArtistMusicAwemeListFragment extends BaseFragment implements InterfaceC1164630gPd {
    public static final C1398550mUv LLJJI = new Object() { // from class: X.0mUv
    };
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZiQ+PSHELIOSYgPGs5IGESOjElOjsePTYlKg4kLSgpBSYgPAM+KCg+LSs4";
    public TuxNavBar LLIZ;
    public FrameLayout LLIZLLLIL;
    public Music LLJ;
    public boolean LLJILJILJ;
    public DialogC1389620mGW LLJJ;
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILLL = "single_song";

    private final int bS() {
        return R.layout.dq1;
    }

    private final void clearFromXmlViewCache() {
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC1164630gPd, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return VR(this, layoutInflater, viewGroup, bundle);
    }

    private final void cS() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(2131836769);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.hide();
        this.LLJJ = dialogC1389620mGW;
        dialogC1389620mGW.hide();
    }

    @Override // X.InterfaceC1164630gPd
    public void BE() {
        MusicModel musicModelConvertToMusicModel;
        if (this.LLJILJILJ) {
            Music music = this.LLJ;
            if (music != null && music.getMusicStatus() == 0) {
                String offlineDesc = music.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    C844470XAv.LIZ.getClass();
                    offlineDesc = C844470XAv.LIZ().getString(2131837770);
                }
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy.LIZJ(offlineDesc);
                c1233040iBy.LIZLLL();
                return;
            }
            Music music2 = this.LLJ;
            if (music2 == null || (musicModelConvertToMusicModel = music2.convertToMusicModel()) == null) {
                return;
            }
            String string = UUID.randomUUID().toString();
            if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModelConvertToMusicModel, ActivityStack.getTopActivity(), true)) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://music/detail/");
                sbLIZ.append(musicModelConvertToMusicModel.getMusicId());
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, C2188811AlT.LIZIZ(sbLIZ));
                smartRouteBuildRoute.withParam("process_id", string);
                smartRouteBuildRoute.withParam("save_featured_video_success", true);
                smartRouteBuildRoute.open();
            }
        }
    }

    @Override // X.InterfaceC1164630gPd
    public void LLJJJJJIL() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJJ;
        if (dialogC1389620mGW != null) {
            C786410Ut5.J4(dialogC1389620mGW);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mUw] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: WR, reason: merged with bridge method [inline-methods] */
    public C1398560mUw lt() {
        return new InterfaceC447510Hgj() { // from class: X.0mUw
        };
    }

    public final FrameLayout ZR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.i2y) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxNavBar aS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // X.InterfaceC1164630gPd
    public void rp() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJJ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.hide();
        }
    }

    private final void init() {
        String strSR;
        String strSR2;
        String strSR3;
        String strSR4;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("artist_music_data") : null;
        this.LLJ = serializableExtra instanceof Music ? (Music) serializableExtra : null;
        Intent intent2 = activity.getIntent();
        String str = "";
        if (intent2 == null || (strSR = SR(intent2, "artist_music_id")) == null) {
            strSR = "";
        }
        this.LLJI = strSR;
        Intent intent3 = activity.getIntent();
        if (intent3 == null || (strSR2 = SR(intent3, "artist_music_name")) == null) {
            strSR2 = "";
        }
        this.LLJIJIL = strSR2;
        Intent intent4 = activity.getIntent();
        if (intent4 != null && (strSR4 = SR(intent4, "artist_music_featured_aweme_id")) != null) {
            str = strSR4;
        }
        this.LLJILJIL = str;
        Intent intent5 = activity.getIntent();
        this.LLJILJILJ = intent5 != null ? intent5.getBooleanExtra("artist_music_from_profile", false) : false;
        Intent intent6 = activity.getIntent();
        if (intent6 == null || (strSR3 = SR(intent6, "enter_method")) == null) {
            strSR3 = "single_song";
        }
        this.LLJILLL = strSR3;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final void dS(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void gS(TuxNavBar tuxNavBar) {
        this.LLIZ = tuxNavBar;
    }

    public final void hS(final boolean z) {
        final MusicModel musicModelConvertToMusicModel;
        final C19EG activity;
        Music music = this.LLJ;
        if (music == null || (musicModelConvertToMusicModel = music.convertToMusicModel()) == null || (activity = getActivity()) == null) {
            return;
        }
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(activity)) {
            C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
            return;
        }
        final Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C0XF1.LIZLLL(context)) {
            final RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.unavailableNetworkMusic(true);
            builder.shootWay("single_song");
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("network unavailable", new SimpleServiceLoadCallback() { // from class: X.0mUu
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    if (z) {
                        asyncAVService.uiService().recordService().openAlbumWithMusic(activity, builder.build(), musicModelConvertToMusicModel);
                    } else {
                        asyncAVService.uiService().recordService().startRecord(context, builder.build());
                    }
                }
            });
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().needLoginBeforeRecord()) {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = activity;
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
            return;
        }
        String string = UUID.randomUUID().toString();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", string);
        c2344009Gk.LJIIIIZZ("shoot_way", "single_song");
        c2344009Gk.LJIIIIZZ("shoot_from", "feature_video_page");
        c2344009Gk.LJIIIIZZ("music_id", this.LLJI);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJILLL);
        if (z) {
            c2344009Gk.LJFF("from_group_id", C1443560nfW.LJIIIIZZ());
            C20684815ws.LJIILLIIL("click_upload_entrance", c2344009Gk.LIZ);
        } else {
            c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            if (C298260Bma.LIZ()) {
                ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZLLL(new C1449410nox(string, "single_song", "feature_video_page", null, null, new C1449430noz(this.LLJI, "single_song"), null, null, 216), c2344009Gk.LIZ);
            } else {
                ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZLLL(new C1449410nox(string, "single_song", "", null, null, new C1449430noz(this.LLJI, ""), null, null, 216), c2344009Gk.LIZ);
            }
        }
        musicModelConvertToMusicModel.setFromSection(MusicModel.FromSection.OTHER);
        C1398110mUD.LIZ = "feature_video_page";
        C1398110mUD.LIZJ = this.LLJILLL;
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().isTrimmedEnable(musicModelConvertToMusicModel)) {
            musicModelConvertToMusicModel.setMusicBeginTime(0);
            musicModelConvertToMusicModel.setMusicEndTime(0);
        }
        if (z) {
            IMusicDetailService iMusicDetailService = (IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                iMusicDetailService.LJIJJ(this, activity2, musicModelConvertToMusicModel, string, this.LLJILLL);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        IMusicDetailService iMusicDetailService2 = (IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class);
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            iMusicDetailService2.LJIJI(this, activity3, musicModelConvertToMusicModel, null, "", "", 0, "", "single_song", "single_song", string, true, "feature_video_page", false, this.LLJILLL, "feature_video_page", null);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    @Override // X.InterfaceC1164630gPd
    public void uc(boolean z) {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZ = getString(2131834498);
        c1247510iZJ.LJ = new ACListenerS155S0100000_21(this, 87);
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZ = getString(2131834499);
        c1247510iZJ2.LJ = new ACListenerS155S0100000_21(this, 88);
        c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
        if (z) {
            c1390850mIV.LIZ.LLJJIJI = getString(2131834500);
        }
        c1390850mIV.LIZJ().show(activity.getSupportFragmentManager(), "artist_record_video_sheet");
    }

    public static String SR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NR(AFwS259S0000000_21.get$arr$(196));
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 190), 3);
        cS();
    }

    public View UR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, bS(), viewGroup, false);
    }

    public static View VR(ArtistMusicAwemeListFragment artistMusicAwemeListFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewUR = artistMusicAwemeListFragment.UR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewUR instanceof View)) {
            viewUR = null;
        }
        if (viewUR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewUR, artistMusicAwemeListFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewUR, artistMusicAwemeListFragment);
                viewUR.setTag(R.id.view_tree_saved_state_registry_owner, artistMusicAwemeListFragment);
                C19EG activity = artistMusicAwemeListFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewUR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewUR;
    }
}
