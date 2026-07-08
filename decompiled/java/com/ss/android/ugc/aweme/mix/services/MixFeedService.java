package com.ss.android.ugc.aweme.mix.services;

import X.AbstractC19484711Kz;
import X.AbstractC848400XPy;
import X.C05FZ;
import X.C07JE;
import X.C0C0X;
import X.C0DHG;
import X.C0WZX;
import X.C0XF1;
import X.C0XQ7;
import X.C1167750gUf;
import X.C1168470gVp;
import X.C1168860gWS;
import X.C1169100gWq;
import X.C1169150gWv;
import X.C1169160gWw;
import X.C1169240gX4;
import X.C1169270gX7;
import X.C1169360gXG;
import X.C1169380gXI;
import X.C11S5;
import X.C1220000hqw;
import X.C123100dR;
import X.C1258160iqU;
import X.C12ES;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1445910njJ;
import X.C1622206Wu;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C1ER1;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C259800zU;
import X.C297000BkY;
import X.C297020Bka;
import X.C444960Hcc;
import X.C452070Ho5;
import X.C613200O3i;
import X.C632670Orh;
import X.C653630PkP;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1167780gUi;
import X.InterfaceC1167830gUn;
import X.InterfaceC1413210msZ;
import X.InterfaceC1487280oo2;
import X.InterfaceC718610SGt;
import Y.AfS187S0100000_18;
import Y.AfS50S1100000_18;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.PlaylistDetailPreloadTask;
import com.ss.android.ugc.aweme.mix.api.PlaylistVideosPreloadTask;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.mix.choose.PlaylistChoosePanelFragment;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.AwS6S2400000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MixFeedService implements IMixFeedService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJII() {
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIJ() {
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJ() {
        C1169160gWw.LIZ.getClass();
        C1169160gWw.LIZJ("", 1, "video_post_page", "split_longvideo", null, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0njJ] */
    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final C1445910njJ LJII() {
        return new InterfaceC1413210msZ() { // from class: X.0njJ
            @Override // X.InterfaceC1413210msZ
            public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
            }

            @Override // X.InterfaceC1413210msZ
            public final void LIZ(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
                String str = baseShortVideoContext.playlist_id;
                if (str != null && baseShortVideoContext.playlist_name != null) {
                    linkedHashMap.put("playlist_id", str);
                    linkedHashMap.put("playlist_name", baseShortVideoContext.playlist_name);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJ() {
        ((LruCache) C613200O3i.LL.getValue().LIZLLL.getValue()).evictAll();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean needCreateFirstMix() {
        C1167750gUf.LIZ.getClass();
        return C1167750gUf.LIZLLL() && !C297000BkY.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("can_exp_playlist", 0) == 1;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LIZJ() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play_list_");
        sbLIZ.append(curUser.getUid());
        KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0).storeBoolean("show_profile_empty_flag", false);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final Integer LJIIJ() {
        return Integer.valueOf(R.layout.doc);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean getPushLiveState() {
        User curUser = C0XQ7.LJFF().getCurUser();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play_list_");
        sbLIZ.append(curUser.getUid());
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0).getBoolean("show_profile_empty_flag", true);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean needShowAddOrRemoveButton() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("can_exp_playlist", 0) == 1;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJIILJJIL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LIZ(Aweme aweme) {
        PlayListInfo playListInfo;
        if (LJI(aweme) && aweme != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getIndex() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LIZLLL(boolean z) {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play_list_");
        sbLIZ.append(curUser.getUid());
        KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0).storeBoolean("show_personal_account_tis_flag", z);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJI(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getMixId() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final MixBottomBarVM LJIL(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem) {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(717);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixBottomBarVM.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(929);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(interactPlayListBottomBarAssem);
        if (!(interactPlayListBottomBarAssem instanceof HasDefaultViewModelProviderFactory)) {
            interactPlayListBottomBarAssem = null;
        }
        return (MixBottomBarVM) new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(interactPlayListBottomBarAssem), aFwS256S0000000_18, null, null, null).getValue();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJI(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIJZLJL(InterfaceC1167830gUn interfaceC1167830gUn) {
        C1167750gUf.LIZ.getClass();
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        C0XQ7.LJ();
        String curSecUserId = C0XQ7.LIZ.LJIIJ().getCurSecUserId();
        MixFeedApi.LIZ.getClass();
        C1169360gXG.LIZ().getUserMixList(curUserId, 0L, curSecUserId, false, null, 0).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS50S1100000_18(interfaceC1167830gUn, curUserId, 0), new AfS187S0100000_18(interfaceC1167830gUn, 4));
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIZI(Context context) {
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(-367718959, new AwS653S0100000_4(context, 5), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131850528);
        C985403tE.LIZ(c1397580mTM, new AwS583S0100000_4(context, 89));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final C1169270gX7 LJJIJIIJIL(AssemViewModel assemViewModel) {
        return new C1169270gX7((MixVideosViewModel) assemViewModel);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> LJJIJIL(final Object obj) {
        return C2097608Jq.LJIIIIZZ(new Pair(PlaylistDetailPreloadTask.class, new InterfaceC718610SGt(obj) { // from class: X.0gX5
            public final Object LIZ;

            @Override // X.InterfaceC718610SGt
            public final Bundle LIZ() {
                Aweme aweme;
                PlayListInfo playListInfo;
                Aweme aweme2;
                Aweme aweme3;
                Aweme aweme4;
                Bundle bundle = new Bundle();
                Object obj2 = this.LIZ;
                String mixId = null;
                VideoItemParams videoItemParams = obj2 instanceof VideoItemParams ? (VideoItemParams) obj2 : null;
                C1169240gX4 c1169240gX4 = new C1169240gX4();
                c1169240gX4.setMUsrId((videoItemParams == null || (aweme4 = videoItemParams.getAweme()) == null) ? null : AwemeExtKt.getAuthorUid(aweme4));
                c1169240gX4.setMSecUid((videoItemParams == null || (aweme3 = videoItemParams.getAweme()) == null) ? null : AwemeExtKt.getSecAuthorUid(aweme3));
                c1169240gX4.setMAid((videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : aweme2.getAid());
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (playListInfo = aweme.playlist_info) != null) {
                    mixId = playListInfo.getMixId();
                }
                c1169240gX4.setMixId(mixId);
                c1169240gX4.setFromShare(false);
                C786410Ut5.LJJIZ(bundle, "mix_video_list_params", c1169240gX4);
                return bundle;
            }

            {
                this.LIZ = obj;
            }
        }), new Pair(PlaylistVideosPreloadTask.class, new InterfaceC718610SGt(obj) { // from class: X.0gX6
            public final Object LIZ;

            @Override // X.InterfaceC718610SGt
            public final Bundle LIZ() {
                Aweme aweme;
                PlayListInfo playListInfo;
                Aweme aweme2;
                Aweme aweme3;
                Aweme aweme4;
                Object obj2 = this.LIZ;
                String mixId = null;
                VideoItemParams videoItemParams = obj2 instanceof VideoItemParams ? (VideoItemParams) obj2 : null;
                Bundle bundle = new Bundle();
                C1169240gX4 c1169240gX4 = new C1169240gX4();
                c1169240gX4.setMUsrId((videoItemParams == null || (aweme4 = videoItemParams.getAweme()) == null) ? null : AwemeExtKt.getAuthorUid(aweme4));
                c1169240gX4.setMSecUid((videoItemParams == null || (aweme3 = videoItemParams.getAweme()) == null) ? null : AwemeExtKt.getSecAuthorUid(aweme3));
                c1169240gX4.setMAid((videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : aweme2.getAid());
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (playListInfo = aweme.playlist_info) != null) {
                    mixId = playListInfo.getMixId();
                }
                c1169240gX4.setMixId(mixId);
                c1169240gX4.setFromShare(false);
                C786410Ut5.LJJIZ(bundle, "mix_video_list_params", c1169240gX4);
                return bundle;
            }

            {
                this.LIZ = obj;
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJJIJL(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && !TextUtils.isEmpty(playListInfo.getMixId())) {
            return true;
        }
        return false;
    }

    public static void LJJIJLIJ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9Hd2SDyIDCdsVZRHBfxRiH6lz7xPtI6wQ==", null));
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIJI(Context context, Bundle bundle) {
        Intent intentBuildIntent = SmartRouter.buildRoute(context, "//mix/feed_manage").buildIntent();
        if (intentBuildIntent != null) {
            intentBuildIntent.putExtras(bundle);
        }
        LJJIJLIJ(context, intentBuildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIIIZZ(final String str, final String str2, C1258160iqU c1258160iqU) {
        AbstractC19484711Kz<MixListResponse> userMixList;
        if (str != null && str2 != null) {
            C1167750gUf.LIZ.getClass();
            AtomicBoolean atomicBoolean = C1167750gUf.LIZJ;
            if (!atomicBoolean.get() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && C07JE.LIZ()) {
                userMixList = AbstractC19484711Kz.LJIJJLI(1).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0gUq
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        MixFeedApi.LIZ.getClass();
                        AbstractC19484711Kz<MixListResponse> userMixList2 = C1169360gXG.LIZ().getUserMixList(str, 0L, str2, C297020Bka.LIZ(), null, 0);
                        C1167750gUf.LIZJ.set(true);
                        return userMixList2;
                    }
                });
            } else {
                MixFeedApi.LIZ.getClass();
                userMixList = C1169360gXG.LIZ().getUserMixList(str, 0L, str2, C297020Bka.LIZ(), null, 0);
                atomicBoolean.set(true);
            }
            userMixList.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS50S1100000_18(c1258160iqU, str, 1), new AfS187S0100000_18(c1258160iqU, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIFFI(CreatorToolsActivity creatorToolsActivity, String str, String str2) {
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJ(creatorToolsActivity, new Bundle(), 1, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final C1169380gXI LJIIIZ(ViewGroup viewGroup, boolean z, boolean z2, String str, C653630PkP c653630PkP) {
        View viewTd;
        if (z2) {
            viewTd = C1ER1.LIZIZ.LJJLI(R.layout.doc, viewGroup);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.doc, viewGroup, false);
        }
        return new C1169380gXI(viewTd, z, z2, str, c653630PkP);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIII(Activity activity, Aweme aweme, InterfaceC1167780gUi interfaceC1167780gUi, String str, String str2) {
        PlayListInfo playListInfo;
        C259800zU c259800zU = new C259800zU();
        String str3 = "";
        c259800zU.element = "";
        if (aweme != null && (playListInfo = aweme.playlist_info) != null) {
            String mixName = playListInfo.getMixName();
            if (mixName != null) {
                str3 = mixName;
            }
            ?? mixId = playListInfo.getMixId();
            if (mixId != 0) {
                c259800zU.element = mixId;
            }
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJI(C786410Ut5.j4(activity.getResources().getString(2131846233), Arrays.copyOf(new Object[]{str3}, 1)));
        c1397580mTM.LIZ(2131846234);
        C985403tE.LIZ(c1397580mTM, new AwS6S2400000_18(activity, (Activity) aweme, (Aweme) c259800zU, (C259800zU<String>) interfaceC1167780gUi, (InterfaceC1167780gUi) str, str2, (String) 0));
        c1397580mTM.LIZLLL(new AwS597S0100000_18(interfaceC1167780gUi, 183));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIJ(Context context, Bundle bundle, int i, String str, String str2) {
        Intent intentBuildIntent = SmartRouter.buildRoute(context, "//mix/create_page").buildIntent();
        bundle.putInt("open_fragment_type", i);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        if (intentBuildIntent != null) {
            intentBuildIntent.putExtras(bundle);
        }
        LJJIJLIJ(context, intentBuildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJFF(Activity activity, IAVMixFeedServiceImpl.AnonymousClass1 anonymousClass1, String str, String str2, String str3, String str4) {
        Fragment fragment;
        Fragment fragment2;
        double d;
        if (!C297000BkY.LIZ()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_full_scrren", true);
            C786410Ut5.LJJJI("key_choosed_mix_id", str3, bundle);
            C786410Ut5.LJJJI("key_choosed_mix_name", str4, bundle);
            C786410Ut5.LJJJI("enter_from", str, bundle);
            C786410Ut5.LJJJI("enter_method", str2, bundle);
            AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
            addFeedToMixFragment.setArguments(bundle);
            addFeedToMixFragment.LLJIJIL = anonymousClass1;
            fragment = addFeedToMixFragment;
        } else {
            PlaylistChoosePanelFragment.LLILLL.getClass();
            PlaylistChoosePanelFragment playlistChoosePanelFragmentLIZ = C1168470gVp.LIZ(null, str, str2, str3, str4, true);
            playlistChoosePanelFragmentLIZ.LLILLJJLI = anonymousClass1;
            fragment = playlistChoosePanelFragmentLIZ;
        }
        if (C297000BkY.LIZ() && (activity instanceof C19EG)) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = fragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            double dLJIIIIZZ = C12ES.LJIIIIZZ(activity);
            if (C297000BkY.LIZ()) {
                d = 0.7d;
            } else {
                d = 0.9d;
            }
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = (int) (dLJIIIIZZ * d);
            tuxSheet2.LLILLL = true;
            tuxSheet2.LLJLLIL = true;
            tuxSheet2.show(((C19EG) activity).getSupportFragmentManager(), "Add_video_to_mix");
            return;
        }
        if (!(activity instanceof C19EG) || !(fragment instanceof AddFeedToMixFragment) || (fragment2 = fragment) == null) {
            return;
        }
        try {
            C19EH c19ehLJIIJ = ((C19EG) activity).getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.fv, R.anim.g2);
            c19ehLJIIJ.LIZJ(R.id.trr, fragment2, "Add_video_to_mix");
            c19ehLJIIJ.LJIIJJI();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIJJLI(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        Fragment fragmentLIZ;
        double d;
        if (!C297000BkY.LIZ()) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "key_add_mix_aweme", aweme);
            C786410Ut5.LJJJI("key_choosed_mix_id", str, bundle);
            C786410Ut5.LJJJI("key_choosed_mix_name", str2, bundle);
            C786410Ut5.LJJJI("enter_from", str3, bundle);
            C786410Ut5.LJJJI("enter_method", str4, bundle);
            fragmentLIZ = new AddFeedToMixFragment();
            fragmentLIZ.setArguments(bundle);
        } else {
            PlaylistChoosePanelFragment.LLILLL.getClass();
            fragmentLIZ = C1168470gVp.LIZ(aweme, str3, str4, str, str2, false);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = fragmentLIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        double dLJIIIIZZ = C12ES.LJIIIIZZ(activity);
        if (C297000BkY.LIZ()) {
            d = 0.7d;
        } else {
            d = 0.9d;
        }
        int i = (int) (dLJIIIIZZ * d);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = i;
        tuxSheet2.LLILLL = true;
        tuxSheet2.LLJLLIL = true;
        if (activity instanceof C19EG) {
            tuxSheet2.show(((C19EG) activity).getSupportFragmentManager(), "Add_video_to_mix");
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIL(Context context, Bundle bundle, String str, String str2, Long l, String str3, UrlModel urlModel) {
        Intent intentBuildIntent = SmartRouter.buildRoute(context, "//mix/chang_play_list_name").buildIntent();
        C786410Ut5.LJJJI("user_last_name", str, bundle);
        C786410Ut5.LJJJI("mix_id", str2, bundle);
        C786410Ut5.LJJJI("enter_from", str3, bundle);
        if (l != null) {
            l.longValue();
            bundle.putLong("moderated_rename_timestamp", l.longValue());
        }
        if (urlModel != null) {
            C786410Ut5.LJJIZ(bundle, "key_playlist_cover", urlModel);
        }
        if (intentBuildIntent != null) {
            intentBuildIntent.putExtras(bundle);
        }
        LJJIJLIJ(context, intentBuildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILLIIL(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        C1169160gWw.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ("author_id", str5);
        c2344009Gk.LIZJ(i, "playlist_num");
        c2344009Gk.LIZJ(i2, "panel_click");
        C20684815ws.LJIILLIIL("start_playlist_autoplay", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIZILJ(Context context, String str, String str2, String str3, int i, String str4, Boolean bool) {
        EditPlaylistActivityArg editPlaylistActivityArg = new EditPlaylistActivityArg("manage_playlist", "setting_page", str, null, Integer.valueOf(i), null, str4, str2, str3, null, bool);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//playlist/edit");
        smartRouteBuildRoute.withNavArg(editPlaylistActivityArg);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIJJI(String str, String str2, String str3, String str4, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3) {
        String str5 = str2;
        String str6 = str;
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str4 != null) {
            str7 = str4;
        }
        C1169160gWw.LJJ(c1169160gWw, str6, str5, str3, str7, null, null, null, c1169150gWv, num, num2, num3, 112);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final TuxSheet LJIJJ(Context context, String str, String str2, Aweme aweme, String str3, C1169150gWv c1169150gWv, Function0 function0, String str4) {
        return C1168860gWS.LIZ(context, str, str2, aweme, "", "", str3, c1169150gWv, function0, str4);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIJIIJI(int i, String str, String str2, String str3, String str4, long j, String str5, String str6) {
        C1169160gWw.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        c2344009Gk.LJIIIIZZ("playlist_id", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        c2344009Gk.LJIIIIZZ("author_id", str5);
        c2344009Gk.LIZLLL(j, "autoplay_duration");
        c2344009Gk.LIZJ(i, "playlist_num");
        c2344009Gk.LJIIIIZZ("end_type", str6);
        C20684815ws.LJIILLIIL("end_playlist_autoplay", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILIIL(String str, String str2, String str3, String str4, float f, String str5, C1169150gWv c1169150gWv, Integer num, Integer num2, Integer num3) {
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str9 = "";
        if (str8 == null) {
            str8 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str4 != null) {
            str9 = str4;
        }
        Float fValueOf = Float.valueOf(f);
        c1169160gWw.getClass();
        C1169160gWw.LJIIJJI(str8, str7, str6, str9, fValueOf, str5, c1169150gWv, num, num2, num3);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILL(String str, String str2, String str3, String str4, String str5, C1169150gWv c1169150gWv, Integer num, String str6, String str7, String str8) {
        String str9 = str4;
        String str10 = str2;
        String str11 = str;
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str12 = "";
        if (str11 == null) {
            str11 = "";
        }
        if (str10 == null) {
            str10 = "";
        }
        if (str9 == null) {
            str9 = "";
        }
        if (str3 != null) {
            str12 = str3;
        }
        C1169160gWw.LJIILL(c1169160gWw, str11, str10, str9, str12, 0, str5, null, null, null, c1169150gWv, num, str6, str7, str8, 448);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIJ(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C1169150gWv c1169150gWv, String str7, Boolean bool, String str8) {
        String str9;
        Integer numIsFromVideo;
        String strValueOf = str8;
        String str10 = null;
        C1169240gX4 c1169240gX4LJJIL = LJJIL(this, str, aweme, str2, str3, str4, str5, str6, z, c1169150gWv, null, str7, Intrinsics.LJFF(bool, Boolean.TRUE), null, null, null, 28672);
        if (context != null) {
            C05FZ c05fz = C05FZ.LIZ;
            Pair[] pairArr = new Pair[2];
            String previousPage = c1169240gX4LJJIL.getPreviousPage();
            String str11 = "";
            if (previousPage == null) {
                previousPage = "";
            }
            pairArr[0] = new Pair("playlist_previous_page", previousPage);
            String enterMethod = c1169240gX4LJJIL.getEnterMethod();
            if (enterMethod != null) {
                str11 = enterMethod;
            }
            pairArr[1] = new Pair("enter_method", str11);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c05fz.getClass();
            C05FZ.LIZIZ(mapLJIIIIZZ, z);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://mix/detail");
            smartRouteBuildRoute.withParam("video_from", c1169240gX4LJJIL.getMVideoFrom());
            smartRouteBuildRoute.withParam("enter_from", c1169240gX4LJJIL.getMEventType());
            smartRouteBuildRoute.withParam("mix_video_list_params", c1169240gX4LJJIL);
            C1169150gWv searchParam = c1169240gX4LJJIL.getSearchParam();
            if (searchParam != null) {
                str9 = searchParam.searchId;
            } else {
                str9 = null;
            }
            smartRouteBuildRoute.withParam("playlist_search_id", str9);
            C1169150gWv searchParam2 = c1169240gX4LJJIL.getSearchParam();
            if (searchParam2 != null) {
                numIsFromVideo = searchParam2.isFromVideo();
            } else {
                numIsFromVideo = null;
            }
            smartRouteBuildRoute.withParam("is_from_video", numIsFromVideo);
            C1169150gWv searchParam3 = c1169240gX4LJJIL.getSearchParam();
            if (searchParam3 != null) {
                str10 = searchParam3.searchType;
            }
            smartRouteBuildRoute.withParam("key_search_type", str10);
            smartRouteBuildRoute.withParam("key_playlist_previous_page", c1169240gX4LJJIL.getPreviousPage());
            smartRouteBuildRoute.withParam("key_playlist_from_group_id", c1169240gX4LJJIL.getEnterGroupId());
            if (!C123100dR.LIZ(strValueOf) || strValueOf == null) {
                strValueOf = String.valueOf(c1169240gX4LJJIL.hashCode());
            }
            smartRouteBuildRoute.withParam("playlist_session_id", strValueOf);
            if (c1169150gWv != null) {
                if (c1169150gWv.bundle != null) {
                    smartRouteBuildRoute.withBundleAnimation(c1169150gWv.bundle);
                    smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                } else if (c1169150gWv != null) {
                }
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 75);
            }
            smartRouteBuildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIZ(Context context, Aweme aweme, C1169150gWv c1169150gWv, Float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        String str8;
        String groupId;
        String authorUid;
        Video video;
        String str9;
        Integer numIsFromVideo;
        String str10;
        int i;
        int i2;
        String str11;
        Integer numIsFromVideo2;
        String str12;
        boolean zLIZ = C123100dR.LIZ(str4);
        Integer numValueOf = null;
        Object objValueOf = str4;
        if (!zLIZ || str4 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(System.currentTimeMillis());
            objValueOf = Integer.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
        }
        String str13 = "";
        if (c1169150gWv != null && !TextUtils.isEmpty(c1169150gWv.searchId)) {
            IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
            if (str3 != null) {
                str13 = str3;
            }
            iMixFeedService.LJIJJ(context, str13, str, aweme, "from_mix_detail_item", c1169150gWv, null, objValueOf.toString());
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            String string = objValueOf.toString();
            c1169160gWw.getClass();
            C1169160gWw.LJI(aweme, str, str3, c1169150gWv, "", "", string);
            return;
        }
        String str14 = "click_banner_playnext";
        if (z) {
            str8 = "click_banner_playnext";
        } else {
            str8 = "click_banner";
        }
        String string2 = objValueOf.toString();
        if (context != null && C0XF1.LIZLLL(context)) {
            C1169240gX4 c1169240gX4LJJIL = LJJIL(this, str2, aweme, "from_mix_detail_item", str8, str, "", "", true, c1169150gWv, f, str3, false, str5, str6, str7, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
            c1169240gX4LJJIL.setPlayNext(z);
            if (context != null) {
                if (C0C0X.LIZ() == 0) {
                    SmartRouter.buildRoute(context, "aweme://mix/detail").buildIntent();
                    if (C444960Hcc.LIZJ(context)) {
                        i = R.anim.g2;
                    } else {
                        i = R.anim.g0;
                    }
                    if (C444960Hcc.LIZJ(context)) {
                        i2 = R.anim.ft;
                    } else {
                        i2 = R.anim.fv;
                    }
                    C05FZ c05fz = C05FZ.LIZ;
                    Pair[] pairArr = new Pair[2];
                    String previousPage = c1169240gX4LJJIL.getPreviousPage();
                    if (previousPage == null) {
                        previousPage = "";
                    }
                    pairArr[0] = new Pair("playlist_previous_page", previousPage);
                    String enterMethod = c1169240gX4LJJIL.getEnterMethod();
                    if (enterMethod == null) {
                        enterMethod = "";
                    }
                    pairArr[1] = new Pair("enter_method", enterMethod);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    c05fz.getClass();
                    C05FZ.LIZIZ(mapLJIIIIZZ, true);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://mix/detail");
                    smartRouteBuildRoute.withParam("video_from", c1169240gX4LJJIL.getMVideoFrom());
                    smartRouteBuildRoute.withParam("enter_from", c1169240gX4LJJIL.getMEventType());
                    smartRouteBuildRoute.withParam("mix_video_list_params", c1169240gX4LJJIL);
                    C1169150gWv searchParam = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam != null) {
                        str11 = searchParam.searchId;
                    } else {
                        str11 = null;
                    }
                    smartRouteBuildRoute.withParam("playlist_search_id", str11);
                    C1169150gWv searchParam2 = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam2 != null) {
                        numIsFromVideo2 = searchParam2.isFromVideo();
                    } else {
                        numIsFromVideo2 = null;
                    }
                    smartRouteBuildRoute.withParam("is_from_video", numIsFromVideo2);
                    C1169150gWv searchParam3 = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam3 != null) {
                        str12 = searchParam3.searchType;
                    } else {
                        str12 = null;
                    }
                    smartRouteBuildRoute.withParam("key_search_type", str12);
                    smartRouteBuildRoute.withParam("key_playlist_previous_page", c1169240gX4LJJIL.getPreviousPage());
                    smartRouteBuildRoute.withParam("key_playlist_from_group_id", c1169240gX4LJJIL.getEnterGroupId());
                    smartRouteBuildRoute.withParam("key_play_next", z);
                    smartRouteBuildRoute.withParam("key_need_preload", z2);
                    smartRouteBuildRoute.withParam("playlist_session_id", string2);
                    if (c1169150gWv != null) {
                        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 75);
                    }
                    smartRouteBuildRoute.withAnimation(i2, i);
                    smartRouteBuildRoute.open();
                } else {
                    C05FZ c05fz2 = C05FZ.LIZ;
                    Pair[] pairArr2 = new Pair[2];
                    String previousPage2 = c1169240gX4LJJIL.getPreviousPage();
                    if (previousPage2 == null) {
                        previousPage2 = "";
                    }
                    pairArr2[0] = new Pair("playlist_previous_page", previousPage2);
                    String enterMethod2 = c1169240gX4LJJIL.getEnterMethod();
                    if (enterMethod2 == null) {
                        enterMethod2 = "";
                    }
                    pairArr2[1] = new Pair("enter_method", enterMethod2);
                    Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
                    c05fz2.getClass();
                    C05FZ.LIZIZ(mapLJIIIIZZ2, true);
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "aweme://mix/detail");
                    smartRouteBuildRoute2.withParam("video_from", c1169240gX4LJJIL.getMVideoFrom());
                    smartRouteBuildRoute2.withParam("enter_from", c1169240gX4LJJIL.getMEventType());
                    smartRouteBuildRoute2.withParam("mix_video_list_params", c1169240gX4LJJIL);
                    C1169150gWv searchParam4 = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam4 != null) {
                        str9 = searchParam4.searchId;
                    } else {
                        str9 = null;
                    }
                    smartRouteBuildRoute2.withParam("playlist_search_id", str9);
                    C1169150gWv searchParam5 = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam5 != null) {
                        numIsFromVideo = searchParam5.isFromVideo();
                    } else {
                        numIsFromVideo = null;
                    }
                    smartRouteBuildRoute2.withParam("is_from_video", numIsFromVideo);
                    C1169150gWv searchParam6 = c1169240gX4LJJIL.getSearchParam();
                    if (searchParam6 != null) {
                        str10 = searchParam6.searchType;
                    } else {
                        str10 = null;
                    }
                    smartRouteBuildRoute2.withParam("key_search_type", str10);
                    smartRouteBuildRoute2.withParam("key_playlist_previous_page", c1169240gX4LJJIL.getPreviousPage());
                    smartRouteBuildRoute2.withParam("key_playlist_from_group_id", c1169240gX4LJJIL.getEnterGroupId());
                    smartRouteBuildRoute2.withParam("key_play_next", z);
                    smartRouteBuildRoute2.withParam("key_need_preload", z2);
                    smartRouteBuildRoute2.withParam("playlist_session_id", string2);
                    if (c1169150gWv != null) {
                        smartRouteBuildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 75);
                    }
                    smartRouteBuildRoute2.open();
                }
            }
        }
        if (aweme != null) {
            groupId = aweme.getGroupId();
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            groupId = null;
            authorUid = null;
        }
        if (!z) {
            str14 = "click_banner";
        }
        if (aweme != null && (video = aweme.getVideo()) != null) {
            numValueOf = Integer.valueOf(video.getDuration());
        }
        LJIILL(str3, str, groupId, authorUid, str14, c1169150gWv, numValueOf, objValueOf.toString(), str5, str7);
    }

    public static C1169240gX4 LJJIL(MixFeedService mixFeedService, String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C1169150gWv c1169150gWv, Float f, String str7, boolean z2, String str8, String str9, String str10, int i) {
        Aweme awemeM199clone;
        String str11 = str8;
        boolean z3 = z2;
        String str12 = str9;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z3 = false;
        }
        String str13 = null;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = null;
        }
        if ((i & 8192) != 0) {
            str12 = null;
        }
        if ((i & 16384) == 0) {
            str13 = str10;
        }
        mixFeedService.getClass();
        C1169240gX4 c1169240gX4 = new C1169240gX4();
        c1169240gX4.setMVideoFrom(str2);
        c1169240gX4.setEnterMethod(str3);
        c1169240gX4.setMNeedShowDialog(z);
        c1169240gX4.setEnterGroupId(str);
        c1169240gX4.setVideoPlayedPercentage(f);
        c1169240gX4.setFromShare(z3);
        if (str11 != null && str11.length() != 0 && str13 != null && str13.length() != 0) {
            if (aweme != null && (awemeM199clone = aweme.m199clone()) != null) {
                c1169240gX4.setMSecUid(AwemeExtKt.getSecAuthorUid(awemeM199clone));
                c1169240gX4.setMUsrId(AwemeExtKt.getAuthorUid(awemeM199clone));
                if (C0C0X.LIZ() == 0) {
                    c1169240gX4.setAweme(awemeM199clone);
                } else {
                    C1169100gWq.LIZ = awemeM199clone;
                }
                c1169240gX4.setMAid(awemeM199clone.getAid());
            }
        } else if (aweme != null) {
            c1169240gX4.setMSecUid(AwemeExtKt.getSecAuthorUid(aweme));
            c1169240gX4.setMUsrId(AwemeExtKt.getAuthorUid(aweme));
            if (C0C0X.LIZ() == 0) {
                c1169240gX4.setAweme(aweme);
            } else {
                C1169100gWq.LIZ = aweme;
            }
            c1169240gX4.setMAid(aweme.getAid());
        }
        if (!TextUtils.isEmpty(str5)) {
            c1169240gX4.setMUsrId(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            c1169240gX4.setMSecUid(str6);
        }
        c1169240gX4.setSearchParam(c1169150gWv);
        c1169240gX4.setMEventType("playlist");
        c1169240gX4.setMixId(str4);
        c1169240gX4.setPreviousPage(str7);
        c1169240gX4.setPageStartTime(SystemClock.elapsedRealtime());
        c1169240gX4.setViewModelKey(str4);
        c1169240gX4.setSourceVideoId(str11);
        c1169240gX4.setSourceGroupId(str12);
        c1169240gX4.setSourceAuthorId(str13);
        return c1169240gX4;
    }
}
