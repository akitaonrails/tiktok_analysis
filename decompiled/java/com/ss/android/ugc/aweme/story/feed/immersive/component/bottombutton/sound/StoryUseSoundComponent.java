package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.sound;

import X.C01GW;
import X.C0Q1Q;
import X.C1212100heC;
import X.C123100dR;
import X.C1388190mED;
import X.C1399580mWa;
import X.C13LP;
import X.C1449410nox;
import X.C1449430noz;
import X.C1458960o4M;
import X.C15L7;
import X.C1850180yFM;
import X.C19EG;
import X.C1ER1;
import X.C2095008Iq;
import X.C2189821An6;
import X.C2327809Ae;
import X.C2344009Gk;
import X.C298270Bmb;
import X.C452501pT;
import X.C706480RnS;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1004190cEr;
import X.ProgressDialogC1399780mWu;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryUseSoundComponent extends BaseCellSlotComponent<StoryUseSoundComponent> {
    public static final /* synthetic */ int LLLFFI = 0;
    public LinearLayout LLJLLIL;
    public ProgressDialogC1399780mWu LLJZIJLIL;
    public MusicModel LLL;
    public boolean LLLF;
    public String LLJLLL = "";
    public final Boolean LLJZ = Boolean.TRUE;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 829));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdc;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 828);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_use_sound_component", true, awS565S0100000_21);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (LinearLayout) view.findViewById(R.id.w_g);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Bundle arguments;
        String string;
        VideoItemParams videoItemParams2 = videoItemParams;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null && (string = arguments.getString("previous_page")) != null) {
            this.LLJLLL = string;
        }
        LinearLayout linearLayout = this.LLJLLIL;
        if (linearLayout != null) {
            C786410Ut5.I7(new AkS59S0200000_21(videoItemParams2, this, 6), linearLayout);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ep(VideoItemParams videoItemParams, Aweme aweme, Music music, String str, String str2, String str3, boolean z, final boolean z2) {
        int videoLength;
        boolean z3;
        int i;
        String str4;
        boolean z4;
        boolean z5;
        boolean z6;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer numLJIIJJI;
        String str9;
        Intent intent;
        InterfaceC1004190cEr interfaceC1004190cEr;
        List listLJJLIIIJILLIZJL;
        C2189821An6 c2189821An6;
        String strIsSameMusicSupplyDetailPage;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        String musicSelectedFrom;
        String stickerIDs = aweme.getStickerIDs();
        if (aweme.getVideo() != null) {
            videoLength = aweme.getVideo().getVideoLength();
        } else {
            videoLength = 0;
        }
        if (aweme.getMusicBeginTime() < aweme.getMusicEndTime() && aweme.getMusicBeginTime() >= 0) {
            music.setMusicBeginTime(aweme.getMusicBeginTime());
            music.setMusicEndTime(aweme.getMusicEndTime());
        }
        MusicRecordService musicRecordService = new MusicRecordService();
        String strLIZIZ = C1212100heC.LIZIZ(aweme);
        if (C1399580mWa.LIZ() && ((musicSelectedFrom = music.getMusicSelectedFrom()) == null || musicSelectedFrom.length() == 0)) {
            music.setMusicSelectedFrom(str2);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Context context = getContext();
        Activity activityLIZ = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        }
        MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
        C15L7 c15l7 = new C15L7() { // from class: X.0mVY
            @Override // X.C15L7
            public final void LIZ() {
            }

            @Override // X.C15L7
            public final void LIZLLL() {
            }

            @Override // X.C15L7
            public final /* synthetic */ void LJFF(MusicModel musicModel, Effect effect) {
            }

            @Override // X.C15L7
            public final void LIZJ() {
                ((Handler) this.LIZ.LLLFF.getValue()).removeCallbacksAndMessages(null);
                ProgressDialogC1399780mWu progressDialogC1399780mWu = this.LIZ.LLJZIJLIL;
                if (progressDialogC1399780mWu != null) {
                    C0FNV.LIZ(progressDialogC1399780mWu);
                }
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }

            @Override // X.C15L7
            public final void LJI() {
                ProgressDialogC1399780mWu progressDialogC1399780mWu = this.LIZ.LLJZIJLIL;
                if (progressDialogC1399780mWu != null) {
                    C0FNV.LIZ(progressDialogC1399780mWu);
                }
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                ((Handler) this.LIZ.LLLFF.getValue()).removeCallbacksAndMessages(null);
            }

            @Override // X.C15L7
            public final boolean LJ() {
                return z2;
            }
        };
        String str10 = this.LLJLLL;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        musicRecordService.startRecord(fragmentLJI, activityLIZ, musicModelConvertToMusicModel, null, stickerIDs, "", c15l7, videoLength, z, str10, 0, str, str2, str3, bool, "single_song", bool2, bool, "story_btn", null, null, !Intrinsics.LJFF(this.LLJZ, bool), bool2, null, C298270Bmb.LIZ(), strLIZIZ, null, null);
        if (music.getCollectStatus() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1458960o4M.LIZJ(z3);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "story_btn");
        String str11 = "";
        if (!TextUtils.isEmpty("")) {
            i = 0;
            str4 = ((String[]) a0.LJJLIIIJILLIZJL("", new String[]{","}, 0, 6).toArray(new String[0]))[0];
        } else {
            i = 0;
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("giphy_id", str4);
        c2344009Gk.LIZJ(C1458960o4M.LIZ(), "favorite_scene");
        String originVolume = aweme.getOriginVolume();
        if (originVolume != null && C123100dR.LIZ(originVolume)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && originVolume != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(originVolume)) != null && fLJIIIIZZ2.floatValue() > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        String musicVolume = aweme.getMusicVolume();
        if (musicVolume != null && C123100dR.LIZ(musicVolume) && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(musicVolume)) != null && fLJIIIIZZ.floatValue() > 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        String str12 = "1";
        if (z5 && z6) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_original_and_added_sound", str5);
        if (z5) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("original_sound_volume", str6);
        if (z6) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("added_sound_volume", str7);
        c2344009Gk.LIZJ(1, "after_consumption ");
        if (music.isFollowerTagVisible) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_following_tag ", str8);
        if (!music.isFriendTagVisible) {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_friend_tag", str12);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams("music_detail", this.LLJLLL);
        C0Q1Q.LIZ(c2344009Gk, mapFetchSearchParams);
        Map<String, String> mapLJJZZI = c1er1.LJJZZI(mapFetchSearchParams);
        if (mapLJJZZI != null) {
            c2344009Gk.LJII(mapLJJZZI);
        }
        c2344009Gk.LIZJ(aweme.aigcInfo.getAIGCLabelType(), "from_aigc_theme_status");
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null && (strIsSameMusicSupplyDetailPage = c2189821An6.isSameMusicSupplyDetailPage()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(strIsSameMusicSupplyDetailPage);
        } else {
            numLJIIJJI = null;
        }
        c2344009Gk.LJ(numLJIIJJI, "is_same_music_supply_detail_page");
        if (stickerIDs != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stickerIDs, new String[]{","}, i, 6)) != null) {
            str9 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
        } else {
            str9 = null;
        }
        c2344009Gk.LJFF("prop_id", str9);
        c2344009Gk.LJFF("prop_resource_id", strLIZIZ);
        FromGroupPropService fromGroupPropService = (FromGroupPropService) PluggableExtentionKt.pluggableSpi$default(FromGroupPropService.class, i, i, i, 14, null);
        if (fromGroupPropService != null) {
            c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
            c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
        }
        MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            intent = c19egLIZ.getIntent();
        } else {
            intent = null;
        }
        c2344009Gk.LIZJ(musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent, true), "is_from_followup_square_original_video");
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, i, i, i, 14, null);
        if (iRecordMobService != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            String strValueOf = String.valueOf(music.getId());
            if (str2 != null) {
                str11 = str2;
            }
            iRecordMobService.LIZLLL(new C1449410nox(str3, str, "single_song", aid, null, new C1449430noz(strValueOf, str11), null, null, 208), c2344009Gk.LIZ);
        }
        boolean z7 = i;
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, z7, z7, z7, 14, null);
        if (iCommerceMediaService != null && iCommerceMediaService.LIZLLL() && (interfaceC1004190cEr = (InterfaceC1004190cEr) PluggableExtentionKt.pluggableSpi$default(ICommerceMusicLogger.class, z7, z7, z7, 14, null)) != null) {
            interfaceC1004190cEr.withContext((Object) null);
            C1850180yFM.LIZ.getClass();
            interfaceC1004190cEr.log(C1850180yFM.LJFF, new AwS606S0100000_27(this, 182));
        }
    }
}
