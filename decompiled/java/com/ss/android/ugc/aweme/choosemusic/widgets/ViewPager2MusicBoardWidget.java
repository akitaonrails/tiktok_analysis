package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C086I;
import X.C0RD4;
import X.C0WZX;
import X.C117N;
import X.C15H0;
import X.C15H8;
import X.C15HG;
import X.C15HH;
import X.C15HI;
import X.C15HJ;
import X.C15HM;
import X.C15HO;
import X.C15HP;
import X.C15HQ;
import X.C15HU;
import X.C15HX;
import X.C15IK;
import X.C15IP;
import X.C20448914zv;
import X.C20496415Ic;
import X.C20749216Hi;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC20448814zu;
import X.InterfaceC20494515Hj;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectFirstPageMonitor;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes32.dex */
public class ViewPager2MusicBoardWidget extends ListItemWidget<C15HI> implements Observer<C0RD4>, C15HU, C15HX {
    public final Fragment LLJ;
    public C15H0 LLJI;
    public C15HG LLJIJIL;
    public int LLJILJIL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public C15HO LLJJIJI;
    public List<MusicModel> LLJJIJIIJIL;
    public InterfaceC20494515Hj<C15HP> LLJJIJIL;
    public final int LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public boolean LLJJL;
    public final Rect LLJL;
    public int LLJILJILJ = -1;
    public int LLJILLL = -1;
    public final boolean[] LLJJJ = new boolean[3];
    public final boolean[] LLJJJIL = new boolean[3];
    public final Rect LLJJLIIIJLLLLLLLZ = new Rect();
    public final C20749216Hi LLJLIL = new C20749216Hi(this, 0);

