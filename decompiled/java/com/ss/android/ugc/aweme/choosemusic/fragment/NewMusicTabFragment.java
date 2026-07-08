package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C0RD4;
import X.C0XPD;
import X.C123100dR;
import X.C1260290itv;
import X.C20493315Gx;
import X.C20494415Hi;
import X.C341940Daq;
import Y.ARunnableS62S0300000_29;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class NewMusicTabFragment extends BaseNewMusicTabFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiM+KCg+LSs4ZwE2Pwg5OiYwHCQuDz0yLygpJzs=";

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void UR() {
        C1260290itv c1260290itv = this.LLILZIL;
        if (c1260290itv != null) {
            c1260290itv.setTabsMarginTop(C341940Daq.LIZ(44));
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void gS() {
        C0XPD.LIZJ(this, "", "click_my_music", null, null);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void ZR(C0RD4 c0rd4) {
        MutableLiveData<Integer> mutableLiveDataVQ2;
        MutableLiveData<Integer> mutableLiveDataVQ22;
        View childAt;
        String musicId;
        MusicModel value;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof ChooseMusicFragment) && ((BaseChooseMusicFragment) parentFragment).LLILZLL) {
            return;
        }
        Object obj = c0rd4.LIZIZ;
        SelectedMusicViewModel selectedMusicViewModel = null;
        if (obj == null) {
            obj = null;
        }
        C20493315Gx c20493315Gx = (C20493315Gx) obj;
        int i = c20493315Gx.LIZLLL;
        MusicModel musicModel = c20493315Gx.LJ;
        int i2 = c20493315Gx.LIZ;
        SelectedMusicViewModel selectedMusicViewModel2 = C20494415Hi.LIZIZ;
        if (selectedMusicViewModel2 != null) {
            MutableLiveData<MusicModel> mutableLiveDataWQ2 = selectedMusicViewModel2.wQ2();
            if (mutableLiveDataWQ2 != null && (value = mutableLiveDataWQ2.getValue()) != null) {
                musicId = value.getMusicId();
            } else {
                musicId = null;
            }
            if (Intrinsics.LJFF(musicId, musicModel.getMusicId())) {
                selectedMusicViewModel = selectedMusicViewModel2;
            }
        }
        if (i2 == 0) {
            if (i != 0) {
                if (i == 1) {
                    if (this.LLILLL != null && !this.LLLILZJ.LIZJ("added_to_favorites_show_once", false) && (childAt = ((ViewGroup) this.LLILLL.getChildAt(0)).getChildAt(1)) != null) {
                        HandlerHook.viewPost(childAt, new ARunnableS62S0300000_29(this, childAt, musicModel, 12));
                    }
                    if (selectedMusicViewModel != null && (mutableLiveDataVQ22 = selectedMusicViewModel.vQ2()) != null) {
                        mutableLiveDataVQ22.postValue(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (selectedMusicViewModel == null || (mutableLiveDataVQ2 = selectedMusicViewModel.vQ2()) == null) {
                return;
            }
            mutableLiveDataVQ2.postValue(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void dS(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setShowDividers(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void SR(Intent intent, MusicModel musicModel) {
        if (musicModel != null && musicModel.getSearchId() != null) {
            HashMap map = new HashMap();
            iS("music_search_id", musicModel.getSearchId(), map);
            if (C123100dR.LIZ(musicModel.getSearchResultId())) {
                iS("music_search_result_id", musicModel.getSearchResultId(), map);
            } else {
                iS("music_search_result_id", musicModel.getMusicId(), map);
            }
            iS("music_list_item_id", musicModel.getListItemId(), map);
            intent.putExtra("extra_log_params", map);
        }
    }

    public static final void iS(String str, String str2, HashMap map) {
        if (str2 != null && str2.length() > 0) {
            map.put(str, str2);
        }
    }
}
