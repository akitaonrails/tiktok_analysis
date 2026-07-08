package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C0OY0;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellSecondLineAssem extends DefaultSecondLineAssem {
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultSecondLineAssem
    public final void op(MusicModel musicModel) {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(2131839045, C0OY0.LIZIZ(Integer.valueOf(musicModel.getUserCount())))) == null) {
            string = "";
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
    }
}
