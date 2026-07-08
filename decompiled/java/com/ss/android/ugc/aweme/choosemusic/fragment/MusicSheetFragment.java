package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683510QrV;
import X.C098200Yq;
import X.C0P6P;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1250250idj;
import X.C15GR;
import X.C15GU;
import X.C15IK;
import X.C15O7;
import X.C1685300txQ;
import X.C1701330uNH;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C201955140j;
import X.C201962140q;
import X.C20449014zw;
import X.C204594153w;
import X.C20492415Go;
import X.C20492615Gq;
import X.C20492715Gr;
import X.C20749016Hg;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1888280zEo;
import X.InterfaceC20492315Gn;
import X.InterfaceC20492515Gp;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class MusicSheetFragment extends AmeBaseFragment implements C15GU<MusicCollectionItem>, C0P6P, InterfaceC20492515Gp<MusicCollectionItem>, InterfaceC1888280zEo {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4ZwImOywvGic2LTEKOy40JSAiPQ==";
    public C204594153w LL;
    public DataCenter LLILLJJLI;
    public C20492415Go LLILLL;
    public C20492615Gq LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public final HashSet<String> LLJILJILJ = new HashSet<>();

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "music_sheet_list";
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "loadmore_status_music_sheet";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "refresh_status_music_sheet";
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        DataCenter dataCenter;
        int iIntValue;
        C20492615Gq c20492615Gq = this.LLILZ;
        if (c20492615Gq != null) {
            c20492615Gq.showLoadMoreLoading();
        }
        if (this.LL == null || (dataCenter = this.LLILLJJLI) == null) {
            return;
        }
        Object objLIZ = ((C20449014zw) dataCenter.get("music_sheet_list")).LIZ("list_cursor");
        if (objLIZ instanceof Long) {
            iIntValue = ((Long) objLIZ).intValue();
        } else if (!(objLIZ instanceof Integer)) {
            return;
        } else {
            iIntValue = ((Integer) objLIZ).intValue();
        }
        if (iIntValue > 0) {
            C204594153w c204594153w = this.LL;
            int i = this.LLILZLL;
            c204594153w.getClass();
            ChooseMusicApi.LIZIZ(iIntValue, 20, i, 0).LJ(new C20749016Hg(c204594153w, 10), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC20492515Gp
    public final void initData() {
        C204594153w c204594153w = new C204594153w(getContext(), this.LLILLJJLI);
        this.LL = c204594153w;
        ChooseMusicApi.LIZIZ(0, 20, this.LLILZLL, this.LLIZ).LJ(new C20749016Hg(c204594153w, 14), C15O7.LJIIIIZZ, null);
    }

    @Override // X.C15GU
    public final void refreshData() {
        C204594153w c204594153w = this.LL;
        if (c204594153w != null) {
            ChooseMusicApi.LIZIZ(0, 20, this.LLILZLL, this.LLIZ).LJ(new C20749016Hg(c204594153w, 14), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // X.InterfaceC20492515Gp
    public final DataCenter bm() {
        DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(this), this);
        this.LLILLJJLI = dataCenterVQ2;
        return dataCenterVQ2;
    }

    @Override // X.InterfaceC1888280zEo
    public final void D4(MusicCollectionItem musicCollectionItem) {
        if (this.LLJILJILJ.contains(musicCollectionItem.mcId)) {
            return;
        }
        C15IK.LJIILL("change_music_page", "playlist_click_more", musicCollectionItem.mcId, musicCollectionItem.mcName, this.LLJI, "playlist", "playlist");
        this.LLJILJILJ.add(musicCollectionItem.mcId);
    }

    @Override // X.C15GU
    public final void P0(Object obj) throws Throwable {
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            try {
                Intent intent = new Intent(getContext(), (Class<?>) MusicDetailListActivity.class);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LLILZIL);
                intent.putExtra("music_class_enter_method", "click_category_list");
                intent.putExtra("music_class_level", musicCollectionItem.level);
                intent.putExtra("sound_page_scene", this.LLILZLL);
                intent.putExtra("max_video_duration", this.LLIZLLLIL);
                intent.putExtra("shoot_video_length", this.LLJ);
                intent.putExtra("extra_key_from_page", "playlist");
                intent.putExtra("tab_name", this.LLJI);
                intent.putExtra("key_show_lyric_tag", this.LLJILJIL);
                MR(this, intent);
                C15IK.LJIIIZ(null, musicCollectionItem.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem.mcId, this.LLJI, null, "playlist");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C201962140q.LIZIZ, "MusicSheetFragment.onClick error", e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.15GR, X.15Gn<com.ss.android.ugc.aweme.music.model.MusicCollectionItem>, X.15Gq] */
    @Override // X.InterfaceC20492515Gp
    public final InterfaceC20492315Gn<MusicCollectionItem> Q7(final View view) {
        final Context context = getContext();
        final int i = this.LLILZIL;
        ?? r4 = new C15GR<MusicCollectionItem>(context, view, this, this, i) { // from class: X.15Gq
            @Override // X.C15GR
            public final AbstractC683590Qrd LIZIZ() {
                C20492715Gr c20492715Gr = new C20492715Gr();
                c20492715Gr.LL = new C20492915Gt(this);
                return c20492715Gr;
            }
        };
        TuxNavBar tuxNavBar = r4.LIZ;
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = r4.LJ.getString(2131837785);
        tuxNavBar.LJIJJ(c1250250idj);
        AbstractC683510QrV abstractC683510QrV = r4.LJFF;
        if (abstractC683510QrV != null && (abstractC683510QrV instanceof C20492715Gr)) {
            ((C20492715Gr) abstractC683510QrV).LLILLJJLI = this;
        }
        this.LLILZ = r4;
        return r4;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String string;
        super.onCreate(bundle);
        int i3 = 1;
        if (getArguments() != null) {
            i3 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LLILZIL = i3;
        boolean z = false;
        if (getArguments() == null) {
            i = 0;
        } else {
            i = getArguments().getInt("sound_page_scene", 0);
        }
        this.LLILZLL = i;
        if (getArguments() == null) {
            i2 = 0;
        } else {
            i2 = getArguments().getInt("more_tab_music_sheet_collection_type", 0);
        }
        this.LLIZ = i2;
        String string2 = "";
        if (getArguments() == null) {
            string = "";
        } else {
            string = getArguments().getString("tab_name");
        }
        this.LLJI = string;
        if (getArguments() != null) {
            string2 = getArguments().getString("extra_key_from_page");
        }
        this.LLJIJIL = string2;
        if (getArguments() != null) {
            z = getArguments().getBoolean("key_show_lyric_tag");
        }
        this.LLJILJIL = z;
        if (getArguments() == null) {
            this.LLIZLLLIL = 0L;
            this.LLJ = 0L;
        } else {
            this.LLIZLLLIL = getArguments().getLong("max_video_duration", 0L);
            this.LLJ = getArguments().getLong("shoot_video_length", 0L);
        }
        C15IK.LJIILIIL("playlist_click_more", C15IK.LIZ, "", "", this.LLJI, "playlist", this.LLJIJIL);
    }

    public static void MR(MusicSheetFragment musicSheetFragment, Intent intent) throws Throwable {
        Intent intent2;
        Fragment fragment;
        C1701330uNH.LIZ(intent, musicSheetFragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAzEQ9xQAkoqNIEg2TaE8Nva8w==", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 10001;
        Object[] objArr = {intent, 10001};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/ss/android/ugc/aweme/choosemusic/fragment/MusicSheetFragment", "startActivityForResult", musicSheetFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/ss/android/ugc/aweme/choosemusic/fragment/MusicSheetFragment", "startActivityForResult", null, objArr, musicSheetFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = musicSheetFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            fragment = musicSheetFragment;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/ss/android/ugc/aweme/choosemusic/fragment/MusicSheetFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLILLL == null) {
            this.LLILLL = new C20492415Go(this);
        }
        this.LLILLL.LIZ(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            C2204961BRm.LLJJIJIL(-1, intent, getActivity(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAzEQ9xQAkoqNIEg2TaE8Nva8w==", null));
            getActivity().finish();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c97, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
