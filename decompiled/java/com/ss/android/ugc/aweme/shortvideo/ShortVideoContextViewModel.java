package com.ss.android.ugc.aweme.shortvideo;

import X.C830490Whz;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes26.dex */
public class ShortVideoContextViewModel extends ViewModel {
    public ShortVideoContext LL;
    public final C830490Whz<String, Object> LLILLJJLI = new C830490Whz<>();

    public final boolean vQ2() {
        Boolean bool = (Boolean) this.LLILLJJLI.get("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void ko0(boolean z) {
        this.LLILLJJLI.put("has_go_next", Boolean.valueOf(z));
    }

    public final void wQ2(int i) {
        this.LLILLJJLI.put("shoot_mode", Integer.valueOf(i));
    }
}
