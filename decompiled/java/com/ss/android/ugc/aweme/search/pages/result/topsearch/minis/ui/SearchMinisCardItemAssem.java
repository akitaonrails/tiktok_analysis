package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui;

import X.C682730QqF;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model.SearchMinisItemDataModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisCardItemAssem extends ReusedUISlotAssem<SearchMinisCardItemAssem> implements InterfaceC712990Rxx<SearchMinisItemDataModel> {
    public final Function1<SearchMinisItemDataModel, Unit> LLJJLIIIJLLLLLLLZ;
    public SearchMinisItemDataModel LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euu;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        SearchMinisItem minis;
        SearchMinisItem minis2;
        SearchMinisItem minis3;
        SearchMinisItemDataModel searchMinisItemDataModel = this.LLJL;
        String clientKey = null;
        if (Intrinsics.LJFF((searchMinisItemDataModel == null || (minis3 = searchMinisItemDataModel.getMinis()) == null) ? null : minis3.getMinisType(), "2")) {
            C682730QqF c682730QqF = C682730QqF.LIZ;
            SearchMinisItemDataModel searchMinisItemDataModel2 = this.LLJL;
            if (searchMinisItemDataModel2 != null && (minis2 = searchMinisItemDataModel2.getMinis()) != null) {
                clientKey = minis2.getClientKey();
            }
            c682730QqF.getClass();
            C682730QqF.LIZJ(clientKey, "mini_game");
            return;
        }
        C682730QqF c682730QqF2 = C682730QqF.LIZ;
        SearchMinisItemDataModel searchMinisItemDataModel3 = this.LLJL;
        if (searchMinisItemDataModel3 != null && (minis = searchMinisItemDataModel3.getMinis()) != null) {
            clientKey = minis.getClientKey();
        }
        c682730QqF2.getClass();
        C682730QqF.LIZJ(clientKey, "mini_app");
    }

    public SearchMinisCardItemAssem(AwS589S0100000_10 awS589S0100000_10) {
        this.LLJJLIIIJLLLLLLLZ = awS589S0100000_10;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 321));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(SearchMinisItemDataModel searchMinisItemDataModel) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(SearchMinisItemDataModel searchMinisItemDataModel) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(SearchMinisItemDataModel searchMinisItemDataModel) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
