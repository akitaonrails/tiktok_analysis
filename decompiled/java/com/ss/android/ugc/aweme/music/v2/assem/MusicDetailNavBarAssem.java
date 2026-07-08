package com.ss.android.ugc.aweme.music.v2.assem;

import X.AbstractC1377610lx9;
import X.AbstractViewOnClickListenerC372950Ejl;
import X.C019F;
import X.C01GW;
import X.C09RE;
import X.C0X4S;
import X.C1251150ifB;
import X.C1261230ivR;
import X.C1365870leD;
import X.C13LE;
import X.C14EU;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599690rjL;
import X.C1637806bA;
import X.C19406010w6;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C621180OYa;
import X.C622680Oba;
import X.C629480OmY;
import X.C630140Onc;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C735440St4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1365380ldQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC629870OnB;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShareAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.MusicShareConfiguration;
import com.ss.android.ugc.aweme.music.presenter.MusicShareModel;
import com.ss.android.ugc.aweme.music.presenter.MusicSharePackageV2;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailNavBarAssem extends DetailNavBarAssem implements PageHeaderScrollAbility, ShareAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1244));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1245));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1247));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1246));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1250));
    public final AssemVMLazy LLJJJJLIIL;
    public boolean LLJJL;
    public final List<InterfaceC629870OnB> LLJJLIIIJLLLLLLLZ;
    public C630140Onc LLJL;
    public final C01GW LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDetailNavBarAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicDetailNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1249), AFwS240S0000000_9.get$arr$(527), null, true);
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1248));
    }

    public final String getAwemeId() {
        return (String) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (this.LLJL != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("lynx_music_card");
        }
        super.onDestroy();
    }

    public final void op() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Omd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 315), 14, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        ViewGroup viewGroup;
        super.xo();
        ViewParent parent = getContentView().getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C09RE c09re = new C09RE(viewGroup);
        if (!c09re.hasNext() || Intrinsics.LJFF(c09re.next(), getContentView())) {
            return;
        }
        c09re.remove();
    }

    public final class ShareMusicAction implements InterfaceC629870OnB {
        public final MusicDetail LIZ;
        public final C19EG LIZIZ;

        @Override // X.InterfaceC629870OnB
        public final void LIZJ(int i) {
        }

        @Override // X.InterfaceC629870OnB
        public final void LIZ(TuxNavBar tuxNavBar) {
            Music music;
            UrlModel playUrl;
            List<String> urlList;
            Music music2 = this.LIZ.music;
            if (music2 != null && music2.getMusicStatus() != 0 && (music = this.LIZ.music) != null && (playUrl = music.getPlayUrl()) != null && (urlList = playUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZIZ = "share_music";
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_turn_up_right;
                c1251150ifB.LIZLLL = true;
                tuxNavBar.LIZ(c1251150ifB);
                MusicDetailNavBarAssem.this.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem$ShareMusicAction$initAction$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_CREATE) {
                            C622680Oba.LIZJ(this.LL);
                        } else {
                            if (event != Lifecycle.Event.ON_DESTROY) {
                                return;
                            }
                            C622680Oba.LIZLLL(this.LL);
                        }
                    }
                });
            }
        }

        @Override // X.InterfaceC629870OnB
        public final void LIZIZ(TuxNavBar tuxNavBar) {
            final MusicModel musicModelConvertToMusicModel;
            TuxIconView tuxIconView;
            final Music music = this.LIZ.music;
            if (music != null && (musicModelConvertToMusicModel = music.convertToMusicModel()) != null) {
                View viewLJII = tuxNavBar.LJII("share_music");
                if ((viewLJII instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewLJII) != null) {
                    Context context = tuxNavBar.getContext();
                    if (context != null) {
                        tuxIconView.setContentDescription(context.getString(2131823327));
                    }
                    final MusicDetailNavBarAssem musicDetailNavBarAssem = MusicDetailNavBarAssem.this;
                    C786410Ut5.a9(tuxIconView, new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0OnG
                        @Override // X.AbstractViewOnClickListenerC372950Ejl
                        public final void LIZ(View view) {
                            musicDetailNavBarAssem.pW(musicModelConvertToMusicModel, music, this.LIZIZ);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(600L);
                        }
                    });
                }
            }
        }

        @C14EU
        public final void onEvent(C1365870leD c1365870leD) {
            View view;
            if (TextUtils.equals("music", c1365870leD.LIZLLL)) {
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                C19EG c19eg = this.LIZIZ;
                Fragment fragmentLJI = C724240Sb0.LJI(MusicDetailNavBarAssem.this);
                if (fragmentLJI != null) {
                    view = fragmentLJI.getView();
                } else {
                    view = null;
                }
                shareService.LJIL(c19eg, view, c1365870leD);
            }
        }

        public ShareMusicAction(MusicDetail musicDetail, C19EG c19eg) {
            this.LIZ = musicDetail;
            this.LIZIZ = c19eg;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void bq(int i) {
        boolean z;
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.B5(tuxTextView, mp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160)), i));
        TuxNavBar tuxNavBarLp = lp();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        tuxNavBarLp.LJIIZILJ(z);
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC629870OnB) it2.next()).LIZJ(i);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem for r14v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem.onViewCreated(android.view.View):void");
    }

    public static float mp(int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i3 - i < 0) {
            return 0.0f;
        }
        return Math.min(r3, i4) / i4;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShareAbility
    public final void pW(MusicModel musicModel, Music music, final C19EG c19eg) {
        Integer numLJ;
        String string;
        Bundle arguments;
        MusicDetailFragmentProvider musicDetailFragmentProvider;
        MusicDetailAwemeListFragment musicDetailAwemeListFragmentS9;
        C1261230ivR c1261230ivR;
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModel, c19eg, true)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("previous_page", "music_hot");
            c2344009Gk.LJIIIIZZ("action_type", "share");
            c2344009Gk.LJIIIIZZ("music_id", music.getMid());
            c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLJJJ.getValue());
            C20684815ws.LJIILLIIL("user_music_failed", c2344009Gk.LIZ);
            return;
        }
        C786410Ut5.P3(c19eg);
        C20684815ws.LJIIJJI("click_share_button", 0L, "music_hot", music.getMid());
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        List list = null;
        if (fragmentLJI != null) {
            numLJ = C629480OmY.LJ(fragmentLJI);
        } else {
            numLJ = null;
        }
        iCommercePageTrackingServiceLIZLLL.LIZJ(new C19406010w6(numLJ, (Aweme) null, "music_page", "user_click", "share_sign", 34));
        C735440St4 c735440St4 = new C735440St4();
        c735440St4.LIZLLL = "music_hot";
        c735440St4.LJJLJLI = "music_hot";
        c735440St4.LJLIL = "music";
        c735440St4.LJJLIIIJ = getAwemeId();
        c735440St4.LJIILJJIL();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("song_id", musicModel.getMusicId());
        c2344009Gk2.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk2.LJIIIIZZ("process_id", (String) this.LLJJJIL.getValue());
        C20684815ws.LJIILLIIL("share_single_song", c2344009Gk2.LIZ);
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(C0X4S.MUSIC_SHARE.getReportName());
        if (music.getShareInfo() != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (musicDetailFragmentProvider = (MusicDetailFragmentProvider) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), MusicDetailFragmentProvider.class, null)) != null && (musicDetailAwemeListFragmentS9 = musicDetailFragmentProvider.S9()) != null && (c1261230ivR = musicDetailAwemeListFragmentS9.LLJJJJ) != null) {
                list = c1261230ivR.mmItems;
            }
            String str = (String) this.LLJJJIL.getValue();
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 == null || (arguments = fragmentLJI3.getArguments()) == null || (string = arguments.getString("extra_music_from")) == null) {
                string = "";
            }
            int i = this.LLJLILLLLZIIL;
            int i2 = this.LLJLL;
            AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
            final MusicShareModel musicShareModel = new MusicShareModel(music, list, str, string, i, i2, ((MusicDetailViewModel) assemVMLazy.getValue()).LLJJJJLIIL);
            MusicSharePackageV2 musicSharePackageV2 = new MusicSharePackageV2(new AbstractC1377610lx9(musicShareModel, c19eg) { // from class: X.0OnO
                public final MusicShareModel LIZ;
                public final Activity LIZIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "music";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    ShareInfo shareInfo;
                    String shareDesc;
                    Music music2 = this.LIZ.music;
                    return (music2 == null || (shareInfo = music2.getShareInfo()) == null || (shareDesc = shareInfo.getShareDesc()) == null) ? "" : shareDesc;
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    String mid;
                    Music music2 = this.LIZ.music;
                    return (music2 == null || (mid = music2.getMid()) == null) ? "" : mid;
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    Bundle bundle = new Bundle();
                    Activity activity = this.LIZIZ;
                    C786410Ut5.LJJJI("app_name", activity != null ? activity.getString(R.string.drg) : null, bundle);
                    Music music2 = this.LIZ.music;
                    C786410Ut5.LJJJI("thumb_url", C1324840ka2.LJIILLIIL(music2 != null ? music2.getCoverThumb() : null), bundle);
                    Music music3 = this.LIZ.music;
                    C786410Ut5.LJJIZ(bundle, "video_cover", music3 != null ? music3.getCoverMedium() : null);
                    Music music4 = this.LIZ.music;
                    C786410Ut5.LJJJI("music_id", music4 != null ? music4.getMid() : null, bundle);
                    C786410Ut5.LJJJI("process_id", this.LIZ.processId, bundle);
                    Music music5 = this.LIZ.music;
                    C786410Ut5.LJJJI("music_name", music5 != null ? music5.getMusicName() : null, bundle);
                    Music music6 = this.LIZ.music;
                    bundle.putInt("user_count", music6 != null ? music6.getUserCount() : 0);
                    Music music7 = this.LIZ.music;
                    C786410Ut5.LJJIZ(bundle, "cover_thumb", music7 != null ? music7.getCoverThumb() : null);
                    C786410Ut5.LJJJI("enter_from", Intrinsics.LJFF(this.LIZ.previousPage, "sound_history") ? "sound_history" : "single_song", bundle);
                    C786410Ut5.LJJJI("enter_method", "button", bundle);
                    C630030OnR.LIZIZ(bundle, "aweme_cover_list", this.LIZ.awemeList);
                    C786410Ut5.LJJJI("previous_page", this.LIZ.previousPage, bundle);
                    bundle.putInt("artist_label", this.LIZ.artistLabel);
                    bundle.putInt("behind_song_video_type", this.LIZ.behindTheSongVideoType);
                    C786410Ut5.LJJJI("page_name", this.LIZ.pageName, bundle);
                    return bundle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    ShareInfo shareInfo;
                    String shareTitle;
                    Music music2 = this.LIZ.music;
                    return (music2 == null || (shareInfo = music2.getShareInfo()) == null || (shareTitle = shareInfo.getShareTitle()) == null) ? "" : shareTitle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    ShareInfo shareInfo;
                    Music music2 = this.LIZ.music;
                    String strLJFF = C1375500ltk.LJFF(C1375500ltk.LJ((music2 == null || (shareInfo = music2.getShareInfo()) == null) ? null : shareInfo.getShareUrl()));
                    return strLJFF == null ? "" : strLJFF;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = musicShareModel;
                    this.LIZIZ = c19eg;
                }
            }.LJIIIIZZ());
            C621180OYa.LIZIZ.LJIL(musicSharePackageV2);
            C621180OYa.LIZ.LJIIZILJ(musicSharePackageV2, c19eg, MusicShareConfiguration.LLILLJJLI);
        }
    }
}
