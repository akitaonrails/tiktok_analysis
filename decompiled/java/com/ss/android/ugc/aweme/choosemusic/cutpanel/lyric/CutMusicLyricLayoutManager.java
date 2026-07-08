package com.ss.android.ugc.aweme.choosemusic.cutpanel.lyric;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public final class CutMusicLyricLayoutManager extends LinearLayoutManager {
    public CutMusicLyricLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context;
        if (recyclerView != null && (context = recyclerView.getContext()) != null) {
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0TdC
                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                    return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                }
            };
            c21674119s3.LIZ = i;
            startSmoothScroll(c21674119s3);
            return;
        }
        super.smoothScrollToPosition(recyclerView, c21673919s1, i);
    }
}
