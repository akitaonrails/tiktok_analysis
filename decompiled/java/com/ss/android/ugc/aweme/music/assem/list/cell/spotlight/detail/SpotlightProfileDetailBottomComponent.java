package com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.detail;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P0X;
import X.C0P2V;
import X.C0P4Y;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C197039127h;
import X.C19EG;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C580830MqH;
import X.C608360Nta;
import X.C631230OpN;
import X.C633020OsG;
import X.C634020Ots;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC631120OpC;
import X.InterfaceC20499515Jh;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.detail.vm.SpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.DspSheetType;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SpotlightProfileDetailBottomComponent extends BasePanelUIComponent implements IDetailBottomProtocol, InterfaceC20499515Jh {
    public C197039127h LLJIJIL;
    public C197039127h LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1113));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1116));
    public final C736950SvV LLJJ;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public final IFeedPanelPlatformAbility Ho() {
        return (IFeedPanelPlatformAbility) this.LLJILJILJ.getValue();
    }

    public final SpotlightProfileDetailShareVM Jo() {
        return (SpotlightProfileDetailShareVM) this.LLJJ.getValue();
    }

    public SpotlightProfileDetailBottomComponent() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1115);
        this.LLJJ = new C736950SvV(C13LE.LIZ(SpotlightProfileDetailShareVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(452), new AwS553S0100000_9((AbstractC738140SxQ) this, 1114), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        Aweme awemeLJIIIIZZ;
        Music music;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityHo = Ho();
        if (iFeedPanelPlatformAbilityHo == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityHo.LJIIIIZZ()) == null || (music = awemeLJIIIIZZ.getMusic()) == null) {
            return null;
        }
        return music.convertToMusicModel();
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return getPanelContext().LIZ();
    }

    public final void No() {
        Aweme awemeLJIIIIZZ;
        Music music;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityHo = Ho();
        if (iFeedPanelPlatformAbilityHo == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityHo.LJIIIIZZ()) == null || (music = awemeLJIIIIZZ.getMusic()) == null) {
            return;
        }
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
        if (dspPlatformLJIILJJIL == DspPlatform.UNKNOWN) {
            C197039127h c197039127h = this.LLJILJIL;
            if (c197039127h != null) {
                c197039127h.setText(2131824948);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            c197039127h2.setText(C0P2V.LIZIZ(dspPlatformLJIILJJIL));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
        EventBus.LIZLLL().LJIJJ(this);
        SpotlightProfileDetailShareVM spotlightProfileDetailShareVMJo = Jo();
        spotlightProfileDetailShareVMJo.getClass();
        spotlightProfileDetailShareVMJo.LLILZLL = new MusicDownloadPlayHelper(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        Jo().LLILZLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0P4Y(this, 4));
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return this.LLILZ;
    }

    public final LogData Go(Music music) {
        String str;
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.FEED_PROFILE_SPOTLIGHT;
        C0P0X c0p0x = C0P0X.SMALL;
        if (Jo().LLIZLLLIL) {
            str = "profile_music_tab_personal";
        } else {
            str = "profile_music_tab_others";
        }
        return new LogData(dspPlatformLJIILJJIL, enumC631120OpC, c0p0x, "spotlight_video_play", str, MusicETBusinessModule.MUSIC_TAB, null, music, null, null, "", "", CardStruct.IStatusCode.DEFAULT, null, null, new TTToDspLogExtra(), "", null, null, false, 0, null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        No();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        No();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ego, viewGroup, false);
        this.LLJIJIL = (C197039127h) viewTd.findViewById(R.id.z17);
        this.LLJILJIL = (C197039127h) viewTd.findViewById(R.id.z16);
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C631230OpN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(8)));
        }
        C197039127h c197039127h2 = this.LLJIJIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 15, 42), c197039127h2);
        }
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 != null) {
            C631230OpN.LIZIZ(c197039127h3, Float.valueOf(C418440Gaw.LIZIZ(8)));
        }
        C197039127h c197039127h4 = this.LLJILJIL;
        if (c197039127h4 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 16, 42), c197039127h4);
        }
        return viewTd;
    }

    public final void Lo(AddSongContextData addSongContextData, List<TT2DSPSongInfo> list) {
        C633020OsG.LIZIZ.LJJZ(C724240Sb0.LJI(this), addSongContextData, DspSheetType.SELECT_DSP, list, null, null);
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
        Activity activityLLILLL;
        if (musicModel != null && str != null && str2 != null && (activityLLILLL = LLILLL()) != null) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2);
            builder.musicPath(str);
            builder.shootWay("spotlight");
            builder.shootFrom("spotlight_video_play");
            String str3 = Jo().LLJ;
            if (str3 != null) {
                builder.creationId(str3);
            }
            String str4 = Jo().LLJI;
            if (str4 != null) {
                builder.groupId(str4);
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("spotlight", new C580830MqH((C19EG) activityLLILLL, builder.build(), musicModel, 4));
        }
    }
}
