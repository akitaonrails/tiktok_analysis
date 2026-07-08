package com.ss.android.ugc.aweme.music.vm;

import X.C1559260qg8;
import X.C2344809Gs;
import X.C616430OFt;
import X.C631970OqZ;
import X.C632090Oql;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC616440OFu;
import X.InterfaceC738070SxJ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AwS60S1000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellCollectIconViewModel extends AssemViewModel<C631970OqZ> implements InterfaceC616440OFu, InterfaceC738070SxJ<C631970OqZ, C632090Oql> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, OriginMusicArg.class, null), true);
    public String LLILLJJLI = "";
    public final C616430OFt LLILLL = new C616430OFt();

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C631970OqZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        this.LLILLL.LLILLJJLI = this;
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        if (str == null) {
            return;
        }
        setState(new AwS60S1000000_9(str, 7));
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
        C2344809Gs.LJI(exc);
    }

    @Override // X.InterfaceC738070SxJ
    public final C632090Oql state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C632090Oql c632090Oql) {
        MusicModel.CollectionType collectionType;
        C632090Oql c632090Oql2 = c632090Oql;
        MusicModel musicModel = c632090Oql2.getMusicModel();
        if (((C631970OqZ) interfaceC0148002o).LL) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModel.setCollectionType(collectionType);
        return c632090Oql2;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C632090Oql c632090Oql, List list) {
        boolean z;
        C631970OqZ c631970OqZ = (C631970OqZ) interfaceC0148002o;
        if (c632090Oql.getMusicModel().getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        return C631970OqZ.LIZ(c631970OqZ, z, null, 2);
    }
}
