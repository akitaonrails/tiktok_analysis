package com.ss.android.ugc.aweme.feed;

import X.C2240008q6;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.controller.BaseController;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseDialogController extends BaseController {
    public boolean LL;

    public abstract void LLFII();

    public abstract void LLFZ(String str);

    public abstract void LLIIII(String str);

    public BaseDialogController(String str, int i) {
        super(str, i);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final void onAttach(Activity activity, Fragment fragment) {
        if (activity == null) {
            C2240008q6.LIZ("ATTACH ACTIVITY == NULL");
        }
        this.activity = activity;
        this.fragment = fragment;
    }
}
