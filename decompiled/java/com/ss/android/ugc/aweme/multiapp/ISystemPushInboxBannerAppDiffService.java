package com.ss.android.ugc.aweme.multiapp;

import X.C1902920zcQ;
import X.C1902980zcW;
import X.C1903010zcZ;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes29.dex */
public interface ISystemPushInboxBannerAppDiffService {
    public static final C1902920zcQ LIZ = C1902920zcQ.LIZ;

    public static final class DowngradeInstance implements ISystemPushInboxBannerAppDiffService {
        @Override // com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService
        public final void LIZ() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0zcZ] */
        @Override // com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService
        public final C1903010zcZ LIZJ() {
            return new Object() { // from class: X.0zcZ
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0zcW] */
        @Override // com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService
        public final C1902980zcW LIZIZ(final View view) {
            return new RecyclerView.ViewHolder(view) { // from class: X.0zcW
            };
        }

        @Override // com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService
        public final View LIZLLL(ViewGroup viewGroup) {
            return new View(viewGroup.getContext());
        }
    }

    void LIZ();

    C1902980zcW LIZIZ(View view);

    C1903010zcZ LIZJ();

    View LIZLLL(ViewGroup viewGroup);
}
