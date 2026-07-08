package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C1002190cBd;
import X.C12ES;
import X.C1387620mDI;
import X.C1388190mED;
import X.C1394210mNv;
import X.C1394540mOS;
import X.C1398970mVb;
import X.C1400500mY4;
import X.C1850190yFN;
import X.C2097608Jq;
import X.C21459218yU;
import X.C2189821An6;
import X.C259800zU;
import X.C452501pT;
import X.C487280J9a;
import X.C589890NBr;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1399020mVg;
import X.InterfaceC1616070s9l;
import X.InterfaceC487330J9f;
import X.ProgressDialogC1399760mWs;
import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.detail.component.biz.MusicSquareBottomComponent;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicSquareBottomComponent extends ShootButtonBottomComponent implements InterfaceC487330J9f {
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
    public ViewGroup LLJLIL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public boolean LLJZIJLIL;
    public final Map<Integer, InterfaceC1399020mVg> LLL;
    public Boolean LLJJIJIL = Boolean.TRUE;
    public final ICommerceMusicLogger LLJJJIL = (ICommerceMusicLogger) ServiceManager.get().getService(ICommerceMusicLogger.class);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 535));
    public final C589890NBr LLJL = new C589890NBr();
    public String LLJLILLLLZIIL = "";
    public String LLJLL = "";

    public final IFeedPanelPlatformAbility so() {
        return (IFeedPanelPlatformAbility) this.LLJLLIL.getValue();
    }

    public final void wo() {
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

    public MusicSquareBottomComponent() {
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 532);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 533));
        this.LLJLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 536));
        this.LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 534));
        this.LLJZIJLIL = true;
        this.LLL = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(C1398970mVb.LIZLLL), new C1398970mVb(new AwS565S0100000_21(this, 528), awS565S0100000_21, new AwS565S0100000_21(this, 529))), new Pair(Integer.valueOf(C1394210mNv.LIZIZ), new C1394210mNv(new AwS565S0100000_21(this, 530))), new Pair(Integer.valueOf(C1394540mOS.LIZIZ), new C1394540mOS(new AwS565S0100000_21(this, 531))));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        return vo().LIZIZ();
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
        String string = arguments.getString("shoot_way");
        if (string == null) {
            string = "single_song";
        }
        this.LLJLILLLLZIIL = string;
        String string2 = arguments.getString("music_selected_from");
        this.LLJLL = string2 != null ? string2 : "single_song";
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
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo2;
        Aweme awemeLJIIIIZZ3;
        CCTemplateInfo ccTemplateInfo3;
        if (uo()) {
            wo();
            TextView textView = this.LLJILLL;
            if (textView != null) {
                Context context = getContext();
                textView.setText(context != null ? context.getString(2131857994) : null);
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
                wo();
                TextView textView2 = this.LLJILLL;
                if (textView2 != null) {
                    Context context2 = getContext();
                    textView2.setText(context2 != null ? context2.getString(2131828423) : null);
                }
            }
        }
        if ((uo() || ((iFeedPanelPlatformAbilitySo2 = so()) != null && (awemeLJIIIIZZ3 = iFeedPanelPlatformAbilitySo2.LJIIIIZZ()) != null && (ccTemplateInfo3 = awemeLJIIIIZZ3.getCcTemplateInfo()) != null && ccTemplateInfo3.isTemplateBottomStyleSingleBtn())) && (view = this.LLJILJILJ) != null) {
            HandlerHook.viewPost(view, new ARunnableS106S0100000_6(this, 44));
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getABService();
        if (C1400500mY4.LIZJ()) {
            View view8 = this.LLJJIII;
            if (view8 != null) {
                C786410Ut5.LJLLLLLL(8, view8);
            }
            TuxIconView tuxIconView3 = this.LLJJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            int iLJIIJ = C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(24.0f, getContext()));
            View view9 = this.LLILZ;
            if (view9 != null && (layoutParams2 = view9.getLayoutParams()) != null) {
                layoutParams2.width = iLJIIJ;
            }
            View view10 = this.LLILZ;
            if (view10 != null && (layoutParams = view10.getLayoutParams()) != null) {
                layoutParams.height = (int) C12ES.LIZJ(38.0f, getContext());
            }
        }
        vo().LIZ(this.LLJLIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        final C259800zU c259800zU = new C259800zU();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0mVa
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
                /* JADX WARN: Type inference failed for: r4v5 */
                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    ?? r4;
                    List<Aweme> awemeList;
                    Aweme awemeLJIIIIZZ;
                    String str;
                    this.LL.onPageSelected();
                    MusicSquareBottomComponent musicSquareBottomComponent = this.LL;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = musicSquareBottomComponent.so();
                    if (iFeedPanelPlatformAbilitySo != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ()) != null) {
                        MDPRecommendTemplateInfo mDPRecommendTemplateInfoLIZIZ = C1398670mV7.LIZIZ(awemeLJIIIIZZ);
                        boolean z = musicSquareBottomComponent.LLJZIJLIL;
                        if (z) {
                            str = "click";
                        } else {
                            str = "slide";
                        }
                        musicSquareBottomComponent.LLJI = str;
                        if (!z && C1398670mV7.LIZ(awemeLJIIIIZZ)) {
                            C1394400mOE c1394400mOE = C1394400mOE.LIZ;
                            String str2 = musicSquareBottomComponent.LLJI;
                            c1394400mOE.getClass();
                            C20684815ws.LJIILLIIL("tt_template_video_click", C1394400mOE.LIZ(awemeLJIIIIZZ, "video_card", str2, mDPRecommendTemplateInfoLIZIZ));
                        }
                        if (C1398670mV7.LIZ(awemeLJIIIIZZ)) {
                            C1394400mOE c1394400mOE2 = C1394400mOE.LIZ;
                            String str3 = musicSquareBottomComponent.LLJI;
                            c1394400mOE2.getClass();
                            C20684815ws.LJIILLIIL("enter_tt_template_video_preview_page", C1394400mOE.LIZ(awemeLJIIIIZZ, "video_card", str3, mDPRecommendTemplateInfoLIZIZ));
                        }
                        musicSquareBottomComponent.LLJZIJLIL = false;
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo2 = this.LL.so();
                    if (iFeedPanelPlatformAbilitySo2 != null && (awemeList = iFeedPanelPlatformAbilitySo2.getAwemeList()) != null) {
                        r4 = (Aweme) ListProtector.get(awemeList, i);
                    } else {
                        r4 = 0;
                    }
                    Aweme aweme = c259800zU.element;
                    if (aweme != null && !AwemeExtKt.isMDPSquareType(aweme) && r4 != 0 && AwemeExtKt.isMDPSquareType(r4)) {
                        MusicSquareBottomComponent musicSquareBottomComponent2 = this.LL;
                        musicSquareBottomComponent2.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_method", "mdp_original_video");
                        c2344009Gk.LJIIIIZZ("group_id", musicSquareBottomComponent2.LLIZLLLIL);
                        C20684815ws.LJIILLIIL("enter_followup_square_video_instream", c2344009Gk.LIZ);
                    }
                    c259800zU.element = r4;
                }
            });
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

    public final InterfaceC1399020mVg vo() {
        InterfaceC1399020mVg interfaceC1399020mVg;
        Aweme awemeLJIIIIZZ;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = so();
        if (iFeedPanelPlatformAbilitySo == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ()) == null || !AwemeExtKt.isMDPSquareType(awemeLJIIIIZZ)) {
            Map<Integer, InterfaceC1399020mVg> map = this.LLL;
            int i = C1398970mVb.LIZLLL;
            interfaceC1399020mVg = map.get(Integer.valueOf(C1398970mVb.LIZLLL));
        } else {
            interfaceC1399020mVg = this.LLL.get(Integer.valueOf(awemeLJIIIIZZ.getDetailPageItemType()));
        }
        return interfaceC1399020mVg == null ? new InterfaceC1399020mVg() { // from class: X.0mVh
            @Override // X.InterfaceC1399020mVg
            public final void LIZ(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1399020mVg
            public final int LIZIZ() {
                return 2131857974;
            }

            @Override // X.InterfaceC1399020mVg
            public final void LIZJ(Context context, Aweme aweme, Integer num) {
            }
        } : interfaceC1399020mVg;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        Context context;
        BaseListFragmentPanel baseListFragmentPanel;
        List<Aweme> awemeList;
        Aweme awemeLJIIIIZZ = null;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), "single_song", true) && (context = getContext()) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo = so();
            Integer rankInSquareInVideoPlay = null;
            if (iFeedPanelPlatformAbilitySo != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilitySo.LJIIIIZZ();
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilitySo2 = so();
            if ((iFeedPanelPlatformAbilitySo2 instanceof BaseListFragmentPanel) && (baseListFragmentPanel = (BaseListFragmentPanel) iFeedPanelPlatformAbilitySo2) != null && (awemeList = baseListFragmentPanel.getAwemeList()) != null) {
                rankInSquareInVideoPlay = MusicDetailCommonModel.INSTANCE.getRankInSquareInVideoPlay(awemeLJIIIIZZ, awemeList);
            }
            vo().LIZJ(context, awemeLJIIIIZZ, rankInSquareInVideoPlay);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void ho(ViewGroup viewGroup) {
        super.ho(viewGroup);
        vo().LIZ(this.LLJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ko(android.view.ViewGroup r14) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.MusicSquareBottomComponent.ko(android.view.ViewGroup):android.view.View");
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        onPageSelected();
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo(com.ss.android.ugc.aweme.feed.model.Aweme r47, com.ss.android.ugc.aweme.music.model.Music r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, boolean r52, final boolean r53, java.lang.Integer r54) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.MusicSquareBottomComponent.mo(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Integer):void");
    }
}
