package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material;

import X.C0JEN;
import X.C0JEP;
import X.C1378990lzN;
import X.C13BV;
import X.C418440Gaw;
import X.C425520GmM;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MaterialSelectScene extends BaseMaterialSelectScene {
    public static final /* synthetic */ int LLLFF = 0;
    public C0JEP LLL;
    public final AwS586S0100000_7 LLLF = new AwS586S0100000_7(this, 270);

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final List<OnThisDayTiktokMediaModel> LLLLJI() {
        List<OnThisDayTiktokMediaModel> list;
        C0JEP c0jep = this.LLL;
        return (c0jep == null || (list = c0jep.LLIZLLLIL) == null) ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final List<OnThisDayTiktokMediaModel> LLLLLIL() {
        List<OnThisDayTiktokMediaModel> list;
        C0JEP c0jep = this.LLL;
        return (c0jep == null || (list = c0jep.LLIZ) == null) ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLL() {
        C0JEN c0jen;
        RecyclerView recyclerView = this.LLJL;
        Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (!(adapter instanceof C0JEN) || (c0jen = (C0JEN) adapter) == null) {
            return;
        }
        c0jen.LLJJL();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final List<Object> LLLLLLIL() {
        return Collections.singletonList(this.LLL);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        C786410Ut5.LJLLLLLL(8, this.mView);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLLJ(ArrayList<OnThisDayTiktokMediaModel> arrayList) {
        C0JEP c0jep = this.LLL;
        if (c0jep != null) {
            c0jep.LLLIILIL(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLLL(ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.o3t);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
            recyclerView.addItemDecoration(new C425520GmM());
        } else {
            recyclerView = null;
        }
        this.LLJL = recyclerView;
        this.LLJJJJJIL = (TuxTextView) viewGroup.findViewById(R.id.eoo);
        this.LLJJL = viewGroup.findViewById(R.id.upload_btn);
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            C1378990lzN.LIZIZ(tuxTextView, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, null, 30);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectScene.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
