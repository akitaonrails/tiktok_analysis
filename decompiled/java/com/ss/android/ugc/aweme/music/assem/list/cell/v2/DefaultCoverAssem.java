package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C1324840ka2;
import X.C632090Oql;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultCoverAssem extends ReusedUISlotAssem<DefaultCoverAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public RemoteImageView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.efu;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        this.LLJJLIIIJLLLLLLLZ = (RemoteImageView) view.findViewById(R.id.ot5);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void up(C632090Oql c632090Oql) {
        MusicModel musicModel = c632090Oql.getMusicModel();
        RemoteImageView remoteImageView = this.LLJJLIIIJLLLLLLLZ;
        if (remoteImageView != null) {
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                C1324840ka2.LJIIJ(remoteImageView, musicModel.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                C1324840ka2.LJIIJ(remoteImageView, musicModel.getPicBig(), -1, -1);
            } else {
                C1324840ka2.LIZ(remoteImageView, R.drawable.cyv);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