    @Override // X.C15HU
    public final void LIZJ() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.LLJJJIL;
            if (i >= zArr.length) {
                return;
            }
            this.LLJJJ[i] = false;
            zArr[i] = false;
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJI() {
        if (C086I.LIZIZ(this.LLJJIJIIJIL)) {
            return;
        }
        int iMax = Math.max(this.LLJILJIL * 3, 0);
        int iMin = Math.min(iMax + 3, this.LLJJIJIIJIL.size());
        for (int i = iMax; i < iMin; i++) {
            boolean[] zArr = this.LLJJJIL;
            int i2 = i - iMax;
            if (zArr[i2]) {
                zArr[i2] = false;
                MusicModel musicModel = (MusicModel) ListProtector.get(this.LLJJIJIIJIL, i);
                Fragment fragment = this.LLJ;
                boolean userVisibleHint = fragment != null ? fragment.getUserVisibleHint() : false;
                if (musicModel != null) {
                    C15HG c15hg = this.LLJIJIL;
                    C15IK.LJIIL(new C15HJ(this, musicModel, i, this.LLJJIJI), this.LLILZIL.LIZ, this.LLJJIJI, musicModel, i, userVisibleHint, false, c15hg != null ? c15hg.LIZIZ() : null);
                    if (musicModel.getNeedRecordConsumption()) {
                        C20496415Ic.LIZ.getClass();
                        C20496415Ic.LIZIZ(musicModel);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("list", this, false);
        dataCenter.yQ2("music_index", this, false);
        dataCenter.yQ2("music_collect_status", this, false);
        dataCenter.yQ2("play_compeleted", this, false);
        dataCenter.yQ2("music_loading", this, false);
        dataCenter.yQ2("music_reset_play_start", this, false);
        this.LLJJI = ((Integer) this.LLILZ.get("key_choose_music_type")).intValue();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILL(C15H8 c15h8) {
        this.LLIZLLLIL = c15h8;
        LJIIZILJ((List) this.LLILZ.get("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15HI) {
            return true;
        }
        return false;
    }

    public final void LJIIZILJ(List<InterfaceC20448814zu> list) {
        boolean z;
        String str;
        C117N c117n;
        if (list == null || this.LLJILLL >= list.size() || !(ListProtector.get(list, this.LLJILLL) instanceof C20448914zv)) {
            return;
        }
        this.LLJJIII = ((C20448914zv) ListProtector.get(list, this.LLJILLL)).LIZJ;
        List<MusicModel> list2 = ((C20448914zv) ListProtector.get(list, this.LLJILLL)).LIZIZ;
        final MusicCollectionItem musicCollectionItem = ((C20448914zv) ListProtector.get(list, this.LLJILLL)).LIZ;
        if (this.LLJJJJJIL == 0 && this.LLJJJJLIIL == 0) {
            z = false;
        } else {
            z = true;
        }
        if (list2 != null && musicCollectionItem != null) {
            if (this.LLJILLL == 0) {
                C786410Ut5.LJLLLLLL(4, ((C15HI) this.LLIZLLLIL).LLILZ);
            } else {
                C786410Ut5.LJLLLLLL(0, ((C15HI) this.LLIZLLLIL).LLILZ);
            }
            this.LLJJIJIIJIL = list2;
            String str2 = musicCollectionItem.mcName;
            String str3 = C15IK.LIZ;
            C15HO c15ho = new C15HO("change_music_page", str2, "", str3);
            this.LLJJIJI = c15ho;
            c15ho.LJIIJ = C15IK.LIZIZ(str3);
            this.LLJJIJI.LIZIZ(musicCollectionItem.mcId);
            C15HO c15ho2 = this.LLJJIJI;
            int i = this.LLJILLL;
            c15ho2.getClass();
            if (i != 0 && i != 1) {
                c15ho2.LJIIL = Integer.valueOf(i + 4);
            }
            C15HO c15ho3 = this.LLJJIJI;
            if (this.LLJJL) {
                str = "more_song";
            } else {
                str = "recommend";
            }
            c15ho3.LJIILIIL = str;
            Fragment fragment = this.LLJ;
            if ((fragment instanceof DiscoverMusicFragment) && (fragment.getParentFragment() instanceof NewMusicTabFragment)) {
                this.LLJJIJI.LJIILLIIL = "song_selection_page";
            }
            C15HI c15hi = (C15HI) this.LLIZLLLIL;
            C20749216Hi c20749216Hi = this.LLJLIL;
            if (c15hi.LLIZ != null && (c117n = c15hi.LLILLL) != null) {
                c117n.removeOnPageChangeListener(c15hi.LLILZLL);
            }
            c15hi.LLILZLL = c20749216Hi;
            C15HI c15hi2 = (C15HI) this.LLIZLLLIL;
            int i2 = this.LLJILJIL;
            int i3 = this.LLJILJILJ;
            int i4 = this.LLJILLL;
            C15HO c15ho4 = this.LLJJIJI;
            boolean z2 = musicCollectionItem.isHot;
            c15hi2.LLILLJJLI.setText(musicCollectionItem.mcName);
            c15hi2.LLILLL.getLayoutParams().height = -2;
            c15hi2.LLJILLL = z2;
            c15hi2.LLJJ = z;
            c15hi2.LLJ = i4;
            c15hi2.LLIZLLLIL = i3;
            C15HH c15hh = c15hi2.LLJIJIL;
            c15hh.LLILLJJLI = list2;
            c15hh.notifyDataSetChanged();
            c15hi2.LLJIJIL.notifyDataSetChanged();
            c15hi2.LLILLL.setCurrentItem(i2);
            c15hi2.LLILLL.addOnPageChangeListener(c15hi2.LLILZLL);
            c15hi2.LLJI = c15ho4;
            C15HI c15hi3 = (C15HI) this.LLIZLLLIL;
            C15HQ c15hq = new C15HQ() { // from class: X.15Hc
                @Override // X.C15HQ
                public final void LIZ(C15IP c15ip, View view, MusicModel musicModel, int i5) {
                    final ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = this.LIZ;
                    MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
                    viewPager2MusicBoardWidget.getClass();
                    int id = view.getId();
                    if (id == R.id.lox) {
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            activityLJFF.getString(2131834437);
                        }
                        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                            C629710Omv.LIZIZ(C2214201BlK.LJFF(), C15J0.LIZLLL(i5));
                            return;
                        } else {
                            c15ip.L5();
                            C15IK.LJII(c15ip.LLJJLIIIJLLLLLLLZ, musicModel, viewPager2MusicBoardWidget.LLJJIJI, c15ip.LLJLLIL, musicModel.getLogPb());
                            return;
                        }
                    }
                    boolean z3 = true;
                    if (id == R.id.lp1) {
                        if (musicModel == null) {
                            return;
                        }
                        if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                            String offlineDesc = musicModel.getMusic().getOfflineDesc();
                            if (TextUtils.isEmpty(offlineDesc)) {
                                offlineDesc = view.getContext().getString(2131837770);
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(view);
                            c1389890mGx.LJIIJ(offlineDesc);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        if (!C142I.LIZ(musicModel, view.getContext(), true)) {
                            return;
                        }
                        String string = UUID.randomUUID().toString();
                        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme://music/detail/");
                        sbLIZ.append(musicModel.getMusicId());
                        C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                        c686150Qvl.LIZIZ("process_id", string);
                        c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
                        C15IK.LJIIIIZZ(viewPager2MusicBoardWidget.LLJJIJI, musicModel.getMusicId(), false, string);
                        return;
                    }
                    if (id == R.id.tv_title_right) {
                        Intent intent = new Intent(viewPager2MusicBoardWidget.LL, (Class<?>) MusicDetailListActivity.class);
                        if (viewPager2MusicBoardWidget.LLJILLL == 0 && !viewPager2MusicBoardWidget.LLJJL) {
                            intent.putExtra("music_type", 1);
                            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", viewPager2MusicBoardWidget.LLJJI);
                            intent.putExtra("sound_page_scene", viewPager2MusicBoardWidget.LLJJJJ);
                        } else {
                            intent.putExtra("music_class_id", musicCollectionItem2.mcId);
                            intent.putExtra("music_class_name", musicCollectionItem2.mcName);
                            intent.putExtra("music_type", 2);
                            intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
                            intent.putExtra("music_class_enter_method", "click_more");
                            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", viewPager2MusicBoardWidget.LLJJI);
                            intent.putExtra("music_class_level", musicCollectionItem2.level);
                            intent.putExtra("sound_page_scene", viewPager2MusicBoardWidget.LLJJJJ);
                            intent.putExtra("playlist_order_in_csp", viewPager2MusicBoardWidget.LLJILLL + 4);
                        }
                        intent.putExtra("max_video_duration", viewPager2MusicBoardWidget.LLJJJJJIL);
                        intent.putExtra("shoot_video_length", viewPager2MusicBoardWidget.LLJJJJLIIL);
                        intent.putExtra("music_discovery_type", viewPager2MusicBoardWidget.LLJJIII);
                        intent.putExtra("extra_key_from_page", viewPager2MusicBoardWidget.LLJJIJI.LJIILLIIL);
                        intent.putExtra("tab_name", viewPager2MusicBoardWidget.LLJJIJI.LJIILIIL);
                        intent.putExtra("key_show_lyric_tag", (Boolean) viewPager2MusicBoardWidget.LLILZ.get("key_show_lyric_tag"));
                        viewPager2MusicBoardWidget.LJIILJJIL(intent, viewPager2MusicBoardWidget.LLJJ);
                        String str4 = musicCollectionItem2.mcName;
                        String str5 = musicCollectionItem2.mcId;
                        Integer numValueOf = Integer.valueOf(viewPager2MusicBoardWidget.LLJILLL);
                        C15HO c15ho5 = viewPager2MusicBoardWidget.LLJJIJI;
                        C15IK.LJIIIZ(numValueOf, str4, "click_more", "", "change_music_page", str5, c15ho5.LJIILIIL, null, c15ho5.LJIILLIIL);
                        return;
                    }
                    if (id == R.id.nfe) {
                        if (c15ip == null || musicModel == null) {
                            return;
                        }
                        ChooseMusicSelectView chooseMusicSelectView = C20494415Hi.LIZ;
                        if (chooseMusicSelectView != null) {
                            chooseMusicSelectView.LIZIZ();
                        }
                        if (viewPager2MusicBoardWidget.LLJILJILJ == c15ip.LLJLLIL && ((Integer) viewPager2MusicBoardWidget.LLILZ.get("music_position", -1)).intValue() == viewPager2MusicBoardWidget.LLJILLL) {
                            viewPager2MusicBoardWidget.LLILZ.zQ2(-1, "music_position");
                            viewPager2MusicBoardWidget.LLILZ.zQ2(-1, "music_index");
                            c15ip.a6(false, false, false);
                            viewPager2MusicBoardWidget.LLJI.p8(null);
                            return;
                        }
                        C15H0 c15h0 = viewPager2MusicBoardWidget.LLJI;
                        if (c15h0 != null) {
                            c15h0.p8(null);
                            viewPager2MusicBoardWidget.LLJI.Dl0(new C15IZ() { // from class: X.15Hb
                                @Override // X.C15IZ
                                public final void LIZ() {
                                    viewPager2MusicBoardWidget.LLILZ.zQ2(Boolean.FALSE, "music_loading");
                                }
                            });
                            viewPager2MusicBoardWidget.LLJI.cJ(musicModel, viewPager2MusicBoardWidget.LLJJIJI);
                            C15IK.LIZLLL = c15ip.LLJLLIL;
                        }
                        viewPager2MusicBoardWidget.LLILZ.zQ2(Integer.valueOf(viewPager2MusicBoardWidget.LLJILLL), "music_position");
                        viewPager2MusicBoardWidget.LLILZ.zQ2(Integer.valueOf(c15ip.LLJLLIL), "music_index");
                        viewPager2MusicBoardWidget.LLILZ.zQ2(Boolean.TRUE, "music_loading");
                        return;
                    }
                    if (id == R.id.njf) {
                        if (musicModel == null || viewPager2MusicBoardWidget.LLJI == null || viewPager2MusicBoardWidget.LLJJIJI == null) {
                            return;
                        }
                        IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
                        SelectMusicFromSelectFirstPageMonitor selectMusicFromSelectFirstPageMonitor = SelectMusicFromSelectFirstPageMonitor.INSTANCE;
                        iAVPerformanceProvideAVPerformance.start(selectMusicFromSelectFirstPageMonitor, "click recommend music use");
                        String musicId = musicModel.getMusicId();
                        if (musicId != null) {
                            HashMap<String, PerformanceMonitor> map = C0EM1.LIZ;
                            map.clear();
                            map.put(musicId, selectMusicFromSelectFirstPageMonitor);
                        }
                        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class);
                        if (viewPager2MusicBoardWidget.LLJILLL != 0) {
                            z3 = false;
                        }
                        musicModel.setFromSection(iCommerceMediaService.LJIJ(musicModel, z3));
                        ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIL(viewPager2MusicBoardWidget.LLJ).n92(c15ip.LLJLLIL, Integer.valueOf(viewPager2MusicBoardWidget.LLJILLL), viewPager2MusicBoardWidget.LLJJIJI.LJ);
                        MusicModel musicModelM317clone = musicModel.m317clone();
                        String str6 = viewPager2MusicBoardWidget.LLJJIJI.LJ;
                        if (C2093608Ic.LJ(str6)) {
                            str6 = "";
                        }
                        musicModelM317clone.setCategoryID(str6);
                        musicModelM317clone.setEditFrom("");
                        musicModelM317clone.setFromCollectionType(viewPager2MusicBoardWidget.LLJJIII);
                        viewPager2MusicBoardWidget.LLJI.ru(musicModelM317clone);
                        C15IK.LJIJ(viewPager2MusicBoardWidget.LLJJIJI, musicModelM317clone, c15ip.LLJLLIL, musicModelM317clone.getLogPb());
                        return;
                    }
                    if (id != R.id.loz) {
                        return;
                    }
                    viewPager2MusicBoardWidget.LLILZ.zQ2(-1, "music_position");
                    viewPager2MusicBoardWidget.LLILZ.zQ2(-1, "music_index");
                    c15ip.a6(false, false, false);
                    viewPager2MusicBoardWidget.LLJI.p8(null);
                    viewPager2MusicBoardWidget.LLJJIJI.LIZJ = "change_music";
                    ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C1659630tI1.LJ(viewPager2MusicBoardWidget.LLJ).get(ChooseMusicCutViewModel.class);
                    chooseMusicCutViewModel.wQ2().postValue(musicModel);
                    chooseMusicCutViewModel.vQ2().postValue(viewPager2MusicBoardWidget.LLJJIJI);
                }
            };
            InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLJJIJIL;
            c15hi3.LLILZIL = c15hq;
            c15hi3.LLIZ = interfaceC20494515Hj;
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LLIZLLLIL.itemView.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.W5(this.LLIZLLLIL.itemView, layoutParams);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r14) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget.onChanged(java.lang.Object):void");
    }

    public ViewPager2MusicBoardWidget(Fragment fragment, int i) {
        this.LLJL = new Rect();
        this.LLJ = fragment;
        this.LLJJJJ = i;
        this.LLJL = new Rect(0, 0, fragment.getResources().getDisplayMetrics().widthPixels, fragment.getResources().getDisplayMetrics().heightPixels);
    }

    @Override // X.C15HU
    public final void LJIIIIZZ(int i, int i2) {
        C15HG c15hg;
        C15HO c15ho;
        C15H8 c15h8 = this.LLIZLLLIL;
        if (c15h8 != null && (c15h8 instanceof C15HI)) {
            C15HI c15hi = (C15HI) c15h8;
            boolean[] zArr = this.LLJJJ;
            boolean[] zArr2 = this.LLJJJIL;
            for (int i3 = 0; i3 < zArr2.length; i3++) {
                if (c15hi.LLILLL.getTop() + (c15hi.LLJILJIL * i3) <= i2 && c15hi.LLILLL.getTop() + ((i3 + 1) * c15hi.LLJILJIL) >= i) {
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                        zArr2[i3] = true;
                    }
                } else {
                    zArr[i3] = false;
                    zArr2[i3] = false;
                }
            }
            LJIJI();
            Fragment fragment = this.LLJ;
            if (fragment != null && fragment.getUserVisibleHint() && (c15hg = this.LLJIJIL) != null && (c15ho = this.LLJJIJI) != null) {
                c15hg.LIZ(c15ho, "single_song");
            }
        }
    }

    public final void LJIJ(int i, int i2) {
        int i3;
        C15HM c15hm;
        ArrayList<C15IP> musicItemViews;
        C15H8 c15h8 = this.LLIZLLLIL;
        if (c15h8 != null && (c15h8 instanceof C15HI)) {
            C15HI c15hi = (C15HI) c15h8;
            int i4 = this.LLJILJILJ;
            if (i == this.LLJILLL) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            c15hi.LLIZLLLIL = i3;
            if (i4 >= 0) {
                for (int i5 = 0; i5 < c15hi.LLILLL.getChildCount() && (c15hm = (C15HM) c15hi.LLILLL.getChildAt(i5)) != null && (musicItemViews = c15hm.getMusicItemViews()) != null; i5++) {
                    Iterator<C15IP> it2 = musicItemViews.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C15IP next = it2.next();
                            if (next.LLJLLIL == i4) {
                                next.a6(false, false, false);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (i != this.LLJILLL) {
            this.LLJILJILJ = -1;
        } else if (this.LLJILJILJ == i2) {
            this.LLJI.p8(null);
        } else {
            this.LLJILJILJ = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(int i, int i2, Intent intent) throws Throwable {
        if (i2 == -1 && i == this.LLJJ) {
            C2204961BRm.LJIIL(-1, LJIIIZ(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f33NTkoWIPuAGECjUA7nyyfPJ+gqZ9deMprexQVK0pyYu3Ds=", null));
            LJIIIZ().finish();
        }
    }
}
