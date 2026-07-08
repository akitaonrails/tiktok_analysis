package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683510QrV;
import X.C0C64;
import X.C0P6P;
import X.C1250250idj;
import X.C12Z3;
import X.C1324840ka2;
import X.C1355090lMp;
import X.C15GO;
import X.C15GR;
import X.C15GU;
import X.C15HO;
import X.C15IK;
import X.C15O7;
import X.C20448514zr;
import X.C20449014zw;
import X.C204594153w;
import X.C20491015Ga;
import X.C20491215Gc;
import X.C20494715Hl;
import X.C20684815ws;
import X.C20748916Hf;
import X.C2344009Gk;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC20492315Gn;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.model.MusicListAdStruct;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class MusicClassDetailFragment extends BaseMusicListFragment implements C15GU<Music>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiYwHELIOSZiM+KCg+LSs4ZwImOywvCiMyOzYILDsyISkKOy40JSAiPQ==";
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;
    public MusicListAdStruct LLJJJIL;
    public int LLJJJJ;
    public List<MusicModel> LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "music_list";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return true;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "loadmore_status_music_list";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.c97;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 3;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "refresh_status_music_list";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        if (this.LLILZIL == null || (dataCenter = this.LLILZLL) == null) {
            return;
        }
        C20449014zw c20449014zw = (C20449014zw) dataCenter.get("music_list");
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if ((interfaceC20492315Gn instanceof C15GR) && ((C15GR) interfaceC20492315Gn).LJIIJJI) {
            if (interfaceC20492315Gn != 0) {
                interfaceC20492315Gn.showLoadMoreLoading();
            }
            C204594153w c204594153w = this.LLILZIL;
            String str = this.LLJJIII;
            int iIntValue = ((Integer) c20449014zw.LIZ("list_cursor")).intValue();
            int i = this.LLJJJJ;
            int i2 = this.LLJJLIIIJLLLLLLLZ;
            if (c204594153w.LJII) {
                return;
            }
            c204594153w.LJII = true;
            ChooseMusicApi.LJFF(iIntValue, 16, i, i2, str).LJ(new C20748916Hf(c204594153w, str, 0), C15O7.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0m5r] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C15GU
    public final void b1() {
        ShareInfo shareInfo;
        DataCenter dataCenter = this.LLILZLL;
        if (dataCenter == null || (shareInfo = (ShareInfo) dataCenter.get("data_share_info")) == null) {
            return;
        }
        C621180OYa.LIZ.LJJJLL(getActivity(), shareInfo, this.LLJJIII, new C1355090lMp() { // from class: X.0m5r
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                if (C1373230lq5.LIZ.contains(interfaceC1370310llN.key())) {
                    MusicClassDetailFragment musicClassDetailFragment = this.LIZ;
                    C15IK.LJIILJJIL(musicClassDetailFragment.LLJJIJIIJIL, musicClassDetailFragment.LLJJIII, musicClassDetailFragment.LLJJIJI, interfaceC1370310llN.key());
                }
            }

            @Override // X.C1355090lMp, X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                MusicClassDetailFragment musicClassDetailFragment = this.LIZ;
                C15IK.LJIILJJIL(musicClassDetailFragment.LLJJIJIIJIL, musicClassDetailFragment.LLJJIII, musicClassDetailFragment.LLJJIJI, interfaceC1369790lkX.key());
            }
        });
        String str = this.LLJJIJIIJIL;
        String str2 = this.LLJJIII;
        String str3 = this.LLJJIJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("playlist_id", str2);
        c2344009Gk.LJFF("playlist_name", str3);
        C20684815ws.LJIILLIIL("click_share_playlist_button", c2344009Gk.LIZ);
    }

    @Override // X.C15GU
    public final void refreshData() {
        C204594153w c204594153w = this.LLILZIL;
        if (c204594153w != null) {
            String str = this.LLJJIII;
            int i = this.LLJJJJ;
            int i2 = this.LLJJLIIIJLLLLLLLZ;
            if (c204594153w.LJII) {
                return;
            }
            c204594153w.LJII = true;
            ChooseMusicApi.LJFF(0, 30, i, i2, str).LJ(new C20748916Hf(c204594153w, str, 1), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        if (this.LLJJJJJIL == null) {
            C204594153w c204594153w = this.LLILZIL;
            String str = this.LLJJIII;
            int i = this.LLJJJJ;
            int i2 = this.LLJJLIIIJLLLLLLLZ;
            if (c204594153w.LJII) {
                return;
            }
            c204594153w.LJII = true;
            ChooseMusicApi.LJFF(0, 30, i, i2, str).LJ(new C20748916Hf(c204594153w, str, 1), C15O7.LJIIIIZZ, null);
            return;
        }
        this.LLILZLL.zQ2(0, "refresh_status_music_list");
        C20449014zw c20449014zw = new C20449014zw();
        c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(this.LLJJJJLIIL));
        c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(this.LLJJL));
        c20449014zw.LIZIZ("action_type", 1);
        C20448514zr.LIZLLL(c20449014zw, this.LLJJJJJIL);
        this.LLILZLL.zQ2(c20449014zw, "music_list");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn MR(View view) {
        C20491015Ga c20491015Ga;
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
            c20491015Ga = new C20491015Ga(getContext(), view, this, 2131829274, this, this, this.LLJJI, this.LLJLILLLLZIIL);
        } else if (this.LLJJJJJIL != null) {
            c20491015Ga = new C20491015Ga(getContext(), view, this, 2131837780, this, this, this.LLJJI, 0, this.LLJLILLLLZIIL);
        } else {
            c20491015Ga = new C20491015Ga(getContext(), view, this, 2131837780, this, this, this.LLJJI, this.LLJLILLLLZIIL);
        }
        if (this.LLJJJJ == 2) {
            LinearLayout linearLayout = c20491015Ga.LIZLLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        } else {
            String str = this.LLJJIJI;
            if (str != null) {
                TuxNavBar tuxNavBar = c20491015Ga.LIZ;
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = str;
                tuxNavBar.LJIJJ(c1250250idj);
            }
            ((TuxNavBar) view.findViewById(R.id.y08)).LJIIZILJ(false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c20491015Ga.LIZJ.getLayoutParams();
        layoutParams.height = -1;
        C786410Ut5.U6(c20491015Ga.LIZJ, layoutParams);
        boolean z = this.LLJJIJIL;
        c20491015Ga.LJIJ = z;
        AbstractC683510QrV abstractC683510QrV = c20491015Ga.LJFF;
        boolean z2 = abstractC683510QrV instanceof C20494715Hl;
        if (z2) {
            ((C20494715Hl) abstractC683510QrV).LLJ = z;
        }
        boolean z3 = this.LLJLIL;
        c20491015Ga.LJIJI = z3;
        if (z2) {
            ((C20494715Hl) abstractC683510QrV).LLJIJIL = z3;
        }
        c20491015Ga.LJIIIIZZ(this);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        c20491015Ga.LJIJJLI = this.LLJL;
        boolean z4 = this.LLJLLL;
        c20491015Ga.LJJI = z4;
        AbstractC683510QrV abstractC683510QrV2 = c20491015Ga.LJFF;
        if (abstractC683510QrV2 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV2).LLJJJJLIIL = z4;
        }
        C15HO c15ho = new C15HO(this.LLJJIJIIJIL, this.LLJJIJI, this.LLJJJ, C15IK.LIZ);
        c15ho.LIZIZ(this.LLJJIII);
        if (getParentFragment() == null) {
            c15ho.LJIILLIIL = "playlist_detail";
        }
        if (!TextUtils.isEmpty(this.LLJLL)) {
            c15ho.LJIILIIL = this.LLJLL;
        }
        c20491015Ga.LJIIIZ(c15ho);
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15Gi
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 10);
        C20491215Gc c20491215Gc = new C20491215Gc();
        c20491015Ga.LJJ = c20491215Gc;
        AbstractC683510QrV abstractC683510QrV3 = c20491015Ga.LJFF;
        if (abstractC683510QrV3 instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV3).LLJJJJJIL = c20491215Gc;
        }
        return c20491015Ga;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJJIII = arguments.getString("music_class_id");
            this.LLJJIJI = arguments.getString("music_class_name");
            this.LLJJIJIIJIL = arguments.getString("music_class_enter_from");
            this.LLJJIJIL = arguments.getBoolean("music_class_is_hot", false);
            this.LLJJJ = arguments.getString("music_class_enter_method");
            this.LLJJJJ = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.LLJJJJJIL = (List) serializable;
            }
            this.LLJJJJLIIL = arguments.getInt("music_list_cursor");
            this.LLJJL = arguments.getInt("music_list_has_more");
            this.LLJJLIIIJLLLLLLLZ = arguments.getInt("sound_page_scene", 0);
            this.LLJL = arguments.getString("track_id");
            this.LLJLIL = arguments.getBoolean("is_external");
            arguments.getString("extra_music_from");
            this.LLJLILLLLZIIL = arguments.getInt("music_discovery_type", 0);
            this.LLJLL = arguments.getString("tab_name");
            this.LLJLLIL = arguments.getString("extra_key_from_page");
            this.LLJLLL = arguments.getBoolean("key_show_lyric_tag");
        }
        CommerceServiceImpl.LIZJ().LIZIZ();
        this.LLJJJIL = null;
        C15IK.LJIILIIL(this.LLJJJ, C15IK.LIZ, this.LLJJIII, this.LLJJIJI, this.LLJLL, "playlist_detail", this.LLJLLIL);
        C15IK.LJIILL("change_music_page_detail", this.LLJJJ, this.LLJJIII, this.LLJJIJI, this.LLJLL, "playlist_detail", "single_song");
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MusicListAdStruct musicListAdStruct = this.LLJJJIL;
        if (musicListAdStruct != null && musicListAdStruct.ad != null && C0C64.LJIILLIIL().LJIJ(31744, 0, "non_standard_ad_music_list_style", true) != 0) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.xzz);
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.y00);
            C786410Ut5.LJLZ(0, viewGroup);
            C1324840ka2.LJIIIIZZ(remoteImageView, this.LLJJJIL.ad.image, new C12Z3(this, remoteImageView, 0));
            C786410Ut5.K7(viewGroup, new ACListenerS165S0100000_31(this, 198));
        }
    }

    public static MusicClassDetailFragment VR(String str, String str2, String str3, int i, boolean z, String str4, int i2, C20449014zw<String, Object> c20449014zw, int i3, String str5, boolean z2, long j, long j2, String str6, int i4, String str7, String str8, boolean z3) {
        MusicClassDetailFragment musicClassDetailFragment = new MusicClassDetailFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("music_class_id", str, bundle);
        C786410Ut5.LJJJI("music_class_name", str2, bundle);
        C786410Ut5.LJJJI("music_class_enter_from", str3, bundle);
        bundle.putBoolean("music_class_is_hot", z);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        C786410Ut5.LJJJI("music_class_enter_method", str4, bundle);
        bundle.putInt("music_class_level", i2);
        bundle.putInt("sound_page_scene", i3);
        if (c20449014zw != null) {
            C786410Ut5.LJJIZ(bundle, "music_model_list", (Serializable) C20448514zr.LIZIZ(c20449014zw));
            bundle.putInt("music_list_cursor", ((Integer) c20449014zw.LIZ("list_cursor")).intValue());
            bundle.putInt("music_list_has_more", ((Integer) c20449014zw.LIZ("list_hasmore")).intValue());
        }
        C786410Ut5.LJJJI("track_id", str5, bundle);
        bundle.putBoolean("is_external", z2);
        bundle.putLong("max_video_duration", j);
        bundle.putLong("shoot_video_length", j2);
        C786410Ut5.LJJJI("extra_music_from", str6, bundle);
        bundle.putInt("music_discovery_type", i4);
        C786410Ut5.LJJJI("tab_name", str7, bundle);
        C786410Ut5.LJJJI("extra_key_from_page", str8, bundle);
        bundle.putBoolean("key_show_lyric_tag", z3);
        musicClassDetailFragment.setArguments(bundle);
        return musicClassDetailFragment;
    }
}
