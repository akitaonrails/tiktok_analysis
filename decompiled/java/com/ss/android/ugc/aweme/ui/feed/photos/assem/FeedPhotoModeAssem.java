package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0N3Z;
import X.C0SKN;
import X.C0X35;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C696330RTb;
import X.C721220SQu;
import X.C723830SaL;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellBackgroundComponentAbility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotoModeAssem extends FeedVideoAssem {
    public final C696330RTb LLJLLIL;
    public final C01GW LLJLLL;

    public C19719912Dl kp() {
        return C13LE.LIZ(FeedPhotoSlideComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem
    /* JADX INFO: renamed from: hp */
    public final void tp(VideoItemParams videoItemParams) {
        CellBackgroundComponentAbility cellBackgroundComponentAbility;
        if (C0SKN.LIZIZ(videoItemParams) && (cellBackgroundComponentAbility = (CellBackgroundComponentAbility) this.LLJLLL.getValue()) != null) {
            cellBackgroundComponentAbility.SK1(false);
        }
        super.tp(videoItemParams);
        if (C721220SQu.LIZLLL(videoItemParams.getAweme())) {
            C723830SaL.LJ(this, C13LE.LIZ(PhotoFeedLivePhotoComponent.class), true, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0N3Z.LIZ.getClass();
        if (!C0N3Z.LJII && C0N3Z.LJIIIIZZ == 0) {
            C0N3Z.LJIIIIZZ = System.currentTimeMillis();
        }
        C0X35.LIZ("ui_to_video_photomode_assem_init", false);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 288));
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    public FeedPhotoModeAssem(BaseFeedPageParams baseFeedPageParams, Function0 function0, ConcurrentHashSet concurrentHashSet, C696330RTb c696330RTb) {
        super(baseFeedPageParams, function0, 6, concurrentHashSet);
        this.LLJLLIL = c696330RTb;
        this.LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1669));
    }
}
