package com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel;

import X.C681270Qnt;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes11.dex */
public final class ChooseSearchMusicStateViewModel extends AssemViewModel<C681270Qnt> {
    public String LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C681270Qnt(0);
    }

    public final String vQ2() {
        return getState().LLILZIL ? "search_music" : "change_music_page";
    }

    public final boolean wQ2() {
        C681270Qnt state = getState();
        return state.LLILLJJLI == 0 || state.LLILLL == 0;
    }

    public final boolean xQ2() {
        C681270Qnt state = getState();
        SettingsManager.LIZLLL().getClass();
        return wQ2() && (((System.currentTimeMillis() - state.LLILZ) > (((long) SettingsManager.LJ("music_search_middle_page_trending_valid_time", 15)) * 1000) ? 1 : ((System.currentTimeMillis() - state.LLILZ) == (((long) SettingsManager.LJ("music_search_middle_page_trending_valid_time", 15)) * 1000) ? 0 : -1)) > 0);
    }
}
