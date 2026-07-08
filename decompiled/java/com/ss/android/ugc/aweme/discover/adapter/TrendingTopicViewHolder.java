package com.ss.android.ugc.aweme.discover.adapter;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C1029590ctp;
import X.C10EU;
import X.C11CP;
import X.C11CZ;
import X.C11ER;
import X.C1260260its;
import X.C12ES;
import X.C1324840ka2;
import X.C13LE;
import X.C14MI;
import X.C15O7;
import X.C1620280sGY;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C366620EYy;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC452301pR;
import X.InterfaceC1259900itI;
import X.InterfaceC1620270sGX;
import X.InterfaceC1620300sGa;
import Y.ACListenerS163S0100000_29;
import Y.ACallableS432S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryFpsOptExperiment;
import com.ss.android.ugc.aweme.discover.model.AdLabel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo;
import com.ss.android.ugc.aweme.discover.spi.ITrendingTopicViewHolderService;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendingTopicViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements InterfaceC1620270sGX, InterfaceC1620300sGa, C11CZ {
    public static final TrendingTopic LLJLLIL = new TrendingTopic(0, null, null, null, null, null, "", null, null);
    public static final C01GW<Boolean> LLJLLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(51));
    public final RecyclerView.RecycledViewPool LLJI;
    public final InterfaceC1620270sGX LLJIJIL;
    public final RemoteImageView LLJILJIL;
    public final TextView LLJILJILJ;
    public final TextView LLJILLL;
    public final TextView LLJJ;
    public final TextView LLJJI;
    public final View LLJJIII;
    public final RecyclerView LLJJIJI;
    public final View LLJJIJIIJIL;
    public final ViewStub LLJJIJIL;
    public final ImageView LLJJJ;
    public TrendingTopic LLJJJIL;
    public boolean LLJJJJ;
    public C1620280sGY LLJJJJJIL;
    public final C1260260its LLJJJJLIIL;
    public final Context LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C11CP LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    @Override // X.InterfaceC1620300sGa
    public final void T3() {
        a6(true);
        this.LLJIJIL.vq();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int X5() {
        return ((Number) withState((JediViewModel) this.LLJLIL.getValue(), new AwS608S0100000_29(this, 83))).intValue();
    }

    public final void c6() {
        RecyclerView recyclerView;
        InterfaceC1259900itI interfaceC1259900itI;
        if (this.LLJJJJLIIL == null || (recyclerView = this.LLJJIJI) == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if ((childViewHolder instanceof InterfaceC1259900itI) && (interfaceC1259900itI = (InterfaceC1259900itI) childViewHolder) != null) {
                interfaceC1259900itI.c1();
            }
        }
    }

    @Override // X.InterfaceC1620270sGX
    public final void vq() {
        this.LLJIJIL.vq();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        withState((JediViewModel) this.LLJLIL.getValue(), new AwS608S0100000_29(this, 82));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        c6();
    }

    public static String W5(TrendingTopic trendingTopic) {
        if (trendingTopic.getChallenge() != null) {
            return trendingTopic.getChallenge().getCid();
        }
        if (trendingTopic.getMusic() != null) {
            return String.valueOf(trendingTopic.getMusic().getId());
        }
        if (trendingTopic.getEffect() != null) {
            return trendingTopic.getEffect().id;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a6(boolean r31) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.a6(boolean):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(DiscoverSectionItem discoverSectionItem) {
        boolean zLJIIIIZZ;
        Drawable drawableLIZ;
        int i;
        int i2;
        int i3;
        String str;
        AdLabel adLabel;
        TrendingTopic trendingTopic = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem).trendingTopicOrAd.topic;
        if (trendingTopic != null) {
            if (trendingTopic == LLJLLIL) {
                if (this.LLJJLIIIJLLLLLLLZ == null) {
                    this.LLJJLIIIJLLLLLLLZ = C786410Ut5.LJLLLL(this.LLJJIJIL);
                }
                View view = this.LLJJLIIIJLLLLLLLZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C786410Ut5.LJLLLLLL(8, this.LLJJIJIIJIL);
            } else {
                C786410Ut5.LLIIIJ(this.LLJJIJIL, 8);
                C786410Ut5.LJLLLLLL(0, this.LLJJIJIIJIL);
                if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable1) {
                    zLJIIIIZZ = LLJLLL.getValue().booleanValue();
                } else {
                    zLJIIIIZZ = C10EU.LJIIIIZZ();
                }
                if (zLJIIIIZZ) {
                    C786410Ut5.LLIL(this.LLJJI, 8);
                } else if (ChallengeDetailServiceImpl.LJFF().LIZIZ()) {
                    C786410Ut5.LLIL(this.LLJJI, 8);
                    C786410Ut5.LJLLLLLL(0, this.LLJJIII);
                }
                this.LLJJJIL = trendingTopic;
                Challenge challenge = trendingTopic.getChallenge();
                Music music = trendingTopic.getMusic();
                NewFaceStickerBean effect = trendingTopic.getEffect();
                if (this.LLJJJJJIL == null) {
                    C1620280sGY c1620280sGY = new C1620280sGY(this);
                    this.LLJJJJJIL = c1620280sGY;
                    c1620280sGY.LLILZIL = trendingTopic;
                    View view2 = new View(this.LLJJL);
                    C786410Ut5.W5(view2, new ViewGroup.LayoutParams((int) C12ES.LIZJ(14.0f, this.LLJJL), -1));
                    C1620280sGY c1620280sGY2 = this.LLJJJJJIL;
                    c1620280sGY2.LL = view2;
                    c1620280sGY2.notifyItemInserted(0);
                    this.LLJJIJI.setAdapter(this.LLJJJJJIL);
                    if (((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) DiscoveryCommonPoolExperiment.LIZIZ.getValue()).enable) {
                        C2344809Gs.LIZLLL(4, "TrendingTopicViewHolder", "should use a common pool");
                        RecyclerView.RecycledViewPool recycledViewPool = this.LLJI;
                        if (recycledViewPool != null) {
                            this.LLJJIJI.setRecycledViewPool(recycledViewPool);
                            C2344809Gs.LIZLLL(4, "TrendingTopicViewHolder", "use a common pool");
                        }
                    }
                    this.LLJJJJJIL.LLILZ = this;
                }
                TextView textView = this.LLJJI;
                if (C960203pA.LIZIZ(this.LLJJL)) {
                    drawableLIZ = C14MI.LIZ(this.LLJJL, R.drawable.bi8);
                } else {
                    drawableLIZ = C14MI.LIZ(this.LLJJL, R.drawable.bi6);
                }
                ArrayList arrayList = null;
                if (drawableLIZ != null) {
                    drawableLIZ.setBounds(0, 0, drawableLIZ.getIntrinsicWidth(), drawableLIZ.getIntrinsicHeight());
                } else {
                    drawableLIZ = null;
                }
                textView.setCompoundDrawablesRelative(null, null, drawableLIZ, null);
                if (challenge != null) {
                    C786410Ut5.LJZI(8, this.LLJJJ);
                    ITrendingTopicViewHolderService iTrendingTopicViewHolderService = (ITrendingTopicViewHolderService) PluggableExtentionKt.pluggableSpi$default(ITrendingTopicViewHolderService.class, false, false, false, 14, null);
                    if (iTrendingTopicViewHolderService != null && iTrendingTopicViewHolderService.LIZ(challenge) && !challenge.isCommerce()) {
                        if (challenge.getAuthor() != null && challenge.getAuthor().getAvatarThumb() != null) {
                            C1324840ka2.LJFF(this.LLJILJIL, challenge.getAuthor().getAvatarThumb());
                        }
                        this.LLJILLL.setText(this.LLJJL.getString(2131839474));
                    } else {
                        RemoteImageView remoteImageView = this.LLJILJIL;
                        if (C960203pA.LIZIZ(this.LLJJL)) {
                            i3 = R.drawable.bi_;
                        } else {
                            i3 = R.drawable.bi9;
                        }
                        remoteImageView.setImageResource(i3);
                        String desc = trendingTopic.getDesc();
                        TrendingTopicsAdInfo adData = trendingTopic.getAdData();
                        if (adData != null && (adLabel = adData.adLabel) != null) {
                            str = adLabel.text;
                        } else {
                            str = null;
                        }
                        b6(desc, str);
                    }
                    if (ChallengeDetailServiceImpl.LJFF().LJ()) {
                        this.LLJJI.setText(C1843500y4a.LIZIZ(challenge.getUseCount()));
                    } else {
                        this.LLJJI.setText(C1843500y4a.LIZIZ(challenge.getDisplayCount()));
                    }
                    if (((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIL(challenge.getChallengeName(), challenge.isCommerce(), false) == null) {
                        this.LLJJJJ = false;
                        this.LLJILJILJ.setText(challenge.getChallengeName());
                    } else {
                        this.LLJJJJ = true;
                        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIJ(challenge.getChallengeName(), challenge.isCommerce(), this.LLJILJILJ, false, "discover_hashtag_list");
                    }
                    this.LLJJJJJIL.LLIZ = challenge.getCid();
                    this.LLJJJJJIL.LLILZLL = 0;
                    if (trendingTopic.isAd()) {
                        this.LLJJJJJIL.LLILZIL = trendingTopic;
                    }
                } else if (music != null) {
                    RemoteImageView remoteImageView2 = this.LLJILJIL;
                    if (C960203pA.LIZIZ(this.LLJJL)) {
                        i2 = R.drawable.bi4;
                    } else {
                        i2 = R.drawable.bi3;
                    }
                    remoteImageView2.setImageResource(i2);
                    C786410Ut5.LJZI(8, this.LLJJJ);
                    this.LLJJI.setText(C1843500y4a.LIZIZ(music.getUserCount()));
                    this.LLJILJILJ.setText(music.getMusicName());
                    b6(trendingTopic.getDesc(), null);
                    this.LLJJJJJIL.LLIZ = String.valueOf(music.getId());
                    this.LLJJJJJIL.LLILZLL = 1;
                } else if (effect != null) {
                    RemoteImageView remoteImageView3 = this.LLJILJIL;
                    if (C960203pA.LIZIZ(this.LLJJL)) {
                        i = R.drawable.bi2;
                    } else {
                        i = R.drawable.bi1;
                    }
                    remoteImageView3.setImageResource(i);
                    C786410Ut5.LJZI(8, this.LLJJJ);
                    this.LLJJI.setText(C1843500y4a.LIZIZ(effect.userCount));
                    this.LLJILJILJ.setText(effect.name);
                    b6(trendingTopic.getDesc(), null);
                    C1620280sGY c1620280sGY3 = this.LLJJJJJIL;
                    c1620280sGY3.LLIZ = effect.id;
                    c1620280sGY3.LLILZLL = 3;
                }
                C1620280sGY c1620280sGY4 = this.LLJJJJJIL;
                if (c1620280sGY4 != null) {
                    List<Aweme> items = trendingTopic.getItems();
                    if (items != null) {
                        arrayList = new ArrayList(items);
                    }
                    c1620280sGY4.setData(arrayList);
                }
                this.LLJJJJJIL.LLIZLLLIL = getAdapterPosition();
            }
        }
        if (((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable2) {
            C15O7.LIZJ(new ACallableS432S0100000_29(this, 8));
        } else {
            withState((JediViewModel) this.LLJLIL.getValue(), new AwS608S0100000_29(this, 598));
        }
    }

    @Override // X.C11CZ
    public final void LJIIJJI(int i, int i2) {
        final TrendingTopic trendingTopic;
        if (i != 0 || i2 == 0 || (trendingTopic = this.LLJJJIL) == null) {
            return;
        }
        final Challenge challenge = trendingTopic.getChallenge();
        final Music music = trendingTopic.getMusic();
        final NewFaceStickerBean effect = trendingTopic.getEffect();
        if (!((DiscoveryFpsOptExperiment.Config) DiscoveryFpsOptExperiment.LIZIZ.getValue()).enable2 && effect == null) {
            if (challenge != null) {
                ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJII(challenge.getSchema(), challenge.getCid());
                this.LLJJIJI.getContext();
                C20684815ws.LJIIJJI("show_challenge", 0L, "discovery", challenge.getCid());
                C11ER c11er = new C11ER();
                c11er.LJIILLIIL = "discovery";
                c11er.LJIIZILJ = challenge.getCid();
                c11er.LJIILJJIL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "discovery");
                c2344009Gk.LJIIIIZZ("tag_id", challenge.getCid());
                c2344009Gk.LIZJ(X5(), "client_order");
                C20684815ws.LJIILLIIL("cell_show", c2344009Gk.LIZ);
                C11CP c11cp = this.LLJL;
                if (c11cp != null) {
                    c11cp.LIZ(X5(), W5(trendingTopic), trendingTopic.getDesc());
                }
                if (trendingTopic.isAd()) {
                    C1029590ctp.LIZLLL().LJJIJ(this.LLJJL, trendingTopic.getCreativeId(), trendingTopic.getLogExtra(), trendingTopic.getTrackUrlList());
                    return;
                }
                return;
            }
            if (music != null) {
                this.LLJJIJI.getContext();
                C20684815ws.LJIIJJI("show_music", 0L, "discovery", music.getMid());
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "discovery");
                c2344009Gk2.LJIIIIZZ("music_id", music.getMid());
                c2344009Gk2.LIZJ(X5(), "client_order");
                C20684815ws.LJIILLIIL("cell_show", c2344009Gk2.LIZ);
                return;
            }
            return;
        }
        C15O7.LIZJ(new Callable() { // from class: X.11CV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TrendingTopicViewHolder@4600.onVisibilityChanged$1");
                if (effect != null) {
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("prop_id", effect.effectId);
                    c2344009Gk3.LIZJ(this.X5(), "client_order");
                    C20684815ws.LJIILLIIL("show_effect", c2344009Gk3.LIZ);
                } else if (challenge != null) {
                    ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJII(challenge.getSchema(), challenge.getCid());
                    this.LLJJIJI.getContext();
                    C20684815ws.LJIIJJI("show_challenge", 0L, "discovery", challenge.getCid());
                    C11ER c11er2 = new C11ER();
                    c11er2.LJIILLIIL = "discovery";
                    c11er2.LJIIZILJ = challenge.getCid();
                    c11er2.LJIILJJIL();
                    C2344009Gk c2344009Gk4 = new C2344009Gk();
                    c2344009Gk4.LJIIIIZZ("enter_from", "discovery");
                    c2344009Gk4.LJIIIIZZ("tag_id", challenge.getCid());
                    c2344009Gk4.LIZJ(this.X5(), "client_order");
                    C20684815ws.LJIILLIIL("cell_show", c2344009Gk4.LIZ);
                    C11CP c11cp2 = this.LLJL;
                    if (c11cp2 != null) {
                        c11cp2.LIZ(this.X5(), TrendingTopicViewHolder.W5(trendingTopic), trendingTopic.getDesc());
                    }
                    if (trendingTopic.isAd()) {
                        Context context = this.LLJJL;
                        TrendingTopic trendingTopic2 = trendingTopic;
                        C1029590ctp.LIZLLL().LJJIJ(context, trendingTopic2.getCreativeId(), trendingTopic2.getLogExtra(), trendingTopic2.getTrackUrlList());
                    }
                } else if (music != null) {
                    this.LLJJIJI.getContext();
                    C20684815ws.LJIIJJI("show_music", 0L, "discovery", music.getMid());
                    C2344009Gk c2344009Gk5 = new C2344009Gk();
                    c2344009Gk5.LJIIIIZZ("enter_from", "discovery");
                    c2344009Gk5.LJIIIIZZ("music_id", music.getMid());
                    c2344009Gk5.LIZJ(this.X5(), "client_order");
                    C20684815ws.LJIILLIIL("cell_show", c2344009Gk5.LIZ);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TrendingTopicViewHolder@4600.onVisibilityChanged$1");
                return unit;
            }
        });
    }

    public final void b6(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.LLJJ.setText(str2);
            C786410Ut5.LLIL(this.LLJJ, 0);
            C786410Ut5.T7(this.LLJJ, new View.OnClickListener() { // from class: X.11CY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            C786410Ut5.LLIL(this.LLJILLL, 8);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.LLJILLL.setText(str);
            C786410Ut5.LLIL(this.LLJJ, 8);
            C786410Ut5.LLIL(this.LLJILLL, 0);
        } else {
            C786410Ut5.LLIL(this.LLJJ, 8);
            C786410Ut5.LLIL(this.LLJILLL, 8);
            ((ViewGroup.MarginLayoutParams) this.LLJILJILJ.getLayoutParams()).topMargin = ((Number) this.LLJLL.getValue()).intValue();
        }
    }

    public TrendingTopicViewHolder(View view, RecyclerView.RecycledViewPool recycledViewPool, TrendsTabFragment trendsTabFragment) {
        super(view);
        this.LLJI = recycledViewPool;
        this.LLJIJIL = trendsTabFragment;
        this.LLJILJIL = (RemoteImageView) view.findViewById(R.id.lyp);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.tv_title);
        this.LLJILLL = (TextView) view.findViewById(R.id.tv_type);
        this.LLJJ = (TextView) view.findViewById(R.id.abl);
        this.LLJJI = (TextView) view.findViewById(R.id.zfl);
        this.LLJJIII = view.findViewById(R.id.zft);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvw);
        this.LLJJIJI = recyclerView;
        this.LLJJIJIIJIL = view.findViewById(R.id.tqy);
        this.LLJJIJIL = (ViewStub) view.findViewById(R.id.vs_place_holder);
        this.LLJJJ = (ImageView) view.findViewById(R.id.fwz);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendsTabViewModel.class);
        this.LLJLIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 120));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(view, 1125));
        this.LLJLILLLLZIIL = c01gwLIZ;
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(view, 1126));
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 206), view);
        this.LLJJL = view.getContext();
        C1260260its c1260260its = new C1260260its();
        this.LLJJJJLIIL = c1260260its;
        int color = view.getContext().getResources().getColor(R.color.ao);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(view.getContext(), 0);
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        wrapLinearLayoutManager.setItemPrefetchEnabled(false);
        recyclerView.addItemDecoration(new C366620EYy(color, ((Number) c01gwLIZ.getValue()).intValue(), 0));
        recyclerView.addOnScrollListener(c1260260its);
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.11CX
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                if (i == 0) {
                    C20684815ws.LJIIIZ(0L, 0L, "cell_slide", "slide");
                }
            }
        });
    }
}
