package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC21673619ry;
import X.C098200Yq;
import X.C0RD4;
import X.C0WZX;
import X.C14EU;
import X.C15H0;
import X.C15HO;
import X.C15HP;
import X.C15IZ;
import X.C15JB;
import X.C15JP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C204594153w;
import X.C20492415Go;
import X.C20493315Gx;
import X.C20494715Hl;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C580830MqH;
import X.C616540OGe;
import X.C629770On1;
import X.C786410Ut5;
import X.InterfaceC20492315Gn;
import X.InterfaceC20492515Gp;
import X.InterfaceC20494515Hj;
import X.InterfaceC20499515Jh;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseMusicListFragment<T> extends AmeBaseFragment implements C15H0, InterfaceC20499515Jh, InterfaceC20492515Gp<T>, InterfaceC20494515Hj<C15HP>, Observer<C0RD4> {
    public C15JB LL;
    public ChooseMusicDownloadPlayHelper LLILLJJLI;
    public MusicModel LLILLL;
    public final boolean LLILZ = true;
    public C204594153w LLILZIL;
    public DataCenter LLILZLL;
    public C20492415Go LLIZ;
    public InterfaceC20492315Gn<T> LLIZLLLIL;
    public int LLJ;
    public Map<String, Object> LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public int LLJJI;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    public abstract InterfaceC20492315Gn<T> MR(View view);

    public abstract String OR();

    public abstract boolean PR();

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    public abstract int getLayoutId();

    public abstract int getPageType();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    public AbstractC21673619ry NR() {
        InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LLIZLLLIL;
        if (interfaceC20492315Gn != null) {
            return interfaceC20492315Gn.LJJLIIIJL();
        }
        return null;
    }

    @Override // X.InterfaceC20492515Gp
    public DataCenter bm() {
        if (this.LLILZLL == null) {
            this.LLILZLL = DataCenter.vQ2(ViewModelProviders.of(this), this);
        }
        DataCenter dataCenter = this.LLILZLL;
        dataCenter.yQ2("music_collect_status", this, false);
        dataCenter.yQ2("play_compeleted", this, false);
        dataCenter.yQ2("music_reset_play_start", this, false);
        this.LLILZLL.yQ2("music_loading", this, false);
        this.LLILZLL.yQ2("data_share_info", this, false);
        this.LLILZLL.yQ2("music_list", this, false);
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20492515Gp
    public void initData() {
        this.LLILZIL = new C204594153w(getContext(), this.LLILZLL);
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        return getActivity();
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        return isViewValid();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C15JB c15jb = this.LL;
        if (c15jb != null) {
            c15jb.LJIIL();
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLILLJJLI.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LLILLJJLI.LLJILJILJ = true;
        }
        AbstractC21673619ry abstractC21673619ryNR = NR();
        if (abstractC21673619ryNR instanceof C20494715Hl) {
            ((C20494715Hl) abstractC21673619ryNR).LLLIIIIL();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LLJILJILJ = false;
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return this.LLILLL;
    }

    @Override // X.C15H0
    public final void Dl0(C15IZ c15iz) {
        this.LLILLJJLI.Tf(c15iz);
    }

    @Override // X.InterfaceC20492515Gp
    public final InterfaceC20492315Gn<T> Q7(View view) {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = MR(view);
        }
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: RR, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(X.C0RD4 r8) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment.onChanged(X.0RD4):void");
    }

    @Override // X.InterfaceC20494515Hj
    /* JADX INFO: renamed from: SR, reason: merged with bridge method [inline-methods] */
    public void LLIIL(C15HP c15hp) {
        String str = c15hp.LIZIZ;
        MusicModel musicModel = c15hp.LIZ;
        if ("follow_type".equals(str)) {
            this.LLILZIL.LIZ(musicModel, musicModel.getMusicId(), 1, c15hp.LIZJ, c15hp.LIZLLL);
        } else {
            if (!"unfollow_type".equals(str)) {
                return;
            }
            this.LLILZIL.LIZ(musicModel, musicModel.getMusicId(), 0, c15hp.LIZJ, c15hp.LIZLLL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C15JB c15jb = this.LL;
        if (c15jb != null) {
            c15jb.LJ();
            this.LL.LJI = this;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        Serializable serializable;
        super.onCreate(bundle);
        int i3 = 1;
        if (getArguments() != null) {
            i3 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LLJJI = i3;
        if (getArguments() == null) {
            i = 0;
        } else {
            i = getArguments().getInt("sound_page_scene", 0);
        }
        this.LLJ = i;
        if (getArguments() == null) {
            i2 = 0;
        } else {
            i2 = getArguments().getInt("music_discovery_type", 0);
        }
        this.LLJILLL = i2;
        if (getArguments() == null) {
            this.LLJIJIL = 0L;
            this.LLJILJIL = 0L;
            this.LLJILJILJ = 0L;
        } else {
            this.LLJIJIL = getArguments().getLong("max_video_duration", 0L);
            this.LLJILJIL = getArguments().getLong("shoot_video_length", 0L);
            this.LLJILJILJ = getArguments().getLong("force_max_music_length", 0L);
            this.LLJJ = getArguments().getBoolean("is_unlimited_only", false);
        }
        if (getArguments() != null && (serializable = getArguments().getSerializable("recommend_extra")) != null && (serializable instanceof Map)) {
            this.LLJI = (Map) serializable;
        }
    }

    @C14EU(sticky = true)
    public void onMusicCollectEvent(C629770On1 c629770On1) {
        if (this.LLILZLL != null && c629770On1 != null && "music_detail".equals(c629770On1.LIZJ)) {
            this.LLILZLL.zQ2(new C20493315Gx(0, c629770On1.LIZ, -1, -1, c629770On1.LIZIZ), "music_collect_status");
        }
    }

    @Override // X.C15H0
    public final void p8(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // X.C15H0
    public final void ru(MusicModel musicModel) {
        this.LLILLJJLI.LLJI = OR();
        int pageType = getPageType();
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            pageType = 12;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
        boolean booleanExtra = false;
        if (getActivity().getIntent() != null) {
            booleanExtra = getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        chooseMusicDownloadPlayHelper.Uf(pageType, musicModel, true, booleanExtra);
    }

    @Override // X.C15H0
    public final void cJ(MusicModel musicModel, C15HO c15ho) {
        this.LLILLL = musicModel;
        this.LLILZLL.zQ2(Boolean.TRUE, "music_loading");
        int pageType = getPageType();
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            pageType = 12;
        }
        boolean booleanExtra = false;
        if (this.LLILZ) {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LLILLJJLI;
            chooseMusicDownloadPlayHelper.LLJJL = c15ho;
            chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, pageType);
        } else {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LLILLJJLI;
            if (getActivity().getIntent() != null) {
                booleanExtra = getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
            }
            chooseMusicDownloadPlayHelper2.Uf(pageType, musicModel, true, booleanExtra);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLIZ == null) {
            this.LLIZ = new C20492415Go(this);
        }
        this.LLIZ.LIZ(view, bundle);
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new C15JP() { // from class: X.15H9
            @Override // X.C15JP
            public final void LIZ() {
                BaseMusicListFragment baseMusicListFragment = this.LIZ;
                MusicModel musicModel = baseMusicListFragment.LLILLL;
                if (musicModel != null) {
                    baseMusicListFragment.LLILZLL.zQ2(musicModel.getMusicId(), "play_error");
                }
            }

            @Override // X.C15JP
            public final void LIZIZ() {
                BaseMusicListFragment baseMusicListFragment = this.LIZ;
                MusicModel musicModel = baseMusicListFragment.LLILLL;
                if (musicModel != null) {
                    baseMusicListFragment.LLILZLL.zQ2(musicModel.getMusicId(), "play_compeleted");
                }
            }
        });
        this.LLILLJJLI = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.Mf();
        this.LLILLJJLI.LLILLJJLI = this.LLJJI;
        AbstractC21673619ry abstractC21673619ryNR = NR();
        if (abstractC21673619ryNR instanceof C20494715Hl) {
            this.LLILLJJLI.LLJJL = ((C20494715Hl) abstractC21673619ryNR).LLLFZ(this.LLILLL);
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) throws Throwable {
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setCurMusic(musicModel, Boolean.FALSE, 0);
            UR(str, musicModel, str2, activity);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
        if (PR()) {
            getActivity();
            C15JB c15jb = new C15JB(this, layoutInflater, viewGroup);
            this.LL = c15jb;
            int i = (int) this.LLJILJIL;
            int i2 = (int) this.LLJIJIL;
            int i3 = (int) this.LLJILJILJ;
            c15jb.LJIILJJIL = i;
            c15jb.LJIJI = i2;
            c15jb.LJJI = i3;
        }
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

    public void UR(String str, MusicModel musicModel, String str2, C19EG c19eg) throws Throwable {
        if (this.LLJJI == 1) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2);
            builder.musicModel(musicModel);
            builder.musicPath(str);
            builder.shootWay("single_song");
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("BaseMuiscList", new C580830MqH(c19eg, builder, musicModel, 6));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        C2204961BRm.LJIIL(-1, c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caAPQ6v3sExucQz+gmPW2vFRxceP1qQ==", null));
        c19eg.finish();
    }
}
