package com.ss.android.ugc.aweme.feed.assem.ability;

import X.C0SR4;
import X.InterfaceC1294060jmO;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC707080RoQ;
import X.InterfaceC739770T0d;
import X.InterfaceC752360TfG;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.StoryFeedListHelper;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public interface IFeedPanelPlatformAbility extends InterfaceC494301wD {
    void Bx2();

    StoryFeedListHelper Gc2();

    ILoadMoreAbility Kk1();

    Aweme LJIIIIZZ();

    int LJLJJL();

    int LJLLJ();

    InterfaceC665370Q7z LLIIJLIL();

    @InterfaceC1294060jmO
    void LLLZLL(int i);

    void M31();

    IViewPagerComponentAbility Mb();

    void Nb();

    boolean Ni2();

    void O70();

    InterfaceC739770T0d P2();

    @InterfaceC1294060jmO
    boolean PW(int i, int i2, String str, List list);

    int QU();

    @InterfaceC1294060jmO
    boolean Y82();

    void Z5();

    C0SR4 Zv0();

    IRefreshAbility aZ1();

    void bk1(Aweme aweme, String str, FypExposedCommentMobParams fypExposedCommentMobParams);

    String cY1();

    int cl2();

    Aweme d2(int i);

    List<Aweme> getAwemeList();

    String getFrom();

    int getItemCount();

    PlayButtonComponentTemp gq0();

    boolean kU1();

    boolean l41();

    IVideoPlayBehaviorMobAbility mQ2();

    void sP();

    @InterfaceC1294060jmO
    void tJ2(int i, String str, List list);

    InterfaceC752360TfG tO0();

    InterfaceC707080RoQ un();

    IPlayerComponentAbility x32();

    String xy2();

    void y();

    @InterfaceC1294060jmO
    BaseListFragmentPanel yE();

    JSONObject zj();
}
