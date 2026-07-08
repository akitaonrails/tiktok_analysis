package com.bytedance.android.livesdk.game.chatroom.drawer.category;

import X.C09R9;
import X.C11NJ;
import X.C13LE;
import X.C19224810Ja;
import X.C291001Au;
import X.C478000Ioo;
import X.EnumC478020Ioq;
import X.InterfaceC0148002o;
import android.os.Parcelable;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryViewModel extends AssemViewModel<C478000Ioo> {
    public Parcelable LL;
    public final C11NJ LLILLJJLI = new C11NJ();
    public List<GameDrawerCategory> LLILLL = new ArrayList();
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public final C09R9 LLILZIL = new C09R9(this, C13LE.LIZ(C19224810Ja.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C478000Ioo(new C291001Au(EnumC478020Ioq.IDLE), Collections.emptyList());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
        this.LLILLL = Collections.emptyList();
        this.LLILLJJLI.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(int r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryViewModel.vQ2(int):void");
    }
}
