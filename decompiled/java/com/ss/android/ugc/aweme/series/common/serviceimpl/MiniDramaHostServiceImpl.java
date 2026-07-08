package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C0CQT;
import X.C0RRR;
import X.C1227904rF;
import X.C1331660kl2;
import X.C1390920mIc;
import X.C1576890r8Z;
import X.C1613690s5v;
import X.C1850707Mr;
import X.C19EG;
import X.C2097608Jq;
import X.C2421209eE;
import X.C680080Qly;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC1620760sHK;
import X.EnumC1578890rBn;
import X.InterfaceC605070NoH;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.MiniDramaVideoPlaylistFragment;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.ss.android.ugc.aweme.spi.ISearchAppDiffProtocol;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaHostServiceImpl implements MiniDramaHostService {
    public final Map<EnumC1578890rBn, Integer> LIZIZ;
    public final Map<String, Integer> LIZJ;

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final Gson getGson() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    public MiniDramaHostServiceImpl() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC1578890rBn.BACK_ICON, Integer.valueOf(R.drawable.cff));
        linkedHashMap.put(EnumC1578890rBn.ICON_SERIES_FILL, Integer.valueOf(R.raw.icon_series_fill));
        linkedHashMap.put(EnumC1578890rBn.ICON_PLAY_FILL, Integer.valueOf(R.raw.icon_play_fill));
        linkedHashMap.put(EnumC1578890rBn.ICON_3PT_ARROW_TURN_UP_RIGHT, Integer.valueOf(R.raw.icon_3pt_arrow_turn_up_right));
        linkedHashMap.put(EnumC1578890rBn.ICON_3PT_BOOKMARK, Integer.valueOf(R.raw.icon_3pt_bookmark));
        linkedHashMap.put(EnumC1578890rBn.ICON_3PT_BOOKMARK_FILL, Integer.valueOf(R.raw.icon_3pt_bookmark_fill));
        linkedHashMap.put(EnumC1578890rBn.ICON_VERTICAL_BARS, Integer.valueOf(R.raw.icon_vertical_bars));
        linkedHashMap.put(EnumC1578890rBn.ICON_PEN_ON_DOC, Integer.valueOf(R.raw.icon_pen_on_doc));
        linkedHashMap.put(EnumC1578890rBn.ICON_PLAY, Integer.valueOf(R.raw.icon_play));
        linkedHashMap.put(EnumC1578890rBn.ILLUSTRATION_EMPTY_CAT_BOOK, Integer.valueOf(R.drawable.my));
        linkedHashMap.put(EnumC1578890rBn.ICON_CHEVRON_LEFT_SLIM_THIN_LTR, Integer.valueOf(R.raw.icon_chevron_left_slim_thin_ltr));
        linkedHashMap.put(EnumC1578890rBn.ICON_CHEVRON_RIGHT_SLIM_THIN_LTR, Integer.valueOf(R.raw.icon_chevron_right_slim_thin_ltr));
        linkedHashMap.put(EnumC1578890rBn.ICON_FIRE_3_FILL, Integer.valueOf(R.raw.icon_fire_3_fill));
        linkedHashMap.put(EnumC1578890rBn.ICON_MISC_FILL, Integer.valueOf(R.raw.icon_misc_fill));
        linkedHashMap.put(EnumC1578890rBn.ICON_SPARKLE_RIGHT_DOWN_SPARKLE, Integer.valueOf(R.raw.icon_sparkle_right_down_sparkle));
        linkedHashMap.put(EnumC1578890rBn.ICON_WATCH_HISTORY, Integer.valueOf(R.raw.icon_watch_history));
        linkedHashMap.put(EnumC1578890rBn.ICON_UNLOCK, Integer.valueOf(R.raw.icon_unlock));
        this.LIZIZ = linkedHashMap;
        this.LIZJ = C2097608Jq.LJIIIIZZ(new Pair("Icon: Icon/Misc_Fill", Integer.valueOf(R.attr.cv)), new Pair("Icon: Icon/Sparkle_Right_Down_Sparkle", Integer.valueOf(R.attr.dd)), new Pair("Icon: Icon/Fire_3_Fill", Integer.valueOf(R.attr.zs)));
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final Aweme LJ() {
        C19EG c19eg;
        Activity activityLIZ = C2421209eE.LIZ();
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
            return null;
        }
        return C680080Qly.LIZIZ(c19eg).LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final Map<EnumC1578890rBn, Integer> LJFF() {
        return this.LIZIZ;
    }

    public final Map<String, Integer> LJIIJJI() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final <T> T LIZLLL(Class<T> cls) {
        return (T) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(cls);
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final void LJII(Context context) {
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && iSeriesFeedServiceLIZIZ.LIZLLL() != null) {
            C1576890r8Z.LIZ(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final int LJIIIZ(String str) {
        Integer num;
        if (str != null && (num = LJIIJJI().get(str)) != null) {
            return num.intValue();
        }
        return R.attr.a1h;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final boolean LJIIJ(C19EG c19eg) {
        int iHashCode;
        int i = SeriesInnerFeedActivity.LLJ;
        if (c19eg != null) {
            iHashCode = c19eg.hashCode();
        } else {
            iHashCode = 0;
        }
        if (i != iHashCode) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final void LIZIZ(Context context, String str) {
        ICommerceCommonService iCommerceCommonService = (ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class);
        if (iCommerceCommonService != null) {
            iCommerceCommonService.LIZIZ(context, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final void LIZJ(Context context, Aweme aweme) {
        ISearchAppDiffProtocol.LIZ.getClass();
        C1850707Mr.LIZIZ.getValue().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final TuxSheet LJIIIIZZ(FragmentManager fragmentManager, C1613690s5v c1613690s5v, AwS568S0100000_24 awS568S0100000_24) {
        String str = MiniDramaVideoPlaylistFragment._pnsPageId;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "video_playlist_sheet_params", c1613690s5v);
        MiniDramaVideoPlaylistFragment miniDramaVideoPlaylistFragment = new MiniDramaVideoPlaylistFragment();
        miniDramaVideoPlaylistFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = miniDramaVideoPlaylistFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1620760sHK(awS568S0100000_24, 4);
        tuxSheet.LLJLLL = false;
        tuxSheet.show(fragmentManager, "video_playlist_sheet");
        return tuxSheet;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaHostService
    public final void LJI(String str, final AwS425S0200000_24 awS425S0200000_24, final AwS425S0200000_24 awS425S0200000_242, final AwS233S0300000_24 awS233S0300000_24) {
        C1331660kl2.LJI(UriProtector.parse(str)).LJIILLIIL(new InterfaceC605070NoH() { // from class: X.0rC5
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                awS425S0200000_242.invoke();
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                if (file != null) {
                    awS233S0300000_24.invoke(BitmapUtils.decodeBitmap(file));
                } else {
                    awS425S0200000_24.invoke();
                }
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                awS425S0200000_24.invoke();
            }
        });
    }
}
