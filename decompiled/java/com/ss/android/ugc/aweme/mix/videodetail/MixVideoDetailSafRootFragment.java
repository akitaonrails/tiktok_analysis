package com.ss.android.ugc.aweme.mix.videodetail;

import X.C1169150gWv;
import X.C1169230gX3;
import X.C1169240gX4;
import X.C19EG;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C297010BkZ;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideoDetailSafRootFragment extends DetailSafRootFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWElISEpJis2HELIOSPCQlJWEeIT0aICs2JwEpPS46JBYtLx08JzEKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment
    public final DetailFragment mS(C2189821An6 c2189821An6) {
        MixVideoDetailActivity mixVideoDetailActivity;
        C1169240gX4 c1169240gX4;
        String mAid;
        String viewModelKey;
        String mVideoFrom;
        String mSecUid;
        String mUsrId;
        ConcurrentHashMap concurrentHashMap;
        String mixId;
        String enterGroupId;
        Long lLJIILIIL;
        Integer numLJIIJJI;
        String str;
        Integer numIsFromVideo;
        String str2;
        C19EG activity = getActivity();
        if ((activity instanceof MixVideoDetailActivity) && (mixVideoDetailActivity = (MixVideoDetailActivity) activity) != null) {
            Serializable serializableExtra = mixVideoDetailActivity.getIntent().getSerializableExtra("mix_video_list_params");
            if (serializableExtra instanceof C1169240gX4) {
                c1169240gX4 = (C1169240gX4) serializableExtra;
            } else {
                c1169240gX4 = null;
            }
            String str3 = "";
            if (c1169240gX4 == null) {
                C1169230gX3 c1169230gX3 = MixVideoDetailActivity.LLJI;
                Intent intent = mixVideoDetailActivity.getIntent();
                c1169230gX3.getClass();
                String strLIZJ = C1169230gX3.LIZJ(intent, "mix_id", "mixId");
                if (strLIZJ == null) {
                    c1169240gX4 = null;
                } else {
                    c1169240gX4 = new C1169240gX4();
                    c1169240gX4.setMixId(strLIZJ);
                    c1169240gX4.setMUsrId(C1169230gX3.LIZJ(intent, "uid", "user_id"));
                    c1169240gX4.setMSecUid(C1169230gX3.LIZJ(intent, "sec_uid", "secUid"));
                    c1169240gX4.setMAid(C1169230gX3.LIZJ(intent, FollowStatusChangeMethod.PARAM_UID, "aid", "aweme_id"));
                    c1169240gX4.setMVideoFrom(C1169230gX3.LIZJ(intent, "video_from", "video_from", "enter_from"));
                    c1169240gX4.setMNeedShowDialog(C1169230gX3.LIZ(c1169230gX3, intent, "need_show_dialog"));
                    String strLIZJ2 = C1169230gX3.LIZJ(intent, "key_playlist_from_group_id", "enter_group_id");
                    if (strLIZJ2 == null) {
                        strLIZJ2 = "";
                    }
                    c1169240gX4.setEnterGroupId(strLIZJ2);
                    c1169240gX4.setPreviousPage(C1169230gX3.LIZJ(intent, "key_playlist_previous_page", "playlist_previous_page", "previous_page"));
                    c1169240gX4.setEnterMethod(C1169230gX3.LIZJ(intent, "enter_method"));
                    String strLIZJ3 = C1169230gX3.LIZJ(intent, "enter_from");
                    if (strLIZJ3 == null && (strLIZJ3 = C1169230gX3.LIZJ(intent, "event_type")) == null && (strLIZJ3 = C1169230gX3.LIZJ(intent, "enter_from")) == null) {
                        strLIZJ3 = "create_playlist";
                    }
                    c1169240gX4.setMEventType(strLIZJ3);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Object objLIZIZ = C1169230gX3.LIZIZ(intent, "key_preload_page_start_time");
                    if ((objLIZIZ instanceof Long) || (objLIZIZ instanceof Number)) {
                        jElapsedRealtime = ((Number) objLIZIZ).longValue();
                    } else if ((objLIZIZ instanceof String) && (lLJIILIIL = C2095008Iq.LJIILIIL((String) objLIZIZ)) != null) {
                        jElapsedRealtime = lLJIILIIL.longValue();
                    }
                    c1169240gX4.setPageStartTime(jElapsedRealtime);
                    c1169240gX4.setViewModelKey(strLIZJ);
                    c1169240gX4.setPlayNext(C1169230gX3.LIZ(c1169230gX3, intent, "key_play_next"));
                    String strLIZJ4 = C1169230gX3.LIZJ(intent, "playlist_search_id", "search_id");
                    Object objLIZIZ2 = C1169230gX3.LIZIZ(intent, (String[]) Arrays.copyOf(new String[]{"is_from_video"}, 1));
                    if (objLIZIZ2 instanceof Integer) {
                        numLJIIJJI = (Integer) objLIZIZ2;
                    } else if (objLIZIZ2 instanceof Number) {
                        numLJIIJJI = Integer.valueOf(((Number) objLIZIZ2).intValue());
                    } else if (objLIZIZ2 instanceof String) {
                        numLJIIJJI = C2095008Iq.LJIIJJI((String) objLIZIZ2);
                    } else {
                        numLJIIJJI = null;
                    }
                    String strLIZJ5 = C1169230gX3.LIZJ(intent, "key_search_type", "search_type");
                    if (strLIZJ4 != null || numLJIIJJI != null || strLIZJ5 != null) {
                        c1169240gX4.setSearchParam(new C1169150gWv(strLIZJ4, numLJIIJJI, strLIZJ5, 0, "", null));
                    }
                    Intent intent2 = mixVideoDetailActivity.getIntent();
                    intent2.putExtra("video_from", c1169240gX4.getMVideoFrom());
                    intent2.putExtra("enter_from", c1169240gX4.getMEventType());
                    intent2.putExtra("mix_video_list_params", c1169240gX4);
                    C1169150gWv searchParam = c1169240gX4.getSearchParam();
                    if (searchParam != null) {
                        str = searchParam.searchId;
                    } else {
                        str = null;
                    }
                    intent2.putExtra("playlist_search_id", str);
                    C1169150gWv searchParam2 = c1169240gX4.getSearchParam();
                    if (searchParam2 != null) {
                        numIsFromVideo = searchParam2.isFromVideo();
                    } else {
                        numIsFromVideo = null;
                    }
                    intent2.putExtra("is_from_video", numIsFromVideo);
                    C1169150gWv searchParam3 = c1169240gX4.getSearchParam();
                    if (searchParam3 != null) {
                        str2 = searchParam3.searchType;
                    } else {
                        str2 = null;
                    }
                    intent2.putExtra("key_search_type", str2);
                    intent2.putExtra("key_playlist_previous_page", c1169240gX4.getPreviousPage());
                    intent2.putExtra("key_playlist_from_group_id", c1169240gX4.getEnterGroupId());
                }
            }
            ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
            if (c1169240gX4 == null || (mAid = c1169240gX4.getMAid()) == null) {
                mAid = "";
            }
            iCommercePageTrackingServiceLIZLLL.LIZIZ(mAid);
            if (c1169240gX4 == null || (viewModelKey = c1169240gX4.getViewModelKey()) == null) {
                viewModelKey = "";
            }
            mixVideoDetailActivity.LLJ = viewModelKey;
            AssemVMLazy assemVMLazy = mixVideoDetailActivity.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MixVideoDetailActivity.LLJIJIL;
            assemVMLazy.getValue().setStateImmediate(new AwS69S1000000_18(mixVideoDetailActivity.LLJ, 12));
            if (c1169240gX4 == null || (mVideoFrom = c1169240gX4.getMVideoFrom()) == null) {
                mVideoFrom = "";
            }
            c2189821An6.setFrom(mVideoFrom);
            if (c1169240gX4 == null || (mSecUid = c1169240gX4.getMSecUid()) == null) {
                mSecUid = "";
            }
            c2189821An6.setSecUid(mSecUid);
            if (c1169240gX4 == null || (mUsrId = c1169240gX4.getMUsrId()) == null) {
                mUsrId = "";
            }
            c2189821An6.setUid(mUsrId);
            if (c1169240gX4 != null && (enterGroupId = c1169240gX4.getEnterGroupId()) != null) {
                str3 = enterGroupId;
            }
            c2189821An6.setPlaylistEnterGroupId(str3);
            Map<String, String> extra = c2189821An6.getExtra();
            if ((extra instanceof ConcurrentHashMap) && (concurrentHashMap = (ConcurrentHashMap) extra) != null) {
                MixVideoDetailActivity.LLJI.getClass();
                String strLIZJ6 = C1169230gX3.LIZJ(mixVideoDetailActivity.getIntent(), "playlist_session_id");
                if (strLIZJ6 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (c1169240gX4 != null) {
                        mixId = c1169240gX4.getMixId();
                    } else {
                        mixId = null;
                    }
                    sbLIZ.append(mixId);
                    sbLIZ.append(System.currentTimeMillis());
                    strLIZJ6 = String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
                }
                concurrentHashMap.put("playlist_session_id", strLIZJ6);
            }
            long pageStartTime = -1;
            if (!C297010BkZ.LIZ()) {
                MixVideosViewModel mixVideosViewModelLLLLZLL = mixVideoDetailActivity.LLLLZLL();
                if (c1169240gX4 != null) {
                    pageStartTime = c1169240gX4.getPageStartTime();
                }
                mixVideosViewModelLLLLZLL.LLJJ = pageStartTime;
                if (c1169240gX4 != null) {
                    mixVideoDetailActivity.LLLLZLL().LLJJIJIIJIL = c1169240gX4.getFromShare();
                    mixVideoDetailActivity.LLLLZLL().LLJJIJIL = c1169240gX4.getShowLast();
                    mixVideoDetailActivity.LLLLZLL().LLJJJ = c1169240gX4.getTotalVideoCount();
                    mixVideoDetailActivity.LLLLZLL().LLJJJJ = c1169240gX4.getSourceVideoId();
                    mixVideoDetailActivity.LLLLZLL().LLJJJJJIL = c1169240gX4.getSourceGroupId();
                    mixVideoDetailActivity.LLLLZLL().LLJJJJLIIL = c1169240gX4.getSourceAuthorId();
                }
            } else {
                PlaylistConsumptionViewModel playlistConsumptionViewModel = (PlaylistConsumptionViewModel) mixVideoDetailActivity.LLIZLLLIL.getValue();
                if (c1169240gX4 != null) {
                    pageStartTime = c1169240gX4.getPageStartTime();
                }
                playlistConsumptionViewModel.LLJILLL = pageStartTime;
                if (c1169240gX4 != null) {
                    ((PlaylistConsumptionViewModel) mixVideoDetailActivity.LLIZLLLIL.getValue()).LLJJ = c1169240gX4.getFromShare();
                    ((PlaylistConsumptionViewModel) mixVideoDetailActivity.LLIZLLLIL.getValue()).LLJJI = c1169240gX4.getShowLast();
                    ((PlaylistConsumptionViewModel) mixVideoDetailActivity.LLIZLLLIL.getValue()).LLJJIII = c1169240gX4.getTotalVideoCount();
                }
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "mix_video_list_params", c1169240gX4);
            C786410Ut5.LJJIZ(bundle, "feed_param", c2189821An6);
            MixVideoPlayFragment mixVideoPlayFragment = new MixVideoPlayFragment();
            mixVideoPlayFragment.setArguments(bundle);
            return mixVideoPlayFragment;
        }
        return null;
    }
}
