package com.ss.android.ugc.aweme.music.service;

import X.C01GW;
import X.C05XL;
import X.C090F;
import X.C099F;
import X.C0PEM;
import X.C1165300gQi;
import X.C1192004lS;
import X.C1387310mCn;
import X.C1389910mGz;
import X.C1390920mIc;
import X.C1398280mUU;
import X.C13LQ;
import X.C1401550mZl;
import X.C1440005kM;
import X.C14KQ;
import X.C1524805y2;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C297090Bkh;
import X.C297120Bkk;
import X.C418440Gaw;
import X.C452501pT;
import X.C453940Hr6;
import X.C584710MwX;
import X.C630310Ont;
import X.C630970Oox;
import X.C632130Oqp;
import X.C635890Owt;
import X.C635910Owv;
import X.C635950Owz;
import X.C635970Ox1;
import X.C636090OxD;
import X.C636120OxG;
import X.C786410Ut5;
import X.C799570VYd;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC635960Ox0;
import Y.ACallableS62S1100000_9;
import Y.ARunnableS5S1000000_9;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.music.ab.MDPSquarePreloadABSwitchConfig;
import com.ss.android.ugc.aweme.music.ab.MdpShowSquareABSwitchConfig;
import com.ss.android.ugc.aweme.music.ab.NewReleaseMusicConfigModel;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.cache.CacheManager;
import com.ss.android.ugc.aweme.music.model.FetchSimilarMusicOption;
import com.ss.android.ugc.aweme.music.model.IFetchSimilarMusicCallback;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MusicDetailRootFragment;
import com.ss.android.ugc.aweme.music.ui.artistprofile.ArtistProfileTuxSheetFragment;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS63S0210000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailService implements IMusicDetailService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1192004lS());

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILIIL() {
    }

    public final Keva LJJI() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LIZIZ() {
        return C297120Bkk.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final Class<? extends Fragment> LJIIJJI() {
        return MusicDetailRootFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LIZ(Music music) {
        return C630310Ont.LIZIZ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final C1389910mGz LJ(Fragment fragment) throws Throwable {
        int iLIZIZ;
        int iLIZIZ2;
        ShootContainerProviderAbility shootContainerProviderAbility;
        View viewAO0 = null;
        if ((fragment instanceof MusicDetailFragment) && (shootContainerProviderAbility = (ShootContainerProviderAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ShootContainerProviderAbility.class, null)) != null) {
            viewAO0 = shootContainerProviderAbility.aO0();
        }
        Context context = fragment.getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        int iLIZJ = C14KQ.LIZJ(context);
        int[] iArr = new int[2];
        if (viewAO0 != null) {
            viewAO0.getLocationOnScreen(iArr);
        }
        boolean z = true;
        int i = iArr[1];
        if (viewAO0 == null || viewAO0.getVisibility() != 0) {
            z = false;
        }
        if (z) {
            if (i > 0) {
                iLIZIZ2 = iLIZJ - i;
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + iLIZIZ2;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        C1389910mGz c1389910mGz = new C1389910mGz(fragment);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 4;
        c1389910mGz.LIZIZ(iLIZIZ);
        return c1389910mGz;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJFF(Map<String, String> map) {
        MusicDetailApi.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final String LJI(Aweme aweme) {
        return C1398280mUU.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final MusicDetailFragment LJII(Intent intent) {
        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
        C844470XAv.LIZ.getClass();
        boolean zLIZJ = iMSAdaptionService.LIZJ(C844470XAv.LIZ());
        Bundle extras = null;
        if (!zLIZJ) {
            return null;
        }
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        MusicDetailFragment.LLJJI.getClass();
        MusicDetailFragment musicDetailFragment = new MusicDetailFragment();
        musicDetailFragment.setArguments(extras);
        return musicDetailFragment;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LJIIIZ(Aweme aweme) {
        Music music;
        Music music2;
        MusicReleaseInfo musicReleaseInfo;
        String[] stringArray;
        Keva kevaLJJI;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (music == null || (music2 = aweme.getMusic()) == null || (musicReleaseInfo = music2.getMusicReleaseInfo()) == null || !musicReleaseInfo.isNewReleaseSong()) {
            return false;
        }
        int i = ((NewReleaseMusicConfigModel) C635910Owv.LIZIZ.getValue()).feedMusicTitleShowTimes;
        Keva kevaLJJI2 = LJJI();
        long j = -1;
        if (kevaLJJI2 != null) {
            j = kevaLJJI2.getLong("feed_music_title_show_day", -1L);
        }
        if (!C1387310mCn.LJFF(j) || (kevaLJJI = LJJI()) == null || (stringArray = kevaLJJI.getStringArray("feed_music_title_show_times", new String[0])) == null) {
            stringArray = new String[0];
        }
        if (i >= 0 && stringArray.length >= i && C13LQ.LJJIJIIJI(aweme.getAid(), stringArray) < 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final List<MusicOwnerInfo> LJIIJ(Music music) {
        Pair<Boolean, List<MusicOwnerInfo>> pairLIZIZ;
        if (C630310Ont.LIZIZ(music)) {
            pairLIZIZ = C630970Oox.LIZ(music);
        } else {
            pairLIZIZ = C630970Oox.LIZIZ(music);
        }
        return pairLIZIZ.getSecond();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LJIILJJIL(Music music) {
        return C630310Ont.LIZJ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILL(String str) {
        if (C636090OxD.LIZ()) {
            C584710MwX.LIZJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIJ(Aweme aweme) {
        if (aweme != null) {
            C1524805y2.LIZ(new AwS410S0200000_9(this, aweme, 52));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIL(Music music) {
        if (music != null && ((MDPSquarePreloadABSwitchConfig) C635970Ox1.LIZIZ.getValue()).enable && C636090OxD.LIZ() && music.getUserCount() <= ((MdpShowSquareABSwitchConfig) C636090OxD.LIZIZ.getValue()).requestThreshold) {
            C636120OxG.LIZ.getClass();
            C636120OxG.LIZLLL.LIZJ(1, "meet_square_preload");
            C635890Owt c635890Owt = C635890Owt.LIZ;
            final String idStr = music.getIdStr();
            c635890Owt.getClass();
            if (idStr != null && idStr.length() != 0) {
                AtomicReference<C05XL<MusicAwemeList>> atomicReference = C635890Owt.LIZJ;
                if (atomicReference.get() == null) {
                    final C099F c099fLIZIZ = C090F.LIZIZ();
                    while (!atomicReference.compareAndSet(null, c099fLIZIZ)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    C635890Owt.LIZIZ.set(new C635950Owz(idStr, 0L, 20, System.currentTimeMillis(), null));
                    C1401550mZl c1401550mZl = C1401550mZl.LIZ;
                    InterfaceC635960Ox0<MusicAwemeList> interfaceC635960Ox0 = new InterfaceC635960Ox0<MusicAwemeList>() { // from class: X.0Ows
                        public final /* synthetic */ long LIZIZ = 0;
                        public final /* synthetic */ int LIZJ = 20;

                        @Override // X.InterfaceC635960Ox0
                        public final void LIZ(MusicAwemeList musicAwemeList) {
                            C635890Owt.LIZIZ.set(new C635950Owz(idStr, this.LIZIZ, this.LIZJ, System.currentTimeMillis(), musicAwemeList));
                            c099fLIZIZ.LJIIZILJ(musicAwemeList);
                            C635890Owt.LIZJ.set(null);
                        }

                        @Override // X.InterfaceC635960Ox0
                        public final void onFailed(int i, String str, String str2) {
                            c099fLIZIZ.LJIIZILJ(null);
                            C635890Owt.LIZJ.set(null);
                        }
                    };
                    c1401550mZl.getClass();
                    C1401550mZl.LIZ(idStr, 0L, 20, interfaceC635960Ox0);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LJJ(Music music) {
        return C630310Ont.LJ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZJ(FetchSimilarMusicOption fetchSimilarMusicOption, IFetchSimilarMusicCallback iFetchSimilarMusicCallback) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1165300gQi(fetchSimilarMusicOption, iFetchSimilarMusicCallback, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZLLL(Bundle bundle, FragmentManager fragmentManager) {
        ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment = new ArtistProfileTuxSheetFragment();
        artistProfileTuxSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = artistProfileTuxSheetFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "ArtistProfileTuxSheetFragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final Pair<String, String> LJIIIIZZ(Context context, Music music) {
        return C1398280mUU.LJFF(context, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LJIJJLI(View view, String str) {
        IMDPMobAbility iMDPMobAbility;
        if (view != null && (iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null)) != null) {
            if (iMDPMobAbility.G92(str)) {
                return true;
            }
            iMDPMobAbility.zb1(str);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILLIIL(long j, String str, String str2) {
        if (C636090OxD.LIZ()) {
            C584710MwX.LIZIZ(Integer.valueOf((int) j), str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIJJ(LifecycleOwner lifecycleOwner, C19EG c19eg, MusicModel musicModel, String str, String str2) {
        MusicRecordService musicRecordService = new MusicRecordService();
        Boolean bool = Boolean.TRUE;
        musicRecordService.startRecord(lifecycleOwner, c19eg, musicModel, "", "", null, 0, true, "", 2, "single_song", "single_song", str, bool, "feature_video_page", Boolean.FALSE, bool, str2, "feature_video_page", null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIIZILJ(String str, final int i, final TreeMap treeMap, String str2, String str3, MusicAwemeListRequestModel musicAwemeListRequestModel) {
        if (C297090Bkh.LIZ()) {
            C632130Oqp.LIZ.getClass();
            if (str.length() > 0 && !Intrinsics.LJFF(C632130Oqp.LIZIZ, str)) {
                C632130Oqp.LIZIZ = str;
                if (str2 != null) {
                    C632130Oqp.LIZJ = str2;
                }
                C632130Oqp.LIZLLL = null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C632130Oqp.LIZJ);
                sbLIZ.append("_detail");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C632130Oqp.LJ = C799570VYd.LJFF(false).submit(new Callable() { // from class: X.0Ol7
                    public final /* synthetic */ int LL = 0;

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MusicDetail musicDetailLIZIZ;
                        LogPbBean logPbBean;
                        Music music;
                        Music music2;
                        Music music3;
                        Music music4;
                        C1C7U.LIZ("MDPPreloadHelper@3678.executeMusicDetailPreload$1");
                        C632130Oqp c632130Oqp = C632130Oqp.LIZ;
                        int i2 = this.LL;
                        int i3 = i;
                        TreeMap<String, String> treeMap2 = treeMap;
                        c632130Oqp.getClass();
                        String imprId = null;
                        try {
                            musicDetailLIZIZ = MusicDetailApi.LIZIZ(i2, i3, C632130Oqp.LIZIZ, treeMap2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            musicDetailLIZIZ = null;
                        }
                        C1401100mZ2 c1401100mZ2 = C1401100mZ2.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("request_music_detail-->musicName:");
                        sbLIZ2.append((musicDetailLIZIZ == null || (music4 = musicDetailLIZIZ.music) == null) ? null : music4.getMusicName());
                        sbLIZ2.append(" music_id:");
                        sbLIZ2.append((musicDetailLIZIZ == null || (music3 = musicDetailLIZIZ.music) == null) ? null : music3.getIdStr());
                        sbLIZ2.append(" music_status:");
                        sbLIZ2.append((musicDetailLIZIZ == null || (music2 = musicDetailLIZIZ.music) == null) ? null : Integer.valueOf(music2.getMusicStatus()));
                        sbLIZ2.append(" available:");
                        sbLIZ2.append((musicDetailLIZIZ == null || (music = musicDetailLIZIZ.music) == null) ? null : Boolean.valueOf(music.available()));
                        sbLIZ2.append(" logId:");
                        if (musicDetailLIZIZ != null && (logPbBean = musicDetailLIZIZ.logPb) != null) {
                            imprId = logPbBean.getImprId();
                        }
                        sbLIZ2.append(imprId);
                        C201955140j.LJIILJJIL(c1401100mZ2, C2188811AlT.LIZIZ(sbLIZ2));
                        C1C7U.LIZIZ("MDPPreloadHelper@3678.executeMusicDetailPreload$1");
                        return musicDetailLIZIZ;
                    }
                });
                C799570VYd.LJFF(false).submit(new ARunnableS5S1000000_9(strLIZIZ, 0));
                C632130Oqp.LJFF = null;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C632130Oqp.LIZJ);
                sbLIZ2.append("_list");
                final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                C632130Oqp.LJI = C799570VYd.LJFF(false).submit(new ACallableS62S1100000_9(musicAwemeListRequestModel, str3, 2));
                C799570VYd.LJFF(false).submit(new Runnable() { // from class: X.0Ol6
                    public final /* synthetic */ boolean LL = true;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MDPPreloadHelper@3678.executeListPreload$3");
                        try {
                            Future<MusicAwemeList> future = C632130Oqp.LJI;
                            C632130Oqp.LJFF = future != null ? future.get() : null;
                            if (this.LL && C306590C0b.LIZ() > 0) {
                                CacheManager cacheManager = CacheManager.LIZ;
                                String str4 = strLIZIZ2;
                                MusicAwemeList musicAwemeList = C632130Oqp.LJFF;
                                cacheManager.getClass();
                                C0CNO.LIZ(C15O7.LJI, new AwS158S1100000_9(str4, musicAwemeList, 18));
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MDPPreloadHelper@3678.executeListPreload$3");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIIL(FragmentManager fragmentManager, MusicFusion musicFusion, String str, String str2, String str3, String str4, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, AwS387S0200000_21 awS387S0200000_21, boolean z) {
        MusicListPanelFragment.LLLJIL.getClass();
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        MusicListPanelFragment musicListPanelFragment = new MusicListPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "music_fusion", musicFusion);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        C786410Ut5.LJJJI("group_id", str3, bundle);
        C786410Ut5.LJJJI("stitched_clip_id", str4, bundle);
        musicListPanelFragment.setArguments(bundle);
        musicListPanelFragment.LLLI = mutableLiveData;
        musicListPanelFragment.LLLII = mutableLiveData2;
        musicListPanelFragment.LLLFZ = new AwS63S0210000_9(z, musicListPanelFragment, awS387S0200000_21, 2);
        c1390920mIc.LIZ.LLJJIJI = musicListPanelFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Owu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        tuxSheet.show(fragmentManager, "MusicListPanelFragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIJI(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, MusicStickerStruct musicStickerStruct, String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, String str8, String str9, String str10) {
        MusicRecordService musicRecordService = new MusicRecordService();
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        Boolean bool = Boolean.FALSE;
        musicRecordService.startRecord(lifecycleOwner, activity, musicModel, musicStickerStruct, str, str2, null, i, false, str3, 2, str4, str5, str6, boolValueOf, str7, boolValueOf2, bool, str8, str9, null, false, bool, null, str10);
    }
}
