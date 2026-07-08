package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C0P6P;
import X.C0WZX;
import X.C1250250idj;
import X.C154B;
import X.C15GO;
import X.C15GU;
import X.C15HO;
import X.C15HP;
import X.C15IK;
import X.C15O7;
import X.C19514711Wn;
import X.C19EG;
import X.C20448614zs;
import X.C20491015Ga;
import X.C20748716Hd;
import X.C2204961BRm;
import X.C629710Omv;
import X.C786410Ut5;
import X.C838410Wul;
import X.EnumC20491915Gj;
import X.InterfaceC20492315Gn;
import X.InterfaceC20494515Hj;
import X.InterfaceC2385309Wh;
import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class LocalMusicFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<MusicModel>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4ZwM8KyQgBDogISYKOy40JSAiPQ==";
    public C154B LLJJIII;
    public long LLJJIJI;
    public final SafeHandler LLJJIJIIJIL = new SafeHandler(this);
    public boolean LLJJIJIL = false;

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "local_music_list_data";
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
        return "local_music_list_load_more_status";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.c99;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 5;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "local_music_list_status";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        C154B c154b = this.LLJJIII;
        if (c154b == null || c154b.LIZIZ) {
            return;
        }
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if (interfaceC20492315Gn != 0) {
            interfaceC20492315Gn.showLoadMoreLoading();
        }
        final C154B c154b2 = this.LLJJIII;
        final WeakReference<Activity> weakReference = new WeakReference<>(getActivity());
        c154b2.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (c154b2.LIZJ) {
            return;
        }
        c154b2.LIZJ = true;
        c154b2.LIZIZ(weakReference).LJ(new InterfaceC2385309Wh() { // from class: X.154C
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C154B c154b3 = c154b2;
                WeakReference weakReference2 = weakReference;
                long j = jCurrentTimeMillis;
                c154b3.getClass();
                C1C7U.LIZ("LocalMusicModel@3dc1.loadMoreLocalMusic$1L");
                c154b3.LIZJ = false;
                if (weakReference2 == null) {
                    C1C7U.LIZIZ("LocalMusicModel@3dc1.loadMoreLocalMusic$1L");
                    return null;
                }
                if (weakReference2.get() == null) {
                    C1C7U.LIZIZ("LocalMusicModel@3dc1.loadMoreLocalMusic$1L");
                    return null;
                }
                C15IK.LJI(System.currentTimeMillis() - j);
                if (c15o7.LJIILL()) {
                    c154b3.LIZ.zQ2(1, "local_music_list_load_more_status");
                    C2344809Gs.LIZLLL(3, "Local Sound", "Load Local Sound Task Failed");
                } else if (c15o7.LJIILJJIL()) {
                    C2344809Gs.LIZLLL(3, "Local Sound", "Load Local Sound Task Succeed");
                    c154b3.LIZ.zQ2(0, "local_music_list_load_more_status");
                    Collection<? extends MusicModel> collection = (Collection) c15o7.LJIIL();
                    List<MusicModel> listLIZIZ = C20448514zr.LIZIZ((C20449014zw) c154b3.LIZ.get("local_music_list_data"));
                    listLIZIZ.addAll(collection);
                    C20449014zw c20449014zw = new C20449014zw();
                    c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(!c154b3.LIZIZ));
                    c20449014zw.LIZ.put("action_type", (V) 2);
                    c20449014zw.LIZIZ("list_data", C154B.LIZ(listLIZIZ));
                    c154b3.LIZ.zQ2(c20449014zw, "local_music_list_data");
                }
                C1C7U.LIZIZ("LocalMusicModel@3dc1.loadMoreLocalMusic$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final void VR() {
        if (this.LLJJIJIL || getActivity() == null) {
            return;
        }
        this.LLJJIJIL = true;
        C19EG activity = getActivity();
        int i = Build.VERSION.SDK_INT;
        if (C838410Wul.LIZ(activity, i >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && this.LLJJIII != null) {
            WR();
            return;
        }
        C19514711Wn c19514711WnLIZLLL = C19514711Wn.LIZLLL(getActivity(), TokenCert.with(i >= 33 ? "bpea-tools_request_storage_permission_load_local_music_target33" : "bpea-tools_request_storage_permission_load_local_music"));
        String[] strArr = new String[1];
        strArr[0] = i < 33 ? "android.permission.WRITE_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_AUDIO";
        c19514711WnLIZLLL.LIZIZ(strArr).LIZJ(new C20748716Hd(this, 1));
    }

    public final void WR() {
        final C154B c154b = this.LLJJIII;
        final WeakReference<Activity> weakReference = new WeakReference<>(getActivity());
        c154b.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (c154b.LIZJ) {
            return;
        }
        c154b.LIZJ = true;
        c154b.LIZIZ(weakReference).LJ(new InterfaceC2385309Wh() { // from class: X.154D
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C154B c154b2 = c154b;
                WeakReference weakReference2 = weakReference;
                long j = jCurrentTimeMillis;
                c154b2.getClass();
                C1C7U.LIZ("LocalMusicModel@3dc1.loadPageLocalMusic$1L");
                c154b2.LIZJ = false;
                if (weakReference2 == null) {
                    C1C7U.LIZIZ("LocalMusicModel@3dc1.loadPageLocalMusic$1L");
                    return null;
                }
                if (weakReference2.get() == null) {
                    C1C7U.LIZIZ("LocalMusicModel@3dc1.loadPageLocalMusic$1L");
                    return null;
                }
                C15IK.LJI(System.currentTimeMillis() - j);
                if (c15o7.LJIILL()) {
                    c154b2.LIZ.zQ2(1, "local_music_list_status");
                    C2344809Gs.LIZLLL(3, "Local Sound", "Load Local Sound Task Failed");
                } else if (c15o7.LJIILJJIL()) {
                    C2344809Gs.LIZLLL(3, "Local Sound", "Load Local Sound Task Succeed");
                    c154b2.LIZ.zQ2(0, "local_music_list_status");
                    C20449014zw c20449014zw = new C20449014zw();
                    c20449014zw.LIZ.put("list_hasmore", (V) Boolean.valueOf(!c154b2.LIZIZ));
                    c20449014zw.LIZ.put("action_type", (V) 1);
                    c20449014zw.LIZIZ("list_data", C154B.LIZ((List) c15o7.LJIIL()));
                    c154b2.LIZ.zQ2(c20449014zw, "local_music_list_data");
                }
                C1C7U.LIZIZ("LocalMusicModel@3dc1.loadPageLocalMusic$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.C15GU
    public final void refreshData() {
        if (this.LLJJIII != null) {
            WR();
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        this.LLJJIII = new C154B(this.LLILZLL);
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJJIJIIJIL, new ARunnableS131S0100000_31(this, 169));
    }

    public static LocalMusicFragment ZR(int i) {
        LocalMusicFragment localMusicFragment = new LocalMusicFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        localMusicFragment.setArguments(bundle);
        return localMusicFragment;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        C20491015Ga c20491015Ga = new C20491015Ga(getContext(), view, this, 2131838158, this, (InterfaceC20494515Hj<C15HP>) null, this.LLJJI, EnumC20491915Gj.LOCAL_MUSIC, this.LLJILLL);
        c20491015Ga.LJIJJ = this.LLJJIJI;
        c20491015Ga.LJIILIIL = C629710Omv.LIZ(this);
        String string = c20491015Ga.LJ.getString(2131837788);
        TuxNavBar tuxNavBar = c20491015Ga.LIZ;
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        tuxNavBar.LJIJJ(c1250250idj);
        c20491015Ga.LJIIIIZZ(this);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        c20491015Ga.LJIIIZ(new C15HO("change_music_page_detail", "local_music", "click_button", C15IK.LIZ));
        c20491015Ga.LIZLLL(new C15GO() { // from class: X.15Gh
            @Override // X.C15GO
            public final void LIZ() {
                this.LIZ.LJJIFFI();
            }
        }, 10);
        C786410Ut5.LLLZLZ(c20491015Ga.LIZJ, 0);
        c20491015Ga.LJFF();
        return c20491015Ga;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJIJI = System.currentTimeMillis();
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final void UR(String str, MusicModel musicModel, String str2, C19EG c19eg) throws Throwable {
        String name;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicModel == null) {
            name = "";
        } else {
            name = musicModel.getName();
        }
        intent.putExtra("local_music_name", name);
        C2204961BRm.LJIIL(-1, c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caA3eAaOo1fuZ6sTBNv3WSEhIdA==", null));
        c19eg.finish();
    }
}
