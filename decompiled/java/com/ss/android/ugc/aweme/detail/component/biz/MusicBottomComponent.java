package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C0Q1Q;
import X.C1002190cBd;
import X.C1212100heC;
import X.C123100dR;
import X.C12ES;
import X.C1387620mDI;
import X.C1388190mED;
import X.C1398670mV7;
import X.C1399580mWa;
import X.C13LP;
import X.C1400500mY4;
import X.C1402130mah;
import X.C1449410nox;
import X.C1449430noz;
import X.C1458960o4M;
import X.C15L7;
import X.C1850180yFM;
import X.C1850190yFN;
import X.C19EG;
import X.C1ER1;
import X.C2095008Iq;
import X.C21459218yU;
import X.C2189821An6;
import X.C2327809Ae;
import X.C2344009Gk;
import X.C298270Bmb;
import X.C452501pT;
import X.C487280J9a;
import X.C589890NBr;
import X.C629940OnI;
import X.C724240Sb0;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC487330J9f;
import X.ProgressDialogC1399760mWs;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicBottomComponent extends ShootButtonBottomComponent implements InterfaceC487330J9f {
    public boolean LLILZLL;
    public Music LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public String LLJIJIL;
    public Long LLJILJIL;
    public View LLJILJILJ;
    public TextView LLJILLL;
    public C21459218yU LLJJ;
    public TuxIconView LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public ShootExtraData LLJJIJIIJIL;
    public MusicStickerStruct LLJJJ;
    public TtsVoiceInfo LLJJJJ;
    public ProgressDialogC1399760mWs LLJJJJJIL;
    public MusicModel LLJJJJLIIL;
    public boolean LLJJL;
    public Boolean LLJJIJIL = Boolean.TRUE;
    public final ICommerceMusicLogger LLJJJIL = (ICommerceMusicLogger) ServiceManager.get().getService(ICommerceMusicLogger.class);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 523));
    public final C589890NBr LLJL = new C589890NBr();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 522));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 524));
    public boolean LLJLL = true;

    public final IFeedPanelPlatformAbility so() {
        return (IFeedPanelPlatformAbility) this.LLJLIL.getValue();
    }

    public final void vo() {
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C21459218yU c21459218yU = this.LLJJ;
        if (c21459218yU != null) {
            C786410Ut5.C(c21459218yU, 8);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        TuxIconView tuxIconView = this.LLJJI;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view3 = this.LLJJIII;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = this.LLJJIJI;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = so();
        if (C1398670mV7.LIZ(iFeedPanelPlatformAbilitySo != null ? iFeedPanelPlatformAbilitySo.LJIIIIZZ() : null)) {
            return 2131829785;
        }
        C629940OnI c629940OnI = C629940OnI.LIZ;
        Music music = this.LLIZ;
        c629940OnI.getClass();
        return C629940OnI.LIZ(music) ? 2131848259 : 2131857974;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent, com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        Activity activityLIZ;
        super.onCreate();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable("feed_data_music");
        this.LLIZ = serializable instanceof Music ? (Music) serializable : null;
        this.LLILZLL = arguments.getBoolean("feed_data_is_ad", false);
        this.LLIZLLLIL = arguments.getString(FollowStatusChangeMethod.PARAM_UID);
        arguments.getString("feed_data_author_id");
        this.LLJIJIL = arguments.getString("previous_page", "");
        this.LLJ = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LLJJIJIIJIL = (ShootExtraData) arguments.getParcelable("extra_shoot_data");
        C1850190yFN.LIZ.getClass();
        C1002190cBd c1002190cBd = C1850190yFN.LJI;
        this.LLJILJIL = Long.valueOf(arguments.getLong(c1002190cBd.LIZ));
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            c2189821An6.setHideMusicText(true);
        }
        this.LLJJIJIL = Boolean.valueOf(arguments.getBoolean("music_data_from_cache", true));
        Serializable serializable2 = arguments.getSerializable("music_sticker_struct");
        this.LLJJJ = serializable2 instanceof MusicStickerStruct ? (MusicStickerStruct) serializable2 : null;
        this.LLJJJIL.withContext(this.LLIZ);
        Long l = this.LLJILJIL;
        if (l == null || l.longValue() != 0) {
            this.LLJJJIL.withParam(c1002190cBd, this.LLJILJIL);
        }
        this.LLJJJJ = (TtsVoiceInfo) arguments.getSerializable("tts_voice_info");
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJJLIIL = null;
        C487280J9a.LIZJ(this);
    }

    public final void onPageSelected() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo;
        Aweme awemeLJIIIIZZ;
        CCTemplateInfo ccTemplateInfo;
        Aweme awemeLJIIIIZZ2;
        CCTemplateInfo ccTemplateInfo2;
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        TextView textView;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo2;
        Aweme awemeLJIIIIZZ3;
        CCTemplateInfo ccTemplateInfo3;
        if (uo()) {
            vo();
            TextView textView2 = this.LLJILLL;
            if (textView2 != null) {
                Context context = getContext();
                textView2.setText(context != null ? context.getString(2131857994) : null);
            }
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo3 = so();
            if (iFeedPanelPlatformAbilitySo3 == null || (awemeLJIIIIZZ2 = iFeedPanelPlatformAbilitySo3.LJIIIIZZ()) == null || (ccTemplateInfo2 = awemeLJIIIIZZ2.getCcTemplateInfo()) == null || !ccTemplateInfo2.isTemplateBottomStyleSingleBtn()) {
                View view2 = this.LLJILJILJ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                View view3 = this.LLILZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                C21459218yU c21459218yU = this.LLJJ;
                if (c21459218yU != null) {
                    C786410Ut5.C(c21459218yU, 0);
                }
                TuxIconView tuxIconView = this.LLJJI;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                View view4 = this.LLJJIII;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = this.LLJJIJI;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(8, view5);
                }
                C1387620mDI c1387620mDI = C1387620mDI.LIZ;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo4 = so();
                Aweme awemeLJIIIIZZ4 = iFeedPanelPlatformAbilitySo4 != null ? iFeedPanelPlatformAbilitySo4.LJIIIIZZ() : null;
                c1387620mDI.getClass();
                if (C1387620mDI.LJFF(awemeLJIIIIZZ4) && (iFeedPanelPlatformAbilitySo = so()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ()) != null && (ccTemplateInfo = awemeLJIIIIZZ.getCcTemplateInfo()) != null && ccTemplateInfo.isTemplateBottomStyleDoubleBtn()) {
                    C21459218yU c21459218yU2 = this.LLJJ;
                    if (c21459218yU2 != null) {
                        C786410Ut5.C(c21459218yU2, 8);
                    }
                    TuxIconView tuxIconView2 = this.LLJJI;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                    }
                    View view6 = this.LLJJIII;
                    if (view6 != null) {
                        C786410Ut5.LJLLLLLL(8, view6);
                    }
                    View view7 = this.LLJJIJI;
                    if (view7 != null) {
                        C786410Ut5.LJLLLLLL(0, view7);
                    }
                }
            } else {
                vo();
                TextView textView3 = this.LLJILLL;
                if (textView3 != null) {
                    Context context2 = getContext();
                    textView3.setText(context2 != null ? context2.getString(2131828423) : null);
                }
            }
        }
        if ((uo() || ((iFeedPanelPlatformAbilitySo2 = so()) != null && (awemeLJIIIIZZ3 = iFeedPanelPlatformAbilitySo2.LJIIIIZZ()) != null && (ccTemplateInfo3 = awemeLJIIIIZZ3.getCcTemplateInfo()) != null && ccTemplateInfo3.isTemplateBottomStyleSingleBtn())) && (view = this.LLJILJILJ) != null) {
            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 43));
        }
        View view8 = this.LLILZ;
        if (view8 != null && (textView = (TextView) view8.findViewById(R.id.szn)) != null) {
            textView.setText(mo176do());
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getABService();
        if (C1400500mY4.LIZJ()) {
            View view9 = this.LLJJIII;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(8, view9);
            }
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            int iLIZJ = (int) C12ES.LIZJ(24.0f, getContext());
            View view10 = this.LLILZ;
            if (view10 != null) {
                int i = iLIZJ / 2;
                view10.setPaddingRelative(i, 0, i, 0);
            }
            View view11 = this.LLILZ;
            if (view11 != null && (layoutParams2 = view11.getLayoutParams()) != null) {
                layoutParams2.width = -1;
            }
            View view12 = this.LLILZ;
            if (view12 == null || (layoutParams = view12.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = (int) C12ES.LIZJ(38.0f, getContext());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLILLLLZIIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1402130mah(this, 0));
        }
    }

    public final void oo() {
        Aweme awemeLJIIIIZZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = so();
        if (iFeedPanelPlatformAbilitySo == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ()) == null || awemeLJIIIIZZ.getCcTemplateInfo() == null) {
            return;
        }
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        String eventType = c2189821An6 != null ? c2189821An6.getEventType() : null;
        String str = this.LLIZLLLIL;
        Context context = getContext();
        c1387620mDI.getClass();
        C1387620mDI.LIZLLL(context, awemeLJIIIIZZ, eventType, str);
    }

    public final boolean uo() {
        Aweme awemeLJIIIIZZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = so();
        return (iFeedPanelPlatformAbilitySo == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ()) == null || awemeLJIIIIZZ.getAwemeType() != 65) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bo(android.view.View r27) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.MusicBottomComponent.bo(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ko(android.view.ViewGroup r14) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.MusicBottomComponent.ko(android.view.ViewGroup):android.view.View");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        onPageSelected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mo(Aweme aweme, final Music music, String str, final String str2, String str3, boolean z, final boolean z2) {
        int videoLength;
        String str4;
        boolean z3;
        int i;
        String str5;
        boolean z4;
        boolean z5;
        boolean z6;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer numLJIIJJI;
        String str10;
        Intent intent;
        Bundle arguments;
        List listLJJLIIIJILLIZJL;
        String strIsSameMusicSupplyDetailPage;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        String musicSelectedFrom;
        String strIsSameMusicSupplyDetailPage2;
        String str11 = str;
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
        Intent intent2 = null;
        if (!Intrinsics.LJFF(aweme.getAid(), this.LLIZLLLIL)) {
            this.LLJJJJ = null;
        }
        MusicRecordService musicRecordService = new MusicRecordService();
        ShootExtraData shootExtraData = this.LLJJIJIIJIL;
        if (shootExtraData != null) {
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                strIsSameMusicSupplyDetailPage2 = c2189821An6.isSameMusicSupplyDetailPage();
            } else {
                strIsSameMusicSupplyDetailPage2 = null;
            }
            shootExtraData.setSameMusicSupplyDetailPage(strIsSameMusicSupplyDetailPage2);
        }
        ShootExtraData shootExtraData2 = this.LLJJIJIIJIL;
        if (shootExtraData2 != null) {
            shootExtraData2.setFromAwemeType(Integer.valueOf(aweme.getAwemeType()));
        }
        ShootExtraData shootExtraData3 = this.LLJJIJIIJIL;
        if (shootExtraData3 != null) {
            MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                intent2 = c19egLIZ.getIntent();
            }
            shootExtraData3.setFromFollowupSquareOriginalVideo(String.valueOf(musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent2, true)));
        }
        String strLIZIZ = C1212100heC.LIZIZ(aweme);
        if (C1399580mWa.LIZ() && ((musicSelectedFrom = music.getMusicSelectedFrom()) == null || musicSelectedFrom.length() == 0)) {
            music.setMusicSelectedFrom(str2);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
        MusicStickerStruct musicStickerStruct = this.LLJJJ;
        C15L7 c15l7 = new C15L7() { // from class: X.0mVf
            @Override // X.C15L7
            public final void LIZ() {
            }

            @Override // X.C15L7
            public final void LIZLLL() {
            }

            @Override // X.C15L7
            public final void LIZJ() {
                Handler handler = (Handler) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJJJJJIL;
                if (progressDialogC1399760mWs != null) {
                    C0FNV.LIZ(progressDialogC1399760mWs);
                }
                this.LLJL.LIZIZ(-1, "down music failed at bottom");
                this.LLJL.LIZ();
            }

            @Override // X.C15L7
            public final void LJI() {
                ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLJJJJJIL;
                if (progressDialogC1399760mWs != null) {
                    C0FNV.LIZ(progressDialogC1399760mWs);
                }
                this.LLJL.LIZ();
                Handler handler = (Handler) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }

            @Override // X.C15L7
            public final boolean LJ() {
                return z2;
            }

            @Override // X.C15L7
            public final void LJFF(MusicModel musicModel, Effect effect) {
                C578010Mlj.LIZ = false;
                if (musicModel != null && C1399570mWZ.LIZ() && effect != null && C1399400mWI.LIZ(effect)) {
                    C578010Mlj.LIZ = true;
                    if (C1399060mVk.LIZ()) {
                        musicModel.setMusicEndTime(musicModel.getShootDurationOrDuration());
                    }
                    if (C1399580mWa.LIZ()) {
                        String musicSelectedFrom2 = music.getMusicSelectedFrom();
                        if (musicSelectedFrom2 == null || musicSelectedFrom2.length() == 0) {
                            music.setMusicSelectedFrom(str2);
                        }
                    }
                }
            }
        };
        String str12 = this.LLJIJIL;
        int i2 = this.LLJ;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        String str13 = "music_feed_story";
        if (C729510SjV.LJJIJIL(aweme)) {
            str4 = "music_feed_story";
        } else {
            str4 = null;
        }
        musicRecordService.startRecord(fragmentLJI, c19egLIZ2, musicModelConvertToMusicModel, musicStickerStruct, stickerIDs, "", c15l7, videoLength, z, str12, i2, str11, str2, str3, bool, "music_detail", bool2, bool, str4, null, this.LLJJIJIIJIL, !Intrinsics.LJFF(this.LLJJIJIL, bool), bool2, this.LLJJJJ, C298270Bmb.LIZ(), strLIZIZ, null, null);
        if (music.getCollectStatus() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1458960o4M.LIZJ(z3);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (!C729510SjV.LJJIJIL(aweme)) {
            str13 = "music_feed";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str13);
        String str14 = "";
        if (!TextUtils.isEmpty("")) {
            i = 0;
            str5 = ((String[]) a0.LJJLIIIJILLIZJL("", new String[]{","}, 0, 6).toArray(new String[0]))[0];
        } else {
            i = 0;
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("giphy_id", str5);
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
        String str15 = CardStruct.IStatusCode.DEFAULT;
        if (z5 && z6) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_original_and_added_sound", str6);
        if (z5) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("original_sound_volume", str7);
        if (z6) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("added_sound_volume", str8);
        c2344009Gk.LIZJ(1, "after_consumption ");
        if (music.isFollowerTagVisible) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_following_tag ", str9);
        if (music.isFriendTagVisible) {
            str15 = "1";
        }
        c2344009Gk.LJFF("is_friend_tag", str15);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams("music_detail", this.LLJIJIL);
        C0Q1Q.LIZ(c2344009Gk, mapFetchSearchParams);
        Map<String, String> mapLJJZZI = c1er1.LJJZZI(mapFetchSearchParams);
        if (mapLJJZZI != null) {
            c2344009Gk.LJII(mapLJJZZI);
        }
        c2344009Gk.LIZJ(aweme.aigcInfo.getAIGCLabelType(), "from_aigc_theme_status");
        C2189821An6 c2189821An62 = getPanelContext().LIZJ;
        if (c2189821An62 != null && (strIsSameMusicSupplyDetailPage = c2189821An62.isSameMusicSupplyDetailPage()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(strIsSameMusicSupplyDetailPage);
        } else {
            numLJIIJJI = null;
        }
        c2344009Gk.LJ(numLJIIJJI, "is_same_music_supply_detail_page");
        if (stickerIDs != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stickerIDs, new String[]{","}, i, 6)) != null) {
            str10 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
        } else {
            str10 = null;
        }
        c2344009Gk.LJFF("prop_id", str10);
        c2344009Gk.LJFF("prop_resource_id", strLIZIZ);
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
        MusicDetailCommonModel musicDetailCommonModel2 = MusicDetailCommonModel.INSTANCE;
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null) {
            intent = c19egLIZ3.getIntent();
        } else {
            intent = null;
        }
        c2344009Gk.LIZJ(musicDetailCommonModel2.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent, true), "is_from_followup_square_original_video");
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getInt("is_favourite_music", i) == 1) {
            c2344009Gk.LJFF("is_favourite_music", "1");
        }
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, i, i, i, 14, null);
        if (iRecordMobService != null) {
            if (str11 == null) {
                str11 = "";
            }
            String str16 = this.LLIZLLLIL;
            if (str16 == null) {
                str16 = "";
            }
            String strValueOf = String.valueOf(music.getId());
            if (str2 != null) {
                str14 = str2;
            }
            iRecordMobService.LIZLLL(new C1449410nox(str3, str11, "music_detail", str16, null, new C1449430noz(strValueOf, str14), null, null, 208), c2344009Gk.LIZ);
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, i, i, i, 14, null);
        if (iCommerceMediaService != null && iCommerceMediaService.LIZLLL()) {
            ICommerceMusicLogger iCommerceMusicLogger = this.LLJJJIL;
            C1850180yFM.LIZ.getClass();
            iCommerceMusicLogger.log(C1850180yFM.LJFF, new AwS606S0100000_27(this, 98));
        }
    }
}
