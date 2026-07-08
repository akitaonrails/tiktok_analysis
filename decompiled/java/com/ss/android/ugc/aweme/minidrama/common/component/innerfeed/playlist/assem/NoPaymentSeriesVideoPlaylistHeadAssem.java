package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem;

import X.C01GW;
import X.C1201604n0;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1559260qg8;
import X.C1573840r3e;
import X.C1612860s4a;
import X.C1613210s59;
import X.C19EG;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.InterfaceC1208804oA;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesVideoPlaylistHeadAssem;
import com.ss.android.ugc.aweme.service.IPaidSeriesBlockService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class NoPaymentSeriesVideoPlaylistHeadAssem extends UIContentAssem implements InterfaceC1208804oA {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1612860s4a.class, "series_video_playlist_hierarchy_data"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 735));

    public final CollectionDetailModel Go() {
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            return miniDramaPlayListServiceLIZ.cj(Ho().LL);
        }
        return null;
    }

    public final C1612860s4a Ho() {
        return (C1612860s4a) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IPaidSeriesBlockService.LIZ.getClass();
        IPaidSeriesBlockService iPaidSeriesBlockService = C1201604n0.LIZIZ;
        if (iPaidSeriesBlockService != null) {
            iPaidSeriesBlockService.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC1208804oA
    public final void Q7(String str) {
        String uid;
        CollectionDetailModel collectionDetailModelGo;
        User user;
        User user2;
        CollectionDetailModel collectionDetailModelGo2 = Go();
        if (collectionDetailModelGo2 != null && (user2 = collectionDetailModelGo2.collectionCreator) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        if (TextUtils.equals(str, uid) && (collectionDetailModelGo = Go()) != null && (user = collectionDetailModelGo.collectionCreator) != null) {
            user.isBlock = true;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean zLJFF;
        String str;
        super.onViewCreated(view);
        IPaidSeriesBlockService.LIZ.getClass();
        IPaidSeriesBlockService iPaidSeriesBlockService = C1201604n0.LIZIZ;
        if (iPaidSeriesBlockService != null) {
            iPaidSeriesBlockService.LIZ(this);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1747));
            tuxNavBar.LIZIZ(c1251150ifB);
            CollectionDetailModel collectionDetailModelGo = Go();
            if (collectionDetailModelGo != null && (str = collectionDetailModelGo.collectionName) != null) {
                TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLJ.getValue();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = str;
                if (C1573840r3e.LIZ(collectionDetailModelGo.episodePanelSubtitle)) {
                    String str2 = collectionDetailModelGo.episodePanelSubtitle;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1250250idj.LIZLLL = str2;
                }
                tuxNavBar2.LJIJJ(c1250250idj);
            }
            SeriesVideoPlaylistHeadAssem seriesVideoPlaylistHeadAssem = (SeriesVideoPlaylistHeadAssem) this;
            CollectionDetailModel collectionDetailModelGo2 = seriesVideoPlaylistHeadAssem.Go();
            if (collectionDetailModelGo2 != null) {
                zLJFF = Intrinsics.LJFF(collectionDetailModelGo2.shouldHideShareButton, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                TuxNavBar tuxNavBar3 = (TuxNavBar) seriesVideoPlaylistHeadAssem.LLJ.getValue();
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_3pt_arrow_turn_up_right;
                c1251150ifB2.LIZIZ = "share_collection";
                c1251150ifB2.LJI = true;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS425S0200000_24(c19egLIZ, seriesVideoPlaylistHeadAssem, 66));
                tuxNavBar3.LIZ(c1251150ifB2);
            }
            CollectionDetailModel collectionDetailModelGo3 = seriesVideoPlaylistHeadAssem.Go();
            if (collectionDetailModelGo3 == null || !Intrinsics.LJFF(collectionDetailModelGo3.shouldHideReportButton, Boolean.TRUE)) {
                TuxNavBar tuxNavBar4 = (TuxNavBar) seriesVideoPlaylistHeadAssem.LLJ.getValue();
                C1251150ifB c1251150ifB3 = new C1251150ifB();
                c1251150ifB3.LIZLLL();
                c1251150ifB3.LIZJ = R.raw.icon_ellipsis_horizontal;
                c1251150ifB3.LIZIZ = "paid_collection_menu";
                c1251150ifB3.LJI = true;
                c1251150ifB3.LIZJ(new AwS568S0100000_24((NoPaymentSeriesVideoPlaylistHeadAssem) seriesVideoPlaylistHeadAssem, 1746));
                tuxNavBar4.LIZ(c1251150ifB3);
            }
        }
    }
}
