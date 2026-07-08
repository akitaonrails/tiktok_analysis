package com.ss.android.ugc.aweme.shortvideo.model;

import X.C1659630tI1;
import android.view.View;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CanvasVideoEditorTrackViewModel extends ViewModel {
    public static final Companion Companion = new Companion();
    public int filterIndex = Integer.MIN_VALUE;

    public final boolean isFilterIndexValid() {
        return this.filterIndex != Integer.MIN_VALUE;
    }

    public final int getFilterIndex() {
        return this.filterIndex;
    }

    public static final class Companion {
        public final CanvasVideoEditorTrackViewModel get(View view) {
            if (view == null) {
                return null;
            }
            return (CanvasVideoEditorTrackViewModel) C1659630tI1.LJII(view, null, 6).get(CanvasVideoEditorTrackViewModel.class);
        }
    }

    public final void setFilterIndex(int i) {
        this.filterIndex = i;
    }
}
